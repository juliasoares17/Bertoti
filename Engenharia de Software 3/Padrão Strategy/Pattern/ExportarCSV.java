public class ExportarCSV implements EstrategiaExportacao {
    @Override
    public void exportar(String conteudo) {
        System.out.println("Exportando conteúdo em CSV: " + conteudo);
    }
}

