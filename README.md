# Builder

Exemples du patron de conception Builder en Java : une fabrication de pizzas et une configuration de PC.

## Structure

Les sources sont dans `src` :

- `cours.modeles`, `cours.abstractions` et `cours.builders` : exemple Pizza et ses monteurs.
- `cours` : directeur et client de l'exemple Pizza.
- `variante.modeles` : produit `Computer`.
- `variante.abstractions` : interface abstraite du monteur fluide `ComputerBuilder`.
- `variante.builders` : monteur configurable `CustomComputerBuilder`, dont les méthodes acceptent les valeurs et retournent le monteur pour permettre le chaînage.
- `variante` : `Configurator` pour les configurations prédéfinies et `Client` pour illustrer aussi une configuration personnalisée.

Les classes compilées sont générées dans `bin`.

## Exécuter dans VS Code

1. Ouvrir le dossier du dépôt dans VS Code et installer l'extension **Extension Pack for Java** si nécessaire.
2. Ouvrir `src/variante/Client.java`.
3. Cliquer sur **Run** au-dessus de la méthode `main` pour compiler et exécuter la variante PC.

Pour exécuter l'exemple Pizza, ouvrir `src/cours/Client.java` et utiliser **Run** de la même façon. La configuration du projet utilise `src` comme dossier source et `bin` comme dossier de sortie.

## Compiler et exécuter dans le terminal

Depuis la racine du dépôt, avec un JDK installé, compiler et lancer la variante PC dans PowerShell :

```powershell
javac -sourcepath src -d bin src\variante\Client.java
java -cp bin variante.Client
```

Pour compiler et lancer l'exemple Pizza :

```powershell
javac -sourcepath src -d bin src\cours\Client.java
java -cp bin cours.Client
```
