package com.training;

public class ElectricityBill {

		private long ConsumerNo;
		private String ConsumerName;
		private double LastReading;
		private double CurrentReading;
		private String ConsumerType;
		

		public ElectricityBill(long consumerNo, String consumerName, double lastReading, double currentReading,
				String consumerType) {
			super();
			ConsumerNo = consumerNo;
			ConsumerName = consumerName;
			LastReading = lastReading;
			CurrentReading = currentReading;
			ConsumerType = consumerType;
		}
		
		public long getConsumerNo() {
			return ConsumerNo;
		}
		
		public void setConsumerNo(long consumerNo) {
			ConsumerNo = consumerNo;
		}
		public String getConsumerName() {
			return ConsumerName;
		}
		public void setConsumerName(String consumerName) {
			ConsumerName = consumerName;
		}
		public double getLastReading() {
			return LastReading;
		}
		public void setLastReading(double lastReading) {
			LastReading = lastReading;
		}
		public double getCurrentReading() {
			return CurrentReading;
		}
		public void setCurrentReading(double currentReading) {
			CurrentReading = currentReading;
		}
		public String getConsumerType() {
			return ConsumerType;
		}
		public void setConsumerType(String consumerType) {
			ConsumerType = consumerType;
		}
}
