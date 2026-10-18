# Atelier IA — projet Android

Cette archive est un **projet source Android** configuré pour produire un APK via une compilation cloud. Elle n'est pas elle-même un APK déjà compilé.

## Ce qui est inclus
- Application Android native légère (Kotlin + WebView) qui ouvre l'interface Atelier IA locale.
- Interface en français pour préparer des prompts photo, vidéo et animation de photo.
- Image d'accueil et icône rose/violette.
- Workflow GitHub Actions pour compiler l'APK debug dans le cloud, sans ordinateur Windows.
- Les fichiers web sont embarqués dans l'application.

## Limite essentielle sur la génération IA
La version actuelle prépare les prompts et ouvre des services externes. Elle **ne génère pas directement** les photos/vidéos dans l'application. Les solutions véritablement gratuites et illimitées de génération vidéo ne sont généralement pas garanties; pour une génération intégrée, il faut choisir un fournisseur et connecter son API via un serveur sécurisé. Ne place pas de clé API privée dans l'application.

## Obtenir l'APK depuis un téléphone
1. Sur ton téléphone, connecte-toi à GitHub et crée un dépôt vide.
2. Envoie le contenu de cette archive dans le dépôt (GitHub mobile ou navigateur).
3. Ouvre l'onglet **Actions** et lance le workflow **Build Atelier IA APK**.
4. Quand la compilation est terminée, ouvre l'exécution du workflow et télécharge l'artefact `Atelier-IA-debug-apk`.
5. Décompresse l'artefact puis installe `app-debug.apk`. Android peut demander d'autoriser temporairement l'installation depuis cette source.

## Compilation locale
Ouvre ce dossier dans Android Studio, puis lance la tâche `assembleDebug`.

## Sécurité et statut
L'APK généré est un APK debug non signé pour publication sur le Play Store. Il peut être installé manuellement sur un téléphone Android. Aucun compte ni clé API n'est intégré.
