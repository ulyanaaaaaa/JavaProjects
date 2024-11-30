package org.example;

import javax.xml.transform.*;
import javax.xml.transform.stream.StreamResult;
import javax.xml.transform.stream.StreamSource;
import java.io.File;

public class XsltTransformer {
    public static void main(String[] args) {
        try {
            File xsltFile = new File("transform.xsl");
            File xmlFile = new File("library.xml");
            File htmlFile = new File("library.html");

            TransformerFactory factory = TransformerFactory.newInstance();
            Source xslt = new StreamSource(xsltFile);
            Transformer transformer = factory.newTransformer(xslt);

            Source text = new StreamSource(xmlFile);
            Result result = new StreamResult(htmlFile);
            transformer.transform(text, result);

            System.out.println("Преобразование завершено. Проверьте файл library.html.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
