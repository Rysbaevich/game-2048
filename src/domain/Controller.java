package domain;

public class Controller {

    private GameService gameService;

    public Controller() {
        gameService = new GameService();
    }

    public void doAction(Direction direction) {
        switch (direction) {
            case MOVE_LEFT:
                gameService.moveLeft();
                break;
            case MOVE_UP:
                gameService.moveUp();
                break;
            case MOVE_DOWN:
                gameService.moveDown();
                break;
            case MOVE_RIGHT:
                gameService.moveRight();
                break;
            case PRINT:
                gameService.print();
                break;
        }
    }

    public GameField getGameField() {
        return gameService.getGameField();
    }

}
