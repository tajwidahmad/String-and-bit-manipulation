public class shortpath {
    public static float shortest_path(String path) {
        int x=0;
        int y=0;
        for(int i=0;i<path.length();i++){
            if (path.charAt(i)=='W') {
                x--;
            }
            if (path.charAt(i)=='E') {
                x++;
            }
            if (path.charAt(i)=='N') {
                y++;
            }
            if (path.charAt(i)=='S') {
                y--;
            }
        }
        int x2=x*x;
        int y2=y*y;
        return (float)Math.sqrt(y2+x2);
    }
    public static void main(String[] args) {
        String path ="WNENESENN";
        System.out.println(shortest_path(path));
    }
}
