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
import com.zing.zalo.productcatalog.p068ui.widget.PickCatalogItemView;
import com.zing.zalo.zdesign.component.EnumC16952b0;
import com.zing.zalo.zdesign.component.ListItem;
import com.zing.zalo.zmedia.player.ZMediaPlayer;
import fn0.AbstractC19074t;
import me0.AbstractC23222t7;
import me0.C23212s8;
import me0.C23278z2;
import mj0.AbstractC23322a;
import p115dy.AbstractC18104m;
import p262jb.AbstractC21196a;
import p354n3.C23528a;
import p379o3.C23995f;
import p379o3.C23999j;
import p661xx.AbstractC30217c;
import p661xx.InterfaceC30218d;
import p731zx.AbstractC32582l;
import ui0.C27280g;

/* loaded from: classes4.dex */
public final class PickCatalogItemView extends ListItem {

    /* renamed from: G */
    private final C23528a f48541G;

    /* renamed from: H */
    private final RecyclingImageView f48542H;

    /* renamed from: I */
    private AbstractC18104m.a f48543I;

    /* renamed from: J */
    private InterfaceC30218d f48544J;

    /* renamed from: com.zing.zalo.productcatalog.ui.widget.PickCatalogItemView$a */
    /* loaded from: classes4.dex */
    public static final class C9063a extends C23999j {
        C9063a() {
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
    public PickCatalogItemView(Context context) {
        this(context, null);
        AbstractC19074t.m100208f(context, "context");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: q */
    public static final void m48544q(PickCatalogItemView pickCatalogItemView, AbstractC18104m.a aVar, View view) {
        AbstractC19074t.m100208f(pickCatalogItemView, "this$0");
        AbstractC19074t.m100208f(aVar, "$catalogItem");
        InterfaceC30218d interfaceC30218d = pickCatalogItemView.f48544J;
        if (interfaceC30218d != null) {
            interfaceC30218d.mo48620Zz(new AbstractC30217c.a(aVar));
        }
    }

    public final InterfaceC30218d getActionHandler() {
        return this.f48544J;
    }

    /* renamed from: p */
    public final void m48545p(final AbstractC18104m.a aVar) {
        int i11;
        AbstractC19074t.m100208f(aVar, "catalogItem");
        this.f48543I = aVar;
        setIdTracking(String.valueOf(aVar.m96302f().m146158m()));
        m90592m(aVar.m96298b());
        setTitle(aVar.m96305i());
        setSubtitle(aVar.m96303g());
        String m96304h = aVar.m96304h();
        if (m96304h.length() == 0) {
            this.f48542H.setImageResource(AbstractC16803z.ic_product_catalog_default_thumb);
        } else {
            ((C23528a) this.f48541G.m123612r(this.f48542H)).m123579C(m96304h, C23278z2.m120066E(), new C9063a());
        }
        ImageView iconChevronRight = getIconChevronRight();
        if (aVar.m96299c()) {
            i11 = 0;
        } else {
            i11 = 8;
        }
        iconChevronRight.setVisibility(i11);
        setOnClickListener(new View.OnClickListener() { // from class: zx.j
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                PickCatalogItemView.m48544q(PickCatalogItemView.this, aVar, view);
            }
        });
    }

    public final void setActionHandler(InterfaceC30218d interfaceC30218d) {
        this.f48544J = interfaceC30218d;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public PickCatalogItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        AbstractC19074t.m100208f(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PickCatalogItemView(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        AbstractC19074t.m100208f(context, "context");
        setTitleMaxLine(2);
        setTitleColor(C23212s8.m119607o(context, AbstractC21196a.TextColor1));
        setSubtitleColor(C23212s8.m119607o(context, AbstractC21196a.TextColor2));
        EnumC16952b0 enumC16952b0 = EnumC16952b0.CENTER;
        setLeadingGravity(enumC16952b0);
        setTrailingGravity(enumC16952b0);
        this.f48541G = new C23528a(context);
        RoundCornerImageView roundCornerImageView = new RoundCornerImageView(context, null);
        roundCornerImageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        roundCornerImageView.setRoundRadius(AbstractC23222t7.f112556e);
        roundCornerImageView.setRoundCornerColor(C23212s8.m119607o(context, AbstractC2807a.ui_background));
        this.f48542H = roundCornerImageView;
        roundCornerImageView.setLayoutParams(new ViewGroup.LayoutParams(AbstractC32582l.m157715c(), AbstractC32582l.m157715c()));
        m90587c(roundCornerImageView);
        getIconChevronRight().setImageDrawable(C27280g.m139660c(context, AbstractC23322a.zds_ic_check_line_16, AbstractC2807a.selected));
    }
}
