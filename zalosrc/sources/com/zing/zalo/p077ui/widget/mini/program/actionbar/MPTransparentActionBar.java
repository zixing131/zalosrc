package com.zing.zalo.p077ui.widget.mini.program.actionbar;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.zing.zalo.AbstractC16781w;
import com.zing.zalo.AbstractC16802y;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC8915g0;
import fn0.AbstractC19074t;
import p170fv.AbstractC19147a;

/* loaded from: classes6.dex */
public final class MPTransparentActionBar extends MiniProgramActionBar {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MPTransparentActionBar(Context context) {
        super(context);
        AbstractC19074t.m100208f(context, "context");
        m76431l();
    }

    /* renamed from: l */
    private final void m76431l() {
        removeAllViews();
        LinearLayout m76436i = m76436i();
        m76436i.setId(AbstractC6918a0.mp_wv_right_menu_container);
        int dimension = (int) getContext().getResources().getDimension(AbstractC16802y.icon_header_mp_size_width);
        m76436i.addView(MiniProgramActionBar.m76434h(this, m76438k(AbstractC16781w.IconMPMenu), AbstractC6918a0.mp_wv_menu_id, dimension, 0, 0, m76438k(AbstractC16781w.BackgroundButtonMPLeftCurve), "ma_open_menu", 24, null));
        View view = new View(getContext());
        view.setBackgroundColor(m76437j(AbstractC16781w.LineViewMiniProgramColor));
        m76436i.addView(view, new RelativeLayout.LayoutParams((int) getContext().getResources().getDimension(AbstractC16802y.mp_action_bar_divider_width), (int) getContext().getResources().getDimension(AbstractC16802y.mp_action_bar_divider_height)));
        m76436i.addView(MiniProgramActionBar.m76434h(this, m76438k(AbstractC16781w.IconMPExit), AbstractC6918a0.mp_wv_exit_id, dimension, 0, 0, m76438k(AbstractC16781w.BackgroundButtonMPRightCurve), "ma_close_mini_app", 24, null));
        addView(m76436i, new RelativeLayout.LayoutParams(-2, -2));
    }

    /* renamed from: m */
    public final void m76432m(AbstractC19147a abstractC19147a) {
        Boolean bool;
        int i11;
        int currentTheme = getCurrentTheme();
        if (abstractC19147a != null) {
            bool = abstractC19147a.m100478j();
        } else {
            bool = null;
        }
        if (bool != null) {
            if (AbstractC19074t.m100204b(abstractC19147a.m100478j(), Boolean.TRUE)) {
                i11 = AbstractC8915g0.ThemeDefault_Dark;
            } else {
                i11 = AbstractC8915g0.ThemeDefault_Light;
            }
            currentTheme = i11;
        }
        if (currentTheme != getCurrentTheme()) {
            setCurrentTheme(currentTheme);
            m76431l();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MPTransparentActionBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        AbstractC19074t.m100208f(context, "context");
        AbstractC19074t.m100208f(attributeSet, "attrs");
        m76431l();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MPTransparentActionBar(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        AbstractC19074t.m100208f(context, "context");
        AbstractC19074t.m100208f(attributeSet, "attrs");
        m76431l();
    }
}
