package com.google.android.gms.auth;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.AbstractC4199m;
import com.google.android.gms.common.internal.AbstractC4205o;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import p031b5.AbstractC2552a;

/* loaded from: classes2.dex */
public class AccountChangeEvent extends AbstractSafeParcelable {
    public static final Parcelable.Creator<AccountChangeEvent> CREATOR = new C4049b();

    /* renamed from: p */
    private final int f15896p;

    /* renamed from: q */
    private final long f15897q;

    /* renamed from: r */
    private final String f15898r;

    /* renamed from: s */
    private final int f15899s;

    /* renamed from: t */
    private final int f15900t;

    /* renamed from: u */
    private final String f15901u;

    /* JADX INFO: Access modifiers changed from: package-private */
    public AccountChangeEvent(int i11, long j11, String str, int i12, int i13, String str2) {
        this.f15896p = i11;
        this.f15897q = j11;
        this.f15898r = (String) AbstractC4205o.m19722k(str);
        this.f15899s = i12;
        this.f15900t = i13;
        this.f15901u = str2;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AccountChangeEvent) {
            AccountChangeEvent accountChangeEvent = (AccountChangeEvent) obj;
            if (this.f15896p == accountChangeEvent.f15896p && this.f15897q == accountChangeEvent.f15897q && AbstractC4199m.m19701a(this.f15898r, accountChangeEvent.f15898r) && this.f15899s == accountChangeEvent.f15899s && this.f15900t == accountChangeEvent.f15900t && AbstractC4199m.m19701a(this.f15901u, accountChangeEvent.f15901u)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return AbstractC4199m.m19702b(Integer.valueOf(this.f15896p), Long.valueOf(this.f15897q), this.f15898r, Integer.valueOf(this.f15899s), Integer.valueOf(this.f15900t), this.f15901u);
    }

    public String toString() {
        String str;
        int i11 = this.f15899s;
        if (i11 != 1) {
            if (i11 != 2) {
                if (i11 != 3) {
                    if (i11 != 4) {
                        str = "UNKNOWN";
                    } else {
                        str = "RENAMED_TO";
                    }
                } else {
                    str = "RENAMED_FROM";
                }
            } else {
                str = "REMOVED";
            }
        } else {
            str = "ADDED";
        }
        String str2 = this.f15898r;
        String str3 = this.f15901u;
        int i12 = this.f15900t;
        StringBuilder sb2 = new StringBuilder(String.valueOf(str2).length() + 91 + str.length() + String.valueOf(str3).length());
        sb2.append("AccountChangeEvent {accountName = ");
        sb2.append(str2);
        sb2.append(", changeType = ");
        sb2.append(str);
        sb2.append(", changeData = ");
        sb2.append(str3);
        sb2.append(", eventIndex = ");
        sb2.append(i12);
        sb2.append("}");
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i11) {
        int m12912a = AbstractC2552a.m12912a(parcel);
        AbstractC2552a.m12924m(parcel, 1, this.f15896p);
        AbstractC2552a.m12929r(parcel, 2, this.f15897q);
        AbstractC2552a.m12934w(parcel, 3, this.f15898r, false);
        AbstractC2552a.m12924m(parcel, 4, this.f15899s);
        AbstractC2552a.m12924m(parcel, 5, this.f15900t);
        AbstractC2552a.m12934w(parcel, 6, this.f15901u, false);
        AbstractC2552a.m12913b(parcel, m12912a);
    }
}
