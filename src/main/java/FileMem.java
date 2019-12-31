import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileMem {
    public static void main(String[] args) {
        String address = "E://recovery//line.txt";
        String addr = "E://recovery//char.txt";
        String addre = "E://recovery//linechar.txt";
        File file;
        int length = 10000;
        file = new File(address);
        try {
            FileWriter fw = new FileWriter(file);
            BufferedWriter bw = new BufferedWriter(fw);
            for(int i = 0 ; i < length ; i++){
                bw.newLine();
            }
            bw.flush();
            file = new File(addr);
            fw = new FileWriter(file);
            bw = new BufferedWriter(fw);
            for(int i = 0 ; i < length ; i++){
                bw.write('A');
            }
            bw.flush();
            file = new File(addre);
            fw = new FileWriter(file);
            bw = new BufferedWriter(fw);
            for(int i = 0 ; i < length ; i++){
                bw.write('\n');
            }
            bw.flush();
            bw.close();
        }catch (IOException e){System.out.println(e.getMessage());e.printStackTrace();}
    }
}
