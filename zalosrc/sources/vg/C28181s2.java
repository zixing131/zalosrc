package vg;

import android.graphics.Bitmap;
import android.text.TextUtils;
import com.zing.zalo.MainApplication;
import com.zing.zalo.uicontrol.C16586e0;
import com.zing.zalo.uicontrol.C16673w;
import fn0.AbstractC19074t;
import ho0.AbstractC20110a;
import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;
import java.io.InputStream;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import me0.AbstractC23041d2;
import me0.AbstractC23193r0;
import mm0.AbstractC23350e;
import nl0.C23877g;
import on0.AbstractC24341v;
import on0.AbstractC24342w;
import p098dc.InterfaceC17872f;
import p471r3.C25630b;
import pm0.C24848g0;
import sh0.C26251c;
import sh0.C26252d;
import sh0.C26253e;
import th.AbstractC26683d;
import xm0.AbstractC30166b;
import xm0.InterfaceC30165a;

/* renamed from: vg.s2 */
/* loaded from: classes3.dex */
public final class C28181s2 {

    /* renamed from: a */
    public static final C28181s2 f131306a = new C28181s2();

    /* renamed from: b */
    private static final Map f131307b = Collections.synchronizedMap(new d());

    /* renamed from: vg.s2$a */
    /* loaded from: classes3.dex */
    public static final class a extends Enum {

        /* renamed from: p */
        public static final a f131308p = new a("NOT_SUPPORT", 0);

        /* renamed from: q */
        public static final a f131309q = new a("LOTTIE", 1);

        /* renamed from: r */
        public static final a f131310r = new a("KEY_FRAME", 2);

        /* renamed from: s */
        public static final a f131311s = new a("PNG_LIST", 3);

        /* renamed from: t */
        public static final a f131312t = new a("NORMAL_SINGLE_MODE", 4);

        /* renamed from: u */
        public static final a f131313u = new a("NORMAL_MULTI_MODE", 5);

        /* renamed from: v */
        public static final a f131314v = new a("GIF_MULTI_MODE", 6);

        /* renamed from: w */
        private static final /* synthetic */ a[] f131315w;

        /* renamed from: x */
        private static final /* synthetic */ InterfaceC30165a f131316x;

        static {
            a[] m141730b = m141730b();
            f131315w = m141730b;
            f131316x = AbstractC30166b.m148796a(m141730b);
        }

        private a(String str, int i11) {
            super(str, i11);
        }

        /* renamed from: b */
        private static final /* synthetic */ a[] m141730b() {
            return new a[]{f131308p, f131309q, f131310r, f131311s, f131312t, f131313u, f131314v};
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) f131315w.clone();
        }
    }

    /* renamed from: vg.s2$b */
    /* loaded from: classes3.dex */
    public /* synthetic */ class b {

        /* renamed from: a */
        public static final /* synthetic */ int[] f131317a;

        static {
            int[] iArr = new int[a.values().length];
            try {
                iArr[a.f131309q.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[a.f131312t.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[a.f131313u.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[a.f131311s.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[a.f131310r.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[a.f131314v.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            f131317a = iArr;
        }
    }

    /* renamed from: vg.s2$c */
    /* loaded from: classes3.dex */
    public static final class c implements C23877g.a {

        /* renamed from: a */
        private int f131318a;

        /* renamed from: b */
        private final Bitmap[] f131319b = new Bitmap[3];

        c() {
        }

        @Override // nl0.C23877g.a
        /* renamed from: a */
        public Bitmap mo124933a(int i11, int i12) {
            int i13;
            int i14 = this.f131318a;
            int i15 = i14 % 3;
            if (i14 == Integer.MAX_VALUE) {
                i13 = 0;
            } else {
                i13 = i14 + 1;
            }
            this.f131318a = i13;
            Bitmap bitmap = this.f131319b[i15];
            Bitmap bitmap2 = null;
            if (bitmap != null) {
                if (bitmap.isRecycled()) {
                    bitmap = null;
                }
                bitmap2 = bitmap;
            }
            if (bitmap2 == null) {
                bitmap2 = Bitmap.createBitmap(i11, i12, Bitmap.Config.ARGB_8888);
                AbstractC19074t.m100207e(bitmap2, "createBitmap(...)");
            }
            this.f131319b[i15] = bitmap2;
            return bitmap2;
        }
    }

    /* renamed from: vg.s2$d */
    /* loaded from: classes3.dex */
    public static final class d extends LinkedHashMap {
        d() {
            super(50, 0.75f, true);
        }

        /* renamed from: a */
        public /* bridge */ boolean m141731a(String str) {
            return super.containsKey(str);
        }

        /* renamed from: b */
        public /* bridge */ boolean m141732b(InterfaceC17872f interfaceC17872f) {
            return super.containsValue(interfaceC17872f);
        }

        /* renamed from: c */
        public /* bridge */ InterfaceC17872f m141733c(String str) {
            return (InterfaceC17872f) super.get(str);
        }

        @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
        public final /* bridge */ boolean containsKey(Object obj) {
            if (obj != null && !(obj instanceof String)) {
                return false;
            }
            return m141731a((String) obj);
        }

        @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
        public final /* bridge */ boolean containsValue(Object obj) {
            if (obj != null && !(obj instanceof InterfaceC17872f)) {
                return false;
            }
            return m141732b((InterfaceC17872f) obj);
        }

        /* renamed from: e */
        public /* bridge */ Set m141734e() {
            return super.entrySet();
        }

        @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
        public final /* bridge */ Set entrySet() {
            return m141734e();
        }

        /* renamed from: f */
        public /* bridge */ Set m141735f() {
            return super.keySet();
        }

        /* renamed from: g */
        public /* bridge */ InterfaceC17872f m141736g(String str, InterfaceC17872f interfaceC17872f) {
            return (InterfaceC17872f) super.getOrDefault(str, interfaceC17872f);
        }

        @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
        public final /* bridge */ /* synthetic */ Object get(Object obj) {
            if (obj != null && !(obj instanceof String)) {
                return null;
            }
            return m141733c((String) obj);
        }

        @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.Map
        public final /* bridge */ /* synthetic */ Object getOrDefault(Object obj, Object obj2) {
            if (obj != null && !(obj instanceof String)) {
                return obj2;
            }
            return m141736g((String) obj, (InterfaceC17872f) obj2);
        }

        /* renamed from: h */
        public /* bridge */ int m141737h() {
            return super.size();
        }

        /* renamed from: i */
        public /* bridge */ Collection m141738i() {
            return super.values();
        }

        /* renamed from: k */
        public /* bridge */ InterfaceC17872f m141739k(String str) {
            return (InterfaceC17872f) super.remove(str);
        }

        @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
        public final /* bridge */ Set keySet() {
            return m141735f();
        }

        /* renamed from: l */
        public /* bridge */ boolean m141740l(String str, InterfaceC17872f interfaceC17872f) {
            return super.remove(str, interfaceC17872f);
        }

        @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
        public final /* bridge */ /* synthetic */ Object remove(Object obj) {
            if (obj == null || (obj instanceof String)) {
                return m141739k((String) obj);
            }
            return null;
        }

        @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
        public final /* bridge */ int size() {
            return m141737h();
        }

        @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
        public final /* bridge */ Collection values() {
            return m141738i();
        }

        @Override // java.util.HashMap, java.util.Map
        public final /* bridge */ boolean remove(Object obj, Object obj2) {
            if (obj != null && !(obj instanceof String)) {
                return false;
            }
            if (obj2 == null || (obj2 instanceof InterfaceC17872f)) {
                return m141740l((String) obj, (InterfaceC17872f) obj2);
            }
            return false;
        }
    }

    private C28181s2() {
    }

    /* renamed from: b */
    private final boolean m141713b(String str, InterfaceC17872f interfaceC17872f) {
        if (!m141721o(interfaceC17872f) && interfaceC17872f != null && m141722q(interfaceC17872f)) {
            Map map = f131307b;
            AbstractC19074t.m100207e(map, "mapAnimDecoder");
            map.put(str, interfaceC17872f);
        }
        return f131307b.containsKey(str);
    }

    /* renamed from: d */
    public static /* synthetic */ boolean m141714d(C28181s2 c28181s2, InterfaceC17872f interfaceC17872f, boolean z11, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            z11 = false;
        }
        return c28181s2.m141723c(interfaceC17872f, z11);
    }

    /* renamed from: f */
    private final InterfaceC17872f m141715f(C25630b c25630b, int i11, int i12, int i13) {
        boolean z11;
        if (c25630b == null) {
            return null;
        }
        try {
            if (i11 > 0 && i12 > 0) {
                File file = new File(c25630b.m132439q() + "/data.json");
                c cVar = new c();
                if (i11 == i13 && i12 == i13) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                return new C23877g(file, "lottie_sticker_" + c25630b.m132429g(), i11, i12, !AbstractC23193r0.m119506o(), z11, cVar);
            }
            throw new IllegalArgumentException("Lottie width & height must be bigger than zero to create decoder".toString());
        } catch (Exception e11) {
            AbstractC20110a.f98889a.mo104552e(e11);
            return null;
        }
    }

    /* renamed from: g */
    private final InterfaceC17872f m141716g(C25630b c25630b, boolean z11, int i11, int i12, int i13) {
        boolean m127149O;
        InterfaceC17872f m135002c;
        if (c25630b == null) {
            return null;
        }
        try {
            String m132431i = c25630b.m132431i();
            if (m132431i == null) {
                m132431i = "";
            }
            String str = m132431i;
            switch (b.f131317a[m141718j(c25630b, z11).ordinal()]) {
                case 1:
                    return m141715f(c25630b, i11, i12, i13);
                case 2:
                    String m132431i2 = c25630b.m132431i();
                    if (m132431i2 == null) {
                        return null;
                    }
                    return C26253e.Companion.m135004b(m132431i2, 1);
                case 3:
                    m127149O = AbstractC24342w.m127149O(str, "emoticons/", false, 2, null);
                    if (m127149O) {
                        InputStream open = MainApplication.Companion.m35500c().getAssets().open(str);
                        AbstractC19074t.m100207e(open, "open(...)");
                        m135002c = new C26253e(str, open, 0, 4, null);
                        break;
                    } else {
                        m135002c = C26253e.c.m135002c(C26253e.Companion, str, 0, 2, null);
                        break;
                    }
                case 4:
                    m135002c = new C16586e0(new File(c25630b.m132439q()));
                    break;
                case 5:
                    m135002c = new C16673w(new File(c25630b.m132439q()));
                    break;
                case 6:
                    return C26253e.c.m135002c(C26253e.Companion, c25630b.m132439q() + "/" + c25630b.m132429g() + ".gif", 0, 2, null);
                default:
                    return null;
            }
            return m135002c;
        } catch (Exception e11) {
            AbstractC20110a.f98889a.mo104552e(e11);
            return null;
        }
    }

    /* renamed from: i */
    private final String m141717i(C25630b c25630b, boolean z11) {
        String str;
        if (c25630b.m132395C() && !z11) {
            str = "INTERACTION_";
        } else {
            str = "";
        }
        return str + c25630b.m132421c();
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0034, code lost:            if (r1 == true) goto L76;     */
    /* renamed from: j */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final a m141718j(C25630b c25630b, boolean z11) {
        boolean m127149O;
        C25630b.a aVar = C25630b.f122553O;
        if (aVar.m132449a(c25630b) && AbstractC26683d.f126390A) {
            return a.f131309q;
        }
        if (AbstractC26683d.f126390A && (aVar.m132452d(c25630b) || aVar.m132450b(c25630b))) {
            return a.f131312t;
        }
        String m132431i = c25630b.m132431i();
        boolean z12 = true;
        if (m132431i != null) {
            m127149O = AbstractC24342w.m127149O(m132431i, "emoticons/", false, 2, null);
        }
        if (!AbstractC26683d.f126407z || !aVar.m132452d(c25630b)) {
            if (aVar.m132450b(c25630b)) {
                return a.f131308p;
            }
            if (AbstractC23041d2.m118194A(c25630b.m132436n())) {
                if (new File(c25630b.m132439q()).isDirectory()) {
                    if (!c25630b.m132395C() || z11) {
                        z12 = false;
                    }
                    if (z12) {
                        return a.f131310r;
                    }
                    return a.f131311s;
                }
                throw new IOException(c25630b.m132439q() + " is not directory");
            }
            if (AbstractC23041d2.m118194A(c25630b.m132439q() + "/" + c25630b.m132429g() + ".gif")) {
                return a.f131314v;
            }
            return a.f131308p;
        }
        return a.f131313u;
    }

    /* renamed from: l */
    public static final boolean m141719l(File file, String str) {
        boolean m127125u;
        AbstractC19074t.m100208f(str, "filename");
        Locale locale = Locale.getDefault();
        AbstractC19074t.m100207e(locale, "getDefault(...)");
        String lowerCase = str.toLowerCase(locale);
        AbstractC19074t.m100207e(lowerCase, "toLowerCase(...)");
        m127125u = AbstractC24341v.m127125u(lowerCase, ".json", false, 2, null);
        return m127125u;
    }

    /* renamed from: n */
    public static /* synthetic */ InterfaceC17872f m141720n(C28181s2 c28181s2, C25630b c25630b, boolean z11, int i11, int i12, int i13, int i14, Object obj) {
        int i15;
        int i16;
        int i17;
        if ((i14 & 4) != 0) {
            i15 = 0;
        } else {
            i15 = i11;
        }
        if ((i14 & 8) != 0) {
            i16 = 0;
        } else {
            i16 = i12;
        }
        if ((i14 & 16) != 0) {
            i17 = 0;
        } else {
            i17 = i13;
        }
        return c28181s2.m141727m(c25630b, z11, i15, i16, i17);
    }

    /* renamed from: o */
    private final boolean m141721o(InterfaceC17872f interfaceC17872f) {
        return f131307b.values().contains(interfaceC17872f);
    }

    /* renamed from: q */
    private final boolean m141722q(InterfaceC17872f interfaceC17872f) {
        if (interfaceC17872f instanceof C23877g) {
            return false;
        }
        if (interfaceC17872f instanceof C26253e) {
            C26253e c26253e = (C26253e) interfaceC17872f;
            if (c26253e.mo88375b() <= 0) {
                return false;
            }
            if (c26253e.m134997t() != 2 && !C26252d.f124668a.m134987a()) {
                return false;
            }
        } else if (!(interfaceC17872f instanceof C16673w) && interfaceC17872f.mo88375b() <= 0) {
            return false;
        }
        return true;
    }

    /* renamed from: c */
    public final boolean m141723c(InterfaceC17872f interfaceC17872f, boolean z11) {
        try {
            Map map = f131307b;
            AbstractC19074t.m100207e(map, "mapAnimDecoder");
            synchronized (map) {
                if (!z11) {
                    if (f131306a.m141721o(interfaceC17872f)) {
                        C24848g0 c24848g0 = C24848g0.f119245a;
                        return false;
                    }
                }
                if (interfaceC17872f != null) {
                    interfaceC17872f.mo88374a();
                }
                return true;
            }
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
            return false;
        }
    }

    /* renamed from: e */
    public final void m141724e() {
        try {
            Map map = f131307b;
            AbstractC19074t.m100207e(map, "mapAnimDecoder");
            synchronized (map) {
                try {
                    for (InterfaceC17872f interfaceC17872f : map.values()) {
                        if (interfaceC17872f != null) {
                            interfaceC17872f.mo88374a();
                        }
                    }
                    f131307b.clear();
                    C24848g0 c24848g0 = C24848g0.f119245a;
                } finally {
                }
            }
            C26251c.f124664a.m134984a();
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    /* renamed from: h */
    public final void m141725h(C25630b c25630b) {
        AbstractC19074t.m100208f(c25630b, "stickerInfo");
        try {
            Map map = f131307b;
            InterfaceC17872f interfaceC17872f = (InterfaceC17872f) map.remove(m141717i(c25630b, false));
            if (interfaceC17872f != null) {
                f131306a.m141723c(interfaceC17872f, true);
            }
            InterfaceC17872f interfaceC17872f2 = (InterfaceC17872f) map.remove(m141717i(c25630b, true));
            if (interfaceC17872f2 != null) {
                f131306a.m141723c(interfaceC17872f2, true);
            }
            InterfaceC17872f interfaceC17872f3 = (InterfaceC17872f) map.remove(String.valueOf(c25630b.m132425e()));
            if (interfaceC17872f3 != null) {
                f131306a.m141723c(interfaceC17872f3, true);
            }
        } catch (Exception e11) {
            AbstractC20110a.f98889a.mo104552e(e11);
        }
    }

    /* renamed from: k */
    public final InterfaceC17872f m141726k(String str, String str2) {
        boolean z11;
        AbstractC19074t.m100208f(str, "path");
        C16673w c16673w = null;
        try {
            if (TextUtils.isEmpty(str)) {
                return null;
            }
            Map map = f131307b;
            if (map.get(str2) != null) {
                return (InterfaceC17872f) map.get(str2);
            }
            File file = new File(str);
            if (file.isDirectory()) {
                File[] listFiles = file.listFiles(new FilenameFilter() { // from class: vg.r2
                    @Override // java.io.FilenameFilter
                    public final boolean accept(File file2, String str3) {
                        boolean m141719l;
                        m141719l = C28181s2.m141719l(file2, str3);
                        return m141719l;
                    }
                });
                if (listFiles != null) {
                    if (listFiles.length == 0) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    if (!z11) {
                        c16673w = new C16673w(file);
                    }
                }
                if (c16673w != null) {
                    AbstractC19074t.m100207e(map, "mapAnimDecoder");
                    map.put(str2, c16673w);
                    return c16673w;
                }
                return c16673w;
            }
            throw new IOException(str + " is not Directory!");
        } catch (Exception e11) {
            AbstractC20110a.f98889a.mo104552e(e11);
            return null;
        }
    }

    /* renamed from: m */
    public final InterfaceC17872f m141727m(C25630b c25630b, boolean z11, int i11, int i12, int i13) {
        InterfaceC17872f interfaceC17872f = null;
        if (c25630b == null) {
            return null;
        }
        try {
            String m141717i = m141717i(c25630b, z11);
            Map map = f131307b;
            InterfaceC17872f interfaceC17872f2 = (InterfaceC17872f) map.get(m141717i);
            if (interfaceC17872f2 != null && !m141729r(interfaceC17872f2)) {
                return interfaceC17872f2;
            }
            if (interfaceC17872f2 != null && m141729r(interfaceC17872f2)) {
                map.remove(m141717i);
            }
            interfaceC17872f = m141716g(c25630b, z11, i11, i12, i13);
            m141713b(m141717i, interfaceC17872f);
            return interfaceC17872f;
        } catch (Exception e11) {
            try {
                AbstractC23350e.m122774d("AnimDecoderManager", "Invalid decoder: cateId=" + c25630b.m132427f() + "/id=" + c25630b.m132429g());
                AbstractC23350e.m122778h(e11);
                return interfaceC17872f;
            } catch (Exception e12) {
                AbstractC20110a.f98889a.mo104552e(e12);
                return interfaceC17872f;
            }
        }
    }

    /* renamed from: p */
    public final boolean m141728p(C25630b c25630b, boolean z11) {
        String str;
        if (c25630b == null || (str = m141717i(c25630b, z11)) == null) {
            str = "";
        }
        Map map = f131307b;
        if (map.containsKey(str) && map.get(str) != null) {
            return true;
        }
        return false;
    }

    /* renamed from: r */
    public final boolean m141729r(InterfaceC17872f interfaceC17872f) {
        AbstractC19074t.m100208f(interfaceC17872f, "<this>");
        if (interfaceC17872f instanceof C26253e) {
            return ((C26253e) interfaceC17872f).m134998u();
        }
        return false;
    }
}
