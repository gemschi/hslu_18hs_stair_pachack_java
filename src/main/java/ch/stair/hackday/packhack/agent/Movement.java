package ch.stair.hackday.packhack.agent;

import ch.stair.hackday.packhack.dto.Direction;
import ch.stair.hackday.packhack.dto.GameState;

public class Movement {

    float saveX=1;
    float saveY= 1;
    int counter = 0;

    public Direction MoveThatBoyo(GameState gameField) {

        counter++;

        if(counter % 2 == 0) {
            if(saveX != 1 && saveY != 16){
                return Direction.SOUTH;
            } else {
                return Direction.WEST;
            }
        } else {
            if(saveX != 30 && saveY != 1){
                return Direction.NORTH;
            } else {
                return Direction.EAST;
            }
        }



    }

    public float GetCurrentXPosition(GameState gameState) {
        float currentX = gameState.getPublicPlayers()[0].getPosition()[0];
        return currentX;
    }

    public float GetCurrentYPosition(GameState gameState) {
        float currentY = gameState.getPublicPlayers()[0].getPosition()[1];
        return currentY;
    }
}
