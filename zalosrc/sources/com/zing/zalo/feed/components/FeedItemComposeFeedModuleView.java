package com.zing.zalo.feed.components;

import android.content.Context;
import android.text.TextUtils;
import com.zing.zalo.AbstractC16781w;
import com.zing.zalo.AbstractC16802y;
import com.zing.zalo.AbstractC16803z;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.feed.uicontrols.C8888s;
import com.zing.zalo.uidrawing.C16719g;
import ho0.AbstractC20110a;
import kd0.C21693c;
import l80.C22126c0;
import me0.AbstractC23136l9;
import me0.C23212s8;
import p615wn.C29106b;

/* loaded from: classes4.dex */
public class FeedItemComposeFeedModuleView extends FeedItemBaseModuleView {

    /* renamed from: f0 */
    private final Context f44371f0;

    /* renamed from: g0 */
    C8888s f44372g0;

    /* renamed from: h0 */
    C22126c0 f44373h0;

    /* renamed from: i0 */
    C21693c f44374i0;

    public FeedItemComposeFeedModuleView(Context context) {
        super(context);
        this.f44371f0 = context;
    }

    @Override // com.zing.zalo.feed.components.FeedItemBaseModuleView
    /* renamed from: W */
    public void mo43694W(C29106b c29106b) {
    }

    @Override // com.zing.zalo.feed.components.FeedItemBaseModuleView
    /* renamed from: j0 */
    public void mo43705j0(Context context, int i11) {
        super.mo43705j0(context, this.f44322M);
        this.f44322M = i11;
        try {
            setBackgroundColor(C23212s8.m119607o(context, AbstractC16781w.ProfilePrimaryBackgroundColor));
            this.f44372g0 = new C8888s(this.f44371f0);
            this.f44373h0 = new C22126c0(this.f44371f0);
            C16719g c16719g = new C16719g(this.f44371f0);
            this.f44374i0 = new C21693c(this.f44371f0);
            this.f44372g0.m89106L().m89028L(AbstractC23136l9.m118655I(AbstractC16802y.feed_profile_group_dot_size), -1).m89027K(true).m89034R(AbstractC23136l9.m118655I(AbstractC16802y.feed_profile_group_dot_marginleft));
            C8888s c8888s = this.f44372g0;
            c8888s.f47543O0 = false;
            c8888s.f47542N0 = AbstractC23136l9.m118655I(AbstractC16802y.feed_profile_group_dot_size) / 2;
            C8888s c8888s2 = this.f44372g0;
            c8888s2.f47546R0 = null;
            c8888s2.f47545Q0 = C23212s8.m119607o(context, AbstractC16781w.ProfileLineColor);
            this.f44372g0.f47544P0 = C23212s8.m119607o(context, AbstractC16781w.ProfileLineColor);
            this.f44372g0.m47437t1(2);
            this.f44372g0.m47436s1(AbstractC23136l9.m118655I(AbstractC16802y.feed_profile_group_dot_margin_line));
            this.f44372g0.m47435r1();
            mo69681L(this.f44372g0);
            this.f44373h0.m89106L().m89028L(-1, AbstractC23136l9.m118742r(50.0f)).m89032P(AbstractC23136l9.m118736p(AbstractC16802y.feed_padding_left_profile), 0, AbstractC23136l9.m118736p(AbstractC16802y.feed_padding_right_profile), 0).m89042Z(AbstractC23136l9.m118742r(12.0f), 0, AbstractC23136l9.m118742r(6.0f), 0).m89027K(true).m89029M(12);
            this.f44373h0.m111982x1(false);
            this.f44373h0.m89085A0(AbstractC23136l9.m118665N(context, AbstractC16803z.bg_feed_profile_full));
            this.f44373h0.m111953A1(1);
            this.f44373h0.m111980v1(TextUtils.TruncateAt.END);
            this.f44373h0.mo111964L1(AbstractC23136l9.m118742r(16.0f));
            this.f44373h0.m111962J1(C23212s8.m119607o(context, AbstractC16781w.TextColor3));
            this.f44373h0.m111958F1(AbstractC8020f0.status_default_text);
            this.f44373h0.mo44614b1(0);
            mo69681L(this.f44373h0);
            this.f44374i0.m89106L().m89028L(-2, -2).m89035S(AbstractC23136l9.m118742r(16.0f)).m89019C(this.f44373h0).m89027K(true);
            this.f44374i0.mo111925v1(AbstractC23136l9.m118665N(context, AbstractC16803z.ic_photo_grd));
            mo69681L(this.f44374i0);
            c16719g.m89106L().m89028L(AbstractC23136l9.m118742r(1.0f), -1).m89049e0(this.f44374i0).m89032P(0, AbstractC23136l9.m118742r(10.0f), AbstractC23136l9.m118742r(16.0f), AbstractC23136l9.m118742r(10.0f));
            c16719g.mo89161z0(C23212s8.m119607o(context, AbstractC16781w.ProfileLineColor));
            mo69681L(c16719g);
        } catch (Exception e11) {
            AbstractC20110a.m104539h(e11);
        }
    }

    public void setOnClickComposeFeed(C16719g.c cVar) {
        try {
            C22126c0 c22126c0 = this.f44373h0;
            if (c22126c0 != null) {
                c22126c0.mo89109M0(cVar);
            }
        } catch (Exception e11) {
            AbstractC20110a.m104539h(e11);
        }
    }

    public void setOnClickComposePhoto(C16719g.c cVar) {
        try {
            C21693c c21693c = this.f44374i0;
            if (c21693c != null) {
                c21693c.mo89109M0(cVar);
            }
        } catch (Exception e11) {
            AbstractC20110a.m104539h(e11);
        }
    }
}
