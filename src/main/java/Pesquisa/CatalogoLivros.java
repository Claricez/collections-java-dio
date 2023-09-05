package main.java.Pesquisa;
import java.util.ArrayList;
import java.util.List;
public class CatalogoLivros {
    private List<Livro> livroList;

    public CatalogoLivros() {
        this.livroList = new ArrayList<>();
    }

    public void adicionarLivro(String titulo, String autor, int anoPublicacao){
            livroList.add(new Livro(titulo, autor, anoPublicacao));
    }

    public List<Livro> pesquisaPorAutor(String autor){
        List<Livro> livrosPorAutor = new ArrayList<>();
        if(!livroList.isEmpty()){
            for(Livro l : livroList){
                if (l.getAutor().equalsIgnoreCase(autor)) {
                    livrosPorAutor.add(l);
                }

            }
            return livrosPorAutor;
            }else{
            throw new RuntimeException("A lista está vazia!");
        }
        }
    public List<Livro> pesquisarPorIntervalosAnos(int anoInicial, int anoFinal){
        List<Livro> livrosPorIntervalosAnos = new ArrayList<>();
        if(!livroList.isEmpty()){
            for(Livro l : livroList){
                if(l.getAnoPublicacao() >= anoInicial && l.getAnoPublicacao() <= anoFinal){
                    livrosPorIntervalosAnos.add(l);
                }
            }
        }
        return livrosPorIntervalosAnos;
    }
    public Livro pesquisarPorTitulo(String titulo){
        Livro livroPorTitulo = null;
        if(!livroList.isEmpty()){
            for(Livro l : livroList){
                if(l.getTitulo().equalsIgnoreCase(titulo)) {
                    livroPorTitulo = l;
                    break;
                }
                }
            }
        return livroPorTitulo;
        }

    public static void main(String[] args){
        CatalogoLivros catalogoLivros = new CatalogoLivros();
        catalogoLivros.adicionarLivro("It a coisa", "Stephen King", 1986);
        catalogoLivros.adicionarLivro("Metade Sombria", "Stephen King", 1989);
        catalogoLivros.adicionarLivro("Harry Potter e a pedra filosofal","J.K Rowling", 1997);
        catalogoLivros.adicionarLivro("Harry Potter e a pedra filosofal","J.K Rowling", 1997);

        System.out.println(catalogoLivros.pesquisaPorAutor("Stephen King"));
        System.out.println(catalogoLivros.pesquisarPorIntervalosAnos(1990, 2000));
        System.out.println(catalogoLivros.pesquisarPorTitulo("Harry Potter e a pedra filosofal"));
    }
    }


