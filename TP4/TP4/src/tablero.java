public class tablero 
{
   private String tablero[][] = new String[8][8];
//----------------------------------------------------------------------------------------------------------
   public tablero ()
   {
      for (int i = 0; i < 8; i++) 
      {
         for (int j = 0; j < 8; j++) 
         {
            if ((i + j) % 2 == 0) 
            {
               tablero[i][j] = "blanco";
            } 
            else 
            {
               tablero[i][j] = "negro";
            }
         }
      }
   }
//----------------------------------------------------------------------------------------------------------
   // Constructor con parámetros: recibe la matriz de casilleros
   public tablero (String[][] tablero)
   {
      this.tablero = tablero;
   }
//----------------------------------------------------------------------------------------------------------
   // Imprime el tablero (útil para verificar que tiene 64 casilleros)
   public void imprimirTablero() 
   {
      for (int i = 0; i < tablero.length; i++) 
      {
         for (int j = 0; j < tablero[i].length; j++) 
         {
            System.out.print("[" + tablero[i][j].substring(0, 1).toUpperCase() + "] ");
         }
         System.out.println();
      }
      System.out.println("----------------------------------------------");
   }

//----------------------------------------------------------------------------------------------------------   
   public static void instanciarpiezas(piezas[] arreglo, String colorpieza, String nombreArreglo) 
   {
      switch (nombreArreglo) {
        case "peones":
            if (colorpieza.equals("blanco")) {
               for (int i = 0; i < arreglo.length; i++) 
               {
                  arreglo[i] = new peon("blanco", "lento", "agresivo", "ladino");
               }
            } else if (colorpieza.equals("negro")) {
               for (int i = 0; i < arreglo.length; i++) 
               {
                  arreglo[i] = new peon("negro", "lento", "agresivo", "ladino");
               }
            }  
            break;
        case "caballos":
            if (colorpieza.equals("blanco")) {
               for (int i = 0; i < arreglo.length; i++) 
               {
                  arreglo[i] = new caballo("blanco", "agil", "agresivo", "");
               }
            } else if (colorpieza.equals("negro")) {
               for (int i = 0; i < arreglo.length; i++) 
               {
                  arreglo[i] = new caballo("negro", "agil", "agresivo", "");
               }
            }  
            break;
        case "torres":
            if (colorpieza.equals("blanco")) {
               for (int i = 0; i < arreglo.length; i++) 
               {
                  arreglo[i] = new torre("blanco", "estable", "homerica", "directa");
               }
            } else if (colorpieza.equals("negro")) {
               for (int i = 0; i < arreglo.length; i++) 
               {
                  arreglo[i] = new torre("negro", "estable", "homerica", "directa");
               }
            }  
            break;
        case "alfiles":
            if (colorpieza.equals("blanco")) {
               for (int i = 0; i < arreglo.length; i++) 
               {
                  arreglo[i] = new alfil("blanco", "flexible", "sesgo", "oblicuo");
               }
            } else if (colorpieza.equals("negro")) {
               for (int i = 0; i < arreglo.length; i++) 
               {
                  arreglo[i] = new alfil("negro", "flexible", "sesgo", "oblicuo");
               }
            }  
            break;
        case "reys":
            if (colorpieza.equals("blanco")) {
               for (int i = 0; i < arreglo.length; i++) 
               {
                  arreglo[i] = new rey("blanco", "estable", "postrero", "tenue");
               }
            } else if (colorpieza.equals("negro")) {
               for (int i = 0; i < arreglo.length; i++) 
               {
                  arreglo[i] = new rey("negro", "estable", "postrero", "tenue");
               }
            }  
            break;
        case "reinas":
            if (colorpieza.equals("blanco")) {
               for (int i = 0; i < arreglo.length; i++) 
               {
                  arreglo[i] = new reina("blanco", "flexible", "encarnizada", "");
               }
            } else if (colorpieza.equals("negro")) {
               for (int i = 0; i < arreglo.length; i++) 
               {
                  arreglo[i] = new reina("negro", "flexible", "encarnizada", "");
               }
            }  
            break;
        default:
            System.out.println("Nombre de arreglo no reconocido.");
            break;
      }
   }
}