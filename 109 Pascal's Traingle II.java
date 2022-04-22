class Solution {
    public List<Integer> getRow(int idx) {
        
        List<Integer> ans = new ArrayList<>();
        if(idx==0){
            ans.add(1);
            return ans;
        }
        if(idx==1)
        {
            ans.add(1);
            ans.add(1);
            return ans;
        }
        
        for( int index =1 ;index<=idx;index++){
            
            List <Integer> curr= new ArrayList<>();
            
            curr.add(1);
            
            for( int i=1 ;i<ans.size();i++){
                int sum= ans.get(i)+ans.get(i-1);
                curr.add(sum);
            }
            curr.add(1);
            
            ans = new ArrayList<Integer>();
            ans = curr;
        }
        return ans;
    }
}
