package br.com.cadUser;

import java.util.ArrayList;
import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

@Named("pessoaBean")
@RequestScoped
public class Pessoa {
    private String nome;
    private ArrayList<String> nomes = new ArrayList<>();

    // Getters e Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public ArrayList<String> getNomes() {
        return nomes;
    }

    public void setNomes(ArrayList<String> nomes) {
        this.nomes = nomes;
    }

    // Método para cadastrar o nome
    public void cadastrar() {
        if (nome != null && !nome.isEmpty()) {
            nomes.add(nome);
        }
    }
}