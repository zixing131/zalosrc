package p515t2;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import androidx.work.AbstractC2253u;
import androidx.work.impl.constraints.trackers.BroadcastReceiverConstraintTracker;
import fn0.AbstractC19074t;
import p595w2.InterfaceC28696c;

/* renamed from: t2.a */
/* loaded from: classes.dex */
public final class C26450a extends BroadcastReceiverConstraintTracker {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C26450a(Context context, InterfaceC28696c interfaceC28696c) {
        super(context, interfaceC28696c);
        AbstractC19074t.m100208f(context, "context");
        AbstractC19074t.m100208f(interfaceC28696c, "taskExecutor");
    }

    /* renamed from: l */
    private final boolean m136350l(Intent intent) {
        if (Build.VERSION.SDK_INT >= 23) {
            int intExtra = intent.getIntExtra("status", -1);
            if (intExtra == 2 || intExtra == 5) {
                return true;
            }
        } else if (intent.getIntExtra("plugged", 0) != 0) {
            return true;
        }
        return false;
    }

    @Override // androidx.work.impl.constraints.trackers.BroadcastReceiverConstraintTracker
    /* renamed from: j */
    public IntentFilter mo11685j() {
        IntentFilter intentFilter = new IntentFilter();
        if (Build.VERSION.SDK_INT >= 23) {
            intentFilter.addAction("android.os.action.CHARGING");
            intentFilter.addAction("android.os.action.DISCHARGING");
        } else {
            intentFilter.addAction("android.intent.action.ACTION_POWER_CONNECTED");
            intentFilter.addAction("android.intent.action.ACTION_POWER_DISCONNECTED");
        }
        return intentFilter;
    }

    @Override // androidx.work.impl.constraints.trackers.BroadcastReceiverConstraintTracker
    /* renamed from: k */
    public void mo11686k(Intent intent) {
        String str;
        AbstractC19074t.m100208f(intent, "intent");
        String action = intent.getAction();
        if (action == null) {
            return;
        }
        AbstractC2253u m11895e = AbstractC2253u.m11895e();
        str = AbstractC26451b.f125640a;
        m11895e.mo11898a(str, "Received " + action);
        switch (action.hashCode()) {
            case -1886648615:
                if (action.equals("android.intent.action.ACTION_POWER_DISCONNECTED")) {
                    m136362g(Boolean.FALSE);
                    return;
                }
                return;
            case -54942926:
                if (action.equals("android.os.action.DISCHARGING")) {
                    m136362g(Boolean.FALSE);
                    return;
                }
                return;
            case 948344062:
                if (action.equals("android.os.action.CHARGING")) {
                    m136362g(Boolean.TRUE);
                    return;
                }
                return;
            case 1019184907:
                if (action.equals("android.intent.action.ACTION_POWER_CONNECTED")) {
                    m136362g(Boolean.TRUE);
                    return;
                }
                return;
            default:
                return;
        }
    }

    @Override // p515t2.AbstractC26456g
    /* renamed from: m, reason: merged with bridge method [inline-methods] */
    public Boolean mo136351e() {
        String str;
        Intent registerReceiver = m136360d().registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        if (registerReceiver == null) {
            AbstractC2253u m11895e = AbstractC2253u.m11895e();
            str = AbstractC26451b.f125640a;
            m11895e.mo11900c(str, "getInitialState - null intent received");
            return Boolean.FALSE;
        }
        return Boolean.valueOf(m136350l(registerReceiver));
    }
}
