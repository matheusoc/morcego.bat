package controller;

import java.util.ArrayList;

import model.Vilao;

public class SearchControl {
	
	private static ArrayList<Vilao> vilains;

	public static ArrayList<Vilao> searchEntry(String busca, ArrayList<Vilao> allVilains){
		
		vilains = new ArrayList<>();
		
		for(Vilao vilao : allVilains){
			if(vilao.getNome().toLowerCase().contains(busca.toLowerCase())){
				vilains.add(vilao);
			}
		}
		
		if(!vilains.isEmpty()){
			return vilains;
		}
		
		return allVilains;
	}

}
