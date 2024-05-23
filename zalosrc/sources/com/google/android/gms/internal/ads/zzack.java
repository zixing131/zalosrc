package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;

@Deprecated
/* loaded from: classes2.dex */
public class zzack implements zzbp {
    public static final Parcelable.Creator<zzack> CREATOR = new C4669k1();

    /* renamed from: p */
    public final String f31755p;

    /* renamed from: q */
    public final String f31756q;

    public zzack(String str, String str2) {
        this.f31755p = str;
        this.f31756q = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            zzack zzackVar = (zzack) obj;
            if (this.f31755p.equals(zzackVar.f31755p) && this.f31756q.equals(zzackVar.f31756q)) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.google.android.gms.internal.ads.zzbp
    /* renamed from: f0 */
    public final void mo28672f0(C4518fy c4518fy) {
        char c11;
        String str = this.f31755p;
        switch (str.hashCode()) {
            case 62359119:
                if (str.equals("ALBUM")) {
                    c11 = 2;
                    break;
                }
                c11 = 65535;
                break;
            case 79833656:
                if (str.equals("TITLE")) {
                    c11 = 0;
                    break;
                }
                c11 = 65535;
                break;
            case 428414940:
                if (str.equals("DESCRIPTION")) {
                    c11 = 4;
                    break;
                }
                c11 = 65535;
                break;
            case 1746739798:
                if (str.equals("ALBUMARTIST")) {
                    c11 = 3;
                    break;
                }
                c11 = 65535;
                break;
            case 1939198791:
                if (str.equals("ARTIST")) {
                    c11 = 1;
                    break;
                }
                c11 = 65535;
                break;
            default:
                c11 = 65535;
                break;
        }
        if (c11 != 0) {
            if (c11 != 1) {
                if (c11 != 2) {
                    if (c11 != 3) {
                        if (c11 != 4) {
                            return;
                        }
                        c4518fy.m22250y(this.f31756q);
                        return;
                    }
                    c4518fy.m22244s(this.f31756q);
                    return;
                }
                c4518fy.m22245t(this.f31756q);
                return;
            }
            c4518fy.m22246u(this.f31756q);
            return;
        }
        c4518fy.m22237H(this.f31756q);
    }

    public final int hashCode() {
        return ((this.f31755p.hashCode() + 527) * 31) + this.f31756q.hashCode();
    }

    public final String toString() {
        return "VC: " + this.f31755p + "=" + this.f31756q;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        parcel.writeString(this.f31755p);
        parcel.writeString(this.f31756q);
    }

    public zzack(Parcel parcel) {
        String readString = parcel.readString();
        int i11 = g92.f20474a;
        this.f31755p = readString;
        this.f31756q = parcel.readString();
    }
}
