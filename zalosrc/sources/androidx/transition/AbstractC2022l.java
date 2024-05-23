package androidx.transition;

import android.animation.ObjectAnimator;
import android.animation.TypeConverter;
import android.graphics.Path;
import android.util.Property;

/* renamed from: androidx.transition.l */
/* loaded from: classes2.dex */
abstract class AbstractC2022l {
    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static ObjectAnimator m11019a(Object obj, Property property, Path path) {
        return ObjectAnimator.ofObject(obj, (Property<Object, V>) property, (TypeConverter) null, path);
    }
}
