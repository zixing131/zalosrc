package py;

import android.content.Context;
import android.text.Layout;
import android.view.ViewGroup;
import bi0.AbstractC2807a;
import com.zing.zalo.AbstractC16803z;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.uidrawing.C16716d;
import fn0.AbstractC19074t;
import ia0.AbstractC20484a;
import kd0.C21693c;
import l80.C22126c0;
import me0.AbstractC23136l9;
import me0.C23212s8;
import p374ny.AbstractC23957a;

/* renamed from: py.a */
/* loaded from: classes4.dex */
public final class C24923a extends AbstractC20484a {

    /* renamed from: py.a$a */
    /* loaded from: classes4.dex */
    public static final class a extends C16716d {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Context context) {
            super(context);
            int i11;
            AbstractC19074t.m100208f(context, "context");
            int m118712h = AbstractC23136l9.m118712h(context, 32.0f);
            int m118712h2 = AbstractC23136l9.m118712h(context, 120.0f);
            m89106L().m89028L(-1, AbstractC23136l9.m118712h(context, 360.0f));
            C21693c c21693c = new C21693c(context);
            c21693c.m89106L().m89028L(m118712h2, m118712h2).m89026J(true).m89036T(AbstractC23136l9.m118712h(context, 96.0f));
            if (C23212s8.m119603k()) {
                i11 = AbstractC16803z.ic_recent_scan_qr_empty_state;
            } else {
                i11 = AbstractC16803z.ic_recent_scan_qr_empty_state_dm;
            }
            c21693c.mo111926w1(i11);
            m89001g1(c21693c);
            C22126c0 c22126c0 = new C22126c0(context);
            c22126c0.m111958F1(AbstractC8020f0.str_recent_qr_empty);
            c22126c0.mo111964L1(AbstractC23136l9.m118712h(context, 14.0f));
            c22126c0.m111962J1(C23212s8.m119607o(context, AbstractC2807a.text_02));
            c22126c0.m111961I1(Layout.Alignment.ALIGN_CENTER);
            c22126c0.m89106L().m89028L(-1, -2).m89032P(m118712h, AbstractC23136l9.m118712h(context, 232.0f), m118712h, 0);
            m89001g1(c22126c0);
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C24923a(ViewGroup viewGroup) {
        super(viewGroup, new a(r1));
        AbstractC19074t.m100208f(viewGroup, "parent");
        Context context = viewGroup.getContext();
        AbstractC19074t.m100207e(context, "getContext(...)");
    }

    /* renamed from: j0 */
    public final void m129593j0(AbstractC23957a.a aVar) {
        AbstractC19074t.m100208f(aVar, "item");
    }
}
