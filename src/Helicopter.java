
public class Helicopter {
	private int xcord,ycord;
	public Helicopter(int x, int y){
		this.xcord= x;
		this.ycord=y;
}
	public int getX(){
		return this.xcord;
	}
	public int getY(){
		return this.ycord;
	}
	public void shiftYUp(){
		this.ycord=ycord+6;
	}
	public void shiftYDown(int shiftValue){
		this.ycord=ycord-shiftValue;
	}
	public void reset(){
		this.ycord= 300;
		this.xcord = 100;
	}
}
