public class Main {
    public static void main(String[] args) {
        // Instanciando 3 tipos de ninjas - nem sem a idade desse ninjas
        Ninja ninja1 = new Ninja("Jiraya", 45, "Missão de Rank S", 'A');
        Ninja ninja2 = new Ninja("Sasuke", 16, "Missão de Rank B", 'B');
        Ninja ninja3 = new Ninja("Hinata", 14, "Missão de Rank D", 'C');

        // Testando o método fazerMissao
        System.out.println(ninja1.fazerMissao('S')); // Missão concluída!
        System.out.println(ninja2.fazerMissao('B')); // Missão concluída!
        System.out.println(ninja3.fazerMissao('S')); // Missão não concluída: Ninjas com menos de 15 anos só podem realizar missões do rank C ou D.

        // Exibindo informações dos ninjas
        System.out.println(ninja1);
        System.out.println(ninja2);
        System.out.println(ninja3);
    }
}