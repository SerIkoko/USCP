import java.io.IOException;
import java.net.Socket;

public class IntClient {
    public static void main(String[] args) {
        try (Socket s = new Socket("localhost", 9999)) {
            // Create a Socket object for the connection to localhost on port 9999.

            System.out.println("Connection to server established...");

            int number = (int) (Math.random() * 10);
            // Generate a random number from 0 to 9.

            s.getOutputStream().write(number);
            // Send the generated number to the server.

            System.out.println("Client sent: " + number);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}