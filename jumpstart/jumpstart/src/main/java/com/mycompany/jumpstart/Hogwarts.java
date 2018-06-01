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
import java.util.Scanner;
 
/**
 * Simple Hello World example that i basicly copied in order to make Hogwarts
 */
@WrapToTest
public class Hogwarts {
    
    public static final String DEST = "results/chapter01/Hogwarts.pdf";
 
    public static void main(String args[]) throws IOException {
        
        File file = new File(DEST);
        file.getParentFile().mkdirs();
        new Hogwarts().createPdf(DEST);
    }
    
    
    public void createPdf(String dest) throws IOException {
        
        // ask for the students name and then gender 
        Scanner reader = new Scanner(System.in);
        System.out.print("Type a student's name: " );
        String name = reader.nextLine();
        System.out.print("Type a student's gender(Mr/Ms): " );
        String gender = reader.nextLine();
        
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
"    Dear " + gender + " " + name + " \n" +
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