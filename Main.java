import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class Main{
		public static void main(String[] args){
    Scanner sc =new Scanner(System.in);
    BigDecimal bd;
    BigDecimal bd2;

    System.out.println("1人目の身長を入力してください。");
    double m = sc.nextDouble();
    System.out.println("1人目の体重を入力してください。");
    double  kg = sc.nextDouble();
    System.out.println("2人目の身長を入力してください。");
    double m2 = sc.nextDouble();
    System.out.println("2人目の体重を入力してください。");
    double kg2 = sc.nextDouble();

    double bmi = kg / Math.pow(m, 2);
    bd = new BigDecimal(bmi);
    bd = bd.setScale(2,RoundingMode.HALF_UP);
    
    double bmi2 = kg2 / Math.pow(m2, 2);
    bd2 = new BigDecimal(bmi2);
    bd2 = bd.setScale(2,RoundingMode.HALF_UP);
    System.out.println("1人目のBMIは"+bd+"です。");
    System.out.println("2人目のBMIは"+bd2+"です。");	        
	
		}
}		
