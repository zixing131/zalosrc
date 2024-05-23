package com.zing.zalo.productcatalog.p068ui.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;
import bi0.AbstractC2807a;
import com.androidquery.util.RecyclingImageView;
import fn0.AbstractC19074t;
import me0.C23212s8;
import mj0.AbstractC23322a;

/* loaded from: classes4.dex */
public final class BottomSheetCatalogItemView extends BaseCatalogItemView {
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public BottomSheetCatalogItemView(Context context) {
        this(context, null);
        AbstractC19074t.m100208f(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public BottomSheetCatalogItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        AbstractC19074t.m100208f(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BottomSheetCatalogItemView(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        AbstractC19074t.m100208f(context, "context");
        RecyclingImageView recyclingImageView = new RecyclingImageView(context, attributeSet);
        recyclingImageView.setImageResource(AbstractC23322a.zds_ic_chevron_right_line_16);
        recyclingImageView.setColorFilter(C23212s8.m119607o(context, AbstractC2807a.icon_02));
        recyclingImageView.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
        m90589e(recyclingImageView);
    }
}
