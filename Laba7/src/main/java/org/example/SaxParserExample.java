package org.example;

import org.xml.sax.*;
import org.xml.sax.helpers.DefaultHandler;

import javax.xml.parsers.*;

public class SaxParserExample extends DefaultHandler {
    private boolean title = false;
    private boolean author = false;
    private boolean year = false;
    private boolean price = false;

    public static void main(String[] args) {
        try {
            SAXParserFactory factory = SAXParserFactory.newInstance();
            SAXParser saxParser = factory.newSAXParser();
            SaxParserExample handler = new SaxParserExample();
            saxParser.parse("library.xml", handler);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void startElement(String uri, String localName, String qName, Attributes attributes) {
        switch (qName) {
            case "book":
                System.out.println("Book started");
                break;
            case "title":
                title = true;
                break;
            case "author":
                author = true;
                break;
            case "year":
                year = true;
                break;
            case "price":
                price = true;
                break;
        }
    }

    @Override
    public void endElement(String uri, String localName, String qName) {
        switch (qName) {
            case "book":
                System.out.println("Book ended");
                break;
        }
    }

    @Override
    public void characters(char ch[], int start, int length) {
        String value = new String(ch, start, length).trim();
        if (title) {
            System.out.println("Название книги: " + value);
            title = false;
        } else if (author) {
            System.out.println("Автор: " + value);
            author = false;
        } else if (year) {
            System.out.println("Год: " + value);
            year = false;
        } else if (price) {
            System.out.println("Цена: " + value);
            price = false;
        }
    }
}