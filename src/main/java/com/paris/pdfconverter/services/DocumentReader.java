package com.paris.pdfconverter.services;

import com.itextpdf.text.DocumentException;

import java.io.FileNotFoundException;
import java.io.IOException;

public interface DocumentReader {

    void readDocument() throws IOException, DocumentException;
}
