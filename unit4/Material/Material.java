package src.unit4.Material;

public class Material {
    public static void main(String[] args) {
        String colors[] = {"Red", "Green", "Blue", "Indigo"};
        System.out.println(colors[2] + "\n");
        colors[1] = "Yellow";
        System.out.println(colors[1] + "\n");
        System.out.println("The length of the colors array is: " + colors.length + "\n");
        for (String color : colors) {
            System.out.println(color);
        }
        System.out.println("\n");
        String cars[] = {"Toyota", "Honda", "Ford", "Tesla"};
        String[][] bothArrays = {colors, cars};
        for (String[] array : bothArrays) {
            for (String item : array) {
                System.out.println(item);
            }
        }
    }
}
