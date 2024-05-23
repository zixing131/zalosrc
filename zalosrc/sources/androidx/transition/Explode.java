package androidx.transition;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import p286k2.AbstractC21441e;
import p286k2.C21439c;

/* loaded from: classes2.dex */
public class Explode extends Visibility {

    /* renamed from: c0 */
    private static final TimeInterpolator f8450c0 = new DecelerateInterpolator();

    /* renamed from: d0 */
    private static final TimeInterpolator f8451d0 = new AccelerateInterpolator();

    /* renamed from: b0 */
    private int[] f8452b0;

    public Explode(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f8452b0 = new int[2];
        mo10923m0(new C21439c());
    }

    /* renamed from: A0 */
    private static float m10869A0(View view, int i11, int i12) {
        return m10872z0(Math.max(i11, view.getWidth() - i11), Math.max(i12, view.getHeight() - i12));
    }

    /* renamed from: B0 */
    private void m10870B0(View view, Rect rect, int[] iArr) {
        int centerY;
        int i11;
        view.getLocationOnScreen(this.f8452b0);
        int[] iArr2 = this.f8452b0;
        int i12 = iArr2[0];
        int i13 = iArr2[1];
        Rect m10932u = m10932u();
        if (m10932u == null) {
            i11 = (view.getWidth() / 2) + i12 + Math.round(view.getTranslationX());
            centerY = (view.getHeight() / 2) + i13 + Math.round(view.getTranslationY());
        } else {
            int centerX = m10932u.centerX();
            centerY = m10932u.centerY();
            i11 = centerX;
        }
        float centerX2 = rect.centerX() - i11;
        float centerY2 = rect.centerY() - centerY;
        if (centerX2 == 0.0f && centerY2 == 0.0f) {
            centerX2 = ((float) (Math.random() * 2.0d)) - 1.0f;
            centerY2 = ((float) (Math.random() * 2.0d)) - 1.0f;
        }
        float m10872z0 = m10872z0(centerX2, centerY2);
        float m10869A0 = m10869A0(view, i11 - i12, centerY - i13);
        iArr[0] = Math.round((centerX2 / m10872z0) * m10869A0);
        iArr[1] = Math.round(m10869A0 * (centerY2 / m10872z0));
    }

    /* renamed from: r0 */
    private void m10871r0(C2030t c2030t) {
        View view = c2030t.f8616b;
        view.getLocationOnScreen(this.f8452b0);
        int[] iArr = this.f8452b0;
        int i11 = iArr[0];
        int i12 = iArr[1];
        c2030t.f8615a.put("android:explode:screenBounds", new Rect(i11, i12, view.getWidth() + i11, view.getHeight() + i12));
    }

    /* renamed from: z0 */
    private static float m10872z0(float f11, float f12) {
        return (float) Math.sqrt((f11 * f11) + (f12 * f12));
    }

    @Override // androidx.transition.Visibility, androidx.transition.Transition
    /* renamed from: i */
    public void mo10818i(C2030t c2030t) {
        super.mo10818i(c2030t);
        m10871r0(c2030t);
    }

    @Override // androidx.transition.Visibility, androidx.transition.Transition
    /* renamed from: l */
    public void mo10819l(C2030t c2030t) {
        super.mo10819l(c2030t);
        m10871r0(c2030t);
    }

    @Override // androidx.transition.Visibility
    /* renamed from: u0 */
    public Animator mo10873u0(ViewGroup viewGroup, View view, C2030t c2030t, C2030t c2030t2) {
        if (c2030t2 == null) {
            return null;
        }
        Rect rect = (Rect) c2030t2.f8615a.get("android:explode:screenBounds");
        float translationX = view.getTranslationX();
        float translationY = view.getTranslationY();
        m10870B0(viewGroup, rect, this.f8452b0);
        int[] iArr = this.f8452b0;
        return AbstractC2032v.m11033a(view, c2030t2, rect.left, rect.top, translationX + iArr[0], translationY + iArr[1], translationX, translationY, f8450c0, this);
    }

    @Override // androidx.transition.Visibility
    /* renamed from: w0 */
    public Animator mo10874w0(ViewGroup viewGroup, View view, C2030t c2030t, C2030t c2030t2) {
        float f11;
        float f12;
        if (c2030t == null) {
            return null;
        }
        Rect rect = (Rect) c2030t.f8615a.get("android:explode:screenBounds");
        int i11 = rect.left;
        int i12 = rect.top;
        float translationX = view.getTranslationX();
        float translationY = view.getTranslationY();
        int[] iArr = (int[]) c2030t.f8616b.getTag(AbstractC21441e.transition_position);
        if (iArr != null) {
            f11 = (r7 - rect.left) + translationX;
            f12 = (r0 - rect.top) + translationY;
            rect.offsetTo(iArr[0], iArr[1]);
        } else {
            f11 = translationX;
            f12 = translationY;
        }
        m10870B0(viewGroup, rect, this.f8452b0);
        int[] iArr2 = this.f8452b0;
        return AbstractC2032v.m11033a(view, c2030t, i11, i12, translationX, translationY, f11 + iArr2[0], f12 + iArr2[1], f8451d0, this);
    }
}
