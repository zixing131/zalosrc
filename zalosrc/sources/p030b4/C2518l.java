package p030b4;

import android.content.Context;
import om0.InterfaceC24312a;
import p048c4.InterfaceC3269b;

/* renamed from: b4.l */
/* loaded from: classes.dex */
public final class C2518l implements InterfaceC3269b {

    /* renamed from: a */
    private final InterfaceC24312a f10233a;

    /* renamed from: b */
    private final InterfaceC24312a f10234b;

    public C2518l(InterfaceC24312a interfaceC24312a, InterfaceC24312a interfaceC24312a2) {
        this.f10233a = interfaceC24312a;
        this.f10234b = interfaceC24312a2;
    }

    /* renamed from: a */
    public static C2518l m12614a(InterfaceC24312a interfaceC24312a, InterfaceC24312a interfaceC24312a2) {
        return new C2518l(interfaceC24312a, interfaceC24312a2);
    }

    /* renamed from: c */
    public static C2517k m12615c(Context context, Object obj) {
        return new C2517k(context, (C2515i) obj);
    }

    @Override // om0.InterfaceC24312a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public C2517k get() {
        return m12615c((Context) this.f10233a.get(), this.f10234b.get());
    }
}
