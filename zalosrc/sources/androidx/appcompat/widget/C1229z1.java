package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import java.lang.ref.WeakReference;

/* renamed from: androidx.appcompat.widget.z1 */
/* loaded from: classes.dex */
public class C1229z1 extends Resources {

    /* renamed from: b */
    private static boolean f4787b = false;

    /* renamed from: a */
    private final WeakReference f4788a;

    public C1229z1(Context context, Resources resources) {
        super(resources.getAssets(), resources.getDisplayMetrics(), resources.getConfiguration());
        this.f4788a = new WeakReference(context);
    }

    /* renamed from: a */
    public static boolean m5793a() {
        return f4787b;
    }

    /* renamed from: b */
    public static boolean m5794b() {
        m5793a();
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public final Drawable m5795c(int i11) {
        return super.getDrawable(i11);
    }

    @Override // android.content.res.Resources
    public Drawable getDrawable(int i11) {
        Context context = (Context) this.f4788a.get();
        if (context != null) {
            return C1181j1.m5584h().m5598t(context, this, i11);
        }
        return super.getDrawable(i11);
    }
}
