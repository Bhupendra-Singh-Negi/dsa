var maxEqualAdjacentPairs = function(nums) {
    let base=0, best=0;
    let map=new Map();
    for(let i=1;i<nums.length;i++){
        if(nums[i]===nums[i-1]) base++;
        else{
            key=`${Math.min(nums[i],nums[i-1],Math.max(nums[i],nums[i-1]))}`;
            map.set(key,(map.get(key)||0)+1)
            best=Math.max(best,map.get(key));
        }
    }
    return base+best;
};