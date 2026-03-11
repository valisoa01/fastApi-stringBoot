
#TP : Migration d'une API de Gestion de Réservations (FastAPI vers Spring Boot)#
📌 Présentation du Projet
Ce projet consiste à migrer une API REST de gestion de réservations hôtelières initialement conçue avec FastAPI vers le framework Spring Boot. L'objectif est de mettre en pratique les concepts fondamentaux de Spring Boot (Controllers, Services, Modèles) tout en respectant les contraintes métier d'une évaluation académique (PROG2-API).

📖 Contexte Métier
L'application permet à un hôtel de gérer les réservations de ses chambres. Le système doit garantir qu'une chambre ne peut pas être réservée deux fois à la même date.

Attributs d'une réservation :
Une réservation est composée des informations suivantes :

Client : Nom, numéro de téléphone et adresse email.

Chambre : Numéro de chambre (entier) et description.

Date : Date de la réservation (ex: 05/09/2025).

🛠️ Fonctionnalités à Implémenter (Points 5-a-b-c-d)
L'API doit exposer les points d'accès suivants, avec un stockage des données en mémoire vive (In-Memory) :

GET /booking : Récupérer la liste complète des réservations enregistrées.

POST /booking : Créer une nouvelle réservation.

Le système vérifie si le numéro de chambre est disponible à la date demandée.

Si la chambre est déjà prise, l'API retourne un message d'erreur avec le code de statut approprié.

Validation (Bonus) : Les numéros de chambres sont limités à l'intervalle 1 à 9. Une erreur spécifique et un code de statut adapté doivent être renvoyés si le numéro est hors de cette plage.

🚀 Technologies Utilisées
Java (version à préciser, ex: 17 ou 21)

Spring Boot 3

Spring Web (pour les contrôleurs REST)

Maven/Gradle (gestionnaire de dépendances)

Conseil pour ton apprentissage :
Puisque tu apprends Spring Boot, pense à bien séparer tes couches :

controller pour gérer les requêtes HTTP.

model (ou dto) pour tes objets Booking, Customer et Room.

service pour la logique métier (notamment la vérification de la disponibilité de la chambre).
