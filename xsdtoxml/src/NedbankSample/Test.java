package NedbankSample;

import java.io.IOException;
import java.util.Iterator;
import java.util.Map;

import com.lowagie.text.pdf.PdfReader;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			
			PdfReader reader = new PdfReader("E:\\reports\\ChunkColor.pdf");
		    Map info = reader.getInfo();
		    for (Iterator i = info.keySet().iterator(); i.hasNext();) {
		      String key = (String) i.next();
		      String value = (String) info.get(key);
		      System.out.println(key + ": " + value);
		    }
		    if (reader.getMetadata() == null) {
		      System.out.println("No XML Metadata.");
		    } else {
		      System.out.println("XML Metadata: " + new String(reader.getMetadata()));
		    }
		    
		    
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}


	}

}
