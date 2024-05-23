package com.google.android.material.badge;

import android.content.Context;
import android.graphics.Rect;
import android.util.SparseArray;
import android.view.View;
import android.widget.FrameLayout;
import com.google.android.material.badge.BadgeDrawable;
import com.google.android.material.internal.ParcelableSparseArray;

/* renamed from: com.google.android.material.badge.a */
/* loaded from: classes3.dex */
public abstract class AbstractC6236a {

    /* renamed from: a */
    public static final boolean f34872a = false;

    /* renamed from: a */
    public static void m31716a(BadgeDrawable badgeDrawable, View view, FrameLayout frameLayout) {
        m31720e(badgeDrawable, view, frameLayout);
        if (badgeDrawable.m31675i() != null) {
            badgeDrawable.m31675i().setForeground(badgeDrawable);
        } else {
            if (!f34872a) {
                view.getOverlay().add(badgeDrawable);
                return;
            }
            throw new IllegalArgumentException("Trying to reference null customBadgeParent");
        }
    }

    /* renamed from: b */
    public static SparseArray m31717b(Context context, ParcelableSparseArray parcelableSparseArray) {
        SparseArray sparseArray = new SparseArray(parcelableSparseArray.size());
        for (int i11 = 0; i11 < parcelableSparseArray.size(); i11++) {
            int keyAt = parcelableSparseArray.keyAt(i11);
            BadgeDrawable.SavedState savedState = (BadgeDrawable.SavedState) parcelableSparseArray.valueAt(i11);
            if (savedState != null) {
                sparseArray.put(keyAt, BadgeDrawable.m31664e(context, savedState));
            } else {
                throw new IllegalArgumentException("BadgeDrawable's savedState cannot be null");
            }
        }
        return sparseArray;
    }

    /* renamed from: c */
    public static ParcelableSparseArray m31718c(SparseArray sparseArray) {
        ParcelableSparseArray parcelableSparseArray = new ParcelableSparseArray();
        for (int i11 = 0; i11 < sparseArray.size(); i11++) {
            int keyAt = sparseArray.keyAt(i11);
            BadgeDrawable badgeDrawable = (BadgeDrawable) sparseArray.valueAt(i11);
            if (badgeDrawable != null) {
                parcelableSparseArray.put(keyAt, badgeDrawable.m31679m());
            } else {
                throw new IllegalArgumentException("badgeDrawable cannot be null");
            }
        }
        return parcelableSparseArray;
    }

    /* renamed from: d */
    public static void m31719d(BadgeDrawable badgeDrawable, View view) {
        if (badgeDrawable == null) {
            return;
        }
        if (!f34872a && badgeDrawable.m31675i() == null) {
            view.getOverlay().remove(badgeDrawable);
        } else {
            badgeDrawable.m31675i().setForeground(null);
        }
    }

    /* renamed from: e */
    public static void m31720e(BadgeDrawable badgeDrawable, View view, FrameLayout frameLayout) {
        Rect rect = new Rect();
        view.getDrawingRect(rect);
        badgeDrawable.setBounds(rect);
        badgeDrawable.m31673F(view, frameLayout);
    }

    /* renamed from: f */
    public static void m31721f(Rect rect, float f11, float f12, float f13, float f14) {
        rect.set((int) (f11 - f13), (int) (f12 - f14), (int) (f11 + f13), (int) (f12 + f14));
    }
}
