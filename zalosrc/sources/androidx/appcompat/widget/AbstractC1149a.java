package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.view.AbstractC1579n0;
import androidx.core.view.C1611v0;
import androidx.core.view.InterfaceC1614w0;
import p175g0.AbstractC19178a;
import p175g0.AbstractC19187j;

/* renamed from: androidx.appcompat.widget.a */
/* loaded from: classes2.dex */
public abstract class AbstractC1149a extends ViewGroup {

    /* renamed from: p */
    protected final a f4573p;

    /* renamed from: q */
    protected final Context f4574q;

    /* renamed from: r */
    protected ActionMenuView f4575r;

    /* renamed from: s */
    protected ActionMenuPresenter f4576s;

    /* renamed from: t */
    protected int f4577t;

    /* renamed from: u */
    protected C1611v0 f4578u;

    /* renamed from: v */
    private boolean f4579v;

    /* renamed from: w */
    private boolean f4580w;

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: androidx.appcompat.widget.a$a */
    /* loaded from: classes2.dex */
    public class a implements InterfaceC1614w0 {

        /* renamed from: a */
        private boolean f4581a = false;

        /* renamed from: b */
        int f4582b;

        protected a() {
        }

        @Override // androidx.core.view.InterfaceC1614w0
        /* renamed from: a */
        public void mo5454a(View view) {
            this.f4581a = true;
        }

        @Override // androidx.core.view.InterfaceC1614w0
        /* renamed from: b */
        public void mo4848b(View view) {
            if (this.f4581a) {
                return;
            }
            AbstractC1149a abstractC1149a = AbstractC1149a.this;
            abstractC1149a.f4578u = null;
            AbstractC1149a.super.setVisibility(this.f4582b);
        }

        @Override // androidx.core.view.InterfaceC1614w0
        /* renamed from: c */
        public void mo4849c(View view) {
            AbstractC1149a.super.setVisibility(0);
            this.f4581a = false;
        }

        /* renamed from: d */
        public a m5455d(C1611v0 c1611v0, int i11) {
            AbstractC1149a.this.f4578u = c1611v0;
            this.f4582b = i11;
            return this;
        }
    }

    public AbstractC1149a(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        this.f4573p = new a();
        TypedValue typedValue = new TypedValue();
        if (context.getTheme().resolveAttribute(AbstractC19178a.actionBarPopupTheme, typedValue, true) && typedValue.resourceId != 0) {
            this.f4574q = new ContextThemeWrapper(context, typedValue.resourceId);
        } else {
            this.f4574q = context;
        }
    }

    /* renamed from: d */
    public static int m5451d(int i11, int i12, boolean z11) {
        return z11 ? i11 - i12 : i11 + i12;
    }

    /* renamed from: c */
    public int m5452c(View view, int i11, int i12, int i13) {
        view.measure(View.MeasureSpec.makeMeasureSpec(i11, Integer.MIN_VALUE), i12);
        return Math.max(0, (i11 - view.getMeasuredWidth()) - i13);
    }

    /* renamed from: e */
    public int m5453e(View view, int i11, int i12, int i13, boolean z11) {
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        int i14 = i12 + ((i13 - measuredHeight) / 2);
        if (z11) {
            view.layout(i11 - measuredWidth, i14, i11, measuredHeight + i14);
        } else {
            view.layout(i11, i14, i11 + measuredWidth, measuredHeight + i14);
        }
        if (z11) {
            return -measuredWidth;
        }
        return measuredWidth;
    }

    /* renamed from: f */
    public C1611v0 mo5153f(int i11, long j11) {
        C1611v0 c1611v0 = this.f4578u;
        if (c1611v0 != null) {
            c1611v0.m8216c();
        }
        if (i11 == 0) {
            if (getVisibility() != 0) {
                setAlpha(0.0f);
            }
            C1611v0 m8215b = AbstractC1579n0.m7864e(this).m8215b(1.0f);
            m8215b.m8220h(j11);
            m8215b.m8222j(this.f4573p.m5455d(m8215b, i11));
            return m8215b;
        }
        C1611v0 m8215b2 = AbstractC1579n0.m7864e(this).m8215b(0.0f);
        m8215b2.m8220h(j11);
        m8215b2.m8222j(this.f4573p.m5455d(m8215b2, i11));
        return m8215b2;
    }

    public int getAnimatedVisibility() {
        if (this.f4578u != null) {
            return this.f4573p.f4582b;
        }
        return getVisibility();
    }

    public int getContentHeight() {
        return this.f4577t;
    }

    @Override // android.view.View
    protected void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(null, AbstractC19187j.ActionBar, AbstractC19178a.actionBarStyle, 0);
        setContentHeight(obtainStyledAttributes.getLayoutDimension(AbstractC19187j.ActionBar_height, 0));
        obtainStyledAttributes.recycle();
        ActionMenuPresenter actionMenuPresenter = this.f4576s;
        if (actionMenuPresenter != null) {
            actionMenuPresenter.m5201J(configuration);
        }
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.f4580w = false;
        }
        if (!this.f4580w) {
            boolean onHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !onHoverEvent) {
                this.f4580w = true;
            }
        }
        if (actionMasked == 10 || actionMasked == 3) {
            this.f4580w = false;
        }
        return true;
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f4579v = false;
        }
        if (!this.f4579v) {
            boolean onTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !onTouchEvent) {
                this.f4579v = true;
            }
        }
        if (actionMasked == 1 || actionMasked == 3) {
            this.f4579v = false;
        }
        return true;
    }

    public abstract void setContentHeight(int i11);

    @Override // android.view.View
    public void setVisibility(int i11) {
        if (i11 != getVisibility()) {
            C1611v0 c1611v0 = this.f4578u;
            if (c1611v0 != null) {
                c1611v0.m8216c();
            }
            super.setVisibility(i11);
        }
    }
}
