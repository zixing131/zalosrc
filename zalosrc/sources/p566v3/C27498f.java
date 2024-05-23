package p566v3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p566v3.C27495c;
import p596w3.C28704b;
import p631x3.AbstractC29301b;
import p631x3.AbstractC29302c;
import p631x3.AbstractC29304e;

/* renamed from: v3.f */
/* loaded from: classes2.dex */
public class C27498f {

    /* renamed from: a */
    private final int f129342a;

    /* renamed from: b */
    private final int f129343b;

    /* renamed from: c */
    private final List f129344c;

    /* renamed from: d */
    private final C27495c f129345d;

    /* renamed from: v3.f$a */
    /* loaded from: classes2.dex */
    public static class a {

        /* renamed from: a */
        public int f129346a;

        /* renamed from: b */
        public int f129347b;

        /* renamed from: c */
        public List f129348c;

        /* renamed from: a */
        public C27498f m140610a() {
            return new C27498f(this.f129346a, this.f129347b, this.f129348c);
        }
    }

    public C27498f(int i11, int i12, List list) {
        this.f129342a = ((Integer) AbstractC29302c.m146400b(Integer.valueOf(i11), i11 > 0, "group_id")).intValue();
        this.f129343b = i12;
        AbstractC29304e.m146403b(list, C27495c.f129316f);
        this.f129345d = AbstractC29301b.m146398a(list, C27495c.b.ANCHOR_POINT);
        this.f129344c = (List) AbstractC29302c.m146400b(AbstractC29304e.m146402a(list), list.size() > 0, "animations");
    }

    /* renamed from: a */
    public C28704b m140606a() {
        C27495c c27495c = this.f129345d;
        if (c27495c == null) {
            return null;
        }
        return (C28704b) c27495c.m140597c();
    }

    /* renamed from: b */
    public List m140607b() {
        return this.f129344c;
    }

    /* renamed from: c */
    public int m140608c() {
        return this.f129342a;
    }

    /* renamed from: d */
    public int m140609d() {
        return this.f129343b;
    }

    public C27498f(C27498f c27498f) {
        this.f129342a = c27498f.f129342a;
        this.f129343b = c27498f.f129343b;
        if (c27498f.f129345d != null) {
            this.f129345d = new C27495c(c27498f.f129345d);
        } else {
            this.f129345d = null;
        }
        if (c27498f.f129344c == null) {
            this.f129344c = null;
            return;
        }
        this.f129344c = new ArrayList();
        Iterator it = c27498f.f129344c.iterator();
        while (it.hasNext()) {
            this.f129344c.add(new C27495c((C27495c) it.next()));
        }
    }
}
