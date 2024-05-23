package com.zing.zalo.feed.components;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.text.SpannableString;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import bo.C3054x;
import com.androidquery.util.RecyclingImageView;
import com.zing.zalo.AbstractC16803z;
import com.zing.zalo.social.controls.C10866e;
import com.zing.zalo.social.controls.CustomMovementMethod;
import fn0.AbstractC19074t;
import me0.AbstractC23136l9;
import me0.C23278z2;
import p354n3.C23528a;
import p542ub.InterfaceC27218a;
import p649xl.C30048t6;
import xm0.AbstractC30166b;
import xm0.InterfaceC30165a;

/* loaded from: classes4.dex */
public final class EmptyContentView extends RelativeLayout {

    /* renamed from: p */
    private C30048t6 f44199p;

    /* renamed from: q */
    private InterfaceC8078a f44200q;

    /* renamed from: r */
    private boolean f44201r;

    /* renamed from: s */
    private EnumC8079b f44202s;

    /* renamed from: t */
    private C23528a f44203t;

    /* renamed from: com.zing.zalo.feed.components.EmptyContentView$a */
    /* loaded from: classes4.dex */
    public interface InterfaceC8078a {
        /* renamed from: s */
        void mo43432s(C3054x c3054x);
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* renamed from: com.zing.zalo.feed.components.EmptyContentView$b */
    /* loaded from: classes4.dex */
    public static final class EnumC8079b {

        /* renamed from: p */
        public static final EnumC8079b f44204p = new EnumC8079b("NORMAL", 0);

        /* renamed from: q */
        public static final EnumC8079b f44205q = new EnumC8079b("ZDS_SPACING", 1);

        /* renamed from: r */
        private static final /* synthetic */ EnumC8079b[] f44206r;

        /* renamed from: s */
        private static final /* synthetic */ InterfaceC30165a f44207s;

        static {
            EnumC8079b[] m43612b = m43612b();
            f44206r = m43612b;
            f44207s = AbstractC30166b.m148796a(m43612b);
        }

        private EnumC8079b(String str, int i11) {
        }

        /* renamed from: b */
        private static final /* synthetic */ EnumC8079b[] m43612b() {
            return new EnumC8079b[]{f44204p, f44205q};
        }

        public static EnumC8079b valueOf(String str) {
            return (EnumC8079b) Enum.valueOf(EnumC8079b.class, str);
        }

        public static EnumC8079b[] values() {
            return (EnumC8079b[]) f44206r.clone();
        }
    }

    public EmptyContentView(Context context) {
        super(context);
        this.f44202s = EnumC8079b.f44204p;
        this.f44203t = new C23528a(getContext());
        m43611j(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: f */
    public static final void m43604f(EmptyContentView emptyContentView, C3054x c3054x, View view) {
        AbstractC19074t.m100208f(emptyContentView, "this$0");
        InterfaceC8078a interfaceC8078a = emptyContentView.f44200q;
        if (interfaceC8078a != null) {
            interfaceC8078a.mo43432s(c3054x);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: g */
    public static final void m43605g(EmptyContentView emptyContentView, C3054x c3054x, View view) {
        AbstractC19074t.m100208f(emptyContentView, "this$0");
        InterfaceC8078a interfaceC8078a = emptyContentView.f44200q;
        if (interfaceC8078a != null) {
            interfaceC8078a.mo43432s(c3054x);
        }
    }

    /* renamed from: h */
    private final void m43606h() {
        int i11;
        if (this.f44201r) {
            final C30048t6 c30048t6 = this.f44199p;
            if (c30048t6 == null) {
                AbstractC19074t.m100223u("binding");
                c30048t6 = null;
            }
            if (c30048t6.f139391q.getVisibility() == 0) {
                int[] iArr = new int[2];
                getLocationOnScreen(iArr);
                int i12 = iArr[0];
                int i13 = iArr[1];
                Rect rect = new Rect(i12, i13, c30048t6.f139391q.getRight() + i12, c30048t6.f139391q.getBottom() + i13);
                RecyclingImageView recyclingImageView = c30048t6.f139393s;
                if (rect.bottom > AbstractC23136l9.m118713h0()) {
                    i11 = 8;
                } else {
                    i11 = 0;
                }
                recyclingImageView.setVisibility(i11);
                this.f44201r = false;
                postDelayed(new Runnable() { // from class: com.zing.zalo.feed.components.p0
                    @Override // java.lang.Runnable
                    public final void run() {
                        EmptyContentView.m43607i(C30048t6.this);
                    }
                }, 30L);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: i */
    public static final void m43607i(C30048t6 c30048t6) {
        AbstractC19074t.m100208f(c30048t6, "$this_run");
        c30048t6.f139393s.requestLayout();
        c30048t6.f139393s.invalidate();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: k */
    public static final void m43608k(EmptyContentView emptyContentView, View view, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18) {
        AbstractC19074t.m100208f(emptyContentView, "this$0");
        emptyContentView.m43606h();
    }

    /* renamed from: l */
    private final void m43609l(C30048t6 c30048t6) {
        LinearLayout.LayoutParams layoutParams;
        LinearLayout.LayoutParams layoutParams2;
        if (this.f44202s == EnumC8079b.f44205q) {
            ViewGroup.LayoutParams layoutParams3 = c30048t6.f139393s.getLayoutParams();
            LinearLayout.LayoutParams layoutParams4 = null;
            if (layoutParams3 instanceof LinearLayout.LayoutParams) {
                layoutParams = (LinearLayout.LayoutParams) layoutParams3;
            } else {
                layoutParams = null;
            }
            if (layoutParams != null) {
                layoutParams.topMargin = AbstractC23136l9.m118742r(16.0f);
            }
            ViewGroup.LayoutParams layoutParams5 = c30048t6.f139393s.getLayoutParams();
            if (layoutParams5 instanceof LinearLayout.LayoutParams) {
                layoutParams2 = (LinearLayout.LayoutParams) layoutParams5;
            } else {
                layoutParams2 = null;
            }
            if (layoutParams2 != null) {
                layoutParams2.bottomMargin = AbstractC23136l9.m118742r(16.0f);
            }
            ViewGroup.LayoutParams layoutParams6 = c30048t6.f139396v.getLayoutParams();
            if (layoutParams6 instanceof LinearLayout.LayoutParams) {
                layoutParams4 = (LinearLayout.LayoutParams) layoutParams6;
            }
            if (layoutParams4 != null) {
                layoutParams4.topMargin = AbstractC23136l9.m118742r(8.0f);
            }
            c30048t6.f139391q.setMinWidth(AbstractC23136l9.m118742r(96.0f));
            c30048t6.f139391q.setPadding(AbstractC23136l9.m118742r(24.0f), 0, AbstractC23136l9.m118742r(24.0f), 0);
            c30048t6.f139393s.getLayoutParams().width = AbstractC23136l9.m118742r(140.0f);
            c30048t6.f139393s.getLayoutParams().height = AbstractC23136l9.m118742r(112.0f);
        }
    }

    private final void setActivityForCallbackSpanText(CharSequence charSequence) {
        if (charSequence.length() == 0) {
            return;
        }
        Object context = getContext();
        if ((charSequence instanceof SpannableString) && (context instanceof InterfaceC27218a)) {
            C10866e[] c10866eArr = (C10866e[]) ((SpannableString) charSequence).getSpans(0, charSequence.length(), C10866e.class);
            if (c10866eArr != null) {
                for (C10866e c10866e : c10866eArr) {
                    c10866e.m56365I((InterfaceC27218a) context);
                }
            }
        }
    }

    /* renamed from: e */
    public final void m43610e(final C3054x c3054x) {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        String m14643A;
        GradientDrawable gradientDrawable;
        if (c3054x == null) {
            return;
        }
        C30048t6 c30048t6 = this.f44199p;
        C30048t6 c30048t62 = null;
        if (c30048t6 == null) {
            AbstractC19074t.m100223u("binding");
            c30048t6 = null;
        }
        if (!c3054x.m14646D()) {
            c30048t6.f139394t.getLayoutParams().height = 0;
            c30048t6.f139394t.setVisibility(8);
        } else {
            c30048t6.f139394t.getLayoutParams().height = -2;
            c30048t6.f139394t.setVisibility(0);
        }
        c30048t6.f139395u.setHeight(c3054x.m14690v());
        ViewGroup.LayoutParams layoutParams = c30048t6.f139392r.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        } else {
            marginLayoutParams = null;
        }
        if (marginLayoutParams != null) {
            marginLayoutParams.topMargin = c3054x.m14689u();
        }
        c30048t6.f139392r.setPadding(AbstractC23136l9.m118742r(24.0f), c3054x.m14691w(), AbstractC23136l9.m118742r(24.0f), AbstractC23136l9.m118742r(32.0f));
        if (c3054x.m14678j()) {
            c30048t6.f139392r.setBackground(AbstractC23136l9.m118665N(getContext(), AbstractC16803z.empty_album_background));
            Drawable background = c30048t6.f139392r.getBackground();
            if (background instanceof GradientDrawable) {
                gradientDrawable = (GradientDrawable) background;
            } else {
                gradientDrawable = null;
            }
            if (gradientDrawable != null) {
                gradientDrawable.setStroke(AbstractC23136l9.m118742r(1.0f), c3054x.m14672d(), AbstractC23136l9.m118742r(5.0f), AbstractC23136l9.m118742r(4.0f));
            }
        } else {
            c30048t6.f139392r.setBackground(AbstractC23136l9.m118665N(getContext(), AbstractC16803z.rectangle_transparent));
        }
        CharSequence charSequence = "";
        if (c3054x.m14683o()) {
            c30048t6.f139397w.setMovementMethod(CustomMovementMethod.m56305e());
            CharSequence m14694z = c3054x.m14694z();
            if (m14694z == null) {
                m14694z = "";
            }
            setActivityForCallbackSpanText(m14694z);
            c30048t6.f139397w.setText(c3054x.m14694z());
            c30048t6.f139397w.setTextColor(c3054x.m14644B());
            c30048t6.f139397w.setVisibility(0);
        } else {
            c30048t6.f139397w.setVisibility(8);
        }
        if (c3054x.m14679k()) {
            c30048t6.f139396v.setMovementMethod(CustomMovementMethod.m56305e());
            CharSequence m14673e = c3054x.m14673e();
            if (m14673e != null) {
                charSequence = m14673e;
            }
            setActivityForCallbackSpanText(charSequence);
            c30048t6.f139396v.setText(c3054x.m14673e());
            c30048t6.f139396v.setTextColor(c3054x.m14674f());
            c30048t6.f139396v.setVisibility(0);
        } else {
            c30048t6.f139396v.setVisibility(8);
        }
        ViewGroup.LayoutParams layoutParams2 = c30048t6.f139393s.getLayoutParams();
        if (layoutParams2 != null) {
            AbstractC19074t.m100205c(layoutParams2);
            layoutParams2.width = c3054x.m14686r();
            layoutParams2.height = c3054x.m14686r();
        }
        if (c3054x.m14681m()) {
            ((C23528a) this.f44203t.m123612r(c30048t6.f139393s)).m123618x(c3054x.m14687s(), C23278z2.m120118c1());
            c30048t6.f139393s.setVisibility(0);
        } else if (c3054x.m14680l()) {
            c30048t6.f139393s.setImageResource(c3054x.m14685q());
            c30048t6.f139393s.setVisibility(0);
        } else {
            c30048t6.f139393s.setVisibility(8);
        }
        if (c3054x.m14676h() && (m14643A = c3054x.m14643A()) != null && m14643A.length() > 0) {
            if (c3054x.m14682n()) {
                c30048t6.f139391q.setCompoundDrawables(AbstractC23136l9.m118665N(getContext(), c3054x.m14688t()), null, null, null);
            }
            c30048t6.f139391q.setText(c3054x.m14643A());
            c30048t6.f139391q.setVisibility(0);
        } else {
            c30048t6.f139391q.setVisibility(8);
        }
        this.f44201r = c3054x.m14645C();
        if (c3054x.m14675g()) {
            c30048t6.f139394t.setBackgroundColor(c3054x.m14671c());
        }
        C30048t6 c30048t63 = this.f44199p;
        if (c30048t63 == null) {
            AbstractC19074t.m100223u("binding");
            c30048t63 = null;
        }
        c30048t63.f139391q.setOnClickListener(new View.OnClickListener() { // from class: com.zing.zalo.feed.components.n0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                EmptyContentView.m43604f(EmptyContentView.this, c3054x, view);
            }
        });
        if (c3054x.m14677i()) {
            c30048t6.f139394t.setOnClickListener(new View.OnClickListener() { // from class: com.zing.zalo.feed.components.o0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    EmptyContentView.m43605g(EmptyContentView.this, c3054x, view);
                }
            });
        }
        C30048t6 c30048t64 = this.f44199p;
        if (c30048t64 == null) {
            AbstractC19074t.m100223u("binding");
        } else {
            c30048t62 = c30048t64;
        }
        m43609l(c30048t62);
    }

    public final InterfaceC8078a getEmptyContentListener() {
        return this.f44200q;
    }

    /* renamed from: j */
    public final void m43611j(Context context) {
        C30048t6 m148525c = C30048t6.m148525c(LayoutInflater.from(context), this, true);
        AbstractC19074t.m100207e(m148525c, "inflate(...)");
        this.f44199p = m148525c;
        if (m148525c == null) {
            AbstractC19074t.m100223u("binding");
            m148525c = null;
        }
        m148525c.f139391q.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: com.zing.zalo.feed.components.m0
            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18) {
                EmptyContentView.m43608k(EmptyContentView.this, view, i11, i12, i13, i14, i15, i16, i17, i18);
            }
        });
    }

    public final void setEmptyContentListener(InterfaceC8078a interfaceC8078a) {
        this.f44200q = interfaceC8078a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EmptyContentView(Context context, EnumC8079b enumC8079b) {
        super(context);
        AbstractC19074t.m100208f(enumC8079b, "layoutMode");
        this.f44202s = EnumC8079b.f44204p;
        this.f44203t = new C23528a(getContext());
        m43611j(context);
        this.f44202s = enumC8079b;
    }

    public EmptyContentView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f44202s = EnumC8079b.f44204p;
        this.f44203t = new C23528a(getContext());
        m43611j(context);
    }
}
