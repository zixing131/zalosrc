package com.zing.zalo.zdesign.component;

import ac.C0708i;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import bi0.AbstractC2807a;
import bi0.AbstractC2810d;
import bi0.AbstractC2811e;
import bi0.AbstractC2812f;
import bi0.AbstractC2815i;
import bi0.AbstractC2816j;
import com.zing.zalo.p077ui.widget.RobotoTextView;
import fn0.AbstractC19074t;
import java.lang.ref.WeakReference;
import kotlin.NoWhenBranchMatchedException;
import ri0.C25808b;
import ui0.C27276c;
import ui0.C27280g;

/* loaded from: classes7.dex */
public class ListItem extends LinearLayout implements InterfaceC16976f1 {

    /* renamed from: A */
    private FrameLayout f86308A;

    /* renamed from: B */
    private CheckBox f86309B;

    /* renamed from: C */
    private Badge f86310C;

    /* renamed from: D */
    private Badge f86311D;

    /* renamed from: E */
    private ImageView f86312E;

    /* renamed from: F */
    private Divider f86313F;

    /* renamed from: p */
    private C25808b f86314p;

    /* renamed from: q */
    private LinearLayout f86315q;

    /* renamed from: r */
    private FrameLayout f86316r;

    /* renamed from: s */
    private FrameLayout f86317s;

    /* renamed from: t */
    private FrameLayout f86318t;

    /* renamed from: u */
    private FrameLayout f86319u;

    /* renamed from: v */
    private FrameLayout f86320v;

    /* renamed from: w */
    private RobotoTextView f86321w;

    /* renamed from: x */
    private RobotoTextView f86322x;

    /* renamed from: y */
    private RobotoTextView f86323y;

    /* renamed from: z */
    private FrameLayout f86324z;

    /* renamed from: com.zing.zalo.zdesign.component.ListItem$a */
    /* loaded from: classes7.dex */
    public /* synthetic */ class C16918a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f86325a;

        static {
            int[] iArr = new int[EnumC16952b0.values().length];
            try {
                iArr[EnumC16952b0.TOP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC16952b0.CENTER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC16952b0.BOTTOM.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f86325a = iArr;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ListItem(Context context) {
        this(context, null);
        AbstractC19074t.m100208f(context, "context");
    }

    /* renamed from: f */
    private final void m90580f(ViewGroup viewGroup, View view) {
        if (viewGroup.getChildCount() != 0) {
            viewGroup.removeAllViews();
        }
        ViewParent parent = view.getParent();
        if (parent != null && (parent instanceof ViewGroup)) {
            ((ViewGroup) parent).removeView(view);
        }
        if (view.getLayoutParams() != null) {
            viewGroup.addView(view);
        } else {
            viewGroup.addView(view, new ViewGroup.LayoutParams(-2, -2));
        }
        viewGroup.setVisibility(0);
    }

    /* renamed from: g */
    private final void m90581g() {
        setClipChildren(false);
        setClipToPadding(false);
        if (getBackground() == null) {
            Context context = getContext();
            AbstractC19074t.m100207e(context, "context");
            setBackground(C27280g.m139658a(context, AbstractC2810d.bg_list_item));
        }
        Context context2 = getContext();
        AbstractC19074t.m100207e(context2, "context");
        int m139649b = C27276c.m139649b(context2, 16);
        setPadding(m139649b, m139649b, m139649b, m139649b);
        setTitleMaxLine(1);
        setSubtitleMaxLine(1);
        m90592m(true);
        m90591l(0, 0, 0, 0);
    }

    /* renamed from: h */
    private final void m90582h(View view, boolean z11) {
        view.setEnabled(z11);
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i11 = 0; i11 < childCount; i11++) {
                View childAt = viewGroup.getChildAt(i11);
                AbstractC19074t.m100207e(childAt, "viewGroup.getChildAt(idx)");
                m90582h(childAt, z11);
            }
        }
    }

    /* renamed from: i */
    private final void m90583i(AttributeSet attributeSet, int i11, int i12) {
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, AbstractC2815i.ListItem, i11, i12);
            AbstractC19074t.m100207e(obtainStyledAttributes, "context.obtainStyledAttr…tyleRes\n                )");
            String string = obtainStyledAttributes.getString(AbstractC2815i.ListItem_title);
            String str = "";
            if (string == null) {
                string = "";
            }
            setTitle(string);
            String string2 = obtainStyledAttributes.getString(AbstractC2815i.ListItem_subtitle);
            if (string2 != null) {
                str = string2;
            }
            setSubtitle(str);
            String string3 = obtainStyledAttributes.getString(AbstractC2815i.ListItem_trackingId);
            if (string3 != null && string3.length() != 0) {
                setIdTracking(string3);
            }
            obtainStyledAttributes.recycle();
        }
    }

    /* renamed from: j */
    static /* synthetic */ void m90584j(ListItem listItem, AttributeSet attributeSet, int i11, int i12, int i13, Object obj) {
        if (obj == null) {
            if ((i13 & 2) != 0) {
                i11 = 0;
            }
            if ((i13 & 4) != 0) {
                i12 = 0;
            }
            listItem.m90583i(attributeSet, i11, i12);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: parseAttributes");
    }

    /* renamed from: a */
    public final void m90585a(View view) {
        AbstractC19074t.m100208f(view, "belowItem");
        m90580f(this.f86308A, view);
    }

    /* renamed from: b */
    public final void m90586b(View view) {
        AbstractC19074t.m100208f(view, "bottomItem");
        m90580f(this.f86319u, view);
    }

    /* renamed from: c */
    public final void m90587c(View view) {
        AbstractC19074t.m100208f(view, "leadingItem");
        m90580f(this.f86316r, view);
    }

    /* renamed from: d */
    public final void m90588d(View view) {
        AbstractC19074t.m100208f(view, "topItem");
        m90580f(this.f86318t, view);
    }

    /* renamed from: e */
    public final void m90589e(View view) {
        AbstractC19074t.m100208f(view, "trailingItem");
        m90580f(this.f86317s, view);
    }

    public final View getAboveItem() {
        if (this.f86324z.getChildCount() > 0) {
            return this.f86324z.getChildAt(0);
        }
        return null;
    }

    public final Badge getBadgeSubtitle() {
        return this.f86311D;
    }

    public final Badge getBadgeTitle() {
        return this.f86310C;
    }

    public final View getBelowItem() {
        if (this.f86308A.getChildCount() > 0) {
            return this.f86308A.getChildAt(0);
        }
        return null;
    }

    public final FrameLayout getBottom$zdesign_release() {
        return this.f86319u;
    }

    public final View getBottomItem() {
        if (this.f86319u.getChildCount() > 0) {
            return this.f86319u.getChildAt(0);
        }
        return null;
    }

    public final CharSequence getBracket() {
        CharSequence text = this.f86323y.getText();
        AbstractC19074t.m100207e(text, "bracketTextView.text");
        return text;
    }

    public final CheckBox getCheckbox() {
        return this.f86309B;
    }

    public final Divider getDivider() {
        return this.f86313F;
    }

    public final ImageView getIconChevronRight() {
        return this.f86312E;
    }

    public final FrameLayout getLeading$zdesign_release() {
        return this.f86316r;
    }

    public final View getLeadingItem() {
        if (this.f86316r.getChildCount() > 0) {
            return this.f86316r.getChildAt(0);
        }
        return null;
    }

    public final CharSequence getSubtitle() {
        CharSequence text = this.f86322x.getText();
        AbstractC19074t.m100207e(text, "subtitleTextView.text");
        return text;
    }

    public final RobotoTextView getSubtitleTextView$zdesign_release() {
        return this.f86322x;
    }

    public final CharSequence getTitle() {
        CharSequence text = this.f86321w.getText();
        AbstractC19074t.m100207e(text, "titleTextView.text");
        return text;
    }

    public final FrameLayout getTitlePrefixView$zdesign_release() {
        return this.f86320v;
    }

    public final RobotoTextView getTitleTextView$zdesign_release() {
        return this.f86321w;
    }

    public final FrameLayout getTop$zdesign_release() {
        return this.f86318t;
    }

    public final View getTopItem() {
        if (this.f86318t.getChildCount() > 0) {
            return this.f86318t.getChildAt(0);
        }
        return null;
    }

    public final FrameLayout getTrailing$zdesign_release() {
        return this.f86317s;
    }

    public final View getTrailingItem() {
        if (this.f86317s.getChildCount() > 0) {
            return this.f86317s.getChildAt(0);
        }
        return null;
    }

    /* renamed from: k */
    public final void m90590k(boolean z11, boolean z12, boolean z13) {
        int i11;
        int i12;
        setEnabled(z11);
        if (z12) {
            if (z11) {
                i11 = AbstractC2807a.list_item_subtitle;
            } else {
                i11 = AbstractC2807a.list_item_subtitle_disable;
            }
            if (z11) {
                i12 = AbstractC2807a.list_item_title;
            } else {
                i12 = AbstractC2807a.list_item_title_disable;
            }
            RobotoTextView robotoTextView = this.f86322x;
            AbstractC2816j.a aVar = AbstractC2816j.Companion;
            Context context = getContext();
            AbstractC19074t.m100207e(context, "context");
            robotoTextView.setTextColor(aVar.m13592a(context, i11));
            RobotoTextView robotoTextView2 = this.f86321w;
            Context context2 = getContext();
            AbstractC19074t.m100207e(context2, "context");
            robotoTextView2.setTextColor(aVar.m13592a(context2, i12));
        }
        if (!z13) {
            setAlpha(1.0f);
        }
    }

    /* renamed from: l */
    public final void m90591l(int i11, int i12, int i13, int i14) {
        this.f86313F.m90563c(i11 - getPaddingLeft(), i12, i13 - getPaddingRight(), i14);
        this.f86313F.setTranslationY(getPaddingBottom());
    }

    /* renamed from: m */
    public final void m90592m(boolean z11) {
        if (z11) {
            this.f86313F.setVisibility(0);
        } else {
            this.f86313F.setVisibility(8);
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected final void onDraw(Canvas canvas) {
        AbstractC19074t.m100208f(canvas, "canvas");
        super.onDraw(canvas);
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    protected final void onLayout(boolean z11, int i11, int i12, int i13, int i14) {
        super.onLayout(z11, i11, i12, i13, i14);
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected final void onMeasure(int i11, int i12) {
        super.onMeasure(i11, i12);
    }

    @Override // android.view.View
    protected final void onSizeChanged(int i11, int i12, int i13, int i14) {
        super.onSizeChanged(i11, i12, i13, i14);
    }

    public final void setAboveItemVisibility(int i11) {
        if (i11 != 0 && i11 != 4 && i11 != 8) {
            return;
        }
        this.f86324z.setVisibility(i11);
    }

    public final void setBadgeSubtitle(Badge badge) {
        AbstractC19074t.m100208f(badge, "<set-?>");
        this.f86311D = badge;
    }

    public final void setBadgeTitle(Badge badge) {
        AbstractC19074t.m100208f(badge, "<set-?>");
        this.f86310C = badge;
    }

    public final void setBelowItemVisibility(int i11) {
        if (i11 != 0 && i11 != 4 && i11 != 8) {
            return;
        }
        this.f86308A.setVisibility(i11);
    }

    public final void setBottom$zdesign_release(FrameLayout frameLayout) {
        AbstractC19074t.m100208f(frameLayout, "<set-?>");
        this.f86319u = frameLayout;
    }

    public final void setBottomItemVisibility(int i11) {
        if (i11 != 0 && i11 != 4 && i11 != 8) {
            return;
        }
        this.f86319u.setVisibility(i11);
    }

    public final void setBracket(CharSequence charSequence) {
        int i11;
        AbstractC19074t.m100208f(charSequence, "value");
        this.f86323y.setText(charSequence);
        RobotoTextView robotoTextView = this.f86323y;
        if (charSequence.length() == 0) {
            i11 = 8;
        } else {
            i11 = 0;
        }
        robotoTextView.setVisibility(i11);
    }

    public final void setCheckbox(CheckBox checkBox) {
        AbstractC19074t.m100208f(checkBox, "<set-?>");
        this.f86309B = checkBox;
    }

    public final void setDivider(Divider divider) {
        AbstractC19074t.m100208f(divider, "<set-?>");
        this.f86313F = divider;
    }

    @Override // android.view.View
    public void setEnabled(boolean z11) {
        float f11;
        super.setEnabled(z11);
        if (z11) {
            f11 = 1.0f;
        } else {
            f11 = 0.7f;
        }
        setAlpha(f11);
        int childCount = getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = getChildAt(i11);
            AbstractC19074t.m100207e(childAt, "getChildAt(idx)");
            m90582h(childAt, z11);
        }
    }

    public final void setIconChevronRight(ImageView imageView) {
        AbstractC19074t.m100208f(imageView, "<set-?>");
        this.f86312E = imageView;
    }

    public void setIdTracking(String str) {
        AbstractC19074t.m100208f(str, "id");
        C25808b c25808b = this.f86314p;
        if (c25808b != null) {
            c25808b.m133075d(str);
        }
    }

    public final void setLeading$zdesign_release(FrameLayout frameLayout) {
        AbstractC19074t.m100208f(frameLayout, "<set-?>");
        this.f86316r = frameLayout;
    }

    public final void setLeadingGravity(EnumC16952b0 enumC16952b0) {
        int i11;
        AbstractC19074t.m100208f(enumC16952b0, "gravity");
        ViewGroup.LayoutParams layoutParams = this.f86316r.getLayoutParams();
        AbstractC19074t.m100206d(layoutParams, "null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
        LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) layoutParams;
        int i12 = C16918a.f86325a[enumC16952b0.ordinal()];
        if (i12 != 1) {
            if (i12 != 2) {
                if (i12 == 3) {
                    i11 = 80;
                } else {
                    throw new NoWhenBranchMatchedException();
                }
            } else {
                i11 = 17;
            }
        } else {
            i11 = 48;
        }
        layoutParams2.gravity = i11;
        this.f86316r.setLayoutParams(layoutParams2);
    }

    public final void setLeadingItemVisibility(int i11) {
        if (i11 != 0 && i11 != 4 && i11 != 8) {
            return;
        }
        this.f86316r.setVisibility(i11);
    }

    public final void setMessageItemStateUnread(boolean z11) {
        if (isEnabled()) {
            if (z11) {
                RobotoTextView robotoTextView = this.f86322x;
                AbstractC2816j.a aVar = AbstractC2816j.Companion;
                Context context = getContext();
                AbstractC19074t.m100207e(context, "context");
                robotoTextView.setTextColor(aVar.m13592a(context, AbstractC2807a.list_item_subtitle_deepen));
            } else {
                RobotoTextView robotoTextView2 = this.f86322x;
                AbstractC2816j.a aVar2 = AbstractC2816j.Companion;
                Context context2 = getContext();
                AbstractC19074t.m100207e(context2, "context");
                robotoTextView2.setTextColor(aVar2.m13592a(context2, AbstractC2807a.list_item_subtitle));
            }
        } else {
            RobotoTextView robotoTextView3 = this.f86322x;
            AbstractC2816j.a aVar3 = AbstractC2816j.Companion;
            Context context3 = getContext();
            AbstractC19074t.m100207e(context3, "context");
            robotoTextView3.setTextColor(aVar3.m13592a(context3, AbstractC2807a.list_item_subtitle_disable));
        }
        this.f86321w.setTextStyleBold(z11);
    }

    public final void setMiddleItemVisibility(int i11) {
        if (i11 != 0 && i11 != 4 && i11 != 8) {
            return;
        }
        this.f86315q.setVisibility(i11);
    }

    @Override // android.view.View
    public void setOnClickListener(View.OnClickListener onClickListener) {
        C25808b c25808b = this.f86314p;
        if (c25808b == null || !c25808b.m133076e(onClickListener)) {
            super.setOnClickListener(onClickListener);
        }
    }

    public final void setPaddingBottomOfTop(EnumC16969d0 enumC16969d0) {
        AbstractC19074t.m100208f(enumC16969d0, "padding");
        FrameLayout frameLayout = this.f86318t;
        int paddingLeft = frameLayout.getPaddingLeft();
        int paddingTop = this.f86318t.getPaddingTop();
        int paddingRight = this.f86318t.getPaddingRight();
        Context context = getContext();
        AbstractC19074t.m100207e(context, "context");
        frameLayout.setPadding(paddingLeft, paddingTop, paddingRight, enumC16969d0.m90857c(context));
    }

    public final void setPaddingTopOfBottom(EnumC16969d0 enumC16969d0) {
        AbstractC19074t.m100208f(enumC16969d0, "padding");
        FrameLayout frameLayout = this.f86319u;
        int paddingLeft = frameLayout.getPaddingLeft();
        Context context = getContext();
        AbstractC19074t.m100207e(context, "context");
        frameLayout.setPadding(paddingLeft, enumC16969d0.m90857c(context), this.f86319u.getPaddingRight(), this.f86319u.getPaddingBottom());
    }

    public final void setSubtitle(CharSequence charSequence) {
        int i11;
        AbstractC19074t.m100208f(charSequence, "value");
        this.f86322x.setText(charSequence);
        RobotoTextView robotoTextView = this.f86322x;
        if (charSequence.length() == 0) {
            i11 = 8;
        } else {
            i11 = 0;
        }
        robotoTextView.setVisibility(i11);
    }

    public final void setSubtitleColor(int i11) {
        this.f86322x.setTextColor(i11);
    }

    public final void setSubtitleDisableScaleText(boolean z11) {
        this.f86322x.mo75850g(z11);
    }

    public final void setSubtitleMaxLine(int i11) {
        this.f86322x.setEllipsize(TextUtils.TruncateAt.END);
        if (i11 <= 1) {
            this.f86322x.setSingleLine(true);
            this.f86322x.setMaxLines(1);
        } else {
            this.f86322x.setSingleLine(false);
            this.f86322x.setMaxLines(i11);
        }
    }

    public final void setSubtitleTextView$zdesign_release(RobotoTextView robotoTextView) {
        AbstractC19074t.m100208f(robotoTextView, "<set-?>");
        this.f86322x = robotoTextView;
    }

    public final void setTitle(CharSequence charSequence) {
        int i11;
        AbstractC19074t.m100208f(charSequence, "value");
        this.f86321w.setText(charSequence);
        RobotoTextView robotoTextView = this.f86321w;
        if (charSequence.length() == 0) {
            i11 = 8;
        } else {
            i11 = 0;
        }
        robotoTextView.setVisibility(i11);
    }

    public final void setTitleColor(int i11) {
        this.f86321w.setTextColor(i11);
    }

    public final void setTitleDisableScaleText(boolean z11) {
        this.f86321w.mo75850g(z11);
    }

    public final void setTitleMaxLine(int i11) {
        this.f86321w.setEllipsize(TextUtils.TruncateAt.END);
        if (i11 <= 1) {
            this.f86321w.setSingleLine(true);
            this.f86321w.setMaxLines(1);
        } else {
            this.f86321w.setSingleLine(false);
            this.f86321w.setMaxLines(i11);
        }
    }

    public final void setTitlePrefixView(View view) {
        AbstractC19074t.m100208f(view, "prefixView");
        m90580f(this.f86320v, view);
    }

    public final void setTitlePrefixView$zdesign_release(FrameLayout frameLayout) {
        AbstractC19074t.m100208f(frameLayout, "<set-?>");
        this.f86320v = frameLayout;
    }

    public final void setTitleStyleBold(boolean z11) {
        this.f86321w.setTextStyleBold(z11);
    }

    public final void setTitleTextView$zdesign_release(RobotoTextView robotoTextView) {
        AbstractC19074t.m100208f(robotoTextView, "<set-?>");
        this.f86321w = robotoTextView;
    }

    public final void setTop$zdesign_release(FrameLayout frameLayout) {
        AbstractC19074t.m100208f(frameLayout, "<set-?>");
        this.f86318t = frameLayout;
    }

    public final void setTopItemVisibility(int i11) {
        if (i11 != 0 && i11 != 4 && i11 != 8) {
            return;
        }
        this.f86318t.setVisibility(i11);
    }

    @Override // com.zing.zalo.zdesign.component.InterfaceC16976f1
    public void setTrackingExtraData(C0708i c0708i) {
        C25808b c25808b = this.f86314p;
        if (c25808b != null) {
            c25808b.m133077f(c0708i);
        }
    }

    public final void setTrailing$zdesign_release(FrameLayout frameLayout) {
        AbstractC19074t.m100208f(frameLayout, "<set-?>");
        this.f86317s = frameLayout;
    }

    public final void setTrailingGravity(EnumC16952b0 enumC16952b0) {
        AbstractC19074t.m100208f(enumC16952b0, "gravity");
        ViewGroup.LayoutParams layoutParams = this.f86317s.getLayoutParams();
        AbstractC19074t.m100206d(layoutParams, "null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
        RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) layoutParams;
        layoutParams2.removeRule(6);
        layoutParams2.removeRule(15);
        layoutParams2.removeRule(8);
        int i11 = C16918a.f86325a[enumC16952b0.ordinal()];
        if (i11 != 1) {
            if (i11 != 2) {
                if (i11 == 3) {
                    layoutParams2.addRule(8);
                }
            } else {
                layoutParams2.addRule(15);
            }
        } else {
            layoutParams2.addRule(6);
        }
        this.f86317s.setLayoutParams(layoutParams2);
    }

    public final void setTrailingItemVisibility(int i11) {
        if (i11 != 0 && i11 != 4 && i11 != 8) {
            return;
        }
        this.f86317s.setVisibility(i11);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ListItem(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        AbstractC19074t.m100208f(context, "context");
    }

    public final void setSubtitleColor(ColorStateList colorStateList) {
        AbstractC19074t.m100208f(colorStateList, "colorStateList");
        this.f86322x.setTextColor(colorStateList);
    }

    public final void setTitleColor(ColorStateList colorStateList) {
        AbstractC19074t.m100208f(colorStateList, "colorStateList");
        this.f86321w.setTextColor(colorStateList);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ListItem(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        AbstractC19074t.m100208f(context, "context");
        this.f86314p = new C25808b(new WeakReference(this));
        LayoutInflater.from(context).inflate(AbstractC2812f.item_list, this);
        View findViewById = findViewById(AbstractC2811e.ll_list_item_content);
        AbstractC19074t.m100207e(findViewById, "findViewById(R.id.ll_list_item_content)");
        this.f86315q = (LinearLayout) findViewById;
        View findViewById2 = findViewById(AbstractC2811e.rl_list_item_leading);
        AbstractC19074t.m100207e(findViewById2, "findViewById(R.id.rl_list_item_leading)");
        this.f86316r = (FrameLayout) findViewById2;
        View findViewById3 = findViewById(AbstractC2811e.rl_list_item_trailing);
        AbstractC19074t.m100207e(findViewById3, "findViewById(R.id.rl_list_item_trailing)");
        this.f86317s = (FrameLayout) findViewById3;
        View findViewById4 = findViewById(AbstractC2811e.rl_list_item_top);
        AbstractC19074t.m100207e(findViewById4, "findViewById(R.id.rl_list_item_top)");
        this.f86318t = (FrameLayout) findViewById4;
        View findViewById5 = findViewById(AbstractC2811e.rl_list_item_bottom);
        AbstractC19074t.m100207e(findViewById5, "findViewById(R.id.rl_list_item_bottom)");
        this.f86319u = (FrameLayout) findViewById5;
        View findViewById6 = findViewById(AbstractC2811e.fl_list_item_above);
        AbstractC19074t.m100207e(findViewById6, "findViewById(R.id.fl_list_item_above)");
        this.f86324z = (FrameLayout) findViewById6;
        View findViewById7 = findViewById(AbstractC2811e.fl_list_item_below);
        AbstractC19074t.m100207e(findViewById7, "findViewById(R.id.fl_list_item_below)");
        this.f86308A = (FrameLayout) findViewById7;
        View findViewById8 = findViewById(AbstractC2811e.divider_list_item);
        AbstractC19074t.m100207e(findViewById8, "findViewById(R.id.divider_list_item)");
        this.f86313F = (Divider) findViewById8;
        View findViewById9 = findViewById(AbstractC2811e.title_list_item);
        AbstractC19074t.m100207e(findViewById9, "findViewById(R.id.title_list_item)");
        this.f86321w = (RobotoTextView) findViewById9;
        View findViewById10 = findViewById(AbstractC2811e.title_prefix_view_list_item);
        AbstractC19074t.m100207e(findViewById10, "findViewById(R.id.title_prefix_view_list_item)");
        this.f86320v = (FrameLayout) findViewById10;
        View findViewById11 = findViewById(AbstractC2811e.subtitle_list_item);
        AbstractC19074t.m100207e(findViewById11, "findViewById(R.id.subtitle_list_item)");
        this.f86322x = (RobotoTextView) findViewById11;
        View findViewById12 = findViewById(AbstractC2811e.bracket_list_item);
        AbstractC19074t.m100207e(findViewById12, "findViewById(R.id.bracket_list_item)");
        this.f86323y = (RobotoTextView) findViewById12;
        View findViewById13 = findViewById(AbstractC2811e.badge_title_list_item);
        AbstractC19074t.m100207e(findViewById13, "findViewById(R.id.badge_title_list_item)");
        this.f86310C = (Badge) findViewById13;
        View findViewById14 = findViewById(AbstractC2811e.badge_subtitle_list_item);
        AbstractC19074t.m100207e(findViewById14, "findViewById(R.id.badge_subtitle_list_item)");
        this.f86311D = (Badge) findViewById14;
        View findViewById15 = findViewById(AbstractC2811e.ic_chevronright);
        AbstractC19074t.m100207e(findViewById15, "findViewById(R.id.ic_chevronright)");
        this.f86312E = (ImageView) findViewById15;
        View findViewById16 = findViewById(AbstractC2811e.checkbox_list_item);
        AbstractC19074t.m100207e(findViewById16, "findViewById(R.id.checkbox_list_item)");
        this.f86309B = (CheckBox) findViewById16;
        m90584j(this, attributeSet, i11, 0, 4, null);
        m90581g();
    }
}
