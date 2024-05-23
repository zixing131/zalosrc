package com.zing.zalo.productcatalog.p068ui.widget;

import android.content.Context;
import android.transition.ChangeBounds;
import android.transition.TransitionManager;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import bi0.AbstractC2807a;
import bi0.AbstractC2809c;
import com.zing.zalo.productcatalog.p068ui.widget.ManageProductItemView;
import fn0.AbstractC19074t;
import me0.C23212s8;
import mj0.AbstractC23322a;
import p115dy.AbstractC18129y0;
import p661xx.AbstractC30220f;
import p661xx.InterfaceC30221g;
import p731zx.AbstractC32582l;

/* loaded from: classes4.dex */
public final class ManageProductItemView extends BaseProductItemView {

    /* renamed from: L */
    private final ImageView f48539L;

    /* renamed from: M */
    private boolean f48540M;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ManageProductItemView(Context context) {
        this(context, null);
        AbstractC19074t.m100208f(context, "context");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: x */
    public static final void m48540x(ManageProductItemView manageProductItemView, View view) {
        InterfaceC30221g actionHandler;
        AbstractC19074t.m100208f(manageProductItemView, "this$0");
        AbstractC18129y0.i productItem = manageProductItemView.getProductItem();
        if (productItem != null && (actionHandler = manageProductItemView.getActionHandler()) != null) {
            actionHandler.mo48798ne(new AbstractC30220f.g(productItem));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: y */
    public static final void m48541y(ManageProductItemView manageProductItemView, AbstractC18129y0.i iVar, View view) {
        AbstractC19074t.m100208f(manageProductItemView, "this$0");
        AbstractC19074t.m100208f(iVar, "$productItem");
        if (manageProductItemView.f48540M) {
            if (iVar.m96412a()) {
                InterfaceC30221g actionHandler = manageProductItemView.getActionHandler();
                if (actionHandler != null) {
                    actionHandler.mo48798ne(new AbstractC30220f.e(iVar));
                }
                manageProductItemView.getCheckbox().setChecked(iVar.m96422i());
                return;
            }
            return;
        }
        InterfaceC30221g actionHandler2 = manageProductItemView.getActionHandler();
        if (actionHandler2 != null) {
            actionHandler2.mo48798ne(new AbstractC30220f.c(iVar));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: z */
    public static final boolean m48542z(ManageProductItemView manageProductItemView, AbstractC18129y0.i iVar, View view) {
        AbstractC19074t.m100208f(manageProductItemView, "this$0");
        AbstractC19074t.m100208f(iVar, "$productItem");
        InterfaceC30221g actionHandler = manageProductItemView.getActionHandler();
        if (actionHandler != null) {
            actionHandler.mo48798ne(new AbstractC30220f.d(iVar));
            return true;
        }
        return true;
    }

    @Override // com.zing.zalo.productcatalog.p068ui.widget.BaseProductItemView
    /* renamed from: r */
    public void mo48524r(final AbstractC18129y0.i iVar) {
        AbstractC19074t.m100208f(iVar, "productItem");
        super.mo48524r(iVar);
        if (this.f48540M != iVar.m96415d()) {
            ChangeBounds changeBounds = new ChangeBounds();
            changeBounds.setDuration(250L);
            TransitionManager.beginDelayedTransition(this, changeBounds);
        }
        boolean m96415d = iVar.m96415d();
        this.f48540M = m96415d;
        if (m96415d) {
            this.f48539L.setVisibility(8);
            getCheckbox().setVisibility(0);
        } else {
            this.f48539L.setVisibility(0);
            getCheckbox().setVisibility(8);
        }
        getCheckbox().setChecked(iVar.m96422i());
        getCheckbox().setEnabled(iVar.m96412a());
        setOnClickListener(new View.OnClickListener() { // from class: zx.h
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ManageProductItemView.m48541y(ManageProductItemView.this, iVar, view);
            }
        });
        setOnLongClickListener(new View.OnLongClickListener() { // from class: zx.i
            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view) {
                boolean m48542z;
                m48542z = ManageProductItemView.m48542z(ManageProductItemView.this, iVar, view);
                return m48542z;
            }
        });
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ManageProductItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        AbstractC19074t.m100208f(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ManageProductItemView(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        AbstractC19074t.m100208f(context, "context");
        m90587c(getImageView());
        ImageView imageView = new ImageView(context);
        imageView.setLayoutParams(new RelativeLayout.LayoutParams(-2, -2));
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(AbstractC2809c.f11265u2);
        imageView.setPadding(dimensionPixelSize, dimensionPixelSize, dimensionPixelSize, dimensionPixelSize);
        imageView.setImageResource(AbstractC23322a.zds_ic_more_horizontal_solid_24);
        imageView.setColorFilter(C23212s8.m119607o(context, AbstractC2807a.icon_01));
        this.f48539L = imageView;
        imageView.setOnClickListener(new View.OnClickListener() { // from class: zx.g
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ManageProductItemView.m48540x(ManageProductItemView.this, view);
            }
        });
        m90589e(imageView);
        ViewGroup.LayoutParams layoutParams = getCheckbox().getLayoutParams();
        layoutParams.width = AbstractC32582l.m157714b();
        layoutParams.height = AbstractC32582l.m157714b();
        getCheckbox().setClickable(false);
    }
}
