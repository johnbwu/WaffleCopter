
public class Wall {
	private int height = 200;
	private int width = 50;
	private int xcord,ycord;
	public Wall(int x, int y){
		this.xcord= x;
		this.ycord=y;
}
	public int getHeight(){
		return this.height;
	}
	public int getWidth(){
		return this.width;
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
