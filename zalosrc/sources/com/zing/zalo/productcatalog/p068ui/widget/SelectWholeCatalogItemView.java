package com.zing.zalo.productcatalog.p068ui.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RelativeLayout;
import bi0.AbstractC2807a;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.productcatalog.p068ui.widget.SelectWholeCatalogItemView;
import com.zing.zalo.zdesign.component.CheckBox;
import com.zing.zalo.zdesign.component.ListItem;
import fn0.AbstractC19074t;
import me0.C23212s8;
import p115dy.AbstractC18129y0;
import p661xx.AbstractC30220f;
import p661xx.InterfaceC30221g;
import p731zx.AbstractC32582l;

/* loaded from: classes4.dex */
public class SelectWholeCatalogItemView extends ListItem {

    /* renamed from: G */
    private InterfaceC30221g f48563G;

    /* renamed from: H */
    private final CheckBox f48564H;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SelectWholeCatalogItemView(Context context) {
        this(context, null);
        AbstractC19074t.m100208f(context, "context");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: q */
    public static final void m48556q(SelectWholeCatalogItemView selectWholeCatalogItemView, AbstractC18129y0.j jVar, View view) {
        AbstractC19074t.m100208f(selectWholeCatalogItemView, "this$0");
        AbstractC19074t.m100208f(jVar, "$selectWholeCatalogItem");
        InterfaceC30221g interfaceC30221g = selectWholeCatalogItemView.f48563G;
        if (interfaceC30221g != null) {
            interfaceC30221g.mo48798ne(new AbstractC30220f.h(jVar));
        }
        selectWholeCatalogItemView.f48564H.setChecked(jVar.m96424h());
    }

    public final InterfaceC30221g getActionHandler() {
        return this.f48563G;
    }

    public final CheckBox getSelectCheckbox() {
        return this.f48564H;
    }

    /* renamed from: p */
    public final void m48557p(final AbstractC18129y0.j jVar) {
        AbstractC19074t.m100208f(jVar, "selectWholeCatalogItem");
        setIdTracking("select_whole_catalog");
        AbstractC32582l.m157713a(this, jVar.m96413b());
        String string = getContext().getResources().getString(AbstractC8020f0.product_catalog_send_catalog);
        AbstractC19074t.m100207e(string, "getString(...)");
        setTitle(string);
        this.f48564H.m90551f(jVar.m96424h(), false);
        setOnClickListener(new View.OnClickListener() { // from class: zx.n
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SelectWholeCatalogItemView.m48556q(SelectWholeCatalogItemView.this, jVar, view);
            }
        });
    }

    public final void setActionHandler(InterfaceC30221g interfaceC30221g) {
        this.f48563G = interfaceC30221g;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SelectWholeCatalogItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        AbstractC19074t.m100208f(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SelectWholeCatalogItemView(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        AbstractC19074t.m100208f(context, "context");
        setTitleStyleBold(true);
        setTitleColor(C23212s8.m119607o(context, AbstractC2807a.text_01));
        CheckBox checkBox = new CheckBox(context);
        this.f48564H = checkBox;
        checkBox.setLayoutParams(new RelativeLayout.LayoutParams(AbstractC32582l.m157714b(), AbstractC32582l.m157714b()));
        checkBox.setClickable(false);
        m90589e(checkBox);
    }
}
