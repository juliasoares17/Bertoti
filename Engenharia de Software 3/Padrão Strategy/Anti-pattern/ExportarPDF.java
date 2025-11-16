public class ExportarPDF extends Exportador {
    
    public void exportar(String dados) {
        
        if (dados == null || dados.trim().isEmpty()) {
            System.out.println("Nenhum dado para exportar.");
            return;
        }

        System.out.println("Exportando em formato PDF: " + dados);

    }

}

