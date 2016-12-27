package NedbankSample;

import java.io.FileOutputStream;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import com.lowagie.text.PageSize;
import com.lowagie.text.Rectangle;
import com.lowagie.text.pdf.BaseFont;
import com.lowagie.text.pdf.PdfAnnotation;
import com.lowagie.text.pdf.PdfContentByte;
import com.lowagie.text.pdf.PdfReader;
import com.lowagie.text.pdf.PdfStamper;
import com.lowagie.text.pdf.SimpleBookmark;
public class MainClass {
  public static void main(String[] args) throws Exception {
    BaseFont bf = BaseFont.createFont(BaseFont.HELVETICA, BaseFont.WINANSI, BaseFont.NOT_EMBEDDED);
    PdfReader reader = new PdfReader("E:/reports/BookmarksPDF.pdf");
    List list = SimpleBookmark.getBookmark(reader);
    Iterator it = list.iterator();
    while(it.hasNext()) {
    	Object element = it.next();
        System.out.print(element + " ");
    }
  }
}
