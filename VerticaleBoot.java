
/**
 * Write a description of class VerticaleBoot here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class VerticaleBoot implements Boot
{
    private int positieX;
    private int positieY;
    private int grootte;

    public VerticaleBoot(int positieX, int positieY, int grootte){
        this.positieX = positieX;        
        this.positieY = positieY;
        this.grootte = grootte;
    }

    public VerticaleBoot(){
        this(6,5,4);
    }

    public void toonBoot(){
        for(int i=0;i<grootte;i++){  
            System.out.println(positieX+","+(positieY+i)); 
        }
    }

    public boolean isRaak(int x, int y){
        boolean raak = false;
        for(int i=0;i<grootte;i++){
            if((x == positieX) && (y == (positieY+i))){
                raak = true;
            } 
        }
        return raak;
    } 

    public boolean overlaptBoot(Boot testboot){
        boolean overlapt = false;
        for(int i=0;i<grootte;i++){
            if(testboot.isRaak(positieX,(positieY+i))){
                overlapt = true;
            }            
        }
        return overlapt;
    }
}
