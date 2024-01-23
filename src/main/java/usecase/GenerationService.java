package usecase;

import com.openhtmltopdf.pdfboxout.PdfRendererBuilder;
import dto.ReceiptData;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

import java.io.ByteArrayOutputStream;

@ApplicationScoped
public class GenerationService {

    @Inject
    ReceiptService receiptService;

    public byte[] generatePdfFromHtml(String htmlContent) throws Exception {
        try (ByteArrayOutputStream os = new ByteArrayOutputStream()) {
            PdfRendererBuilder builder = new PdfRendererBuilder();
            builder.useFastMode();
            builder.withHtmlContent(htmlContent, null);
            builder.toStream(os);
            builder.run();
            return os.toByteArray();
        }
    }

    public byte[] generateReceiptPdf(ReceiptData data) throws Exception {
        String htmlContent = receiptService.generateReceipt(data);
        return generatePdfFromHtml(htmlContent);
    }
}
