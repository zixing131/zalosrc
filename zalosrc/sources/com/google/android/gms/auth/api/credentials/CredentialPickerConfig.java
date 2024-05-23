package com.google.android.gms.auth.api.credentials;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import p031b5.AbstractC2552a;

/* loaded from: classes2.dex */
public final class CredentialPickerConfig extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<CredentialPickerConfig> CREATOR = new C4028c();

    /* renamed from: p */
    private final int f15959p;

    /* renamed from: q */
    private final boolean f15960q;

    /* renamed from: r */
    private final boolean f15961r;

    /* renamed from: s */
    private final boolean f15962s;

    /* renamed from: t */
    private final int f15963t;

    /* renamed from: com.google.android.gms.auth.api.credentials.CredentialPickerConfig$a */
    /* loaded from: classes2.dex */
    public static class C4025a {

        /* renamed from: a */
        private boolean f15964a = false;

        /* renamed from: b */
        private boolean f15965b = true;

        /* renamed from: c */
        private int f15966c = 1;

        /* renamed from: a */
        public CredentialPickerConfig m19051a() {
            return new CredentialPickerConfig(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public CredentialPickerConfig(int i11, boolean z11, boolean z12, boolean z13, int i12) {
        this.f15959p = i11;
        this.f15960q = z11;
        this.f15961r = z12;
        if (i11 < 2) {
            this.f15962s = z13;
            this.f15963t = z13 ? 3 : 1;
        } else {
            this.f15962s = i12 == 3;
            this.f15963t = i12;
        }
    }

    /* renamed from: F */
    public final boolean m19045F() {
        return this.f15960q;
    }

    /* renamed from: J */
    public final boolean m19046J() {
        return this.f15961r;
    }

    /* renamed from: t */
    public final boolean m19047t() {
        return this.f15963t == 3;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        int m12912a = AbstractC2552a.m12912a(parcel);
        AbstractC2552a.m12914c(parcel, 1, m19045F());
        AbstractC2552a.m12914c(parcel, 2, m19046J());
        AbstractC2552a.m12914c(parcel, 3, m19047t());
        AbstractC2552a.m12924m(parcel, 4, this.f15963t);
        AbstractC2552a.m12924m(parcel, 1000, this.f15959p);
        AbstractC2552a.m12913b(parcel, m12912a);
    }

    private CredentialPickerConfig(C4025a c4025a) {
        this(2, c4025a.f15964a, c4025a.f15965b, false, c4025a.f15966c);
    }
}
