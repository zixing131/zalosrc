package qf0;

import android.webkit.URLUtil;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import kotlinx.coroutines.CoroutineScope;
import lf0.C22472b;
import lf0.InterfaceC22471a;
import xf0.C29620a;

/* renamed from: qf0.c */
/* loaded from: classes5.dex */
public final class C25256c implements InterfaceC22471a {
    public static final a Companion = new a(null);

    /* renamed from: a */
    private final C22472b f121126a;

    /* renamed from: b */
    private final CoroutineScope f121127b;

    /* renamed from: c */
    private final C29620a f121128c;

    /* renamed from: d */
    private final String f121129d;

    /* renamed from: e */
    private final long f121130e;

    /* renamed from: f */
    private final String f121131f;

    /* renamed from: qf0.c$a */
    /* loaded from: classes5.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC19060k abstractC19060k) {
            this();
        }
    }

    public C25256c(C22472b c22472b, CoroutineScope coroutineScope, C29620a c29620a, String str, long j11) {
        AbstractC19074t.m100208f(c22472b, "lfsManager");
        AbstractC19074t.m100208f(coroutineScope, "uiScope");
        AbstractC19074t.m100208f(c29620a, "downloadFileHelper");
        AbstractC19074t.m100208f(str, "pathFromH5");
        this.f121126a = c22472b;
        this.f121127b = coroutineScope;
        this.f121128c = c29620a;
        this.f121129d = str;
        this.f121130e = j11;
        this.f121131f = C25256c.class.getSimpleName();
    }

    @Override // lf0.InterfaceC22471a
    /* renamed from: d */
    public void mo116169d() {
        if (URLUtil.isHttpUrl(this.f121129d)) {
            this.f121126a.m116196u(-302, "Http URL is not supported, use a https URL");
            this.f121126a.m116198y(this.f121131f + ": Http URL [" + this.f121129d + "] is not supported");
            return;
        }
        if (URLUtil.isHttpsUrl(this.f121129d)) {
            new C25257d(this.f121126a, this.f121130e, this.f121128c, this.f121127b, this.f121129d).mo116169d();
            return;
        }
        if (this.f121126a.m116186f(this.f121129d)) {
            new C25255b(this.f121126a, this.f121130e, this.f121129d).mo116169d();
            return;
        }
        this.f121126a.m116196u(-302, "Invalid path. Make sure the path is a https url or a MA cache path");
        this.f121126a.m116198y(this.f121131f + ": error code = -302: path from H5 = " + this.f121129d);
    }
}
