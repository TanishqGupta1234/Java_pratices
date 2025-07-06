package Access;

public class ObjectDemo {

        private int num;
        private float gpa;
        @Override
        public int hashCode() {
            return super.hashCode();
        }
    
        public ObjectDemo(int num, float gpa) {
            this.num = num;
            this.gpa = gpa;
        }


    // @Override
    // public boolean equals(java.lang.Object obj) {

    //     return super.equals(obj);
    // }

    // @Override
    // protected java.lang.Object clone() throws CloneNotSupportedException {
    //     return super.clone();
    // }

    // @Override
    // public String toString() {
    //     return super.toString();
    // }

    // @Override
    // protected void finalize() throws Throwable {

    //     super.finalize(); // calls when garbage collection hits
    // }

    public static void main(String[] args) {
        ObjectDemo obj = new ObjectDemo(34, 56.4f );
        System.out.println(obj.hashCode());
       
    }

}
