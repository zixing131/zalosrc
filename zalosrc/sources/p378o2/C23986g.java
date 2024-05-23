package p378o2;

import en0.InterfaceC18505l;
import fn0.AbstractC19074t;
import p378o2.AbstractC23985f;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: o2.g */
/* loaded from: classes2.dex */
public final class C23986g extends AbstractC23985f {

    /* renamed from: b */
    private final Object f116075b;

    /* renamed from: c */
    private final String f116076c;

    /* renamed from: d */
    private final AbstractC23985f.b f116077d;

    /* renamed from: e */
    private final InterfaceC23984e f116078e;

    public C23986g(Object obj, String str, AbstractC23985f.b bVar, InterfaceC23984e interfaceC23984e) {
        AbstractC19074t.m100208f(obj, "value");
        AbstractC19074t.m100208f(str, "tag");
        AbstractC19074t.m100208f(bVar, "verificationMode");
        AbstractC19074t.m100208f(interfaceC23984e, "logger");
        this.f116075b = obj;
        this.f116076c = str;
        this.f116077d = bVar;
        this.f116078e = interfaceC23984e;
    }

    @Override // p378o2.AbstractC23985f
    /* renamed from: a */
    public Object mo125493a() {
        return this.f116075b;
    }

    @Override // p378o2.AbstractC23985f
    /* renamed from: c */
    public AbstractC23985f mo125494c(String str, InterfaceC18505l interfaceC18505l) {
        AbstractC19074t.m100208f(str, "message");
        AbstractC19074t.m100208f(interfaceC18505l, "condition");
        if (((Boolean) interfaceC18505l.mo205i9(this.f116075b)).booleanValue()) {
            return this;
        }
        return new C23983d(this.f116075b, this.f116076c, str, this.f116078e, this.f116077d);
    }
}
