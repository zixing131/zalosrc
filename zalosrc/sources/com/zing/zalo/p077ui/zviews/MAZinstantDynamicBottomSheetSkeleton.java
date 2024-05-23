package com.zing.zalo.p077ui.zviews;

import android.content.Context;
import android.util.AttributeSet;
import com.zing.zalo.AbstractC16802y;
import com.zing.zalo.uicontrol.C16666v0;
import fn0.AbstractC19074t;
import me0.AbstractC23136l9;

/* loaded from: classes6.dex */
public final class MAZinstantDynamicBottomSheetSkeleton extends MiniAppZinstantSkeleton {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MAZinstantDynamicBottomSheetSkeleton(Context context) {
        super(context);
        AbstractC19074t.m100208f(context, "context");
    }

    @Override // com.zing.zalo.p077ui.zviews.MiniAppZinstantSkeleton
    /* renamed from: b */
    public void mo81275b() {
        super.mo81275b();
        C16666v0 c16666v0 = new C16666v0(getContext());
        c16666v0.m89106L().m89060k0(-1).m89030N(AbstractC23136l9.m118742r(48.0f)).m89036T(AbstractC23136l9.m118742r(24.0f));
        m81788c(c16666v0);
        C16666v0 c16666v02 = new C16666v0(getContext());
        c16666v02.m89106L().m89060k0(-1).m89030N(AbstractC23136l9.m118742r(86.0f)).m89023G(c16666v0).m89036T(AbstractC23136l9.m118742r(24.0f));
        m81788c(c16666v02);
        C16666v0 c16666v03 = new C16666v0(getContext());
        c16666v03.m89106L().m89026J(true).m89023G(c16666v02);
        m81788c(c16666v03);
        C16666v0 c16666v04 = new C16666v0(getContext());
        c16666v04.m89106L().m89060k0(AbstractC23136l9.m118655I(AbstractC16802y.mp_button_width)).m89030N(AbstractC23136l9.m118655I(AbstractC16802y.mp_button_height)).m89036T(AbstractC23136l9.m118742r(24.0f)).m89023G(c16666v02).m89049e0(c16666v03).m89035S(AbstractC23136l9.m118742r(4.0f));
        m81788c(c16666v04);
        C16666v0 c16666v05 = new C16666v0(getContext());
        c16666v05.m89106L().m89060k0(AbstractC23136l9.m118655I(AbstractC16802y.mp_button_width)).m89030N(AbstractC23136l9.m118655I(AbstractC16802y.mp_button_height)).m89036T(AbstractC23136l9.m118742r(24.0f)).m89023G(c16666v02).m89054h0(c16666v03).m89034R(AbstractC23136l9.m118742r(4.0f));
        m81788c(c16666v05);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MAZinstantDynamicBottomSheetSkeleton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        AbstractC19074t.m100208f(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MAZinstantDynamicBottomSheetSkeleton(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        AbstractC19074t.m100208f(context, "context");
    }
}
