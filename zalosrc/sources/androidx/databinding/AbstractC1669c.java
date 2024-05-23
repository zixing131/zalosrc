package androidx.databinding;

import java.util.ArrayList;
import java.util.List;

/* renamed from: androidx.databinding.c */
/* loaded from: classes2.dex */
public abstract class AbstractC1669c implements Cloneable {

    /* renamed from: p */
    private List f6728p = new ArrayList();

    /* renamed from: q */
    private long f6729q = 0;

    /* renamed from: r */
    private long[] f6730r;

    /* renamed from: s */
    private int f6731s;

    /* renamed from: t */
    private final a f6732t;

    /* renamed from: androidx.databinding.c$a */
    /* loaded from: classes2.dex */
    public static abstract class a {
        /* renamed from: a */
        public abstract void mo8515a(Object obj, Object obj2, int i11, Object obj3);
    }

    public AbstractC1669c(a aVar) {
        this.f6732t = aVar;
    }

    /* renamed from: c */
    private boolean m8538c(int i11) {
        int i12;
        if (i11 < 64) {
            if (((1 << i11) & this.f6729q) != 0) {
                return true;
            }
            return false;
        }
        long[] jArr = this.f6730r;
        if (jArr == null || (i12 = (i11 / 64) - 1) >= jArr.length) {
            return false;
        }
        if (((1 << (i11 % 64)) & jArr[i12]) != 0) {
            return true;
        }
        return false;
    }

    /* renamed from: f */
    private void m8539f(Object obj, int i11, Object obj2, int i12, int i13, long j11) {
        long j12 = 1;
        while (i12 < i13) {
            if ((j11 & j12) == 0) {
                this.f6732t.mo8515a(this.f6728p.get(i12), obj, i11, obj2);
            }
            j12 <<= 1;
            i12++;
        }
    }

    /* renamed from: g */
    private void m8540g(Object obj, int i11, Object obj2) {
        m8539f(obj, i11, obj2, 0, Math.min(64, this.f6728p.size()), this.f6729q);
    }

    /* renamed from: h */
    private void m8541h(Object obj, int i11, Object obj2) {
        int length;
        int size = this.f6728p.size();
        long[] jArr = this.f6730r;
        if (jArr == null) {
            length = -1;
        } else {
            length = jArr.length - 1;
        }
        m8542i(obj, i11, obj2, length);
        m8539f(obj, i11, obj2, (length + 2) * 64, size, 0L);
    }

    /* renamed from: i */
    private void m8542i(Object obj, int i11, Object obj2, int i12) {
        if (i12 < 0) {
            m8540g(obj, i11, obj2);
            return;
        }
        long j11 = this.f6730r[i12];
        int i13 = (i12 + 1) * 64;
        int min = Math.min(this.f6728p.size(), i13 + 64);
        m8542i(obj, i11, obj2, i12 - 1);
        m8539f(obj, i11, obj2, i13, min, j11);
    }

    /* renamed from: k */
    private void m8543k(int i11, long j11) {
        long j12 = Long.MIN_VALUE;
        for (int i12 = i11 + 63; i12 >= i11; i12--) {
            if ((j11 & j12) != 0) {
                this.f6728p.remove(i12);
            }
            j12 >>>= 1;
        }
    }

    /* renamed from: l */
    private void m8544l(int i11) {
        if (i11 < 64) {
            this.f6729q = (1 << i11) | this.f6729q;
            return;
        }
        int i12 = (i11 / 64) - 1;
        long[] jArr = this.f6730r;
        if (jArr == null) {
            this.f6730r = new long[this.f6728p.size() / 64];
        } else if (jArr.length <= i12) {
            long[] jArr2 = new long[this.f6728p.size() / 64];
            long[] jArr3 = this.f6730r;
            System.arraycopy(jArr3, 0, jArr2, 0, jArr3.length);
            this.f6730r = jArr2;
        }
        long j11 = 1 << (i11 % 64);
        long[] jArr4 = this.f6730r;
        jArr4[i12] = j11 | jArr4[i12];
    }

    /* renamed from: a */
    public synchronized void m8545a(Object obj) {
        try {
            if (obj != null) {
                int lastIndexOf = this.f6728p.lastIndexOf(obj);
                if (lastIndexOf >= 0) {
                    if (m8538c(lastIndexOf)) {
                    }
                }
                this.f6728p.add(obj);
            } else {
                throw new IllegalArgumentException("callback cannot be null");
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public synchronized AbstractC1669c clone() {
        AbstractC1669c abstractC1669c;
        CloneNotSupportedException e11;
        try {
            abstractC1669c = (AbstractC1669c) super.clone();
            try {
                abstractC1669c.f6729q = 0L;
                abstractC1669c.f6730r = null;
                abstractC1669c.f6731s = 0;
                abstractC1669c.f6728p = new ArrayList();
                int size = this.f6728p.size();
                for (int i11 = 0; i11 < size; i11++) {
                    if (!m8538c(i11)) {
                        abstractC1669c.f6728p.add(this.f6728p.get(i11));
                    }
                }
            } catch (CloneNotSupportedException e12) {
                e11 = e12;
                e11.printStackTrace();
                return abstractC1669c;
            }
        } catch (CloneNotSupportedException e13) {
            abstractC1669c = null;
            e11 = e13;
        }
        return abstractC1669c;
    }

    /* renamed from: e */
    public synchronized void m8547e(Object obj, int i11, Object obj2) {
        try {
            this.f6731s++;
            m8541h(obj, i11, obj2);
            int i12 = this.f6731s - 1;
            this.f6731s = i12;
            if (i12 == 0) {
                long[] jArr = this.f6730r;
                if (jArr != null) {
                    for (int length = jArr.length - 1; length >= 0; length--) {
                        long j11 = this.f6730r[length];
                        if (j11 != 0) {
                            m8543k((length + 1) * 64, j11);
                            this.f6730r[length] = 0;
                        }
                    }
                }
                long j12 = this.f6729q;
                if (j12 != 0) {
                    m8543k(0, j12);
                    this.f6729q = 0L;
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* renamed from: j */
    public synchronized void m8548j(Object obj) {
        try {
            if (this.f6731s == 0) {
                this.f6728p.remove(obj);
            } else {
                int lastIndexOf = this.f6728p.lastIndexOf(obj);
                if (lastIndexOf >= 0) {
                    m8544l(lastIndexOf);
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }
}
