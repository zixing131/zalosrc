package s20;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import en0.InterfaceC18505l;
import fn0.AbstractC19074t;

/* renamed from: s20.b */
/* loaded from: classes5.dex */
public abstract class AbstractC26100b {
    /* renamed from: a */
    public static final int m134295a(TypedArray typedArray, int i11, int i12) {
        AbstractC19074t.m100208f(typedArray, "<this>");
        return typedArray.getDimensionPixelSize(i11, i12);
    }

    /* renamed from: b */
    public static /* synthetic */ int m134296b(TypedArray typedArray, int i11, int i12, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            i12 = 0;
        }
        return m134295a(typedArray, i11, i12);
    }

    /* renamed from: c */
    public static final void m134297c(AttributeSet attributeSet, Context context, int[] iArr, InterfaceC18505l interfaceC18505l) {
        AbstractC19074t.m100208f(context, "context");
        AbstractC19074t.m100208f(iArr, "attrs");
        AbstractC19074t.m100208f(interfaceC18505l, "action");
        if (attributeSet == null) {
            return;
        }
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr);
        AbstractC19074t.m100205c(obtainStyledAttributes);
        interfaceC18505l.mo205i9(obtainStyledAttributes);
        obtainStyledAttributes.recycle();
    }
}
