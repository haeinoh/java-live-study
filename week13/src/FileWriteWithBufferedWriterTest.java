import java.io.*;

public class FileWriteWithBufferedWriterTest {
    public static void main(String[] args)  {
        String str = "Hello World";
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter("D:/java/java-live-study/week13/src/output.txt", true));
            bw.append(str);
            bw.append("...!");
            bw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
