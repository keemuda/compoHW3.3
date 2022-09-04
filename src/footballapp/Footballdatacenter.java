/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package footballapp;

import java.util.ArrayList;

/**
 *
 * @author chayodom
 */
public class Footballdatacenter implements Sourcefootball{
    private final ArrayList<Footballobserver> list;
    private String scoreData;

    public Footballdatacenter() {
        this.list = new ArrayList<Footballobserver>();
    }
    public void setSomeData(String aData) {
	scoreData = aData;
	notifyobserver();
    }
    public String getSomeData() {
	return scoreData;
    }
    @Override
    public void register(Footballobserver observer){
    list.add(observer);
    }
    @Override
    public void notifyobserver(){
         for (int j = 0; j < list.size(); ++j) {
            list.get(j).update(this);
	}
    }
    }

   

