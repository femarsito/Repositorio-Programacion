package ut5_POO;

public class Televisor {
private int canal;
private int volumen;
private int color;
public Televisor() { 
	canal = 1;
	volumen = 5;
	color = 7;
	}
public Televisor(int valorCanal) {
	setCanal(valorCanal);
	volumen = 5;
	color = 7;
	}
public void subirCanal() { 
	canal = (canal + 1)%11; 
	}
public void bajarCanal() { 
	canal = (canal - 1 +11)%11; 
	}
public void subirVolumen() {
    if (volumen < 15) { 
        volumen++;
    }
}
public void bajarVolumen() {
    if (volumen > 0) { 
        volumen--;
    }
}
public void subirColor() {
    if (color < 7) { 
        color++;
    }
}
public void bajarColor() {
    if (color > 1) {
        color--;
    }
}
public int getCanal()	 { 
	return canal; 		
	}
public void setCanal(int valorCanal) {
	if (valorCanal < 0 || valorCanal > 10) {
		canal = 1;
	} else {
		canal = valorCanal;
	}
}
public int getVolummen() {
	return volumen;
}
public void setVolumen(int valorVolumen) {
	if (valorVolumen <0 || valorVolumen > 15) {
        volumen = 5;
    } else {
        volumen = valorVolumen;
    }
}
public int getColor() {
    return color;
}
public String toString() {
	return "El canal es " + canal + " y el volumen " + volumen;
}
}
