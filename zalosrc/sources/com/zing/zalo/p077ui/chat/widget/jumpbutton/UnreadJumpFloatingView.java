package com.zing.zalo.p077ui.chat.widget.jumpbutton;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.p077ui.widget.RobotoTextView;
import en0.InterfaceC18494a;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import pm0.AbstractC24856m;
import pm0.InterfaceC24854k;

/* loaded from: classes5.dex */
public final class UnreadJumpFloatingView extends LinearLayout {

    /* renamed from: p */
    private final InterfaceC24854k f61116p;

    /* renamed from: q */
    private final InterfaceC24854k f61117q;

    /* renamed from: com.zing.zalo.ui.chat.widget.jumpbutton.UnreadJumpFloatingView$a */
    /* loaded from: classes5.dex */
    static final class C11757a extends AbstractC19075u implements InterfaceC18494a {
        C11757a() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final RobotoTextView mo12V4() {
            return (RobotoTextView) UnreadJumpFloatingView.this.findViewById(AbstractC6918a0.tv_has_file_sub_title);
        }
    }

    /* renamed from: com.zing.zalo.ui.chat.widget.jumpbutton.UnreadJumpFloatingView$b */
    /* loaded from: classes5.dex */
    static final class C11758b extends AbstractC19075u implements InterfaceC18494a {
        C11758b() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final RobotoTextView mo12V4() {
            return (RobotoTextView) UnreadJumpFloatingView.this.findViewById(AbstractC6918a0.tv_unread_msg);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public UnreadJumpFloatingView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        AbstractC19074t.m100208f(context, "context");
    }

    private final RobotoTextView getUnreadFileTextView() {
        Object value = this.f61117q.getValue();
        AbstractC19074t.m100207e(value, "getValue(...)");
        return (RobotoTextView) value;
    }

    private final RobotoTextView getUnreadMsgTextView() {
        Object value = this.f61116p.getValue();
        AbstractC19074t.m100207e(value, "getValue(...)");
        return (RobotoTextView) value;
    }

    /* renamed from: a */
    public final void m65436a(boolean z11) {
        int i11;
        getUnreadMsgTextView().setTextStyleBold(z11);
        RobotoTextView unreadFileTextView = getUnreadFileTextView();
        if (z11) {
            i11 = 0;
        } else {
            i11 = 8;
        }
        unreadFileTextView.setVisibility(i11);
    }

    public /* synthetic */ UnreadJumpFloatingView(Context context, AttributeSet attributeSet, int i11, int i12, AbstractC19060k abstractC19060k) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UnreadJumpFloatingView(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        InterfaceC24854k m129210a;
        InterfaceC24854k m129210a2;
        AbstractC19074t.m100208f(context, "context");
        m129210a = AbstractC24856m.m129210a(new C11758b());
        this.f61116p = m129210a;
        m129210a2 = AbstractC24856m.m129210a(new C11757a());
        this.f61117q = m129210a2;
    }
}
