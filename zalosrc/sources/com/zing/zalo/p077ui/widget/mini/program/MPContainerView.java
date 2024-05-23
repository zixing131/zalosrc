package com.zing.zalo.p077ui.widget.mini.program;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.WindowInsets;
import android.widget.RelativeLayout;
import com.zing.zalo.AbstractC16802y;
import com.zing.zalo.p077ui.widget.mini.program.MPContainerView;
import fn0.AbstractC19074t;
import me0.AbstractC23136l9;
import zl0.AbstractC32226c;

/* loaded from: classes6.dex */
public class MPContainerView extends RelativeLayout {

    /* renamed from: p */
    private int f70719p;

    /* renamed from: q */
    private boolean f70720q;

    /* renamed from: r */
    private boolean f70721r;

    /* renamed from: s */
    private View f70722s;

    /* renamed from: t */
    private int f70723t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MPContainerView(Context context) {
        super(context);
        AbstractC19074t.m100208f(context, "context");
        this.f70720q = true;
        this.f70721r = true;
        this.f70723t = (int) getContext().getResources().getDimension(AbstractC16802y.mp_action_bar_padding);
        m76423e(this, false, 1, null);
        setOnApplyWindowInsetsListener(new View.OnApplyWindowInsetsListener() { // from class: hb0.d
            public /* synthetic */ ViewOnApplyWindowInsetsListenerC19960d() {
            }

            @Override // android.view.View.OnApplyWindowInsetsListener
            public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
                WindowInsets m76420b;
                m76420b = MPContainerView.m76420b(MPContainerView.this, view, windowInsets);
                return m76420b;
            }
        });
    }

    /* renamed from: b */
    public static final WindowInsets m76420b(MPContainerView mPContainerView, View view, WindowInsets windowInsets) {
        AbstractC19074t.m100208f(mPContainerView, "this$0");
        AbstractC19074t.m100208f(view, "<anonymous parameter 0>");
        AbstractC19074t.m100208f(windowInsets, "insets");
        m76423e(mPContainerView, false, 1, null);
        return windowInsets;
    }

    /* renamed from: c */
    public static /* synthetic */ void m76421c(MPContainerView mPContainerView, int i11, int i12, Object obj) {
        if (obj == null) {
            if ((i12 & 1) != 0) {
                i11 = 0;
            }
            mPContainerView.setCustomPadding(i11);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setCustomPadding");
    }

    /* renamed from: d */
    private final void m76422d(boolean z11) {
        int i11;
        int i12 = this.f70719p;
        if (this.f70720q) {
            this.f70719p = AbstractC23136l9.m118737p0();
        } else {
            if (this.f70721r) {
                View view = this.f70722s;
                if (view == null) {
                    view = getRootView();
                }
                i11 = AbstractC32226c.m155409h(view);
            } else {
                i11 = 0;
            }
            this.f70719p = i11;
        }
        if (z11 || this.f70719p != i12) {
            int i13 = this.f70723t;
            setPadding(i13, this.f70719p + i13, i13, i13);
        }
    }

    /* renamed from: e */
    static /* synthetic */ void m76423e(MPContainerView mPContainerView, boolean z11, int i11, Object obj) {
        if (obj == null) {
            if ((i11 & 1) != 0) {
                z11 = false;
            }
            mPContainerView.m76422d(z11);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: updateTopInset");
    }

    public final boolean getDeviceHasNotch() {
        return this.f70720q;
    }

    public final int getMTopInsets() {
        return this.f70719p;
    }

    public final void setCustomPadding(int i11) {
        this.f70723t = i11;
        m76422d(true);
    }

    public final void setDeviceHasNotch(boolean z11) {
        this.f70720q = z11;
    }

    public final void setMTopInsets(int i11) {
        this.f70719p = i11;
    }

    public final void setRootView(View view) {
        AbstractC19074t.m100208f(view, "mRootView");
        this.f70722s = view;
        m76423e(this, false, 1, null);
    }

    public void setShowTopInset(boolean z11) {
        this.f70721r = z11;
        m76423e(this, false, 1, null);
        requestLayout();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MPContainerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        AbstractC19074t.m100208f(context, "context");
        AbstractC19074t.m100208f(attributeSet, "attrs");
        this.f70720q = true;
        this.f70721r = true;
        this.f70723t = (int) getContext().getResources().getDimension(AbstractC16802y.mp_action_bar_padding);
        m76423e(this, false, 1, null);
        setOnApplyWindowInsetsListener(new View.OnApplyWindowInsetsListener() { // from class: hb0.d
            public /* synthetic */ ViewOnApplyWindowInsetsListenerC19960d() {
            }

            @Override // android.view.View.OnApplyWindowInsetsListener
            public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
                WindowInsets m76420b;
                m76420b = MPContainerView.m76420b(MPContainerView.this, view, windowInsets);
                return m76420b;
            }
        });
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MPContainerView(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        AbstractC19074t.m100208f(context, "context");
        AbstractC19074t.m100208f(attributeSet, "attrs");
        this.f70720q = true;
        this.f70721r = true;
        this.f70723t = (int) getContext().getResources().getDimension(AbstractC16802y.mp_action_bar_padding);
        m76423e(this, false, 1, null);
        setOnApplyWindowInsetsListener(new View.OnApplyWindowInsetsListener() { // from class: hb0.d
            public /* synthetic */ ViewOnApplyWindowInsetsListenerC19960d() {
            }

            @Override // android.view.View.OnApplyWindowInsetsListener
            public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
                WindowInsets m76420b;
                m76420b = MPContainerView.m76420b(MPContainerView.this, view, windowInsets);
                return m76420b;
            }
        });
    }
}
