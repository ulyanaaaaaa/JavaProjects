package org.example;

import org.w3c.dom.*;
import javax.xml.parsers.*;
import java.io.File;

public class DomParserExample {
    public static void main(String[] args) {
        try {
            File xmlFile = new File("library.xml");
            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
            Document doc = dBuilder.parse(xmlFile);
            doc.getDocumentElement().normalize();

            System.out.println("Корневой элемент: " + doc.getDocumentElement().getNodeName());

            NodeList bookList = doc.getElementsByTagName("book");
            for (int i = 0; i < bookList.getLength(); i++) {
                Node bookNode = bookList.item(i);
                if (bookNode.getNodeType() == Node.ELEMENT_NODE) {
                    Element bookElement = (Element) bookNode;
                    String title = bookElement.getElementsByTagName("title").item(0).getTextContent();
                    String author = bookElement.getElementsByTagName("author").item(0).getTextContent();
                    String year = bookElement.getElementsByTagName("year").item(0).getTextContent();
                    String price = bookElement.getElementsByTagName("price").item(0).getTextContent();

                    System.out.println("Книга: " + title + ", Автор: " + author + ", Год: " + year + ", Цена: " + price);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
