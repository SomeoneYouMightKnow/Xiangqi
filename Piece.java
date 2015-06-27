public class Piece{

    //variables
    private final String color; //black or red
    private boolean alive; //whether or not a piece has been captured
    private String[] moves; //array containing strings of possible legal moves for that piece
    
    //constructors
    public Piece(String s){//takes color as a parameter
	if (s == "black" || s == "red") {
		color = s;
	} else {
		System.out.println("invalid color");
	}
	alive = true;
    }

    //action methods

    public void kill(Piece p){
	p.setAlive(false);
    }

    //get methods
    public String getColor(){
	return color;
    }
    public boolean isInPlay(){
	return alive;
    }

}
