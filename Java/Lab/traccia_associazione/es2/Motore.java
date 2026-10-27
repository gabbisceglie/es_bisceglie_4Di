package es2;
class Motore {
    
    private int cavalli;

    public Motore(int cavalli) { 
        this.cavalli = cavalli; 
    }

    public int getMotore() { 
        return cavalli; 
    }

    public void accendi() { 
        System.out.println("Motore da " + cavalli + " CV acceso"); 
    }
}