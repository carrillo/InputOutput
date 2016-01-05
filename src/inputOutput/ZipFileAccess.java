package inputOutput;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.zip.GZIPInputStream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

import javax.imageio.stream.FileImageInputStream;

public class ZipFileAccess 
{	
	/**
	 * Opens zip file to read. 
	 * @param file
	 * @return
	 */
	public static BufferedReader openZipFileRead( final ZipFile file )
	{
		BufferedReader in; 
		try
		{
			in = new BufferedReader( new InputStreamReader( file.getInputStream( new ZipEntry( file.getName() )  ) ) ); 			
		}
		catch (Exception e) 
		{
			System.err.println("InputOutput.ZipFileAccess.openFileRead(): " + e);
			in = null;
		}
		
		return (in); 
	}
	
	/**
	 * Opens gzip file to read. 
	 * @param file
	 * @return
	 */
	public static BufferedReader openGZipFileRead( final File file )
	{
		BufferedReader in; 
		try
		{
			in = new BufferedReader( new InputStreamReader( new GZIPInputStream( new FileInputStream( file ) ) ) ); 			
		}
		catch (Exception e) 
		{
			System.err.println("InputOutput.ZipFileAccess.openFileRead(): " + e);
			in = null;
		}
		
		return (in); 
	}
}
