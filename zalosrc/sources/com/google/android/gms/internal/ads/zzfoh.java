package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import p031b5.AbstractC2552a;

/* loaded from: classes2.dex */
public final class zzfoh extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzfoh> CREATOR = new f13();

    /* renamed from: p */
    public final int f32118p;

    /* renamed from: q */
    private C4606ib f32119q = null;

    /* renamed from: r */
    private byte[] f32120r;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzfoh(int i11, byte[] bArr) {
        this.f32118p = i11;
        this.f32120r = bArr;
        zzb();
    }

    private final void zzb() {
        C4606ib c4606ib = this.f32119q;
        if (c4606ib == null && this.f32120r != null) {
            return;
        }
        if (c4606ib != null && this.f32120r == null) {
            return;
        }
        if (c4606ib != null && this.f32120r != null) {
            throw new IllegalStateException("Invalid internal representation - full");
        }
        if (c4606ib == null && this.f32120r == null) {
            throw new IllegalStateException("Invalid internal representation - empty");
        }
        throw new IllegalStateException("Impossible");
    }

    /* renamed from: t */
    public final C4606ib m28813t() {
        if (this.f32119q == null) {
            try {
                this.f32119q = C4606ib.m23154C0(this.f32120r, gu3.m22615a());
                this.f32120r = null;
            } catch (zzgrq | NullPointerException e11) {
                throw new IllegalStateException(e11);
            }
        }
        zzb();
        return this.f32119q;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        int m12912a = AbstractC2552a.m12912a(parcel);
        AbstractC2552a.m12924m(parcel, 1, this.f32118p);
        byte[] bArr = this.f32120r;
        if (bArr == null) {
            bArr = this.f32119q.mo27346a();
        }
        AbstractC2552a.m12918g(parcel, 2, bArr, false);
        AbstractC2552a.m12913b(parcel, m12912a);
    }
}
