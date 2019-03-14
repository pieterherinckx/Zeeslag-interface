import java.util.ArrayList;
import java.util.Random;

public class Zee {
    private int rijen;
    private int kolommen;
   
    private ArrayList<Boot> botenlijst;
    private Random rg;

    public Zee(int rijen, int kolommen) {
        this.rijen = rijen;
        this.kolommen = kolommen;
        this.botenlijst = new ArrayList<Boot>();
        this.rg =  new Random();
    }
   
    public void voegBootToe(Boot boot){
        botenlijst.add(boot);
    }
   
 
    public void toonBoten(){
        for (Boot bootel: botenlijst){
            bootel.toonBoot();
        }  
    }
   
    public boolean isRaak (int x, int y){
        boolean raak = false;  
        for (Boot bootel: botenlijst){
            if (bootel.isRaak(x,y)){
                raak = true;
            }
        } 
        return raak;   
    }
   
    public boolean overlaptBoot(Boot testboot){
        boolean overlapt = false;   
        for (Boot bootel: botenlijst){
            if (bootel.overlaptBoot(testboot)){
                overlapt = true;
            }
        }
        return overlapt;
    }

    public void willekeurigeBoot(){
        boolean horizontaal = rg.nextBoolean();
        int begin_x = rg.nextInt(kolommen);
        int begin_y = rg.nextInt(rijen);
        int grootte;
        Boot boot;
        if (horizontaal){
            grootte = rg.nextInt(kolommen - begin_x) + 1;
            boot = new HorizontaleBoot(begin_x, begin_y, grootte);
        }
        else{
            grootte = rg.nextInt(rijen - begin_y) + 1;
            boot = new VerticaleBoot(begin_x, begin_y, grootte);
        }
         voegBootToe(boot);
    }
}
