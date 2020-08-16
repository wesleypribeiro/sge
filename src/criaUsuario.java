import java.util.Scanner;

public class criaUsuario {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String nomeCompleto = null;
        String usuario = null;
        String senha = null;
        StringBuilder ultimoNome = new StringBuilder();

        System.out.println("CADASTRO DE USUÁRIO");
        System.out.println("Por favor, digite seu nome completo: ");
        nomeCompleto = scanner.nextLine();

        for (int i = nomeCompleto.lastIndexOf(" ")+1; i <= nomeCompleto.length(); i++){
            if (i < nomeCompleto.length()) {
                ultimoNome.append(nomeCompleto.charAt(i));
            }
        }

        usuario = nomeCompleto.charAt(0) + "_" + ultimoNome.toString();

        System.out.println("Seu nome de usuário é " + usuario);

        boolean senhaValida = false;
        while (senhaValida == false){
            System.out.println("Por favor, insira uma senha: ");
            senha = scanner.nextLine();

            if (senha.length() >= 8 && senha.matches("^(?=.*[0-9])(?=.*[a-z])(?=.*[-, !, @])(?=.*[A-Z])(?=.*\\d).+")){
                System.out.println("Senha criada com sucesso");
                senhaValida = true;
            } else{
                System.out.println("Senha informada não é valida, por favor digite outra senha!");
            }
        }

        boolean loginRealizado = false;
        while (loginRealizado == false){
            System.out.println("Insira seu nome de usuário, por favor: ");
            String nomeUsuario = scanner.nextLine();

            System.out.println("Insira sua senha, por favor:");
            String senhaUsuario = scanner.nextLine();

            if (nomeUsuario.equals(usuario) && senhaUsuario.equals(senha)){
                System.out.println("Login realizado com sucesso!");
                loginRealizado = true;
            }else{
                System.out.println("Usuario ou senha incorretos!");
            }
        }

    }
}
