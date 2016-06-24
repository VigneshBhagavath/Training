package com.training;

public class BillManager {
	
		private ElectricityBill reading;
	
		public BillManager() {
			super();
			// TODO Auto-generated constructor stub
		}

		public BillManager(ElectricityBill reading) {
			super();
			this.reading = reading;
		}

		public double CalculateBill(ElectricityBill reading){
			double amt = 0;
			double UnitsConsumed = reading.getCurrentReading() - reading.getLastReading();
			if(reading.getConsumerType().equals("DOM")){
				if(UnitsConsumed >200){
					amt = UnitsConsumed*2.0;
				}
				else {
					amt = UnitsConsumed*1.2;
				}
			}
			
			if(reading.getConsumerType().equals("COM")){
				if(UnitsConsumed >400){
					amt = UnitsConsumed*4.0;
				}
				else {
					amt = UnitsConsumed*2.5;
				}
			}
			return amt;
		}
		
		public double CalculateBill(){
			double amt = CalculateBill(reading);
			
			return amt;
		}

}
