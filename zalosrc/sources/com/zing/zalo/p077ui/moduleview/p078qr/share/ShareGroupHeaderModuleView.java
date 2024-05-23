package com.zing.zalo.p077ui.moduleview.p078qr.share;

import android.content.Context;
import android.util.AttributeSet;
import com.zing.zalo.p077ui.moduleview.DecorModuleView;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import p80.C24677a;

/* loaded from: classes6.dex */
public final class ShareGroupHeaderModuleView extends DecorModuleView<C24677a> {
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ShareGroupHeaderModuleView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        AbstractC19074t.m100208f(context, "context");
    }

    public /* synthetic */ ShareGroupHeaderModuleView(Context context, AttributeSet attributeSet, int i11, int i12, AbstractC19060k abstractC19060k) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ShareGroupHeaderModuleView(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11, new C24677a(context));
        AbstractC19074t.m100208f(context, "context");
    }
}
