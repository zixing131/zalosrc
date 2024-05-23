package com.zing.zalo.feed.mvp.feed.view.component;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RelativeLayout;
import fn0.AbstractC19074t;
import ln0.AbstractC22543l;

/* loaded from: classes4.dex */
public final class TabsControlLayout extends RelativeLayout {
    public TabsControlLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* renamed from: a */
    public final void m45684a() {
        setTranslationY(0.0f);
    }

    /* renamed from: b */
    public final void m45685b(View view, int i11) {
        float m116587j;
        AbstractC19074t.m100208f(view, "view");
        m116587j = AbstractC22543l.m116587j(getTranslationY() + i11, -view.getHeight(), 0.0f);
        setTranslationY(m116587j);
    }
}
