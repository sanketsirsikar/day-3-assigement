package day3;

public class linecomparision {
	public static void main(String[] args) {
		System.out.println("Welcome to Line Comparison Computation Program on Master Branch");
		int x1=2;
	      int x2=4;
	      int y1=5;
	      int y2=10;
	      
	      System.out.println("A Length as 2 points : " + "("+x1+ "," +y1+ ")" + "and" + "(" +x2+ "," +y2+ ")");
	      double LenthLine = Math.sqrt(((x2 - x1) * (x2-x1)) + ((y2-y1) * (y2-y1)));
	      System.out.println("Length of a line : "+ LenthLine);
	}

}
