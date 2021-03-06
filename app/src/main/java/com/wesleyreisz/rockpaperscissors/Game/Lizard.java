package com.wesleyreisz.rockpaperscissors.Game;

import com.wesleyreisz.rockpaperscissors.GameUtils;
import com.wesleyreisz.rockpaperscissors.R;

/**
 * Created by spencerkerber on 9/26/15.
 */
public class Lizard implements GameType {

    @Override
    public String eval(Integer opponentChoice) {
        if (opponentChoice== R.id.btnPaper){
            return GameUtils.BEATS;
        }else if(opponentChoice==R.id.btnSpock){
            return GameUtils.BEATS;
        }else if(opponentChoice==R.id.btnRock){
            return GameUtils.LOSES_TO;
        }else if(opponentChoice==R.id.btnScissors){
            return GameUtils.LOSES_TO;
        }else {
            return GameUtils.TIES;
        }

    }
}
