package p179g4;

import android.content.Context;
import om0.InterfaceC24312a;
import p048c4.AbstractC3271d;
import p048c4.InterfaceC3269b;
import p197h4.AbstractC19756f;
import p197h4.InterfaceC19774x;
import p228i4.InterfaceC20230d;
import p288k4.InterfaceC21460a;

/* renamed from: g4.i */
/* loaded from: classes.dex */
public final class C19225i implements InterfaceC3269b {

    /* renamed from: a */
    private final InterfaceC24312a f95692a;

    /* renamed from: b */
    private final InterfaceC24312a f95693b;

    /* renamed from: c */
    private final InterfaceC24312a f95694c;

    /* renamed from: d */
    private final InterfaceC24312a f95695d;

    public C19225i(InterfaceC24312a interfaceC24312a, InterfaceC24312a interfaceC24312a2, InterfaceC24312a interfaceC24312a3, InterfaceC24312a interfaceC24312a4) {
        this.f95692a = interfaceC24312a;
        this.f95693b = interfaceC24312a2;
        this.f95694c = interfaceC24312a3;
        this.f95695d = interfaceC24312a4;
    }

    /* renamed from: a */
    public static C19225i m100874a(InterfaceC24312a interfaceC24312a, InterfaceC24312a interfaceC24312a2, InterfaceC24312a interfaceC24312a3, InterfaceC24312a interfaceC24312a4) {
        return new C19225i(interfaceC24312a, interfaceC24312a2, interfaceC24312a3, interfaceC24312a4);
    }

    /* renamed from: c */
    public static InterfaceC19774x m100875c(Context context, InterfaceC20230d interfaceC20230d, AbstractC19756f abstractC19756f, InterfaceC21460a interfaceC21460a) {
        return (InterfaceC19774x) AbstractC3271d.m16651c(AbstractC19224h.m100873a(context, interfaceC20230d, abstractC19756f, interfaceC21460a), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // om0.InterfaceC24312a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public InterfaceC19774x get() {
        return m100875c((Context) this.f95692a.get(), (InterfaceC20230d) this.f95693b.get(), (AbstractC19756f) this.f95694c.get(), (InterfaceC21460a) this.f95695d.get());
    }
}
