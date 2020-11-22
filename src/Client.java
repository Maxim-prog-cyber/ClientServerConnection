import java.io.*;
import java.net.Socket;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) throws IOException {


        while (true) {
            Scanner scanner = new Scanner(System.in);
            String str = scanner.nextLine();

            Socket socket = new Socket("127.0.0.1", 9000);
            BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(socket.getInputStream()));


            bufferedWriter.write(str);
            bufferedWriter.newLine();
            bufferedWriter.flush();

            System.out.println(bufferedReader.readLine());
        }
    }
}
