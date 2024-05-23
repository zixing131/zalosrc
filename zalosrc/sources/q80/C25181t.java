package q80;

import android.content.Context;
import android.graphics.PorterDuff;
import android.text.Layout;
import bi0.AbstractC2807a;
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
import p262jb.AbstractC21196a;

/* renamed from: q80.t */
/* loaded from: classes6.dex */
public final class C25181t extends C16716d {

    /* renamed from: M0 */
    private final C21697g f120807M0;

    /* renamed from: N0 */
    private final C21693c f120808N0;

    /* renamed from: O0 */
    private final C16716d f120809O0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C25181t(Context context) {
        super(context);
        AbstractC19074t.m100208f(context, "context");
        C22126c0 c22126c0 = new C22126c0(context);
        this.f120807M0 = c22126c0;
        c22126c0.mo111965M1(1);
        c22126c0.mo111964L1(AbstractC23136l9.m118742r(15.0f));
        c22126c0.m111961I1(Layout.Alignment.ALIGN_CENTER);
        c22126c0.m111959G1(AbstractC23136l9.m118743r0(AbstractC8020f0.btn_see_more));
        c22126c0.m111962J1(C23212s8.m119607o(context, AbstractC21196a.TextColor1));
        c22126c0.m89106L().m89028L(-2, -2).m89027K(true);
        C21693c c21693c = new C21693c(context);
        this.f120808N0 = c21693c;
        c21693c.mo111926w1(AbstractC23322a.zds_ic_chevron_right_line_16);
        c21693c.m111922s1(C23212s8.m119607o(context, AbstractC2807a.icon_01), PorterDuff.Mode.SRC_IN);
        c21693c.m89106L().m89028L(AbstractC23136l9.m118742r(16.0f), 0).m89022F(1.0f).m89034R(AbstractC23136l9.m118742r(8.0f)).m89027K(true).m89054h0(c22126c0);
        C16716d c16716d = new C16716d(context);
        this.f120809O0 = c16716d;
        c16716d.m89001g1(c22126c0);
        c16716d.m89001g1(c21693c);
        c16716d.m89106L().m89028L(-2, -2).m89025I(true);
        m89001g1(c16716d);
        m89106L().m89028L(-1, AbstractC23136l9.m118742r(40.0f));
        m89087B0(AbstractC16803z.search_global_bg_rect_white_with_press_state);
    }

    /* renamed from: o1 */
    public final C21693c m130340o1() {
        return this.f120808N0;
    }
}
