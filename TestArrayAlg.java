package arrayAlgorithm;

public class TestArrayAlg {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		int[] arr = new int[]{5,4,2,2,1};
//		int[] arr2 = new int[]{5,4,2,2,5};
//		int[] arr3 = new int[]{5,4,2,2,3};
//		int result=MaxBasinMaxArea.maxArea(arr);
//		System.out.println(result);
////		int result1 = MaxBasinMaxArea.trap(arr, arr.length);
////		int result2 = MaxBasinMaxArea.trap(arr2, arr.length);
////		int result3 = MaxBasinMaxArea.trap(arr3, arr.length);
//		int result1 = MaxBasinMaxArea.trap2(arr);
//		int result2 = MaxBasinMaxArea.trap2(arr2);
//		int result3 = MaxBasinMaxArea.trap2(arr3);
//		System.out.println(result1+" "+result2+" "+result3);
		
		int[] longest = new int[]{100,4,200,1,3,2};
		int ddddd= MaxBasinMaxArea.longestConsecutive(longest);
		System.out.print(ddddd);
	}

}
