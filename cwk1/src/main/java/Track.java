import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.nio.file.Paths;
import java.time.ZonedDateTime;
/**
 * Represents a point in space and time, recorded by a GPS sensor.
 *
 * @author Muhammad Kashif-Khan
 */
public class Track {
  // TODO: Create a stub for the constructor
  public Track()
  {
    throw new GPSException("location unknown");
  }

  public Track(String filename)
  {
    // Create new array list to store points
    ArrayList<Point> Points = new ArrayList<Point>();

    // read given file
    Track.readFile(filename);
  }

  // TODO: Create a stub for readFile()
  public void readFile(String filename) throws IOException
  {
    String delimiter = ",";
    Scanner input = new Scanner(Paths.get(filename));

    while (input.hasNextLine())
    {
      String line = input.nextLine();
      String values[] = line.split(delimiter);

      if (values.length != 4)
      {
        throw new GPSException("# of values obtained from file are not 4");
      }

      Point pointFromFile = new Point(ZonedDateTime.parse(values[1]), );
      pointFromFile.latitude


      
    }
  }

  // TODO: Create a stub for add()

  // TODO: Create a stub for get()

  // TODO: Create a stub for size()

  // TODO: Create a stub for lowestPoint()

  // TODO: Create a stub for highestPoint()

  // TODO: Create a stub for totalDistance()

  // TODO: Create a stub for averageSpeed()
}
