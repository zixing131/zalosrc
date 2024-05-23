package com.zing.zalo.p077ui.widget;

import com.zing.zalo.zlottie.widget.C17291a;
import fn0.AbstractC19074t;

/* renamed from: com.zing.zalo.ui.widget.w0 */
/* loaded from: classes6.dex */
public final class C13809w0 extends AbstractC13560a {

    /* renamed from: q */
    private C17291a f71462q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C13809w0(C17291a c17291a, int i11) {
        super(c17291a, i11);
        AbstractC19074t.m100208f(c17291a, "zLottieDrawable");
        this.f71462q = c17291a;
    }

    @Override // com.zing.zalo.p077ui.widget.AbstractC13560a
    /* renamed from: d */
    public void mo76013d() {
        this.f71462q.start();
    }

    @Override // com.zing.zalo.p077ui.widget.AbstractC13560a
    /* renamed from: e */
    public void mo76014e() {
        m76012c(null);
        this.f71462q.stop();
    }
}
