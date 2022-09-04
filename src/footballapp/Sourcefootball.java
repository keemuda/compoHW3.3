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
public interface Sourcefootball {
    public void notifyobserver();
    public void register(Footballobserver observer);
}
