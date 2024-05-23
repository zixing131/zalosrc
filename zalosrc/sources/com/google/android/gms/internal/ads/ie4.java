package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.io.EOFException;
import java.util.Map;

/* loaded from: classes2.dex */
public final class ie4 implements xf4 {

    /* renamed from: a */
    private final qm4 f22160a;

    /* renamed from: b */
    private jm4 f22161b;

    /* renamed from: c */
    private km4 f22162c;

    public ie4(qm4 qm4Var) {
        this.f22160a = qm4Var;
    }

    @Override // com.google.android.gms.internal.ads.xf4
    /* renamed from: a */
    public final int mo23239a(C4667k c4667k) {
        jm4 jm4Var = this.f22161b;
        jm4Var.getClass();
        km4 km4Var = this.f22162c;
        km4Var.getClass();
        return jm4Var.mo19972f(km4Var, c4667k);
    }

    @Override // com.google.android.gms.internal.ads.xf4
    /* renamed from: b */
    public final void mo23240b(long j11, long j12) {
        jm4 jm4Var = this.f22161b;
        jm4Var.getClass();
        jm4Var.mo19971e(j11, j12);
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0042, code lost:            if (r6.zzf() != r11) goto L71;     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0046, code lost:            r1 = false;     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x006c, code lost:            if (r6.zzf() != r11) goto L71;     */
    @Override // com.google.android.gms.internal.ads.xf4
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void mo23241c(td4 td4Var, Uri uri, Map map, long j11, long j12, mm4 mm4Var) {
        yl4 yl4Var = new yl4(td4Var, j11, j12);
        this.f22162c = yl4Var;
        if (this.f22161b != null) {
            return;
        }
        jm4[] mo20401a = this.f22160a.mo20401a(uri, map);
        int length = mo20401a.length;
        boolean z11 = false;
        if (length == 1) {
            this.f22161b = mo20401a[0];
        } else {
            int i11 = 0;
            while (true) {
                if (i11 >= length) {
                    break;
                }
                jm4 jm4Var = mo20401a[i11];
                try {
                } catch (EOFException unused) {
                    if (this.f22161b == null) {
                    }
                } catch (Throwable th2) {
                    if (this.f22161b != null || yl4Var.zzf() == j11) {
                        z11 = true;
                    }
                    v71.m27175f(z11);
                    yl4Var.zzj();
                    throw th2;
                }
                if (jm4Var.mo19968a(yl4Var)) {
                    this.f22161b = jm4Var;
                    v71.m27175f(true);
                    yl4Var.zzj();
                    break;
                } else {
                    if (this.f22161b == null) {
                    }
                    boolean z12 = true;
                    v71.m27175f(z12);
                    yl4Var.zzj();
                    i11++;
                }
            }
            if (this.f22161b == null) {
                throw new zzui("None of the available extractors (" + g92.m22353k(mo20401a) + ") could read the stream.", uri);
            }
        }
        this.f22161b.mo19970c(mm4Var);
    }

    @Override // com.google.android.gms.internal.ads.xf4
    public final long zzb() {
        km4 km4Var = this.f22162c;
        if (km4Var != null) {
            return km4Var.zzf();
        }
        return -1L;
    }

    @Override // com.google.android.gms.internal.ads.xf4
    public final void zzc() {
        jm4 jm4Var = this.f22161b;
        if (jm4Var instanceof C4303a3) {
            ((C4303a3) jm4Var).m19969b();
        }
    }

    @Override // com.google.android.gms.internal.ads.xf4
    public final void zze() {
        if (this.f22161b != null) {
            this.f22161b = null;
        }
        this.f22162c = null;
    }
}
