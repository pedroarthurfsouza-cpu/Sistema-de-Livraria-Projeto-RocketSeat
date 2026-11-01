import java.time.LocalDate;

public class Livro {

    private String idLivro;
    private String tituloLivro;
    private Autor autorLivro;
    private Boolean disponibilidadeLivro = true;
    private LocalDate dataCadastro;
    private LocalDate dataAtualizacao;

    

    public Livro(String idLivro, String tituloLivro, Autor autorLivro, Boolean disponibilidadeLivro, LocalDate dataCadastro, LocalDate dataAtualizacao) {
        this.idLivro = idLivro;
        this.tituloLivro = tituloLivro;
        this.autorLivro = autorLivro;
        this.disponibilidadeLivro = disponibilidadeLivro;
        this.dataCadastro = dataCadastro;
        this.dataAtualizacao = dataAtualizacao;
    }
    public String getIdLivro() {
        return idLivro;
    }
    public void setIdLivro(String idLivro) {
        this.idLivro = idLivro;
    }
    public String getTituloLivro() {
        return tituloLivro;
    }
    public void setTituloLivro(String tituloLivro) {
        this.tituloLivro = tituloLivro;
    }
    public Autor getAutorLivro() {
        return autorLivro;
    }
    public void setAutorLivro(Autor autorLivro) {
        this.autorLivro = autorLivro;
    }
    public Boolean getDisponibilidadeLivro() {
        return disponibilidadeLivro;
    }
    public void setDisponibilidadeLivro(Boolean disponibilidadeLivro) {
        this.disponibilidadeLivro = disponibilidadeLivro;
    }
    public LocalDate getDataCadastro() {
        return dataCadastro;
    }
    public void setDataCadastro(LocalDate dataCadastro) {
        this.dataCadastro = dataCadastro;
    }
    public LocalDate getDataAtualizacao() {
        return dataAtualizacao;
    }
    public void setDataAtualizacao(LocalDate dataAtualizacao) {
        this.dataAtualizacao = dataAtualizacao;
    }

    

}
