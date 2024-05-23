package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.Key;
import javax.crypto.Mac;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class is3 extends ThreadLocal {

    /* renamed from: a */
    final /* synthetic */ js3 f22396a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public is3(js3 js3Var) {
        this.f22396a = js3Var;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // java.lang.ThreadLocal
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Mac initialValue() {
        String str;
        Key key;
        try {
            vr3 vr3Var = vr3.f29468f;
            str = this.f22396a.f22982b;
            Mac mac = (Mac) vr3Var.m27341a(str);
            key = this.f22396a.f22983c;
            mac.init(key);
            return mac;
        } catch (GeneralSecurityException e11) {
            throw new IllegalStateException(e11);
        }
    }
}
