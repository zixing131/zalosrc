package p382o6;

import android.graphics.drawable.Drawable;
import android.util.Property;
import java.util.WeakHashMap;

/* renamed from: o6.e */
/* loaded from: classes3.dex */
public class C24045e extends Property {

    /* renamed from: b */
    public static final Property f116365b = new C24045e();

    /* renamed from: a */
    private final WeakHashMap f116366a;

    private C24045e() {
        super(Integer.class, "drawableAlphaCompat");
        this.f116366a = new WeakHashMap();
    }

    @Override // android.util.Property
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public Integer get(Drawable drawable) {
        return Integer.valueOf(drawable.getAlpha());
    }

    @Override // android.util.Property
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void set(Drawable drawable, Integer num) {
        drawable.setAlpha(num.intValue());
    }
}
