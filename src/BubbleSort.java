
public class BubbleSort {

	public static void main(String[] args) {
		int[] arr = new int[]{1,4,23,34,15,6,9,29,8};
		
		for(int i=0; i<arr.length; i++){
			System.out.print(arr[i] + " ");
		}
		Sort(arr);
		System.out.println();
		for(int i=0; i<arr.length; i++){
			System.out.print(arr[i] + " ");
		}
		

	}

	public static void Sort(int[] a) {
		int len = a.length;
		
		for(int i=0; i<len; i++){
			for(int j=0; j<(len-1)-i; j++){
				if(a[j] > a[j+1]){
					int temp;
					temp = a[j];
					a[j] = a[j+1];
					a[j+1] = temp;
				}
			}
		}
	}
}
