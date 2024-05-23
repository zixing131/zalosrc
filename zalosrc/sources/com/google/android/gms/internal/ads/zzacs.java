package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* loaded from: classes2.dex */
public final class zzacs extends zzadd {
    public static final Parcelable.Creator<zzacs> CREATOR = new C4818o1();

    /* renamed from: q */
    public final String f31768q;

    /* renamed from: r */
    public final int f31769r;

    /* renamed from: s */
    public final int f31770s;

    /* renamed from: t */
    public final long f31771t;

    /* renamed from: u */
    public final long f31772u;

    /* renamed from: v */
    private final zzadd[] f31773v;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzacs(Parcel parcel) {
        super("CHAP");
        String readString = parcel.readString();
        int i11 = g92.f20474a;
        this.f31768q = readString;
        this.f31769r = parcel.readInt();
        this.f31770s = parcel.readInt();
        this.f31771t = parcel.readLong();
        this.f31772u = parcel.readLong();
        int readInt = parcel.readInt();
        this.f31773v = new zzadd[readInt];
        for (int i12 = 0; i12 < readInt; i12++) {
            this.f31773v[i12] = (zzadd) parcel.readParcelable(zzadd.class.getClassLoader());
        }
    }

    @Override // com.google.android.gms.internal.ads.zzadd, android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzacs.class == obj.getClass()) {
            zzacs zzacsVar = (zzacs) obj;
            if (this.f31769r == zzacsVar.f31769r && this.f31770s == zzacsVar.f31770s && this.f31771t == zzacsVar.f31771t && this.f31772u == zzacsVar.f31772u && g92.m22362t(this.f31768q, zzacsVar.f31768q) && Arrays.equals(this.f31773v, zzacsVar.f31773v)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i11;
        int i12 = (((((((this.f31769r + 527) * 31) + this.f31770s) * 31) + ((int) this.f31771t)) * 31) + ((int) this.f31772u)) * 31;
        String str = this.f31768q;
        if (str != null) {
            i11 = str.hashCode();
        } else {
            i11 = 0;
        }
        return i12 + i11;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        parcel.writeString(this.f31768q);
        parcel.writeInt(this.f31769r);
        parcel.writeInt(this.f31770s);
        parcel.writeLong(this.f31771t);
        parcel.writeLong(this.f31772u);
        parcel.writeInt(this.f31773v.length);
        for (zzadd zzaddVar : this.f31773v) {
            parcel.writeParcelable(zzaddVar, 0);
        }
    }

    public zzacs(String str, int i11, int i12, long j11, long j12, zzadd[] zzaddVarArr) {
        super("CHAP");
        this.f31768q = str;
        this.f31769r = i11;
        this.f31770s = i12;
        this.f31771t = j11;
        this.f31772u = j12;
        this.f31773v = zzaddVarArr;
    }
}
