package com.google.android.gms.measurement.internal;

import android.os.Bundle;

/* renamed from: com.google.android.gms.measurement.internal.p3 */
/* loaded from: classes.dex */
public final class C6093p3 {

    /* renamed from: a */
    public final String f34320a;

    /* renamed from: b */
    public final String f34321b;

    /* renamed from: c */
    public final long f34322c;

    /* renamed from: d */
    public final Bundle f34323d;

    public C6093p3(String str, String str2, Bundle bundle, long j11) {
        this.f34320a = str;
        this.f34321b = str2;
        this.f34323d = bundle;
        this.f34322c = j11;
    }

    /* renamed from: b */
    public static C6093p3 m31273b(zzaw zzawVar) {
        return new C6093p3(zzawVar.f34676p, zzawVar.f34678r, zzawVar.f34677q.m31509F(), zzawVar.f34679s);
    }

    /* renamed from: a */
    public final zzaw m31274a() {
        return new zzaw(this.f34320a, new zzau(new Bundle(this.f34323d)), this.f34321b, this.f34322c);
    }

    public final String toString() {
        return "origin=" + this.f34321b + ",name=" + this.f34320a + ",params=" + this.f34323d.toString();
    }
}
