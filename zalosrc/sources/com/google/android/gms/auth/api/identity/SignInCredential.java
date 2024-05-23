package com.google.android.gms.auth.api.identity;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.AbstractC4199m;
import com.google.android.gms.common.internal.AbstractC4205o;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import p031b5.AbstractC2552a;
import p437q4.C25110c;

/* loaded from: classes2.dex */
public final class SignInCredential extends AbstractSafeParcelable {
    public static final Parcelable.Creator<SignInCredential> CREATOR = new C25110c();

    /* renamed from: p */
    private final String f16004p;

    /* renamed from: q */
    private final String f16005q;

    /* renamed from: r */
    private final String f16006r;

    /* renamed from: s */
    private final String f16007s;

    /* renamed from: t */
    private final Uri f16008t;

    /* renamed from: u */
    private final String f16009u;

    /* renamed from: v */
    private final String f16010v;

    public SignInCredential(String str, String str2, String str3, String str4, Uri uri, String str5, String str6) {
        this.f16004p = AbstractC4205o.m19718g(str);
        this.f16005q = str2;
        this.f16006r = str3;
        this.f16007s = str4;
        this.f16008t = uri;
        this.f16009u = str5;
        this.f16010v = str6;
    }

    /* renamed from: F */
    public final String m19082F() {
        return this.f16007s;
    }

    /* renamed from: J */
    public final String m19083J() {
        return this.f16006r;
    }

    /* renamed from: K */
    public final String m19084K() {
        return this.f16010v;
    }

    /* renamed from: M */
    public final String m19085M() {
        return this.f16004p;
    }

    /* renamed from: Q */
    public final String m19086Q() {
        return this.f16009u;
    }

    /* renamed from: Z */
    public final Uri m19087Z() {
        return this.f16008t;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof SignInCredential)) {
            return false;
        }
        SignInCredential signInCredential = (SignInCredential) obj;
        if (!AbstractC4199m.m19701a(this.f16004p, signInCredential.f16004p) || !AbstractC4199m.m19701a(this.f16005q, signInCredential.f16005q) || !AbstractC4199m.m19701a(this.f16006r, signInCredential.f16006r) || !AbstractC4199m.m19701a(this.f16007s, signInCredential.f16007s) || !AbstractC4199m.m19701a(this.f16008t, signInCredential.f16008t) || !AbstractC4199m.m19701a(this.f16009u, signInCredential.f16009u) || !AbstractC4199m.m19701a(this.f16010v, signInCredential.f16010v)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC4199m.m19702b(this.f16004p, this.f16005q, this.f16006r, this.f16007s, this.f16008t, this.f16009u, this.f16010v);
    }

    /* renamed from: t */
    public final String m19088t() {
        return this.f16005q;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        int m12912a = AbstractC2552a.m12912a(parcel);
        AbstractC2552a.m12934w(parcel, 1, m19085M(), false);
        AbstractC2552a.m12934w(parcel, 2, m19088t(), false);
        AbstractC2552a.m12934w(parcel, 3, m19083J(), false);
        AbstractC2552a.m12934w(parcel, 4, m19082F(), false);
        AbstractC2552a.m12932u(parcel, 5, m19087Z(), i11, false);
        AbstractC2552a.m12934w(parcel, 6, m19086Q(), false);
        AbstractC2552a.m12934w(parcel, 7, m19084K(), false);
        AbstractC2552a.m12913b(parcel, m12912a);
    }
}
