package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import java.lang.ref.WeakReference;

/* renamed from: androidx.appcompat.widget.s1 */
/* loaded from: classes2.dex */
class C1208s1 extends AbstractC1184k1 {

    /* renamed from: b */
    private final WeakReference f4719b;

    public C1208s1(Context context, Resources resources) {
        super(resources);
        this.f4719b = new WeakReference(context);
    }

    @Override // androidx.appcompat.widget.AbstractC1184k1, android.content.res.Resources
    public Drawable getDrawable(int i11) {
        Drawable drawable = super.getDrawable(i11);
        Context context = (Context) this.f4719b.get();
        if (drawable != null && context != null) {
            C1181j1.m5584h().m5600x(context, i11, drawable);
        }
        return drawable;
    }
}
