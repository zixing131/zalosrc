package com.google.android.gms.common.moduleinstall;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.AbstractC4205o;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import p031b5.AbstractC2552a;
import p122e5.C18208i;

/* loaded from: classes2.dex */
public class ModuleInstallStatusUpdate extends AbstractSafeParcelable {
    public static final Parcelable.Creator<ModuleInstallStatusUpdate> CREATOR = new C18208i();

    /* renamed from: p */
    private final int f16702p;

    /* renamed from: q */
    private final int f16703q;

    /* renamed from: r */
    private final Long f16704r;

    /* renamed from: s */
    private final Long f16705s;

    /* renamed from: t */
    private final int f16706t;

    /* renamed from: u */
    private final C4244a f16707u;

    /* renamed from: com.google.android.gms.common.moduleinstall.ModuleInstallStatusUpdate$a */
    /* loaded from: classes2.dex */
    public static class C4244a {

        /* renamed from: a */
        private final long f16708a;

        /* renamed from: b */
        private final long f16709b;

        C4244a(long j11, long j12) {
            AbstractC4205o.m19725n(j12);
            this.f16708a = j11;
            this.f16709b = j12;
        }
    }

    public ModuleInstallStatusUpdate(int i11, int i12, Long l11, Long l12, int i13) {
        C4244a c4244a;
        this.f16702p = i11;
        this.f16703q = i12;
        this.f16704r = l11;
        this.f16705s = l12;
        this.f16706t = i13;
        if (l11 != null && l12 != null && l12.longValue() != 0) {
            c4244a = new C4244a(l11.longValue(), l12.longValue());
        } else {
            c4244a = null;
        }
        this.f16707u = c4244a;
    }

    /* renamed from: F */
    public int m19832F() {
        return this.f16703q;
    }

    /* renamed from: J */
    public int m19833J() {
        return this.f16702p;
    }

    /* renamed from: t */
    public int m19834t() {
        return this.f16706t;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i11) {
        int m12912a = AbstractC2552a.m12912a(parcel);
        AbstractC2552a.m12924m(parcel, 1, m19833J());
        AbstractC2552a.m12924m(parcel, 2, m19832F());
        AbstractC2552a.m12930s(parcel, 3, this.f16704r, false);
        AbstractC2552a.m12930s(parcel, 4, this.f16705s, false);
        AbstractC2552a.m12924m(parcel, 5, m19834t());
        AbstractC2552a.m12913b(parcel, m12912a);
    }
}
