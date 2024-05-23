package androidx.core.app;

import android.os.Bundle;
import androidx.core.app.AbstractC1364q;
import androidx.core.graphics.drawable.IconCompat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

/* renamed from: androidx.core.app.c1 */
/* loaded from: classes2.dex */
abstract class AbstractC1329c1 {

    /* renamed from: a */
    private static final Object f5894a = new Object();

    /* renamed from: b */
    private static final Object f5895b = new Object();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static Bundle m6666a(AbstractC1364q.b bVar) {
        int i11;
        Bundle bundle;
        Bundle bundle2 = new Bundle();
        IconCompat m6802d = bVar.m6802d();
        if (m6802d != null) {
            i11 = m6802d.m7159k();
        } else {
            i11 = 0;
        }
        bundle2.putInt("icon", i11);
        bundle2.putCharSequence("title", bVar.m6806h());
        bundle2.putParcelable("actionIntent", bVar.m6799a());
        if (bVar.m6801c() != null) {
            bundle = new Bundle(bVar.m6801c());
        } else {
            bundle = new Bundle();
        }
        bundle.putBoolean("android.support.allowGeneratedReplies", bVar.m6800b());
        bundle2.putBundle("extras", bundle);
        bundle2.putParcelableArray("remoteInputs", m6668c(bVar.m6803e()));
        bundle2.putBoolean("showsUserInterface", bVar.m6805g());
        bundle2.putInt("semanticAction", bVar.m6804f());
        return bundle2;
    }

    /* renamed from: b */
    private static Bundle m6667b(C1347i1 c1347i1) {
        Bundle bundle = new Bundle();
        bundle.putString("resultKey", c1347i1.m6758i());
        bundle.putCharSequence("label", c1347i1.m6757h());
        bundle.putCharSequenceArray("choices", c1347i1.m6754e());
        bundle.putBoolean("allowFreeFormInput", c1347i1.m6752c());
        bundle.putBundle("extras", c1347i1.m6756g());
        Set m6753d = c1347i1.m6753d();
        if (m6753d != null && !m6753d.isEmpty()) {
            ArrayList<String> arrayList = new ArrayList<>(m6753d.size());
            Iterator it = m6753d.iterator();
            while (it.hasNext()) {
                arrayList.add((String) it.next());
            }
            bundle.putStringArrayList("allowedDataTypes", arrayList);
        }
        return bundle;
    }

    /* renamed from: c */
    private static Bundle[] m6668c(C1347i1[] c1347i1Arr) {
        if (c1347i1Arr == null) {
            return null;
        }
        Bundle[] bundleArr = new Bundle[c1347i1Arr.length];
        for (int i11 = 0; i11 < c1347i1Arr.length; i11++) {
            bundleArr[i11] = m6667b(c1347i1Arr[i11]);
        }
        return bundleArr;
    }
}
