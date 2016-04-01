package musicinstruments;

/**
 * Created by amikhalnyuk on 18.03.2016.
 */
class MusicStore {
    int gitar;
    int piano;

    public int getGitar() {
        return gitar;
    }

    public void setGitar(int gitar) {
        this.gitar = gitar;
    }

    public int getPiano() {
        return piano;
    }

    public void setPiano(int piano) {
        this.piano = piano;
    }

    @Override
    public String toString() {
        return "MusicStore{" +
                "piano=" + piano +
                ", gitar=" + gitar +
                '}';
    }
}
