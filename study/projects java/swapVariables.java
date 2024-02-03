public class swapVariables{
    public static void main(String[] args) {
        String x = "Banana";
        String y = "maçã";
        String temp;

        temp = x;
        x = y;
        y = temp;
        temp = null;

        System.out.println(temp);
        System.err.println(y);
        System.err.println(x);

    }
}