public class HorizontaleBoot implements Boot {
    private int x;
    private int y;
    private int grootte;
    
    public HorizontaleBoot(int x, int y, int grootte){
        this.x = x;
        this.y = y;
        this.grootte = grootte;
    }
    
    public void toonBoot(){      
        for (int i = 0; i<grootte; i++){
            System.out.println((x+i) + "," + y);
        }
    }
    
    public boolean isRaak(int raakX, int raakY){
        boolean raak = false;       
        for (int i = 0; i<grootte; i++){
            if((raakX == (x+i)) && (raakY == y)){
                raak = true;
            }
        }        
        return raak;
    }
    
    public boolean overlaptBoot(Boot testboot){
        boolean overlapt = false;    
        for (int i = 0; i<grootte; i++){
            if(testboot.isRaak((x+i),y)){
                overlapt = true;
            }
        }        
        return overlapt;
    }

}