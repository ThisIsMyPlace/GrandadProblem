
public class GrandadProblem {

	public static void main(String[] args) {
		int testValue = 0;
		int leftOverBars[] = new int[] { 6, 2, 1, 0 };
		
		while(true) {
			for(int noOfThieves = 7; noOfThieves > 3; noOfThieves--) {
				int leftOverCount = leftOverBars[7 - noOfThieves];
				if(testValue % noOfThieves == leftOverCount) {
					
				} else {
					testValue++;
					noOfThieves = 8;
				}
			}
			break;
		}
		System.out.println(testValue);
	}

}
