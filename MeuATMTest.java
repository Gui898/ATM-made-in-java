import javax.swing.*;
/*Não mexam por favor, essa é
 minha única diversão na aula 
 de algoritmos!*/

public class MeuATMTest {

    public static void main(String[] args){
    	
    	Pessoa1 p1 = new Pessoa1(500, "Gui");
    	Pessoa2 p2 = new Pessoa2(0, "Felipão");
    	
    	p1.allMethods(p1, p2);
    	p2.allMethods(p2, p1);
    	
    }
}
