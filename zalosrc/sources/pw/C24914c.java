package pw;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;

/* renamed from: pw.c */
/* loaded from: classes4.dex */
public class C24914c implements InterfaceC24912a {
    /* renamed from: c */
    private int m129584c(Context context, int i11, int i12) {
        try {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(i11, new int[]{R.attr.textColor});
            int color = obtainStyledAttributes.getColor(0, i12);
            obtainStyledAttributes.recycle();
            return color;
        } catch (Exception unused) {
            return i12;
        }
    }

    @Override // pw.InterfaceC24912a
    /* renamed from: a */
    public boolean mo129581a() {
        return true;
    }

    @Override // pw.InterfaceC24912a
    /* renamed from: b */
    public int mo129582b(Context context) {
        if (AbstractC24916e.m129586a(mo129585d(context))) {
            return 0;
        }
        return 1;
    }

    /* renamed from: d */
    public int mo129585d(Context context) {
        return m129584c(context, R.style.TextAppearance.Material.Notification.Title, -1);
    }
}
