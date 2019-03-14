public class VerticaleBoot implements Boot {
    private int x;
    private int y;
    private int grootte;
    
    public VerticaleBoot(int x, int y, int grootte){
        this.x = x;
        this.y = y;
        this.grootte = grootte;
    }
    
    public void toonBoot(){      
        for (int i = 0; i<grootte; i++){
            System.out.println(x + "," + (y+i));
        }
    }
    
    public boolean isRaak(int raakX, int raakY){
        boolean raak = false;   
        for (int i = 0; i<grootte; i++){
            if((raakX == x) && (raakY == (y+i))){
                raak = true;
            }
        }        
        return raak;
    }
    
    public boolean overlaptBoot(Boot testboot){
        boolean overlapt = false;
        for (int i = 0; i<grootte; i++){
            if(testboot.isRaak(x,(y+i))){
                overlapt = true;
            }
        }        
        return overlapt;
    }

}