package com.zing.zalo.p077ui.zviews;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import bo.C3010n0;
import com.zing.zalo.feed.components.FeedItemBase;
import p615wn.C29106b;

/* loaded from: classes6.dex */
public class FooterView extends FeedItemBase {

    /* renamed from: r0 */
    public View f73421r0;

    /* renamed from: s0 */
    public View f73422s0;

    public FooterView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // com.zing.zalo.feed.components.FeedItemBase
    /* renamed from: j */
    public void mo43686j(C29106b c29106b) {
    }

    public void setFooterVisibility(C3010n0 c3010n0) {
        if (this.f73421r0 != null && this.f73422s0 != null) {
            if (c3010n0.m14426a() == 1) {
                this.f73421r0.setVisibility(0);
                this.f73422s0.setVisibility(8);
            } else if (c3010n0.m14426a() == 2) {
                this.f73421r0.setVisibility(8);
                this.f73422s0.setVisibility(0);
            } else {
                this.f73421r0.setVisibility(4);
                this.f73422s0.setVisibility(4);
            }
        }
    }
}
