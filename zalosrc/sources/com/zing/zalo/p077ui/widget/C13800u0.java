package com.zing.zalo.p077ui.widget;

import android.graphics.Canvas;
import p516t3.C26469c;
import vg.AbstractC28245z3;

/* renamed from: com.zing.zalo.ui.widget.u0 */
/* loaded from: classes6.dex */
public class C13800u0 extends AbstractC13560a {

    /* renamed from: q */
    public C26469c f71437q;

    public C13800u0(C26469c c26469c, int i11) {
        super(c26469c, i11);
        this.f71437q = c26469c;
    }

    @Override // com.zing.zalo.p077ui.widget.AbstractC13560a
    /* renamed from: b */
    public void mo76011b(Canvas canvas) {
        this.f71437q.m136405g(canvas);
    }

    @Override // com.zing.zalo.p077ui.widget.AbstractC13560a
    /* renamed from: d */
    public void mo76013d() {
        C26469c c26469c = this.f71437q;
        if (c26469c != null) {
            if (AbstractC28245z3.f131682b == 0) {
                c26469c.m136409k();
            } else {
                c26469c.m136418t();
            }
        }
    }

    @Override // com.zing.zalo.p077ui.widget.AbstractC13560a
    /* renamed from: e */
    public void mo76014e() {
        m76012c(null);
        C26469c c26469c = this.f71437q;
        if (c26469c != null) {
            c26469c.m136419u();
        }
    }
}
