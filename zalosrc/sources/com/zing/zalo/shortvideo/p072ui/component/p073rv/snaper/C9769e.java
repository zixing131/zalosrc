package com.zing.zalo.shortvideo.p072ui.component.p073rv.snaper;

import com.zing.zalo.shortvideo.p072ui.model.Video;
import com.zing.zalo.zmedia.view.C17391z;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import java.util.ArrayList;
import qm0.AbstractC25332a0;
import qm0.AbstractC25378x;

/* renamed from: com.zing.zalo.shortvideo.ui.component.rv.snaper.e */
/* loaded from: classes5.dex */
public final class C9769e {
    public static final a Companion = new a(null);

    /* renamed from: a */
    private String f51316a;

    /* renamed from: b */
    private String f51317b;

    /* renamed from: c */
    private float f51318c;

    /* renamed from: d */
    private long f51319d;

    /* renamed from: e */
    private float f51320e;

    /* renamed from: f */
    private b f51321f;

    /* renamed from: com.zing.zalo.shortvideo.ui.component.rv.snaper.e$a */
    /* loaded from: classes5.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC19060k abstractC19060k) {
            this();
        }

        /* renamed from: a */
        public final C9769e m52769a(Video video) {
            float f11;
            AbstractC19074t.m100208f(video, "video");
            String str = null;
            C9769e c9769e = new C9769e(null);
            c9769e.m52767k(video.m52871V());
            c9769e.m52764h(video.m52887f().m50769l());
            c9769e.m52765i(video.m52847I());
            Float valueOf = Float.valueOf(video.m52875X());
            valueOf.floatValue();
            if (!Boolean.valueOf(!video.m52910r0()).booleanValue()) {
                valueOf = null;
            }
            if (valueOf != null) {
                f11 = valueOf.floatValue();
            } else {
                f11 = 0.0f;
            }
            c9769e.m52768l(f11);
            String m52908q = video.m52908q();
            if (m52908q == null || m52908q.length() <= 0 || AbstractC19074t.m100204b(m52908q, "null")) {
                m52908q = null;
            }
            b bVar = new b(m52908q, null, 2, null);
            String m52906p = video.m52906p();
            if (m52906p != null) {
                if (m52906p.length() > 0 && !AbstractC19074t.m100204b(m52906p, "null")) {
                    str = m52906p;
                }
                if (str != null) {
                    bVar.m52771b().add(str);
                }
            }
            c9769e.m52766j(bVar);
            return c9769e;
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.component.rv.snaper.e$b */
    /* loaded from: classes5.dex */
    public static final class b {

        /* renamed from: a */
        private String f51322a;

        /* renamed from: b */
        private ArrayList f51323b;

        public b(String str, ArrayList arrayList) {
            AbstractC19074t.m100208f(arrayList, "lstSource");
            this.f51322a = str;
            this.f51323b = arrayList;
        }

        /* renamed from: a */
        public final String m52770a() {
            return this.f51322a;
        }

        /* renamed from: b */
        public final ArrayList m52771b() {
            return this.f51323b;
        }

        /* renamed from: c */
        public final void m52772c(String str) {
            this.f51322a = str;
        }

        public /* synthetic */ b(String str, ArrayList arrayList, int i11, AbstractC19060k abstractC19060k) {
            this((i11 & 1) != 0 ? null : str, (i11 & 2) != 0 ? new ArrayList() : arrayList);
        }
    }

    public /* synthetic */ C9769e(AbstractC19060k abstractC19060k) {
        this();
    }

    /* renamed from: a */
    public final long m52757a() {
        return this.f51319d;
    }

    /* renamed from: b */
    public final float m52758b() {
        return this.f51318c;
    }

    /* renamed from: c */
    public final C17391z m52759c() {
        Object m131206f0;
        String str;
        String str2;
        String str3 = this.f51316a;
        m131206f0 = AbstractC25332a0.m131206f0(this.f51321f.m52771b());
        String str4 = (String) m131206f0;
        if (str4 == null) {
            str = "";
        } else {
            str = str4;
        }
        String m52770a = this.f51321f.m52770a();
        if (m52770a == null) {
            str2 = "";
        } else {
            str2 = m52770a;
        }
        return new C17391z(str3, "", str, str2, "", 0, false, 9, this.f51318c, 6, null, this.f51317b, 0);
    }

    /* renamed from: d */
    public final String m52760d() {
        return this.f51316a;
    }

    /* renamed from: e */
    public final float m52761e() {
        return this.f51320e;
    }

    /* renamed from: f */
    public final boolean m52762f() {
        if (this.f51321f.m52770a() != null || (!this.f51321f.m52771b().isEmpty())) {
            return true;
        }
        return false;
    }

    /* renamed from: g */
    public final void m52763g() {
        Object m131544F;
        if (this.f51321f.m52770a() == null) {
            m131544F = AbstractC25378x.m131544F(this.f51321f.m52771b());
        } else {
            this.f51321f.m52772c(null);
        }
    }

    /* renamed from: h */
    public final void m52764h(String str) {
        AbstractC19074t.m100208f(str, "<set-?>");
        this.f51317b = str;
    }

    /* renamed from: i */
    public final void m52765i(float f11) {
        this.f51318c = f11;
    }

    /* renamed from: j */
    public final void m52766j(b bVar) {
        AbstractC19074t.m100208f(bVar, "<set-?>");
        this.f51321f = bVar;
    }

    /* renamed from: k */
    public final void m52767k(String str) {
        AbstractC19074t.m100208f(str, "<set-?>");
        this.f51316a = str;
    }

    /* renamed from: l */
    public final void m52768l(float f11) {
        this.f51320e = f11;
    }

    private C9769e() {
        this.f51316a = "";
        this.f51317b = "";
        this.f51318c = 1.0f;
        this.f51320e = 1.0f;
        this.f51321f = new b(null, null, 3, null);
    }
}
