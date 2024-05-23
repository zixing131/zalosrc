package com.zing.zalo.feed.mvp.feed.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.LinearLayout;
import fn0.AbstractC19074t;
import p425po.C24882d;
import p649xl.C30132y5;

/* loaded from: classes4.dex */
public final class MoveTabUserDescriptionView extends LinearLayout {

    /* renamed from: p */
    private C30132y5 f46240p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MoveTabUserDescriptionView(Context context) {
        super(context);
        AbstractC19074t.m100208f(context, "context");
        m45606b(context);
    }

    /* renamed from: a */
    public final void m45605a(C24882d c24882d) {
        if (c24882d == null) {
            return;
        }
        C30132y5 c30132y5 = this.f46240p;
        if (c30132y5 == null) {
            AbstractC19074t.m100223u("binding");
            c30132y5 = null;
        }
        c30132y5.f140013q.setText("•");
        c30132y5.f140014r.setText(c24882d.m129389b());
    }

    /* renamed from: b */
    public final void m45606b(Context context) {
        AbstractC19074t.m100208f(context, "context");
        C30132y5 m148729c = C30132y5.m148729c(LayoutInflater.from(context), this, true);
        AbstractC19074t.m100207e(m148729c, "inflate(...)");
        this.f46240p = m148729c;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MoveTabUserDescriptionView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        AbstractC19074t.m100208f(context, "context");
        m45606b(context);
    }
}
