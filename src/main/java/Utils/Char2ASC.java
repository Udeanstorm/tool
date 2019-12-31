package Utils;

public class Char2ASC {
    public static int[] char2ASC(String arg){
        int a[] = new int [arg.length()];
        for(int i = 0 ; i < arg.length() ; i++)
            a[i] = arg.charAt(i);
        return a;
    }
}
