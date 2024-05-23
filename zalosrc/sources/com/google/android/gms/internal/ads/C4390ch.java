package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.TimeoutException;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.ads.ch */
/* loaded from: classes2.dex */
public final class C4390ch implements InterfaceC5242zg {

    /* renamed from: a */
    private final InterfaceC4760mh[] f18405a;

    /* renamed from: b */
    private final AbstractC4654jn f18406b;

    /* renamed from: c */
    private final C4581hn f18407c;

    /* renamed from: d */
    private final Handler f18408d;

    /* renamed from: e */
    private final C4575hh f18409e;

    /* renamed from: f */
    private final CopyOnWriteArraySet f18410f;

    /* renamed from: g */
    private final C4946rh f18411g;

    /* renamed from: h */
    private final C4909qh f18412h;

    /* renamed from: i */
    private boolean f18413i;

    /* renamed from: j */
    private boolean f18414j;

    /* renamed from: k */
    private int f18415k;

    /* renamed from: l */
    private int f18416l;

    /* renamed from: m */
    private int f18417m;

    /* renamed from: n */
    private boolean f18418n;

    /* renamed from: o */
    private AbstractC4983sh f18419o;

    /* renamed from: p */
    private Object f18420p;

    /* renamed from: q */
    private C5137wm f18421q;

    /* renamed from: r */
    private C4581hn f18422r;

    /* renamed from: s */
    private C4722lh f18423s;

    /* renamed from: t */
    private C4464eh f18424t;

    /* renamed from: u */
    private long f18425u;

    public C4390ch(InterfaceC4760mh[] interfaceC4760mhArr, AbstractC4654jn abstractC4654jn, co0 co0Var, byte[] bArr) {
        Looper mainLooper;
        String str = AbstractC4916qo.f26902e;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Init ExoPlayerLib/2.4.2 [");
        sb2.append(str);
        sb2.append("]");
        this.f18405a = interfaceC4760mhArr;
        abstractC4654jn.getClass();
        this.f18406b = abstractC4654jn;
        this.f18414j = false;
        this.f18415k = 1;
        this.f18410f = new CopyOnWriteArraySet();
        C4581hn c4581hn = new C4581hn(new AbstractC5248zm[2], null);
        this.f18407c = c4581hn;
        this.f18419o = AbstractC4983sh.f27675a;
        this.f18411g = new C4946rh();
        this.f18412h = new C4909qh();
        this.f18421q = C5137wm.f30004d;
        this.f18422r = c4581hn;
        this.f18423s = C4722lh.f23914d;
        if (Looper.myLooper() != null) {
            mainLooper = Looper.myLooper();
        } else {
            mainLooper = Looper.getMainLooper();
        }
        HandlerC4354bh handlerC4354bh = new HandlerC4354bh(this, mainLooper);
        this.f18408d = handlerC4354bh;
        C4464eh c4464eh = new C4464eh(0, 0L);
        this.f18424t = c4464eh;
        this.f18409e = new C4575hh(interfaceC4760mhArr, abstractC4654jn, co0Var, this.f18414j, 0, handlerC4354bh, c4464eh, this, null);
    }

    /* renamed from: a */
    public final int m20879a() {
        if (!this.f18419o.m26306h() && this.f18416l <= 0) {
            this.f18419o.mo25467d(this.f18424t.f19625a, this.f18412h, false);
        }
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public final void m20880b(Message message) {
        boolean z11 = true;
        switch (message.what) {
            case 0:
                this.f18417m--;
                return;
            case 1:
                this.f18415k = message.arg1;
                Iterator it = this.f18410f.iterator();
                while (it.hasNext()) {
                    ((InterfaceC5131wg) it.next()).mo25237o(this.f18414j, this.f18415k);
                }
                return;
            case 2:
                if (message.arg1 == 0) {
                    z11 = false;
                }
                this.f18418n = z11;
                Iterator it2 = this.f18410f.iterator();
                while (it2.hasNext()) {
                    ((InterfaceC5131wg) it2.next()).zza(this.f18418n);
                }
                return;
            case 3:
                if (this.f18417m == 0) {
                    C4691kn c4691kn = (C4691kn) message.obj;
                    this.f18413i = true;
                    this.f18421q = c4691kn.f23388a;
                    this.f18422r = c4691kn.f23389b;
                    this.f18406b.mo22087b(c4691kn.f23390c);
                    Iterator it3 = this.f18410f.iterator();
                    while (it3.hasNext()) {
                        ((InterfaceC5131wg) it3.next()).mo25238p(this.f18421q, this.f18422r);
                    }
                    return;
                }
                return;
            case 4:
                int i11 = this.f18416l - 1;
                this.f18416l = i11;
                if (i11 == 0) {
                    this.f18424t = (C4464eh) message.obj;
                    if (message.arg1 != 0) {
                        Iterator it4 = this.f18410f.iterator();
                        while (it4.hasNext()) {
                            ((InterfaceC5131wg) it4.next()).zze();
                        }
                        return;
                    }
                    return;
                }
                return;
            case 5:
                if (this.f18416l == 0) {
                    this.f18424t = (C4464eh) message.obj;
                    Iterator it5 = this.f18410f.iterator();
                    while (it5.hasNext()) {
                        ((InterfaceC5131wg) it5.next()).zze();
                    }
                    return;
                }
                return;
            case 6:
                C4538gh c4538gh = (C4538gh) message.obj;
                this.f18416l -= c4538gh.f20587d;
                if (this.f18417m == 0) {
                    this.f18419o = c4538gh.f20584a;
                    this.f18420p = c4538gh.f20585b;
                    this.f18424t = c4538gh.f20586c;
                    Iterator it6 = this.f18410f.iterator();
                    while (it6.hasNext()) {
                        ((InterfaceC5131wg) it6.next()).mo25239r(this.f18419o, this.f18420p);
                    }
                    return;
                }
                return;
            case 7:
                C4722lh c4722lh = (C4722lh) message.obj;
                if (!this.f18423s.equals(c4722lh)) {
                    this.f18423s = c4722lh;
                    Iterator it7 = this.f18410f.iterator();
                    while (it7.hasNext()) {
                        ((InterfaceC5131wg) it7.next()).mo25228g(c4722lh);
                    }
                    return;
                }
                return;
            case 8:
                zzasi zzasiVar = (zzasi) message.obj;
                Iterator it8 = this.f18410f.iterator();
                while (it8.hasNext()) {
                    ((InterfaceC5131wg) it8.next()).mo25235n(zzasiVar);
                }
                return;
            default:
                throw new IllegalStateException();
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5242zg
    /* renamed from: f */
    public final void mo20881f(int i11) {
        this.f18409e.m22894x(i11);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5242zg
    /* renamed from: g */
    public final void mo20882g(long j11) {
        m20879a();
        if (!this.f18419o.m26306h() && this.f18419o.mo25466c() <= 0) {
            throw new zzasy(this.f18419o, 0, j11);
        }
        this.f18416l++;
        if (!this.f18419o.m26306h()) {
            this.f18419o.m26305g(0, this.f18411g, false);
            AbstractC5093vg.m27218a(j11);
            long j12 = this.f18419o.mo25467d(0, this.f18412h, false).f26778c;
        }
        this.f18425u = j11;
        this.f18409e.m22882B(this.f18419o, 0, AbstractC5093vg.m27218a(j11));
        Iterator it = this.f18410f.iterator();
        while (it.hasNext()) {
            ((InterfaceC5131wg) it.next()).zze();
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5242zg
    /* renamed from: h */
    public final void mo20883h(boolean z11) {
        if (this.f18414j != z11) {
            this.f18414j = z11;
            this.f18409e.m22886F(z11);
            Iterator it = this.f18410f.iterator();
            while (it.hasNext()) {
                ((InterfaceC5131wg) it.next()).mo25237o(z11, this.f18415k);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5242zg
    /* renamed from: i */
    public final void mo20884i(InterfaceC5131wg interfaceC5131wg) {
        this.f18410f.add(interfaceC5131wg);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5242zg
    /* renamed from: j */
    public final void mo20885j(C5205yg... c5205ygArr) {
        this.f18409e.m22883C(c5205ygArr);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5242zg
    /* renamed from: k */
    public final void mo20886k(InterfaceC4617im interfaceC4617im) {
        if (!this.f18419o.m26306h() || this.f18420p != null) {
            this.f18419o = AbstractC4983sh.f27675a;
            this.f18420p = null;
            Iterator it = this.f18410f.iterator();
            while (it.hasNext()) {
                ((InterfaceC5131wg) it.next()).mo25239r(this.f18419o, this.f18420p);
            }
        }
        if (this.f18413i) {
            this.f18413i = false;
            this.f18421q = C5137wm.f30004d;
            this.f18422r = this.f18407c;
            this.f18406b.mo22087b(null);
            Iterator it2 = this.f18410f.iterator();
            while (it2.hasNext()) {
                ((InterfaceC5131wg) it2.next()).mo25238p(this.f18421q, this.f18422r);
            }
        }
        this.f18417m++;
        this.f18409e.m22896z(interfaceC4617im, true);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5242zg
    /* renamed from: l */
    public final void mo20887l(InterfaceC5131wg interfaceC5131wg) {
        this.f18410f.remove(interfaceC5131wg);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5242zg
    /* renamed from: m */
    public final void mo20888m(int i11) {
        this.f18409e.m22884D(i11);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5242zg
    /* renamed from: n */
    public final void mo20889n(C5205yg... c5205ygArr) {
        if (this.f18409e.m22889I()) {
            if (!this.f18409e.m22888H(c5205ygArr)) {
                Iterator it = this.f18410f.iterator();
                while (it.hasNext()) {
                    ((InterfaceC5131wg) it.next()).mo25235n(zzasi.m28678c(new RuntimeException(new TimeoutException("ExoPlayer3 blockingSendMessages timeout"))));
                }
                return;
            }
            return;
        }
        this.f18409e.m22892v(c5205ygArr);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5242zg
    /* renamed from: o */
    public final void mo20890o(int i11) {
        this.f18409e.m22885E(i11);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5242zg
    public final int zza() {
        return this.f18415k;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5242zg
    public final long zzb() {
        if (!this.f18419o.m26306h() && this.f18416l <= 0) {
            this.f18419o.mo25467d(this.f18424t.f19625a, this.f18412h, false);
            return AbstractC5093vg.m27219b(0L) + AbstractC5093vg.m27219b(this.f18424t.f19628d);
        }
        return this.f18425u;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5242zg
    public final long zzc() {
        if (!this.f18419o.m26306h() && this.f18416l <= 0) {
            this.f18419o.mo25467d(this.f18424t.f19625a, this.f18412h, false);
            return AbstractC5093vg.m27219b(0L) + AbstractC5093vg.m27219b(this.f18424t.f19627c);
        }
        return this.f18425u;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5242zg
    public final long zzd() {
        if (this.f18419o.m26306h()) {
            return -9223372036854775807L;
        }
        AbstractC4983sh abstractC4983sh = this.f18419o;
        m20879a();
        return AbstractC5093vg.m27219b(abstractC4983sh.m26305g(0, this.f18411g, false).f27213a);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5242zg
    public final void zzg() {
        this.f18409e.m22893w();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5242zg
    public final void zzi() {
        this.f18409e.m22895y();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5242zg
    public final void zzk() {
        if (this.f18409e.m22889I()) {
            if (!this.f18409e.m22890J()) {
                Iterator it = this.f18410f.iterator();
                while (it.hasNext()) {
                    ((InterfaceC5131wg) it.next()).mo25235n(zzasi.m28678c(new RuntimeException(new TimeoutException("ExoPlayer3 release timeout"))));
                }
            }
            this.f18408d.removeCallbacksAndMessages(null);
            return;
        }
        this.f18409e.m22881A();
        this.f18408d.removeCallbacksAndMessages(null);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5242zg
    public final void zzr() {
        this.f18409e.m22887G();
    }
}
