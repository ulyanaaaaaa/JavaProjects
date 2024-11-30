package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import java.io.File;

public class MainTest {
    private Banks banks;

    @BeforeEach
    public void setUp() throws JAXBException {
        File file = new File("src/main/resources/banks.xml");
        JAXBContext jaxbContext = JAXBContext.newInstance(Banks.class);
        Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
        banks = (Banks) jaxbUnmarshaller.unmarshal(file);
    }

    @Test
    public void testUnmarshal() throws JAXBException {
        Assertions.assertNotNull(banks);
        Assertions.assertFalse(banks.getBanks().isEmpty());
    }

    @Test
    public void testDataProcessingStrategy() {
        DataProcessingStrategy strategy = DataProcessingFactory.getStrategy("totalCost");
        Assertions.assertNotNull(strategy);
        strategy.process(banks.getBanks());
    }

    @Test
    public void testReportBuilder() {
        ReportBuilder reportBuilder = new ReportBuilder();
        reportBuilder.addSection("Total Cost", "Calculated total cost here");
        String report = reportBuilder.build();
        Assertions.assertNotNull(report);
        Assertions.assertTrue(report.contains("Total Cost"));
    }
}
