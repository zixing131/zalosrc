package ci;

import android.text.TextUtils;
import au.EnumC2381y;
import com.zing.zalo.control.C7906d;
import com.zing.zalo.control.ItemAlbumMobile;
import com.zing.zalo.control.MediaStoreItem;
import com.zing.zalo.data.entity.chat.message.MessageId;
import fn0.AbstractC19069o0;
import fn0.AbstractC19074t;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import me0.C23250w4;
import p348mi.AbstractC23309i;
import pm0.C24848g0;
import qm0.AbstractC25382z;

/* renamed from: ci.i */
/* loaded from: classes3.dex */
public final class C3506i extends AbstractC3498e {

    /* renamed from: j */
    private boolean f14680j;

    /* renamed from: k */
    private EnumC2381y f14681k;

    /* renamed from: l */
    private EnumC2381y f14682l;

    /* renamed from: m */
    private ArrayList f14683m;

    /* renamed from: n */
    private final Map f14684n;

    public C3506i(String str) {
        super(str == null ? "" : str);
        EnumC2381y enumC2381y = EnumC2381y.f9940q;
        this.f14681k = enumC2381y;
        this.f14682l = enumC2381y;
        this.f14683m = new ArrayList();
        this.f14684n = new HashMap();
    }

    /* renamed from: N */
    private final List m17674N() {
        ArrayList arrayList;
        ArrayList arrayList2 = new ArrayList();
        synchronized (m17559l()) {
            arrayList = new ArrayList(m17559l());
            C24848g0 c24848g0 = C24848g0.f119245a;
        }
        int size = arrayList.size();
        for (int i11 = 0; i11 < size; i11++) {
            C7906d c7906d = (C7906d) arrayList.get(i11);
            synchronized (c7906d.m40823l()) {
                try {
                    int size2 = c7906d.m40823l().size();
                    for (int i12 = 0; i12 < size2; i12++) {
                        MediaStoreItem mediaStoreItem = (MediaStoreItem) c7906d.m40823l().get(i12);
                        ItemAlbumMobile itemAlbumMobile = (ItemAlbumMobile) this.f14684n.get(mediaStoreItem.m40571M());
                        if (itemAlbumMobile == null) {
                            itemAlbumMobile = new ItemAlbumMobile();
                            m17675R(itemAlbumMobile, mediaStoreItem);
                            this.f14684n.put(mediaStoreItem.m40571M(), itemAlbumMobile);
                        }
                        arrayList2.add(itemAlbumMobile);
                    }
                    C24848g0 c24848g02 = C24848g0.f119245a;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        AbstractC25382z.m131566R(arrayList2);
        return arrayList2;
    }

    /* renamed from: R */
    private final void m17675R(ItemAlbumMobile itemAlbumMobile, MediaStoreItem mediaStoreItem) {
        itemAlbumMobile.m40512W(mediaStoreItem, C23250w4.f112644a.m119818B(this.f14641a), false);
        String m94854B4 = mediaStoreItem.m40599m().m94854B4();
        if (!TextUtils.isEmpty(m94854B4)) {
            itemAlbumMobile.f42605w = m94854B4;
        } else {
            itemAlbumMobile.m40520g0(mediaStoreItem);
        }
    }

    /* renamed from: S */
    private final void m17676S(MediaStoreItem mediaStoreItem) {
        if (mediaStoreItem == null) {
            return;
        }
        AbstractC19069o0.m100184a(this.f14683m).remove((ItemAlbumMobile) this.f14684n.remove(mediaStoreItem.m40571M()));
    }

    /* renamed from: V */
    private final void m17677V(MediaStoreItem mediaStoreItem) {
        ItemAlbumMobile itemAlbumMobile;
        if (mediaStoreItem != null && (itemAlbumMobile = (ItemAlbumMobile) this.f14684n.get(mediaStoreItem.m40571M())) != null) {
            m17675R(itemAlbumMobile, mediaStoreItem);
        }
    }

    /* renamed from: J */
    public final void m17678J(EnumC2381y enumC2381y) {
        AbstractC19074t.m100208f(enumC2381y, "mediaLayoutMode");
        if (this.f14680j && m17681M() != enumC2381y) {
            m17685T(enumC2381y);
        }
    }

    /* renamed from: K */
    public final List m17679K(List list, boolean z11) {
        AbstractC19074t.m100208f(list, "outsideList");
        List<ItemAlbumMobile> m17674N = m17674N();
        if (m17674N.isEmpty()) {
            return list;
        }
        if (list.isEmpty()) {
            return m17674N;
        }
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ItemAlbumMobile itemAlbumMobile = (ItemAlbumMobile) it.next();
            if (!hashSet.contains(itemAlbumMobile.m40495B()) && !hashSet2.contains(itemAlbumMobile.m40534w())) {
                arrayList.add(itemAlbumMobile);
                if (itemAlbumMobile.m40508S()) {
                    String m40495B = itemAlbumMobile.m40495B();
                    AbstractC19074t.m100207e(m40495B, "getGlobalMsgId(...)");
                    hashSet.add(m40495B);
                }
                if (itemAlbumMobile.m40507R()) {
                    String m40534w = itemAlbumMobile.m40534w();
                    AbstractC19074t.m100207e(m40534w, "getClientMsgId(...)");
                    hashSet2.add(m40534w);
                }
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (ItemAlbumMobile itemAlbumMobile2 : m17674N) {
            if (!hashSet.contains(itemAlbumMobile2.m40495B()) && !hashSet2.contains(itemAlbumMobile2.m40534w())) {
                arrayList2.add(itemAlbumMobile2);
                if (itemAlbumMobile2.m40508S()) {
                    String m40495B2 = itemAlbumMobile2.m40495B();
                    AbstractC19074t.m100207e(m40495B2, "getGlobalMsgId(...)");
                    hashSet.add(m40495B2);
                }
                if (itemAlbumMobile2.m40507R()) {
                    String m40534w2 = itemAlbumMobile2.m40534w();
                    AbstractC19074t.m100207e(m40534w2, "getClientMsgId(...)");
                    hashSet2.add(m40534w2);
                }
            }
        }
        if (!arrayList2.isEmpty()) {
            if (z11) {
                arrayList.addAll(0, arrayList2);
            } else {
                arrayList.addAll(arrayList2);
            }
        }
        return arrayList;
    }

    /* renamed from: L */
    public final ArrayList m17680L() {
        ArrayList arrayList;
        this.f14683m.clear();
        this.f14684n.clear();
        synchronized (m17559l()) {
            arrayList = new ArrayList(m17559l());
            C24848g0 c24848g0 = C24848g0.f119245a;
        }
        int size = arrayList.size();
        for (int i11 = 0; i11 < size; i11++) {
            C7906d c7906d = (C7906d) arrayList.get(i11);
            synchronized (c7906d.m40823l()) {
                try {
                    int size2 = c7906d.m40823l().size();
                    for (int i12 = 0; i12 < size2; i12++) {
                        MediaStoreItem mediaStoreItem = (MediaStoreItem) c7906d.m40823l().get(i12);
                        ItemAlbumMobile itemAlbumMobile = new ItemAlbumMobile();
                        m17675R(itemAlbumMobile, mediaStoreItem);
                        this.f14683m.add(itemAlbumMobile);
                        this.f14684n.put(mediaStoreItem.m40571M(), itemAlbumMobile);
                    }
                    C24848g0 c24848g02 = C24848g0.f119245a;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return this.f14683m;
    }

    /* renamed from: M */
    public final EnumC2381y m17681M() {
        return this.f14681k;
    }

    /* renamed from: O */
    public final boolean m17682O() {
        return this.f14680j;
    }

    /* renamed from: P */
    public final EnumC2381y m17683P() {
        return this.f14682l;
    }

    /* renamed from: Q */
    public final void m17684Q() {
        this.f14680j = true;
        for (EnumC2381y enumC2381y : EnumC2381y.values()) {
            if (enumC2381y.ordinal() == AbstractC23309i.m121374R8()) {
                this.f14681k = enumC2381y;
                return;
            }
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    /* renamed from: T */
    public final void m17685T(EnumC2381y enumC2381y) {
        AbstractC19074t.m100208f(enumC2381y, "mediaLayoutMode");
        if (this.f14681k != enumC2381y) {
            this.f14681k = enumC2381y;
            synchronized (m17559l()) {
                try {
                    Iterator it = m17559l().iterator();
                    while (it.hasNext()) {
                        C23250w4.f112644a.m119838j0(((C7906d) it.next()).m40823l(), this.f14681k);
                    }
                    C24848g0 c24848g0 = C24848g0.f119245a;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    /* renamed from: U */
    public final void m17686U(EnumC2381y enumC2381y) {
        AbstractC19074t.m100208f(enumC2381y, "<set-?>");
        this.f14682l = enumC2381y;
    }

    @Override // ci.AbstractC3498e
    /* renamed from: f */
    public void mo17553f() {
        super.mo17553f();
        this.f14683m.clear();
        this.f14684n.clear();
    }

    @Override // ci.AbstractC3498e
    /* renamed from: n */
    public List mo17561n() {
        ArrayList arrayList;
        synchronized (m17559l()) {
            arrayList = new ArrayList();
            Iterator it = m17559l().iterator();
            while (it.hasNext()) {
                arrayList.addAll(((C7906d) it.next()).m40823l());
            }
        }
        return arrayList;
    }

    @Override // ci.AbstractC3498e
    /* renamed from: q */
    public int mo17564q() {
        int i11;
        synchronized (m17559l()) {
            try {
                Iterator it = m17559l().iterator();
                i11 = 0;
                while (it.hasNext()) {
                    i11 += ((C7906d) it.next()).m40824m();
                }
                C24848g0 c24848g0 = C24848g0.f119245a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return i11;
    }

    @Override // ci.AbstractC3498e
    /* renamed from: v */
    public void mo17568v(MediaStoreItem mediaStoreItem) {
        if (mediaStoreItem == null) {
            return;
        }
        super.mo17568v(mediaStoreItem);
        m17677V(mediaStoreItem);
    }

    @Override // ci.AbstractC3498e
    /* renamed from: y */
    public MediaStoreItem mo17570y(MessageId messageId) {
        AbstractC19074t.m100208f(messageId, "messageId");
        MediaStoreItem mo17570y = super.mo17570y(messageId);
        m17676S(mo17570y);
        return mo17570y;
    }
}
