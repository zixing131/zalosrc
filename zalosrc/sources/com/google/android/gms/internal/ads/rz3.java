package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;

/* loaded from: classes2.dex */
public abstract class rz3 extends pz3 implements InterfaceC5123w9 {

    /* renamed from: z */
    private int f27418z;

    /* JADX INFO: Access modifiers changed from: protected */
    public rz3(String str) {
        super("mvhd");
    }

    /* renamed from: f */
    public final int m26211f() {
        if (!this.f26581r) {
            m25624e();
        }
        return this.f27418z;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: g */
    public final long m26212g(ByteBuffer byteBuffer) {
        this.f27418z = AbstractC5086v9.m27187c(byteBuffer.get());
        AbstractC5086v9.m27188d(byteBuffer);
        byteBuffer.get();
        return 4L;
    }
}
