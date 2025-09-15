package Binary_Search.one_d_array;

public class Floor_Ceil_Sorted_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = {3, 4, 4, 7, 8, 10}, x= 5;
		
		int s =0, e= arr.length - 1;
		
		while(s <=e)
		{
			int mid = s + (e-s)/2;
			
			if(arr[mid] == x)
			{
				System.out.println("Floor"+mid);
				System.out.println("Ciel"+mid);
				
			}
			
			else if(arr[mid] > x)
			{
				e=mid-1;
			}
			
			else {
				s=mid+1;
			}
			
			
		}
		System.out.println("Floor"+arr[e]);
		System.out.println("Ciel"+arr[s]);
		

	}

}
