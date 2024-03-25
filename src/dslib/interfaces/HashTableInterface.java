package dslib.interfaces;

public interface HashTableInterface<K, V> {
    int hashFunc(K key); //hash to get key
    void insert(K key, V value); // Adds a key-value pair to the hash table
    V get(K key); // Retrieves the value associated with the given key
    V remove(K key); // Removes the key-value pair associated with the key
    boolean containsKey(K key); // Checks if the hash table contains the given key
    int size(); // Returns the number of key-value pairs in the hash table
    boolean isEmpty(); // Checks if the hash table is empty
}
