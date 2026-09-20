public class afficherElementsManquants {
     public static void afficheElementsManquants(int[] t) {
     int n = t.length;
     boolean[] vu = new boolean[n + 1]; 
     for(int i=0; i < n; i++) {
          int x = t[i];
          if(x>= 1 && x <= n) {
               vu[x] = true;
          }
     }
     boolean aucunManquant = true;
     for (int k=1; k <= n; k++) {
          if (vu[k]== false) {
               System.out.println(k);
               aucunManquant = false;
          }
     
     }   
     if (aucunManquant== true) {
          System.out.println("Aucun élément manquant");
     } 
}
public static void main(String[] args) {
    System.out.println("Test 1 :");
    afficheElementsManquants(new int[]{1, 3, 3, 5});
    
    System.out.println("Test 2 :");
    afficheElementsManquants(new int[]{1, 2, 3, 4});
     
    System.out.println("Test 3 :");
    afficheElementsManquants(new int[]{4, 4,4, 4});

    System.out.println("Test 4 :");
    afficheElementsManquants(new int[]{3,2,1,1,5});

    System.out.println("Test 5 :");
    afficheElementsManquants(new int[]{1});
}
}

