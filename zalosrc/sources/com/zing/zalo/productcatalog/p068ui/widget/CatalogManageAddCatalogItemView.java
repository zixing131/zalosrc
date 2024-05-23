package com.zing.zalo.productcatalog.p068ui.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import com.zing.zalo.productcatalog.p068ui.widget.CatalogManageAddCatalogItemView;
import fn0.AbstractC19074t;
import p115dy.AbstractC18088e;
import p661xx.AbstractC30215a;
import p661xx.InterfaceC30216b;
import p731zx.AbstractC32582l;

/* loaded from: classes4.dex */
public final class CatalogManageAddCatalogItemView extends AddCatalogItemView {

    /* renamed from: J */
    private InterfaceC30216b f48536J;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CatalogManageAddCatalogItemView(Context context) {
        this(context, null);
        AbstractC19074t.m100208f(context, "context");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: q */
    public static final void m48532q(CatalogManageAddCatalogItemView catalogManageAddCatalogItemView, View view) {
        AbstractC19074t.m100208f(catalogManageAddCatalogItemView, "this$0");
        InterfaceC30216b interfaceC30216b = catalogManageAddCatalogItemView.f48536J;
        if (interfaceC30216b != null) {
            interfaceC30216b.mo48669vf(AbstractC30215a.a.f140356a);
        }
    }

    public final InterfaceC30216b getActionHandler() {
        return this.f48536J;
    }

    /* renamed from: p */
    public final void m48533p(AbstractC18088e.a aVar) {
        AbstractC19074t.m100208f(aVar, "catalogItem");
        setIdTracking("CatalogManageView-AddCatalog");
        AbstractC32582l.m157713a(this, aVar.m96244a());
        if (aVar.m96247d()) {
            setStateEnable(true);
            setOnClickListener(new View.OnClickListener() { // from class: zx.e
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    CatalogManageAddCatalogItemView.m48532q(CatalogManageAddCatalogItemView.this, view);
                }
            });
        } else {
            setStateEnable(false);
            setOnClickListener(null);
        }
    }

    public final void setActionHandler(InterfaceC30216b interfaceC30216b) {
        this.f48536J = interfaceC30216b;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CatalogManageAddCatalogItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        AbstractC19074t.m100208f(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CatalogManageAddCatalogItemView(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        AbstractC19074t.m100208f(context, "context");
    }
}
