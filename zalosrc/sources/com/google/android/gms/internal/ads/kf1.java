package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import com.google.android.gms.ads.internal.client.zzay;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;

/* loaded from: classes2.dex */
public final class kf1 extends kd1 implements InterfaceC4880pp {

    /* renamed from: q */
    private final Map f23304q;

    /* renamed from: r */
    private final Context f23305r;

    /* renamed from: s */
    private final iq2 f23306s;

    public kf1(Context context, Set set, iq2 iq2Var) {
        super(set);
        this.f23304q = new WeakHashMap(1);
        this.f23305r = context;
        this.f23306s = iq2Var;
    }

    /* renamed from: B0 */
    public final synchronized void m23936B0(View view) {
        try {
            ViewOnAttachStateChangeListenerC4917qp viewOnAttachStateChangeListenerC4917qp = (ViewOnAttachStateChangeListenerC4917qp) this.f23304q.get(view);
            if (viewOnAttachStateChangeListenerC4917qp == null) {
                viewOnAttachStateChangeListenerC4917qp = new ViewOnAttachStateChangeListenerC4917qp(this.f23305r, view);
                viewOnAttachStateChangeListenerC4917qp.m25850c(this);
                this.f23304q.put(view, viewOnAttachStateChangeListenerC4917qp);
            }
            if (this.f23306s.f22311Y) {
                if (((Boolean) zzay.zzc().m21823b(AbstractC4554gx.f21258h1)).booleanValue()) {
                    viewOnAttachStateChangeListenerC4917qp.m25854g(((Long) zzay.zzc().m21823b(AbstractC4554gx.f21248g1)).longValue());
                    return;
                }
            }
            viewOnAttachStateChangeListenerC4917qp.m25853f();
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* renamed from: C0 */
    public final synchronized void m23937C0(View view) {
        if (this.f23304q.containsKey(view)) {
            ((ViewOnAttachStateChangeListenerC4917qp) this.f23304q.get(view)).m25852e(this);
            this.f23304q.remove(view);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4880pp
    /* renamed from: m0 */
    public final synchronized void mo21778m0(final C4842op c4842op) {
        m23892x0(new jd1() { // from class: com.google.android.gms.internal.ads.jf1
            @Override // com.google.android.gms.internal.ads.jd1
            public final void zza(Object obj) {
                ((InterfaceC4880pp) obj).mo21778m0(C4842op.this);
            }
        });
    }
}
