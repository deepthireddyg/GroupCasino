package com.github.zipcodewilmington.casino.games.numberguess;

import com.github.zipcodewilmington.casino.CasinoAccount;
import com.github.zipcodewilmington.casino.CasinoAccountManager;
import com.github.zipcodewilmington.casino.PlayerInterface;
import com.github.zipcodewilmington.utils.AnsiColor;
import com.github.zipcodewilmington.utils.IOConsole;

/**
 * Created by leon on 7/21/2020.
 */
public class NumberGuessPlayer implements PlayerInterface {
    private final IOConsole console = new IOConsole(AnsiColor.PURPLE);
    private String _numGuessPlayerName;
    private String _numGuessPlayerPassword;
    private int _numGuessPlayerBalance;

    public String get_numGuessPlayerName() {
        return _numGuessPlayerName;
    }

    public void set_numGuessPlayerName(String _numGuessPlayerName) {
        this._numGuessPlayerName = _numGuessPlayerName;
    }

    public String get_numGuessPlayerPassword() {
        return _numGuessPlayerPassword;
    }

    public void set_numGuessPlayerPassword(String _numGuessPlayerPassword) {
        this._numGuessPlayerPassword = _numGuessPlayerPassword;
    }

    public int get_numGuessPlayerBalance() {
        return _numGuessPlayerBalance;
    }

    public void set_numGuessPlayerBalance(int _numGuessPlayerBalance) {
        this._numGuessPlayerBalance = _numGuessPlayerBalance;
    }

    public NumberGuessPlayer() {
        CasinoAccount objNumberGuessPlayer=getArcadeAccount();
        this._numGuessPlayerName=objNumberGuessPlayer.get_name();
        this._numGuessPlayerPassword=objNumberGuessPlayer.get_password();
        this._numGuessPlayerBalance=objNumberGuessPlayer.get_balance();
    }

    @Override
    public CasinoAccount getArcadeAccount() {
        String name=console.getStringInput("Hello NumberGuess player! It Costs $1 to play Each attempt for NumberGuessGame. Please enter your name ");
        String password=console.getStringInput("Please enter your password ");
        CasinoAccountManager objmgr=new CasinoAccountManager();
        CasinoAccount objNumberPlayer = objmgr.getAccount(name,password);
       // CasinoAccount ObjCasinoAccount=new CasinoAccount(name,password);
        return objNumberPlayer;
    }

    @Override
    public <SomeReturnType> SomeReturnType play() {
        return null;
    }
}