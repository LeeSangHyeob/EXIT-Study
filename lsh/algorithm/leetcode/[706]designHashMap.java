https://leetcode.com/problems/design-hashmap/description/

class MyHashMap {

    int[] arr = null;
    
    /** Initialize your data structure here. */
    public MyHashMap() {
        arr = new int[10000000];
    }
    
    /** value will always be non-negative. */
    public void put(int key, int value) {
        arr[key] = value == 0? -1 : value;
    }
    
    /** Returns the value to which the specified key is mapped, or -1 if this map contains no mapping for the key */
    public int get(int key) {
        return arr[key] == -1 ? 0 : arr[key] == 0? -1 : arr[key];
    }
    
    /** Removes the mapping of the specified value key if this map contains a mapping for the key */
    public void remove(int key) {
        arr[key] = 0;
    }
}

/**
 * Your MyHashMap object will be instantiated and called as such:
 * MyHashMap obj = new MyHashMap();
 * obj.put(key,value);
 * int param_2 = obj.get(key);
 * obj.remove(key);
 */
