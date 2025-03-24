
import java.io.IOException;
import java.io.InputStream;
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
            System.out.println("Requête traitée avec succès !");
            //socket.close();

    }

    public void run(int portNumber){
        try {
            ServerSocket serverSocket = new ServerSocket(portNumber);

        while (true){
                Socket clientSocket = serverSocket.accept();
                readRequest(clientSocket);
                sendResponse(clientSocket);
            } 
            }

            catch (IOException e) {
                e.printStackTrace();
            }
            

           
        
    }
}
