import com.sun.tools.javac.util.List;

/**
 * Created by jaredchu on 11/7/17.
 */
public class Farm {
    protected String farmName;

    private List<Duck> ducks;
    private List<Chicken> chickens;
    private List<Pig> pigs;

    public static Farm builder(){
        Farm farm = new Farm();
        farm.farmName = "another new farm";
        return farm;
    }

    public List<Duck> getDucks() {
        return ducks;
    }

    public void setDucks(List<Duck> ducks) {
        this.ducks = ducks;
    }

    public List<Chicken> getChickens() {
        return chickens;
    }

    public void setChickens(List<Chicken> chickens) {
        this.chickens = chickens;
    }

    public List<Pig> getPigs() {
        return pigs;
    }

    public void setPigs(List<Pig> pigs) {
        this.pigs = pigs;
    }

    public void addDuck(List<Duck> ducks){
        ducks.add(new Duck());
    }

    public void removeDuck(List<Duck> ducks, Duck duck1){
        ducks.remove(duck1);
    }
}
