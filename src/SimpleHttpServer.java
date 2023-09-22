import com.sun.net.httpserver.HttpServer;
import com.sun.net.httpserver.HttpHandler;
import com.sun.net.httpserver.HttpExchange;

import java.io.IOException;
import java.io.OutputStream;
import java.net.InetSocketAddress;

public class SimpleHttpServer {
    public static void main(String[] args) throws IOException {
        // 웹 서버를 포트 8080에서 시작
        HttpServer server = HttpServer.create(new InetSocketAddress(8080), 0);

        // 컨텍스트 경로에 대한 요청을 처리하는 핸들러 등록
        server.createContext("/", new MyHandler());

        // 서버 시작
        server.start();
        System.out.println("서버 시작. 포트: 8080");
    }

    static class MyHandler implements HttpHandler {
        @Override
        public void handle(HttpExchange exchange) throws IOException {
            // 클라이언트에 응답을 보냄
            String response = "Hello. This is Simple Web Server for test.";
            exchange.sendResponseHeaders(200, response.getBytes().length);
            OutputStream os = exchange.getResponseBody();
            os.write(response.getBytes());
            os.close();
        }
    }
}
