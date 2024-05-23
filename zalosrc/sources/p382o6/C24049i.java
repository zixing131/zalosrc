package p382o6;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;

/* renamed from: o6.i */
/* loaded from: classes3.dex */
public class C24049i {

    /* renamed from: a */
    private long f116373a;

    /* renamed from: b */
    private long f116374b;

    /* renamed from: c */
    private TimeInterpolator f116375c;

    /* renamed from: d */
    private int f116376d;

    /* renamed from: e */
    private int f116377e;

    public C24049i(long j11, long j12) {
        this.f116375c = null;
        this.f116376d = 0;
        this.f116377e = 1;
        this.f116373a = j11;
        this.f116374b = j12;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static C24049i m125935b(ValueAnimator valueAnimator) {
        C24049i c24049i = new C24049i(valueAnimator.getStartDelay(), valueAnimator.getDuration(), m125936f(valueAnimator));
        c24049i.f116376d = valueAnimator.getRepeatCount();
        c24049i.f116377e = valueAnimator.getRepeatMode();
        return c24049i;
    }

    /* renamed from: f */
    private static TimeInterpolator m125936f(ValueAnimator valueAnimator) {
        TimeInterpolator interpolator = valueAnimator.getInterpolator();
        if (!(interpolator instanceof AccelerateDecelerateInterpolator) && interpolator != null) {
            if (interpolator instanceof AccelerateInterpolator) {
                return AbstractC24041a.f116360c;
            }
            if (interpolator instanceof DecelerateInterpolator) {
                return AbstractC24041a.f116361d;
            }
            return interpolator;
        }
        return AbstractC24041a.f116359b;
    }

    /* renamed from: a */
    public void m125937a(Animator animator) {
        animator.setStartDelay(m125938c());
        animator.setDuration(m125939d());
        animator.setInterpolator(m125940e());
        if (animator instanceof ValueAnimator) {
            ValueAnimator valueAnimator = (ValueAnimator) animator;
            valueAnimator.setRepeatCount(m125941g());
            valueAnimator.setRepeatMode(m125942h());
        }
    }

    /* renamed from: c */
    public long m125938c() {
        return this.f116373a;
    }

    /* renamed from: d */
    public long m125939d() {
        return this.f116374b;
    }

    /* renamed from: e */
    public TimeInterpolator m125940e() {
        TimeInterpolator timeInterpolator = this.f116375c;
        if (timeInterpolator == null) {
            return AbstractC24041a.f116359b;
        }
        return timeInterpolator;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C24049i)) {
            return false;
        }
        C24049i c24049i = (C24049i) obj;
        if (m125938c() != c24049i.m125938c() || m125939d() != c24049i.m125939d() || m125941g() != c24049i.m125941g() || m125942h() != c24049i.m125942h()) {
            return false;
        }
        return m125940e().getClass().equals(c24049i.m125940e().getClass());
    }

    /* renamed from: g */
    public int m125941g() {
        return this.f116376d;
    }

    /* renamed from: h */
    public int m125942h() {
        return this.f116377e;
    }

    public int hashCode() {
        return (((((((((int) (m125938c() ^ (m125938c() >>> 32))) * 31) + ((int) (m125939d() ^ (m125939d() >>> 32)))) * 31) + m125940e().getClass().hashCode()) * 31) + m125941g()) * 31) + m125942h();
    }

    public String toString() {
        return '\n' + getClass().getName() + '{' + Integer.toHexString(System.identityHashCode(this)) + " delay: " + m125938c() + " duration: " + m125939d() + " interpolator: " + m125940e().getClass() + " repeatCount: " + m125941g() + " repeatMode: " + m125942h() + "}\n";
    }

    public C24049i(long j11, long j12, TimeInterpolator timeInterpolator) {
        this.f116376d = 0;
        this.f116377e = 1;
        this.f116373a = j11;
        this.f116374b = j12;
        this.f116375c = timeInterpolator;
    }
}
