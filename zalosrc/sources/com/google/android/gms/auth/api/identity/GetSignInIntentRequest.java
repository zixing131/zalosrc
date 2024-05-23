package com.google.android.gms.auth.api.identity;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.AbstractC4199m;
import com.google.android.gms.common.internal.AbstractC4205o;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import p031b5.AbstractC2552a;

/* loaded from: classes2.dex */
public class GetSignInIntentRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<GetSignInIntentRequest> CREATOR = new C4032b();

    /* renamed from: p */
    private final String f15998p;

    /* renamed from: q */
    private final String f15999q;

    /* renamed from: r */
    private String f16000r;

    /* JADX INFO: Access modifiers changed from: package-private */
    public GetSignInIntentRequest(String str, String str2, String str3) {
        AbstractC4205o.m19722k(str);
        this.f15998p = str;
        this.f15999q = str2;
        this.f16000r = str3;
    }

    /* renamed from: F */
    public String m19078F() {
        return this.f15998p;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof GetSignInIntentRequest)) {
            return false;
        }
        GetSignInIntentRequest getSignInIntentRequest = (GetSignInIntentRequest) obj;
        if (!AbstractC4199m.m19701a(this.f15998p, getSignInIntentRequest.f15998p) || !AbstractC4199m.m19701a(this.f15999q, getSignInIntentRequest.f15999q) || !AbstractC4199m.m19701a(this.f16000r, getSignInIntentRequest.f16000r)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AbstractC4199m.m19702b(this.f15998p, this.f15999q, this.f16000r);
    }

    /* renamed from: t */
    public String m19079t() {
        return this.f15999q;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i11) {
        int m12912a = AbstractC2552a.m12912a(parcel);
        AbstractC2552a.m12934w(parcel, 1, m19078F(), false);
        AbstractC2552a.m12934w(parcel, 2, m19079t(), false);
        AbstractC2552a.m12934w(parcel, 3, this.f16000r, false);
        AbstractC2552a.m12913b(parcel, m12912a);
    }
}
