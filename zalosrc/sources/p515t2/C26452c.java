package p515t2;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import androidx.work.AbstractC2253u;
import androidx.work.impl.constraints.trackers.BroadcastReceiverConstraintTracker;
import fn0.AbstractC19074t;
import p595w2.InterfaceC28696c;

/* renamed from: t2.c */
/* loaded from: classes.dex */
public final class C26452c extends BroadcastReceiverConstraintTracker {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C26452c(Context context, InterfaceC28696c interfaceC28696c) {
        super(context, interfaceC28696c);
        AbstractC19074t.m100208f(context, "context");
        AbstractC19074t.m100208f(interfaceC28696c, "taskExecutor");
    }

    @Override // androidx.work.impl.constraints.trackers.BroadcastReceiverConstraintTracker
    /* renamed from: j */
    public IntentFilter mo11685j() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.BATTERY_OKAY");
        intentFilter.addAction("android.intent.action.BATTERY_LOW");
        return intentFilter;
    }

    @Override // androidx.work.impl.constraints.trackers.BroadcastReceiverConstraintTracker
    /* renamed from: k */
    public void mo11686k(Intent intent) {
        String str;
        AbstractC19074t.m100208f(intent, "intent");
        if (intent.getAction() == null) {
            return;
        }
        AbstractC2253u m11895e = AbstractC2253u.m11895e();
        str = AbstractC26453d.f125641a;
        m11895e.mo11898a(str, "Received " + intent.getAction());
        String action = intent.getAction();
        if (action != null) {
            int hashCode = action.hashCode();
            if (hashCode != -1980154005) {
                if (hashCode == 490310653 && action.equals("android.intent.action.BATTERY_LOW")) {
                    m136362g(Boolean.FALSE);
                    return;
                }
                return;
            }
            if (action.equals("android.intent.action.BATTERY_OKAY")) {
                m136362g(Boolean.TRUE);
            }
        }
    }

    @Override // p515t2.AbstractC26456g
    /* renamed from: l, reason: merged with bridge method [inline-methods] */
    public Boolean mo136351e() {
        String str;
        Intent registerReceiver = m136360d().registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        if (registerReceiver == null) {
            AbstractC2253u m11895e = AbstractC2253u.m11895e();
            str = AbstractC26453d.f125641a;
            m11895e.mo11900c(str, "getInitialState - null intent received");
            return Boolean.FALSE;
        }
        int intExtra = registerReceiver.getIntExtra("status", -1);
        float intExtra2 = registerReceiver.getIntExtra("level", -1) / registerReceiver.getIntExtra("scale", -1);
        boolean z11 = true;
        if (intExtra != 1 && intExtra2 <= 0.15f) {
            z11 = false;
        }
        return Boolean.valueOf(z11);
    }
}
