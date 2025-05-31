import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class IntServer {
    public static void main(String[] args) {
        try (ServerSocket ss = new ServerSocket(9999)) {
            // Create a ServerSocket that listens on port 9999.

            System.out.println("Server started and waiting for connections...");

            while (true) {
                // Infinite loop to accept new clients.

                try (Socket s = ss.accept()) {
                    // Accept connection from client (blocking).

                    System.out.println("Connection accepted from: " + s.getInetAddress());

                    int number = s.getInputStream().read();
                    // Read a byte from the client.

                    if (number == -1) {
                        System.out.println("No data received");
                    } else {
                        System.out.println("Server received: " + number);
                    }

                } catch (IOException e) {
                    System.err.println("Error communicating with client: " + e.getMessage());
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}