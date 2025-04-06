
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class WebServer extends WebServerApplication{
    private void readRequest(Socket socket){
        if(socket.isConnected()){
            try {
                InputStream input = socket.getInputStream();
                System.out.println(input);
            }
            catch (Exception e) {
                System.err.println("Erreur dans Readrequest");
            }
        }
    }
    
    private void sendResponse(Socket socket){
        try {
            OutputStream output = socket.getOutputStream();
            String response = "HTTP/1.1 200 OK\r\n" +
                             "Content-Type: text/html\r\n" +
                             "\r\n" +
                             "<html><body></body></html>";
            output.write(response.getBytes());
            output.flush();
            socket.close();
        } catch (IOException e) {
            System.err.println("Error sending response: " + e.getMessage());
        }
    }

    public void run(int portNumber){
        try {
            ServerSocket serverSocket = new ServerSocket(portNumber);
            System.out.println("Server started on port " + portNumber);

            while (true){
                Socket clientSocket = serverSocket.accept();
                readRequest(clientSocket);
                sendResponse(clientSocket);
            }
        } catch (IOException e) {
            System.err.println("Server error: " + e.getMessage());
        }
    }
}
