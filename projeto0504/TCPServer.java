import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class TCPServer {
    public static void main(String[] args) throws IOException{
        System.out.println("servidor iniciando");
        ServerSocket socketServidor = new Serversocket(5003);
        Socket socketCliente = socketServidor.accept();
        PrintWriter out = new PrintWriter (socketCliente.getOutputStream(), true);
        BufferedReader in = new BufferedReader(new InputStreamReader(socketCliente.getInputStream()));

        String entrada;
        while ((entrada = in.readLine()) != null {
            System.out.println("recebido" + entrada);
            out.println(entrada);
            if (entrada.equals("fim")) {
                break;
            }
        }
        out.close();
        in.close();
        socketServidor.close();
    }
}
