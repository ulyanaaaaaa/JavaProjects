import org.example.Product;
import org.example.Products;
import org.junit.jupiter.api.Test;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import java.io.File;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;
public class XMLParsingTest {
    @Test
    public void testXMLParsing() throws JAXBException {
        File file = new File("src/main/resources/products.xml");
        JAXBContext jaxbContext = JAXBContext.newInstance(Products.class);
        Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
        Products products = (Products) jaxbUnmarshaller.unmarshal(file);

        assertNotNull(products);
        List<Product> productList = products.getProducts();
        assertFalse(productList.isEmpty());
    }
}
