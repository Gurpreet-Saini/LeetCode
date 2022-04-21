 //Using ArrayList

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
   
///USING LINKEDLIST 

class MyHashSet {
        private final int max=100000;
    private final int arr_size=100;
    private List<List<Integer>> parentList;
    public MyHashSet() {
        parentList = new ArrayList<>(arr_size);
        for( int i=0 ;i<arr_size;i++){
            parentList.add(null);
        }
    }
    
    public void add(int key) {
        int index= key%arr_size;
        List<Integer> childList= parentList.get(index);
        if(childList== null){
            List<Integer> list= new LinkedList<>();
            list.add(key);
            parentList.set(index, list);
        }else{
                if(!childList.contains(key)){
                    childList.add(key);
                }
        }
        
    }
    
    public void remove(int key) {
       int index= key%arr_size;
        List<Integer> childList= parentList.get(index);
        if(childList!=null){
            childList.remove(Integer.valueOf(key));
        }
    }
    
    public boolean contains(int key) {
       int index = key %arr_size;
        List<Integer> childList= parentList.get(index);
        return childList!=null && childList.contains(key);
    }
}
