class Solution {
    public int smallestAbsent(int[] nums) {
        double sum = 0;
        for (int num : nums) {
            sum += num;
        }
        double average = sum / nums.length;
        HashSet<Integer> set = new HashSet<>();
        for(int num : nums) set.add(num);
        int candidate = (int) Math.floor(average) + 1; 
        if(candidate <=0){
            candidate=1;
        }
        while (set.contains(candidate)) {
            candidate++;
        }
        return candidate;
    }
}

    