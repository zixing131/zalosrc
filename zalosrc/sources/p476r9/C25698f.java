package p476r9;

import android.os.Bundle;
import p319l9.C22152a;

/* renamed from: r9.f */
/* loaded from: classes3.dex */
public final class C25698f {

    /* renamed from: b */
    private static final C22152a f122708b = C22152a.m115524e();

    /* renamed from: a */
    private final Bundle f122709a;

    public C25698f() {
        this(new Bundle());
    }

    /* renamed from: d */
    private C25699g m132604d(String str) {
        if (!m132605a(str)) {
            return C25699g.m132609a();
        }
        try {
            return C25699g.m132610b((Integer) this.f122709a.get(str));
        } catch (ClassCastException e11) {
            f122708b.m115526b("Metadata key %s contains type other than int: %s", str, e11.getMessage());
            return C25699g.m132609a();
        }
    }

    /* renamed from: a */
    public boolean m132605a(String str) {
        if (str != null && this.f122709a.containsKey(str)) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public C25699g m132606b(String str) {
        if (!m132605a(str)) {
            return C25699g.m132609a();
        }
        try {
            return C25699g.m132610b((Boolean) this.f122709a.get(str));
        } catch (ClassCastException e11) {
            f122708b.m115526b("Metadata key %s contains type other than boolean: %s", str, e11.getMessage());
            return C25699g.m132609a();
        }
    }

    /* renamed from: c */
    public C25699g m132607c(String str) {
        if (!m132605a(str)) {
            return C25699g.m132609a();
        }
        try {
            return C25699g.m132610b((Float) this.f122709a.get(str));
        } catch (ClassCastException e11) {
            f122708b.m115526b("Metadata key %s contains type other than float: %s", str, e11.getMessage());
            return C25699g.m132609a();
        }
    }

    /* renamed from: e */
    public C25699g m132608e(String str) {
        if (m132604d(str).m132613d()) {
            return C25699g.m132611e(Long.valueOf(((Integer) r3.m132612c()).intValue()));
        }
        return C25699g.m132609a();
    }

    public C25698f(Bundle bundle) {
        this.f122709a = (Bundle) bundle.clone();
    }
}
