package projectuts2;

    abstract public class DailyMotion implements Bernonton {

        private String namaChannel;
        private String subscriber;
        protected int menonton;

        public DailyMotion(String namaChannel, String subscriber, int menonton) {
            this.namaChannel = namaChannel;
            this.subscriber = subscriber;
            this.menonton = menonton;
        }
        
        public DailyMotion() {
            this("","",0);
        }

        public void setNamaChannel(String namaChannel) {
            this.namaChannel = namaChannel;
        }

        public String getNamaChannel() {
            return namaChannel;
        }

        public String getSubscriber() {
            return subscriber;
        }

        public void setSubscriber(String subscriber) {
            this.subscriber = subscriber;
        }

        public int getMenonton() {
            return menonton;
        }

        public void setMenonton(int menonton) {
            this.menonton = menonton;
        }

        public String toString() {
            return "NAMA CHANNEL : " + namaChannel + ",  " + "SUBSCRIBER : " + subscriber + ",  " + "TOTAL PENONTON : " + getMenonton();
        }
    }