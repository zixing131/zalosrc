package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import androidx.appcompat.view.menu.C1072e;
import androidx.appcompat.view.menu.InterfaceC1078k;
import androidx.appcompat.widget.AbstractC1220w1;
import androidx.appcompat.widget.AbstractViewOnTouchListenerC1155b1;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.AppCompatTextView;
import p175g0.AbstractC19187j;
import p336m0.InterfaceC22701e;

/* loaded from: classes2.dex */
public class ActionMenuItemView extends AppCompatTextView implements InterfaceC1078k.a, View.OnClickListener, ActionMenuView.InterfaceC1093a {

    /* renamed from: A */
    private boolean f3916A;

    /* renamed from: B */
    private int f3917B;

    /* renamed from: C */
    private int f3918C;

    /* renamed from: D */
    private int f3919D;

    /* renamed from: t */
    C1074g f3920t;

    /* renamed from: u */
    private CharSequence f3921u;

    /* renamed from: v */
    private Drawable f3922v;

    /* renamed from: w */
    C1072e.b f3923w;

    /* renamed from: x */
    private AbstractViewOnTouchListenerC1155b1 f3924x;

    /* renamed from: y */
    AbstractC1067b f3925y;

    /* renamed from: z */
    private boolean f3926z;

    /* renamed from: androidx.appcompat.view.menu.ActionMenuItemView$a */
    /* loaded from: classes2.dex */
    private class C1066a extends AbstractViewOnTouchListenerC1155b1 {
        public C1066a() {
            super(ActionMenuItemView.this);
        }

        @Override // androidx.appcompat.widget.AbstractViewOnTouchListenerC1155b1
        /* renamed from: b */
        public InterfaceC22701e mo4976b() {
            AbstractC1067b abstractC1067b = ActionMenuItemView.this.f3925y;
            if (abstractC1067b != null) {
                return abstractC1067b.mo4978a();
            }
            return null;
        }

        @Override // androidx.appcompat.widget.AbstractViewOnTouchListenerC1155b1
        /* renamed from: c */
        protected boolean mo4977c() {
            InterfaceC22701e mo4976b;
            ActionMenuItemView actionMenuItemView = ActionMenuItemView.this;
            C1072e.b bVar = actionMenuItemView.f3923w;
            if (bVar == null || !bVar.mo4979c(actionMenuItemView.f3920t) || (mo4976b = mo4976b()) == null || !mo4976b.mo5012b()) {
                return false;
            }
            return true;
        }
    }

    /* renamed from: androidx.appcompat.view.menu.ActionMenuItemView$b */
    /* loaded from: classes2.dex */
    public static abstract class AbstractC1067b {
        /* renamed from: a */
        public abstract InterfaceC22701e mo4978a();
    }

    public ActionMenuItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* renamed from: h */
    private boolean m4969h() {
        Configuration configuration = getContext().getResources().getConfiguration();
        int i11 = configuration.screenWidthDp;
        int i12 = configuration.screenHeightDp;
        if (i11 < 480 && ((i11 < 640 || i12 < 480) && configuration.orientation != 2)) {
            return false;
        }
        return true;
    }

    /* renamed from: i */
    private void m4970i() {
        CharSequence charSequence;
        CharSequence title;
        boolean z11 = true;
        boolean z12 = !TextUtils.isEmpty(this.f3921u);
        if (this.f3922v != null && (!this.f3920t.m5104B() || (!this.f3926z && !this.f3916A))) {
            z11 = false;
        }
        boolean z13 = z12 & z11;
        CharSequence charSequence2 = null;
        if (z13) {
            charSequence = this.f3921u;
        } else {
            charSequence = null;
        }
        setText(charSequence);
        CharSequence contentDescription = this.f3920t.getContentDescription();
        if (TextUtils.isEmpty(contentDescription)) {
            if (z13) {
                title = null;
            } else {
                title = this.f3920t.getTitle();
            }
            setContentDescription(title);
        } else {
            setContentDescription(contentDescription);
        }
        CharSequence tooltipText = this.f3920t.getTooltipText();
        if (TextUtils.isEmpty(tooltipText)) {
            if (!z13) {
                charSequence2 = this.f3920t.getTitle();
            }
            AbstractC1220w1.m5757a(this, charSequence2);
            return;
        }
        AbstractC1220w1.m5757a(this, tooltipText);
    }

    @Override // androidx.appcompat.view.menu.InterfaceC1078k.a
    /* renamed from: b */
    public void mo4971b(C1074g c1074g, int i11) {
        int i12;
        this.f3920t = c1074g;
        setIcon(c1074g.getIcon());
        setTitle(c1074g.m5111i(this));
        setId(c1074g.getItemId());
        if (c1074g.isVisible()) {
            i12 = 0;
        } else {
            i12 = 8;
        }
        setVisibility(i12);
        setEnabled(c1074g.isEnabled());
        if (c1074g.hasSubMenu() && this.f3924x == null) {
            this.f3924x = new C1066a();
        }
    }

    @Override // androidx.appcompat.widget.ActionMenuView.InterfaceC1093a
    /* renamed from: c */
    public boolean mo4972c() {
        return m4975f();
    }

    @Override // androidx.appcompat.widget.ActionMenuView.InterfaceC1093a
    /* renamed from: d */
    public boolean mo4973d() {
        if (m4975f() && this.f3920t.getIcon() == null) {
            return true;
        }
        return false;
    }

    @Override // androidx.appcompat.view.menu.InterfaceC1078k.a
    /* renamed from: e */
    public boolean mo4974e() {
        return true;
    }

    /* renamed from: f */
    public boolean m4975f() {
        return !TextUtils.isEmpty(getText());
    }

    @Override // androidx.appcompat.view.menu.InterfaceC1078k.a
    public C1074g getItemData() {
        return this.f3920t;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        C1072e.b bVar = this.f3923w;
        if (bVar != null) {
            bVar.mo4979c(this.f3920t);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.f3926z = m4969h();
        m4970i();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.appcompat.widget.AppCompatTextView, android.widget.TextView, android.view.View
    public void onMeasure(int i11, int i12) {
        int i13;
        int i14;
        boolean m4975f = m4975f();
        if (m4975f && (i14 = this.f3918C) >= 0) {
            super.setPadding(i14, getPaddingTop(), getPaddingRight(), getPaddingBottom());
        }
        super.onMeasure(i11, i12);
        int mode = View.MeasureSpec.getMode(i11);
        int size = View.MeasureSpec.getSize(i11);
        int measuredWidth = getMeasuredWidth();
        if (mode == Integer.MIN_VALUE) {
            i13 = Math.min(size, this.f3917B);
        } else {
            i13 = this.f3917B;
        }
        if (mode != 1073741824 && this.f3917B > 0 && measuredWidth < i13) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(i13, 1073741824), i12);
        }
        if (!m4975f && this.f3922v != null) {
            super.setPadding((getMeasuredWidth() - this.f3922v.getBounds().width()) / 2, getPaddingTop(), getPaddingRight(), getPaddingBottom());
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        super.onRestoreInstanceState(null);
    }

    @Override // android.widget.TextView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        AbstractViewOnTouchListenerC1155b1 abstractViewOnTouchListenerC1155b1;
        if (this.f3920t.hasSubMenu() && (abstractViewOnTouchListenerC1155b1 = this.f3924x) != null && abstractViewOnTouchListenerC1155b1.onTouch(this, motionEvent)) {
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setCheckable(boolean z11) {
    }

    public void setChecked(boolean z11) {
    }

    public void setExpandedFormat(boolean z11) {
        if (this.f3916A != z11) {
            this.f3916A = z11;
            C1074g c1074g = this.f3920t;
            if (c1074g != null) {
                c1074g.m5107c();
            }
        }
    }

    public void setIcon(Drawable drawable) {
        this.f3922v = drawable;
        if (drawable != null) {
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = drawable.getIntrinsicHeight();
            int i11 = this.f3919D;
            if (intrinsicWidth > i11) {
                intrinsicHeight = (int) (intrinsicHeight * (i11 / intrinsicWidth));
                intrinsicWidth = i11;
            }
            if (intrinsicHeight > i11) {
                intrinsicWidth = (int) (intrinsicWidth * (i11 / intrinsicHeight));
            } else {
                i11 = intrinsicHeight;
            }
            drawable.setBounds(0, 0, intrinsicWidth, i11);
        }
        setCompoundDrawables(drawable, null, null, null);
        m4970i();
    }

    public void setItemInvoker(C1072e.b bVar) {
        this.f3923w = bVar;
    }

    @Override // android.widget.TextView, android.view.View
    public void setPadding(int i11, int i12, int i13, int i14) {
        this.f3918C = i11;
        super.setPadding(i11, i12, i13, i14);
    }

    public void setPopupCallback(AbstractC1067b abstractC1067b) {
        this.f3925y = abstractC1067b;
    }

    public void setTitle(CharSequence charSequence) {
        this.f3921u = charSequence;
        m4970i();
    }

    public ActionMenuItemView(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        Resources resources = context.getResources();
        this.f3926z = m4969h();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC19187j.ActionMenuItemView, i11, 0);
        this.f3917B = obtainStyledAttributes.getDimensionPixelSize(AbstractC19187j.ActionMenuItemView_android_minWidth, 0);
        obtainStyledAttributes.recycle();
        this.f3919D = (int) ((resources.getDisplayMetrics().density * 32.0f) + 0.5f);
        setOnClickListener(this);
        this.f3918C = -1;
        setSaveEnabled(false);
    }
}
