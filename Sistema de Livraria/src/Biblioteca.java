import java.util.ArrayList;

public class Biblioteca {

    private ArrayList<Livro> livros = new ArrayList<>();
    private ArrayList<Autor> autores = new ArrayList<>();
    private ArrayList<Emprestimo> emprestimos = new ArrayList<>();

    public Biblioteca(ArrayList<Livro> livros, ArrayList<Autor> autores, ArrayList<Emprestimo> emprestimos) {
        this.livros = livros;
        this.autores = autores;
        this.emprestimos = emprestimos;
    }

    public void adicionarLivros(Livro Livros){

        livros.add(Livros);

    }
    
    public void adicionarAutor(Autor Autores){

        autores.add(Autores);

    }

    public void adicionarEmprestimo(Emprestimo Emprestimos){

        emprestimos.add(Emprestimos);

    }
}
