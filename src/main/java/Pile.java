package TP2;

public class Pile {

	private int tabElement[]; 
	private int sommet; 
	
	Pile(int pfVal) {
		this.tabElement = new int[pfVal]; 
		this.sommet = -1; 
	}
	
	Pile() {
		this.tabElement = new int[100]; 
		this.sommet = -1; 
	}
	
	/**
	 * Permet de savoir si une pile est vide ou non
	 * @return retourne true si elle vide, false sinon
	 */
	public boolean est_vide() {
		if (this.sommet == -1) {
			return true; 
		}
		return false;
	}
	
	/**
	 * ¨Permet d'empiler un élément dans la pile
	 * @param pfElem
	 * @return retourne la Pile
	 */
	public Pile empiler(int pfElem) {
		this.sommet++; 
		this.tabElement[this.sommet] = pfElem; 
		return this;  
	}
	/**
	 * ¨Permet de dépiler un élément dans la pile
	 * @return retourne la Pile
	 * @param attention PREC : p.depiler() valide Si et Seulement Si p.estVide() == FAUX
	 */
	public int depiler() {
		this.sommet--; 
		return tabElement[this.sommet+1];
	}
	/**
	 * Permet de déterminer à l'aide d'un booléen si la pile est pleine ou pas 
	 * @return revoie true si la pile est pleine 
	 */
	public boolean estPlein() {
		if (this.sommet == this.tabElement.length-1){
			return true; 
		}
		return false;
	}
	/**
	 * Permet d'obtenir le sommet de la pile 
	 * @return retourne la valeur au sommet de la pile 
	 * @param attention PREC : p.sommet() valide Si et Seulement Si p.estVide() == FAUX
	 */
	public int sommet() {
		return this.tabElement[this.sommet];
	}
	/**
	 * Permet de complétement vider la pile
	 */
	public void vider() {
		this.sommet = -1; 
	}

}
