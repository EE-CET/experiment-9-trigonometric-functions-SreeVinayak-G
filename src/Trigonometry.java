import java.util.*;
public class Trigonometry {

    public static double sine(double angle){
        double angleInRadians = Math.toRadians(angle);
        return Math.sin(angleInRadians);
    }
    
    public static double cosine(double angle){
        double angleInRadians = Math.toRadians(angle);
        return Math.cos(angleInRadians);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double angle = sc.nextDouble();
        double sineValue = sine(angle);
        double cosineValue = cosine(angle);
        System.out.println("Sine: "+sineValue);
        System.out.println("Cosine: "+cosineValue);
    }
    
    
}
