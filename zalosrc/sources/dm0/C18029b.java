package dm0;

import android.graphics.Point;
import android.graphics.Rect;
import bm0.AbstractC2848b;
import bm0.AbstractC2849c;
import em0.AbstractC18490a;
import em0.AbstractC18491b;
import fn0.AbstractC19074t;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import p342m6.AbstractC22888j;
import p385oa.C24141a;
import pm0.C24848g0;
import qa.AbstractC25203b;
import qa.C25202a;
import qa.InterfaceC25204c;
import qm0.AbstractC25370t;
import qm0.AbstractC25378x;
import sa.C26199a;

/* renamed from: dm0.b */
/* loaded from: classes7.dex */
public final class C18029b extends AbstractC2849c {

    /* renamed from: p */
    private final C26199a.a f91295p;

    /* renamed from: q */
    private final Object f91296q;

    /* renamed from: r */
    private InterfaceC25204c f91297r;

    public C18029b() {
        C26199a.a m134766b = new C26199a.a().m134766b(AbstractC2848b.m13733a());
        AbstractC19074t.m100207e(m134766b, "Builder()\n        .setExecutor(directExecutor)");
        this.f91295p = m134766b;
        this.f91296q = new Object();
    }

    /* renamed from: h */
    private final InterfaceC25204c m95865h() {
        InterfaceC25204c interfaceC25204c;
        synchronized (this.f91296q) {
            try {
                if (this.f91297r == null) {
                    this.f91297r = AbstractC25203b.m130456a(this.f91295p.m134765a());
                }
                interfaceC25204c = this.f91297r;
                AbstractC19074t.m100205c(interfaceC25204c);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return interfaceC25204c;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        synchronized (this.f91296q) {
            try {
                InterfaceC25204c interfaceC25204c = this.f91297r;
                if (interfaceC25204c != null) {
                    interfaceC25204c.close();
                }
                this.f91297r = null;
                C24848g0 c24848g0 = C24848g0.f119245a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // bm0.AbstractC2849c
    /* renamed from: i */
    public List mo13738f(C24141a c24141a) {
        int m131511r;
        float[] fArr;
        AbstractC19074t.m100208f(c24141a, "inputImage");
        ArrayList arrayList = new ArrayList();
        AbstractC22888j mo34591X3 = m95865h().mo34591X3(c24141a);
        AbstractC19074t.m100207e(mo34591X3, "recognizer.process(inputImage)");
        List m130447a = ((C25202a) AbstractC18491b.m97867a(mo34591X3, 800L, TimeUnit.MILLISECONDS)).m130447a();
        AbstractC19074t.m100207e(m130447a, "text.textBlocks");
        Iterator it = m130447a.iterator();
        while (it.hasNext()) {
            List m130454e = ((C25202a.e) it.next()).m130454e();
            AbstractC19074t.m100207e(m130454e, "textBlock.lines");
            List<C25202a.b> list = m130454e;
            m131511r = AbstractC25370t.m131511r(list, 10);
            ArrayList arrayList2 = new ArrayList(m131511r);
            for (C25202a.b bVar : list) {
                String m130452f = bVar.m130452f();
                AbstractC19074t.m100207e(m130452f, "line.text");
                float m130451e = bVar.m130451e();
                Rect mo130448a = bVar.mo130448a();
                if (mo130448a == null) {
                    mo130448a = new Rect();
                }
                AbstractC19074t.m100207e(mo130448a, "line.boundingBox ?: Rect()");
                Point[] mo130449b = bVar.mo130449b();
                if (mo130449b != null) {
                    AbstractC19074t.m100207e(mo130449b, "cornerPoints");
                    fArr = AbstractC18490a.m97866a(mo130449b);
                    if (fArr != null) {
                        arrayList2.add(new C18028a(m130452f, m130451e, mo130448a, fArr));
                    }
                }
                fArr = new float[0];
                arrayList2.add(new C18028a(m130452f, m130451e, mo130448a, fArr));
            }
            AbstractC25378x.m131548x(arrayList, arrayList2);
        }
        return arrayList;
    }
}
