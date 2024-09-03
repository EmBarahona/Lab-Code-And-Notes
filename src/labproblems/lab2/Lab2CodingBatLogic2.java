package labproblems.lab2;

public class Lab2CodingBatLogic2 {
	/*
	 * Complete problems from the Logic-1 and Logic-2 sections on https://codingbat.com/java/Logic-2
	 */
	
	// TODO Lab Solution:
	public boolean makeBricks(int small, int big, int goal) {
	  	int new_goal;
		if (goal % 5 > small) {
			return false;
		} else if (goal % 5 <= small) {
			new_goal = goal % 5;
			small = small - new_goal;
			goal = goal - new_goal;
		}
		
		if (goal/5 <= big || small >= (goal - (big *5))){
			return true;
		} else {
			return false;
		}
	}

}