package gk0;

import android.graphics.drawable.Drawable;
import fn0.AbstractC19074t;
import ok0.InterfaceC24285b;
import p516t3.C26469c;
import p516t3.C26473g;
import p566v3.C27508p;

/* renamed from: gk0.b */
/* loaded from: classes7.dex */
public final class C19474b implements InterfaceC24285b.b {

    /* renamed from: a */
    private C26469c f96627a;

    public C19474b(C27508p c27508p) {
        AbstractC19074t.m100208f(c27508p, "kfImage");
        this.f96627a = m101824e(c27508p);
    }

    /* renamed from: e */
    private final C26469c m101824e(C27508p c27508p) {
        C26469c m136447a = new C26473g().m136448b(c27508p).m136447a();
        AbstractC19074t.m100207e(m136447a, "build(...)");
        return m136447a;
    }

    @Override // ok0.InterfaceC24285b
    /* renamed from: a */
    public boolean mo101820a() {
        return this.f96627a.m136407i();
    }

    @Override // ok0.InterfaceC24285b
    /* renamed from: b */
    public void mo101821b() {
        this.f96627a.m136419u();
    }

    @Override // ok0.InterfaceC24285b
    /* renamed from: c */
    public void mo101822c() {
        this.f96627a.m136418t();
    }

    @Override // ok0.InterfaceC24285b
    /* renamed from: d */
    public Drawable mo101823d() {
        return this.f96627a;
    }
}
