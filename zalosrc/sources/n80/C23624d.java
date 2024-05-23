package n80;

import android.content.Context;
import bi0.AbstractC2814h;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.uidrawing.C16716d;
import com.zing.zalo.uidrawing.C16718f;
import com.zing.zalo.zdesign.component.C17023o;
import fn0.AbstractC19074t;
import hd0.C20005c;
import me0.AbstractC23136l9;

/* renamed from: n80.d */
/* loaded from: classes6.dex */
public final class C23624d extends C16716d {

    /* renamed from: M0 */
    private final C17023o f114496M0;

    /* renamed from: N0 */
    private final C17023o f114497N0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C23624d(Context context) {
        super(context);
        AbstractC19074t.m100208f(context, "context");
        int m118712h = AbstractC23136l9.m118712h(context, 6.0f);
        int m118712h2 = AbstractC23136l9.m118712h(context, 16.0f);
        int m118712h3 = AbstractC23136l9.m118712h(context, 40.0f);
        C20005c c20005c = new C20005c(0.5f, 0.0f);
        C17023o c17023o = new C17023o(context, AbstractC2814h.ButtonMedium_SecondaryNeutral);
        c17023o.m91114u1(AbstractC8020f0.str_cancel);
        C16718f m89052g0 = c17023o.m89106L().m89028L(0, m118712h3).m89052g0(c20005c);
        Boolean bool = Boolean.TRUE;
        m89052g0.m89073z(bool).m89032P(m118712h2, m118712h2, m118712h, m118712h2);
        this.f114497N0 = c17023o;
        C17023o c17023o2 = new C17023o(context, AbstractC2814h.ButtonMedium_Primary);
        c17023o2.m91114u1(AbstractC8020f0.str_mini_dialog_connect_wifi_button);
        c17023o2.m89106L().m89028L(0, m118712h3).m89058j0(c20005c).m89017A(bool).m89032P(m118712h, m118712h2, m118712h2, m118712h2);
        this.f114496M0 = c17023o2;
        m89001g1(c17023o);
        m89001g1(c17023o2);
        m89106L().m89028L(-1, -2);
    }

    /* renamed from: o1 */
    public final C17023o m123842o1() {
        return this.f114496M0;
    }

    /* renamed from: p1 */
    public final C17023o m123843p1() {
        return this.f114497N0;
    }
}
