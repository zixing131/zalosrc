package com.zing.zalo.p077ui.chat.widget.jumpbutton;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.zing.zalo.AbstractC6918a0;
import en0.InterfaceC18494a;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import lb0.C22422x;
import me0.AbstractC23136l9;
import pm0.AbstractC24856m;
import pm0.InterfaceC24854k;

/* loaded from: classes5.dex */
public final class ReactJumpFloatingView extends LinearLayout {

    /* renamed from: p */
    private final InterfaceC24854k f61114p;

    /* renamed from: com.zing.zalo.ui.chat.widget.jumpbutton.ReactJumpFloatingView$a */
    /* loaded from: classes5.dex */
    static final class C11756a extends AbstractC19075u implements InterfaceC18494a {
        C11756a() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final ImageView mo12V4() {
            return (ImageView) ReactJumpFloatingView.this.findViewById(AbstractC6918a0.iv_reaction);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ReactJumpFloatingView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        AbstractC19074t.m100208f(context, "context");
    }

    private final ImageView getReactionView() {
        Object value = this.f61114p.getValue();
        AbstractC19074t.m100207e(value, "getValue(...)");
        return (ImageView) value;
    }

    /* renamed from: a */
    public final void m65434a(String str) {
        AbstractC19074t.m100208f(str, "reaction");
        getReactionView().setImageDrawable(new C22422x(str, AbstractC23136l9.m118742r(12.0f)));
    }

    public /* synthetic */ ReactJumpFloatingView(Context context, AttributeSet attributeSet, int i11, int i12, AbstractC19060k abstractC19060k) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReactJumpFloatingView(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        InterfaceC24854k m129210a;
        AbstractC19074t.m100208f(context, "context");
        m129210a = AbstractC24856m.m129210a(new C11756a());
        this.f61114p = m129210a;
    }
}
