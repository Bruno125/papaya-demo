package cinepapaya.com.papayaframework;

import android.content.Context;

/**
 * Created by brunoaybar on 6/21/16.
 */
public class Papaya {

    private static Papaya INSTANCE = new Papaya();
    private Papaya(){}
    private Context mContext;

    public static Papaya getInstance(){
        return INSTANCE;
    }

    public static void init(Context context){
        getInstance().mContext = context;
    }

    public void doSomething(String a){

    }

}
