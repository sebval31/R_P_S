package com.mycompany.r_p_s;

public class Partida {

    private int winj1, winj2;

    public void jugarRonda(Jugada j1, Jugada j2) {
        if (j1.vence(j2)) {
            winj1++;
        } else if (j2.vence(j1)) {
            winj2++;
        }
    }

    public int getWinj1() {
        return winj1;
    }

    public int getWinj2() {
        return winj2;
    }

    public String obtenerGanador() {
        if (winj1 > winj2) {
            return "Player 1";
        } else if (winj2 > winj1) {
            return "Player 2";
        } else {
            return "Tie";
        }
    }
}
