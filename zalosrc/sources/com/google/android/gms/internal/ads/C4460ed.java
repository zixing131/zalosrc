package com.google.android.gms.internal.ads;

import java.io.File;
import java.security.GeneralSecurityException;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.ads.ed */
/* loaded from: classes2.dex */
public final class C4460ed implements n13 {

    /* renamed from: a */
    final /* synthetic */ sz2 f19590a;

    public C4460ed(C4534gd c4534gd, sz2 sz2Var) {
        this.f19590a = sz2Var;
    }

    @Override // com.google.android.gms.internal.ads.n13
    /* renamed from: a */
    public final boolean mo21692a(File file) {
        try {
            return this.f19590a.m26458a(file);
        } catch (GeneralSecurityException unused) {
            return false;
        }
    }
}
