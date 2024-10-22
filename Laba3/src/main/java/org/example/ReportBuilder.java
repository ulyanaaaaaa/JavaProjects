package org.example;

public class ReportBuilder {
    private StringBuilder report = new StringBuilder();

    public ReportBuilder addSection(String title, String content) {
        report.append(title).append("\n").append(content).append("\n");
        return this;
    }

    public String build() {
        return report.toString();
    }
}