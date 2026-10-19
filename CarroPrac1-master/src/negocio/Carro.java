package negocio;

public class Carro {
    private int potencia;
    private double velocidad;
    //atributo de clase
    private static int numCarros = 0;
    //constante de clase
    private static final double IVA = 0.15;

    public Carro(int potencia, double velocidad){
      /*  this.potencia = potencia;
        this.velocidad = velocidad;*/
        //si  los atributos tienen validaciones utilizo el set()
        setPotencia(potencia);
        setVelocidad(velocidad);
        numCarros++;
    }

    public Carro() {
        numCarros++;
    }

    public void setPotencia(int potencia){
        //almacenar solo si el dato es correcto
        if(potencia > 0)
            this.potencia = potencia;
    }

    public void setVelocidad(double velocidad){
        //actualizar si el dato es correcto sino setear el valor
        if(velocidad < 0)
            velocidad = 0;
        this.velocidad = velocidad;
    }

    public int getPotencia(){
        return potencia;
    }
    public double getVelocidad(){
        return velocidad;
    }

    public static int getNumCarros(){
        return numCarros;
    }
    public static double getIva(){
        return IVA;
    }

    public double calcularPrecioTotal(double precio){
        return precio + (precio * IVA);
    }
    public void acelerar(){
        velocidad += potencia;
    }

    void frenar(){
        velocidad /= 2;
    }
}