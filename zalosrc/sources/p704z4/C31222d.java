package p704z4;

import android.app.Activity;
import androidx.fragment.app.FragmentActivity;
import com.google.android.gms.common.internal.AbstractC4205o;

/* renamed from: z4.d */
/* loaded from: classes2.dex */
public class C31222d {

    /* renamed from: a */
    private final Object f144245a;

    public C31222d(Activity activity) {
        AbstractC4205o.m19723l(activity, "Activity must not be null");
        this.f144245a = activity;
    }

    /* renamed from: a */
    public final Activity m152102a() {
        return (Activity) this.f144245a;
    }

    /* renamed from: b */
    public final FragmentActivity m152103b() {
        return (FragmentActivity) this.f144245a;
    }

    /* renamed from: c */
    public final boolean m152104c() {
        return this.f144245a instanceof Activity;
    }

    /* renamed from: d */
    public final boolean m152105d() {
        return this.f144245a instanceof FragmentActivity;
    }
}
