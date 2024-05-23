package com.google.android.gms.auth.api.identity;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.AbstractC4199m;
import com.google.android.gms.common.internal.AbstractC4205o;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import p031b5.AbstractC2552a;
import p437q4.C25111d;

/* loaded from: classes2.dex */
public class SignInPassword extends AbstractSafeParcelable {
    public static final Parcelable.Creator<SignInPassword> CREATOR = new C25111d();

    /* renamed from: p */
    private final String f16011p;

    /* renamed from: q */
    private final String f16012q;

    public SignInPassword(String str, String str2) {
        this.f16011p = AbstractC4205o.m19719h(((String) AbstractC4205o.m19723l(str, "Account identifier cannot be null")).trim(), "Account identifier cannot be empty");
        this.f16012q = AbstractC4205o.m19718g(str2);
    }

    /* renamed from: F */
    public String m19089F() {
        return this.f16012q;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof SignInPassword)) {
            return false;
        }
        SignInPassword signInPassword = (SignInPassword) obj;
        if (!AbstractC4199m.m19701a(this.f16011p, signInPassword.f16011p) || !AbstractC4199m.m19701a(this.f16012q, signInPassword.f16012q)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AbstractC4199m.m19702b(this.f16011p, this.f16012q);
    }

    /* renamed from: t */
    public String m19090t() {
        return this.f16011p;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i11) {
        int m12912a = AbstractC2552a.m12912a(parcel);
        AbstractC2552a.m12934w(parcel, 1, m19090t(), false);
        AbstractC2552a.m12934w(parcel, 2, m19089F(), false);
        AbstractC2552a.m12913b(parcel, m12912a);
    }
}
