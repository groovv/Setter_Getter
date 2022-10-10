class Persegi{
    double S;
  
    public double getS(){
      return this.S;
    }
    public void setS(double S){
      this.S = S;
    }

    public double hitungKeliling(){
      return S*4;
    }
    public double hitungLuas(){
      return S*S;
    }
  }
  
  class PPanjang{
    double P, L; 
  
    public double getP(){
      return this.P;
    }
    public void setP(double P){
      this.P = P;
    }
  
    public double getL(){
      return this.L;
    }
    public void setL(double L){
      this.L = L;
    }
  
    public double hitungKeliling(){
      return 2*(P+L);
    }
    public double hitungLuas(){                                                                                                                                         
      return P*L;
    }
  
  }           
  
  public class Main     {
    public static void main(String[] args) {
  
      System.out.println("   + Persegi +");
      Persegi rumus = new Persegi();
      rumus.setS(8);
      System.out.println("Sisi     : " + rumus.getS());
      System.out.println("Keliling : " + rumus.hitungKeliling());
      System.out.println("Luas     : " + rumus.hitungLuas());
  
      System.out.println("+ Persegi Panjang +");
      PPanjang rumusP = new PPanjang();
      rumusP.setP(7);
      rumusP.setL(9);
      System.out.println("Panjang  : " + rumusP.getP());
      System.out.println("Lebar    : " + rumusP.getL());
      System.out.println("Keliling : " + rumusP.hitungKeliling());
      System.out.println("Luas     : " + rumusP.hitungLuas());
  
  
    }
  }