package ch.stair.hackday.packhack.agent;

import ch.stair.hackday.packhack.dto.Direction;
import ch.stair.hackday.packhack.dto.FieldTypes;
import ch.stair.hackday.packhack.dto.GameState;
import ch.stair.hackday.packhack.dto.PublicPlayer;

public class Pacman implements Agent {

    public Movement test = new Movement();
    @Override
    public String getAgentInformation() {
        //TODO: Implement the Information for your agent here.
        String MyAgentName = "Sboon";
        return MyAgentName;
    }

    @Override
    public Direction chooseAction(GameState gameField) {
        //TODO: Implement the Agentlogic in here
        float randomBetween0AndSize = (float)Math.random() * (Direction.values().length-1);
        int randomIndex = Math.round(randomBetween0AndSize);
        return test.MoveThatBoyo(gameField);
    }


}
