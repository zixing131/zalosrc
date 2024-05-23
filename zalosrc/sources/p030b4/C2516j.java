package p030b4;

import android.content.Context;
import om0.InterfaceC24312a;
import p048c4.InterfaceC3269b;
import p288k4.InterfaceC21460a;

/* renamed from: b4.j */
/* loaded from: classes.dex */
public final class C2516j implements InterfaceC3269b {

    /* renamed from: a */
    private final InterfaceC24312a f10225a;

    /* renamed from: b */
    private final InterfaceC24312a f10226b;

    /* renamed from: c */
    private final InterfaceC24312a f10227c;

    public C2516j(InterfaceC24312a interfaceC24312a, InterfaceC24312a interfaceC24312a2, InterfaceC24312a interfaceC24312a3) {
        this.f10225a = interfaceC24312a;
        this.f10226b = interfaceC24312a2;
        this.f10227c = interfaceC24312a3;
    }

    /* renamed from: a */
    public static C2516j m12607a(InterfaceC24312a interfaceC24312a, InterfaceC24312a interfaceC24312a2, InterfaceC24312a interfaceC24312a3) {
        return new C2516j(interfaceC24312a, interfaceC24312a2, interfaceC24312a3);
    }

    /* renamed from: c */
    public static C2515i m12608c(Context context, InterfaceC21460a interfaceC21460a, InterfaceC21460a interfaceC21460a2) {
        return new C2515i(context, interfaceC21460a, interfaceC21460a2);
    }

    @Override // om0.InterfaceC24312a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public C2515i get() {
        return m12608c((Context) this.f10225a.get(), (InterfaceC21460a) this.f10226b.get(), (InterfaceC21460a) this.f10227c.get());
    }
}
