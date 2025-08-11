import java.util.Scanner;
public class VolumeCylinder {
    public static  void main(string[] args){
        Scanner sc=new Scanner(System.in);
        int r=sc.nextInt();
        int h=sc.nextInt();
        double area=3.14*r*r*h;
        System.out.println(area);
    }
}