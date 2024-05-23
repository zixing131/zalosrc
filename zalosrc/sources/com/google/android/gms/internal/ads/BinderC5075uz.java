package com.google.android.gms.internal.ads;

import android.graphics.Color;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.uz */
/* loaded from: classes2.dex */
public final class BinderC5075uz extends a00 {

    /* renamed from: x */
    private static final int f29085x;

    /* renamed from: y */
    static final int f29086y;

    /* renamed from: z */
    static final int f29087z;

    /* renamed from: p */
    private final String f29088p;

    /* renamed from: q */
    private final List f29089q = new ArrayList();

    /* renamed from: r */
    private final List f29090r = new ArrayList();

    /* renamed from: s */
    private final int f29091s;

    /* renamed from: t */
    private final int f29092t;

    /* renamed from: u */
    private final int f29093u;

    /* renamed from: v */
    private final int f29094v;

    /* renamed from: w */
    private final int f29095w;

    static {
        int rgb = Color.rgb(12, 174, 206);
        f29085x = rgb;
        f29086y = Color.rgb(204, 204, 204);
        f29087z = rgb;
    }

    public BinderC5075uz(String str, List list, Integer num, Integer num2, Integer num3, int i11, int i12, boolean z11) {
        int i13;
        int i14;
        int i15;
        this.f29088p = str;
        for (int i16 = 0; i16 < list.size(); i16++) {
            BinderC5150wz binderC5150wz = (BinderC5150wz) list.get(i16);
            this.f29089q.add(binderC5150wz);
            this.f29090r.add(binderC5150wz);
        }
        if (num != null) {
            i13 = num.intValue();
        } else {
            i13 = f29086y;
        }
        this.f29091s = i13;
        if (num2 != null) {
            i14 = num2.intValue();
        } else {
            i14 = f29087z;
        }
        this.f29092t = i14;
        if (num3 != null) {
            i15 = num3.intValue();
        } else {
            i15 = 12;
        }
        this.f29093u = i15;
        this.f29094v = i11;
        this.f29095w = i12;
    }

    /* renamed from: I3 */
    public final List m27099I3() {
        return this.f29089q;
    }

    /* renamed from: Q */
    public final int m27100Q() {
        return this.f29093u;
    }

    public final int zzb() {
        return this.f29094v;
    }

    public final int zzc() {
        return this.f29095w;
    }

    public final int zzd() {
        return this.f29091s;
    }

    public final int zze() {
        return this.f29092t;
    }

    @Override // com.google.android.gms.internal.ads.b00
    public final String zzg() {
        return this.f29088p;
    }

    @Override // com.google.android.gms.internal.ads.b00
    public final List zzh() {
        return this.f29090r;
    }
}
