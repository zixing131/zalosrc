package sn0;

import fn0.AbstractC19074t;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import kotlinx.serialization.descriptors.SerialDescriptor;
import qm0.AbstractC25368s;

/* renamed from: sn0.a */
/* loaded from: classes7.dex */
public final class C26334a {

    /* renamed from: a */
    private final String f125025a;

    /* renamed from: b */
    private List f125026b;

    /* renamed from: c */
    private final List f125027c;

    /* renamed from: d */
    private final Set f125028d;

    /* renamed from: e */
    private final List f125029e;

    /* renamed from: f */
    private final List f125030f;

    /* renamed from: g */
    private final List f125031g;

    public C26334a(String str) {
        List m131502j;
        AbstractC19074t.m100208f(str, "serialName");
        this.f125025a = str;
        m131502j = AbstractC25368s.m131502j();
        this.f125026b = m131502j;
        this.f125027c = new ArrayList();
        this.f125028d = new HashSet();
        this.f125029e = new ArrayList();
        this.f125030f = new ArrayList();
        this.f125031g = new ArrayList();
    }

    /* renamed from: b */
    public static /* synthetic */ void m135524b(C26334a c26334a, String str, SerialDescriptor serialDescriptor, List list, boolean z11, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            list = AbstractC25368s.m131502j();
        }
        if ((i11 & 8) != 0) {
            z11 = false;
        }
        c26334a.m135525a(str, serialDescriptor, list, z11);
    }

    /* renamed from: a */
    public final void m135525a(String str, SerialDescriptor serialDescriptor, List list, boolean z11) {
        AbstractC19074t.m100208f(str, "elementName");
        AbstractC19074t.m100208f(serialDescriptor, "descriptor");
        AbstractC19074t.m100208f(list, "annotations");
        if (this.f125028d.add(str)) {
            this.f125027c.add(str);
            this.f125029e.add(serialDescriptor);
            this.f125030f.add(list);
            this.f125031g.add(Boolean.valueOf(z11));
            return;
        }
        throw new IllegalArgumentException(("Element with name '" + str + "' is already registered in " + this.f125025a).toString());
    }

    /* renamed from: c */
    public final List m135526c() {
        return this.f125026b;
    }

    /* renamed from: d */
    public final List m135527d() {
        return this.f125030f;
    }

    /* renamed from: e */
    public final List m135528e() {
        return this.f125029e;
    }

    /* renamed from: f */
    public final List m135529f() {
        return this.f125027c;
    }

    /* renamed from: g */
    public final List m135530g() {
        return this.f125031g;
    }

    /* renamed from: h */
    public final void m135531h(List list) {
        AbstractC19074t.m100208f(list, "<set-?>");
        this.f125026b = list;
    }
}
