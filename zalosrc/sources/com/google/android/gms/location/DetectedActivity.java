package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.AbstractC4199m;
import com.google.android.gms.common.internal.AbstractC4205o;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Comparator;
import p031b5.AbstractC2552a;
import p093d6.C17771h0;

/* loaded from: classes2.dex */
public class DetectedActivity extends AbstractSafeParcelable {

    /* renamed from: p */
    int f33480p;

    /* renamed from: q */
    int f33481q;

    /* renamed from: r */
    public static final Comparator f33479r = new C5890k();
    public static final Parcelable.Creator<DetectedActivity> CREATOR = new C17771h0();

    public DetectedActivity(int i11, int i12) {
        this.f33480p = i11;
        this.f33481q = i12;
    }

    /* renamed from: F */
    public int m30599F() {
        int i11 = this.f33480p;
        if (i11 > 22 || i11 < 0) {
            return 4;
        }
        return i11;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof DetectedActivity) {
            DetectedActivity detectedActivity = (DetectedActivity) obj;
            if (this.f33480p == detectedActivity.f33480p && this.f33481q == detectedActivity.f33481q) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return AbstractC4199m.m19702b(Integer.valueOf(this.f33480p), Integer.valueOf(this.f33481q));
    }

    /* renamed from: t */
    public int m30600t() {
        return this.f33481q;
    }

    public String toString() {
        String str;
        int m30599F = m30599F();
        if (m30599F != 0) {
            if (m30599F != 1) {
                if (m30599F != 2) {
                    if (m30599F != 3) {
                        if (m30599F != 4) {
                            if (m30599F != 5) {
                                if (m30599F != 7) {
                                    if (m30599F != 8) {
                                        if (m30599F != 16) {
                                            if (m30599F != 17) {
                                                str = Integer.toString(m30599F);
                                            } else {
                                                str = "IN_RAIL_VEHICLE";
                                            }
                                        } else {
                                            str = "IN_ROAD_VEHICLE";
                                        }
                                    } else {
                                        str = "RUNNING";
                                    }
                                } else {
                                    str = "WALKING";
                                }
                            } else {
                                str = "TILTING";
                            }
                        } else {
                            str = "UNKNOWN";
                        }
                    } else {
                        str = "STILL";
                    }
                } else {
                    str = "ON_FOOT";
                }
            } else {
                str = "ON_BICYCLE";
            }
        } else {
            str = "IN_VEHICLE";
        }
        int i11 = this.f33481q;
        StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 48);
        sb2.append("DetectedActivity [type=");
        sb2.append(str);
        sb2.append(", confidence=");
        sb2.append(i11);
        sb2.append("]");
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i11) {
        AbstractC4205o.m19722k(parcel);
        int m12912a = AbstractC2552a.m12912a(parcel);
        AbstractC2552a.m12924m(parcel, 1, this.f33480p);
        AbstractC2552a.m12924m(parcel, 2, this.f33481q);
        AbstractC2552a.m12913b(parcel, m12912a);
    }
}
