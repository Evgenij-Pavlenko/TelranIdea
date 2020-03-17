import java.util.Objects;

public class Table {
    private String color;
    private int width;
    private int legth;
    private int height;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getLegth() {
        return legth;
    }

    public void setLegth(int legth) {
        this.legth = legth;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public Table(String color, int width, int leght, int heigt) {
        this.color = color;
        this.width = width;
        this.legth = leght;
        this.height = heigt;
    }

/*    *//*    @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (!(o instanceof Table)) return false;
            Table table = (Table) o;
            return width == table.width &&
                    legth == table.legth &&
                    height == table.height &&
                    color.equals(table.color);
        }

        @Override
        public int hashCode() {
            return Objects.hash(color, width, legth, height);
        }*/
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if ((o == null) || !(o instanceof Table)) return false;
        Table table = (Table) o;
        if (width != table.width) return false;
        if (legth != table.legth) return false;
        if (height != table.height) return false;
        return color != null ? color.equals(table.color) : table.color == null;
    }

    @Override
    public int hashCode() {
        int result = color != null ? color.hashCode() : 0;
        result = 31 * result + width;
        result = 31 * result + legth;
        result = 31 * result + height;
        return result;
    }

    @Override
    public String toString() {
        return "Table{" +
                "color='" + color + '\'' +
                ", width=" + width +
                ", leght=" + legth +
                ", heigt=" + height +
                '}';
    }

}
