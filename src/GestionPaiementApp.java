public class GestionPaiementApp {
    public static void main(String[] args) {
        // Création des paiements
        Paiement carteCredit = new CarteCredit(100.0, "123456", "1234 5678 9012 3456");
        Paiement paypal = new PayPal(50.0, "789012", "john.doe@example.com");

        // Création des commandes
        Commande commande1 = new Commande(100.0, carteCredit);
        Commande commande2 = new Commande(50.0, paypal);

        // Traitement des paiements
        commande1.processPayment();
        commande2.processPayment();
    }
}
