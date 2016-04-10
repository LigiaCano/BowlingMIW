package miw.bowling;

import java.util.ArrayList;

import miw.exceptions.FullPlayersException;
import miw.exceptions.InvalidNamePlayerException;
import miw.exceptions.InvalidNumberPlayersException;

public class Partida {
	static final int LOWERLIMIT = 0;
	static final int UPPERLIMIT = 6;
	private int playersNumber;
	private ArrayList<String> players;

	public Partida(int numPlayers) throws InvalidNumberPlayersException {
		if (isValidNumPlayers(numPlayers)) {
			this.playersNumber = numPlayers;
			this.players = new ArrayList<String>();
		} else {
			throw new InvalidNumberPlayersException(numPlayers);
		}
	}

	public ArrayList<String> getPlayers() {
		return players;
	}

	public int getPlayersNumber() {
		return playersNumber;
	}

	public boolean isValidNumPlayers(int numPlayers) {
		return (numPlayers > LOWERLIMIT && numPlayers <= UPPERLIMIT);
	}

	public boolean isPlayerNameEmpy(String name) throws InvalidNamePlayerException {
		return (name.trim().isEmpty());
	}

	public boolean isPlayerRepeatedName(String name) {
		return players.contains(name);
	}
	
	public boolean isFullPlayers(){
		return (this.getPlayers().size() >= this.getPlayersNumber());
	}

	public void addPlayer(String name) throws FullPlayersException, InvalidNamePlayerException {
		if(isFullPlayers())
			throw new FullPlayersException();
		if (isPlayerNameEmpy(name))
			throw new InvalidNamePlayerException("Nombre en blanco");
		if (isPlayerRepeatedName(name))
			throw new InvalidNamePlayerException("Nombre repetido");
		players.add(name);
	}

	@Override
	public String toString() {
		return "Partida [playersNumber=" + getPlayersNumber() + ", players=" + getPlayers() + "]";
	}
}
