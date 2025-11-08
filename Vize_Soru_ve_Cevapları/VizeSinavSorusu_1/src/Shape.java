public abstract class Shape implements Calculate {

    private String shapeName;

    public Shape(String shapeName) {
        this.shapeName = shapeName;
    }

    public String getShapeName() {
        return shapeName;
    }
}
