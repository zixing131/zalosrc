package com.google.android.material.appbar;

import android.R;
import android.animation.AnimatorInflater;
import android.animation.ObjectAnimator;
import android.animation.StateListAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewOutlineProvider;
import com.google.android.material.internal.AbstractC6355v;
import p357n6.AbstractC23577b;
import p357n6.AbstractC23582g;

/* renamed from: com.google.android.material.appbar.g */
/* loaded from: classes3.dex */
abstract class AbstractC6233g {

    /* renamed from: a */
    private static final int[] f34836a = {R.attr.stateListAnimator};

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static void m31653a(View view) {
        view.setOutlineProvider(ViewOutlineProvider.BOUNDS);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static void m31654b(View view, float f11) {
        int integer = view.getResources().getInteger(AbstractC23582g.app_bar_elevation_anim_duration);
        StateListAnimator stateListAnimator = new StateListAnimator();
        long j11 = integer;
        stateListAnimator.addState(new int[]{R.attr.enabled, AbstractC23577b.state_liftable, -AbstractC23577b.state_lifted}, ObjectAnimator.ofFloat(view, "elevation", 0.0f).setDuration(j11));
        stateListAnimator.addState(new int[]{R.attr.enabled}, ObjectAnimator.ofFloat(view, "elevation", f11).setDuration(j11));
        stateListAnimator.addState(new int[0], ObjectAnimator.ofFloat(view, "elevation", 0.0f).setDuration(0L));
        view.setStateListAnimator(stateListAnimator);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public static void m31655c(View view, AttributeSet attributeSet, int i11, int i12) {
        Context context = view.getContext();
        TypedArray m32639h = AbstractC6355v.m32639h(context, attributeSet, f34836a, i11, i12, new int[0]);
        try {
            if (m32639h.hasValue(0)) {
                view.setStateListAnimator(AnimatorInflater.loadStateListAnimator(context, m32639h.getResourceId(0, 0)));
            }
        } finally {
            m32639h.recycle();
        }
    }
}
