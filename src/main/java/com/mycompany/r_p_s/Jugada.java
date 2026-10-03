package com.mycompany.r_p_s;
public enum Jugada {
    Piedra, Papel, Tijera;
    public boolean vence(Jugada Rival){
        if (this == Piedra)
        { 
            return Rival == Tijera;
        }
    
        if (this == Papel)
        { 
            return Rival == Piedra;
        }
    
        if (this == Tijera)
        { 
            return Rival == Papel;
        }
    return false;
    }
}
