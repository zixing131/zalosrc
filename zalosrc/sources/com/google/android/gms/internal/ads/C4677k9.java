package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import javax.net.ssl.SSLSocketFactory;

/* renamed from: com.google.android.gms.internal.ads.k9 */
/* loaded from: classes2.dex */
public final class C4677k9 extends AbstractC5122w8 {
    public C4677k9(InterfaceC4640j9 interfaceC4640j9, SSLSocketFactory sSLSocketFactory) {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static List m23857a(Map map) {
        ArrayList arrayList = new ArrayList(map.size());
        for (Map.Entry entry : map.entrySet()) {
            if (entry.getKey() != null) {
                Iterator it = ((List) entry.getValue()).iterator();
                while (it.hasNext()) {
                    arrayList.add(new C4529g8((String) entry.getKey(), (String) it.next()));
                }
            }
        }
        return arrayList;
    }
}
