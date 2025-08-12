public class ExportarPDF implements EstrategiaExportacao {
    @Override
    public void exportar(String conteudo) {
        System.out.println("Exportando conteúdo em PDF: " + conteudo);
    }
}

