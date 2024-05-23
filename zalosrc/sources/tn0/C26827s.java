package tn0;

import en0.InterfaceC18509p;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import kotlinx.serialization.descriptors.SerialDescriptor;
import qm0.AbstractC25358n;

/* renamed from: tn0.s */
/* loaded from: classes7.dex */
public final class C26827s {

    /* renamed from: e */
    private static final a f127063e = new a(null);

    /* renamed from: f */
    private static final long[] f127064f = new long[0];

    /* renamed from: a */
    private final SerialDescriptor f127065a;

    /* renamed from: b */
    private final InterfaceC18509p f127066b;

    /* renamed from: c */
    private long f127067c;

    /* renamed from: d */
    private final long[] f127068d;

    /* renamed from: tn0.s$a */
    /* loaded from: classes7.dex */
    private static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC19060k abstractC19060k) {
            this();
        }
    }

    public C26827s(SerialDescriptor serialDescriptor, InterfaceC18509p interfaceC18509p) {
        AbstractC19074t.m100208f(serialDescriptor, "descriptor");
        AbstractC19074t.m100208f(interfaceC18509p, "readIfAbsent");
        this.f127065a = serialDescriptor;
        this.f127066b = interfaceC18509p;
        int mo113949e = serialDescriptor.mo113949e();
        if (mo113949e <= 64) {
            this.f127067c = mo113949e != 64 ? (-1) << mo113949e : 0L;
            this.f127068d = f127064f;
        } else {
            this.f127067c = 0L;
            this.f127068d = m137957e(mo113949e);
        }
    }

    /* renamed from: b */
    private final void m137955b(int i11) {
        int i12 = (i11 >>> 6) - 1;
        long[] jArr = this.f127068d;
        jArr[i12] = jArr[i12] | (1 << (i11 & 63));
    }

    /* renamed from: c */
    private final int m137956c() {
        int length = this.f127068d.length;
        int i11 = 0;
        while (i11 < length) {
            int i12 = i11 + 1;
            int i13 = i12 * 64;
            long j11 = this.f127068d[i11];
            while (j11 != -1) {
                int numberOfTrailingZeros = Long.numberOfTrailingZeros(~j11);
                j11 |= 1 << numberOfTrailingZeros;
                int i14 = numberOfTrailingZeros + i13;
                if (((Boolean) this.f127066b.mo240pC(this.f127065a, Integer.valueOf(i14))).booleanValue()) {
                    this.f127068d[i11] = j11;
                    return i14;
                }
            }
            this.f127068d[i11] = j11;
            i11 = i12;
        }
        return -1;
    }

    /* renamed from: e */
    private final long[] m137957e(int i11) {
        int m131361I;
        long[] jArr = new long[(i11 - 1) >>> 6];
        if ((i11 & 63) != 0) {
            m131361I = AbstractC25358n.m131361I(jArr);
            jArr[m131361I] = (-1) << i11;
        }
        return jArr;
    }

    /* renamed from: a */
    public final void m137958a(int i11) {
        if (i11 < 64) {
            this.f127067c |= 1 << i11;
        } else {
            m137955b(i11);
        }
    }

    /* renamed from: d */
    public final int m137959d() {
        int numberOfTrailingZeros;
        int mo113949e = this.f127065a.mo113949e();
        do {
            long j11 = this.f127067c;
            if (j11 != -1) {
                numberOfTrailingZeros = Long.numberOfTrailingZeros(~j11);
                this.f127067c |= 1 << numberOfTrailingZeros;
            } else {
                if (mo113949e > 64) {
                    return m137956c();
                }
                return -1;
            }
        } while (!((Boolean) this.f127066b.mo240pC(this.f127065a, Integer.valueOf(numberOfTrailingZeros))).booleanValue());
        return numberOfTrailingZeros;
    }
}
