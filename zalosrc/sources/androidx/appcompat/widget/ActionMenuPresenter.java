package androidx.appcompat.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseBooleanArray;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.view.menu.AbstractC1068a;
import androidx.appcompat.view.menu.ActionMenuItemView;
import androidx.appcompat.view.menu.C1072e;
import androidx.appcompat.view.menu.C1074g;
import androidx.appcompat.view.menu.C1076i;
import androidx.appcompat.view.menu.InterfaceC1077j;
import androidx.appcompat.view.menu.InterfaceC1078k;
import androidx.appcompat.view.menu.SubMenuC1080m;
import androidx.appcompat.widget.ActionMenuView;
import androidx.core.graphics.drawable.AbstractC1414a;
import androidx.core.view.AbstractC1530b;
import java.util.ArrayList;
import p175g0.AbstractC19178a;
import p175g0.AbstractC19184g;
import p310l0.C21980a;
import p336m0.InterfaceC22701e;

/* loaded from: classes2.dex */
public class ActionMenuPresenter extends AbstractC1068a implements AbstractC1530b.a {

    /* renamed from: A */
    private Drawable f4173A;

    /* renamed from: B */
    private boolean f4174B;

    /* renamed from: C */
    private boolean f4175C;

    /* renamed from: D */
    private boolean f4176D;

    /* renamed from: E */
    private int f4177E;

    /* renamed from: F */
    private int f4178F;

    /* renamed from: G */
    private int f4179G;

    /* renamed from: H */
    private boolean f4180H;

    /* renamed from: I */
    private boolean f4181I;

    /* renamed from: J */
    private boolean f4182J;

    /* renamed from: K */
    private boolean f4183K;

    /* renamed from: L */
    private int f4184L;

    /* renamed from: M */
    private final SparseBooleanArray f4185M;

    /* renamed from: N */
    C1091e f4186N;

    /* renamed from: O */
    C1087a f4187O;

    /* renamed from: P */
    RunnableC1089c f4188P;

    /* renamed from: Q */
    private C1088b f4189Q;

    /* renamed from: R */
    final C1092f f4190R;

    /* renamed from: S */
    int f4191S;

    /* renamed from: z */
    C1090d f4192z;

    @SuppressLint({"BanParcelableUsage"})
    /* loaded from: classes2.dex */
    public static class SavedState implements Parcelable {
        public static final Parcelable.Creator<SavedState> CREATOR = new C1086a();

        /* renamed from: p */
        public int f4193p;

        /* renamed from: androidx.appcompat.widget.ActionMenuPresenter$SavedState$a */
        /* loaded from: classes2.dex */
        class C1086a implements Parcelable.Creator {
            C1086a() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a */
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b */
            public SavedState[] newArray(int i11) {
                return new SavedState[i11];
            }
        }

        SavedState() {
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i11) {
            parcel.writeInt(this.f4193p);
        }

        SavedState(Parcel parcel) {
            this.f4193p = parcel.readInt();
        }
    }

    /* renamed from: androidx.appcompat.widget.ActionMenuPresenter$a */
    /* loaded from: classes2.dex */
    public class C1087a extends C1076i {
        public C1087a(Context context, SubMenuC1080m subMenuC1080m, View view) {
            super(context, subMenuC1080m, view, false, AbstractC19178a.actionOverflowMenuStyle);
            if (!((C1074g) subMenuC1080m.getItem()).m5114l()) {
                View view2 = ActionMenuPresenter.this.f4192z;
                m5140f(view2 == null ? (View) ((AbstractC1068a) ActionMenuPresenter.this).f3956x : view2);
            }
            m5144j(ActionMenuPresenter.this.f4190R);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // androidx.appcompat.view.menu.C1076i
        /* renamed from: e */
        public void mo5139e() {
            ActionMenuPresenter actionMenuPresenter = ActionMenuPresenter.this;
            actionMenuPresenter.f4187O = null;
            actionMenuPresenter.f4191S = 0;
            super.mo5139e();
        }
    }

    /* renamed from: androidx.appcompat.widget.ActionMenuPresenter$b */
    /* loaded from: classes2.dex */
    private class C1088b extends ActionMenuItemView.AbstractC1067b {
        C1088b() {
        }

        @Override // androidx.appcompat.view.menu.ActionMenuItemView.AbstractC1067b
        /* renamed from: a */
        public InterfaceC22701e mo4978a() {
            C1087a c1087a = ActionMenuPresenter.this.f4187O;
            if (c1087a != null) {
                return c1087a.m5137c();
            }
            return null;
        }
    }

    /* renamed from: androidx.appcompat.widget.ActionMenuPresenter$c */
    /* loaded from: classes2.dex */
    public class RunnableC1089c implements Runnable {

        /* renamed from: p */
        private C1091e f4196p;

        public RunnableC1089c(C1091e c1091e) {
            this.f4196p = c1091e;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (((AbstractC1068a) ActionMenuPresenter.this).f3950r != null) {
                ((AbstractC1068a) ActionMenuPresenter.this).f3950r.m5078d();
            }
            View view = (View) ((AbstractC1068a) ActionMenuPresenter.this).f3956x;
            if (view != null && view.getWindowToken() != null && this.f4196p.m5146m()) {
                ActionMenuPresenter.this.f4186N = this.f4196p;
            }
            ActionMenuPresenter.this.f4188P = null;
        }
    }

    /* renamed from: androidx.appcompat.widget.ActionMenuPresenter$d */
    /* loaded from: classes2.dex */
    public class C1090d extends AppCompatImageView implements ActionMenuView.InterfaceC1093a {

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: androidx.appcompat.widget.ActionMenuPresenter$d$a */
        /* loaded from: classes2.dex */
        public class a extends AbstractViewOnTouchListenerC1155b1 {

            /* renamed from: y */
            final /* synthetic */ ActionMenuPresenter f4199y;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(View view, ActionMenuPresenter actionMenuPresenter) {
                super(view);
                this.f4199y = actionMenuPresenter;
            }

            @Override // androidx.appcompat.widget.AbstractViewOnTouchListenerC1155b1
            /* renamed from: b */
            public InterfaceC22701e mo4976b() {
                C1091e c1091e = ActionMenuPresenter.this.f4186N;
                if (c1091e == null) {
                    return null;
                }
                return c1091e.m5137c();
            }

            @Override // androidx.appcompat.widget.AbstractViewOnTouchListenerC1155b1
            /* renamed from: c */
            public boolean mo4977c() {
                ActionMenuPresenter.this.m5206O();
                return true;
            }

            @Override // androidx.appcompat.widget.AbstractViewOnTouchListenerC1155b1
            /* renamed from: d */
            public boolean mo5210d() {
                ActionMenuPresenter actionMenuPresenter = ActionMenuPresenter.this;
                if (actionMenuPresenter.f4188P != null) {
                    return false;
                }
                actionMenuPresenter.m5197F();
                return true;
            }
        }

        public C1090d(Context context) {
            super(context, null, AbstractC19178a.actionOverflowButtonStyle);
            setClickable(true);
            setFocusable(true);
            setVisibility(0);
            setEnabled(true);
            AbstractC1220w1.m5757a(this, getContentDescription());
            setOnTouchListener(new a(this, ActionMenuPresenter.this));
        }

        @Override // androidx.appcompat.widget.ActionMenuView.InterfaceC1093a
        /* renamed from: c */
        public boolean mo4972c() {
            return false;
        }

        @Override // androidx.appcompat.widget.ActionMenuView.InterfaceC1093a
        /* renamed from: d */
        public boolean mo4973d() {
            return false;
        }

        @Override // android.view.View
        public boolean performClick() {
            if (super.performClick()) {
                return true;
            }
            playSoundEffect(0);
            ActionMenuPresenter.this.m5206O();
            return true;
        }

        @Override // android.widget.ImageView
        protected boolean setFrame(int i11, int i12, int i13, int i14) {
            boolean frame = super.setFrame(i11, i12, i13, i14);
            Drawable drawable = getDrawable();
            Drawable background = getBackground();
            if (drawable != null && background != null) {
                int width = getWidth();
                int height = getHeight();
                int max = Math.max(width, height) / 2;
                int paddingLeft = (width + (getPaddingLeft() - getPaddingRight())) / 2;
                int paddingTop = (height + (getPaddingTop() - getPaddingBottom())) / 2;
                AbstractC1414a.m7194l(background, paddingLeft - max, paddingTop - max, paddingLeft + max, paddingTop + max);
            }
            return frame;
        }
    }

    /* renamed from: androidx.appcompat.widget.ActionMenuPresenter$e */
    /* loaded from: classes2.dex */
    public class C1091e extends C1076i {
        public C1091e(Context context, C1072e c1072e, View view, boolean z11) {
            super(context, c1072e, view, z11, AbstractC19178a.actionOverflowMenuStyle);
            m5142h(8388613);
            m5144j(ActionMenuPresenter.this.f4190R);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // androidx.appcompat.view.menu.C1076i
        /* renamed from: e */
        public void mo5139e() {
            if (((AbstractC1068a) ActionMenuPresenter.this).f3950r != null) {
                ((AbstractC1068a) ActionMenuPresenter.this).f3950r.close();
            }
            ActionMenuPresenter.this.f4186N = null;
            super.mo5139e();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.appcompat.widget.ActionMenuPresenter$f */
    /* loaded from: classes2.dex */
    public class C1092f implements InterfaceC1077j.a {
        C1092f() {
        }

        @Override // androidx.appcompat.view.menu.InterfaceC1077j.a
        /* renamed from: c */
        public void mo4850c(C1072e c1072e, boolean z11) {
            if (c1072e instanceof SubMenuC1080m) {
                c1072e.mo5053F().m5080e(false);
            }
            InterfaceC1077j.a m4999q = ActionMenuPresenter.this.m4999q();
            if (m4999q != null) {
                m4999q.mo4850c(c1072e, z11);
            }
        }

        @Override // androidx.appcompat.view.menu.InterfaceC1077j.a
        /* renamed from: d */
        public boolean mo4851d(C1072e c1072e) {
            if (c1072e == ((AbstractC1068a) ActionMenuPresenter.this).f3950r) {
                return false;
            }
            ActionMenuPresenter.this.f4191S = ((SubMenuC1080m) c1072e).getItem().getItemId();
            InterfaceC1077j.a m4999q = ActionMenuPresenter.this.m4999q();
            if (m4999q == null) {
                return false;
            }
            return m4999q.mo4851d(c1072e);
        }
    }

    public ActionMenuPresenter(Context context) {
        super(context, AbstractC19184g.abc_action_menu_layout, AbstractC19184g.abc_action_menu_item_layout);
        this.f4185M = new SparseBooleanArray();
        this.f4190R = new C1092f();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: D */
    private View m5189D(MenuItem menuItem) {
        ViewGroup viewGroup = (ViewGroup) this.f3956x;
        if (viewGroup == null) {
            return null;
        }
        int childCount = viewGroup.getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = viewGroup.getChildAt(i11);
            if ((childAt instanceof InterfaceC1078k.a) && ((InterfaceC1078k.a) childAt).getItemData() == menuItem) {
                return childAt;
            }
        }
        return null;
    }

    /* renamed from: C */
    public boolean m5195C() {
        return m5197F() | m5198G();
    }

    /* renamed from: E */
    public Drawable m5196E() {
        C1090d c1090d = this.f4192z;
        if (c1090d != null) {
            return c1090d.getDrawable();
        }
        if (this.f4174B) {
            return this.f4173A;
        }
        return null;
    }

    /* renamed from: F */
    public boolean m5197F() {
        Object obj;
        RunnableC1089c runnableC1089c = this.f4188P;
        if (runnableC1089c != null && (obj = this.f3956x) != null) {
            ((View) obj).removeCallbacks(runnableC1089c);
            this.f4188P = null;
            return true;
        }
        C1091e c1091e = this.f4186N;
        if (c1091e != null) {
            c1091e.m5136b();
            return true;
        }
        return false;
    }

    /* renamed from: G */
    public boolean m5198G() {
        C1087a c1087a = this.f4187O;
        if (c1087a != null) {
            c1087a.m5136b();
            return true;
        }
        return false;
    }

    /* renamed from: H */
    public boolean m5199H() {
        if (this.f4188P == null && !m5200I()) {
            return false;
        }
        return true;
    }

    /* renamed from: I */
    public boolean m5200I() {
        C1091e c1091e = this.f4186N;
        if (c1091e != null && c1091e.m5138d()) {
            return true;
        }
        return false;
    }

    /* renamed from: J */
    public void m5201J(Configuration configuration) {
        if (!this.f4180H) {
            this.f4179G = C21980a.m114787b(this.f3949q).m114790d();
        }
        C1072e c1072e = this.f3950r;
        if (c1072e != null) {
            c1072e.mo5060M(true);
        }
    }

    /* renamed from: K */
    public void m5202K(boolean z11) {
        this.f4183K = z11;
    }

    /* renamed from: L */
    public void m5203L(ActionMenuView actionMenuView) {
        this.f3956x = actionMenuView;
        actionMenuView.mo4980h(this.f3950r);
    }

    /* renamed from: M */
    public void m5204M(Drawable drawable) {
        C1090d c1090d = this.f4192z;
        if (c1090d != null) {
            c1090d.setImageDrawable(drawable);
        } else {
            this.f4174B = true;
            this.f4173A = drawable;
        }
    }

    /* renamed from: N */
    public void m5205N(boolean z11) {
        this.f4175C = z11;
        this.f4176D = true;
    }

    /* renamed from: O */
    public boolean m5206O() {
        C1072e c1072e;
        if (this.f4175C && !m5200I() && (c1072e = this.f3950r) != null && this.f3956x != null && this.f4188P == null && !c1072e.m5050B().isEmpty()) {
            RunnableC1089c runnableC1089c = new RunnableC1089c(new C1091e(this.f3949q, this.f3950r, this.f4192z, true));
            this.f4188P = runnableC1089c;
            ((View) this.f3956x).post(runnableC1089c);
            return true;
        }
        return false;
    }

    @Override // androidx.core.view.AbstractC1530b.a
    /* renamed from: a */
    public void mo5207a(boolean z11) {
        if (z11) {
            super.mo4994j(null);
            return;
        }
        C1072e c1072e = this.f3950r;
        if (c1072e != null) {
            c1072e.m5080e(false);
        }
    }

    @Override // androidx.appcompat.view.menu.AbstractC1068a, androidx.appcompat.view.menu.InterfaceC1077j
    /* renamed from: c */
    public void mo4988c(C1072e c1072e, boolean z11) {
        m5195C();
        super.mo4988c(c1072e, z11);
    }

    @Override // androidx.appcompat.view.menu.AbstractC1068a
    /* renamed from: d */
    public void mo4989d(C1074g c1074g, InterfaceC1078k.a aVar) {
        aVar.mo4971b(c1074g, 0);
        ActionMenuItemView actionMenuItemView = (ActionMenuItemView) aVar;
        actionMenuItemView.setItemInvoker((ActionMenuView) this.f3956x);
        if (this.f4189Q == null) {
            this.f4189Q = new C1088b();
        }
        actionMenuItemView.setPopupCallback(this.f4189Q);
    }

    @Override // androidx.appcompat.view.menu.InterfaceC1077j
    /* renamed from: i */
    public void mo5015i(Parcelable parcelable) {
        int i11;
        MenuItem findItem;
        if ((parcelable instanceof SavedState) && (i11 = ((SavedState) parcelable).f4193p) > 0 && (findItem = this.f3950r.findItem(i11)) != null) {
            mo4994j((SubMenuC1080m) findItem.getSubMenu());
        }
    }

    @Override // androidx.appcompat.view.menu.AbstractC1068a, androidx.appcompat.view.menu.InterfaceC1077j
    /* renamed from: j */
    public boolean mo4994j(SubMenuC1080m subMenuC1080m) {
        boolean z11 = false;
        if (!subMenuC1080m.hasVisibleItems()) {
            return false;
        }
        SubMenuC1080m subMenuC1080m2 = subMenuC1080m;
        while (subMenuC1080m2.m5149i0() != this.f3950r) {
            subMenuC1080m2 = (SubMenuC1080m) subMenuC1080m2.m5149i0();
        }
        View m5189D = m5189D(subMenuC1080m2.getItem());
        if (m5189D == null) {
            return false;
        }
        this.f4191S = subMenuC1080m.getItem().getItemId();
        int size = subMenuC1080m.size();
        int i11 = 0;
        while (true) {
            if (i11 >= size) {
                break;
            }
            MenuItem item = subMenuC1080m.getItem(i11);
            if (item.isVisible() && item.getIcon() != null) {
                z11 = true;
                break;
            }
            i11++;
        }
        C1087a c1087a = new C1087a(this.f3949q, subMenuC1080m, m5189D);
        this.f4187O = c1087a;
        c1087a.m5141g(z11);
        this.f4187O.m5145k();
        super.mo4994j(subMenuC1080m);
        return true;
    }

    @Override // androidx.appcompat.view.menu.InterfaceC1077j
    /* renamed from: k */
    public Parcelable mo5016k() {
        SavedState savedState = new SavedState();
        savedState.f4193p = this.f4191S;
        return savedState;
    }

    @Override // androidx.appcompat.view.menu.AbstractC1068a, androidx.appcompat.view.menu.InterfaceC1077j
    /* renamed from: l */
    public void mo4995l(boolean z11) {
        ArrayList arrayList;
        int size;
        super.mo4995l(z11);
        ((View) this.f3956x).requestLayout();
        C1072e c1072e = this.f3950r;
        if (c1072e != null) {
            ArrayList m5093u = c1072e.m5093u();
            int size2 = m5093u.size();
            for (int i11 = 0; i11 < size2; i11++) {
                AbstractC1530b mo5105a = ((C1074g) m5093u.get(i11)).mo5105a();
                if (mo5105a != null) {
                    mo5105a.m7705h(this);
                }
            }
        }
        C1072e c1072e2 = this.f3950r;
        if (c1072e2 != null) {
            arrayList = c1072e2.m5050B();
        } else {
            arrayList = null;
        }
        if (this.f4175C && arrayList != null && ((size = arrayList.size()) != 1 ? size > 0 : (!((C1074g) arrayList.get(0)).isActionViewExpanded()))) {
            if (this.f4192z == null) {
                this.f4192z = new C1090d(this.f3948p);
            }
            ViewGroup viewGroup = (ViewGroup) this.f4192z.getParent();
            if (viewGroup != this.f3956x) {
                if (viewGroup != null) {
                    viewGroup.removeView(this.f4192z);
                }
                ActionMenuView actionMenuView = (ActionMenuView) this.f3956x;
                actionMenuView.addView(this.f4192z, actionMenuView.m5217H());
            }
        } else {
            C1090d c1090d = this.f4192z;
            if (c1090d != null) {
                Object parent = c1090d.getParent();
                Object obj = this.f3956x;
                if (parent == obj) {
                    ((ViewGroup) obj).removeView(this.f4192z);
                }
            }
        }
        ((ActionMenuView) this.f3956x).setOverflowReserved(this.f4175C);
    }

    @Override // androidx.appcompat.view.menu.InterfaceC1077j
    /* renamed from: m */
    public boolean mo5017m() {
        ArrayList arrayList;
        int i11;
        int i12;
        int i13;
        int i14;
        boolean z11;
        boolean z12;
        ActionMenuPresenter actionMenuPresenter = this;
        C1072e c1072e = actionMenuPresenter.f3950r;
        View view = null;
        int i15 = 0;
        if (c1072e != null) {
            arrayList = c1072e.m5054G();
            i11 = arrayList.size();
        } else {
            arrayList = null;
            i11 = 0;
        }
        int i16 = actionMenuPresenter.f4179G;
        int i17 = actionMenuPresenter.f4178F;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        ViewGroup viewGroup = (ViewGroup) actionMenuPresenter.f3956x;
        boolean z13 = false;
        int i18 = 0;
        int i19 = 0;
        for (int i21 = 0; i21 < i11; i21++) {
            C1074g c1074g = (C1074g) arrayList.get(i21);
            if (c1074g.m5117o()) {
                i18++;
            } else if (c1074g.m5116n()) {
                i19++;
            } else {
                z13 = true;
            }
            if (actionMenuPresenter.f4183K && c1074g.isActionViewExpanded()) {
                i16 = 0;
            }
        }
        if (actionMenuPresenter.f4175C && (z13 || i19 + i18 > i16)) {
            i16--;
        }
        int i22 = i16 - i18;
        SparseBooleanArray sparseBooleanArray = actionMenuPresenter.f4185M;
        sparseBooleanArray.clear();
        if (actionMenuPresenter.f4181I) {
            int i23 = actionMenuPresenter.f4184L;
            i13 = i17 / i23;
            i12 = i23 + ((i17 % i23) / i13);
        } else {
            i12 = 0;
            i13 = 0;
        }
        int i24 = 0;
        int i25 = 0;
        while (i24 < i11) {
            C1074g c1074g2 = (C1074g) arrayList.get(i24);
            if (c1074g2.m5117o()) {
                View mo5000r = actionMenuPresenter.mo5000r(c1074g2, view, viewGroup);
                if (actionMenuPresenter.f4181I) {
                    i13 -= ActionMenuView.m5211N(mo5000r, i12, i13, makeMeasureSpec, i15);
                } else {
                    mo5000r.measure(makeMeasureSpec, makeMeasureSpec);
                }
                int measuredWidth = mo5000r.getMeasuredWidth();
                i17 -= measuredWidth;
                if (i25 == 0) {
                    i25 = measuredWidth;
                }
                int groupId = c1074g2.getGroupId();
                if (groupId != 0) {
                    sparseBooleanArray.put(groupId, true);
                }
                c1074g2.m5123u(true);
                i14 = i11;
            } else if (c1074g2.m5116n()) {
                int groupId2 = c1074g2.getGroupId();
                boolean z14 = sparseBooleanArray.get(groupId2);
                if ((i22 > 0 || z14) && i17 > 0 && (!actionMenuPresenter.f4181I || i13 > 0)) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                boolean z15 = z11;
                i14 = i11;
                if (z11) {
                    View mo5000r2 = actionMenuPresenter.mo5000r(c1074g2, null, viewGroup);
                    if (actionMenuPresenter.f4181I) {
                        int m5211N = ActionMenuView.m5211N(mo5000r2, i12, i13, makeMeasureSpec, 0);
                        i13 -= m5211N;
                        if (m5211N == 0) {
                            z15 = false;
                        }
                    } else {
                        mo5000r2.measure(makeMeasureSpec, makeMeasureSpec);
                    }
                    boolean z16 = z15;
                    int measuredWidth2 = mo5000r2.getMeasuredWidth();
                    i17 -= measuredWidth2;
                    if (i25 == 0) {
                        i25 = measuredWidth2;
                    }
                    if (!actionMenuPresenter.f4181I ? i17 + i25 > 0 : i17 >= 0) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    z11 = z16 & z12;
                }
                if (z11 && groupId2 != 0) {
                    sparseBooleanArray.put(groupId2, true);
                } else if (z14) {
                    sparseBooleanArray.put(groupId2, false);
                    for (int i26 = 0; i26 < i24; i26++) {
                        C1074g c1074g3 = (C1074g) arrayList.get(i26);
                        if (c1074g3.getGroupId() == groupId2) {
                            if (c1074g3.m5114l()) {
                                i22++;
                            }
                            c1074g3.m5123u(false);
                        }
                    }
                }
                if (z11) {
                    i22--;
                }
                c1074g2.m5123u(z11);
            } else {
                i14 = i11;
                c1074g2.m5123u(false);
                i24++;
                view = null;
                actionMenuPresenter = this;
                i11 = i14;
                i15 = 0;
            }
            i24++;
            view = null;
            actionMenuPresenter = this;
            i11 = i14;
            i15 = 0;
        }
        return true;
    }

    @Override // androidx.appcompat.view.menu.AbstractC1068a, androidx.appcompat.view.menu.InterfaceC1077j
    /* renamed from: o */
    public void mo4997o(Context context, C1072e c1072e) {
        super.mo4997o(context, c1072e);
        Resources resources = context.getResources();
        C21980a m114787b = C21980a.m114787b(context);
        if (!this.f4176D) {
            this.f4175C = m114787b.m114794h();
        }
        if (!this.f4182J) {
            this.f4177E = m114787b.m114789c();
        }
        if (!this.f4180H) {
            this.f4179G = m114787b.m114790d();
        }
        int i11 = this.f4177E;
        if (this.f4175C) {
            if (this.f4192z == null) {
                C1090d c1090d = new C1090d(this.f3948p);
                this.f4192z = c1090d;
                if (this.f4174B) {
                    c1090d.setImageDrawable(this.f4173A);
                    this.f4173A = null;
                    this.f4174B = false;
                }
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
                this.f4192z.measure(makeMeasureSpec, makeMeasureSpec);
            }
            i11 -= this.f4192z.getMeasuredWidth();
        } else {
            this.f4192z = null;
        }
        this.f4178F = i11;
        this.f4184L = (int) (resources.getDisplayMetrics().density * 56.0f);
    }

    @Override // androidx.appcompat.view.menu.AbstractC1068a
    /* renamed from: p */
    public boolean mo4998p(ViewGroup viewGroup, int i11) {
        if (viewGroup.getChildAt(i11) == this.f4192z) {
            return false;
        }
        return super.mo4998p(viewGroup, i11);
    }

    @Override // androidx.appcompat.view.menu.AbstractC1068a
    /* renamed from: r */
    public View mo5000r(C1074g c1074g, View view, ViewGroup viewGroup) {
        int i11;
        View actionView = c1074g.getActionView();
        if (actionView == null || c1074g.m5112j()) {
            actionView = super.mo5000r(c1074g, view, viewGroup);
        }
        if (c1074g.isActionViewExpanded()) {
            i11 = 8;
        } else {
            i11 = 0;
        }
        actionView.setVisibility(i11);
        ActionMenuView actionMenuView = (ActionMenuView) viewGroup;
        ViewGroup.LayoutParams layoutParams = actionView.getLayoutParams();
        if (!actionMenuView.checkLayoutParams(layoutParams)) {
            actionView.setLayoutParams(actionMenuView.generateLayoutParams(layoutParams));
        }
        return actionView;
    }

    @Override // androidx.appcompat.view.menu.AbstractC1068a
    /* renamed from: s */
    public InterfaceC1078k mo5001s(ViewGroup viewGroup) {
        InterfaceC1078k interfaceC1078k = this.f3956x;
        InterfaceC1078k mo5001s = super.mo5001s(viewGroup);
        if (interfaceC1078k != mo5001s) {
            ((ActionMenuView) mo5001s).setPresenter(this);
        }
        return mo5001s;
    }

    @Override // androidx.appcompat.view.menu.AbstractC1068a
    /* renamed from: u */
    public boolean mo5003u(int i11, C1074g c1074g) {
        return c1074g.m5114l();
    }
}
