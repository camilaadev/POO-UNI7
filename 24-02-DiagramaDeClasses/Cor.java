public class Cor() {
  private int red;
  private int green;
  private int blue;

   public Cor(int red, int green, int blue) {
    this.red = red;
    this.green = green;
    this.blue = blue;
}

  public void setRed(int red){
    this.red = red;
  }
   public void setGreen(int green){
    this.green = green;
  }
   public void setBlue(int blue){
    this.blue = blue;
  }
  public int getRed(){
      return this.red;
  }
  public int getGreen(){
      return this.green;
  }
  public int getBlue(){
      return this.blue;
  }
}