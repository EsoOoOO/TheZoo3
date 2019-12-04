package com.example.servicewithbhgdad;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;

public class HelloService extends Service {
    public HelloService() {
    }

    @Override
    public IBinder onBind(Intent intent) {
        // TODO: Return the communication channel to the service.
        throw new UnsupportedOperationException("Not yet implemented");
    }
}
