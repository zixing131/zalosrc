package com.zing.zalo.p077ui.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import me0.AbstractC23136l9;

/* loaded from: classes6.dex */
public class StickerProgressView extends View {

    /* renamed from: p */
    private C13804v0 f69738p;

    /* renamed from: q */
    private boolean f69739q;

    public StickerProgressView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m75916a();
    }

    /* renamed from: a */
    private void m75916a() {
        C13804v0 c13804v0 = new C13804v0(this);
        this.f69738p = c13804v0;
        c13804v0.m77065d(new int[]{0, -8749696});
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.f69738p != null && this.f69739q) {
            this.f69738p.m77067f((getWidth() / 2) - AbstractC23136l9.m118742r(12.0f), (getHeight() / 2) - AbstractC23136l9.m118742r(12.0f));
            this.f69738p.m77062a(canvas);
        }
    }

    public void setLoadingView(boolean z11) {
        this.f69739q = z11;
    }
}
