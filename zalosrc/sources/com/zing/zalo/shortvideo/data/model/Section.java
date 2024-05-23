package com.zing.zalo.shortvideo.data.model;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.work.AbstractC2147g0;
import com.zing.zalo.shortvideo.data.model.Section;
import en0.InterfaceC18505l;
import fn0.AbstractC19060k;
import fn0.AbstractC19061k0;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.encoding.InterfaceC21885c;
import kotlinx.serialization.encoding.InterfaceC21886d;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import mn0.InterfaceC23364b;
import pm0.C24848g0;
import qm0.AbstractC25368s;
import qn0.C25390e;
import qn0.InterfaceC25392g;
import rn0.AbstractC25935a;
import s20.AbstractC26106h;
import sn0.AbstractC26340g;
import sn0.C26334a;
import tn0.AbstractC26805k1;
import tn0.C26788f;
import tn0.C26794h;
import tn0.C26810m0;
import tn0.C26814n1;

@InterfaceC25392g
/* loaded from: classes5.dex */
public final class Section<T extends Parcelable> implements Parcelable {
    public static final CREATOR CREATOR = new CREATOR(null);

    /* renamed from: s */
    private static final KSerializer[] f49962s = {null, null, new C25390e("com.zing.zalo.shortvideo.data.model.LoadMoreInfo", AbstractC19061k0.m100169b(LoadMoreInfo.class), new InterfaceC23364b[]{AbstractC19061k0.m100169b(CursorLoadMoreInfo.class), AbstractC19061k0.m100169b(PagingLoadMoreInfo.class)}, new KSerializer[]{CursorLoadMoreInfo$$serializer.INSTANCE, PagingLoadMoreInfo$$serializer.INSTANCE}, new Annotation[0])};

    /* renamed from: t */
    private static final SerialDescriptor f49963t;

    /* renamed from: p */
    private List f49964p;

    /* renamed from: q */
    private long f49965q;

    /* renamed from: r */
    private LoadMoreInfo f49966r;

    /* loaded from: classes5.dex */
    public static final class CREATOR implements Parcelable.Creator<Section<Parcelable>> {
        private CREATOR() {
        }

        public /* synthetic */ CREATOR(AbstractC19060k abstractC19060k) {
            this();
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public Section createFromParcel(Parcel parcel) {
            AbstractC19074t.m100208f(parcel, "parcel");
            return new Section(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public Section[] newArray(int i11) {
            return new Section[i11];
        }

        public final <T0> KSerializer serializer(KSerializer kSerializer) {
            AbstractC19074t.m100208f(kSerializer, "typeSerial0");
            return new Section$$serializer(kSerializer);
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.data.model.Section$a */
    /* loaded from: classes5.dex */
    public static final class C9424a implements KSerializer {

        /* renamed from: a */
        private final KSerializer f49967a;

        /* renamed from: b */
        private final SerialDescriptor f49968b;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: com.zing.zalo.shortvideo.data.model.Section$a$a */
        /* loaded from: classes5.dex */
        public static final class a extends AbstractC19075u implements InterfaceC18505l {
            a() {
                super(1);
            }

            /* renamed from: a */
            public final void m51181a(C26334a c26334a) {
                List m131502j;
                List m131502j2;
                List m131502j3;
                List m131502j4;
                List m131502j5;
                List m131502j6;
                List m131502j7;
                AbstractC19074t.m100208f(c26334a, "$this$buildClassSerialDescriptor");
                C26334a.m135524b(c26334a, "items", AbstractC25935a.m133617h(C9424a.this.f49967a).getDescriptor(), null, false, 12, null);
                m131502j = AbstractC25368s.m131502j();
                c26334a.m135525a("total", C26810m0.f127024a.getDescriptor(), m131502j, false);
                m131502j2 = AbstractC25368s.m131502j();
                c26334a.m135525a("hasMore", C26794h.f127000a.getDescriptor(), m131502j2, false);
                m131502j3 = AbstractC25368s.m131502j();
                C26814n1 c26814n1 = C26814n1.f127034a;
                c26334a.m135525a("cursor", c26814n1.getDescriptor(), m131502j3, false);
                m131502j4 = AbstractC25368s.m131502j();
                c26334a.m135525a("lastId", c26814n1.getDescriptor(), m131502j4, false);
                m131502j5 = AbstractC25368s.m131502j();
                c26334a.m135525a("lastIndex", c26814n1.getDescriptor(), m131502j5, false);
                m131502j6 = AbstractC25368s.m131502j();
                c26334a.m135525a("moreLink", c26814n1.getDescriptor(), m131502j6, false);
                m131502j7 = AbstractC25368s.m131502j();
                c26334a.m135525a("pagingExt", c26814n1.getDescriptor(), m131502j7, false);
            }

            @Override // en0.InterfaceC18505l
            /* renamed from: i9 */
            public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
                m51181a((C26334a) obj);
                return C24848g0.f119245a;
            }
        }

        public C9424a(KSerializer kSerializer) {
            AbstractC19074t.m100208f(kSerializer, "itemSerializer");
            this.f49967a = kSerializer;
            this.f49968b = AbstractC26340g.m135540b("Section", new SerialDescriptor[0], new a());
        }

        @Override // qn0.InterfaceC25386a
        /* renamed from: b */
        public Section deserialize(Decoder decoder) {
            Object m131502j;
            LoadMoreInfo loadMoreInfo;
            AbstractC19074t.m100208f(decoder, "decoder");
            m131502j = AbstractC25368s.m131502j();
            SerialDescriptor descriptor = getDescriptor();
            InterfaceC21885c mo113968b = decoder.mo113968b(descriptor);
            long j11 = 0;
            String str = "";
            String str2 = str;
            String str3 = str2;
            String str4 = str3;
            String str5 = str4;
            boolean z11 = false;
            while (true) {
                int mo114037p = mo113968b.mo114037p(getDescriptor());
                switch (mo114037p) {
                    case -1:
                        String str6 = str;
                        C24848g0 c24848g0 = C24848g0.f119245a;
                        mo113968b.mo114009c(descriptor);
                        List list = (List) m131502j;
                        if (z11) {
                            if (str4.length() > 0) {
                                loadMoreInfo = new CursorLoadMoreInfo(z11, str4, str2, str6);
                            } else {
                                loadMoreInfo = new PagingLoadMoreInfo(z11, str3, str5, str2, str6);
                            }
                        } else {
                            loadMoreInfo = null;
                        }
                        return new Section(list, j11, loadMoreInfo);
                    case 0:
                        str2 = str2;
                        m131502j = InterfaceC21885c.a.m114040c(mo113968b, getDescriptor(), 0, AbstractC25935a.m133617h(this.f49967a), null, 8, null);
                        str = str;
                        break;
                    case 1:
                        j11 = mo113968b.mo114010f(getDescriptor(), 1);
                        break;
                    case 2:
                        z11 = mo113968b.mo114004D(getDescriptor(), 2);
                        break;
                    case 3:
                        str4 = mo113968b.mo114014o(getDescriptor(), 3);
                        break;
                    case 4:
                        str3 = mo113968b.mo114014o(getDescriptor(), 4);
                        break;
                    case 5:
                        str5 = mo113968b.mo114014o(getDescriptor(), 5);
                        break;
                    case 6:
                        str2 = mo113968b.mo114014o(getDescriptor(), 6);
                        break;
                    case 7:
                        str = mo113968b.mo114014o(getDescriptor(), 7);
                        break;
                    default:
                        throw new IllegalStateException(("Unexpected index: " + mo114037p).toString());
                }
            }
        }

        @Override // qn0.InterfaceC25393h
        /* renamed from: c */
        public void serialize(Encoder encoder, Section section) {
            AbstractC19074t.m100208f(encoder, "encoder");
            AbstractC19074t.m100208f(section, "value");
            throw new IllegalStateException("Too complicated to serialize.".toString());
        }

        @Override // kotlinx.serialization.KSerializer, qn0.InterfaceC25393h, qn0.InterfaceC25386a
        public SerialDescriptor getDescriptor() {
            return this.f49968b;
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.data.model.Section$b */
    /* loaded from: classes5.dex */
    public static final class C9425b extends AbstractC19075u implements InterfaceC18505l {

        /* renamed from: q */
        public static final C9425b f49970q = new C9425b();

        C9425b() {
            super(1);
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: a */
        public final Boolean mo205i9(Parcelable parcelable) {
            AbstractC19074t.m100208f(parcelable, "it");
            return Boolean.TRUE;
        }
    }

    static {
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.zing.zalo.shortvideo.data.model.Section", null, 3);
        pluginGeneratedSerialDescriptor.m114047n("items", true);
        pluginGeneratedSerialDescriptor.m114047n("total", true);
        pluginGeneratedSerialDescriptor.m114047n("loadMoreInfo", true);
        f49963t = pluginGeneratedSerialDescriptor;
    }

    public /* synthetic */ Section(int i11, List list, long j11, LoadMoreInfo loadMoreInfo, AbstractC26805k1 abstractC26805k1) {
        this.f49964p = (i11 & 1) == 0 ? AbstractC25368s.m131502j() : list;
        if ((i11 & 2) == 0) {
            this.f49965q = 0L;
        } else {
            this.f49965q = j11;
        }
        if ((i11 & 4) == 0) {
            this.f49966r = null;
        } else {
            this.f49966r = loadMoreInfo;
        }
    }

    /* renamed from: f */
    public static final int m51158f(InterfaceC18505l interfaceC18505l, Parcelable parcelable, Parcelable parcelable2) {
        AbstractC19074t.m100208f(interfaceC18505l, "$selector");
        AbstractC19074t.m100205c(parcelable);
        Object mo205i9 = interfaceC18505l.mo205i9(parcelable);
        AbstractC19074t.m100205c(parcelable2);
        if (AbstractC19074t.m100204b(mo205i9, interfaceC18505l.mo205i9(parcelable2))) {
            return 0;
        }
        return -1;
    }

    /* renamed from: h */
    public static final int m51159h(InterfaceC18505l interfaceC18505l, Parcelable parcelable, Parcelable parcelable2) {
        AbstractC19074t.m100208f(interfaceC18505l, "$selector");
        AbstractC19074t.m100205c(parcelable);
        Object mo205i9 = interfaceC18505l.mo205i9(parcelable);
        AbstractC19074t.m100205c(parcelable2);
        if (AbstractC19074t.m100204b(mo205i9, interfaceC18505l.mo205i9(parcelable2))) {
            return 0;
        }
        return -1;
    }

    /* renamed from: k */
    public static /* synthetic */ Section m51160k(Section section, InterfaceC18505l interfaceC18505l, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            interfaceC18505l = C9425b.f49970q;
        }
        return section.m51166j(interfaceC18505l);
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0014, code lost:            if (fn0.AbstractC19074t.m100204b(r2, r3) == false) goto L29;     */
    /* renamed from: x */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ void m51161x(Section section, InterfaceC21886d interfaceC21886d, SerialDescriptor serialDescriptor, KSerializer kSerializer) {
        List m131502j;
        KSerializer[] kSerializerArr = f49962s;
        if (!interfaceC21886d.mo114019A(serialDescriptor, 0)) {
            List list = section.f49964p;
            m131502j = AbstractC25368s.m131502j();
        }
        interfaceC21886d.mo114029i(serialDescriptor, 0, new C26788f(kSerializer), section.f49964p);
        if (interfaceC21886d.mo114019A(serialDescriptor, 1) || section.f49965q != 0) {
            interfaceC21886d.mo114022E(serialDescriptor, 1, section.f49965q);
        }
        if (interfaceC21886d.mo114019A(serialDescriptor, 2) || section.f49966r != null) {
            interfaceC21886d.mo114028h(serialDescriptor, 2, kSerializerArr[2], section.f49966r);
        }
    }

    /* renamed from: d */
    public final void m51162d(Section section, Comparator comparator) {
        AbstractC19074t.m100208f(section, "section");
        if (comparator != null) {
            ArrayList arrayList = new ArrayList();
            arrayList.addAll(this.f49964p);
            for (Parcelable parcelable : section.f49964p) {
                if (!m51167l(parcelable, comparator)) {
                    arrayList.add(parcelable);
                }
            }
            this.f49964p = arrayList;
        }
        this.f49966r = section.f49966r;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* renamed from: e */
    public final void m51163e(Section section, InterfaceC18505l interfaceC18505l) {
        AbstractC19074t.m100208f(section, "section");
        AbstractC19074t.m100208f(interfaceC18505l, "selector");
        m51162d(section, new Comparator() { // from class: b10.h
            public /* synthetic */ C2489h() {
            }

            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                int m51158f;
                m51158f = Section.m51158f(InterfaceC18505l.this, (Parcelable) obj, (Parcelable) obj2);
                return m51158f;
            }
        });
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Section)) {
            return false;
        }
        Section section = (Section) obj;
        return AbstractC19074t.m100204b(this.f49964p, section.f49964p) && this.f49965q == section.f49965q && AbstractC19074t.m100204b(this.f49966r, section.f49966r);
    }

    /* renamed from: g */
    public final void m51164g(Section section, InterfaceC18505l interfaceC18505l) {
        AbstractC19074t.m100208f(section, "section");
        AbstractC19074t.m100208f(interfaceC18505l, "selector");
        m51165i(section, new Comparator() { // from class: b10.i
            public /* synthetic */ C2490i() {
            }

            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                int m51159h;
                m51159h = Section.m51159h(InterfaceC18505l.this, (Parcelable) obj, (Parcelable) obj2);
                return m51159h;
            }
        });
    }

    public int hashCode() {
        int hashCode = ((this.f49964p.hashCode() * 31) + AbstractC2147g0.m11521a(this.f49965q)) * 31;
        LoadMoreInfo loadMoreInfo = this.f49966r;
        return hashCode + (loadMoreInfo == null ? 0 : loadMoreInfo.hashCode());
    }

    /* renamed from: i */
    public final void m51165i(Section section, Comparator comparator) {
        AbstractC19074t.m100208f(section, "section");
        if (comparator != null) {
            ArrayList arrayList = new ArrayList();
            arrayList.addAll(this.f49964p);
            for (Parcelable parcelable : section.f49964p) {
                if (!m51167l(parcelable, comparator)) {
                    arrayList.add(0, parcelable);
                }
            }
            this.f49964p = arrayList;
        }
    }

    /* renamed from: j */
    public final Section m51166j(InterfaceC18505l interfaceC18505l) {
        AbstractC19074t.m100208f(interfaceC18505l, "filter");
        List list = this.f49964p;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (((Boolean) interfaceC18505l.mo205i9(obj)).booleanValue()) {
                arrayList.add(obj);
            }
        }
        return new Section(arrayList, this.f49965q, this.f49966r);
    }

    /* renamed from: l */
    public final boolean m51167l(Parcelable parcelable, Comparator comparator) {
        AbstractC19074t.m100208f(parcelable, "candidate");
        AbstractC19074t.m100208f(comparator, "comparator");
        Iterator it = this.f49964p.iterator();
        while (it.hasNext()) {
            if (comparator.compare((Parcelable) it.next(), parcelable) == 0) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: m */
    public final List m51168m() {
        return this.f49964p;
    }

    /* renamed from: n */
    public final LoadMoreInfo m51169n() {
        return this.f49966r;
    }

    /* renamed from: o */
    public final long m51170o() {
        return this.f49965q;
    }

    /* renamed from: p */
    public final LoadMoreInfo m51171p() {
        LoadMoreInfo loadMoreInfo = this.f49966r;
        if (loadMoreInfo == null || !loadMoreInfo.isValid()) {
            return null;
        }
        return loadMoreInfo;
    }

    /* renamed from: q */
    public final void m51172q(List list) {
        AbstractC19074t.m100208f(list, "<set-?>");
        this.f49964p = list;
    }

    /* renamed from: t */
    public final void m51173t(LoadMoreInfo loadMoreInfo) {
        this.f49966r = loadMoreInfo;
    }

    public String toString() {
        return "Section(items=" + this.f49964p + ", total=" + this.f49965q + ", loadMoreInfo=" + this.f49966r + ")";
    }

    /* renamed from: u */
    public final void m51174u(long j11) {
        this.f49965q = j11;
    }

    /* renamed from: w */
    public final int m51175w() {
        return this.f49964p.size();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i11) {
        AbstractC19074t.m100208f(parcel, "dest");
        AbstractC26106h.m134353c(parcel, this.f49964p, i11);
        parcel.writeLong(this.f49965q);
        AbstractC26106h.m134354d(parcel, this.f49966r, i11);
    }

    public Section(List list, long j11, LoadMoreInfo loadMoreInfo) {
        AbstractC19074t.m100208f(list, "items");
        this.f49964p = list;
        this.f49965q = j11;
        this.f49966r = loadMoreInfo;
    }

    public /* synthetic */ Section(List list, long j11, LoadMoreInfo loadMoreInfo, int i11, AbstractC19060k abstractC19060k) {
        this((i11 & 1) != 0 ? AbstractC25368s.m131502j() : list, (i11 & 2) != 0 ? 0L : j11, (i11 & 4) != 0 ? null : loadMoreInfo);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Section(Parcel parcel) {
        this(AbstractC26106h.m134351a(parcel), parcel.readLong(), (LoadMoreInfo) AbstractC26106h.m134352b(parcel));
        AbstractC19074t.m100208f(parcel, "parcel");
    }
}
