package androidx.work.impl.background.systemalarm;

import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import androidx.work.AbstractC2253u;
import androidx.work.impl.C2221r0;
import androidx.work.impl.background.systemalarm.ConstraintProxy;
import p565v2.AbstractC27465s;

/* loaded from: classes2.dex */
public class ConstraintProxyUpdateReceiver extends BroadcastReceiver {

    /* renamed from: a */
    static final String f9160a = AbstractC2253u.m11897i("ConstrntProxyUpdtRecvr");

    /* renamed from: androidx.work.impl.background.systemalarm.ConstraintProxyUpdateReceiver$a */
    /* loaded from: classes2.dex */
    class RunnableC2158a implements Runnable {

        /* renamed from: p */
        final /* synthetic */ Intent f9161p;

        /* renamed from: q */
        final /* synthetic */ Context f9162q;

        /* renamed from: r */
        final /* synthetic */ BroadcastReceiver.PendingResult f9163r;

        RunnableC2158a(Intent intent, Context context, BroadcastReceiver.PendingResult pendingResult) {
            this.f9161p = intent;
            this.f9162q = context;
            this.f9163r = pendingResult;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                boolean booleanExtra = this.f9161p.getBooleanExtra("KEY_BATTERY_NOT_LOW_PROXY_ENABLED", false);
                boolean booleanExtra2 = this.f9161p.getBooleanExtra("KEY_BATTERY_CHARGING_PROXY_ENABLED", false);
                boolean booleanExtra3 = this.f9161p.getBooleanExtra("KEY_STORAGE_NOT_LOW_PROXY_ENABLED", false);
                boolean booleanExtra4 = this.f9161p.getBooleanExtra("KEY_NETWORK_STATE_PROXY_ENABLED", false);
                AbstractC2253u.m11895e().mo11898a(ConstraintProxyUpdateReceiver.f9160a, "Updating proxies: (BatteryNotLowProxy (" + booleanExtra + "), BatteryChargingProxy (" + booleanExtra2 + "), StorageNotLowProxy (" + booleanExtra3 + "), NetworkStateProxy (" + booleanExtra4 + "), ");
                AbstractC27465s.m140515c(this.f9162q, ConstraintProxy.BatteryNotLowProxy.class, booleanExtra);
                AbstractC27465s.m140515c(this.f9162q, ConstraintProxy.BatteryChargingProxy.class, booleanExtra2);
                AbstractC27465s.m140515c(this.f9162q, ConstraintProxy.StorageNotLowProxy.class, booleanExtra3);
                AbstractC27465s.m140515c(this.f9162q, ConstraintProxy.NetworkStateProxy.class, booleanExtra4);
            } finally {
                this.f9163r.finish();
            }
        }
    }

    /* renamed from: a */
    public static Intent m11590a(Context context, boolean z11, boolean z12, boolean z13, boolean z14) {
        Intent intent = new Intent("androidx.work.impl.background.systemalarm.UpdateProxies");
        intent.setComponent(new ComponentName(context, (Class<?>) ConstraintProxyUpdateReceiver.class));
        intent.putExtra("KEY_BATTERY_NOT_LOW_PROXY_ENABLED", z11).putExtra("KEY_BATTERY_CHARGING_PROXY_ENABLED", z12).putExtra("KEY_STORAGE_NOT_LOW_PROXY_ENABLED", z13).putExtra("KEY_NETWORK_STATE_PROXY_ENABLED", z14);
        return intent;
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        String str;
        if (intent != null) {
            str = intent.getAction();
        } else {
            str = null;
        }
        if (!"androidx.work.impl.background.systemalarm.UpdateProxies".equals(str)) {
            AbstractC2253u.m11895e().mo11898a(f9160a, "Ignoring unknown action " + str);
            return;
        }
        C2221r0.m11729r(context).m11741x().mo143752d(new RunnableC2158a(intent, context, goAsync()));
    }
}
