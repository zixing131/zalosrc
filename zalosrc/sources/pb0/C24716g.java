package pb0;

import ad0.C0750l;
import ad0.InterfaceC0746h;
import android.graphics.Canvas;
import bd0.C2771b;
import en0.InterfaceC18494a;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import p471r3.C25630b;
import pm0.AbstractC24856m;
import pm0.InterfaceC24854k;

/* renamed from: pb0.g */
/* loaded from: classes6.dex */
public final class C24716g extends AbstractC24710a {

    /* renamed from: o */
    private final C2771b f118715o;

    /* renamed from: p */
    private final InterfaceC24854k f118716p;

    /* renamed from: pb0.g$a */
    /* loaded from: classes6.dex */
    static final class a extends AbstractC19075u implements InterfaceC18494a {
        a() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C0750l mo12V4() {
            C0750l c0750l = new C0750l(new C0750l.b(C24716g.this.m128343n(), C24716g.this.f118715o.m13323b(), C24716g.this.f118715o.m13327f()));
            c0750l.mo1261t(C24716g.this.mo128320l());
            return c0750l;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C24716g(C2771b c2771b) {
        super(c2771b);
        InterfaceC24854k m129210a;
        AbstractC19074t.m100208f(c2771b, "args");
        this.f118715o = c2771b;
        m129210a = AbstractC24856m.m129210a(new a());
        this.f118716p = m129210a;
    }

    @Override // pb0.AbstractC24710a
    /* renamed from: C, reason: merged with bridge method [inline-methods] */
    public InterfaceC0746h mo128323t() {
        return (InterfaceC0746h) this.f118716p.getValue();
    }

    /* renamed from: D */
    public final boolean m128366D() {
        return mo128323t().mo1288a();
    }

    /* renamed from: E */
    public final void m128367E() {
        mo128323t().mo1290o();
    }

    @Override // pb0.AbstractC24712c
    /* renamed from: e */
    public boolean mo128340e(Canvas canvas) {
        AbstractC19074t.m100208f(canvas, "canvas");
        return mo128323t().mo1289m(canvas);
    }

    @Override // pb0.AbstractC24712c
    /* renamed from: s */
    public void mo128345s(C25630b c25630b) {
        AbstractC19074t.m100208f(c25630b, "stickerInfo");
        super.mo128345s(c25630b);
        mo128323t().mo1253f(c25630b);
    }
}
