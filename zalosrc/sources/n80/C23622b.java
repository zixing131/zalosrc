package n80;

import android.content.Context;
import android.text.TextUtils;
import bi0.AbstractC2807a;
import com.androidquery.util.C3977j;
import com.zing.zalo.AbstractC16803z;
import com.zing.zalo.p077ui.custom.C11874v;
import com.zing.zalo.uidrawing.C16716d;
import com.zing.zalo.zdesign.component.C16979g1;
import fn0.AbstractC19074t;
import l80.C22126c0;
import me0.AbstractC23136l9;
import me0.C23212s8;

/* renamed from: n80.b */
/* loaded from: classes6.dex */
public final class C23622b extends C16979g1 {

    /* renamed from: N0 */
    private final C22126c0 f114490N0;

    /* renamed from: O0 */
    private final C22126c0 f114491O0;

    /* renamed from: P0 */
    private final C11874v f114492P0;

    /* renamed from: Q0 */
    private final C3977j f114493Q0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C23622b(Context context) {
        super(context);
        AbstractC19074t.m100208f(context, "context");
        int m118712h = AbstractC23136l9.m118712h(context, 4.0f);
        int m118712h2 = AbstractC23136l9.m118712h(context, 8.0f);
        int m118712h3 = AbstractC23136l9.m118712h(context, 16.0f);
        int m118712h4 = AbstractC23136l9.m118712h(context, 64.0f);
        this.f114493Q0 = new C3977j(context);
        C11874v c11874v = new C11874v(context);
        c11874v.m89106L().m89028L(m118712h4, m118712h4);
        c11874v.m111929z1(5);
        c11874v.mo111927x1(m118712h);
        c11874v.m89087B0(AbstractC16803z.ic_link_placeholder);
        this.f114492P0 = c11874v;
        C16716d c16716d = new C16716d(context);
        c16716d.m89106L().m89028L(-1, -2).m89027K(true).m89034R(m118712h4 + m118712h3);
        C22126c0 c22126c0 = new C22126c0(context);
        c22126c0.m89106L().m89028L(-1, -2);
        c22126c0.m111953A1(2);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        c22126c0.m111980v1(truncateAt);
        c22126c0.mo111965M1(1);
        c22126c0.m111962J1(C23212s8.m119607o(context, AbstractC2807a.text_01));
        c22126c0.mo111964L1(AbstractC23136l9.m118712h(context, 15.0f));
        this.f114490N0 = c22126c0;
        C22126c0 c22126c02 = new C22126c0(context);
        c22126c02.m89106L().m89028L(-1, -2).m89036T(m118712h2).m89023G(c22126c0);
        c22126c02.m111953A1(1);
        c22126c02.m111980v1(truncateAt);
        c22126c02.mo111965M1(1);
        c22126c02.m111962J1(C23212s8.m119607o(context, AbstractC2807a.link_01));
        c22126c02.mo111964L1(AbstractC23136l9.m118712h(context, 12.0f));
        this.f114491O0 = c22126c02;
        m89001g1(c11874v);
        c16716d.m89001g1(c22126c0);
        c16716d.m89001g1(c22126c02);
        m89001g1(c16716d);
        m89106L().m89028L(-1, -2).m89041Y(m118712h3);
    }

    /* renamed from: o1 */
    public final C22126c0 m123837o1() {
        return this.f114490N0;
    }

    /* renamed from: p1 */
    public final C22126c0 m123838p1() {
        return this.f114491O0;
    }

    /* renamed from: q1 */
    public final C11874v m123839q1() {
        return this.f114492P0;
    }
}
