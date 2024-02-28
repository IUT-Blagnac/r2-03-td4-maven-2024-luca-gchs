

public class codingDojo {
	// méthode Test Driven Development.
	public static void main(String[] args) {
		Pile maPile = new Pile(10);
        if (!maPile.est_vide()) System.out.println("NOK");

        maPile.empiler(5);
        if (maPile.est_vide()) System.out.println("NOK");

        int element = maPile.depiler();
        if (!maPile.est_vide()) System.out.println("NOK");
        if (element != 5) System.out.println("NOK");
        
        Pile maPilePleine = new Pile(1);
        maPilePleine.empiler(5);
        if (!maPilePleine.estPlein()) System.out.println("NOK"); 
        
        element = maPilePleine.sommet(); 
        if (element != 5) System.out.println("NOK");
        
        maPilePleine.vider(); 
        if (!maPile.est_vide()) System.out.println("NOK");
        
        
        /*AXIOMES*/
        
        Pile axiomePile = new Pile(5); 
        System.out.println(axiomePile.est_vide()); // (1) CréerPile().estVide() == VRAI
        System.out.println(axiomePile.empiler(2).est_vide()); //(2) CréerPile().empiler(e).estVide() == FAUX
        axiomePile.vider();
        axiomePile.empiler(2).depiler();
        System.out.println(axiomePile.est_vide()); //(3) p.estVide() => { p.empiler(e).depiler(); p.estVide() == VRAI }
        axiomePile.vider();
        System.out.println(axiomePile.empiler(3).sommet()); //(4) CréerPile().empiler(e).sommet() == e donc ici e = 3 
        axiomePile.vider();
        axiomePile.empiler(12).empiler(7).depiler(); 
        System.out.println(axiomePile.depiler()); //(5) p.empiler(a).empiler(e).depiler() => p.depiler() == a donc ici a = 12 
	}		
}

