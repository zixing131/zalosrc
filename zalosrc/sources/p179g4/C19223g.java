package p179g4;

import om0.InterfaceC24312a;
import p048c4.AbstractC3271d;
import p048c4.InterfaceC3269b;
import p197h4.AbstractC19756f;
import p288k4.InterfaceC21460a;

/* renamed from: g4.g */
/* loaded from: classes.dex */
public final class C19223g implements InterfaceC3269b {

    /* renamed from: a */
    private final InterfaceC24312a f95691a;

    public C19223g(InterfaceC24312a interfaceC24312a) {
        this.f95691a = interfaceC24312a;
    }

    /* renamed from: a */
    public static AbstractC19756f m100870a(InterfaceC21460a interfaceC21460a) {
        return (AbstractC19756f) AbstractC3271d.m16651c(AbstractC19222f.m100869a(interfaceC21460a), "Cannot return null from a non-@Nullable @Provides method");
    }

    /* renamed from: b */
    public static C19223g m100871b(InterfaceC24312a interfaceC24312a) {
        return new C19223g(interfaceC24312a);
    }

    @Override // om0.InterfaceC24312a
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public AbstractC19756f get() {
        return m100870a((InterfaceC21460a) this.f95691a.get());
    }
}
