public class calculator {
    int x;
    int add_me_to_x;
    public calculator(int x,int add_me_to_x){
        this.x=x;
        this.add_me_to_x=add_me_to_x;

    }
    public int add(){
        return x+add_me_to_x;
    }
    public int sub (int z){
        return x-z;
    }
    
}
