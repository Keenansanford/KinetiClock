import java.util.ArrayList; 


/**
 * Tests the MergeSort class using the CorrectnessTester class and creates an environment that allows
 * for time complexity testing over a range of ArrayList sizes.
 * 
 * @author Keenan Sanford, Kip Forness
 * @version 3/8/2018
 */


public class Path {
	
	// 
	public Tray startTray;
	public Tray endTray;
	public int pathTime;
	public ArrayList<Integer> ballTracker = new ArrayList<Integer>(16);
	
	
	// Constructor.
	public Path (Tray start, Tray end, int time) {
		startTray = start;
		endTray = end;
		pathTime = time;
	}
}
