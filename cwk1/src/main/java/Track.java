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
  ArrayList<Point> Points = new ArrayList<Point>();

  public Track()
  {

  }

  public Track(String filename)
  {
    // Create new array list to store points
    // ArrayList<Point> Points = new ArrayList<Point>();

    // read given file
    try
    {
      readFile(filename);
    }
    catch (IOException e)
    {
      System.err.println("File does not exist");
    }

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

      Point pointFromFile = new Point(ZonedDateTime.parse(values[0]), Double.parseDouble(values[1]), Double.parseDouble(values[2]), Double.parseDouble(values[3]));

      add(pointFromFile);      
    }
  }

  // TODO: Create a stub for add()
  public void add(Point point)
  {
    Points.add(point);
  } 

  // TODO: Create a stub for get()
  public Point get(int index)
  {
    if (index < 0 || index > Points.size() - 1)
    {
      throw new GPSException("index out of bounds");
    }
    return Points.get(index);
  }

  // TODO: Create a stub for size()
  public int size()
  {
    return Points.size();
  }

  // TODO: Create a stub for lowestPoint()
  public Point lowestPoint()
  {
    Point point = new Point();
    return point;
  }

  // TODO: Create a stub for highestPoint()
  public Point highestPoint()
  {
    Point point = new Point();
    return point;
  }

  // TODO: Create a stub for totalDistance()
  public Double totalDistance()
  {
    return 0.0;
  }

  // TODO: Create a stub for averageSpeed()
  public Double averageSpeed()
  {
    return 0.0;
  }
}
