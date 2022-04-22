package enums;

public enum Fares {
	BUS(100){
		int fare(int dist) {
			return dist * BASE_FARE;
		}
	},
	KTX(150){
		int fare(int dist) {
			return dist * BASE_FARE;
		}
	},
	AIR(200){
		int fare(int dist) {
			return dist * BASE_FARE;
		}
	};
	
	final int BASE_FARE;
	
	Fares(int baseFare){
		BASE_FARE = baseFare;
	}
	
	public int getBaseFare() {
		return BASE_FARE;
	}
	
	abstract int fare(int dist);
}
