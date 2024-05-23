package com.google.android.gms.auth;

import android.accounts.Account;
import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import java.io.IOException;
import p092d5.C17737a;
import p416p5.AbstractBinderC24647j;
import p416p5.EnumC24643f;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.auth.f */
/* loaded from: classes2.dex */
public final class C4053f implements InterfaceC4055h {

    /* renamed from: a */
    private final /* synthetic */ Account f16103a;

    /* renamed from: b */
    private final /* synthetic */ String f16104b;

    /* renamed from: c */
    private final /* synthetic */ Bundle f16105c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C4053f(Account account, String str, Bundle bundle) {
        this.f16103a = account;
        this.f16104b = str;
        this.f16105c = bundle;
    }

    @Override // com.google.android.gms.auth.InterfaceC4055h
    /* renamed from: a */
    public final /* synthetic */ Object mo19154a(IBinder iBinder) {
        Object m19150i;
        C17737a c17737a;
        m19150i = AbstractC4052e.m19150i(AbstractBinderC24647j.m128188E(iBinder).mo128187t2(this.f16103a, this.f16104b, this.f16105c));
        Bundle bundle = (Bundle) m19150i;
        TokenData m19024t = TokenData.m19024t(bundle, "tokenDetails");
        if (m19024t != null) {
            return m19024t;
        }
        String string = bundle.getString("Error");
        Intent intent = (Intent) bundle.getParcelable("userRecoveryIntent");
        EnumC24643f m128183c = EnumC24643f.m128183c(string);
        if (EnumC24643f.m128182b(m128183c)) {
            c17737a = AbstractC4052e.f16102e;
            String valueOf = String.valueOf(m128183c);
            StringBuilder sb2 = new StringBuilder(valueOf.length() + 31);
            sb2.append("isUserRecoverableError status: ");
            sb2.append(valueOf);
            c17737a.m93903f("GoogleAuthUtil", sb2.toString());
            throw new UserRecoverableAuthException(string, intent);
        }
        if (!EnumC24643f.NETWORK_ERROR.equals(m128183c) && !EnumC24643f.SERVICE_UNAVAILABLE.equals(m128183c) && !EnumC24643f.INTNERNAL_ERROR.equals(m128183c)) {
            throw new GoogleAuthException(string);
        }
        throw new IOException(string);
    }
}
