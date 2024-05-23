package com.google.android.gms.internal.ads;

import java.io.OutputStream;

/* loaded from: classes2.dex */
public final class rd3 {

    /* renamed from: a */
    private final OutputStream f27167a;

    private rd3(OutputStream outputStream) {
        this.f27167a = outputStream;
    }

    /* renamed from: b */
    public static rd3 m26072b(OutputStream outputStream) {
        return new rd3(outputStream);
    }

    /* renamed from: a */
    public final void m26073a(xp3 xp3Var) {
        try {
            xp3Var.m27348k(this.f27167a);
        } finally {
            this.f27167a.close();
        }
    }
}
