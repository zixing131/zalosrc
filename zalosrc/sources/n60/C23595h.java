package n60;

import com.zing.zalo.p077ui.chat.ChatView;
import com.zing.zalo.zview.ZaloView;
import fn0.AbstractC19074t;
import java.util.ArrayList;
import mw.C23459d;
import p279jw.C21373a;

/* renamed from: n60.h */
/* loaded from: classes5.dex */
public final class C23595h {

    /* renamed from: a */
    public static final C23595h f114432a = new C23595h();

    private C23595h() {
    }

    /* renamed from: a */
    public final void m123707a(ZaloView zaloView) {
        AbstractC19074t.m100208f(zaloView, "zaloView");
        C21373a c21373a = C21373a.f104231a;
        if (!c21373a.m110807w().m110825b()) {
            if (c21373a.m110809z()) {
                C23459d.m123162l(C23459d.f113954a, zaloView, new ArrayList(), "", "snackbar_savedmsg", false, 16, null);
                if (zaloView instanceof ChatView) {
                    c21373a.m110786I(c21373a.m110809z());
                    ChatView chatView = (ChatView) zaloView;
                    if (chatView.mo59748Na()) {
                        chatView.m60020gQ().mo60816v5("tip.mycloud.attachment.flow4.step2");
                        return;
                    } else {
                        chatView.m60020gQ().mo60816v5("tip.mycloud.attachment.flow4.step1");
                        return;
                    }
                }
                return;
            }
            C23459d.m123162l(C23459d.f113954a, zaloView, new ArrayList(), "", "snackbar_savedmsg", false, 16, null);
        }
    }
}
