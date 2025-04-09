import java.net.*;
import java.io.*;

public class HttpContext{
    public Socket socket;
    public HttpRequest request;
    public HttpResponse response;

    void HttpContext (Socket socket) throws IOException {
        this.socket = socket;
        this.request = new HttpRequest(socket);
        this.response = new HttpResponse();
    }

    HttpRequest getRequest(){
        return null;
    }

    HttpResponse getResponse(){
        return HttpResponse("null","null");
    }

    private HttpResponse HttpResponse(String string, String string2) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'HttpResponse'");
    }

    void close(){
        try {
            socket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
