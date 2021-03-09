package it.polito.tdp.parole.model;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Parole
{
	List<String> lista;
	
	// costruttore
	public Parole()
	{
		lista = new ArrayList<>();
//		lista = new LinkedList<>();
	}
	// metodi
	public void addParola(String p)
	{
		if(!lista.contains(p) && !p.equals("") && !p.equals(" "))
			lista.add(p);
	}
	public List<String> getElenco()
	{
		return lista;
	}
	public void reset()
	{
		lista.clear();
	}
	public void cancella(String s)
	{
		if(lista.contains(s))
			lista.remove(s);
	}
	public String stampaLista()
	{
		String s = "";
		for (String str : this.lista)
			s += str + "\n";
		return s;
	} 
}