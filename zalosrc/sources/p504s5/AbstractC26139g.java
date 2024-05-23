package p504s5;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import androidx.core.content.AbstractC1388a;

/* renamed from: s5.g */
/* loaded from: classes2.dex */
public abstract class AbstractC26139g extends AbstractC1388a {
    /* renamed from: r */
    public static Intent m134507r(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
        int i11;
        Intent registerReceiver;
        if (AbstractC26138f.m134506a()) {
            if (true != AbstractC26138f.m134506a()) {
                i11 = 0;
            } else {
                i11 = 2;
            }
            registerReceiver = context.registerReceiver(broadcastReceiver, intentFilter, i11);
            return registerReceiver;
        }
        return context.registerReceiver(broadcastReceiver, intentFilter);
    }
}
