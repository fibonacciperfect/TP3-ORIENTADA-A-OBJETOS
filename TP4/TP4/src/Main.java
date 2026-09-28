public class Main 
{
    public static void main(String[] args) 
    {
//----------------------------------------------------------------------------------------------------------
//instanciacion de piezas
        tablero miTablero = new tablero();
        peon [] peonblanco = new peon[8];
        peon [] peonnegro = new peon[8];
        caballo [] caballoblanco = new caballo[2];
        caballo [] caballonegro = new caballo[2];
        torre [] torreblanca = new torre[2];
        torre [] torrenegra = new torre[2];
        alfil [] alfilblanco = new alfil[2];
        alfil [] alfilnegro = new alfil[2];
        rey [] reyblanco = new rey[1];
        rey [] reynegro = new rey[1];
        reina [] reinablanca = new reina[1];
        reina [] reinanegra = new reina[1];
        tablero.instanciarpiezas(peonblanco, "blanco", "peones");
        tablero.instanciarpiezas(peonnegro, "negro", "peones");
        tablero.instanciarpiezas(caballoblanco, "blanco", "caballos");
        tablero.instanciarpiezas(caballonegro, "negro", "caballos");
        tablero.instanciarpiezas(torreblanca, "blanco", "torres");
        tablero.instanciarpiezas(torrenegra, "negro", "torres");
        tablero.instanciarpiezas(alfilblanco, "blanco", "alfiles");
        tablero.instanciarpiezas(alfilnegro, "negro", "alfiles");
        tablero.instanciarpiezas(reyblanco, "blanco", "reys");
        tablero.instanciarpiezas(reynegro, "negro", "reys");
        tablero.instanciarpiezas(reinablanca, "blanco", "reinas");
        tablero.instanciarpiezas(reinanegra, "negro", "reinas");
// fin de instanciacion de piezas
//----------------------------------------------------------------------------------------------------------
//impresion de piezas
        piezas.imprimirPiezas(peonblanco);
        piezas.imprimirPiezas(peonnegro);
        piezas.imprimirPiezas(caballoblanco);
        piezas.imprimirPiezas(caballonegro);
        piezas.imprimirPiezas(torreblanca);
        piezas.imprimirPiezas(torrenegra);
        piezas.imprimirPiezas(alfilblanco);
        piezas.imprimirPiezas(alfilnegro);
        piezas.imprimirPiezas(reyblanco);
        piezas.imprimirPiezas(reynegro);
        piezas.imprimirPiezas(reinablanca);
        piezas.imprimirPiezas(reinanegra);
        miTablero.imprimirTablero();
// fin de impresion de piezas
/*
        for (int i = 0; i <=7; i++) 
            {
                peonblanco[i] = new peon("blanco", "lento", "agresivo", "ladino");
                peonnegro[i] = new peon("negro", "lento", "agresivo", "ladino");
            } 
        
        for (int i = 0; i < 2; i++) 
            {
                caballoblanco[i] = new caballo("blanco", "agil", "agresivo", "");
                caballonegro[i] = new caballo("negro", "agil", "ligero", "");
            }

        for (int i = 0; i <2 ; i++) 
            {
                torreblanca[i] = new torre("blanca", "estable", "homerica", "directa");
                torrenegra[i] = new torre("negra", "estable", "homerica", "directa");
            }

        for (int i = 0; i < 2; i++) 
            {
                alfilblanco[i] = new alfil("blanco", "flexible", "sesgo", "oblicuo");
                alfilnegro[i] = new alfil("negro", "flexible", "sesgo", "oblicuo");
            }

        for (int i = 0; i < 1; i++) 
            {
                reyblanco[i] = new rey("blanco", "estable", "postrero", "tenue");
                reynegro[i] = new rey("negro", "estable", "postrero", "tenue");
            }
        
        for (int i = 0; i < 1; i++) 
            {
                reinablanca[i] = new reina("blanca", "flexible", "encarnizada", "");
                reinanegra[i] = new reina("negra", "flexible", "encarnizada", "");
            }

        for (peon p : peonblanco)
        {
            System.out.println("Peon "+ cont +"\n");

            System.out.println("el color de mi peon es"+ p.getColor());
            System.out.println(p.getMovimiento());
            System.out.println(p.getVelocidad());
            System.out.println(p.getComportamiento());
            System.out.println("----------------------------------------------");
            cont++;
        }
//*/
    }
}