package miw.bowling;

import miw.exceptions.AdWithEmptyFieldsException;

public class Ad {

	private String title;
	private String description;
	private String objective;
	private byte[] image;

	public Ad(String title, String description, String objective, byte[] image) throws AdWithEmptyFieldsException {
		if (!isEmpyFields(title, description, objective)) {
			this.title = title;
			this.description = description;
			this.objective = objective;
			this.image = image;
		} else
			throw new AdWithEmptyFieldsException();
	}

	public Ad(String title, String description, String objective) throws AdWithEmptyFieldsException {
		this(title, description, objective, null);
	}

	public String getTitle() {
		return title;
	}

	public String getDescription() {
		return description;
	}

	public String getObjective() {
		return objective;
	}

	public byte[] getImage() {
		return image;
	}

	public boolean isEmpyFields(String title, String description, String objective) {
		return (title.trim().isEmpty() || description.trim().isEmpty() || objective.trim().isEmpty());
	}

	@Override
	public String toString() {
		return "Anuncio [title=" + getTitle() + ", description=" + getDescription() + ", objective=" + getObjective()
				+ "]";
	}
}
