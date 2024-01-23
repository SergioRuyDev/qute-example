package usecase;

import dto.ReceiptData;
import io.quarkus.qute.Template;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

import java.time.format.DateTimeFormatter;

@ApplicationScoped
public class ReceiptService {

    @Inject
    Template receipt;

    @Inject
    GenerationService generationService;

    public String generateReceipt(ReceiptData data) {
        return receipt
                .data("date", data.getDate().format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss")))
                .data("transactionId", data.getTransactionId())
                .data("establishmentName", data.getEstablishmentName())
                .data("isInstallments", data.isInstallments())
                .data("installment", data.getInstallment())
                .data("totalAmount", data.getTotalAmount())
                .data("amount", data.getAmount())
                .data("totalInstallments", data.getTotalInstallments())
                .data("paymentType", data.getPaymentType())
                .data("establishmentName", data.getEstablishmentName())
                .render();
    }
}
