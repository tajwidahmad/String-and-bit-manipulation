public class get_ith_bit {

    public static void main(String[] args) {
        int a =3;
        int i=1;
        int bitmask=1<<i;
        if ((3&bitmask)==0) {
            System.out.println("ith bit is 0");

        }
        else{
            System.out.println("not zero its 1");
        }
    }
}