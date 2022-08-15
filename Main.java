import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    HashSet <Integer> hs1=new HashSet();
        hs1.add(30);                 
        hs1.add(9);
        hs1.add(2000);
        hs1.add(2000);
        hs1.add(30);
        hs1.add(9);
		for(Integer i:hs1)
		{
		    System.out.println(i);
		}
	}
}
