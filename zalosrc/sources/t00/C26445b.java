package t00;

import fn0.AbstractC19060k;
import fn0.AbstractC19074t;

/* renamed from: t00.b */
/* loaded from: classes4.dex */
public final class C26445b {
    public static final a Companion = new a(null);

    /* renamed from: a */
    private int f125631a;

    /* renamed from: b */
    private String f125632b;

    /* renamed from: c */
    private String f125633c;

    /* renamed from: t00.b$a */
    /* loaded from: classes4.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC19060k abstractC19060k) {
            this();
        }
    }

    public C26445b(String str, String str2, int i11) {
        AbstractC19074t.m100208f(str, "title");
        AbstractC19074t.m100208f(str2, "content");
        this.f125632b = str;
        this.f125633c = str2;
        this.f125631a = i11;
    }

    /* renamed from: a */
    public final String m136323a() {
        return this.f125633c;
    }

    /* renamed from: b */
    public final String m136324b() {
        return this.f125632b;
    }

    /* renamed from: c */
    public final int m136325c() {
        return this.f125631a;
    }

    public /* synthetic */ C26445b(String str, String str2, int i11, int i12, AbstractC19060k abstractC19060k) {
        this((i12 & 1) != 0 ? "" : str, (i12 & 2) != 0 ? "" : str2, (i12 & 4) != 0 ? 2 : i11);
    }
}
