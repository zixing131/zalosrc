package com.zing.zalo.productcatalog.p068ui.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import bi0.AbstractC2807a;
import bi0.AbstractC2809c;
import fn0.AbstractC19074t;
import me0.C23212s8;
import mj0.AbstractC23322a;

/* loaded from: classes4.dex */
public final class ManageCatalogItemView extends BaseCatalogItemView {

    /* renamed from: K */
    private final ImageView f48538K;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ManageCatalogItemView(Context context) {
        this(context, null);
        AbstractC19074t.m100208f(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ManageCatalogItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        AbstractC19074t.m100208f(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ManageCatalogItemView(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        AbstractC19074t.m100208f(context, "context");
        ImageView imageView = new ImageView(getContext());
        imageView.setLayoutParams(new RelativeLayout.LayoutParams(-2, -2));
        int dimensionPixelSize = getContext().getResources().getDimensionPixelSize(AbstractC2809c.f11265u2);
        imageView.setPadding(dimensionPixelSize, dimensionPixelSize, dimensionPixelSize, dimensionPixelSize);
        imageView.setImageResource(AbstractC23322a.zds_ic_chevron_right_line_16);
        imageView.setColorFilter(C23212s8.m119607o(getContext(), AbstractC2807a.icon_01));
        this.f48538K = imageView;
        m90589e(imageView);
    }
}
