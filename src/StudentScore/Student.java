package StudentScore;

public class Student {
    // Atributos do aluno
    private String name;
    private float ac1;
    private float ac2;
    private float ag;
    private float af;
    private float average;
    private float sub;

    // -------------------------------- Inicio dos construtores --------------------------------

    public Student() {

    }
    public Student(String name, float ac1, float ac2, float ag, float af) {
        this.name = name;
        this.ac1 = ac1;
        this.ac2 = ac2;
        this.ag = ag;
        this.af = af;

    }

    // -------------------------------- Fim dos construtores --------------------------------




    // -------------------------------- Inicio dos metodos getter e setter --------------------------------
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getAc1() {
        return ac1;
    }

    public void setAc1(float ac1) {
        this.ac1 = ac1;
    }

    public float getAc2() {
        return ac2;
    }

    public void setAc2(float ac2) {
        this.ac2 = ac2;
    }

    public float getAg() {
        return ag;
    }

    public void setAg(float ag) {
        this.ag = ag;
    }

    public float getAf() {
        return af;
    }

    public void setAf(float af) {
        this.af = af;
    }

    public float getSub(float sub){
        return sub;
    }
    public void setSub(float sub){
        this.sub = sub;
    }

    public float getAverage() {
        return average;
    }

    public void setAverage(float average) {
        this.average = average;
    }

    // -------------------------------- Fim dos metodos getter e setter --------------------------------

    // -------------------------------- Inicio dos metodos comuns --------------------------------
    public float makeAverage() {
        this.average = (float)(this.ac1 * 0.15 + this.ac2 * 0.30 + this.ag * 0.10 + this.af * 0.45);

        return this.average;
    }

    public float makeSub() {
        this.sub = (float)((5 - (ac1*0.15 + ac2*0.3 + ag*0.1 )) / 0.45) ;
        return sub;
    }
}





   /* Mudar a media para calcular de acordo com a Facens; OK

    Indicar se o aluno esta aprovado ou não; OK

    Caso não esteja aprovado, mostrar quanto precisa tirar na sub ;

    */