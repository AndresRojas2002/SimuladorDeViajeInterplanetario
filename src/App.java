import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class App {

    public static void main(String[] args) throws Exception {

        System.out.println("/n BIENVENIDO AL SIMULADOR DE VIAJE INTERPLANETARIO /n");

        do {

            menuMain();

            option = sc.nextInt();
            System.out.println("\n");
            switch (option) {
                case 1:
                    planets();
                    enterContinue();
                    break;

                case 2:
                    spaceShip();
                    enterContinue();
                    sc.nextLine();
                    break;

                case 3:
                    dataTrip();
                    enterContinue();
                    break;
                    
                case 4:
                    if (selectedPlanet == null || selectedShip == null) {
                        System.out.println(
                                "Por favor, selecciona un planeta y una nave antes de iniciar la simulación del viaje.\n");
                    } else {
                        simulateJourney();
                        System.out.println("Deseas iniciar otro simulador\n ");
                        closeCase();
                    }
                    break;

                case 5:
                    System.out.println("Programa terminado \"Gracias por utilizar el simulador\" ");
                    System.exit(0);
                    break;

                default:
                    System.out.println("Opción no válida \n ");
                    break;
            }

        } while (option != 5);

        sc.close();

    }

    private static void dataTrip() {
        System.out.println("* Planeta seleccionado: " + selectedPlanet);
        System.out.println("* Nave seleccionada: " + selectedShip);
        System.out.println("* Personas seleccionadas: " + passengers);

        travelTime();

        System.out.printf("* El tiempo estimado de viaje es de: %.1f horas\n", time);

        double oxygenNeeded = calculateOxygen(time, passengers);
        System.out.printf("* La cantidad de oxígeno necesario para el viaje es: %.1f litros\n",
                oxygenNeeded);
        double fuelNeeded = calculateFuel(distancePlanet);

        System.out.printf("* La cantidad de combustible necesario para el viaje es: %.1f litros\n",
                fuelNeeded);

        System.out.println("\n ");
        sc.nextLine();
        enterContinue();
    }

    private static void menu() { // Menú principal

        System.out.println("------ Menu Principal ------ \n");
        System.out.println("1. Selecciona un planeta");
        System.out.println("2. Selecciona una nave espacial");
        System.out.println("3. Datos a tener en cuenta del viaje ");
        System.out.println("4. Iniciar simulación de viaje  ");
        System.out.println("5. Salir");
        System.out.println("----------------------------");
        System.out.print("\nPor favor, selecciona una opción del menú: ");
    }

    static Scanner sc = new Scanner(System.in);

    static double distancePlanet; // distancia del planeta
    static String selectedPlanet; // seleccion de planeta

    static String[] planet = { "Mercurio", "Venus", "Marte", "Júpiter", "Saturno", "Urano", "Neptuno", "Luna" };
    static double[] distance = { 46, 38, 56, 630, 1.200, 2.500, 4.000, 356.400 }; // array de distacias
    static int option;

    private static void planets() { // planetas

        System.out.println("--PLANETAS-- \n");
        for (int i = 0; i < planet.length; i++) {
            System.out.println((i + 1) + ". " + planet[i]);

        }
        System.out.println(" ");
        System.out.print("Elige una opción: ");
        option = sc.nextInt();

        sc.nextLine();

        switch (option) {

            case 1:
                selectedPlanet = planet[0];
                System.out.println("----------------------Planeta " + planet[0] + " --------------------------\n");
                System.out.println("* Es el planeta más cercano al Sol y el más pequeño del sistema solar.");
                System.out.println(
                        "* No tiene atmósfera significativa, lo que provoca grandes variaciones de temperatura.");
                System.out.println("* Su superficie está cubierta de cráteres similares a los de la Luna.");
                System.out.println("* Un día en Mercurio dura más que su año.");
                System.out.printf("\n* Distancia mínima desde la Tierra: %.3f millones de km\n", distance[0]);
                distancePlanet = distance[0] * 1000000;
                System.out.println(" ");
                break;
            case 2:
                selectedPlanet = planet[1];
                System.out.println("----------------------Planeta " + planet[1] + " --------------------------\n");
                System.out.println("* Similar en tamaño y composición a la Tierra, pero con condiciones extremas.");
                System.out.println("* Tiene una atmósfera densa compuesta principalmente de dióxido de carbono.");
                System.out.println("* La presión atmosférica en la superficie es 92 veces la de la Tierra.");
                System.out.println("* Su superficie está cubierta de volcanes y montañas.");
                System.out.printf("* La temperatura media es de 467 grados Celsius.");
                System.out.printf("\n* Distancia mínima desde la Tierra: %.3f millones de km\n", distance[1]);
                distancePlanet = distance[1] * 1000000;
                System.out.println(" ");
                break;
            case 3:
                selectedPlanet = planet[2];
                System.out.println("----------------------Planeta " + planet[2] + " --------------------------\n");
                System.out.println("* Tiene la mitad del tamaño de la Tierra");
                System.out.println("* Es de color rojo \"Debido al hierro oxidado de su suelo\" ");
                System.out.println("* La presión atmosférica es aproximadamente 1% al de la Tierra (610)");
                System.out.println("* Tiene estaciones del año, volcanes, cañones, y tiempo meteorológico ");
                System.out.printf("\n* La distancia mínima desde la tierra %.3f millones de km\n", distance[2]);
                System.out.println("--------------------------------------------------------------------------");
                distancePlanet = distance[2] * 1000000;
                System.out.println(" ");
                break;

            case 4:
                selectedPlanet = planet[3];
                System.out.println("----------------------Planeta " + planet[3] + " --------------------------\n");
                System.out.println("* Mayor planeta del sistema solar");
                System.out.println(
                        "* Es un gigante gaseoso y no está claro si en el fondo tiene un núcleo central de material sólido");
                System.out.println("* Tiene anillos, pero son demasiado tenues para verlos con claridad ");
                System.out.println(
                        "* La presión atmosférica promedio es 100.000 veces mayor que la de la Tierra. (100.000.000)");
                System.out.println("* La atmósfera  esta compuesta principalmente de hidrógeno y helio");
                System.out.printf("\n* La distancia mínima desde la tierra es de %.3f millones de km\n", distance[3]);
                System.out.println("--------------------------------------------------------------------------");
                distancePlanet = distance[3] * 1000000;
                ;
                System.out.println(" ");
                break;

            case 5:
                selectedPlanet = planet[4];
                System.out.println("----------------------Planeta " + planet[4] + " --------------------------\n");
                System.out.println("* Es el segundo planeta mas grande del sistema solar");
                System.out.println("* Es de color amarillo claro debido a nubes de gas");
                System.out.println("* Cuenta con un precioso grupo de 7 anillos separados por espacio entre ellos");
                System.out
                        .println("* La presión atmosférica promedio es 140 veces mayor que la de la Tierra (140.000)");
                System.out.println("* La atmósfera  esta compuesta principalmente de hidrógeno y helio");
                System.out.printf("\n* La distancia mínima desde la tierra es de %.3f millones de km\n", distance[4]);
                System.out.println("--------------------------------------------------------------------------");
                distancePlanet = distance[4] * 1000000;
                System.out.println(" ");
                break;

            case 6:
                selectedPlanet = planet[5];
                System.out.println("----------------------Planeta " + planet[5] + " --------------------------\n");
                System.out.println(
                        "* Tiene un eje de rotación extremadamente inclinado, lo que significa que gira de lado.");
                System.out.println("* Es conocido por su color azul debido al metano en su atmósfera.");
                System.out.println("* Compuesto principalmente de hidrógeno, helio y metano.");
                System.out.println("* Tiene un sistema de anillos tenues y 27 lunas conocidas.");
                System.out.printf("\n* Distancia mínima desde la Tierra: %.3f millones de km\n", distance[5]);
                distancePlanet = distance[5] * 1000000;
                System.out.println(" ");
                break;

            case 7:
                selectedPlanet = planet[6];
                System.out.println("----------------------Planeta " + planet[6] + " --------------------------\n");
                System.out.println("* Es el octavo planeta desde el Sol y uno de los gigantes gaseosos.");
                System.out.println("* Su color azul es debido al metano en su atmósfera.");
                System.out.println(
                        "* Tiene los vientos más fuertes del sistema solar, con velocidades de hasta 2.100 km/h.");
                System.out.println("* Cuenta con 14 lunas, siendo Tritón la más grande y geológicamente activa.");
                System.out.println("* Posee un sistema de anillos tenues.");
                System.out.printf("\n* Distancia mínima desde la Tierra: %.3f millones de km\n", distance[6]);
                distancePlanet = distance[6] * 1000000;
                System.out.println(" ");
                break;

            case 8:
                selectedPlanet = planet[7];
                System.out.println("Seleccionaste el satélite natural de la Tierra \n");
                System.out.println("------------------------- " + planet[7] + " --------------------------\n");
                System.out.println("* Es de color gris claro \"Debido a su superficie rocosa y polvorienta\" ");
                System.out.println("* La presión atmosférica promedio es 10^-7 (10 a la menos 7 )");
                System.out.println("* Órbita alrededor de la Tierra y no tiene una atmósfera");
                System.out.printf("\n* La distancia mínima desde la tierra %.3f  de km\n", distance[7]);
                System.out.println("--------------------------------------------------------------------------");
                distancePlanet = distance[7] * 1000000;
                System.out.println(" ");
                break;

            default:
                System.out.println("Selección incorrecta\n");

                System.out.println("Por favor, digite otra opción\n ");
                planets();
                break;

        }

        System.out.println(" ");

    }

    static String[] ships = { "SpaceX Starship", "NASA Orion", "SpaceX Dragon", "Lanzadera Espacial" };
    static int[] people = { 100, 4, 7, 8 }; // array de personas
    static double[] speed = { 200.000, 40.000, 27.000, 28.000 }; // array de velocidad

    static String selectedShip; // seleccion de nave
    static double speedShip; // velocidad de la nave
    static int passengers; // pasageros seleccionados

    private static void spaceShip() { // naves espaciales

        System.out.println("Lista de naves disponibles :");
        for (int i = 0; i < ships.length; i++) {
            System.out.println((i + 1) + ". " + ships[i]);

        }
        System.out.print("Selecciona la nave con la que deseas hacer el viaje:");
        int seleccion = sc.nextInt();
        System.out.println(" ");

        int maxPeople;
        switch (seleccion) {
            case 1:
                selectedShip = ships[0];
                maxPeople = people[0];
                System.out.println(" Has seleccionado la nave /n");
                System.out.println("----------------" + ships[0] + " ----------------");
                System.out.println("* Cuenta con una capacidad maxima de " + people[0] + " personas ");
                System.out.printf("* Velocidad maxima de la nave %.3f km/h\n", speed[0]);
                speedShip = speed[0];
                System.out.println(" ");
                break;
            case 2:
                selectedShip = ships[1];
                maxPeople = people[1];
                System.out.println(" Has seleccionado la nave /n");
                System.out.println("----------------" + ships[1] + " ----------------");
                System.out.println("* Cuenta con una capacidad maxima de " + people[1] + " personas ");
                System.out.printf("* Velocidad maxima de la nave %.3f km/h\n", speed[1]);
                speedShip = speed[1];
                System.out.println(" ");

                break;
            case 3:
                selectedShip = ships[2];
                maxPeople = people[2];
                System.out.println(" Has seleccionado la nave /n");
                System.out.println("----------------" + ships[2] + " ----------------");
                System.out.println("* Cuenta con una capacidad maxima de " + people[2] + " personas ");
                System.out.printf("* Velocidad maxima de la nave %.3f km/h\n", speed[2]);
                speedShip = speed[2];
                System.out.println(" ");

                break;
            case 4:
                selectedShip = ships[3];
                maxPeople = people[3];
                System.out.println(" Has seleccionado la nave /n");
                System.out.println("----------------" + ships[3] + " ----------------");
                System.out.println("* Cuenta con una capacidad maxima de " + people[3] + " personas ");
                System.out.printf("* Velocidad maxima de la nave %.3f km/h\n", speed[3]);
                speedShip = speed[3];
                System.out.println(" ");

                break;

            default:
                System.out.println("Selección incorrecta");
                System.out.println("por favor seleccionea una opcion de la lista : ");
                return;

        }

        numberPassengers(maxPeople);
        System.out.println("Número de pasajeros confirmados: " + passengers);
        System.out.println(" ");

    }

    static double time;

    private static void travelTime() { // tiempo de viaje
        time = distancePlanet / speedShip;

    }

    private static void closeCase() {
        System.out.println("1. Continuar con el simulador ");
        System.out.println("2. Salir del simulador");
        System.out.println("-----------------------");
        System.out.print("\nSeleccione una opción: \n ");
        option = sc.nextInt();
        if (option == 2) {
            System.out.println("Simulación cancelada.");
            System.exit(0);
        } else if (option != 1) {
            System.out.println("Opción no válida.");
            closeCase();
        }

    }

    private static void enterContinue() { // enter para continuar

        System.out.println("Presiona 'Enter' para continuar...");
        sc.nextLine();

    }

    private static void numberPassengers(int maxPeople) { // numero de pasageros
        System.out.print("Por favor indique la cantidad de pasageros (maximo " + maxPeople + " personas ): ");
        passengers = sc.nextInt();

        while (passengers > maxPeople || passengers <= 0) {
            System.out.print("Número de pasajeros inválido. Por favor ingrese un número entre 1 y " + maxPeople + ": ");
            passengers = sc.nextInt();
        }
    }

    private static double calculateOxygen(double time, int passengers) { // cacular oxigeno
        final double oxygenHour = 1.0;
        return time * passengers * oxygenHour;

    }

    private static double calculateFuel(double distance) { // calcular combustible
        final double litersKm = 0.05;
        return distance * litersKm;
    }

    private static Random random = new Random();
    static List<String> anomalyLog = new ArrayList<>(); // listas para registrar las anomalias
    private static int totalFuelLost = 0; // total combustible perdido
    private static int totalOxygenLost = 0;// total de oxigeno perdido
    private static int totalTimeDelay = 0; // total de tiempo retrasado
    private static String[] anomalies = { "Meteoritos en la ruta", "Fallo en el sistema de navegación",
            "Pérdida de comunicación temporal", "Desviación de trayectoria", "Problemas en el suministro de oxígeno" };// array
                                                                                                                       // de
                                                                                                                       // anomalias

    private static void simulateJourney() {// simular viaje
        int[] progress = new int[100];
        initializeProgress(progress);
        System.out.println("Iniciando el viaje...\n");
        for (int i = 0; i < progress.length; i++) {
            System.out.print("\rProgreso del viaje: " + progress[i] + " % ");
            if (random.nextInt(100) < 3) {
                handleAnomaly();
            }
            for (long j = 0; j < 300000000L; j++)
                ;
        }
        tripSummary();
    }

    private static void initializeProgress(int[] progress) {// inicializar progreso

        for (int i = 0; i < 100; i++) {
            progress[i] = i + 1;
        }
    }

    private static void handleAnomaly() {// manejar anomalias
        int anomalyIndex = random.nextInt(anomalies.length);
        String anomalyMessage = anomalies[anomalyIndex] + "!";
        System.out.print(anomalyMessage);
        System.out.println("\nSeleccione la acción para resolver la anomalía:\n");
        switch (anomalyIndex) {
            case 0:
                System.out.println("1. Realizar maniobra evasiva (consume más combustible)");
                System.out.println("2. Continuar el viaje con la anomalía");
                break;
            case 1:
                System.out.println("1. Reparar el sistema de navegación");
                System.out.println("2. Continuar el viaje con la anomalía");
                break;
            case 2:
                System.out.println("1. Restablecer la comunicación manualmente");
                System.out.println("2. Continuar el viaje con la anomalía");
                break;
            case 3:
                System.out.println("1. Corregir la trayectoria manualmente");
                System.out.println("2. Continuar el viaje con la anomalía");
                break;
            case 4:
                System.out.println("1. Reparar el sistema de suministro de oxígeno");
                System.out.println("2. Continuar el viaje con la anomalía");
                break;
            default:
                System.out.println("Opción no válida.");
                break;
        }
        int action = sc.nextInt();
        switch (anomalyIndex) {
            case 0:
                if (action == 1) {
                    int fuelLost = random.nextInt(20) + 10;
                    totalFuelLost += fuelLost;
                    System.out
                            .println("Maniobra evasiva exitosa. Combustible extra consumido: " + fuelLost
                                    + " litros.\n");
                } else if (action == 2) {
                    int outcome = random.nextInt(2);
                    if (outcome == 0) {
                        System.out.println("Menores daños a la nave.\n");
                    } else {
                        System.out.println("Daño evitado por suerte!\n");
                    }
                } else {
                    System.out.println("Acción no válida. La anomalía no se pudo resolver correctamente.\n");
                }
                break;
            case 1:
                if (action == 1) {
                    int delay = random.nextInt(2) + 1;
                    totalTimeDelay += delay;
                    System.out.println("Acción ejecutada: Reparar el sistema de navegación. Retraso de llegada: "
                            + delay + " horas.\n");
                } else if (action == 2) {
                    int delay = random.nextInt(2) + 1;
                    totalTimeDelay += delay;
                    System.out
                            .println("Continuar el viaje con la anomalía: Retraso de llegada: " + delay + " horas.\n");
                } else {
                    System.out.println("Acción no válida. La anomalía no se pudo resolver correctamente.\n");
                }
                break;
            case 2:
                if (action == 1) {
                    int delay = 30;
                    totalTimeDelay += delay / 60;
                    System.out.println("Acción ejecutada: Restablecer la comunicación manualmente. Retraso de llegada: "
                            + delay + " minutos.\n");
                } else if (action == 2) {
                    int oxygenLost = random.nextInt(10) + 5;
                    totalOxygenLost += oxygenLost;
                    System.out.println(
                            "Continuar el viaje con la anomalía: Oxígeno extra consumido: " + oxygenLost
                                    + " litros.\n");
                } else {
                    System.out.println("Acción no válida. La anomalía no se pudo resolver correctamente.\n");
                }
                break;
            case 3:
                if (action == 1) {
                    int fuelLost = random.nextInt(20) + 10;
                    totalFuelLost += fuelLost;
                    System.out.println(
                            "Acción ejecutada: Corregir la trayectoria manualmente. Combustible extra consumido: "
                                    + fuelLost + " litros.\n");
                } else if (action == 2) {
                    int delay = 1;
                    totalTimeDelay += delay;
                    System.out.println("Continuar el viaje con la anomalía: Retraso de llegada: " + delay + " hora.\n");
                } else {
                    System.out.println("Acción no válida. La anomalía no se pudo resolver correctamente.\n");
                }
                break;
            case 4:
                if (action == 1) {
                    int oxygenLost = random.nextInt(30) + 20;
                    totalOxygenLost += oxygenLost;
                    System.out.println(
                            "Acción ejecutada: Reparar el sistema de suministro de oxígeno. Oxígeno extra consumido: "
                                    + oxygenLost + " litros.\n");
                } else if (action == 2) {
                    int oxygenLost = random.nextInt(20) + 10;
                    totalOxygenLost += oxygenLost;
                    System.out.println(
                            "Continuar el viaje con la anomalía: Oxígeno extra consumido: " + oxygenLost
                                    + " litros.\n");
                } else {
                    System.out.println("Acción no válida. La anomalía no se pudo resolver correctamente.\n");
                }
                break;
            default:
                System.out.println("Anomalía no reconocida. Continuando viaje con posibles riesgos.\n");
                break;
        }
        anomalyLog.add(anomalyMessage);
    }

    private static void tripSummary() { // resumen viaje

        System.out.println("\n¡El viaje al planeta " + selectedPlanet + " a llegado a su destino!\n");

        System.out.println("Resumen del viaje:\n");

        System.out.println("* Anomalías encontradas:");
        System.out.println("---------------------------------------------------------");
        for (String anomaly : anomalyLog) {
            System.out.println(anomaly);
        }
        System.out.println("---------------------------------------------------------");

        System.out.println("* Total de combustible perdido: " + totalFuelLost + " litros.");

        System.out.println("* Total de oxígeno perdido: " + totalOxygenLost + " litros.");

        System.out.println("* Total de tiempo de retraso: " + totalTimeDelay + " horas.\n");
    }

}
