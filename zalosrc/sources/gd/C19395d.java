package gd;

import fn0.AbstractC19074t;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import me0.AbstractC23041d2;
import p128ed.C18388c;
import p128ed.C18390e;
import p185gc.AbstractC19383g;
import vc.EnumC27961a;
import vi.C28257c;
import vi.C28260f;
import vi.C28261g;
import vi.InterfaceC28256b;

/* renamed from: gd.d */
/* loaded from: classes3.dex */
public final class C19395d extends AbstractC19383g {

    /* renamed from: gd.d$a */
    /* loaded from: classes3.dex */
    public static final class a {

        /* renamed from: a */
        private final String f96231a;

        /* renamed from: b */
        private final List f96232b;

        public a(String str, List list) {
            AbstractC19074t.m100208f(str, "rootPathOut");
            AbstractC19074t.m100208f(list, "listZipFile");
            this.f96231a = str;
            this.f96232b = list;
        }

        /* renamed from: a */
        public final List m101519a() {
            return this.f96232b;
        }

        /* renamed from: b */
        public final String m101520b() {
            return this.f96231a;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p185gc.AbstractC19383g
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public void mo12006b(a aVar) {
        AbstractC19074t.m100208f(aVar, "params");
        Iterator it = aVar.m101519a().iterator();
        while (it.hasNext()) {
            C28260f m142319h = ((C28261g) it.next()).m142319h();
            m142319h.mo142290c(0L);
            String mo142291d = m142319h.mo142291d();
            String str = aVar.m101520b() + C18390e.f92781a.m97421l(mo142291d);
            C18390e.m97413u("[Zip] ----- Process zip to path: zipPathOut=" + str, false, 2, null);
            AbstractC23041d2.m118208g(str);
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            for (InterfaceC28256b interfaceC28256b : m142319h.m142309k().values()) {
                if (!(interfaceC28256b instanceof C28257c) || ((C28257c) interfaceC28256b).m142293e() != EnumC27961a.f130361t) {
                    if (!C18388c.f92779a.m97398i(interfaceC28256b.mo142288a())) {
                        C18390e.m97412t("[Zip] fileMD need to upload no exist!!!, fileMD=" + interfaceC28256b, true);
                    } else {
                        arrayList.add(interfaceC28256b.mo142288a());
                        arrayList2.add(interfaceC28256b.mo142291d());
                    }
                }
            }
            if (arrayList.isEmpty()) {
                C18390e.m97413u("EMPTY zipFile=" + m142319h, false, 2, null);
            } else {
                C18388c c18388c = C18388c.f92779a;
                c18388c.m97400k(arrayList, arrayList2, str);
                long m97394e = c18388c.m97394e(str);
                if (m97394e <= 0) {
                    C18390e.m97412t("[Zip] Fail, " + mo142291d, true);
                } else {
                    m142319h.mo142290c(m97394e);
                }
            }
        }
    }
}
