package servidor;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

import javax.swing.JOptionPane;

public class TCPClient {
    public static void main(String[] args) {
        Socket socket = new Socket("localhost", 5003);
        PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
        BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        String entradaservidor = "";

        String entradausuario = JOptionPane.showInputDialog("Digite:");
        while (!entradausuario.equals("fim"));
        out.printIn(entradausuario);
        entradaservidor = in.readLine()
    }
    
}
