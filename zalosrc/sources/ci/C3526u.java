package ci;

import android.text.TextUtils;
import au.EnumC2382z;
import com.zing.zalo.control.C7906d;
import com.zing.zalo.control.ItemAlbumMobile;
import com.zing.zalo.control.MediaStoreItem;
import com.zing.zalo.data.entity.chat.message.MessageId;
import com.zing.zalo.p077ui.mediastore.search.MediaStoreSearchPage;
import en0.InterfaceC18494a;
import en0.InterfaceC18505l;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.regex.Pattern;
import me0.AbstractC23262x6;
import me0.C23250w4;
import on0.C24329j;
import pm0.AbstractC24856m;
import pm0.C24848g0;
import pm0.InterfaceC24854k;
import qm0.AbstractC25332a0;
import qm0.AbstractC25378x;

/* renamed from: ci.u */
/* loaded from: classes3.dex */
public final class C3526u {
    public static final a Companion = new a(null);

    /* renamed from: a */
    public String f14803a;

    /* renamed from: b */
    public final String f14804b;

    /* renamed from: c */
    private MediaStoreSearchPage.EnumC12391a f14805c;

    /* renamed from: d */
    private int f14806d;

    /* renamed from: e */
    private String f14807e;

    /* renamed from: f */
    private Pattern f14808f;

    /* renamed from: g */
    private final List f14809g;

    /* renamed from: h */
    private final C3506i f14810h;

    /* renamed from: i */
    private final C3504h f14811i;

    /* renamed from: j */
    private final C3502g f14812j;

    /* renamed from: k */
    private final InterfaceC24854k f14813k;

    /* renamed from: l */
    private C3525t f14814l;

    /* renamed from: m */
    private final AtomicBoolean f14815m;

    /* renamed from: n */
    private boolean f14816n;

    /* renamed from: o */
    private final List f14817o;

    /* renamed from: p */
    private final Set f14818p;

    /* renamed from: q */
    private final Map f14819q;

    /* renamed from: r */
    private List f14820r;

    /* renamed from: ci.u$a */
    /* loaded from: classes3.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC19060k abstractC19060k) {
            this();
        }

        /* renamed from: a */
        private final String m17865a(String str) {
            String str2;
            Object m131216p0;
            String m120002o = AbstractC23262x6.m120002o(str);
            AbstractC19074t.m100207e(m120002o, "convertSignToNoSign(...)");
            List m127021i = new C24329j("(\\W|_)+").m127021i(m120002o, 0);
            ArrayList arrayList = new ArrayList();
            for (Object obj : m127021i) {
                if (((String) obj).length() > 0) {
                    arrayList.add(obj);
                }
            }
            if (arrayList.size() <= 1) {
                str2 = "";
            } else {
                int size = arrayList.size() - 1;
                str2 = "";
                for (int i11 = 0; i11 < size; i11++) {
                    str2 = str2 + arrayList.get(i11) + "(\\W|_)+";
                }
            }
            if (!arrayList.isEmpty()) {
                m131216p0 = AbstractC25332a0.m131216p0(arrayList);
                return str2 + m131216p0;
            }
            return "";
        }

        /* renamed from: b */
        public final String m17866b(String[] strArr) {
            AbstractC19074t.m100208f(strArr, "keywords");
            try {
                if (strArr.length > 0) {
                    HashMap hashMap = new HashMap();
                    StringBuilder sb2 = new StringBuilder("(\\b|_)");
                    boolean z11 = false;
                    for (String str : strArr) {
                        if (!TextUtils.isEmpty(str)) {
                            String m17865a = m17865a(str);
                            if (!hashMap.containsKey(m17865a)) {
                                hashMap.put(m17865a, m17865a);
                                if (!z11) {
                                    sb2.append("(");
                                    sb2.append(m17865a);
                                    sb2.append(")");
                                    z11 = true;
                                } else {
                                    sb2.append("|(");
                                    sb2.append(m17865a);
                                    sb2.append(")");
                                }
                            }
                        }
                    }
                    String sb3 = sb2.toString();
                    AbstractC19074t.m100207e(sb3, "toString(...)");
                    return sb3;
                }
                return "";
            } catch (Exception e11) {
                e11.printStackTrace();
                return "";
            }
        }
    }

    /* renamed from: ci.u$b */
    /* loaded from: classes3.dex */
    public /* synthetic */ class b {

        /* renamed from: a */
        public static final /* synthetic */ int[] f14821a;

        static {
            int[] iArr = new int[EnumC2382z.values().length];
            try {
                iArr[EnumC2382z.f9947t.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC2382z.f9946s.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC2382z.f9945r.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[EnumC2382z.f9948u.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f14821a = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: ci.u$c */
    /* loaded from: classes3.dex */
    public static final class c extends AbstractC19075u implements InterfaceC18505l {

        /* renamed from: q */
        final /* synthetic */ MessageId f14822q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(MessageId messageId) {
            super(1);
            this.f14822q = messageId;
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: a */
        public final Boolean mo205i9(MediaStoreItem mediaStoreItem) {
            AbstractC19074t.m100208f(mediaStoreItem, "it");
            return Boolean.valueOf(mediaStoreItem.m40604o0(this.f14822q));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: ci.u$d */
    /* loaded from: classes3.dex */
    public static final class d extends AbstractC19075u implements InterfaceC18505l {

        /* renamed from: q */
        final /* synthetic */ MessageId f14823q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(MessageId messageId) {
            super(1);
            this.f14823q = messageId;
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: a */
        public final Boolean mo205i9(MediaStoreItem mediaStoreItem) {
            AbstractC19074t.m100208f(mediaStoreItem, "it");
            return Boolean.valueOf(mediaStoreItem.m40604o0(this.f14823q));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: ci.u$e */
    /* loaded from: classes3.dex */
    public static final class e extends AbstractC19075u implements InterfaceC18505l {

        /* renamed from: q */
        public static final e f14824q = new e();

        e() {
            super(1);
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: a */
        public final Boolean mo205i9(C7906d c7906d) {
            AbstractC19074t.m100208f(c7906d, "it");
            return Boolean.valueOf(c7906d.m40823l().isEmpty());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: ci.u$f */
    /* loaded from: classes3.dex */
    public static final class f extends AbstractC19075u implements InterfaceC18505l {

        /* renamed from: q */
        final /* synthetic */ MessageId f14825q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(MessageId messageId) {
            super(1);
            this.f14825q = messageId;
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: a */
        public final Boolean mo205i9(MediaStoreItem mediaStoreItem) {
            AbstractC19074t.m100208f(mediaStoreItem, "it");
            return Boolean.valueOf(mediaStoreItem.m40604o0(this.f14825q));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: ci.u$g */
    /* loaded from: classes3.dex */
    public static final class g extends AbstractC19075u implements InterfaceC18505l {

        /* renamed from: q */
        public static final g f14826q = new g();

        g() {
            super(1);
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: a */
        public final Boolean mo205i9(C7906d c7906d) {
            AbstractC19074t.m100208f(c7906d, "it");
            return Boolean.valueOf(c7906d.m40823l().isEmpty());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: ci.u$h */
    /* loaded from: classes3.dex */
    public static final class h extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final h f14827q = new h();

        h() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a */
        public final Map mo12V4() {
            return new LinkedHashMap();
        }
    }

    public C3526u(String str, String str2, MediaStoreSearchPage.EnumC12391a enumC12391a) {
        InterfaceC24854k m129210a;
        AbstractC19074t.m100208f(str, "input");
        AbstractC19074t.m100208f(str2, "conversationId");
        AbstractC19074t.m100208f(enumC12391a, "searchMode");
        this.f14803a = str;
        this.f14804b = str2;
        this.f14805c = enumC12391a;
        String m120002o = AbstractC23262x6.m120002o(str);
        AbstractC19074t.m100207e(m120002o, "convertSignToNoSign(...)");
        this.f14807e = m120002o;
        List synchronizedList = Collections.synchronizedList(new ArrayList());
        AbstractC19074t.m100207e(synchronizedList, "synchronizedList(...)");
        this.f14809g = synchronizedList;
        this.f14810h = new C3506i(str2);
        this.f14811i = new C3504h(str2);
        this.f14812j = new C3502g(str2);
        m129210a = AbstractC24856m.m129210a(h.f14827q);
        this.f14813k = m129210a;
        this.f14815m = new AtomicBoolean(false);
        this.f14816n = true;
        this.f14817o = new ArrayList();
        this.f14818p = new HashSet();
        this.f14819q = new HashMap();
        this.f14820r = new ArrayList();
        try {
            ArrayList arrayList = new ArrayList();
            arrayList.add(this.f14807e);
            this.f14808f = Pattern.compile(Companion.m17866b((String[]) arrayList.toArray(new String[0])), 2);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: n */
    private final boolean m17840n(MediaStoreItem mediaStoreItem) {
        if (mediaStoreItem != null && this.f14818p.contains(mediaStoreItem.m40571M())) {
            return true;
        }
        return false;
    }

    /* renamed from: q */
    private final void m17841q(MediaStoreItem mediaStoreItem) {
        try {
            if (m17854m() && mediaStoreItem != null) {
                Iterator it = this.f14817o.iterator();
                while (it.hasNext()) {
                    MediaStoreItem mediaStoreItem2 = (MediaStoreItem) it.next();
                    if (AbstractC19074t.m100204b(mediaStoreItem2.m40571M(), mediaStoreItem.m40571M())) {
                        it.remove();
                        this.f14818p.remove(mediaStoreItem2.m40571M());
                        return;
                    }
                }
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: a */
    public final boolean m17842a(EnumC2382z enumC2382z, MessageId messageId) {
        boolean m131542D;
        boolean m131542D2;
        boolean m131542D3;
        AbstractC19074t.m100208f(enumC2382z, "mediaStoreType");
        int i11 = b.f14821a[enumC2382z.ordinal()];
        boolean z11 = false;
        if (i11 != 1) {
            if (i11 != 2) {
                if (i11 == 3) {
                    synchronized (this.f14810h) {
                        try {
                            Iterator it = this.f14810h.m17559l().iterator();
                            while (it.hasNext()) {
                                C7906d c7906d = (C7906d) it.next();
                                m131542D3 = AbstractC25378x.m131542D(c7906d.m40823l(), new c(messageId));
                                if (m131542D3) {
                                    c7906d.m40833v(c7906d.m40828q());
                                    z11 = true;
                                }
                                if (m131542D3 && c7906d.m40827p()) {
                                    C23250w4.f112644a.m119838j0(c7906d.m40823l(), C3499e0.Companion.m17646b());
                                }
                                if (c7906d.m40823l().isEmpty()) {
                                    it.remove();
                                }
                            }
                            C24848g0 c24848g0 = C24848g0.f119245a;
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                }
            } else {
                synchronized (this.f14811i) {
                    try {
                        Iterator it2 = this.f14811i.m17559l().iterator();
                        while (it2.hasNext()) {
                            m131542D2 = AbstractC25378x.m131542D(((C7906d) it2.next()).m40823l(), new d(messageId));
                            if (m131542D2) {
                                z11 = true;
                            }
                        }
                        AbstractC25378x.m131542D(this.f14811i.m17559l(), e.f14824q);
                    } catch (Throwable th3) {
                        throw th3;
                    }
                }
            }
        } else {
            synchronized (this.f14812j) {
                try {
                    Iterator it3 = this.f14812j.m17559l().iterator();
                    while (it3.hasNext()) {
                        m131542D = AbstractC25378x.m131542D(((C7906d) it3.next()).m40823l(), new f(messageId));
                        if (m131542D) {
                            z11 = true;
                        }
                    }
                    AbstractC25378x.m131542D(this.f14812j.m17559l(), g.f14826q);
                } finally {
                }
            }
        }
        return z11;
    }

    /* renamed from: b */
    public final void m17843b() {
        Iterator it = this.f14817o.iterator();
        while (it.hasNext()) {
            ((MediaStoreItem) it.next()).m40558A0(false);
        }
        this.f14817o.clear();
        this.f14818p.clear();
        this.f14810h.m17552e();
        this.f14812j.m17552e();
        this.f14811i.m17552e();
    }

    /* renamed from: c */
    public final List m17844c() {
        ArrayList arrayList;
        this.f14820r.clear();
        this.f14819q.clear();
        synchronized (this.f14810h) {
            arrayList = new ArrayList(this.f14810h.m17559l());
            C24848g0 c24848g0 = C24848g0.f119245a;
        }
        int size = arrayList.size();
        for (int i11 = 0; i11 < size; i11++) {
            C7906d c7906d = (C7906d) arrayList.get(i11);
            int size2 = c7906d.m40823l().size();
            for (int i12 = 0; i12 < size2; i12++) {
                MediaStoreItem mediaStoreItem = (MediaStoreItem) c7906d.m40823l().get(i12);
                if (!mediaStoreItem.m40596j0()) {
                    ItemAlbumMobile itemAlbumMobile = new ItemAlbumMobile();
                    itemAlbumMobile.m40512W(mediaStoreItem, this.f14804b, false);
                    this.f14820r.add(itemAlbumMobile);
                    this.f14819q.put(mediaStoreItem.m40571M(), itemAlbumMobile);
                }
            }
        }
        return this.f14820r;
    }

    /* renamed from: d */
    public final Pattern m17845d() {
        return this.f14808f;
    }

    /* renamed from: e */
    public final AbstractC3498e m17846e(EnumC2382z enumC2382z) {
        AbstractC19074t.m100208f(enumC2382z, "mediaType");
        int i11 = b.f14821a[enumC2382z.ordinal()];
        if (i11 != 1) {
            if (i11 != 2) {
                return this.f14810h;
            }
            return this.f14811i;
        }
        return this.f14812j;
    }

    /* renamed from: f */
    public final Map m17847f() {
        return (Map) this.f14813k.getValue();
    }

    /* renamed from: g */
    public final List m17848g() {
        return this.f14809g;
    }

    /* renamed from: h */
    public final MediaStoreSearchPage.EnumC12391a m17849h() {
        return this.f14805c;
    }

    /* renamed from: i */
    public final C3525t m17850i() {
        return this.f14814l;
    }

    /* renamed from: j */
    public final List m17851j(EnumC2382z enumC2382z) {
        List m17559l;
        AbstractC19074t.m100208f(enumC2382z, "mediaType");
        synchronized (this) {
            try {
                int i11 = b.f14821a[enumC2382z.ordinal()];
                if (i11 != 1) {
                    if (i11 != 2) {
                        m17559l = this.f14810h.m17559l();
                    } else {
                        m17559l = this.f14811i.m17559l();
                    }
                } else {
                    m17559l = this.f14812j.m17559l();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return m17559l;
    }

    /* renamed from: k */
    public final List m17852k() {
        return this.f14817o;
    }

    /* renamed from: l */
    public final int m17853l() {
        return this.f14806d;
    }

    /* renamed from: m */
    public final boolean m17854m() {
        return !this.f14817o.isEmpty();
    }

    /* renamed from: o */
    public final boolean m17855o() {
        if (!this.f14815m.get() && !this.f14810h.m17567u() && !this.f14812j.m17567u() && !this.f14811i.m17567u()) {
            return false;
        }
        return true;
    }

    /* renamed from: p */
    public final boolean m17856p(EnumC2382z enumC2382z) {
        AbstractC19074t.m100208f(enumC2382z, "mediaType");
        int i11 = b.f14821a[enumC2382z.ordinal()];
        if (i11 != 1) {
            if (i11 != 2) {
                if (i11 != 3) {
                    if (i11 != 4) {
                        return m17855o();
                    }
                    return this.f14815m.get();
                }
                return this.f14810h.m17567u();
            }
            return this.f14811i.m17567u();
        }
        return this.f14812j.m17567u();
    }

    /* renamed from: r */
    public final void m17857r() {
        m17843b();
        this.f14806d = 0;
        String m120002o = AbstractC23262x6.m120002o(this.f14803a);
        AbstractC19074t.m100207e(m120002o, "convertSignToNoSign(...)");
        this.f14807e = m120002o;
        this.f14808f = null;
        this.f14809g.clear();
        this.f14810h.m17544A();
        this.f14811i.m17544A();
        this.f14812j.m17544A();
        this.f14814l = null;
        this.f14815m.compareAndSet(true, false);
        m17847f().clear();
        this.f14816n = true;
    }

    /* renamed from: s */
    public final void m17858s(MediaStoreItem mediaStoreItem, boolean z11) {
        AbstractC19074t.m100208f(mediaStoreItem, "item");
        mediaStoreItem.m40558A0(z11);
        boolean m17840n = m17840n(mediaStoreItem);
        if (z11) {
            if (!m17840n) {
                this.f14817o.add(mediaStoreItem);
                this.f14818p.add(mediaStoreItem.m40571M());
                return;
            }
            return;
        }
        if (m17840n) {
            m17841q(mediaStoreItem);
        }
    }

    /* renamed from: t */
    public final void m17859t(List list, EnumC2382z enumC2382z) {
        AbstractC19074t.m100208f(enumC2382z, "mediaType");
        int i11 = b.f14821a[enumC2382z.ordinal()];
        if (i11 != 1) {
            if (i11 != 2) {
                if (i11 == 3) {
                    C3506i c3506i = this.f14810h;
                    c3506i.m17559l().clear();
                    if (list != null) {
                        Iterator it = list.iterator();
                        while (it.hasNext()) {
                            MediaStoreItem mediaStoreItem = (MediaStoreItem) it.next();
                            C23250w4.f112644a.m119829b(mediaStoreItem, c3506i.m17559l());
                            mediaStoreItem.m40558A0(this.f14818p.contains(mediaStoreItem.m40599m().m95029V3()));
                        }
                    }
                    for (C7906d c7906d : c3506i.m17559l()) {
                        c7906d.m40835x();
                        C23250w4.f112644a.m119838j0(c7906d.m40823l(), C3499e0.Companion.m17646b());
                    }
                    return;
                }
                return;
            }
            synchronized (this.f14811i) {
                try {
                    this.f14811i.m17559l().clear();
                    if (list != null) {
                        Iterator it2 = list.iterator();
                        while (it2.hasNext()) {
                            MediaStoreItem mediaStoreItem2 = (MediaStoreItem) it2.next();
                            C23250w4.f112644a.m119829b(mediaStoreItem2, this.f14811i.m17559l());
                            mediaStoreItem2.m40558A0(this.f14818p.contains(mediaStoreItem2.m40599m().m95029V3()));
                        }
                    }
                    Iterator it3 = this.f14811i.m17559l().iterator();
                    while (it3.hasNext()) {
                        ((C7906d) it3.next()).m40835x();
                    }
                    C24848g0 c24848g0 = C24848g0.f119245a;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return;
        }
        synchronized (this.f14812j) {
            try {
                this.f14812j.m17559l().clear();
                if (list != null) {
                    Iterator it4 = list.iterator();
                    while (it4.hasNext()) {
                        MediaStoreItem mediaStoreItem3 = (MediaStoreItem) it4.next();
                        C23250w4.f112644a.m119829b(mediaStoreItem3, this.f14812j.m17559l());
                        mediaStoreItem3.m40558A0(this.f14818p.contains(mediaStoreItem3.m40599m().m95029V3()));
                    }
                }
                Iterator it5 = this.f14812j.m17559l().iterator();
                while (it5.hasNext()) {
                    ((C7906d) it5.next()).m40835x();
                }
                C24848g0 c24848g02 = C24848g0.f119245a;
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    /* renamed from: u */
    public final void m17860u(List list) {
        AbstractC19074t.m100208f(list, "items");
        synchronized (this.f14809g) {
            this.f14809g.clear();
            this.f14809g.addAll(list);
        }
        this.f14815m.compareAndSet(true, false);
    }

    /* renamed from: v */
    public final void m17861v(MediaStoreSearchPage.EnumC12391a enumC12391a) {
        AbstractC19074t.m100208f(enumC12391a, "<set-?>");
        this.f14805c = enumC12391a;
    }

    /* renamed from: w */
    public final void m17862w(C3525t c3525t) {
        this.f14814l = c3525t;
    }

    /* renamed from: x */
    public final void m17863x() {
        this.f14815m.compareAndSet(false, true);
    }

    /* renamed from: y */
    public final void m17864y(int i11) {
        this.f14806d = i11;
    }
}
