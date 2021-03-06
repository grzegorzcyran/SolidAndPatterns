package edu.grcy.patterns.creational.builder;

public class House {

	private String basement;
	private String walls;
	private String roof;

	private String garage;
	private String garden;

	private Heating heating;

	private House(HouseBuilder builder) {
		this.basement = builder.basement;
		this.walls = builder.walls;
		this.roof = builder.roof;
		this.garage = builder.garage;
		this.garden = builder.garden;
		this.heating = builder.heating;
	}

	public String getBasement() {
		return basement;
	}

	public String getWalls() {
		return walls;
	}

	public String getRoof() {
		return roof;
	}

	public String getGarage() {
		return garage;
	}

	public String getHouseInfo() {
		return "House: basement: " + basement + ", walls: " + walls + ", roof: " + roof +
				(heating != null ? ", heating: " + heating.getHeatingType() : "") +
				(garage != null ? ", garage: " + garage : "") +
				(garden != null ? ", garden: " + garden : "") +
				".";
	}

	public static class HouseBuilder {

		private String basement;
		private String walls;
		private String roof;

		private String garage;
		private String garden;

		private Heating heating;

		public HouseBuilder(String basement, String walls, String roof) {
			this.basement = basement;
			this.walls = walls;
			this.roof = roof;
		}

		public HouseBuilder withGarage(String garage) {
			this.garage = garage;
			return this;
		}

		public HouseBuilder withGarden(String garden) {
			this.garden = garden;
			return this;
		}

		public HouseBuilder withHeating(Heating heating) {
			this.heating = heating;
			return this;
		}

		public House build(){
			return new House(this);
		}
	}
}


