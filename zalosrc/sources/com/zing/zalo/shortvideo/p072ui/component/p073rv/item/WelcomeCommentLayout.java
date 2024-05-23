package com.zing.zalo.shortvideo.p072ui.component.p073rv.item;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import en0.InterfaceC18494a;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import ln0.AbstractC22543l;
import pm0.AbstractC24856m;
import pm0.InterfaceC24854k;
import s20.AbstractC26105g;
import s20.AbstractC26112n;
import v00.AbstractC27409d;

/* loaded from: classes5.dex */
public final class WelcomeCommentLayout extends FrameLayout {

    /* renamed from: p */
    private final InterfaceC24854k f51059p;

    /* renamed from: q */
    private final InterfaceC24854k f51060q;

    /* renamed from: r */
    private final InterfaceC24854k f51061r;

    /* renamed from: s */
    private final InterfaceC24854k f51062s;

    /* renamed from: t */
    private final InterfaceC24854k f51063t;

    /* renamed from: u */
    private final InterfaceC24854k f51064u;

    /* renamed from: com.zing.zalo.shortvideo.ui.component.rv.item.WelcomeCommentLayout$a */
    /* loaded from: classes5.dex */
    static final class C9692a extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final C9692a f51065q = new C9692a();

        C9692a() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Integer mo12V4() {
            return Integer.valueOf(AbstractC26105g.m134347n(8));
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.component.rv.item.WelcomeCommentLayout$b */
    /* loaded from: classes5.dex */
    static final class C9693b extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final C9693b f51066q = new C9693b();

        C9693b() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Integer mo12V4() {
            return Integer.valueOf(AbstractC26105g.m134347n(28));
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.component.rv.item.WelcomeCommentLayout$c */
    /* loaded from: classes5.dex */
    static final class C9694c extends AbstractC19075u implements InterfaceC18494a {
        C9694c() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final View mo12V4() {
            return WelcomeCommentLayout.this.findViewById(AbstractC27409d.ivIcon);
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.component.rv.item.WelcomeCommentLayout$d */
    /* loaded from: classes5.dex */
    static final class C9695d extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final C9695d f51068q = new C9695d();

        C9695d() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Integer mo12V4() {
            return Integer.valueOf(AbstractC26105g.m134347n(16));
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.component.rv.item.WelcomeCommentLayout$e */
    /* loaded from: classes5.dex */
    static final class C9696e extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final C9696e f51069q = new C9696e();

        C9696e() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Integer mo12V4() {
            return Integer.valueOf(AbstractC26105g.m134347n(12));
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.component.rv.item.WelcomeCommentLayout$f */
    /* loaded from: classes5.dex */
    static final class C9697f extends AbstractC19075u implements InterfaceC18494a {
        C9697f() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final View mo12V4() {
            return WelcomeCommentLayout.this.findViewById(AbstractC27409d.txtContent);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WelcomeCommentLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        InterfaceC24854k m129210a;
        InterfaceC24854k m129210a2;
        InterfaceC24854k m129210a3;
        InterfaceC24854k m129210a4;
        InterfaceC24854k m129210a5;
        InterfaceC24854k m129210a6;
        AbstractC19074t.m100208f(context, "context");
        m129210a = AbstractC24856m.m129210a(new C9694c());
        this.f51059p = m129210a;
        m129210a2 = AbstractC24856m.m129210a(new C9697f());
        this.f51060q = m129210a2;
        m129210a3 = AbstractC24856m.m129210a(C9693b.f51066q);
        this.f51061r = m129210a3;
        m129210a4 = AbstractC24856m.m129210a(C9695d.f51068q);
        this.f51062s = m129210a4;
        m129210a5 = AbstractC24856m.m129210a(C9696e.f51069q);
        this.f51063t = m129210a5;
        m129210a6 = AbstractC24856m.m129210a(C9692a.f51065q);
        this.f51064u = m129210a6;
    }

    private final int getAvatarToName() {
        return ((Number) this.f51064u.getValue()).intValue();
    }

    private final int getIconSize() {
        return ((Number) this.f51061r.getValue()).intValue();
    }

    private final View getIvIcon() {
        Object value = this.f51059p.getValue();
        AbstractC19074t.m100207e(value, "getValue(...)");
        return (View) value;
    }

    private final int getPaddingH() {
        return ((Number) this.f51062s.getValue()).intValue();
    }

    private final int getPaddingV() {
        return ((Number) this.f51063t.getValue()).intValue();
    }

    private final View getTxtContent() {
        Object value = this.f51060q.getValue();
        AbstractC19074t.m100207e(value, "getValue(...)");
        return (View) value;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z11, int i11, int i12, int i13, int i14) {
        int measuredHeight = (getMeasuredHeight() - getTxtContent().getMeasuredHeight()) / 2;
        int measuredHeight2 = (getMeasuredHeight() - getIvIcon().getMeasuredHeight()) / 2;
        if (getIvIcon().getMeasuredHeight() > getTxtContent().getMeasuredHeight()) {
            AbstractC26112n.m134383X(getIvIcon(), measuredHeight2, getPaddingH());
            AbstractC26112n.m134383X(getTxtContent(), measuredHeight, getIvIcon().getMeasuredWidth() + getPaddingH() + getAvatarToName());
        } else {
            AbstractC26112n.m134383X(getTxtContent(), measuredHeight, getIvIcon().getMeasuredWidth() + getPaddingH() + getAvatarToName());
            AbstractC26112n.m134383X(getIvIcon(), getTxtContent().getTop() + AbstractC26105g.m134347n(3), getPaddingH());
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int i11, int i12) {
        int m116580c;
        int size = View.MeasureSpec.getSize(i11);
        if (AbstractC26112n.m134378S(getIvIcon())) {
            AbstractC26112n.m134387a0(getIvIcon(), getIconSize(), 1073741824, getIconSize(), 1073741824);
            getIconSize();
        }
        if (AbstractC26112n.m134378S(getTxtContent())) {
            AbstractC26112n.m134387a0(getTxtContent(), ((size - getAvatarToName()) - getPaddingH()) - getIvIcon().getMeasuredWidth(), 1073741824, 0, 0);
            getIconSize();
        }
        m116580c = AbstractC22543l.m116580c(getPaddingV() + getIvIcon().getMeasuredWidth(), getPaddingV() + getTxtContent().getMeasuredHeight());
        setMeasuredDimension(size, m116580c + AbstractC26105g.m134347n(2));
    }
}
