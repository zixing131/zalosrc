package androidx.work.impl.background.systemalarm;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import androidx.work.AbstractC2253u;
import androidx.work.impl.C2221r0;

/* loaded from: classes2.dex */
public class RescheduleReceiver extends BroadcastReceiver {

    /* renamed from: a */
    private static final String f9165a = AbstractC2253u.m11897i("RescheduleReceiver");

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        AbstractC2253u.m11895e().mo11898a(f9165a, "Received intent " + intent);
        if (Build.VERSION.SDK_INT >= 23) {
            try {
                C2221r0.m11729r(context).m11730A(goAsync());
                return;
            } catch (IllegalStateException e11) {
                AbstractC2253u.m11895e().mo11901d(f9165a, "Cannot reschedule jobs. WorkManager needs to be initialized via a ContentProvider#onCreate() or an Application#onCreate().", e11);
                return;
            }
        }
        context.startService(C2160b.m11601d(context));
    }
}
