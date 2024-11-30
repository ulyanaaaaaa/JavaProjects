import org.example.*;
import org.junit.jupiter.api.Test;
import java.util.Arrays;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;
public class DataProcessingTest {
    @Test
    public void testTotalCostStrategy() {
        Product product1 = new Product();
        product1.setPrice(10.0);
        product1.setQuantity(2);

        Product product2 = new Product();
        product2.setPrice(5.0);
        product2.setQuantity(4);

        List<Product> productList = Arrays.asList(product1, product2);

        DataProcessingStrategy strategy = new TotalCostStrategy();
        strategy.process(productList);

        double expectedTotalCost = (10.0 * 2) + (5.0 * 4);
        assertEquals(expectedTotalCost, (10.0 * 2) + (5.0 * 4));
    }

    @Test
    public void testReportBuilder() {
        ReportBuilder reportBuilder = new ReportBuilder();
        reportBuilder.addSection("Title", "Content");

        String expectedReport = "Title\nContent\n";
        assertEquals(expectedReport, reportBuilder.build());
    }
}
