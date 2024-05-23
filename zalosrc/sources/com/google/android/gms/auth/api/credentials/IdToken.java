package com.google.android.gms.auth.api.credentials;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.internal.AbstractC4199m;
import com.google.android.gms.common.internal.AbstractC4205o;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import p031b5.AbstractC2552a;
import p415p4.C24635b;

/* loaded from: classes2.dex */
public final class IdToken extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<IdToken> CREATOR = new C24635b();

    /* renamed from: p */
    private final String f15984p;

    /* renamed from: q */
    private final String f15985q;

    public IdToken(String str, String str2) {
        AbstractC4205o.m19713b(!TextUtils.isEmpty(str), "account type string cannot be null or empty");
        AbstractC4205o.m19713b(!TextUtils.isEmpty(str2), "id token string cannot be null or empty");
        this.f15984p = str;
        this.f15985q = str2;
    }

    /* renamed from: F */
    public final String m19065F() {
        return this.f15985q;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof IdToken)) {
            return false;
        }
        IdToken idToken = (IdToken) obj;
        if (AbstractC4199m.m19701a(this.f15984p, idToken.f15984p) && AbstractC4199m.m19701a(this.f15985q, idToken.f15985q)) {
            return true;
        }
        return false;
    }

    /* renamed from: t */
    public final String m19066t() {
        return this.f15984p;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        int m12912a = AbstractC2552a.m12912a(parcel);
        AbstractC2552a.m12934w(parcel, 1, m19066t(), false);
        AbstractC2552a.m12934w(parcel, 2, m19065F(), false);
        AbstractC2552a.m12913b(parcel, m12912a);
    }
}
