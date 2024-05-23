package p464qx;

import android.content.Context;
import android.widget.OverScroller;

/* renamed from: qx.a */
/* loaded from: classes4.dex */
public abstract class AbstractC25499a extends AbstractC25501c {

    /* renamed from: a */
    protected OverScroller f122135a;

    /* renamed from: b */
    private boolean f122136b = false;

    public AbstractC25499a(Context context) {
        this.f122135a = new OverScroller(context);
    }

    @Override // p464qx.AbstractC25501c
    /* renamed from: b */
    public void mo132100b(int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19, int i21) {
        this.f122135a.fling(i11, i12, i13, i14, i15, i16, i17, i18, i19, i21);
    }

    @Override // p464qx.AbstractC25501c
    /* renamed from: c */
    public void mo132101c(boolean z11) {
        this.f122135a.forceFinished(z11);
    }

    @Override // p464qx.AbstractC25501c
    /* renamed from: d */
    public int mo132102d() {
        return this.f122135a.getCurrX();
    }

    @Override // p464qx.AbstractC25501c
    /* renamed from: e */
    public int mo132103e() {
        return this.f122135a.getCurrY();
    }

    @Override // p464qx.AbstractC25501c
    /* renamed from: g */
    public boolean mo132104g() {
        return this.f122135a.isFinished();
    }
}
