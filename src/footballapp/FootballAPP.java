/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package footballapp;
import java.util.Scanner;
/**
 *
 * @author chayodom
 */
public class FootballAPP {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Footballdatacenter obj = new Footballdatacenter();
        ScoreReport obj1 = new ScoreReport();
        ScoreReport obj2 = new ScoreReport();
        
        obj.register(obj1);
        obj.register(obj2);
        Scanner sc = new Scanner(System.in);
       
        while(true){
            System.out.print("INPUT Score  =>");
           String Input = sc.nextLine();
           if(!Input.equals("")){obj.setSomeData(Input);}
           else{System.out.println("match end");break;
           }
        }
        
        
    }
    
}
