package pw;

import android.R;
import android.content.Context;
import android.os.Build;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;

/* renamed from: pw.d */
/* loaded from: classes4.dex */
public class C24915d extends C24914c {
    @Override // pw.C24914c, pw.InterfaceC24912a
    /* renamed from: a */
    public boolean mo129581a() {
        return Build.MANUFACTURER.toLowerCase().contains("huawei");
    }

    @Override // pw.C24914c
    /* renamed from: d */
    public int mo129585d(Context context) {
        try {
            int identifier = context.getResources().getIdentifier("android:layout/notification_template_material_base", null, null);
            if (identifier == 0) {
                return super.mo129585d(context);
            }
            TextView textView = (TextView) LayoutInflater.from(context).inflate(identifier, (ViewGroup) null).findViewById(R.id.title);
            if (textView == null) {
                return super.mo129585d(context);
            }
            return textView.getTextColors().getDefaultColor();
        } catch (Exception unused) {
            return super.mo129585d(context);
        }
    }
}
