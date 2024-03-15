package InterviewQuestions;

public class SortArray { //do quick sort

	public static void main(String[] args) {
		int[] arr = new int[] {2,-1,5,3,-7};  
		System.out.println("Array elements after sorting:");  
		//sorting logic  
		for (int i = 0; i < arr.length; i++)   
		{  
		for (int j = i + 1; j < arr.length; j++)   
		{  
		int tmp = 0;  
		if (arr[i] > arr[j])   
		{  
		tmp = arr[i];  
		arr[i] = arr[j];  
		arr[j] = tmp;  
		}
		
		}  
		}
		for(int n=0;n<arr.length;n++) {
			System.out.print(arr[n]+" ");  
		}

	}

}
