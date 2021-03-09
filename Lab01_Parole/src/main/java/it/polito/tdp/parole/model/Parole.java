package it.polito.tdp.parole.model;

import java.util.ArrayList;
import java.util.List;

public class Parole
{
	List<String> lista;
	
	// costruttore
	public Parole()
	{
		lista = new ArrayList<>();
	}
	// metodi
	public void addParola(String p)
	{
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
}
