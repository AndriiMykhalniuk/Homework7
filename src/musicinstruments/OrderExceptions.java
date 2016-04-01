package musicinstruments;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by amikhalnyuk on 18.03.2016.
 */
public class OrderExceptions {

    public static void main(String[] args) {
        MusicStore store = new MusicStore();
        store.setPiano(50);
        store.setGitar(30);

        System.out.println(store);

        Map<String, Integer> order = new HashMap<>();
        order.put("piano", 45);
        order.put("gitar", 34);

        List<musicinstruments.MusicalInstrument> pianoToRemove = prepareOrder(store, order);
        System.out.println("removed piano: " + order.get("piano"));

        System.out.println(store);


    }

    // МНЕ ТЯЖЕЛО ПОНЯТЬ ЧТО ХОТЯТ ОТ МЕНЯ В РАМКАХ ЄТОГО ЗАДАНИЯ
    // ПРОШУ ВАС ВИКТОРИЯ ДЛЯ МЕНЯ СДЕЛАТЬ ПОЯСНЕНИЕ


    private static List<musicinstruments.MusicalInstrument> prepareOrder(MusicStore shop, Map<String, Integer> order) {
        int numberOfPianoToRemove = order.get("piano");
        int numberOfGitarToRemove = order.get("gitar");

        if (shop.getPiano() < numberOfPianoToRemove) throw new IllegalStateException("Not enought piano");
        if (shop.getGitar() < numberOfGitarToRemove) throw new IllegalStateException("Not enought guitar");

        shop.setPiano(shop.getPiano() - numberOfPianoToRemove);
        shop.setGitar(shop.getGitar() - numberOfGitarToRemove);

        List<musicinstruments.MusicalInstrument> result = new ArrayList<>();
        for (int i = 0; i < numberOfPianoToRemove; i++) {
            result.add(new Piano());
        }
        for (int i = 0; i < numberOfGitarToRemove; i++) {
            result.add(new Gitar());
        }
        return result;
    }


    private static int nos() {
        return 0;
    }

}
