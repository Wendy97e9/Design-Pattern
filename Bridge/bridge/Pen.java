package bridge;

public abstract class Pen {
	
	protected Color color = null;
	
	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}

	public abstract void draw(String name);

}
