package miw.bowling;

import java.util.ArrayList;

import miw.exceptions.AdAlreadyExistsException;
import miw.exceptions.AdNotFoundException;

public class Marketing {

	private ArrayList<Ad> ads;

	public Marketing() {
		ads = new ArrayList<Ad>();
	}

	public ArrayList<Ad> getAds() {
		return ads;
	}
	
	public void addAd(Ad advertisement) throws AdAlreadyExistsException{
		if (!isAdRepeat(advertisement.getTitle()))
			ads.add(advertisement);
		else 
			throw new AdAlreadyExistsException();
	}
	
	public boolean isAdRepeat(String title){
		for (Ad ad : ads) {
			if (ad.getTitle().equals(title))
				return true;
		}
		return false;
	}
	
	public Ad findAd(String title) throws AdNotFoundException{
		for (Ad ad : ads) {
			if (ad.getTitle().equals(title))
				return ad;
		}
		throw new AdNotFoundException();
	}
	
	public boolean removeAd(String title)  throws AdNotFoundException{
		return ads.remove(findAd(title));
	}
	
	public Ad editAd(Ad advertisement)throws AdNotFoundException{
		int i=0;
		for (Ad ad : ads) {
			if (ad.getTitle().equals(advertisement.getTitle())){
				return ads.set(i, advertisement);
			}	
		}
		throw new AdNotFoundException();
	}
	
}
