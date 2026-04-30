import java.util.*;
class scn {
    public static void main(String[] args) {
        Scanner s = new Scanner (System.in);
        System.out.print("Enter Your Name: ");
        String name = s.nextLine();
        System.out.println(name);
        System.out.println("Enter Your Age: ");
        int age = s.nextInt();
        System.out.println(age);
        System.out.println("Enter Your Phone Number");
        Long num = s.nextLong();
        System.out.println(num);
        s.nextLine();
        System.out.println("Email");
        String mail = s.nextLine();
        System.out.println(mail);
        System.out.println("Current CGP");
        float cgp = s.nextFloat();
        System.out.println(cgp);
        

   
    }
    
}
