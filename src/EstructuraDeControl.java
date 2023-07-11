import java.util.Scanner;
/*Crear una app que registre y calcule el IMC y que quede los datos en una lista.
IMC = peso/estatura
*/

    public class EstructuraDeControl {
        //Definimos las variables
        public static double weight;
        public static double size;
        public static String name;
        public static String email;
        public static String password;
        public static boolean state;

        //Pedir los datos

        static Scanner sc = new Scanner(System.in);


            public static void main(String[] args) {
                boolean isOn = stateChange();
                while (isOn=true){
                    menu();
                    register();
                    login();
                    calculate();

                }





            }


        public static void register() {
            System.out.println("Enter your name: ");
            name = sc.next();

            System.out.println("Enter your Email: ");
            email = sc.next();

            System.out.println("Enter your password: ");
            password = sc.nextLine();
        }

        public static void login() {
            System.out.println("Enter your email: ");
            String userEmail = sc.next();

            System.out.println("entrer your password");
            String userPassword = sc.next();

            if (userEmail.equals(email) && userPassword.equals(password)) {
                System.out.println("Successful login");
            } else {
                System.out.println("error data");
            }
        }

        public static boolean menu() {
            System.out.println("menu: 1.Register\n 2.Login\n 3.Shout down system");
            int option = sc.nextInt();

            switch (option) {
                case 1:
                    System.out.println("start record");
                    register();
                    break;
                case 2:
                    System.out.println("start login");
                    login();
                    break;
                case 3:
                    System.out.println("go out");
                    break;
                default:
                    System.out.println("invalid data");
            }
            return false;
        }


        public static boolean stateChange() {
            System.out.println("Do you want to turn on the application?");
            int response = sc.nextInt();
            if (response == 1) {
                state = true;
            }
            return state;
        }


        public static double calculate() {
            System.out.println("enter your weight: ");
            System.out.println("enter your size: ");
            double IMC = weight / (size * size);

            if (IMC <= 18.5) {
                System.out.println("Your IMC is low");
            } else if (IMC >= 18.6 && IMC <= 24.9) {
                System.out.println("Your IMC is normal");
            } else if (IMC >= 25 && IMC <= 29.9) {
                System.out.println("Your IMC is overweight");
            } else if (IMC >= 30) {
                System.out.println("Your IMC is obese");
            } else {
                System.out.println("enter correct data");
            }
            return IMC;
        }

}
