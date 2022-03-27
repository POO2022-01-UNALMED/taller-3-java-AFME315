package taller3.televisores;

public class TV {
	private Marca marca;
	public int canal= 1;
	private int precio=500;
	public boolean estado;
	public int volumen=1;
	public Control control;
	private static int numTv;
	
	public TV(Marca marca,boolean estado) {
		this.marca=marca;
		this.estado=estado;
		TV.numTv++;
	}	
	public static void setNumTV(int num) {
		numTv = num;
	}
	public static int getNumTV() {
		return numTv;
	}
	public void setMarca(Marca marca) {
		this.marca=marca;
	}
	public Marca getMarca() {
		return marca;
	}
	public void setCanal(int canal) {
		if (this.estado==true && (canal>=1 && canal<=120)) {
			this.canal=canal;
		}
		
	}
	public int getCanal() {
		return canal;
	}
	public void setControl(Control control) {
		this.control=control;
	}
	public Control getControl() {
		return control;
	}
	public void setPrecio(int precio) {
		this.precio=precio;
	}
	public int getPrecio(){
		return precio;
	}
	public void setVolumen(int volumen){
		if (this.estado==true && (volumen>=1 && volumen <=7)) {
			this.volumen=volumen;
		}
	}
	public int getVolumen() {
		return volumen;
	}
	public void turnOn(boolean estado) {
		estado=true;
	}
	public void turnOff(boolean estado) {
		estado=false;
	}
	public boolean getEstado(){
		return estado;
	}
	public void canalUp(){
		if(this.estado==true && canal<120 ) {
			this.setCanal(this.canal+1);;
		}
	}
	public void canaldown(){
		if(this.estado==true && canal>1) {
			this.setCanal(this.canal-1);
		}
	}
	public void volumenUp() {
		if(this.estado==true && volumen<7){
			this.setVolumen(this.volumen+1);
			}	
		}
	public void volumenDown() {
		if(this.estado==true && volumen>1) {
			this.setVolumen(this.volumen-1);
		}
	}
}