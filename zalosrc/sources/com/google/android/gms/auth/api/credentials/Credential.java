package com.google.android.gms.auth.api.credentials;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.internal.AbstractC4199m;
import com.google.android.gms.common.internal.AbstractC4205o;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Collections;
import java.util.List;
import p031b5.AbstractC2552a;

/* loaded from: classes2.dex */
public class Credential extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<Credential> CREATOR = new C4026a();

    /* renamed from: p */
    private final String f15951p;

    /* renamed from: q */
    private final String f15952q;

    /* renamed from: r */
    private final Uri f15953r;

    /* renamed from: s */
    private final List f15954s;

    /* renamed from: t */
    private final String f15955t;

    /* renamed from: u */
    private final String f15956u;

    /* renamed from: v */
    private final String f15957v;

    /* renamed from: w */
    private final String f15958w;

    public Credential(String str, String str2, Uri uri, List list, String str3, String str4, String str5, String str6) {
        List unmodifiableList;
        String trim = ((String) AbstractC4205o.m19723l(str, "credential identifier cannot be null")).trim();
        AbstractC4205o.m19719h(trim, "credential identifier cannot be empty");
        if (str3 != null && TextUtils.isEmpty(str3)) {
            throw new IllegalArgumentException("Password must not be empty if set");
        }
        if (str4 != null) {
            boolean z11 = false;
            if (!TextUtils.isEmpty(str4)) {
                Uri parse = Uri.parse(str4);
                if (parse.isAbsolute() && parse.isHierarchical() && !TextUtils.isEmpty(parse.getScheme()) && !TextUtils.isEmpty(parse.getAuthority()) && ("http".equalsIgnoreCase(parse.getScheme()) || "https".equalsIgnoreCase(parse.getScheme()))) {
                    z11 = true;
                }
            }
            if (!Boolean.valueOf(z11).booleanValue()) {
                throw new IllegalArgumentException("Account type must be a valid Http/Https URI");
            }
        }
        if (!TextUtils.isEmpty(str4) && !TextUtils.isEmpty(str3)) {
            throw new IllegalArgumentException("Password and AccountType are mutually exclusive");
        }
        if (str2 != null && TextUtils.isEmpty(str2.trim())) {
            str2 = null;
        }
        this.f15952q = str2;
        this.f15953r = uri;
        if (list == null) {
            unmodifiableList = Collections.emptyList();
        } else {
            unmodifiableList = Collections.unmodifiableList(list);
        }
        this.f15954s = unmodifiableList;
        this.f15951p = trim;
        this.f15955t = str3;
        this.f15956u = str4;
        this.f15957v = str5;
        this.f15958w = str6;
    }

    /* renamed from: F */
    public String m19037F() {
        return this.f15958w;
    }

    /* renamed from: J */
    public String m19038J() {
        return this.f15957v;
    }

    /* renamed from: K */
    public String m19039K() {
        return this.f15951p;
    }

    /* renamed from: M */
    public List m19040M() {
        return this.f15954s;
    }

    /* renamed from: Q */
    public String m19041Q() {
        return this.f15952q;
    }

    /* renamed from: Z */
    public String m19042Z() {
        return this.f15955t;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Credential)) {
            return false;
        }
        Credential credential = (Credential) obj;
        if (TextUtils.equals(this.f15951p, credential.f15951p) && TextUtils.equals(this.f15952q, credential.f15952q) && AbstractC4199m.m19701a(this.f15953r, credential.f15953r) && TextUtils.equals(this.f15955t, credential.f15955t) && TextUtils.equals(this.f15956u, credential.f15956u)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return AbstractC4199m.m19702b(this.f15951p, this.f15952q, this.f15953r, this.f15955t, this.f15956u);
    }

    /* renamed from: i0 */
    public Uri m19043i0() {
        return this.f15953r;
    }

    /* renamed from: t */
    public String m19044t() {
        return this.f15956u;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i11) {
        int m12912a = AbstractC2552a.m12912a(parcel);
        AbstractC2552a.m12934w(parcel, 1, m19039K(), false);
        AbstractC2552a.m12934w(parcel, 2, m19041Q(), false);
        AbstractC2552a.m12932u(parcel, 3, m19043i0(), i11, false);
        AbstractC2552a.m12907A(parcel, 4, m19040M(), false);
        AbstractC2552a.m12934w(parcel, 5, m19042Z(), false);
        AbstractC2552a.m12934w(parcel, 6, m19044t(), false);
        AbstractC2552a.m12934w(parcel, 9, m19038J(), false);
        AbstractC2552a.m12934w(parcel, 10, m19037F(), false);
        AbstractC2552a.m12913b(parcel, m12912a);
    }
}
