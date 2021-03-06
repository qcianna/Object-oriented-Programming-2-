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

    // Celem dzisiejszych zaj???? jest skorzystanie z mechanizmu refleksji
//    Na pocz??tku wypisujemy wszystkie mo??liwe metody z klasy Math kt??re maja 1 lub 2 argumenty
    // Nast??pnie u??ytkownik wpisuje funkcj?? matematyczn?? do wywo??ania, np. tan(1.0), 
    //nale??y obs??u??yc wszystkie funkcje z klasy Math, kt??re zawieraj?? 1 lub 2 argumenty
    // Metod?? w klasie Math nale??y znale???? przy u??yciu metody "getMethod" z klasy Class
    // Nast??pnie wypisujemy wynik r??wnania i ko??czymy program
    // Oczywi??cie program musi obs??ugiwa?? wyj??tki takie jak: wywo??anie metody 
    //kt??ra nie istnieje w klaie Math, Wywoa??enie metody ze z???? liczb?? argument??w, 
    //czy podaniem do funkcji typu argumentu innego niz int/float/double
    // Mamy napisan?? metod?? getArgs do kt??rej podajemy np: "sin(4.12)" 
    //i otrzymujemy tablic??: [sin, 4.12]
}