package p10;

import fn0.AbstractC19060k;
import fn0.AbstractC19074t;

/* renamed from: p10.l */
/* loaded from: classes5.dex */
public final class C24608l {
    public static final a Companion = new a(null);

    /* renamed from: a */
    private final String f118399a;

    /* renamed from: b */
    private final Integer f118400b;

    /* renamed from: c */
    private final Object f118401c;

    /* renamed from: d */
    private final Exception f118402d;

    /* renamed from: p10.l$a */
    /* loaded from: classes5.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC19060k abstractC19060k) {
            this();
        }

        /* renamed from: a */
        public final C24608l m128101a(Exception exc) {
            AbstractC19074t.m100208f(exc, "exception");
            return new C24608l(null, -99999, null, exc, 5, null);
        }
    }

    public C24608l(String str, Integer num, Object obj, Exception exc) {
        this.f118399a = str;
        this.f118400b = num;
        this.f118401c = obj;
        this.f118402d = exc;
    }

    /* renamed from: a */
    public final Object m128099a() {
        return this.f118401c;
    }

    /* renamed from: b */
    public final boolean m128100b() {
        Integer num = this.f118400b;
        if (num != null && num.intValue() == 0) {
            return true;
        }
        return false;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C24608l)) {
            return false;
        }
        C24608l c24608l = (C24608l) obj;
        return AbstractC19074t.m100204b(this.f118399a, c24608l.f118399a) && AbstractC19074t.m100204b(this.f118400b, c24608l.f118400b) && AbstractC19074t.m100204b(this.f118401c, c24608l.f118401c) && AbstractC19074t.m100204b(this.f118402d, c24608l.f118402d);
    }

    public int hashCode() {
        String str = this.f118399a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        Integer num = this.f118400b;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        Object obj = this.f118401c;
        int hashCode3 = (hashCode2 + (obj == null ? 0 : obj.hashCode())) * 31;
        Exception exc = this.f118402d;
        return hashCode3 + (exc != null ? exc.hashCode() : 0);
    }

    public String toString() {
        return "WsResponse(mess=" + this.f118399a + ", err=" + this.f118400b + ", data=" + this.f118401c + ", wsError=" + this.f118402d + ")";
    }

    public /* synthetic */ C24608l(String str, Integer num, Object obj, Exception exc, int i11, AbstractC19060k abstractC19060k) {
        this((i11 & 1) != 0 ? null : str, (i11 & 2) != 0 ? null : num, (i11 & 4) != 0 ? null : obj, (i11 & 8) != 0 ? null : exc);
    }
}
