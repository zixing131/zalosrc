package com.google.android.gms.auth.api.identity;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.AbstractC4199m;
import com.google.android.gms.common.internal.AbstractC4205o;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p031b5.AbstractC2552a;

/* loaded from: classes2.dex */
public final class BeginSignInRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<BeginSignInRequest> CREATOR = new C4031a();

    /* renamed from: p */
    private final PasswordRequestOptions f15986p;

    /* renamed from: q */
    private final GoogleIdTokenRequestOptions f15987q;

    /* renamed from: r */
    private final String f15988r;

    /* renamed from: s */
    private final boolean f15989s;

    /* loaded from: classes2.dex */
    public static final class GoogleIdTokenRequestOptions extends AbstractSafeParcelable {
        public static final Parcelable.Creator<GoogleIdTokenRequestOptions> CREATOR = new C4033c();

        /* renamed from: p */
        private final boolean f15990p;

        /* renamed from: q */
        private final String f15991q;

        /* renamed from: r */
        private final String f15992r;

        /* renamed from: s */
        private final boolean f15993s;

        /* renamed from: t */
        private final String f15994t;

        /* renamed from: u */
        private final List f15995u;

        /* JADX INFO: Access modifiers changed from: package-private */
        public GoogleIdTokenRequestOptions(boolean z11, String str, String str2, boolean z12, String str3, List list) {
            this.f15990p = z11;
            if (z11) {
                AbstractC4205o.m19723l(str, "serverClientId must be provided if Google ID tokens are requested");
            }
            this.f15991q = str;
            this.f15992r = str2;
            this.f15993s = z12;
            this.f15995u = BeginSignInRequest.m19067K(list);
            this.f15994t = str3;
        }

        /* renamed from: F */
        public final String m19072F() {
            return this.f15992r;
        }

        /* renamed from: J */
        public final String m19073J() {
            return this.f15991q;
        }

        /* renamed from: K */
        public final boolean m19074K() {
            return this.f15990p;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof GoogleIdTokenRequestOptions)) {
                return false;
            }
            GoogleIdTokenRequestOptions googleIdTokenRequestOptions = (GoogleIdTokenRequestOptions) obj;
            if (this.f15990p != googleIdTokenRequestOptions.f15990p || !AbstractC4199m.m19701a(this.f15991q, googleIdTokenRequestOptions.f15991q) || !AbstractC4199m.m19701a(this.f15992r, googleIdTokenRequestOptions.f15992r) || this.f15993s != googleIdTokenRequestOptions.f15993s || !AbstractC4199m.m19701a(this.f15994t, googleIdTokenRequestOptions.f15994t) || !AbstractC4199m.m19701a(this.f15995u, googleIdTokenRequestOptions.f15995u)) {
                return false;
            }
            return true;
        }

        public final int hashCode() {
            return AbstractC4199m.m19702b(Boolean.valueOf(this.f15990p), this.f15991q, this.f15992r, Boolean.valueOf(this.f15993s), this.f15994t, this.f15995u);
        }

        /* renamed from: t */
        public final boolean m19075t() {
            return this.f15993s;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i11) {
            int m12912a = AbstractC2552a.m12912a(parcel);
            AbstractC2552a.m12914c(parcel, 1, m19074K());
            AbstractC2552a.m12934w(parcel, 2, m19073J(), false);
            AbstractC2552a.m12934w(parcel, 3, m19072F(), false);
            AbstractC2552a.m12914c(parcel, 4, m19075t());
            AbstractC2552a.m12934w(parcel, 5, this.f15994t, false);
            AbstractC2552a.m12936y(parcel, 6, this.f15995u, false);
            AbstractC2552a.m12913b(parcel, m12912a);
        }
    }

    /* loaded from: classes2.dex */
    public static final class PasswordRequestOptions extends AbstractSafeParcelable {
        public static final Parcelable.Creator<PasswordRequestOptions> CREATOR = new C4034d();

        /* renamed from: p */
        private final boolean f15996p;

        /* JADX INFO: Access modifiers changed from: package-private */
        public PasswordRequestOptions(boolean z11) {
            this.f15996p = z11;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof PasswordRequestOptions) || this.f15996p != ((PasswordRequestOptions) obj).f15996p) {
                return false;
            }
            return true;
        }

        public final int hashCode() {
            return AbstractC4199m.m19702b(Boolean.valueOf(this.f15996p));
        }

        /* renamed from: t */
        public final boolean m19076t() {
            return this.f15996p;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i11) {
            int m12912a = AbstractC2552a.m12912a(parcel);
            AbstractC2552a.m12914c(parcel, 1, m19076t());
            AbstractC2552a.m12913b(parcel, m12912a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public BeginSignInRequest(PasswordRequestOptions passwordRequestOptions, GoogleIdTokenRequestOptions googleIdTokenRequestOptions, String str, boolean z11) {
        this.f15986p = (PasswordRequestOptions) AbstractC4205o.m19722k(passwordRequestOptions);
        this.f15987q = (GoogleIdTokenRequestOptions) AbstractC4205o.m19722k(googleIdTokenRequestOptions);
        this.f15988r = str;
        this.f15989s = z11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: K */
    public static List m19067K(List list) {
        if (list != null && !list.isEmpty()) {
            ArrayList arrayList = new ArrayList(list);
            Collections.sort(arrayList);
            return arrayList;
        }
        return null;
    }

    /* renamed from: F */
    public final PasswordRequestOptions m19069F() {
        return this.f15986p;
    }

    /* renamed from: J */
    public final boolean m19070J() {
        return this.f15989s;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof BeginSignInRequest)) {
            return false;
        }
        BeginSignInRequest beginSignInRequest = (BeginSignInRequest) obj;
        if (!AbstractC4199m.m19701a(this.f15986p, beginSignInRequest.f15986p) || !AbstractC4199m.m19701a(this.f15987q, beginSignInRequest.f15987q) || !AbstractC4199m.m19701a(this.f15988r, beginSignInRequest.f15988r) || this.f15989s != beginSignInRequest.f15989s) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC4199m.m19702b(this.f15986p, this.f15987q, this.f15988r, Boolean.valueOf(this.f15989s));
    }

    /* renamed from: t */
    public final GoogleIdTokenRequestOptions m19071t() {
        return this.f15987q;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        int m12912a = AbstractC2552a.m12912a(parcel);
        AbstractC2552a.m12932u(parcel, 1, m19069F(), i11, false);
        AbstractC2552a.m12932u(parcel, 2, m19071t(), i11, false);
        AbstractC2552a.m12934w(parcel, 3, this.f15988r, false);
        AbstractC2552a.m12914c(parcel, 4, m19070J());
        AbstractC2552a.m12913b(parcel, m12912a);
    }
}
