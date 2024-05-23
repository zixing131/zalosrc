package com.google.android.gms.internal.play_billing;

/* renamed from: com.google.android.gms.internal.play_billing.x0 */
/* loaded from: classes2.dex */
final class C5863x0 {

    /* renamed from: a */
    private final Object f33445a;

    /* renamed from: b */
    private final int f33446b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C5863x0(Object obj, int i11) {
        this.f33445a = obj;
        this.f33446b = i11;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C5863x0)) {
            return false;
        }
        C5863x0 c5863x0 = (C5863x0) obj;
        if (this.f33445a != c5863x0.f33445a || this.f33446b != c5863x0.f33446b) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (System.identityHashCode(this.f33445a) * 65535) + this.f33446b;
    }
}
