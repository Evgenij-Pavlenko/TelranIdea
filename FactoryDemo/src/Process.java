public class Process {
    private String action;
    private ImageActionFactory factory;

    public Process(String fileName, ImageActionFactory factory) {
        this.action = fileName;
        this.factory = factory;
    }

    public void execute(){
        ImageAction imageAction = factory.getImageAction(action);
        if (imageAction != null) {
            imageAction.doAction();
        } else {
            System.out.println("no actionfound" + action);
        }
    }
}
