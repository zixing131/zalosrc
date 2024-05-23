package a30;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: a30.e */
/* loaded from: classes5.dex */
public class C0106e extends LinkedHashMap {

    /* renamed from: p */
    private final int f624p;

    public C0106e(int i11) {
        super(((int) Math.ceil(i11 / 0.75f)) + 1, 0.75f, true);
        this.f624p = i11;
    }

    @Override // java.util.LinkedHashMap
    protected boolean removeEldestEntry(Map.Entry entry) {
        if (size() > this.f624p) {
            return true;
        }
        return false;
    }
}
