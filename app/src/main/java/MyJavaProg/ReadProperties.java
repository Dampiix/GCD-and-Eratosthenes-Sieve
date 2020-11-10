package MyJavaProg;

public class ReadProperties {

    public void readProperties(){
        //
        App.Vorname = " " + Console.readStringFromStdIn("Enter prename: ");
        App.Name    = " " + Console.readStringFromStdIn("Enter surname: ");
        App.MatrNr  = " " + Console.readStringFromStdIn("Enter matriculation number: ");
    }

}
