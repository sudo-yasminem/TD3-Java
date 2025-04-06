import java.io.BufferedWriter;
import java.net.Socket;

public class HttpResponse extends HttpContext {
    private BufferedWriter output;

    HttpResponse(Socket socket){
        super(socket);
    }

    void ok(String message){
      
    }

    void notFound(String message){
        
    }

}
