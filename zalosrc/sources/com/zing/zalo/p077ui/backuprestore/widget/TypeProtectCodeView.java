package com.zing.zalo.p077ui.backuprestore.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.appcompat.widget.ZAppCompatImageView;
import bi0.AbstractC2807a;
import com.zing.zalo.AbstractC8923h0;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import p649xl.C29734be;
import ui0.C27280g;

/* loaded from: classes5.dex */
public final class TypeProtectCodeView extends LinearLayoutCompat {

    /* renamed from: E */
    private final AttributeSet f56164E;

    /* renamed from: F */
    private final int f56165F;

    /* renamed from: G */
    private final C29734be f56166G;

    /* renamed from: H */
    private int f56167H;

    /* renamed from: I */
    private int f56168I;

    /* renamed from: J */
    private int f56169J;

    /* renamed from: K */
    private int f56170K;

    /* renamed from: L */
    private CharSequence f56171L;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TypeProtectCodeView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        AbstractC19074t.m100208f(context, "context");
    }

    /* renamed from: D */
    private final void m58445D() {
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(this.f56164E, AbstractC8923h0.TypeProtectCodeView, this.f56165F, 0);
        AbstractC19074t.m100207e(obtainStyledAttributes, "obtainStyledAttributes(...)");
        setDrawableLeadingId(obtainStyledAttributes.getResourceId(AbstractC8923h0.TypeProtectCodeView_drawableLeading, 0));
        this.f56167H = obtainStyledAttributes.getResourceId(AbstractC8923h0.TypeProtectCodeView_tintLeadingColor, 0);
        setDrawableTrailingId(obtainStyledAttributes.getResourceId(AbstractC8923h0.TypeProtectCodeView_drawableTrailing, 0));
        this.f56168I = obtainStyledAttributes.getResourceId(AbstractC8923h0.TypeProtectCodeView_tintTrailingColor, 0);
        setTitle(obtainStyledAttributes.getText(AbstractC8923h0.TypeProtectCodeView_title));
        obtainStyledAttributes.recycle();
    }

    /* renamed from: E */
    private final void m58446E() {
        Drawable m139660c;
        Drawable m139660c2;
        C29734be c29734be = this.f56166G;
        ZAppCompatImageView zAppCompatImageView = c29734be.f137356q;
        if (this.f56167H == 0) {
            Context context = zAppCompatImageView.getContext();
            AbstractC19074t.m100207e(context, "getContext(...)");
            m139660c = C27280g.m139660c(context, this.f56169J, AbstractC2807a.icon_primary);
        } else {
            Context context2 = zAppCompatImageView.getContext();
            AbstractC19074t.m100207e(context2, "getContext(...)");
            m139660c = C27280g.m139660c(context2, this.f56169J, this.f56167H);
        }
        zAppCompatImageView.setImageDrawable(m139660c);
        ZAppCompatImageView zAppCompatImageView2 = c29734be.f137357r;
        if (this.f56168I == 0) {
            Context context3 = zAppCompatImageView2.getContext();
            AbstractC19074t.m100207e(context3, "getContext(...)");
            m139660c2 = C27280g.m139660c(context3, this.f56170K, AbstractC2807a.list_item_trailing_chevron);
        } else {
            Context context4 = zAppCompatImageView2.getContext();
            AbstractC19074t.m100207e(context4, "getContext(...)");
            m139660c2 = C27280g.m139660c(context4, this.f56170K, this.f56168I);
        }
        zAppCompatImageView2.setImageDrawable(m139660c2);
    }

    private final void setDrawableLeadingId(int i11) {
        int i12;
        ZAppCompatImageView zAppCompatImageView = this.f56166G.f137356q;
        if (i11 == 0) {
            i12 = 8;
        } else {
            i12 = 0;
        }
        zAppCompatImageView.setVisibility(i12);
        this.f56169J = i11;
    }

    private final void setDrawableTrailingId(int i11) {
        int i12;
        ZAppCompatImageView zAppCompatImageView = this.f56166G.f137357r;
        if (i11 == 0) {
            i12 = 8;
        } else {
            i12 = 0;
        }
        zAppCompatImageView.setVisibility(i12);
        this.f56170K = i11;
    }

    private final void setTitle(CharSequence charSequence) {
        this.f56166G.f137358s.setText(String.valueOf(charSequence));
        this.f56171L = charSequence;
    }

    public final AttributeSet getAttrs() {
        return this.f56164E;
    }

    public final int getDefStyleAttr() {
        return this.f56165F;
    }

    public /* synthetic */ TypeProtectCodeView(Context context, AttributeSet attributeSet, int i11, int i12, AbstractC19060k abstractC19060k) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TypeProtectCodeView(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        AbstractC19074t.m100208f(context, "context");
        this.f56164E = attributeSet;
        this.f56165F = i11;
        C29734be m147786c = C29734be.m147786c(LayoutInflater.from(context), this, true);
        AbstractC19074t.m100207e(m147786c, "inflate(...)");
        this.f56166G = m147786c;
        m58445D();
        m58446E();
    }
}
