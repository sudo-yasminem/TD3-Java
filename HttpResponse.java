import java.io.*;
import java.net.*;

public class HttpResponse extends HttpContext {
    private OutputStream output;

    HttpResponse(Socket socket) throws IOException{
        this.output = socket.getOutputStream();
    }

    public HttpResponse() {
        //TODO Auto-generated constructor stub
    }

    void ok() throws IOException{
      output.write("200 OK \n".getBytes());

    }

    void notFound(String message) throws IOException{
        output.write("Error 404 \n".getBytes());
    }

    

}
