package p382o6;

import android.util.Property;
import android.view.ViewGroup;
import p357n6.AbstractC23581f;

/* renamed from: o6.d */
/* loaded from: classes3.dex */
public class C24044d extends Property {

    /* renamed from: a */
    public static final Property f116364a = new C24044d("childrenAlpha");

    private C24044d(String str) {
        super(Float.class, str);
    }

    @Override // android.util.Property
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public Float get(ViewGroup viewGroup) {
        Float f11 = (Float) viewGroup.getTag(AbstractC23581f.mtrl_internal_children_alpha_tag);
        if (f11 != null) {
            return f11;
        }
        return Float.valueOf(1.0f);
    }

    @Override // android.util.Property
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void set(ViewGroup viewGroup, Float f11) {
        float floatValue = f11.floatValue();
        viewGroup.setTag(AbstractC23581f.mtrl_internal_children_alpha_tag, Float.valueOf(floatValue));
        int childCount = viewGroup.getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            viewGroup.getChildAt(i11).setAlpha(floatValue);
        }
    }
}
