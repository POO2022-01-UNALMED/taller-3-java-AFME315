package taller3.televisores;

public class Control {
	
	private TV tv;
	
	public void enlazar(TV tv) {
		this.tv=tv;
		tv.setControl(this);
	}
	public TV getTv(){
		return tv;
	}
	public void setTv(TV tv) {
		this.tv=tv;
	}
	public void setCanal(int canal) {
		if(tv.estado==true && (tv.canal>=1 && tv.canal<=120)) {
			tv.canal=canal;
		}
	}
	public void turnOn() {
		tv.estado=true;
	}
	public void turnOff() {
		tv.estado=false;
	}
	public void canalUp(){
		if(tv.estado==true && (tv.canal>=1 && tv.canal<120) ) {
			tv.setCanal(tv.canal+1);;
		}
	}
	public void canaldown(){
		if(tv.estado==true && (tv.canal>1 && tv.canal<=120)) {
			tv.setCanal(tv.canal-1);
		}
	}
	public void volumenUp() {
		if(tv.estado==true && (tv.volumen>=1 && tv.volumen<7)){
			tv.setVolumen(tv.volumen+1);
			}	
		}
	public void volumenDown() {
		if(tv.estado==true && (tv.volumen>1 && tv.volumen<=7)) {
			tv.setVolumen(tv.volumen-1);
		}
	}
}