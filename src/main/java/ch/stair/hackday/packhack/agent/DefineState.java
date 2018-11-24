package ch.stair.hackday.packhack.agent;

import ch.stair.hackday.packhack.dto.GameState;
import ch.stair.hackday.packhack.dto.PublicPlayer;

public class DefineState {

    public boolean StatePacman = false;
    public boolean StateGhost = false;
    public boolean StateEatable = false;
    public final PublicPlayer[] OurPlayer;

    public DefineState(GameState gameState) {
        this.OurPlayer = gameState.getPublicPlayers();
    }
    /**
     * Detects whether we are Pacman or Ghost
     * @return State of our Playerobject
     */
    public void GetOurState() {
        ResetState();
        if(OurPlayer[0].getIsPacman())
        {
            System.out.println("PACMANAANANANAN!");
            //Bin Pacman
            this.StatePacman = true;
        } else {
            System.out.println("Swifty Ghost Boy");
            //Nicht klar ob Geist oder Eatable
            GetGhostOrEatable();
        }
    }

    public void GetGhostOrEatable() {
        if(OurPlayer[0].isWeakened()) {
            this.StateEatable = true;
        } else {
            this.StateGhost = true;
        }
    }

    public void ResetState() {
        this.StateGhost = false;
        this.StatePacman = false;
        this.StateEatable = false;
    }
}
