package t80;

import android.content.Context;
import android.text.TextUtils;
import com.zing.zalo.AbstractC16781w;
import com.zing.zalo.AbstractC16802y;
import com.zing.zalo.AbstractC16803z;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.uidrawing.C16716d;
import l80.C22122a0;
import l80.C22126c0;
import me0.AbstractC23136l9;
import me0.C23212s8;
import me0.C23278z2;
import p354n3.C23528a;

/* renamed from: t80.l */
/* loaded from: classes6.dex */
public class C26599l extends C16716d {

    /* renamed from: M0 */
    C22122a0 f125937M0;

    /* renamed from: N0 */
    C22126c0 f125938N0;

    public C26599l(Context context) {
        super(context);
        m136554q1(context);
    }

    /* renamed from: o1 */
    public void m136552o1(String str, C23528a c23528a) {
        C22122a0 c22122a0 = this.f125937M0;
        if (c22122a0 != null) {
            c22122a0.m115375G1(c23528a, str, C23278z2.m120097T0());
        }
    }

    /* renamed from: p1 */
    public void m136553p1() {
        C22122a0 c22122a0 = this.f125937M0;
        if (c22122a0 != null) {
            c22122a0.mo111924u1(null);
        }
    }

    /* renamed from: q1 */
    public void m136554q1(Context context) {
        m89106L().m89036T(AbstractC23136l9.m118742r(2.0f)).m89033Q(AbstractC23136l9.m118742r(2.0f)).m89028L(AbstractC23136l9.m118655I(AbstractC16802y.story_bar_item_large_roundrect_suggestion_width), AbstractC23136l9.m118655I(AbstractC16802y.story_bar_item_large_roundrect_suggestion_height));
        m89087B0(AbstractC16803z.bg_story_large_roundrect_suggestion);
        C22126c0 c22126c0 = new C22126c0(context);
        this.f125938N0 = c22126c0;
        c22126c0.m89106L().m89028L(-2, -2).m89033Q(AbstractC23136l9.m118742r(8.0f)).m89046b0(AbstractC23136l9.m118742r(8.0f)).m89047c0(AbstractC23136l9.m118742r(8.0f)).m89026J(true).m89072y(Boolean.TRUE).m89029M(17);
        this.f125938N0.m111953A1(1);
        this.f125938N0.m111980v1(TextUtils.TruncateAt.END);
        this.f125938N0.mo111964L1(AbstractC23136l9.m118742r(11.0f));
        this.f125938N0.m111962J1(C23212s8.m119607o(context, AbstractC16781w.story_suggestion_text_color));
        this.f125938N0.mo111965M1(1);
        this.f125938N0.m111958F1(AbstractC8020f0.str_story_suggest_posting_new);
        m89001g1(this.f125938N0);
        int m118742r = AbstractC23136l9.m118742r(4.0f);
        C22122a0 c22122a0 = new C22122a0(context);
        this.f125937M0 = c22122a0;
        c22122a0.m89106L().m89028L(-1, -1).m89066s(this.f125938N0).m89031O(AbstractC23136l9.m118742r(4.0f));
        this.f125937M0.m111929z1(5);
        this.f125937M0.mo111927x1(m118742r);
        m89001g1(this.f125937M0);
    }
}
