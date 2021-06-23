package edu.grcy.patterns.practise.carRental.car;

public enum CarKind {
    CAR("osobowy", "o"),
    TRUCK_CAR("ciężarowy", "c");

    private String info;
    private String shortname;

    CarKind(String info, String shortname) {
        this.info = info;
        this.shortname = shortname;
    }

    public String getInfo() {
        return info;
    }

    public static CarKind getByShortname(String shortname) {
        for (CarKind carKind : CarKind.values()) {
            if(shortname.equals(carKind.shortname)) {
                return carKind;
            }
        }
        return null;
    }
}
