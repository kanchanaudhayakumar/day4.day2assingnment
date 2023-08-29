package week4.day2;

import java.util.LinkedHashSet;
import java.util.Set;

public class DupRemove {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name="PAYPAL INDIA";
        char[] charr = name.toCharArray();
    
        Set<Character> cname=new LinkedHashSet<Character>();
        Set<Character> dupName=new LinkedHashSet<Character>();
        for (Character ch : charr) {
        	if (cname.contains(ch)) {
				dupName.add(ch);
        		
			} else {

			
            System.out.println(cname.add(ch));
        }
        }
        System.out.println("charr"+cname);
        System.out.println("duplicate"+dupName);
        cname.removeAll(dupName);
        System.out.println(cname);
        for(char ch:cname)
        	if(ch != ' ')
        		System.out.println(ch);

	}

}
