package com.deepumohan.events.rsvpc.web;

import java.awt.Image;
import java.awt.image.RenderedImage;
import java.io.IOException;
import java.io.OutputStream;

import javax.annotation.Resource;
import javax.imageio.ImageIO;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.deepumohan.events.rsvpc.service.BarcodeService;

@RequestMapping("/barcodes")
@Controller
public class BarcodeController {

	@Autowired
	@Resource(name="barcodeServiceItextImpl")
	BarcodeService barcodeService;
		
	@RequestMapping(value="/image/{text}")
	public void getBarcodeImage(@PathVariable String text, HttpServletResponse response) throws IOException {
		OutputStream output = response.getOutputStream();
		Image image = barcodeService.getBarcodeImage(text);
		ImageIO.write((RenderedImage) image, "png", output);
	}
}
