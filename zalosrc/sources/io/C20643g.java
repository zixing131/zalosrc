package io;

import fn0.AbstractC19060k;
import fn0.AbstractC19074t;

/* renamed from: io.g */
/* loaded from: classes4.dex */
public final class C20643g extends AbstractC20641e {
    public static final a Companion = new a(null);

    /* renamed from: d */
    private String f101567d;

    /* renamed from: io.g$a */
    /* loaded from: classes4.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC19060k abstractC19060k) {
            this();
        }

        /* renamed from: a */
        public final C20643g m107585a(int i11, int i12, String str) {
            AbstractC19074t.m100208f(str, "title");
            return new C20643g(i11).m107583d(i12, str);
        }
    }

    public C20643g(int i11) {
        super(i11);
        this.f101567d = "";
    }

    /* renamed from: d */
    public final C20643g m107583d(int i11, String str) {
        AbstractC19074t.m100208f(str, "title");
        m107580c(i11);
        this.f101567d = str;
        return this;
    }

    /* renamed from: e */
    public final String m107584e() {
        return this.f101567d;
    }
}
