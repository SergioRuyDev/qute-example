package framework;

import dto.ReceiptData;
import jakarta.inject.Inject;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
import usecase.ReceiptService;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Path("/receipt")
public class ReceiptResource {

    @Inject
    private ReceiptService receiptService;

    @GET
    @Produces(MediaType.TEXT_HTML)
    public Response getReceipt() {
        ReceiptData mockReceiptData = new ReceiptData();
        mockReceiptData.setDate(LocalDateTime.now());
        mockReceiptData.setTransactionId("123456789");
        mockReceiptData.setEstablishmentName("Abercrombie & Fitch");
        mockReceiptData.setInstallments(true);
        mockReceiptData.setInstallment(1);
        mockReceiptData.setTotalInstallments(2);
        mockReceiptData.setTotalAmount(BigDecimal.valueOf(200.00));
        mockReceiptData.setAmount(BigDecimal.valueOf(100.00));
        mockReceiptData.setPaymentType("PIX");
        String receipt = receiptService.generateReceipt(mockReceiptData);

        return Response.ok(receipt).build();
    }
}
