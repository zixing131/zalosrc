package com.google.android.gms.internal.measurement;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.measurement.g7 */
/* loaded from: classes.dex */
public final class C5389g7 extends AbstractC5355e7 {

    /* renamed from: p */
    private final Object f32387p;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C5389g7(Object obj) {
        this.f32387p = obj;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC5355e7
    /* renamed from: a */
    public final Object mo28878a() {
        return this.f32387p;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC5355e7
    /* renamed from: b */
    public final boolean mo28879b() {
        return true;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C5389g7) {
            return this.f32387p.equals(((C5389g7) obj).f32387p);
        }
        return false;
    }

    public final int hashCode() {
        return this.f32387p.hashCode() + 1502476572;
    }

    public final String toString() {
        return "Optional.of(" + this.f32387p.toString() + ")";
    }
}
