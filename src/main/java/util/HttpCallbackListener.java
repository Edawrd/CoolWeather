package util;

/**
 * Created by Edward on 2016/7/3.
 */
public interface HttpCallbackListener {
    void onFinish(String s);

    void onError(Exception e);
}

