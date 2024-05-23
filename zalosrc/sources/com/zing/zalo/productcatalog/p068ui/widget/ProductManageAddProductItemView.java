package com.zing.zalo.productcatalog.p068ui.widget;

import android.content.Context;
import android.transition.ChangeBounds;
import android.transition.TransitionManager;
import android.util.AttributeSet;
import android.view.View;
import com.zing.zalo.productcatalog.p068ui.widget.ProductManageAddProductItemView;
import fn0.AbstractC19074t;
import p115dy.AbstractC18129y0;
import p661xx.AbstractC30220f;
import p661xx.InterfaceC30221g;
import p731zx.AbstractC32582l;

/* loaded from: classes4.dex */
public final class ProductManageAddProductItemView extends AddProductItemView {

    /* renamed from: J */
    private InterfaceC30221g f48561J;

    /* renamed from: K */
    private boolean f48562K;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ProductManageAddProductItemView(Context context) {
        this(context, null);
        AbstractC19074t.m100208f(context, "context");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: q */
    public static final void m48553q(AbstractC18129y0.a aVar, ProductManageAddProductItemView productManageAddProductItemView, View view) {
        InterfaceC30221g interfaceC30221g;
        AbstractC19074t.m100208f(aVar, "$productItem");
        AbstractC19074t.m100208f(productManageAddProductItemView, "this$0");
        if (aVar.m96419h() && (interfaceC30221g = productManageAddProductItemView.f48561J) != null) {
            interfaceC30221g.mo48798ne(AbstractC30220f.a.f140364a);
        }
    }

    public final InterfaceC30221g getActionHandler() {
        return this.f48561J;
    }

    /* renamed from: p */
    public final void m48554p(final AbstractC18129y0.a aVar) {
        AbstractC19074t.m100208f(aVar, "productItem");
        setIdTracking("ProductManageView-AddProduct");
        if (this.f48562K != aVar.m96415d()) {
            ChangeBounds changeBounds = new ChangeBounds();
            changeBounds.setDuration(250L);
            TransitionManager.beginDelayedTransition(this, changeBounds);
        }
        boolean m96415d = aVar.m96415d();
        this.f48562K = m96415d;
        if (m96415d) {
            getCheckbox().setVisibility(4);
        } else {
            getCheckbox().setVisibility(8);
        }
        AbstractC32582l.m157713a(this, aVar.m96413b());
        if (aVar.m96419h()) {
            setStateEnable(true);
            setOnClickListener(new View.OnClickListener() { // from class: zx.m
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    ProductManageAddProductItemView.m48553q(AbstractC18129y0.a.this, this, view);
                }
            });
        } else {
            setStateEnable(false);
            setOnClickListener(null);
        }
    }

    public final void setActionHandler(InterfaceC30221g interfaceC30221g) {
        this.f48561J = interfaceC30221g;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ProductManageAddProductItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        AbstractC19074t.m100208f(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProductManageAddProductItemView(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        AbstractC19074t.m100208f(context, "context");
    }
}
