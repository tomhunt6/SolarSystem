public class Planet
{
    private double distanceFromSun;
    private double angleFromSun;
    private double diameter;
    private String colour;
    private double speed;

    public Planet(double dfs, double afs, double d, String c, double s)
    {
        distanceFromSun = dfs;
        angleFromSun = afs;
        diameter = d;
        colour = c;
        speed = s;
    } 

    public double returnDistanceFromSun()
    {
        return distanceFromSun;
    }

    public double returnAngleFromSun()
    {
        return angleFromSun;
    }
    
    public double returnDiameter()
    {
        return diameter;
    }

    public String returnColour()
    {
        return colour;
    }

    public double returnSpeed()
    {
        return speed;
    }

    public void updatePosition()
    {
        angleFromSun = angleFromSun + speed;
    }
}