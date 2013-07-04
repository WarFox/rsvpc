package com.deepumohan.events.rsvpc.service;

import java.awt.Image;
import java.io.IOException;

public interface BarcodeService {

	public Image getBarcodeImage(String text) throws IOException;
}
