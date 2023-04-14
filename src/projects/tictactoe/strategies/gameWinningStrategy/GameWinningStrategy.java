package projects.tictactoe.strategies.gameWinningStrategy;

import projects.tictactoe.models.Board;
import projects.tictactoe.models.Cell;
import projects.tictactoe.models.Player;

public interface GameWinningStrategy {
    boolean checkWinner(Board board, Player lastPlayedPlayer, Cell lastPlayedMoveCell);
}
