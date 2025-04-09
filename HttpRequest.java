import java.io.*;
import java.net.*;

public class HttpRequest {
    public String method;
    public String url;

    public void readClientRequest(Socket socket){
        try{
        BufferedReader reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        String requestLine = reader.readLine();
        
            System.out.println("Erreur readClientRequest");
        
        
        if (requestLine != null){
            String[] parts = requestLine.split(" ");
            method = parts[0];
            url = parts[1]; 
        }

        else{
            System.out.println("Requête vide");
        }    
    }
    catch(IOException e){
        System.out.println("Erreur readClientRequest");
    }
}
    

    HttpRequest(String method, String url){
        this.method = method;
        this.url = url;
    }

    HttpRequest(Socket socket){
        super();
    }

    String getMethod(){
        return method;
    }

    String getUrl(){
        return url;
    }
}

