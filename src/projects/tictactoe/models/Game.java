package projects.tictactoe.models;

import projects.tictactoe.exception.InvalidGameConstructionParametersException;
import projects.tictactoe.strategies.gameWinningStrategy.GameWinningStrategy;
import projects.tictactoe.strategies.gameWinningStrategy.OrderOneGameWinningStrategy;

import java.util.ArrayList;
import java.util.List;

public class Game {
    private Board board;
    private List<Player> players;
    private List<Move> moves;
    private GameStatus gameStatus;
    private int nextPlayerIndex;
    private GameWinningStrategy gameWinningStrategy;
    private Player winner;

    public void makeNextMove() {
        Player toMovePlayer = players.get(nextPlayerIndex);

        System.out.println("It is " + players.get(nextPlayerIndex).getName() + "'s turn.");

        Move move = toMovePlayer.decideMove(this.board);

        // validate move

        int row = move.getCell().getRow();
        int col = move.getCell().getCol();

        System.out.println("Move happened at: " +
                row + ", " + col + ".");

        board.getBoard().get(row).get(col).setCellState(CellState.FILLED);
        board.getBoard().get(row).get(col).setPlayer(players.get(nextPlayerIndex));

        Move finalMove = new Move(
                players.get(nextPlayerIndex),
                board.getBoard().get(row).get(col)
        );

        this.moves.add(finalMove);

        if (gameWinningStrategy.checkWinner(
                board, players.get(nextPlayerIndex), finalMove.getCell()
        )) {
            gameStatus = GameStatus.WIN;
            winner = players.get(nextPlayerIndex);
        }

        nextPlayerIndex += 1;
        nextPlayerIndex %= players.size();
    }

    public Player getWinner() {
        return winner;
    }

    public void setWinner(Player winner) {
        this.winner = winner;
    }

    public GameWinningStrategy getGameWinningStrategy() {
        return gameWinningStrategy;
    }

    public void setGameWinningStrategy(GameWinningStrategy gameWinningStrategy) {
        this.gameWinningStrategy = gameWinningStrategy;
    }

    private Game() {
    }

    public static Builder getBuilder() {
        return new Builder();
    }

    public void undo() {}

    public void displayBoard() {
        this.board.display();
    }

    public Board getBoard() {
        return board;
    }

    public void setBoard(Board board) {
        this.board = board;
    }

    public List<Player> getPlayers() {
        return players;
    }

    public void setPlayers(List<Player> players) {
        this.players = players;
    }

    public List<Move> getMoves() {
        return moves;
    }

    public void setMoves(List<Move> moves) {
        this.moves = moves;
    }

    public GameStatus getGameStatus() {
        return gameStatus;
    }

    public void setGameStatus(GameStatus gameStatus) {
        this.gameStatus = gameStatus;
    }

    public int getNextPlayerIndex() {
        return nextPlayerIndex;
    }

    public void setNextPlayerIndex(int nextPlayerIndex) {
        this.nextPlayerIndex = nextPlayerIndex;
    }

    public static class Builder {
        private int dimension;
        private List<Player> players;


        public Builder setDimension(int dimension) {
            this.dimension = dimension;
            return this;
        }


        public Builder setPlayers(List<Player> players) {
            this.players = players;
            return this;
        }

        private boolean valid() throws InvalidGameConstructionParametersException {
            if (this.dimension < 3) {
                throw new InvalidGameConstructionParametersException("Dimension of game can't be 1");
            }

            if (this.players.size() != this.dimension - 1) {
                throw new InvalidGameConstructionParametersException("Number of Players must be Dimension - 1");
            }

            //TODO : validate that no two players have same characters

            //TODO : validate only one player is of type BOT.

            return true;
        }

        public Game build() throws InvalidGameConstructionParametersException {
            try {
                valid();
            } catch (Exception e) {
                throw new InvalidGameConstructionParametersException(e.getMessage());
            }

            Game game = new Game();
            game.setGameStatus(GameStatus.IN_PROGRESS);
            game.setPlayers(players);
            game.setMoves(new ArrayList<>());
            game.setBoard(new Board(dimension));
            game.setNextPlayerIndex(0);
            game.setGameWinningStrategy(new OrderOneGameWinningStrategy(dimension));

            return game;
        }
    }
}
