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

    @Test
    public void anotherProductFound() throws Exception {
        final Display display = new Display();
        final Sale sale = new Sale(display);

        sale.onBarcode("23456");

        assertEquals("$12.50", display.getText());
    }

    @Test
    public void productNotFound() throws Exception {

        final Display display = new Display();
        final Sale sale = new Sale(display);

        sale.onBarcode("99999");

        assertEquals("Product no found for 99999", display.getText());
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
            if ("12345".equals(barcode)) {
                display.setText("$7.95");
            } else if ("23456".equals(barcode)){
                display.setText("$12.50");
            } else {
                display.setText("Product no found for 99999");
            }
        }
    }
}
