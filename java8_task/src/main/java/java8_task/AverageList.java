package java8_task;

import java.util.List;

public class AverageList {
 public static int average(List<Integer> list)
 {
	 Double average = list.stream().mapToInt(val -> val).average().orElse(0.0);
	 return (int)Math.round(average);
 }
}
