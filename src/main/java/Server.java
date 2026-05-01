
import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

/**
 *
 * @author Marwan
 */
public class Server {

    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(20597);
        Socket socket = serverSocket.accept();

        Scanner fromClient = new Scanner(socket.getInputStream());
        PrintWriter toClient = new PrintWriter(socket.getOutputStream());

        String input, output;

        while (true) {
            input = fromClient.nextLine();
            System.out.println("CLient: " + input);

            output = input.toUpperCase();
            toClient.println(output);
        }
//        socket.close();
    }
}
