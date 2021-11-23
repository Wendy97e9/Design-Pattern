package bridge3D;

public abstract class OperationSystem {
	
	protected Language language = null;
	
	protected Format format = null;
	
	public abstract void write();

	public Language getLanguage() {
		return language;
	}

	public void setLanguage(Language language) {
		this.language = language;
	}

	public Format getFormat() {
		return format;
	}

	public void setFormat(Format format) {
		this.format = format;
	}
}
