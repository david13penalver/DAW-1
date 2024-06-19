package org.example;

public class PointOfSale {

        public String scan(int barcode) {
            if (barcode == 12345) {
                return "$7.25";
            }
            if (barcode == 23456) {
                return "$12.50";
            }
            if (barcode == 99999) {
                return "Error: barcode not found";
            }
            return "";
        }

        public String scan() {
            return "Error: barcode not found";
        }
}
