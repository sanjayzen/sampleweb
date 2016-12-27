package NedbankSample;

import java.awt.Color;
import java.io.FileOutputStream;
import java.io.IOException;

import com.lowagie.text.Chunk;
import com.lowagie.text.Document;
import com.lowagie.text.DocumentException;
import com.lowagie.text.Font;
import com.lowagie.text.FontFactory;
import com.lowagie.text.Paragraph;
import com.lowagie.text.pdf.BaseFont;
import com.lowagie.text.pdf.PdfContentByte;
import com.lowagie.text.pdf.PdfWriter;

public class SampleJava {

	public static void main(String[] args) {

		System.out.println("oooooooooo");
		
		System.out.println("FontColor");

		// step 1: creation of a document-object
		Document document = new Document();
		try {
			// step 2:
			// we create a writer that listens to the document
			PdfWriter writer = PdfWriter.getInstance(document,
					new FileOutputStream("E:\\reports\\ChunkColor.pdf"));

			// step 3: we open the document
			document.addTitle("Hello World example");
			document.addAuthor("Bruno Lowagie");
			document.addSubject("This example shows how to add metadata");
			document.addKeywords("Housekeeping in transactinal database?" +
 "Reporting DB is sitting in GPP database"
 + "Indexing can be applied on the reporting database, GPP dont use reporting database and is replicated only for Nedbank"
  + "Reporting DB will only be used by FT ODS that is it will be consumed by Nedbank"
 + "Bring this reproting DB data from GPP oraclae site to ODS ??"
 + "Elastic Search runs against trnsaction DB which is consumed to GPP gui."
 + "GPP client onboarding data has been provided by GPP. Angela has given access to it."
 + "	 processPackets() is called by notifyObservers method - session.getEventDispatcher().notifyObservers(session, packet)"
 + "calls doPacketReceived() method from TaskExecutorEventDispatcher"
 + "	doPacketReceived() method will call observer.packetReceived(session, packet); where observer is SessionObserver"
 + "I, Mr. Sanjay Shivaji Zende (Passport: G0359822) am employed at Nihilent "
 + "Technologies Ltd. as a Solution Designer and I am required in South Africa to"
 + "I would like my wife Mrs. Monali Sanjay Zende (Passport Number: G0931333)"
 + "Hence you are kindly requested to issue my wife a suitable dependent visa."
 + "During our stay in Johannesburg, South Africa, I and my family would be"
 + "accommodated in an apartment leased by Nihilent Technologies Ltd. at"
 + "Johannesburg. All other expenses in respect of our visit, including"
 + "accommodation, incidentals, medical and insurance, would be borne by"
 + "We are enclosing our passport copy, marriage certificate and resident permit "
 + "page of our passport for your reference and request you to issue of my wife"
 + "dependent visa. In case of you need any other information/detail/documents"
 + "from us. Please advise so that we would arrange to issue immediately to"
 + "1.	Restful services provide a good caching infrastructure over HTTP GET method (for most servers). This"
 + "can improve the performance, if the data the Web service returns is not altered frequently and not"
 + "1.	The Web Services Description Language (WSDL) contains and describes the common set of rules to"
 + "2.	WSDL is a sort of formal contract to define the interface that the Web service offers"
 + "3.	SOAP requires less plumbing code than REST services design, (i.e., transactions, security, coordination"
 + "3.	SOAP requires less plumbing code than REST services design, (i.e., transactions, security, coordination"
 + "3.	SOAP requires less plumbing code than REST services design, (i.e., transactions, security, coordination");
			document.addCreator("My program using iText");
			document.open();
			// step 4:
			Font red = FontFactory.getFont(FontFactory.HELVETICA, Font.DEFAULTSIZE, Font.BOLD, new Color(0xFF, 0x00, 0x00));
			Font blue = FontFactory.getFont(FontFactory.HELVETICA, Font.DEFAULTSIZE, Font.ITALIC, new Color(0x00, 0x00, 0xFF));
			Paragraph p;
			p = new Paragraph("Roses are ");
			p.add(new Chunk("red", red));
			document.add(p);
			p = new Paragraph("Violets are ");
			p.add(new Chunk("blue", blue));
			document.add(p);
			System.out.println("--------END2----------");

			BaseFont bf = FontFactory.getFont(FontFactory.COURIER).getCalculatedBaseFont(false);
			PdfContentByte cb = writer.getDirectContent();
			cb.beginText();
			cb.setColorFill(new Color(0x00, 0xFF, 0x00));
			cb.setFontAndSize(bf, 12);
			cb.showTextAligned(PdfContentByte.ALIGN_CENTER, "Grass is green", 250, 700, 0);
			cb.endText();
			System.out.println("--------END1----------");

		} catch (DocumentException de) {
			de.printStackTrace();
		} catch (Exception ioe) {
			ioe.printStackTrace();
		}

		// step 5: we close the document
		document.close();
		System.out.println("--------END----------");
	}

}
