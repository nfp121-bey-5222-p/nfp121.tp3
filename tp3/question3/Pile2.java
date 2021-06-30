package question3;

import question1.PilePleineException;
import question1.PileVideException;

import java.util.Stack;

public class Pile2<T> implements PileI<T>{
    /** par délégation : utilisation de la class Stack */
    private Stack<T> stk;
    /** la capacité de la pile */
    private int capacité;

    /** Création d'une pile.
     * @param taille la "taille maximale" de la pile, doit être > 0
     */
    public Pile2(int taille){
        // à compléter
        if(taille<=0){taille=CAPACITE_PAR_DEFAUT;}
        this.stk=new Stack<T>();
        this.capacite=taille;
    }

    public Pile2(){
        // à compléter
        this(PileI.CAPACITE_PAR_DEFAUT);
    }

    public void empiler(T o) throws PilePleineException{
        // à compléter
        if(estPleine()){
            throw new PilePleineException();}
            this.stk.push(o);
    }

    public T depiler() throws PileVideException{
        // à compléter
        if(estVide())
        throw new PileVideException();
        return this.stk.pop();
    }

    public T sommet() throws PileVideException{
        // à compléter
        if(estVide())
        throw new PileVideException();
        return this.stk.peek();
    }
    public boolean estVide() {
        // a completer
        rreturn this.stk.empty();

    // recopier ici toutes les autres méthodes
    // qui ne sont pas modifiées en fonction
    // du type des éléments de la pile
    public int capacite(){
        return this.capacite()}
    public boolean estVide() {
        return this.stk.empty();}
      public boolean estPleine() {
        return this.stk.size()==this.capacite;} 
        public boolean equals(Object o) {
        // a completer
        if(this==o){return true;}
        if(!(o instanceof Pile2)){return false;}
        Pile p1=(Pile2)o;
        if(p1.taille()==this.taille() && p1.capacite()==this.capacite())
        {
            boolean estEgale=false;
            for(int i=stk.size()-1;i>=0;i--)
            {
                Object tmp=this.stk.get(i);
                boolean existe=false;
                for(int j=this.stk.size()-1;j>=0;j--)
                {
                    if((tmp==p1.stk.get(i))){existe=true;}
                }if(existe){estEgale=true;}
                else{return false;}
            }
            return true;
        }
        public String toString() {
        String s = "[";
        // a completer
        for(int i=this.stk.size()-1;i>=0;i--)
        {
            s+=this.stk.get(i).toString();
            if(i>0){
                s+==" , ";
            }
        }
        return s + "]";
    }
} // Pile2