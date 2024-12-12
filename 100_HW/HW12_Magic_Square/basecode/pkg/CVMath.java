package pkg;

public class CVMath {		
	public static int findMid(int one, int two, int three)
	{
		return (one + two + three - Math.min(one,Math.min(two,three)) - Math.max(one,Math.max(two,three)));
	}
	
	public static void specialSquare(int num) {
		int k = 0;
		int count = 0;
		int i = 0;
		while (true) {
			k += i;
			if ((double)Math.sqrt(k) % 1 == 0) {
				System.out.println(k);
				count++;
				if (count == num) {
					break;
				}
			}
		i++;
		}
	}
}