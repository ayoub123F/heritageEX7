public class PayPal extends Paiement {
    private String adresseEmail;

    public PayPal(double montant, String numeroTransaction, String adresseEmail) {
        super(montant, numeroTransaction);
        this.adresseEmail = adresseEmail;
    }

    @Override
    public void effectuerPaiement(double montant) {
        System.out.println("Paiement de " + montant + " effectué via PayPal avec l'adresse email " + adresseEmail);
    }
}
