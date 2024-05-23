package p118e1;

import androidx.constraintlayout.motion.widget.AbstractInterpolatorC1274n;
import p007a1.C0030k;
import p007a1.C0033n;
import p007a1.InterfaceC0032m;

/* renamed from: e1.b */
/* loaded from: classes2.dex */
public class C18159b extends AbstractInterpolatorC1274n {

    /* renamed from: a */
    private C0033n f91827a;

    /* renamed from: b */
    private C0030k f91828b;

    /* renamed from: c */
    private InterfaceC0032m f91829c;

    public C18159b() {
        C0033n c0033n = new C0033n();
        this.f91827a = c0033n;
        this.f91829c = c0033n;
    }

    @Override // androidx.constraintlayout.motion.widget.AbstractInterpolatorC1274n
    /* renamed from: a */
    public float mo6019a() {
        return this.f91829c.mo98b();
    }

    /* renamed from: b */
    public void m96456b(float f11, float f12, float f13, float f14, float f15, float f16) {
        C0033n c0033n = this.f91827a;
        this.f91829c = c0033n;
        c0033n.m103d(f11, f12, f13, f14, f15, f16);
    }

    /* renamed from: c */
    public boolean m96457c() {
        return this.f91829c.mo97a();
    }

    /* renamed from: d */
    public void m96458d(float f11, float f12, float f13, float f14, float f15, float f16, float f17, int i11) {
        if (this.f91828b == null) {
            this.f91828b = new C0030k();
        }
        C0030k c0030k = this.f91828b;
        this.f91829c = c0030k;
        c0030k.m99d(f11, f12, f13, f14, f15, f16, f17, i11);
    }

    @Override // android.animation.TimeInterpolator
    public float getInterpolation(float f11) {
        return this.f91829c.getInterpolation(f11);
    }
}
