package com.zing.zalo.feed.components;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.RotateDrawable;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import com.zing.zalo.AbstractC16803z;
import com.zing.zalo.AbstractC8923h0;
import com.zing.zalo.p077ui.widget.RobotoTextView;
import fn0.AbstractC19074t;
import me0.AbstractC23136l9;
import me0.C23212s8;
import p262jb.AbstractC21196a;
import xm0.AbstractC30166b;
import xm0.InterfaceC30165a;

/* loaded from: classes4.dex */
public final class LoadingTextView extends RelativeLayout {

    /* renamed from: A */
    private int f45051A;

    /* renamed from: B */
    private EnumC8212a f45052B;

    /* renamed from: C */
    private EnumC8213b f45053C;

    /* renamed from: p */
    private final LinearLayout f45054p;

    /* renamed from: q */
    private final RobotoTextView f45055q;

    /* renamed from: r */
    private final ProgressBar f45056r;

    /* renamed from: s */
    private float f45057s;

    /* renamed from: t */
    private String f45058t;

    /* renamed from: u */
    private boolean f45059u;

    /* renamed from: v */
    private int f45060v;

    /* renamed from: w */
    private boolean f45061w;

    /* renamed from: x */
    private int f45062x;

    /* renamed from: y */
    private int f45063y;

    /* renamed from: z */
    private int f45064z;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* renamed from: com.zing.zalo.feed.components.LoadingTextView$a */
    /* loaded from: classes4.dex */
    public static final class EnumC8212a {

        /* renamed from: p */
        public static final EnumC8212a f45065p = new EnumC8212a("LEFT", 0);

        /* renamed from: q */
        public static final EnumC8212a f45066q = new EnumC8212a("RIGHT", 1);

        /* renamed from: r */
        private static final /* synthetic */ EnumC8212a[] f45067r;

        /* renamed from: s */
        private static final /* synthetic */ InterfaceC30165a f45068s;

        static {
            EnumC8212a[] m44443b = m44443b();
            f45067r = m44443b;
            f45068s = AbstractC30166b.m148796a(m44443b);
        }

        private EnumC8212a(String str, int i11) {
        }

        /* renamed from: b */
        private static final /* synthetic */ EnumC8212a[] m44443b() {
            return new EnumC8212a[]{f45065p, f45066q};
        }

        public static EnumC8212a valueOf(String str) {
            return (EnumC8212a) Enum.valueOf(EnumC8212a.class, str);
        }

        public static EnumC8212a[] values() {
            return (EnumC8212a[]) f45067r.clone();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* renamed from: com.zing.zalo.feed.components.LoadingTextView$b */
    /* loaded from: classes4.dex */
    public static final class EnumC8213b {

        /* renamed from: p */
        public static final EnumC8213b f45069p = new EnumC8213b("LOADING", 0);

        /* renamed from: q */
        public static final EnumC8213b f45070q = new EnumC8213b("NORMAL", 1);

        /* renamed from: r */
        private static final /* synthetic */ EnumC8213b[] f45071r;

        /* renamed from: s */
        private static final /* synthetic */ InterfaceC30165a f45072s;

        static {
            EnumC8213b[] m44444b = m44444b();
            f45071r = m44444b;
            f45072s = AbstractC30166b.m148796a(m44444b);
        }

        private EnumC8213b(String str, int i11) {
        }

        /* renamed from: b */
        private static final /* synthetic */ EnumC8213b[] m44444b() {
            return new EnumC8213b[]{f45069p, f45070q};
        }

        public static EnumC8213b valueOf(String str) {
            return (EnumC8213b) Enum.valueOf(EnumC8213b.class, str);
        }

        public static EnumC8213b[] values() {
            return (EnumC8213b[]) f45071r.clone();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LoadingTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        AbstractC19074t.m100208f(context, "context");
        AbstractC19074t.m100208f(attributeSet, "attrs");
        this.f45054p = new LinearLayout(getContext());
        Context context2 = getContext();
        AbstractC19074t.m100207e(context2, "getContext(...)");
        this.f45055q = new RobotoTextView(context2);
        this.f45056r = new ProgressBar(getContext());
        this.f45057s = AbstractC23136l9.m118742r(15.0f);
        this.f45058t = "";
        this.f45060v = C23212s8.m119607o(getContext(), AbstractC21196a.TextColor1);
        this.f45062x = AbstractC23136l9.m118742r(50.0f);
        this.f45063y = AbstractC23136l9.m118742r(50.0f);
        this.f45064z = Color.parseColor("#FF1194ff");
        this.f45051A = Color.parseColor("#001194ff");
        this.f45052B = EnumC8212a.f45065p;
        this.f45053C = EnumC8213b.f45070q;
        m44436c();
        m44438e(attributeSet);
    }

    /* renamed from: b */
    public static /* synthetic */ void m44435b(LoadingTextView loadingTextView, String str, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = "";
        }
        loadingTextView.m44440a(str);
    }

    /* renamed from: c */
    private final void m44436c() {
        this.f45054p.setGravity(17);
        this.f45054p.setOrientation(0);
        this.f45056r.setLayoutParams(new LinearLayout.LayoutParams(AbstractC23136l9.m118742r(16.0f), AbstractC23136l9.m118742r(16.0f)));
        this.f45056r.setIndeterminateDrawable(AbstractC23136l9.m118665N(getContext(), AbstractC16803z.limit_feed_update_progress_drawable));
        m44435b(this, null, 1, null);
        this.f45055q.setTextAlignment(4);
        this.f45055q.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        m44437d();
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams.addRule(13);
        addView(this.f45054p, layoutParams);
    }

    /* renamed from: d */
    private final void m44437d() {
        LinearLayout.LayoutParams layoutParams;
        LinearLayout.LayoutParams layoutParams2;
        this.f45054p.removeAllViews();
        if (this.f45056r.getLayoutParams() instanceof LinearLayout.LayoutParams) {
            ViewGroup.LayoutParams layoutParams3 = this.f45056r.getLayoutParams();
            AbstractC19074t.m100206d(layoutParams3, "null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
            layoutParams = (LinearLayout.LayoutParams) layoutParams3;
        } else {
            layoutParams = new LinearLayout.LayoutParams(AbstractC23136l9.m118742r(16.0f), AbstractC23136l9.m118742r(16.0f));
        }
        if (this.f45055q.getLayoutParams() instanceof LinearLayout.LayoutParams) {
            ViewGroup.LayoutParams layoutParams4 = this.f45055q.getLayoutParams();
            AbstractC19074t.m100206d(layoutParams4, "null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
            layoutParams2 = (LinearLayout.LayoutParams) layoutParams4;
        } else {
            layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
        }
        int m118742r = AbstractC23136l9.m118742r(12.0f);
        EnumC8212a enumC8212a = this.f45052B;
        if (enumC8212a == EnumC8212a.f45065p) {
            this.f45054p.addView(this.f45056r, layoutParams);
            layoutParams.rightMargin = m118742r;
            this.f45056r.setLayoutParams(layoutParams);
            this.f45054p.addView(this.f45055q, layoutParams2);
            return;
        }
        if (enumC8212a == EnumC8212a.f45066q) {
            this.f45054p.addView(this.f45055q, layoutParams2);
            layoutParams2.rightMargin = m118742r;
            this.f45055q.setLayoutParams(layoutParams2);
            this.f45054p.addView(this.f45056r, layoutParams);
        }
    }

    /* renamed from: e */
    private final void m44438e(AttributeSet attributeSet) {
        try {
            TypedArray obtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(attributeSet, AbstractC8923h0.LoadingTextView, 0, 0);
            try {
                try {
                    String string = obtainStyledAttributes.getString(AbstractC8923h0.LoadingTextView_ltv_text);
                    if (string == null) {
                        string = "";
                    } else {
                        AbstractC19074t.m100205c(string);
                    }
                    setText(string);
                    setTextSize(obtainStyledAttributes.getDimensionPixelSize(AbstractC8923h0.LoadingTextView_ltv_text_size, 15));
                    setAllCaps(obtainStyledAttributes.getBoolean(AbstractC8923h0.LoadingTextView_ltv_all_caps, false));
                    setTextColor(obtainStyledAttributes.getColor(AbstractC8923h0.LoadingTextView_ltv_text_color, C23212s8.m119607o(getContext(), AbstractC21196a.TextColor1)));
                    setTextBold(obtainStyledAttributes.getBoolean(AbstractC8923h0.LoadingTextView_ltv_text_bold, false));
                    setTextViewBold(this.f45061w);
                    this.f45062x = obtainStyledAttributes.getDimensionPixelSize(AbstractC8923h0.LoadingTextView_ltv_loading_view_width, AbstractC23136l9.m118742r(16.0f));
                    int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(AbstractC8923h0.LoadingTextView_ltv_loading_view_height, AbstractC23136l9.m118742r(16.0f));
                    this.f45063y = dimensionPixelSize;
                    m44441g(this.f45062x, dimensionPixelSize);
                    this.f45064z = obtainStyledAttributes.getColor(AbstractC8923h0.LoadingTextView_ltv_loading_view_start_color, Color.parseColor("#FF1194ff"));
                    this.f45051A = obtainStyledAttributes.getColor(AbstractC8923h0.LoadingTextView_ltv_loading_view_end_color, Color.parseColor("#001194ff"));
                    m44439f();
                } catch (Exception e11) {
                    e11.printStackTrace();
                }
                obtainStyledAttributes.recycle();
            } catch (Throwable th2) {
                obtainStyledAttributes.recycle();
                throw th2;
            }
        } catch (Exception e12) {
            e12.printStackTrace();
        }
    }

    /* renamed from: f */
    private final void m44439f() {
        try {
            Drawable indeterminateDrawable = this.f45056r.getIndeterminateDrawable();
            if (indeterminateDrawable != null && (indeterminateDrawable instanceof RotateDrawable)) {
                Drawable drawable = ((RotateDrawable) indeterminateDrawable).getDrawable();
                if (drawable instanceof GradientDrawable) {
                    ((GradientDrawable) drawable).setColors(new int[]{this.f45051A, this.f45064z});
                }
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    private final void setTextViewBold(boolean z11) {
        int i11;
        if (z11) {
            i11 = 7;
        } else {
            i11 = 5;
        }
        this.f45055q.setFontStyle(i11);
    }

    /* renamed from: a */
    public final void m44440a(String str) {
        AbstractC19074t.m100208f(str, "textDisplay");
        if (str.length() > 0) {
            this.f45055q.setText(str);
        }
        this.f45056r.setVisibility(8);
        this.f45053C = EnumC8213b.f45070q;
    }

    /* renamed from: g */
    public final void m44441g(int i11, int i12) {
        this.f45062x = i11;
        this.f45063y = i12;
        ViewGroup.LayoutParams layoutParams = this.f45056r.getLayoutParams();
        if (layoutParams == null) {
            layoutParams = new ViewGroup.LayoutParams(i11, i12);
        } else {
            layoutParams.width = i11;
            layoutParams.height = i12;
        }
        this.f45056r.setLayoutParams(layoutParams);
    }

    public final EnumC8212a getLoadingViewPosition() {
        return this.f45052B;
    }

    public final String getText() {
        return this.f45058t;
    }

    public final boolean getTextBold() {
        return this.f45061w;
    }

    public final int getTextColor() {
        return this.f45060v;
    }

    public final float getTextSize() {
        return this.f45057s;
    }

    /* renamed from: h */
    public final void m44442h(String str) {
        AbstractC19074t.m100208f(str, "loadingText");
        if (str.length() > 0) {
            this.f45055q.setText(str);
        }
        this.f45056r.setVisibility(0);
        this.f45053C = EnumC8213b.f45069p;
    }

    public final void setAllCaps(boolean z11) {
        this.f45059u = z11;
        this.f45055q.setAllCaps(z11);
    }

    public final void setLoadingViewPosition(EnumC8212a enumC8212a) {
        AbstractC19074t.m100208f(enumC8212a, "value");
        if (this.f45052B != enumC8212a) {
            this.f45052B = enumC8212a;
            m44437d();
        }
    }

    public final void setText(String str) {
        AbstractC19074t.m100208f(str, "value");
        this.f45058t = str;
        this.f45055q.setText(str);
    }

    public final void setTextBold(boolean z11) {
        this.f45061w = z11;
        setTextViewBold(z11);
    }

    public final void setTextColor(int i11) {
        this.f45060v = i11;
        this.f45055q.setTextColor(i11);
    }

    public final void setTextSize(float f11) {
        this.f45057s = f11;
        this.f45055q.setTextSize(0, f11);
    }
}
