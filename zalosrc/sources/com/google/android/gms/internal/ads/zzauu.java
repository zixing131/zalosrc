package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.UUID;

/* loaded from: classes2.dex */
public final class zzauu implements Parcelable {
    public static final Parcelable.Creator<zzauu> CREATOR = new C4466ej();

    /* renamed from: p */
    private int f31843p;

    /* renamed from: q */
    private final UUID f31844q;

    /* renamed from: r */
    public final String f31845r;

    /* renamed from: s */
    public final byte[] f31846s;

    /* renamed from: t */
    public final boolean f31847t;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzauu(Parcel parcel) {
        this.f31844q = new UUID(parcel.readLong(), parcel.readLong());
        this.f31845r = parcel.readString();
        this.f31846s = parcel.createByteArray();
        this.f31847t = parcel.readByte() != 0;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzauu)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        zzauu zzauuVar = (zzauu) obj;
        if (!this.f31845r.equals(zzauuVar.f31845r) || !AbstractC4916qo.m25839o(this.f31844q, zzauuVar.f31844q) || !Arrays.equals(this.f31846s, zzauuVar.f31846s)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i11 = this.f31843p;
        if (i11 == 0) {
            int hashCode = (((this.f31844q.hashCode() * 31) + this.f31845r.hashCode()) * 31) + Arrays.hashCode(this.f31846s);
            this.f31843p = hashCode;
            return hashCode;
        }
        return i11;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        parcel.writeLong(this.f31844q.getMostSignificantBits());
        parcel.writeLong(this.f31844q.getLeastSignificantBits());
        parcel.writeString(this.f31845r);
        parcel.writeByteArray(this.f31846s);
        parcel.writeByte(this.f31847t ? (byte) 1 : (byte) 0);
    }

    public zzauu(UUID uuid, String str, byte[] bArr, boolean z11) {
        uuid.getClass();
        this.f31844q = uuid;
        this.f31845r = str;
        bArr.getClass();
        this.f31846s = bArr;
        this.f31847t = false;
    }
}
