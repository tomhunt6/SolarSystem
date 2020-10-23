public class Driver
{

    public static void main(String[] args)
    {
        SolarSystem ss = new SolarSystem(1000,1000); 
        Planet[] planets = new Planet[8];
 
        planets[0] = new Planet(55,180,3,"#DBDBDB",8);           //Mercury
        planets[1] = new Planet(70,180,9,"#DBDBDB",3.11);           //Venus
        planets[2] = new Planet(100,180,9,"#1A85FF",1.92);           //Earth
        planets[3] = new Planet(145,180,7,"#C1440E",1.02);           //Mars
        planets[4] = new Planet(200,180,30,"#FFCB78",0.16);         //Jupiter
        planets[5] = new Planet(280,180,28,"#EDA353",0.06);          //Saturn
        planets[6] = new Planet(325,180,14,"#8594A3",0.02);         //Uranus
        planets[7] = new Planet(367,180,14,"#1C70C8",0.01);         //Neptune

        while(true){
            ss.drawSolarObject(0,0,50,"YELLOW"); 
            for(int i=0; i<8; i++)
            {
                ss.drawSolarObjectAbout(planets[i].returnDistanceFromSun(),planets[i].returnAngleFromSun(),planets[i].returnDiameter(),planets[i].returnColour(),0,0);
            }
            ss.finishedDrawing();

            for(int i=0; i<8; i++)
            {
                planets[i].updatePosition(); 
            }
            
        }
         
    }

}