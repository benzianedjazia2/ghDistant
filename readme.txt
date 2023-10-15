Instructions pour utiliser le hook pre-commit :

1. Clonez le référentiel Git :
   - Exécutez la commande suivante dans le terminal :
     ```
     git clone URL_DU_REPOSITORY
     ```

2. Assurez-vous que le fichier pre-commit a les permissions d'exécution :
   - Dans le répertoire du référentiel Git, exécutez la commande suivante :
     ```
     chmod +x .git/hooks/pre-commit
     ```

3. Lorsque vous effectuez un commit, le hook vous demandera si vous souhaitez ajouter un fichier 'commitInfo.txt'. Vous verrez la question suivante :


4. Répondez comme suit :
- Tapez "y" et appuyez sur Enter pour ajouter le fichier 'commitInfo.txt'.
- Tapez "n" et appuyez sur Enter pour ne pas ajouter le fichier.
- Vous pouvez également simplement appuyer sur Enter pour choisir "n" par défaut.

Ces étapes vous permettront d'utiliser le hook "pre-commit" pour ajouter le fichier 'commitInfo.txt' à chaque commit, si nécessaire.

Pour toute question ou problème, veuillez contacter l'administrateur du référentiel Git ou l'équipe de développement.
