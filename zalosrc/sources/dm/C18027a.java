package dm;

import au.EnumC2382z;
import com.zing.zalo.control.MediaStoreItem;
import com.zing.zalo.p062db.C7956b;
import com.zing.zalo.p062db.C7961f;
import com.zing.zalo.p062db.C7967l;
import com.zing.zalo.p062db.zadb.wrapper.ZdbApiCode;
import com.zing.zalocore.CoreUtility;
import en0.InterfaceC18494a;
import fn0.AbstractC19060k;
import fn0.AbstractC19069o0;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import ga0.InterfaceC19305a;
import gm.C19490a;
import gm.C19491b;
import gm.C19495f;
import gm.C19496g;
import gm.C19497h;
import gm.C19498i;
import hm.C20092b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import me0.AbstractC23041d2;
import mm0.AbstractC23350e;
import p056cj.C3554v;
import p248iy.AbstractC20887g;
import p300kk.C21751a;
import p300kk.C21752b;
import p300kk.C21753c;
import p461qu.AbstractC25495a;
import p620wt.AbstractC29233h;
import p620wt.InterfaceC29232g;
import th.C26688i;

/* renamed from: dm.a */
/* loaded from: classes3.dex */
public final class C18027a {

    /* renamed from: a */
    private static final boolean f91287a = false;
    public static final b Companion = new b(null);

    /* renamed from: b */
    private static final InterfaceC29232g f91288b = AbstractC29233h.m145990a(a.f91289q);

    /* renamed from: dm.a$a */
    /* loaded from: classes3.dex */
    static final class a extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final a f91289q = new a();

        a() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a */
        public final C18027a mo12V4() {
            return new C18027a(null);
        }
    }

    /* renamed from: dm.a$b */
    /* loaded from: classes3.dex */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(AbstractC19060k abstractC19060k) {
            this();
        }

        /* renamed from: a */
        public final C18027a m95862a() {
            return (C18027a) C18027a.f91288b.getValue();
        }
    }

    /* renamed from: dm.a$c */
    /* loaded from: classes3.dex */
    public /* synthetic */ class c {

        /* renamed from: a */
        public static final /* synthetic */ int[] f91290a;

        static {
            int[] iArr = new int[EnumC2382z.values().length];
            try {
                iArr[EnumC2382z.f9945r.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC2382z.f9947t.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC2382z.f9946s.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f91290a = iArr;
        }
    }

    public /* synthetic */ C18027a(AbstractC19060k abstractC19060k) {
        this();
    }

    /* renamed from: b */
    private final int[] m95848b(EnumC2382z enumC2382z) {
        int i11 = c.f91290a[enumC2382z.ordinal()];
        if (i11 != 1) {
            if (i11 != 2) {
                if (i11 != 3) {
                    return new int[]{0, 1};
                }
                return new int[]{3};
            }
            return new int[]{2};
        }
        return new int[]{0, 1};
    }

    /* renamed from: d */
    private final List m95849d(String str, EnumC2382z enumC2382z, List list) {
        long j11;
        if (list.isEmpty()) {
            return list;
        }
        if (AbstractC25495a.m132079d(str) && enumC2382z == EnumC2382z.f9945r) {
            j11 = C26688i.f126427a.m137068b();
        } else {
            j11 = 0;
        }
        if (j11 > 0) {
            ArrayList arrayList = new ArrayList();
            for (Object obj : list) {
                if (((MediaStoreItem) obj).m40599m().m95313z4() >= j11) {
                    arrayList.add(obj);
                }
            }
            if (AbstractC19069o0.m100195l(arrayList)) {
                return arrayList;
            }
            return new ArrayList(arrayList);
        }
        return list;
    }

    /* renamed from: j */
    private final void m95850j(int i11, String str, long j11) {
        AbstractC20887g.m109242t(i11, str, j11, System.currentTimeMillis());
    }

    /* renamed from: k */
    private final void m95851k(List list, C19491b c19491b) {
        for (int i11 = 0; i11 < c19491b.m101929d(); i11++) {
            C20092b c20092b = C20092b.f98828a;
            C19490a m101928c = c19491b.m101928c(i11);
            AbstractC19074t.m100207e(m101928c, "get(...)");
            MediaStoreItem mediaStoreItem = new MediaStoreItem(C20092b.m104473k(c20092b, m101928c, false, 2, null));
            if (mediaStoreItem.m40594i0() && !AbstractC23041d2.m118194A(mediaStoreItem.m40599m().m94983Q3())) {
                mediaStoreItem.m40599m().m94934Ka("");
            }
            list.add(mediaStoreItem);
        }
    }

    /* renamed from: c */
    public final int m95852c(String str, String str2, int[] iArr) {
        AbstractC19074t.m100208f(str, "conversationId");
        AbstractC19074t.m100208f(str2, "senderId");
        AbstractC19074t.m100208f(iArr, "eMediaTypes");
        long currentTimeMillis = System.currentTimeMillis();
        int i11 = 0;
        try {
            ZdbApiCode zdbApiCode = new ZdbApiCode();
            C7956b m41573b = C7956b.Companion.m41573b();
            String str3 = CoreUtility.f89233i;
            AbstractC19074t.m100207e(str3, "currentUserUid");
            int m41542i = m41573b.m41542i(str3, str, iArr, str2, Long.MIN_VALUE, Long.MAX_VALUE, zdbApiCode);
            try {
                try {
                    if (zdbApiCode.error_code != 0) {
                        C7967l.Companion.m42751f(zdbApiCode, "countMediaWithTypeAPI", str, str2, iArr.toString());
                        m95850j(124620, "[eMediaTypes:" + iArr + "][errorCode:" + zdbApiCode.error_code + "]", currentTimeMillis);
                    } else if (f91287a) {
                        long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("countEMediaType conversationId: ");
                        sb2.append(str);
                        sb2.append(", senderId: ");
                        sb2.append(str2);
                        sb2.append(", eMediaTypes: ");
                        sb2.append(iArr);
                        sb2.append(", count: ");
                        sb2.append(m41542i);
                        sb2.append(", time: ");
                        sb2.append(currentTimeMillis2);
                    }
                    return m41542i;
                } catch (Exception e11) {
                    e = e11;
                    i11 = m41542i;
                    AbstractC23350e.m122776f("MediaStoreDBV4Impl", e);
                    return i11;
                }
            } catch (Exception e12) {
                e = e12;
            }
        } catch (Exception e13) {
            e = e13;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x00b5  */
    /* renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final C21751a m95853e(String str) {
        AbstractC19074t.m100208f(str, "conversationId");
        long currentTimeMillis = System.currentTimeMillis();
        C21751a c21751a = new C21751a();
        try {
            ZdbApiCode zdbApiCode = new ZdbApiCode();
            C7956b m41573b = C7956b.Companion.m41573b();
            String str2 = CoreUtility.f89233i;
            AbstractC19074t.m100207e(str2, "currentUserUid");
            C19496g m41527S = m41573b.m41527S(str2, str, "0", zdbApiCode);
            int m101940c = m41527S.m101940c();
            for (int i11 = 0; i11 < m101940c; i11++) {
                C19495f m101939b = m41527S.m101939b(i11);
                String valueOf = String.valueOf(m101939b.f96802a);
                String str3 = m101939b.f96803b;
                AbstractC19074t.m100207e(str3, "sender_name");
                C21752b c21752b = new C21752b(valueOf, str3, m101939b.f96806e + m101939b.f96805d, m101939b.f96808g + m101939b.f96809h, m101939b.f96807f);
                if (c21752b.m112203d() + c21752b.m112202c() + c21752b.m112201b() > 0) {
                    c21751a.m112199a().put(valueOf, c21752b);
                }
            }
            int i12 = zdbApiCode.error_code;
            if (i12 != 0) {
                try {
                    m95850j(124622, "[errorCode:" + i12 + "]", currentTimeMillis);
                    C7967l.Companion.m42751f(zdbApiCode, "loadAutoCollectionBySenderList -> getMediaStatisticAPI", str);
                } catch (Exception e11) {
                    e = e11;
                    AbstractC23350e.m122776f("MediaStoreDBV4Impl", e);
                    if (f91287a) {
                    }
                    return c21751a;
                }
            }
        } catch (Exception e12) {
            e = e12;
        }
        if (f91287a) {
            int size = c21751a.m112199a().size();
            long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
            StringBuilder sb2 = new StringBuilder();
            sb2.append("loadAutoCollectionBySenderList conversationId: ");
            sb2.append(str);
            sb2.append(", size: ");
            sb2.append(size);
            sb2.append(", time: ");
            sb2.append(currentTimeMillis2);
            sb2.append(", timeProcessFilterExpiredItem: ");
            sb2.append(0L);
        }
        return c21751a;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x00d3  */
    /* renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final C21753c m95854f(String str, int i11, int i12) {
        long j11;
        int i13;
        String str2;
        boolean z11;
        ZdbApiCode zdbApiCode;
        int[] iArr;
        int i14 = i11;
        AbstractC19074t.m100208f(str, "conversationId");
        long currentTimeMillis = System.currentTimeMillis();
        List arrayList = new ArrayList();
        boolean z12 = false;
        try {
            zdbApiCode = new ZdbApiCode();
            iArr = new int[]{0};
            C7956b m41573b = C7956b.Companion.m41573b();
            String str3 = CoreUtility.f89233i;
            AbstractC19074t.m100207e(str3, "currentUserUid");
            try {
                C19491b m41528T = m41573b.m41528T(str3, str, iArr, "0", Long.MIN_VALUE, Long.MAX_VALUE, 1, i11, i12, zdbApiCode);
                i14 += m41528T.m101929d();
                try {
                    m95851k(arrayList, m41528T);
                    str2 = str;
                    i13 = i14;
                } catch (Exception e11) {
                    e = e11;
                    str2 = str;
                    i13 = i14;
                }
            } catch (Exception e12) {
                e = e12;
                str2 = str;
                i13 = i14;
                j11 = currentTimeMillis;
                arrayList = arrayList;
                i14 = i13;
            }
        } catch (Exception e13) {
            e = e13;
            j11 = currentTimeMillis;
            i13 = i14;
            str2 = str;
        }
        try {
            arrayList = m95849d(str2, EnumC2382z.f9945r, arrayList);
            if (arrayList.size() < arrayList.size()) {
                z11 = true;
            } else {
                arrayList = arrayList;
                z11 = false;
            }
            try {
                int i15 = zdbApiCode.error_code;
                if (i15 != 0) {
                    j11 = currentTimeMillis;
                    try {
                        m95850j(124628, "[errorCode:" + i15 + "]", j11);
                        C7967l.Companion.m42751f(zdbApiCode, "loadAutoCollectionPhoto->getMediaWithTypeAPI", str2, iArr.toString());
                    } catch (Exception e14) {
                        e = e14;
                        z12 = z11;
                        AbstractC23350e.m122776f("MediaStoreDBV4Impl", e);
                        z11 = z12;
                        if (f91287a) {
                        }
                        C21753c c21753c = new C21753c(i14, arrayList);
                        c21753c.m112208d(z11);
                        return c21753c;
                    }
                } else {
                    j11 = currentTimeMillis;
                }
            } catch (Exception e15) {
                e = e15;
                j11 = currentTimeMillis;
            }
        } catch (Exception e16) {
            e = e16;
            j11 = currentTimeMillis;
            arrayList = arrayList;
            AbstractC23350e.m122776f("MediaStoreDBV4Impl", e);
            z11 = z12;
            if (f91287a) {
            }
            C21753c c21753c2 = new C21753c(i14, arrayList);
            c21753c2.m112208d(z11);
            return c21753c2;
        }
        if (f91287a) {
            int size = arrayList.size();
            long currentTimeMillis2 = System.currentTimeMillis() - j11;
            StringBuilder sb2 = new StringBuilder();
            sb2.append("loadAutoCollectionPhoto: ");
            sb2.append(str2);
            sb2.append(", offset: ");
            sb2.append(i13);
            sb2.append(", newOffset: ");
            sb2.append(i14);
            sb2.append(", size: ");
            sb2.append(size);
            sb2.append(", time: ");
            sb2.append(currentTimeMillis2);
        }
        C21753c c21753c22 = new C21753c(i14, arrayList);
        c21753c22.m112208d(z11);
        return c21753c22;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x011f  */
    /* renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final C21753c m95855g(String str, String str2, EnumC2382z enumC2382z, int i11, int i12) {
        long j11;
        int i13;
        boolean z11;
        ZdbApiCode zdbApiCode;
        int i14 = i11;
        AbstractC19074t.m100208f(str, "conversationId");
        AbstractC19074t.m100208f(str2, "senderId");
        AbstractC19074t.m100208f(enumC2382z, "mediaType");
        if (f91287a) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("loadAutoCollectionSender START conversationId: ");
            sb2.append(str);
            sb2.append(" senderId: ");
            sb2.append(str2);
            sb2.append(" mediaType: ");
            sb2.append(enumC2382z);
            sb2.append(" offset: ");
            sb2.append(i14);
            sb2.append(" limit: ");
            sb2.append(i12);
        }
        long currentTimeMillis = System.currentTimeMillis();
        List arrayList = new ArrayList();
        boolean z12 = false;
        try {
            ZdbApiCode zdbApiCode2 = new ZdbApiCode();
            int[] m95848b = m95848b(enumC2382z);
            C7956b m41573b = C7956b.Companion.m41573b();
            String str3 = CoreUtility.f89233i;
            AbstractC19074t.m100207e(str3, "currentUserUid");
            try {
                C19491b m41528T = m41573b.m41528T(str3, str, m95848b, str2, Long.MIN_VALUE, Long.MAX_VALUE, 1, i11, i12, zdbApiCode2);
                i13 = i11;
                i14 = i13 + m41528T.m101929d();
                try {
                    m95851k(arrayList, m41528T);
                    arrayList = m95849d(str, enumC2382z, arrayList);
                    if (arrayList.size() < arrayList.size()) {
                        zdbApiCode = zdbApiCode2;
                        z11 = true;
                    } else {
                        arrayList = arrayList;
                        zdbApiCode = zdbApiCode2;
                        z11 = false;
                    }
                    try {
                        int i15 = zdbApiCode.error_code;
                        if (i15 != 0) {
                            j11 = currentTimeMillis;
                            try {
                                m95850j(124624, "[mediaType:" + enumC2382z + "][errorCode:" + i15 + "]", j11);
                                C7967l.Companion.m42751f(zdbApiCode, "loadAutoCollectionSender->getMediaWithTypeAPI", str, m95848b.toString());
                            } catch (Exception e11) {
                                e = e11;
                                z12 = z11;
                                AbstractC23350e.m122776f("MediaStoreDBV4Impl", e);
                                z11 = z12;
                                if (f91287a) {
                                }
                                C21753c c21753c = new C21753c(i14, arrayList);
                                c21753c.m112208d(z11);
                                return c21753c;
                            }
                        } else {
                            j11 = currentTimeMillis;
                        }
                    } catch (Exception e12) {
                        e = e12;
                        j11 = currentTimeMillis;
                    }
                } catch (Exception e13) {
                    e = e13;
                    j11 = currentTimeMillis;
                    arrayList = arrayList;
                }
            } catch (Exception e14) {
                e = e14;
                i13 = i11;
                j11 = currentTimeMillis;
                arrayList = arrayList;
                i14 = i13;
            }
        } catch (Exception e15) {
            e = e15;
            j11 = currentTimeMillis;
            i13 = i14;
        }
        if (f91287a) {
            int size = arrayList.size();
            long currentTimeMillis2 = System.currentTimeMillis() - j11;
            StringBuilder sb3 = new StringBuilder();
            sb3.append("loadAutoCollectionSender conversationId: ");
            sb3.append(str);
            sb3.append(", senderId: ");
            sb3.append(str2);
            sb3.append(", offset: ");
            sb3.append(i13);
            sb3.append(", newOffset: ");
            sb3.append(i14);
            sb3.append(", size: ");
            sb3.append(size);
            sb3.append(", time: ");
            sb3.append(currentTimeMillis2);
        }
        C21753c c21753c2 = new C21753c(i14, arrayList);
        c21753c2.m112208d(z11);
        return c21753c2;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x00d4  */
    /* renamed from: h */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final C21753c m95856h(String str, int i11, int i12) {
        long j11;
        int i13;
        String str2;
        boolean z11;
        ZdbApiCode zdbApiCode;
        int[] iArr;
        int i14 = i11;
        AbstractC19074t.m100208f(str, "conversationId");
        long currentTimeMillis = System.currentTimeMillis();
        List arrayList = new ArrayList();
        boolean z12 = false;
        try {
            zdbApiCode = new ZdbApiCode();
            iArr = new int[]{1};
            C7956b m41573b = C7956b.Companion.m41573b();
            String str3 = CoreUtility.f89233i;
            AbstractC19074t.m100207e(str3, "currentUserUid");
            try {
                C19491b m41528T = m41573b.m41528T(str3, str, iArr, "0", Long.MIN_VALUE, Long.MAX_VALUE, 1, i11, i12, zdbApiCode);
                i14 += m41528T.m101929d();
                try {
                    m95851k(arrayList, m41528T);
                    str2 = str;
                    i13 = i14;
                } catch (Exception e11) {
                    e = e11;
                    str2 = str;
                    i13 = i14;
                }
            } catch (Exception e12) {
                e = e12;
                str2 = str;
                i13 = i14;
                j11 = currentTimeMillis;
                arrayList = arrayList;
                i14 = i13;
            }
        } catch (Exception e13) {
            e = e13;
            j11 = currentTimeMillis;
            i13 = i14;
            str2 = str;
        }
        try {
            arrayList = m95849d(str2, EnumC2382z.f9945r, arrayList);
            if (arrayList.size() < arrayList.size()) {
                z11 = true;
            } else {
                arrayList = arrayList;
                z11 = false;
            }
            try {
                int i15 = zdbApiCode.error_code;
                if (i15 != 0) {
                    j11 = currentTimeMillis;
                    try {
                        m95850j(124625, "[errorCode:" + i15 + "]", j11);
                        C7967l.Companion.m42751f(zdbApiCode, "loadAutoCollectionVideo->getMediaWithTypeAPI", str2, iArr.toString());
                    } catch (Exception e14) {
                        e = e14;
                        z12 = z11;
                        AbstractC23350e.m122776f("MediaStoreDBV4Impl", e);
                        z11 = z12;
                        if (f91287a) {
                        }
                        C21753c c21753c = new C21753c(i14, arrayList);
                        c21753c.m112208d(z11);
                        return c21753c;
                    }
                } else {
                    j11 = currentTimeMillis;
                }
            } catch (Exception e15) {
                e = e15;
                j11 = currentTimeMillis;
            }
        } catch (Exception e16) {
            e = e16;
            j11 = currentTimeMillis;
            arrayList = arrayList;
            AbstractC23350e.m122776f("MediaStoreDBV4Impl", e);
            z11 = z12;
            if (f91287a) {
            }
            C21753c c21753c2 = new C21753c(i14, arrayList);
            c21753c2.m112208d(z11);
            return c21753c2;
        }
        if (f91287a) {
            int size = arrayList.size();
            long currentTimeMillis2 = System.currentTimeMillis() - j11;
            StringBuilder sb2 = new StringBuilder();
            sb2.append("loadAutoCollectionVideo: ");
            sb2.append(str2);
            sb2.append(", offset: ");
            sb2.append(i13);
            sb2.append(", newOffset: ");
            sb2.append(i14);
            sb2.append(", size: ");
            sb2.append(size);
            sb2.append(", time: ");
            sb2.append(currentTimeMillis2);
        }
        C21753c c21753c22 = new C21753c(i14, arrayList);
        c21753c22.m112208d(z11);
        return c21753c22;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x00e2  */
    /* renamed from: i */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final C21753c m95857i(String str, EnumC2382z enumC2382z, int i11, int i12) {
        long j11;
        int i13;
        EnumC2382z enumC2382z2;
        boolean z11;
        ZdbApiCode zdbApiCode;
        int[] m95848b;
        int i14 = i11;
        AbstractC19074t.m100208f(str, "conversationId");
        AbstractC19074t.m100208f(enumC2382z, "mediaType");
        long currentTimeMillis = System.currentTimeMillis();
        List arrayList = new ArrayList();
        boolean z12 = false;
        try {
            zdbApiCode = new ZdbApiCode();
            m95848b = m95848b(enumC2382z);
            C7956b m41573b = C7956b.Companion.m41573b();
            String str2 = CoreUtility.f89233i;
            AbstractC19074t.m100207e(str2, "currentUserUid");
            try {
                C19491b m41528T = m41573b.m41528T(str2, str, m95848b, "0", Long.MIN_VALUE, Long.MAX_VALUE, 1, i11, i12, zdbApiCode);
                i13 = i11;
                i14 = i13 + m41528T.m101929d();
                try {
                    m95851k(arrayList, m41528T);
                    enumC2382z2 = enumC2382z;
                } catch (Exception e11) {
                    e = e11;
                    enumC2382z2 = enumC2382z;
                }
            } catch (Exception e12) {
                e = e12;
                enumC2382z2 = enumC2382z;
                i13 = i11;
                j11 = currentTimeMillis;
                arrayList = arrayList;
                i14 = i13;
            }
        } catch (Exception e13) {
            e = e13;
            j11 = currentTimeMillis;
            i13 = i14;
            enumC2382z2 = enumC2382z;
        }
        try {
            arrayList = m95849d(str, enumC2382z2, arrayList);
            if (arrayList.size() < arrayList.size()) {
                z11 = true;
            } else {
                arrayList = arrayList;
                z11 = false;
            }
            try {
                int i15 = zdbApiCode.error_code;
                if (i15 != 0) {
                    j11 = currentTimeMillis;
                    try {
                        m95850j(124621, "[mediaType:" + enumC2382z2 + "][errorCode:" + i15 + "]", j11);
                        C7967l.Companion.m42751f(zdbApiCode, "loadLocalMediaStoreItems->getMediaWithTypeAPI", str, m95848b.toString());
                    } catch (Exception e14) {
                        e = e14;
                        z12 = z11;
                        AbstractC23350e.m122776f("MediaStoreDBV4Impl", e);
                        z11 = z12;
                        if (f91287a) {
                        }
                        C21753c c21753c = new C21753c(i14, arrayList);
                        c21753c.m112208d(z11);
                        return c21753c;
                    }
                } else {
                    j11 = currentTimeMillis;
                }
            } catch (Exception e15) {
                e = e15;
                j11 = currentTimeMillis;
            }
        } catch (Exception e16) {
            e = e16;
            j11 = currentTimeMillis;
            arrayList = arrayList;
            AbstractC23350e.m122776f("MediaStoreDBV4Impl", e);
            z11 = z12;
            if (f91287a) {
            }
            C21753c c21753c2 = new C21753c(i14, arrayList);
            c21753c2.m112208d(z11);
            return c21753c2;
        }
        if (f91287a) {
            int size = arrayList.size();
            long currentTimeMillis2 = System.currentTimeMillis() - j11;
            StringBuilder sb2 = new StringBuilder();
            sb2.append("loadLocalMediaStoreItems conversationId: ");
            sb2.append(str);
            sb2.append(", mediaType: ");
            sb2.append(enumC2382z2);
            sb2.append(", offset: ");
            sb2.append(i13);
            sb2.append(", newOffset: ");
            sb2.append(i14);
            sb2.append(", items: ");
            sb2.append(size);
            sb2.append(", time: ");
            sb2.append(currentTimeMillis2);
        }
        C21753c c21753c22 = new C21753c(i14, arrayList);
        c21753c22.m112208d(z11);
        return c21753c22;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x014e  */
    /* renamed from: l */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final C21753c m95858l(String str, String str2, List list, EnumC2382z enumC2382z, int i11, int i12, InterfaceC19305a interfaceC19305a) {
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        int i13;
        int i14 = i11;
        AbstractC19074t.m100208f(str2, "conversationId");
        AbstractC19074t.m100208f(enumC2382z, "mediaType");
        long currentTimeMillis = System.currentTimeMillis();
        ArrayList<C3554v> m42652T = C7961f.Companion.m42658b().m42652T(str, str2, list, enumC2382z, i11, i12, true, interfaceC19305a);
        if (m42652T.isEmpty()) {
            return new C21753c(i14);
        }
        String str8 = " keyword: ";
        String str9 = "searchLocalMediaStoreItems: conversationId: ";
        if (f91287a) {
            int size = m42652T.size();
            long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
            StringBuilder sb2 = new StringBuilder();
            sb2.append("searchLocalMediaStoreItems: conversationId: ");
            str4 = str2;
            sb2.append(str4);
            sb2.append(" keyword: ");
            str3 = str;
            sb2.append(str3);
            sb2.append(" mediaType: ");
            sb2.append(enumC2382z);
            str5 = " mediaType: ";
            sb2.append(" offset: ");
            sb2.append(i14);
            sb2.append(" search result chat size: ");
            sb2.append(size);
            sb2.append(" time: ");
            sb2.append(currentTimeMillis2);
        } else {
            str3 = str;
            str4 = str2;
            str5 = " mediaType: ";
        }
        ArrayList arrayList = new ArrayList();
        try {
            C19498i c19498i = new C19498i();
            for (C3554v c3554v : m42652T) {
                C19497h c19497h = new C19497h();
                str6 = str8;
                str7 = str9;
                try {
                    c19497h.f96813b = c3554v.m18061c().m41045i();
                    c19497h.f96812a = c3554v.m18061c().m41047k();
                    c19497h.f96814c = Integer.parseInt(c3554v.m18063e());
                    c19498i.m101942a(c19497h);
                    str8 = str6;
                    str9 = str7;
                } catch (Exception e11) {
                    e = e11;
                    AbstractC23350e.m122776f("MediaStoreDBV4Impl", e);
                    i13 = i14;
                    if (f91287a) {
                    }
                    return new C21753c(i13, arrayList);
                }
            }
            str6 = str8;
            str7 = str9;
            ZdbApiCode zdbApiCode = new ZdbApiCode();
            C7956b m41573b = C7956b.Companion.m41573b();
            String str10 = CoreUtility.f89233i;
            AbstractC19074t.m100207e(str10, "currentUserUid");
            C19491b m41519N = m41573b.m41519N(str10, str4, c19498i, zdbApiCode);
            i13 = m41519N.m101929d() + i14;
            try {
                m95851k(arrayList, m41519N);
                int i15 = zdbApiCode.error_code;
                if (i15 != 0) {
                    m95850j(124627, "[mediaType:" + enumC2382z + "][errorCode:" + i15 + "]", currentTimeMillis);
                    C7967l.Companion.m42751f(zdbApiCode, "searchLocalMediaStoreItems->getChatContentAPI", str4, String.valueOf(c19498i.m101944c()));
                }
            } catch (Exception e12) {
                e = e12;
                i14 = i13;
                AbstractC23350e.m122776f("MediaStoreDBV4Impl", e);
                i13 = i14;
                if (f91287a) {
                }
                return new C21753c(i13, arrayList);
            }
        } catch (Exception e13) {
            e = e13;
            str6 = str8;
            str7 = str9;
        }
        if (f91287a) {
            int size2 = arrayList.size();
            long currentTimeMillis3 = System.currentTimeMillis() - currentTimeMillis;
            StringBuilder sb3 = new StringBuilder();
            sb3.append(str7);
            sb3.append(str4);
            sb3.append(str6);
            sb3.append(str3);
            sb3.append(str5);
            sb3.append(enumC2382z);
            sb3.append(" newOffset: ");
            sb3.append(i13);
            sb3.append(" search result size: ");
            sb3.append(size2);
            sb3.append(" time: ");
            sb3.append(currentTimeMillis3);
        }
        return new C21753c(i13, arrayList);
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0157  */
    /* renamed from: m */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final C21753c m95859m(String str, EnumC2382z enumC2382z, long j11, long j12, int i11, int i12) {
        long j13;
        String str2;
        String str3;
        String str4;
        String str5;
        EnumC2382z enumC2382z2;
        String str6;
        int i13;
        Exception exc;
        int i14;
        List list;
        boolean z11;
        int i15;
        ZdbApiCode zdbApiCode;
        int[] m95848b;
        C7956b m41573b;
        String str7;
        AbstractC19074t.m100208f(str, "conversationId");
        AbstractC19074t.m100208f(enumC2382z, "mediaType");
        if (f91287a) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("searchLocalMediaStoreItemsByTime(START): conversationId: ");
            sb2.append(str);
            sb2.append(", mediaType: ");
            sb2.append(enumC2382z);
            sb2.append(", startTime: ");
            sb2.append(j11);
            sb2.append(", endTime: ");
            sb2.append(j12);
            sb2.append(", offset: ");
            sb2.append(i11);
            sb2.append(", limit: ");
            sb2.append(i12);
        }
        long currentTimeMillis = System.currentTimeMillis();
        List arrayList = new ArrayList();
        boolean z12 = false;
        try {
            zdbApiCode = new ZdbApiCode();
            m95848b = m95848b(enumC2382z);
            m41573b = C7956b.Companion.m41573b();
            try {
                str7 = CoreUtility.f89233i;
                AbstractC19074t.m100207e(str7, "currentUserUid");
                str2 = ", mediaType: ";
                str3 = ", startTime: ";
                str4 = ", offset: ";
                str5 = ", endTime: ";
            } catch (Exception e11) {
                e = e11;
                str2 = ", mediaType: ";
                str3 = ", startTime: ";
                str4 = ", offset: ";
                str5 = ", endTime: ";
                enumC2382z2 = enumC2382z;
                str6 = str;
                j13 = currentTimeMillis;
                i13 = i11;
                exc = e;
                i14 = i13;
                AbstractC23350e.m122776f("MediaStoreDBV4Impl", exc);
                list = arrayList;
                z11 = z12;
                i15 = i14;
                if (f91287a) {
                }
                C21753c c21753c = new C21753c(i15, list);
                c21753c.m112208d(z11);
                return c21753c;
            }
        } catch (Exception e12) {
            e = e12;
            j13 = currentTimeMillis;
            str2 = ", mediaType: ";
            str3 = ", startTime: ";
            str4 = ", offset: ";
            str5 = ", endTime: ";
            enumC2382z2 = enumC2382z;
            str6 = str;
        }
        try {
            C19491b m41528T = m41573b.m41528T(str7, str, m95848b, "0", j11, j12, 1, i11, i12, zdbApiCode);
            i15 = i11 + m41528T.m101929d();
            list = arrayList;
            try {
                m95851k(list, m41528T);
                str6 = str;
                enumC2382z2 = enumC2382z;
                i13 = i11;
                try {
                    List m95849d = m95849d(str6, enumC2382z2, list);
                    if (m95849d.size() < list.size()) {
                        list = m95849d;
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    try {
                        int i16 = zdbApiCode.error_code;
                        if (i16 != 0) {
                            j13 = currentTimeMillis;
                            try {
                                m95850j(124626, "[mediaType:" + enumC2382z2 + "][errorCode:" + i16 + "]", j13);
                                C7967l.Companion.m42751f(zdbApiCode, "searchLocalMediaStoreItemsByTime->getMediaWithTypeAPI", str6, m95848b.toString());
                            } catch (Exception e13) {
                                e = e13;
                                z12 = z11;
                                List list2 = list;
                                exc = e;
                                i14 = i15;
                                arrayList = list2;
                                AbstractC23350e.m122776f("MediaStoreDBV4Impl", exc);
                                list = arrayList;
                                z11 = z12;
                                i15 = i14;
                                if (f91287a) {
                                }
                                C21753c c21753c2 = new C21753c(i15, list);
                                c21753c2.m112208d(z11);
                                return c21753c2;
                            }
                        } else {
                            j13 = currentTimeMillis;
                        }
                    } catch (Exception e14) {
                        e = e14;
                        j13 = currentTimeMillis;
                    }
                } catch (Exception e15) {
                    e = e15;
                    j13 = currentTimeMillis;
                    List list22 = list;
                    exc = e;
                    i14 = i15;
                    arrayList = list22;
                    AbstractC23350e.m122776f("MediaStoreDBV4Impl", exc);
                    list = arrayList;
                    z11 = z12;
                    i15 = i14;
                    if (f91287a) {
                    }
                    C21753c c21753c22 = new C21753c(i15, list);
                    c21753c22.m112208d(z11);
                    return c21753c22;
                }
            } catch (Exception e16) {
                e = e16;
                str6 = str;
                enumC2382z2 = enumC2382z;
                i13 = i11;
            }
        } catch (Exception e17) {
            e = e17;
            str6 = str;
            enumC2382z2 = enumC2382z;
            i13 = i11;
            j13 = currentTimeMillis;
            arrayList = arrayList;
            exc = e;
            i14 = i13;
            AbstractC23350e.m122776f("MediaStoreDBV4Impl", exc);
            list = arrayList;
            z11 = z12;
            i15 = i14;
            if (f91287a) {
            }
            C21753c c21753c222 = new C21753c(i15, list);
            c21753c222.m112208d(z11);
            return c21753c222;
        }
        if (f91287a) {
            int size = list.size();
            long currentTimeMillis2 = System.currentTimeMillis() - j13;
            StringBuilder sb3 = new StringBuilder();
            sb3.append("searchLocalMediaStoreItemsByTime(END): conversationId: ");
            sb3.append(str6);
            sb3.append(str2);
            sb3.append(enumC2382z2);
            sb3.append(str3);
            sb3.append(j11);
            sb3.append(str5);
            sb3.append(j12);
            sb3.append(str4);
            sb3.append(i13);
            sb3.append(", newOffset: ");
            sb3.append(i15);
            sb3.append(", size: ");
            sb3.append(size);
            sb3.append(", time: ");
            sb3.append(currentTimeMillis2);
        }
        C21753c c21753c2222 = new C21753c(i15, list);
        c21753c2222.m112208d(z11);
        return c21753c2222;
    }

    /* renamed from: n */
    public final C21753c m95860n(String str, String str2, List list, EnumC2382z enumC2382z, int i11, int i12, InterfaceC19305a interfaceC19305a) {
        AbstractC19074t.m100208f(enumC2382z, "mediaType");
        long currentTimeMillis = System.currentTimeMillis();
        ArrayList m42652T = C7961f.Companion.m42658b().m42652T(str, str2, list, enumC2382z, i11, i12, true, interfaceC19305a);
        if (m42652T.isEmpty()) {
            return new C21753c(i11);
        }
        if (f91287a) {
            long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
            StringBuilder sb2 = new StringBuilder();
            sb2.append("searchLocalMediaStoreItemsForGlobalSearch: conversationId: ");
            sb2.append(str2);
            sb2.append(" keyword: ");
            sb2.append(str);
            sb2.append(" mediaType: ");
            sb2.append(enumC2382z);
            sb2.append(" offset: ");
            sb2.append(i11);
            sb2.append(" search result chat size: ");
            sb2.append(m42652T);
            sb2.append(".size time: ");
            sb2.append(currentTimeMillis2);
        }
        int size = m42652T.size() + i11;
        ArrayList arrayList = new ArrayList();
        Iterator it = m42652T.iterator();
        while (it.hasNext()) {
            MediaStoreItem mediaStoreItem = new MediaStoreItem((C3554v) it.next());
            if (!mediaStoreItem.m40591g0()) {
                arrayList.add(mediaStoreItem);
            }
        }
        if (f91287a) {
            int size2 = arrayList.size();
            long currentTimeMillis3 = System.currentTimeMillis() - currentTimeMillis;
            StringBuilder sb3 = new StringBuilder();
            sb3.append("searchLocalMediaStoreItemsForGlobalSearch: conversationId: ");
            sb3.append(str2);
            sb3.append(", keyword: ");
            sb3.append(str);
            sb3.append(", mediaType: ");
            sb3.append(enumC2382z);
            sb3.append(", newOffset: ");
            sb3.append(size);
            sb3.append(", search result size: ");
            sb3.append(size2);
            sb3.append(", time: ");
            sb3.append(currentTimeMillis3);
        }
        return new C21753c(size, arrayList);
    }

    private C18027a() {
    }
}
