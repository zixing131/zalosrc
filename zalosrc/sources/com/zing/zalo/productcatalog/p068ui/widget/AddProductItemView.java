package com.zing.zalo.productcatalog.p068ui.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.ImageView;
import bi0.AbstractC2807a;
import com.androidquery.util.RecyclingImageView;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.p077ui.widget.imageview.RoundCornerImageView;
import com.zing.zalo.zdesign.component.EnumC16952b0;
import com.zing.zalo.zdesign.component.ListItem;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import me0.AbstractC23222t7;
import me0.AbstractC23265y;
import me0.C23212s8;
import mj0.AbstractC23322a;
import ui0.C27280g;

/* loaded from: classes4.dex */
public class AddProductItemView extends ListItem {
    public static final C9059a Companion = new C9059a(null);

    /* renamed from: H */
    private static final int f48522H = AbstractC23222t7.f112539R;

    /* renamed from: I */
    private static final int f48523I = AbstractC23222t7.f112514B;

    /* renamed from: G */
    private final RecyclingImageView f48524G;

    /* renamed from: com.zing.zalo.productcatalog.ui.widget.AddProductItemView$a */
    /* loaded from: classes4.dex */
    public static final class C9059a {
        private C9059a() {
        }

        public /* synthetic */ C9059a(AbstractC19060k abstractC19060k) {
            this();
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AddProductItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        AbstractC19074t.m100208f(context, "context");
    }

    public final RecyclingImageView getImageView() {
        return this.f48524G;
    }

    public final void setStateEnable(boolean z11) {
        float f11;
        if (z11) {
            f11 = 1.0f;
        } else {
            f11 = 0.5f;
        }
        this.f48524G.setAlpha(f11);
        if (z11) {
            setTitleColor(C23212s8.m119607o(getContext(), AbstractC2807a.selected));
        } else {
            setTitleColor(AbstractC23265y.m120022i(C23212s8.m119607o(getContext(), AbstractC2807a.selected), (int) (f11 * 255)));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AddProductItemView(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        AbstractC19074t.m100208f(context, "context");
        setTitleColor(C23212s8.m119607o(context, AbstractC2807a.selected));
        setTitleStyleBold(true);
        String string = getResources().getString(AbstractC8020f0.product_catalog_manage_item_add_product);
        AbstractC19074t.m100207e(string, "getString(...)");
        setTitle(string);
        setLeadingGravity(EnumC16952b0.CENTER);
        RoundCornerImageView roundCornerImageView = new RoundCornerImageView(context, null);
        roundCornerImageView.setScaleType(ImageView.ScaleType.CENTER);
        roundCornerImageView.setRoundRadius(AbstractC23222t7.f112556e);
        roundCornerImageView.setRoundCornerColor(C23212s8.m119607o(context, AbstractC2807a.ui_background));
        roundCornerImageView.setBackgroundColor(C23212s8.m119607o(context, AbstractC2807a.ui_background_highlighted));
        roundCornerImageView.setImageDrawable(C27280g.m139660c(context, AbstractC23322a.zds_ic_plus_line_24, AbstractC2807a.selected));
        this.f48524G = roundCornerImageView;
        int i12 = f48522H;
        roundCornerImageView.setLayoutParams(new ViewGroup.LayoutParams(i12, i12));
        m90587c(roundCornerImageView);
    }
}
