package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.common.internal.AbstractC4205o;
import com.google.android.gms.dynamic.BinderC4273d;
import com.google.android.gms.dynamic.InterfaceC4271b;
import java.util.Collections;

/* loaded from: classes2.dex */
public final class wn1 extends o60 implements ViewTreeObserver.OnGlobalLayoutListener, ViewTreeObserver.OnScrollChangedListener, InterfaceC5112vz {

    /* renamed from: p */
    private View f30028p;

    /* renamed from: q */
    private com.google.android.gms.ads.internal.client.zzdk f30029q;

    /* renamed from: r */
    private qj1 f30030r;

    /* renamed from: s */
    private boolean f30031s = false;

    /* renamed from: t */
    private boolean f30032t = false;

    public wn1(qj1 qj1Var, vj1 vj1Var) {
        this.f30028p = vj1Var.m27245N();
        this.f30029q = vj1Var.m27249R();
        this.f30030r = qj1Var;
        if (vj1Var.m27257Z() != null) {
            vj1Var.m27257Z().mo26692c0(this);
        }
    }

    /* renamed from: N */
    private static final void m27668N(s60 s60Var, int i11) {
        try {
            s60Var.zze(i11);
        } catch (RemoteException e11) {
            yk0.zzl("#007 Could not call remote method.", e11);
        }
    }

    private final void zzg() {
        View view;
        qj1 qj1Var = this.f30030r;
        if (qj1Var != null && (view = this.f30028p) != null) {
            qj1Var.m25737Q(view, Collections.emptyMap(), Collections.emptyMap(), qj1.m25723w(this.f30028p));
        }
    }

    private final void zzh() {
        View view = this.f30028p;
        if (view == null) {
            return;
        }
        ViewParent parent = view.getParent();
        if (parent instanceof ViewGroup) {
            ((ViewGroup) parent).removeView(this.f30028p);
        }
    }

    @Override // com.google.android.gms.internal.ads.p60
    /* renamed from: f4 */
    public final void mo25403f4(InterfaceC4271b interfaceC4271b, s60 s60Var) {
        String str;
        AbstractC4205o.m19717f("#008 Must be called on the main UI thread.");
        if (this.f30031s) {
            yk0.zzg("Instream ad can not be shown after destroy().");
            m27668N(s60Var, 2);
            return;
        }
        View view = this.f30028p;
        if (view != null && this.f30029q != null) {
            if (this.f30032t) {
                yk0.zzg("Instream ad should not be used again.");
                m27668N(s60Var, 1);
                return;
            }
            this.f30032t = true;
            zzh();
            ((ViewGroup) BinderC4273d.m19914Q(interfaceC4271b)).addView(this.f30028p, new ViewGroup.LayoutParams(-1, -1));
            zzt.zzx();
            xl0.m27928a(this.f30028p, this);
            zzt.zzx();
            xl0.m27929b(this.f30028p, this);
            zzg();
            try {
                s60Var.zzf();
                return;
            } catch (RemoteException e11) {
                yk0.zzl("#007 Could not call remote method.", e11);
                return;
            }
        }
        if (view == null) {
            str = "can not get video view.";
        } else {
            str = "can not get video controller.";
        }
        yk0.zzg("Instream internal error: ".concat(str));
        m27668N(s60Var, 0);
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        zzg();
    }

    @Override // android.view.ViewTreeObserver.OnScrollChangedListener
    public final void onScrollChanged() {
        zzg();
    }

    @Override // com.google.android.gms.internal.ads.p60
    public final com.google.android.gms.ads.internal.client.zzdk zzb() {
        AbstractC4205o.m19717f("#008 Must be called on the main UI thread.");
        if (this.f30031s) {
            yk0.zzg("getVideoController: Instream ad should not be used after destroyed");
            return null;
        }
        return this.f30029q;
    }

    @Override // com.google.android.gms.internal.ads.p60
    public final h00 zzc() {
        AbstractC4205o.m19717f("#008 Must be called on the main UI thread.");
        if (this.f30031s) {
            yk0.zzg("getVideoController: Instream ad should not be used after destroyed");
            return null;
        }
        qj1 qj1Var = this.f30030r;
        if (qj1Var == null || qj1Var.m25726C() == null) {
            return null;
        }
        return qj1Var.m25726C().m26338a();
    }

    @Override // com.google.android.gms.internal.ads.p60
    public final void zzd() {
        AbstractC4205o.m19717f("#008 Must be called on the main UI thread.");
        zzh();
        qj1 qj1Var = this.f30030r;
        if (qj1Var != null) {
            qj1Var.mo23795a();
        }
        this.f30030r = null;
        this.f30028p = null;
        this.f30029q = null;
        this.f30031s = true;
    }

    @Override // com.google.android.gms.internal.ads.p60
    public final void zze(InterfaceC4271b interfaceC4271b) {
        AbstractC4205o.m19717f("#008 Must be called on the main UI thread.");
        mo25403f4(interfaceC4271b, new vn1(this));
    }
}
