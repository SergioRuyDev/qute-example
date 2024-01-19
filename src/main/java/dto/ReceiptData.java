package dto;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.Objects;

public class ReceiptData {

    private LocalDateTime date;
    private String establishmentName;
    private String transactionId;
    private boolean isInstallments;
    private int installment;
    private int totalInstallments;
    private BigDecimal amount;
    private BigDecimal totalAmount;
    private String paymentType;

    public ReceiptData() {
    }

    public ReceiptData(LocalDateTime date, String establishmentName, String transactionId, boolean isInstallments, int installment,
                       int totalInstallments, BigDecimal amount, BigDecimal totalAmount, String paymentType) {
        this.date = date;
        this.establishmentName = establishmentName;
        this.transactionId = transactionId;
        this.isInstallments = isInstallments;
        this.installment = installment;
        this.totalInstallments = totalInstallments;
        this.amount = amount;
        this.totalAmount = totalAmount;
        this.paymentType = paymentType;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public void setDate(LocalDateTime date) {
        this.date = date;
    }

    public String getEstablishmentName() {
        return establishmentName;
    }

    public void setEstablishmentName(String establishmentName) {
        this.establishmentName = establishmentName;
    }

    public String getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId;
    }

    public boolean isInstallments() {
        return isInstallments;
    }

    public void setInstallments(boolean installments) {
        isInstallments = installments;
    }

    public int getInstallment() {
        return installment;
    }

    public void setInstallment(int installment) {
        this.installment = installment;
    }

    public int getTotalInstallments() {
        return totalInstallments;
    }

    public void setTotalInstallments(int totalInstallments) {
        this.totalInstallments = totalInstallments;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public BigDecimal getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(BigDecimal totalAmount) {
        this.totalAmount = totalAmount;
    }

    public String getPaymentType() {
        return paymentType;
    }

    public void setPaymentType(String paymentType) {
        this.paymentType = paymentType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ReceiptData that = (ReceiptData) o;
        return isInstallments == that.isInstallments
                && installment == that.installment
                && totalInstallments == that.totalInstallments
                && Objects.equals(date, that.date)
                && Objects.equals(establishmentName, that.establishmentName)
                && Objects.equals(transactionId, that.transactionId)
                && Objects.equals(amount, that.amount)
                && Objects.equals(totalAmount, that.totalAmount)
                && Objects.equals(paymentType, that.paymentType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(date, establishmentName, transactionId, isInstallments, installment, totalInstallments, amount,
                totalAmount, paymentType);
    }

    @Override
    public String toString() {
        return "ReceiptData{" +
                "date=" + date +
                ", establishmentName='" + establishmentName + '\'' +
                ", transactionId='" + transactionId + '\'' +
                ", isInstallments=" + isInstallments +
                ", installment=" + installment +
                ", totalInstallments=" + totalInstallments +
                ", amount=" + amount +
                ", totalAmount=" + totalAmount +
                ", paymentType='" + paymentType + '\'' +
                '}';
    }
}
