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
        //wie? y-/xPosition
    }
    
    public void weissSetzen()
    {
    }
    
    /////////////////////////////////////////////
    //Methoden, die bei Model aufgerufen werden//
    /////////////////////////////////////////////
    
    public void pinSetzen(int xPosition, int yPosition)
    {
        if(aktiveReihe != reiheFinden(yPosition))
        {
            //was kommt hier rein? //Nichts :)
        }
        else
        {
            int pin = pinFinden(xPosition);
            model.pinSetzen(aktiveFarbe, pin);
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
                case 0:
                        if(yPosition == 1) 
                            {  reihe = 1; 
                            }
                        break; //Überprüfen ob im Rahmen von reihe eins, falls zutreffend reihe = 1 und break;
                case 1:
                        if(yPosition == 2) 
                            {  reihe = 2; 
                            }
                        break; //wiederholung von oben
                case 2:
                        if(yPosition == 3) 
                            {  reihe = 3; 
                            }
                        break; 
                case 3:
                        if(yPosition == 4) 
                            {  reihe = 4; 
                            }
                        break; 
                case 4:
                        if(yPosition == 5) 
                            {  reihe = 5; 
                            }
                        break; 
                case 5:
                        if(yPosition == 6) 
                            {  reihe = 6; 
                            }
                        break; 
                case 6:
                        if(yPosition == 7) 
                            {  reihe = 7; 
                            }
                        break; 
                case 7:
                        if(yPosition == 8) 
                            {  reihe = 8; 
                            }
                        break; 
                case 8:
                        if(yPosition == 9) 
                            {  reihe = 9; 
                            }
                        break; 
                case 9:
                        if(yPosition == 10) 
                            {  reihe = 10; 
                            }
                        break; 
                case 10:
                        if(yPosition == 11) 
                            {  reihe = 11; 
                            }
                        break; 
                case 11:
                        if(yPosition == 12) 
                            {  reihe = 12; 
                            }
                        break; 
                default: 
                        reihe = -1;
                        break;
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
                case 0:
                        if(xPosition == 1)
                        {
                            pin = 1;
                        }
                        break; //Überprüfen ob im Rahmen von pin eins, falls zutreffend pin = 1 und break;
                case 1:
                        if(xPosition == 2)
                        {
                            pin = 2;
                        }
                        break;
                case 2:
                        if(xPosition == 3)
                        {
                            pin = 3;
                        }
                        break;
                case 3:
                        if(xPosition == 4)
                        {
                            pin = 4;
                        }
                        break;
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
