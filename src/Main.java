import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ConsultaCep consulta = new ConsultaCep();

        System.out.println("Digite um numero de CEP para Consulta: ");
        var cep = sc.nextLine();



        try{
            Endereco novoEndereco =  consulta.BuscaEndereco(cep);
            System.out.println(novoEndereco);
            GeradorDeArquivo novo = new GeradorDeArquivo();
            novo.salvaJson(novoEndereco);
        }catch (RuntimeException e){
            System.out.println(e.getMessage());
            System.out.println("Finalizando aplicacao");

        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
}
