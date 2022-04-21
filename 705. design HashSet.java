 Using ArrayList
```
class MyHashSet {
   ArrayList<Integer> list ;
    public MyHashSet() {
        list = new ArrayList<Integer>();
    }
    
    public void add(int key) {
         if(!list.contains(key)){
             list.add(key);
         }
    }
    
    public void remove(int key) {
        if(list.contains(key)){
            list.remove(new Integer(key));
        }
    }
    
    public boolean contains(int key) {
        if(list.contains(key)){
            return true;
        }else
            return false;
    }
}
```
