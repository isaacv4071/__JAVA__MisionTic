
public class GradingSystem {
    private Student Estu[];

    public GradingSystem(Student Estu[]){
        this.Estu = Estu;
    }

    public Student[] getEstu() {
        return Estu;
    }

    public void setEstu(Student[] estu) {
        Estu = estu;
    }

    public float stat1() {
        float suma_ganados = 0;
        float promedio = 0;
        for (Student E : Estu) {
            if (E.getCalificacion() > 2.5 && E.getCalificacion() <= 5) {
                suma_ganados++;
            }
            promedio = suma_ganados / Estu.length;
        }
        return (promedio);
    }

    public int stat2() {
        int contador_insuficiente = 0;
        for (Student E : Estu) {
            if (E.getCalificacion() > 1 && E.getCalificacion() <= 2.5) {
                contador_insuficiente++;
            }
        }
        return(contador_insuficiente);
    }

    public String stat3() {
        String mensaje = "";
        float suma_geo = 0;
        float promedio_geometria = 0;
        float suma_mat = 0;
        float promedio_matematicas = 0;
        float suma_info = 0; 
        float promedio_informatica = 0;
        for (int i = 0; i< Estu.length; i++) {
            if (Estu[i].getGenero() == 0) {
                if (Estu[i].getMateria() == 1) {
                    suma_geo+=Estu[i].getCalificacion();
                }
                else if (Estu[i].getMateria() == 2){
                    suma_mat+=Estu[i].getCalificacion();
                }
                else{
                    suma_info+=Estu[i].getCalificacion();
                }
            } 
            promedio_geometria = suma_geo / Estu.length;
            promedio_matematicas = suma_mat / Estu.length;
            promedio_informatica = suma_info / Estu.length;
        }

        if(promedio_geometria<promedio_matematicas && promedio_geometria<promedio_informatica){
            mensaje = "geografia";
        }else if(promedio_matematicas<promedio_geometria && promedio_matematicas<promedio_informatica){
            mensaje = "matematicas";
        }else{
            mensaje = "informatica";
        }
        return(mensaje);
    }

    public String stat4() {
        String nombre = "";
        float mayor = 0;
        float name = 0;
        for (Student E : Estu) {
            if (E.getMateria() == 1) {
                if (E.getCalificacion() > mayor) {
                    mayor = E.getCalificacion();
                    name = E.getNombre();
                }
            }
        }
        // nombre
        if (name == 1) {
            nombre = "armando";
        } else if (name == 2) {
            nombre = "nicolas";
        } else if (name == 3) {
            nombre = "daniel";
        } else if (name == 4) {
            nombre = "maria";
        } else if (name == 5) {
            nombre = "marcela";
        } else if (name == 6) {
            nombre = "alexandra";
        }

        return(nombre);
    }
}