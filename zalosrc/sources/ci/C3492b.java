package ci;

import android.graphics.drawable.Drawable;
import fn0.AbstractC19060k;

/* renamed from: ci.b */
/* loaded from: classes3.dex */
public final class C3492b {
    public static final a Companion = new a(null);

    /* renamed from: a */
    private String f14624a;

    /* renamed from: b */
    private String f14625b;

    /* renamed from: c */
    private boolean f14626c;

    /* renamed from: d */
    private Drawable f14627d;

    /* renamed from: e */
    private Drawable f14628e;

    /* renamed from: ci.b$a */
    /* loaded from: classes3.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC19060k abstractC19060k) {
            this();
        }
    }

    /* renamed from: a */
    public final Drawable m17522a(boolean z11) {
        return z11 ? this.f14627d : this.f14628e;
    }

    /* renamed from: b */
    public final boolean m17523b() {
        return this.f14626c;
    }

    /* renamed from: c */
    public final String m17524c() {
        return this.f14625b;
    }

    /* renamed from: d */
    public final String m17525d() {
        return this.f14624a;
    }

    /* renamed from: e */
    public final void m17526e(Drawable drawable) {
        this.f14627d = drawable;
    }

    /* renamed from: f */
    public final void m17527f(Drawable drawable) {
        this.f14628e = drawable;
    }

    /* renamed from: g */
    public final void m17528g(boolean z11) {
        this.f14626c = z11;
    }

    /* renamed from: h */
    public final void m17529h(String str) {
        this.f14625b = str;
    }

    /* renamed from: i */
    public final void m17530i(String str) {
        this.f14624a = str;
    }
}
