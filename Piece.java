public class Piece{

    //variables
    private final int color; //black (0) or red (1)
    private boolean alive; //whether or not a piece has been captured
    private String[] moves; //array containing strings of possible legal moves for that piece
    
    //constructors
    public Piece(String s){//takes color as a parameter
	if (s == "black") {
		color = 0;
	} else if (s == "red") {
		color = 1;
	} else {
		System.out.println("invalid color");
	}
	alive = true;
    }

    //action methods

    public void kill(Piece p){
	p.setAlive(false);
    }

    //check methods
    /*public void checkMoves(){

      }*/

    //set methods
    public void setAlive(boolean a){
	alive = a;
    }

    //get methods
    public String getColor(){
	return color;
    }
    public boolean isInPlay(){
	return alive;
    }

}
