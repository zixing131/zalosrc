package com.google.android.gms.internal.measurement;

import android.database.ContentObserver;
import android.os.Handler;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.measurement.z5 */
/* loaded from: classes.dex */
public final class C5710z5 extends ContentObserver {

    /* renamed from: a */
    final /* synthetic */ C5286a6 f32956a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5710z5(C5286a6 c5286a6, Handler handler) {
        super(null);
        this.f32956a = c5286a6;
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z11) {
        this.f32956a.m28877e();
    }
}
