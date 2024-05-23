package com.zing.zalo.feed.mvp.feed.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.LinearLayout;
import fn0.AbstractC19074t;
import p425po.C24885g;
import p649xl.C30149z5;

/* loaded from: classes4.dex */
public final class MoveTabUserInfoView extends LinearLayout {

    /* renamed from: p */
    private C30149z5 f46241p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MoveTabUserInfoView(Context context) {
        super(context);
        AbstractC19074t.m100208f(context, "context");
        m45608b(context);
    }

    /* renamed from: a */
    public final void m45607a(C24885g c24885g) {
        if (c24885g == null) {
            return;
        }
        C30149z5 c30149z5 = this.f46241p;
        if (c30149z5 == null) {
            AbstractC19074t.m100223u("binding");
            c30149z5 = null;
        }
        c30149z5.f140100q.setText(c24885g.m129399b());
    }

    /* renamed from: b */
    public final void m45608b(Context context) {
        AbstractC19074t.m100208f(context, "context");
        C30149z5 m148772c = C30149z5.m148772c(LayoutInflater.from(context), this, true);
        AbstractC19074t.m100207e(m148772c, "inflate(...)");
        this.f46241p = m148772c;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MoveTabUserInfoView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        AbstractC19074t.m100208f(context, "context");
        m45608b(context);
    }
}
