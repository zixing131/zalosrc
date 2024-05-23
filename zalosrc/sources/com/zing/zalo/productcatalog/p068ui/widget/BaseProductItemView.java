package com.zing.zalo.productcatalog.p068ui.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.ImageView;
import bi0.AbstractC2807a;
import com.androidquery.util.C3979l;
import com.androidquery.util.InterfaceC3968a;
import com.androidquery.util.RecyclingImageView;
import com.zing.zalo.AbstractC16781w;
import com.zing.zalo.AbstractC16803z;
import com.zing.zalo.p077ui.widget.imageview.RoundCornerImageView;
import com.zing.zalo.productcatalog.model.ProductPhoto;
import com.zing.zalo.productcatalog.p068ui.widget.BaseProductItemView;
import com.zing.zalo.productcatalog.utils.AbstractC9183a;
import com.zing.zalo.zdesign.component.EnumC16952b0;
import com.zing.zalo.zdesign.component.ListItem;
import com.zing.zalo.zmedia.player.ZMediaPlayer;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import gg0.AbstractC19444a;
import me0.AbstractC23160o0;
import me0.AbstractC23222t7;
import me0.C23212s8;
import me0.C23278z2;
import p115dy.AbstractC18129y0;
import p262jb.AbstractC21196a;
import p354n3.C23528a;
import p379o3.C23995f;
import p379o3.C23999j;
import p661xx.InterfaceC30221g;
import p731zx.AbstractC32582l;
import qm0.AbstractC25332a0;

/* loaded from: classes4.dex */
public class BaseProductItemView extends ListItem {
    public static final C9061a Companion = new C9061a(null);

    /* renamed from: G */
    private final C23528a f48529G;

    /* renamed from: H */
    private final RecyclingImageView f48530H;

    /* renamed from: I */
    private AbstractC18129y0.i f48531I;

    /* renamed from: J */
    private InterfaceC30221g f48532J;

    /* renamed from: K */
    private int f48533K;

    /* renamed from: com.zing.zalo.productcatalog.ui.widget.BaseProductItemView$a */
    /* loaded from: classes4.dex */
    public static final class C9061a {
        private C9061a() {
        }

        public /* synthetic */ C9061a(AbstractC19060k abstractC19060k) {
            this();
        }
    }

    /* renamed from: com.zing.zalo.productcatalog.ui.widget.BaseProductItemView$b */
    /* loaded from: classes4.dex */
    public static final class C9062b extends C23999j {
        C9062b() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: H3 */
        public static final void m48526H3(BaseProductItemView baseProductItemView) {
            AbstractC19074t.m100208f(baseProductItemView, "this$0");
            baseProductItemView.m48523s();
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // p379o3.C23999j
        /* renamed from: O1 */
        public void mo473O1(String str, InterfaceC3968a interfaceC3968a, C3979l c3979l, C23995f c23995f) {
            AbstractC19074t.m100208f(str, ZMediaPlayer.OnNativeInvokeListener.ARG_URL);
            AbstractC19074t.m100208f(interfaceC3968a, "iv");
            AbstractC19074t.m100208f(c23995f, "status");
            super.mo473O1(str, interfaceC3968a, c3979l, c23995f);
            if (c3979l != null && c3979l.m18849m()) {
                BaseProductItemView.this.f48533K = 0;
                return;
            }
            if (BaseProductItemView.this.f48533K < 3) {
                BaseProductItemView.this.f48533K++;
                final BaseProductItemView baseProductItemView = BaseProductItemView.this;
                AbstractC19444a.m101694b(new Runnable() { // from class: zx.b
                    @Override // java.lang.Runnable
                    public final void run() {
                        BaseProductItemView.C9062b.m48526H3(BaseProductItemView.this);
                    }
                }, AbstractC23160o0.m119261j0(BaseProductItemView.this.f48533K, 2000L));
                return;
            }
            BaseProductItemView.this.getImageView().setImageResource(AbstractC16803z.ic_product_catalog_default_thumb);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public BaseProductItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        AbstractC19074t.m100208f(context, "context");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: s */
    public final void m48523s() {
        Object m131207g0;
        String str;
        AbstractC18129y0.i iVar = this.f48531I;
        if (iVar != null) {
            m131207g0 = AbstractC25332a0.m131207g0(iVar.m96421h().m48479c(), 0);
            ProductPhoto productPhoto = (ProductPhoto) m131207g0;
            if (productPhoto != null) {
                str = productPhoto.m48502a();
            } else {
                str = null;
            }
            if (str != null && str.length() != 0) {
                ((C23528a) this.f48529G.m123612r(this.f48530H)).m123579C(str, C23278z2.m120066E(), new C9062b());
            } else {
                this.f48530H.setImageResource(AbstractC16803z.ic_product_catalog_default_thumb);
            }
        }
    }

    public final InterfaceC30221g getActionHandler() {
        return this.f48532J;
    }

    public final RecyclingImageView getImageView() {
        return this.f48530H;
    }

    public final AbstractC18129y0.i getProductItem() {
        return this.f48531I;
    }

    /* renamed from: r */
    public void mo48524r(AbstractC18129y0.i iVar) {
        Long l11;
        AbstractC19074t.m100208f(iVar, "productItem");
        AbstractC18129y0.i iVar2 = this.f48531I;
        if (iVar2 != null) {
            l11 = Long.valueOf(iVar2.mo96414c());
        } else {
            l11 = null;
        }
        long mo96414c = iVar.mo96414c();
        if (l11 == null || l11.longValue() != mo96414c) {
            this.f48533K = 0;
        }
        this.f48531I = iVar;
        setIdTracking(String.valueOf(iVar.m96421h().m48485i()));
        AbstractC32582l.m157713a(this, iVar.m96413b());
        setTitle(iVar.m96421h().m48488l());
        setSubtitle(AbstractC9183a.m48997e(iVar.m96421h()));
        m48523s();
    }

    public final void setActionHandler(InterfaceC30221g interfaceC30221g) {
        this.f48532J = interfaceC30221g;
    }

    public final void setProductItem(AbstractC18129y0.i iVar) {
        this.f48531I = iVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BaseProductItemView(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        AbstractC19074t.m100208f(context, "context");
        setTitleMaxLine(2);
        setTitleColor(C23212s8.m119607o(context, AbstractC21196a.TextColor1));
        setSubtitleColor(C23212s8.m119607o(context, AbstractC16781w.LinkColor));
        EnumC16952b0 enumC16952b0 = EnumC16952b0.CENTER;
        setLeadingGravity(enumC16952b0);
        setTrailingGravity(enumC16952b0);
        this.f48529G = new C23528a(context);
        RoundCornerImageView roundCornerImageView = new RoundCornerImageView(context, null);
        roundCornerImageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        roundCornerImageView.setRoundRadius(AbstractC23222t7.f112556e);
        roundCornerImageView.setRoundCornerColor(C23212s8.m119607o(context, AbstractC2807a.ui_background));
        this.f48530H = roundCornerImageView;
        roundCornerImageView.setLayoutParams(new ViewGroup.LayoutParams(AbstractC32582l.m157715c(), AbstractC32582l.m157715c()));
    }
}
