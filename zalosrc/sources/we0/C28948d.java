package we0;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.regex.Pattern;

/* renamed from: we0.d */
/* loaded from: classes4.dex */
public class C28948d {

    /* renamed from: a */
    private final a f134002a;

    /* renamed from: we0.d$a */
    /* loaded from: classes4.dex */
    private static class a {

        /* renamed from: a */
        private final LinkedHashMap f134003a;

        /* renamed from: b */
        private final int f134004b;

        /* renamed from: we0.d$a$a, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        class C33022a extends LinkedHashMap {
            C33022a(int i11, float f11, boolean z11) {
                super(i11, f11, z11);
            }

            @Override // java.util.LinkedHashMap
            protected boolean removeEldestEntry(Map.Entry entry) {
                if (size() > a.this.f134004b) {
                    return true;
                }
                return false;
            }
        }

        public a(int i11) {
            this.f134004b = i11;
            this.f134003a = new C33022a(((i11 * 4) / 3) + 1, 0.75f, true);
        }

        /* renamed from: b */
        public synchronized Object m144595b(Object obj) {
            return this.f134003a.get(obj);
        }

        /* renamed from: c */
        public synchronized void m144596c(Object obj, Object obj2) {
            this.f134003a.put(obj, obj2);
        }
    }

    public C28948d(int i11) {
        this.f134002a = new a(i11);
    }

    /* renamed from: a */
    public Pattern m144593a(String str) {
        Pattern pattern = (Pattern) this.f134002a.m144595b(str);
        if (pattern == null) {
            Pattern compile = Pattern.compile(str);
            this.f134002a.m144596c(str, compile);
            return compile;
        }
        return pattern;
    }
}
