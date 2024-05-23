package p192h;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: h.b */
/* loaded from: classes2.dex */
public class C19687b {

    /* renamed from: a */
    private final C19690e f97660a;

    /* renamed from: b */
    final a f97661b;

    /* renamed from: c */
    final String f97662c;

    /* renamed from: d */
    Map f97663d;

    /* renamed from: e */
    boolean f97664e;

    /* renamed from: f */
    Map f97665f;

    /* renamed from: g */
    Object f97666g;

    /* renamed from: h */
    boolean f97667h;

    /* renamed from: i */
    boolean f97668i;

    /* renamed from: j */
    Integer f97669j;

    /* renamed from: k */
    Integer f97670k;

    /* renamed from: l */
    Long f97671l;

    /* renamed from: m */
    Boolean f97672m;

    /* renamed from: n */
    boolean f97673n;

    /* renamed from: o */
    boolean f97674o;

    /* renamed from: p */
    int f97675p;

    /* renamed from: q */
    boolean f97676q;

    /* renamed from: h.b$a */
    /* loaded from: classes2.dex */
    public enum a {
        GET,
        POST,
        /* JADX INFO: Fake field, exist only in values array */
        PUT,
        DELETE
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C19687b(C19690e c19690e, a aVar, String str) {
        this.f97660a = c19690e;
        this.f97661b = aVar;
        this.f97662c = str;
        this.f97672m = c19690e.f97693a;
    }

    /* renamed from: a */
    public C19687b m103288a(int i11) {
        this.f97669j = Integer.valueOf(i11);
        return this;
    }

    /* renamed from: b */
    public C19687b m103289b(int i11, boolean z11) {
        if (i11 < 0) {
            i11 = 0;
        }
        if (i11 > 10) {
            i11 = 10;
        }
        if (i11 > 3 && !z11) {
            throw new IllegalArgumentException("retries > 3 only valid with wait");
        }
        this.f97675p = i11;
        this.f97676q = z11;
        return this;
    }

    /* renamed from: c */
    public C19687b m103290c(String str, Object obj) {
        Object obj2;
        if (this.f97663d == null) {
            this.f97663d = new LinkedHashMap();
        }
        if (!this.f97664e || (obj2 = this.f97663d.get(str)) == null) {
            this.f97663d.put(str, obj);
            return this;
        }
        if (obj2 instanceof Collection) {
            ((Collection) obj2).add(obj);
        } else {
            ArrayList arrayList = new ArrayList();
            arrayList.add(obj2);
            arrayList.add(obj);
            this.f97663d.put(str, arrayList);
        }
        return this;
    }

    /* renamed from: d */
    public C19687b m103291d(boolean z11) {
        this.f97672m = Boolean.valueOf(z11);
        return this;
    }

    /* renamed from: e */
    public C19688c m103292e() {
        return this.f97660a.m103313k(this, String.class);
    }

    /* renamed from: f */
    public C19687b m103293f() {
        this.f97673n = true;
        return this;
    }

    /* renamed from: g */
    public C19687b m103294g(int i11) {
        this.f97670k = Integer.valueOf(i11);
        return this;
    }
}
