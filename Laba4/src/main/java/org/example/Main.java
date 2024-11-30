package org.example;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import java.io.File;

public class Main {
    public static void main(String[] args) {
        try {
            File file = new File("src/main/resources/banks.xml");

            JAXBContext jaxbContext = JAXBContext.newInstance(Banks.class);

            Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
            Banks banks = (Banks) jaxbUnmarshaller.unmarshal(file);


            DataProcessingStrategy strategy = DataProcessingFactory.getStrategy("totalCost");
            strategy.process(banks.getBanks());


            ReportBuilder reportBuilder = new ReportBuilder();
            reportBuilder.addSection("Total Cost", "Calculated total cost here");

            System.out.println(reportBuilder.build());

        } catch (JAXBException e) {
            e.printStackTrace();
        }
    }
}