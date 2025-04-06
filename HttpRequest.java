import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.Socket;

public class HttpRequest extends HttpContext {
    private String method;
    private String url;

    private HttpRequest readClientRequest(){
        BufferedReader reader = new BufferedReader(new InputStreamReader(InputStream));
        String requestLine = reader.readLine();
        
        if (requestLine != null){
            String[] parts = requestLine.split(" ");
            method = parts[0];
            url = parts[1];

            return new HttpRequest(method,url); 
        }
        else{
            System.out.println("Requête vide");
        }
    }

    HttpRequest(Socket socket){
        super(socket);
    }

    String getMethod(){
        return method;
    }

    String getUrl(){
        return url;
    }
}
