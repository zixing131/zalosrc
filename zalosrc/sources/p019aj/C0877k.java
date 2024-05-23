package p019aj;

import ag0.C0814e0;
import com.zing.zalo.data.entity.chat.message.MessageId;
import dj.C17945a0;
import fn0.AbstractC19074t;
import me0.C23272y6;
import p263jc.C21216s;
import p348mi.AbstractC23306f;

/* renamed from: aj.k */
/* loaded from: classes3.dex */
public final class C0877k {

    /* renamed from: a */
    public static final C0877k f3256a = new C0877k();

    private C0877k() {
    }

    /* renamed from: a */
    public final C17945a0 m2660a(C17945a0 c17945a0) {
        C17945a0 c17945a02;
        AbstractC19074t.m100208f(c17945a0, "originalMsg");
        if (c17945a0.m95043W6()) {
            c17945a02 = C0814e0.m2058d(c17945a0);
        } else if (c17945a0.m95134f8()) {
            C21216s m120652d = AbstractC23306f.m120652d();
            AbstractC19074t.m100207e(m120652d, "provideAutoDownloadMsgResourcesController(...)");
            c17945a02 = m120652d.m109884k0(c17945a0);
        } else {
            c17945a02 = null;
        }
        if (c17945a02 == null) {
            C23272y6 c23272y6 = C23272y6.f112780a;
            MessageId m95029V3 = c17945a0.m95029V3();
            AbstractC19074t.m100207e(m95029V3, "getMessageId(...)");
            c17945a02 = c23272y6.m120054e(m95029V3);
        }
        if (c17945a02 != null) {
            return c17945a02;
        }
        return c17945a0;
    }
}
