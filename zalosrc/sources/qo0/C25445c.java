package qo0;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.zing.zalocore.CoreUtility;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import ho0.AbstractC20110a;
import p659xv.C30211j;

/* renamed from: qo0.c */
/* loaded from: classes.dex */
public final class C25445c implements Handler.Callback {

    /* renamed from: u */
    public static final a f121847u = new a(null);

    /* renamed from: v */
    private static final String f121848v = "MPFeatureDownloadScheduler";

    /* renamed from: p */
    private final C30211j f121849p;

    /* renamed from: q */
    private final C25448h f121850q;

    /* renamed from: r */
    private boolean f121851r;

    /* renamed from: s */
    private volatile boolean f121852s;

    /* renamed from: t */
    private final Handler f121853t;

    /* renamed from: qo0.c$a */
    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC19060k abstractC19060k) {
            this();
        }
    }

    public C25445c(C30211j c30211j, C25448h c25448h) {
        AbstractC19074t.m100208f(c30211j, "downloader");
        AbstractC19074t.m100208f(c25448h, "videoCallFilterConfigGlobal");
        this.f121849p = c30211j;
        this.f121850q = c25448h;
        this.f121851r = true;
        this.f121853t = new Handler(Looper.getMainLooper(), this);
    }

    /* renamed from: b */
    private final void m131793b() {
        if (this.f121852s) {
            AbstractC20110a.f98889a.m104564x(f121848v).mo104554k("App still on foreground after 60 (s)", new Object[0]);
            Context appContext = CoreUtility.getAppContext();
            C30211j c30211j = this.f121849p;
            AbstractC19074t.m100205c(appContext);
            c30211j.m148994c(appContext, true);
        }
    }

    /* renamed from: a */
    public final void m131794a() {
        if (this.f121853t.hasMessages(1)) {
            AbstractC20110a.f98889a.m104564x(f121848v).mo104554k("Removing pending download task", new Object[0]);
            this.f121853t.removeMessages(1);
        } else if (this.f121851r) {
            AbstractC20110a.f98889a.m104564x(f121848v).mo104554k("Cancel future request download", new Object[0]);
            this.f121853t.sendEmptyMessage(2);
        } else {
            this.f121849p.m148993b();
        }
    }

    /* renamed from: c */
    public final void m131795c() {
        this.f121852s = true;
        if (this.f121851r) {
            if (this.f121853t.hasMessages(2)) {
                this.f121853t.removeMessages(2);
            } else {
                AbstractC20110a.f98889a.m104564x(f121848v).mo104554k("Trigger download after 60 (s)", new Object[0]);
                this.f121853t.sendEmptyMessageDelayed(1, 60000L);
            }
        }
        this.f121851r = false;
    }

    /* renamed from: d */
    public final void m131796d() {
        this.f121852s = false;
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        AbstractC19074t.m100208f(message, "msg");
        if (message.what != 1) {
            return false;
        }
        m131793b();
        return true;
    }
}
