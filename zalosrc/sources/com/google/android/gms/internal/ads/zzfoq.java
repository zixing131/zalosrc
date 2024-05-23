package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;
import p031b5.AbstractC2552a;

/* loaded from: classes2.dex */
public final class zzfoq extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzfoq> CREATOR = new m13();

    /* renamed from: p */
    public final int f32126p;

    /* renamed from: q */
    public final byte[] f32127q;

    /* renamed from: r */
    public final int f32128r;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzfoq(int i11, byte[] bArr, int i12) {
        this.f32126p = i11;
        this.f32127q = bArr == null ? null : Arrays.copyOf(bArr, bArr.length);
        this.f32128r = i12;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        int m12912a = AbstractC2552a.m12912a(parcel);
        AbstractC2552a.m12924m(parcel, 1, this.f32126p);
        AbstractC2552a.m12918g(parcel, 2, this.f32127q, false);
        AbstractC2552a.m12924m(parcel, 3, this.f32128r);
        AbstractC2552a.m12913b(parcel, m12912a);
    }

    public zzfoq(byte[] bArr, int i11) {
        this(1, null, 1);
    }
}
