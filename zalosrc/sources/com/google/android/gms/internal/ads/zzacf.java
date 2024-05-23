package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* loaded from: classes2.dex */
public final class zzacf implements zzbp {
    public static final Parcelable.Creator<zzacf> CREATOR;

    /* renamed from: v */
    private static final C4671k3 f31739v;

    /* renamed from: w */
    private static final C4671k3 f31740w;

    /* renamed from: p */
    public final String f31741p;

    /* renamed from: q */
    public final String f31742q;

    /* renamed from: r */
    public final long f31743r;

    /* renamed from: s */
    public final long f31744s;

    /* renamed from: t */
    public final byte[] f31745t;

    /* renamed from: u */
    private int f31746u;

    static {
        C5004t1 c5004t1 = new C5004t1();
        c5004t1.m26523s("application/id3");
        f31739v = c5004t1.m26529y();
        C5004t1 c5004t12 = new C5004t1();
        c5004t12.m26523s("application/x-scte35");
        f31740w = c5004t12.m26529y();
        CREATOR = new C4559h1();
    }

    public zzacf(String str, String str2, long j11, long j12, byte[] bArr) {
        this.f31741p = str;
        this.f31742q = str2;
        this.f31743r = j11;
        this.f31744s = j12;
        this.f31745t = bArr;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzacf.class == obj.getClass()) {
            zzacf zzacfVar = (zzacf) obj;
            if (this.f31743r == zzacfVar.f31743r && this.f31744s == zzacfVar.f31744s && g92.m22362t(this.f31741p, zzacfVar.f31741p) && g92.m22362t(this.f31742q, zzacfVar.f31742q) && Arrays.equals(this.f31745t, zzacfVar.f31745t)) {
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
        int i11;
        int i12 = this.f31746u;
        if (i12 == 0) {
            String str = this.f31741p;
            int i13 = 0;
            if (str != null) {
                i11 = str.hashCode();
            } else {
                i11 = 0;
            }
            int i14 = (i11 + 527) * 31;
            String str2 = this.f31742q;
            if (str2 != null) {
                i13 = str2.hashCode();
            }
            long j11 = this.f31743r;
            long j12 = this.f31744s;
            int hashCode = ((((((i14 + i13) * 31) + ((int) (j11 ^ (j11 >>> 32)))) * 31) + ((int) ((j12 >>> 32) ^ j12))) * 31) + Arrays.hashCode(this.f31745t);
            this.f31746u = hashCode;
            return hashCode;
        }
        return i12;
    }

    public final String toString() {
        return "EMSG: scheme=" + this.f31741p + ", id=" + this.f31744s + ", durationMs=" + this.f31743r + ", value=" + this.f31742q;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        parcel.writeString(this.f31741p);
        parcel.writeString(this.f31742q);
        parcel.writeLong(this.f31743r);
        parcel.writeLong(this.f31744s);
        parcel.writeByteArray(this.f31745t);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzacf(Parcel parcel) {
        String readString = parcel.readString();
        int i11 = g92.f20474a;
        this.f31741p = readString;
        this.f31742q = parcel.readString();
        this.f31743r = parcel.readLong();
        this.f31744s = parcel.readLong();
        this.f31745t = (byte[]) g92.m22347h(parcel.createByteArray());
    }
}
