import java.util.Scanner;

public class App {


    public static void main(String[] args) throws Exception {

        System.out.println("/n BIENVENIDO AL SIMULADOR DE VIAJE INTERPLANETARIO /n");
        


    }
    private static void menu(){ // Menú principal
        
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



}
