package com.paris.pdfconverter.services.impl;

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.pdf.PdfWriter;
import com.itextpdf.tool.xml.XMLWorkerHelper;
import com.paris.pdfconverter.services.DocumentReader;
import lombok.extern.java.Log;
import org.springframework.core.io.ClassPathResource;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.io.FileOutputStream;
import java.io.IOException;

@Service("documentReader")
@Log
public class DocumentReaderImpl implements DocumentReader {

    @PostConstruct
    @Override
    public void readDocument() throws IOException, DocumentException {
        Document document = new Document();
        PdfWriter pdfWriter = PdfWriter.getInstance(document, new FileOutputStream("output.pdf"));
        document.open();

        XMLWorkerHelper.getInstance()
                       .parseXHtml(pdfWriter, document, new ClassPathResource("document.html").getInputStream());

        document.close();
    }

}
