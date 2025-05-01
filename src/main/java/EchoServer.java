
import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class EchoServer {
    public static void main(String[] args) throws IOException {

        try (ServerSocket server = new ServerSocket(9000)) {

            while (!server.isClosed()) {
                Socket socket = server.accept();

                try (OutputStream output = socket.getOutputStream();
                     BufferedReader input = new BufferedReader(
                             new InputStreamReader(socket.getInputStream()))) {

                    String stroka = input.readLine();
                    // System.out.println(stroka);
                    if (stroka != null && stroka.contains("msg=Exit")) {
                        server.close();
                    }

                    if (stroka != null && stroka.contains("msg=Hello")) {
                        System.out.println("Hello");
                    }

                    if (stroka != null && stroka.contains("msg=What")) {
                        System.out.println("What");
                    }

                    output.write("HTTP/1.1 200 OK\r\n\r\n".getBytes());
                    for (String string = input.readLine(); string != null && !string.isEmpty(); string = input.readLine()) {
                        System.out.println(string);
                    }
                    output.flush();
                }
            }
        }
    }
}