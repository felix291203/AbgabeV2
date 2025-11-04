// src/Main.java
public class Main {

    // Die "Tests", die ausgeführt werden sollen
    public static void runTests() {
        System.out.println("Starte Tests...");
        
        // Simulierter Test 1
        boolean test1 = true;
        System.out.println("Test 1 erfolgreich: " + test1);

        // Simulierter Test 2
        boolean test2 = true;
        System.out.println("Test 2 erfolgreich: " + test2);

        if (test1 && test2) {
            System.out.println(">> Alle Tests erfolgreich bestanden!");
        } else {
            System.out.println(">> FEHLER: Mindestens ein Test ist fehlgeschlagen!");
            // Wichtig: Beende das Programm mit einem Fehlercode,
            // damit die CI-Pipeline den Fehler erkennt!
            System.exit(1); 
        }
    }

    // Der Haupteinstiegspunkt
    public static void main(String[] args) {
        System.out.println("Build-Prozess gestartet.");
        runTests();
        System.out.println("Build-Prozess beendet.");
    }
}
