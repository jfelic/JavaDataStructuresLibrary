package dslib.hashtable;

public class HashTable<K, V> {
    private static class DataItem<K, V> {
        private K key;
        private V value;

        public DataItem(K key, V value) {
            this.key = key;
            this.value = value;
        }

        public K getKey() {
            return key;
        }

        public V getValue() {
            return value;
        }
    }

    private DataItem<K, V>[] hashArray;
    private int arraySize;
    private DataItem<K, V> nonItem;

    public HashTable(int size) {
        arraySize = size;
        hashArray = (DataItem<K, V>[]) new DataItem[arraySize];
        nonItem = new DataItem<>(null, null);
    }

    public void displayTable() {
        System.out.println("Table: ");
        for (int j = 0; j < arraySize; j++) {
            if (hashArray[j] != null && hashArray[j] != nonItem)
                System.out.print(hashArray[j].getKey() + " ");
            else
                System.out.print("** ");
        }
        System.out.println("");
    }

    public int hashFunc(K key) {
        return Math.abs(key.hashCode()) % arraySize;
    }

    public void insert(K key, V value) {
        DataItem<K, V> newItem = new DataItem<>(key, value);
        int hashVal = hashFunc(key);

        while (hashArray[hashVal] != null && hashArray[hashVal] != nonItem) {
            hashVal++;
            hashVal %= arraySize;
        }

        hashArray[hashVal] = newItem;
    }

    public DataItem<K, V> find(K key) {
        int hashVal = hashFunc(key);

        while (hashArray[hashVal] != null) {
            if (hashArray[hashVal] != nonItem && hashArray[hashVal].getKey().equals(key)) {
                return hashArray[hashVal];
            }
            hashVal++;
            hashVal %= arraySize;
        }

        return null;
    }

    public DataItem<K, V> delete(K key) {
        int hashVal = hashFunc(key);

        while (hashArray[hashVal] != null) {
            if (hashArray[hashVal] != nonItem && hashArray[hashVal].getKey().equals(key)) {
                DataItem<K, V> temp = hashArray[hashVal];
                hashArray[hashVal] = nonItem;
                return temp;
            }
            hashVal++;
            hashVal %= arraySize;
        }

        return null;
    }
}
