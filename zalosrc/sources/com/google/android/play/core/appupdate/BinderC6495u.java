package com.google.android.play.core.appupdate;

import android.os.Bundle;
import com.google.android.play.core.install.InstallException;
import p051c7.C3325t;
import p342m6.C22890k;

/* renamed from: com.google.android.play.core.appupdate.u */
/* loaded from: classes3.dex */
final class BinderC6495u extends AbstractBinderC6494t {
    /* JADX INFO: Access modifiers changed from: package-private */
    public BinderC6495u(C6497w c6497w, C22890k c22890k) {
        super(c6497w, new C3325t("OnCompleteUpdateCallback"), c22890k);
    }

    @Override // com.google.android.play.core.appupdate.AbstractBinderC6494t, p051c7.InterfaceC3319n
    /* renamed from: w */
    public final void mo16788w(Bundle bundle) {
        int i11;
        int i12;
        super.mo16788w(bundle);
        i11 = bundle.getInt("error.code", -2);
        if (i11 != 0) {
            C22890k c22890k = this.f36308q;
            i12 = bundle.getInt("error.code", -2);
            c22890k.m117597d(new InstallException(i12));
            return;
        }
        this.f36308q.m117598e(null);
    }
}
