package exam02;

public /*abstract*/ enum Transportation /*extends java.lang.Enum*/ {
    /*public static final*/BUS(1250){
        @Override
        public String getName() {
            return "버스";
        }
    },
    /*public static final*/SUBWAY(1250){
        @Override
        public String getName() {
            return "버스";
        }
    },
    /*public static final*/TAXI(4000){
        @Override
        public String getName() {
            return "택시";
        }
    };

    private int fare;

    /*private*/ Transportation(int fare) {
        this.fare = fare;
    }

    public int getTotal(int personNum){
        return fare * personNum;
    }

    public abstract String getName();

}
