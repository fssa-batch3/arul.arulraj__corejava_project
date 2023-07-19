package Day07.practice;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Remove {
	public static void main(String[] args) {
		
		ArrayList<Integer> num = new ArrayList<Integer>();
		num.add(1);
		num.add(2);
		num.add(3);
		num.add(4);
		num.add(5);
		num.add(1);
		num.add(2);
		num.add(3);
		num.add(4);
		
		HashSet<Integer> nums = new HashSet<Integer>();
		nums.addAll(num);
		for(Integer delete : nums) {
			System.out.println(delete);
		}
	}

}
