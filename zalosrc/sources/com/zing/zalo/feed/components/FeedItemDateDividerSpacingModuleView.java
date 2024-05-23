package com.zing.zalo.feed.components;

import android.content.Context;
import android.widget.FrameLayout;
import com.zing.zalo.AbstractC16781w;
import com.zing.zalo.AbstractC16802y;
import com.zing.zalo.feed.components.C8406v1;
import ho0.AbstractC20110a;
import me0.AbstractC23136l9;
import me0.C23212s8;
import p615wn.C29106b;

/* loaded from: classes4.dex */
public class FeedItemDateDividerSpacingModuleView extends FeedItemBaseModuleView {

    /* renamed from: f0 */
    private int f44386f0;

    public FeedItemDateDividerSpacingModuleView(Context context) {
        super(context);
    }

    /* renamed from: m0 */
    private void m43741m0() {
        setLayoutParams(new FrameLayout.LayoutParams(-1, getSpacing()));
    }

    @Override // com.zing.zalo.feed.components.FeedItemBaseModuleView
    /* renamed from: W */
    public void mo43694W(C29106b c29106b) {
    }

    int getSpacing() {
        int i11 = this.f44386f0;
        if (i11 != 0) {
            if (i11 != 1) {
                return 0;
            }
            return AbstractC23136l9.m118655I(AbstractC16802y.feed_spacing_item_profile);
        }
        return AbstractC23136l9.m118655I(AbstractC16802y.feed_spacing_date_divider_profile);
    }

    /* renamed from: n0 */
    public void m43742n0(Context context, int i11, int i12) {
        this.f44322M = i11;
        this.f44386f0 = i12;
        try {
            setBackgroundColor(C23212s8.m119607o(context, AbstractC16781w.ProfilePrimaryBackgroundColor));
            m43741m0();
            m43706k0();
        } catch (Exception e11) {
            AbstractC20110a.m104539h(e11);
        }
    }

    public void setEnableTimebar(boolean z11) {
        int i11;
        C8406v1.a aVar = this.f44332W;
        if (aVar != null) {
            if (z11) {
                i11 = 0;
            } else {
                i11 = 8;
            }
            aVar.mo44614b1(i11);
        }
    }
}
