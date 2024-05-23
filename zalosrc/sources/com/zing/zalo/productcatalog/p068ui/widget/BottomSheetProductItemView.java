package com.zing.zalo.productcatalog.p068ui.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RelativeLayout;
import com.zing.zalo.productcatalog.p068ui.widget.BottomSheetProductItemView;
import com.zing.zalo.zdesign.component.CheckBox;
import fn0.AbstractC19074t;
import p115dy.AbstractC18129y0;
import p661xx.AbstractC30220f;
import p661xx.InterfaceC30221g;
import p731zx.AbstractC32582l;

/* loaded from: classes4.dex */
public final class BottomSheetProductItemView extends BaseProductItemView {

    /* renamed from: L */
    private final CheckBox f48535L;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public BottomSheetProductItemView(Context context) {
        this(context, null);
        AbstractC19074t.m100208f(context, "context");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: w */
    public static final void m48529w(AbstractC18129y0.i iVar, BottomSheetProductItemView bottomSheetProductItemView, View view) {
        AbstractC19074t.m100208f(iVar, "$productItem");
        AbstractC19074t.m100208f(bottomSheetProductItemView, "this$0");
        if (iVar.m96412a()) {
            InterfaceC30221g actionHandler = bottomSheetProductItemView.getActionHandler();
            if (actionHandler != null) {
                actionHandler.mo48798ne(new AbstractC30220f.e(iVar));
            }
            bottomSheetProductItemView.f48535L.m90551f(iVar.m96422i(), false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: x */
    public static final boolean m48530x(BottomSheetProductItemView bottomSheetProductItemView, AbstractC18129y0.i iVar, View view) {
        AbstractC19074t.m100208f(bottomSheetProductItemView, "this$0");
        AbstractC19074t.m100208f(iVar, "$productItem");
        InterfaceC30221g actionHandler = bottomSheetProductItemView.getActionHandler();
        if (actionHandler != null) {
            actionHandler.mo48798ne(new AbstractC30220f.d(iVar));
            return true;
        }
        return true;
    }

    public final CheckBox getSelectCheckbox() {
        return this.f48535L;
    }

    @Override // com.zing.zalo.productcatalog.p068ui.widget.BaseProductItemView
    /* renamed from: r */
    public void mo48524r(final AbstractC18129y0.i iVar) {
        AbstractC19074t.m100208f(iVar, "productItem");
        super.mo48524r(iVar);
        this.f48535L.setEnabled(iVar.m96412a());
        this.f48535L.m90551f(iVar.m96422i(), false);
        setOnClickListener(new View.OnClickListener() { // from class: zx.c
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                BottomSheetProductItemView.m48529w(AbstractC18129y0.i.this, this, view);
            }
        });
        setOnLongClickListener(new View.OnLongClickListener() { // from class: zx.d
            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view) {
                boolean m48530x;
                m48530x = BottomSheetProductItemView.m48530x(BottomSheetProductItemView.this, iVar, view);
                return m48530x;
            }
        });
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public BottomSheetProductItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        AbstractC19074t.m100208f(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BottomSheetProductItemView(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        AbstractC19074t.m100208f(context, "context");
        m90587c(getImageView());
        CheckBox checkBox = new CheckBox(context);
        this.f48535L = checkBox;
        checkBox.setLayoutParams(new RelativeLayout.LayoutParams(AbstractC32582l.m157714b(), AbstractC32582l.m157714b()));
        checkBox.setClickable(false);
        m90589e(checkBox);
    }
}
