package miw.bowling;

import java.util.ArrayList;

import miw.exceptions.NamePlayerException;
import miw.exceptions.NumPlayerException;

public class Partida {
	static final int LOWERLIMIT = 0;
	static final int UPPERLIMIT = 6;
	private int numPlayers;
	private ArrayList<String> players;

	public Partida(int numPlayers) throws NumPlayerException {
		if (isValidNumPlayers(numPlayers)) {
			this.numPlayers = numPlayers;
		} else {
			throw new NumPlayerException(numPlayers);
		}
	}

	public ArrayList<String> getPlayers() {
		return players;
	}

	public int getNumPlayers() {
		return numPlayers;
	}

	public void setNumPlayers(int numPlayers) {
		this.numPlayers = numPlayers;
	}

	public boolean isValidNumPlayers(int numPlayers) {
		return (numPlayers > LOWERLIMIT && numPlayers <= UPPERLIMIT);
	}
	
	public boolean isValidName(String name){
		return (name.trim().equals(""));
	}
	
	public boolean isRepeatedName(String name){
		for (String player : players) {
			if (player.equals(name)){
				return true;
			}
		}
		return false;
	}
	
	
	public void add(String name) throws NamePlayerException {
		if (!isValidName(name)){
			if (!isRepeatedName(name)) {
				players.add(name);
			}else {
				throw new NamePlayerException("Nombre repetido");
			}
		} 
		else {
			throw new NamePlayerException("Nombre en blanco");
		}
	}

}
