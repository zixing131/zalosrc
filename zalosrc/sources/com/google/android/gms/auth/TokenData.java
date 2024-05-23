package com.google.android.gms.auth;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.internal.AbstractC4199m;
import com.google.android.gms.common.internal.AbstractC4205o;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.List;
import p031b5.AbstractC2552a;

/* loaded from: classes2.dex */
public class TokenData extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<TokenData> CREATOR = new C4056i();

    /* renamed from: p */
    private final int f15909p;

    /* renamed from: q */
    private final String f15910q;

    /* renamed from: r */
    private final Long f15911r;

    /* renamed from: s */
    private final boolean f15912s;

    /* renamed from: t */
    private final boolean f15913t;

    /* renamed from: u */
    private final List f15914u;

    /* renamed from: v */
    private final String f15915v;

    /* JADX INFO: Access modifiers changed from: package-private */
    public TokenData(int i11, String str, Long l11, boolean z11, boolean z12, List list, String str2) {
        this.f15909p = i11;
        this.f15910q = AbstractC4205o.m19718g(str);
        this.f15911r = l11;
        this.f15912s = z11;
        this.f15913t = z12;
        this.f15914u = list;
        this.f15915v = str2;
    }

    /* renamed from: t */
    public static TokenData m19024t(Bundle bundle, String str) {
        bundle.setClassLoader(TokenData.class.getClassLoader());
        Bundle bundle2 = bundle.getBundle(str);
        if (bundle2 == null) {
            return null;
        }
        bundle2.setClassLoader(TokenData.class.getClassLoader());
        return (TokenData) bundle2.getParcelable("TokenData");
    }

    /* renamed from: F */
    public final String m19025F() {
        return this.f15910q;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof TokenData)) {
            return false;
        }
        TokenData tokenData = (TokenData) obj;
        if (!TextUtils.equals(this.f15910q, tokenData.f15910q) || !AbstractC4199m.m19701a(this.f15911r, tokenData.f15911r) || this.f15912s != tokenData.f15912s || this.f15913t != tokenData.f15913t || !AbstractC4199m.m19701a(this.f15914u, tokenData.f15914u) || !AbstractC4199m.m19701a(this.f15915v, tokenData.f15915v)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AbstractC4199m.m19702b(this.f15910q, this.f15911r, Boolean.valueOf(this.f15912s), Boolean.valueOf(this.f15913t), this.f15914u, this.f15915v);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i11) {
        int m12912a = AbstractC2552a.m12912a(parcel);
        AbstractC2552a.m12924m(parcel, 1, this.f15909p);
        AbstractC2552a.m12934w(parcel, 2, this.f15910q, false);
        AbstractC2552a.m12930s(parcel, 3, this.f15911r, false);
        AbstractC2552a.m12914c(parcel, 4, this.f15912s);
        AbstractC2552a.m12914c(parcel, 5, this.f15913t);
        AbstractC2552a.m12936y(parcel, 6, this.f15914u, false);
        AbstractC2552a.m12934w(parcel, 7, this.f15915v, false);
        AbstractC2552a.m12913b(parcel, m12912a);
    }
}
