public class substrings {

    //note-:start index and endinhg index (excluded)ending index;
    public static String subString_Str(String str,int si,int ei) {
        String subs="";
        for(int i=si;i<ei;i++){
            subs=subs+str.charAt(i);
        }
        return subs;
    }
    public static void main(String[] args) {
        String str="helloworld";
        System.out.println(subString_Str(str, 0, 4));

    }
}

