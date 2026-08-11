class Solution {
    public int missingInteger(int[] arr) {
        Set<Integer> s=new HashSet<>();
        for(int i:arr){
            s.add(i);
        }
        int sum=arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]==arr[i-1]+1){
                sum+=arr[i];
            }
            else{
                break;
            }

        }
        while(s.contains(sum)){
            sum++;
        }
        return sum;
        
    }
}