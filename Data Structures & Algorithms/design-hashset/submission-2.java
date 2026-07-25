class MyHashSet {
    LinkedList<Integer>[] bucket;
    private static int SIZE = 10000;
    public MyHashSet() {
        bucket = new LinkedList[SIZE];
        for(int i = 0 ; i < SIZE ; i++){
            bucket[i] = new LinkedList<>();
        }
    }
    
    public void add(int key) {
         int ind = key % SIZE;
         if(bucket[ind].isEmpty()){
            bucket[ind].add(key);
         }
      else if( !bucket[ind].contains(key)){
           bucket[ind].add(key);
      }
    }
    
    public void remove(int key) {
         int ind = key % SIZE;
        
        if(!bucket[ind].isEmpty() && bucket[ind].contains(key)){
            bucket[ind].remove(Integer.valueOf(key));
        }
        
    }
    
    public boolean contains(int key) {
         int ind = key % SIZE;
        return bucket[ind].contains(key);  
    }
}

/**
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet obj = new MyHashSet();
 * obj.add(key);
 * obj.remove(key);
 * boolean param_3 = obj.contains(key);
 */