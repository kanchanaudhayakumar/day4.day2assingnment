package week4.day2;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name="BABU";
        char[] ch = name.toCharArray();
    
        Set<Character> cname=new LinkedHashSet<Character>();
        for (Character character : ch) {
        	if (cname.contains(character)) {
				
        		cname.remove(character);
			} else {

			
            System.out.println(cname.add(character));
        }
        }
        System.out.println(cname);
}

	

}
