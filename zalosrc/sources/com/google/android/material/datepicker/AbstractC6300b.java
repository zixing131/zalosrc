package com.google.android.material.datepicker;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import androidx.fragment.app.AbstractDialogInterfaceOnCancelListenerC1728b;
import p357n6.AbstractC23577b;
import p599w6.AbstractC28773b;

/* renamed from: com.google.android.material.datepicker.b */
/* loaded from: classes3.dex */
public abstract class AbstractC6300b extends AbstractDialogInterfaceOnCancelListenerC1728b {

    /* renamed from: y0 */
    static final Object f35268y0 = "CONFIRM_BUTTON_TAG";

    /* renamed from: z0 */
    static final Object f35269z0 = "CANCEL_BUTTON_TAG";

    /* renamed from: A0 */
    static final Object f35267A0 = "TOGGLE_BUTTON_TAG";

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: q1 */
    public static boolean m32275q1(Context context) {
        return m32277s1(context, R.attr.windowFullscreen);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: r1 */
    public static boolean m32276r1(Context context) {
        return m32277s1(context, AbstractC23577b.nestedScrollable);
    }

    /* renamed from: s1 */
    static boolean m32277s1(Context context, int i11) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(AbstractC28773b.m143971c(context, AbstractC23577b.materialCalendarStyle, AbstractC6299a.class.getCanonicalName()), new int[]{i11});
        boolean z11 = obtainStyledAttributes.getBoolean(0, false);
        obtainStyledAttributes.recycle();
        return z11;
    }
}
