package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.UUID;

/* loaded from: classes2.dex */
public final class zzw implements Parcelable {
    public static final Parcelable.Creator<zzw> CREATOR = new uh4();

    /* renamed from: p */
    private int f32162p;

    /* renamed from: q */
    public final UUID f32163q;

    /* renamed from: r */
    public final String f32164r;

    /* renamed from: s */
    public final String f32165s;

    /* renamed from: t */
    public final byte[] f32166t;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzw(Parcel parcel) {
        this.f32163q = new UUID(parcel.readLong(), parcel.readLong());
        this.f32164r = parcel.readString();
        String readString = parcel.readString();
        int i11 = g92.f20474a;
        this.f32165s = readString;
        this.f32166t = parcel.createByteArray();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzw)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        zzw zzwVar = (zzw) obj;
        if (!g92.m22362t(this.f32164r, zzwVar.f32164r) || !g92.m22362t(this.f32165s, zzwVar.f32165s) || !g92.m22362t(this.f32163q, zzwVar.f32163q) || !Arrays.equals(this.f32166t, zzwVar.f32166t)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode;
        int i11 = this.f32162p;
        if (i11 == 0) {
            int hashCode2 = this.f32163q.hashCode() * 31;
            String str = this.f32164r;
            if (str == null) {
                hashCode = 0;
            } else {
                hashCode = str.hashCode();
            }
            int hashCode3 = ((((hashCode2 + hashCode) * 31) + this.f32165s.hashCode()) * 31) + Arrays.hashCode(this.f32166t);
            this.f32162p = hashCode3;
            return hashCode3;
        }
        return i11;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        parcel.writeLong(this.f32163q.getMostSignificantBits());
        parcel.writeLong(this.f32163q.getLeastSignificantBits());
        parcel.writeString(this.f32164r);
        parcel.writeString(this.f32165s);
        parcel.writeByteArray(this.f32166t);
    }

    public zzw(UUID uuid, String str, String str2, byte[] bArr) {
        uuid.getClass();
        this.f32163q = uuid;
        this.f32164r = null;
        this.f32165s = str2;
        this.f32166t = bArr;
    }
}
