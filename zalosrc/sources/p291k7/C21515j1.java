package p291k7;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.List;

/* renamed from: k7.j1 */
/* loaded from: classes3.dex */
public final class C21515j1 {

    /* renamed from: a */
    private final List f104550a = new ArrayList();

    /* renamed from: a */
    public final List m111162a() {
        ArrayList arrayList = new ArrayList();
        for (AbstractC21521l1 abstractC21521l1 : this.f104550a) {
            Bundle bundle = new Bundle();
            bundle.putInt("event_type", abstractC21521l1.mo111170a());
            bundle.putLong("event_timestamp", abstractC21521l1.mo111171b());
            arrayList.add(bundle);
        }
        return arrayList;
    }

    /* renamed from: b */
    public final void m111163b(int i11) {
        this.f104550a.add(AbstractC21521l1.m111175c(i11, System.currentTimeMillis()));
    }
}
