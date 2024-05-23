package com.zing.zalo.p077ui.moduleview.p078qr.share;

import android.content.Context;
import android.util.AttributeSet;
import com.zing.zalo.p077ui.moduleview.DecorModuleView;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import p80.C24678b;

/* loaded from: classes6.dex */
public final class ShareGroupQRCardModuleView extends DecorModuleView<C24678b> {
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ShareGroupQRCardModuleView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, null, null, null, null, null, 252, null);
        AbstractC19074t.m100208f(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ShareGroupQRCardModuleView(Context context, AttributeSet attributeSet, int i11) {
        this(context, attributeSet, i11, null, null, null, null, null, 248, null);
        AbstractC19074t.m100208f(context, "context");
    }

    public /* synthetic */ ShareGroupQRCardModuleView(Context context, AttributeSet attributeSet, int i11, Integer num, Integer num2, Integer num3, Integer num4, Integer num5, int i12, AbstractC19060k abstractC19060k) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11, (i12 & 8) != 0 ? null : num, (i12 & 16) != 0 ? null : num2, (i12 & 32) != 0 ? null : num3, (i12 & 64) != 0 ? null : num4, (i12 & 128) == 0 ? num5 : null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ShareGroupQRCardModuleView(Context context, AttributeSet attributeSet, int i11, Integer num, Integer num2, Integer num3, Integer num4, Integer num5) {
        super(context, attributeSet, i11, new C24678b(context, num, num2, num3, num4, num5));
        AbstractC19074t.m100208f(context, "context");
    }
}
