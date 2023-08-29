package week4.day2;

import java.util.LinkedHashSet;
import java.util.Set;

public class PrintDuplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {4,3,6,8,29,1,2,4,7,8};
		Set<Integer> setnum =new LinkedHashSet<Integer>();
		for (int i = 0; i < arr.length; i++) {
			if (setnum.contains(arr[i])) {
				System.out.println(arr[i]);
						}
			else
			{
				setnum.add(arr[i]);
			}
				
		}
	}

}
