package com.google.android.gms.auth;

import android.os.Bundle;
import android.os.IBinder;
import p416p5.AbstractBinderC24647j;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.auth.g */
/* loaded from: classes2.dex */
public final class C4054g implements InterfaceC4055h {

    /* renamed from: a */
    private final /* synthetic */ String f16106a;

    /* renamed from: b */
    private final /* synthetic */ Bundle f16107b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C4054g(String str, Bundle bundle) {
        this.f16106a = str;
        this.f16107b = bundle;
    }

    @Override // com.google.android.gms.auth.InterfaceC4055h
    /* renamed from: a */
    public final /* synthetic */ Object mo19154a(IBinder iBinder) {
        Object m19150i;
        m19150i = AbstractC4052e.m19150i(AbstractBinderC24647j.m128188E(iBinder).mo128186G(this.f16106a, this.f16107b));
        Bundle bundle = (Bundle) m19150i;
        String string = bundle.getString("Error");
        if (bundle.getBoolean("booleanResult")) {
            return null;
        }
        throw new GoogleAuthException(string);
    }
}
