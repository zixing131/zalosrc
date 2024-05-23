package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import p031b5.AbstractC2552a;

/* loaded from: classes2.dex */
public final class zzffx extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzffx> CREATOR = new vs2();

    /* renamed from: A */
    private final int[] f32100A;

    /* renamed from: B */
    public final int f32101B;

    /* renamed from: p */
    private final ss2[] f32102p;

    /* renamed from: q */
    public final Context f32103q;

    /* renamed from: r */
    private final int f32104r;

    /* renamed from: s */
    public final ss2 f32105s;

    /* renamed from: t */
    public final int f32106t;

    /* renamed from: u */
    public final int f32107u;

    /* renamed from: v */
    public final int f32108v;

    /* renamed from: w */
    public final String f32109w;

    /* renamed from: x */
    private final int f32110x;

    /* renamed from: y */
    private final int f32111y;

    /* renamed from: z */
    private final int[] f32112z;

    public zzffx(int i11, int i12, int i13, int i14, String str, int i15, int i16) {
        ss2[] values = ss2.values();
        this.f32102p = values;
        int[] m26734a = ts2.m26734a();
        this.f32112z = m26734a;
        int[] m27048a = us2.m27048a();
        this.f32100A = m27048a;
        this.f32103q = null;
        this.f32104r = i11;
        this.f32105s = values[i11];
        this.f32106t = i12;
        this.f32107u = i13;
        this.f32108v = i14;
        this.f32109w = str;
        this.f32110x = i15;
        this.f32101B = m26734a[i15];
        this.f32111y = i16;
        int i17 = m27048a[i16];
    }

    /* renamed from: t */
    public static zzffx m28812t(ss2 ss2Var, Context context) {
        if (ss2Var == ss2.Rewarded) {
            return new zzffx(context, ss2Var, ((Integer) zzay.zzc().m21823b(AbstractC4554gx.f21412w5)).intValue(), ((Integer) zzay.zzc().m21823b(AbstractC4554gx.f20957C5)).intValue(), ((Integer) zzay.zzc().m21823b(AbstractC4554gx.f20977E5)).intValue(), (String) zzay.zzc().m21823b(AbstractC4554gx.f20997G5), (String) zzay.zzc().m21823b(AbstractC4554gx.f21432y5), (String) zzay.zzc().m21823b(AbstractC4554gx.f20937A5));
        }
        if (ss2Var == ss2.Interstitial) {
            return new zzffx(context, ss2Var, ((Integer) zzay.zzc().m21823b(AbstractC4554gx.f21422x5)).intValue(), ((Integer) zzay.zzc().m21823b(AbstractC4554gx.f20967D5)).intValue(), ((Integer) zzay.zzc().m21823b(AbstractC4554gx.f20987F5)).intValue(), (String) zzay.zzc().m21823b(AbstractC4554gx.f21007H5), (String) zzay.zzc().m21823b(AbstractC4554gx.f21442z5), (String) zzay.zzc().m21823b(AbstractC4554gx.f20947B5));
        }
        if (ss2Var == ss2.AppOpen) {
            return new zzffx(context, ss2Var, ((Integer) zzay.zzc().m21823b(AbstractC4554gx.f21037K5)).intValue(), ((Integer) zzay.zzc().m21823b(AbstractC4554gx.f21057M5)).intValue(), ((Integer) zzay.zzc().m21823b(AbstractC4554gx.f21067N5)).intValue(), (String) zzay.zzc().m21823b(AbstractC4554gx.f21017I5), (String) zzay.zzc().m21823b(AbstractC4554gx.f21027J5), (String) zzay.zzc().m21823b(AbstractC4554gx.f21047L5));
        }
        return null;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        int m12912a = AbstractC2552a.m12912a(parcel);
        AbstractC2552a.m12924m(parcel, 1, this.f32104r);
        AbstractC2552a.m12924m(parcel, 2, this.f32106t);
        AbstractC2552a.m12924m(parcel, 3, this.f32107u);
        AbstractC2552a.m12924m(parcel, 4, this.f32108v);
        AbstractC2552a.m12934w(parcel, 5, this.f32109w, false);
        AbstractC2552a.m12924m(parcel, 6, this.f32110x);
        AbstractC2552a.m12924m(parcel, 7, this.f32111y);
        AbstractC2552a.m12913b(parcel, m12912a);
    }

    private zzffx(Context context, ss2 ss2Var, int i11, int i12, int i13, String str, String str2, String str3) {
        int i14;
        this.f32102p = ss2.values();
        this.f32112z = ts2.m26734a();
        this.f32100A = us2.m27048a();
        this.f32103q = context;
        this.f32104r = ss2Var.ordinal();
        this.f32105s = ss2Var;
        this.f32106t = i11;
        this.f32107u = i12;
        this.f32108v = i13;
        this.f32109w = str;
        if ("oldest".equals(str2)) {
            i14 = 1;
        } else {
            i14 = (!"lru".equals(str2) && "lfu".equals(str2)) ? 3 : 2;
        }
        this.f32101B = i14;
        this.f32110x = i14 - 1;
        "onAdClosed".equals(str3);
        this.f32111y = 0;
    }
}
