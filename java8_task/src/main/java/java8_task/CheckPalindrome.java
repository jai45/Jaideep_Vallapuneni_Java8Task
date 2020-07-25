package java8_task;

import java.util.ArrayList;
import java.util.List;

public class CheckPalindrome {

	public static List<String> listPalindrome(List<String> list)
	{
		List<String> ans=new ArrayList<String>();
		list.stream().forEach(str ->{
			if(check(str))
				ans.add(str);
		});
		
		
		
		return ans;
	}

	private static boolean check(String str) {
		StringBuilder s=new StringBuilder(str);
		s.reverse();
		if(str.equals(s.toString()))
			return true;
		return false;
	}
}
