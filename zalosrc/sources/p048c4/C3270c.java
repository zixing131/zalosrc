package p048c4;

/* renamed from: c4.c */
/* loaded from: classes.dex */
public final class C3270c implements InterfaceC3269b {

    /* renamed from: b */
    private static final C3270c f14030b = new C3270c(null);

    /* renamed from: a */
    private final Object f14031a;

    private C3270c(Object obj) {
        this.f14031a = obj;
    }

    /* renamed from: a */
    public static InterfaceC3269b m16648a(Object obj) {
        return new C3270c(AbstractC3271d.m16651c(obj, "instance cannot be null"));
    }

    @Override // om0.InterfaceC24312a
    public Object get() {
        return this.f14031a;
    }
}
