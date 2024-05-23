package com.google.firebase;

import android.os.SystemClock;

/* renamed from: com.google.firebase.l */
/* loaded from: classes.dex */
public abstract class AbstractC6596l {
    /* renamed from: a */
    public static AbstractC6596l m33687a(long j11, long j12, long j13) {
        return new C6535a(j11, j12, j13);
    }

    /* renamed from: e */
    public static AbstractC6596l m33688e() {
        return m33687a(System.currentTimeMillis(), SystemClock.elapsedRealtime(), SystemClock.uptimeMillis());
    }

    /* renamed from: b */
    public abstract long mo33458b();

    /* renamed from: c */
    public abstract long mo33459c();

    /* renamed from: d */
    public abstract long mo33460d();
}
