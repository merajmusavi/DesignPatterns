package org.example.template.ex2;

public class HtmlReportGenerator extends ReportGenerator {
    @Override
   protected void createHeader() {
        System.out.println("<html><head><title>HTML Report</title></head><body>");
    }

    @Override
    protected void generateContent() {
        System.out.println("<h1>Report Content</h1>");
        System.out.println("<p>This is the content of the HTML report.</p>");
    }

    @Override
    protected void createFooter() {
        System.out.println("</body></html>");
    }
}
