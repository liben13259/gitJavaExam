package JDBCEntity;

public class language {
	private int languageId;
	private String name;
	public int getLanguageId() {
		return languageId;
	}
	public void setLanguageId(int languageId) {
		this.languageId = languageId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "language [languageId=" + languageId + ", name=" + name + "]";
	}
	
}
