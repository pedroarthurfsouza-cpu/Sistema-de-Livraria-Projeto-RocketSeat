import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Autor {


    private String idAutor;
    private String nomeAutor;
    private LocalDate dataNascimento;

 DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    
    String dataNascimentoFormatada = dataNascimento.format(formatter);

    public Autor(String idAutor, String nomeAutor, String dataNascimentoFormatada) {
        this.idAutor = idAutor;
        this.nomeAutor = nomeAutor;
        this.dataNascimentoFormatada = dataNascimentoFormatada;
    }

    public String getIdAutor() {
        return idAutor;
    }

    public void setIdAutor(String idAutor) {
        this.idAutor = idAutor;
    }

    public String getNomeAutor() {
        return nomeAutor;
    }

    public void setNomeAutor(String nomeAutor) {
        this.nomeAutor = nomeAutor;
    }

}
