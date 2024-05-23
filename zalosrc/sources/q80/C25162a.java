package q80;

import android.content.Context;
import com.zing.zalo.AbstractC16781w;
import com.zing.zalo.AbstractC16803z;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.uidrawing.C16716d;
import com.zing.zalo.uidrawing.C16719g;
import fn0.AbstractC19074t;
import kd0.C21693c;
import l80.C22126c0;
import me0.AbstractC23136l9;
import me0.C23212s8;
import p262jb.AbstractC21196a;

/* renamed from: q80.a */
/* loaded from: classes6.dex */
public final class C25162a extends C16716d {

    /* renamed from: M0 */
    private final a f120735M0;

    /* renamed from: N0 */
    private final a f120736N0;

    /* renamed from: O0 */
    private final C16719g f120737O0;

    /* renamed from: q80.a$a */
    /* loaded from: classes6.dex */
    public static final class a extends C16716d {

        /* renamed from: M0 */
        private final C21693c f120738M0;

        /* renamed from: N0 */
        private final C22126c0 f120739N0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Context context) {
            super(context);
            AbstractC19074t.m100208f(context, "context");
            int m118712h = AbstractC23136l9.m118712h(context, 6.0f);
            int m118712h2 = AbstractC23136l9.m118712h(context, 8.0f);
            int m118712h3 = AbstractC23136l9.m118712h(context, 9.0f);
            int m118712h4 = AbstractC23136l9.m118712h(context, 14.0f);
            int m118712h5 = AbstractC23136l9.m118712h(context, 16.0f);
            C21693c c21693c = new C21693c(context);
            c21693c.m89106L().m89028L(m118712h5, m118712h5).m89034R(m118712h5).m89036T(m118712h3).m89033Q(m118712h3).m89027K(true);
            c21693c.m89087B0(AbstractC16803z.mat_btn_check_3);
            c21693c.mo89091D0(true);
            this.f120738M0 = c21693c;
            C22126c0 c22126c0 = new C22126c0(context);
            c22126c0.m89106L().m89028L(-2, -2).m89054h0(c21693c).m89032P(m118712h2, m118712h2, m118712h5, m118712h2).m89027K(true);
            c22126c0.m111962J1(C23212s8.m119607o(context, AbstractC21196a.TextColor1));
            c22126c0.mo111964L1(m118712h4);
            this.f120739N0 = c22126c0;
            C16716d c16716d = new C16716d(context);
            c16716d.m89106L().m89028L(-2, -1).m89032P(m118712h, m118712h, m118712h, m118712h);
            c16716d.m89001g1(c21693c);
            c16716d.m89001g1(c22126c0);
            c16716d.m89087B0(AbstractC16803z.search_global_bg_filter_with_press_state);
            m89001g1(c16716d);
            m89106L().m89028L(-2, AbstractC23136l9.m118712h(context, 44.0f));
        }

        /* renamed from: o1 */
        public final C21693c m130305o1() {
            return this.f120738M0;
        }

        /* renamed from: p1 */
        public final C22126c0 m130306p1() {
            return this.f120739N0;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C25162a(Context context) {
        super(context);
        AbstractC19074t.m100208f(context, "context");
        int m118712h = AbstractC23136l9.m118712h(context, 10.0f);
        a aVar = new a(context);
        aVar.m130306p1().m111959G1(context.getText(AbstractC8020f0.str_search_global_tab_link));
        aVar.m89106L().m89034R(m118712h);
        this.f120735M0 = aVar;
        a aVar2 = new a(context);
        aVar2.m130306p1().m111959G1(context.getText(AbstractC8020f0.str_search_global_tab_file));
        aVar2.m89106L().m89054h0(aVar);
        this.f120736N0 = aVar2;
        C16719g c16719g = new C16719g(context);
        c16719g.m89106L().m89028L(-1, 1).m89023G(aVar);
        c16719g.mo89161z0(C23212s8.m119607o(context, AbstractC16781w.ItemSeparatorColor));
        this.f120737O0 = c16719g;
        m89001g1(aVar);
        m89001g1(aVar2);
        m89001g1(c16719g);
        m89106L().m89028L(-1, -2);
        mo89161z0(C23212s8.m119607o(context, AbstractC16781w.PrimaryBackgroundColor));
    }

    /* renamed from: o1 */
    public final C16719g m130302o1() {
        return this.f120737O0;
    }

    /* renamed from: p1 */
    public final a m130303p1() {
        return this.f120736N0;
    }

    /* renamed from: q1 */
    public final a m130304q1() {
        return this.f120735M0;
    }
}
