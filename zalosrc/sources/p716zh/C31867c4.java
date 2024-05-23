package p716zh;

import fn0.AbstractC19060k;
import fn0.AbstractC19074t;

/* renamed from: zh.c4 */
/* loaded from: classes3.dex */
public final class C31867c4 {
    public static final a Companion = new a(null);

    /* renamed from: a */
    private final int f146351a;

    /* renamed from: b */
    private final Object f146352b;

    /* renamed from: zh.c4$a */
    /* loaded from: classes3.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC19060k abstractC19060k) {
            this();
        }

        /* renamed from: a */
        public final boolean m153165a(int i11) {
            return (i11 == -2001 || i11 == -2000) ? false : true;
        }

        /* renamed from: b */
        public final boolean m153166b(int i11) {
            return (i11 == -1001 || i11 == -2000 || i11 == -2001) ? false : true;
        }

        /* renamed from: c */
        public final boolean m153167c(int i11) {
            return i11 == -1001;
        }

        /* renamed from: d */
        public final boolean m153168d(int i11) {
            return i11 == -1202;
        }
    }

    public C31867c4(int i11, Object obj) {
        this.f146351a = i11;
        this.f146352b = obj;
    }

    /* renamed from: a */
    public final Object m153163a() {
        return this.f146352b;
    }

    /* renamed from: b */
    public final int m153164b() {
        return this.f146351a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C31867c4)) {
            return false;
        }
        C31867c4 c31867c4 = (C31867c4) obj;
        return this.f146351a == c31867c4.f146351a && AbstractC19074t.m100204b(this.f146352b, c31867c4.f146352b);
    }

    public int hashCode() {
        int i11 = this.f146351a * 31;
        Object obj = this.f146352b;
        return i11 + (obj == null ? 0 : obj.hashCode());
    }

    public String toString() {
        return "E2eeDecryptedResult(resultCode=" + this.f146351a + ", result=" + this.f146352b + ")";
    }
}
