public class Ninja {
    private String nome;
    private int idade;
    private String missaoAtribuida;
    private char nivelDificuldade; // Agora é um char (S, A, B, C, D, E)
    private boolean statusConclusao;

    // Construtor
    public Ninja(String nome, int idade, String missaoAtribuida, char nivelDificuldade) {
        this.nome = nome;
        this.idade = idade;
        this.missaoAtribuida = missaoAtribuida;
        this.nivelDificuldade = nivelDificuldade;
        this.statusConclusao = false; // Por padrão, a missão não está concluída
    }

    // Método para realizar a missão
    public String fazerMissao(char tipoMissao) {
        if (idade < 15 && !(tipoMissao == 'C' || tipoMissao == 'D')) {
            return "Missão não concluída: Ninjas com menos de 15 anos só podem realizar missões do rank C ou D.";
        }

        // Verifica se o tipo de missão é válido
        if (tipoMissao == 'S' || tipoMissao == 'A' || tipoMissao == 'B' || tipoMissao == 'C' || tipoMissao == 'D') {
            this.statusConclusao = true;
            return "Missão concluída!";
        } else {
            return "Missão não concluída: Tipo de missão inválido.";
        }
    }

    // Getters e Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getMissaoAtribuida() {
        return missaoAtribuida;
    }

    public void setMissaoAtribuida(String missaoAtribuida) {
        this.missaoAtribuida = missaoAtribuida;
    }

    public char getNivelDificuldade() {
        return nivelDificuldade;
    }

    public void setNivelDificuldade(char nivelDificuldade) {
        this.nivelDificuldade = nivelDificuldade;
    }

    public boolean isStatusConclusao() {
        return statusConclusao;
    }

    public void setStatusConclusao(boolean statusConclusao) {
        this.statusConclusao = statusConclusao;
    }

    // Método toString melhorado
    @Override
    public String toString() {
        String statusMissao = statusConclusao ? "Concluída" : "Não concluída";
        return "Ninja: " + nome +
                "\nIdade: " + idade +
                "\nMissão Atribuída: " + missaoAtribuida +
                "\nNível de Dificuldade: " + nivelDificuldade +
                "\nStatus da Missão: " + statusMissao +
                "\n-----------------------------";
    }
}