

public class Background{

	private int xcord,ycord;
	public Background(int x, int y){
		this.xcord= x;
		this.ycord=y;
}

	public int getX(){
		return this.xcord;
	}
	public int getY(){
		return this.ycord;
	}
	public void shiftX(){
		this.xcord=xcord-10;
	}
}