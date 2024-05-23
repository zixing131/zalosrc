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
public final class bo0 implements InterfaceC4840on {

    /* renamed from: a */
    private final InterfaceC4324ao f17911a;

    /* renamed from: b */
    private final Context f17912b;

    /* renamed from: c */
    private final InterfaceC4840on f17913c;

    /* renamed from: d */
    private final String f17914d;

    /* renamed from: e */
    private final int f17915e;

    /* renamed from: g */
    private InputStream f17917g;

    /* renamed from: h */
    private boolean f17918h;

    /* renamed from: i */
    private Uri f17919i;

    /* renamed from: j */
    private volatile zzbeb f17920j;

    /* renamed from: r */
    private final ko0 f17928r;

    /* renamed from: k */
    private boolean f17921k = false;

    /* renamed from: l */
    private boolean f17922l = false;

    /* renamed from: m */
    private boolean f17923m = false;

    /* renamed from: n */
    private boolean f17924n = false;

    /* renamed from: o */
    private long f17925o = 0;

    /* renamed from: q */
    private final AtomicLong f17927q = new AtomicLong(-1);

    /* renamed from: p */
    private tc3 f17926p = null;

    /* renamed from: f */
    private final boolean f17916f = ((Boolean) zzay.zzc().m21823b(AbstractC4554gx.f20963D1)).booleanValue();

    public bo0(Context context, InterfaceC4840on interfaceC4840on, String str, int i11, InterfaceC4324ao interfaceC4324ao, ko0 ko0Var, byte[] bArr) {
        this.f17912b = context;
        this.f17913c = interfaceC4840on;
        this.f17911a = interfaceC4324ao;
        this.f17928r = ko0Var;
        this.f17914d = str;
        this.f17915e = i11;
    }

    /* renamed from: j */
    private final void m20615j(C4878pn c4878pn) {
        InterfaceC4324ao interfaceC4324ao = this.f17911a;
        if (interfaceC4324ao != null) {
            ((oo0) interfaceC4324ao).mo20196e(this, c4878pn);
        }
    }

    /* renamed from: k */
    private final boolean m20616k() {
        if (!this.f17916f) {
            return false;
        }
        if (((Boolean) zzay.zzc().m21823b(AbstractC4554gx.f21420x3)).booleanValue() && !this.f17923m) {
            return true;
        }
        if (!((Boolean) zzay.zzc().m21823b(AbstractC4554gx.f21430y3)).booleanValue() || this.f17924n) {
            return false;
        }
        return true;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4840on
    /* renamed from: a */
    public final int mo20617a(byte[] bArr, int i11, int i12) {
        int mo20617a;
        InterfaceC4324ao interfaceC4324ao;
        if (this.f17918h) {
            InputStream inputStream = this.f17917g;
            if (inputStream != null) {
                mo20617a = inputStream.read(bArr, i11, i12);
            } else {
                mo20617a = this.f17913c.mo20617a(bArr, i11, i12);
            }
            if ((!this.f17916f || this.f17917g != null) && (interfaceC4324ao = this.f17911a) != null) {
                ((oo0) interfaceC4324ao).m25232j0(this, mo20617a);
            }
            return mo20617a;
        }
        throw new IOException("Attempt to read closed CacheDataSource.");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:49:0x01eb  */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v13 */
    /* JADX WARN: Type inference failed for: r4v14 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v8, types: [java.lang.StringBuilder] */
    @Override // com.google.android.gms.internal.ads.InterfaceC4840on
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long mo20618b(C4878pn c4878pn) {
        zzbdy zzbdyVar;
        Long l11;
        boolean z11;
        boolean z12;
        long mo105914b;
        C4733ls c4733ls;
        String str = "ms";
        if (!this.f17918h) {
            boolean z13 = true;
            this.f17918h = true;
            this.f17919i = c4878pn.f26256a;
            if (!this.f17916f) {
                m20615j(c4878pn);
            }
            this.f17920j = zzbeb.m28705t(c4878pn.f26256a);
            ?? r42 = -1;
            if (((Boolean) zzay.zzc().m21823b(AbstractC4554gx.f21390u3)).booleanValue()) {
                if (this.f17920j != null) {
                    this.f17920j.f31889w = c4878pn.f26258c;
                    this.f17920j.f31890x = z53.m28437c(this.f17914d);
                    this.f17920j.f31891y = this.f17915e;
                    if (this.f17920j.f31888v) {
                        l11 = (Long) zzay.zzc().m21823b(AbstractC4554gx.f21410w3);
                    } else {
                        l11 = (Long) zzay.zzc().m21823b(AbstractC4554gx.f21400v3);
                    }
                    long longValue = l11.longValue();
                    long mo105914b2 = zzt.zzB().mo105914b();
                    zzt.zzd();
                    Future m24022a = C4696ks.m24022a(this.f17912b, this.f17920j);
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
                            this.f17921k = c4733ls.m24366d();
                            this.f17923m = c4733ls.m24368f();
                            this.f17924n = c4733ls.m24367e();
                            this.f17925o = c4733ls.m24364a();
                        } catch (InterruptedException unused3) {
                            z12 = true;
                            m24022a.cancel(true);
                            Thread.currentThread().interrupt();
                            mo105914b = zzt.zzB().mo105914b() - mo105914b2;
                            this.f17928r.f23413a.m25231i0(z12, mo105914b);
                            this.f17922l = z12;
                            r42 = new StringBuilder();
                            r42.append("Cache connection took ");
                            r42.append(mo105914b);
                            r42.append("ms");
                            str = r42.toString();
                            zze.zza(str);
                            this.f17922l = false;
                            if (this.f17920j != null) {
                            }
                            return this.f17913c.mo20618b(c4878pn);
                        } catch (ExecutionException | TimeoutException unused4) {
                            z11 = true;
                            m24022a.cancel(true);
                            mo105914b = zzt.zzB().mo105914b() - mo105914b2;
                            this.f17928r.f23413a.m25231i0(z11, mo105914b);
                            this.f17922l = z11;
                            r42 = new StringBuilder();
                            r42.append("Cache connection took ");
                            r42.append(mo105914b);
                            r42.append("ms");
                            str = r42.toString();
                            zze.zza(str);
                            this.f17922l = false;
                            if (this.f17920j != null) {
                            }
                            return this.f17913c.mo20618b(c4878pn);
                        } catch (Throwable th3) {
                            th = th3;
                            long mo105914b3 = zzt.zzB().mo105914b() - mo105914b2;
                            this.f17928r.f23413a.m25231i0(z13, mo105914b3);
                            this.f17922l = z13;
                            zze.zza("Cache connection took " + mo105914b3 + str);
                            throw th;
                        }
                        if (!m20616k()) {
                            this.f17917g = c4733ls.m24365c();
                            if (this.f17916f) {
                                m20615j(c4878pn);
                            }
                            long mo105914b4 = zzt.zzB().mo105914b() - mo105914b2;
                            this.f17928r.f23413a.m25231i0(true, mo105914b4);
                            this.f17922l = true;
                            zze.zza("Cache connection took " + mo105914b4 + "ms");
                            return -1L;
                        }
                        long mo105914b5 = zzt.zzB().mo105914b() - mo105914b2;
                        this.f17928r.f23413a.m25231i0(true, mo105914b5);
                        this.f17922l = true;
                        str = "Cache connection took " + mo105914b5 + "ms";
                        zze.zza(str);
                    } catch (Throwable th4) {
                        th = th4;
                        z13 = r42;
                    }
                }
            } else {
                if (this.f17920j != null) {
                    this.f17920j.f31889w = c4878pn.f26258c;
                    this.f17920j.f31890x = z53.m28437c(this.f17914d);
                    this.f17920j.f31891y = this.f17915e;
                    zzbdyVar = zzt.zzc().m27993b(this.f17920j);
                } else {
                    zzbdyVar = null;
                }
                if (zzbdyVar != null && zzbdyVar.m28701M()) {
                    this.f17921k = zzbdyVar.m28700K();
                    this.f17923m = zzbdyVar.m28703Z();
                    this.f17924n = zzbdyVar.m28702Q();
                    this.f17925o = zzbdyVar.m28704t();
                    this.f17922l = true;
                    if (!m20616k()) {
                        this.f17917g = zzbdyVar.m28699J();
                        if (this.f17916f) {
                            m20615j(c4878pn);
                        }
                        return -1L;
                    }
                }
            }
            this.f17922l = false;
            if (this.f17920j != null) {
                c4878pn = new C4878pn(Uri.parse(this.f17920j.f31882p), null, c4878pn.f26257b, c4878pn.f26258c, c4878pn.f26259d, null, 0);
            }
            return this.f17913c.mo20618b(c4878pn);
        }
        throw new IOException("Attempt to open an already open CacheDataSource.");
    }

    /* renamed from: c */
    public final long m20619c() {
        return this.f17925o;
    }

    /* renamed from: d */
    public final long m20620d() {
        if (this.f17920j == null) {
            return -1L;
        }
        if (this.f17927q.get() != -1) {
            return this.f17927q.get();
        }
        synchronized (this) {
            try {
                if (this.f17926p == null) {
                    this.f17926p = kl0.f23363a.mo21339R(new Callable() { // from class: com.google.android.gms.internal.ads.ao0
                        public /* synthetic */ ao0() {
                        }

                        @Override // java.util.concurrent.Callable
                        public final Object call() {
                            return bo0.this.m20621e();
                        }
                    });
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (!this.f17926p.isDone()) {
            return -1L;
        }
        try {
            this.f17927q.compareAndSet(-1L, ((Long) this.f17926p.get()).longValue());
            return this.f17927q.get();
        } catch (InterruptedException | ExecutionException unused) {
            return -1L;
        }
    }

    /* renamed from: e */
    public final /* synthetic */ Long m20621e() {
        return Long.valueOf(zzt.zzc().m27992a(this.f17920j));
    }

    /* renamed from: f */
    public final boolean m20622f() {
        return this.f17921k;
    }

    /* renamed from: g */
    public final boolean m20623g() {
        return this.f17924n;
    }

    /* renamed from: h */
    public final boolean m20624h() {
        return this.f17923m;
    }

    /* renamed from: i */
    public final boolean m20625i() {
        return this.f17922l;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4840on
    public final Uri zzc() {
        return this.f17919i;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4840on
    public final void zzd() {
        if (this.f17918h) {
            this.f17918h = false;
            this.f17919i = null;
            InputStream inputStream = this.f17917g;
            if (inputStream != null) {
                AbstractC20291l.m105939a(inputStream);
                this.f17917g = null;
                return;
            } else {
                this.f17913c.zzd();
                return;
            }
        }
        throw new IOException("Attempt to close an already closed CacheDataSource.");
    }
}
