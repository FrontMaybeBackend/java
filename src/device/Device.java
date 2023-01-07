package device;

public class Device {
        String model;
        String yearOfproduction;
        String producer;

        public Device(String model, String yearOfproduction, String producer) {
                this.model = model;
                this.yearOfproduction = yearOfproduction;
                this.producer = producer;
        }

        @Override
        public String toString() {
                return "Device{" +
                        "model='" + model + '\'' +
                        ", yearOfproduction='" + yearOfproduction + '\'' +
                        ", producer='" + producer + '\'' +
                        '}';
        }
}
