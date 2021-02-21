import java.io.*;

public class FileReadWithBufferedReaderTest {
    public static void main(String[] args)  {
            File f = new File("D:/java/java-live-study/week13/src/test.txt");
            try {
                BufferedReader bf = new BufferedReader(new FileReader(f));
                String tmp = "";
                while((tmp = bf.readLine()) != null){
                    System.out.println(tmp);
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
    }
}
