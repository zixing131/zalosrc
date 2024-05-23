package com.google.android.gms.auth.api.signin.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.internal.AbstractC4205o;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import p031b5.AbstractC2552a;
import p537u4.C27008a;
import p537u4.C27029v;

/* loaded from: classes2.dex */
public final class SignInConfiguration extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<SignInConfiguration> CREATOR = new C27029v();

    /* renamed from: p */
    private final String f16089p;

    /* renamed from: q */
    private GoogleSignInOptions f16090q;

    public SignInConfiguration(String str, GoogleSignInOptions googleSignInOptions) {
        this.f16089p = AbstractC4205o.m19718g(str);
        this.f16090q = googleSignInOptions;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof SignInConfiguration)) {
            return false;
        }
        SignInConfiguration signInConfiguration = (SignInConfiguration) obj;
        if (this.f16089p.equals(signInConfiguration.f16089p)) {
            GoogleSignInOptions googleSignInOptions = this.f16090q;
            if (googleSignInOptions == null) {
                if (signInConfiguration.f16090q == null) {
                    return true;
                }
            } else if (googleSignInOptions.equals(signInConfiguration.f16090q)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return new C27008a().m139140a(this.f16089p).m139140a(this.f16090q).m139141b();
    }

    /* renamed from: t */
    public final GoogleSignInOptions m19137t() {
        return this.f16090q;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        int m12912a = AbstractC2552a.m12912a(parcel);
        AbstractC2552a.m12934w(parcel, 2, this.f16089p, false);
        AbstractC2552a.m12932u(parcel, 5, this.f16090q, i11, false);
        AbstractC2552a.m12913b(parcel, m12912a);
    }
}
