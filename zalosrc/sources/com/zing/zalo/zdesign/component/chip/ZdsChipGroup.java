package com.zing.zalo.zdesign.component.chip;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import bi0.AbstractC2807a;
import bi0.AbstractC2809c;
import bi0.AbstractC2810d;
import bi0.AbstractC2815i;
import com.google.android.flexbox.FlexboxLayout;
import fn0.AbstractC19074t;
import java.util.ArrayList;
import java.util.Iterator;
import ui0.C27276c;
import ui0.C27280g;

/* loaded from: classes7.dex */
public class ZdsChipGroup extends FrameLayout {

    /* renamed from: A */
    private LinearLayout f86659A;

    /* renamed from: p */
    private final ArrayList f86660p;

    /* renamed from: q */
    private final ArrayList f86661q;

    /* renamed from: r */
    private final ArrayList f86662r;

    /* renamed from: s */
    private final ArrayList f86663s;

    /* renamed from: t */
    private int f86664t;

    /* renamed from: u */
    private FlexboxLayout f86665u;

    /* renamed from: v */
    private HorizontalScrollView f86666v;

    /* renamed from: w */
    private LinearLayout f86667w;

    /* renamed from: x */
    private View f86668x;

    /* renamed from: y */
    private View f86669y;

    /* renamed from: z */
    private LinearLayout f86670z;

    /* renamed from: com.zing.zalo.zdesign.component.chip.ZdsChipGroup$a */
    /* loaded from: classes7.dex */
    public enum EnumC16965a {
        SCROLLABLE_GROUP(0),
        FLEXBOX_GROUP(1);


        /* renamed from: p */
        private final int f86674p;

        EnumC16965a(int i11) {
            this.f86674p = i11;
        }

        /* renamed from: c */
        public final int m90853c() {
            return this.f86674p;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ZdsChipGroup(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, AbstractC2807a.chipGroupDefaultStyle);
        AbstractC19074t.m100208f(context, "context");
    }

    /* renamed from: a */
    private final void m90847a(View view, FlexboxLayout flexboxLayout) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        AbstractC19074t.m100206d(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        int i11 = marginLayoutParams.leftMargin;
        int i12 = marginLayoutParams.rightMargin;
        int i13 = marginLayoutParams.topMargin;
        int i14 = marginLayoutParams.bottomMargin;
        FlexboxLayout.LayoutParams layoutParams2 = new FlexboxLayout.LayoutParams(marginLayoutParams.width, marginLayoutParams.height);
        ((ViewGroup.MarginLayoutParams) layoutParams2).leftMargin = i11;
        ((ViewGroup.MarginLayoutParams) layoutParams2).rightMargin = i12;
        ((ViewGroup.MarginLayoutParams) layoutParams2).topMargin = i13;
        ((ViewGroup.MarginLayoutParams) layoutParams2).bottomMargin = i14;
        view.setLayoutParams(layoutParams2);
        flexboxLayout.addView(view);
    }

    /* renamed from: b */
    private final void m90848b(View view, LinearLayout linearLayout) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        AbstractC19074t.m100206d(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        int i11 = marginLayoutParams.leftMargin;
        int i12 = marginLayoutParams.rightMargin;
        int i13 = marginLayoutParams.topMargin;
        int i14 = marginLayoutParams.bottomMargin;
        int i15 = marginLayoutParams.width;
        int i16 = marginLayoutParams.height;
        if (view.getParent() != null && (view.getParent() instanceof ViewGroup)) {
            ViewParent parent = view.getParent();
            AbstractC19074t.m100206d(parent, "null cannot be cast to non-null type android.view.ViewGroup");
            ((ViewGroup) parent).removeView(view);
        }
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(i15, i16);
        layoutParams2.leftMargin = i11;
        layoutParams2.rightMargin = i12;
        layoutParams2.topMargin = i13;
        layoutParams2.bottomMargin = i14;
        view.setLayoutParams(layoutParams2);
        linearLayout.addView(view);
    }

    /* renamed from: c */
    private final void m90849c(TypedArray typedArray) {
        setGroupType(typedArray.getInt(AbstractC2815i.ZdsChipGroup_chipGroupType, EnumC16965a.FLEXBOX_GROUP.m90853c()));
        typedArray.recycle();
    }

    /* renamed from: d */
    private final void m90850d(AttributeSet attributeSet, int i11, int i12) {
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, AbstractC2815i.ZdsChipGroup, i11, i12);
        AbstractC19074t.m100207e(obtainStyledAttributes, "context.obtainStyledAttr…p, defStyle, defStyleRes)");
        m90849c(obtainStyledAttributes);
    }

    /* renamed from: e */
    static /* synthetic */ void m90851e(ZdsChipGroup zdsChipGroup, AttributeSet attributeSet, int i11, int i12, int i13, Object obj) {
        if (obj == null) {
            if ((i13 & 2) != 0) {
                i11 = 0;
            }
            if ((i13 & 4) != 0) {
                i12 = 0;
            }
            zdsChipGroup.m90850d(attributeSet, i11, i12);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: parseAttributes");
    }

    public final int getChipCount() {
        return this.f86660p.size();
    }

    protected final int getChipGroupType() {
        return this.f86664t;
    }

    protected final ArrayList<ZdsChip> getChipList() {
        return this.f86660p;
    }

    public final int getLeadingSlotCount() {
        return this.f86661q.size();
    }

    public final int getMiddleSlotCount() {
        return this.f86663s.size();
    }

    public final int getTrailingSlotCount() {
        return this.f86662r.size();
    }

    public final void setBottomPadding(int i11) {
        if (getLayoutParams() instanceof FrameLayout.LayoutParams) {
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            AbstractC19074t.m100206d(layoutParams, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
            Context context = getContext();
            AbstractC19074t.m100207e(context, "context");
            layoutParams2.bottomMargin = C27276c.m139649b(context, i11);
            setLayoutParams(layoutParams2);
        }
    }

    protected final void setChipGroupType(int i11) {
        this.f86664t = i11;
    }

    public final void setGroupType(int i11) {
        this.f86664t = i11;
        if (i11 == EnumC16965a.SCROLLABLE_GROUP.m90853c()) {
            if (this.f86666v == null) {
                HorizontalScrollView horizontalScrollView = new HorizontalScrollView(getContext());
                horizontalScrollView.setLayoutParams(new FrameLayout.LayoutParams(-1, horizontalScrollView.getResources().getDimensionPixelSize(AbstractC2809c.chip_content_height)));
                horizontalScrollView.setHorizontalScrollBarEnabled(false);
                this.f86666v = horizontalScrollView;
                addView(horizontalScrollView);
            }
            if (this.f86667w == null) {
                LinearLayout linearLayout = new LinearLayout(getContext());
                linearLayout.setLayoutParams(new FrameLayout.LayoutParams(-2, -1));
                linearLayout.setOrientation(0);
                this.f86667w = linearLayout;
                HorizontalScrollView horizontalScrollView2 = this.f86666v;
                if (horizontalScrollView2 != null) {
                    horizontalScrollView2.addView(linearLayout);
                }
                LinearLayout linearLayout2 = this.f86667w;
                if (linearLayout2 != null) {
                    linearLayout2.addView(this.f86668x);
                }
            }
            if (this.f86669y.getParent() != null && (this.f86669y.getParent() instanceof ViewGroup)) {
                ViewParent parent = this.f86669y.getParent();
                AbstractC19074t.m100206d(parent, "null cannot be cast to non-null type android.view.ViewGroup");
                ((ViewGroup) parent).removeView(this.f86669y);
            }
            if (this.f86670z == null) {
                LinearLayout linearLayout3 = new LinearLayout(getContext());
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
                layoutParams.gravity = 16;
                linearLayout3.setLayoutParams(layoutParams);
                this.f86670z = linearLayout3;
                LinearLayout linearLayout4 = this.f86667w;
                if (linearLayout4 != null) {
                    linearLayout4.addView(linearLayout3);
                }
            }
            LinearLayout linearLayout5 = this.f86670z;
            if (linearLayout5 != null) {
                Iterator it = this.f86661q.iterator();
                while (it.hasNext()) {
                    View view = (View) it.next();
                    AbstractC19074t.m100207e(view, "leadingSlot");
                    m90848b(view, linearLayout5);
                }
            }
            int chipCount = getChipCount() + getMiddleSlotCount();
            for (int i12 = 0; i12 < chipCount; i12++) {
                FlexboxLayout flexboxLayout = this.f86665u;
                if (flexboxLayout != null) {
                    View childAt = flexboxLayout.getChildAt(0);
                    flexboxLayout.removeView(childAt);
                    if (childAt instanceof ZdsChip) {
                        ZdsChip zdsChip = (ZdsChip) childAt;
                        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, getResources().getDimensionPixelSize(AbstractC2809c.chip_content_height));
                        if (zdsChip.getEnableMargin()) {
                            layoutParams2.rightMargin = getResources().getDimensionPixelSize(AbstractC2809c.chip_right_margin);
                        }
                        layoutParams2.gravity = 16;
                        zdsChip.setLayoutParams(layoutParams2);
                        LinearLayout linearLayout6 = this.f86667w;
                        if (linearLayout6 != null) {
                            linearLayout6.addView(childAt);
                        }
                    } else {
                        LinearLayout linearLayout7 = this.f86667w;
                        if (linearLayout7 != null) {
                            AbstractC19074t.m100207e(childAt, "child");
                            m90848b(childAt, linearLayout7);
                        }
                    }
                }
            }
            if (this.f86659A == null) {
                LinearLayout linearLayout8 = new LinearLayout(getContext());
                LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-2, -2);
                layoutParams3.gravity = 16;
                linearLayout8.setLayoutParams(layoutParams3);
                this.f86659A = linearLayout8;
            }
            LinearLayout linearLayout9 = this.f86659A;
            if (linearLayout9 != null) {
                if (linearLayout9.getParent() != null && (linearLayout9.getParent() instanceof ViewGroup)) {
                    ViewParent parent2 = linearLayout9.getParent();
                    AbstractC19074t.m100206d(parent2, "null cannot be cast to non-null type android.view.ViewGroup");
                    ((ViewGroup) parent2).removeView(linearLayout9);
                }
                LinearLayout linearLayout10 = this.f86667w;
                if (linearLayout10 != null) {
                    linearLayout10.addView(linearLayout9);
                }
                Iterator it2 = this.f86662r.iterator();
                while (it2.hasNext()) {
                    View view2 = (View) it2.next();
                    AbstractC19074t.m100207e(view2, "trailingSlot");
                    m90848b(view2, linearLayout9);
                }
            }
            LinearLayout linearLayout11 = this.f86667w;
            if (linearLayout11 != null) {
                linearLayout11.addView(this.f86669y);
            }
            FlexboxLayout flexboxLayout2 = this.f86665u;
            if (flexboxLayout2 != null) {
                flexboxLayout2.setVisibility(8);
            }
            HorizontalScrollView horizontalScrollView3 = this.f86666v;
            if (horizontalScrollView3 != null) {
                horizontalScrollView3.setVisibility(0);
                return;
            }
            return;
        }
        if (i11 == EnumC16965a.FLEXBOX_GROUP.m90853c()) {
            if (this.f86665u == null) {
                FlexboxLayout flexboxLayout3 = new FlexboxLayout(getContext());
                flexboxLayout3.setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
                flexboxLayout3.setFlexDirection(0);
                flexboxLayout3.setFlexWrap(1);
                flexboxLayout3.setAlignItems(2);
                flexboxLayout3.setAlignContent(0);
                flexboxLayout3.setShowDivider(2);
                Context context = flexboxLayout3.getContext();
                AbstractC19074t.m100207e(context, "context");
                flexboxLayout3.setDividerDrawableHorizontal(C27280g.m139658a(context, AbstractC2810d.flexbox_divider_empty));
                this.f86665u = flexboxLayout3;
                addView(flexboxLayout3);
            }
            LinearLayout linearLayout12 = this.f86670z;
            if (linearLayout12 != null) {
                linearLayout12.removeAllViews();
            }
            Iterator it3 = this.f86661q.iterator();
            while (it3.hasNext()) {
                View view3 = (View) it3.next();
                FlexboxLayout flexboxLayout4 = this.f86665u;
                if (flexboxLayout4 != null) {
                    AbstractC19074t.m100207e(view3, "child");
                    m90847a(view3, flexboxLayout4);
                }
            }
            LinearLayout linearLayout13 = this.f86667w;
            if (linearLayout13 != null) {
                int chipCount2 = getChipCount() + getMiddleSlotCount();
                for (int i13 = 0; i13 < chipCount2; i13++) {
                    View childAt2 = linearLayout13.getChildAt(2);
                    linearLayout13.removeView(childAt2);
                    if (childAt2 instanceof ZdsChip) {
                        ZdsChip zdsChip2 = (ZdsChip) childAt2;
                        FlexboxLayout.LayoutParams layoutParams4 = new FlexboxLayout.LayoutParams(-2, linearLayout13.getResources().getDimensionPixelSize(AbstractC2809c.chip_content_height));
                        if (zdsChip2.getEnableMargin()) {
                            ((ViewGroup.MarginLayoutParams) layoutParams4).rightMargin = linearLayout13.getResources().getDimensionPixelSize(AbstractC2809c.chip_right_margin);
                        }
                        zdsChip2.setLayoutParams(layoutParams4);
                        FlexboxLayout flexboxLayout5 = this.f86665u;
                        if (flexboxLayout5 != null) {
                            flexboxLayout5.addView(childAt2);
                        }
                    } else {
                        FlexboxLayout flexboxLayout6 = this.f86665u;
                        if (flexboxLayout6 != null) {
                            AbstractC19074t.m100207e(childAt2, "child");
                            m90847a(childAt2, flexboxLayout6);
                        }
                    }
                }
            }
            LinearLayout linearLayout14 = this.f86659A;
            if (linearLayout14 != null) {
                linearLayout14.removeAllViews();
            }
            Iterator it4 = this.f86662r.iterator();
            while (it4.hasNext()) {
                View view4 = (View) it4.next();
                FlexboxLayout flexboxLayout7 = this.f86665u;
                if (flexboxLayout7 != null) {
                    AbstractC19074t.m100207e(view4, "child");
                    m90847a(view4, flexboxLayout7);
                }
            }
            HorizontalScrollView horizontalScrollView4 = this.f86666v;
            if (horizontalScrollView4 != null) {
                horizontalScrollView4.setVisibility(8);
            }
            FlexboxLayout flexboxLayout8 = this.f86665u;
            if (flexboxLayout8 != null) {
                flexboxLayout8.setVisibility(0);
            }
        }
    }

    public final void setLeftPadding(int i11) {
        ViewGroup.LayoutParams layoutParams;
        if (this.f86664t == EnumC16965a.FLEXBOX_GROUP.m90853c()) {
            FlexboxLayout flexboxLayout = this.f86665u;
            ViewGroup.LayoutParams layoutParams2 = null;
            if (flexboxLayout != null) {
                layoutParams = flexboxLayout.getLayoutParams();
            } else {
                layoutParams = null;
            }
            if (layoutParams instanceof FrameLayout.LayoutParams) {
                FlexboxLayout flexboxLayout2 = this.f86665u;
                if (flexboxLayout2 != null) {
                    layoutParams2 = flexboxLayout2.getLayoutParams();
                }
                AbstractC19074t.m100206d(layoutParams2, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
                Context context = getContext();
                AbstractC19074t.m100207e(context, "context");
                ((FrameLayout.LayoutParams) layoutParams2).leftMargin = C27276c.m139649b(context, i11);
                return;
            }
            return;
        }
        if (this.f86664t == EnumC16965a.SCROLLABLE_GROUP.m90853c()) {
            View view = this.f86668x;
            Context context2 = getContext();
            AbstractC19074t.m100207e(context2, "context");
            view.setLayoutParams(new LinearLayout.LayoutParams(C27276c.m139649b(context2, i11), -1));
        }
    }

    public final void setRightPadding(int i11) {
        ViewGroup.LayoutParams layoutParams;
        if (this.f86664t == EnumC16965a.FLEXBOX_GROUP.m90853c()) {
            FlexboxLayout flexboxLayout = this.f86665u;
            ViewGroup.LayoutParams layoutParams2 = null;
            if (flexboxLayout != null) {
                layoutParams = flexboxLayout.getLayoutParams();
            } else {
                layoutParams = null;
            }
            if (layoutParams instanceof FrameLayout.LayoutParams) {
                FlexboxLayout flexboxLayout2 = this.f86665u;
                if (flexboxLayout2 != null) {
                    layoutParams2 = flexboxLayout2.getLayoutParams();
                }
                AbstractC19074t.m100206d(layoutParams2, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
                Context context = getContext();
                AbstractC19074t.m100207e(context, "context");
                ((FrameLayout.LayoutParams) layoutParams2).rightMargin = C27276c.m139649b(context, i11);
                return;
            }
            return;
        }
        if (this.f86664t == EnumC16965a.SCROLLABLE_GROUP.m90853c()) {
            View view = this.f86669y;
            Context context2 = getContext();
            AbstractC19074t.m100207e(context2, "context");
            view.setLayoutParams(new LinearLayout.LayoutParams(C27276c.m139649b(context2, i11), -1));
        }
    }

    public final void setStyle(int i11) {
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(i11, AbstractC2815i.ZdsChipGroup);
        AbstractC19074t.m100207e(obtainStyledAttributes, "context.obtainStyledAttr…R.styleable.ZdsChipGroup)");
        m90849c(obtainStyledAttributes);
    }

    public final void setTopPadding(int i11) {
        if (getLayoutParams() instanceof FrameLayout.LayoutParams) {
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            AbstractC19074t.m100206d(layoutParams, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
            Context context = getContext();
            AbstractC19074t.m100207e(context, "context");
            layoutParams2.topMargin = C27276c.m139649b(context, i11);
            setLayoutParams(layoutParams2);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ZdsChipGroup(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        AbstractC19074t.m100208f(context, "context");
        this.f86660p = new ArrayList();
        this.f86661q = new ArrayList();
        this.f86662r = new ArrayList();
        this.f86663s = new ArrayList();
        this.f86664t = EnumC16965a.FLEXBOX_GROUP.m90853c();
        this.f86668x = new View(getContext());
        this.f86669y = new View(getContext());
        m90851e(this, attributeSet, i11, 0, 4, null);
    }
}
