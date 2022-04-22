class MyHashMap {

    int[] k=new int[10000000];
    public MyHashMap() {
        Arrays.fill(k,-1);
    }
    
    public void put(int key, int value) {
        k[key]=value;
    }
    
    public int get(int key) {
        return k[key];
    }
    
    public void remove(int key) {
        put(key,-1);
    }
}

/**
 * Your MyHashMap object will be instantiated and called as such:
 * MyHashMap obj = new MyHashMap();
 * obj.put(key,value);
 * int param_2 = obj.get(key);
 * obj.remove(key);
 */