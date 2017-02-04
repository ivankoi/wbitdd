package com.ivankoi.wbitdd;

import org.junit.Ignore;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by ivank on 2/4/2017.
 */
public class SellOneItemTest {

    @Test
    public void productFound() throws Exception {
        final Display display = new Display();
        final Sale sale = new Sale(display);

        sale.onBarcode("12345");

        assertEquals("$7.95", display.getText());
    }

    @Ignore
    @Test
    public void anotherProductFound() throws Exception {
        final Display display = new Display();
        final Sale sale = new Sale(display);

        sale.onBarcode("23456");

        assertEquals("$12.50", display.getText());
    }


    public static class Display {

        private String text;

        public String getText() {
            return text;
        }

        public void setText(String string) {
            this.text = string;
        }
    }

    public static class Sale {
        private Display display;

        public Sale(Display display) {
            this.display = display;
        }

        public void onBarcode(String barcode) {
            display.setText("$7.95");
        }
    }
}
