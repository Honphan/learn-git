package learnjavaaa;

import java.util.Scanner;

public class lab1 {
   bài 1
	public static void main(String[] args) {
		String name="";
		double diem=0;
		Scanner scanner=new Scanner(System.in);
		System.out.println("Your name is : ");
        name=scanner.nextLine();
        System.out.println("điểm cua bạn là : ");
        diem=scanner.nextInt();
        System.out.println(name+" có điểm "+diem);
	}
	//bài 2
     public static void main(String[] args) {
	    double a,b;
	    Scanner scanner=new Scanner(System.in);
	    	a=scanner.nextInt();
	    	b=scanner.nextInt();
	    	double ChuVi=(a+b)/2;
	    	double  Dientich=a*b;
	    	double MinEdge=Math.min(a, b);
	    System.out.printf("Chu vi la : %.2f . Dien tich la : %.2f . Canh nho nhat la : %.2f",ChuVi,Dientich,MinEdge );
   }
	public static void main(String[] args) {
		double 	Edge;
		Scanner scanner =new Scanner(System.in);
		Edge=scanner.nextDouble();
		double Thetich=Math.pow( Edge, 3);
		System.out.println("The tich la : "+Thetich);
	}
}
