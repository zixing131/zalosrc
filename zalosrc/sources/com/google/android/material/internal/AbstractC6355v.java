package com.google.android.material.internal;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.TypedValue;
import androidx.appcompat.widget.C1211t1;
import p357n6.AbstractC23577b;
import p357n6.AbstractC23587l;

/* renamed from: com.google.android.material.internal.v */
/* loaded from: classes3.dex */
public abstract class AbstractC6355v {

    /* renamed from: a */
    private static final int[] f35600a = {AbstractC23577b.colorPrimary};

    /* renamed from: b */
    private static final int[] f35601b = {AbstractC23577b.colorPrimaryVariant};

    /* renamed from: a */
    public static void m32632a(Context context) {
        m32636e(context, f35600a, "Theme.AppCompat");
    }

    /* renamed from: b */
    private static void m32633b(Context context, AttributeSet attributeSet, int i11, int i12) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC23587l.ThemeEnforcement, i11, i12);
        boolean z11 = obtainStyledAttributes.getBoolean(AbstractC23587l.ThemeEnforcement_enforceMaterialTheme, false);
        obtainStyledAttributes.recycle();
        if (z11) {
            TypedValue typedValue = new TypedValue();
            if (!context.getTheme().resolveAttribute(AbstractC23577b.isMaterialTheme, typedValue, true) || (typedValue.type == 18 && typedValue.data == 0)) {
                m32634c(context);
            }
        }
        m32632a(context);
    }

    /* renamed from: c */
    public static void m32634c(Context context) {
        m32636e(context, f35601b, "Theme.MaterialComponents");
    }

    /* renamed from: d */
    private static void m32635d(Context context, AttributeSet attributeSet, int[] iArr, int i11, int i12, int... iArr2) {
        boolean z11;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC23587l.ThemeEnforcement, i11, i12);
        boolean z12 = false;
        if (!obtainStyledAttributes.getBoolean(AbstractC23587l.ThemeEnforcement_enforceTextAppearance, false)) {
            obtainStyledAttributes.recycle();
            return;
        }
        if (iArr2 != null && iArr2.length != 0) {
            z11 = m32637f(context, attributeSet, iArr, i11, i12, iArr2);
        } else {
            if (obtainStyledAttributes.getResourceId(AbstractC23587l.ThemeEnforcement_android_textAppearance, -1) != -1) {
                z12 = true;
            }
            z11 = z12;
        }
        obtainStyledAttributes.recycle();
        if (z11) {
        } else {
            throw new IllegalArgumentException("This component requires that you specify a valid TextAppearance attribute. Update your app theme to inherit from Theme.MaterialComponents (or a descendant).");
        }
    }

    /* renamed from: e */
    private static void m32636e(Context context, int[] iArr, String str) {
        if (m32638g(context, iArr)) {
            return;
        }
        throw new IllegalArgumentException("The style on this component requires your app theme to be " + str + " (or a descendant).");
    }

    /* renamed from: f */
    private static boolean m32637f(Context context, AttributeSet attributeSet, int[] iArr, int i11, int i12, int... iArr2) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, i11, i12);
        for (int i13 : iArr2) {
            if (obtainStyledAttributes.getResourceId(i13, -1) == -1) {
                obtainStyledAttributes.recycle();
                return false;
            }
        }
        obtainStyledAttributes.recycle();
        return true;
    }

    /* renamed from: g */
    private static boolean m32638g(Context context, int[] iArr) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(iArr);
        for (int i11 = 0; i11 < iArr.length; i11++) {
            if (!obtainStyledAttributes.hasValue(i11)) {
                obtainStyledAttributes.recycle();
                return false;
            }
        }
        obtainStyledAttributes.recycle();
        return true;
    }

    /* renamed from: h */
    public static TypedArray m32639h(Context context, AttributeSet attributeSet, int[] iArr, int i11, int i12, int... iArr2) {
        m32633b(context, attributeSet, i11, i12);
        m32635d(context, attributeSet, iArr, i11, i12, iArr2);
        return context.obtainStyledAttributes(attributeSet, iArr, i11, i12);
    }

    /* renamed from: i */
    public static C1211t1 m32640i(Context context, AttributeSet attributeSet, int[] iArr, int i11, int i12, int... iArr2) {
        m32633b(context, attributeSet, i11, i12);
        m32635d(context, attributeSet, iArr, i11, i12, iArr2);
        return C1211t1.m5716v(context, attributeSet, iArr, i11, i12);
    }
}
