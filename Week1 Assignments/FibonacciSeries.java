package week1assignment;

public class FibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 10, FN = 0, SN = 1, Total;
        
		for (int i = 1; i <= a; i++)
        {
            System.out.println(FN);;
            Total = FN + SN;
            FN = SN;
            SN = Total;
        }
	}
}
