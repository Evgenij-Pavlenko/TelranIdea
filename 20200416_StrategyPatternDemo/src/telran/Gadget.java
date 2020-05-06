package telran;

public class Gadget {

    private GadgetState state;

    public void setState(GadgetState state) {
        this.state = state;
    }

    public void doAction() {
        this.state.doAction();
    }

    //    private String state = ""; // is either ON or OFF
//
//    public void setState(String state) {
//        this.state = state;
//    }
//    public void doAction(){
//        if (state.equals("ON")){
//            System.out.println("I am switched ON");
//        } else{
//            System.out.println("I am switched OFF");
//        }
//    }
//
    public static void main(String[] args) {
        Gadget g = new Gadget();
        GadgetState onState = new EnabledState();
        GadgetState offState = new DisabledState();

        g.setState(onState);
        g.doAction();

        g.setState(offState);
        g.doAction();
    }
//    public static void main(String[] args) {
//        Gadget g = new Gadget();
//        g.setState("ON");
//        g.doAction();
//
//        g.setState("OFF");
//        g.doAction();
//}
}
