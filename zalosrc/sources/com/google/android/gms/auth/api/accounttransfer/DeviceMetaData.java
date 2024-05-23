package com.google.android.gms.auth.api.accounttransfer;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import p031b5.AbstractC2552a;

/* loaded from: classes2.dex */
public class DeviceMetaData extends AbstractSafeParcelable {
    public static final Parcelable.Creator<DeviceMetaData> CREATOR = new C4024e();

    /* renamed from: p */
    private final int f15919p;

    /* renamed from: q */
    private boolean f15920q;

    /* renamed from: r */
    private long f15921r;

    /* renamed from: s */
    private final boolean f15922s;

    /* JADX INFO: Access modifiers changed from: package-private */
    public DeviceMetaData(int i11, boolean z11, long j11, boolean z12) {
        this.f15919p = i11;
        this.f15920q = z11;
        this.f15921r = j11;
        this.f15922s = z12;
    }

    /* renamed from: F */
    public boolean m19031F() {
        return this.f15922s;
    }

    /* renamed from: J */
    public boolean m19032J() {
        return this.f15920q;
    }

    /* renamed from: t */
    public long m19033t() {
        return this.f15921r;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i11) {
        int m12912a = AbstractC2552a.m12912a(parcel);
        AbstractC2552a.m12924m(parcel, 1, this.f15919p);
        AbstractC2552a.m12914c(parcel, 2, m19032J());
        AbstractC2552a.m12929r(parcel, 3, m19033t());
        AbstractC2552a.m12914c(parcel, 4, m19031F());
        AbstractC2552a.m12913b(parcel, m12912a);
    }
}
