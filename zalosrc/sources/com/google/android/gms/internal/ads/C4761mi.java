package com.google.android.gms.internal.ads;

import android.media.AudioTrack;
import android.os.ConditionVariable;
import android.os.SystemClock;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.LinkedList;

/* renamed from: com.google.android.gms.internal.ads.mi */
/* loaded from: classes2.dex */
public final class C4761mi {

    /* renamed from: A */
    private Method f24535A;

    /* renamed from: B */
    private int f24536B;

    /* renamed from: C */
    private long f24537C;

    /* renamed from: D */
    private long f24538D;

    /* renamed from: E */
    private int f24539E;

    /* renamed from: F */
    private long f24540F;

    /* renamed from: G */
    private long f24541G;

    /* renamed from: H */
    private int f24542H;

    /* renamed from: I */
    private int f24543I;

    /* renamed from: J */
    private long f24544J;

    /* renamed from: K */
    private long f24545K;

    /* renamed from: L */
    private long f24546L;

    /* renamed from: M */
    private float f24547M;

    /* renamed from: N */
    private InterfaceC5094vh[] f24548N;

    /* renamed from: O */
    private ByteBuffer[] f24549O;

    /* renamed from: P */
    private ByteBuffer f24550P;

    /* renamed from: Q */
    private ByteBuffer f24551Q;

    /* renamed from: R */
    private byte[] f24552R;

    /* renamed from: S */
    private int f24553S;

    /* renamed from: T */
    private int f24554T;

    /* renamed from: U */
    private boolean f24555U;

    /* renamed from: V */
    private boolean f24556V;

    /* renamed from: W */
    private int f24557W;

    /* renamed from: X */
    private boolean f24558X;

    /* renamed from: Y */
    private long f24559Y;

    /* renamed from: a */
    private final C4798ni f24560a;

    /* renamed from: b */
    private final C5021ti f24561b;

    /* renamed from: c */
    private final InterfaceC5094vh[] f24562c;

    /* renamed from: d */
    private final InterfaceC4649ji f24563d;

    /* renamed from: e */
    private final ConditionVariable f24564e = new ConditionVariable(true);

    /* renamed from: f */
    private final long[] f24565f;

    /* renamed from: g */
    private final C4539gi f24566g;

    /* renamed from: h */
    private final LinkedList f24567h;

    /* renamed from: i */
    private AudioTrack f24568i;

    /* renamed from: j */
    private int f24569j;

    /* renamed from: k */
    private int f24570k;

    /* renamed from: l */
    private int f24571l;

    /* renamed from: m */
    private int f24572m;

    /* renamed from: n */
    private boolean f24573n;

    /* renamed from: o */
    private int f24574o;

    /* renamed from: p */
    private long f24575p;

    /* renamed from: q */
    private C4722lh f24576q;

    /* renamed from: r */
    private C4722lh f24577r;

    /* renamed from: s */
    private long f24578s;

    /* renamed from: t */
    private long f24579t;

    /* renamed from: u */
    private int f24580u;

    /* renamed from: v */
    private int f24581v;

    /* renamed from: w */
    private long f24582w;

    /* renamed from: x */
    private long f24583x;

    /* renamed from: y */
    private boolean f24584y;

    /* renamed from: z */
    private long f24585z;

    public C4761mi(AbstractC5057uh abstractC5057uh, InterfaceC5094vh[] interfaceC5094vhArr, InterfaceC4649ji interfaceC4649ji) {
        this.f24563d = interfaceC4649ji;
        if (AbstractC4916qo.f26898a >= 18) {
            try {
                this.f24535A = AudioTrack.class.getMethod("getLatency", null);
            } catch (NoSuchMethodException unused) {
            }
        }
        if (AbstractC4916qo.f26898a >= 19) {
            this.f24566g = new C4576hi();
        } else {
            this.f24566g = new C4539gi(null);
        }
        C4798ni c4798ni = new C4798ni();
        this.f24560a = c4798ni;
        C5021ti c5021ti = new C5021ti();
        this.f24561b = c5021ti;
        this.f24562c = r1;
        System.arraycopy(interfaceC5094vhArr, 0, r1, 2, 0);
        InterfaceC5094vh[] interfaceC5094vhArr2 = {new C4947ri(), c4798ni, c5021ti};
        this.f24565f = new long[10];
        this.f24547M = 1.0f;
        this.f24543I = 0;
        this.f24557W = 0;
        this.f24577r = C4722lh.f23914d;
        this.f24554T = -1;
        this.f24548N = new InterfaceC5094vh[0];
        this.f24549O = new ByteBuffer[0];
        this.f24567h = new LinkedList();
    }

    /* renamed from: p */
    private final long m24579p(long j11) {
        return (j11 * this.f24569j) / 1000000;
    }

    /* renamed from: q */
    private final long m24580q(long j11) {
        return (j11 * 1000000) / this.f24569j;
    }

    /* renamed from: r */
    private final long m24581r() {
        if (this.f24573n) {
            return this.f24541G;
        }
        return this.f24540F / this.f24539E;
    }

    /* renamed from: s */
    private final void m24582s(long j11) {
        ByteBuffer byteBuffer;
        int length = this.f24548N.length;
        int i11 = length;
        while (i11 >= 0) {
            if (i11 > 0) {
                byteBuffer = this.f24549O[i11 - 1];
            } else {
                byteBuffer = this.f24550P;
                if (byteBuffer == null) {
                    byteBuffer = InterfaceC5094vh.f29313a;
                }
            }
            if (i11 == length) {
                m24589z(byteBuffer, j11);
            } else {
                InterfaceC5094vh interfaceC5094vh = this.f24548N[i11];
                interfaceC5094vh.mo24926a(byteBuffer);
                ByteBuffer zzc = interfaceC5094vh.zzc();
                this.f24549O[i11] = zzc;
                if (zzc.hasRemaining()) {
                    i11++;
                }
            }
            if (byteBuffer.hasRemaining()) {
                return;
            } else {
                i11--;
            }
        }
    }

    /* renamed from: t */
    private final void m24583t() {
        ArrayList arrayList = new ArrayList();
        InterfaceC5094vh[] interfaceC5094vhArr = this.f24562c;
        for (int i11 = 0; i11 < 3; i11++) {
            InterfaceC5094vh interfaceC5094vh = interfaceC5094vhArr[i11];
            if (interfaceC5094vh.zzi()) {
                arrayList.add(interfaceC5094vh);
            } else {
                interfaceC5094vh.zzd();
            }
        }
        int size = arrayList.size();
        this.f24548N = (InterfaceC5094vh[]) arrayList.toArray(new InterfaceC5094vh[size]);
        this.f24549O = new ByteBuffer[size];
        for (int i12 = 0; i12 < size; i12++) {
            InterfaceC5094vh interfaceC5094vh2 = this.f24548N[i12];
            interfaceC5094vh2.zzd();
            this.f24549O[i12] = interfaceC5094vh2.zzc();
        }
    }

    /* renamed from: u */
    private final void m24584u() {
        this.f24582w = 0L;
        this.f24581v = 0;
        this.f24580u = 0;
        this.f24583x = 0L;
        this.f24584y = false;
        this.f24585z = 0L;
    }

    /* renamed from: v */
    private final void m24585v() {
        if (!m24587x()) {
            return;
        }
        if (AbstractC4916qo.f26898a >= 21) {
            this.f24568i.setVolume(this.f24547M);
            return;
        }
        AudioTrack audioTrack = this.f24568i;
        float f11 = this.f24547M;
        audioTrack.setStereoVolume(f11, f11);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0038  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x0032 -> B:7:0x0012). Please report as a decompilation issue!!! */
    /* renamed from: w */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final boolean m24586w() {
        boolean z11;
        int i11;
        InterfaceC5094vh[] interfaceC5094vhArr;
        int i12;
        if (this.f24554T == -1) {
            if (this.f24573n) {
                i12 = this.f24548N.length;
            } else {
                i12 = 0;
            }
            this.f24554T = i12;
            z11 = true;
            i11 = this.f24554T;
            interfaceC5094vhArr = this.f24548N;
            if (i11 < interfaceC5094vhArr.length) {
                InterfaceC5094vh interfaceC5094vh = interfaceC5094vhArr[i11];
                if (z11) {
                    interfaceC5094vh.zze();
                }
                m24582s(-9223372036854775807L);
                if (!interfaceC5094vh.zzj()) {
                    return false;
                }
                this.f24554T++;
                z11 = true;
                i11 = this.f24554T;
                interfaceC5094vhArr = this.f24548N;
                if (i11 < interfaceC5094vhArr.length) {
                    ByteBuffer byteBuffer = this.f24551Q;
                    if (byteBuffer != null) {
                        m24589z(byteBuffer, -9223372036854775807L);
                        if (this.f24551Q != null) {
                            return false;
                        }
                    }
                    this.f24554T = -1;
                    return true;
                }
            }
        } else {
            z11 = false;
            i11 = this.f24554T;
            interfaceC5094vhArr = this.f24548N;
            if (i11 < interfaceC5094vhArr.length) {
            }
        }
    }

    /* renamed from: x */
    private final boolean m24587x() {
        return this.f24568i != null;
    }

    /* renamed from: y */
    private final boolean m24588y() {
        if (AbstractC4916qo.f26898a >= 23) {
            return false;
        }
        int i11 = this.f24572m;
        if (i11 != 5 && i11 != 6) {
            return false;
        }
        return true;
    }

    /* renamed from: z */
    private final boolean m24589z(ByteBuffer byteBuffer, long j11) {
        int write;
        boolean z11;
        if (!byteBuffer.hasRemaining()) {
            return true;
        }
        ByteBuffer byteBuffer2 = this.f24551Q;
        if (byteBuffer2 != null) {
            if (byteBuffer2 == byteBuffer) {
                z11 = true;
            } else {
                z11 = false;
            }
            AbstractC4361bo.m20611c(z11);
        } else {
            this.f24551Q = byteBuffer;
            if (AbstractC4916qo.f26898a < 21) {
                int remaining = byteBuffer.remaining();
                byte[] bArr = this.f24552R;
                if (bArr == null || bArr.length < remaining) {
                    this.f24552R = new byte[remaining];
                }
                int position = byteBuffer.position();
                byteBuffer.get(this.f24552R, 0, remaining);
                byteBuffer.position(position);
                this.f24553S = 0;
            }
        }
        int remaining2 = byteBuffer.remaining();
        if (AbstractC4916qo.f26898a < 21) {
            int m22442a = this.f24574o - ((int) (this.f24540F - (this.f24566g.m22442a() * this.f24539E)));
            if (m22442a > 0) {
                write = this.f24568i.write(this.f24552R, this.f24553S, Math.min(remaining2, m22442a));
                if (write > 0) {
                    this.f24553S += write;
                    byteBuffer.position(byteBuffer.position() + write);
                }
            } else {
                write = 0;
            }
        } else {
            write = this.f24568i.write(byteBuffer, remaining2, 1);
        }
        this.f24559Y = SystemClock.elapsedRealtime();
        if (write >= 0) {
            boolean z12 = this.f24573n;
            if (!z12) {
                this.f24540F += write;
            }
            if (write != remaining2) {
                return false;
            }
            if (z12) {
                this.f24541G += this.f24542H;
            }
            this.f24551Q = null;
            return true;
        }
        throw new zzaud(write);
    }

    /* renamed from: a */
    public final long m24590a(boolean z11) {
        long j11;
        long j12;
        long j13;
        C4722lh c4722lh;
        long j14;
        long j15;
        if (m24587x() && this.f24543I != 0) {
            if (this.f24568i.getPlayState() == 3) {
                long m22443b = this.f24566g.m22443b();
                if (m22443b != 0) {
                    long nanoTime = System.nanoTime() / 1000;
                    if (nanoTime - this.f24583x >= 30000) {
                        long[] jArr = this.f24565f;
                        int i11 = this.f24580u;
                        jArr[i11] = m22443b - nanoTime;
                        this.f24580u = (i11 + 1) % 10;
                        int i12 = this.f24581v;
                        if (i12 < 10) {
                            this.f24581v = i12 + 1;
                        }
                        this.f24583x = nanoTime;
                        this.f24582w = 0L;
                        int i13 = 0;
                        while (true) {
                            int i14 = this.f24581v;
                            if (i13 >= i14) {
                                break;
                            }
                            this.f24582w += this.f24565f[i13] / i14;
                            i13++;
                        }
                    }
                    if (!m24588y() && nanoTime - this.f24585z >= 500000) {
                        boolean mo22449h = this.f24566g.mo22449h();
                        this.f24584y = mo22449h;
                        if (mo22449h) {
                            long mo22445d = this.f24566g.mo22445d() / 1000;
                            long mo22444c = this.f24566g.mo22444c();
                            if (mo22445d < this.f24545K) {
                                this.f24584y = false;
                            } else if (Math.abs(mo22445d - nanoTime) > 5000000) {
                                StringBuilder sb2 = new StringBuilder();
                                sb2.append("Spurious audio timestamp (system clock mismatch): ");
                                sb2.append(mo22444c);
                                sb2.append(", ");
                                sb2.append(mo22445d);
                                sb2.append(", ");
                                sb2.append(nanoTime);
                                sb2.append(", ");
                                sb2.append(m22443b);
                                this.f24584y = false;
                            } else if (Math.abs(m24580q(mo22444c) - m22443b) > 5000000) {
                                StringBuilder sb3 = new StringBuilder();
                                sb3.append("Spurious audio timestamp (frame position mismatch): ");
                                sb3.append(mo22444c);
                                sb3.append(", ");
                                sb3.append(mo22445d);
                                sb3.append(", ");
                                sb3.append(nanoTime);
                                sb3.append(", ");
                                sb3.append(m22443b);
                                this.f24584y = false;
                            }
                        }
                        if (this.f24535A != null && !this.f24573n) {
                            try {
                                long intValue = (((Integer) r1.invoke(this.f24568i, null)).intValue() * 1000) - this.f24575p;
                                this.f24546L = intValue;
                                long max = Math.max(intValue, 0L);
                                this.f24546L = max;
                                if (max > 5000000) {
                                    StringBuilder sb4 = new StringBuilder();
                                    sb4.append("Ignoring impossibly large audio latency: ");
                                    sb4.append(max);
                                    this.f24546L = 0L;
                                }
                            } catch (Exception unused) {
                                this.f24535A = null;
                            }
                        }
                        this.f24585z = nanoTime;
                    }
                }
            }
            long nanoTime2 = System.nanoTime() / 1000;
            if (this.f24584y) {
                j11 = m24580q(this.f24566g.mo22444c() + m24579p(nanoTime2 - (this.f24566g.mo22445d() / 1000)));
            } else {
                if (this.f24581v == 0) {
                    j11 = this.f24566g.m22443b();
                } else {
                    j11 = nanoTime2 + this.f24582w;
                }
                if (!z11) {
                    j11 -= this.f24546L;
                }
            }
            long j16 = this.f24544J;
            while (!this.f24567h.isEmpty()) {
                j13 = ((C4723li) this.f24567h.getFirst()).f23926c;
                if (j11 < j13) {
                    break;
                }
                C4723li c4723li = (C4723li) this.f24567h.remove();
                c4722lh = c4723li.f23924a;
                this.f24577r = c4722lh;
                j14 = c4723li.f23926c;
                this.f24579t = j14;
                j15 = c4723li.f23925b;
                this.f24578s = j15 - this.f24544J;
            }
            if (this.f24577r.f23915a == 1.0f) {
                j12 = (j11 + this.f24578s) - this.f24579t;
            } else {
                if (this.f24567h.isEmpty()) {
                    C5021ti c5021ti = this.f24561b;
                    if (c5021ti.m26618f() >= 1024) {
                        j12 = AbstractC4916qo.m25834j(j11 - this.f24579t, c5021ti.m26617e(), c5021ti.m26618f()) + this.f24578s;
                    }
                }
                j12 = ((long) (this.f24577r.f23915a * (j11 - this.f24579t))) + this.f24578s;
            }
            return j16 + j12;
        }
        return Long.MIN_VALUE;
    }

    /* renamed from: c */
    public final C4722lh m24591c() {
        return this.f24577r;
    }

    /* renamed from: d */
    public final C4722lh m24592d(C4722lh c4722lh) {
        if (this.f24573n) {
            C4722lh c4722lh2 = C4722lh.f23914d;
            this.f24577r = c4722lh2;
            return c4722lh2;
        }
        float m26616d = this.f24561b.m26616d(c4722lh.f23915a);
        this.f24561b.m26615c(1.0f);
        C4722lh c4722lh3 = new C4722lh(m26616d, 1.0f);
        C4722lh c4722lh4 = this.f24576q;
        if (c4722lh4 == null) {
            if (!this.f24567h.isEmpty()) {
                c4722lh4 = ((C4723li) this.f24567h.getLast()).f23924a;
            } else {
                c4722lh4 = this.f24577r;
            }
        }
        if (!c4722lh3.equals(c4722lh4)) {
            if (m24587x()) {
                this.f24576q = c4722lh3;
            } else {
                this.f24577r = c4722lh3;
            }
        }
        return this.f24577r;
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00f4  */
    /* renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m24593e(String str, int i11, int i12, int i13, int i14, int[] iArr) {
        int i15;
        int minBufferSize;
        int i16;
        int i17;
        this.f24536B = AbstractC4916qo.m25833i(i13, i11);
        this.f24560a.m24928c(iArr);
        InterfaceC5094vh[] interfaceC5094vhArr = this.f24562c;
        boolean z11 = false;
        boolean z12 = false;
        for (int i18 = 0; i18 < 3; i18++) {
            InterfaceC5094vh interfaceC5094vh = interfaceC5094vhArr[i18];
            try {
                z12 |= interfaceC5094vh.mo24927b(i12, i11, i13);
                if (interfaceC5094vh.zzi()) {
                    i11 = interfaceC5094vh.zza();
                    interfaceC5094vh.zzb();
                    i13 = 2;
                }
            } catch (zzatk e11) {
                throw new zzaty(e11);
            }
        }
        if (z12) {
            m24583t();
        }
        int i19 = 252;
        switch (i11) {
            case 1:
                i15 = 4;
                break;
            case 2:
                i15 = 12;
                break;
            case 3:
                i15 = 28;
                break;
            case 4:
                i15 = 204;
                break;
            case 5:
                i15 = 220;
                break;
            case 6:
                i15 = 252;
                break;
            case 7:
                i15 = 1276;
                break;
            case 8:
                i15 = AbstractC5093vg.f29305a;
                break;
            default:
                throw new zzaty("Unsupported channel count: " + i11);
        }
        int i21 = AbstractC4916qo.f26898a;
        if (i21 <= 23 && "foster".equals(AbstractC4916qo.f26899b) && "NVIDIA".equals(AbstractC4916qo.f26900c)) {
            if (i11 != 3 && i11 != 5) {
                if (i11 == 7) {
                    i19 = AbstractC5093vg.f29305a;
                }
            }
            if (i21 <= 25) {
                "fugu".equals(AbstractC4916qo.f26899b);
            }
            if (z12 && m24587x() && this.f24571l == i13 && this.f24569j == i12 && this.f24570k == i19) {
                return;
            }
            m24599k();
            this.f24571l = i13;
            this.f24573n = false;
            this.f24569j = i12;
            this.f24570k = i19;
            this.f24572m = 2;
            this.f24539E = AbstractC4916qo.m25833i(2, i11);
            minBufferSize = AudioTrack.getMinBufferSize(i12, i19, this.f24572m);
            if (minBufferSize != -2) {
                z11 = true;
            }
            AbstractC4361bo.m20613e(z11);
            i16 = minBufferSize * 4;
            long m24579p = m24579p(250000L);
            int i22 = this.f24539E;
            i17 = ((int) m24579p) * i22;
            int max = (int) Math.max(minBufferSize, m24579p(750000L) * i22);
            if (i16 >= i17) {
                i16 = i17;
            } else if (i16 > max) {
                i16 = max;
            }
            this.f24574o = i16;
            this.f24575p = m24580q(i16 / this.f24539E);
            m24592d(this.f24577r);
        }
        i19 = i15;
        if (i21 <= 25) {
        }
        if (z12) {
        }
        m24599k();
        this.f24571l = i13;
        this.f24573n = false;
        this.f24569j = i12;
        this.f24570k = i19;
        this.f24572m = 2;
        this.f24539E = AbstractC4916qo.m25833i(2, i11);
        minBufferSize = AudioTrack.getMinBufferSize(i12, i19, this.f24572m);
        if (minBufferSize != -2) {
        }
        AbstractC4361bo.m20613e(z11);
        i16 = minBufferSize * 4;
        long m24579p2 = m24579p(250000L);
        int i222 = this.f24539E;
        i17 = ((int) m24579p2) * i222;
        int max2 = (int) Math.max(minBufferSize, m24579p(750000L) * i222);
        if (i16 >= i17) {
        }
        this.f24574o = i16;
        this.f24575p = m24580q(i16 / this.f24539E);
        m24592d(this.f24577r);
    }

    /* renamed from: f */
    public final void m24594f() {
        if (this.f24543I == 1) {
            this.f24543I = 2;
        }
    }

    /* renamed from: g */
    public final void m24595g() {
        this.f24556V = false;
        if (m24587x()) {
            m24584u();
            this.f24566g.m22447f();
        }
    }

    /* renamed from: h */
    public final void m24596h() {
        this.f24556V = true;
        if (m24587x()) {
            this.f24545K = System.nanoTime() / 1000;
            this.f24568i.play();
        }
    }

    /* renamed from: i */
    public final void m24597i() {
        if (!this.f24555U && m24587x() && m24586w()) {
            this.f24566g.m22446e(m24581r());
            this.f24555U = true;
        }
    }

    /* renamed from: j */
    public final void m24598j() {
        m24599k();
        InterfaceC5094vh[] interfaceC5094vhArr = this.f24562c;
        for (int i11 = 0; i11 < 3; i11++) {
            interfaceC5094vhArr[i11].zzg();
        }
        this.f24557W = 0;
        this.f24556V = false;
    }

    /* renamed from: k */
    public final void m24599k() {
        C4722lh c4722lh;
        if (m24587x()) {
            this.f24537C = 0L;
            this.f24538D = 0L;
            this.f24540F = 0L;
            this.f24541G = 0L;
            this.f24542H = 0;
            C4722lh c4722lh2 = this.f24576q;
            if (c4722lh2 != null) {
                this.f24577r = c4722lh2;
                this.f24576q = null;
            } else if (!this.f24567h.isEmpty()) {
                c4722lh = ((C4723li) this.f24567h.getLast()).f23924a;
                this.f24577r = c4722lh;
            }
            this.f24567h.clear();
            this.f24578s = 0L;
            this.f24579t = 0L;
            this.f24550P = null;
            this.f24551Q = null;
            int i11 = 0;
            while (true) {
                InterfaceC5094vh[] interfaceC5094vhArr = this.f24548N;
                if (i11 >= interfaceC5094vhArr.length) {
                    break;
                }
                InterfaceC5094vh interfaceC5094vh = interfaceC5094vhArr[i11];
                interfaceC5094vh.zzd();
                this.f24549O[i11] = interfaceC5094vh.zzc();
                i11++;
            }
            this.f24555U = false;
            this.f24554T = -1;
            this.f24543I = 0;
            this.f24546L = 0L;
            m24584u();
            if (this.f24568i.getPlayState() == 3) {
                this.f24568i.pause();
            }
            AudioTrack audioTrack = this.f24568i;
            this.f24568i = null;
            this.f24566g.mo22448g(null, false);
            this.f24564e.close();
            new C4465ei(this, audioTrack).start();
        }
    }

    /* renamed from: l */
    public final void m24600l(float f11) {
        if (this.f24547M != f11) {
            this.f24547M = f11;
            m24585v();
        }
    }

    /* renamed from: m */
    public final boolean m24601m(ByteBuffer byteBuffer, long j11) {
        boolean z11;
        long j12;
        int i11;
        C4391ci c4391ci;
        C4391ci c4391ci2;
        ByteBuffer byteBuffer2 = this.f24550P;
        if (byteBuffer2 == null || byteBuffer == byteBuffer2) {
            z11 = true;
        } else {
            z11 = false;
        }
        AbstractC4361bo.m20611c(z11);
        if (!m24587x()) {
            this.f24564e.block();
            int i12 = this.f24557W;
            if (i12 == 0) {
                this.f24568i = new AudioTrack(3, this.f24569j, this.f24570k, this.f24572m, this.f24574o, 1);
            } else {
                this.f24568i = new AudioTrack(3, this.f24569j, this.f24570k, this.f24572m, this.f24574o, 1, i12);
            }
            int state = this.f24568i.getState();
            if (state == 1) {
                int audioSessionId = this.f24568i.getAudioSessionId();
                if (this.f24557W != audioSessionId) {
                    this.f24557W = audioSessionId;
                    c4391ci2 = ((C4873pi) this.f24563d).f26224a.f26784Q;
                    c4391ci2.m20894b(audioSessionId);
                }
                this.f24566g.mo22448g(this.f24568i, m24588y());
                m24585v();
                this.f24558X = false;
                if (this.f24556V) {
                    m24596h();
                }
            } else {
                try {
                    this.f24568i.release();
                } catch (Exception unused) {
                } finally {
                    this.f24568i = null;
                }
                throw new zzatz(state, this.f24569j, this.f24570k, this.f24574o);
            }
        }
        if (m24588y()) {
            if (this.f24568i.getPlayState() == 2) {
                this.f24558X = false;
                return false;
            }
            if (this.f24568i.getPlayState() == 1 && this.f24566g.m22442a() != 0) {
                return false;
            }
        }
        boolean z12 = this.f24558X;
        boolean m24602n = m24602n();
        this.f24558X = m24602n;
        if (z12 && !m24602n && this.f24568i.getPlayState() != 1) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            long j13 = this.f24559Y;
            InterfaceC4649ji interfaceC4649ji = this.f24563d;
            int i13 = this.f24574o;
            long m27219b = AbstractC5093vg.m27219b(this.f24575p);
            c4391ci = ((C4873pi) interfaceC4649ji).f26224a.f26784Q;
            c4391ci.m20895c(i13, m27219b, elapsedRealtime - j13);
        }
        if (this.f24550P == null) {
            if (!byteBuffer.hasRemaining()) {
                return true;
            }
            if (this.f24573n && this.f24542H == 0) {
                int i14 = this.f24572m;
                if (i14 != 7 && i14 != 8) {
                    if (i14 == 5) {
                        int i15 = AbstractC5020th.f28329d;
                        i11 = 1536;
                    } else if (i14 == 6) {
                        i11 = AbstractC5020th.m26611a(byteBuffer);
                    } else {
                        throw new IllegalStateException("Unexpected audio encoding: " + i14);
                    }
                } else {
                    int position = byteBuffer.position();
                    i11 = ((((byteBuffer.get(position + 5) & 252) >> 2) | ((byteBuffer.get(position + 4) & 1) << 6)) + 1) * 32;
                }
                this.f24542H = i11;
            }
            if (this.f24576q != null) {
                if (!m24586w()) {
                    return false;
                }
                this.f24567h.add(new C4723li(this.f24576q, Math.max(0L, j11), m24580q(m24581r()), null));
                this.f24576q = null;
                m24583t();
            }
            if (this.f24543I == 0) {
                this.f24544J = Math.max(0L, j11);
                this.f24543I = 1;
            } else {
                long j14 = this.f24544J;
                if (this.f24573n) {
                    j12 = this.f24538D;
                } else {
                    j12 = this.f24537C / this.f24536B;
                }
                long m24580q = j14 + m24580q(j12);
                if (this.f24543I == 1 && Math.abs(m24580q - j11) > 200000) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("Discontinuity detected [expected ");
                    sb2.append(m24580q);
                    sb2.append(", got ");
                    sb2.append(j11);
                    sb2.append("]");
                    this.f24543I = 2;
                }
                if (this.f24543I == 2) {
                    this.f24544J += j11 - m24580q;
                    this.f24543I = 1;
                    ((C4873pi) this.f24563d).f26224a.f26790W = true;
                }
            }
            if (this.f24573n) {
                this.f24538D += this.f24542H;
            } else {
                this.f24537C += byteBuffer.remaining();
            }
            this.f24550P = byteBuffer;
        }
        if (this.f24573n) {
            m24589z(this.f24550P, j11);
        } else {
            m24582s(j11);
        }
        if (this.f24550P.hasRemaining()) {
            return false;
        }
        this.f24550P = null;
        return true;
    }

    /* renamed from: n */
    public final boolean m24602n() {
        if (!m24587x()) {
            return false;
        }
        if (m24581r() <= this.f24566g.m22442a()) {
            if (!m24588y() || this.f24568i.getPlayState() != 2 || this.f24568i.getPlaybackHeadPosition() != 0) {
                return false;
            }
            return true;
        }
        return true;
    }

    /* renamed from: o */
    public final boolean m24603o() {
        if (!m24587x()) {
            return true;
        }
        if (this.f24555U && !m24602n()) {
            return true;
        }
        return false;
    }
}
