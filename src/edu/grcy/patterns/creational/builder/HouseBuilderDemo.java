package edu.grcy.patterns.creational.builder;

import java.util.Arrays;
import java.util.List;

public class HouseBuilderDemo {
    public static void main(String[] args) {

        /**
         * new House.HouseBuilder(...) wywołuje konstruktor klasy HouseBuilder
         * wywołanie przez KLASĘ House bo HouseBuilder jest statyczna
         *
         * Gdyby HouseBuilder był klasą niestatyczną, to wywołanie musiałoby wyglądać
         * tak:
         * House house = new House() //jakiś konstruktor do utworzenia obiektu klasy House
         * i wtedy
         * HouseBuilder builder = new house.HouseBuilder()...
         * albo
         * HouseBuilder builder = house.new HouseBuilder()...
         *
         */
        House smallHouse = new House.HouseBuilder("bloczki", "solbet", "blacha").build();

        /**
         * Rozbijając powyższe na 2 obiekty
         */
        House.HouseBuilder someBuilder = new House.HouseBuilder("piach", "skóra", "liście");
        House namiot = someBuilder.build();

        House villageHouse = new House.HouseBuilder("wylewany", "cegła", "papodachówka")
                //po wywołaniu konstruktora mamy obiekt klasy HouseBuilder
                .withGarden("działka na warzywa").build();

        House residence = new House.HouseBuilder("wylewany + bloczki", "bale drewniane", "dachówka")
                .withGarden("park z basenem")
                .withGarage("wolnostojący, dwustanowiskowy").build();

        House mediumHouse = new House.HouseBuilder("bloczki", "max", "blacha")
                .withGarage("w bryle budynku")
                .withGarden("plac zabaw i mała rabatka").build();

        House mediuHeatedHouse = new House.HouseBuilder("bloczki", "max", "blacha")
                .withGarage("w bryle budynku")
                .withHeating(new Heating("Wungiel Panie!"))
                .withGarden("plac zabaw i mała rabatka").build();

        Heating ecoHeating = new Heating("Pompa ciepła");

        House mediuEcoHeatedHouse = new House.HouseBuilder("bloczki", "max", "blacha")
                .withGarage("w bryle budynku")
                .withHeating(ecoHeating)
                .withGarden("plac zabaw i mała rabatka").build();


        List<House> houses = Arrays.asList(smallHouse, villageHouse, residence,
                mediumHouse, namiot, mediuHeatedHouse, mediuEcoHeatedHouse);
        houses.forEach(x -> System.out.println("\n" + x.getHouseInfo()));
    }
}
