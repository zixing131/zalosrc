package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.client.zzay;
import java.util.concurrent.Callable;

/* loaded from: classes2.dex */
public final class ch2 implements sh2 {

    /* renamed from: a */
    private final dj0 f18427a;

    /* renamed from: b */
    private final uc3 f18428b;

    /* renamed from: c */
    private final Context f18429c;

    public ch2(dj0 dj0Var, uc3 uc3Var, Context context) {
        this.f18427a = dj0Var;
        this.f18428b = uc3Var;
        this.f18429c = context;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public final /* synthetic */ dh2 m20892a() {
        String str;
        String str2;
        String str3;
        String str4;
        Long l11;
        if (!this.f18427a.m21425z(this.f18429c)) {
            return new dh2(null, null, null, null, null);
        }
        String m21409j = this.f18427a.m21409j(this.f18429c);
        if (m21409j == null) {
            str = "";
        } else {
            str = m21409j;
        }
        String m21407h = this.f18427a.m21407h(this.f18429c);
        if (m21407h == null) {
            str2 = "";
        } else {
            str2 = m21407h;
        }
        String m21405f = this.f18427a.m21405f(this.f18429c);
        if (m21405f == null) {
            str3 = "";
        } else {
            str3 = m21405f;
        }
        String m21406g = this.f18427a.m21406g(this.f18429c);
        if (m21406g == null) {
            str4 = "";
        } else {
            str4 = m21406g;
        }
        if ("TIME_OUT".equals(str2)) {
            l11 = (Long) zzay.zzc().m21823b(AbstractC4554gx.f21217d0);
        } else {
            l11 = null;
        }
        return new dh2(str, str2, str3, str4, l11);
    }

    @Override // com.google.android.gms.internal.ads.sh2
    public final int zza() {
        return 34;
    }

    @Override // com.google.android.gms.internal.ads.sh2
    public final tc3 zzb() {
        return this.f18428b.mo21339R(new Callable() { // from class: com.google.android.gms.internal.ads.bh2
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return ch2.this.m20892a();
            }
        });
    }
}
