package runner_statsarray;

public class StringStatsArray{

  final private String[] arr;

  public StringStatsArray(String[] a)
  {
    arr = a;
  }

  public String toString()
  {
    String out = "";
    out += "{\"";
    
    for (int i = 0; i < arr.length-1;i++)
    {
       out += (arr[i] + "\", \"");
    }
    
    out += (arr[arr.length-1] + "\"}");
    return out;
  }

  public double averageLength(){
    double sum = 0, count = 0;
    
    for (int i = 0; i < arr.length; i++)
    {
      sum += arr[i].length();
      count++;
    }
    
    return (sum/count);
  }

  public int search(String target)
  {
    for (int i = 0; i < arr.length; i++)
    {
      if (target.equals(arr[i])) return i;
    }
    
    return -1;
  }

  public int sortStatus() 
  {
    boolean in = true, de = true;
    
    for (int i = 0; i < arr.length - 1; i++)
    {
      if (arr[i].compareTo(arr[i+1]) > 0) in = false;
      if (arr[i].compareTo(arr[i+1]) < 0) de = false;
      if (!in && !de) break;
    }

    if (in)return 1;
    else if (de) return -1;
    else return 0;
  }
}
