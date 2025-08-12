public class Main {
    public static void main(String[] args) {
        String dados = "Relatório de vendas 2025";

        ExportarCSV exportarCSV = new ExportarCSV();
        exportarCSV.exportar(dados);

        ExportarPDF exportarPDF = new ExportarPDF();
        exportarPDF.exportar(dados);
        
        ExportarXML exportarXML = new ExportarXML();
        exportarXML.exportar(dados);
    }
}
