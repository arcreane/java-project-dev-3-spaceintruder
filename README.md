# java-project-dev-3-spaceintruder
---
# Contenu du jeu
1. Un vaisseau
2. Nombre multiple d’enemis 
3. Score
4. Vie
5. Munitions 
---
# Règle du jeu
* Un vaisseau peut 
  * Se déplacer a droite 
  * Se déplacer a gauche 
  * Tirer des munitions 
  
* Les ennemis peuvent 
  * Tirer 
  
* Les munitions 
  * Elle sont illimités 
  
* Le score 
  * Augmente lorsque le vaisseau touche un ennemi 
* La vie
  * La vie baisse d'un point lorsque le vaisseau est touché par un ennemi 
  
---
# Les classes 
* ### Classe personnage 
* ### Classe vaisseau (hérite de la classe perssonage)
  * #### Attribut
    * Vie
    * Score
    
  * #### Méthodes 
    * Getters
      * Se déplacer a droite 
      * Se déplacer a gauche
      * Afficher la vie
      * Afficher le score
      * Tirer 
    * Setters
      * Modifier la vie
      * Modifier le score
  
* ### Classe ennemi (hérite de la classe perssonage)
  * #### Attribut
    Vie (force de tir a encaisser)
  * #### Méthodes 
    * Getters
    * Setters
      * Modifier la vie
  
---
# Explication 
1. Le jeu commence avec plusieurs ennemi positionné en haut _QUI NE BOUGENT PAS_ et qui tirent _VERS LE BAS_ de manière _ALEATOIRE_ 
2. Le vaisseau il y'en aura un seul positionné en bas il pourra se déplacer _A DROITE OU A GAUCHE_ et _TIRER_
3. Le vaisseau commence la partie avec 
_TROIS VIE_
4. Le vaisseau commence la partie avec une force de frappe de _CINQ POINTS_
5. Un ennemi a une force (vie) de _CINQ_ ou de _DIX_
6. Lorsque un ennemi est touché par le vaisseau perd _CINQ POINTS_ de force lorsque sa force atteint _ZERO_ il _DISPARAIT_ (mort)
7. Lorsque le vaisseau touche un ennemi le score du vaisseau est _AUGMENTÉ_
8. Lorsque le vaisseau est touché il _PERD UNE VIE_
9. Lorsque le vaisseau n'as plus de vie c'est la _FIN DE LA PARTIE_
10. Les ennemis _TIRENT_ tant que le vaisseau n'est pas détruit (plus de vie)
Réduire
