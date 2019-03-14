
/**
 * Write a description of class HorizontaleBoot here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class HorizontaleBoot implements Boot
{
    private int positieX;
    private int positieY;
    private int grootte;    

    public HorizontaleBoot(int positieX, int positieY, int grootte){
        this.positieX = positieX;        
        this.positieY = positieY;
        this.grootte = grootte;
    }

    public HorizontaleBoot(){
        this(3,3,3);
    }

    public void toonBoot(){
        for(int i=0;i<grootte;i++){
            System.out.println((positieX+i)+","+positieY);
        }
    }

    public boolean isRaak(int x, int y){
        boolean raak = false;
        for(int i=0;i<grootte;i++){
            if((x == (positieX+i)) && (y == positieY)){
                raak = true;
            }
        }
        return raak;
    } 

    public boolean overlaptBoot(Boot testboot){
        boolean overlapt = false;
        for(int i=0;i<grootte;i++){
            if(testboot.isRaak((positieX+i),positieY)){
                overlapt = true;
            }
        }
        return overlapt;
    }
}
