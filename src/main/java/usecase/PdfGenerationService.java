package usecase;

import jakarta.enterprise.context.ApplicationScoped;

import com.openhtmltopdf.pdfboxout.PdfRendererBuilder;


import java.io.ByteArrayOutputStream;

@ApplicationScoped
public class PdfGenerationService {

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
}
