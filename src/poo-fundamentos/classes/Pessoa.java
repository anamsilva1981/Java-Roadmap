

public class Pessoa {

    // Atributos da classe
    private String nome;
    private int idade;

    // METODO SETTER: que uma classe de fora pode trocar o nome 
    public void setNome(String nome){
        this.nome = nome;
    }

    public void setIdade(int idade){
        this.idade = idade;
    }


    // METODO GETTER
    public String getNome(){
        return this.nome;
    }

    public Integer getIdade(){
        return this.idade;
    }

}




