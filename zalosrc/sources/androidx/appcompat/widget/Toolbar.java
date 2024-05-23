package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.view.menu.C1072e;
import androidx.appcompat.view.menu.C1074g;
import androidx.appcompat.view.menu.InterfaceC1077j;
import androidx.appcompat.view.menu.SubMenuC1080m;
import androidx.appcompat.widget.ActionMenuView;
import androidx.core.view.AbstractC1579n0;
import androidx.core.view.AbstractC1602t;
import androidx.core.view.AbstractC1613w;
import androidx.customview.view.AbsSavedState;
import java.util.ArrayList;
import java.util.List;
import p175g0.AbstractC19178a;
import p175g0.AbstractC19187j;
import p193h0.AbstractC19694b;
import p310l0.C21986g;
import p310l0.InterfaceC21982c;

/* loaded from: classes2.dex */
public class Toolbar extends ViewGroup {

    /* renamed from: A */
    private int f4519A;

    /* renamed from: B */
    private int f4520B;

    /* renamed from: C */
    int f4521C;

    /* renamed from: D */
    private int f4522D;

    /* renamed from: E */
    private int f4523E;

    /* renamed from: F */
    private int f4524F;

    /* renamed from: G */
    private int f4525G;

    /* renamed from: H */
    private int f4526H;

    /* renamed from: I */
    private C1187l1 f4527I;

    /* renamed from: J */
    private int f4528J;

    /* renamed from: K */
    private int f4529K;

    /* renamed from: L */
    private int f4530L;

    /* renamed from: M */
    private CharSequence f4531M;

    /* renamed from: N */
    private CharSequence f4532N;

    /* renamed from: O */
    private ColorStateList f4533O;

    /* renamed from: P */
    private ColorStateList f4534P;

    /* renamed from: Q */
    private boolean f4535Q;

    /* renamed from: R */
    private boolean f4536R;

    /* renamed from: S */
    private final ArrayList f4537S;

    /* renamed from: T */
    private final ArrayList f4538T;

    /* renamed from: U */
    private final int[] f4539U;

    /* renamed from: V */
    private final ActionMenuView.InterfaceC1096d f4540V;

    /* renamed from: W */
    private C1214u1 f4541W;

    /* renamed from: a0 */
    private ActionMenuPresenter f4542a0;

    /* renamed from: b0 */
    private C1145d f4543b0;

    /* renamed from: c0 */
    private InterfaceC1077j.a f4544c0;

    /* renamed from: d0 */
    private C1072e.a f4545d0;

    /* renamed from: e0 */
    private boolean f4546e0;

    /* renamed from: f0 */
    private final Runnable f4547f0;

    /* renamed from: p */
    private ActionMenuView f4548p;

    /* renamed from: q */
    private TextView f4549q;

    /* renamed from: r */
    private TextView f4550r;

    /* renamed from: s */
    private ImageButton f4551s;

    /* renamed from: t */
    private ImageView f4552t;

    /* renamed from: u */
    private Drawable f4553u;

    /* renamed from: v */
    private CharSequence f4554v;

    /* renamed from: w */
    ImageButton f4555w;

    /* renamed from: x */
    View f4556x;

    /* renamed from: y */
    private Context f4557y;

    /* renamed from: z */
    private int f4558z;

    /* loaded from: classes2.dex */
    public static class LayoutParams extends ActionBar.LayoutParams {

        /* renamed from: b */
        int f4559b;

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f4559b = 0;
        }

        /* renamed from: a */
        void m5441a(ViewGroup.MarginLayoutParams marginLayoutParams) {
            ((ViewGroup.MarginLayoutParams) this).leftMargin = marginLayoutParams.leftMargin;
            ((ViewGroup.MarginLayoutParams) this).topMargin = marginLayoutParams.topMargin;
            ((ViewGroup.MarginLayoutParams) this).rightMargin = marginLayoutParams.rightMargin;
            ((ViewGroup.MarginLayoutParams) this).bottomMargin = marginLayoutParams.bottomMargin;
        }

        public LayoutParams(int i11, int i12) {
            super(i11, i12);
            this.f4559b = 0;
            this.f3623a = 8388627;
        }

        public LayoutParams(LayoutParams layoutParams) {
            super((ActionBar.LayoutParams) layoutParams);
            this.f4559b = 0;
            this.f4559b = layoutParams.f4559b;
        }

        public LayoutParams(ActionBar.LayoutParams layoutParams) {
            super(layoutParams);
            this.f4559b = 0;
        }

        public LayoutParams(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.f4559b = 0;
            m5441a(marginLayoutParams);
        }

        public LayoutParams(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f4559b = 0;
        }
    }

    /* renamed from: androidx.appcompat.widget.Toolbar$a */
    /* loaded from: classes2.dex */
    class C1142a implements ActionMenuView.InterfaceC1096d {
        C1142a() {
        }

        @Override // androidx.appcompat.widget.ActionMenuView.InterfaceC1096d
        public boolean onMenuItemClick(MenuItem menuItem) {
            Toolbar.this.getClass();
            return false;
        }
    }

    /* renamed from: androidx.appcompat.widget.Toolbar$b */
    /* loaded from: classes2.dex */
    class RunnableC1143b implements Runnable {
        RunnableC1143b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            Toolbar.this.m5429P();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.appcompat.widget.Toolbar$c */
    /* loaded from: classes2.dex */
    public class ViewOnClickListenerC1144c implements View.OnClickListener {
        ViewOnClickListenerC1144c() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            Toolbar.this.m5432e();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.appcompat.widget.Toolbar$d */
    /* loaded from: classes2.dex */
    public class C1145d implements InterfaceC1077j {

        /* renamed from: p */
        C1072e f4565p;

        /* renamed from: q */
        C1074g f4566q;

        C1145d() {
        }

        @Override // androidx.appcompat.view.menu.InterfaceC1077j
        /* renamed from: c */
        public void mo4988c(C1072e c1072e, boolean z11) {
        }

        @Override // androidx.appcompat.view.menu.InterfaceC1077j
        /* renamed from: f */
        public int mo4991f() {
            return 0;
        }

        @Override // androidx.appcompat.view.menu.InterfaceC1077j
        /* renamed from: g */
        public boolean mo4992g(C1072e c1072e, C1074g c1074g) {
            Toolbar.this.m5434g();
            ViewParent parent = Toolbar.this.f4555w.getParent();
            Toolbar toolbar = Toolbar.this;
            if (parent != toolbar) {
                if (parent instanceof ViewGroup) {
                    ((ViewGroup) parent).removeView(toolbar.f4555w);
                }
                Toolbar toolbar2 = Toolbar.this;
                toolbar2.addView(toolbar2.f4555w);
            }
            Toolbar.this.f4556x = c1074g.getActionView();
            this.f4566q = c1074g;
            ViewParent parent2 = Toolbar.this.f4556x.getParent();
            Toolbar toolbar3 = Toolbar.this;
            if (parent2 != toolbar3) {
                if (parent2 instanceof ViewGroup) {
                    ((ViewGroup) parent2).removeView(toolbar3.f4556x);
                }
                LayoutParams generateDefaultLayoutParams = Toolbar.this.generateDefaultLayoutParams();
                Toolbar toolbar4 = Toolbar.this;
                generateDefaultLayoutParams.f3623a = (toolbar4.f4521C & 112) | 8388611;
                generateDefaultLayoutParams.f4559b = 2;
                toolbar4.f4556x.setLayoutParams(generateDefaultLayoutParams);
                Toolbar toolbar5 = Toolbar.this;
                toolbar5.addView(toolbar5.f4556x);
            }
            Toolbar.this.m5424I();
            Toolbar.this.requestLayout();
            c1074g.m5120r(true);
            KeyEvent.Callback callback = Toolbar.this.f4556x;
            if (callback instanceof InterfaceC21982c) {
                ((InterfaceC21982c) callback).mo5369a();
            }
            return true;
        }

        @Override // androidx.appcompat.view.menu.InterfaceC1077j
        /* renamed from: i */
        public void mo5015i(Parcelable parcelable) {
        }

        @Override // androidx.appcompat.view.menu.InterfaceC1077j
        /* renamed from: j */
        public boolean mo4994j(SubMenuC1080m subMenuC1080m) {
            return false;
        }

        @Override // androidx.appcompat.view.menu.InterfaceC1077j
        /* renamed from: k */
        public Parcelable mo5016k() {
            return null;
        }

        @Override // androidx.appcompat.view.menu.InterfaceC1077j
        /* renamed from: l */
        public void mo4995l(boolean z11) {
            if (this.f4566q != null) {
                C1072e c1072e = this.f4565p;
                if (c1072e != null) {
                    int size = c1072e.size();
                    for (int i11 = 0; i11 < size; i11++) {
                        if (this.f4565p.getItem(i11) == this.f4566q) {
                            return;
                        }
                    }
                }
                mo4996n(this.f4565p, this.f4566q);
            }
        }

        @Override // androidx.appcompat.view.menu.InterfaceC1077j
        /* renamed from: m */
        public boolean mo5017m() {
            return false;
        }

        @Override // androidx.appcompat.view.menu.InterfaceC1077j
        /* renamed from: n */
        public boolean mo4996n(C1072e c1072e, C1074g c1074g) {
            KeyEvent.Callback callback = Toolbar.this.f4556x;
            if (callback instanceof InterfaceC21982c) {
                ((InterfaceC21982c) callback).mo5373d();
            }
            Toolbar toolbar = Toolbar.this;
            toolbar.removeView(toolbar.f4556x);
            Toolbar toolbar2 = Toolbar.this;
            toolbar2.removeView(toolbar2.f4555w);
            Toolbar toolbar3 = Toolbar.this;
            toolbar3.f4556x = null;
            toolbar3.m5430a();
            this.f4566q = null;
            Toolbar.this.requestLayout();
            c1074g.m5120r(false);
            return true;
        }

        @Override // androidx.appcompat.view.menu.InterfaceC1077j
        /* renamed from: o */
        public void mo4997o(Context context, C1072e c1072e) {
            C1074g c1074g;
            C1072e c1072e2 = this.f4565p;
            if (c1072e2 != null && (c1074g = this.f4566q) != null) {
                c1072e2.mo5082f(c1074g);
            }
            this.f4565p = c1072e;
        }
    }

    /* renamed from: androidx.appcompat.widget.Toolbar$e */
    /* loaded from: classes2.dex */
    public interface InterfaceC1146e {
    }

    public Toolbar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, AbstractC19178a.toolbarStyle);
    }

    /* renamed from: A */
    private boolean m5401A(View view) {
        if (view.getParent() != this && !this.f4538T.contains(view)) {
            return false;
        }
        return true;
    }

    /* renamed from: D */
    private int m5402D(View view, int i11, int[] iArr, int i12) {
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        int i13 = ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin - iArr[0];
        int max = i11 + Math.max(0, i13);
        iArr[0] = Math.max(0, -i13);
        int m5417r = m5417r(view, i12);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(max, m5417r, max + measuredWidth, view.getMeasuredHeight() + m5417r);
        return max + measuredWidth + ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin;
    }

    /* renamed from: E */
    private int m5403E(View view, int i11, int[] iArr, int i12) {
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        int i13 = ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin - iArr[1];
        int max = i11 - Math.max(0, i13);
        iArr[1] = Math.max(0, -i13);
        int m5417r = m5417r(view, i12);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(max - measuredWidth, m5417r, max, view.getMeasuredHeight() + m5417r);
        return max - (measuredWidth + ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin);
    }

    /* renamed from: F */
    private int m5404F(View view, int i11, int i12, int i13, int i14, int[] iArr) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int i15 = marginLayoutParams.leftMargin - iArr[0];
        int i16 = marginLayoutParams.rightMargin - iArr[1];
        int max = Math.max(0, i15) + Math.max(0, i16);
        iArr[0] = Math.max(0, -i15);
        iArr[1] = Math.max(0, -i16);
        view.measure(ViewGroup.getChildMeasureSpec(i11, getPaddingLeft() + getPaddingRight() + max + i12, marginLayoutParams.width), ViewGroup.getChildMeasureSpec(i13, getPaddingTop() + getPaddingBottom() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i14, marginLayoutParams.height));
        return view.getMeasuredWidth() + max;
    }

    /* renamed from: G */
    private void m5405G(View view, int i11, int i12, int i13, int i14, int i15) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i11, getPaddingLeft() + getPaddingRight() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i12, marginLayoutParams.width);
        int childMeasureSpec2 = ViewGroup.getChildMeasureSpec(i13, getPaddingTop() + getPaddingBottom() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i14, marginLayoutParams.height);
        int mode = View.MeasureSpec.getMode(childMeasureSpec2);
        if (mode != 1073741824 && i15 >= 0) {
            if (mode != 0) {
                i15 = Math.min(View.MeasureSpec.getSize(childMeasureSpec2), i15);
            }
            childMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i15, 1073741824);
        }
        view.measure(childMeasureSpec, childMeasureSpec2);
    }

    /* renamed from: H */
    private void m5406H() {
        removeCallbacks(this.f4547f0);
        post(this.f4547f0);
    }

    /* renamed from: N */
    private boolean m5407N() {
        if (!this.f4546e0) {
            return false;
        }
        int childCount = getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = getChildAt(i11);
            if (m5408O(childAt) && childAt.getMeasuredWidth() > 0 && childAt.getMeasuredHeight() > 0) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: O */
    private boolean m5408O(View view) {
        if (view != null && view.getParent() == this && view.getVisibility() != 8) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    private void m5409b(List list, int i11) {
        boolean z11;
        if (AbstractC1579n0.m7812G(this) == 1) {
            z11 = true;
        } else {
            z11 = false;
        }
        int childCount = getChildCount();
        int m8182b = AbstractC1602t.m8182b(i11, AbstractC1579n0.m7812G(this));
        list.clear();
        if (z11) {
            for (int i12 = childCount - 1; i12 >= 0; i12--) {
                View childAt = getChildAt(i12);
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                if (layoutParams.f4559b == 0 && m5408O(childAt) && m5416q(layoutParams.f3623a) == m8182b) {
                    list.add(childAt);
                }
            }
            return;
        }
        for (int i13 = 0; i13 < childCount; i13++) {
            View childAt2 = getChildAt(i13);
            LayoutParams layoutParams2 = (LayoutParams) childAt2.getLayoutParams();
            if (layoutParams2.f4559b == 0 && m5408O(childAt2) && m5416q(layoutParams2.f3623a) == m8182b) {
                list.add(childAt2);
            }
        }
    }

    /* renamed from: c */
    private void m5410c(View view, boolean z11) {
        LayoutParams layoutParams;
        ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
        if (layoutParams2 == null) {
            layoutParams = generateDefaultLayoutParams();
        } else if (!checkLayoutParams(layoutParams2)) {
            layoutParams = generateLayoutParams(layoutParams2);
        } else {
            layoutParams = (LayoutParams) layoutParams2;
        }
        layoutParams.f4559b = 1;
        if (z11 && this.f4556x != null) {
            view.setLayoutParams(layoutParams);
            this.f4538T.add(view);
        } else {
            addView(view, layoutParams);
        }
    }

    private MenuInflater getMenuInflater() {
        return new C21986g(getContext());
    }

    /* renamed from: h */
    private void m5411h() {
        if (this.f4527I == null) {
            this.f4527I = new C1187l1();
        }
    }

    /* renamed from: i */
    private void m5412i() {
        if (this.f4552t == null) {
            this.f4552t = new AppCompatImageView(getContext());
        }
    }

    /* renamed from: j */
    private void m5413j() {
        m5414k();
        if (this.f4548p.m5223P() == null) {
            C1072e c1072e = (C1072e) this.f4548p.getMenu();
            if (this.f4543b0 == null) {
                this.f4543b0 = new C1145d();
            }
            this.f4548p.setExpandedActionViewsExclusive(true);
            c1072e.m5076c(this.f4543b0, this.f4557y);
        }
    }

    /* renamed from: k */
    private void m5414k() {
        if (this.f4548p == null) {
            ActionMenuView actionMenuView = new ActionMenuView(getContext());
            this.f4548p = actionMenuView;
            actionMenuView.setPopupTheme(this.f4558z);
            this.f4548p.setOnMenuItemClickListener(this.f4540V);
            this.f4548p.m5224Q(this.f4544c0, this.f4545d0);
            LayoutParams generateDefaultLayoutParams = generateDefaultLayoutParams();
            generateDefaultLayoutParams.f3623a = (this.f4521C & 112) | 8388613;
            this.f4548p.setLayoutParams(generateDefaultLayoutParams);
            m5410c(this.f4548p, false);
        }
    }

    /* renamed from: l */
    private void m5415l() {
        if (this.f4551s == null) {
            this.f4551s = new AppCompatImageButton(getContext(), null, AbstractC19178a.toolbarNavigationButtonStyle);
            LayoutParams generateDefaultLayoutParams = generateDefaultLayoutParams();
            generateDefaultLayoutParams.f3623a = (this.f4521C & 112) | 8388611;
            this.f4551s.setLayoutParams(generateDefaultLayoutParams);
        }
    }

    /* renamed from: q */
    private int m5416q(int i11) {
        int m7812G = AbstractC1579n0.m7812G(this);
        int m8182b = AbstractC1602t.m8182b(i11, m7812G) & 7;
        if (m8182b != 1 && m8182b != 3 && m8182b != 5) {
            if (m7812G != 1) {
                return 3;
            }
            return 5;
        }
        return m8182b;
    }

    /* renamed from: r */
    private int m5417r(View view, int i11) {
        int i12;
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        int measuredHeight = view.getMeasuredHeight();
        if (i11 > 0) {
            i12 = (measuredHeight - i11) / 2;
        } else {
            i12 = 0;
        }
        int m5418s = m5418s(layoutParams.f3623a);
        if (m5418s != 48) {
            if (m5418s != 80) {
                int paddingTop = getPaddingTop();
                int paddingBottom = getPaddingBottom();
                int height = getHeight();
                int i13 = (((height - paddingTop) - paddingBottom) - measuredHeight) / 2;
                int i14 = ((ViewGroup.MarginLayoutParams) layoutParams).topMargin;
                if (i13 < i14) {
                    i13 = i14;
                } else {
                    int i15 = (((height - paddingBottom) - measuredHeight) - i13) - paddingTop;
                    int i16 = ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin;
                    if (i15 < i16) {
                        i13 = Math.max(0, i13 - (i16 - i15));
                    }
                }
                return paddingTop + i13;
            }
            return (((getHeight() - getPaddingBottom()) - measuredHeight) - ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin) - i12;
        }
        return getPaddingTop() - i12;
    }

    /* renamed from: s */
    private int m5418s(int i11) {
        int i12 = i11 & 112;
        return (i12 == 16 || i12 == 48 || i12 == 80) ? i12 : this.f4530L & 112;
    }

    /* renamed from: u */
    private int m5419u(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return AbstractC1613w.m8235b(marginLayoutParams) + AbstractC1613w.m8234a(marginLayoutParams);
    }

    /* renamed from: v */
    private int m5420v(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
    }

    /* renamed from: w */
    private int m5421w(List list, int[] iArr) {
        int i11 = iArr[0];
        int i12 = iArr[1];
        int size = list.size();
        int i13 = 0;
        int i14 = 0;
        while (i13 < size) {
            View view = (View) list.get(i13);
            LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
            int i15 = ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin - i11;
            int i16 = ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin - i12;
            int max = Math.max(0, i15);
            int max2 = Math.max(0, i16);
            int max3 = Math.max(0, -i15);
            int max4 = Math.max(0, -i16);
            i14 += max + view.getMeasuredWidth() + max2;
            i13++;
            i12 = max4;
            i11 = max3;
        }
        return i14;
    }

    /* renamed from: B */
    public boolean m5422B() {
        ActionMenuView actionMenuView = this.f4548p;
        if (actionMenuView != null && actionMenuView.m5220K()) {
            return true;
        }
        return false;
    }

    /* renamed from: C */
    public boolean m5423C() {
        ActionMenuView actionMenuView = this.f4548p;
        if (actionMenuView != null && actionMenuView.m5221L()) {
            return true;
        }
        return false;
    }

    /* renamed from: I */
    void m5424I() {
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = getChildAt(childCount);
            if (((LayoutParams) childAt.getLayoutParams()).f4559b != 2 && childAt != this.f4548p) {
                removeViewAt(childCount);
                this.f4538T.add(childAt);
            }
        }
    }

    /* renamed from: J */
    public void m5425J(int i11, int i12) {
        m5411h();
        this.f4527I.m5615g(i11, i12);
    }

    /* renamed from: K */
    public void m5426K(C1072e c1072e, ActionMenuPresenter actionMenuPresenter) {
        if (c1072e == null && this.f4548p == null) {
            return;
        }
        m5414k();
        C1072e m5223P = this.f4548p.m5223P();
        if (m5223P == c1072e) {
            return;
        }
        if (m5223P != null) {
            m5223P.m5063Q(this.f4542a0);
            m5223P.m5063Q(this.f4543b0);
        }
        if (this.f4543b0 == null) {
            this.f4543b0 = new C1145d();
        }
        actionMenuPresenter.m5202K(true);
        if (c1072e != null) {
            c1072e.m5076c(actionMenuPresenter, this.f4557y);
            c1072e.m5076c(this.f4543b0, this.f4557y);
        } else {
            actionMenuPresenter.mo4997o(this.f4557y, null);
            this.f4543b0.mo4997o(this.f4557y, null);
            actionMenuPresenter.mo4995l(true);
            this.f4543b0.mo4995l(true);
        }
        this.f4548p.setPopupTheme(this.f4558z);
        this.f4548p.setPresenter(actionMenuPresenter);
        this.f4542a0 = actionMenuPresenter;
    }

    /* renamed from: L */
    public void m5427L(Context context, int i11) {
        this.f4520B = i11;
        TextView textView = this.f4550r;
        if (textView != null) {
            textView.setTextAppearance(context, i11);
        }
    }

    /* renamed from: M */
    public void m5428M(Context context, int i11) {
        this.f4519A = i11;
        TextView textView = this.f4549q;
        if (textView != null) {
            textView.setTextAppearance(context, i11);
        }
    }

    /* renamed from: P */
    public boolean m5429P() {
        ActionMenuView actionMenuView = this.f4548p;
        if (actionMenuView != null && actionMenuView.m5225R()) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    void m5430a() {
        for (int size = this.f4538T.size() - 1; size >= 0; size--) {
            addView((View) this.f4538T.get(size));
        }
        this.f4538T.clear();
    }

    @Override // android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (super.checkLayoutParams(layoutParams) && (layoutParams instanceof LayoutParams)) {
            return true;
        }
        return false;
    }

    /* renamed from: d */
    public boolean m5431d() {
        ActionMenuView actionMenuView;
        if (getVisibility() == 0 && (actionMenuView = this.f4548p) != null && actionMenuView.m5222M()) {
            return true;
        }
        return false;
    }

    /* renamed from: e */
    public void m5432e() {
        C1074g c1074g;
        C1145d c1145d = this.f4543b0;
        if (c1145d == null) {
            c1074g = null;
        } else {
            c1074g = c1145d.f4566q;
        }
        if (c1074g != null) {
            c1074g.collapseActionView();
        }
    }

    /* renamed from: f */
    public void m5433f() {
        ActionMenuView actionMenuView = this.f4548p;
        if (actionMenuView != null) {
            actionMenuView.m5213D();
        }
    }

    /* renamed from: g */
    void m5434g() {
        if (this.f4555w == null) {
            AppCompatImageButton appCompatImageButton = new AppCompatImageButton(getContext(), null, AbstractC19178a.toolbarNavigationButtonStyle);
            this.f4555w = appCompatImageButton;
            appCompatImageButton.setImageDrawable(this.f4553u);
            this.f4555w.setContentDescription(this.f4554v);
            LayoutParams generateDefaultLayoutParams = generateDefaultLayoutParams();
            generateDefaultLayoutParams.f3623a = (this.f4521C & 112) | 8388611;
            generateDefaultLayoutParams.f4559b = 2;
            this.f4555w.setLayoutParams(generateDefaultLayoutParams);
            this.f4555w.setOnClickListener(new ViewOnClickListenerC1144c());
        }
    }

    public CharSequence getCollapseContentDescription() {
        ImageButton imageButton = this.f4555w;
        if (imageButton != null) {
            return imageButton.getContentDescription();
        }
        return null;
    }

    public Drawable getCollapseIcon() {
        ImageButton imageButton = this.f4555w;
        if (imageButton != null) {
            return imageButton.getDrawable();
        }
        return null;
    }

    public int getContentInsetEnd() {
        C1187l1 c1187l1 = this.f4527I;
        if (c1187l1 != null) {
            return c1187l1.m5609a();
        }
        return 0;
    }

    public int getContentInsetEndWithActions() {
        int i11 = this.f4529K;
        if (i11 == Integer.MIN_VALUE) {
            return getContentInsetEnd();
        }
        return i11;
    }

    public int getContentInsetLeft() {
        C1187l1 c1187l1 = this.f4527I;
        if (c1187l1 != null) {
            return c1187l1.m5610b();
        }
        return 0;
    }

    public int getContentInsetRight() {
        C1187l1 c1187l1 = this.f4527I;
        if (c1187l1 != null) {
            return c1187l1.m5611c();
        }
        return 0;
    }

    public int getContentInsetStart() {
        C1187l1 c1187l1 = this.f4527I;
        if (c1187l1 != null) {
            return c1187l1.m5612d();
        }
        return 0;
    }

    public int getContentInsetStartWithNavigation() {
        int i11 = this.f4528J;
        if (i11 == Integer.MIN_VALUE) {
            return getContentInsetStart();
        }
        return i11;
    }

    public int getCurrentContentInsetEnd() {
        C1072e m5223P;
        ActionMenuView actionMenuView = this.f4548p;
        if (actionMenuView != null && (m5223P = actionMenuView.m5223P()) != null && m5223P.hasVisibleItems()) {
            return Math.max(getContentInsetEnd(), Math.max(this.f4529K, 0));
        }
        return getContentInsetEnd();
    }

    public int getCurrentContentInsetLeft() {
        if (AbstractC1579n0.m7812G(this) == 1) {
            return getCurrentContentInsetEnd();
        }
        return getCurrentContentInsetStart();
    }

    public int getCurrentContentInsetRight() {
        if (AbstractC1579n0.m7812G(this) == 1) {
            return getCurrentContentInsetStart();
        }
        return getCurrentContentInsetEnd();
    }

    public int getCurrentContentInsetStart() {
        if (getNavigationIcon() != null) {
            return Math.max(getContentInsetStart(), Math.max(this.f4528J, 0));
        }
        return getContentInsetStart();
    }

    public Drawable getLogo() {
        ImageView imageView = this.f4552t;
        if (imageView != null) {
            return imageView.getDrawable();
        }
        return null;
    }

    public CharSequence getLogoDescription() {
        ImageView imageView = this.f4552t;
        if (imageView != null) {
            return imageView.getContentDescription();
        }
        return null;
    }

    public Menu getMenu() {
        m5413j();
        return this.f4548p.getMenu();
    }

    public CharSequence getNavigationContentDescription() {
        ImageButton imageButton = this.f4551s;
        if (imageButton != null) {
            return imageButton.getContentDescription();
        }
        return null;
    }

    public Drawable getNavigationIcon() {
        ImageButton imageButton = this.f4551s;
        if (imageButton != null) {
            return imageButton.getDrawable();
        }
        return null;
    }

    ActionMenuPresenter getOuterActionMenuPresenter() {
        return this.f4542a0;
    }

    public Drawable getOverflowIcon() {
        m5413j();
        return this.f4548p.getOverflowIcon();
    }

    Context getPopupContext() {
        return this.f4557y;
    }

    public int getPopupTheme() {
        return this.f4558z;
    }

    public CharSequence getSubtitle() {
        return this.f4532N;
    }

    final TextView getSubtitleTextView() {
        return this.f4550r;
    }

    public CharSequence getTitle() {
        return this.f4531M;
    }

    public int getTitleMarginBottom() {
        return this.f4526H;
    }

    public int getTitleMarginEnd() {
        return this.f4524F;
    }

    public int getTitleMarginStart() {
        return this.f4523E;
    }

    public int getTitleMarginTop() {
        return this.f4525G;
    }

    final TextView getTitleTextView() {
        return this.f4549q;
    }

    public InterfaceC1207s0 getWrapper() {
        if (this.f4541W == null) {
            this.f4541W = new C1214u1(this, true);
        }
        return this.f4541W;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.ViewGroup
    /* renamed from: m, reason: merged with bridge method [inline-methods] */
    public LayoutParams generateDefaultLayoutParams() {
        return new LayoutParams(-2, -2);
    }

    @Override // android.view.ViewGroup
    /* renamed from: n, reason: merged with bridge method [inline-methods] */
    public LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeCallbacks(this.f4547f0);
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.f4536R = false;
        }
        if (!this.f4536R) {
            boolean onHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !onHoverEvent) {
                this.f4536R = true;
            }
        }
        if (actionMasked == 10 || actionMasked == 3) {
            this.f4536R = false;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Removed duplicated region for block: B:109:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x02a1 A[LOOP:0: B:41:0x029f->B:42:0x02a1, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x02c3 A[LOOP:1: B:45:0x02c1->B:46:0x02c3, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x02ed  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x02fc A[LOOP:2: B:54:0x02fa->B:55:0x02fc, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01b6  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0227  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onLayout(boolean z11, int i11, int i12, int i13, int i14) {
        int i15;
        int i16;
        boolean m5408O;
        boolean m5408O2;
        int i17;
        int i18;
        int i19;
        int i21;
        int i22;
        int i23;
        int i24;
        int paddingTop;
        int i25;
        int i26;
        int i27;
        int i28;
        int i29;
        int size;
        int i31;
        int i32;
        int size2;
        int i33;
        int i34;
        int size3;
        boolean z12 = AbstractC1579n0.m7812G(this) == 1;
        int width = getWidth();
        int height = getHeight();
        int paddingLeft = getPaddingLeft();
        int paddingRight = getPaddingRight();
        int paddingTop2 = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int i35 = width - paddingRight;
        int[] iArr = this.f4539U;
        iArr[1] = 0;
        iArr[0] = 0;
        int m7814H = AbstractC1579n0.m7814H(this);
        int min = m7814H >= 0 ? Math.min(m7814H, i14 - i12) : 0;
        if (!m5408O(this.f4551s)) {
            i15 = paddingLeft;
        } else {
            if (z12) {
                i16 = m5403E(this.f4551s, i35, iArr, min);
                i15 = paddingLeft;
                if (m5408O(this.f4555w)) {
                    if (z12) {
                        i16 = m5403E(this.f4555w, i16, iArr, min);
                    } else {
                        i15 = m5402D(this.f4555w, i15, iArr, min);
                    }
                }
                if (m5408O(this.f4548p)) {
                    if (z12) {
                        i15 = m5402D(this.f4548p, i15, iArr, min);
                    } else {
                        i16 = m5403E(this.f4548p, i16, iArr, min);
                    }
                }
                int currentContentInsetLeft = getCurrentContentInsetLeft();
                int currentContentInsetRight = getCurrentContentInsetRight();
                iArr[0] = Math.max(0, currentContentInsetLeft - i15);
                iArr[1] = Math.max(0, currentContentInsetRight - (i35 - i16));
                int max = Math.max(i15, currentContentInsetLeft);
                int min2 = Math.min(i16, i35 - currentContentInsetRight);
                if (m5408O(this.f4556x)) {
                    if (z12) {
                        min2 = m5403E(this.f4556x, min2, iArr, min);
                    } else {
                        max = m5402D(this.f4556x, max, iArr, min);
                    }
                }
                if (m5408O(this.f4552t)) {
                    if (z12) {
                        min2 = m5403E(this.f4552t, min2, iArr, min);
                    } else {
                        max = m5402D(this.f4552t, max, iArr, min);
                    }
                }
                m5408O = m5408O(this.f4549q);
                m5408O2 = m5408O(this.f4550r);
                if (m5408O) {
                    i17 = paddingRight;
                    i18 = 0;
                } else {
                    LayoutParams layoutParams = (LayoutParams) this.f4549q.getLayoutParams();
                    i17 = paddingRight;
                    i18 = ((ViewGroup.MarginLayoutParams) layoutParams).topMargin + this.f4549q.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin;
                }
                if (m5408O2) {
                    i19 = width;
                } else {
                    LayoutParams layoutParams2 = (LayoutParams) this.f4550r.getLayoutParams();
                    i19 = width;
                    i18 += ((ViewGroup.MarginLayoutParams) layoutParams2).topMargin + this.f4550r.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) layoutParams2).bottomMargin;
                }
                if (!m5408O || m5408O2) {
                    TextView textView = !m5408O ? this.f4549q : this.f4550r;
                    TextView textView2 = !m5408O2 ? this.f4550r : this.f4549q;
                    LayoutParams layoutParams3 = (LayoutParams) textView.getLayoutParams();
                    LayoutParams layoutParams4 = (LayoutParams) textView2.getLayoutParams();
                    boolean z13 = (!m5408O && this.f4549q.getMeasuredWidth() > 0) || (m5408O2 && this.f4550r.getMeasuredWidth() > 0);
                    i21 = this.f4530L & 112;
                    i22 = paddingLeft;
                    if (i21 != 48) {
                        i23 = max;
                        i24 = min;
                        paddingTop = getPaddingTop() + ((ViewGroup.MarginLayoutParams) layoutParams3).topMargin + this.f4525G;
                    } else if (i21 != 80) {
                        int i36 = (((height - paddingTop2) - paddingBottom) - i18) / 2;
                        int i37 = ((ViewGroup.MarginLayoutParams) layoutParams3).topMargin;
                        i24 = min;
                        int i38 = this.f4525G;
                        i23 = max;
                        if (i36 < i37 + i38) {
                            i36 = i37 + i38;
                        } else {
                            int i39 = (((height - paddingBottom) - i18) - i36) - paddingTop2;
                            int i41 = ((ViewGroup.MarginLayoutParams) layoutParams3).bottomMargin;
                            int i42 = this.f4526H;
                            if (i39 < i41 + i42) {
                                i36 = Math.max(0, i36 - ((((ViewGroup.MarginLayoutParams) layoutParams4).bottomMargin + i42) - i39));
                            }
                        }
                        paddingTop = paddingTop2 + i36;
                    } else {
                        i23 = max;
                        i24 = min;
                        paddingTop = (((height - paddingBottom) - ((ViewGroup.MarginLayoutParams) layoutParams4).bottomMargin) - this.f4526H) - i18;
                    }
                    if (!z12) {
                        int i43 = (z13 ? this.f4523E : 0) - iArr[1];
                        min2 -= Math.max(0, i43);
                        iArr[1] = Math.max(0, -i43);
                        if (m5408O) {
                            LayoutParams layoutParams5 = (LayoutParams) this.f4549q.getLayoutParams();
                            int measuredWidth = min2 - this.f4549q.getMeasuredWidth();
                            int measuredHeight = this.f4549q.getMeasuredHeight() + paddingTop;
                            this.f4549q.layout(measuredWidth, paddingTop, min2, measuredHeight);
                            i28 = measuredWidth - this.f4524F;
                            paddingTop = measuredHeight + ((ViewGroup.MarginLayoutParams) layoutParams5).bottomMargin;
                        } else {
                            i28 = min2;
                        }
                        if (m5408O2) {
                            int i44 = paddingTop + ((ViewGroup.MarginLayoutParams) ((LayoutParams) this.f4550r.getLayoutParams())).topMargin;
                            this.f4550r.layout(min2 - this.f4550r.getMeasuredWidth(), i44, min2, this.f4550r.getMeasuredHeight() + i44);
                            i29 = min2 - this.f4524F;
                        } else {
                            i29 = min2;
                        }
                        if (z13) {
                            min2 = Math.min(i28, i29);
                        }
                        max = i23;
                    } else {
                        i25 = 0;
                        int i45 = (z13 ? this.f4523E : 0) - iArr[0];
                        max = i23 + Math.max(0, i45);
                        iArr[0] = Math.max(0, -i45);
                        if (m5408O) {
                            LayoutParams layoutParams6 = (LayoutParams) this.f4549q.getLayoutParams();
                            int measuredWidth2 = this.f4549q.getMeasuredWidth() + max;
                            int measuredHeight2 = this.f4549q.getMeasuredHeight() + paddingTop;
                            this.f4549q.layout(max, paddingTop, measuredWidth2, measuredHeight2);
                            i26 = measuredWidth2 + this.f4524F;
                            paddingTop = measuredHeight2 + ((ViewGroup.MarginLayoutParams) layoutParams6).bottomMargin;
                        } else {
                            i26 = max;
                        }
                        if (m5408O2) {
                            int i46 = paddingTop + ((ViewGroup.MarginLayoutParams) ((LayoutParams) this.f4550r.getLayoutParams())).topMargin;
                            int measuredWidth3 = this.f4550r.getMeasuredWidth() + max;
                            this.f4550r.layout(max, i46, measuredWidth3, this.f4550r.getMeasuredHeight() + i46);
                            i27 = measuredWidth3 + this.f4524F;
                        } else {
                            i27 = max;
                        }
                        if (z13) {
                            max = Math.max(i26, i27);
                        }
                        m5409b(this.f4537S, 3);
                        size = this.f4537S.size();
                        i31 = max;
                        for (i32 = 0; i32 < size; i32++) {
                            i31 = m5402D((View) this.f4537S.get(i32), i31, iArr, i24);
                        }
                        int i47 = i24;
                        m5409b(this.f4537S, 5);
                        size2 = this.f4537S.size();
                        for (i33 = 0; i33 < size2; i33++) {
                            min2 = m5403E((View) this.f4537S.get(i33), min2, iArr, i47);
                        }
                        m5409b(this.f4537S, 1);
                        int m5421w = m5421w(this.f4537S, iArr);
                        i34 = (i22 + (((i19 - i22) - i17) / 2)) - (m5421w / 2);
                        int i48 = m5421w + i34;
                        if (i34 >= i31) {
                            i31 = i48 > min2 ? i34 - (i48 - min2) : i34;
                        }
                        size3 = this.f4537S.size();
                        while (i25 < size3) {
                            i31 = m5402D((View) this.f4537S.get(i25), i31, iArr, i47);
                            i25++;
                        }
                        this.f4537S.clear();
                        return;
                    }
                } else {
                    i22 = paddingLeft;
                    i24 = min;
                }
                i25 = 0;
                m5409b(this.f4537S, 3);
                size = this.f4537S.size();
                i31 = max;
                while (i32 < size) {
                }
                int i472 = i24;
                m5409b(this.f4537S, 5);
                size2 = this.f4537S.size();
                while (i33 < size2) {
                }
                m5409b(this.f4537S, 1);
                int m5421w2 = m5421w(this.f4537S, iArr);
                i34 = (i22 + (((i19 - i22) - i17) / 2)) - (m5421w2 / 2);
                int i482 = m5421w2 + i34;
                if (i34 >= i31) {
                }
                size3 = this.f4537S.size();
                while (i25 < size3) {
                }
                this.f4537S.clear();
                return;
            }
            i15 = m5402D(this.f4551s, paddingLeft, iArr, min);
        }
        i16 = i35;
        if (m5408O(this.f4555w)) {
        }
        if (m5408O(this.f4548p)) {
        }
        int currentContentInsetLeft2 = getCurrentContentInsetLeft();
        int currentContentInsetRight2 = getCurrentContentInsetRight();
        iArr[0] = Math.max(0, currentContentInsetLeft2 - i15);
        iArr[1] = Math.max(0, currentContentInsetRight2 - (i35 - i16));
        int max2 = Math.max(i15, currentContentInsetLeft2);
        int min22 = Math.min(i16, i35 - currentContentInsetRight2);
        if (m5408O(this.f4556x)) {
        }
        if (m5408O(this.f4552t)) {
        }
        m5408O = m5408O(this.f4549q);
        m5408O2 = m5408O(this.f4550r);
        if (m5408O) {
        }
        if (m5408O2) {
        }
        if (m5408O) {
        }
        if (!m5408O) {
        }
        if (!m5408O2) {
        }
        LayoutParams layoutParams32 = (LayoutParams) textView.getLayoutParams();
        LayoutParams layoutParams42 = (LayoutParams) textView2.getLayoutParams();
        if (m5408O) {
        }
        i21 = this.f4530L & 112;
        i22 = paddingLeft;
        if (i21 != 48) {
        }
        if (!z12) {
        }
    }

    @Override // android.view.View
    protected void onMeasure(int i11, int i12) {
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int[] iArr = this.f4539U;
        boolean m5459b = AbstractC1152a2.m5459b(this);
        int i21 = 0;
        int i22 = !m5459b ? 1 : 0;
        if (m5408O(this.f4551s)) {
            m5405G(this.f4551s, i11, 0, i12, 0, this.f4522D);
            i13 = this.f4551s.getMeasuredWidth() + m5419u(this.f4551s);
            i14 = Math.max(0, this.f4551s.getMeasuredHeight() + m5420v(this.f4551s));
            i15 = View.combineMeasuredStates(0, this.f4551s.getMeasuredState());
        } else {
            i13 = 0;
            i14 = 0;
            i15 = 0;
        }
        if (m5408O(this.f4555w)) {
            m5405G(this.f4555w, i11, 0, i12, 0, this.f4522D);
            i13 = this.f4555w.getMeasuredWidth() + m5419u(this.f4555w);
            i14 = Math.max(i14, this.f4555w.getMeasuredHeight() + m5420v(this.f4555w));
            i15 = View.combineMeasuredStates(i15, this.f4555w.getMeasuredState());
        }
        int currentContentInsetStart = getCurrentContentInsetStart();
        int max = Math.max(currentContentInsetStart, i13);
        iArr[m5459b ? 1 : 0] = Math.max(0, currentContentInsetStart - i13);
        if (m5408O(this.f4548p)) {
            m5405G(this.f4548p, i11, max, i12, 0, this.f4522D);
            i16 = this.f4548p.getMeasuredWidth() + m5419u(this.f4548p);
            i14 = Math.max(i14, this.f4548p.getMeasuredHeight() + m5420v(this.f4548p));
            i15 = View.combineMeasuredStates(i15, this.f4548p.getMeasuredState());
        } else {
            i16 = 0;
        }
        int currentContentInsetEnd = getCurrentContentInsetEnd();
        int max2 = max + Math.max(currentContentInsetEnd, i16);
        iArr[i22] = Math.max(0, currentContentInsetEnd - i16);
        if (m5408O(this.f4556x)) {
            max2 += m5404F(this.f4556x, i11, max2, i12, 0, iArr);
            i14 = Math.max(i14, this.f4556x.getMeasuredHeight() + m5420v(this.f4556x));
            i15 = View.combineMeasuredStates(i15, this.f4556x.getMeasuredState());
        }
        if (m5408O(this.f4552t)) {
            max2 += m5404F(this.f4552t, i11, max2, i12, 0, iArr);
            i14 = Math.max(i14, this.f4552t.getMeasuredHeight() + m5420v(this.f4552t));
            i15 = View.combineMeasuredStates(i15, this.f4552t.getMeasuredState());
        }
        int childCount = getChildCount();
        for (int i23 = 0; i23 < childCount; i23++) {
            View childAt = getChildAt(i23);
            if (((LayoutParams) childAt.getLayoutParams()).f4559b == 0 && m5408O(childAt)) {
                max2 += m5404F(childAt, i11, max2, i12, 0, iArr);
                i14 = Math.max(i14, childAt.getMeasuredHeight() + m5420v(childAt));
                i15 = View.combineMeasuredStates(i15, childAt.getMeasuredState());
            }
        }
        int i24 = this.f4525G + this.f4526H;
        int i25 = this.f4523E + this.f4524F;
        if (m5408O(this.f4549q)) {
            m5404F(this.f4549q, i11, max2 + i25, i12, i24, iArr);
            int measuredWidth = this.f4549q.getMeasuredWidth() + m5419u(this.f4549q);
            i19 = this.f4549q.getMeasuredHeight() + m5420v(this.f4549q);
            i17 = View.combineMeasuredStates(i15, this.f4549q.getMeasuredState());
            i18 = measuredWidth;
        } else {
            i17 = i15;
            i18 = 0;
            i19 = 0;
        }
        if (m5408O(this.f4550r)) {
            i18 = Math.max(i18, m5404F(this.f4550r, i11, max2 + i25, i12, i19 + i24, iArr));
            i19 += this.f4550r.getMeasuredHeight() + m5420v(this.f4550r);
            i17 = View.combineMeasuredStates(i17, this.f4550r.getMeasuredState());
        }
        int max3 = Math.max(i14, i19);
        int paddingLeft = max2 + i18 + getPaddingLeft() + getPaddingRight();
        int paddingTop = max3 + getPaddingTop() + getPaddingBottom();
        int resolveSizeAndState = View.resolveSizeAndState(Math.max(paddingLeft, getSuggestedMinimumWidth()), i11, (-16777216) & i17);
        int resolveSizeAndState2 = View.resolveSizeAndState(Math.max(paddingTop, getSuggestedMinimumHeight()), i12, i17 << 16);
        if (!m5407N()) {
            i21 = resolveSizeAndState2;
        }
        setMeasuredDimension(resolveSizeAndState, i21);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        C1072e c1072e;
        MenuItem findItem;
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.m8457a());
        ActionMenuView actionMenuView = this.f4548p;
        if (actionMenuView != null) {
            c1072e = actionMenuView.m5223P();
        } else {
            c1072e = null;
        }
        int i11 = savedState.f4560r;
        if (i11 != 0 && this.f4543b0 != null && c1072e != null && (findItem = c1072e.findItem(i11)) != null) {
            findItem.expandActionView();
        }
        if (savedState.f4561s) {
            m5406H();
        }
    }

    @Override // android.view.View
    public void onRtlPropertiesChanged(int i11) {
        super.onRtlPropertiesChanged(i11);
        m5411h();
        C1187l1 c1187l1 = this.f4527I;
        boolean z11 = true;
        if (i11 != 1) {
            z11 = false;
        }
        c1187l1.m5614f(z11);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        C1074g c1074g;
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        C1145d c1145d = this.f4543b0;
        if (c1145d != null && (c1074g = c1145d.f4566q) != null) {
            savedState.f4560r = c1074g.getItemId();
        }
        savedState.f4561s = m5423C();
        return savedState;
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f4535Q = false;
        }
        if (!this.f4535Q) {
            boolean onTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !onTouchEvent) {
                this.f4535Q = true;
            }
        }
        if (actionMasked == 1 || actionMasked == 3) {
            this.f4535Q = false;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.ViewGroup
    /* renamed from: p, reason: merged with bridge method [inline-methods] */
    public LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof LayoutParams) {
            return new LayoutParams((LayoutParams) layoutParams);
        }
        if (layoutParams instanceof ActionBar.LayoutParams) {
            return new LayoutParams((ActionBar.LayoutParams) layoutParams);
        }
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return new LayoutParams((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return new LayoutParams(layoutParams);
    }

    public void setCollapseContentDescription(int i11) {
        setCollapseContentDescription(i11 != 0 ? getContext().getText(i11) : null);
    }

    public void setCollapseIcon(int i11) {
        setCollapseIcon(AbstractC19694b.m103336d(getContext(), i11));
    }

    public void setCollapsible(boolean z11) {
        this.f4546e0 = z11;
        requestLayout();
    }

    public void setContentInsetEndWithActions(int i11) {
        if (i11 < 0) {
            i11 = Integer.MIN_VALUE;
        }
        if (i11 != this.f4529K) {
            this.f4529K = i11;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setContentInsetStartWithNavigation(int i11) {
        if (i11 < 0) {
            i11 = Integer.MIN_VALUE;
        }
        if (i11 != this.f4528J) {
            this.f4528J = i11;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setLogo(int i11) {
        setLogo(AbstractC19694b.m103336d(getContext(), i11));
    }

    public void setLogoDescription(int i11) {
        setLogoDescription(getContext().getText(i11));
    }

    public void setNavigationContentDescription(int i11) {
        setNavigationContentDescription(i11 != 0 ? getContext().getText(i11) : null);
    }

    public void setNavigationIcon(int i11) {
        setNavigationIcon(AbstractC19694b.m103336d(getContext(), i11));
    }

    public void setNavigationOnClickListener(View.OnClickListener onClickListener) {
        m5415l();
        this.f4551s.setOnClickListener(onClickListener);
    }

    public void setOnMenuItemClickListener(InterfaceC1146e interfaceC1146e) {
    }

    public void setOverflowIcon(Drawable drawable) {
        m5413j();
        this.f4548p.setOverflowIcon(drawable);
    }

    public void setPopupTheme(int i11) {
        if (this.f4558z != i11) {
            this.f4558z = i11;
            if (i11 == 0) {
                this.f4557y = getContext();
            } else {
                this.f4557y = new ContextThemeWrapper(getContext(), i11);
            }
        }
    }

    public void setSubtitle(int i11) {
        setSubtitle(getContext().getText(i11));
    }

    public void setSubtitleTextColor(int i11) {
        setSubtitleTextColor(ColorStateList.valueOf(i11));
    }

    public void setTitle(int i11) {
        setTitle(getContext().getText(i11));
    }

    public void setTitleMarginBottom(int i11) {
        this.f4526H = i11;
        requestLayout();
    }

    public void setTitleMarginEnd(int i11) {
        this.f4524F = i11;
        requestLayout();
    }

    public void setTitleMarginStart(int i11) {
        this.f4523E = i11;
        requestLayout();
    }

    public void setTitleMarginTop(int i11) {
        this.f4525G = i11;
        requestLayout();
    }

    public void setTitleTextColor(int i11) {
        setTitleTextColor(ColorStateList.valueOf(i11));
    }

    /* renamed from: x */
    public boolean m5438x() {
        C1145d c1145d = this.f4543b0;
        if (c1145d != null && c1145d.f4566q != null) {
            return true;
        }
        return false;
    }

    /* renamed from: y */
    public boolean m5439y() {
        ActionMenuView actionMenuView = this.f4548p;
        if (actionMenuView != null && actionMenuView.m5219J()) {
            return true;
        }
        return false;
    }

    /* renamed from: z */
    public void m5440z(int i11) {
        getMenuInflater().inflate(i11, getMenu());
    }

    public Toolbar(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        this.f4530L = 8388627;
        this.f4537S = new ArrayList();
        this.f4538T = new ArrayList();
        this.f4539U = new int[2];
        this.f4540V = new C1142a();
        this.f4547f0 = new RunnableC1143b();
        C1211t1 m5716v = C1211t1.m5716v(getContext(), attributeSet, AbstractC19187j.Toolbar, i11, 0);
        AbstractC1579n0.m7912y0(this, context, AbstractC19187j.Toolbar, attributeSet, m5716v.m5734r(), i11, 0);
        this.f4519A = m5716v.m5730n(AbstractC19187j.Toolbar_titleTextAppearance, 0);
        this.f4520B = m5716v.m5730n(AbstractC19187j.Toolbar_subtitleTextAppearance, 0);
        this.f4530L = m5716v.m5728l(AbstractC19187j.Toolbar_android_gravity, this.f4530L);
        this.f4521C = m5716v.m5728l(AbstractC19187j.Toolbar_buttonGravity, 48);
        int m5721e = m5716v.m5721e(AbstractC19187j.Toolbar_titleMargin, 0);
        m5721e = m5716v.m5735s(AbstractC19187j.Toolbar_titleMargins) ? m5716v.m5721e(AbstractC19187j.Toolbar_titleMargins, m5721e) : m5721e;
        this.f4526H = m5721e;
        this.f4525G = m5721e;
        this.f4524F = m5721e;
        this.f4523E = m5721e;
        int m5721e2 = m5716v.m5721e(AbstractC19187j.Toolbar_titleMarginStart, -1);
        if (m5721e2 >= 0) {
            this.f4523E = m5721e2;
        }
        int m5721e3 = m5716v.m5721e(AbstractC19187j.Toolbar_titleMarginEnd, -1);
        if (m5721e3 >= 0) {
            this.f4524F = m5721e3;
        }
        int m5721e4 = m5716v.m5721e(AbstractC19187j.Toolbar_titleMarginTop, -1);
        if (m5721e4 >= 0) {
            this.f4525G = m5721e4;
        }
        int m5721e5 = m5716v.m5721e(AbstractC19187j.Toolbar_titleMarginBottom, -1);
        if (m5721e5 >= 0) {
            this.f4526H = m5721e5;
        }
        this.f4522D = m5716v.m5722f(AbstractC19187j.Toolbar_maxButtonHeight, -1);
        int m5721e6 = m5716v.m5721e(AbstractC19187j.Toolbar_contentInsetStart, Integer.MIN_VALUE);
        int m5721e7 = m5716v.m5721e(AbstractC19187j.Toolbar_contentInsetEnd, Integer.MIN_VALUE);
        int m5722f = m5716v.m5722f(AbstractC19187j.Toolbar_contentInsetLeft, 0);
        int m5722f2 = m5716v.m5722f(AbstractC19187j.Toolbar_contentInsetRight, 0);
        m5411h();
        this.f4527I.m5613e(m5722f, m5722f2);
        if (m5721e6 != Integer.MIN_VALUE || m5721e7 != Integer.MIN_VALUE) {
            this.f4527I.m5615g(m5721e6, m5721e7);
        }
        this.f4528J = m5716v.m5721e(AbstractC19187j.Toolbar_contentInsetStartWithNavigation, Integer.MIN_VALUE);
        this.f4529K = m5716v.m5721e(AbstractC19187j.Toolbar_contentInsetEndWithActions, Integer.MIN_VALUE);
        this.f4553u = m5716v.m5723g(AbstractC19187j.Toolbar_collapseIcon);
        this.f4554v = m5716v.m5732p(AbstractC19187j.Toolbar_collapseContentDescription);
        CharSequence m5732p = m5716v.m5732p(AbstractC19187j.Toolbar_title);
        if (!TextUtils.isEmpty(m5732p)) {
            setTitle(m5732p);
        }
        CharSequence m5732p2 = m5716v.m5732p(AbstractC19187j.Toolbar_subtitle);
        if (!TextUtils.isEmpty(m5732p2)) {
            setSubtitle(m5732p2);
        }
        this.f4557y = getContext();
        setPopupTheme(m5716v.m5730n(AbstractC19187j.Toolbar_popupTheme, 0));
        Drawable m5723g = m5716v.m5723g(AbstractC19187j.Toolbar_navigationIcon);
        if (m5723g != null) {
            setNavigationIcon(m5723g);
        }
        CharSequence m5732p3 = m5716v.m5732p(AbstractC19187j.Toolbar_navigationContentDescription);
        if (!TextUtils.isEmpty(m5732p3)) {
            setNavigationContentDescription(m5732p3);
        }
        Drawable m5723g2 = m5716v.m5723g(AbstractC19187j.Toolbar_logo);
        if (m5723g2 != null) {
            setLogo(m5723g2);
        }
        CharSequence m5732p4 = m5716v.m5732p(AbstractC19187j.Toolbar_logoDescription);
        if (!TextUtils.isEmpty(m5732p4)) {
            setLogoDescription(m5732p4);
        }
        if (m5716v.m5735s(AbstractC19187j.Toolbar_titleTextColor)) {
            setTitleTextColor(m5716v.m5719c(AbstractC19187j.Toolbar_titleTextColor));
        }
        if (m5716v.m5735s(AbstractC19187j.Toolbar_subtitleTextColor)) {
            setSubtitleTextColor(m5716v.m5719c(AbstractC19187j.Toolbar_subtitleTextColor));
        }
        if (m5716v.m5735s(AbstractC19187j.Toolbar_menu)) {
            m5440z(m5716v.m5730n(AbstractC19187j.Toolbar_menu, 0));
        }
        m5716v.m5736w();
    }

    public void setCollapseContentDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            m5434g();
        }
        ImageButton imageButton = this.f4555w;
        if (imageButton != null) {
            imageButton.setContentDescription(charSequence);
        }
    }

    public void setCollapseIcon(Drawable drawable) {
        if (drawable != null) {
            m5434g();
            this.f4555w.setImageDrawable(drawable);
        } else {
            ImageButton imageButton = this.f4555w;
            if (imageButton != null) {
                imageButton.setImageDrawable(this.f4553u);
            }
        }
    }

    public void setLogo(Drawable drawable) {
        if (drawable != null) {
            m5412i();
            if (!m5401A(this.f4552t)) {
                m5410c(this.f4552t, true);
            }
        } else {
            ImageView imageView = this.f4552t;
            if (imageView != null && m5401A(imageView)) {
                removeView(this.f4552t);
                this.f4538T.remove(this.f4552t);
            }
        }
        ImageView imageView2 = this.f4552t;
        if (imageView2 != null) {
            imageView2.setImageDrawable(drawable);
        }
    }

    public void setLogoDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            m5412i();
        }
        ImageView imageView = this.f4552t;
        if (imageView != null) {
            imageView.setContentDescription(charSequence);
        }
    }

    public void setNavigationContentDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            m5415l();
        }
        ImageButton imageButton = this.f4551s;
        if (imageButton != null) {
            imageButton.setContentDescription(charSequence);
        }
    }

    public void setNavigationIcon(Drawable drawable) {
        if (drawable != null) {
            m5415l();
            if (!m5401A(this.f4551s)) {
                m5410c(this.f4551s, true);
            }
        } else {
            ImageButton imageButton = this.f4551s;
            if (imageButton != null && m5401A(imageButton)) {
                removeView(this.f4551s);
                this.f4538T.remove(this.f4551s);
            }
        }
        ImageButton imageButton2 = this.f4551s;
        if (imageButton2 != null) {
            imageButton2.setImageDrawable(drawable);
        }
    }

    public void setSubtitle(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            if (this.f4550r == null) {
                Context context = getContext();
                AppCompatTextView appCompatTextView = new AppCompatTextView(context);
                this.f4550r = appCompatTextView;
                appCompatTextView.setSingleLine();
                this.f4550r.setEllipsize(TextUtils.TruncateAt.END);
                int i11 = this.f4520B;
                if (i11 != 0) {
                    this.f4550r.setTextAppearance(context, i11);
                }
                ColorStateList colorStateList = this.f4534P;
                if (colorStateList != null) {
                    this.f4550r.setTextColor(colorStateList);
                }
            }
            if (!m5401A(this.f4550r)) {
                m5410c(this.f4550r, true);
            }
        } else {
            TextView textView = this.f4550r;
            if (textView != null && m5401A(textView)) {
                removeView(this.f4550r);
                this.f4538T.remove(this.f4550r);
            }
        }
        TextView textView2 = this.f4550r;
        if (textView2 != null) {
            textView2.setText(charSequence);
        }
        this.f4532N = charSequence;
    }

    public void setSubtitleTextColor(ColorStateList colorStateList) {
        this.f4534P = colorStateList;
        TextView textView = this.f4550r;
        if (textView != null) {
            textView.setTextColor(colorStateList);
        }
    }

    public void setTitle(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            if (this.f4549q == null) {
                Context context = getContext();
                AppCompatTextView appCompatTextView = new AppCompatTextView(context);
                this.f4549q = appCompatTextView;
                appCompatTextView.setSingleLine();
                this.f4549q.setEllipsize(TextUtils.TruncateAt.END);
                int i11 = this.f4519A;
                if (i11 != 0) {
                    this.f4549q.setTextAppearance(context, i11);
                }
                ColorStateList colorStateList = this.f4533O;
                if (colorStateList != null) {
                    this.f4549q.setTextColor(colorStateList);
                }
            }
            if (!m5401A(this.f4549q)) {
                m5410c(this.f4549q, true);
            }
        } else {
            TextView textView = this.f4549q;
            if (textView != null && m5401A(textView)) {
                removeView(this.f4549q);
                this.f4538T.remove(this.f4549q);
            }
        }
        TextView textView2 = this.f4549q;
        if (textView2 != null) {
            textView2.setText(charSequence);
        }
        this.f4531M = charSequence;
    }

    public void setTitleTextColor(ColorStateList colorStateList) {
        this.f4533O = colorStateList;
        TextView textView = this.f4549q;
        if (textView != null) {
            textView.setTextColor(colorStateList);
        }
    }

    /* loaded from: classes2.dex */
    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new C1141a();

        /* renamed from: r */
        int f4560r;

        /* renamed from: s */
        boolean f4561s;

        /* renamed from: androidx.appcompat.widget.Toolbar$SavedState$a */
        /* loaded from: classes2.dex */
        class C1141a implements Parcelable.ClassLoaderCreator {
            C1141a() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel, null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: c, reason: merged with bridge method [inline-methods] */
            public SavedState[] newArray(int i11) {
                return new SavedState[i11];
            }
        }

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f4560r = parcel.readInt();
            this.f4561s = parcel.readInt() != 0;
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i11) {
            super.writeToParcel(parcel, i11);
            parcel.writeInt(this.f4560r);
            parcel.writeInt(this.f4561s ? 1 : 0);
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }
    }
}
