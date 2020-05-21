package VitalPackage;

public class VitalClass {
    static int n = 1;
    static long l = 1;
    static short s = 1;

    public static long getL() {
        return l;
    }

    public static void setL(long l) {
        VitalClass.l = l;
    }

    public static short getS() {
        return s;
    }

    public static void setS(short s) {
        VitalClass.s = s;
    }

    public static double getD() {
        return d;
    }

    public static void setD(double d) {
        VitalClass.d = d;
    }

    static double d = 1.1d;
    static float f = 1.1f;
    static class InnerClass {
        public long getId() {
            if (id==0)
            return id;
            return 12;
        }

        public void setId(long id) {
            this.id = id;
        }

        private long id;
    }
}
