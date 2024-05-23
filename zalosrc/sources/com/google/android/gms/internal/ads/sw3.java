package com.google.android.gms.internal.ads;

import com.zing.zalo.zvideoutil.ZVideoUtilMetadata;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes2.dex */
public final class sw3 extends mt3 {

    /* renamed from: y */
    static final int[] f28045y = {1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, ZVideoUtilMetadata.FF_PROFILE_H264_HIGH_444, 233, 377, 610, 987, 1597, 2584, 4181, 6765, 10946, 17711, 28657, 46368, 75025, 121393, 196418, 317811, 514229, 832040, 1346269, 2178309, 3524578, 5702887, 9227465, 14930352, 24157817, 39088169, 63245986, 102334155, 165580141, 267914296, 433494437, 701408733, 1134903170, 1836311903, Integer.MAX_VALUE};

    /* renamed from: t */
    private final int f28046t;

    /* renamed from: u */
    private final mt3 f28047u;

    /* renamed from: v */
    private final mt3 f28048v;

    /* renamed from: w */
    private final int f28049w;

    /* renamed from: x */
    private final int f28050x;

    public /* synthetic */ sw3(mt3 mt3Var, mt3 mt3Var2, rw3 rw3Var) {
        this(mt3Var, mt3Var2);
    }

    /* renamed from: Q */
    public static mt3 m26445Q(mt3 mt3Var, mt3 mt3Var2) {
        if (mt3Var2.mo22168p() == 0) {
            return mt3Var;
        }
        if (mt3Var.mo22168p() == 0) {
            return mt3Var2;
        }
        int mo22168p = mt3Var.mo22168p() + mt3Var2.mo22168p();
        if (mo22168p < 128) {
            return m26446S(mt3Var, mt3Var2);
        }
        if (mt3Var instanceof sw3) {
            sw3 sw3Var = (sw3) mt3Var;
            if (sw3Var.f28048v.mo22168p() + mt3Var2.mo22168p() < 128) {
                return new sw3(sw3Var.f28047u, m26446S(sw3Var.f28048v, mt3Var2));
            }
            if (sw3Var.f28047u.mo23014s() > sw3Var.f28048v.mo23014s() && sw3Var.f28050x > mt3Var2.mo23014s()) {
                return new sw3(sw3Var.f28047u, new sw3(sw3Var.f28048v, mt3Var2));
            }
        }
        if (mo22168p >= m26447U(Math.max(mt3Var.mo23014s(), mt3Var2.mo23014s()) + 1)) {
            return new sw3(mt3Var, mt3Var2);
        }
        return ow3.m25348a(new ow3(null), mt3Var, mt3Var2);
    }

    /* renamed from: S */
    private static mt3 m26446S(mt3 mt3Var, mt3 mt3Var2) {
        int mo22168p = mt3Var.mo22168p();
        int mo22168p2 = mt3Var2.mo22168p();
        byte[] bArr = new byte[mo22168p + mo22168p2];
        mt3Var.m24736g(bArr, 0, 0, mo22168p);
        mt3Var2.m24736g(bArr, 0, mo22168p, mo22168p2);
        return new it3(bArr);
    }

    /* renamed from: U */
    public static int m26447U(int i11) {
        int[] iArr = f28045y;
        int length = iArr.length;
        if (i11 >= 47) {
            return Integer.MAX_VALUE;
        }
        return iArr[i11];
    }

    @Override // com.google.android.gms.internal.ads.mt3
    /* renamed from: B */
    public final void mo23393B(bt3 bt3Var) {
        this.f28047u.mo23393B(bt3Var);
        this.f28048v.mo23393B(bt3Var);
    }

    @Override // com.google.android.gms.internal.ads.mt3
    /* renamed from: C */
    public final boolean mo23394C() {
        int mo23396v = this.f28047u.mo23396v(0, 0, this.f28049w);
        mt3 mt3Var = this.f28048v;
        if (mt3Var.mo23396v(mo23396v, 0, mt3Var.mo22168p()) != 0) {
            return false;
        }
        return true;
    }

    @Override // com.google.android.gms.internal.ads.mt3
    /* renamed from: F */
    public final gt3 iterator() {
        return new mw3(this);
    }

    @Override // com.google.android.gms.internal.ads.mt3
    public final boolean equals(Object obj) {
        boolean mo23013P;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof mt3)) {
            return false;
        }
        mt3 mt3Var = (mt3) obj;
        if (this.f28046t != mt3Var.mo22168p()) {
            return false;
        }
        if (this.f28046t == 0) {
            return true;
        }
        int m24733E = m24733E();
        int m24733E2 = mt3Var.m24733E();
        if (m24733E != 0 && m24733E2 != 0 && m24733E != m24733E2) {
            return false;
        }
        qw3 qw3Var = new qw3(this, null);
        ht3 next = qw3Var.next();
        qw3 qw3Var2 = new qw3(mt3Var, null);
        ht3 next2 = qw3Var2.next();
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        while (true) {
            int mo22168p = next.mo22168p() - i11;
            int mo22168p2 = next2.mo22168p() - i12;
            int min = Math.min(mo22168p, mo22168p2);
            if (i11 == 0) {
                mo23013P = next.mo23013P(next2, i12, min);
            } else {
                mo23013P = next2.mo23013P(next, i11, min);
            }
            if (!mo23013P) {
                return false;
            }
            i13 += min;
            int i14 = this.f28046t;
            if (i13 >= i14) {
                if (i13 == i14) {
                    return true;
                }
                throw new IllegalStateException();
            }
            if (min == mo22168p) {
                next = qw3Var.next();
                i11 = 0;
            } else {
                i11 += min;
                next = next;
            }
            if (min == mo22168p2) {
                next2 = qw3Var2.next();
                i12 = 0;
            } else {
                i12 += min;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.mt3, java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return new mw3(this);
    }

    @Override // com.google.android.gms.internal.ads.mt3
    /* renamed from: l */
    public final byte mo22166l(int i11) {
        mt3.m24731e(i11, this.f28046t);
        return mo22167m(i11);
    }

    @Override // com.google.android.gms.internal.ads.mt3
    /* renamed from: m */
    public final byte mo22167m(int i11) {
        int i12 = this.f28049w;
        if (i11 < i12) {
            return this.f28047u.mo22167m(i11);
        }
        return this.f28048v.mo22167m(i11 - i12);
    }

    @Override // com.google.android.gms.internal.ads.mt3
    /* renamed from: p */
    public final int mo22168p() {
        return this.f28046t;
    }

    @Override // com.google.android.gms.internal.ads.mt3
    /* renamed from: r */
    public final void mo22169r(byte[] bArr, int i11, int i12, int i13) {
        int i14 = this.f28049w;
        if (i11 + i13 <= i14) {
            this.f28047u.mo22169r(bArr, i11, i12, i13);
        } else {
            if (i11 >= i14) {
                this.f28048v.mo22169r(bArr, i11 - i14, i12, i13);
                return;
            }
            int i15 = i14 - i11;
            this.f28047u.mo22169r(bArr, i11, i12, i15);
            this.f28048v.mo22169r(bArr, 0, i12 + i15, i13 - i15);
        }
    }

    @Override // com.google.android.gms.internal.ads.mt3
    /* renamed from: s */
    public final int mo23014s() {
        return this.f28050x;
    }

    @Override // com.google.android.gms.internal.ads.mt3
    /* renamed from: t */
    public final boolean mo23015t() {
        if (this.f28046t >= m26447U(this.f28050x)) {
            return true;
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.mt3
    /* renamed from: u */
    public final int mo23395u(int i11, int i12, int i13) {
        int i14 = this.f28049w;
        if (i12 + i13 <= i14) {
            return this.f28047u.mo23395u(i11, i12, i13);
        }
        if (i12 >= i14) {
            return this.f28048v.mo23395u(i11, i12 - i14, i13);
        }
        int i15 = i14 - i12;
        return this.f28048v.mo23395u(this.f28047u.mo23395u(i11, i12, i15), 0, i13 - i15);
    }

    @Override // com.google.android.gms.internal.ads.mt3
    /* renamed from: v */
    public final int mo23396v(int i11, int i12, int i13) {
        int i14 = this.f28049w;
        if (i12 + i13 <= i14) {
            return this.f28047u.mo23396v(i11, i12, i13);
        }
        if (i12 >= i14) {
            return this.f28048v.mo23396v(i11, i12 - i14, i13);
        }
        int i15 = i14 - i12;
        return this.f28048v.mo23396v(this.f28047u.mo23396v(i11, i12, i15), 0, i13 - i15);
    }

    @Override // com.google.android.gms.internal.ads.mt3
    /* renamed from: w */
    public final mt3 mo23397w(int i11, int i12) {
        int m24723D = mt3.m24723D(i11, i12, this.f28046t);
        if (m24723D == 0) {
            return mt3.f24751q;
        }
        if (m24723D == this.f28046t) {
            return this;
        }
        int i13 = this.f28049w;
        if (i12 <= i13) {
            return this.f28047u.mo23397w(i11, i12);
        }
        if (i11 >= i13) {
            return this.f28048v.mo23397w(i11 - i13, i12 - i13);
        }
        mt3 mt3Var = this.f28047u;
        return new sw3(mt3Var.mo23397w(i11, mt3Var.mo22168p()), this.f28048v.mo23397w(0, i12 - this.f28049w));
    }

    @Override // com.google.android.gms.internal.ads.mt3
    /* renamed from: x */
    public final vt3 mo23398x() {
        ArrayList<ByteBuffer> arrayList = new ArrayList();
        qw3 qw3Var = new qw3(this, null);
        while (qw3Var.hasNext()) {
            arrayList.add(qw3Var.next().mo23392A());
        }
        int i11 = vt3.f29483e;
        int i12 = 0;
        int i13 = 0;
        for (ByteBuffer byteBuffer : arrayList) {
            i13 += byteBuffer.remaining();
            if (byteBuffer.hasArray()) {
                i12 |= 1;
            } else if (byteBuffer.isDirect()) {
                i12 |= 2;
            } else {
                i12 |= 4;
            }
        }
        if (i12 == 2) {
            return new rt3(arrayList, i13, true, null);
        }
        return vt3.m27354g(new ev3(arrayList), 4096);
    }

    @Override // com.google.android.gms.internal.ads.mt3
    /* renamed from: z */
    protected final String mo23399z(Charset charset) {
        return new String(m24738k(), charset);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public sw3(mt3 mt3Var, mt3 mt3Var2) {
        this.f28047u = mt3Var;
        this.f28048v = mt3Var2;
        int mo22168p = mt3Var.mo22168p();
        this.f28049w = mo22168p;
        this.f28046t = mo22168p + mt3Var2.mo22168p();
        this.f28050x = Math.max(mt3Var.mo23014s(), mt3Var2.mo23014s()) + 1;
    }
}
