package np;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import bf0.C2793a;
import fn0.AbstractC19074t;
import ho0.AbstractC20110a;
import p456qp.C25462n;

/* renamed from: np.c */
/* loaded from: classes4.dex */
public final class C23924c implements InterfaceC23925d {

    /* renamed from: b */
    private static boolean f115591b;

    /* renamed from: c */
    private static int f115592c;

    /* renamed from: a */
    public static final C23924c f115590a = new C23924c();

    /* renamed from: d */
    private static final a f115593d = new a(C2793a.f11144a.m13457b());

    /* renamed from: np.c$a */
    /* loaded from: classes4.dex */
    public static final class a extends Handler {
        a(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            AbstractC19074t.m100208f(message, "msg");
            super.handleMessage(message);
            if (message.what == 1) {
                C23924c.f115592c += 100;
                C23924c.f115590a.m125048g();
            }
        }
    }

    private C23924c() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: g */
    public final void m125048g() {
        try {
            if (!f115591b) {
                return;
            }
            int i11 = f115592c;
            if (i11 > 2000) {
                f115593d.removeMessages(1);
                f115592c = 0;
                new C25462n().m101508a(new C25462n.a(0.0f));
            } else {
                new C25462n().m101508a(new C25462n.a(1.0f - ((i11 * 1.0f) / ((float) 2000))));
                f115593d.sendEmptyMessageDelayed(1, 100L);
            }
        } catch (Exception e11) {
            AbstractC20110a.f98889a.mo104552e(e11);
        }
    }

    @Override // np.InterfaceC23925d
    /* renamed from: a */
    public void mo125049a() {
        f115591b = true;
        m125048g();
    }

    @Override // np.InterfaceC23925d
    /* renamed from: b */
    public void mo125050b(float f11) {
        new C25462n().m101508a(new C25462n.a(f11));
    }

    @Override // np.InterfaceC23925d
    /* renamed from: c */
    public void mo125051c() {
        f115593d.removeMessages(1);
        f115592c = 0;
        f115591b = false;
    }
}
