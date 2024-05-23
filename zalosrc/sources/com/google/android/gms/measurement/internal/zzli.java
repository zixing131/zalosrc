package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.AbstractC4205o;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* loaded from: classes.dex */
public final class zzli extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzli> CREATOR = new C6088o9();

    /* renamed from: p */
    public final int f34680p;

    /* renamed from: q */
    public final String f34681q;

    /* renamed from: r */
    public final long f34682r;

    /* renamed from: s */
    public final Long f34683s;

    /* renamed from: t */
    public final String f34684t;

    /* renamed from: u */
    public final String f34685u;

    /* renamed from: v */
    public final Double f34686v;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzli(int i11, String str, long j11, Long l11, Float f11, String str2, String str3, Double d11) {
        this.f34680p = i11;
        this.f34681q = str;
        this.f34682r = j11;
        this.f34683s = l11;
        if (i11 == 1) {
            this.f34686v = f11 != null ? Double.valueOf(f11.doubleValue()) : null;
        } else {
            this.f34686v = d11;
        }
        this.f34684t = str2;
        this.f34685u = str3;
    }

    /* renamed from: t */
    public final Object m31514t() {
        Long l11 = this.f34683s;
        if (l11 != null) {
            return l11;
        }
        Double d11 = this.f34686v;
        if (d11 != null) {
            return d11;
        }
        String str = this.f34684t;
        if (str != null) {
            return str;
        }
        return null;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        C6088o9.m31271a(this, parcel, i11);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzli(C6099p9 c6099p9) {
        this(c6099p9.f34340c, c6099p9.f34341d, c6099p9.f34342e, c6099p9.f34339b);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzli(String str, long j11, Object obj, String str2) {
        AbstractC4205o.m19718g(str);
        this.f34680p = 2;
        this.f34681q = str;
        this.f34682r = j11;
        this.f34685u = str2;
        if (obj == null) {
            this.f34683s = null;
            this.f34686v = null;
            this.f34684t = null;
            return;
        }
        if (obj instanceof Long) {
            this.f34683s = (Long) obj;
            this.f34686v = null;
            this.f34684t = null;
        } else if (obj instanceof String) {
            this.f34683s = null;
            this.f34686v = null;
            this.f34684t = (String) obj;
        } else {
            if (obj instanceof Double) {
                this.f34683s = null;
                this.f34686v = (Double) obj;
                this.f34684t = null;
                return;
            }
            throw new IllegalArgumentException("User attribute given of un-supported type");
        }
    }
}
