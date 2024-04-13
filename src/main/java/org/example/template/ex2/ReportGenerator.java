package org.example.template.ex2;

abstract class ReportGenerator {
    public final void generateReport() {
        createHeader();
        generateContent();
        createFooter();
    }

   protected abstract void createHeader();

    protected abstract void generateContent();

    protected abstract void createFooter();


}
