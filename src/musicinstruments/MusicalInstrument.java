package musicinstruments;

/**
 * Created by amikhalnyuk on 18.03.2016.
 */
abstract class MusicalInstrument {
    public abstract String getType();

    @Override
    public String toString() {
        return "MusicalInstrument{" + getType() + "}";
    }
}
