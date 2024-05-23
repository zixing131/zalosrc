package p293k9;

import nm0.AbstractC23885b;
import om0.InterfaceC24312a;
import p015a9.InterfaceC0662b;

/* renamed from: k9.h */
/* loaded from: classes3.dex */
public final class C21605h implements InterfaceC24312a {

    /* renamed from: a */
    private final C21598a f104958a;

    public C21605h(C21598a c21598a) {
        this.f104958a = c21598a;
    }

    /* renamed from: a */
    public static C21605h m111544a(C21598a c21598a) {
        return new C21605h(c21598a);
    }

    /* renamed from: c */
    public static InterfaceC0662b m111545c(C21598a c21598a) {
        return (InterfaceC0662b) AbstractC23885b.m124958c(c21598a.m111525g(), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // om0.InterfaceC24312a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public InterfaceC0662b get() {
        return m111545c(this.f104958a);
    }
}
