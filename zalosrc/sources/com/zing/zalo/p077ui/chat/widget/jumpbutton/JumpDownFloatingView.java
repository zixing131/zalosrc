package com.zing.zalo.p077ui.chat.widget.jumpbutton;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.p077ui.chat.chatrow.AbstractC11531v0;
import com.zing.zalo.p077ui.widget.RobotoTextView;
import en0.InterfaceC18494a;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import ln0.AbstractC22543l;
import me0.AbstractC23136l9;
import me0.C23081g9;
import pm0.AbstractC24856m;
import pm0.InterfaceC24854k;

/* loaded from: classes5.dex */
public final class JumpDownFloatingView extends FrameLayout {
    public static final C11748a Companion = new C11748a(null);

    /* renamed from: p */
    private int f61099p;

    /* renamed from: q */
    private final InterfaceC24854k f61100q;

    /* renamed from: r */
    private final InterfaceC24854k f61101r;

    /* renamed from: s */
    private final InterfaceC24854k f61102s;

    /* renamed from: com.zing.zalo.ui.chat.widget.jumpbutton.JumpDownFloatingView$a */
    /* loaded from: classes5.dex */
    public static final class C11748a {
        private C11748a() {
        }

        public /* synthetic */ C11748a(AbstractC19060k abstractC19060k) {
            this();
        }
    }

    /* renamed from: com.zing.zalo.ui.chat.widget.jumpbutton.JumpDownFloatingView$b */
    /* loaded from: classes5.dex */
    static final class C11749b extends AbstractC19075u implements InterfaceC18494a {
        C11749b() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final ObjectAnimator mo12V4() {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(JumpDownFloatingView.this, "translationY", 20.0f);
            ofFloat.setDuration(500L);
            ofFloat.setRepeatCount(1);
            ofFloat.setRepeatMode(2);
            return ofFloat;
        }
    }

    /* renamed from: com.zing.zalo.ui.chat.widget.jumpbutton.JumpDownFloatingView$c */
    /* loaded from: classes5.dex */
    static final class C11750c extends AbstractC19075u implements InterfaceC18494a {
        C11750c() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final RobotoTextView mo12V4() {
            return (RobotoTextView) JumpDownFloatingView.this.findViewById(AbstractC6918a0.tv_count);
        }
    }

    /* renamed from: com.zing.zalo.ui.chat.widget.jumpbutton.JumpDownFloatingView$d */
    /* loaded from: classes5.dex */
    static final class C11751d extends AbstractC19075u implements InterfaceC18494a {
        C11751d() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final ImageView mo12V4() {
            return (ImageView) JumpDownFloatingView.this.findViewById(AbstractC6918a0.iv_icon);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public JumpDownFloatingView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        AbstractC19074t.m100208f(context, "context");
    }

    private final String getCountText() {
        int i11 = this.f61099p;
        if (i11 > 999) {
            String m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_unread_over);
            AbstractC19074t.m100207e(m118743r0, "getString(...)");
            return m118743r0;
        }
        return String.valueOf(i11);
    }

    private final RobotoTextView getCountTextView() {
        Object value = this.f61100q.getValue();
        AbstractC19074t.m100207e(value, "getValue(...)");
        return (RobotoTextView) value;
    }

    private final ImageView getIconImageView() {
        Object value = this.f61101r.getValue();
        AbstractC19074t.m100207e(value, "getValue(...)");
        return (ImageView) value;
    }

    /* renamed from: a */
    public final void m65421a() {
        C23081g9.m118410g(50L);
        getAnimation().start();
    }

    /* renamed from: b */
    public final void m65422b(int i11) {
        int m116584g;
        m116584g = AbstractC22543l.m116584g(i11, 1000);
        if (this.f61099p == m116584g) {
            return;
        }
        this.f61099p = m116584g;
        if (m116584g == 0) {
            getCountTextView().setVisibility(8);
            getIconImageView().setBackground(AbstractC11531v0.Companion.m62516M0());
        } else {
            getCountTextView().setVisibility(0);
            getCountTextView().setText(getCountText());
            getIconImageView().setBackground(AbstractC11531v0.Companion.m62519N0());
        }
        invalidate();
    }

    @Override // android.view.View
    public final ObjectAnimator getAnimation() {
        Object value = this.f61102s.getValue();
        AbstractC19074t.m100207e(value, "getValue(...)");
        return (ObjectAnimator) value;
    }

    public /* synthetic */ JumpDownFloatingView(Context context, AttributeSet attributeSet, int i11, int i12, AbstractC19060k abstractC19060k) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public JumpDownFloatingView(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        InterfaceC24854k m129210a;
        InterfaceC24854k m129210a2;
        InterfaceC24854k m129210a3;
        AbstractC19074t.m100208f(context, "context");
        m129210a = AbstractC24856m.m129210a(new C11750c());
        this.f61100q = m129210a;
        m129210a2 = AbstractC24856m.m129210a(new C11751d());
        this.f61101r = m129210a2;
        m129210a3 = AbstractC24856m.m129210a(new C11749b());
        this.f61102s = m129210a3;
    }
}
