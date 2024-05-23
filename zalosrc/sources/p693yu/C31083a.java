package p693yu;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import java.util.HashMap;
import java.util.Map;
import p189gv.C19602a;
import p363nh.C23744a;

/* renamed from: yu.a */
/* loaded from: classes4.dex */
public final class C31083a {
    public static final a Companion = new a(null);

    /* renamed from: a */
    private final InterfaceC31084b f143286a;

    /* renamed from: b */
    private Map f143287b;

    /* renamed from: c */
    private final Handler f143288c;

    /* renamed from: yu.a$a */
    /* loaded from: classes4.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC19060k abstractC19060k) {
            this();
        }
    }

    /* renamed from: yu.a$b */
    /* loaded from: classes4.dex */
    public interface b {
        /* renamed from: a */
        void mo81394a();
    }

    /* renamed from: yu.a$c */
    /* loaded from: classes4.dex */
    public static final class c extends Handler {
        c(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            AbstractC19074t.m100208f(message, "msg");
            try {
                int i11 = message.what;
                if (i11 != 0) {
                    if (i11 == 1) {
                        removeMessages(0, message.obj);
                    }
                } else {
                    Object obj = message.obj;
                    AbstractC19074t.m100206d(obj, "null cannot be cast to non-null type com.zing.zalo.libwebview.model.h5.AppEventInfo");
                    b m102578d = ((C19602a) obj).m102578d();
                    if (m102578d != null) {
                        m102578d.mo81394a();
                    }
                }
            } catch (Exception unused) {
            }
        }
    }

    public C31083a(InterfaceC31084b interfaceC31084b) {
        AbstractC19074t.m100208f(interfaceC31084b, "webAppInterfaceListener");
        this.f143286a = interfaceC31084b;
        this.f143287b = new HashMap();
        this.f143288c = new c(Looper.getMainLooper());
    }

    /* renamed from: b */
    public static /* synthetic */ void m151013b(C31083a c31083a, C19602a c19602a, boolean z11, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            z11 = true;
        }
        c31083a.m151014a(c19602a, z11);
    }

    /* renamed from: a */
    public final void m151014a(C19602a c19602a, boolean z11) {
        AbstractC19074t.m100208f(c19602a, "appEventInfo");
        if (z11) {
            this.f143286a.mo151025I(c19602a.m102575a(), c19602a.m102577c(), c19602a.m102576b());
        } else {
            C23744a.Companion.m124119a().m124116d(9009, c19602a);
        }
        if (c19602a.m102578d() != null && c19602a.m102579e() > 0) {
            this.f143287b.put(c19602a.m102575a(), c19602a);
            Message obtainMessage = this.f143288c.obtainMessage(0, c19602a);
            AbstractC19074t.m100207e(obtainMessage, "obtainMessage(...)");
            this.f143288c.sendMessageDelayed(obtainMessage, c19602a.m102579e());
        }
    }

    /* renamed from: c */
    public final void m151015c(String str) {
        AbstractC19074t.m100208f(str, "eventId");
        C19602a c19602a = (C19602a) this.f143287b.get(str);
        if (c19602a != null) {
            Message obtainMessage = this.f143288c.obtainMessage(1, c19602a);
            AbstractC19074t.m100207e(obtainMessage, "obtainMessage(...)");
            this.f143288c.sendMessage(obtainMessage);
        }
    }

    /* renamed from: d */
    public final void m151016d(C19602a c19602a) {
        AbstractC19074t.m100208f(c19602a, "eventInfo");
        if (c19602a.m102578d() != null && c19602a.m102579e() > 0) {
            this.f143287b.put(c19602a.m102575a(), c19602a);
            Message obtainMessage = this.f143288c.obtainMessage(0, c19602a);
            AbstractC19074t.m100207e(obtainMessage, "obtainMessage(...)");
            this.f143288c.sendMessageDelayed(obtainMessage, c19602a.m102579e());
        }
    }
}
