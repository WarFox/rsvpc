package com.deepumohan.events.rsvpc.web;

import java.awt.Image;
import java.awt.image.RenderedImage;
import java.io.IOException;
import java.io.OutputStream;

import javax.annotation.Resource;
import javax.imageio.ImageIO;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.deepumohan.events.rsvpc.service.BarcodeService;
import com.itextpdf.text.DocumentException;

@RequestMapping("/barcodes")
@Controller
public class BarcodeController {

	@Autowired
	@Resource(name="barcodeServiceItextImpl")
	BarcodeService barcodeService;
	
	@RequestMapping(value="/{text}")
	public void createPdf(@PathVariable String text, HttpServletRequest request, HttpServletResponse response ) throws IOException, IllegalStateException, DocumentException {
		barcodeService.createPdf(text+".pdf");
	}
	
	@RequestMapping(value="/image/{text}")
	public void getBarcodeImage(@PathVariable String text, HttpServletResponse response) throws IOException {
		OutputStream output = response.getOutputStream();
		Image image = barcodeService.getBarcodeImage(text);
		ImageIO.write((RenderedImage) image, "png", output);
	}
}
