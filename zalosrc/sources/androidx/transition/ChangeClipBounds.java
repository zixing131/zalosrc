package androidx.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.view.AbstractC1579n0;

/* loaded from: classes2.dex */
public class ChangeClipBounds extends Transition {

    /* renamed from: Z */
    private static final String[] f8412Z = {"android:clipBounds:clip"};

    /* renamed from: androidx.transition.ChangeClipBounds$a */
    /* loaded from: classes2.dex */
    class C1969a extends AnimatorListenerAdapter {

        /* renamed from: p */
        final /* synthetic */ View f8413p;

        C1969a(View view) {
            this.f8413p = view;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            AbstractC1579n0.m7815H0(this.f8413p, null);
        }
    }

    public ChangeClipBounds(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* renamed from: r0 */
    private void m10841r0(C2030t c2030t) {
        View view = c2030t.f8616b;
        if (view.getVisibility() == 8) {
            return;
        }
        Rect m7911y = AbstractC1579n0.m7911y(view);
        c2030t.f8615a.put("android:clipBounds:clip", m7911y);
        if (m7911y == null) {
            c2030t.f8615a.put("android:clipBounds:bounds", new Rect(0, 0, view.getWidth(), view.getHeight()));
        }
    }

    @Override // androidx.transition.Transition
    /* renamed from: I */
    public String[] mo10817I() {
        return f8412Z;
    }

    @Override // androidx.transition.Transition
    /* renamed from: i */
    public void mo10818i(C2030t c2030t) {
        m10841r0(c2030t);
    }

    @Override // androidx.transition.Transition
    /* renamed from: l */
    public void mo10819l(C2030t c2030t) {
        m10841r0(c2030t);
    }

    @Override // androidx.transition.Transition
    /* renamed from: p */
    public Animator mo10820p(ViewGroup viewGroup, C2030t c2030t, C2030t c2030t2) {
        boolean z11;
        ObjectAnimator objectAnimator = null;
        if (c2030t != null && c2030t2 != null && c2030t.f8615a.containsKey("android:clipBounds:clip") && c2030t2.f8615a.containsKey("android:clipBounds:clip")) {
            Rect rect = (Rect) c2030t.f8615a.get("android:clipBounds:clip");
            Rect rect2 = (Rect) c2030t2.f8615a.get("android:clipBounds:clip");
            if (rect2 == null) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (rect == null && rect2 == null) {
                return null;
            }
            if (rect == null) {
                rect = (Rect) c2030t.f8615a.get("android:clipBounds:bounds");
            } else if (rect2 == null) {
                rect2 = (Rect) c2030t2.f8615a.get("android:clipBounds:bounds");
            }
            if (rect.equals(rect2)) {
                return null;
            }
            AbstractC1579n0.m7815H0(c2030t2.f8616b, rect);
            objectAnimator = ObjectAnimator.ofObject(c2030t2.f8616b, (Property<View, V>) AbstractC2004b0.f8545c, new C2024n(new Rect()), rect, rect2);
            if (z11) {
                objectAnimator.addListener(new C1969a(c2030t2.f8616b));
            }
        }
        return objectAnimator;
    }
}
