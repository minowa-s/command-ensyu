import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class Main{
		public static void main(String[] args){
	        Scanner sc =new Scanner(System.in);
			BigDecimal bd;

    System.out.println("�g������͂��Ă��������B");
    double m = sc.nextDouble();
    System.out.println("�̏d����͂��Ă��������B");
    double  kg = sc.nextDouble();

    double bmi = kg / Math.pow(m, 2);
    bd = new BigDecimal(bmi);
    bd = bd.setScale(2,RoundingMode.HALF_UP);
    System.out.println("bmi��"+bd+"�ł��B");	
		}
}		
