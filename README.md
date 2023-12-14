# PatternProxy

Ce repositorie explore le pattern Proxy dans le contexte de la programmation logicielle. Le pattern Proxy est un patron de conception structurelle qui permet de contrôler l'accès à un objet en agissant comme une interface intermédiaire. Dans cette activité, nous avons implémenté différents types de proxy pour illustrer divers aspects de ce pattern.

## Cas d'utilisation

### 1. Security Proxy

Le Security Proxy agit comme un garde du corps pour l'objet réel, vérifiant les autorisations et les droits d'accès avant de permettre l'exécution de certaines actions.

<div align="center">
  <img src="https://github.com/2002marie03/PatternProxy/assets/95045123/05724cc4-5546-4837-b59a-9e612484ed0c" alt="Image 1">
</div>
<div align="center">
  <img src="https://github.com/2002marie03/PatternProxy/assets/95045123/abec5df0-51f2-4299-9418-de2136aba5ae" alt="Image 2">
</div>

### 2. Cache Proxy

Le Cache Proxy améliore les performances en ajoutant une mémoire cache. Il vérifie d'abord s'il peut fournir les résultats à partir de sa propre mémoire cache plutôt que d'accéder directement à l'objet réel.


<div align="center">
  <img src="https://github.com/2002marie03/PatternProxy/assets/95045123/3fd6e29b-de1f-4d82-bad6-b8abaecf7b7b" alt="Image 2">
</div>


### 3. Logging Proxy

Le Logging Proxy enregistre les informations importantes sur les appels à l'objet réel, fournissant une trace détaillée des actions effectuées, utile pour le débogage et la surveillance.


<div align="center">
  <img src="https://github.com/2002marie03/PatternProxy/assets/95045123/becdbe7e-f11d-487f-9578-ae83fe33216a" alt="Image 2">
</div>

### 4. Proxy de Proxy de Proxy

Nous avons exploré la possibilité de créer un enchaînement de proxys plus avancé. Le Proxy de Proxy de Proxy démontre comment les proxys peuvent être imbriqués, formant une cascade d'intermédiaires pour contrôler l'accès à l'objet final.
<div align="center">
  <img src="https://github.com/2002marie03/PatternProxy/assets/95045123/7ebf7210-419a-42d7-a3b6-dce187135921" alt="Image 2">
</div>


