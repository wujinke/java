package locateServer;
import locateServer.Location;
import java.io.ObjectInputStream.GetField;
import java.util.Scanner;

public class locateShort {
	Location locate = new Location();
	public  Location LocateNearest(Location myLocation)
	{
		locate.x = 0;
		locate.y = 0;
		for(int i = 0;i<FindShort.n;i++)
		if(Math.pow(myLocation.x,2)-Math.pow(myLocation.store[i][0],2)+Math.pow(myLocation.y,2)-Math.pow(myLocation.store[i][1],2)
		>Math.pow(myLocation.x,2)-Math.pow(locate.x,2)+Math.pow(myLocation.y,2)-Math.pow(locate.y,2))
		{
			locate.x = myLocation.store[i][0];
			locate.y = myLocation.store[i][1];
		}
		return locate;
	}	
}
