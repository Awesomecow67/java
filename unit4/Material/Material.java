package src.unit4.Material;

import java.util.Arrays;
import java.util.stream.Stream;

public class Material {
    public static void main(String[] args) {
        String colors[] = {"Red", "Green", "Blue", "Indigo"};
        System.out.println(colors[1]);
        colors[1] = "Yellow";
        System.out.println(colors[1]);
        System.out.println("The length of the colors array is: " + colors.length);
        for (String color : colors) {
            System.out.println(color);
        }
        String cars[] = {"Toyota", "Honda", "Ford", "Tesla"};
        String[] allStrings = Stream.concat(
                Arrays.stream(colors),
                Arrays.stream(cars)
        ).toArray(String[]::new);
        for (String s : allStrings) System.out.println(s);
    }
}
