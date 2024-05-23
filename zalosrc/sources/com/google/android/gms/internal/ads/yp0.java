package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.zzt;
import java.io.IOException;
import java.io.InputStream;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicLong;
import p229i5.AbstractC20291l;

/* loaded from: classes2.dex */
public final class yp0 extends kd2 {

    /* renamed from: e */
    private final Context f31058e;

    /* renamed from: f */
    private final qj2 f31059f;

    /* renamed from: g */
    private final String f31060g;

    /* renamed from: h */
    private final int f31061h;

    /* renamed from: i */
    private final boolean f31062i;

    /* renamed from: j */
    private InputStream f31063j;

    /* renamed from: k */
    private boolean f31064k;

    /* renamed from: l */
    private Uri f31065l;

    /* renamed from: m */
    private volatile zzbeb f31066m;

    /* renamed from: n */
    private boolean f31067n;

    /* renamed from: o */
    private boolean f31068o;

    /* renamed from: p */
    private boolean f31069p;

    /* renamed from: q */
    private boolean f31070q;

    /* renamed from: r */
    private long f31071r;

    /* renamed from: s */
    private tc3 f31072s;

    /* renamed from: t */
    private final AtomicLong f31073t;

    /* renamed from: u */
    private final bq0 f31074u;

    public yp0(Context context, qj2 qj2Var, String str, int i11, dc3 dc3Var, bq0 bq0Var, byte[] bArr) {
        super(false);
        this.f31058e = context;
        this.f31059f = qj2Var;
        this.f31074u = bq0Var;
        this.f31060g = str;
        this.f31061h = i11;
        this.f31067n = false;
        this.f31068o = false;
        this.f31069p = false;
        this.f31070q = false;
        this.f31071r = 0L;
        this.f31073t = new AtomicLong(-1L);
        this.f31072s = null;
        this.f31062i = ((Boolean) zzay.zzc().m21823b(AbstractC4554gx.f20963D1)).booleanValue();
        mo20854g(dc3Var);
    }

    /* renamed from: v */
    private final boolean m28284v() {
        if (!this.f31062i) {
            return false;
        }
        if (((Boolean) zzay.zzc().m21823b(AbstractC4554gx.f21420x3)).booleanValue() && !this.f31069p) {
            return true;
        }
        if (!((Boolean) zzay.zzc().m21823b(AbstractC4554gx.f21430y3)).booleanValue() || this.f31070q) {
            return false;
        }
        return true;
    }

    @Override // com.google.android.gms.internal.ads.td4
    /* renamed from: a */
    public final int mo19942a(byte[] bArr, int i11, int i12) {
        int mo19942a;
        if (this.f31064k) {
            InputStream inputStream = this.f31063j;
            if (inputStream != null) {
                mo19942a = inputStream.read(bArr, i11, i12);
            } else {
                mo19942a = this.f31059f.mo19942a(bArr, i11, i12);
            }
            if (!this.f31062i || this.f31063j != null) {
                m23893b(mo19942a);
            }
            return mo19942a;
        }
        throw new IOException("Attempt to read closed GcacheDataSource.");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:49:0x01eb  */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v13 */
    /* JADX WARN: Type inference failed for: r4v14 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v8, types: [java.lang.StringBuilder] */
    @Override // com.google.android.gms.internal.ads.qj2
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long mo19943d(wo2 wo2Var) {
        zzbdy zzbdyVar;
        Long l11;
        boolean z11;
        boolean z12;
        long mo105914b;
        C4733ls c4733ls;
        String str = "ms";
        if (!this.f31064k) {
            boolean z13 = true;
            this.f31064k = true;
            this.f31065l = wo2Var.f30043a;
            if (!this.f31062i) {
                m23896m(wo2Var);
            }
            this.f31066m = zzbeb.m28705t(wo2Var.f30043a);
            ?? r42 = -1;
            if (((Boolean) zzay.zzc().m21823b(AbstractC4554gx.f21390u3)).booleanValue()) {
                if (this.f31066m != null) {
                    this.f31066m.f31889w = wo2Var.f30048f;
                    this.f31066m.f31890x = z53.m28437c(this.f31060g);
                    this.f31066m.f31891y = this.f31061h;
                    if (this.f31066m.f31888v) {
                        l11 = (Long) zzay.zzc().m21823b(AbstractC4554gx.f21410w3);
                    } else {
                        l11 = (Long) zzay.zzc().m21823b(AbstractC4554gx.f21400v3);
                    }
                    long longValue = l11.longValue();
                    long mo105914b2 = zzt.zzB().mo105914b();
                    zzt.zzd();
                    Future m24022a = C4696ks.m24022a(this.f31058e, this.f31066m);
                    try {
                        try {
                            c4733ls = (C4733ls) m24022a.get(longValue, TimeUnit.MILLISECONDS);
                        } catch (InterruptedException unused) {
                            z12 = false;
                        } catch (ExecutionException | TimeoutException unused2) {
                            z11 = false;
                        } catch (Throwable th2) {
                            th = th2;
                            z13 = false;
                        }
                        try {
                            this.f31067n = c4733ls.m24366d();
                            this.f31069p = c4733ls.m24368f();
                            this.f31070q = c4733ls.m24367e();
                            this.f31071r = c4733ls.m24364a();
                        } catch (InterruptedException unused3) {
                            z12 = true;
                            m24022a.cancel(true);
                            Thread.currentThread().interrupt();
                            mo105914b = zzt.zzB().mo105914b() - mo105914b2;
                            this.f31074u.f17950a.m24695k0(z12, mo105914b);
                            this.f31068o = z12;
                            r42 = new StringBuilder();
                            r42.append("Cache connection took ");
                            r42.append(mo105914b);
                            r42.append("ms");
                            str = r42.toString();
                            zze.zza(str);
                            this.f31068o = false;
                            if (this.f31066m != null) {
                            }
                            return this.f31059f.mo19943d(wo2Var);
                        } catch (ExecutionException | TimeoutException unused4) {
                            z11 = true;
                            m24022a.cancel(true);
                            mo105914b = zzt.zzB().mo105914b() - mo105914b2;
                            this.f31074u.f17950a.m24695k0(z11, mo105914b);
                            this.f31068o = z11;
                            r42 = new StringBuilder();
                            r42.append("Cache connection took ");
                            r42.append(mo105914b);
                            r42.append("ms");
                            str = r42.toString();
                            zze.zza(str);
                            this.f31068o = false;
                            if (this.f31066m != null) {
                            }
                            return this.f31059f.mo19943d(wo2Var);
                        } catch (Throwable th3) {
                            th = th3;
                            long mo105914b3 = zzt.zzB().mo105914b() - mo105914b2;
                            this.f31074u.f17950a.m24695k0(z13, mo105914b3);
                            this.f31068o = z13;
                            zze.zza("Cache connection took " + mo105914b3 + str);
                            throw th;
                        }
                        if (!m28284v()) {
                            this.f31063j = c4733ls.m24365c();
                            if (this.f31062i) {
                                m23896m(wo2Var);
                            }
                            long mo105914b4 = zzt.zzB().mo105914b() - mo105914b2;
                            this.f31074u.f17950a.m24695k0(true, mo105914b4);
                            this.f31068o = true;
                            zze.zza("Cache connection took " + mo105914b4 + "ms");
                            return -1L;
                        }
                        long mo105914b5 = zzt.zzB().mo105914b() - mo105914b2;
                        this.f31074u.f17950a.m24695k0(true, mo105914b5);
                        this.f31068o = true;
                        str = "Cache connection took " + mo105914b5 + "ms";
                        zze.zza(str);
                    } catch (Throwable th4) {
                        th = th4;
                        z13 = r42;
                    }
                }
            } else {
                if (this.f31066m != null) {
                    this.f31066m.f31889w = wo2Var.f30048f;
                    this.f31066m.f31890x = z53.m28437c(this.f31060g);
                    this.f31066m.f31891y = this.f31061h;
                    zzbdyVar = zzt.zzc().m27993b(this.f31066m);
                } else {
                    zzbdyVar = null;
                }
                if (zzbdyVar != null && zzbdyVar.m28701M()) {
                    this.f31067n = zzbdyVar.m28700K();
                    this.f31069p = zzbdyVar.m28703Z();
                    this.f31070q = zzbdyVar.m28702Q();
                    this.f31071r = zzbdyVar.m28704t();
                    this.f31068o = true;
                    if (!m28284v()) {
                        this.f31063j = zzbdyVar.m28699J();
                        if (this.f31062i) {
                            m23896m(wo2Var);
                        }
                        return -1L;
                    }
                }
            }
            this.f31068o = false;
            if (this.f31066m != null) {
                wo2Var = new wo2(Uri.parse(this.f31066m.f31882p), null, wo2Var.f30047e, wo2Var.f30048f, wo2Var.f30049g, null, wo2Var.f30051i);
            }
            return this.f31059f.mo19943d(wo2Var);
        }
        throw new IOException("Attempt to open an already open GcacheDataSource.");
    }

    /* renamed from: o */
    public final long m28285o() {
        return this.f31071r;
    }

    /* renamed from: p */
    public final long m28286p() {
        if (this.f31066m == null) {
            return -1L;
        }
        if (this.f31073t.get() != -1) {
            return this.f31073t.get();
        }
        synchronized (this) {
            try {
                if (this.f31072s == null) {
                    this.f31072s = kl0.f23363a.mo21339R(new Callable() { // from class: com.google.android.gms.internal.ads.xp0
                        public /* synthetic */ xp0() {
                        }

                        @Override // java.util.concurrent.Callable
                        public final Object call() {
                            return yp0.this.m28287q();
                        }
                    });
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (!this.f31072s.isDone()) {
            return -1L;
        }
        try {
            this.f31073t.compareAndSet(-1L, ((Long) this.f31072s.get()).longValue());
            return this.f31073t.get();
        } catch (InterruptedException | ExecutionException unused) {
            return -1L;
        }
    }

    /* renamed from: q */
    public final /* synthetic */ Long m28287q() {
        return Long.valueOf(zzt.zzc().m27992a(this.f31066m));
    }

    /* renamed from: r */
    public final boolean m28288r() {
        return this.f31067n;
    }

    /* renamed from: s */
    public final boolean m28289s() {
        return this.f31070q;
    }

    /* renamed from: t */
    public final boolean m28290t() {
        return this.f31069p;
    }

    /* renamed from: u */
    public final boolean m28291u() {
        return this.f31068o;
    }

    @Override // com.google.android.gms.internal.ads.qj2
    public final Uri zzc() {
        return this.f31065l;
    }

    @Override // com.google.android.gms.internal.ads.qj2
    public final void zzd() {
        if (this.f31064k) {
            boolean z11 = false;
            this.f31064k = false;
            this.f31065l = null;
            if (!this.f31062i || this.f31063j != null) {
                z11 = true;
            }
            InputStream inputStream = this.f31063j;
            if (inputStream != null) {
                AbstractC20291l.m105939a(inputStream);
                this.f31063j = null;
            } else {
                this.f31059f.zzd();
            }
            if (z11) {
                m23894k();
                return;
            }
            return;
        }
        throw new IOException("Attempt to close an already closed GcacheDataSource.");
    }
}
