
import java.util.*;
class Main {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] nums=new int[n];
        for(int i=0;i<n;i++){
            nums[i]=sc.nextInt();
        }
        int res=secondLargestElement(nums);
        System.out.print(res);
    }
    public static int secondLargestElement(int[] nums) {
    
        Arrays.sort(nums);
        int max=nums[nums.length-1];
        int count=0;
        for(int i=nums.length-2;i>=0;i--){
            if(max>nums[i]){
                count++;
                if(count==1){
                    return nums[i];
                }
            }
        }
        return -1;
    }
}
