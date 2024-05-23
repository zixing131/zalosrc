package androidx.transition;

import android.view.ViewGroup;
import p286k2.AbstractC21441e;
import p664y.AbstractC30228a;

/* renamed from: androidx.transition.o */
/* loaded from: classes2.dex */
public abstract class AbstractC2025o {
    /* renamed from: a */
    public static AbstractC2025o m11022a(ViewGroup viewGroup) {
        AbstractC30228a.m149044a(viewGroup.getTag(AbstractC21441e.transition_current_scene));
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static void m11023b(ViewGroup viewGroup, AbstractC2025o abstractC2025o) {
        viewGroup.setTag(AbstractC21441e.transition_current_scene, abstractC2025o);
    }
}
