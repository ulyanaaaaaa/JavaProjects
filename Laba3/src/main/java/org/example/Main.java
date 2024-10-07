package org.example;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import java.io.File;

public class Main {
    public static void main(String[] args) {
        try {
            File file = new File("src/main/resources/products.xml");

            JAXBContext jaxbContext = JAXBContext.newInstance(Products.class);

            Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
            Products products = (Products) jaxbUnmarshaller.unmarshal(file);

            DataProcessingStrategy strategy = DataProcessingFactory.getStrategy("totalCost");
            strategy.process(products.getProducts());

            ReportBuilder reportBuilder = new ReportBuilder();
            reportBuilder.addSection("Total Cost", "Calculated total cost here");

            System.out.println(reportBuilder.build());

        } catch (JAXBException e) {
            e.printStackTrace();
        }
    }
}