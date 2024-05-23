package com.google.android.material.switchmaterial;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.appcompat.widget.SwitchCompat;
import com.google.android.material.internal.AbstractC6355v;
import com.google.android.material.internal.AbstractC6359z;
import p013a7.AbstractC0638a;
import p357n6.AbstractC23577b;
import p357n6.AbstractC23579d;
import p357n6.AbstractC23586k;
import p357n6.AbstractC23587l;
import p439q6.AbstractC25136a;
import p505s6.C26159a;

/* loaded from: classes3.dex */
public class SwitchMaterial extends SwitchCompat {

    /* renamed from: l0 */
    private static final int f35878l0 = AbstractC23586k.Widget_MaterialComponents_CompoundButton_Switch;

    /* renamed from: m0 */
    private static final int[][] f35879m0 = {new int[]{R.attr.state_enabled, R.attr.state_checked}, new int[]{R.attr.state_enabled, -16842912}, new int[]{-16842910, R.attr.state_checked}, new int[]{-16842910, -16842912}};

    /* renamed from: h0 */
    private final C26159a f35880h0;

    /* renamed from: i0 */
    private ColorStateList f35881i0;

    /* renamed from: j0 */
    private ColorStateList f35882j0;

    /* renamed from: k0 */
    private boolean f35883k0;

    public SwitchMaterial(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, AbstractC23577b.switchStyle);
    }

    private ColorStateList getMaterialThemeColorsThumbTintList() {
        if (this.f35881i0 == null) {
            int m130294d = AbstractC25136a.m130294d(this, AbstractC23577b.colorSurface);
            int m130294d2 = AbstractC25136a.m130294d(this, AbstractC23577b.colorControlActivated);
            float dimension = getResources().getDimension(AbstractC23579d.mtrl_switch_thumb_elevation);
            if (this.f35880h0.m134515e()) {
                dimension += AbstractC6359z.m32652g(this);
            }
            int m134513c = this.f35880h0.m134513c(m130294d, dimension);
            int[][] iArr = f35879m0;
            int[] iArr2 = new int[iArr.length];
            iArr2[0] = AbstractC25136a.m130297g(m130294d, m130294d2, 1.0f);
            iArr2[1] = m134513c;
            iArr2[2] = AbstractC25136a.m130297g(m130294d, m130294d2, 0.38f);
            iArr2[3] = m134513c;
            this.f35881i0 = new ColorStateList(iArr, iArr2);
        }
        return this.f35881i0;
    }

    private ColorStateList getMaterialThemeColorsTrackTintList() {
        if (this.f35882j0 == null) {
            int[][] iArr = f35879m0;
            int[] iArr2 = new int[iArr.length];
            int m130294d = AbstractC25136a.m130294d(this, AbstractC23577b.colorSurface);
            int m130294d2 = AbstractC25136a.m130294d(this, AbstractC23577b.colorControlActivated);
            int m130294d3 = AbstractC25136a.m130294d(this, AbstractC23577b.colorOnSurface);
            iArr2[0] = AbstractC25136a.m130297g(m130294d, m130294d2, 0.54f);
            iArr2[1] = AbstractC25136a.m130297g(m130294d, m130294d3, 0.32f);
            iArr2[2] = AbstractC25136a.m130297g(m130294d, m130294d2, 0.12f);
            iArr2[3] = AbstractC25136a.m130297g(m130294d, m130294d3, 0.12f);
            this.f35882j0 = new ColorStateList(iArr, iArr2);
        }
        return this.f35882j0;
    }

    @Override // android.widget.TextView, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f35883k0 && getThumbTintList() == null) {
            setThumbTintList(getMaterialThemeColorsThumbTintList());
        }
        if (this.f35883k0 && getTrackTintList() == null) {
            setTrackTintList(getMaterialThemeColorsTrackTintList());
        }
    }

    public void setUseMaterialThemeColors(boolean z11) {
        this.f35883k0 = z11;
        if (z11) {
            setThumbTintList(getMaterialThemeColorsThumbTintList());
            setTrackTintList(getMaterialThemeColorsTrackTintList());
        } else {
            setThumbTintList(null);
            setTrackTintList(null);
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public SwitchMaterial(Context context, AttributeSet attributeSet, int i11) {
        super(AbstractC0638a.m909c(context, attributeSet, i11, r4), attributeSet, i11);
        int i12 = f35878l0;
        Context context2 = getContext();
        this.f35880h0 = new C26159a(context2);
        TypedArray m32639h = AbstractC6355v.m32639h(context2, attributeSet, AbstractC23587l.SwitchMaterial, i11, i12, new int[0]);
        this.f35883k0 = m32639h.getBoolean(AbstractC23587l.SwitchMaterial_useMaterialThemeColors, false);
        m32639h.recycle();
    }
}
