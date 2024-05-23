package io;

import ac.C0708i;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import is.AbstractC20809n;
import me0.AbstractC23136l9;

/* renamed from: io.c */
/* loaded from: classes4.dex */
public final class C20639c extends AbstractC20641e {
    public static final a Companion = new a(null);

    /* renamed from: d */
    private int f101547d;

    /* renamed from: e */
    private Drawable f101548e;

    /* renamed from: f */
    private String f101549f;

    /* renamed from: g */
    private String f101550g;

    /* renamed from: h */
    private int f101551h;

    /* renamed from: i */
    private boolean f101552i;

    /* renamed from: j */
    private String f101553j;

    /* renamed from: k */
    private C0708i f101554k;

    /* renamed from: io.c$a */
    /* loaded from: classes4.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC19060k abstractC19060k) {
            this();
        }

        /* renamed from: b */
        public static /* synthetic */ C20639c m107568b(a aVar, int i11, int i12, int i13, String str, String str2, boolean z11, Drawable drawable, String str3, C0708i c0708i, int i14, Object obj) {
            String str4;
            boolean z12;
            Drawable drawable2;
            String str5;
            C0708i c0708i2;
            if ((i14 & 16) != 0) {
                str4 = "";
            } else {
                str4 = str2;
            }
            if ((i14 & 32) != 0) {
                z12 = false;
            } else {
                z12 = z11;
            }
            if ((i14 & 64) != 0) {
                drawable2 = null;
            } else {
                drawable2 = drawable;
            }
            if ((i14 & 128) != 0) {
                str5 = "";
            } else {
                str5 = str3;
            }
            if ((i14 & 256) != 0) {
                c0708i2 = new C0708i();
            } else {
                c0708i2 = c0708i;
            }
            return aVar.m107569a(i11, i12, i13, str, str4, z12, drawable2, str5, c0708i2);
        }

        /* renamed from: a */
        public final C20639c m107569a(int i11, int i12, int i13, String str, String str2, boolean z11, Drawable drawable, String str3, C0708i c0708i) {
            AbstractC19074t.m100208f(str, "title");
            AbstractC19074t.m100208f(str2, "des");
            AbstractC19074t.m100208f(str3, "idTracking");
            AbstractC19074t.m100208f(c0708i, "extraDataObject");
            return new C20639c(i11).m107559d(i12, i13, str, str2, z11, drawable, str3, c0708i);
        }
    }

    public C20639c(int i11) {
        super(i11);
        this.f101549f = "";
        this.f101550g = "";
        this.f101553j = "";
        this.f101554k = new C0708i();
    }

    /* renamed from: d */
    public final C20639c m107559d(int i11, int i12, String str, String str2, boolean z11, Drawable drawable, String str3, C0708i c0708i) {
        AbstractC19074t.m100208f(str, "title");
        AbstractC19074t.m100208f(str2, "des");
        AbstractC19074t.m100208f(str3, "idTracking");
        AbstractC19074t.m100208f(c0708i, "extraDataObject");
        m107580c(i11);
        this.f101547d = i12;
        this.f101548e = drawable;
        this.f101549f = str;
        this.f101550g = str2;
        if (!TextUtils.isEmpty(str2)) {
            if (AbstractC20809n.m108560C(str2, 14, 2, (AbstractC23136l9.m118722k0() - AbstractC23136l9.m118742r(56.0f)) - AbstractC23136l9.m118742r(16.0f)) > 1) {
                this.f101551h = 1;
            } else {
                this.f101551h = 0;
            }
        } else {
            this.f101551h = 2;
        }
        this.f101552i = z11;
        this.f101553j = str3;
        this.f101554k = c0708i;
        return this;
    }

    /* renamed from: e */
    public final int m107560e() {
        return this.f101551h;
    }

    /* renamed from: f */
    public final String m107561f() {
        return this.f101550g;
    }

    /* renamed from: g */
    public final boolean m107562g() {
        return this.f101552i;
    }

    /* renamed from: h */
    public final C0708i m107563h() {
        return this.f101554k;
    }

    /* renamed from: i */
    public final int m107564i() {
        return this.f101547d;
    }

    /* renamed from: j */
    public final Drawable m107565j() {
        return this.f101548e;
    }

    /* renamed from: k */
    public final String m107566k() {
        return this.f101553j;
    }

    /* renamed from: l */
    public final String m107567l() {
        return this.f101549f;
    }
}
