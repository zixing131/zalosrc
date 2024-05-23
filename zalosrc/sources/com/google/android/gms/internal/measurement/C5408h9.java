package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.h9 */
/* loaded from: classes2.dex */
final class C5408h9 {

    /* renamed from: a */
    private final Object f32402a;

    /* renamed from: b */
    private final int f32403b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C5408h9(Object obj, int i11) {
        this.f32402a = obj;
        this.f32403b = i11;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C5408h9)) {
            return false;
        }
        C5408h9 c5408h9 = (C5408h9) obj;
        if (this.f32402a != c5408h9.f32402a || this.f32403b != c5408h9.f32403b) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (System.identityHashCode(this.f32402a) * 65535) + this.f32403b;
    }
}
