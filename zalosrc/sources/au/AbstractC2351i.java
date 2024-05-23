package au;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import fn0.AbstractC19074t;

/* renamed from: au.i */
/* loaded from: classes.dex */
public abstract class AbstractC2351i {
    /* renamed from: a */
    public static final Intent m12327a(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter, boolean z11) {
        int i11;
        Intent registerReceiver;
        AbstractC19074t.m100208f(context, "<this>");
        AbstractC19074t.m100208f(broadcastReceiver, "receiver");
        AbstractC19074t.m100208f(intentFilter, "intentFilter");
        if (Build.VERSION.SDK_INT >= 33) {
            if (z11) {
                i11 = 2;
            } else {
                i11 = 4;
            }
            registerReceiver = context.registerReceiver(broadcastReceiver, intentFilter, i11);
            return registerReceiver;
        }
        return context.registerReceiver(broadcastReceiver, intentFilter);
    }
}
