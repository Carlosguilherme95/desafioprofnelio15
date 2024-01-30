import java.util.Scanner;

public class Glicose {
    private Float glicemia;

    public void classificacaoGlicose(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite a sua glicemia");
        glicemia = Float.valueOf(scanner.nextLine());
        avaliandoGlicemia();
    }
    public void avaliandoGlicemia(){
        if(glicemia <= 100){
            System.out.println("glicemia normal");
        } else if (glicemia > 100 && glicemia <= 140) {
            System.out.println("glicemia elevada");
        } else{
            System.out.println("você está com diabetes");
        }
    }
    public Float getGlicemia() {
        return glicemia;
    }

    public void setGlicemia(Float glicemia) {
        this.glicemia = glicemia;
    }
}
