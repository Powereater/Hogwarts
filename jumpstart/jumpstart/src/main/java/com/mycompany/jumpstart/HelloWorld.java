/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.jumpstart;

/*
 * This example is part of the iText 7 tutorial.
 */

 
import com.itextpdf.kernel.pdf.PdfDocument;
import com.itextpdf.kernel.pdf.PdfWriter;
import com.itextpdf.layout.Document;
import com.itextpdf.layout.element.Paragraph;
import com.itextpdf.test.annotations.WrapToTest;
 
import java.io.File;
import java.io.IOException;
 
/**
 * Simple Hello World example.
 */
@WrapToTest
public class HelloWorld {
 
    public static final String DEST = "results/chapter01/hello_world.pdf";
 
    public static void main(String args[]) throws IOException {
        File file = new File(DEST);
        file.getParentFile().mkdirs();
        new HelloWorld().createPdf(DEST);
    }
 
    public void createPdf(String dest) throws IOException {
        //Initialize PDF writer
        PdfWriter writer = new PdfWriter(dest);
 
        //Initialize PDF document
        PdfDocument pdf = new PdfDocument(writer);
 
        // Initialize document
        Document document = new Document(pdf);
 
        //Add paragraph to the document
        document.add(new Paragraph("HOGWARTS SCHOOL of WITCHCRAFT and WIZARDRY\n" +
"\n" +
"\n" +
"Headmaster: Gordon Freeman\n" +
"(PH.D., MIT, Theoretical Physics, Research Associate,\n" +
"The Freeman, Dangerous, Mute Lunatic.)\n" +
"\n" +
"\n" +
"    Dear Mr Spock, \n" +
"\n" +
"    We are pleased to inform you that you have been accepted at Hogwarts School of Witchcraft and Wizardry. Please find enclosed a list of all necessary Crowbars and Companion Cubes. \n" +
"\n" +
"    Term begins on 1 September. We await your owl by no later than 31 July. \n" +
"\n" +
"    Yours sincerely, \n" +
"\n" +
"\n" +
"\n" +
"    Gandalf \n" +
"\n" +
"    King in the North "));
 
        //Close document
        document.close();
    }
}