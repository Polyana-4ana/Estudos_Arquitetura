package Controller;

import java.util.ArrayList;

import Model.Livro;

public class LivrariaController {

    ArrayList<Livro> listalivro = new ArrayList<>();

    private int contador = 1;

    public void adicionaLivro(String titulo, String autor){
        Livro livro = new Livro(contador, titulo, autor);
        contador ++;
        listalivro.add(livro);
    }

    public void listarLivros(){
        if (listalivro.isEmpty()){
            System.out.println("Sem livros cadastrados");
        }
        for(Livro livro : listalivro ){
            System.out.println("Livros Cadastrados: ");
            System.out.println();
            System.out.println(livro.id());
            System.out.println(livro.titulo());
            System.out.println(livro.autor());
        }
    }

    public void buscarporId(int id){
        if (listalivro.isEmpty()){
            System.out.println("Sem livros cadastrados");
        }
        
        boolean encontrado = false;

        for(Livro livro : listalivro){
            if(livro.id() == id ){
                System.out.println(livro);
                encontrado = true;
            }
        }
        System.out.println("Não encontrado");
    }

}
