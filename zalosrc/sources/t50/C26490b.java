package t50;

import android.graphics.Bitmap;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import p205hc.InterfaceC19969h;

/* renamed from: t50.b */
/* loaded from: classes5.dex */
public final class C26490b implements InterfaceC19969h {
    public static final a Companion = new a(null);

    /* renamed from: a */
    private final Bitmap f125723a;

    /* renamed from: b */
    private final String f125724b;

    /* renamed from: t50.b$a */
    /* loaded from: classes5.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC19060k abstractC19060k) {
            this();
        }

        /* renamed from: a */
        public final C26490b m136456a(Bitmap bitmap) {
            AbstractC19074t.m100208f(bitmap, "inputBitmap");
            return new C26490b(bitmap, String.valueOf(bitmap.getGenerationId()));
        }

        /* renamed from: b */
        public final C26490b m136457b(Bitmap bitmap, String str) {
            AbstractC19074t.m100208f(bitmap, "inputBitmap");
            AbstractC19074t.m100208f(str, "bitmapKey");
            return new C26490b(bitmap, str);
        }
    }

    public C26490b(Bitmap bitmap, String str) {
        AbstractC19074t.m100208f(bitmap, "inputBitmap");
        AbstractC19074t.m100208f(str, "bitmapKey");
        this.f125723a = bitmap;
        this.f125724b = str;
    }

    /* renamed from: a */
    public static final C26490b m136452a(Bitmap bitmap) {
        return Companion.m136456a(bitmap);
    }

    /* renamed from: d */
    public static final C26490b m136453d(Bitmap bitmap, String str) {
        return Companion.m136457b(bitmap, str);
    }

    /* renamed from: b */
    public final String m136454b() {
        return this.f125724b;
    }

    /* renamed from: c */
    public final Bitmap m136455c() {
        return this.f125723a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C26490b)) {
            return false;
        }
        C26490b c26490b = (C26490b) obj;
        return AbstractC19074t.m100204b(this.f125723a, c26490b.f125723a) && AbstractC19074t.m100204b(this.f125724b, c26490b.f125724b);
    }

    public int hashCode() {
        return (this.f125723a.hashCode() * 31) + this.f125724b.hashCode();
    }

    public String toString() {
        return "DocumentScanViewArgs(inputBitmap=" + this.f125723a + ", bitmapKey=" + this.f125724b + ")";
    }
}
