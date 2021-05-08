class RotateArray {
	public static void main (String[] args) {
		int[] arr = new int[] {10,20,30,40,50,60,70,80,90};
		
		leftRotate(arr,3);
		
		for (int i=0;i<arr.length;i++) {
		    System.out.print(arr[i]+" ");
		}
	}
	public static void leftRotate(int arr[], int d) {
	    for (int i=0; i<d; i++) {
	        leftRotateByOne(arr);
	    }
	}
	public static void leftRotateByOne(int arr[]) {
	    int i, temp, n;
	    n = arr.length;
	    temp = arr[0];
	    for (i=0;i<n-1;i++) {
	        arr[i] = arr[i+1];
	    }
	    arr[i] = temp;
	}
}