public class odd_even {
    public static void bit_evenorodd(int n) {
        int bitmask=1;
        if ((n & bitmask)==0) {
            System.out.println("even");
        }
        else{
            System.out.println("odd");
        }
    }

    public static void main(String[] args) {
        bit_evenorodd(3);
        bit_evenorodd(6);
        bit_evenorodd(8);

        
    }
}

