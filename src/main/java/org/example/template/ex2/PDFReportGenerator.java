package org.example.template.ex2;


public class PDFReportGenerator extends ReportGenerator {
    @Override
    protected void createHeader() {
        System.out.println("PDF Report Header");
    }

    @Override
    protected void generateContent() {
        System.out.println("Report Content");
    }

    @Override
    protected void createFooter() {
        System.out.println("PDF Report Footer");
    }
}
