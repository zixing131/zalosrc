package com.google.android.gms.internal.measurement;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.measurement.a7 */
/* loaded from: classes.dex */
public final class C5287a7 extends AbstractC5355e7 {

    /* renamed from: p */
    static final C5287a7 f32255p = new C5287a7();

    private C5287a7() {
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC5355e7
    /* renamed from: a */
    public final Object mo28878a() {
        throw new IllegalStateException("Optional.get() cannot be called on an absent value");
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC5355e7
    /* renamed from: b */
    public final boolean mo28879b() {
        return false;
    }

    public final boolean equals(Object obj) {
        return obj == this;
    }

    public final int hashCode() {
        return 2040732332;
    }

    public final String toString() {
        return "Optional.absent()";
    }
}
