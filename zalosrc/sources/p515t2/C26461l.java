package p515t2;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import androidx.work.AbstractC2253u;
import androidx.work.impl.constraints.trackers.BroadcastReceiverConstraintTracker;
import fn0.AbstractC19074t;
import p595w2.InterfaceC28696c;

/* renamed from: t2.l */
/* loaded from: classes.dex */
public final class C26461l extends BroadcastReceiverConstraintTracker {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C26461l(Context context, InterfaceC28696c interfaceC28696c) {
        super(context, interfaceC28696c);
        AbstractC19074t.m100208f(context, "context");
        AbstractC19074t.m100208f(interfaceC28696c, "taskExecutor");
    }

    @Override // androidx.work.impl.constraints.trackers.BroadcastReceiverConstraintTracker
    /* renamed from: j */
    public IntentFilter mo11685j() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.DEVICE_STORAGE_OK");
        intentFilter.addAction("android.intent.action.DEVICE_STORAGE_LOW");
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
        str = AbstractC26462m.f125656a;
        m11895e.mo11898a(str, "Received " + intent.getAction());
        String action = intent.getAction();
        if (action != null) {
            int hashCode = action.hashCode();
            if (hashCode != -1181163412) {
                if (hashCode == -730838620 && action.equals("android.intent.action.DEVICE_STORAGE_OK")) {
                    m136362g(Boolean.TRUE);
                    return;
                }
                return;
            }
            if (action.equals("android.intent.action.DEVICE_STORAGE_LOW")) {
                m136362g(Boolean.FALSE);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0033, code lost:            if (r0.equals("android.intent.action.DEVICE_STORAGE_OK") == false) goto L18;     */
    @Override // p515t2.AbstractC26456g
    /* renamed from: l, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Boolean mo136351e() {
        Intent registerReceiver = m136360d().registerReceiver(null, mo11685j());
        boolean z11 = true;
        if (registerReceiver != null && registerReceiver.getAction() != null) {
            String action = registerReceiver.getAction();
            if (action != null) {
                int hashCode = action.hashCode();
                if (hashCode != -1181163412) {
                    if (hashCode == -730838620) {
                    }
                } else {
                    action.equals("android.intent.action.DEVICE_STORAGE_LOW");
                }
            }
            z11 = false;
        }
        return Boolean.valueOf(z11);
    }
}
