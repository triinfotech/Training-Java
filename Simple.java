import java.util.Scanner;
class Simple{
	public static void main(String args[]){
		Scanner s=new Scanner(System.in);

		int a,b,c,d,e,f;
		a=s.nextInt();
		b=s.nextInt();
		c=s.nextInt();
		System.out.println("a= "+a+" b= "+b+" c= "+c);

		d=(a+b+c)/3;
		System.out.println("(a+b+c)/3= "+d);
		
		e=((a*a)+(b*b)+(c*c)+(2*a*b)+(2*a*c)+(2*b*c));
		System.out.println("((a*a)+(b*b)+(c*c)+(2*a*b)+(2*a*c)+(2*b*c))= "+e);
		

		int r=3;float pi=3.14f;
		float area=pi*r*r;
        System.out.println("Area of Circle(pi*r*r): "+area);

        f=((a*b)+(c*c)+(b*c)+(a/2));
        System.out.println("(a*b)+(c*c)+(b*c)+(a/2) = "+f);

        int g=(a*a+b*b)*(a+b+a*b);
        System.out.println("(a*a+b*b)*(a+b+a*b) = "+g);

        char[] ch={'\u0A39','\u0A30','\u0A26','\u0A40','\u0A2A'};
        //String str=new String(ch);
        System.out.println(ch);


	}
}