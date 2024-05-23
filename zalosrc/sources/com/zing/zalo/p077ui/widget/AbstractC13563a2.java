package com.zing.zalo.p077ui.widget;

import android.graphics.Rect;

/* renamed from: com.zing.zalo.ui.widget.a2 */
/* loaded from: classes6.dex */
public abstract class AbstractC13563a2 {
    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b */
    public static final void m76017b(Rect rect, float f11, float f12) {
        float width = rect.width() * f11;
        float height = rect.height() * f12;
        float width2 = rect.width() - width;
        float f13 = 2;
        float f14 = width2 / f13;
        float height2 = (rect.height() - height) / f13;
        rect.set((int) (rect.left + f14), (int) (rect.top + height2), (int) (rect.right - f14), (int) (rect.bottom - height2));
    }
}
