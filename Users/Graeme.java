@Data
public class Graeme extends Room15User implements Runnable {

    private boolean ancient = true;
    private transient boolean helpful = true;
    private static Toast sToast;

    @WorkerThread
    public Graeme() {
        synchronized (this) {
            if(helpful) {
                Handler handler = new Handler(Looper.getMainLooper()).post(this);
            }
            helpful = !helpful;
        }
    }

    @Override
    public boolean isTiredOfDaveShit() {
        return false;
    }

    @Override
    @MainThread
    public void run() {
        if(sToast != null) {
            sToast.cancel();
        }
        sToast = Toast.makeToast(Context.getInstance(), "Have you tried turning it off and on again?", Toast.LENGTH_LONG);
        sToast.show();
    }

}