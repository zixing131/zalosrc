package com.google.android.gms.common.api.internal;

import android.util.Log;
import android.util.SparseArray;
import com.google.android.gms.common.C4070a;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.AbstractC4073c;
import com.google.android.gms.common.internal.AbstractC4205o;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import p704z4.C31222d;
import p704z4.InterfaceC31224e;

/* renamed from: com.google.android.gms.common.api.internal.i1 */
/* loaded from: classes2.dex */
public final class C4103i1 extends AbstractDialogInterfaceOnCancelListenerC4115m1 {

    /* renamed from: u */
    private final SparseArray f16353u;

    private C4103i1(InterfaceC31224e interfaceC31224e) {
        super(interfaceC31224e, C4070a.m19196p());
        this.f16353u = new SparseArray();
        this.f16229p.mo19564a("AutoManageHelper", this);
    }

    /* renamed from: t */
    public static C4103i1 m19446t(C31222d c31222d) {
        InterfaceC31224e m19288d = LifecycleCallback.m19288d(c31222d);
        C4103i1 c4103i1 = (C4103i1) m19288d.mo19565b("AutoManageHelper", C4103i1.class);
        if (c4103i1 != null) {
            return c4103i1;
        }
        return new C4103i1(m19288d);
    }

    /* renamed from: w */
    private final C4100h1 m19447w(int i11) {
        if (this.f16353u.size() <= i11) {
            return null;
        }
        SparseArray sparseArray = this.f16353u;
        return (C4100h1) sparseArray.get(sparseArray.keyAt(i11));
    }

    @Override // com.google.android.gms.common.api.internal.LifecycleCallback
    /* renamed from: a */
    public final void mo19289a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        for (int i11 = 0; i11 < this.f16353u.size(); i11++) {
            C4100h1 m19447w = m19447w(i11);
            if (m19447w != null) {
                printWriter.append((CharSequence) str).append("GoogleApiClient #").print(m19447w.f16347p);
                printWriter.println(":");
                m19447w.f16348q.mo19258f(String.valueOf(str).concat("  "), fileDescriptor, printWriter, strArr);
            }
        }
    }

    @Override // com.google.android.gms.common.api.internal.AbstractDialogInterfaceOnCancelListenerC4115m1, com.google.android.gms.common.api.internal.LifecycleCallback
    /* renamed from: j */
    public final void mo19296j() {
        super.mo19296j();
        boolean z11 = this.f16399q;
        String valueOf = String.valueOf(this.f16353u);
        StringBuilder sb2 = new StringBuilder();
        sb2.append("onStart ");
        sb2.append(z11);
        sb2.append(" ");
        sb2.append(valueOf);
        if (this.f16400r.get() == null) {
            for (int i11 = 0; i11 < this.f16353u.size(); i11++) {
                C4100h1 m19447w = m19447w(i11);
                if (m19447w != null) {
                    m19447w.f16348q.mo19256d();
                }
            }
        }
    }

    @Override // com.google.android.gms.common.api.internal.AbstractDialogInterfaceOnCancelListenerC4115m1, com.google.android.gms.common.api.internal.LifecycleCallback
    /* renamed from: k */
    public final void mo19297k() {
        super.mo19297k();
        for (int i11 = 0; i11 < this.f16353u.size(); i11++) {
            C4100h1 m19447w = m19447w(i11);
            if (m19447w != null) {
                m19447w.f16348q.mo19257e();
            }
        }
    }

    @Override // com.google.android.gms.common.api.internal.AbstractDialogInterfaceOnCancelListenerC4115m1
    /* renamed from: m */
    protected final void mo19448m(ConnectionResult connectionResult, int i11) {
        if (i11 < 0) {
            Log.wtf("AutoManageHelper", "AutoManageLifecycleHelper received onErrorResolutionFailed callback but no failing client ID is set", new Exception());
            return;
        }
        C4100h1 c4100h1 = (C4100h1) this.f16353u.get(i11);
        if (c4100h1 != null) {
            m19451v(i11);
            AbstractC4073c.c cVar = c4100h1.f16349r;
            if (cVar != null) {
                cVar.mo19443Q(connectionResult);
            }
        }
    }

    @Override // com.google.android.gms.common.api.internal.AbstractDialogInterfaceOnCancelListenerC4115m1
    /* renamed from: n */
    protected final void mo19449n() {
        for (int i11 = 0; i11 < this.f16353u.size(); i11++) {
            C4100h1 m19447w = m19447w(i11);
            if (m19447w != null) {
                m19447w.f16348q.mo19256d();
            }
        }
    }

    /* renamed from: u */
    public final void m19450u(int i11, AbstractC4073c abstractC4073c, AbstractC4073c.c cVar) {
        boolean z11;
        AbstractC4205o.m19723l(abstractC4073c, "GoogleApiClient instance cannot be null");
        if (this.f16353u.indexOfKey(i11) < 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        AbstractC4205o.m19727p(z11, "Already managing a GoogleApiClient with id " + i11);
        C4106j1 c4106j1 = (C4106j1) this.f16400r.get();
        boolean z12 = this.f16399q;
        String valueOf = String.valueOf(c4106j1);
        StringBuilder sb2 = new StringBuilder();
        sb2.append("starting AutoManage for client ");
        sb2.append(i11);
        sb2.append(" ");
        sb2.append(z12);
        sb2.append(" ");
        sb2.append(valueOf);
        C4100h1 c4100h1 = new C4100h1(this, i11, abstractC4073c, cVar);
        abstractC4073c.mo19265n(c4100h1);
        this.f16353u.put(i11, c4100h1);
        if (this.f16399q && c4106j1 == null) {
            "connecting ".concat(abstractC4073c.toString());
            abstractC4073c.mo19256d();
        }
    }

    /* renamed from: v */
    public final void m19451v(int i11) {
        C4100h1 c4100h1 = (C4100h1) this.f16353u.get(i11);
        this.f16353u.remove(i11);
        if (c4100h1 != null) {
            c4100h1.f16348q.mo19266o(c4100h1);
            c4100h1.f16348q.mo19257e();
        }
    }
}
