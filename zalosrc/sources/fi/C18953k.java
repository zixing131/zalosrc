package fi;

import ae.C0766k;
import ag0.AbstractC0837p0;
import ag0.C0824j;
import am.AbstractC0939u;
import am.C0927o;
import am.C0943w;
import c30.C3237e;
import c30.C3239f;
import c30.C3250k0;
import com.zing.zalo.MainApplication;
import com.zing.zalo.control.ContactProfile;
import com.zing.zalo.p062db.C7956b;
import com.zing.zalo.p062db.C7960e;
import com.zing.zalo.zmedia.player.ZMediaPlayer;
import com.zing.zalo.zvideoutil.ZAbstractBase;
import dj.C17945a0;
import en0.InterfaceC18494a;
import en0.InterfaceC18509p;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import g30.C19216b;
import gi.EnumC19448a;
import gi.EnumC19449b;
import gi.EnumC19450c;
import hm0.C20096c;
import hm0.InterfaceC20094a;
import ho0.AbstractC20110a;
import hu.AbstractC20130d;
import hu.C20131e;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Random;
import java.util.zip.GZIPInputStream;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import me0.AbstractC23160o0;
import me0.AbstractC23262x6;
import mm0.AbstractC23350e;
import nh0.InterfaceC23792b;
import on0.AbstractC24341v;
import on0.AbstractC24342w;
import on0.C24329j;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p056cj.C3535c;
import p111du.AbstractC18069a;
import p142ey.C18644n;
import p268ji.C21270p;
import p304ks.C21927m;
import p348mi.AbstractC23304d;
import p348mi.AbstractC23306f;
import p348mi.AbstractC23309i;
import p354n3.C23528a;
import p379o3.C23994e;
import p379o3.C23995f;
import p647xj.C29675a;
import p683yj.C30997b;
import p684yk.InterfaceC31005a;
import p716zh.C31902e9;
import p716zh.C31917f9;
import p716zh.C31919fb;
import p716zh.C31973j5;
import pm0.AbstractC24856m;
import pm0.AbstractC24862s;
import pm0.C24848g0;
import pm0.C24860q;
import pm0.InterfaceC24854k;
import v30.C27517h;
import vg.C28203u6;
import vm0.AbstractC28298d;
import wm0.AbstractC29104l;
import xm0.AbstractC30166b;
import xm0.InterfaceC30165a;

/* renamed from: fi.k */
/* loaded from: classes3.dex */
public final class C18953k {
    public static final a Companion = new a(null);

    /* renamed from: M */
    private static final Random f94531M = new Random();

    /* renamed from: A */
    private final InterfaceC24854k f94532A;

    /* renamed from: B */
    private final InterfaceC24854k f94533B;

    /* renamed from: C */
    private final InterfaceC24854k f94534C;

    /* renamed from: D */
    private final InterfaceC24854k f94535D;

    /* renamed from: E */
    private final InterfaceC24854k f94536E;

    /* renamed from: F */
    private final InterfaceC24854k f94537F;

    /* renamed from: G */
    private int f94538G;

    /* renamed from: H */
    private final InterfaceC24854k f94539H;

    /* renamed from: I */
    private int f94540I;

    /* renamed from: J */
    private String f94541J;

    /* renamed from: K */
    private String f94542K;

    /* renamed from: L */
    private boolean f94543L;

    /* renamed from: a */
    private final InterfaceC24854k f94544a;

    /* renamed from: b */
    private final InterfaceC24854k f94545b;

    /* renamed from: c */
    private final InterfaceC24854k f94546c;

    /* renamed from: d */
    private final InterfaceC24854k f94547d;

    /* renamed from: e */
    private final InterfaceC24854k f94548e;

    /* renamed from: f */
    private final InterfaceC24854k f94549f;

    /* renamed from: g */
    private long f94550g;

    /* renamed from: h */
    private int f94551h;

    /* renamed from: i */
    private int f94552i;

    /* renamed from: j */
    private int f94553j;

    /* renamed from: k */
    private int f94554k;

    /* renamed from: l */
    private int f94555l;

    /* renamed from: m */
    private final InterfaceC24854k f94556m;

    /* renamed from: n */
    private final InterfaceC24854k f94557n;

    /* renamed from: o */
    private final InterfaceC24854k f94558o;

    /* renamed from: p */
    private boolean f94559p;

    /* renamed from: q */
    private boolean f94560q;

    /* renamed from: r */
    private boolean f94561r;

    /* renamed from: s */
    private int f94562s;

    /* renamed from: t */
    private boolean f94563t;

    /* renamed from: u */
    private int f94564u;

    /* renamed from: v */
    private int f94565v;

    /* renamed from: w */
    private int f94566w;

    /* renamed from: x */
    private int f94567x;

    /* renamed from: y */
    private int f94568y;

    /* renamed from: z */
    private int f94569z;

    /* renamed from: fi.k$a */
    /* loaded from: classes3.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC19060k abstractC19060k) {
            this();
        }

        /* renamed from: d */
        private final int m99420d() {
            if (AbstractC23304d.f113368c0 == null) {
                try {
                    String m121675Zd = AbstractC23309i.m121675Zd();
                    AbstractC19074t.m100205c(m121675Zd);
                    if (m121675Zd.length() > 0) {
                        AbstractC23304d.f113368c0 = new ContactProfile(new JSONObject(m121675Zd));
                    }
                } catch (JSONException e11) {
                    AbstractC20110a.f98889a.mo104552e(e11);
                }
            }
            ContactProfile contactProfile = AbstractC23304d.f113368c0;
            if (contactProfile == null || contactProfile.f42449w == 0) {
                return 1;
            }
            return 2;
        }

        /* renamed from: g */
        private final int m99421g(String str) {
            C31973j5 m4473g = C0943w.m4462l().m4473g(str);
            if (m4473g != null) {
                return m4473g.m153732O();
            }
            return 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: j */
        public final int m99422j() {
            return C18953k.f94531M.nextInt(100);
        }

        /* renamed from: b */
        public final C30997b.c m99423b(ContactProfile contactProfile) {
            C30997b.c cVar;
            int i11;
            int i12;
            int i13;
            int i14;
            int i15;
            int i16;
            int i17;
            if (contactProfile != null) {
                boolean m40374K0 = contactProfile.m40374K0();
                if (!m40374K0) {
                    i12 = m99425e(contactProfile);
                } else {
                    i12 = -1;
                }
                if (!m40374K0) {
                    i13 = m99424c(contactProfile);
                } else {
                    i13 = -1;
                }
                if (!m40374K0) {
                    if (C18644n.m98531l().m98558u(contactProfile.f42434r)) {
                        i14 = 1;
                    } else {
                        i14 = 0;
                    }
                } else {
                    i14 = -1;
                }
                if (!m40374K0) {
                    if (C21927m.m114302u().m114351p().contains(contactProfile.f42434r)) {
                        i15 = 1;
                    } else {
                        i15 = 0;
                    }
                } else {
                    i15 = -1;
                }
                if (m40374K0) {
                    String str = contactProfile.f42434r;
                    AbstractC19074t.m100207e(str, "uid");
                    i16 = m99421g(str);
                } else {
                    i16 = 0;
                }
                int m119306z = AbstractC23160o0.m119306z();
                int m119234a0 = AbstractC23160o0.m119234a0();
                ContactProfile contactProfile2 = AbstractC23304d.f113368c0;
                if (contactProfile2 != null) {
                    i17 = contactProfile2.m40429t();
                } else {
                    i17 = 0;
                }
                cVar = new C30997b.c(m40374K0 ? 1 : 0, i16, i12, i13, m119306z, i14, i15, m119234a0, i17, m99420d());
            } else {
                int m119306z2 = AbstractC23160o0.m119306z();
                int m119234a02 = AbstractC23160o0.m119234a0();
                ContactProfile contactProfile3 = AbstractC23304d.f113368c0;
                if (contactProfile3 != null) {
                    i11 = contactProfile3.m40429t();
                } else {
                    i11 = 0;
                }
                cVar = new C30997b.c(0, 0, 0, 0, m119306z2, 0, 0, m119234a02, i11, m99420d(), 111, null);
            }
            return cVar;
        }

        /* renamed from: c */
        public final int m99424c(ContactProfile contactProfile) {
            String str;
            Calendar calendar = Calendar.getInstance();
            if (contactProfile != null && (str = contactProfile.f42452x) != null && str.length() != 0) {
                try {
                    String str2 = contactProfile.f42452x;
                    AbstractC19074t.m100207e(str2, "dob");
                    String[] strArr = (String[]) new C24329j("/").m127021i(str2, 0).toArray(new String[0]);
                    if (strArr.length >= 2) {
                        int i11 = calendar.get(2) + 1;
                        int i12 = calendar.get(5);
                        if (i11 != Integer.parseInt(strArr[1])) {
                            return 0;
                        }
                        if (i12 != Integer.parseInt(strArr[0])) {
                            return 0;
                        }
                        return 1;
                    }
                } catch (Exception e11) {
                    e11.printStackTrace();
                }
            }
            return -1;
        }

        /* renamed from: e */
        public final int m99425e(ContactProfile contactProfile) {
            ContactProfile contactProfile2;
            if (AbstractC23304d.f113368c0 == null) {
                try {
                    String m121675Zd = AbstractC23309i.m121675Zd();
                    AbstractC19074t.m100205c(m121675Zd);
                    if (m121675Zd.length() > 0) {
                        AbstractC23304d.f113368c0 = new ContactProfile(new JSONObject(m121675Zd));
                    }
                } catch (JSONException e11) {
                    AbstractC20110a.f98889a.mo104552e(e11);
                }
            }
            if (contactProfile != null && (contactProfile2 = AbstractC23304d.f113368c0) != null) {
                int i11 = contactProfile2.f42449w;
                if (i11 == 0 && contactProfile.f42449w == 0) {
                    return 0;
                }
                if (i11 == 0 && contactProfile.f42449w == 1) {
                    return 1;
                }
                if (i11 == 1 && contactProfile.f42449w == 1) {
                    return 2;
                }
                return 3;
            }
            return -1;
        }

        /* renamed from: f */
        public final C18953k m99426f() {
            return d.f94575a.m99432a();
        }

        /* renamed from: h */
        public final List m99427h(JSONArray jSONArray) {
            AbstractC19074t.m100208f(jSONArray, "jsArray");
            ArrayList arrayList = new ArrayList();
            long currentTimeMillis = System.currentTimeMillis();
            int length = jSONArray.length();
            for (int i11 = 0; i11 < length; i11++) {
                try {
                    JSONObject jSONObject = jSONArray.getJSONObject(i11);
                    AbstractC19074t.m100205c(jSONObject);
                    arrayList.add(new C31902e9(i11 + currentTimeMillis, jSONObject));
                } catch (Exception e11) {
                    AbstractC20110a.f98889a.mo104552e(e11);
                }
            }
            return arrayList;
        }

        /* renamed from: i */
        public final String m99428i(String str) {
            int m127178g0;
            int i11;
            boolean z11;
            int i12;
            boolean z12;
            AbstractC19074t.m100208f(str, "originalInput");
            String property = System.getProperty("line.separator");
            if (property != null) {
                m127178g0 = AbstractC24342w.m127178g0(str, property, 0, false, 6, null);
                if (m127178g0 > 0) {
                    String substring = str.substring(m127178g0 + 1);
                    AbstractC19074t.m100207e(substring, "substring(...)");
                    int length = substring.length() - 1;
                    int i13 = 0;
                    boolean z13 = false;
                    while (i13 <= length) {
                        if (!z13) {
                            i12 = i13;
                        } else {
                            i12 = length;
                        }
                        if (AbstractC19074t.m100209g(substring.charAt(i12), 32) <= 0) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        if (!z13) {
                            if (!z12) {
                                z13 = true;
                            } else {
                                i13++;
                            }
                        } else {
                            if (!z12) {
                                break;
                            }
                            length--;
                        }
                    }
                    return substring.subSequence(i13, length + 1).toString();
                }
                int length2 = str.length() - 1;
                int i14 = 0;
                boolean z14 = false;
                while (i14 <= length2) {
                    if (!z14) {
                        i11 = i14;
                    } else {
                        i11 = length2;
                    }
                    if (AbstractC19074t.m100209g(str.charAt(i11), 32) <= 0) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    if (!z14) {
                        if (!z11) {
                            z14 = true;
                        } else {
                            i14++;
                        }
                    } else {
                        if (!z11) {
                            break;
                        }
                        length2--;
                    }
                }
                return str.subSequence(i14, length2 + 1).toString();
            }
            return "";
        }
    }

    /* renamed from: fi.k$a0 */
    /* loaded from: classes3.dex */
    static final class a0 extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final a0 f94570q = new a0();

        a0() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final ArrayList mo12V4() {
            return new ArrayList();
        }
    }

    /* renamed from: fi.k$b */
    /* loaded from: classes3.dex */
    public static final class b {

        /* renamed from: a */
        public String f94571a;

        /* renamed from: b */
        public String f94572b;

        public b() {
            this.f94571a = "";
            this.f94572b = "";
        }

        public b(JSONObject jSONObject) {
            if (jSONObject != null) {
                this.f94571a = jSONObject.optString("title");
                this.f94572b = jSONObject.optString("background");
            }
        }
    }

    /* renamed from: fi.k$b0 */
    /* loaded from: classes3.dex */
    static final class b0 extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final b0 f94573q = new b0();

        b0() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final HashMap mo12V4() {
            return new HashMap();
        }
    }

    /* renamed from: fi.k$c */
    /* loaded from: classes3.dex */
    public interface c {
        /* renamed from: a */
        void mo16434a(EnumC19450c enumC19450c, C30997b c30997b, C31917f9 c31917f9);

        /* renamed from: b */
        void mo16435b(EnumC19448a enumC19448a, String str);
    }

    /* renamed from: fi.k$c0 */
    /* loaded from: classes3.dex */
    static final class c0 extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final c0 f94574q = new c0();

        c0() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C27517h mo12V4() {
            C27517h m120576E1 = AbstractC23306f.m120576E1();
            AbstractC19074t.m100207e(m120576E1, "provideTensorFlowManager(...)");
            return m120576E1;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: fi.k$d */
    /* loaded from: classes3.dex */
    public static final class d {

        /* renamed from: a */
        public static final d f94575a = new d();

        /* renamed from: b */
        private static final C18953k f94576b = new C18953k(null);

        private d() {
        }

        /* renamed from: a */
        public final C18953k m99432a() {
            return f94576b;
        }
    }

    /* renamed from: fi.k$d0 */
    /* loaded from: classes3.dex */
    static final class d0 extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final d0 f94577q = new d0();

        d0() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC23792b mo12V4() {
            InterfaceC23792b m120579F1 = AbstractC23306f.m120579F1();
            AbstractC19074t.m100207e(m120579F1, "provideTimeProvider(...)");
            return m120579F1;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* renamed from: fi.k$e */
    /* loaded from: classes3.dex */
    public static final class e {

        /* renamed from: q */
        public static final e f94578q = new e("SERVER", 0, 0);

        /* renamed from: r */
        public static final e f94579r = new e("MODEL", 1, 1);

        /* renamed from: s */
        private static final /* synthetic */ e[] f94580s;

        /* renamed from: t */
        private static final /* synthetic */ InterfaceC30165a f94581t;

        /* renamed from: p */
        private final int f94582p;

        static {
            e[] m99434b = m99434b();
            f94580s = m99434b;
            f94581t = AbstractC30166b.m148796a(m99434b);
        }

        private e(String str, int i11, int i12) {
            this.f94582p = i12;
        }

        /* renamed from: b */
        private static final /* synthetic */ e[] m99434b() {
            return new e[]{f94578q, f94579r};
        }

        public static e valueOf(String str) {
            return (e) Enum.valueOf(e.class, str);
        }

        public static e[] values() {
            return (e[]) f94580s.clone();
        }

        @Override // java.lang.Enum
        public String toString() {
            return String.valueOf(this.f94582p);
        }
    }

    /* renamed from: fi.k$e0 */
    /* loaded from: classes3.dex */
    public static final class e0 extends AbstractC0939u {

        /* renamed from: a */
        final /* synthetic */ String f94583a;

        e0(String str) {
            this.f94583a = str;
        }

        @Override // p660xw.InterfaceC30214a
        /* renamed from: a */
        public void mo928a() {
            C7960e.m41971c6().m42204Mc(this.f94583a, e.f94578q);
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* renamed from: fi.k$f */
    /* loaded from: classes3.dex */
    public static final class f {

        /* renamed from: q */
        public static final f f94584q = new f("GIF", 0, "Gif");

        /* renamed from: r */
        public static final f f94585r = new f("STICKER", 1, "Sticker");

        /* renamed from: s */
        public static final f f94586s = new f("GUGGY", 2, "Guggy");

        /* renamed from: t */
        private static final /* synthetic */ f[] f94587t;

        /* renamed from: u */
        private static final /* synthetic */ InterfaceC30165a f94588u;

        /* renamed from: p */
        private final String f94589p;

        static {
            f[] m99435b = m99435b();
            f94587t = m99435b;
            f94588u = AbstractC30166b.m148796a(m99435b);
        }

        private f(String str, int i11, String str2) {
            this.f94589p = str2;
        }

        /* renamed from: b */
        private static final /* synthetic */ f[] m99435b() {
            return new f[]{f94584q, f94585r, f94586s};
        }

        public static f valueOf(String str) {
            return (f) Enum.valueOf(f.class, str);
        }

        public static f[] values() {
            return (f[]) f94587t.clone();
        }

        @Override // java.lang.Enum
        public String toString() {
            return this.f94589p;
        }
    }

    /* renamed from: fi.k$g */
    /* loaded from: classes3.dex */
    static final class g extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final g f94590q = new g();

        g() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C23528a mo12V4() {
            return new C23528a(MainApplication.Companion.m35500c());
        }
    }

    /* renamed from: fi.k$h */
    /* loaded from: classes3.dex */
    static final class h extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final h f94591q = new h();

        h() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final HashMap mo12V4() {
            return new HashMap();
        }
    }

    /* renamed from: fi.k$i */
    /* loaded from: classes3.dex */
    public static final class i extends C23994e {

        /* renamed from: w0 */
        final /* synthetic */ String f94593w0;

        /* renamed from: fi.k$i$a */
        /* loaded from: classes3.dex */
        public static final class a extends AbstractC0939u {

            /* renamed from: a */
            final /* synthetic */ File f94594a;

            /* renamed from: b */
            final /* synthetic */ C23995f f94595b;

            /* renamed from: c */
            final /* synthetic */ C18953k f94596c;

            /* renamed from: d */
            final /* synthetic */ String f94597d;

            a(File file, C23995f c23995f, C18953k c18953k, String str) {
                this.f94594a = file;
                this.f94595b = c23995f;
                this.f94596c = c18953k;
                this.f94597d = str;
            }

            @Override // p660xw.InterfaceC30214a
            /* renamed from: a */
            public void mo928a() {
                try {
                    if (this.f94594a.exists() && this.f94595b.m125657h() == 200 && this.f94596c.m99371r0(this.f94594a, this.f94597d)) {
                        this.f94596c.m99378z(this.f94594a);
                    }
                } catch (Exception e11) {
                    AbstractC23350e.m122778h(e11);
                }
            }
        }

        i(String str) {
            this.f94593w0 = str;
        }

        @Override // p379o3.AbstractRunnableC23992c
        /* renamed from: B1, reason: merged with bridge method [inline-methods] */
        public void mo1932C(String str, File file, C23995f c23995f) {
            AbstractC19074t.m100208f(str, ZMediaPlayer.OnNativeInvokeListener.ARG_URL);
            AbstractC19074t.m100208f(file, "targetFile");
            AbstractC19074t.m100208f(c23995f, "status");
            C0824j.m2153b(new a(file, c23995f, C18953k.this, this.f94593w0));
        }
    }

    /* renamed from: fi.k$j */
    /* loaded from: classes3.dex */
    public static final class j implements InterfaceC20094a {
        j() {
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
            AbstractC19074t.m100208f(c20096c, ZMediaPlayer.OnNativeInvokeListener.ARG_ERROR);
            AbstractC23309i.m121399Rx(C18953k.this.m99364l0().mo124314i());
            C18953k.this.f94559p = false;
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            AbstractC19074t.m100208f(obj, C0927o.f3427r);
            try {
                JSONObject optJSONObject = ((JSONObject) obj).optJSONObject("data");
                if (optJSONObject != null) {
                    AbstractC23309i.m121362Qx(optJSONObject.toString());
                    C18953k.this.m99375w0(optJSONObject, false);
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
            AbstractC23309i.m121399Rx(C18953k.this.m99364l0().mo124314i());
            C18953k.this.f94559p = false;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: fi.k$k */
    /* loaded from: classes3.dex */
    public static final class k extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        int f94599t;

        k(Continuation continuation) {
            super(2, continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            return new k(continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            AbstractC28298d.m142578e();
            if (this.f94599t == 0) {
                AbstractC24862s.m129228b(obj);
                C18953k.this.m99350b0().mo150743g();
                C18953k.this.m99350b0().mo150751o();
                C18953k.this.m99399W().clear();
                return C24848g0.f119245a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: r, reason: merged with bridge method [inline-methods] */
        public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
            return ((k) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* renamed from: fi.k$l */
    /* loaded from: classes3.dex */
    static final class l extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final l f94601q = new l();

        l() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final LinkedHashMap mo12V4() {
            return new LinkedHashMap();
        }
    }

    /* renamed from: fi.k$m */
    /* loaded from: classes3.dex */
    static final class m extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final m f94602q = new m();

        m() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final LinkedHashMap mo12V4() {
            return new LinkedHashMap();
        }
    }

    /* renamed from: fi.k$n */
    /* loaded from: classes3.dex */
    public static final class n implements C3237e.a {

        /* renamed from: b */
        final /* synthetic */ String f94604b;

        /* renamed from: c */
        final /* synthetic */ C30997b f94605c;

        /* renamed from: d */
        final /* synthetic */ EnumC19450c f94606d;

        /* renamed from: e */
        final /* synthetic */ boolean f94607e;

        n(String str, C30997b c30997b, EnumC19450c enumC19450c, boolean z11) {
            this.f94604b = str;
            this.f94605c = c30997b;
            this.f94606d = enumC19450c;
            this.f94607e = z11;
        }

        /* JADX WARN: Removed duplicated region for block: B:30:0x00a2 A[Catch: Exception -> 0x0035, TryCatch #0 {Exception -> 0x0035, blocks: (B:10:0x0020, B:13:0x002a, B:15:0x0030, B:18:0x005b, B:21:0x0083, B:30:0x00a2, B:32:0x00bd, B:34:0x00c1, B:35:0x00d8, B:37:0x00e5, B:38:0x00f5, B:40:0x010a, B:42:0x0112, B:44:0x00cd, B:45:0x0038, B:47:0x003e, B:7:0x012d), top: B:9:0x0020 }] */
        /* JADX WARN: Removed duplicated region for block: B:32:0x00bd A[Catch: Exception -> 0x0035, TryCatch #0 {Exception -> 0x0035, blocks: (B:10:0x0020, B:13:0x002a, B:15:0x0030, B:18:0x005b, B:21:0x0083, B:30:0x00a2, B:32:0x00bd, B:34:0x00c1, B:35:0x00d8, B:37:0x00e5, B:38:0x00f5, B:40:0x010a, B:42:0x0112, B:44:0x00cd, B:45:0x0038, B:47:0x003e, B:7:0x012d), top: B:9:0x0020 }] */
        @Override // c30.C3237e.a
        /* renamed from: a */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public void mo16447a(int i11, C31917f9 c31917f9) {
            int m153322n;
            C18953k.this.m99344X().remove(this.f94604b);
            c cVar = (c) C18953k.this.m99330F().remove(this.f94604b);
            if (cVar == null) {
                return;
            }
            if (c31917f9 != null) {
                try {
                    if (!c31917f9.f146629a.isEmpty()) {
                        EnumC19450c enumC19450c = this.f94606d;
                        if (enumC19450c != EnumC19450c.f96557t) {
                            if (enumC19450c == EnumC19450c.f96562y) {
                            }
                            boolean m121307Pf = AbstractC23309i.m121307Pf();
                            boolean m121381Rf = AbstractC23309i.m121381Rf();
                            boolean m121270Of = AbstractC23309i.m121270Of();
                            m153322n = ((C31902e9) c31917f9.f146629a.get(0)).m153322n();
                            if ((m153322n != 4 && !m121307Pf) || ((m153322n == 3 && !m121381Rf) || (m153322n == 5 && !m121270Of))) {
                                cVar.mo16435b(EnumC19448a.f96538u, "Result type isn't enable: " + this.f94605c.m150661e());
                                return;
                            }
                            if (i11 == 0) {
                                cVar.mo16435b(EnumC19448a.f96537t, "Empty result: " + this.f94605c.m150661e());
                                return;
                            }
                            if (this.f94607e) {
                                C18953k.this.m99399W().put(this.f94604b, c31917f9);
                            } else {
                                C18953k.this.m99348a0().put(this.f94604b, c31917f9);
                            }
                            ArrayList arrayList = new ArrayList(c31917f9.f146629a);
                            if (this.f94607e) {
                                C18953k c18953k = C18953k.this;
                                String m150661e = this.f94605c.m150661e();
                                AbstractC19074t.m100207e(m150661e, "getKeyword(...)");
                                c18953k.m99326C0(arrayList, m150661e);
                            }
                            C31917f9 c31917f92 = new C31917f9(c31917f9);
                            List m99380A = C18953k.this.m99380A(this.f94606d, arrayList);
                            c31917f92.f146629a = m99380A;
                            if (m99380A.size() != 0) {
                                cVar.mo16434a(this.f94606d, this.f94605c, c31917f92);
                                return;
                            }
                            cVar.mo16435b(EnumC19448a.f96537t, "Empty result: " + this.f94605c.m150661e());
                            return;
                        }
                        if (c31917f9.f146630b != EnumC19449b.f96542q) {
                            cVar.mo16435b(EnumC19448a.f96536s, "Layout type isn't support for post sending: " + this.f94605c.m150661e());
                            return;
                        }
                        boolean m121307Pf2 = AbstractC23309i.m121307Pf();
                        boolean m121381Rf2 = AbstractC23309i.m121381Rf();
                        boolean m121270Of2 = AbstractC23309i.m121270Of();
                        m153322n = ((C31902e9) c31917f9.f146629a.get(0)).m153322n();
                        if (m153322n != 4) {
                        }
                        if (i11 == 0) {
                        }
                    }
                } catch (Exception e11) {
                    EnumC19448a enumC19448a = EnumC19448a.f96539v;
                    String message = e11.getMessage();
                    if (message == null) {
                        message = "";
                    }
                    cVar.mo16435b(enumC19448a, message);
                    return;
                }
            }
            cVar.mo16435b(EnumC19448a.f96537t, "Empty result: " + this.f94605c.m150661e());
        }
    }

    /* renamed from: fi.k$o */
    /* loaded from: classes3.dex */
    public static final class o implements C3237e.a {

        /* renamed from: b */
        final /* synthetic */ String f94609b;

        /* renamed from: c */
        final /* synthetic */ boolean f94610c;

        /* renamed from: d */
        final /* synthetic */ C31919fb f94611d;

        /* renamed from: e */
        final /* synthetic */ C3239f.a f94612e;

        /* renamed from: f */
        final /* synthetic */ EnumC19450c f94613f;

        /* renamed from: g */
        final /* synthetic */ C19216b f94614g;

        o(String str, boolean z11, C31919fb c31919fb, C3239f.a aVar, EnumC19450c enumC19450c, C19216b c19216b) {
            this.f94609b = str;
            this.f94610c = z11;
            this.f94611d = c31919fb;
            this.f94612e = aVar;
            this.f94613f = enumC19450c;
            this.f94614g = c19216b;
        }

        @Override // c30.C3237e.a
        /* renamed from: a */
        public void mo16447a(int i11, C31917f9 c31917f9) {
            try {
                C18953k.this.m99344X().remove(this.f94609b);
                if (i11 == 0 && c31917f9 != null) {
                    AbstractC19074t.m100207e(c31917f9.f146629a, "data");
                    if (!r4.isEmpty()) {
                        if (this.f94610c) {
                            C18953k.this.m99399W().put(this.f94609b, c31917f9);
                        } else {
                            C18953k.this.m99348a0().put(this.f94609b, c31917f9);
                        }
                        C31917f9 c31917f92 = new C31917f9(c31917f9);
                        if (this.f94610c) {
                            ArrayList arrayList = new ArrayList(c31917f9.f146629a);
                            C18953k c18953k = C18953k.this;
                            String m150661e = this.f94611d.m150661e();
                            AbstractC19074t.m100207e(m150661e, "getKeyword(...)");
                            c18953k.m99326C0(arrayList, m150661e);
                            c31917f92.f146629a = arrayList;
                        }
                        this.f94612e.mo16450a(this.f94613f, c31917f92, this.f94611d, this.f94614g);
                        return;
                    }
                }
                C21270p.Companion.m110161b().m110148T(this.f94614g);
            } catch (Exception e11) {
                AbstractC20110a.f98889a.mo104552e(e11);
            }
        }
    }

    /* renamed from: fi.k$p */
    /* loaded from: classes3.dex */
    static final class p extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final p f94615q = new p();

        p() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C3250k0 mo12V4() {
            return new C3250k0();
        }
    }

    /* renamed from: fi.k$q */
    /* loaded from: classes3.dex */
    static final class q extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final q f94616q = new q();

        q() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final HashMap mo12V4() {
            return new HashMap();
        }
    }

    /* renamed from: fi.k$r */
    /* loaded from: classes3.dex */
    static final class r extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final r f94617q = new r();

        r() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Map mo12V4() {
            return Collections.synchronizedMap(new HashMap());
        }
    }

    /* renamed from: fi.k$s */
    /* loaded from: classes3.dex */
    public static final class s extends AbstractC0939u {

        /* renamed from: a */
        final /* synthetic */ String f94618a;

        s(String str) {
            this.f94618a = str;
        }

        @Override // p660xw.InterfaceC30214a
        /* renamed from: a */
        public void mo928a() {
            C7960e.m41971c6().m42123Fc(this.f94618a, e.f94578q);
        }
    }

    /* renamed from: fi.k$t */
    /* loaded from: classes3.dex */
    public static final class t extends AbstractC0939u {

        /* renamed from: a */
        final /* synthetic */ String f94619a;

        t(String str) {
            this.f94619a = str;
        }

        @Override // p660xw.InterfaceC30214a
        /* renamed from: a */
        public void mo928a() {
            C7960e.m41971c6().m42123Fc(this.f94619a, e.f94578q);
        }
    }

    /* renamed from: fi.k$u */
    /* loaded from: classes3.dex */
    public static final class u extends AbstractC0939u {
        u() {
        }

        @Override // p660xw.InterfaceC30214a
        /* renamed from: a */
        public void mo928a() {
            C7960e.m41971c6().m42155Ib(e.f94578q);
        }
    }

    /* renamed from: fi.k$v */
    /* loaded from: classes3.dex */
    static final class v extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final v f94620q = new v();

        v() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final HashMap mo12V4() {
            return new HashMap();
        }
    }

    /* renamed from: fi.k$w */
    /* loaded from: classes3.dex */
    static final class w extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final w f94621q = new w();

        w() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Map mo12V4() {
            return Collections.synchronizedMap(new HashMap());
        }
    }

    /* renamed from: fi.k$x */
    /* loaded from: classes3.dex */
    static final class x extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final x f94622q = new x();

        x() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC31005a mo12V4() {
            InterfaceC31005a m120726x1 = AbstractC23306f.m120726x1();
            AbstractC19074t.m100207e(m120726x1, "provideStickerRepo(...)");
            return m120726x1;
        }
    }

    /* renamed from: fi.k$y */
    /* loaded from: classes3.dex */
    static final class y extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final y f94623q = new y();

        y() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final ArrayList mo12V4() {
            return new ArrayList();
        }
    }

    /* renamed from: fi.k$z */
    /* loaded from: classes3.dex */
    static final class z extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final z f94624q = new z();

        z() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final HashMap mo12V4() {
            return new HashMap();
        }
    }

    public /* synthetic */ C18953k(AbstractC19060k abstractC19060k) {
        this();
    }

    /* JADX WARN: Removed duplicated region for block: B:79:0x01ba  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01ca  */
    /* JADX WARN: Removed duplicated region for block: B:85:? A[RETURN, SYNTHETIC] */
    /* renamed from: A0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void m99322A0(JSONObject jSONObject) {
        LinkedHashMap linkedHashMap;
        HashMap hashMap;
        JSONArray jSONArray;
        HashMap hashMap2;
        String m127114D;
        String m127114D2;
        String str;
        try {
            if (jSONObject.has("context_profile")) {
                JSONObject jSONObject2 = jSONObject.getJSONObject("context_profile");
                if (!jSONObject2.isNull("contextProfileKeyWord")) {
                    jSONArray = jSONObject2.getJSONArray("contextProfileKeyWord");
                } else {
                    jSONArray = null;
                }
                ArrayList arrayList = new ArrayList();
                if (jSONArray != null) {
                    ArrayList arrayList2 = new ArrayList();
                    LinkedHashMap linkedHashMap2 = new LinkedHashMap(Math.max(jSONArray.length(), 16));
                    try {
                        hashMap = new HashMap(Math.max(jSONArray.length(), 16));
                        try {
                            int length = jSONArray.length();
                            int i11 = 0;
                            int i12 = 0;
                            while (i12 < length) {
                                try {
                                    JSONObject jSONObject3 = jSONArray.getJSONObject(i12);
                                    JSONArray names = jSONObject3.names();
                                    if (names != null) {
                                        str = names.getString(i11);
                                    } else {
                                        str = null;
                                    }
                                    if (str != null && str.length() != 0) {
                                        JSONObject jSONObject4 = jSONObject3.getJSONObject(str);
                                        int optInt = jSONObject4.optInt("version");
                                        if (jSONObject4.has("contextCondition")) {
                                            JSONObject jSONObject5 = jSONObject4.getJSONObject("contextCondition");
                                            AbstractC19074t.m100207e(jSONObject5, "getJSONObject(...)");
                                            C18944b c18944b = new C18944b(jSONObject5);
                                            Locale locale = Locale.getDefault();
                                            AbstractC19074t.m100207e(locale, "getDefault(...)");
                                            str = str.toLowerCase(locale);
                                            AbstractC19074t.m100207e(str, "toLowerCase(...)");
                                            linkedHashMap2.put(str, c18944b);
                                        }
                                        if (jSONObject4.has("keywordCondition")) {
                                            arrayList2.add(new C30997b(str, optInt, jSONObject4.optJSONObject("keywordCondition")));
                                        }
                                        if (jSONObject4.has("decor")) {
                                            hashMap.put(str, new b(jSONObject4.optJSONObject("decor")));
                                        }
                                    }
                                } catch (Exception e11) {
                                    e11.printStackTrace();
                                }
                                i12++;
                                i11 = 0;
                            }
                            for (C30997b c30997b : m99354e0()) {
                                Iterator it = arrayList2.iterator();
                                while (true) {
                                    if (it.hasNext()) {
                                        C30997b c30997b2 = (C30997b) it.next();
                                        if (AbstractC19074t.m100204b(c30997b2.m150658b(), c30997b.m150658b())) {
                                            if (c30997b2.m150664h() > c30997b.m150664h()) {
                                                String m150658b = c30997b.m150658b();
                                                AbstractC19074t.m100207e(m150658b, "generateKey(...)");
                                                m99348a0().remove(m150658b);
                                                arrayList.add("'" + m150658b + "'");
                                            }
                                        }
                                    } else {
                                        String m150658b2 = c30997b.m150658b();
                                        AbstractC19074t.m100207e(m150658b2, "generateKey(...)");
                                        m99348a0().remove(m150658b2);
                                        arrayList.add("'" + m150658b2 + "'");
                                        break;
                                    }
                                }
                            }
                            m99354e0().clear();
                            m99354e0().addAll(arrayList2);
                            linkedHashMap = linkedHashMap2;
                            hashMap2 = hashMap;
                        } catch (Exception e12) {
                            e = e12;
                            linkedHashMap = linkedHashMap2;
                            AbstractC20110a.f98889a.mo104552e(e);
                            m99332H().clear();
                            if (linkedHashMap != null) {
                            }
                            m99343U().clear();
                            if (hashMap == null) {
                            }
                        }
                    } catch (Exception e13) {
                        e = e13;
                        linkedHashMap = linkedHashMap2;
                        hashMap = null;
                        AbstractC20110a.f98889a.mo104552e(e);
                        m99332H().clear();
                        if (linkedHashMap != null) {
                        }
                        m99343U().clear();
                        if (hashMap == null) {
                        }
                    }
                } else {
                    linkedHashMap = null;
                    hashMap2 = null;
                }
                try {
                    if (!arrayList.isEmpty()) {
                        m127114D = AbstractC24341v.m127114D(arrayList.toString(), "[", "", false, 4, null);
                        m127114D2 = AbstractC24341v.m127114D(m127114D, "]", "", false, 4, null);
                        C0824j.m2153b(new t(m127114D2));
                    }
                    hashMap = hashMap2;
                } catch (Exception e14) {
                    e = e14;
                    hashMap = hashMap2;
                    AbstractC20110a.f98889a.mo104552e(e);
                    m99332H().clear();
                    if (linkedHashMap != null) {
                    }
                    m99343U().clear();
                    if (hashMap == null) {
                    }
                }
            } else {
                linkedHashMap = null;
                hashMap = null;
            }
        } catch (Exception e15) {
            e = e15;
            linkedHashMap = null;
        }
        m99332H().clear();
        if (linkedHashMap != null) {
            m99332H().putAll(linkedHashMap);
        }
        m99343U().clear();
        if (hashMap == null) {
            m99343U().putAll(hashMap);
        }
    }

    /* renamed from: B */
    public static final C30997b.c m99323B(ContactProfile contactProfile) {
        return Companion.m99423b(contactProfile);
    }

    /* renamed from: B0 */
    private final void m99324B0(JSONObject jSONObject) {
        if (jSONObject.has("tag_keywords_search")) {
            try {
                JSONArray jSONArray = jSONObject.getJSONArray("tag_keywords_search");
                if (jSONArray.length() > 0) {
                    ArrayList arrayList = new ArrayList();
                    int length = jSONArray.length();
                    for (int i11 = 0; i11 < length; i11++) {
                        try {
                            JSONObject optJSONObject = jSONArray.optJSONObject(i11);
                            AbstractC19074t.m100205c(optJSONObject);
                            arrayList.add(new C18947e(optJSONObject));
                        } catch (Exception e11) {
                            e11.printStackTrace();
                        }
                    }
                    m99404h0().clear();
                    m99404h0().addAll(arrayList);
                }
            } catch (Exception e12) {
                e12.printStackTrace();
            }
        }
    }

    /* renamed from: C */
    private final C23528a m99325C() {
        return (C23528a) this.f94539H.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: C0 */
    public final void m99326C0(List list, String str) {
        C31902e9 c31902e9;
        HashMap hashMap = new HashMap();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C31902e9 c31902e92 = (C31902e9) it.next();
            C24860q m153318j = c31902e92.m153318j();
            if (m153318j != null) {
                hashMap.put(m153318j, c31902e92);
            }
        }
        C24860q c24860q = (C24860q) m99350b0().mo150755s().get(str);
        if (c24860q == null || (c31902e9 = (C31902e9) hashMap.get(c24860q)) == null) {
            return;
        }
        Collections.rotate(list.subList(0, list.indexOf(c31902e9) + 1), 1);
    }

    /* renamed from: D0 */
    public static final String m99327D0(String str) {
        return Companion.m99428i(str);
    }

    /* renamed from: E */
    public static final int m99328E(ContactProfile contactProfile) {
        return Companion.m99424c(contactProfile);
    }

    /* renamed from: E0 */
    private final C30997b m99329E0(String str, C30997b.c cVar) {
        try {
            if (m99408o0() && str.length() != 0) {
                return m99346Z(str, cVar);
            }
            return null;
        } catch (Exception e11) {
            AbstractC20110a.f98889a.mo104552e(e11);
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: F */
    public final Map m99330F() {
        return (Map) this.f94546c.getValue();
    }

    /* renamed from: G0 */
    private final void m99331G0(JSONObject jSONObject) {
        boolean z11;
        int optInt = jSONObject.optInt("version");
        if (optInt > this.f94540I) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.f94543L = z11;
        this.f94540I = optInt;
        String optString = jSONObject.optString(ZMediaPlayer.OnNativeInvokeListener.ARG_URL);
        AbstractC19074t.m100207e(optString, "optString(...)");
        this.f94541J = optString;
        String optString2 = jSONObject.optString("checksum");
        AbstractC19074t.m100207e(optString2, "optString(...)");
        this.f94542K = optString2;
    }

    /* renamed from: H */
    private final Map m99332H() {
        return (Map) this.f94556m.getValue();
    }

    /* renamed from: I0 */
    private final void m99333I0(JSONObject jSONObject, boolean z11) {
        String m127114D;
        String m127114D2;
        try {
            if (jSONObject.has("keyword_topics")) {
                try {
                    JSONObject jSONObject2 = jSONObject.getJSONObject("keyword_topics");
                    AbstractC19074t.m100205c(jSONObject2);
                    if (z11) {
                        m99362k0().m140710Y(jSONObject2);
                    } else {
                        m99362k0().m140716u(jSONObject2);
                    }
                    m99362k0().m140712o();
                    JSONArray jSONArray = jSONObject2.getJSONArray("topics");
                    HashMap hashMap = new HashMap();
                    int length = jSONArray.length();
                    for (int i11 = 0; i11 < length; i11++) {
                        try {
                            C31919fb c31919fb = new C31919fb(jSONArray.getJSONObject(i11));
                            String m150661e = c31919fb.m150661e();
                            if (m150661e != null && m150661e.length() != 0) {
                                String m150661e2 = c31919fb.m150661e();
                                AbstractC19074t.m100207e(m150661e2, "getKeyword(...)");
                                hashMap.put(m150661e2, c31919fb);
                            }
                        } catch (JSONException e11) {
                            e11.printStackTrace();
                        }
                    }
                    ArrayList arrayList = new ArrayList();
                    for (Map.Entry entry : m99359i0().entrySet()) {
                        String str = (String) entry.getKey();
                        C31919fb c31919fb2 = (C31919fb) entry.getValue();
                        C31919fb c31919fb3 = (C31919fb) hashMap.get(str);
                        if (c31919fb3 != null) {
                            if (c31919fb3.m150664h() > c31919fb2.m150664h()) {
                                String m150658b = c31919fb2.m150658b();
                                AbstractC19074t.m100207e(m150658b, "generateKey(...)");
                                m99348a0().remove(m150658b);
                                String str2 = "'" + new C24329j("'").m127019g(m150658b, "''") + "'";
                                AbstractC19074t.m100207e(str2, "toString(...)");
                                arrayList.add(str2);
                            }
                        } else {
                            String m150658b2 = c31919fb2.m150658b();
                            AbstractC19074t.m100207e(m150658b2, "generateKey(...)");
                            m99348a0().remove(m150658b2);
                            String str3 = "'" + new C24329j("'").m127019g(m150658b2, "''") + "'";
                            AbstractC19074t.m100207e(str3, "toString(...)");
                            arrayList.add(str3);
                        }
                    }
                    if (!arrayList.isEmpty()) {
                        m127114D = AbstractC24341v.m127114D(arrayList.toString(), "[", "", false, 4, null);
                        m127114D2 = AbstractC24341v.m127114D(m127114D, "]", "", false, 4, null);
                        C0824j.m2153b(new e0(m127114D2));
                    }
                    m99359i0().clear();
                    m99359i0().putAll(hashMap);
                    int optInt = jSONObject2.optInt("min_sentence_length", 20);
                    this.f94538G = optInt;
                    if (optInt < 0) {
                        this.f94538G = 20;
                        return;
                    }
                    return;
                } catch (Exception unused) {
                    m99362k0().m140702G();
                    return;
                }
            }
            m99362k0().m140702G();
        } catch (Exception e12) {
            AbstractC20110a.f98889a.mo104552e(e12);
        }
    }

    /* renamed from: J0 */
    private final void m99334J0(JSONObject jSONObject) {
        try {
            if (jSONObject.has("mapkwdsticker")) {
                try {
                    JSONObject jSONObject2 = jSONObject.getJSONObject("mapkwdsticker");
                    AbstractC19074t.m100205c(jSONObject2);
                    m99331G0(jSONObject2);
                    m99372t();
                    return;
                } catch (Exception unused) {
                    m99350b0().mo150762z();
                    return;
                }
            }
            m99350b0().mo150762z();
        } catch (Exception e11) {
            AbstractC20110a.f98889a.mo104552e(e11);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: L0 */
    public static final void m99335L0(C18953k c18953k, C24860q c24860q) {
        AbstractC19074t.m100208f(c18953k, "this$0");
        AbstractC19074t.m100208f(c24860q, "$idPair");
        c18953k.m99350b0().mo150734G(c24860q);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: N0 */
    public static final void m99336N0(C18953k c18953k, C24860q c24860q) {
        AbstractC19074t.m100208f(c18953k, "this$0");
        AbstractC19074t.m100208f(c24860q, "$id");
        c18953k.m99350b0().mo150734G(c24860q);
    }

    /* renamed from: P */
    public static final int m99337P(ContactProfile contactProfile) {
        return Companion.m99425e(contactProfile);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: P0 */
    public static final void m99338P0(C18953k c18953k, C24860q c24860q) {
        AbstractC19074t.m100208f(c18953k, "this$0");
        AbstractC19074t.m100208f(c24860q, "$id");
        c18953k.m99350b0().mo150734G(c24860q);
    }

    /* renamed from: Q0 */
    private final void m99339Q0(JSONObject jSONObject, boolean z11) {
        try {
            if (jSONObject.has("sort_sticker_model")) {
                try {
                    JSONObject jSONObject2 = jSONObject.getJSONObject("sort_sticker_model");
                    AbstractC19074t.m100205c(jSONObject2);
                    if (z11) {
                        m99362k0().m140709X(jSONObject2);
                    } else {
                        m99362k0().m140715t(jSONObject2);
                    }
                    m99362k0().m140711n();
                    return;
                } catch (Exception unused) {
                    m99362k0().m140701F();
                    return;
                }
            }
            m99362k0().m140701F();
        } catch (Exception e11) {
            AbstractC20110a.f98889a.mo104552e(e11);
        }
    }

    /* renamed from: R */
    public static final C18953k m99340R() {
        return Companion.m99426f();
    }

    /* renamed from: S */
    private final C3250k0 m99341S() {
        return (C3250k0) this.f94533B.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: S0 */
    public static final void m99342S0(C31902e9 c31902e9, C18953k c18953k, String str) {
        AbstractC19074t.m100208f(c31902e9, "$result");
        AbstractC19074t.m100208f(c18953k, "this$0");
        AbstractC19074t.m100208f(str, "$keyword");
        C24860q m153318j = c31902e9.m153318j();
        if (m153318j != null) {
            c18953k.m99350b0().mo150760x(str, m153318j);
        }
    }

    /* renamed from: U */
    private final Map m99343U() {
        return (Map) this.f94558o.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: X */
    public final Map m99344X() {
        return (Map) this.f94547d.getValue();
    }

    /* renamed from: Y */
    private final C30997b m99345Y(String str, String str2, C30997b.c cVar) {
        if (str != null && str2 != null) {
            ArrayList arrayList = new ArrayList();
            if (m99402f0().containsKey(str) || m99402f0().containsKey(str2)) {
                C30997b c30997b = (C30997b) m99402f0().get(str2);
                C30997b c30997b2 = (C30997b) m99402f0().get(str);
                if (c30997b != null && AbstractC19074t.m100204b(c30997b.m150661e(), str2)) {
                    arrayList.add(c30997b);
                }
                if (c30997b2 != null && AbstractC19074t.m100204b(c30997b2.m150661e(), str)) {
                    arrayList.add(c30997b2);
                }
            }
            int size = arrayList.size();
            for (int i11 = 0; i11 < size; i11++) {
                C30997b c30997b3 = (C30997b) arrayList.get(i11);
                if (C30997b.b.a.m150688c(C30997b.b.Companion, c30997b3.m150669l(), cVar, false, 4, null)) {
                    return c30997b3;
                }
            }
        }
        return null;
    }

    /* renamed from: Z */
    private final C30997b m99346Z(String str, C30997b.c cVar) {
        try {
            int size = m99354e0().size();
            for (int i11 = 0; i11 < size; i11++) {
                C30997b c30997b = (C30997b) m99354e0().get(i11);
                if (AbstractC19074t.m100204b(c30997b.m150661e(), str) && C30997b.b.a.m150688c(C30997b.b.Companion, c30997b.m150669l(), cVar, false, 4, null)) {
                    return c30997b;
                }
            }
            return null;
        } catch (Exception e11) {
            e11.printStackTrace();
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a0 */
    public final Map m99348a0() {
        Object value = this.f94544a.getValue();
        AbstractC19074t.m100207e(value, "getValue(...)");
        return (Map) value;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b0 */
    public final InterfaceC31005a m99350b0() {
        return (InterfaceC31005a) this.f94537F.getValue();
    }

    /* renamed from: e0 */
    private final List m99354e0() {
        return (List) this.f94557n.getValue();
    }

    /* renamed from: i0 */
    private final Map m99359i0() {
        return (Map) this.f94534C.getValue();
    }

    /* renamed from: k0 */
    private final C27517h m99362k0() {
        return (C27517h) this.f94535D.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: l0 */
    public final InterfaceC23792b m99364l0() {
        return (InterfaceC23792b) this.f94536E.getValue();
    }

    /* renamed from: p0 */
    private final boolean m99369p0(String str) {
        if (m99402f0().isEmpty()) {
            return false;
        }
        return m99402f0().containsKey(str);
    }

    /* renamed from: q0 */
    private final boolean m99370q0(String str) {
        if (m99354e0().isEmpty()) {
            return false;
        }
        Iterator it = m99354e0().iterator();
        while (it.hasNext()) {
            if (AbstractC19074t.m100204b(((C30997b) it.next()).m150661e(), str)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: r0 */
    public final boolean m99371r0(File file, String str) {
        String m104881m = AbstractC20130d.m104881m(file);
        if (m104881m == null || m104881m.length() <= 0 || !AbstractC19074t.m100204b(m104881m, str)) {
            return false;
        }
        return true;
    }

    /* renamed from: t */
    private final void m99372t() {
        if (!this.f94543L) {
            return;
        }
        final String str = this.f94542K;
        AbstractC0837p0.Companion.m2237f().mo2040a(new Runnable() { // from class: fi.f
            @Override // java.lang.Runnable
            public final void run() {
                C18953k.m99373u(C18953k.this, str);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: u */
    public static final void m99373u(C18953k c18953k, String str) {
        AbstractC19074t.m100208f(c18953k, "this$0");
        AbstractC19074t.m100208f(str, "$finalMapResultsDataChecksum");
        try {
            File file = new File(C20131e.f99303a.m104944b0() + "all_suggest_result");
            i iVar = new i(str);
            if (file.exists() && c18953k.m99371r0(file, str)) {
                if (c18953k.m99350b0().mo150753q().isEmpty()) {
                    c18953k.m99378z(file);
                }
            }
            AbstractC20130d.m104858T0(file);
            c18953k.m99325C().m123600e(c18953k.f94541J, file, iVar);
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:5:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:8:? A[RETURN, SYNTHETIC] */
    /* renamed from: v0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void m99374v0(JSONObject jSONObject) {
        JSONArray jSONArray;
        LinkedHashMap linkedHashMap = null;
        if (jSONObject.has("context_key_words")) {
            try {
                JSONArray jSONArray2 = jSONObject.getJSONArray("context_key_words");
                if (jSONArray2.length() > 0) {
                    LinkedHashMap linkedHashMap2 = new LinkedHashMap(Math.max(jSONArray2.length(), 16));
                    try {
                        int length = jSONArray2.length();
                        int i11 = 0;
                        for (int i12 = 0; i12 < length; i12++) {
                            JSONObject optJSONObject = jSONArray2.optJSONObject(i12);
                            if (optJSONObject != null) {
                                jSONArray = optJSONObject.names();
                            } else {
                                jSONArray = null;
                            }
                            if (jSONArray != null) {
                                JSONArray names = optJSONObject.names();
                                AbstractC19074t.m100205c(names);
                                String string = names.getString(0);
                                if (string != null && string.length() != 0) {
                                    JSONObject jSONObject2 = optJSONObject.getJSONObject(string);
                                    AbstractC19074t.m100207e(jSONObject2, "getJSONObject(...)");
                                    C18944b c18944b = new C18944b(jSONObject2);
                                    int i13 = i11 + 1;
                                    c18944b.m99284r(i11);
                                    AbstractC19074t.m100205c(string);
                                    Locale locale = Locale.getDefault();
                                    AbstractC19074t.m100207e(locale, "getDefault(...)");
                                    String lowerCase = string.toLowerCase(locale);
                                    AbstractC19074t.m100207e(lowerCase, "toLowerCase(...)");
                                    AbstractC19074t.m100205c(lowerCase);
                                    linkedHashMap2.put(lowerCase, c18944b);
                                    i11 = i13;
                                }
                            }
                        }
                        linkedHashMap = linkedHashMap2;
                    } catch (Exception e11) {
                        e = e11;
                        linkedHashMap = linkedHashMap2;
                        e.printStackTrace();
                        m99383G().clear();
                        if (linkedHashMap == null) {
                        }
                    }
                }
            } catch (Exception e12) {
                e = e12;
            }
        }
        m99383G().clear();
        if (linkedHashMap == null) {
            m99383G().putAll(linkedHashMap);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: w0 */
    public final void m99375w0(JSONObject jSONObject, boolean z11) {
        boolean z12;
        try {
            this.f94550g = AbstractC18069a.m96087f(jSONObject, "expired_time");
            this.f94551h = AbstractC18069a.m96085d(jSONObject, "word_search");
            this.f94552i = jSONObject.optInt("dismiss_delay_time", 1500);
            boolean z13 = false;
            this.f94562s = jSONObject.optInt("total_sticker_show", 0);
            this.f94564u = jSONObject.optInt("suggestion_process_delay", 100);
            if (jSONObject.optInt("enable_suggest_last_kwd_after_send", 0) == 1) {
                z12 = true;
            } else {
                z12 = false;
            }
            this.f94563t = z12;
            this.f94553j = jSONObject.optInt("dismiss_time_after_send", 3000);
            this.f94554k = jSONObject.optInt("delay_time_suggest_sticker_after_send", 1000);
            this.f94555l = jSONObject.optInt("dismiss_time_context", ZAbstractBase.ZVU_PROCESS_FLUSH);
            boolean[] zArr = {false};
            m99377y0(jSONObject, z11, zArr);
            m99324B0(jSONObject);
            m99374v0(jSONObject);
            m99379z0(jSONObject, zArr[0], this.f94565v);
            if (AbstractC23309i.m122467ug() == 1) {
                z13 = true;
            }
            this.f94561r = z13;
            m99322A0(jSONObject);
            m99333I0(jSONObject, z11);
            m99339Q0(jSONObject, z11);
            m99334J0(jSONObject);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: x0 */
    public static final List m99376x0(JSONArray jSONArray) {
        return Companion.m99427h(jSONArray);
    }

    /* renamed from: y0 */
    private final void m99377y0(JSONObject jSONObject, boolean z11, boolean[] zArr) {
        if (jSONObject.has("post_sending_spam_config")) {
            JSONObject jSONObject2 = jSONObject.getJSONObject("post_sending_spam_config");
            this.f94565v = jSONObject2.optInt("spam_factor", 50);
            this.f94567x = jSONObject2.optInt("delta+", 5);
            this.f94568y = -jSONObject2.optInt("delta-", 1);
            this.f94566w = jSONObject2.optInt("min_spam_factor", 20);
            if (z11) {
                this.f94569z = jSONObject2.optInt("version", 0);
                return;
            }
            int optInt = jSONObject2.optInt("version", 0);
            if (optInt > this.f94569z) {
                zArr[0] = true;
                this.f94569z = optInt;
                C7960e.m41971c6().m42314Xc(this.f94565v);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: z */
    public final void m99378z(File file) {
        FileInputStream fileInputStream = new FileInputStream(file);
        GZIPInputStream gZIPInputStream = new GZIPInputStream(fileInputStream);
        InputStreamReader inputStreamReader = new InputStreamReader(gZIPInputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
        try {
            String readLine = bufferedReader.readLine();
            String str = "";
            do {
                str = str + readLine;
                readLine = bufferedReader.readLine();
            } while (readLine != null);
            fileInputStream.close();
            gZIPInputStream.close();
            inputStreamReader.close();
            bufferedReader.close();
            JSONObject jSONObject = new JSONObject(str);
            JSONArray optJSONArray = jSONObject.optJSONArray("index");
            JSONObject optJSONObject = jSONObject.optJSONObject("map");
            if (optJSONArray != null && optJSONObject != null) {
                m99350b0().mo150761y(optJSONArray);
                m99350b0().mo150759w(optJSONObject);
            } else {
                m99350b0().mo150762z();
            }
            JSONObject optJSONObject2 = jSONObject.optJSONObject("stickercondition");
            if (optJSONObject2 != null) {
                m99350b0().mo150758v(optJSONObject2);
            } else {
                m99350b0().mo150730C();
            }
        } catch (Throwable th2) {
            fileInputStream.close();
            gZIPInputStream.close();
            inputStreamReader.close();
            bufferedReader.close();
            throw th2;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:63:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:66:? A[RETURN, SYNTHETIC] */
    /* renamed from: z0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void m99379z0(JSONObject jSONObject, boolean z11, int i11) {
        String m127114D;
        String m127114D2;
        C30997b c30997b;
        HashMap hashMap = null;
        try {
            if (jSONObject.has("key_words")) {
                JSONArray jSONArray = jSONObject.getJSONArray("key_words");
                HashMap hashMap2 = new HashMap(Math.max(jSONArray.length(), 16));
                try {
                    int length = jSONArray.length();
                    for (int i12 = 0; i12 < length; i12++) {
                        try {
                            JSONObject jSONObject2 = jSONArray.getJSONObject(i12);
                            AbstractC19074t.m100207e(jSONObject2, "getJSONObject(...)");
                            c30997b = new C30997b(jSONObject2);
                        } catch (JSONException e11) {
                            e = e11;
                        }
                        try {
                            c30997b.m150674r(i11);
                            String m150661e = c30997b.m150661e();
                            if (m150661e != null && m150661e.length() != 0) {
                                String m150661e2 = c30997b.m150661e();
                                AbstractC19074t.m100207e(m150661e2, "getKeyword(...)");
                                hashMap2.put(m150661e2, c30997b);
                            }
                        } catch (JSONException e12) {
                            e = e12;
                            e.printStackTrace();
                        }
                    }
                    ArrayList arrayList = new ArrayList();
                    for (Map.Entry entry : m99402f0().entrySet()) {
                        String str = (String) entry.getKey();
                        C30997b c30997b2 = (C30997b) entry.getValue();
                        C30997b c30997b3 = (C30997b) hashMap2.get(str);
                        if (c30997b3 != null) {
                            if (c30997b3.m150664h() > c30997b2.m150664h()) {
                                String m150658b = c30997b2.m150658b();
                                AbstractC19074t.m100207e(m150658b, "generateKey(...)");
                                m99348a0().remove(m150658b);
                                arrayList.add("'" + new C24329j("'").m127019g(m150658b, "''") + "'");
                            }
                            if (!z11) {
                                c30997b3.m150674r(c30997b2.m150670m());
                            }
                        } else {
                            String m150658b2 = c30997b2.m150658b();
                            AbstractC19074t.m100207e(m150658b2, "generateKey(...)");
                            m99348a0().remove(m150658b2);
                            arrayList.add("'" + new C24329j("'").m127019g(m150658b2, "''") + "'");
                        }
                    }
                    if (!arrayList.isEmpty()) {
                        m127114D = AbstractC24341v.m127114D(arrayList.toString(), "[", "", false, 4, null);
                        m127114D2 = AbstractC24341v.m127114D(m127114D, "]", "", false, 4, null);
                        C0824j.m2153b(new s(m127114D2));
                    }
                    hashMap = hashMap2;
                } catch (Exception e13) {
                    e = e13;
                    hashMap = hashMap2;
                    AbstractC20110a.f98889a.mo104552e(e);
                    m99402f0().clear();
                    if (hashMap == null) {
                    }
                }
            }
        } catch (Exception e14) {
            e = e14;
        }
        m99402f0().clear();
        if (hashMap == null) {
            m99402f0().putAll(hashMap);
        }
    }

    /* renamed from: A */
    public final List m99380A(EnumC19450c enumC19450c, List list) {
        AbstractC19074t.m100208f(enumC19450c, "suggestType");
        AbstractC19074t.m100208f(list, "stickers");
        if (list.isEmpty()) {
            return list;
        }
        int i11 = this.f94562s;
        C29675a mo150746j = m99350b0().mo150746j();
        if (enumC19450c == EnumC19450c.f96555r && mo150746j != null) {
            i11 = mo150746j.m147601b();
        } else if (enumC19450c == EnumC19450c.f96561x) {
            i11 = list.size();
        }
        ArrayList arrayList = new ArrayList();
        int size = list.size();
        for (int i12 = 0; i12 < size; i12++) {
            C31902e9 c31902e9 = (C31902e9) list.get(i12);
            if (enumC19450c == EnumC19450c.f96561x) {
                if (c31902e9.m153321m() != null) {
                    arrayList.add(c31902e9);
                }
            } else {
                arrayList.add(c31902e9);
            }
            if (arrayList.size() >= i11) {
                break;
            }
        }
        return arrayList;
    }

    /* renamed from: D */
    public final List m99381D(String str, C30997b.c cVar) {
        C30997b.b bVar;
        AbstractC19074t.m100208f(str, "keyword");
        AbstractC19074t.m100208f(cVar, "userInputData");
        ArrayList arrayList = new ArrayList();
        List list = (List) m99350b0().mo150733F().get(str);
        if (list == null) {
            return arrayList;
        }
        List mo150753q = m99350b0().mo150753q();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            int intValue = ((Number) it.next()).intValue();
            if (intValue < mo150753q.size() && ((bVar = (C30997b.b) m99350b0().mo150736I().get(Integer.valueOf(intValue))) == null || C30997b.b.Companion.m150690b(bVar, cVar, true))) {
                arrayList.add(mo150753q.get(intValue));
            }
        }
        return arrayList;
    }

    /* renamed from: F0 */
    public final void m99382F0() {
        try {
            AbstractC23309i.m121399Rx(0L);
            m99402f0().clear();
            m99354e0().clear();
            m99348a0().clear();
            m99399W().clear();
            m99359i0().clear();
            C0824j.m2153b(new u());
            AbstractC23309i.m121136Kt(0L);
            this.f94560q = false;
            AbstractC23306f.m120726x1().mo150729B();
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: G */
    public final Map m99383G() {
        return (Map) this.f94548e.getValue();
    }

    /* renamed from: H0 */
    public final void m99384H0(boolean z11) {
        this.f94561r = z11;
    }

    /* renamed from: I */
    public final b m99385I(String str) {
        AbstractC19074t.m100208f(str, "keyword");
        return (b) m99343U().get(str);
    }

    /* renamed from: J */
    public final int m99386J() {
        return this.f94568y;
    }

    /* renamed from: K */
    public final int m99387K() {
        return this.f94552i;
    }

    /* renamed from: K0 */
    public final void m99388K0(String str) {
        AbstractC19074t.m100208f(str, "id");
        final C24860q c24860q = new C24860q(7, str);
        AbstractC0837p0.Companion.m2237f().mo2040a(new Runnable() { // from class: fi.i
            @Override // java.lang.Runnable
            public final void run() {
                C18953k.m99335L0(C18953k.this, c24860q);
            }
        });
    }

    /* renamed from: L */
    public final int m99389L() {
        return this.f94553j;
    }

    /* renamed from: M */
    public final int m99390M() {
        return this.f94554k;
    }

    /* renamed from: M0 */
    public final void m99391M0(String str) {
        AbstractC19074t.m100208f(str, "gifId");
        final C24860q c24860q = new C24860q(1, str);
        AbstractC0837p0.Companion.m2237f().mo2040a(new Runnable() { // from class: fi.j
            @Override // java.lang.Runnable
            public final void run() {
                C18953k.m99336N0(C18953k.this, c24860q);
            }
        });
    }

    /* renamed from: N */
    public final int m99392N() {
        return this.f94555l;
    }

    /* renamed from: O */
    public final C3250k0.a m99393O() {
        return m99341S().m16508d();
    }

    /* renamed from: O0 */
    public final void m99394O0(int i11) {
        final C24860q c24860q = new C24860q(0, String.valueOf(i11));
        AbstractC0837p0.Companion.m2237f().mo2040a(new Runnable() { // from class: fi.h
            @Override // java.lang.Runnable
            public final void run() {
                C18953k.m99338P0(C18953k.this, c24860q);
            }
        });
    }

    /* renamed from: Q */
    public final int m99395Q() {
        return this.f94567x;
    }

    /* renamed from: R0 */
    public final void m99396R0(int i11, final String str, final C31902e9 c31902e9) {
        AbstractC19074t.m100208f(str, "keyword");
        AbstractC19074t.m100208f(c31902e9, "result");
        if ((i11 != 1 && i11 != 10 && i11 != 11) || str.length() == 0) {
            return;
        }
        AbstractC0837p0.Companion.m2237f().mo2040a(new Runnable() { // from class: fi.g
            @Override // java.lang.Runnable
            public final void run() {
                C18953k.m99342S0(C31902e9.this, this, str);
            }
        });
    }

    /* renamed from: T */
    public final List m99397T() {
        List m16509e = m99341S().m16509e();
        AbstractC19074t.m100207e(m16509e, "getListKwds(...)");
        return m16509e;
    }

    /* renamed from: V */
    public final int m99398V() {
        return this.f94566w;
    }

    /* renamed from: W */
    public final Map m99399W() {
        Object value = this.f94545b.getValue();
        AbstractC19074t.m100207e(value, "getValue(...)");
        return (Map) value;
    }

    /* renamed from: c0 */
    public final synchronized void m99400c0(EnumC19450c enumC19450c, C30997b c30997b, boolean z11, C30997b.c cVar, c cVar2) {
        EnumC19450c enumC19450c2;
        Object obj;
        List list;
        AbstractC19074t.m100208f(enumC19450c, "suggestType");
        AbstractC19074t.m100208f(c30997b, "suggestKeyword");
        AbstractC19074t.m100208f(cVar, "userInputData");
        AbstractC19074t.m100208f(cVar2, "callback");
        try {
            String m150661e = c30997b.m150661e();
            AbstractC19074t.m100207e(m150661e, "getKeyword(...)");
            if (!m99369p0(m150661e)) {
                String m150661e2 = c30997b.m150661e();
                AbstractC19074t.m100207e(m150661e2, "getKeyword(...)");
                if (!m99370q0(m150661e2)) {
                    cVar2.mo16435b(EnumC19448a.f96533p, "Invalid keyword");
                    return;
                }
            }
            enumC19450c2 = EnumC19450c.f96557t;
        } catch (Exception e11) {
            AbstractC20110a.f98889a.mo104552e(e11);
        }
        if (enumC19450c == enumC19450c2 && Companion.m99422j() >= c30997b.m150670m()) {
            cVar2.mo16435b(EnumC19448a.f96534q, "Keyword annoy limit exceeded: " + c30997b.m150661e());
            return;
        }
        String m150658b = c30997b.m150658b();
        AbstractC19074t.m100207e(m150658b, "generateKey(...)");
        if (z11) {
            obj = m99399W().get(m150658b);
        } else {
            obj = m99348a0().get(m150658b);
        }
        C31917f9 c31917f9 = (C31917f9) obj;
        if (c31917f9 != null) {
            list = c31917f9.f146629a;
        } else {
            list = null;
        }
        if (list != null && (!list.isEmpty())) {
            if ((enumC19450c == enumC19450c2 || enumC19450c == EnumC19450c.f96562y) && c31917f9.f146630b != EnumC19449b.f96542q) {
                cVar2.mo16435b(EnumC19448a.f96536s, "Layout type isn't support for post sending: " + c30997b.m150661e());
                return;
            }
            ArrayList arrayList = new ArrayList(list);
            if (z11) {
                String m150661e3 = c30997b.m150661e();
                AbstractC19074t.m100207e(m150661e3, "getKeyword(...)");
                m99326C0(arrayList, m150661e3);
            }
            C31917f9 c31917f92 = new C31917f9(c31917f9);
            List m99380A = m99380A(enumC19450c, arrayList);
            c31917f92.f146629a = m99380A;
            if (m99380A.size() != 0) {
                cVar2.mo16434a(enumC19450c, c30997b, c31917f92);
            } else {
                cVar2.mo16435b(EnumC19448a.f96537t, "Empty result: " + c30997b.m150661e());
            }
            return;
        }
        m99330F().put(m150658b, cVar2);
        if (!m99344X().containsKey(m150658b)) {
            C3237e c3237e = new C3237e(null, c30997b, z11, cVar, new n(m150658b, c30997b, enumC19450c, z11), 1, null);
            m99344X().put(m150658b, c3237e);
            c3237e.start();
        }
    }

    /* renamed from: d0 */
    public final void m99401d0(EnumC19450c enumC19450c, C31919fb c31919fb, boolean z11, C30997b.c cVar, C3239f.a aVar, C19216b c19216b) {
        Map m99348a0;
        List list;
        AbstractC19074t.m100208f(enumC19450c, "suggestType");
        AbstractC19074t.m100208f(c31919fb, "suggestTopic");
        AbstractC19074t.m100208f(cVar, "userInputData");
        AbstractC19074t.m100208f(aVar, "callback");
        AbstractC19074t.m100208f(c19216b, "trackingData");
        String m150658b = c31919fb.m150658b();
        AbstractC19074t.m100207e(m150658b, "generateKey(...)");
        if (z11) {
            m99348a0 = m99399W();
        } else {
            m99348a0 = m99348a0();
        }
        C31917f9 c31917f9 = (C31917f9) m99348a0.get(m150658b);
        if (c31917f9 != null) {
            list = c31917f9.f146629a;
        } else {
            list = null;
        }
        if (list != null) {
            List list2 = list;
            if (!list2.isEmpty()) {
                C31917f9 c31917f92 = new C31917f9(c31917f9);
                if (z11) {
                    ArrayList arrayList = new ArrayList(list2);
                    String m150661e = c31919fb.m150661e();
                    AbstractC19074t.m100207e(m150661e, "getKeyword(...)");
                    m99326C0(arrayList, m150661e);
                    c31917f92.f146629a = arrayList;
                }
                aVar.mo16450a(enumC19450c, c31917f92, c31919fb, c19216b);
                return;
            }
        }
        if (!m99344X().containsKey(m150658b)) {
            C3237e c3237e = new C3237e(null, c31919fb, z11, cVar, new o(m150658b, z11, c31919fb, aVar, enumC19450c, c19216b), 1, null);
            m99344X().put(m150658b, c3237e);
            c3237e.start();
        }
    }

    /* renamed from: f0 */
    public final HashMap m99402f0() {
        return (HashMap) this.f94549f.getValue();
    }

    /* renamed from: g0 */
    public final C30997b m99403g0(String str, String str2, C30997b.c cVar) {
        int length;
        int length2;
        boolean z11;
        String str3;
        String str4;
        C30997b c30997b;
        String m127114D;
        boolean m127120J;
        int i11;
        boolean z12;
        AbstractC19074t.m100208f(str, "originalInput");
        AbstractC19074t.m100208f(str2, "preprocessedInput");
        AbstractC19074t.m100208f(cVar, "userInputData");
        if (str2.length() <= 0) {
            return null;
        }
        String[] strArr = (String[]) new C24329j(" ").m127021i(str2, 0).toArray(new String[0]);
        int min = Math.min(strArr.length, this.f94551h);
        if (min <= 0 || (length = strArr.length - min) > (length2 = strArr.length - 1)) {
            return null;
        }
        String str5 = "";
        int i12 = length2;
        String str6 = "";
        C30997b c30997b2 = null;
        boolean z13 = true;
        while (true) {
            if (strArr[i12].length() > 0) {
                String m120002o = AbstractC23262x6.m120002o(strArr[i12]);
                AbstractC19074t.m100207e(m120002o, "convertSignToNoSign(...)");
                if (z13) {
                    z11 = false;
                } else {
                    str5 = " " + str5;
                    str6 = " " + str6;
                    z11 = z13;
                }
                String str7 = m120002o + str5;
                String str8 = strArr[i12] + str6;
                Locale locale = Locale.getDefault();
                AbstractC19074t.m100207e(locale, "getDefault(...)");
                String lowerCase = str8.toLowerCase(locale);
                AbstractC19074t.m100207e(lowerCase, "toLowerCase(...)");
                C30997b m99345Y = m99345Y(str7, lowerCase, cVar);
                if (m99345Y != null) {
                    m99345Y.m150667k(str8);
                    if (i12 == 0) {
                        str3 = str8;
                        str4 = str7;
                        m127114D = AbstractC24341v.m127114D(str, "\n", "", false, 4, null);
                        int length3 = m127114D.length() - 1;
                        int i13 = 0;
                        boolean z14 = false;
                        while (i13 <= length3) {
                            if (!z14) {
                                i11 = i13;
                            } else {
                                i11 = length3;
                            }
                            if (AbstractC19074t.m100209g(m127114D.charAt(i11), 32) <= 0) {
                                z12 = true;
                            } else {
                                z12 = false;
                            }
                            if (!z14) {
                                if (!z12) {
                                    z14 = true;
                                } else {
                                    i13++;
                                }
                            } else {
                                if (!z12) {
                                    break;
                                }
                                length3--;
                            }
                        }
                        String obj = m127114D.subSequence(i13, length3 + 1).toString();
                        String m150662f = m99345Y.m150662f();
                        AbstractC19074t.m100207e(m150662f, "getKeywordWithSign(...)");
                        m127120J = AbstractC24341v.m127120J(obj, m150662f, false, 2, null);
                        c30997b = m99345Y;
                        c30997b.m150675s(m127120J);
                    } else {
                        c30997b = m99345Y;
                        str3 = str8;
                        str4 = str7;
                        c30997b.m150675s(false);
                    }
                    c30997b2 = c30997b;
                } else {
                    str3 = str8;
                    str4 = str7;
                }
                z13 = z11;
                str6 = str3;
                str5 = str4;
            }
            if (i12 != length) {
                i12--;
            } else {
                return c30997b2;
            }
        }
    }

    /* renamed from: h0 */
    public final List m99404h0() {
        return (List) this.f94532A.getValue();
    }

    /* renamed from: j0 */
    public final int m99405j0() {
        return this.f94564u;
    }

    /* renamed from: m0 */
    public final C31919fb m99406m0(String str) {
        AbstractC19074t.m100208f(str, "topic");
        return (C31919fb) m99359i0().get(str);
    }

    /* renamed from: n0 */
    public final void m99407n0(int i11, int i12, int i13) {
        m99341S().m16510f(i11, i12, i13);
    }

    /* renamed from: o0 */
    public final boolean m99408o0() {
        return AbstractC23309i.m122528w3();
    }

    /* renamed from: q */
    public final void m99409q(C3250k0.a aVar) {
        m99341S().m16506b(aVar);
    }

    /* renamed from: r */
    public final String m99410r(C3535c c3535c, int i11, long j11, int i12, boolean z11, boolean z12) {
        long mo124311f;
        boolean z13;
        boolean z14;
        AbstractC19074t.m100208f(c3535c, "currentChat");
        for (Map.Entry entry : m99383G().entrySet()) {
            String str = (String) entry.getKey();
            C18944b c18944b = (C18944b) entry.getValue();
            try {
                Iterator it = c18944b.m99272f().iterator();
                boolean z15 = false;
                int i13 = 0;
                while (it.hasNext()) {
                    Long l11 = null;
                    switch (((Number) it.next()).intValue()) {
                        case 0:
                            int m136068l0 = c3535c.m136068l0();
                            if (c18944b.m99275i() <= m136068l0 && m136068l0 <= c18944b.m99274h()) {
                                break;
                            }
                            break;
                        case 1:
                            if (c3535c.m17971y0().m41013q()) {
                                break;
                            } else {
                                if (c18944b.m99269c() == 1) {
                                    if (z11) {
                                        break;
                                    }
                                }
                                if (c18944b.m99269c() == 0 && !z11) {
                                    break;
                                }
                            }
                            break;
                        case 2:
                            if (i11 >= c18944b.m99277k() && i11 < c18944b.m99276j()) {
                                break;
                            }
                            break;
                        case 3:
                            Long valueOf = Long.valueOf(j11);
                            if (valueOf.longValue() > 0) {
                                l11 = valueOf;
                            }
                            if (l11 != null) {
                                mo124311f = l11.longValue();
                            } else {
                                mo124311f = m99364l0().mo124311f();
                            }
                            if (c18944b.m99278l() > 0 && m99364l0().mo124311f() - mo124311f >= c18944b.m99278l() * 60 * 1000) {
                                break;
                            }
                            break;
                        case 4:
                            if (i12 > 0) {
                                z13 = true;
                            } else {
                                z13 = false;
                            }
                            if (c18944b.m99279m() == 0) {
                                if (!z13) {
                                    break;
                                }
                            }
                            if (c18944b.m99279m() == 1 && z13) {
                                break;
                            }
                            break;
                        case 5:
                            if (c3535c.m17971y0().m41013q()) {
                                if (c18944b.m99270d() == 1) {
                                    if (z12) {
                                        break;
                                    }
                                }
                                if (c18944b.m99270d() == 0 && !z12) {
                                    break;
                                }
                            } else {
                                break;
                            }
                            break;
                        case 6:
                            int m99425e = Companion.m99425e(C28203u6.m141798e(C28203u6.f131407a, c3535c.m17944I0(), null, 2, null));
                            if (!c3535c.m17971y0().m41013q() && m99425e != -1 && c18944b.m99268b().contains(Integer.valueOf(m99425e))) {
                                break;
                            }
                            break;
                        case 7:
                            if (c18944b.m99283q() == 1) {
                                if (c3535c.m17971y0().m41013q()) {
                                    break;
                                }
                            }
                            if (c18944b.m99283q() == 0 && !c3535c.m17971y0().m41013q()) {
                                break;
                            }
                            break;
                        case 8:
                            if (Companion.m99424c(C28203u6.m141798e(C28203u6.f131407a, c3535c.m17944I0(), null, 2, null)) == 1) {
                                z14 = true;
                            } else {
                                z14 = false;
                            }
                            if (c3535c.m17971y0().m41013q()) {
                                break;
                            } else {
                                if (c18944b.m99267a() == 1) {
                                    if (z14) {
                                        break;
                                    }
                                }
                                if (c18944b.m99267a() == 0 && !z14) {
                                    break;
                                }
                            }
                            break;
                        case 9:
                            boolean m98558u = C18644n.m98531l().m98558u(c3535c.m17944I0());
                            if (c3535c.m17971y0().m41013q()) {
                                break;
                            } else {
                                if (c18944b.m99282p() == 1) {
                                    if (m98558u) {
                                        break;
                                    }
                                }
                                if (c18944b.m99282p() == 0 && !m98558u) {
                                    break;
                                }
                            }
                            break;
                        case 10:
                            boolean contains = C21927m.m114302u().m114351p().contains(c3535c.m17944I0());
                            if (c3535c.m17971y0().m41013q()) {
                                break;
                            } else {
                                if (c18944b.m99281o() == 1) {
                                    if (contains) {
                                        break;
                                    }
                                }
                                if (c18944b.m99281o() == 0 && !contains) {
                                    break;
                                }
                            }
                            break;
                        case 11:
                            int m99273g = c18944b.m99273g();
                            if (m99273g < 0) {
                                break;
                            } else {
                                C17945a0 c17945a0 = (C17945a0) c3535c.m136040C();
                                if (c17945a0 != null && c17945a0.m95032V6()) {
                                    int m95089b4 = c17945a0.m95089b4();
                                    if (m99273g == 0) {
                                        break;
                                    } else {
                                        if (m99273g == 1) {
                                            if (m95089b4 == 4 && AbstractC23309i.m121490Ud()) {
                                                break;
                                            }
                                        }
                                        if (m99273g == 2) {
                                            if (m95089b4 == 3) {
                                                break;
                                            }
                                        }
                                        if (m99273g == 3) {
                                            if (m95089b4 != 3 && m95089b4 != 2) {
                                                break;
                                            }
                                        } else {
                                            break;
                                        }
                                    }
                                }
                            }
                            break;
                        case 12:
                            if (c18944b.m99280n().contains(Integer.valueOf(AbstractC23160o0.m119234a0()))) {
                                break;
                            } else {
                                break;
                            }
                    }
                    i13++;
                }
                if (i13 > 0 && i13 == c18944b.m99272f().size()) {
                    z15 = true;
                }
                if (str.length() > 0 && z15) {
                    return str;
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
        return "";
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0079, code lost:            if (r13 != false) goto L22;     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00a2, code lost:            if (r13 != false) goto L22;     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00be, code lost:            if (r13 != false) goto L22;     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x00de, code lost:            if (r0.m99268b().contains(java.lang.Integer.valueOf(r13)) != false) goto L22;     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0169, code lost:            if ((nh0.C23793c.Companion.m124321a().mo124311f() - r8) >= ((r0.m99278l() * 60) * 1000)) goto L89;     */
    /* JADX WARN: Failed to find 'out' block for switch in B:10:0x005c. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0189 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x018b A[SYNTHETIC] */
    /* renamed from: s */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final C30997b m99411s(ContactProfile contactProfile, C30997b.c cVar) {
        Iterator it;
        C30997b c30997b;
        Iterator it2;
        int i11;
        boolean z11;
        AbstractC19074t.m100208f(contactProfile, "profile");
        AbstractC19074t.m100208f(cVar, "userInputData");
        int i12 = Calendar.getInstance().get(11);
        Iterator it3 = m99332H().entrySet().iterator();
        long j11 = 0;
        boolean z12 = false;
        C30997b c30997b2 = null;
        while (it3.hasNext()) {
            Map.Entry entry = (Map.Entry) it3.next();
            String str = (String) entry.getKey();
            C18944b c18944b = (C18944b) entry.getValue();
            try {
                it2 = c18944b.m99272f().iterator();
                i11 = 0;
            } catch (Exception e11) {
                e = e11;
                it = it3;
            }
            while (true) {
                boolean z13 = true;
                if (it2.hasNext()) {
                    switch (((Number) it2.next()).intValue()) {
                        case 0:
                        case 4:
                        case 5:
                        case 7:
                            it = it3;
                            c30997b = c30997b2;
                            if (z13) {
                                try {
                                    i11++;
                                } catch (Exception e12) {
                                    e = e12;
                                    e.printStackTrace();
                                    c30997b2 = c30997b;
                                    it3 = it;
                                }
                            }
                            c30997b2 = c30997b;
                            it3 = it;
                        case 1:
                            it = it3;
                            c30997b = c30997b2;
                            z13 = contactProfile.f42403c1;
                            if (z13) {
                            }
                            c30997b2 = c30997b;
                            it3 = it;
                            break;
                        case 2:
                            it = it3;
                            c30997b = c30997b2;
                            if (i12 >= c18944b.m99277k() && i12 < c18944b.m99276j()) {
                                if (z13) {
                                }
                                c30997b2 = c30997b;
                                it3 = it;
                            }
                            z13 = false;
                            if (z13) {
                            }
                            c30997b2 = c30997b;
                            it3 = it;
                            break;
                        case 3:
                            if (!z12) {
                                try {
                                    C3535c m2638u = AbstractC23306f.m120584H0().m2638u(contactProfile);
                                    List m17941F0 = m2638u.m17941F0();
                                    if (m17941F0.isEmpty()) {
                                        it = it3;
                                        try {
                                            m17941F0 = C7956b.Companion.m41573b().m41545k0(m2638u.m17944I0(), 0, 20, true);
                                        } catch (Exception e13) {
                                            e = e13;
                                            c30997b = c30997b2;
                                            e.printStackTrace();
                                            c30997b2 = c30997b;
                                            it3 = it;
                                        }
                                    } else {
                                        it = it3;
                                    }
                                    List list = m17941F0;
                                    if (!list.isEmpty()) {
                                        int min = Math.min(list.size() - 1, 20);
                                        while (true) {
                                            if (min >= 0) {
                                                C17945a0 c17945a0 = (C17945a0) list.get(min);
                                                if (!c17945a0.m95161i7()) {
                                                    j11 = c17945a0.m94974P4();
                                                } else {
                                                    min--;
                                                }
                                            }
                                        }
                                    }
                                    z12 = true;
                                } catch (Exception e14) {
                                    e = e14;
                                    it = it3;
                                }
                            } else {
                                it = it3;
                            }
                            try {
                                if (c18944b.m99278l() > 0) {
                                    c30997b = c30997b2;
                                    break;
                                }
                                c30997b = c30997b2;
                                z13 = false;
                                if (z13) {
                                }
                                c30997b2 = c30997b;
                                it3 = it;
                            } catch (Exception e15) {
                                e = e15;
                                c30997b = c30997b2;
                                e.printStackTrace();
                                c30997b2 = c30997b;
                                it3 = it;
                            }
                            break;
                        case 6:
                            int m99425e = Companion.m99425e(contactProfile);
                            if (m99425e != -1) {
                                break;
                            }
                            z13 = false;
                            it = it3;
                            c30997b = c30997b2;
                            if (z13) {
                            }
                            c30997b2 = c30997b;
                            it3 = it;
                            break;
                        case 8:
                            if (Companion.m99424c(contactProfile) == 1) {
                                z11 = true;
                            } else {
                                z11 = false;
                            }
                            if (c18944b.m99267a() == 1) {
                            }
                            if (c18944b.m99267a() == 0 && !z11) {
                                it = it3;
                                c30997b = c30997b2;
                                if (z13) {
                                }
                                c30997b2 = c30997b;
                                it3 = it;
                            }
                            z13 = false;
                            it = it3;
                            c30997b = c30997b2;
                            if (z13) {
                            }
                            c30997b2 = c30997b;
                            it3 = it;
                            break;
                        case 9:
                            boolean m98558u = C18644n.m98531l().m98558u(contactProfile.f42434r);
                            if (c18944b.m99282p() == 1) {
                            }
                            if (c18944b.m99282p() == 0 && !m98558u) {
                                it = it3;
                                c30997b = c30997b2;
                                if (z13) {
                                }
                                c30997b2 = c30997b;
                                it3 = it;
                            }
                            z13 = false;
                            it = it3;
                            c30997b = c30997b2;
                            if (z13) {
                            }
                            c30997b2 = c30997b;
                            it3 = it;
                            break;
                        case 10:
                            boolean contains = C21927m.m114302u().m114351p().contains(contactProfile.f42434r);
                            if (c18944b.m99281o() == 1) {
                            }
                            if (c18944b.m99281o() == 0 && !contains) {
                                it = it3;
                                c30997b = c30997b2;
                                if (z13) {
                                }
                                c30997b2 = c30997b;
                                it3 = it;
                            }
                            z13 = false;
                            it = it3;
                            c30997b = c30997b2;
                            if (z13) {
                            }
                            c30997b2 = c30997b;
                            it3 = it;
                            break;
                        default:
                            it = it3;
                            c30997b = c30997b2;
                            z13 = false;
                            if (z13) {
                            }
                            c30997b2 = c30997b;
                            it3 = it;
                            break;
                    }
                    return c30997b2;
                }
                it = it3;
                c30997b = c30997b2;
                if ((i11 <= 0 || i11 != c18944b.m99272f().size()) && (i11 != 0 || !c18944b.m99272f().isEmpty())) {
                    z13 = false;
                }
                if (str.length() > 0 && z13 && m99408o0()) {
                    try {
                        c30997b2 = m99329E0(str, cVar);
                    } catch (Exception e16) {
                        e = e16;
                    }
                    if (c30997b2 == null) {
                        it3 = it;
                    } else {
                        return c30997b2;
                    }
                } else {
                    c30997b2 = c30997b;
                    it3 = it;
                }
                e.printStackTrace();
                c30997b2 = c30997b;
                it3 = it;
            }
        }
        return c30997b2;
    }

    /* renamed from: s0 */
    public final boolean m99412s0(String str) {
        AbstractC19074t.m100208f(str, "input");
        if (str.length() >= this.f94538G) {
            return true;
        }
        return false;
    }

    /* renamed from: t0 */
    public final boolean m99413t0() {
        return this.f94561r;
    }

    /* renamed from: u0 */
    public final void m99414u0() {
        AbstractC23309i.m121399Rx(0L);
    }

    /* renamed from: v */
    public final void m99415v() {
        long j11;
        boolean z11;
        try {
            if (!this.f94560q) {
                m99348a0().clear();
                String m120749Ac = AbstractC23309i.m120749Ac();
                AbstractC19074t.m100205c(m120749Ac);
                if (m120749Ac.length() > 0) {
                    m99375w0(new JSONObject(m120749Ac), true);
                }
                this.f94560q = true;
            }
            long m120786Bc = AbstractC23309i.m120786Bc();
            if (!m99402f0().isEmpty()) {
                long j12 = this.f94550g;
                if (j12 > 0) {
                    j11 = j12 * 1000;
                } else {
                    j11 = 86400000;
                }
            } else {
                j11 = 300000;
            }
            if (m99364l0().mo124314i() - m120786Bc > j11) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (!this.f94559p && z11) {
                this.f94559p = true;
                C0766k c0766k = new C0766k();
                c0766k.mo1704o8(new j());
                c0766k.mo1433G4();
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: w */
    public final void m99416w() {
        BuildersKt__Builders_commonKt.m112540d(CoroutineScopeKt.m112637a(Dispatchers.m112680b()), null, null, new k(null), 3, null);
    }

    /* renamed from: x */
    public final void m99417x() {
        m99341S().m16507c();
    }

    /* renamed from: y */
    public final boolean m99418y() {
        return this.f94563t;
    }

    private C18953k() {
        InterfaceC24854k m129210a;
        InterfaceC24854k m129210a2;
        InterfaceC24854k m129210a3;
        InterfaceC24854k m129210a4;
        InterfaceC24854k m129210a5;
        InterfaceC24854k m129210a6;
        InterfaceC24854k m129210a7;
        InterfaceC24854k m129210a8;
        InterfaceC24854k m129210a9;
        InterfaceC24854k m129210a10;
        InterfaceC24854k m129210a11;
        InterfaceC24854k m129210a12;
        InterfaceC24854k m129210a13;
        InterfaceC24854k m129210a14;
        InterfaceC24854k m129210a15;
        InterfaceC24854k m129210a16;
        m129210a = AbstractC24856m.m129210a(w.f94621q);
        this.f94544a = m129210a;
        m129210a2 = AbstractC24856m.m129210a(r.f94617q);
        this.f94545b = m129210a2;
        m129210a3 = AbstractC24856m.m129210a(h.f94591q);
        this.f94546c = m129210a3;
        m129210a4 = AbstractC24856m.m129210a(v.f94620q);
        this.f94547d = m129210a4;
        m129210a5 = AbstractC24856m.m129210a(l.f94601q);
        this.f94548e = m129210a5;
        m129210a6 = AbstractC24856m.m129210a(z.f94624q);
        this.f94549f = m129210a6;
        this.f94552i = 1500;
        this.f94553j = 3000;
        this.f94554k = 1000;
        this.f94555l = ZAbstractBase.ZVU_PROCESS_FLUSH;
        m129210a7 = AbstractC24856m.m129210a(m.f94602q);
        this.f94556m = m129210a7;
        m129210a8 = AbstractC24856m.m129210a(y.f94623q);
        this.f94557n = m129210a8;
        m129210a9 = AbstractC24856m.m129210a(q.f94616q);
        this.f94558o = m129210a9;
        this.f94564u = 100;
        this.f94565v = 50;
        this.f94566w = 20;
        this.f94567x = 5;
        this.f94568y = -1;
        m129210a10 = AbstractC24856m.m129210a(a0.f94570q);
        this.f94532A = m129210a10;
        m129210a11 = AbstractC24856m.m129210a(p.f94615q);
        this.f94533B = m129210a11;
        m129210a12 = AbstractC24856m.m129210a(b0.f94573q);
        this.f94534C = m129210a12;
        m129210a13 = AbstractC24856m.m129210a(c0.f94574q);
        this.f94535D = m129210a13;
        m129210a14 = AbstractC24856m.m129210a(d0.f94577q);
        this.f94536E = m129210a14;
        m129210a15 = AbstractC24856m.m129210a(x.f94622q);
        this.f94537F = m129210a15;
        this.f94538G = 20;
        m129210a16 = AbstractC24856m.m129210a(g.f94590q);
        this.f94539H = m129210a16;
        this.f94541J = "";
        this.f94542K = "";
    }
}
