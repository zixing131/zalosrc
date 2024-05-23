package com.zing.zalo.uicontrol.voice;

import android.animation.LayoutTransition;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import bi0.AbstractC2807a;
import bi0.AbstractC2814h;
import com.zing.zalo.AbstractC16803z;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.AbstractC8915g0;
import com.zing.zalo.p077ui.widget.RobotoTextView;
import com.zing.zalo.zdesign.component.Button;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import me0.AbstractC23136l9;
import me0.AbstractC23222t7;
import me0.C23212s8;
import mj0.AbstractC23322a;
import pm0.C24860q;
import ti0.C26705d;
import ti0.C26708g;

/* loaded from: classes4.dex */
public final class BoardButtonLayout extends FrameLayout {
    public static final C16669a Companion = new C16669a(null);

    /* renamed from: x */
    private static final int f84508x = AbstractC23222t7.f112561g0;

    /* renamed from: y */
    private static final int f84509y = AbstractC23222t7.f112566j;

    /* renamed from: z */
    private static final int f84510z = AbstractC23222t7.f112586t;

    /* renamed from: p */
    private boolean f84511p;

    /* renamed from: q */
    private final Button f84512q;

    /* renamed from: r */
    private final RobotoTextView f84513r;

    /* renamed from: s */
    private final BoardRecordButton f84514s;

    /* renamed from: t */
    private final RobotoTextView f84515t;

    /* renamed from: u */
    private final Button f84516u;

    /* renamed from: v */
    private final RobotoTextView f84517v;

    /* renamed from: w */
    private final C24860q[] f84518w;

    /* renamed from: com.zing.zalo.uicontrol.voice.BoardButtonLayout$a */
    /* loaded from: classes4.dex */
    public static final class C16669a {
        private C16669a() {
        }

        public /* synthetic */ C16669a(AbstractC19060k abstractC19060k) {
            this();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BoardButtonLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        AbstractC19074t.m100208f(context, "context");
        BoardRecordButton boardRecordButton = new BoardRecordButton(context);
        boardRecordButton.getInnerButton().setId(AbstractC6918a0.voice_record_primary_button);
        boardRecordButton.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
        this.f84514s = boardRecordButton;
        RobotoTextView robotoTextView = new RobotoTextView(context);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        int i11 = f84509y;
        layoutParams.topMargin = i11 - boardRecordButton.getMaxPadding();
        robotoTextView.setLayoutParams(layoutParams);
        robotoTextView.setVisibility(4);
        robotoTextView.setGravity(17);
        robotoTextView.setText(AbstractC23136l9.m118743r0(AbstractC8020f0.str_send));
        m88813a(robotoTextView, context, AbstractC2814h.t_normal);
        robotoTextView.setTextColor(C23212s8.m119607o(context, AbstractC2807a.text_01));
        this.f84515t = robotoTextView;
        Button button = new Button(context);
        button.setId(AbstractC6918a0.voice_record_left_button);
        int i12 = f84508x;
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(i12, -2);
        layoutParams2.topMargin = boardRecordButton.getMaxPadding();
        int i13 = f84510z;
        layoutParams2.leftMargin = i13;
        button.setLayoutParams(layoutParams2);
        button.setVisibility(8);
        button.m90539c(AbstractC8915g0.ButtonLargeVoice_Secondary_Default);
        button.setSupportiveIcon(AbstractC23322a.zds_ic_delete_solid_32);
        this.f84512q = button;
        RobotoTextView robotoTextView2 = new RobotoTextView(context);
        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(-2, -2);
        layoutParams3.topMargin = i11;
        robotoTextView2.setLayoutParams(layoutParams3);
        robotoTextView2.setVisibility(8);
        robotoTextView2.setGravity(17);
        robotoTextView2.setText(AbstractC23136l9.m118743r0(AbstractC8020f0.str_delete));
        m88813a(robotoTextView2, context, AbstractC2814h.t_normal);
        robotoTextView2.setTextColor(C23212s8.m119607o(context, AbstractC2807a.text_01));
        this.f84513r = robotoTextView2;
        Button button2 = new Button(context);
        button2.setId(AbstractC6918a0.voice_record_right_button);
        FrameLayout.LayoutParams layoutParams4 = new FrameLayout.LayoutParams(i12, -2);
        layoutParams4.topMargin = boardRecordButton.getMaxPadding();
        layoutParams4.rightMargin = i13;
        button2.setLayoutParams(layoutParams4);
        button2.setVisibility(8);
        button2.setEnabled(false);
        button2.m90539c(AbstractC8915g0.ButtonLargeVoice_Secondary_Default);
        button2.setSupportiveIcon(AbstractC16803z.ic_preview_voice_32);
        this.f84516u = button2;
        RobotoTextView robotoTextView3 = new RobotoTextView(context);
        FrameLayout.LayoutParams layoutParams5 = new FrameLayout.LayoutParams(-2, -2);
        layoutParams5.topMargin = i11;
        robotoTextView3.setLayoutParams(layoutParams5);
        robotoTextView3.setVisibility(8);
        robotoTextView3.setGravity(17);
        robotoTextView3.setText(AbstractC23136l9.m118743r0(AbstractC8020f0.str_preview_listen_voice_record));
        m88813a(robotoTextView3, context, AbstractC2814h.t_normal);
        robotoTextView3.setTextColor(C23212s8.m119607o(context, AbstractC2807a.text_03));
        this.f84517v = robotoTextView3;
        C24860q[] c24860qArr = {new C24860q(boardRecordButton, robotoTextView), new C24860q(button, robotoTextView2), new C24860q(button2, robotoTextView3)};
        this.f84518w = c24860qArr;
        for (C24860q c24860q : c24860qArr) {
            addView((View) c24860q.m129215c());
            addView((View) c24860q.m129216d());
        }
        LayoutTransition layoutTransition = getLayoutTransition();
        if (layoutTransition != null) {
            layoutTransition.disableTransitionType(2);
        }
        LayoutTransition layoutTransition2 = getLayoutTransition();
        if (layoutTransition2 != null) {
            layoutTransition2.disableTransitionType(3);
        }
    }

    /* renamed from: a */
    private final void m88813a(RobotoTextView robotoTextView, Context context, int i11) {
        new C26708g(robotoTextView).m137319a(C26705d.m137293a(context, i11));
    }

    /* renamed from: b */
    private final void m88814b(View view, int i11, int i12) {
        view.layout(i12, i11, view.getMeasuredWidth() + i12, view.getMeasuredHeight() + i11);
    }

    /* renamed from: c */
    private final void m88815c(int i11) {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        int i12;
        ViewGroup.LayoutParams layoutParams = this.f84512q.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams2 = null;
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        } else {
            marginLayoutParams = null;
        }
        int i13 = 0;
        if (marginLayoutParams != null) {
            i12 = marginLayoutParams.topMargin;
        } else {
            i12 = 0;
        }
        if (this.f84511p) {
            i13 = (i11 / 4) - (this.f84512q.getMeasuredWidth() / 2);
        } else {
            ViewGroup.LayoutParams layoutParams2 = this.f84512q.getLayoutParams();
            if (layoutParams2 instanceof ViewGroup.MarginLayoutParams) {
                marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams2;
            }
            if (marginLayoutParams2 != null) {
                i13 = marginLayoutParams2.leftMargin;
            }
        }
        m88814b(this.f84512q, i12, i13);
    }

    /* renamed from: d */
    private final void m88816d(int i11) {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        int i12;
        int i13;
        int measuredWidth;
        ViewGroup.LayoutParams layoutParams = this.f84514s.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        } else {
            marginLayoutParams = null;
        }
        if (marginLayoutParams != null) {
            i12 = marginLayoutParams.topMargin;
        } else {
            i12 = 0;
        }
        if (this.f84511p) {
            i13 = (i11 * 3) / 4;
            measuredWidth = this.f84514s.getMeasuredWidth() / 2;
        } else {
            i13 = i11 / 2;
            measuredWidth = this.f84514s.getMeasuredWidth() / 2;
        }
        m88814b(this.f84514s, i12, i13 - measuredWidth);
    }

    /* renamed from: e */
    private final void m88817e(int i11) {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        int i12;
        ViewGroup.LayoutParams layoutParams = this.f84516u.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams2 = null;
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        } else {
            marginLayoutParams = null;
        }
        int i13 = 0;
        if (marginLayoutParams != null) {
            i12 = marginLayoutParams.topMargin;
        } else {
            i12 = 0;
        }
        ViewGroup.LayoutParams layoutParams2 = this.f84516u.getLayoutParams();
        if (layoutParams2 instanceof ViewGroup.MarginLayoutParams) {
            marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams2;
        }
        if (marginLayoutParams2 != null) {
            i13 = marginLayoutParams2.rightMargin;
        }
        m88814b(this.f84516u, i12, (i11 - i13) - this.f84516u.getMeasuredWidth());
    }

    /* renamed from: f */
    private final void m88818f(View view, RobotoTextView robotoTextView) {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        int i11;
        int left = view.getLeft() + (((view.getRight() - view.getLeft()) - robotoTextView.getMeasuredWidth()) / 2);
        int bottom = view.getBottom();
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams2 = null;
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        } else {
            marginLayoutParams = null;
        }
        int i12 = 0;
        if (marginLayoutParams != null) {
            i11 = marginLayoutParams.bottomMargin;
        } else {
            i11 = 0;
        }
        int i13 = bottom + i11;
        ViewGroup.LayoutParams layoutParams2 = robotoTextView.getLayoutParams();
        if (layoutParams2 instanceof ViewGroup.MarginLayoutParams) {
            marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams2;
        }
        if (marginLayoutParams2 != null) {
            i12 = marginLayoutParams2.topMargin;
        }
        m88814b(robotoTextView, i13 + i12, left);
    }

    /* renamed from: g */
    private final void m88819g(int i11, int i12) {
        int size = View.MeasureSpec.getSize(i11);
        int size2 = View.MeasureSpec.getSize(i12);
        for (C24860q c24860q : this.f84518w) {
            m88820h((View) c24860q.m129215c(), (RobotoTextView) c24860q.m129216d(), size, size2);
        }
    }

    private final int getMaximumNeededHeight() {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        int i11;
        ViewGroup.MarginLayoutParams marginLayoutParams2;
        int i12;
        ViewGroup.MarginLayoutParams marginLayoutParams3;
        int i13;
        int i14;
        int i15 = 0;
        for (C24860q c24860q : this.f84518w) {
            View view = (View) c24860q.m129215c();
            RobotoTextView robotoTextView = (RobotoTextView) c24860q.m129216d();
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            ViewGroup.MarginLayoutParams marginLayoutParams4 = null;
            if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            } else {
                marginLayoutParams = null;
            }
            if (marginLayoutParams != null) {
                i11 = marginLayoutParams.topMargin;
            } else {
                i11 = 0;
            }
            int measuredHeight = i11 + view.getMeasuredHeight();
            ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
            if (layoutParams2 instanceof ViewGroup.MarginLayoutParams) {
                marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams2;
            } else {
                marginLayoutParams2 = null;
            }
            if (marginLayoutParams2 != null) {
                i12 = marginLayoutParams2.bottomMargin;
            } else {
                i12 = 0;
            }
            int i16 = measuredHeight + i12;
            ViewGroup.LayoutParams layoutParams3 = robotoTextView.getLayoutParams();
            if (layoutParams3 instanceof ViewGroup.MarginLayoutParams) {
                marginLayoutParams3 = (ViewGroup.MarginLayoutParams) layoutParams3;
            } else {
                marginLayoutParams3 = null;
            }
            if (marginLayoutParams3 != null) {
                i13 = marginLayoutParams3.topMargin;
            } else {
                i13 = 0;
            }
            int measuredHeight2 = i13 + i16 + robotoTextView.getMeasuredHeight();
            ViewGroup.LayoutParams layoutParams4 = robotoTextView.getLayoutParams();
            if (layoutParams4 instanceof ViewGroup.MarginLayoutParams) {
                marginLayoutParams4 = (ViewGroup.MarginLayoutParams) layoutParams4;
            }
            if (marginLayoutParams4 != null) {
                i14 = marginLayoutParams4.bottomMargin;
            } else {
                i14 = 0;
            }
            i15 = Math.max(i15, Math.max(i16, measuredHeight2 + i14));
        }
        return i15;
    }

    /* renamed from: h */
    private final void m88820h(View view, RobotoTextView robotoTextView, int i11, int i12) {
        if (view.getVisibility() == 8) {
            return;
        }
        measureChildWithMargins(view, View.MeasureSpec.makeMeasureSpec(i11, 0), 0, View.MeasureSpec.makeMeasureSpec(i12, 0), 0);
        if (robotoTextView.getVisibility() == 8) {
            return;
        }
        measureChildWithMargins(robotoTextView, View.MeasureSpec.makeMeasureSpec(view.getMeasuredWidth() + (f84510z * 2), Integer.MIN_VALUE), 0, View.MeasureSpec.makeMeasureSpec(i12, 0), 0);
    }

    public final Button getLeftButton() {
        return this.f84512q;
    }

    public final RobotoTextView getLeftTextView() {
        return this.f84513r;
    }

    public final BoardRecordButton getRecordButton() {
        return this.f84514s;
    }

    public final RobotoTextView getRecordText() {
        return this.f84515t;
    }

    public final Button getRightButton() {
        return this.f84516u;
    }

    public final RobotoTextView getRightTextView() {
        return this.f84517v;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z11, int i11, int i12, int i13, int i14) {
        int i15 = i13 - i11;
        m88816d(i15);
        m88817e(i15);
        m88815c(i15);
        for (C24860q c24860q : this.f84518w) {
            m88818f((View) c24860q.m129215c(), (RobotoTextView) c24860q.m129216d());
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int i11, int i12) {
        m88819g(i11, i12);
        setMeasuredDimension(View.MeasureSpec.getSize(i11), getMaximumNeededHeight());
    }

    public final void setTwoButtonMode(boolean z11) {
        if (this.f84511p != z11) {
            this.f84511p = z11;
            requestLayout();
        }
    }
}
