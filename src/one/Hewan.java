package one;

abstract class Hewan {
    protected String jenisSuara;
    protected Boolean isMammal;
    public String bersuara(){
        return jenisSuara;
    }
    public String isMammal(){
        return (isMammal) ? (this.getClass().getName() + " adalah Mamalia")     //Percabangan
                : (this.getClass().getName() + " adalah bukan Mamalia");
    }
}
