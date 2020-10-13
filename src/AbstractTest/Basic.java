package AbstractTest;

public abstract class Basic {

    private String spllName;
    private int level;

    public void setSpllName(String s){
        this.spllName=s;
    }

    public String getSpellName(){
        return spllName;
    }
    abstract void spell();



}
