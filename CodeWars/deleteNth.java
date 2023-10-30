/*Given a list and a number, create a new list that contains each number of list at most N times, without reordering.
For example if the input number is 2, and the input list is [1,2,3,1,2,1,2,3], you take [1,2,3,1,2], drop the next [1,2]
since this would lead to 1 and 2 being in the result 3 times, and then take 3, which leads to [1,2,3,1,2,3].
With list [20,37,20,21] and number 1, the result would be [20,37,21].*/

import java.util.*;
import java.util.stream.*;
public class EnoughIsEnough {

	public static int[] deleteNth(int[] elements, int maxOccurrences) {
		Map<Integer,Integer> mapper = new HashMap<>();
    for(int i : elements){
      mapper.put(i,0);
    }
    List<Integer> list = new ArrayList<>();
    for(int i : elements){
      if(!mapper.get(i).equals(Integer.valueOf(maxOccurrences))){
        mapper.put(i,mapper.get(i)+1);
        list.add(i);
      }
    }
    int[] primitive = list.stream()
                    .filter(Objects::nonNull)
                    .mapToInt(Integer::intValue)
                    .toArray();
		return primitive;
	}

}

