package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.ads.r9 */
/* loaded from: classes2.dex */
public final class C4938r9 extends ThreadLocal {
    public C4938r9(AbstractC4975s9 abstractC4975s9) {
    }

    @Override // java.lang.ThreadLocal
    protected final /* synthetic */ Object initialValue() {
        return ByteBuffer.allocate(32);
    }
}
