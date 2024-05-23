package h00;

import android.graphics.Bitmap;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;

/* renamed from: h00.a */
/* loaded from: classes4.dex */
public final class C19695a {
    public static final a Companion = new a(null);

    /* renamed from: a */
    private final Bitmap f97706a;

    /* renamed from: b */
    private final String f97707b;

    /* renamed from: h00.a$a */
    /* loaded from: classes4.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC19060k abstractC19060k) {
            this();
        }

        /* renamed from: a */
        public final C19695a m103342a(Bitmap bitmap, String str) {
            AbstractC19074t.m100208f(bitmap, "bitmap");
            AbstractC19074t.m100208f(str, "key");
            return new C19695a(bitmap, str);
        }
    }

    public C19695a(Bitmap bitmap, String str) {
        AbstractC19074t.m100208f(bitmap, "bitmap");
        AbstractC19074t.m100208f(str, "key");
        this.f97706a = bitmap;
        this.f97707b = str;
    }

    /* renamed from: a */
    public final Bitmap m103340a() {
        return this.f97706a;
    }

    /* renamed from: b */
    public final String m103341b() {
        return this.f97707b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C19695a)) {
            return false;
        }
        C19695a c19695a = (C19695a) obj;
        return AbstractC19074t.m100204b(this.f97706a, c19695a.f97706a) && AbstractC19074t.m100204b(this.f97707b, c19695a.f97707b);
    }

    public int hashCode() {
        Bitmap bitmap = this.f97706a;
        int hashCode = (bitmap != null ? bitmap.hashCode() : 0) * 31;
        String str = this.f97707b;
        return hashCode + (str != null ? str.hashCode() : 0);
    }

    public String toString() {
        return "DocScanInput(bitmap=" + this.f97706a + ", key=" + this.f97707b + ")";
    }
}
