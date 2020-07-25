package java8_task;

import java.util.ArrayList;
import java.util.List;

public class StartWitha {

	public static List<String> check(List<String> s)
	{
		List<String> ans=new ArrayList<String>();
		s.stream().forEach(str->{
			if(str.length()==3 && str.charAt(0)=='a')
				ans.add(str);
		});
		return ans;
	}
}
