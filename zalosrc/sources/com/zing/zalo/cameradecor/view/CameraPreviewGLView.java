package com.zing.zalo.cameradecor.view;

import ag.C0788h;
import ag.InterfaceC0795o;
import ag.InterfaceC0796p;
import android.content.Context;
import com.zing.zalo.SensitiveData;
import com.zing.zalo.cameradecor.view.CameraPreviewGLView;
import gg0.AbstractC19444a;
import p643xf.AbstractC29608a;
import p643xf.C29611d;
import xh0.InterfaceC29636b;
import xh0.InterfaceC29653k;

/* loaded from: classes3.dex */
public class CameraPreviewGLView extends EGLSharedSurfaceView implements InterfaceC0796p, InterfaceC0795o {

    /* renamed from: F */
    C0788h f41893F;

    /* renamed from: G */
    Context f41894G;

    /* renamed from: H */
    AbstractC29608a f41895H;

    /* renamed from: I */
    boolean f41896I;

    /* renamed from: J */
    boolean f41897J;

    /* renamed from: K */
    int f41898K;

    /* renamed from: L */
    int f41899L;

    /* renamed from: M */
    Runnable f41900M;

    public CameraPreviewGLView(Context context, boolean z11) {
        super(context);
        this.f41896I = false;
        this.f41898K = 0;
        this.f41899L = 0;
        this.f41900M = null;
        this.f41894G = context;
        this.f41897J = z11;
        m39726D();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: E */
    public /* synthetic */ void m39724E(int i11, InterfaceC29636b interfaceC29636b, InterfaceC29653k.a aVar, SensitiveData sensitiveData) {
        C29611d c29611d = new C29611d(this.f41894G, i11, false, interfaceC29636b, aVar, this, sensitiveData);
        this.f41895H = c29611d;
        c29611d.m1954X(true);
        this.f41893F.m1984v0(this.f41895H);
        if (this.f41893F.mo1997z()) {
            this.f41893F.m1996y();
        }
    }

    /* renamed from: C */
    void m39725C() {
        setZOrderMediaOverlay(this.f41897J);
        C0788h c0788h = new C0788h(getContext().getApplicationContext(), this, null);
        this.f41893F = c0788h;
        c0788h.m1954X(true);
        setRenderer(this.f41893F);
        mo39680s();
    }

    /* renamed from: D */
    void m39726D() {
        m39725C();
    }

    /* renamed from: F */
    public void m39727F(final int i11, final InterfaceC29636b interfaceC29636b, final InterfaceC29653k.a aVar, final SensitiveData sensitiveData) {
        if (!AbstractC19444a.m101693a()) {
            return;
        }
        Runnable runnable = new Runnable() { // from class: dg.a
            @Override // java.lang.Runnable
            public final void run() {
                CameraPreviewGLView.this.m39724E(i11, interfaceC29636b, aVar, sensitiveData);
            }
        };
        if (this.f41896I && this.f41898K > 0 && this.f41899L > 0) {
            this.f41893F.m1952U(runnable);
            this.f41900M = null;
        } else {
            this.f41900M = runnable;
        }
    }

    @Override // ag.InterfaceC0795o
    /* renamed from: f */
    public void mo2009f(int i11) {
    }

    @Override // ag.InterfaceC0796p
    /* renamed from: h */
    public void mo2010h() {
    }

    @Override // ag.InterfaceC0796p
    /* renamed from: i */
    public void mo2011i(int i11, int i12) {
        this.f41898K = i11;
        this.f41899L = i12;
        this.f41896I = true;
        Runnable runnable = this.f41900M;
        if (runnable != null) {
            m39679r(runnable);
            this.f41900M = null;
        }
    }

    @Override // com.zing.zalo.cameradecor.view.EGLSharedSurfaceView
    /* renamed from: y */
    public void mo39728y() {
        super.mo39728y();
        this.f41898K = 0;
        this.f41899L = 0;
        C0788h c0788h = this.f41893F;
        if (c0788h != null) {
            c0788h.destroy();
        }
        this.f41896I = false;
    }
}
