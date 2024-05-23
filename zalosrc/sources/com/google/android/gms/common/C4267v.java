package com.google.android.gms.common;

import java.util.concurrent.Callable;
import p632x4.AbstractC29324j;

/* renamed from: com.google.android.gms.common.v */
/* loaded from: classes2.dex */
final class C4267v extends C4268w {

    /* renamed from: f */
    private final Callable f16784f;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ C4267v(Callable callable, AbstractC29324j abstractC29324j) {
        super();
        this.f16784f = callable;
    }

    @Override // com.google.android.gms.common.C4268w
    /* renamed from: a */
    final String mo19883a() {
        try {
            return (String) this.f16784f.call();
        } catch (Exception e11) {
            throw new RuntimeException(e11);
        }
    }
}
