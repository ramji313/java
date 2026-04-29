class variable {
    public static void main(String[] args) {
        ramji r = new ramji();
        System.out.println(ramji.x);
        r.ram();
        System.out.println(r.str);
    }
}
class ramji{
    String str = "Ramji is very good boy in the class";
    static int x = 10;
    void ram(){
        int w = 10,q = 20;
        System.out.println(w+q);
    }
}