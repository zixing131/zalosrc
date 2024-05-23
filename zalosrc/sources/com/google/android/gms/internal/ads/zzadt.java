package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes2.dex */
public final class zzadt implements zzbp {
    public static final Parcelable.Creator<zzadt> CREATOR = new C4449e2();

    /* renamed from: p */
    public final long f31805p;

    /* renamed from: q */
    public final long f31806q;

    /* renamed from: r */
    public final long f31807r;

    /* renamed from: s */
    public final long f31808s;

    /* renamed from: t */
    public final long f31809t;

    public zzadt(long j11, long j12, long j13, long j14, long j15) {
        this.f31805p = j11;
        this.f31806q = j12;
        this.f31807r = j13;
        this.f31808s = j14;
        this.f31809t = j15;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzadt.class == obj.getClass()) {
            zzadt zzadtVar = (zzadt) obj;
            if (this.f31805p == zzadtVar.f31805p && this.f31806q == zzadtVar.f31806q && this.f31807r == zzadtVar.f31807r && this.f31808s == zzadtVar.f31808s && this.f31809t == zzadtVar.f31809t) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzbp
    /* renamed from: f0 */
    public final /* synthetic */ void mo28672f0(C4518fy c4518fy) {
    }

    public final int hashCode() {
        long j11 = this.f31805p;
        long j12 = this.f31806q;
        long j13 = this.f31807r;
        long j14 = this.f31808s;
        long j15 = this.f31809t;
        return ((((((((((int) (j11 ^ (j11 >>> 32))) + 527) * 31) + ((int) (j12 ^ (j12 >>> 32)))) * 31) + ((int) ((j13 >>> 32) ^ j13))) * 31) + ((int) ((j14 >>> 32) ^ j14))) * 31) + ((int) ((j15 >>> 32) ^ j15));
    }

    public final String toString() {
        return "Motion photo metadata: photoStartPosition=" + this.f31805p + ", photoSize=" + this.f31806q + ", photoPresentationTimestampUs=" + this.f31807r + ", videoStartPosition=" + this.f31808s + ", videoSize=" + this.f31809t;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        parcel.writeLong(this.f31805p);
        parcel.writeLong(this.f31806q);
        parcel.writeLong(this.f31807r);
        parcel.writeLong(this.f31808s);
        parcel.writeLong(this.f31809t);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzadt(Parcel parcel, AbstractC4486f2 abstractC4486f2) {
        this.f31805p = parcel.readLong();
        this.f31806q = parcel.readLong();
        this.f31807r = parcel.readLong();
        this.f31808s = parcel.readLong();
        this.f31809t = parcel.readLong();
    }
}
