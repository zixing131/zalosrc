package com.google.android.gms.auth.api.credentials;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.AbstractC4205o;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import p031b5.AbstractC2552a;

/* loaded from: classes2.dex */
public final class HintRequest extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<HintRequest> CREATOR = new C4030e();

    /* renamed from: p */
    private final int f15976p;

    /* renamed from: q */
    private final CredentialPickerConfig f15977q;

    /* renamed from: r */
    private final boolean f15978r;

    /* renamed from: s */
    private final boolean f15979s;

    /* renamed from: t */
    private final String[] f15980t;

    /* renamed from: u */
    private final boolean f15981u;

    /* renamed from: v */
    private final String f15982v;

    /* renamed from: w */
    private final String f15983w;

    /* JADX INFO: Access modifiers changed from: package-private */
    public HintRequest(int i11, CredentialPickerConfig credentialPickerConfig, boolean z11, boolean z12, String[] strArr, boolean z13, String str, String str2) {
        this.f15976p = i11;
        this.f15977q = (CredentialPickerConfig) AbstractC4205o.m19722k(credentialPickerConfig);
        this.f15978r = z11;
        this.f15979s = z12;
        this.f15980t = (String[]) AbstractC4205o.m19722k(strArr);
        if (i11 < 2) {
            this.f15981u = true;
            this.f15982v = null;
            this.f15983w = null;
        } else {
            this.f15981u = z13;
            this.f15982v = str;
            this.f15983w = str2;
        }
    }

    /* renamed from: F */
    public final CredentialPickerConfig m19059F() {
        return this.f15977q;
    }

    /* renamed from: J */
    public final String m19060J() {
        return this.f15983w;
    }

    /* renamed from: K */
    public final String m19061K() {
        return this.f15982v;
    }

    /* renamed from: M */
    public final boolean m19062M() {
        return this.f15978r;
    }

    /* renamed from: Q */
    public final boolean m19063Q() {
        return this.f15981u;
    }

    /* renamed from: t */
    public final String[] m19064t() {
        return this.f15980t;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        int m12912a = AbstractC2552a.m12912a(parcel);
        AbstractC2552a.m12932u(parcel, 1, m19059F(), i11, false);
        AbstractC2552a.m12914c(parcel, 2, m19062M());
        AbstractC2552a.m12914c(parcel, 3, this.f15979s);
        AbstractC2552a.m12935x(parcel, 4, m19064t(), false);
        AbstractC2552a.m12914c(parcel, 5, m19063Q());
        AbstractC2552a.m12934w(parcel, 6, m19061K(), false);
        AbstractC2552a.m12934w(parcel, 7, m19060J(), false);
        AbstractC2552a.m12924m(parcel, 1000, this.f15976p);
        AbstractC2552a.m12913b(parcel, m12912a);
    }
}
