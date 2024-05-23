package p012a6;

import java.io.IOException;
import java.util.Iterator;

/* renamed from: a6.ph */
/* loaded from: classes2.dex */
public final class C0447ph {

    /* renamed from: a */
    private final String f1794a = "\n";

    private C0447ph(String str) {
    }

    /* renamed from: a */
    public static C0447ph m840a(String str) {
        return new C0447ph("\n");
    }

    /* renamed from: c */
    static final CharSequence m841c(Object obj) {
        obj.getClass();
        if (obj instanceof CharSequence) {
            return (CharSequence) obj;
        }
        return obj.toString();
    }

    /* renamed from: b */
    public final String m842b(Iterable iterable) {
        Iterator it = iterable.iterator();
        StringBuilder sb2 = new StringBuilder();
        try {
            if (it.hasNext()) {
                sb2.append(m841c(it.next()));
                while (it.hasNext()) {
                    sb2.append((CharSequence) this.f1794a);
                    sb2.append(m841c(it.next()));
                }
            }
            return sb2.toString();
        } catch (IOException e11) {
            throw new AssertionError(e11);
        }
    }
}
