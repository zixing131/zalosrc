package io;

import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import is.AbstractC20809n;
import me0.AbstractC23136l9;

/* renamed from: io.d */
/* loaded from: classes4.dex */
public final class C20640d extends AbstractC20641e {
    public static final a Companion = new a(null);

    /* renamed from: d */
    private int f101555d;

    /* renamed from: e */
    private Drawable f101556e;

    /* renamed from: f */
    private String f101557f;

    /* renamed from: g */
    private String f101558g;

    /* renamed from: h */
    private boolean f101559h;

    /* renamed from: i */
    private int f101560i;

    /* renamed from: io.d$a */
    /* loaded from: classes4.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC19060k abstractC19060k) {
            this();
        }

        /* renamed from: a */
        public final C20640d m107577a(int i11, int i12, int i13, String str, String str2, boolean z11, Drawable drawable) {
            AbstractC19074t.m100208f(str, "title");
            AbstractC19074t.m100208f(str2, "des");
            return new C20640d(i11).m107570d(i12, i13, str, str2, z11, drawable);
        }
    }

    public C20640d(int i11) {
        super(i11);
        this.f101557f = "";
        this.f101558g = "";
        this.f101560i = 1;
    }

    /* renamed from: d */
    public final C20640d m107570d(int i11, int i12, String str, String str2, boolean z11, Drawable drawable) {
        AbstractC19074t.m100208f(str, "title");
        AbstractC19074t.m100208f(str2, "des");
        m107580c(i11);
        this.f101555d = i12;
        this.f101557f = str;
        this.f101556e = drawable;
        if (!TextUtils.isEmpty(str)) {
            if (AbstractC20809n.m108560C(str, 15, 2, (AbstractC23136l9.m118722k0() - AbstractC23136l9.m118742r(56.0f)) - AbstractC23136l9.m118742r(72.0f)) > 1) {
                this.f101560i = 2;
            } else {
                this.f101560i = 1;
            }
        } else {
            this.f101560i = 1;
        }
        this.f101558g = str2;
        this.f101559h = z11;
        return this;
    }

    /* renamed from: e */
    public final int m107571e() {
        return this.f101560i;
    }

    /* renamed from: f */
    public final String m107572f() {
        return this.f101558g;
    }

    /* renamed from: g */
    public final int m107573g() {
        return this.f101555d;
    }

    /* renamed from: h */
    public final Drawable m107574h() {
        return this.f101556e;
    }

    /* renamed from: i */
    public final String m107575i() {
        return this.f101557f;
    }

    /* renamed from: j */
    public final boolean m107576j() {
        return this.f101559h;
    }
}
