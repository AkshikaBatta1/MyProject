package com.mysolutions;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;

import org.apache.pdfbox.multipdf.Splitter;
import org.apache.pdfbox.pdmodel.PDDocument;  

	public class PdfConverter { 
	   public static void main(String[] args) throws IOException { 
	      
	      
	      PDDocument doc = new PDDocument(); 
	      File f= new File("E:\\Akshi\\Eclipse-Workspaces\\SampleFiles\\File1.pdf");
	      FileOutputStream fOut = new FileOutputStream(f);  
	      doc.save(fOut);
	      //Instantiating Splitter class 
	      Splitter splitter = new Splitter(); 
	      
	      //splitting the pages of a PDF document 
	      List<PDDocument> Pages = splitter.split(new PDDocument(doc.getDocument())); 
	      System.out.println(Pages);
	      
	      //Creating an iterator 
	      Iterator<PDDocument> iterator = Pages.listIterator();         

	      //Saving each page as an individual document 
	      int i = 1; 
	      
	      while(iterator.hasNext()){ 
	         PDDocument pd = iterator.next(); 
	         System.out.println(pd);
	         pd.save("E:\\Akshi\\Eclipse-Workspaces\\SampleFiles\\MyPDF"+ i++ +".pdf");             
	      } 
	      System.out.println("PDF splitted");     
	   } 
	}

