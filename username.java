 import java.util.Scanner;

class username {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter Your username: ");
        String username = s.next();
        System.out.print("Enter Your password: ");
        int password = s.nextInt();
        userdata obj = new userdata();
        obj.checkuser(username,password);
}
}
class userdata{
    String c = "raghav";
    int checkuser(String a,int b)
    {
        if(a.equals(c))
        {
             
        }
    }

}