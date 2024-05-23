package p293k9;

import nm0.AbstractC23885b;
import om0.InterfaceC24312a;
import p015a9.InterfaceC0662b;

/* renamed from: k9.e */
/* loaded from: classes3.dex */
public final class C21602e implements InterfaceC24312a {

    /* renamed from: a */
    private final C21598a f104955a;

    public C21602e(C21598a c21598a) {
        this.f104955a = c21598a;
    }

    /* renamed from: a */
    public static C21602e m111535a(C21598a c21598a) {
        return new C21602e(c21598a);
    }

    /* renamed from: c */
    public static InterfaceC0662b m111536c(C21598a c21598a) {
        return (InterfaceC0662b) AbstractC23885b.m124958c(c21598a.m111522d(), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // om0.InterfaceC24312a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public InterfaceC0662b get() {
        return m111536c(this.f104955a);
    }
}
