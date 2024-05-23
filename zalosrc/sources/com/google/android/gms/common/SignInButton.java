package com.google.android.gms.common;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.C4212q0;
import com.google.android.gms.common.internal.zaaa;
import com.google.android.gms.dynamic.RemoteCreator;
import p567v4.AbstractC27524d;

/* loaded from: classes2.dex */
public final class SignInButton extends FrameLayout implements View.OnClickListener {

    /* renamed from: p */
    private int f16150p;

    /* renamed from: q */
    private int f16151q;

    /* renamed from: r */
    private View f16152r;

    /* renamed from: s */
    private View.OnClickListener f16153s;

    public SignInButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* renamed from: b */
    private final void m19193b(Context context) {
        View view = this.f16152r;
        if (view != null) {
            removeView(view);
        }
        try {
            this.f16152r = C4212q0.m19743a(context, this.f16150p, this.f16151q);
        } catch (RemoteCreator.RemoteCreatorException unused) {
            int i11 = this.f16150p;
            int i12 = this.f16151q;
            zaaa zaaaVar = new zaaa(context, null);
            zaaaVar.m19822a(context.getResources(), i11, i12);
            this.f16152r = zaaaVar;
        }
        addView(this.f16152r);
        this.f16152r.setEnabled(isEnabled());
        this.f16152r.setOnClickListener(this);
    }

    /* renamed from: a */
    public void m19194a(int i11, int i12) {
        this.f16150p = i11;
        this.f16151q = i12;
        m19193b(getContext());
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        View.OnClickListener onClickListener = this.f16153s;
        if (onClickListener != null && view == this.f16152r) {
            onClickListener.onClick(this);
        }
    }

    public void setColorScheme(int i11) {
        m19194a(this.f16150p, i11);
    }

    @Override // android.view.View
    public void setEnabled(boolean z11) {
        super.setEnabled(z11);
        this.f16152r.setEnabled(z11);
    }

    @Override // android.view.View
    public void setOnClickListener(View.OnClickListener onClickListener) {
        this.f16153s = onClickListener;
        View view = this.f16152r;
        if (view != null) {
            view.setOnClickListener(this);
        }
    }

    @Deprecated
    public void setScopes(Scope[] scopeArr) {
        m19194a(this.f16150p, this.f16151q);
    }

    public void setSize(int i11) {
        m19194a(i11, this.f16151q);
    }

    public SignInButton(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        this.f16153s = null;
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, AbstractC27524d.SignInButton, 0, 0);
        try {
            this.f16150p = obtainStyledAttributes.getInt(AbstractC27524d.SignInButton_buttonSize, 0);
            this.f16151q = obtainStyledAttributes.getInt(AbstractC27524d.SignInButton_colorScheme, 2);
            obtainStyledAttributes.recycle();
            m19194a(this.f16150p, this.f16151q);
        } catch (Throwable th2) {
            obtainStyledAttributes.recycle();
            throw th2;
        }
    }
}
