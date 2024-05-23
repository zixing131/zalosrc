package com.google.android.gms.internal.ads;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

/* loaded from: classes2.dex */
public final class qd3 {

    /* renamed from: a */
    private final InputStream f26727a;

    private qd3(InputStream inputStream) {
        this.f26727a = inputStream;
    }

    /* renamed from: b */
    public static qd3 m25694b(byte[] bArr) {
        return new qd3(new ByteArrayInputStream(bArr));
    }

    /* renamed from: a */
    public final xp3 m25695a() {
        try {
            return xp3.m27968J(this.f26727a, gu3.m22615a());
        } finally {
            this.f26727a.close();
        }
    }
}
