package p501s2;

import fn0.AbstractC19074t;
import p515t2.C26452c;
import p535u2.C26976w;

/* renamed from: s2.b */
/* loaded from: classes.dex */
public final class C26092b extends AbstractC26093c {

    /* renamed from: b */
    private final int f124293b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C26092b(C26452c c26452c) {
        super(c26452c);
        AbstractC19074t.m100208f(c26452c, "tracker");
        this.f124293b = 5;
    }

    @Override // p501s2.AbstractC26093c
    /* renamed from: b */
    public int mo134279b() {
        return this.f124293b;
    }

    @Override // p501s2.AbstractC26093c
    /* renamed from: c */
    public boolean mo134280c(C26976w c26976w) {
        AbstractC19074t.m100208f(c26976w, "workSpec");
        return c26976w.f127506j.m11509f();
    }

    @Override // p501s2.AbstractC26093c
    /* renamed from: d */
    public /* bridge */ /* synthetic */ boolean mo134281d(Object obj) {
        return m134283g(((Boolean) obj).booleanValue());
    }

    /* renamed from: g */
    public boolean m134283g(boolean z11) {
        return !z11;
    }
}
