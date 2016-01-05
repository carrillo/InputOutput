package inputOutput;

import java.io.File;
import java.io.PrintWriter;
import java.util.ArrayList;

public class WriteArrayListToFile 
{
	/**
	 * Write ArrayList<String> to file. Use "\n" as delimiter. 
	 * @param in
	 * @param file
	 */
	public static void writeArrayListStringToFile( final ArrayList<String> in, final String fileName )
	{
		writeArrayListStringToFile( in, new File( fileName ) ); 
	}
	
	/**
	 * Write ArrayList<String> to file. Use "\n" as delimiter. 
	 * @param in
	 * @param file
	 */
	public static void writeArrayListStringToFile( final ArrayList<String> in, final File file )
	{
		PrintWriter out = TextFileAccess.openFileWrite( file ); 
		
		for( String s : in )
			out.println( s ); 
		
		out.close(); 
	}
}
