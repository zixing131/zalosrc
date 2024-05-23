package com.zing.zalo.productcatalog.p068ui.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import bi0.AbstractC2807a;
import com.androidquery.util.C3979l;
import com.androidquery.util.InterfaceC3968a;
import com.androidquery.util.RecyclingImageView;
import com.zing.zalo.AbstractC16803z;
import com.zing.zalo.p077ui.widget.imageview.RoundCornerImageView;
import com.zing.zalo.productcatalog.p068ui.widget.BaseCatalogItemView;
import com.zing.zalo.zdesign.component.EnumC16952b0;
import com.zing.zalo.zdesign.component.ListItem;
import com.zing.zalo.zmedia.player.ZMediaPlayer;
import fn0.AbstractC19074t;
import me0.AbstractC23222t7;
import me0.C23212s8;
import me0.C23278z2;
import p115dy.AbstractC18088e;
import p262jb.AbstractC21196a;
import p354n3.C23528a;
import p379o3.C23995f;
import p379o3.C23999j;
import p661xx.AbstractC30215a;
import p661xx.InterfaceC30216b;
import p731zx.AbstractC32582l;

/* loaded from: classes4.dex */
public class BaseCatalogItemView extends ListItem {

    /* renamed from: G */
    private final C23528a f48525G;

    /* renamed from: H */
    private final RecyclingImageView f48526H;

    /* renamed from: I */
    private AbstractC18088e.c f48527I;

    /* renamed from: J */
    private InterfaceC30216b f48528J;

    /* renamed from: com.zing.zalo.productcatalog.ui.widget.BaseCatalogItemView$a */
    /* loaded from: classes4.dex */
    public static final class C9060a extends C23999j {
        C9060a() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // p379o3.C23999j
        /* renamed from: O1 */
        public void mo473O1(String str, InterfaceC3968a interfaceC3968a, C3979l c3979l, C23995f c23995f) {
            AbstractC19074t.m100208f(str, ZMediaPlayer.OnNativeInvokeListener.ARG_URL);
            AbstractC19074t.m100208f(interfaceC3968a, "iv");
            AbstractC19074t.m100208f(c23995f, "status");
            super.mo473O1(str, interfaceC3968a, c3979l, c23995f);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public BaseCatalogItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        AbstractC19074t.m100208f(context, "context");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: q */
    public static final void m48518q(BaseCatalogItemView baseCatalogItemView, AbstractC18088e.c cVar, View view) {
        AbstractC19074t.m100208f(baseCatalogItemView, "this$0");
        AbstractC19074t.m100208f(cVar, "$catalogItem");
        InterfaceC30216b interfaceC30216b = baseCatalogItemView.f48528J;
        if (interfaceC30216b != null) {
            interfaceC30216b.mo48669vf(new AbstractC30215a.d(cVar));
        }
    }

    public final InterfaceC30216b getActionHandler() {
        return this.f48528J;
    }

    public final AbstractC18088e.c getCatalogItem() {
        return this.f48527I;
    }

    public final RecyclingImageView getImageView() {
        return this.f48526H;
    }

    /* renamed from: p */
    public final void m48519p(final AbstractC18088e.c cVar) {
        AbstractC19074t.m100208f(cVar, "catalogItem");
        this.f48527I = cVar;
        setIdTracking(String.valueOf(cVar.m96249d().m146158m()));
        AbstractC32582l.m157713a(this, cVar.m96244a());
        setTitle(cVar.m96252g());
        setSubtitle(cVar.m96250e());
        String m96251f = cVar.m96251f();
        if (m96251f.length() == 0) {
            this.f48526H.setImageResource(AbstractC16803z.ic_product_catalog_default_thumb);
        } else {
            ((C23528a) this.f48525G.m123612r(this.f48526H)).m123579C(m96251f, C23278z2.m120066E(), new C9060a());
        }
        setOnClickListener(new View.OnClickListener() { // from class: zx.a
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                BaseCatalogItemView.m48518q(BaseCatalogItemView.this, cVar, view);
            }
        });
    }

    public final void setActionHandler(InterfaceC30216b interfaceC30216b) {
        this.f48528J = interfaceC30216b;
    }

    public final void setCatalogItem(AbstractC18088e.c cVar) {
        this.f48527I = cVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BaseCatalogItemView(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        AbstractC19074t.m100208f(context, "context");
        setTitleMaxLine(2);
        setTitleColor(C23212s8.m119607o(context, AbstractC21196a.TextColor1));
        setSubtitleColor(C23212s8.m119607o(context, AbstractC21196a.TextColor2));
        EnumC16952b0 enumC16952b0 = EnumC16952b0.CENTER;
        setLeadingGravity(enumC16952b0);
        setTrailingGravity(enumC16952b0);
        this.f48525G = new C23528a(context);
        RoundCornerImageView roundCornerImageView = new RoundCornerImageView(context, null);
        roundCornerImageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        roundCornerImageView.setRoundRadius(AbstractC23222t7.f112556e);
        roundCornerImageView.setRoundCornerColor(C23212s8.m119607o(context, AbstractC2807a.ui_background));
        this.f48526H = roundCornerImageView;
        roundCornerImageView.setLayoutParams(new ViewGroup.LayoutParams(AbstractC32582l.m157715c(), AbstractC32582l.m157715c()));
        m90587c(roundCornerImageView);
    }
}
