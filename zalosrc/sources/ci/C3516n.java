package ci;

import ag0.C0824j;
import am.AbstractC0939u;
import au.EnumC2382z;
import com.zing.zalo.control.MediaStoreItem;
import dj.C17945a0;
import dm.C18027a;
import fn0.AbstractC19074t;
import ho0.AbstractC20110a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import me0.C23250w4;
import mm0.AbstractC23350e;
import p056cj.C3535c;
import p300kk.C21753c;
import p348mi.AbstractC23306f;

/* renamed from: ci.n */
/* loaded from: classes3.dex */
public final class C3516n {

    /* renamed from: a */
    public static final C3516n f14745a = new C3516n();

    /* renamed from: b */
    private static final Map f14746b = Collections.synchronizedMap(new HashMap(3));

    /* renamed from: ci.n$a */
    /* loaded from: classes3.dex */
    public interface a {
        /* renamed from: a */
        void mo17761a(C3514m c3514m);
    }

    /* renamed from: ci.n$b */
    /* loaded from: classes3.dex */
    public static final class b extends AbstractC0939u {

        /* renamed from: a */
        final /* synthetic */ String f14747a;

        /* renamed from: b */
        final /* synthetic */ a f14748b;

        b(String str, a aVar) {
            this.f14747a = str;
            this.f14748b = aVar;
        }

        @Override // p660xw.InterfaceC30214a
        /* renamed from: a */
        public void mo928a() {
            try {
                ArrayList arrayList = new ArrayList();
                int i11 = 0;
                while (arrayList.size() < 4) {
                    C21753c m95857i = C18027a.Companion.m95862a().m95857i(this.f14747a, EnumC2382z.f9945r, i11, 4);
                    int size = m95857i.m112206b().size();
                    i11 += size;
                    List m112206b = m95857i.m112206b();
                    ArrayList arrayList2 = new ArrayList();
                    for (Object obj : m112206b) {
                        if (!((MediaStoreItem) obj).m40591g0()) {
                            arrayList2.add(obj);
                        }
                    }
                    arrayList.addAll(arrayList2);
                    if (size < 4) {
                        break;
                    }
                }
                C3514m c3514m = new C3514m(0, arrayList);
                Map map = C3516n.f14746b;
                AbstractC19074t.m100207e(map, "access$getPreviewCache$p(...)");
                map.put(this.f14747a, c3514m);
                this.f14748b.mo17761a(c3514m);
            } catch (Exception e11) {
                AbstractC20110a.f98889a.mo104552e(e11);
            }
        }
    }

    private C3516n() {
    }

    /* renamed from: b */
    public final void m17759b() {
        f14746b.clear();
    }

    /* renamed from: c */
    public final void m17760c(String str, a aVar) {
        AbstractC19074t.m100208f(str, "conversationId");
        AbstractC19074t.m100208f(aVar, "listener");
        try {
            Map map = f14746b;
            if (map.containsKey(str)) {
                aVar.mo17761a((C3514m) map.get(str));
            } else {
                ArrayList arrayList = new ArrayList();
                C3535c m2634q = AbstractC23306f.m120584H0().m2634q(str);
                if (m2634q != null) {
                    List m17941F0 = m2634q.m17941F0();
                    int size = m17941F0.size() - 1;
                    if (size >= 0) {
                        while (true) {
                            int i11 = size - 1;
                            if (C23250w4.f112644a.m119836i(((C17945a0) m17941F0.get(size)).m95041W4()) == EnumC2382z.f9945r) {
                                MediaStoreItem mediaStoreItem = new MediaStoreItem((C17945a0) m17941F0.get(size));
                                if (mediaStoreItem.m40594i0()) {
                                    arrayList.add(mediaStoreItem);
                                }
                            }
                            if (arrayList.size() < 4 && i11 >= 0) {
                                size = i11;
                            }
                        }
                    }
                }
                if (!arrayList.isEmpty()) {
                    C3514m c3514m = new C3514m(0, arrayList);
                    Map map2 = f14746b;
                    AbstractC19074t.m100207e(map2, "previewCache");
                    map2.put(str, c3514m);
                    aVar.mo17761a(c3514m);
                }
            }
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
        C0824j.m2153b(new b(str, aVar));
    }
}
