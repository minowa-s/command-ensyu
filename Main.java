import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class Main{
		public static void main(String[] args){
    Scanner sc =new Scanner(System.in);
    BigDecimal bd;
    BigDecimal bd2;

    System.out.println("1�l�ڂ̐g������͂��Ă��������B");
    double m = sc.nextDouble();
    System.out.println("1�l�ڂ̑̏d����͂��Ă��������B");
    double  kg = sc.nextDouble();
    System.out.println("2�l�ڂ̐g������͂��Ă��������B");
    double m2 = sc.nextDouble();
    System.out.println("2�l�ڂ̑̏d����͂��Ă��������B");
    double kg2 = sc.nextDouble();

    double bmi = kg / Math.pow(m, 2);
    bd = new BigDecimal(bmi);
    bd = bd.setScale(2,RoundingMode.HALF_UP);
    
    double bmi2 = kg2 / Math.pow(m2, 2);
    bd2 = new BigDecimal(bmi2);
    bd2 = bd.setScale(2,RoundingMode.HALF_UP);
    System.out.println("1�l�ڂ�BMI��"+bd+"�ł��B");
    System.out.println("2�l�ڂ�BMI��"+bd2+"�ł��B");	        
	
		}
}		
