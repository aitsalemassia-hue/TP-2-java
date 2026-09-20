public class frequenceMajoritaire {
     public static int elementMajoritaire(int[] t) {
          int n = t.length;
          int condidat =0;
          int compteur=0;
          for (int i=0;i<n;i++){
               int x=t[i];
               if(compteur==0){
                    condidat=x;
                    compteur=1;
               }else{
                    if(condidat==x){
                         compteur++;
                    }else{
                         compteur--;
                    }
               }

          }
          int nbOccurences=0;
          for(int i=0;i<n;i++){
               if(t[i]==condidat){
                    nbOccurences++;
               }
          } 
          if(nbOccurences>n/2){
               return condidat;
          }

     return -1;
}
public static void main(String[] args) {
          System.out.println("Test 1 :");
          int[] tableau = {3, 2, 3};
          int majoritaire = elementMajoritaire(tableau);
          if (majoritaire != -1) {
               System.out.println("L'élément majoritaire est : " + majoritaire);
          } else {
               System.out.println("Il n'y a pas d'élément majoritaire.");
          }

          System.out.println("Test 2 :");
          int[] tableau2 = {1, 2, 3, 4};
          int majoritaire2 = elementMajoritaire(tableau2);
          if (majoritaire2 != -1) {
               System.out.println("L'élément majoritaire est : " + majoritaire2);
          } else {
               System.out.println("Il n'y a pas d'élément majoritaire.");
          }

          System.out.println("Test 3 :");
          int[] tableau3 = {-1, -1, -1, 2, -2, 2};
          int majoritaire3 = elementMajoritaire(tableau3);
          if (majoritaire3 != -1) {
               System.out.println("L'élément majoritaire est : " + majoritaire3);
          } else {
               System.out.println("Il n'y a pas d'élément majoritaire.");
          }
     }
}
