package com.zing.zalo.libbubbleview;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import fn0.AbstractC19074t;

/* loaded from: classes4.dex */
public final class HostFrameLayout extends FrameLayout {

    /* renamed from: p */
    private C8949b f47811p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HostFrameLayout(Context context, C8949b c8949b) {
        super(context);
        AbstractC19074t.m100208f(context, "context");
        AbstractC19074t.m100208f(c8949b, "manager");
        this.f47811p = c8949b;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z11, int i11, int i12, int i13, int i14) {
        super.onLayout(z11, i11, i12, i13, i14);
        C8949b c8949b = this.f47811p;
        if (c8949b == null) {
            AbstractC19074t.m100223u("manager");
            c8949b = null;
        }
        c8949b.m47768m(getMeasuredHeight(), getMeasuredWidth());
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HostFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        AbstractC19074t.m100208f(context, "context");
        throw new IllegalArgumentException("This constructor cannot be used");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HostFrameLayout(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        AbstractC19074t.m100208f(context, "context");
        throw new IllegalArgumentException("This constructor cannot be used");
    }
}
