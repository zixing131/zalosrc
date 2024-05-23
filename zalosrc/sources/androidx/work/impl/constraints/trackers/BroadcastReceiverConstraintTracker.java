package androidx.work.impl.constraints.trackers;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import androidx.work.AbstractC2253u;
import fn0.AbstractC19074t;
import p515t2.AbstractC26454e;
import p515t2.AbstractC26456g;
import p595w2.InterfaceC28696c;

/* loaded from: classes.dex */
public abstract class BroadcastReceiverConstraintTracker extends AbstractC26456g {

    /* renamed from: f */
    private final BroadcastReceiver f9243f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BroadcastReceiverConstraintTracker(Context context, InterfaceC28696c interfaceC28696c) {
        super(context, interfaceC28696c);
        AbstractC19074t.m100208f(context, "context");
        AbstractC19074t.m100208f(interfaceC28696c, "taskExecutor");
        this.f9243f = new BroadcastReceiver() { // from class: androidx.work.impl.constraints.trackers.BroadcastReceiverConstraintTracker$broadcastReceiver$1
            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context2, Intent intent) {
                AbstractC19074t.m100208f(context2, "context");
                AbstractC19074t.m100208f(intent, "intent");
                BroadcastReceiverConstraintTracker.this.mo11686k(intent);
            }
        };
    }

    @Override // p515t2.AbstractC26456g
    /* renamed from: h */
    public void mo11683h() {
        String str;
        AbstractC2253u m11895e = AbstractC2253u.m11895e();
        str = AbstractC26454e.f125642a;
        m11895e.mo11898a(str, getClass().getSimpleName() + ": registering receiver");
        m136360d().registerReceiver(this.f9243f, mo11685j());
    }

    @Override // p515t2.AbstractC26456g
    /* renamed from: i */
    public void mo11684i() {
        String str;
        AbstractC2253u m11895e = AbstractC2253u.m11895e();
        str = AbstractC26454e.f125642a;
        m11895e.mo11898a(str, getClass().getSimpleName() + ": unregistering receiver");
        m136360d().unregisterReceiver(this.f9243f);
    }

    /* renamed from: j */
    public abstract IntentFilter mo11685j();

    /* renamed from: k */
    public abstract void mo11686k(Intent intent);
}
