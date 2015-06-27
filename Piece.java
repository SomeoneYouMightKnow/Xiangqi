public class Piece{

    //variables
    private final String color; //black (0) or red (1)
    private boolean alive; //whether or not a piece has been captured
 
    //constructors
    public Piece(String s){//takes color as a parameter
	color = s;
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
