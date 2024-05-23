package com.zing.zalo.zdesign.component.popover;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import bi0.AbstractC2807a;
import bi0.AbstractC2810d;
import bi0.AbstractC2811e;
import com.zing.zalo.zdesign.component.EnumC16952b0;
import com.zing.zalo.zdesign.component.ListItem;
import fn0.AbstractC19074t;
import ui0.C27275b;
import ui0.C27276c;
import ui0.C27280g;

/* loaded from: classes7.dex */
public final class PopoverItemView extends ListItem {
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public PopoverItemView(Context context) {
        this(context, null);
        AbstractC19074t.m100208f(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public PopoverItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        AbstractC19074t.m100208f(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PopoverItemView(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        AbstractC19074t.m100208f(context, "context");
        setLayoutParams(new RelativeLayout.LayoutParams(-1, -2));
        ((LinearLayout) findViewById(AbstractC2811e.ll_list_item_content)).getLayoutParams().width = -2;
        ((RelativeLayout) findViewById(AbstractC2811e.rl_list_item_middle)).getLayoutParams().width = -2;
        int m139649b = C27276c.m139649b(context, 12);
        int m139649b2 = C27276c.m139649b(context, 16);
        setPadding(m139649b2, m139649b, m139649b2, m139649b);
        setBackground(C27280g.m139658a(context, AbstractC2810d.bg_popover_item));
        getTitleTextView$zdesign_release().setSingleLine(false);
        C27275b c27275b = C27275b.f128316a;
        setTitleColor(C27275b.m139639c(c27275b, context, AbstractC2807a.popover_menu_title, null, false, 6, null));
        getSubtitleTextView$zdesign_release().setSingleLine(false);
        getSubtitleTextView$zdesign_release().setVisibility(8);
        getBadgeTitle().setVisibility(8);
        setSubtitleColor(C27275b.m139639c(c27275b, context, AbstractC2807a.popover_menu_subtitle, null, false, 6, null));
        setLeadingItemVisibility(0);
        setLeadingGravity(EnumC16952b0.CENTER);
        m90592m(false);
    }
}
