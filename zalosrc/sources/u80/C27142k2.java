package u80;

import android.text.TextUtils;
import dg0.AbstractC17930e;
import dj.C17945a0;
import en0.InterfaceC18494a;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import gg0.AbstractC19444a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kw.C21955a;
import mm0.AbstractC23350e;
import mw.C23459d;
import pm0.AbstractC24856m;
import pm0.C24848g0;
import pm0.InterfaceC24854k;
import qm0.AbstractC25370t;

/* renamed from: u80.k2 */
/* loaded from: classes6.dex */
public final class C27142k2 {

    /* renamed from: a */
    public static final C27142k2 f127855a = new C27142k2();

    /* renamed from: b */
    private static final InterfaceC24854k f127856b;

    /* renamed from: c */
    private static long f127857c;

    /* renamed from: u80.k2$a */
    /* loaded from: classes6.dex */
    static final class a extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final a f127858q = new a();

        a() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final List mo12V4() {
            return new ArrayList();
        }
    }

    static {
        InterfaceC24854k m129210a;
        m129210a = AbstractC24856m.m129210a(a.f127858q);
        f127856b = m129210a;
        f127857c = 400L;
    }

    private C27142k2() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: d */
    public static final void m139242d(final C17945a0 c17945a0) {
        int m131511r;
        AbstractC19074t.m100208f(c17945a0, "$chatContent");
        final ArrayList arrayList = new ArrayList();
        C27142k2 c27142k2 = f127855a;
        synchronized (c27142k2.m139244f()) {
            arrayList.addAll(c27142k2.m139244f());
            c27142k2.m139244f().clear();
            C24848g0 c24848g0 = C24848g0.f119245a;
        }
        if (arrayList.isEmpty()) {
            return;
        }
        if (!TextUtils.equals(((C17945a0) arrayList.get(0)).m94846A4(), "chat_send") || (!((C17945a0) arrayList.get(0)).m95110d8() && !((C17945a0) arrayList.get(0)).m95316z8() && !((C17945a0) arrayList.get(0)).m94890F7() && !((C17945a0) arrayList.get(0)).m95314z6())) {
            m131511r = AbstractC25370t.m131511r(arrayList, 10);
            final ArrayList arrayList2 = new ArrayList(m131511r);
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                arrayList2.add(((C17945a0) it.next()).m95029V3());
            }
            if (!arrayList2.isEmpty()) {
                AbstractC19444a.m101694b(new Runnable() { // from class: u80.j2
                    @Override // java.lang.Runnable
                    public final void run() {
                        C27142k2.m139243e(arrayList2, arrayList, c17945a0);
                    }
                }, 200L);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: e */
    public static final void m139243e(ArrayList arrayList, List list, C17945a0 c17945a0) {
        AbstractC19074t.m100208f(arrayList, "$msgIdList");
        AbstractC19074t.m100208f(list, "$cloneMsgList");
        AbstractC19074t.m100208f(c17945a0, "$chatContent");
        C23459d.f113954a.m123169k(null, arrayList, C21955a.f108070a.m114643j(list), "snackbar_direct", TextUtils.equals(c17945a0.m94846A4(), "share_inapp_browser"));
    }

    /* renamed from: f */
    private final List m139244f() {
        return (List) f127856b.getValue();
    }

    /* renamed from: c */
    public final void m139245c(final C17945a0 c17945a0) {
        AbstractC19074t.m100208f(c17945a0, "chatContent");
        try {
            synchronized (m139244f()) {
                f127855a.m139244f().add(c17945a0);
            }
            AbstractC17930e.Companion.m94550a().mo94530d("ADD_NEW_MY_CLOUD_MESSAGE", new Runnable() { // from class: u80.i2
                @Override // java.lang.Runnable
                public final void run() {
                    C27142k2.m139242d(C17945a0.this);
                }
            }, f127857c);
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }
}
