package on0;

import en0.InterfaceC18509p;
import fn0.AbstractC19074t;
import gn0.InterfaceC19517a;
import java.util.Iterator;
import java.util.NoSuchElementException;
import ln0.AbstractC22543l;
import ln0.C22537f;
import nn0.InterfaceC23898g;
import pm0.C24860q;

/* renamed from: on0.e */
/* loaded from: classes.dex */
public final class C24323e implements InterfaceC23898g {

    /* renamed from: a */
    private final CharSequence f117414a;

    /* renamed from: b */
    private final int f117415b;

    /* renamed from: c */
    private final int f117416c;

    /* renamed from: d */
    private final InterfaceC18509p f117417d;

    /* renamed from: on0.e$a */
    /* loaded from: classes.dex */
    public static final class a implements Iterator, InterfaceC19517a {

        /* renamed from: p */
        private int f117418p = -1;

        /* renamed from: q */
        private int f117419q;

        /* renamed from: r */
        private int f117420r;

        /* renamed from: s */
        private C22537f f117421s;

        /* renamed from: t */
        private int f117422t;

        a() {
            int m116588k;
            m116588k = AbstractC22543l.m116588k(C24323e.this.f117415b, 0, C24323e.this.f117414a.length());
            this.f117419q = m116588k;
            this.f117420r = m116588k;
        }

        /* JADX WARN: Code restructure failed: missing block: B:9:0x0021, code lost:            if (r0 < on0.C24323e.this.f117416c) goto L31;     */
        /* renamed from: a */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private final void m126999a() {
            C22537f m116593p;
            int m127163V;
            int m127163V2;
            int i11 = 0;
            if (this.f117420r < 0) {
                this.f117418p = 0;
                this.f117421s = null;
                return;
            }
            if (C24323e.this.f117416c > 0) {
                int i12 = this.f117422t + 1;
                this.f117422t = i12;
            }
            if (this.f117420r <= C24323e.this.f117414a.length()) {
                C24860q c24860q = (C24860q) C24323e.this.f117417d.mo240pC(C24323e.this.f117414a, Integer.valueOf(this.f117420r));
                if (c24860q == null) {
                    int i13 = this.f117419q;
                    m127163V = AbstractC24342w.m127163V(C24323e.this.f117414a);
                    this.f117421s = new C22537f(i13, m127163V);
                    this.f117420r = -1;
                } else {
                    int intValue = ((Number) c24860q.m129213a()).intValue();
                    int intValue2 = ((Number) c24860q.m129214b()).intValue();
                    m116593p = AbstractC22543l.m116593p(this.f117419q, intValue);
                    this.f117421s = m116593p;
                    int i14 = intValue + intValue2;
                    this.f117419q = i14;
                    if (intValue2 == 0) {
                        i11 = 1;
                    }
                    this.f117420r = i14 + i11;
                }
                this.f117418p = 1;
            }
            int i15 = this.f117419q;
            m127163V2 = AbstractC24342w.m127163V(C24323e.this.f117414a);
            this.f117421s = new C22537f(i15, m127163V2);
            this.f117420r = -1;
            this.f117418p = 1;
        }

        @Override // java.util.Iterator
        /* renamed from: c */
        public C22537f next() {
            if (this.f117418p == -1) {
                m126999a();
            }
            if (this.f117418p != 0) {
                C22537f c22537f = this.f117421s;
                AbstractC19074t.m100206d(c22537f, "null cannot be cast to non-null type kotlin.ranges.IntRange");
                this.f117421s = null;
                this.f117418p = -1;
                return c22537f;
            }
            throw new NoSuchElementException();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.f117418p == -1) {
                m126999a();
            }
            if (this.f117418p == 1) {
                return true;
            }
            return false;
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public C24323e(CharSequence charSequence, int i11, int i12, InterfaceC18509p interfaceC18509p) {
        AbstractC19074t.m100208f(charSequence, "input");
        AbstractC19074t.m100208f(interfaceC18509p, "getNextMatch");
        this.f117414a = charSequence;
        this.f117415b = i11;
        this.f117416c = i12;
        this.f117417d = interfaceC18509p;
    }

    @Override // nn0.InterfaceC23898g
    public Iterator iterator() {
        return new a();
    }
}
