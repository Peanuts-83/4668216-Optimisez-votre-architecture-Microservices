CREATE TABLE paiement
(
    id           INT PRIMARY KEY,
    id_commande  VARCHAR(10) NOT NULL,
    montant      INT NOT NULL,
    numero_carte VARCHAR(100) NOT NULL
);