class Solution {
   public record Pair(int a, int b) {}
    public int maxEqualAdjacentPairs(int[] nums) {
        int base=0, best=0;
        Map<Pair,Integer> map=new HashMap<>();
        for(int i=1;i<nums.length;i++){
            int x=nums[i-1], y=nums[i];
            if(x==y) base++;
            else{
                Pair key=new Pair(Math.min(x,y),Math.max(x,y));
                map.put(key,map.getOrDefault(key,0)+1);
                best=Math.max(best,map.get(key));
            }
        }
        return best+base;
    }
}