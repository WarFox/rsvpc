package com.deepumohan.events.rsvpc.service;

import java.awt.Image;
import java.io.IOException;

import com.itextpdf.text.DocumentException;

public interface BarcodeService {
	
	public void createPdf(String filename) throws IOException, DocumentException;
	
	public Image getBarcodeImage(String text) throws IOException;
}
