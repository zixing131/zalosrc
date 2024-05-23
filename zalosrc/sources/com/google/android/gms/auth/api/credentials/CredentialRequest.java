package com.google.android.gms.auth.api.credentials;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.credentials.CredentialPickerConfig;
import com.google.android.gms.common.internal.AbstractC4205o;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import p031b5.AbstractC2552a;

/* loaded from: classes2.dex */
public final class CredentialRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<CredentialRequest> CREATOR = new C4029d();

    /* renamed from: p */
    private final int f15967p;

    /* renamed from: q */
    private final boolean f15968q;

    /* renamed from: r */
    private final String[] f15969r;

    /* renamed from: s */
    private final CredentialPickerConfig f15970s;

    /* renamed from: t */
    private final CredentialPickerConfig f15971t;

    /* renamed from: u */
    private final boolean f15972u;

    /* renamed from: v */
    private final String f15973v;

    /* renamed from: w */
    private final String f15974w;

    /* renamed from: x */
    private final boolean f15975x;

    /* JADX INFO: Access modifiers changed from: package-private */
    public CredentialRequest(int i11, boolean z11, String[] strArr, CredentialPickerConfig credentialPickerConfig, CredentialPickerConfig credentialPickerConfig2, boolean z12, String str, String str2, boolean z13) {
        this.f15967p = i11;
        this.f15968q = z11;
        this.f15969r = (String[]) AbstractC4205o.m19722k(strArr);
        this.f15970s = credentialPickerConfig == null ? new CredentialPickerConfig.C4025a().m19051a() : credentialPickerConfig;
        this.f15971t = credentialPickerConfig2 == null ? new CredentialPickerConfig.C4025a().m19051a() : credentialPickerConfig2;
        if (i11 < 3) {
            this.f15972u = true;
            this.f15973v = null;
            this.f15974w = null;
        } else {
            this.f15972u = z12;
            this.f15973v = str;
            this.f15974w = str2;
        }
        this.f15975x = z13;
    }

    /* renamed from: F */
    public final CredentialPickerConfig m19052F() {
        return this.f15971t;
    }

    /* renamed from: J */
    public final CredentialPickerConfig m19053J() {
        return this.f15970s;
    }

    /* renamed from: K */
    public final String m19054K() {
        return this.f15974w;
    }

    /* renamed from: M */
    public final String m19055M() {
        return this.f15973v;
    }

    /* renamed from: Q */
    public final boolean m19056Q() {
        return this.f15972u;
    }

    /* renamed from: Z */
    public final boolean m19057Z() {
        return this.f15968q;
    }

    /* renamed from: t */
    public final String[] m19058t() {
        return this.f15969r;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        int m12912a = AbstractC2552a.m12912a(parcel);
        AbstractC2552a.m12914c(parcel, 1, m19057Z());
        AbstractC2552a.m12935x(parcel, 2, m19058t(), false);
        AbstractC2552a.m12932u(parcel, 3, m19053J(), i11, false);
        AbstractC2552a.m12932u(parcel, 4, m19052F(), i11, false);
        AbstractC2552a.m12914c(parcel, 5, m19056Q());
        AbstractC2552a.m12934w(parcel, 6, m19055M(), false);
        AbstractC2552a.m12934w(parcel, 7, m19054K(), false);
        AbstractC2552a.m12914c(parcel, 8, this.f15975x);
        AbstractC2552a.m12924m(parcel, 1000, this.f15967p);
        AbstractC2552a.m12913b(parcel, m12912a);
    }
}
