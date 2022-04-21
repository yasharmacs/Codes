class MyHashSet {
    ArrayList<Integer> s;
    public MyHashSet() {
        s = new ArrayList<Integer>();
    }
    
    public void add(int key) {
        if(!s.contains(key)){
            s.add(key);
        }
    }
    
    public void remove(int key) {
        if(s.contains(key)){
            s.remove(new Integer(key));     //remove the value as object
        }
    }
    
    public boolean contains(int key) {
        if(s.contains(key)){
            return true;
        }else{
            return false;
        }
    }
}
/**
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet obj = new MyHashSet();
 * obj.add(key);
 * obj.remove(key);
 * boolean param_3 = obj.contains(key);
 */