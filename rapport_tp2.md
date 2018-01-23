Mathieu VINCENT

Rapport TP2 - Système

Question A :

	Le patron lecteur/rédacteur n'est pas approprié car le lecteur va attendre activement que le rédacteur lui fournisse du contenu. Le processus n'est donc pas stoppé lorsqu'il ne fait rien.
Le patron producteur/consommateur se prête mieux au sujet car le consommateur va être stoppé lorsque le producteur n'aura rien à lui fournir. Dès que le producteur pourra de nouveau fournir quelque chose au consommateur, il va l'en informer et le consommateur se réveillera pour consommer ce qui lui est fournis.


Question B :
	Les threads sont lancés par le main de Tp2.
	La classe Patisserie est le moniteur.
