package VisitorPattern;

/**
 * Created by HP on 2/24/2015.
 */
public class Computer implements ComputerPart {

    ComputerPart [] parts;

    public Computer(){
        parts = new ComputerPart[]{new Mouse(),new Keyboard(),new Monitor()};
    }

    @Override
    public void accept(ComputerPartVisitor computerPartVisitor){
        for(int i = 0; i<parts.length; i++){
            parts[i].accept(computerPartVisitor);
        }
        computerPartVisitor.visit(this);
    }
}
