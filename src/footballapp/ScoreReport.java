/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package footballapp;

/**
 *
 * @author chayodom
 */
public class ScoreReport implements Footballobserver{
     @Override
     public void update(Sourcefootball score){
         System.out.println("live result: "+
                 ((Footballdatacenter)score).getSomeData());
     }
}
