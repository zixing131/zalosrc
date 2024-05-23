package c30;

import android.text.TextUtils;
import fi.C18953k;
import g30.C19216b;
import gi.EnumC19450c;
import p268ji.C21270p;
import p683yj.C30997b;
import p716zh.C31917f9;
import p716zh.C31919fb;
import v30.C27517h;

/* renamed from: c30.f */
/* loaded from: classes5.dex */
public class C3239f extends Thread {

    /* renamed from: p */
    private final String f13834p;

    /* renamed from: q */
    private final a f13835q;

    /* renamed from: r */
    private final C27517h f13836r;

    /* renamed from: s */
    private final C18953k f13837s;

    /* renamed from: t */
    private final boolean f13838t;

    /* renamed from: u */
    private final C30997b.c f13839u;

    /* renamed from: c30.f$a */
    /* loaded from: classes5.dex */
    public interface a {
        /* renamed from: a */
        void mo16450a(EnumC19450c enumC19450c, C31917f9 c31917f9, C31919fb c31919fb, C19216b c19216b);
    }

    public C3239f(C27517h c27517h, C18953k c18953k, String str, boolean z11, C30997b.c cVar, a aVar) {
        super("Z:GetSuggestTopicTask");
        this.f13834p = str;
        this.f13835q = aVar;
        this.f13836r = c27517h;
        this.f13837s = c18953k;
        this.f13838t = z11;
        this.f13839u = cVar;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public void run() {
        C19216b c19216b = new C19216b();
        C31919fb m99406m0 = this.f13837s.m99406m0(this.f13836r.m140704K(this.f13834p, c19216b));
        if (m99406m0 != null && m99406m0.m150665i()) {
            c19216b.m100858q(m99406m0.m150664h());
            this.f13837s.m99401d0(EnumC19450c.f96562y, m99406m0, this.f13838t, this.f13839u, this.f13835q, c19216b);
        } else if (!TextUtils.isEmpty(c19216b.m100848g())) {
            C31919fb m99406m02 = this.f13837s.m99406m0(c19216b.m100848g());
            if (m99406m02 != null) {
                c19216b.m100858q(m99406m02.m150664h());
            }
            C21270p.m110079C().m110148T(c19216b);
        }
    }
}
