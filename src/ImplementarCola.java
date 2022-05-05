public class ImplementarCola {
    public static int length = 0;
    public static float data[] = new float[length];


    public ImplementarCola(int initialCapacity) {
        data = new float[initialCapacity];
    }

    public float[] getData() {
        return data;
    }

    public void setData(float[] data) {
        this.data = data;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public static void enqueue(float i) {

        if (length == data.length) {
            float []aux = data;
            data = new float[data.length +1];

            for(int j = 0; j < length; j++) {
                data[j] = aux[j];
            }

            aux = null;
        }

        data[length] = i;
        length++;

    }

    public static void dequeue() {

        data[data.length-1] = 0.0f;
    }

    public static void crearCola(int length) {
        float data[] = new float[length];
    }


}
