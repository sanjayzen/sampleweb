package NedbankSample;

import java.io.FileOutputStream;

import com.lowagie.text.Document;
import com.lowagie.text.Font;
import com.lowagie.text.PageSize;
import com.lowagie.text.Paragraph;
import com.lowagie.text.pdf.PdfContentByte;
import com.lowagie.text.pdf.PdfDestination;
import com.lowagie.text.pdf.PdfOutline;
import com.lowagie.text.pdf.PdfPageEventHelper;
import com.lowagie.text.pdf.PdfWriter;

public class BookmarksPDF extends PdfPageEventHelper {
  public void onParagraph(PdfWriter writer, Document document, float position) {
    PdfContentByte cb = writer.getDirectContent();
    new PdfOutline(cb.getRootOutline(), new PdfDestination(PdfDestination.FITH, position), "paragraph at position: " +position);
  }

  public static void main(String[] args) {
    Document document = new Document(PageSize.A6);
    try {
      PdfWriter writer = PdfWriter.getInstance(document, new FileOutputStream("E:/reports/BookmarksPDF.pdf"));
      writer.setViewerPreferences(PdfWriter.PageModeUseOutlines);
      document.open();
      writer.setPageEvent(new BookmarksPDF());

      document.add(new Paragraph("Text", new Font(Font.HELVETICA, 12)));
      document.newPage();
      document.add(new Paragraph("Text Text", new Font(Font.HELVETICA, 24)));
      document.newPage();
      document.add(new Paragraph("Text Text Text", new Font(Font.HELVETICA, 36)));
      document.newPage();
      document.add(new Paragraph("Text Text Text Text", new Font(Font.HELVETICA, 48)));
    } catch (Exception de) {
      de.printStackTrace();
    }
    document.close();
  }
}
