package com.google.android.gms.internal.ads;

import java.io.EOFException;
import java.nio.ByteBuffer;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.google.android.gms.internal.ads.qm */
/* loaded from: classes2.dex */
public final class C4914qm implements InterfaceC4985sj {

    /* renamed from: e */
    private C4839om f26866e;

    /* renamed from: f */
    private C4839om f26867f;

    /* renamed from: g */
    private zzasw f26868g;

    /* renamed from: h */
    private zzasw f26869h;

    /* renamed from: i */
    private long f26870i;

    /* renamed from: k */
    private InterfaceC4877pm f26872k;

    /* renamed from: l */
    private final C4915qn f26873l;

    /* renamed from: a */
    private final C4802nm f26862a = new C4802nm();

    /* renamed from: b */
    private final C4765mm f26863b = new C4765mm();

    /* renamed from: c */
    private final C4655jo f26864c = new C4655jo(32);

    /* renamed from: d */
    private final AtomicInteger f26865d = new AtomicInteger();

    /* renamed from: j */
    private int f26871j = 65536;

    public C4914qm(C4915qn c4915qn, byte[] bArr) {
        this.f26873l = c4915qn;
        C4839om c4839om = new C4839om(0L, 65536);
        this.f26866e = c4839om;
        this.f26867f = c4839om;
    }

    /* renamed from: o */
    private final int m25789o(int i11) {
        if (this.f26871j == 65536) {
            this.f26871j = 0;
            C4839om c4839om = this.f26867f;
            if (c4839om.f25693c) {
                this.f26867f = c4839om.f25695e;
            }
            C4839om c4839om2 = this.f26867f;
            C4728ln m25811b = this.f26873l.m25811b();
            C4839om c4839om3 = new C4839om(this.f26867f.f25692b, 65536);
            c4839om2.f25694d = m25811b;
            c4839om2.f25695e = c4839om3;
            c4839om2.f25693c = true;
        }
        return Math.min(i11, 65536 - this.f26871j);
    }

    /* renamed from: p */
    private final void m25790p() {
        this.f26862a.m24954g();
        C4839om c4839om = this.f26866e;
        if (c4839om.f25693c) {
            C4839om c4839om2 = this.f26867f;
            boolean z11 = c4839om2.f25693c;
            int i11 = (z11 ? 1 : 0) + (((int) (c4839om2.f25691a - c4839om.f25691a)) / 65536);
            C4728ln[] c4728lnArr = new C4728ln[i11];
            for (int i12 = 0; i12 < i11; i12++) {
                c4728lnArr[i12] = c4839om.f25694d;
                c4839om.f25694d = null;
                c4839om = c4839om.f25695e;
            }
            this.f26873l.m25813d(c4728lnArr);
        }
        C4839om c4839om3 = new C4839om(0L, 65536);
        this.f26866e = c4839om3;
        this.f26867f = c4839om3;
        this.f26870i = 0L;
        this.f26871j = 65536;
        this.f26873l.m25816g();
    }

    /* renamed from: q */
    private final void m25791q(long j11) {
        while (true) {
            C4839om c4839om = this.f26866e;
            if (j11 >= c4839om.f25692b) {
                this.f26873l.m25812c(c4839om.f25694d);
                C4839om c4839om2 = this.f26866e;
                c4839om2.f25694d = null;
                this.f26866e = c4839om2.f25695e;
            } else {
                return;
            }
        }
    }

    /* renamed from: r */
    private final void m25792r() {
        if (!this.f26865d.compareAndSet(1, 0)) {
            m25790p();
        }
    }

    /* renamed from: s */
    private final void m25793s(long j11, byte[] bArr, int i11) {
        m25791q(j11);
        int i12 = 0;
        while (i12 < i11) {
            int i13 = (int) (j11 - this.f26866e.f25691a);
            int min = Math.min(i11 - i12, 65536 - i13);
            C4728ln c4728ln = this.f26866e.f25694d;
            System.arraycopy(c4728ln.f23990a, i13, bArr, i12, min);
            j11 += min;
            i12 += min;
            if (j11 == this.f26866e.f25692b) {
                this.f26873l.m25812c(c4728ln);
                C4839om c4839om = this.f26866e;
                c4839om.f25694d = null;
                this.f26866e = c4839om.f25695e;
            }
        }
    }

    /* renamed from: t */
    private final boolean m25794t() {
        return this.f26865d.compareAndSet(0, 1);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4985sj
    /* renamed from: a */
    public final void mo25795a(long j11, int i11, int i12, int i13, C4948rj c4948rj) {
        if (m25794t()) {
            try {
                this.f26862a.m24955h(j11, i11, this.f26870i - i12, i12, c4948rj);
                return;
            } finally {
                m25792r();
            }
        }
        this.f26862a.m24956i(j11);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4985sj
    /* renamed from: b */
    public final void mo25796b(C4655jo c4655jo, int i11) {
        if (m25794t()) {
            while (i11 > 0) {
                int m25789o = m25789o(i11);
                c4655jo.m23681q(this.f26867f.f25694d.f23990a, this.f26871j, m25789o);
                this.f26871j += m25789o;
                this.f26870i += m25789o;
                i11 -= m25789o;
            }
            m25792r();
            return;
        }
        c4655jo.m23687w(i11);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4985sj
    /* renamed from: c */
    public final int mo25797c(C4577hj c4577hj, int i11, boolean z11) {
        if (!m25794t()) {
            int m22915b = c4577hj.m22915b(i11);
            if (m22915b != -1) {
                return m22915b;
            }
            throw new EOFException();
        }
        try {
            int m22914a = c4577hj.m22914a(this.f26867f.f25694d.f23990a, this.f26871j, m25789o(i11));
            if (m22914a != -1) {
                this.f26871j += m22914a;
                this.f26870i += m22914a;
                return m22914a;
            }
            throw new EOFException();
        } finally {
            m25792r();
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4985sj
    /* renamed from: d */
    public final void mo25798d(zzasw zzaswVar) {
        zzasw zzaswVar2;
        if (zzaswVar == null) {
            zzaswVar2 = null;
        } else {
            zzaswVar2 = zzaswVar;
        }
        boolean m24958k = this.f26862a.m24958k(zzaswVar2);
        this.f26869h = zzaswVar;
        InterfaceC4877pm interfaceC4877pm = this.f26872k;
        if (interfaceC4877pm != null && m24958k) {
            interfaceC4877pm.mo20592g(zzaswVar2);
        }
    }

    /* renamed from: e */
    public final int m25799e() {
        return this.f26862a.m24948a();
    }

    /* renamed from: f */
    public final int m25800f(C4648jh c4648jh, C4392cj c4392cj, boolean z11, boolean z12, long j11) {
        int i11;
        int m24949b = this.f26862a.m24949b(c4648jh, c4392cj, z11, z12, this.f26868g, this.f26863b);
        if (m24949b != -5) {
            if (m24949b != -4) {
                return -3;
            }
            if (!c4392cj.m26971f()) {
                if (c4392cj.f18448d < j11) {
                    c4392cj.m26967a(Integer.MIN_VALUE);
                }
                if (c4392cj.m20908i()) {
                    C4765mm c4765mm = this.f26863b;
                    long j12 = c4765mm.f24650b;
                    this.f26864c.m23683s(1);
                    m25793s(j12, this.f26864c.f22891a, 1);
                    long j13 = j12 + 1;
                    byte b11 = this.f26864c.f22891a[0];
                    int i12 = b11 & 128;
                    int i13 = b11 & Byte.MAX_VALUE;
                    C4319aj c4319aj = c4392cj.f18446b;
                    if (c4319aj.f17085a == null) {
                        c4319aj.f17085a = new byte[16];
                    }
                    m25793s(j13, c4319aj.f17085a, i13);
                    long j14 = j13 + i13;
                    if (i12 != 0) {
                        this.f26864c.m23683s(2);
                        m25793s(j14, this.f26864c.f22891a, 2);
                        j14 += 2;
                        i11 = this.f26864c.m23674j();
                    } else {
                        i11 = 1;
                    }
                    C4319aj c4319aj2 = c4392cj.f18446b;
                    int[] iArr = c4319aj2.f17088d;
                    if (iArr == null || iArr.length < i11) {
                        iArr = new int[i11];
                    }
                    int[] iArr2 = iArr;
                    int[] iArr3 = c4319aj2.f17089e;
                    if (iArr3 == null || iArr3.length < i11) {
                        iArr3 = new int[i11];
                    }
                    int[] iArr4 = iArr3;
                    if (i12 != 0) {
                        int i14 = i11 * 6;
                        this.f26864c.m23683s(i14);
                        m25793s(j14, this.f26864c.f22891a, i14);
                        j14 += i14;
                        this.f26864c.m23686v(0);
                        for (int i15 = 0; i15 < i11; i15++) {
                            iArr2[i15] = this.f26864c.m23674j();
                            iArr4[i15] = this.f26864c.m23673i();
                        }
                    } else {
                        iArr2[0] = 0;
                        iArr4[0] = c4765mm.f24649a - ((int) (j14 - c4765mm.f24650b));
                    }
                    C4948rj c4948rj = c4765mm.f24652d;
                    C4319aj c4319aj3 = c4392cj.f18446b;
                    c4319aj3.m20135b(i11, iArr2, iArr4, c4948rj.f27244b, c4319aj3.f17085a, 1);
                    long j15 = c4765mm.f24650b;
                    int i16 = (int) (j14 - j15);
                    c4765mm.f24650b = j15 + i16;
                    c4765mm.f24649a -= i16;
                }
                c4392cj.m20907h(this.f26863b.f24649a);
                C4765mm c4765mm2 = this.f26863b;
                long j16 = c4765mm2.f24650b;
                ByteBuffer byteBuffer = c4392cj.f18447c;
                int i17 = c4765mm2.f24649a;
                m25791q(j16);
                while (i17 > 0) {
                    int i18 = (int) (j16 - this.f26866e.f25691a);
                    int min = Math.min(i17, 65536 - i18);
                    C4728ln c4728ln = this.f26866e.f25694d;
                    byteBuffer.put(c4728ln.f23990a, i18, min);
                    j16 += min;
                    i17 -= min;
                    if (j16 == this.f26866e.f25692b) {
                        this.f26873l.m25812c(c4728ln);
                        C4839om c4839om = this.f26866e;
                        c4839om.f25694d = null;
                        this.f26866e = c4839om.f25695e;
                    }
                }
                m25791q(this.f26863b.f24651c);
            }
            return -4;
        }
        this.f26868g = c4648jh.f22819a;
        return -5;
    }

    /* renamed from: g */
    public final long m25801g() {
        return this.f26862a.m24950c();
    }

    /* renamed from: h */
    public final zzasw m25802h() {
        return this.f26862a.m24953f();
    }

    /* renamed from: i */
    public final void m25803i() {
        if (this.f26865d.getAndSet(2) == 0) {
            m25790p();
        }
    }

    /* renamed from: j */
    public final void m25804j(boolean z11) {
        int i11;
        AtomicInteger atomicInteger = this.f26865d;
        if (true != z11) {
            i11 = 2;
        } else {
            i11 = 0;
        }
        int andSet = atomicInteger.getAndSet(i11);
        m25790p();
        this.f26862a.m24957j();
        if (andSet == 2) {
            this.f26868g = null;
        }
    }

    /* renamed from: k */
    public final void m25805k(InterfaceC4877pm interfaceC4877pm) {
        this.f26872k = interfaceC4877pm;
    }

    /* renamed from: l */
    public final void m25806l() {
        long m24951d = this.f26862a.m24951d();
        if (m24951d != -1) {
            m25791q(m24951d);
        }
    }

    /* renamed from: m */
    public final boolean m25807m() {
        return this.f26862a.m24959l();
    }

    /* renamed from: n */
    public final boolean m25808n(long j11, boolean z11) {
        long m24952e = this.f26862a.m24952e(j11, z11);
        if (m24952e == -1) {
            return false;
        }
        m25791q(m24952e);
        return true;
    }
}
