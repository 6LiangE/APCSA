public class p3 {
    public static void main(String[] args){
        getpi();
    }
    public static String getpi(){
        var n = 1;
        while (n < 11) {
            System.out.print(1 - 1/(n + 2));
            n = n + 2;
        }

        return getpi();
    }
}
