
public class Tire {


		private int currentAirPressure;
		private int maxAirPressure;
		
		public Tire(int _maxAirPressure) {
			currentAirPressure = _maxAirPressure;
			maxAirPressure = _maxAirPressure;
		}
		
		public void setPressure(int newPressure) {
			if(newPressure > 0 && newPressure <= maxAirPressure) {
				currentAirPressure = newPressure;
			}
		}
		
		public void getCurrentPressure() {
			return currentAirPressure;
		}
		
		public void getMaxPressure() {
			return maxAirPressure;
		}
	
}
