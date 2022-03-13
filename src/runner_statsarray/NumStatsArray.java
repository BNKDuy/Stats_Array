package runner_statsarray;

public class NumStatsArray
{
  private final double[] arr;
  
  public NumStatsArray(double[] a)
  {
    arr = a;
  }

  public String toString()
  {
    String out = "";
    out += '{';
    
    for (int i = 0; i < arr.length - 1; i++)
    {
      out += Double.toString(arr[i]);
      out += ", ";
    }
    out += Double.toString(arr[arr.length - 1]); 
    out += '}';
    
    return out;
  }

  public double average()
  {
    double sum = 0, count = 0;
    for (double s: arr)
    {
      sum+=s;
      count++;
    }
    
    return (sum/count);
  }

  public double range()
  {
    double min = arr[0];
    double max = arr[0];
    
    for (int i = 1; i < arr.length; i++)
    {
      if (arr[i] < min) min = arr[i];
      
      else if (arr[i] > max) max = arr[i];
    }
    
    return (max-min);
  }


    public int sortStatus() 
  {
    boolean in = true, de = true;
    
    for (int i = 0; i < arr.length - 1; i++)
    {
      if (arr[i] > arr[i+1]) in = false;
      if (arr[i] < arr[i+1]) de = false;
      if (!in && !de) break;
    }

    if (in) return 1;
    else if (de) return -1;
    else return 0;
  }
}