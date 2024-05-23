package com.zing.zalo.productcatalog.p068ui.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import com.zing.zalo.productcatalog.p068ui.widget.CatalogManageAddProductItemView;
import fn0.AbstractC19074t;
import p115dy.AbstractC18088e;
import p661xx.AbstractC30215a;
import p661xx.InterfaceC30216b;
import p731zx.AbstractC32582l;

/* loaded from: classes4.dex */
public final class CatalogManageAddProductItemView extends AddProductItemView {

    /* renamed from: J */
    private InterfaceC30216b f48537J;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CatalogManageAddProductItemView(Context context) {
        this(context, null);
        AbstractC19074t.m100208f(context, "context");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: q */
    public static final void m48535q(CatalogManageAddProductItemView catalogManageAddProductItemView, View view) {
        AbstractC19074t.m100208f(catalogManageAddProductItemView, "this$0");
        InterfaceC30216b interfaceC30216b = catalogManageAddProductItemView.f48537J;
        if (interfaceC30216b != null) {
            interfaceC30216b.mo48669vf(AbstractC30215a.c.f140358a);
        }
    }

    public final InterfaceC30216b getActionHandler() {
        return this.f48537J;
    }

    /* renamed from: p */
    public final void m48536p(AbstractC18088e.b bVar) {
        AbstractC19074t.m100208f(bVar, "catalogItem");
        setIdTracking("CatalogManageView-AddProduct");
        AbstractC32582l.m157713a(this, bVar.m96244a());
        if (bVar.m96248d()) {
            setStateEnable(true);
            setOnClickListener(new View.OnClickListener() { // from class: zx.f
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    CatalogManageAddProductItemView.m48535q(CatalogManageAddProductItemView.this, view);
                }
            });
        } else {
            setStateEnable(false);
            setOnClickListener(null);
        }
    }

    public final void setActionHandler(InterfaceC30216b interfaceC30216b) {
        this.f48537J = interfaceC30216b;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CatalogManageAddProductItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        AbstractC19074t.m100208f(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CatalogManageAddProductItemView(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        AbstractC19074t.m100208f(context, "context");
    }
}
