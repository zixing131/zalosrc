package p010a4;

import om0.InterfaceC24312a;
import p048c4.InterfaceC3269b;
import p179g4.InterfaceC19221e;
import p197h4.C19768r;
import p197h4.C19772v;
import p288k4.InterfaceC21460a;

/* renamed from: a4.w */
/* loaded from: classes.dex */
public final class C0130w implements InterfaceC3269b {

    /* renamed from: a */
    private final InterfaceC24312a f711a;

    /* renamed from: b */
    private final InterfaceC24312a f712b;

    /* renamed from: c */
    private final InterfaceC24312a f713c;

    /* renamed from: d */
    private final InterfaceC24312a f714d;

    /* renamed from: e */
    private final InterfaceC24312a f715e;

    public C0130w(InterfaceC24312a interfaceC24312a, InterfaceC24312a interfaceC24312a2, InterfaceC24312a interfaceC24312a3, InterfaceC24312a interfaceC24312a4, InterfaceC24312a interfaceC24312a5) {
        this.f711a = interfaceC24312a;
        this.f712b = interfaceC24312a2;
        this.f713c = interfaceC24312a3;
        this.f714d = interfaceC24312a4;
        this.f715e = interfaceC24312a5;
    }

    /* renamed from: a */
    public static C0130w m566a(InterfaceC24312a interfaceC24312a, InterfaceC24312a interfaceC24312a2, InterfaceC24312a interfaceC24312a3, InterfaceC24312a interfaceC24312a4, InterfaceC24312a interfaceC24312a5) {
        return new C0130w(interfaceC24312a, interfaceC24312a2, interfaceC24312a3, interfaceC24312a4, interfaceC24312a5);
    }

    /* renamed from: c */
    public static C0128u m567c(InterfaceC21460a interfaceC21460a, InterfaceC21460a interfaceC21460a2, InterfaceC19221e interfaceC19221e, C19768r c19768r, C19772v c19772v) {
        return new C0128u(interfaceC21460a, interfaceC21460a2, interfaceC19221e, c19768r, c19772v);
    }

    @Override // om0.InterfaceC24312a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public C0128u get() {
        return m567c((InterfaceC21460a) this.f711a.get(), (InterfaceC21460a) this.f712b.get(), (InterfaceC19221e) this.f713c.get(), (C19768r) this.f714d.get(), (C19772v) this.f715e.get());
    }
}
