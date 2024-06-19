import org.example.PointOfSale;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PointOfSaleTest {

    @BeforeEach
    void setUp() {
        PointOfSale pointOfSale = new PointOfSale();
        pointOfSale = null;
    }

    @Test
    @DisplayName("Class exists")
    void classExists() {
        PointOfSale pointOfSale = new PointOfSale();
    }

//    @Test
//    @DisplayName("Barcode is a String")
//    void barcodeIsNumber() {
//        PointOfSale pointOfSale = new PointOfSale();
//        String expected = "0";
//        String result = pointOfSale.scan(1);
//
//        assertEquals(result, expected);
//    }

    @Test
    @DisplayName("Barcode is an integer")
    void barcodeIsNumber12345() {
        PointOfSale pointOfSale = new PointOfSale();
        String expected = "$7.25";
        String result = pointOfSale.scan(12345);

        assertEquals(expected, result);
    }

    @Test
    @DisplayName("Barcode is an integer")
    void barcodeIsNumber23456() {
        PointOfSale pointOfSale = new PointOfSale();
        String expected = "$12.50";
        String result = pointOfSale.scan(23456);

        assertEquals(expected, result);
    }

    @Test
    @DisplayName("Barcode is an integer")
    void barcodeIsNumber99999() {
        PointOfSale pointOfSale = new PointOfSale();
        String expected = "Error: barcode not found";
        String result = pointOfSale.scan(99999);

        assertEquals(expected, result);
    }

    @Test
    @DisplayName("Barcode is an integer")
    void barcodeIsNumberEmpty() {
        PointOfSale pointOfSale = new PointOfSale();
        String expected = "Error: barcode not found";
        String result = pointOfSale.scan();

        assertEquals(expected, result);
    }
}
