import java.io.IOException;
import java.net.Socket;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class HttpContext extends RequestProcessor   {
    private Socket socket;

    void HttpContext (Socket socket){
        this.socket = socket;
    }

    HttpRequest getRequest(){

    }

    HttpResponse getResponse(){

    }

    void close(){
        try {
            socket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
