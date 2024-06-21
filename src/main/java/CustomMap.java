import java.util.Map;

import static java.util.Objects.hash;

public class CustomMap<K,V> {


    static class Entry<K,V> {

        K key;
        V value;
        Entry <K,V> next;

        public Entry(K key, V value, Entry<K, V> next) {
            this.key = key;
            this.value = value;
            this.next = next;
        }
    }

    private Entry<K,V>[] bucket;
    int capacity = 16;
    CustomMap() {
        bucket = new Entry[capacity];
    }

    private void putElement(K key, V value) {

        if(key == null) {
            return;
        }
        int hash = hash(key)/100 - 10;
        System.out.println("hash: " + hash);
        Entry<K,V> add = new Entry<K,V>(key, value, null);
        if(bucket[hash] == null) {
            bucket[hash] = add;
        } else {
            Entry<K,V> curr = bucket[hash];
            while (curr != null) {
                if (curr.key.equals(key)) {
                    curr.value = value;
                } else {
                    if (curr.next == key) {
                        curr.next = add;
                    }
                    curr = curr.next;
                }
            }
        }
    }

    public V get(K key) {
        if(key == null) {
            return null;
        }
        int hash = hash(key)/100 - 10;
        System.out.println("hash: " + hash);
        Entry<K,V> b = bucket[hash];
        if(b == null) {
            return null;
        }
        while(b != null) {
            if (b.key.equals(key)) {
                return b.value;
            } else {
                b = b.next;
            }
        }
        return null;
    }


    public static void main(String[] args) {

        CustomMap<String, String> customMap = new CustomMap<>();
        customMap.putElement("12", "Manish");
        customMap.putElement("24", "Sachin");

        String s = customMap.get("12");
        System.out.println(s);

    }



}
