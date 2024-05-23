package n80;

import android.content.Context;
import bi0.AbstractC2814h;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.uidrawing.C16716d;
import com.zing.zalo.zdesign.component.C17023o;
import com.zing.zalo.zdesign.component.EnumC17020n;
import fn0.AbstractC19074t;
import me0.AbstractC23136l9;
import mj0.AbstractC23322a;

/* renamed from: n80.c */
/* loaded from: classes6.dex */
public final class C23623c extends C16716d {

    /* renamed from: M0 */
    private final C17023o f114494M0;

    /* renamed from: N0 */
    private final C17023o f114495N0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C23623c(Context context) {
        super(context);
        AbstractC19074t.m100208f(context, "context");
        int m118712h = AbstractC23136l9.m118712h(context, 16.0f);
        int m118712h2 = AbstractC23136l9.m118712h(context, 40.0f);
        C17023o c17023o = new C17023o(context, AbstractC2814h.ButtonMedium_Primary);
        c17023o.m91114u1(AbstractC8020f0.str_qr_noti_content_cta);
        c17023o.m91113t1(EnumC17020n.LEADING);
        c17023o.m89106L().m89028L(-1, m118712h2).m89035S(AbstractC23136l9.m118712h(context, 56.0f));
        m89001g1(c17023o);
        this.f114494M0 = c17023o;
        C17023o c17023o2 = new C17023o(context, AbstractC2814h.ButtonMedium_SecondaryNeutral);
        c17023o2.m91111q1(AbstractC23322a.zds_ic_more_vertical_line_24);
        c17023o2.m89106L().m89028L(m118712h2, m118712h2).m89017A(Boolean.TRUE);
        m89001g1(c17023o2);
        this.f114495N0 = c17023o2;
        m89106L().m89028L(-1, -2).m89041Y(m118712h);
        m89097G0(-1, -2);
    }

    /* renamed from: o1 */
    public final C17023o m123840o1() {
        return this.f114495N0;
    }

    /* renamed from: p1 */
    public final C17023o m123841p1() {
        return this.f114494M0;
    }
}
