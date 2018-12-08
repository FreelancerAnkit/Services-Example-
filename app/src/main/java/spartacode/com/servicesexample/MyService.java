package spartacode.com.servicesexample;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.support.annotation.Nullable;
import android.widget.Toast;

public class MyService extends Service {
    public MyService() {
    }

    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        Toast.makeText(this, "On Bind Executed", Toast.LENGTH_SHORT).show();
        return null;
    }


}
