import java.util.Scanner;

class Main {
public static void main(String[] args) {
int[] intArray = new int[15];
String[] nameArray = new String[20];
Estudiante[] estudianteArray = new Estudiante[100];
intArray[9] = 5;
nameArray[0] = "Francisco";

displayArray(intArray, "Array de enteros");
displayArray(nameArray, "Array de nombres");
displayArray(estudianteArray, "Array de estudiantes");
}

public static void displayArray(int[] array, String arrayName) {
System.out.println("Mostrando contenido del " + arrayName + ":");
for (int i = 0; i < array.length; i++) {
System.out.println(array[i]);
}
}

public static void displayArray(String[] array, String arrayName) {
System.out.println("Mostrando contenido del " + arrayName + ":");
for (int i = 0; i < array.length; i++) {
System.out.println(array[i]);
}
}

public static void displayArray(Estudiante[] array, String arrayName) {
System.out.println("Mostrando contenido del " + arrayName + ":");
for (int i = 0; i < array.length; i++) {
System.out.println(array[i].id + " " + array[i].name);
}
}
}