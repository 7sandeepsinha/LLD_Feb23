package projects.tictactoe.strategies.gameWinningStrategy;

import projects.tictactoe.models.Board;
import projects.tictactoe.models.Cell;
import projects.tictactoe.models.Player;

public class OrderOneGameWinningStrategy implements GameWinningStrategy{
    private int boardDimensions;

    public OrderOneGameWinningStrategy(int boardDimensions) {
        this.boardDimensions = boardDimensions;
    }

    @Override
    public boolean checkWinner(Board board, Player lastPlayedPlayer, Cell lastPlayedMoveCell) {
        //TODO : implement this
        return false;
    }
}
