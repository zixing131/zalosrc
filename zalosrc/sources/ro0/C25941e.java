package ro0;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: ro0.e */
/* loaded from: classes7.dex */
public class C25941e extends LinkedHashMap {

    /* renamed from: p */
    private final int f123697p;

    public C25941e(int i11) {
        this.f123697p = i11;
    }

    @Override // java.util.LinkedHashMap
    protected boolean removeEldestEntry(Map.Entry entry) {
        if (size() > this.f123697p) {
            return true;
        }
        return false;
    }
}
