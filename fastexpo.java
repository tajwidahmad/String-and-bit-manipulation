//important...
public class fastexpo {
    public static void main(String[] args) {
        int base=5;
        int power =3;
        int ans =1;
        while (power>0) {
            if ((power&1)!=0) {
                ans=ans*base;
            }
            base=base*base;
            power = power>>1;
        }
        System.out.println(ans);
    }
}
