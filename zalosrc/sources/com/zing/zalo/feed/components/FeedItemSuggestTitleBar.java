package com.zing.zalo.feed.components;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import bo.C3000l0;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.p077ui.widget.RobotoTextView;
import com.zing.zalo.social.controls.InterfaceC10867f;
import is.AbstractC20814p0;

/* loaded from: classes4.dex */
public class FeedItemSuggestTitleBar extends LinearLayout {

    /* renamed from: p */
    private RobotoTextView f44824p;

    /* renamed from: q */
    private View f44825q;

    public FeedItemSuggestTitleBar(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
    }

    /* renamed from: a */
    public void m44147a() {
        this.f44824p = (RobotoTextView) findViewById(AbstractC6918a0.tv_suggest_header_tag);
        this.f44825q = findViewById(AbstractC6918a0.divider_suggest_tag);
    }

    /* renamed from: b */
    public void m44148b(C3000l0 c3000l0, int i11, InterfaceC10867f interfaceC10867f) {
        AbstractC20814p0.m108610I0(c3000l0, i11, this.f44824p, this.f44825q, interfaceC10867f);
    }

    public FeedItemSuggestTitleBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
