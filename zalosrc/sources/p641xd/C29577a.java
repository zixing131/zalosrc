package p641xd;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import fn0.AbstractC19074t;
import nh0.C23793c;

/* renamed from: xd.a */
/* loaded from: classes3.dex */
public final class C29577a {

    /* renamed from: a */
    public static final C29577a f136513a = new C29577a();

    /* renamed from: b */
    private static final a f136514b = new a(Looper.getMainLooper());

    /* renamed from: xd.a$a */
    /* loaded from: classes3.dex */
    public static final class a extends Handler {
        a(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            AbstractC19074t.m100208f(message, "msg");
            if (message.what == 1) {
                Object obj = message.obj;
                AbstractC19074t.m100206d(obj, "null cannot be cast to non-null type kotlin.String");
                String str = (String) obj;
                C29583g c29583g = C29583g.f136521a;
                if (!c29583g.m146999m(str)) {
                    c29583g.m146996g(str);
                }
            }
            super.handleMessage(message);
        }
    }

    private C29577a() {
    }

    /* renamed from: a */
    public final void m146983a(C29578b c29578b) {
        AbstractC19074t.m100208f(c29578b, "blockInfo");
        if (c29578b.m146984a() == 0) {
            a aVar = f136514b;
            aVar.removeMessages(1);
            aVar.sendMessageDelayed(aVar.obtainMessage(1, c29578b.m146985b()), (c29578b.m146986c() - C23793c.Companion.m124321a().mo124310e()) + 1000);
        }
    }
}
