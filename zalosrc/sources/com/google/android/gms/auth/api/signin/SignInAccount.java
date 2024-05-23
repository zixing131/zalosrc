package com.google.android.gms.auth.api.signin;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.AbstractC4205o;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import p031b5.AbstractC2552a;

/* loaded from: classes2.dex */
public class SignInAccount extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<SignInAccount> CREATOR = new C4045g();

    /* renamed from: p */
    private String f16076p;

    /* renamed from: q */
    private GoogleSignInAccount f16077q;

    /* renamed from: r */
    private String f16078r;

    /* JADX INFO: Access modifiers changed from: package-private */
    public SignInAccount(String str, GoogleSignInAccount googleSignInAccount, String str2) {
        this.f16077q = googleSignInAccount;
        this.f16076p = AbstractC4205o.m19719h(str, "8.3 and 8.4 SDKs require non-null email");
        this.f16078r = AbstractC4205o.m19719h(str2, "8.3 and 8.4 SDKs require non-null userId");
    }

    /* renamed from: t */
    public final GoogleSignInAccount m19130t() {
        return this.f16077q;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i11) {
        int m12912a = AbstractC2552a.m12912a(parcel);
        AbstractC2552a.m12934w(parcel, 4, this.f16076p, false);
        AbstractC2552a.m12932u(parcel, 7, this.f16077q, i11, false);
        AbstractC2552a.m12934w(parcel, 8, this.f16078r, false);
        AbstractC2552a.m12913b(parcel, m12912a);
    }
}
