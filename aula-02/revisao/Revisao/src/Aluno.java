public class Aluno implements Comparable<Aluno>{
    private int RM;
    private String nome;

    public Aluno(int RM, String nome) {
        this.RM = RM;
        this.nome = nome;
    }

    public int getRM() {
        return RM;
    }

    public void setRM(int RM) {
        this.RM = RM;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public int compareTo(Aluno o) { // retorna o int por -1 se não tem, 0 se é igual, 1 se é diferente
        return nome.compareTo(o.getNome()); // ordenar nome
    }
}
