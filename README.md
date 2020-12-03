# java-project-dev-3-spaceintruder
---
# Contenu du jeu
1. Un vaisseau
2. Nombre multiple d’enemis 
3. Score
4. Vie
5. Bouclier 
---
# Règle du jeu
* Un vaisseau peut 
  * Se déplacer horizontalement 
  * Tirer des munitions 
  
* Les ennemis peuvent 
  * Se déplacer en groupe selon un rythme prédéfinit 
  * Tirer 
  
* Les Boucliers 
  * Ils bloquent les missiles dans les deux sens, chaque pixel touché est détruit
  
* Le score 
  * Augmente lorsque le vaisseau touche un ennemi
  * Est dans un classement des 5 meilleurs scores si il est assez bon
  * Est stocké dans un fichié à part, créé, modifié ou supprimé par notre code

* La vie
  * La vie baisse d'un point lorsque le vaisseau est touché par un ennemi 
  
---
# Les classes 
* ### Classe affichable
  * #### Attribut
    * Coords
    * Aspect Visuel
   * #### Méthodes
    * Afficher

* ### Classe personnage (hérite de la classe affichable)
  * #### Attribut
    * Vie
  * #### Méthodes 
    * Getters
      * Se déplacer
      * Tirer 
    * Setters
      * Modifier la vie

* ### Classe vaisseau (hérite de la classe perssonage)
  * #### Attribut
    * Score
  * #### Méthodes 
    * Getters
      * Afficher la vie
      * Afficher le score
    * Setters
      * Modifier le score
  
* ### Classe ennemi (hérite de la classe personnage)

* ### Classe bouclier(hérite de la classe affichable)
  * #### Attribut
    * Area
  * #### Méthodes 
    * afficher la Structure

* ### Classe bloc de bouclier

  
---
# Explication 
1. Le jeu commence avec plusieurs ennemi positionné en haut _QUI BOUGENT_ et qui tirent _VERS LE BAS_ de manière _ALEATOIRE_ 
2. Le vaisseau il y'en aura un seul positionné en bas il pourra se déplacer _A DROITE OU A GAUCHE_ et _TIRER_
3. Le vaisseau commence la partie avec 
_TROIS VIE_
4. Les boucliers seront au nombre de _CINQ_
5. Un ennemi a une force (vie) de _CINQ_ ou de _DIX_
6. Lorsque un ennemi est touché par le vaisseau il perd _CINQ POINTS_ de vie lorsque sa vie atteint _ZERO_ il _DISPARAIT_ (mort)
7. Lorsque le vaisseau touche un ennemi le score du vaisseau est _AUGMENTÉ_
8. Lorsque le vaisseau est touché il _PERD UNE VIE_
9. Lorsque le bouclier est touché il _PERD UNE BLOC_
10. Lorsque le vaisseau n'as plus de vie c'est la _FIN DE LA PARTIE_
11. Les ennemis _TIRENT_ tant que le vaisseau n'est pas détruit (plus de vie)
Réduire
