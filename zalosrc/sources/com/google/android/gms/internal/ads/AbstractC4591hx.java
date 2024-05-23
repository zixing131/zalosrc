package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.hx */
/* loaded from: classes2.dex */
public abstract class AbstractC4591hx {
    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static List m23058a() {
        ArrayList arrayList = new ArrayList();
        m23060c(arrayList, C4702ky.m24089c("gad:dynamite_module:experiment_id", ""));
        m23060c(arrayList, AbstractC5111vy.f29611a);
        m23060c(arrayList, AbstractC5111vy.f29612b);
        m23060c(arrayList, AbstractC5111vy.f29613c);
        m23060c(arrayList, AbstractC5111vy.f29614d);
        m23060c(arrayList, AbstractC5111vy.f29615e);
        m23060c(arrayList, AbstractC5111vy.f29631u);
        m23060c(arrayList, AbstractC5111vy.f29616f);
        m23060c(arrayList, AbstractC5111vy.f29623m);
        m23060c(arrayList, AbstractC5111vy.f29624n);
        m23060c(arrayList, AbstractC5111vy.f29625o);
        m23060c(arrayList, AbstractC5111vy.f29626p);
        m23060c(arrayList, AbstractC5111vy.f29627q);
        m23060c(arrayList, AbstractC5111vy.f29628r);
        m23060c(arrayList, AbstractC5111vy.f29629s);
        m23060c(arrayList, AbstractC5111vy.f29630t);
        m23060c(arrayList, AbstractC5111vy.f29617g);
        m23060c(arrayList, AbstractC5111vy.f29618h);
        m23060c(arrayList, AbstractC5111vy.f29619i);
        m23060c(arrayList, AbstractC5111vy.f29620j);
        m23060c(arrayList, AbstractC5111vy.f29621k);
        m23060c(arrayList, AbstractC5111vy.f29622l);
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static List m23059b() {
        ArrayList arrayList = new ArrayList();
        m23060c(arrayList, AbstractC4666jz.f23029a);
        return arrayList;
    }

    /* renamed from: c */
    private static void m23060c(List list, C4702ky c4702ky) {
        String str = (String) c4702ky.m24091e();
        if (!TextUtils.isEmpty(str)) {
            list.add(str);
        }
    }
}
