package com.zing.zalo.shortvideo.p072ui.component.p073rv.snaper;

import com.zing.zalo.shortvideo.data.model.LivestreamData;
import com.zing.zalo.zmedia.view.C17391z;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;

/* renamed from: com.zing.zalo.shortvideo.ui.component.rv.snaper.b */
/* loaded from: classes5.dex */
public final class C9766b {
    public static final a Companion = new a(null);

    /* renamed from: a */
    private String f51257a;

    /* renamed from: b */
    private String f51258b;

    /* renamed from: c */
    private float f51259c;

    /* renamed from: d */
    private long f51260d;

    /* renamed from: e */
    private float f51261e;

    /* renamed from: f */
    private b f51262f;

    /* renamed from: com.zing.zalo.shortvideo.ui.component.rv.snaper.b$a */
    /* loaded from: classes5.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC19060k abstractC19060k) {
            this();
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v0, types: [fn0.k] */
        /* JADX WARN: Type inference failed for: r1v2 */
        /* JADX WARN: Type inference failed for: r1v3 */
        /* JADX WARN: Type inference failed for: r1v4 */
        /* renamed from: a */
        public final C9766b m52674a(LivestreamData livestreamData) {
            AbstractC19074t.m100208f(livestreamData, "livestreamData");
            String str = 0;
            str = 0;
            str = 0;
            C9766b c9766b = new C9766b(str);
            c9766b.m52672h(livestreamData.m51016f());
            c9766b.m52669e(livestreamData.m51010b().m50769l());
            c9766b.m52670f(livestreamData.m51022j());
            c9766b.m52673i(livestreamData.m51033x());
            String m51030t = livestreamData.m51030t();
            if (m51030t != null && m51030t.length() > 0 && !AbstractC19074t.m100204b(m51030t, "null")) {
                str = m51030t;
            }
            c9766b.m52671g(new b(str));
            return c9766b;
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.component.rv.snaper.b$b */
    /* loaded from: classes5.dex */
    public static final class b {

        /* renamed from: a */
        private String f51263a;

        public b(String str) {
            this.f51263a = str;
        }

        /* renamed from: a */
        public final String m52675a() {
            return this.f51263a;
        }

        public /* synthetic */ b(String str, int i11, AbstractC19060k abstractC19060k) {
            this((i11 & 1) != 0 ? null : str);
        }
    }

    public /* synthetic */ C9766b(AbstractC19060k abstractC19060k) {
        this();
    }

    /* renamed from: a */
    public final long m52665a() {
        return this.f51260d;
    }

    /* renamed from: b */
    public final float m52666b() {
        return this.f51259c;
    }

    /* renamed from: c */
    public final C17391z m52667c() {
        String str = this.f51257a;
        String m52675a = this.f51262f.m52675a();
        if (m52675a == null) {
            m52675a = "";
        }
        return new C17391z(str, "", "", m52675a, "", 0, false, 9, this.f51259c, 6, null, this.f51258b, 0);
    }

    /* renamed from: d */
    public final float m52668d() {
        return this.f51261e;
    }

    /* renamed from: e */
    public final void m52669e(String str) {
        AbstractC19074t.m100208f(str, "<set-?>");
        this.f51258b = str;
    }

    /* renamed from: f */
    public final void m52670f(float f11) {
        this.f51259c = f11;
    }

    /* renamed from: g */
    public final void m52671g(b bVar) {
        AbstractC19074t.m100208f(bVar, "<set-?>");
        this.f51262f = bVar;
    }

    /* renamed from: h */
    public final void m52672h(String str) {
        AbstractC19074t.m100208f(str, "<set-?>");
        this.f51257a = str;
    }

    /* renamed from: i */
    public final void m52673i(float f11) {
        this.f51261e = f11;
    }

    private C9766b() {
        this.f51257a = "";
        this.f51258b = "";
        this.f51259c = 1.0f;
        this.f51261e = 1.0f;
        this.f51262f = new b(null, 1, 0 == true ? 1 : 0);
    }
}
