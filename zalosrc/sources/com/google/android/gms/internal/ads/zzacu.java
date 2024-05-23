package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* loaded from: classes2.dex */
public final class zzacu extends zzadd {
    public static final Parcelable.Creator<zzacu> CREATOR = new C4855p1();

    /* renamed from: q */
    public final String f31774q;

    /* renamed from: r */
    public final boolean f31775r;

    /* renamed from: s */
    public final boolean f31776s;

    /* renamed from: t */
    public final String[] f31777t;

    /* renamed from: u */
    private final zzadd[] f31778u;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzacu(Parcel parcel) {
        super("CTOC");
        String readString = parcel.readString();
        int i11 = g92.f20474a;
        this.f31774q = readString;
        this.f31775r = parcel.readByte() != 0;
        this.f31776s = parcel.readByte() != 0;
        this.f31777t = (String[]) g92.m22347h(parcel.createStringArray());
        int readInt = parcel.readInt();
        this.f31778u = new zzadd[readInt];
        for (int i12 = 0; i12 < readInt; i12++) {
            this.f31778u[i12] = (zzadd) parcel.readParcelable(zzadd.class.getClassLoader());
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzacu.class == obj.getClass()) {
            zzacu zzacuVar = (zzacu) obj;
            if (this.f31775r == zzacuVar.f31775r && this.f31776s == zzacuVar.f31776s && g92.m22362t(this.f31774q, zzacuVar.f31774q) && Arrays.equals(this.f31777t, zzacuVar.f31777t) && Arrays.equals(this.f31778u, zzacuVar.f31778u)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i11;
        int i12 = ((((this.f31775r ? 1 : 0) + 527) * 31) + (this.f31776s ? 1 : 0)) * 31;
        String str = this.f31774q;
        if (str != null) {
            i11 = str.hashCode();
        } else {
            i11 = 0;
        }
        return i12 + i11;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        parcel.writeString(this.f31774q);
        parcel.writeByte(this.f31775r ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f31776s ? (byte) 1 : (byte) 0);
        parcel.writeStringArray(this.f31777t);
        parcel.writeInt(this.f31778u.length);
        for (zzadd zzaddVar : this.f31778u) {
            parcel.writeParcelable(zzaddVar, 0);
        }
    }

    public zzacu(String str, boolean z11, boolean z12, String[] strArr, zzadd[] zzaddVarArr) {
        super("CTOC");
        this.f31774q = str;
        this.f31775r = z11;
        this.f31776s = z12;
        this.f31777t = strArr;
        this.f31778u = zzaddVarArr;
    }
}
