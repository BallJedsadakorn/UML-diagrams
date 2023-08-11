public class MGame {
    private  int roundCnt;
    private Player[] players;

    private static final int N = 10;
    public void playGame(){

        for (roundCnt = 0 ; roundCnt < N ; roundCnt++ ){
            playRound();
        }
    }

    private void playRound(){

        for (Player player : players){
            player.takeTurn();
        }
    }
}