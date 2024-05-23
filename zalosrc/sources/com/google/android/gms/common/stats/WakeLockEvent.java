package com.google.android.gms.common.stats;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.List;
import p031b5.AbstractC2552a;

@Deprecated
/* loaded from: classes2.dex */
public final class WakeLockEvent extends StatsEvent {
    public static final Parcelable.Creator<WakeLockEvent> CREATOR = new C4264a();

    /* renamed from: A */
    private final String f16768A;

    /* renamed from: B */
    private final float f16769B;

    /* renamed from: C */
    private final long f16770C;

    /* renamed from: D */
    private final boolean f16771D;

    /* renamed from: E */
    private long f16772E = -1;

    /* renamed from: p */
    final int f16773p;

    /* renamed from: q */
    private final long f16774q;

    /* renamed from: r */
    private int f16775r;

    /* renamed from: s */
    private final String f16776s;

    /* renamed from: t */
    private final String f16777t;

    /* renamed from: u */
    private final String f16778u;

    /* renamed from: v */
    private final int f16779v;

    /* renamed from: w */
    private final List f16780w;

    /* renamed from: x */
    private final String f16781x;

    /* renamed from: y */
    private final long f16782y;

    /* renamed from: z */
    private int f16783z;

    /* JADX INFO: Access modifiers changed from: package-private */
    public WakeLockEvent(int i11, long j11, int i12, String str, int i13, List list, String str2, long j12, int i14, String str3, String str4, float f11, long j13, String str5, boolean z11) {
        this.f16773p = i11;
        this.f16774q = j11;
        this.f16775r = i12;
        this.f16776s = str;
        this.f16777t = str3;
        this.f16778u = str5;
        this.f16779v = i13;
        this.f16780w = list;
        this.f16781x = str2;
        this.f16782y = j12;
        this.f16783z = i14;
        this.f16768A = str4;
        this.f16769B = f11;
        this.f16770C = j13;
        this.f16771D = z11;
    }

    @Override // com.google.android.gms.common.stats.StatsEvent
    /* renamed from: t */
    public final String mo19882t() {
        String join;
        List list = this.f16780w;
        String str = this.f16776s;
        int i11 = this.f16779v;
        String str2 = "";
        if (list == null) {
            join = "";
        } else {
            join = TextUtils.join(",", list);
        }
        int i12 = this.f16783z;
        String str3 = this.f16777t;
        if (str3 == null) {
            str3 = "";
        }
        String str4 = this.f16768A;
        if (str4 == null) {
            str4 = "";
        }
        float f11 = this.f16769B;
        String str5 = this.f16778u;
        if (str5 != null) {
            str2 = str5;
        }
        return "\t" + str + "\t" + i11 + "\t" + join + "\t" + i12 + "\t" + str3 + "\t" + str4 + "\t" + f11 + "\t" + str2 + "\t" + this.f16771D;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        int m12912a = AbstractC2552a.m12912a(parcel);
        AbstractC2552a.m12924m(parcel, 1, this.f16773p);
        AbstractC2552a.m12929r(parcel, 2, this.f16774q);
        AbstractC2552a.m12934w(parcel, 4, this.f16776s, false);
        AbstractC2552a.m12924m(parcel, 5, this.f16779v);
        AbstractC2552a.m12936y(parcel, 6, this.f16780w, false);
        AbstractC2552a.m12929r(parcel, 8, this.f16782y);
        AbstractC2552a.m12934w(parcel, 10, this.f16777t, false);
        AbstractC2552a.m12924m(parcel, 11, this.f16775r);
        AbstractC2552a.m12934w(parcel, 12, this.f16781x, false);
        AbstractC2552a.m12934w(parcel, 13, this.f16768A, false);
        AbstractC2552a.m12924m(parcel, 14, this.f16783z);
        AbstractC2552a.m12921j(parcel, 15, this.f16769B);
        AbstractC2552a.m12929r(parcel, 16, this.f16770C);
        AbstractC2552a.m12934w(parcel, 17, this.f16778u, false);
        AbstractC2552a.m12914c(parcel, 18, this.f16771D);
        AbstractC2552a.m12913b(parcel, m12912a);
    }

    @Override // com.google.android.gms.common.stats.StatsEvent
    public final int zza() {
        return this.f16775r;
    }

    @Override // com.google.android.gms.common.stats.StatsEvent
    public final long zzb() {
        return this.f16772E;
    }

    @Override // com.google.android.gms.common.stats.StatsEvent
    public final long zzc() {
        return this.f16774q;
    }
}
