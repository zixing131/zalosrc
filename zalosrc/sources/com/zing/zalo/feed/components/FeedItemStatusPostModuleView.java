package com.zing.zalo.feed.components;

import android.content.Context;
import com.zing.zalo.AbstractC16781w;
import com.zing.zalo.uidrawing.ModulesView;
import com.zing.zalo.zview.AbstractC17466e;
import fn0.AbstractC19074t;
import me0.AbstractC23136l9;
import me0.C23212s8;
import mm0.AbstractC23350e;

/* loaded from: classes4.dex */
public final class FeedItemStatusPostModuleView extends ModulesView {

    /* renamed from: K */
    public C8274f4 f44693K;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FeedItemStatusPostModuleView(Context context) {
        super(context);
        AbstractC19074t.m100208f(context, "context");
    }

    /* renamed from: V */
    private final void m44080V(Context context, int i11) {
        setFeedItemHeaderBarModule(new C8274f4(context));
        getFeedItemHeaderBarModule().m89106L().m89060k0(-1).m89030N(-2);
        getFeedItemHeaderBarModule().m44679p1(context, i11);
        mo69681L(getFeedItemHeaderBarModule());
    }

    /* renamed from: X */
    private final void m44081X(Context context, int i11) {
        if (i11 != 2 && i11 != 3) {
            setBackground(AbstractC23136l9.m118665N(context, AbstractC17466e.white));
        } else {
            setBackgroundColor(C23212s8.m119607o(context, AbstractC16781w.ProfilePrimaryBackgroundColor));
        }
    }

    /* renamed from: W */
    public final void m44082W(Context context, int i11) {
        AbstractC19074t.m100208f(context, "context");
        try {
            m44081X(context, i11);
            m44080V(context, i11);
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    public final C8274f4 getFeedItemHeaderBarModule() {
        C8274f4 c8274f4 = this.f44693K;
        if (c8274f4 != null) {
            return c8274f4;
        }
        AbstractC19074t.m100223u("feedItemHeaderBarModule");
        return null;
    }

    public final void setFeedItemHeaderBarModule(C8274f4 c8274f4) {
        AbstractC19074t.m100208f(c8274f4, "<set-?>");
        this.f44693K = c8274f4;
    }
}
