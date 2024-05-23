package com.google.android.play.core.appupdate;

import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.google.android.play.core.install.InterfaceC6502b;
import p094d7.InterfaceC17801a;
import p342m6.AbstractC22888j;

/* renamed from: com.google.android.play.core.appupdate.l */
/* loaded from: classes.dex */
final class C6486l implements InterfaceC6472b {

    /* renamed from: a */
    private final C6497w f36290a;

    /* renamed from: b */
    private final C6483i f36291b;

    /* renamed from: c */
    private final Context f36292c;

    /* renamed from: d */
    private final Handler f36293d = new Handler(Looper.getMainLooper());

    /* JADX INFO: Access modifiers changed from: package-private */
    public C6486l(C6497w c6497w, C6483i c6483i, Context context) {
        this.f36290a = c6497w;
        this.f36291b = c6483i;
        this.f36292c = context;
    }

    @Override // com.google.android.play.core.appupdate.InterfaceC6472b
    /* renamed from: a */
    public final AbstractC22888j mo33336a() {
        return this.f36290a.m33362d(this.f36292c.getPackageName());
    }

    @Override // com.google.android.play.core.appupdate.InterfaceC6472b
    /* renamed from: b */
    public final AbstractC22888j mo33337b() {
        return this.f36290a.m33363e(this.f36292c.getPackageName());
    }

    @Override // com.google.android.play.core.appupdate.InterfaceC6472b
    /* renamed from: c */
    public final synchronized void mo33338c(InterfaceC6502b interfaceC6502b) {
        this.f36291b.m16793b(interfaceC6502b);
    }

    @Override // com.google.android.play.core.appupdate.InterfaceC6472b
    /* renamed from: d */
    public final boolean mo33339d(C6470a c6470a, int i11, Activity activity, int i12) {
        AbstractC6476d m33344c = AbstractC6476d.m33344c(i11);
        if (activity == null) {
            return false;
        }
        return m33350f(c6470a, new C6485k(this, activity), m33344c, i12);
    }

    @Override // com.google.android.play.core.appupdate.InterfaceC6472b
    /* renamed from: e */
    public final synchronized void mo33340e(InterfaceC6502b interfaceC6502b) {
        this.f36291b.m16794c(interfaceC6502b);
    }

    /* renamed from: f */
    public final boolean m33350f(C6470a c6470a, InterfaceC17801a interfaceC17801a, AbstractC6476d abstractC6476d, int i11) {
        if (c6470a != null && interfaceC17801a != null && abstractC6476d != null && c6470a.m33328d(abstractC6476d) && !c6470a.m33332i()) {
            c6470a.m33331h();
            interfaceC17801a.mo33349a(c6470a.m33330f(abstractC6476d).getIntentSender(), i11, null, 0, 0, 0, null);
            return true;
        }
        return false;
    }
}
