package com.google.android.play.core.appupdate;

import android.os.Bundle;
import com.google.android.play.core.install.InstallException;
import p051c7.C3325t;
import p342m6.C22890k;

/* renamed from: com.google.android.play.core.appupdate.v */
/* loaded from: classes3.dex */
final class BinderC6496v extends AbstractBinderC6494t {

    /* renamed from: s */
    private final String f36310s;

    /* renamed from: t */
    final /* synthetic */ C6497w f36311t;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BinderC6496v(C6497w c6497w, C22890k c22890k, String str) {
        super(c6497w, new C3325t("OnRequestInstallCallback"), c22890k);
        this.f36311t = c6497w;
        this.f36310s = str;
    }

    @Override // com.google.android.play.core.appupdate.AbstractBinderC6494t, p051c7.InterfaceC3319n
    /* renamed from: M */
    public final void mo16787M(Bundle bundle) {
        int i11;
        int i12;
        super.mo16787M(bundle);
        i11 = bundle.getInt("error.code", -2);
        if (i11 != 0) {
            C22890k c22890k = this.f36308q;
            i12 = bundle.getInt("error.code", -2);
            c22890k.m117597d(new InstallException(i12));
            return;
        }
        this.f36308q.m117598e(C6497w.m33356f(this.f36311t, bundle, this.f36310s));
    }
}
