package JDBCEntity;

public class FilmLanguage {
	private int filmId;
	private String title;
	private String description;
	private int languageId;
	private String name;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getFilmId() {
		return filmId;
	}
	public void setFilmId(int filmId) {
		this.filmId = filmId;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public int getLanguageId() {
		return languageId;
	}
	public void setLanguageId(int languageId) {
		this.languageId = languageId;
	}
	@Override
	public String toString() {
		return "FilmLanguage [filmId=" + filmId + ", title=" + title + ", description=" + description + ", languageId="
				+ languageId + ", name=" + name + "]";
	}
	
}
