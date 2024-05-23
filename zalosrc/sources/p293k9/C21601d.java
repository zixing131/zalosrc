package p293k9;

import nm0.AbstractC23885b;
import om0.InterfaceC24312a;
import p035b9.InterfaceC2661e;

/* renamed from: k9.d */
/* loaded from: classes3.dex */
public final class C21601d implements InterfaceC24312a {

    /* renamed from: a */
    private final C21598a f104954a;

    public C21601d(C21598a c21598a) {
        this.f104954a = c21598a;
    }

    /* renamed from: a */
    public static C21601d m111532a(C21598a c21598a) {
        return new C21601d(c21598a);
    }

    /* renamed from: c */
    public static InterfaceC2661e m111533c(C21598a c21598a) {
        return (InterfaceC2661e) AbstractC23885b.m124958c(c21598a.m111521c(), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // om0.InterfaceC24312a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public InterfaceC2661e get() {
        return m111533c(this.f104954a);
    }
}
