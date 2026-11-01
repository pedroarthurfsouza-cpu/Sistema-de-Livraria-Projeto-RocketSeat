import java.time.LocalDate;

public class Emprestimo {

    private String id;
    private Livro livroQueFoiEmprestado;
    private String nomeCliente;
    private LocalDate dataEmprestimo;
    private LocalDate dataDevolucao;

    public Emprestimo(String id, Livro livroQueFoiEmprestado, String nomeCliente, LocalDate dataEmprestimo, LocalDate dataDevolucao) {

        this.id = id;
        this.livroQueFoiEmprestado = livroQueFoiEmprestado;
        this.nomeCliente = nomeCliente;
        this.dataEmprestimo = dataEmprestimo;
        this.dataDevolucao = dataDevolucao;
        
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Livro getLivroQueFoiEmprestado() {
        return livroQueFoiEmprestado;
    }

    public void setLivroQueFoiEmprestado(Livro livroQueFoiEmprestado) {
        this.livroQueFoiEmprestado = livroQueFoiEmprestado;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public LocalDate getDataEmprestimo() {
        return dataEmprestimo;
    }

    public void setDataEmprestimo(LocalDate dataEmprestimo) {
        this.dataEmprestimo = dataEmprestimo;
    }

    public LocalDate getDataDevolucao() {
        return dataDevolucao;
    }

    public void setDataDevolucao(LocalDate dataDevolucao) {
        this.dataDevolucao = dataDevolucao;
    }

}
