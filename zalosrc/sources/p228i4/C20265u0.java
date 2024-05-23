package p228i4;

import android.content.Context;
import om0.InterfaceC24312a;
import p048c4.InterfaceC3269b;

/* renamed from: i4.u0 */
/* loaded from: classes.dex */
public final class C20265u0 implements InterfaceC3269b {

    /* renamed from: a */
    private final InterfaceC24312a f100163a;

    /* renamed from: b */
    private final InterfaceC24312a f100164b;

    /* renamed from: c */
    private final InterfaceC24312a f100165c;

    public C20265u0(InterfaceC24312a interfaceC24312a, InterfaceC24312a interfaceC24312a2, InterfaceC24312a interfaceC24312a3) {
        this.f100163a = interfaceC24312a;
        this.f100164b = interfaceC24312a2;
        this.f100165c = interfaceC24312a3;
    }

    /* renamed from: a */
    public static C20265u0 m105840a(InterfaceC24312a interfaceC24312a, InterfaceC24312a interfaceC24312a2, InterfaceC24312a interfaceC24312a3) {
        return new C20265u0(interfaceC24312a, interfaceC24312a2, interfaceC24312a3);
    }

    /* renamed from: c */
    public static C20263t0 m105841c(Context context, String str, int i11) {
        return new C20263t0(context, str, i11);
    }

    @Override // om0.InterfaceC24312a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public C20263t0 get() {
        return m105841c((Context) this.f100163a.get(), (String) this.f100164b.get(), ((Integer) this.f100165c.get()).intValue());
    }
}
