
public class ProductExcludingSelf {
	
	
	
	public static void main(String[] args) {
		int[] input = {1,2,3,0,5};//{1,2,3,0,5,0,9}
		int[] result = productExceptSelf(input);
		for(int i=0;i<result.length;i++) {
			System.out.println(result[i]);
		}
	}
	
	  public static int[] productExceptSelf(int[] nums) {
	        int prod = 1, zeroCount = 0;
	        for (int num : nums) {
	            if (num != 0) {
	                prod *= num;//30
	                
	            } else {
	                zeroCount++;//1
	            }
	        }
	       
	        if (zeroCount > 1) {
	            return new int[nums.length]; //[0,0,0,0,0]
	        }
//[1,2,3,0,4];
	        int[] res = new int[nums.length];//new array to return
	        for (int i = 0; i < nums.length; i++) {
	            if (zeroCount ==1) {
	                //res[i] = (nums[i] == 0) ? prod : 0;
	                
	                if(nums[i]==0) {
	                	res[i]=prod;
	                }
	                else {
	                	res[i]=0;
	                }
	                
	            } else {
	                res[i] = prod / nums[i];
	            }
	        }
	        return res;
	    }

}
