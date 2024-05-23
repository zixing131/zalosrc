package p630x2;

import android.os.Build;
import androidx.work.AbstractC2253u;
import fn0.AbstractC19074t;
import java.util.Iterator;
import java.util.List;
import p535u2.AbstractC26979z;
import p535u2.C26962i;
import p535u2.C26976w;
import p535u2.InterfaceC26954c0;
import p535u2.InterfaceC26964k;
import p535u2.InterfaceC26969p;
import qm0.AbstractC25332a0;

/* renamed from: x2.e */
/* loaded from: classes2.dex */
public abstract class AbstractC29298e {

    /* renamed from: a */
    private static final String f135737a;

    static {
        String m11897i = AbstractC2253u.m11897i("DiagnosticsWrkr");
        AbstractC19074t.m100207e(m11897i, "tagWithPrefix(\"DiagnosticsWrkr\")");
        f135737a = m11897i;
    }

    /* renamed from: c */
    private static final String m146394c(C26976w c26976w, String str, Integer num, String str2) {
        return '\n' + c26976w.f127497a + "\t " + c26976w.f127499c + "\t " + num + "\t " + c26976w.f127498b.name() + "\t " + str + "\t " + str2 + '\t';
    }

    /* renamed from: d */
    public static final String m146395d(InterfaceC26969p interfaceC26969p, InterfaceC26954c0 interfaceC26954c0, InterfaceC26964k interfaceC26964k, List list) {
        String str;
        Integer num;
        String m131214n0;
        String m131214n02;
        StringBuilder sb2 = new StringBuilder();
        if (Build.VERSION.SDK_INT >= 23) {
            str = "Job Id";
        } else {
            str = "Alarm Id";
        }
        sb2.append("\n Id \t Class Name\t " + str + "\t State\t Unique Name\t Tags\t");
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C26976w c26976w = (C26976w) it.next();
            C26962i mo138942a = interfaceC26964k.mo138942a(AbstractC26979z.m139035a(c26976w));
            if (mo138942a != null) {
                num = Integer.valueOf(mo138942a.f127470c);
            } else {
                num = null;
            }
            m131214n0 = AbstractC25332a0.m131214n0(interfaceC26969p.mo138958a(c26976w.f127497a), ",", null, null, 0, null, null, 62, null);
            m131214n02 = AbstractC25332a0.m131214n0(interfaceC26954c0.mo138913a(c26976w.f127497a), ",", null, null, 0, null, null, 62, null);
            sb2.append(m146394c(c26976w, m131214n0, num, m131214n02));
        }
        String sb3 = sb2.toString();
        AbstractC19074t.m100207e(sb3, "StringBuilder().apply(builderAction).toString()");
        return sb3;
    }
}
