import java.net.Socket;
import java.io.OutputStream;
import java.io.IOException;

public class RequestProcessor extends WebServer {
    private Socket socket;

    public RequestProcessor(Socket socket) {
        this.socket = socket;
        process();
    }

    private void process() {
        try {
            HttpRequest request = new HttpRequest(socket);
            OutputStream output = socket.getOutputStream();
            
            if(request.getUrl().equals("/")) {
                output.write("200 OK".getBytes());
            } else {
                output.write("404 Not Found".getBytes());
            }
            output.close();
        } catch(IOException e) {
            e.printStackTrace();
        }
    }
}
