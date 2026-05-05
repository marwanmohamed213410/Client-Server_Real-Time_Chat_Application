
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
        Scanner fromConsole = new Scanner(System.in);

        String inputFromServer, inputFromConsole;

        while (true) {
            inputFromServer = fromClient.nextLine();
            System.out.println("CLient: " + inputFromServer);

            if (inputFromServer.equals("@exit")) {
                break;
            }

            System.out.print("Server: ");
            inputFromConsole = fromConsole.nextLine();

            toClient.println(inputFromConsole);
            toClient.flush();
            
            if (inputFromConsole.equals("@exit")) {
                break;
            }
        }
        socket.close();
    }
}