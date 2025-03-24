
import java.net.ServerSocket;

public class WebServerApplication{
    public static void main(String[] args) {
        try {
            
            /*ServerSocket serverSocket = new ServerSocket(80);
            try{
                serverSocket.close();
            }
            catch (Exception e){
                System.out.println("Error closing server socket");
            }
            */ 
            
            

            WebServer serv = new WebServer();
            serv.run(8080);
            
        } catch (Exception e) {
            System.out.println("Erreur");
        }
       
        
    }
}