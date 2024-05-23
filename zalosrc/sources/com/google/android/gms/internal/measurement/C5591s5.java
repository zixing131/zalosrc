package com.google.android.gms.internal.measurement;

import android.database.ContentObserver;
import android.os.Handler;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.measurement.s5 */
/* loaded from: classes2.dex */
public final class C5591s5 extends ContentObserver {
    /* JADX INFO: Access modifiers changed from: package-private */
    public C5591s5(Handler handler) {
        super(null);
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z11) {
        AtomicBoolean atomicBoolean;
        atomicBoolean = AbstractC5625u5.f32827e;
        atomicBoolean.set(true);
    }
}
