package p228i4;

import android.content.Context;
import om0.InterfaceC24312a;
import p048c4.AbstractC3271d;
import p048c4.InterfaceC3269b;

/* renamed from: i4.h */
/* loaded from: classes.dex */
public final class C20238h implements InterfaceC3269b {

    /* renamed from: a */
    private final InterfaceC24312a f100113a;

    public C20238h(InterfaceC24312a interfaceC24312a) {
        this.f100113a = interfaceC24312a;
    }

    /* renamed from: a */
    public static C20238h m105738a(InterfaceC24312a interfaceC24312a) {
        return new C20238h(interfaceC24312a);
    }

    /* renamed from: c */
    public static String m105739c(Context context) {
        return (String) AbstractC3271d.m16651c(AbstractC20234f.m105730b(context), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // om0.InterfaceC24312a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public String get() {
        return m105739c((Context) this.f100113a.get());
    }
}
