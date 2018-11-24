package ch.stair.hackday.packhack.dto;

import ch.stair.hackday.packhack.dto.PublicPlayer;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "publicPlayers",
        "gameField"
})
public class GameState
{
    private static FieldTypes[][] gameField;
    private PublicPlayer[] publicPlayers;
    private int agentId;

    @JsonCreator
    public GameState(@JsonProperty("publicPlayers")PublicPlayer[] publicPlayers, @JsonProperty("gameField")FieldTypes[][] gameField, @JsonProperty("agent_id")int agentId){
        this.gameField = gameField;
        this.publicPlayers = publicPlayers;
        this.agentId = agentId;
    }

    public FieldTypes[][] getGameField ()
    {
        return gameField;
    }

    public void setGameField (FieldTypes[][] gameField)
    {
        this.gameField = gameField;
    }

    public PublicPlayer[] getPublicPlayers ()
    {
        return publicPlayers;
    }

    public void setPublicPlayers (PublicPlayer[] publicPlayers)
    {
        this.publicPlayers = publicPlayers;
    }

    public int getAgentId() {
        return agentId;
    }
    @Override
    public String toString()
    {
        return "ClassPojo [gameField = "+gameField+", publicPlayers = "+publicPlayers+"]";
    }

    public static String getEnemyPosition(){
        String enemyDescr = "FOOD";
        String enemyIn = null;
            FieldTypes[][] test = gameField;
            for(int i=0; i<test.length; i++) {
                for (int j = 0; j < test[i].length; j++) {
                    System.out.println (test[i][j].name ());
                    if(test[i][j].name ().equals (enemyDescr))
                        enemyIn = "x"+ i + "y"+j;
                }
            }
            return enemyIn;
    }

}