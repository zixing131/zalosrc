package p515t2;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import androidx.work.AbstractC2253u;
import androidx.work.impl.constraints.trackers.BroadcastReceiverConstraintTracker;
import fn0.AbstractC19074t;
import p470r2.C25617c;
import p595w2.InterfaceC28696c;

/* renamed from: t2.k */
/* loaded from: classes2.dex */
public final class C26460k extends BroadcastReceiverConstraintTracker {

    /* renamed from: g */
    private final ConnectivityManager f125655g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C26460k(Context context, InterfaceC28696c interfaceC28696c) {
        super(context, interfaceC28696c);
        AbstractC19074t.m100208f(context, "context");
        AbstractC19074t.m100208f(interfaceC28696c, "taskExecutor");
        Object systemService = m136360d().getSystemService("connectivity");
        AbstractC19074t.m100206d(systemService, "null cannot be cast to non-null type android.net.ConnectivityManager");
        this.f125655g = (ConnectivityManager) systemService;
    }

    @Override // androidx.work.impl.constraints.trackers.BroadcastReceiverConstraintTracker
    /* renamed from: j */
    public IntentFilter mo11685j() {
        return new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE");
    }

    @Override // androidx.work.impl.constraints.trackers.BroadcastReceiverConstraintTracker
    /* renamed from: k */
    public void mo11686k(Intent intent) {
        String str;
        AbstractC19074t.m100208f(intent, "intent");
        if (AbstractC19074t.m100204b(intent.getAction(), "android.net.conn.CONNECTIVITY_CHANGE")) {
            AbstractC2253u m11895e = AbstractC2253u.m11895e();
            str = AbstractC26459j.f125654a;
            m11895e.mo11898a(str, "Network broadcast received");
            m136362g(AbstractC26459j.m136368c(this.f125655g));
        }
    }

    @Override // p515t2.AbstractC26456g
    /* renamed from: l, reason: merged with bridge method [inline-methods] */
    public C25617c mo136351e() {
        return AbstractC26459j.m136368c(this.f125655g);
    }
}
