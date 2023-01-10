public class MultiplicaAi {
    public static void main(String[] args) {
        int x = 6;

        System.out.println("Tabela de multiplicação de " + x);
        for (int i = 1; i <= 10; i++){
            int multiplicacao = i * x;
            String message = x + " x " + i + " = " + multiplicacao;
            System.out.println(message);
        }
    }
}
