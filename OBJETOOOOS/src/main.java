public static void main(String[] args) 
    {
        System.out.println("Bienvenido al mundo del Principito\n");
        Flor miFlor = new Flor(); // Instancia de la clase
        miFlor.setActitud("Vanidosa");
        miFlor.setApariencia("Hermosa");
        miFlor.setEstado("Sola");
        miFlor.setOrugas(0);

        Principito miPrincipito = new Principito(); // Nueva Instancia de la clase
        miPrincipito.setFlorprincipito(miFlor); // Asignar la flor al principito


        System.out.println("El principito tenía una flor que amaba mucho. Cuidaba de ella todos los días, la regaba y le quitaba las orugas\r\n" 
        + "La flor, aunque un poco " + miFlor.getActitud() + ", era muy " + miFlor.getApariencia() + " y agradecía al principito por su dedicación.\r\n" + 
        "Un día, el principito decidió explorar otros planetas y, aunque no quería dejar " + miFlor.getEstado() + " a su flor\r\n" + 
        "sabía que debía continuar su viaje para aprender más sobre el universo y sobre sí mismo.\r\n" + 
        "A pesar de la distancia, el principito siempre recordaba a su flor y la llevaba en su corazón\r\n" + 
        "demostrando que el amor verdadero trasciende cualquier obstáculo.\r\n");

        miPrincipito.ImprimirFlor(miPrincipito.getFlorprincipito()); // Imprimir los atributos de la flor del principito
        System.out.println("\nFin de la historia del Principito y su flor.\n");
    }