import java.util.Random;


public class QuickSortMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		
		System.out.print(Partition(1, 20));
	}
	
	public static void Partition(int left, int right){
		int i, j;
		
		int[] a = new int[100];
		int x;
		int temp = 0;
		i = left;
		j = right;
		int mid = (left + right) / 2;
		x = a[mid];
		do{
			while (a[i] < x)
				i +=  1;
			while(a[j] > x)
				j -= 1;
			if (i <= j){
				temp = a[i];
				a[i] = a[j];
				a[j] = temp;
				i += 1;
				j -= 1;
			}
		}while(i > j);
		
		if(left  < j )
			Partition(left, j);
		if(right > i)
			Partition(i, right);
	}

	

}
