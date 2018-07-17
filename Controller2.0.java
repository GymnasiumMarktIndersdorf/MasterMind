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
    
    public void pinSetzen(String farbe, int xPosition, int yPosition)
    {
        if(aktiveReihe != reiheFinden(yPosition))
        {
            //was kommt hier rein?
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
                case 0:
                        if(yPosotion == 1) 
                            {  reihe = 1; 
                            }
                        break; //Überprüfen ob im Rahmen von reihe eins, falls zutreffend reihe = 1 und break;
                case 1:
                        if(yPosotion == 2) 
                            {  reihe = 2; 
                            }
                        break; //wiederholung von oben
                case 2:
                        if(yPosotion == 3) 
                            {  reihe = 3; 
                            }
                        break; 
                case 3:
                        if(yPosotion == 4) 
                            {  reihe = 4; 
                            }
                        break; 
                case 4:
                        if(yPosotion == 5) 
                            {  reihe = 5; 
                            }
                        break; 
                case 5:
                        if(yPosotion == 6) 
                            {  reihe = 6; 
                            }
                        break; 
                case 6:
                        if(yPosotion == 7) 
                            {  reihe = 7; 
                            }
                        break; 
                case 7:
                        if(yPosotion == 8) 
                            {  reihe = 8; 
                            }
                        break; 
                case 8:
                        if(yPosotion == 9) 
                            {  reihe = 9; 
                            }
                        break; 
                case 9:
                        if(yPosotion == 10) 
                            {  reihe = 10; 
                            }
                        break; 
                case 10:
                        if(yPosotion == 11) 
                            {  reihe = 11; 
                            }
                        break; 
                case 11:
                        if(yPosotion == 12) 
                            {  reihe = 12; 
                            }
                        break; 
                default: //reihe = null
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