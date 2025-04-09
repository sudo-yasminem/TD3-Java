
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class WebServer extends WebServerApplication{
        RequestProcessor process = new RequestProcessor(null);
        public void start() {
            try {
                ServerSocket serverSocket = new ServerSocket(8080);
                while (true) {
                    Socket socket = serverSocket.accept();
                }
                } catch (IOException e) {
                    System.out.println("Erreur démarrage du serveur");
                }
        }

    public void run(int portNumber){
        try {
            ServerSocket serverSocket = new ServerSocket(portNumber);
            System.out.println("Server started on port " + portNumber);

            while (true){
                Socket clientSocket = serverSocket.accept();
                HttpContext context = new HttpContext();
                //Thread thread = new Thread(new RequestProcessor(context));
            }
        } catch (IOException e) {
            System.err.println("Server error: " + e.getMessage());
        }
    }
}
