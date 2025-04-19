#!/bin/bash

# Vérifie si l'environnement est fourni
if [ -z "$1" ]; then
  echo "Erreur: L'environnement de déploiement n'est pas spécifié (staging ou production)"
  exit 1
fi

ENVIRONMENT=$1

# Fonction pour déployer sur Staging
deploy_staging() {
  echo "🚀 Déploiement sur l'environnement Staging..."

  # Exemple de configuration pour l'environnement Staging
  export DB_URL="staging-db-url"
  export API_URL="https://staging-api.monsite.com"

  # Déployer les fichiers, par exemple avec rsync ou une commande personnalisée
  echo "Copie des fichiers sur le serveur Staging..."
  rsync -avz ./dist/ user@staging-server:/path/to/deployment/folder

  # D'autres étapes de déploiement spécifiques à Staging
  echo "Déploiement terminé sur Staging."
}

# Fonction pour déployer sur Production
deploy_production() {
  echo "🚚 Déploiement sur l'environnement Production..."

  # Exemple de configuration pour l'environnement Production
  export DB_URL="production-db-url"
  export API_URL="https://api.monsite.com"

  # Déployer les fichiers, par exemple avec rsync ou une commande personnalisée
  echo "Copie des fichiers sur le serveur de Production..."
  rsync -avz ./dist/ user@production-server:/path/to/deployment/folder

  # D'autres étapes de déploiement spécifiques à Production
  echo "Déploiement terminé sur Production."
}

# Choix de l'environnement
if [ "$ENVIRONMENT" == "staging" ]; then
  deploy_staging
elif [ "$ENVIRONMENT" == "production" ]; then
  deploy_production
else
  echo "Erreur: Environnement inconnu '$ENVIRONMENT'. Utilisez 'staging' ou 'production'."
  exit 1
fi
