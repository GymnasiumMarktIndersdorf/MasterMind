public final class Controller
{
    private static Controller controller = null;
    private int aktiveReihe;
    private Model model;
    private String aktiveFarbe;
    private Controller()
    {
        aktiveReihe = 1;
        model = new Model();
    }

    public Controller getController()
    {
        if(controller == null)
        {
            controller = new Controller();
        }
        return controller;
    }
    
    ////////////////////////////////////////////
    //Methoden, die bei View aufgerufen werden//
    ///////////////////////////////////////////
    
    public void schwarzSetzen()
    {
    }

    public void weissSetzen()
    {
    }
    
    /////////////////////////////////////////////
    //Methoden, die bei Model aufgerufen werden//
    /////////////////////////////////////////////
    
    public void pinSetzen(String farbe, int xPosition, int yPosition)
    {
        if(aktiveReihe != reiheFinden(yPosition))
        {
            
        }
        else
        {
            int pin = pinFinden(xPosition);
            model.pinSetzen(farbe, pin);
        }
    }
    
    //////////////////////////////////////////////////
    //Methoden, die bei Controller aufgerufen werden//
    //////////////////////////////////////////////////
    
    private int reiheFinden(int yPosition)
    {
        int reihe = 0;
        for(int i = 0; i < 12; i++)
        {
            switch(i)
            {
                case 0://Überprüfen ob im Rahmen von reihe eins, falls zutreffend reihe = 1 und break;
                case 1://wiederholung von oben
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
                case 9:
                case 10:
                case 11:
                default://reihe = null
            }
        }
        return reihe;
    }
    
    private int pinFinden(int xPosition)
    {
        int pin = 0;
        for(int i = 0; i < 4; i++)
        {
            switch(i)
            {
                case 0://Überprüfen ob im Rahmen von pin eins, falls zutreffend pin = 1 und break;
                case 1:
                case 2:
                case 3:
                default://pin = null
            }
        }
        return pin;
    }
    
    public void farbeSpeichern(String farbe)
    {
        aktiveFarbe = farbe;
    }
}