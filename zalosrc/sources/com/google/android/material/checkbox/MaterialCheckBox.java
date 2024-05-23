package com.google.android.material.checkbox;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatCheckBox;
import androidx.core.widget.AbstractC1631c;
import com.google.android.material.internal.AbstractC6355v;
import p013a7.AbstractC0638a;
import p357n6.AbstractC23577b;
import p357n6.AbstractC23586k;
import p357n6.AbstractC23587l;
import p439q6.AbstractC25136a;
import p599w6.AbstractC28774c;

/* loaded from: classes3.dex */
public class MaterialCheckBox extends AppCompatCheckBox {

    /* renamed from: u */
    private static final int f35113u = AbstractC23586k.Widget_MaterialComponents_CompoundButton_CheckBox;

    /* renamed from: v */
    private static final int[][] f35114v = {new int[]{R.attr.state_enabled, R.attr.state_checked}, new int[]{R.attr.state_enabled, -16842912}, new int[]{-16842910, R.attr.state_checked}, new int[]{-16842910, -16842912}};

    /* renamed from: s */
    private ColorStateList f35115s;

    /* renamed from: t */
    private boolean f35116t;

    public MaterialCheckBox(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, AbstractC23577b.checkboxStyle);
    }

    private ColorStateList getMaterialThemeColorsTintList() {
        if (this.f35115s == null) {
            int[][] iArr = f35114v;
            int[] iArr2 = new int[iArr.length];
            int m130294d = AbstractC25136a.m130294d(this, AbstractC23577b.colorControlActivated);
            int m130294d2 = AbstractC25136a.m130294d(this, AbstractC23577b.colorSurface);
            int m130294d3 = AbstractC25136a.m130294d(this, AbstractC23577b.colorOnSurface);
            iArr2[0] = AbstractC25136a.m130297g(m130294d2, m130294d, 1.0f);
            iArr2[1] = AbstractC25136a.m130297g(m130294d2, m130294d3, 0.54f);
            iArr2[2] = AbstractC25136a.m130297g(m130294d2, m130294d3, 0.38f);
            iArr2[3] = AbstractC25136a.m130297g(m130294d2, m130294d3, 0.38f);
            this.f35115s = new ColorStateList(iArr, iArr2);
        }
        return this.f35115s;
    }

    @Override // android.widget.TextView, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f35116t && AbstractC1631c.m8373b(this) == null) {
            setUseMaterialThemeColors(true);
        }
    }

    public void setUseMaterialThemeColors(boolean z11) {
        this.f35116t = z11;
        if (z11) {
            AbstractC1631c.m8374c(this, getMaterialThemeColorsTintList());
        } else {
            AbstractC1631c.m8374c(this, null);
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public MaterialCheckBox(Context context, AttributeSet attributeSet, int i11) {
        super(AbstractC0638a.m909c(context, attributeSet, i11, r4), attributeSet, i11);
        int i12 = f35113u;
        Context context2 = getContext();
        TypedArray m32639h = AbstractC6355v.m32639h(context2, attributeSet, AbstractC23587l.MaterialCheckBox, i11, i12, new int[0]);
        if (m32639h.hasValue(AbstractC23587l.MaterialCheckBox_buttonTint)) {
            AbstractC1631c.m8374c(this, AbstractC28774c.m143973a(context2, m32639h, AbstractC23587l.MaterialCheckBox_buttonTint));
        }
        this.f35116t = m32639h.getBoolean(AbstractC23587l.MaterialCheckBox_useMaterialThemeColors, false);
        m32639h.recycle();
    }
}
