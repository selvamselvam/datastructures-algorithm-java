package com.datastructure.hash;

public class HashTableImpl {
	private Item[] data;
    private int capacity;
    private int size;
    private static final Item AVAILABLE = new Item("Available", null);

    public HashTableImpl(int capacity) {

        this.capacity = capacity; 
        data = new Item[capacity];
        for(int i = 0; i < data.length; i++) {

            data[i] = AVAILABLE;
        }
        size = 0;
    }

    public int size() {

        return size;
    }

    public int hashThis(String key) {

        return key.hashCode() % capacity; 
    }

    public Object get(String key) {

        int hash = hashThis(key);

        while(data[hash] != AVAILABLE && data[hash].key() != key) {

            hash = (hash + 1) % capacity;
        }
        return data[hash].element();
    }

    public void put(String key, Object element) {

        if(key != null) {
            size++;
            int hash = hashThis(key);
            while(data[hash] != AVAILABLE && data[hash].key() != key) {

                hash = (hash + 1) % capacity;
            }

            data[hash] = new Item(key, element);

        }

    }

    public Object remove(String key) {
        // not important now.
        throw new UnsupportedOperationException("Can't remove");
    }

    public String toString()
    {
        String s = "<HashTable[";
        for (int i = 0; i < this.capacity; i++)
        {
            if (data[i].element() != null)
            {
                s += data[i].toString();
                if (i < this.size - 1)
                {
                    s += ",";
                }
             }
         }
         s += "]>";
         return s;
    }
    public static void main(String[] args) {
    	HashTableImpl ht = new HashTableImpl(10);
    	ht.put("1", "aaa");
    	ht.put("2", "bbb");
    	ht.put("3", "ccc");
    	
    	System.out.println(ht.toString());
    	
    }
}
