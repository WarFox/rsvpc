/**
 * 
 */
package com.deepumohan.events.rsvpc.service;

import java.io.IOException;

import com.itextpdf.text.DocumentException;

/**
 * @author deepu
 *
 */
public class BarcodeServiceBarbecueImpl implements BarcodeService {

	/* (non-Javadoc)
	 * @see com.deepumohan.events.rsvpc.service.BarcodeService#createPdf(java.lang.String)
	 */
	@Override
	public void createPdf(String filename) throws IOException,
			DocumentException {
		// TODO Auto-generated method stub

	}

	@Override
	public java.awt.Image getBarcodeImage(String text) throws IOException {
		return null;
	}

}
