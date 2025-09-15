package Binary_Search.one_d_array;

public class Binary_Search {

	public static void main(String[] args) {
		
		
		int [] arr = {-1,0,3,5,9,12};
		int target = 19;
		
		int s =0, e=arr.length-1;
		
		while(s<=e)
		{
			int mid = s + (e-s)/2;
			
			if(arr[mid] == target)
			{
				System.out.println(mid);
				return;
			}
			
			else if(arr[mid] > target)
			{
				e=mid -1;
			}
			else {
				s=mid+1;
				
			}
		}

			System.out.println("Not");
	}

}
