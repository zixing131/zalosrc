package com.google.android.play.core.appupdate;

import p051c7.C3308e;
import p051c7.InterfaceC3312g;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.play.core.appupdate.e0 */
/* loaded from: classes.dex */
public final class C6479e0 implements InterfaceC6478e {

    /* renamed from: a */
    private final C6479e0 f36279a = this;

    /* renamed from: b */
    private final InterfaceC3312g f36280b;

    /* renamed from: c */
    private final InterfaceC3312g f36281c;

    /* renamed from: d */
    private final InterfaceC3312g f36282d;

    /* renamed from: e */
    private final InterfaceC3312g f36283e;

    /* renamed from: f */
    private final InterfaceC3312g f36284f;

    /* renamed from: g */
    private final InterfaceC3312g f36285g;

    public /* synthetic */ C6479e0(C6488n c6488n, AbstractC6477d0 abstractC6477d0) {
        C6490p c6490p = new C6490p(c6488n);
        this.f36280b = c6490p;
        InterfaceC3312g m16754a = C3308e.m16754a(new C6500z(c6490p));
        this.f36281c = m16754a;
        InterfaceC3312g m16754a2 = C3308e.m16754a(new C6498x(c6490p, m16754a));
        this.f36282d = m16754a2;
        InterfaceC3312g m16754a3 = C3308e.m16754a(new C6484j(c6490p));
        this.f36283e = m16754a3;
        InterfaceC3312g m16754a4 = C3308e.m16754a(new C6487m(m16754a2, m16754a3, c6490p));
        this.f36284f = m16754a4;
        this.f36285g = C3308e.m16754a(new C6489o(m16754a4));
    }

    @Override // com.google.android.play.core.appupdate.InterfaceC6478e
    public final InterfaceC6472b zza() {
        return (InterfaceC6472b) this.f36285g.zza();
    }
}
