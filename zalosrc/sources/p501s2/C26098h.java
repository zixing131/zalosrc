package p501s2;

import fn0.AbstractC19074t;
import p515t2.AbstractC26456g;
import p535u2.C26976w;

/* renamed from: s2.h */
/* loaded from: classes.dex */
public final class C26098h extends AbstractC26093c {

    /* renamed from: b */
    private final int f124310b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C26098h(AbstractC26456g abstractC26456g) {
        super(abstractC26456g);
        AbstractC19074t.m100208f(abstractC26456g, "tracker");
        this.f124310b = 9;
    }

    @Override // p501s2.AbstractC26093c
    /* renamed from: b */
    public int mo134279b() {
        return this.f124310b;
    }

    @Override // p501s2.AbstractC26093c
    /* renamed from: c */
    public boolean mo134280c(C26976w c26976w) {
        AbstractC19074t.m100208f(c26976w, "workSpec");
        return c26976w.f127506j.m11512i();
    }

    @Override // p501s2.AbstractC26093c
    /* renamed from: d */
    public /* bridge */ /* synthetic */ boolean mo134281d(Object obj) {
        return m134293g(((Boolean) obj).booleanValue());
    }

    /* renamed from: g */
    public boolean m134293g(boolean z11) {
        return !z11;
    }
}
