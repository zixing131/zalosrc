package androidx.work.impl.background.systemalarm;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import androidx.work.AbstractC2253u;
import androidx.work.C2142e;
import androidx.work.EnumC2254v;
import java.util.Iterator;
import java.util.List;
import p535u2.C26976w;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public abstract class ConstraintProxy extends BroadcastReceiver {

    /* renamed from: a */
    private static final String f9159a = AbstractC2253u.m11897i("ConstraintProxy");

    /* loaded from: classes2.dex */
    public static class BatteryChargingProxy extends ConstraintProxy {
        @Override // androidx.work.impl.background.systemalarm.ConstraintProxy, android.content.BroadcastReceiver
        public /* bridge */ /* synthetic */ void onReceive(Context context, Intent intent) {
            super.onReceive(context, intent);
        }
    }

    /* loaded from: classes2.dex */
    public static class BatteryNotLowProxy extends ConstraintProxy {
        @Override // androidx.work.impl.background.systemalarm.ConstraintProxy, android.content.BroadcastReceiver
        public /* bridge */ /* synthetic */ void onReceive(Context context, Intent intent) {
            super.onReceive(context, intent);
        }
    }

    /* loaded from: classes2.dex */
    public static class NetworkStateProxy extends ConstraintProxy {
        @Override // androidx.work.impl.background.systemalarm.ConstraintProxy, android.content.BroadcastReceiver
        public /* bridge */ /* synthetic */ void onReceive(Context context, Intent intent) {
            super.onReceive(context, intent);
        }
    }

    /* loaded from: classes2.dex */
    public static class StorageNotLowProxy extends ConstraintProxy {
        @Override // androidx.work.impl.background.systemalarm.ConstraintProxy, android.content.BroadcastReceiver
        public /* bridge */ /* synthetic */ void onReceive(Context context, Intent intent) {
            super.onReceive(context, intent);
        }
    }

    ConstraintProxy() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static void m11589a(Context context, List list) {
        boolean z11;
        Iterator it = list.iterator();
        boolean z12 = false;
        boolean z13 = false;
        boolean z14 = false;
        boolean z15 = false;
        while (it.hasNext()) {
            C2142e c2142e = ((C26976w) it.next()).f127506j;
            z12 |= c2142e.m11509f();
            z13 |= c2142e.m11510g();
            z14 |= c2142e.m11512i();
            if (c2142e.m11507d() != EnumC2254v.NOT_REQUIRED) {
                z11 = true;
            } else {
                z11 = false;
            }
            z15 |= z11;
            if (z12 && z13 && z14 && z15) {
                break;
            }
        }
        context.sendBroadcast(ConstraintProxyUpdateReceiver.m11590a(context, z12, z13, z14, z15));
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        AbstractC2253u.m11895e().mo11898a(f9159a, "onReceive : " + intent);
        context.startService(C2160b.m11598a(context));
    }
}
