
import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

/**
 *
 * @author Marwan
 */
public class Client {

    public static void main(String[] args) {
        try {
            Socket socket = new Socket("localhost", 20597);

            Scanner fromServer = new Scanner(socket.getInputStream());
            PrintWriter fromClient = new PrintWriter(socket.getOutputStream(), true);
            Scanner fromConsole = new Scanner(System.in);

            String input, output;

            while (true) {
                System.out.print("Client: ");
                input = fromConsole.nextLine();

                fromClient.println(input);
                if (input.equals("@exit")) {
                    break;
                }
                
                output = fromServer.nextLine();
                System.out.print("Server: ");
                System.out.println(output);
                
                if (output.equals("@exit")) {
                    break;
                }
            }
            socket.close();
        } catch (IOException ex) {
            System.getLogger(Client.class.getName()).log(System.Logger.Level.ERROR, (String) null, ex);
        }
    }
}
