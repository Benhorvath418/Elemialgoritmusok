/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package elemialgoritmusok;

/**
 *
 * @author user
 */
public class Elemialgoritmusok {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        List<Integer> vektor = new ArrayList<>();
        List<Integer> teszt = new ArrayList<>();
        for (int i = 0; i < 50; i++)
            teszt.add((int)(Math.random() * 900) + 1000);
        if (vanBenne200Alatti(vektor))
            System.out.println("Van benne 200 alatti.");
        else
        System.out.println("Nincs benne 200 alatti.");
        //Keresés teszt
        System.out.println(keresésElsőElem(vektor));
        System.out.println(keresésolsóElem(vektor));
        System.out.println(minKeres(vektor) + " - " + minimumHely(vektor));

    }
    
    /*
    Eldönbtés metódusa
    F - 200 alatti
    */
    private static boolean vanBenne200Alatti(List<Integer>vektor){
        boolean van = false;
        for (Integer elem : vektor){
            if (elem = 200) //F vizsgálat
                van = true;
        }
        return van;
    }
    /*
    Keresés metódusa
    F - osztható 101-gyel
    */
   static int keresésUtolsóElem(Lista<Integer>Lista){
       int index = -1;
       for (int i = 0; i < lista.size(); i++) {
           if (lista.get(i) % 101 == 0)
               index = i;
           break;
           
       }
   return index;
   }
   
/*
   Szélső érték keresée
   */
   static int maxKeres(List <Integer> lista){
       int index = 0;
       for(int i = 1; i < lista.size(); i++)
           if (lista.get(i) < lista.get(index))
               index = i;
            return index;
   }
   //Java, ha list van
   static int minimumHely (List<Integer>lista){
       TreeSet<Integer> temp = new Treeset<>();
       temp.addAll(lista);
       return lista.indexOf(temp.last());
   }
   static int maximumHely (List<Integer>lista){
       TreeSet<Integer> temp = new Treeset<>();
       temp.addAll(lista);
       return lista.indexOf(temp.last());
   }
   /*
   Összegzés
   F - páros
   */
   static int összegzés(List<Integer>lista){
       inf összeg = 0;
       for (integer elem : lista){
           if(elem % 2 == 0)
               összeg += elem;
       }
       return összeg;
   }
   /*
   Rendezés
   */
   static void rendezés(List<Integer>lista){
       Collections.sort(lista);
   }
   /*
   Összefuttatás
   */
   //Csak javas megvaósítás
   static List<Integer> összefuttat(List<Integer>Lista1 lista<Ineteger>list);
    List<Integer> eredmény = new Arraylist<>();
    eredmény.addAll(lista1);
    eredmény.addAll(lista2);
    return eredmémy;
}
        /*
        Kiválógatás
        adott F - tulajdonságú elemek kulcssokaságban történő elhelyezése
        F - 3-mal osztható
        */
static void List<Integer>kiválogat(List<Integer>lista){
List<Integer> eredmény = new Arraylist();
        for (Integer elem : lista){
            if (elem % 3 == 0)
                eredmeny.add(elem);
}
                return eredmény;
}
/*
Kiválogatás
*/
static List<Integer> halmazGyár(list<Integer>lista)
List<Integer> eredmény = new Arraylist();
List<Integer> temp = new Treeset();