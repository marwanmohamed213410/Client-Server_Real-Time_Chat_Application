
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
            Socket socket = new Socket("localhost",20597);
            
            Scanner fromServer = new Scanner(socket.getInputStream());
            PrintWriter fromClient = new PrintWriter(socket.getOutputStream());
            Scanner fromConsole = new Scanner(System.in);
            
            String input, output;
            
            while(true) {
                System.out.print("Enter your message: ");
                input = fromConsole.nextLine();
                
                fromClient.println(input);
                
                System.out.println("Server: ");
                output = fromServer.nextLine();
                System.out.println(output);
            }
            
        } catch (IOException ex) {
            System.getLogger(Client.class.getName()).log(System.Logger.Level.ERROR, (String) null, ex);
        }
    }
}
