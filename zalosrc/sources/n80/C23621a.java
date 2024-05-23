package n80;

import android.content.Context;
import android.text.TextUtils;
import bi0.AbstractC2807a;
import bi0.AbstractC2808b;
import com.zing.zalo.AbstractC16803z;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.uidrawing.C16716d;
import fn0.AbstractC19074t;
import kd0.C21693c;
import kd0.C21697g;
import l80.C22126c0;
import me0.AbstractC23136l9;
import me0.C23212s8;
import mj0.AbstractC23322a;
import ui0.C27280g;

/* renamed from: n80.a */
/* loaded from: classes6.dex */
public final class C23621a extends C16716d {

    /* renamed from: M0 */
    private final C21697g f114489M0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C23621a(Context context) {
        super(context);
        AbstractC19074t.m100208f(context, "context");
        int m118712h = AbstractC23136l9.m118712h(context, 16.0f);
        int m118712h2 = AbstractC23136l9.m118712h(context, 24.0f);
        C16716d c16716d = new C16716d(context);
        c16716d.m89087B0(AbstractC16803z.scan_qr_text_result_background);
        c16716d.m89106L().m89032P(m118712h, m118712h, m118712h, AbstractC23136l9.m118712h(context, 6.0f)).m89028L(-1, -2);
        m89001g1(c16716d);
        C21693c c21693c = new C21693c(context);
        c21693c.mo111925v1(C27280g.m139659b(context, AbstractC23322a.zds_ic_wifi_line_24, AbstractC2808b.f150821b60));
        c21693c.m89106L().m89028L(m118712h2, m118712h2).m89027K(true).m89032P(m118712h, m118712h2, 0, m118712h2);
        c16716d.m89001g1(c21693c);
        C22126c0 c22126c0 = new C22126c0(context);
        c22126c0.m111962J1(C23212s8.m119606n(AbstractC2807a.text_01));
        c22126c0.mo111964L1(m118712h);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        c22126c0.m111980v1(truncateAt);
        c22126c0.m89106L().m89028L(-1, -2).m89027K(true).m89032P(m118712h + m118712h2 + m118712h, m118712h2, m118712h2, m118712h2);
        c16716d.m89001g1(c22126c0);
        this.f114489M0 = c22126c0;
        C16716d c16716d2 = new C16716d(context);
        c16716d2.m89106L().m89028L(-1, -2).m89032P(m118712h, AbstractC23136l9.m118712h(context, 6.0f), m118712h, m118712h).m89023G(c16716d);
        m89001g1(c16716d2);
        C21693c c21693c2 = new C21693c(context);
        c21693c2.mo111925v1(C27280g.m139660c(context, AbstractC23322a.zds_ic_exclamation_solid_16, AbstractC2807a.icon_04));
        c21693c2.m89087B0(AbstractC16803z.scan_qr_background_support_warning);
        c21693c2.m89106L().m89028L(m118712h, m118712h).m89027K(true);
        c16716d2.m89001g1(c21693c2);
        C22126c0 c22126c02 = new C22126c0(context);
        c22126c02.m111958F1(AbstractC8020f0.str_mini_dialog_connect_wifi_content);
        c22126c02.m111962J1(C23212s8.m119606n(AbstractC2807a.text_02));
        c22126c02.mo111964L1(AbstractC23136l9.m118712h(context, 13.0f));
        c22126c02.m111980v1(truncateAt);
        c22126c02.m89106L().m89028L(-1, -2).m89027K(true).m89034R(AbstractC23136l9.m118712h(context, 28.0f));
        c16716d2.m89001g1(c22126c02);
        m89106L().m89028L(-1, -2);
    }

    /* renamed from: o1 */
    public final C21697g m123836o1() {
        return this.f114489M0;
    }
}
