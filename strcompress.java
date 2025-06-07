public class strcompress {
    public static String compress_string(String str) {
        StringBuilder sb = new StringBuilder(" ");
        for(int i=0;i<str.length();i++){
            Integer freq=1;
            while (i<str.length()-1&&str.charAt(i)==str.charAt(i+1)) {
                freq++;
                i++;
            }
            sb.append(str.charAt(i));
            if (freq>=2) {
                sb.append(freq.toString());
            }
        }
        
        return sb.toString();
    

    }
    public static void main(String[] args) {
        String str ="aaabbbccdde";
        //output a3b3c2d2e
        System.out.println(compress_string(str));
    }
}

