package n80;

import android.content.Context;
import android.text.TextUtils;
import bi0.AbstractC2807a;
import com.zing.zalo.AbstractC16803z;
import com.zing.zalo.uidrawing.C16716d;
import com.zing.zalo.zdesign.component.C16959c0;
import com.zing.zalo.zdesign.component.EnumC16952b0;
import fn0.AbstractC19074t;
import kd0.C21693c;
import kd0.C21697g;
import me0.AbstractC23136l9;
import me0.C23212s8;

/* renamed from: n80.f */
/* loaded from: classes6.dex */
public final class C23626f extends C16959c0 {

    /* renamed from: k1 */
    private final C21697g f114501k1;

    /* renamed from: l1 */
    private final C21693c f114502l1;

    /* renamed from: m1 */
    private final C21693c f114503m1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C23626f(Context context) {
        super(context);
        AbstractC19074t.m100208f(context, "context");
        int m118712h = AbstractC23136l9.m118712h(context, 4.0f);
        int m118712h2 = AbstractC23136l9.m118712h(context, 16.0f);
        int m118712h3 = AbstractC23136l9.m118712h(context, 64.0f);
        m89087B0(AbstractC16803z.background_search_global_media_transparent);
        m89106L().m89028L(-1, -2);
        C16716d c16716d = new C16716d(context);
        c16716d.m89106L().m89028L(m118712h3, m118712h3);
        m90814p1(c16716d);
        m90823z1(EnumC16952b0.CENTER);
        C21693c c21693c = new C21693c(context);
        c21693c.m89106L().m89028L(-1, -1).m89041Y(m118712h2);
        c21693c.m111929z1(6);
        c21693c.m89087B0(AbstractC16803z.ic_thumb_placeholder_normal);
        c16716d.m89001g1(c21693c);
        this.f114503m1 = c21693c;
        C21693c c21693c2 = new C21693c(context);
        c21693c2.m89106L().m89028L(-1, -1);
        c21693c2.m111929z1(5);
        c21693c2.mo111927x1(m118712h);
        c16716d.m89001g1(c21693c2);
        this.f114502l1 = c21693c2;
        C21697g c21697g = new C21697g(context);
        c21697g.m89106L().m89028L(-1, -2);
        c21697g.m111953A1(1);
        c21697g.m111980v1(TextUtils.TruncateAt.END);
        c21697g.m111962J1(C23212s8.m119607o(context, AbstractC2807a.text_02));
        c21697g.mo111964L1(AbstractC23136l9.m118712h(context, 13.0f));
        m90815q1(c21697g);
        this.f114501k1 = c21697g;
        m90807I1(2);
        m90806H1(C23212s8.m119607o(context, AbstractC2807a.text_01));
        m90800B1("");
        m90799A1(AbstractC23136l9.m118712h(context, 96.0f), 0, 0, 0);
    }

    /* renamed from: O1 */
    public final C21693c m123847O1() {
        return this.f114503m1;
    }

    /* renamed from: P1 */
    public final C21693c m123848P1() {
        return this.f114502l1;
    }

    /* renamed from: Q1 */
    public final C21697g m123849Q1() {
        return this.f114501k1;
    }
}
