public class Player {

    public String name;

    private Die die;

    private Board board;

    private Piece piece;

    private Die[] dice;

    public void takeTurn(){
        int fv = 0;
        for(Die die:dice){
            die.roll();
        }
       Square oldLoc = piece.getLocation();
        Square newLoc = board.getSquare();
    }

}
