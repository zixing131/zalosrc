package ci;

import au.EnumC2363o;
import au.EnumC2381y;
import com.zing.zalo.control.C7906d;
import com.zing.zalo.control.MediaStoreItem;
import com.zing.zalo.data.entity.chat.message.MessageId;
import fn0.AbstractC19074t;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import me0.C23250w4;
import mm0.AbstractC23350e;
import pm0.C24848g0;
import qm0.AbstractC25376w;

/* renamed from: ci.e */
/* loaded from: classes3.dex */
public abstract class AbstractC3498e {

    /* renamed from: a */
    public final String f14641a;

    /* renamed from: b */
    private final List f14642b;

    /* renamed from: c */
    private final Map f14643c;

    /* renamed from: d */
    private boolean f14644d;

    /* renamed from: e */
    private boolean f14645e;

    /* renamed from: f */
    private int f14646f;

    /* renamed from: g */
    private final List f14647g;

    /* renamed from: h */
    private final Set f14648h;

    /* renamed from: i */
    private final Set f14649i;

    public AbstractC3498e(String str) {
        AbstractC19074t.m100208f(str, "mConversationId");
        this.f14641a = str;
        this.f14642b = new ArrayList();
        Map synchronizedMap = Collections.synchronizedMap(new HashMap());
        AbstractC19074t.m100207e(synchronizedMap, "synchronizedMap(...)");
        this.f14643c = synchronizedMap;
        this.f14645e = true;
        this.f14647g = new ArrayList();
        this.f14648h = new HashSet();
        Set synchronizedSet = Collections.synchronizedSet(new HashSet());
        AbstractC19074t.m100207e(synchronizedSet, "synchronizedSet(...)");
        this.f14649i = synchronizedSet;
    }

    /* renamed from: F */
    private final void m17537F(C7906d c7906d, boolean z11) {
        synchronized (c7906d.m40823l()) {
            try {
                Iterator it = c7906d.m40823l().iterator();
                while (it.hasNext()) {
                    m17546C((MediaStoreItem) it.next(), z11);
                }
                C24848g0 c24848g0 = C24848g0.f119245a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: G */
    static /* synthetic */ void m17538G(AbstractC3498e abstractC3498e, C7906d c7906d, boolean z11, int i11, Object obj) {
        if (obj == null) {
            if ((i11 & 2) != 0) {
                z11 = true;
            }
            abstractC3498e.m17537F(c7906d, z11);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setSectionSelected");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: I */
    public static final int m17539I(C7906d c7906d, C7906d c7906d2) {
        long j11;
        long j12;
        AbstractC19074t.m100208f(c7906d, "o1");
        AbstractC19074t.m100208f(c7906d2, "o2");
        C7906d.b m40819h = c7906d.m40819h();
        if (m40819h != null) {
            j11 = m40819h.m40842b();
        } else {
            j11 = 0;
        }
        C7906d.b m40819h2 = c7906d2.m40819h();
        if (m40819h2 != null) {
            j12 = m40819h2.m40842b();
        } else {
            j12 = 0;
        }
        long j13 = j11 - j12;
        if (j13 < 0) {
            return 1;
        }
        if (j13 > 0) {
            return -1;
        }
        return 0;
    }

    /* renamed from: d */
    public static /* synthetic */ void m17541d(AbstractC3498e abstractC3498e, EnumC2363o enumC2363o, C7906d c7906d, boolean z11, boolean z12, EnumC2381y enumC2381y, int i11, Object obj) {
        boolean z13;
        if (obj == null) {
            if ((i11 & 8) != 0) {
                z13 = false;
            } else {
                z13 = z12;
            }
            if ((i11 & 16) != 0) {
                enumC2381y = null;
            }
            abstractC3498e.m17551c(enumC2363o, c7906d, z11, z13, enumC2381y);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: appendSectionItem");
    }

    /* renamed from: t */
    private final boolean m17542t(MediaStoreItem mediaStoreItem) {
        if (mediaStoreItem != null && this.f14648h.contains(mediaStoreItem.m40571M())) {
            return true;
        }
        return false;
    }

    /* renamed from: x */
    private final void m17543x(MediaStoreItem mediaStoreItem) {
        try {
            if (m17566s() && mediaStoreItem != null) {
                synchronized (this.f14647g) {
                    try {
                        Iterator it = this.f14647g.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                break;
                            }
                            MediaStoreItem mediaStoreItem2 = (MediaStoreItem) it.next();
                            if (AbstractC19074t.m100204b(mediaStoreItem2.m40571M(), mediaStoreItem.m40571M())) {
                                it.remove();
                                this.f14648h.remove(mediaStoreItem2.m40571M());
                                break;
                            }
                        }
                        C24848g0 c24848g0 = C24848g0.f119245a;
                    } finally {
                    }
                }
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: A */
    public final void m17544A() {
        this.f14645e = true;
        this.f14646f = 0;
        mo17553f();
    }

    /* renamed from: B */
    public final void m17545B(boolean z11) {
        this.f14645e = z11;
    }

    /* renamed from: C */
    public final void m17546C(MediaStoreItem mediaStoreItem, boolean z11) {
        AbstractC19074t.m100208f(mediaStoreItem, "item");
        mediaStoreItem.m40558A0(z11);
        boolean m17542t = m17542t(mediaStoreItem);
        if (z11) {
            if (!m17542t) {
                this.f14647g.add(mediaStoreItem);
                this.f14648h.add(mediaStoreItem.m40571M());
                return;
            }
            return;
        }
        if (m17542t) {
            m17543x(mediaStoreItem);
        }
    }

    /* renamed from: D */
    public final void m17547D(boolean z11) {
        this.f14644d = z11;
    }

    /* renamed from: E */
    public final void m17548E(int i11) {
        this.f14646f = i11;
    }

    /* renamed from: H */
    public final void m17549H() {
        synchronized (this.f14642b) {
            AbstractC25376w.m131534w(this.f14642b, new Comparator() { // from class: ci.d
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    int m17539I;
                    m17539I = AbstractC3498e.m17539I((C7906d) obj, (C7906d) obj2);
                    return m17539I;
                }
            });
            C24848g0 c24848g0 = C24848g0.f119245a;
        }
    }

    /* renamed from: b */
    public final void m17550b(C3529x c3529x) {
        AbstractC19074t.m100208f(c3529x, "targetItemInfo");
        synchronized (this.f14649i) {
            this.f14649i.add(c3529x);
        }
    }

    /* renamed from: c */
    public final void m17551c(EnumC2363o enumC2363o, C7906d c7906d, boolean z11, boolean z12, EnumC2381y enumC2381y) {
        AbstractC19074t.m100208f(enumC2363o, "filterMode");
        AbstractC19074t.m100208f(c7906d, "newSectionItem");
        try {
            synchronized (this.f14642b) {
                if (!z12 || enumC2381y == null) {
                    try {
                        if ((this instanceof C3506i) && enumC2363o == EnumC2363o.f9889p) {
                            enumC2381y = ((C3506i) this).m17681M();
                        } else {
                            enumC2381y = EnumC2381y.f9940q;
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    } finally {
                    }
                }
                if (this instanceof C3506i) {
                    ((C3506i) this).m17686U(enumC2381y);
                }
                boolean z13 = false;
                for (C7906d c7906d2 : this.f14642b) {
                    if (c7906d2.m40817f() == c7906d.m40817f()) {
                        if (!AbstractC19074t.m100204b(c7906d2, c7906d)) {
                            synchronized (c7906d2.m40823l()) {
                                C23250w4.f112644a.m119831d(c7906d2, new ArrayList(c7906d.m40823l()), z11, enumC2381y);
                                C24848g0 c24848g0 = C24848g0.f119245a;
                            }
                        }
                        if (c7906d2.m40829r() && c7906d2.m40830s()) {
                            m17538G(this, c7906d2, false, 2, null);
                        }
                        z13 = true;
                    }
                }
                if (!z13) {
                    synchronized (c7906d.m40823l()) {
                        if (this instanceof C3506i) {
                            C23250w4.f112644a.m119838j0(c7906d.m40823l(), enumC2381y);
                        }
                        C24848g0 c24848g02 = C24848g0.f119245a;
                    }
                    if (z11) {
                        this.f14642b.add(c7906d);
                    } else {
                        this.f14642b.add(0, c7906d);
                    }
                }
                C24848g0 c24848g03 = C24848g0.f119245a;
            }
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    /* renamed from: e */
    public void m17552e() {
        ArrayList<C7906d> arrayList;
        synchronized (this.f14642b) {
            arrayList = new ArrayList(this.f14642b);
            C24848g0 c24848g0 = C24848g0.f119245a;
        }
        for (C7906d c7906d : arrayList) {
            if (c7906d != null) {
                c7906d.m40833v(false);
            }
            if (c7906d != null) {
                c7906d.m40834w(false);
            }
        }
        Iterator it = this.f14647g.iterator();
        while (it.hasNext()) {
            ((MediaStoreItem) it.next()).m40558A0(false);
        }
        this.f14647g.clear();
        this.f14648h.clear();
    }

    /* renamed from: f */
    public void mo17553f() {
        this.f14643c.clear();
        synchronized (this.f14642b) {
            this.f14642b.clear();
            C24848g0 c24848g0 = C24848g0.f119245a;
        }
    }

    /* renamed from: g */
    public final MediaStoreItem m17554g(MessageId messageId) {
        AbstractC19074t.m100208f(messageId, "messageId");
        synchronized (this.f14643c) {
            for (MediaStoreItem mediaStoreItem : this.f14643c.values()) {
                if (mediaStoreItem.m40604o0(messageId)) {
                    return mediaStoreItem;
                }
            }
            C24848g0 c24848g0 = C24848g0.f119245a;
            return null;
        }
    }

    /* renamed from: h */
    public final boolean m17555h(C3529x c3529x) {
        if (c3529x == null) {
            return false;
        }
        if (c3529x.m17883e() == 1) {
            if (c3529x.m17881c() != null && this.f14643c.containsKey(c3529x.m17881c())) {
                return true;
            }
        } else if (c3529x.m17883e() == 2) {
            synchronized (this.f14643c) {
                Iterator it = this.f14643c.values().iterator();
                while (it.hasNext()) {
                    if (((MediaStoreItem) it.next()).m40604o0(c3529x.m17881c())) {
                        return true;
                    }
                }
                C24848g0 c24848g0 = C24848g0.f119245a;
            }
        }
        return false;
    }

    /* renamed from: i */
    public final boolean m17556i() {
        return this.f14645e;
    }

    /* renamed from: j */
    public final MediaStoreItem m17557j(MessageId messageId) {
        AbstractC19074t.m100208f(messageId, "messageId");
        return (MediaStoreItem) this.f14643c.get(messageId);
    }

    /* renamed from: k */
    public final MediaStoreItem m17558k() {
        synchronized (this.f14642b) {
            if (this.f14642b.isEmpty()) {
                return null;
            }
            return ((C7906d) this.f14642b.get(r1.size() - 1)).m40820i();
        }
    }

    /* renamed from: l */
    public final List m17559l() {
        return this.f14642b;
    }

    /* renamed from: m */
    public final Set m17560m() {
        return this.f14649i;
    }

    /* renamed from: n */
    public List mo17561n() {
        ArrayList arrayList;
        synchronized (this.f14642b) {
            arrayList = new ArrayList();
            Iterator it = this.f14642b.iterator();
            while (it.hasNext()) {
                arrayList.addAll(((C7906d) it.next()).m40823l());
            }
        }
        return arrayList;
    }

    /* renamed from: o */
    public final int m17562o() {
        return this.f14646f;
    }

    /* renamed from: p */
    public final List m17563p() {
        return this.f14647g;
    }

    /* renamed from: q */
    public int mo17564q() {
        int i11;
        synchronized (this.f14642b) {
            try {
                Iterator it = this.f14642b.iterator();
                i11 = 0;
                while (it.hasNext()) {
                    i11 += ((C7906d) it.next()).m40823l().size();
                }
                C24848g0 c24848g0 = C24848g0.f119245a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return i11;
    }

    /* renamed from: r */
    public final boolean m17565r() {
        return !this.f14643c.isEmpty();
    }

    /* renamed from: s */
    public final boolean m17566s() {
        return !this.f14647g.isEmpty();
    }

    /* renamed from: u */
    public final boolean m17567u() {
        return this.f14644d;
    }

    /* renamed from: v */
    public void mo17568v(MediaStoreItem mediaStoreItem) {
        if (mediaStoreItem == null) {
            return;
        }
        this.f14643c.put(mediaStoreItem.m40571M(), mediaStoreItem);
    }

    /* renamed from: w */
    public void m17569w(List list) {
        ArrayList<C7906d> arrayList;
        List list2 = list;
        if (list2 != null && !list2.isEmpty()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                MessageId messageId = (MessageId) it.next();
                synchronized (this.f14647g) {
                    try {
                        Iterator it2 = this.f14647g.iterator();
                        while (true) {
                            if (!it2.hasNext()) {
                                break;
                            }
                            MediaStoreItem mediaStoreItem = (MediaStoreItem) it2.next();
                            if (AbstractC19074t.m100204b(mediaStoreItem.m40571M(), messageId)) {
                                it2.remove();
                                this.f14648h.remove(mediaStoreItem.m40571M());
                                break;
                            }
                        }
                        C24848g0 c24848g0 = C24848g0.f119245a;
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            }
            synchronized (this.f14642b) {
                arrayList = new ArrayList(this.f14642b);
                C24848g0 c24848g02 = C24848g0.f119245a;
            }
            for (C7906d c7906d : arrayList) {
                if (c7906d != null && c7906d.m40829r() && c7906d.m40830s() && !c7906d.m40828q()) {
                    c7906d.m40833v(false);
                    c7906d.m40834w(false);
                }
            }
        }
    }

    /* renamed from: y */
    public MediaStoreItem mo17570y(MessageId messageId) {
        AbstractC19074t.m100208f(messageId, "messageId");
        return (MediaStoreItem) this.f14643c.remove(messageId);
    }

    /* renamed from: z */
    public final boolean m17571z(List list) {
        ArrayList<C7906d> arrayList;
        AbstractC19074t.m100208f(list, "deletedFileIds");
        Iterator it = list.iterator();
        boolean z11 = false;
        while (it.hasNext()) {
            MessageId messageId = (MessageId) it.next();
            synchronized (this.f14642b) {
                arrayList = new ArrayList(this.f14642b);
                C24848g0 c24848g0 = C24848g0.f119245a;
            }
            for (C7906d c7906d : arrayList) {
                if (c7906d.m40827p()) {
                    ArrayList arrayList2 = new ArrayList();
                    synchronized (c7906d.m40823l()) {
                        try {
                            Iterator it2 = c7906d.m40823l().iterator();
                            while (it2.hasNext()) {
                                MediaStoreItem mediaStoreItem = (MediaStoreItem) it2.next();
                                if (AbstractC19074t.m100204b(mediaStoreItem.m40571M(), messageId)) {
                                    it2.remove();
                                    arrayList2.add(mediaStoreItem);
                                    z11 = true;
                                }
                            }
                            C24848g0 c24848g02 = C24848g0.f119245a;
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                    if (z11) {
                        c7906d.m40833v(c7906d.m40828q());
                    }
                    if (z11 && c7906d.m40827p() && (this instanceof C3506i) && ((C3506i) this).m17682O()) {
                        synchronized (c7906d.m40823l()) {
                            C23250w4.f112644a.m119838j0(c7906d.m40823l(), ((C3506i) this).m17681M());
                        }
                    }
                }
            }
            mo17570y(messageId);
        }
        synchronized (this.f14642b) {
            try {
                Iterator it3 = this.f14642b.iterator();
                while (it3.hasNext()) {
                    if (!((C7906d) it3.next()).m40827p()) {
                        it3.remove();
                    }
                }
                C24848g0 c24848g03 = C24848g0.f119245a;
            } catch (Throwable th3) {
                throw th3;
            }
        }
        m17569w(list);
        return z11;
    }
}
