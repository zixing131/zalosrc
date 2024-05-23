package com.zing.zalo.control;

import android.text.TextUtils;
import au.EnumC2381y;
import com.zing.zalo.control.C7906d;
import com.zing.zalo.control.MediaStoreItem;
import en0.InterfaceC18494a;
import en0.InterfaceC18509p;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import me0.C23250w4;
import mm0.AbstractC23350e;
import org.json.JSONArray;
import org.json.JSONObject;
import p716zh.C31950hc;
import pm0.AbstractC24856m;
import pm0.C24848g0;
import pm0.InterfaceC24854k;
import qm0.AbstractC25376w;

/* renamed from: com.zing.zalo.control.d */
/* loaded from: classes3.dex */
public final class C7906d {
    public static final a Companion = new a(null);

    /* renamed from: a */
    private b f42772a;

    /* renamed from: b */
    private final List f42773b;

    /* renamed from: c */
    private boolean f42774c;

    /* renamed from: d */
    private boolean f42775d;

    /* renamed from: e */
    private EnumC2381y f42776e;

    /* renamed from: com.zing.zalo.control.d$a */
    /* loaded from: classes3.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC19060k abstractC19060k) {
            this();
        }

        /* renamed from: a */
        public final C7906d m40837a(long j11) {
            C7906d c7906d = new C7906d(null);
            c7906d.m40831t(new b(j11));
            return c7906d;
        }
    }

    /* renamed from: com.zing.zalo.control.d$c */
    /* loaded from: classes3.dex */
    public static final class c extends AbstractC19075u implements InterfaceC18509p {

        /* renamed from: q */
        public static final c f42786q = new c();

        c() {
            super(2);
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: a */
        public final Integer mo240pC(MediaStoreItem mediaStoreItem, MediaStoreItem mediaStoreItem2) {
            AbstractC19074t.m100208f(mediaStoreItem, "o1");
            AbstractC19074t.m100208f(mediaStoreItem2, "o2");
            return Integer.valueOf(mediaStoreItem.m40563D() - mediaStoreItem2.m40563D());
        }
    }

    public C7906d(JSONObject jSONObject) {
        JSONArray jSONArray;
        List synchronizedList = Collections.synchronizedList(new ArrayList());
        AbstractC19074t.m100207e(synchronizedList, "synchronizedList(...)");
        this.f42773b = synchronizedList;
        this.f42776e = EnumC2381y.f9939p;
        if (jSONObject != null) {
            try {
                if (!jSONObject.isNull("header") && jSONObject.getJSONObject("header").length() > 0) {
                    this.f42772a = new b(jSONObject.getJSONObject("header"));
                }
                if (!jSONObject.isNull("content")) {
                    jSONArray = jSONObject.getJSONArray("content");
                } else {
                    jSONArray = null;
                }
                int i11 = 0;
                if (jSONArray != null) {
                    int length = jSONArray.length();
                    int i12 = 0;
                    while (i11 < length) {
                        JSONObject jSONObject2 = jSONArray.getJSONObject(i11);
                        boolean has = jSONObject2.has("layout");
                        m40814c(new MediaStoreItem(jSONObject2));
                        i11++;
                        i12 = has;
                    }
                    i11 = i12;
                }
                this.f42774c = jSONObject.optBoolean("isSelected");
                if (i11 != 0) {
                    m40836z();
                    return;
                }
            } catch (Exception e11) {
                e11.printStackTrace();
                return;
            }
        }
        m40835x();
    }

    /* renamed from: A */
    public static final int m40810A(InterfaceC18509p interfaceC18509p, Object obj, Object obj2) {
        AbstractC19074t.m100208f(interfaceC18509p, "$tmp0");
        return ((Number) interfaceC18509p.mo240pC(obj, obj2)).intValue();
    }

    /* renamed from: y */
    public static final int m40813y(MediaStoreItem mediaStoreItem, MediaStoreItem mediaStoreItem2) {
        AbstractC19074t.m100208f(mediaStoreItem, "item1");
        AbstractC19074t.m100208f(mediaStoreItem2, "item2");
        if (mediaStoreItem.m40599m().m95313z4() == mediaStoreItem2.m40599m().m95313z4()) {
            return 0;
        }
        if (mediaStoreItem.m40599m().m95313z4() - mediaStoreItem2.m40599m().m95313z4() > 0) {
            return -1;
        }
        return 1;
    }

    /* renamed from: c */
    public final void m40814c(MediaStoreItem mediaStoreItem) {
        AbstractC19074t.m100208f(mediaStoreItem, "item");
        synchronized (this.f42773b) {
            try {
                Iterator it = this.f42773b.iterator();
                while (true) {
                    if (it.hasNext()) {
                        MediaStoreItem mediaStoreItem2 = (MediaStoreItem) it.next();
                        if (AbstractC19074t.m100204b(mediaStoreItem2.m40571M(), mediaStoreItem.m40571M())) {
                            if (mediaStoreItem2.m40600m0()) {
                                mediaStoreItem2.m40565E0(mediaStoreItem.m40599m());
                            }
                        }
                    } else {
                        this.f42773b.add(mediaStoreItem);
                        break;
                    }
                }
                C24848g0 c24848g0 = C24848g0.f119245a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: d */
    public final void m40815d(List list) {
        if (list != null) {
            try {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    m40814c((MediaStoreItem) it.next());
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    /* renamed from: e */
    public final boolean m40816e(MediaStoreItem mediaStoreItem) {
        boolean z11;
        AbstractC19074t.m100208f(mediaStoreItem, "item");
        synchronized (this.f42773b) {
            try {
                List list = this.f42773b;
                z11 = false;
                if (!(list instanceof Collection) || !list.isEmpty()) {
                    Iterator it = list.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        if (AbstractC19074t.m100204b(((MediaStoreItem) it.next()).m40571M(), mediaStoreItem.m40571M())) {
                            z11 = true;
                            break;
                        }
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return z11;
    }

    /* renamed from: f */
    public final long m40817f() {
        b bVar = this.f42772a;
        if (bVar != null) {
            return bVar.m40841a();
        }
        return 0L;
    }

    /* renamed from: g */
    public final long m40818g() {
        b bVar = this.f42772a;
        if (bVar != null) {
            return bVar.m40842b();
        }
        return 0L;
    }

    /* renamed from: h */
    public final b m40819h() {
        return this.f42772a;
    }

    /* renamed from: i */
    public final MediaStoreItem m40820i() {
        MediaStoreItem mediaStoreItem;
        synchronized (this.f42773b) {
            if (!this.f42773b.isEmpty()) {
                mediaStoreItem = (MediaStoreItem) this.f42773b.get(r1.size() - 1);
            } else {
                mediaStoreItem = null;
            }
        }
        return mediaStoreItem;
    }

    /* renamed from: j */
    public final int m40821j() {
        int i11;
        synchronized (this.f42773b) {
            try {
                if (!this.f42773b.isEmpty()) {
                    i11 = ((MediaStoreItem) this.f42773b.get(this.f42773b.size() - 1)).m40559B().m40622b();
                } else {
                    i11 = 0;
                }
                C24848g0 c24848g0 = C24848g0.f119245a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return i11;
    }

    /* renamed from: k */
    public final List m40822k() {
        C31950hc c31950hc;
        int i11;
        ArrayList arrayList = new ArrayList();
        try {
            c31950hc = C31950hc.f146830a;
            i11 = 0;
        } catch (Exception e11) {
            e11.printStackTrace();
        }
        if (c31950hc.m153634E()) {
            List m153642t = c31950hc.m153642t();
            ArrayList arrayList2 = new ArrayList(this.f42773b);
            Iterator it = arrayList2.iterator();
            AbstractC19074t.m100207e(it, "iterator(...)");
            while (it.hasNext()) {
                MediaStoreItem mediaStoreItem = (MediaStoreItem) it.next();
                if (m153642t != null && m153642t.contains(mediaStoreItem.m40571M())) {
                    it.remove();
                }
            }
            synchronized (arrayList2) {
                try {
                    if (!arrayList2.isEmpty()) {
                        C23250w4.f112644a.m119838j0(arrayList2, this.f42776e);
                        int m40563D = ((MediaStoreItem) arrayList2.get(0)).m40563D();
                        int size = arrayList2.size();
                        if (size >= 0) {
                            int i12 = 0;
                            while (true) {
                                if (i11 == arrayList2.size()) {
                                    arrayList.add(new ArrayList(arrayList2.subList(i12, i11)));
                                } else {
                                    MediaStoreItem mediaStoreItem2 = (MediaStoreItem) arrayList2.get(i11);
                                    if (m40563D != mediaStoreItem2.m40563D()) {
                                        arrayList.add(new ArrayList(arrayList2.subList(i12, i11)));
                                        m40563D = mediaStoreItem2.m40563D();
                                        i12 = i11;
                                    }
                                }
                                if (i11 == size) {
                                    break;
                                }
                                i11++;
                            }
                        }
                    }
                    C24848g0 c24848g0 = C24848g0.f119245a;
                } finally {
                }
            }
            return arrayList;
        }
        synchronized (this.f42773b) {
            try {
                if (!this.f42773b.isEmpty()) {
                    int m40563D2 = ((MediaStoreItem) this.f42773b.get(0)).m40563D();
                    int size2 = this.f42773b.size();
                    if (size2 >= 0) {
                        int i13 = 0;
                        while (true) {
                            if (i11 == this.f42773b.size()) {
                                arrayList.add(new ArrayList(this.f42773b.subList(i13, i11)));
                            } else {
                                MediaStoreItem mediaStoreItem3 = (MediaStoreItem) this.f42773b.get(i11);
                                if (m40563D2 != mediaStoreItem3.m40563D()) {
                                    arrayList.add(new ArrayList(this.f42773b.subList(i13, i11)));
                                    m40563D2 = mediaStoreItem3.m40563D();
                                    i13 = i11;
                                }
                            }
                            if (i11 == size2) {
                                break;
                            }
                            i11++;
                        }
                    }
                }
                C24848g0 c24848g02 = C24848g0.f119245a;
            } finally {
            }
        }
        return arrayList;
        e11.printStackTrace();
        return arrayList;
    }

    /* renamed from: l */
    public final List m40823l() {
        return this.f42773b;
    }

    /* renamed from: m */
    public final int m40824m() {
        int size;
        synchronized (this.f42773b) {
            size = this.f42773b.size();
        }
        return size;
    }

    /* renamed from: n */
    public final boolean m40825n() {
        return this.f42772a != null;
    }

    /* renamed from: o */
    public final boolean m40826o() {
        b bVar = this.f42772a;
        if (bVar == null || !bVar.m40844g()) {
            return false;
        }
        return true;
    }

    /* renamed from: p */
    public final boolean m40827p() {
        boolean z11;
        synchronized (this.f42773b) {
            z11 = !this.f42773b.isEmpty();
        }
        return z11;
    }

    /* renamed from: q */
    public final boolean m40828q() {
        synchronized (this.f42773b) {
            Iterator it = this.f42773b.iterator();
            while (it.hasNext()) {
                if (!((MediaStoreItem) it.next()).m40597k0()) {
                    return false;
                }
            }
            return true;
        }
    }

    /* renamed from: r */
    public final boolean m40829r() {
        return this.f42774c;
    }

    /* renamed from: s */
    public final boolean m40830s() {
        return this.f42775d;
    }

    /* renamed from: t */
    public final void m40831t(b bVar) {
        this.f42772a = bVar;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        Iterator it = this.f42773b.iterator();
        while (it.hasNext()) {
            sb2.append((MediaStoreItem) it.next());
            sb2.append(" ");
        }
        return "MediaStoreAlbumItem{" + ((Object) sb2) + "}";
    }

    /* renamed from: u */
    public final void m40832u(EnumC2381y enumC2381y) {
        AbstractC19074t.m100208f(enumC2381y, "<set-?>");
        this.f42776e = enumC2381y;
    }

    /* renamed from: v */
    public final void m40833v(boolean z11) {
        this.f42774c = z11;
    }

    /* renamed from: w */
    public final void m40834w(boolean z11) {
        this.f42775d = z11;
    }

    /* renamed from: x */
    public final void m40835x() {
        try {
            if (!this.f42773b.isEmpty()) {
                AbstractC25376w.m131534w(this.f42773b, new Comparator() { // from class: zh.z6
                    @Override // java.util.Comparator
                    public final int compare(Object obj, Object obj2) {
                        int m40813y;
                        m40813y = C7906d.m40813y((MediaStoreItem) obj, (MediaStoreItem) obj2);
                        return m40813y;
                    }
                });
            }
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    /* renamed from: z */
    public final void m40836z() {
        try {
            synchronized (this.f42773b) {
                try {
                    if (!this.f42773b.isEmpty()) {
                        AbstractC25376w.m131534w(this.f42773b, new Comparator() { // from class: zh.y6
                            public /* synthetic */ C32189y6() {
                            }

                            @Override // java.util.Comparator
                            public final int compare(Object obj, Object obj2) {
                                int m40810A;
                                m40810A = C7906d.m40810A(InterfaceC18509p.this, obj, obj2);
                                return m40810A;
                            }
                        });
                    }
                    C24848g0 c24848g0 = C24848g0.f119245a;
                } finally {
                }
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: com.zing.zalo.control.d$b */
    /* loaded from: classes3.dex */
    public static final class b {

        /* renamed from: a */
        private String f42777a;

        /* renamed from: b */
        private long f42778b;

        /* renamed from: c */
        private long f42779c;

        /* renamed from: d */
        private final InterfaceC24854k f42780d;

        /* renamed from: e */
        private final InterfaceC24854k f42781e;

        /* renamed from: f */
        private final InterfaceC24854k f42782f;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: com.zing.zalo.control.d$b$a */
        /* loaded from: classes3.dex */
        public static final class a extends AbstractC19075u implements InterfaceC18494a {

            /* renamed from: q */
            public static final a f42783q = new a();

            a() {
                super(0);
            }

            @Override // en0.InterfaceC18494a
            /* renamed from: a */
            public final Set mo12V4() {
                return new LinkedHashSet();
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: com.zing.zalo.control.d$b$b */
        /* loaded from: classes3.dex */
        public static final class C32706b extends AbstractC19075u implements InterfaceC18494a {

            /* renamed from: q */
            public static final C32706b f42784q = new C32706b();

            C32706b() {
                super(0);
            }

            @Override // en0.InterfaceC18494a
            /* renamed from: a */
            public final Set mo12V4() {
                return new LinkedHashSet();
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: com.zing.zalo.control.d$b$c */
        /* loaded from: classes3.dex */
        public static final class c extends AbstractC19075u implements InterfaceC18494a {

            /* renamed from: q */
            public static final c f42785q = new c();

            c() {
                super(0);
            }

            @Override // en0.InterfaceC18494a
            /* renamed from: a */
            public final Set mo12V4() {
                return new LinkedHashSet();
            }
        }

        public b(long j11) {
            InterfaceC24854k m129210a;
            InterfaceC24854k m129210a2;
            InterfaceC24854k m129210a3;
            m129210a = AbstractC24856m.m129210a(c.f42785q);
            this.f42780d = m129210a;
            m129210a2 = AbstractC24856m.m129210a(C32706b.f42784q);
            this.f42781e = m129210a2;
            m129210a3 = AbstractC24856m.m129210a(a.f42783q);
            this.f42782f = m129210a3;
            this.f42778b = j11;
        }

        /* renamed from: c */
        private final Set m40838c() {
            return (Set) this.f42782f.getValue();
        }

        /* renamed from: d */
        private final Set m40839d() {
            return (Set) this.f42781e.getValue();
        }

        /* renamed from: e */
        private final Set m40840e() {
            return (Set) this.f42780d.getValue();
        }

        /* renamed from: a */
        public final long m40841a() {
            return this.f42779c;
        }

        /* renamed from: b */
        public final long m40842b() {
            return this.f42778b;
        }

        /* renamed from: f */
        public final String m40843f() {
            return this.f42777a;
        }

        /* renamed from: g */
        public final boolean m40844g() {
            if (TextUtils.isEmpty(this.f42777a) && this.f42778b <= 0) {
                return false;
            }
            return true;
        }

        /* renamed from: h */
        public final void m40845h(long j11) {
            this.f42779c = j11;
        }

        public b(JSONObject jSONObject) {
            InterfaceC24854k m129210a;
            InterfaceC24854k m129210a2;
            InterfaceC24854k m129210a3;
            m129210a = AbstractC24856m.m129210a(c.f42785q);
            this.f42780d = m129210a;
            m129210a2 = AbstractC24856m.m129210a(C32706b.f42784q);
            this.f42781e = m129210a2;
            m129210a3 = AbstractC24856m.m129210a(a.f42783q);
            this.f42782f = m129210a3;
            if (jSONObject != null) {
                try {
                    this.f42777a = jSONObject.optString("title");
                    this.f42778b = jSONObject.optLong("createdTime");
                    this.f42779c = jSONObject.optLong("albumId");
                    if (jSONObject.has("allItems")) {
                        m40840e().clear();
                        m40839d().clear();
                        m40838c().clear();
                        JSONObject optJSONObject = jSONObject.optJSONObject("allItems");
                        if (optJSONObject != null) {
                            JSONArray optJSONArray = optJSONObject.optJSONArray("mediaItems");
                            if (optJSONArray != null) {
                                int length = optJSONArray.length();
                                for (int i11 = 0; i11 < length; i11++) {
                                    m40840e().add(Long.valueOf(optJSONArray.getLong(i11)));
                                }
                            }
                            JSONArray optJSONArray2 = optJSONObject.optJSONArray("linkItems");
                            if (optJSONArray2 != null) {
                                int length2 = optJSONArray2.length();
                                for (int i12 = 0; i12 < length2; i12++) {
                                    m40839d().add(Long.valueOf(optJSONArray2.getLong(i12)));
                                }
                            }
                            JSONArray optJSONArray3 = optJSONObject.optJSONArray("fileItems");
                            if (optJSONArray3 != null) {
                                int length3 = optJSONArray3.length();
                                for (int i13 = 0; i13 < length3; i13++) {
                                    m40838c().add(Long.valueOf(optJSONArray3.getLong(i13)));
                                }
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    m40840e().clear();
                } catch (Exception e11) {
                    e11.printStackTrace();
                }
            }
        }
    }
}
