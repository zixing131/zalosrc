package com.zing.zalo.zview.actionbar;

import android.R;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.zing.zalo.p077ui.widget.C13718q1;
import com.zing.zalo.p077ui.widget.RobotoTextView;
import com.zing.zalo.zview.AbstractC17454d;
import com.zing.zalo.zview.AbstractC17466e;
import com.zing.zalo.zview.AbstractC17468f;
import com.zing.zalo.zview.AbstractC17470g;
import com.zing.zalo.zview.AbstractC17484n;
import p542ub.InterfaceC27218a;
import zl0.AbstractC32226c;
import zl0.AbstractC32232i;

/* loaded from: classes7.dex */
public class ActionBar extends FrameLayout {

    /* renamed from: A */
    int f88807A;

    /* renamed from: B */
    int f88808B;

    /* renamed from: C */
    boolean f88809C;

    /* renamed from: D */
    int f88810D;

    /* renamed from: E */
    int f88811E;

    /* renamed from: F */
    boolean f88812F;

    /* renamed from: G */
    boolean f88813G;

    /* renamed from: H */
    boolean f88814H;

    /* renamed from: I */
    int f88815I;

    /* renamed from: J */
    private View f88816J;

    /* renamed from: p */
    ImageView f88817p;

    /* renamed from: q */
    View f88818q;

    /* renamed from: r */
    TextView f88819r;

    /* renamed from: s */
    TextView f88820s;

    /* renamed from: t */
    View f88821t;

    /* renamed from: u */
    ActionBarMenu f88822u;

    /* renamed from: v */
    ActionBarMenu f88823v;

    /* renamed from: w */
    boolean f88824w;

    /* renamed from: x */
    protected boolean f88825x;

    /* renamed from: y */
    protected int f88826y;

    /* renamed from: z */
    public C17431a f88827z;

    /* renamed from: com.zing.zalo.zview.actionbar.ActionBar$a */
    /* loaded from: classes7.dex */
    public static class C17431a {
        /* renamed from: a */
        public boolean mo66911a() {
            return true;
        }

        /* renamed from: b */
        public void mo46831b(int i11) {
        }
    }

    public ActionBar(Context context) {
        this(context, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: q */
    public /* synthetic */ void m92706q(View view) {
        C17431a c17431a = this.f88827z;
        if (c17431a != null) {
            c17431a.mo46831b(R.id.home);
        }
    }

    /* renamed from: b */
    public View m92707b(View view, FrameLayout.LayoutParams layoutParams) {
        this.f88816J = view;
        addView(view, layoutParams);
        return view;
    }

    /* renamed from: c */
    public void m92708c() {
        ActionBarMenu actionBarMenu;
        if (this.f88825x && (actionBarMenu = this.f88822u) != null) {
            actionBarMenu.m92751s();
        }
    }

    /* renamed from: d */
    public ActionBarMenu m92709d() {
        int i11;
        ActionBarMenu actionBarMenu = this.f88823v;
        if (actionBarMenu != null) {
            return actionBarMenu;
        }
        ActionBarMenu actionBarMenu2 = new ActionBarMenu(getContext(), this);
        this.f88823v = actionBarMenu2;
        actionBarMenu2.setBackgroundResource(AbstractC17466e.editheader);
        addView(this.f88823v);
        ActionBarMenu actionBarMenu3 = this.f88823v;
        if (this.f88824w) {
            i11 = this.f88815I;
        } else {
            i11 = 0;
        }
        actionBarMenu3.setPadding(0, i11, 0, 0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f88823v.getLayoutParams();
        layoutParams.height = -1;
        layoutParams.width = -1;
        layoutParams.gravity = 5;
        this.f88823v.setLayoutParams(layoutParams);
        this.f88823v.setVisibility(4);
        return this.f88823v;
    }

    /* renamed from: e */
    void m92710e(int i11) {
        if (this.f88818q != null) {
            return;
        }
        View inflate = LayoutInflater.from(getContext()).inflate(i11, (ViewGroup) null);
        this.f88818q = inflate;
        int i12 = this.f88826y;
        if (i12 >= 0) {
            inflate.setBackgroundResource(i12);
        }
        addView(this.f88818q);
    }

    /* renamed from: f */
    void m92711f() {
        if (this.f88817p != null) {
            return;
        }
        ImageView imageView = (ImageView) LayoutInflater.from(getContext()).inflate(AbstractC17470g.action_bar_item, (ViewGroup) null);
        this.f88817p = imageView;
        imageView.setId(R.id.home);
        this.f88817p.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        int i11 = this.f88826y;
        if (i11 >= 0) {
            this.f88817p.setBackgroundResource(i11);
        }
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(AbstractC32232i.m155453a(54.0f), AbstractC32232i.m155453a(54.0f));
        layoutParams.gravity = 51;
        addView(this.f88817p, layoutParams);
        this.f88817p.setOnClickListener(new View.OnClickListener() { // from class: com.zing.zalo.zview.actionbar.a
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ActionBar.this.m92706q(view);
            }
        });
    }

    /* renamed from: g */
    public ActionBarMenu m92712g() {
        ActionBarMenu actionBarMenu = this.f88822u;
        if (actionBarMenu != null) {
            return actionBarMenu;
        }
        ActionBarMenu actionBarMenu2 = new ActionBarMenu(getContext(), this);
        this.f88822u = actionBarMenu2;
        addView(actionBarMenu2);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f88822u.getLayoutParams();
        layoutParams.height = -1;
        layoutParams.width = -2;
        layoutParams.gravity = 5;
        this.f88822u.setLayoutParams(layoutParams);
        return this.f88822u;
    }

    public int getActionBarHeight() {
        return this.f88808B;
    }

    public ActionBarMenu getActionMode() {
        return this.f88823v;
    }

    public View getAvatarLayout() {
        return this.f88818q;
    }

    public ImageView getBackButtonImage() {
        return this.f88817p;
    }

    int getMarginLeftAvatarBack() {
        int i11;
        int m155453a = AbstractC32232i.m155453a(8.0f);
        ImageView imageView = this.f88817p;
        int i12 = 0;
        if (imageView != null && imageView.getVisibility() != 8) {
            i11 = this.f88817p.getMeasuredWidth() + AbstractC32232i.m155453a(2.0f);
        } else {
            i11 = 0;
        }
        int i13 = m155453a + i11;
        View view = this.f88818q;
        if (view != null && view.getVisibility() != 8) {
            i12 = AbstractC32232i.m155453a(2.0f) + this.f88818q.getMeasuredWidth();
        }
        return i13 + i12;
    }

    public boolean getOccupyStatusBar() {
        return this.f88824w;
    }

    int getOffset() {
        float f11;
        float f12;
        if (this.f88814H) {
            if (!AbstractC32232i.m155460h() && getResources().getConfiguration().orientation == 2) {
                f12 = 4.0f;
            } else {
                f12 = 6.0f;
            }
            return AbstractC32232i.m155453a(f12);
        }
        if (!AbstractC32232i.m155460h() && getResources().getConfiguration().orientation == 2) {
            f11 = 1.0f;
        } else {
            f11 = 3.0f;
        }
        return AbstractC32232i.m155453a(f11);
    }

    public String getSubTitle() {
        TextView textView = this.f88820s;
        if (textView == null) {
            return null;
        }
        return textView.getText().toString();
    }

    public Drawable getSubtitleIcon() {
        return this.f88820s.getCompoundDrawables()[0];
    }

    public TextView getSubtitleTextView() {
        return this.f88820s;
    }

    public String getTitle() {
        TextView textView = this.f88819r;
        if (textView == null) {
            return null;
        }
        return textView.getText().toString();
    }

    public TextView getTitleTextView() {
        return this.f88819r;
    }

    /* renamed from: h */
    void m92713h() {
        if (this.f88820s != null) {
            return;
        }
        RobotoTextView robotoTextView = new RobotoTextView(getContext());
        this.f88820s = robotoTextView;
        robotoTextView.setId(AbstractC17468f.action_bar_subtitle);
        this.f88820s.setGravity(3);
        this.f88820s.setTextColor(this.f88811E);
        int i11 = 1;
        this.f88820s.setSingleLine(true);
        this.f88820s.setLines(1);
        this.f88820s.setMaxLines(1);
        ((RobotoTextView) this.f88820s).setMaxScaledTextSize(AbstractC32232i.m155453a(16.0f));
        this.f88820s.setTextSize(1, 12.0f);
        this.f88820s.setEllipsize(TextUtils.TruncateAt.END);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        if (!this.f88813G) {
            i11 = 51;
        }
        layoutParams.gravity = i11;
        addView(this.f88820s, layoutParams);
    }

    /* renamed from: i */
    void m92714i() {
        if (this.f88819r != null) {
            return;
        }
        RobotoTextView robotoTextView = new RobotoTextView(getContext());
        this.f88819r = robotoTextView;
        robotoTextView.setId(AbstractC17468f.action_bar_title);
        this.f88819r.setGravity(3);
        this.f88819r.setTextColor(this.f88810D);
        int i11 = 1;
        this.f88819r.setSingleLine(true);
        this.f88819r.setLines(1);
        this.f88819r.setMaxLines(1);
        ((RobotoTextView) this.f88819r).setMaxScaledTextSize(AbstractC32232i.m155453a(20.0f));
        this.f88819r.setTextSize(1, 16.0f);
        this.f88819r.setEllipsize(TextUtils.TruncateAt.END);
        this.f88819r.setTypeface(C13718q1.m76695d(getContext(), 7));
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        if (!this.f88813G) {
            i11 = 51;
        }
        layoutParams.gravity = i11;
        addView(this.f88819r, layoutParams);
    }

    /* renamed from: j */
    public View m92715j(int i11) {
        try {
            View view = this.f88816J;
            if (view == null) {
                return null;
            }
            if (i11 == 0) {
                return view;
            }
            if (view instanceof ViewGroup) {
                return ((ViewGroup) view).findViewById(i11);
            }
            return view;
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: k */
    public void m92716k() {
        View view;
        ActionBarMenu actionBarMenu = this.f88823v;
        if (actionBarMenu == null) {
            return;
        }
        actionBarMenu.setVisibility(4);
        if (this.f88824w && (view = this.f88821t) != null) {
            view.setVisibility(4);
        }
        TextView textView = this.f88819r;
        if (textView != null) {
            textView.setVisibility(0);
        }
        TextView textView2 = this.f88820s;
        if (textView2 != null) {
            textView2.setVisibility(0);
        }
        ImageView imageView = this.f88817p;
        if (imageView != null) {
            imageView.setVisibility(0);
        }
        View view2 = this.f88818q;
        if (view2 != null) {
            view2.setVisibility(0);
        }
        ActionBarMenu actionBarMenu2 = this.f88822u;
        if (actionBarMenu2 != null) {
            actionBarMenu2.setVisibility(0);
        }
    }

    /* renamed from: l */
    public View m92717l(int i11) {
        if (this.f88818q == null) {
            m92710e(i11);
        }
        return this.f88818q;
    }

    /* renamed from: m */
    public boolean m92718m() {
        ActionBarMenu actionBarMenu = this.f88823v;
        if (actionBarMenu != null && actionBarMenu.getVisibility() == 0) {
            return true;
        }
        return false;
    }

    /* renamed from: n */
    public boolean m92719n() {
        return this.f88825x;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        m92726x();
    }

    @Override // android.view.View
    protected void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if (!this.f88812F) {
            this.f88808B = getResources().getDimensionPixelSize(AbstractC17454d.action_bar_default_height);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:71:0x01aa  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01c1  */
    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected void onLayout(boolean z11, int i11, int i12, int i13, int i14) {
        int i15;
        float f11;
        int m155453a;
        int i16;
        int i17;
        int i18;
        int i19;
        int i21;
        int i22;
        int measuredHeight;
        if (this.f88824w) {
            i15 = this.f88815I;
        } else {
            i15 = 0;
        }
        ImageView imageView = this.f88817p;
        if (imageView != null && imageView.getVisibility() != 8) {
            ImageView imageView2 = this.f88817p;
            imageView2.layout(0, i15, imageView2.getMeasuredWidth(), this.f88817p.getMeasuredHeight() + i15);
            m155453a = this.f88817p.getMeasuredWidth() + AbstractC32232i.m155453a(2.0f);
        } else {
            if (AbstractC32232i.m155460h()) {
                f11 = 24.0f;
            } else {
                f11 = 16.0f;
            }
            m155453a = AbstractC32232i.m155453a(f11);
        }
        View view = this.f88818q;
        if (view != null && view.getVisibility() != 8) {
            int measuredHeight2 = (this.f88808B - this.f88818q.getMeasuredHeight()) / 2;
            View view2 = this.f88818q;
            int i23 = measuredHeight2 + i15;
            view2.layout(m155453a, i23, view2.getMeasuredWidth() + m155453a, this.f88818q.getMeasuredHeight() + i23);
            m155453a += this.f88818q.getMeasuredWidth() + AbstractC32232i.m155453a(12.0f);
        }
        ActionBarMenu actionBarMenu = this.f88822u;
        if (actionBarMenu != null && actionBarMenu.getVisibility() != 8) {
            int measuredWidth = (i13 - i11) - this.f88822u.getMeasuredWidth();
            ActionBarMenu actionBarMenu2 = this.f88822u;
            actionBarMenu2.layout(measuredWidth, i15, actionBarMenu2.getMeasuredWidth() + measuredWidth, this.f88822u.getMeasuredHeight() + i15);
        }
        int offset = getOffset();
        TextView textView = this.f88819r;
        if (textView != null && textView.getVisibility() != 8) {
            TextView textView2 = this.f88820s;
            if (textView2 != null && textView2.getVisibility() != 8) {
                measuredHeight = (((this.f88808B / 2) - this.f88819r.getMeasuredHeight()) / 2) + offset;
            } else {
                measuredHeight = (this.f88808B - this.f88819r.getMeasuredHeight()) / 2;
            }
            int i24 = ((FrameLayout.LayoutParams) this.f88819r.getLayoutParams()).gravity;
            if (i24 == -1) {
                i24 = 51;
            }
            if ((i24 & 7) == 1) {
                m155453a = (getMeasuredWidth() - this.f88819r.getMeasuredWidth()) / 2;
            }
            TextView textView3 = this.f88819r;
            int i25 = measuredHeight + i15;
            textView3.layout(m155453a, i25, textView3.getMeasuredWidth() + m155453a, this.f88819r.getMeasuredHeight() + i25);
        }
        TextView textView4 = this.f88820s;
        if (textView4 != null && textView4.getVisibility() != 8) {
            int i26 = this.f88808B;
            int measuredHeight3 = ((i26 / 2) + (((i26 / 2) - this.f88820s.getMeasuredHeight()) / 2)) - offset;
            int i27 = ((FrameLayout.LayoutParams) this.f88820s.getLayoutParams()).gravity;
            if (i27 == -1) {
                i27 = 51;
            }
            if ((i27 & 7) == 1) {
                m155453a = (getMeasuredWidth() - this.f88820s.getMeasuredWidth()) / 2;
            }
            TextView textView5 = this.f88820s;
            int i28 = measuredHeight3 + i15;
            textView5.layout(m155453a, i28, textView5.getMeasuredWidth() + m155453a, this.f88820s.getMeasuredHeight() + i28);
        }
        int childCount = getChildCount();
        for (int i29 = 0; i29 < childCount; i29++) {
            View childAt = getChildAt(i29);
            if (childAt.getVisibility() != 8 && childAt != this.f88819r && childAt != this.f88820s && childAt != this.f88822u && childAt != this.f88817p && childAt != this.f88818q) {
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
                int measuredWidth2 = childAt.getMeasuredWidth();
                int measuredHeight4 = childAt.getMeasuredHeight();
                int i31 = layoutParams.gravity;
                if (i31 == -1) {
                    i31 = 51;
                }
                int i32 = i31 & 112;
                int i33 = i31 & 7;
                if (i33 != 1) {
                    if (i33 != 5) {
                        i18 = layoutParams.leftMargin;
                        if (i32 == 16) {
                            if (i32 != 80) {
                                if (childAt == this.f88823v) {
                                    i22 = layoutParams.topMargin;
                                } else {
                                    i22 = layoutParams.topMargin + i15;
                                }
                                childAt.layout(i18, i22, measuredWidth2 + i18, measuredHeight4 + i22);
                            } else {
                                i19 = (i14 - i12) - measuredHeight4;
                                i21 = layoutParams.bottomMargin;
                            }
                        } else if (childAt == this.f88823v) {
                            i19 = (((i14 - i12) - measuredHeight4) / 2) + layoutParams.topMargin;
                            i21 = layoutParams.bottomMargin;
                        } else {
                            i19 = (((i14 - (i12 + i15)) - measuredHeight4) / 2) + i15 + layoutParams.topMargin;
                            i21 = layoutParams.bottomMargin;
                        }
                        i22 = i19 - i21;
                        childAt.layout(i18, i22, measuredWidth2 + i18, measuredHeight4 + i22);
                    } else {
                        i16 = i13 - measuredWidth2;
                        i17 = layoutParams.rightMargin;
                    }
                } else {
                    i16 = (((i13 - i11) - measuredWidth2) / 2) + layoutParams.leftMargin;
                    i17 = layoutParams.rightMargin;
                }
                i18 = i16 - i17;
                if (i32 == 16) {
                }
                i22 = i19 - i21;
                childAt.layout(i18, i22, measuredWidth2 + i18, measuredHeight4 + i22);
            }
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int i11, int i12) {
        int i13;
        float f11;
        int m155453a;
        TextView textView;
        ActionBarMenu actionBarMenu;
        int i14;
        boolean z11;
        int i15;
        int i16;
        int i17;
        int makeMeasureSpec;
        float f12;
        int size = View.MeasureSpec.getSize(i11);
        View.MeasureSpec.getSize(i12);
        int i18 = this.f88808B;
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i18, 1073741824);
        int i19 = this.f88807A + i18;
        if (this.f88824w) {
            i13 = this.f88815I;
        } else {
            i13 = 0;
        }
        setMeasuredDimension(size, i19 + i13);
        ImageView imageView = this.f88817p;
        if (imageView != null && imageView.getVisibility() != 8) {
            ImageView imageView2 = this.f88817p;
            imageView2.measure(View.MeasureSpec.makeMeasureSpec(imageView2.getLayoutParams().width, 1073741824), makeMeasureSpec2);
            m155453a = this.f88817p.getLayoutParams().width + AbstractC32232i.m155453a(2.0f);
        } else {
            if (AbstractC32232i.m155460h()) {
                f11 = 24.0f;
            } else {
                f11 = 16.0f;
            }
            m155453a = AbstractC32232i.m155453a(f11);
        }
        View view = this.f88818q;
        if (view != null && view.getVisibility() != 8) {
            int m155453a2 = AbstractC32232i.m155453a(40.0f);
            this.f88818q.measure(View.MeasureSpec.makeMeasureSpec(m155453a2, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(m155453a2, Integer.MIN_VALUE));
            m155453a += m155453a2;
        }
        ActionBarMenu actionBarMenu2 = this.f88822u;
        if (actionBarMenu2 != null && actionBarMenu2.getVisibility() != 8) {
            if (this.f88825x) {
                if (AbstractC32232i.m155460h()) {
                    f12 = 74.0f;
                } else {
                    f12 = 54.0f;
                }
                makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size - AbstractC32232i.m155453a(f12), 1073741824);
            } else {
                makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE);
            }
            this.f88822u.measure(makeMeasureSpec, makeMeasureSpec2);
        }
        TextView textView2 = this.f88819r;
        if ((textView2 != null && textView2.getVisibility() != 8) || ((textView = this.f88820s) != null && textView.getVisibility() != 8)) {
            View view2 = this.f88816J;
            if (view2 != null && view2.getVisibility() != 8) {
                View view3 = this.f88816J;
                if (view3 instanceof ViewGroup) {
                    ViewGroup viewGroup = (ViewGroup) view3;
                    int childCount = viewGroup.getChildCount();
                    i15 = 0;
                    for (int i21 = 0; i21 < childCount; i21++) {
                        View childAt = viewGroup.getChildAt(i21);
                        if (childAt.getVisibility() != 8) {
                            i15 += childAt.getLayoutParams().width;
                        }
                    }
                } else {
                    i15 = view3.getLayoutParams().width;
                }
                this.f88816J.measure(View.MeasureSpec.makeMeasureSpec(i15, 1073741824), makeMeasureSpec2);
                z11 = true;
            } else {
                z11 = false;
                i15 = 0;
            }
            ActionBarMenu actionBarMenu3 = this.f88822u;
            if (actionBarMenu3 != null) {
                i16 = actionBarMenu3.getMeasuredWidth();
            } else {
                i16 = 0;
            }
            int max = Math.max(i15, i16);
            if (z11) {
                i17 = 2;
            } else {
                i17 = 1;
            }
            int m155453a3 = ((size - (i17 * max)) - AbstractC32232i.m155453a(16.0f)) - m155453a;
            TextView textView3 = this.f88819r;
            if (textView3 != null && textView3.getVisibility() != 8) {
                this.f88819r.measure(View.MeasureSpec.makeMeasureSpec(m155453a3, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(i18, Integer.MIN_VALUE));
            }
            TextView textView4 = this.f88820s;
            if (textView4 != null && textView4.getVisibility() != 8) {
                this.f88820s.measure(View.MeasureSpec.makeMeasureSpec(m155453a3, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(i18, Integer.MIN_VALUE));
            }
        }
        int childCount2 = getChildCount();
        for (int i22 = 0; i22 < childCount2; i22++) {
            View childAt2 = getChildAt(i22);
            if (childAt2.getVisibility() != 8 && childAt2 != this.f88819r && childAt2 != this.f88820s && childAt2 != (actionBarMenu = this.f88822u) && childAt2 != this.f88817p && childAt2 != this.f88818q) {
                if (childAt2 == this.f88823v) {
                    measureChildWithMargins(childAt2, i11, 0, View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824), 0);
                } else {
                    if (actionBarMenu != null) {
                        i14 = actionBarMenu.getMeasuredWidth();
                    } else {
                        i14 = 0;
                    }
                    measureChildWithMargins(childAt2, View.MeasureSpec.makeMeasureSpec(size - i14, 1073741824), 0, View.MeasureSpec.makeMeasureSpec(i18, 1073741824), 0);
                }
            }
        }
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        super.onTouchEvent(motionEvent);
        return !this.f88809C;
    }

    /* renamed from: p */
    public boolean m92720p() {
        ActionBarMenu actionBarMenu = this.f88823v;
        if (actionBarMenu != null && actionBarMenu.getVisibility() == 0) {
            return true;
        }
        return false;
    }

    /* renamed from: r */
    public void m92721r() {
        ActionBarMenu actionBarMenu = this.f88822u;
        if (actionBarMenu != null) {
            actionBarMenu.m92753w();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: s */
    public void m92722s(boolean z11) {
        int i11;
        this.f88825x = z11;
        TextView textView = this.f88819r;
        int i12 = 0;
        if (textView != null) {
            if (z11) {
                i11 = 4;
            } else {
                i11 = 0;
            }
            textView.setVisibility(i11);
        }
        TextView textView2 = this.f88820s;
        if (textView2 != null) {
            if (z11) {
                i12 = 4;
            }
            textView2.setVisibility(i12);
        }
        ImageView imageView = this.f88817p;
        if (imageView != null) {
            imageView.getDrawable();
        }
    }

    public void setActionBarHeight(int i11) {
        this.f88808B = i11;
        this.f88812F = true;
    }

    public void setActionBarMenuOnItemClick(C17431a c17431a) {
        this.f88827z = c17431a;
    }

    public void setBackButtonDrawable(Drawable drawable) {
        int i11;
        if (this.f88817p == null) {
            m92711f();
        }
        ImageView imageView = this.f88817p;
        if (drawable == null) {
            i11 = 8;
        } else {
            i11 = 0;
        }
        imageView.setVisibility(i11);
        this.f88817p.setImageDrawable(drawable);
    }

    public void setBackButtonImage(int i11) {
        int i12;
        if (this.f88817p == null) {
            m92711f();
        }
        ImageView imageView = this.f88817p;
        if (i11 == 0) {
            i12 = 8;
        } else {
            i12 = 0;
        }
        imageView.setVisibility(i12);
        this.f88817p.setImageResource(i11);
    }

    public void setBigHeight(boolean z11) {
        this.f88814H = z11;
    }

    public void setItemsBackground(int i11) {
        this.f88826y = i11;
        ImageView imageView = this.f88817p;
        if (imageView != null) {
            imageView.setBackgroundResource(i11);
        }
    }

    public void setOccupyStatusBar(boolean z11) {
        int i11;
        this.f88824w = z11;
        ActionBarMenu actionBarMenu = this.f88823v;
        if (actionBarMenu != null) {
            if (z11) {
                i11 = this.f88815I;
            } else {
                i11 = 0;
            }
            actionBarMenu.setPadding(0, i11, 0, 0);
        }
    }

    public void setSkipTouch(boolean z11) {
        this.f88809C = z11;
    }

    public void setSubTitleColor(int i11) {
        this.f88811E = i11;
        TextView textView = this.f88820s;
        if (textView != null) {
            textView.setTextColor(i11);
        }
    }

    public void setSubtitle(CharSequence charSequence) {
        int i11;
        if (charSequence != null && this.f88820s == null) {
            m92713h();
        }
        TextView textView = this.f88820s;
        if (textView != null) {
            if (charSequence != null && !this.f88825x) {
                i11 = 0;
            } else {
                i11 = 8;
            }
            textView.setVisibility(i11);
            this.f88820s.setText(charSequence);
        }
    }

    public void setTitle(CharSequence charSequence) {
        int i11;
        if (charSequence != null && this.f88819r == null) {
            m92714i();
        }
        TextView textView = this.f88819r;
        if (textView != null) {
            if (charSequence != null && !this.f88825x) {
                i11 = 0;
            } else {
                i11 = 4;
            }
            textView.setVisibility(i11);
            this.f88819r.setText(charSequence);
        }
    }

    public void setTitleAlignCenter(boolean z11) {
        int i11;
        this.f88813G = z11;
        int i12 = 51;
        if (getTitleTextView() != null) {
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) getTitleTextView().getLayoutParams();
            if (z11) {
                i11 = 1;
            } else {
                i11 = 51;
            }
            layoutParams.gravity = i11;
        }
        if (getSubtitleTextView() != null) {
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) getSubtitleTextView().getLayoutParams();
            if (z11) {
                i12 = 1;
            }
            layoutParams2.gravity = i12;
        }
    }

    public void setTitleColor(int i11) {
        this.f88810D = i11;
        TextView titleTextView = getTitleTextView();
        if (titleTextView != null) {
            titleTextView.setTextColor(this.f88810D);
        }
    }

    /* renamed from: u */
    public void m92723u(String str) {
        ActionBarMenu actionBarMenu = this.f88822u;
        if (actionBarMenu != null && str != null) {
            actionBarMenu.m92736B(!this.f88825x, str);
        }
    }

    /* renamed from: v */
    public void m92724v(Context context, int i11) {
        int color;
        if (Build.VERSION.SDK_INT >= 23) {
            color = getResources().getColor(i11, context.getTheme());
            this.f88810D = color;
        } else {
            this.f88810D = getResources().getColor(i11);
        }
        TextView titleTextView = getTitleTextView();
        if (titleTextView != null) {
            titleTextView.setTextColor(this.f88810D);
        }
    }

    /* renamed from: w */
    public void m92725w() {
        View view;
        ActionBarMenu actionBarMenu = this.f88823v;
        if (actionBarMenu == null) {
            return;
        }
        actionBarMenu.setVisibility(0);
        if (this.f88824w && (view = this.f88821t) != null) {
            view.setVisibility(0);
        }
        TextView textView = this.f88819r;
        if (textView != null) {
            textView.setVisibility(4);
        }
        TextView textView2 = this.f88820s;
        if (textView2 != null) {
            textView2.setVisibility(4);
        }
        ImageView imageView = this.f88817p;
        if (imageView != null) {
            imageView.setVisibility(4);
        }
        View view2 = this.f88818q;
        if (view2 != null) {
            view2.setVisibility(4);
        }
        ActionBarMenu actionBarMenu2 = this.f88822u;
        if (actionBarMenu2 != null) {
            actionBarMenu2.setVisibility(4);
        }
    }

    /* renamed from: x */
    public void m92726x() {
        int i11 = this.f88815I;
        int m155409h = AbstractC32226c.m155409h(getRootView());
        this.f88815I = m155409h;
        if (m155409h != i11) {
            requestLayout();
        }
        ActionBarMenu actionBarMenu = this.f88822u;
        if (actionBarMenu != null) {
            actionBarMenu.m92737C();
        }
        ActionBarMenu actionBarMenu2 = this.f88823v;
        if (actionBarMenu2 != null) {
            actionBarMenu2.m92737C();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ActionBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f88824w = true;
        this.f88826y = -1;
        this.f88809C = false;
        this.f88810D = -1;
        this.f88811E = -1258291201;
        this.f88812F = false;
        this.f88813G = false;
        this.f88814H = false;
        this.f88815I = AbstractC17484n.Companion.m92931b();
        this.f88816J = null;
        this.f88808B = context.getResources().getDimensionPixelSize(AbstractC17454d.action_bar_default_height);
        if (!(context instanceof InterfaceC27218a)) {
            this.f88824w = false;
        } else if (((InterfaceC27218a) context).mo35576n3()) {
            this.f88824w = false;
        }
    }
}
