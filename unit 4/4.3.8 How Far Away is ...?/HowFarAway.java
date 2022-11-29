public class HowFarAway extends ConsoleProgram
{
    public void run()
    {
        double startLatitude = readDouble("Enter the latitude of the starting location: ");
        double startLongitude = readDouble("Enter the longitude of the starting location: ");
        double endLatitude = readDouble("Enter the latitude of the ending location: ");
        double endLongitude = readDouble("enter the longitude of the ending location: ");
        
        
        GeoLocation startLocation = new GeoLocation(startLatitude, startLongitude);
        GeoLocation endLocation = new GeoLocation(endLatitude, endLongitude);
        double distance = startLocation.distanceFrom(endLocation);
        System.out.println("The distance is " + distance + " miles.");

    }
}
