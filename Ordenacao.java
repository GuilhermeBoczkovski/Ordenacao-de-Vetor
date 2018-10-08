/*
 * Universidade Federal de Santa Catarina.
 * CTC - Centro Tecnologico - http://ctc.ufsc.br
 * INE - Departamento de Informatica e Estatistica - http://inf.ufsc.br
 */
import java.util.Arrays;

public class Ordenacao {
    
    private int[] array;
    
    /**
     * Recebe o array com o conteudo a ser ordenado
     * @param arrayParaOrdenar contem o conteudo a ser ordenado
     */
    public Ordenacao(int[] arrayParaOrdenar){
        
        array = arrayParaOrdenar;
        
    }

    /**
     * Realiza a ordenacao do conteudo do array recebido no construtor
     * @return array com o conteudo ordenado
     */
    public int[] ordena() {
        //Coloque aqui o seu codigo que vai realizar a ordenacao
        
        int tamanho = array.length;
        int atual = 0;
        for(int i = 0; i < tamanho - 1; i++){
            for(int j = i + 1; j < tamanho; j++){
                
                if(array[j] < array[i]){
                    atual = array[i];
                    array[i] = array[j];
                    array[j] = atual;
                }	 	  	  		      	     	      			       	 	
            }
        }
        return array;
    }
    
    
    /**
     * Converte o conteudo do array em String formatado
     * Exemplo: 
     * Para o conteudo do array: [1,2,3,4,5]
     * Retorna: "1,2,3,4,5"
     * @return String com o conteudo do array formatado
     */
    @Override
    public String toString(){
        
        //Coloque aqui o seu codigo que converte em String e formata o conteudo do array
        String arrayString = "";
        for(int i = 0; i < array.length - 1; i++){
            arrayString += array[i] + ",";
        }
        arrayString += array[array.length - 1];
        return arrayString;
    }

}

	 	  	  		      	     	      			       	 	
