package com.zing.zalo.p077ui.chat.widget.jumpbutton;

import android.content.Context;
import android.transition.ChangeBounds;
import android.transition.TransitionManager;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.p077ui.widget.RobotoTextView;
import en0.InterfaceC18494a;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import me0.AbstractC23136l9;
import pm0.AbstractC24856m;
import pm0.InterfaceC24854k;

/* loaded from: classes5.dex */
public final class WhereLeftJumpFloatingView extends LinearLayout {

    /* renamed from: p */
    private final ChangeBounds f61120p;

    /* renamed from: q */
    private final InterfaceC24854k f61121q;

    /* renamed from: com.zing.zalo.ui.chat.widget.jumpbutton.WhereLeftJumpFloatingView$a */
    /* loaded from: classes5.dex */
    static final class C11759a extends AbstractC19075u implements InterfaceC18494a {
        C11759a() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final RobotoTextView mo12V4() {
            return (RobotoTextView) WhereLeftJumpFloatingView.this.findViewById(AbstractC6918a0.tv_content);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public WhereLeftJumpFloatingView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        AbstractC19074t.m100208f(context, "context");
    }

    private final RobotoTextView getContentTextView() {
        Object value = this.f61121q.getValue();
        AbstractC19074t.m100207e(value, "getValue(...)");
        return (RobotoTextView) value;
    }

    /* renamed from: a */
    public final void m65439a() {
        getContentTextView().setVisibility(4);
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        layoutParams.width = AbstractC23136l9.m118742r(36.0f);
        setLayoutParams(layoutParams);
        requestLayout();
        TransitionManager.beginDelayedTransition(this, this.f61120p);
    }

    /* renamed from: b */
    public final void m65440b() {
        getContentTextView().setVisibility(0);
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        layoutParams.width = -2;
        setLayoutParams(layoutParams);
    }

    public /* synthetic */ WhereLeftJumpFloatingView(Context context, AttributeSet attributeSet, int i11, int i12, AbstractC19060k abstractC19060k) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WhereLeftJumpFloatingView(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        InterfaceC24854k m129210a;
        AbstractC19074t.m100208f(context, "context");
        ChangeBounds changeBounds = new ChangeBounds();
        changeBounds.setDuration(300L);
        this.f61120p = changeBounds;
        m129210a = AbstractC24856m.m129210a(new C11759a());
        this.f61121q = m129210a;
    }
}
