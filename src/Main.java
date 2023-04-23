import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {

        System.out.println("Digite o seu cep(com -): ");
        String cep = new Scanner(System.in).nextLine();

        Endereco endereco = Api.buscaEnderecoPelo(cep);

        System.out.println("CEP: "+ cep);
        System.out.println("Logradouro: "+ endereco.getLogradouro());
        System.out.println("Bairro: "+ endereco.getBairro());
        System.out.println("Localidade: "+ endereco.getLocalidade());
    }
}