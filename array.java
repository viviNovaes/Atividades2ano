package Atividade2;

public class array {
    public static void main(String[] args) {
        String[] lista = new String[5];    // Essa linha evidencia a criação de um array,sendo seu nome "lista", tipo de dado "String
        lista[0] = "leite";                // e sendo básico, os colchetes. Também estabalecemos o tamanho da array, no caso, 5 posições.
        lista[1] = "ovos";                 // São 5 espaços note que termina no 4, isso acontece, pois, o primeiro elemento fica na posição 0.
        lista[2] = "frutas";
        lista[3] = "carnes";
        lista[4] = "biscoito";

        // Acima adicionamos elementos no espaço estabelecidos na criação do Array.

        System.out.println(" O item da lista na posição 3 é " + lista[3]);  // nessa linha fazemos uma consulta a um elemento
                                                                            // da Arrays Lista, por meio de um print. Estrutura = ( nomeDaArray[posição] )
        lista[2] = "camarao";  // Aqui alteramos um elemento do Array, a posição 2 deixa de "frutas" e se torna "camarao".

        lista[4] = null;  // Aqui tornamos a posição 4, "null". Não podemos apagar uma posição em uma array, pois o tamanho dela
                          // já foi pré-estabalecido. Assim sendo, substituir apenas o alamento anterior por "nulo".

        for (int i=0; i<lista.length; i++)     // Esse loop irá imprimos todos os valores do Array, sua estrutura é bem simples.
            System.out.println(lista[i]);



    }

}
