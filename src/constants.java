public class constants {
    public static final String WELCOME_TEXT = "Hallo. Schreibe bitte das Wort zu dem du eine Erklärung haben möchtest. Zu folgenden Ausdrücken, kann ich dir eine Erklärung geben: \n" +
            "Objekt, Array, Datentypen, ArrayList, Klassen, if-Abfrage, for-Schleife, while-Schleife, Methode, switch-Anweisung, Vererbung und 2D-Array. \n" +
            "Zum Beenden der Anwendung schreibe einfach: Ende";
    public static final String END_APPLICATION = "Ende";
    public static final String SAY_GOODBYE = "Okay. Bis zum nächsten mal.";
    public static final String[] QUESTION_KEYWORD = {"Objekt", "Array", "Datentypen", "ArrayList", "Klassen", "if-Abfrage", "for-Schleife", "while-Schleife", "Methode",
            "switch-Anweisung", "Vererbung", "2D-Array"};
    public static final String[] QUESTION_ANSWER ={"Objekte sind Instanzen von Klassen, sie werden mit Hilfe des new-Operator erzeugt. Dabei wird zuerst eine Variable vom Typ der Klasse deklariert. Dieser Variablen wird dann das erzeugte Objekt zugewiesen. Siehe folgendes Beispiel: \n" +
            "Schaf schafObjekt;\n" +
            "schafObjekt = new Schaf();\n",
            "Arrays sind im Prinzip einfache Listen. Diese Arrays werden mit einem Datentypen deklariert, d.h. alle Werte, die in diesem Array gespeichert werden sollen, müssen von demselben Datentyp sein, mit dem das Array deklariert wurde. \n" +
                    "Siehe folgendes Beispiel: \n" +
                    "int [ ] arr1 = new int[5]; \n",
            "Datentypen sind eine Gruppe von Typen, mit denen man Variablen erstellen kann, die Zahlen, einzelne Zeichen oder logische Werte aufnehmen.",
            "Eine ArrayList ist ein dynamisches Array, dessen Länge nicht definiert werden muss. \n" +
                    "ArrayList<String> auto = new ArrayList<String>(); \n" +
                    "Mit der Methode 'add' können Inhalte der ArrayList hinzugefügt werden. Beispiel:\n" +
                    "auto.add('Blaues Auto')",
            "In einer Klasse sind Methoden und Eigenschaften eines Objektes definiert. Die Klasse dient als Vorlage, aus der dann beliebig viele Objekte erzeugt werden können. Beispiel:\n" +
                    "public class main{}",
            "Durch eine if-Abfrage kann überpüft werden ob eine bestimmte Bedingung eintritt und falls dem so ist, soll eine gewisse Aktion ausgeführt werden. Beispiel:\n" +
                    "if(alter < 16){\n" +
                    "System.out.println('Kein Alkohol');\n" +
                    "}else{\n"
                    +"System.out.println('Du darfst ein Bier trinken');}",
            "Die for-Schleife ist eine Struktur, die dazu dient, eine oder mehrere Anweisungen solange wiederholt auszuführen, wie eine Bedingung wahr ist. Beispiel: \n" +
                    "for(int i = 0; i < 10; i++){\n" +
                    "System.out.println('i ist kleiner als 10'};",
            "Die while Schleife wird nur unter einer bestimmten Bedingung ausgeführt. Sollte dass der Fall sein, springt unser Programm zum Anfang der Schleife zurück.\n" +
                    "Das passiert so lange, bis die Bedingung nicht mehr erfüllt ist. Beispiel: \n" +
                    "while(istGeprüft == true){\n" +
                    "System.out.println('alles gut');}",
            "Methoden arbeiten in Java immer mit den Daten (Variablen) von Objekten. Das unterscheidet sie von Funktionen, die man in anderen Programmiersprachen vorfinden kann \n" +
                    "und welche vollkommen unabhängig von einem Objekt oder einer Klasse existieren.",
            "Die switch-Anweisung zählt sich in Java zu den Kontrollstrukturen und ist eine Alternative zur if-Anweisung. Beispiel: \n" +
                    "switch(Ausdruck){\n" +
                    "case 'konstanter_ausdruck_1': \n" +
                    "anweisung_1;\n" +
                    "break; \n" +
                    "case 'konstanter_ausdruck_2': \n" +
                    "anweisung_2;\n" +
                    "break;}",
            "Die Vererbungsbeziehung wird in Java mit dem Schlüsselwort extends beschrieben. Beispiel: \n" +
                    "public class Mitarbeiter extends Person {}",
            "In Java kann eine Tabelle als ein 2D-Array implementiert werden. Jeder Slot des Arrays ist eine Variable, die Werte enthalten kann und wie jede andere Variable funktioniert. \n" +
                    "Wie bei eindimensionalen Arrays ist jeder Slot in einem 2D-Array von dem gleichen Typ. Der Typ kann ein primitiver Typ oder ein Objektreferenztyp sein. Beispiel: \n" +
                    "String[][] autos = new String[2][2]; \n" +
                    "autos = {{'Mercedes', 'silber'}, {'BMW','schwarz'}};"};
    public static final String WRONG_USER_INPUT = "Leider kann ich dir zu diesem Wort keine Hilfestellung geben oder du hast es falsch eingegeben.";
}
