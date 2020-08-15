import java.util.Scanner;

public class validaSenha {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String usuario;
        String senha;
        int contador = 0;

        do {
            System.out.println("Por favor, digite um nome de usuário: ");
            usuario = scanner.nextLine();

            System.out.println("Por favor, digite uma senha: ");
            senha = scanner.nextLine();
            if(usuario.length() > 0 && senha.length() > 0) {
                break;
            }

            System.out.println("Usuario ou senha vazios");
            contador++;
            if(contador == 5) {
                System.out.println("Numero de tentativas excedidas, redirecionando para o reset de senha!");
            }
        } while((usuario.length() == 0 || senha.length() == 0) && contador < 5);

        System.out.println("Tudo certo!");
    }
}
