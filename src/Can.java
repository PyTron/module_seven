/*
Implement a class with methods getSurfaceArea() and getVolume(). In the constructor supply the height and radius of the can.


*/
public class Can {
    private Double canHeight;
    private Double canRadius;
    Double pie = 3.145;
    public Can(Double canHeight, Double canRadius){
        this.canHeight = canHeight;
        this.canRadius = canRadius;
    }
    public Double getSurfaceArea(){
        //(2)(pi)(r)(r+h)
        Double area = (2.0)*(pie)*(canRadius)*(canRadius+canHeight);
        return area;
    }
    public Double getVolume(){
        Double volume = (2.0)*(Math.pow(canRadius, 2))*(canHeight);
        return volume;
    }
}
