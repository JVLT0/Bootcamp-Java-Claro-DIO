import java.util.Scanner;

public class VerificacaoServico {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        String servico = input.nextLine().trim();
        String entradaCliente = input.nextLine().trim();
        
        String[] partes = entradaCliente.split(",");
        String nomeCliente = partes[0];
        boolean contratado = false;
        
        for (int i = 1; i < partes.length; i++) {
            if (partes[i].equalsIgnoreCase(servico)) {
                contratado = true;
                break;
            }
        }

        if(contratado){
            System.out.println("Sim");
        }else{
            System.out.println("Nao");
        }
        
        input.close();
    }
}