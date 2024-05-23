package mq;

import bo.C2966e1;
import bo.C2977g2;
import fn0.AbstractC19074t;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: mq.c */
/* loaded from: classes4.dex */
public abstract class AbstractC23421c {

    /* renamed from: a */
    private final List f113828a;

    /* renamed from: b */
    private final C2966e1 f113829b;

    public AbstractC23421c() {
        List synchronizedList = Collections.synchronizedList(new ArrayList());
        AbstractC19074t.m100207e(synchronizedList, "synchronizedList(...)");
        this.f113828a = synchronizedList;
        this.f113829b = new C2966e1(new C2977g2(0));
    }

    /* renamed from: a */
    public void mo123078a(int i11) {
        if (i11 == 70) {
            this.f113828a.add(this.f113829b);
        }
    }

    /* renamed from: b */
    public final void m123092b() {
        this.f113828a.clear();
    }

    /* renamed from: c */
    public final List m123093c() {
        return this.f113828a;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: d */
    public final List m123094d() {
        return this.f113828a;
    }

    /* renamed from: e */
    public final C2977g2 m123095e() {
        C2977g2 c2977g2 = this.f113829b.f11710h;
        AbstractC19074t.m100207e(c2977g2, "multiStateViewData");
        return c2977g2;
    }

    /* renamed from: f */
    public final void m123096f(C2977g2 c2977g2) {
        AbstractC19074t.m100208f(c2977g2, "multiStateData");
        this.f113829b.f11710h = c2977g2;
    }
}
