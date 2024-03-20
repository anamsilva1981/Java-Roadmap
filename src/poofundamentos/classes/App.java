public class App {
    public static void main(String[] args) {
        System.out.println("Aprendendo POO com java");

        // Quando instancio uma classe, construo um objeto 
        Pessoa pessoa1 = new Pessoa();


        pessoa1.setNome("Juliano");

        pessoa1.setIdade(21);

        System.out.println(pessoa1.getNome());
        System.out.println(pessoa1.getIdade());


        // 

        Carro carro = new Carro();

        carro.setModelo("Ford Ka");
        carro.setAno(2020);
        carro.setCor("Azul");
        
        System.out.println(carro.getCor());
        System.out.println(carro.getModelo());
        System.out.println(carro.getAno());

    
        Carro novoCarro = new Carro("Fiat toro", 2020, "Azul");
        System.out.println(novoCarro.getCor());
        System.out.println(novoCarro.getModelo());
        System.out.println(novoCarro.getAno());
    }
}


/**
 * MÉTODOS ACESSORES: 
 * 
 * PUBLIC: indica que qualquer um pode acessar o elemento, classe, metodo
 * PRIVATE: indica que somente a classe consegue acessar
 * PROTECTED: Somente a classe e seus filhos conseguem acessar
 * DEFAULT: Somente a classe, seus filhos e as classes no mesmo Package podem acessar
 */

 /*
  * Por boa prática todos os atributos são PRIVATES
  */

  /**
   * FORMAS DE ESCREVER:
   * 
   * Mais usados
   * PascalCase: NotaFiscal.java
   * camelCase: notaFiscal.java
   * 
   * Pouco usado
   * kibab-case: nota-fiscal.java
   * snake_case: nota_fiscal.java
   */