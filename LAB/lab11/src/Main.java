import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {

    public static String[] getArgs(String arg) {
        return Arrays.stream(arg.split("[\\s+(),]"))
                .filter(w -> !w.isEmpty())
                .toArray(String[]::new);
    }

    public static void main(String[] args) {

            Method[] mathMetods = Math.class.getMethods();

            List<Method> mathMetods2Param = Arrays.stream(mathMetods)
                    .filter(mathMetod -> mathMetod.getGenericParameterTypes().length == 1 || mathMetod.getGenericParameterTypes().length == 2)
                    .collect(Collectors.toList());

            mathMetods2Param.forEach(System.out::println);

            Scanner scanner = new Scanner(System.in);
            System.out.print("Podaj nazwe funkcji (np. cos(1)): ");
            String methodName = scanner.nextLine();
            String[] arr = getArgs(methodName);

            mathMetods2Param.stream()
                    .filter(mathMetod -> mathMetod.getName().equals(arr[0]) && mathMetod.getParameterTypes()[0].equals(double.class))
                    .forEach(mathMetod -> {
                        try {
                            Object res;
                            Method method;

                            if(mathMetod.getGenericParameterTypes().length == 2) {
                                method = Math.class.getMethod(arr[0], double.class, double.class);
                                res = method.invoke(Math.class, Double.parseDouble(arr[1]), Double.parseDouble(arr[2]));
                            } else {
                                method = Math.class.getMethod(arr[0], double.class);
                                res = method.invoke(Math.class, Double.parseDouble(arr[1]));
                            }

                            System.out.println(mathMetod.getName() + ": " + res);
                        } catch (IllegalAccessException | InvocationTargetException | NoSuchMethodException e) {
                            e.printStackTrace();
                        }
                    });
    }

    // Celem dzisiejszych zajęć jest skorzystanie z mechanizmu refleksji
//    Na początku wypisujemy wszystkie możliwe metody z klasy Math które maja 1 lub 2 argumenty
    // Następnie użytkownik wpisuje funkcję matematyczną do wywołania, np. tan(1.0), 
    //należy obsłużyc wszystkie funkcje z klasy Math, które zawierają 1 lub 2 argumenty
    // Metodę w klasie Math należy znaleźć przy użyciu metody "getMethod" z klasy Class
    // Następnie wypisujemy wynik równania i kończymy program
    // Oczywiście program musi obsługiwać wyjątki takie jak: wywołanie metody 
    //która nie istnieje w klaie Math, Wywoałenie metody ze złą liczbą argumentów, 
    //czy podaniem do funkcji typu argumentu innego niz int/float/double
    // Mamy napisaną metodę getArgs do której podajemy np: "sin(4.12)" 
    //i otrzymujemy tablicę: [sin, 4.12]
}