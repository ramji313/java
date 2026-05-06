class exp{
    public static void main(String[] args) {
        String s[] = {}; 
        try {
            int x = 5 / 0;
            System.out.println(x);
        } 
        catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero");
        }
        try {
            String t = null;
            System.out.println(t.length());
        } 
        catch (NullPointerException e) {
            System.out.println("C.Josheph Vijay");
        }
        try {
            System.out.println(s[0]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("stalin Oliga");

        }
    


    }
}