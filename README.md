# Dokumentation: Continuous Integration Pipeline

Dieses Projekt wurde im Rahmen des Moduls "Software Engineering" erstellt.

## 1. Welche Plattform Sie genutzt haben
Ich habe **GitHub Online** als CI-Plattform verwendet.

## 2. Wie Ihre Pipeline aufgebaut ist
Die Pipeline ist in der Datei `.github/workflows/build.yml` definiert. Sie besteht aus einem einzigen Job (`build`), der auf einem von GitHub gehosteten Ubuntu-Runner ausgeführt wird.

Die Pipeline durchläuft die folgenden Schritte:
1.  **`actions/checkout@v3`**: Holt den aktuellen Code aus dem Repository.
2.  **`actions/setup-java@v3`**: Installiert eine Java-Umgebung (JDK 17).
3.  **`run: javac -d bin src/Main.java`**: Kompiliert den Java-Quellcode aus `src/` in den `bin/`-Ordner.
4.  **`run: java --class-path bin Main`**: Führt die kompilierte `Main`-Klasse aus. Diese Klasse enthält die "Tests". Wenn die Tests fehlschlagen (simuliert durch `System.exit(1)`), wird die Pipeline ebenfalls als fehlgeschlagen markiert.

## 3. Was bei einem "Push" passiert
Jeder `push` auf den `main`-Branch löst die Pipeline automatisch aus (definiert durch `on: push: branches: [ main ]`). 

Der Runner fährt hoch, führt alle oben genannten Schritte aus und meldet den Status (Erfolg/Fehlschlag) zurück an GitHub. Dies ist im "Actions"-Tab des Repositorys sichtbar.
