package vg;

import ag0.AbstractC0837p0;
import ag0.C0824j;
import ag0.C0825j0;
import am.AbstractC0939u;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.widget.ProgressBar;
import c30.C3245i;
import c30.C3247j;
import c30.C3255n;
import c30.InterfaceC3253m;
import com.androidquery.util.AbstractC3972e;
import com.androidquery.util.C3977j;
import com.androidquery.util.C3979l;
import com.androidquery.util.InterfaceC3968a;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.MainApplication;
import com.zing.zalo.p062db.C7960e;
import com.zing.zalo.p077ui.StickerView;
import com.zing.zalo.utils.ToastUtils;
import com.zing.zalo.zinstant.zom.meta.ZinstantMetaConstant;
import com.zing.zalo.zmedia.player.ZMediaPlayer;
import com.zing.zalo.zmedia.player.ZMediaPlayerSettings;
import com.zing.zalocore.CoreUtility;
import en0.InterfaceC18509p;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import fn0.C19067n0;
import gn.C19515b;
import gn.C19516c;
import hm0.C20096c;
import ho0.AbstractC20110a;
import hu.AbstractC20130d;
import hu.C20131e;
import java.io.File;
import java.io.FileFilter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import ln0.AbstractC22543l;
import me0.AbstractC23041d2;
import me0.AbstractC23080g8;
import me0.C23278z2;
import mm0.AbstractC23350e;
import org.json.JSONObject;
import p038bl.C2834f;
import p098dc.InterfaceC17872f;
import p111du.AbstractC18069a;
import p164fn.C19027a;
import p164fn.C19032f;
import p348mi.AbstractC23304d;
import p348mi.AbstractC23309i;
import p354n3.C23528a;
import p363nh.C23744a;
import p379o3.AbstractC24006q;
import p379o3.C23995f;
import p471r3.C25630b;
import p542ub.InterfaceC27218a;
import p588vw.C28644j;
import p609wh.AbstractC29039u0;
import p716zh.C31857b9;
import qm0.AbstractC25368s;
import qm0.AbstractC25376w;
import sh0.C26253e;

/* renamed from: vg.b3 */
/* loaded from: classes3.dex */
public final class C28020b3 {

    /* renamed from: a */
    public static final C28020b3 f130648a = new C28020b3();

    /* renamed from: b */
    private static final Map f130649b = new ConcurrentHashMap();

    /* renamed from: c */
    private static final Set f130650c = Collections.synchronizedSet(new HashSet());

    /* renamed from: d */
    private static final LinkedHashMap f130651d = new LinkedHashMap(50, 0.75f, true);

    /* renamed from: e */
    private static final Map f130652e = Collections.synchronizedMap(new m());

    /* renamed from: vg.b3$a */
    /* loaded from: classes3.dex */
    public interface a {
        /* renamed from: a */
        void mo141210a(boolean z11);
    }

    /* renamed from: vg.b3$b */
    /* loaded from: classes3.dex */
    public static abstract class b {
        /* renamed from: a */
        public void mo36247a(String str, C25630b c25630b, InterfaceC3968a interfaceC3968a, C3979l c3979l, C23995f c23995f) {
            AbstractC19074t.m100208f(str, ZMediaPlayer.OnNativeInvokeListener.ARG_URL);
            AbstractC19074t.m100208f(c25630b, "stickerInfo");
            AbstractC19074t.m100208f(interfaceC3968a, "iv");
            AbstractC19074t.m100208f(c3979l, "bm");
            AbstractC19074t.m100208f(c23995f, "status");
        }

        /* renamed from: b */
        public void mo35607b(String str, C25630b c25630b, InterfaceC3968a interfaceC3968a, C3979l c3979l, C23995f c23995f) {
            AbstractC19074t.m100208f(str, ZMediaPlayer.OnNativeInvokeListener.ARG_URL);
            AbstractC19074t.m100208f(c25630b, "stickerInfo");
            AbstractC19074t.m100208f(interfaceC3968a, "iv");
            AbstractC19074t.m100208f(c3979l, "bm");
            AbstractC19074t.m100208f(c23995f, "status");
            if (c3979l.m18839c() != null) {
                interfaceC3968a.setImageBitmap(c3979l.m18839c());
            }
        }
    }

    /* renamed from: vg.b3$c */
    /* loaded from: classes3.dex */
    public interface c {
        /* renamed from: a */
        void mo76556a(C25630b c25630b, Bitmap bitmap);
    }

    /* renamed from: vg.b3$d */
    /* loaded from: classes3.dex */
    public static final class d implements a {
        d() {
        }

        @Override // vg.C28020b3.a
        /* renamed from: a */
        public void mo141210a(boolean z11) {
            AbstractC23309i.m121944gh(z11);
        }
    }

    /* renamed from: vg.b3$e */
    /* loaded from: classes3.dex */
    public static final class e extends AbstractC0939u {

        /* renamed from: a */
        final /* synthetic */ String f130653a;

        /* renamed from: b */
        final /* synthetic */ int f130654b;

        e(String str, int i11) {
            this.f130653a = str;
            this.f130654b = i11;
        }

        @Override // p660xw.InterfaceC30214a
        /* renamed from: a */
        public void mo928a() {
            try {
                AbstractC23080g8.m118398c(this.f130653a);
                Map map = AbstractC23304d.f113461z;
                map.remove(Integer.valueOf(this.f130654b));
                C3255n.m16562n().m16570E(map);
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    /* renamed from: vg.b3$f */
    /* loaded from: classes3.dex */
    public static final class f extends AbstractC0939u {

        /* renamed from: a */
        final /* synthetic */ int f130655a;

        /* renamed from: b */
        final /* synthetic */ a f130656b;

        f(int i11, a aVar) {
            this.f130655a = i11;
            this.f130656b = aVar;
        }

        @Override // p660xw.InterfaceC30214a
        /* renamed from: a */
        public void mo928a() {
            boolean m104889q = AbstractC20130d.m104889q(C20131e.f99303a.m104946c0() + this.f130655a);
            a aVar = this.f130656b;
            if (aVar != null) {
                aVar.mo141210a(m104889q);
            }
        }
    }

    /* renamed from: vg.b3$g */
    /* loaded from: classes3.dex */
    public static final class g implements C19516c.c {

        /* renamed from: a */
        final /* synthetic */ boolean f130657a;

        /* renamed from: b */
        final /* synthetic */ C3245i f130658b;

        g(boolean z11, C3245i c3245i) {
            this.f130657a = z11;
            this.f130658b = c3245i;
        }

        @Override // gn.C19516c.c
        /* renamed from: a */
        public void mo2310a(int i11, C20096c c20096c) {
            AbstractC19074t.m100208f(c20096c, "errorMessage");
        }

        @Override // gn.C19516c.c
        /* renamed from: b */
        public void mo2311b(int i11, ArrayList arrayList) {
            AbstractC19074t.m100208f(arrayList, "photoQueue");
            try {
                if (!arrayList.isEmpty()) {
                    C2834f.f11325a.m13689k();
                    if (this.f130657a) {
                        C19067n0 c19067n0 = C19067n0.f94947a;
                        String string = MainApplication.Companion.m35500c().getString(AbstractC8020f0.str_sticker_noti_downloaded);
                        AbstractC19074t.m100207e(string, "getString(...)");
                        String format = String.format(string, Arrays.copyOf(new Object[]{this.f130658b.m16464f()}, 1));
                        AbstractC19074t.m100207e(format, "format(...)");
                        C28023b6 m141250h0 = C28023b6.m141250h0();
                        C3245i c3245i = this.f130658b;
                        m141250h0.m141397y1(format, c3245i.f13854b, c3245i.f13858f, 0);
                    }
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    /* renamed from: vg.b3$h */
    /* loaded from: classes3.dex */
    public static final class h implements InterfaceC3253m {

        /* renamed from: a */
        final /* synthetic */ String f130659a;

        /* renamed from: b */
        final /* synthetic */ C25630b f130660b;

        h(String str, C25630b c25630b) {
            this.f130659a = str;
            this.f130660b = c25630b;
        }

        @Override // c30.InterfaceC3253m
        /* renamed from: a */
        public void mo16523a() {
            C19027a.m100086c().m100089d(this.f130659a);
        }

        @Override // c30.InterfaceC3253m
        /* renamed from: b */
        public void mo16524b(int i11, String str) {
            AbstractC19074t.m100208f(str, "message");
            C19027a.m100086c().m100089d(this.f130659a);
        }

        @Override // c30.InterfaceC3253m
        /* renamed from: c */
        public void mo16525c(Object obj) {
            JSONObject jSONObject;
            AbstractC19074t.m100208f(obj, "entity");
            try {
                if (obj instanceof JSONObject) {
                    jSONObject = (JSONObject) obj;
                } else if (obj instanceof String) {
                    jSONObject = new JSONObject(obj.toString());
                } else {
                    jSONObject = new JSONObject();
                }
                C25630b c25630b = this.f130660b;
                String m96089h = AbstractC18069a.m96089h(jSONObject, ZMediaPlayer.OnNativeInvokeListener.ARG_URL);
                AbstractC19074t.m100207e(m96089h, "getJSONValue(...)");
                c25630b.m132411U(m96089h);
                C28644j.m143233Y().m143297a1(this.f130660b);
                C23744a.b bVar = C23744a.Companion;
                bVar.m124119a().m124116d(4, new Object[0]);
                bVar.m124119a().m124116d(11, new Object[0]);
            } catch (Exception e11) {
                e11.printStackTrace();
            }
            C19027a.m100086c().m100089d(this.f130659a);
        }
    }

    /* renamed from: vg.b3$i */
    /* loaded from: classes3.dex */
    public static final class i implements a {
        i() {
        }

        @Override // vg.C28020b3.a
        /* renamed from: a */
        public void mo141210a(boolean z11) {
            AbstractC23309i.m121944gh(z11);
        }
    }

    /* renamed from: vg.b3$j */
    /* loaded from: classes3.dex */
    public static final class j extends b {

        /* renamed from: a */
        final /* synthetic */ c f130661a;

        j(c cVar) {
            this.f130661a = cVar;
        }

        @Override // vg.C28020b3.b
        /* renamed from: b */
        public void mo35607b(String str, C25630b c25630b, InterfaceC3968a interfaceC3968a, C3979l c3979l, C23995f c23995f) {
            AbstractC19074t.m100208f(str, ZMediaPlayer.OnNativeInvokeListener.ARG_URL);
            AbstractC19074t.m100208f(c25630b, "stickerInfo");
            AbstractC19074t.m100208f(interfaceC3968a, "iv");
            AbstractC19074t.m100208f(c3979l, "bm");
            AbstractC19074t.m100208f(c23995f, "status");
            super.mo35607b(str, c25630b, interfaceC3968a, c3979l, c23995f);
            Bitmap m18839c = c3979l.m18839c();
            if (m18839c != null) {
                c cVar = this.f130661a;
                if (!m18839c.isRecycled() && cVar != null) {
                    cVar.mo76556a(c25630b, m18839c);
                }
            }
        }
    }

    /* renamed from: vg.b3$k */
    /* loaded from: classes3.dex */
    public static final class k extends AbstractC24006q {

        /* renamed from: M0 */
        final /* synthetic */ InterfaceC3968a f130662M0;

        /* renamed from: N0 */
        final /* synthetic */ b f130663N0;

        /* renamed from: O0 */
        final /* synthetic */ boolean f130664O0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        k(C25630b c25630b, InterfaceC3968a interfaceC3968a, b bVar, boolean z11, Drawable drawable, int i11) {
            super(c25630b, drawable, i11);
            this.f130662M0 = interfaceC3968a;
            this.f130663N0 = bVar;
            this.f130664O0 = z11;
        }

        @Override // p379o3.AbstractC24006q
        /* renamed from: I1 */
        public void mo115390I1(String str, C25630b c25630b, InterfaceC3968a interfaceC3968a, C3979l c3979l, C23995f c23995f) {
            AbstractC19074t.m100208f(str, ZMediaPlayer.OnNativeInvokeListener.ARG_URL);
            AbstractC19074t.m100208f(c25630b, "stickerInfo");
            AbstractC19074t.m100208f(interfaceC3968a, "iv");
            AbstractC19074t.m100208f(c3979l, "bm");
            AbstractC19074t.m100208f(c23995f, "status");
            try {
                if (c23995f.m125666q() == 1 && c23995f.m125657h() == 200) {
                    C28644j.m143233Y().m143297a1(c25630b);
                }
                int m132429g = c25630b.m132429g();
                Object tag = this.f130662M0.getTag(AbstractC6918a0.aquery_image_tag);
                if ((tag instanceof Integer) && m132429g == ((Number) tag).intValue()) {
                    if (c23995f.m125657h() == 200) {
                        b bVar = this.f130663N0;
                        if (bVar != null) {
                            bVar.mo35607b(str, c25630b, interfaceC3968a, c3979l, c23995f);
                        } else if (c3979l.m18839c() != null) {
                            interfaceC3968a.setImageBitmap(c3979l.m18839c());
                        }
                    } else {
                        b bVar2 = this.f130663N0;
                        if (bVar2 != null) {
                            bVar2.mo36247a(str, c25630b, interfaceC3968a, c3979l, c23995f);
                        }
                    }
                }
                if (this.f130664O0) {
                    C28020b3.f130648a.m141191e(c25630b);
                }
            } catch (Exception e11) {
                AbstractC23350e.m122778h(e11);
            }
        }
    }

    /* renamed from: vg.b3$l */
    /* loaded from: classes3.dex */
    public static final class l extends AbstractC24006q {

        /* renamed from: M0 */
        final /* synthetic */ boolean f130665M0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        l(C25630b c25630b, boolean z11, Drawable drawable, int i11) {
            super(c25630b, drawable, i11);
            this.f130665M0 = z11;
        }

        @Override // p379o3.AbstractC24006q
        /* renamed from: I1 */
        public void mo115390I1(String str, C25630b c25630b, InterfaceC3968a interfaceC3968a, C3979l c3979l, C23995f c23995f) {
            AbstractC19074t.m100208f(str, ZMediaPlayer.OnNativeInvokeListener.ARG_URL);
            AbstractC19074t.m100208f(c25630b, "stickerInfo");
            AbstractC19074t.m100208f(interfaceC3968a, "iv");
            AbstractC19074t.m100208f(c23995f, "status");
            if (this.f130665M0) {
                super.mo115390I1(str, c25630b, interfaceC3968a, c3979l, c23995f);
            }
            if (c23995f.m125657h() == 200) {
                if (c23995f.m125666q() == 1) {
                    C28644j.m143233Y().m143297a1(c25630b);
                }
                String valueOf = String.valueOf(System.currentTimeMillis());
                if (interfaceC3968a instanceof StickerView) {
                    interfaceC3968a.setImageInfo(c3979l);
                    ((StickerView) interfaceC3968a).m56979j(c25630b, valueOf, true, false, false, true);
                }
            } else {
                switch (c23995f.m125657h()) {
                    case -10003:
                        C23744a.Companion.m124119a().m124116d(12, c25630b);
                        break;
                    case -10002:
                        ToastUtils.showMess(MainApplication.Companion.m35500c().getResources().getString(AbstractC8020f0.error_full_sdcard));
                        break;
                    case -10001:
                        ToastUtils.showMess(MainApplication.Companion.m35500c().getResources().getString(AbstractC8020f0.error_sdcard));
                        break;
                }
                if (interfaceC3968a instanceof StickerView) {
                    ((StickerView) interfaceC3968a).m56979j(c25630b, String.valueOf(System.currentTimeMillis()), false, false, false, false);
                }
            }
            C28020b3.f130648a.m141191e(c25630b);
        }
    }

    /* renamed from: vg.b3$m */
    /* loaded from: classes3.dex */
    public static final class m extends LinkedHashMap {
        m() {
            super(100, 0.75f, true);
        }

        /* renamed from: a */
        public /* bridge */ boolean m141211a(String str) {
            return super.containsKey(str);
        }

        /* renamed from: b */
        public /* bridge */ boolean m141212b(String str) {
            return super.containsValue(str);
        }

        /* renamed from: c */
        public /* bridge */ String m141213c(String str) {
            return (String) super.get(str);
        }

        @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
        public final /* bridge */ boolean containsKey(Object obj) {
            if (obj != null && !(obj instanceof String)) {
                return false;
            }
            return m141211a((String) obj);
        }

        @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
        public final /* bridge */ boolean containsValue(Object obj) {
            if (obj != null && !(obj instanceof String)) {
                return false;
            }
            return m141212b((String) obj);
        }

        /* renamed from: e */
        public /* bridge */ Set m141214e() {
            return super.entrySet();
        }

        @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
        public final /* bridge */ Set entrySet() {
            return m141214e();
        }

        /* renamed from: f */
        public /* bridge */ Set m141215f() {
            return super.keySet();
        }

        /* renamed from: g */
        public /* bridge */ String m141216g(String str, String str2) {
            return (String) super.getOrDefault(str, str2);
        }

        @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
        public final /* bridge */ /* synthetic */ Object get(Object obj) {
            if (obj != null && !(obj instanceof String)) {
                return null;
            }
            return m141213c((String) obj);
        }

        @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.Map
        public final /* bridge */ /* synthetic */ Object getOrDefault(Object obj, Object obj2) {
            if (obj != null && !(obj instanceof String)) {
                return obj2;
            }
            return m141216g((String) obj, (String) obj2);
        }

        /* renamed from: h */
        public /* bridge */ int m141217h() {
            return super.size();
        }

        /* renamed from: i */
        public /* bridge */ Collection m141218i() {
            return super.values();
        }

        /* renamed from: k */
        public /* bridge */ String m141219k(String str) {
            return (String) super.remove(str);
        }

        @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
        public final /* bridge */ Set keySet() {
            return m141215f();
        }

        /* renamed from: l */
        public /* bridge */ boolean m141220l(String str, String str2) {
            return super.remove(str, str2);
        }

        @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
        public final /* bridge */ /* synthetic */ Object remove(Object obj) {
            if (obj == null || (obj instanceof String)) {
                return m141219k((String) obj);
            }
            return null;
        }

        @Override // java.util.LinkedHashMap
        protected boolean removeEldestEntry(Map.Entry entry) {
            AbstractC19074t.m100208f(entry, "eldest");
            if (size() > 100) {
                return true;
            }
            return false;
        }

        @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
        public final /* bridge */ int size() {
            return m141217h();
        }

        @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
        public final /* bridge */ Collection values() {
            return m141218i();
        }

        @Override // java.util.HashMap, java.util.Map
        public final /* bridge */ boolean remove(Object obj, Object obj2) {
            if (obj != null && !(obj instanceof String)) {
                return false;
            }
            if (obj2 == null || (obj2 instanceof String)) {
                return m141220l((String) obj, (String) obj2);
            }
            return false;
        }
    }

    /* renamed from: vg.b3$n */
    /* loaded from: classes3.dex */
    public static final class n extends AbstractC19075u implements InterfaceC18509p {

        /* renamed from: q */
        public static final n f130666q = new n();

        n() {
            super(2);
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: a */
        public final Integer mo240pC(File file, File file2) {
            AbstractC19074t.m100208f(file, "lhs");
            AbstractC19074t.m100208f(file2, "rhs");
            return Integer.valueOf(AbstractC19074t.m100210h(file2.lastModified(), file.lastModified()));
        }
    }

    private C28020b3() {
    }

    /* renamed from: E */
    private final boolean m141165E(int i11, int i12) {
        Boolean bool;
        HashMap hashMap = (HashMap) AbstractC23304d.f113285I.get(Integer.valueOf(i11));
        if (hashMap == null || (bool = (Boolean) hashMap.get(Integer.valueOf(i12))) == null) {
            return false;
        }
        return bool.booleanValue();
    }

    /* renamed from: H */
    public static /* synthetic */ void m141166H(C28020b3 c28020b3, InterfaceC3968a interfaceC3968a, C23528a c23528a, C25630b c25630b, ProgressBar progressBar, boolean z11, b bVar, int i11, Object obj) {
        ProgressBar progressBar2;
        boolean z12;
        b bVar2;
        if ((i11 & 4) != 0) {
            progressBar2 = null;
        } else {
            progressBar2 = progressBar;
        }
        if ((i11 & 8) != 0) {
            z12 = false;
        } else {
            z12 = z11;
        }
        if ((i11 & 16) != 0) {
            bVar2 = null;
        } else {
            bVar2 = bVar;
        }
        c28020b3.m141182F(interfaceC3968a, c23528a, c25630b, progressBar2, z12, bVar2);
    }

    /* renamed from: K */
    private final void m141167K() {
        C28244z2 c28244z2;
        File[] listFiles;
        boolean z11;
        boolean z12;
        List m131505m;
        File file;
        File file2 = new File(C20131e.f99303a.m104942a0());
        if (file2.exists()) {
            try {
                try {
                    Map map = f130649b;
                    if (!map.isEmpty()) {
                        for (Map.Entry entry : map.entrySet()) {
                            int intValue = ((Number) entry.getKey()).intValue();
                            String str = (String) entry.getValue();
                            if (str != null) {
                                file = new File(str);
                            } else {
                                file = null;
                            }
                            if (file != null && file.exists() && file.isDirectory()) {
                                String str2 = str + "/" + intValue + ".tmp";
                                if (AbstractC23041d2.m118194A(str2)) {
                                    AbstractC23041d2.m118208g(str2);
                                } else {
                                    new File(str2).createNewFile();
                                }
                            }
                        }
                        f130649b.clear();
                    }
                } catch (Exception e11) {
                    e11.printStackTrace();
                }
                if (System.currentTimeMillis() - AbstractC23309i.m122014ib() < 604800000) {
                    AbstractC23350e.m122774d("ROLL_CACHE", "TIMESTAMP < 7 DAYS, DO NOTHING!!!");
                    return;
                }
                AbstractC23309i.m121997hw(System.currentTimeMillis());
                long m104857T = AbstractC20130d.m104857T(file2);
                long j11 = ZMediaPlayerSettings.VideoConfig.ONE_MEGABYTE;
                String str3 = "Sticker folder size: " + m104857T + " bytes | " + (m104857T / j11) + " MB";
                if (m104857T >= 52428800 && (listFiles = file2.listFiles((c28244z2 = new FileFilter() { // from class: vg.z2
                    @Override // java.io.FileFilter
                    public final boolean accept(File file3) {
                        boolean m141168L;
                        m141168L = C28020b3.m141168L(file3);
                        return m141168L;
                    }
                }))) != null) {
                    if (listFiles.length == 0) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    if (!z11) {
                        String str4 = str3 + " | Sticker category count: " + listFiles.length;
                        ArrayList arrayList = new ArrayList();
                        for (File file3 : listFiles) {
                            AbstractC19074t.m100205c(file3);
                            File[] listFiles2 = file3.listFiles(c28244z2);
                            if (listFiles2 != null) {
                                if (listFiles2.length == 0) {
                                    z12 = true;
                                } else {
                                    z12 = false;
                                }
                                if (!z12) {
                                    m131505m = AbstractC25368s.m131505m(Arrays.copyOf(listFiles2, listFiles2.length));
                                    arrayList.addAll(m131505m);
                                }
                            }
                        }
                        String str5 = str4 + " | Sticker count: " + arrayList.size();
                        AbstractC25376w.m131534w(arrayList, new Comparator() { // from class: vg.a3
                            public /* synthetic */ C28010a3() {
                            }

                            @Override // java.util.Comparator
                            public final int compare(Object obj, Object obj2) {
                                int m141169M;
                                m141169M = C28020b3.m141169M(InterfaceC18509p.this, obj, obj2);
                                return m141169M;
                            }
                        });
                        int size = arrayList.size() - 1;
                        if (size >= 0) {
                            long j12 = 0;
                            int i11 = 0;
                            while (true) {
                                int i12 = size - 1;
                                long j13 = m104857T - j12;
                                if (j13 <= 52428800) {
                                    StringBuilder sb2 = new StringBuilder();
                                    sb2.append(str5 + " | Sticked deleted: " + i11);
                                    sb2.append(" | Total size deleted: ");
                                    sb2.append(j12);
                                    sb2.append(" bytes | ");
                                    sb2.append(j12 / j11);
                                    sb2.append(" MB");
                                    long j14 = j13 / j11;
                                    return;
                                }
                                Object obj = arrayList.get(size);
                                AbstractC19074t.m100207e(obj, "get(...)");
                                File file4 = (File) obj;
                                j12 += AbstractC20130d.m104857T(file4);
                                AbstractC20130d.m104887p(file4);
                                i11++;
                                if (i12 >= 0) {
                                    size = i12;
                                } else {
                                    return;
                                }
                            }
                        }
                    }
                }
            } catch (Exception e12) {
                e12.printStackTrace();
            }
        }
    }

    /* renamed from: L */
    public static final boolean m141168L(File file) {
        AbstractC19074t.m100208f(file, "obj");
        return file.isDirectory();
    }

    /* renamed from: M */
    public static final int m141169M(InterfaceC18509p interfaceC18509p, Object obj, Object obj2) {
        AbstractC19074t.m100208f(interfaceC18509p, "$tmp0");
        return ((Number) interfaceC18509p.mo240pC(obj, obj2)).intValue();
    }

    /* renamed from: O */
    public static final void m141170O() {
        f130648a.m141167K();
    }

    /* renamed from: h */
    public static final void m141175h() {
        if (!AbstractC23309i.m120973Ge()) {
            f130648a.m141203t();
        }
    }

    /* renamed from: p */
    public static /* synthetic */ void m141176p(C28020b3 c28020b3, int i11, a aVar, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            aVar = null;
        }
        c28020b3.m141200o(i11, aVar);
    }

    /* renamed from: s */
    private final void m141177s(InterfaceC17872f interfaceC17872f, C25630b c25630b) {
        try {
            if (c25630b.m132434l() != 2 && c25630b.m132434l() != 5) {
                return;
            }
            String valueOf = String.valueOf(c25630b.m132429g());
            String valueOf2 = String.valueOf(c25630b.m132432j());
            String str = C20131e.f99303a.m104946c0() + valueOf2;
            if (!AbstractC23041d2.m118194A(str)) {
                new File(str).mkdir();
            }
            String str2 = str + "/" + valueOf;
            try {
                MainApplication.C6895a c6895a = MainApplication.Companion;
                File m18745B = AbstractC3972e.m18745B(AbstractC3972e.m18807t(c6895a.m35500c(), 1), str2);
                if (m18745B == null) {
                    m18745B = AbstractC3972e.m18745B(AbstractC3972e.m18807t(c6895a.m35500c(), 0), str2);
                }
                if (m18745B != null && m18745B.exists()) {
                    m18745B.delete();
                }
            } catch (Exception e11) {
                AbstractC20110a.f98889a.mo104552e(e11);
            }
            if (!new File(str2).exists()) {
                Bitmap mo88377d = interfaceC17872f.mo88377d(c25630b.m132430h());
                C0825j0.m2157b();
                C0825j0.m2156a(new C31857b9(str2, mo88377d, false));
            }
        } catch (Exception e12) {
            AbstractC20110a.f98889a.mo104552e(e12);
        }
    }

    /* renamed from: A */
    public final void m141178A(C25630b c25630b, InterfaceC3968a interfaceC3968a, C23995f c23995f, boolean z11) {
        AbstractC19074t.m100208f(c25630b, "stickerInfo");
        AbstractC19074t.m100208f(interfaceC3968a, "iv");
        AbstractC19074t.m100208f(c23995f, "status");
        if (!z11) {
            return;
        }
        StickerView stickerView = (StickerView) interfaceC3968a;
        m141189R(c23995f);
        if (c23995f.m125657h() == -10003) {
            C23744a.Companion.m124119a().m124116d(12, c25630b);
        }
        stickerView.setImageInfo(null, false);
        stickerView.invalidate();
    }

    /* renamed from: B */
    public final void m141179B(C25630b c25630b, InterfaceC3968a interfaceC3968a, C3979l c3979l, boolean z11, String str, boolean z12) {
        StickerView stickerView;
        boolean z13;
        AbstractC19074t.m100208f(c25630b, "stickerInfo");
        AbstractC19074t.m100208f(interfaceC3968a, "iv");
        AbstractC19074t.m100208f(c3979l, "bm");
        AbstractC19074t.m100208f(str, "autoPlayStickerPrefix");
        if (!z11) {
            return;
        }
        StickerView stickerView2 = null;
        if (c3979l.m18839c() != null) {
            interfaceC3968a.setImageBitmap(c3979l.m18839c());
            if (str.length() > 0) {
                C3255n m16562n = C3255n.m16562n();
                long currentTimeMillis = System.currentTimeMillis();
                StringBuilder sb2 = new StringBuilder();
                sb2.append(currentTimeMillis);
                String m16572l = m16562n.m16572l(str, sb2.toString(), c25630b);
                if (interfaceC3968a instanceof StickerView) {
                    stickerView = (StickerView) interfaceC3968a;
                } else {
                    stickerView = null;
                }
                if (stickerView != null) {
                    AbstractC19074t.m100205c(m16572l);
                    if (!z12 && !c25630b.m132395C()) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    StickerView.m56977k(stickerView, c25630b, m16572l, z13, false, false, true, 24, null);
                }
            }
        }
        if (interfaceC3968a instanceof StickerView) {
            stickerView2 = (StickerView) interfaceC3968a;
        }
        if (stickerView2 != null) {
            stickerView2.invalidate();
        }
    }

    /* renamed from: C */
    public final void m141180C(C3245i c3245i, ArrayList arrayList) {
        if (c3245i != null) {
            int m42263S6 = C7960e.m41971c6().m42263S6(CoreUtility.f89233i, c3245i.f13854b);
            if (m42263S6 > 0) {
                C7960e.m41971c6().m42331Z8(CoreUtility.f89233i, c3245i, m42263S6);
                if (C28644j.m143233Y().m143312x0(c3245i.f13854b)) {
                    C28644j.m143228R(c3245i.f13854b);
                }
                C28644j.m143267v0(c3245i, m42263S6);
            } else {
                ArrayList m118399d = AbstractC23080g8.m118399d();
                AbstractC19074t.m100207e(m118399d, "getCurrentStickerList(...)");
                C7960e.m41971c6().m42321Y8(CoreUtility.f89233i, c3245i);
                C28644j.m143267v0(c3245i, -1);
                m118399d.add(0, c3245i);
                int size = m118399d.size();
                int i11 = 0;
                while (i11 < size) {
                    if (((C3245i) m118399d.get(i11)).f13854b == 0) {
                        AbstractC23309i.m121618Xu(i11 + 1);
                    } else {
                        C7960e.m41971c6().m42344ae(((C3245i) m118399d.get(i11)).f13854b, i11 + 1);
                    }
                    int i12 = ((C3245i) m118399d.get(i11)).f13854b;
                    i11++;
                    C28644j.m143238c1(i12, i11);
                }
            }
            long m42283U6 = C7960e.m41971c6().m42283U6();
            if (m42283U6 > 0) {
                AbstractC23309i.m121765br(m42283U6);
            }
            String str = C20131e.f99303a.m104942a0() + c3245i.f13854b;
            if (!AbstractC23041d2.m118194A(str)) {
                new File(str).mkdir();
            }
            if (arrayList != null) {
                int size2 = arrayList.size();
                for (int i13 = 0; i13 < size2; i13++) {
                    Object obj = arrayList.get(i13);
                    AbstractC19074t.m100207e(obj, "get(...)");
                    C3247j c3247j = (C3247j) obj;
                    c3247j.f13888a = c3245i.f13854b;
                    C7960e.m41971c6().m42341a9(c3247j);
                    if (!m141165E(c3245i.f13854b, c3247j.f13890c)) {
                        AbstractC24006q.m125840K1(c3247j.m16499a());
                    }
                }
            }
        }
    }

    /* renamed from: D */
    public final boolean m141181D(C25630b c25630b) {
        AbstractC19074t.m100208f(c25630b, "stickerInfo");
        int m132429g = c25630b.m132429g();
        StringBuilder sb2 = new StringBuilder();
        sb2.append(m132429g);
        String sb3 = sb2.toString();
        if (c25630b.m132448z()) {
            if (f130651d.get(sb3) != null) {
                return true;
            }
            return false;
        }
        C3979l m125837F1 = AbstractC24006q.m125837F1(AbstractC24006q.m125850W1(c25630b.m132446x(), false));
        if (m125837F1 != null && m125837F1.m18839c() != null && !m125837F1.m18839c().isRecycled()) {
            return true;
        }
        return false;
    }

    /* renamed from: F */
    public final void m141182F(InterfaceC3968a interfaceC3968a, C23528a c23528a, C25630b c25630b, ProgressBar progressBar, boolean z11, b bVar) {
        AbstractC19074t.m100208f(interfaceC3968a, "<this>");
        AbstractC19074t.m100208f(c23528a, "aQuery");
        AbstractC19074t.m100208f(c25630b, "stickerInfo");
        if (!TextUtils.isEmpty(c25630b.m132446x())) {
            interfaceC3968a.setTag(AbstractC6918a0.aquery_image_tag, Integer.valueOf(c25630b.m132429g()));
            ((C23528a) ((C23528a) c23528a.m123612r(interfaceC3968a)).m123592P(progressBar)).m123594T(new k(c25630b, interfaceC3968a, bVar, z11, C23278z2.m120089P0().f116261b, C23278z2.m120089P0().f116262c));
        }
    }

    /* renamed from: G */
    public final void m141183G(C25630b c25630b, C23528a c23528a, InterfaceC3968a interfaceC3968a, ProgressBar progressBar, boolean z11) {
        AbstractC19074t.m100208f(c25630b, "stickerInfo");
        AbstractC19074t.m100208f(c23528a, "aQuery");
        if (!c25630b.m132448z()) {
            if (!TextUtils.isEmpty(c25630b.m132446x())) {
                ((C23528a) ((C23528a) c23528a.m123612r(interfaceC3968a)).m123592P(progressBar)).m123594T(new l(c25630b, z11, C23278z2.m120091Q0().f116261b, C23278z2.m120089P0().f116262c));
                return;
            }
            return;
        }
        throw new RuntimeException("Not load sticker DEFAULT by Aquery");
    }

    /* renamed from: I */
    public final void m141184I(ArrayList arrayList) {
        int m116584g;
        AbstractC19074t.m100208f(arrayList, "photoQueue");
        try {
            if (!arrayList.isEmpty()) {
                m116584g = AbstractC22543l.m116584g(20, arrayList.size());
                MainApplication.C6895a c6895a = MainApplication.Companion;
                C23528a c23528a = new C23528a(c6895a.m35500c());
                C3977j c3977j = new C3977j(c6895a.m35500c());
                for (int i11 = 0; i11 < m116584g; i11++) {
                    Object obj = arrayList.get(i11);
                    AbstractC19074t.m100207e(obj, "get(...)");
                    C3247j c3247j = (C3247j) obj;
                    if (!AbstractC23041d2.m118194A(c3247j.f13894g)) {
                        int i12 = c3247j.f13890c;
                        int i13 = c3247j.f13888a;
                        int i14 = c3247j.f13889b;
                        String str = c3247j.f13892e;
                        AbstractC19074t.m100207e(str, ZinstantMetaConstant.IMPRESSION_META_TYPE);
                        C25630b c25630b = new C25630b(i12, i13, i14, Integer.parseInt(str), c3247j.f13896i, "", c3247j.f13894g, "");
                        String m143232X = C28644j.m143232X();
                        AbstractC19074t.m100207e(m143232X, "getDomainStickerUrl(...)");
                        c25630b.m132419b(m143232X, C28644j.m143248i0());
                        m141166H(this, c3977j, c23528a, c25630b, null, false, null, 28, null);
                    }
                }
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: J */
    public final void m141185J(int i11) {
        AbstractC23304d.f113285I.remove(Integer.valueOf(i11));
    }

    /* renamed from: N */
    public final void m141186N() {
        AbstractC0837p0.Companion.m2237f().mo2040a(new Runnable() { // from class: vg.x2
            @Override // java.lang.Runnable
            public final void run() {
                C28020b3.m141170O();
            }
        });
    }

    /* renamed from: P */
    public final void m141187P(String str) {
        AbstractC19074t.m100208f(str, "messageId");
        f130650c.add(str);
    }

    /* renamed from: Q */
    public final void m141188Q(String str, String str2) {
        AbstractC19074t.m100208f(str2, "filePath");
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            Map map = f130652e;
            AbstractC19074t.m100207e(map, "mapWebpFileDownloaded");
            map.put(str, str2);
        }
    }

    /* renamed from: R */
    public final void m141189R(C23995f c23995f) {
        AbstractC19074t.m100208f(c23995f, "status");
        try {
            int m125657h = c23995f.m125657h();
            if (m125657h != -10002) {
                if (m125657h == -10001) {
                    ToastUtils.showMess(MainApplication.Companion.m35500c().getResources().getString(AbstractC8020f0.error_sdcard));
                }
            } else {
                ToastUtils.showMess(MainApplication.Companion.m35500c().getResources().getString(AbstractC8020f0.error_full_sdcard));
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: S */
    public final void m141190S(int i11, boolean z11) {
        try {
            HashMap hashMap = (HashMap) AbstractC23304d.f113285I.get(Integer.valueOf(i11));
            if (hashMap != null) {
                for (Object obj : hashMap.entrySet()) {
                    AbstractC19074t.m100207e(obj, "next(...)");
                    ((Map.Entry) obj).setValue(Boolean.valueOf(z11));
                }
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: e */
    public final void m141191e(C25630b c25630b) {
        if (c25630b != null && !c25630b.m132448z() && c25630b.m132427f() != 39) {
            int m132429g = c25630b.m132429g();
            String m132431i = c25630b.m132431i();
            Map map = f130649b;
            if (!map.containsKey(Integer.valueOf(m132429g))) {
                map.put(Integer.valueOf(m132429g), m132431i);
            }
        }
    }

    /* renamed from: f */
    public final boolean m141192f(C25630b c25630b, String str, boolean z11) {
        AbstractC19074t.m100208f(c25630b, "stickerInfo");
        AbstractC19074t.m100208f(str, "clientMsgId");
        try {
            Set set = f130650c;
            AbstractC19074t.m100207e(set, "pendingGif");
            if ((!set.isEmpty()) && set.contains(str) && z11) {
                set.remove(str);
                return true;
            }
            if (!C3255n.m16556g() || c25630b.m132395C()) {
                return false;
            }
            return true;
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
            return false;
        }
    }

    /* renamed from: g */
    public final void m141193g() {
        AbstractC0837p0.Companion.m2237f().mo2040a(new Runnable() { // from class: vg.y2
            @Override // java.lang.Runnable
            public final void run() {
                C28020b3.m141175h();
            }
        });
    }

    /* renamed from: i */
    public final void m141194i(C25630b c25630b) {
        AbstractC19074t.m100208f(c25630b, "stickerInfo");
        AbstractC24006q.m125840K1(c25630b.m132446x());
        File file = new File(C20131e.f99303a.m104942a0() + c25630b.m132432j() + "/" + c25630b.m132429g());
        if (file.exists()) {
            AbstractC23041d2.m118211j(file);
        }
    }

    /* renamed from: j */
    public final void m141195j(int i11) {
        if (i11 % 1000 < 481) {
            m141200o(0, new d());
        }
    }

    /* renamed from: k */
    public final void m141196k(int i11, boolean z11) {
        try {
            C7960e m41971c6 = C7960e.m41971c6();
            String str = CoreUtility.f89233i;
            StringBuilder sb2 = new StringBuilder();
            sb2.append(i11);
            boolean m42409h4 = m41971c6.m42409h4(str, sb2.toString());
            if (z11 || m42409h4) {
                m141198m(i11);
            }
            C7960e.m41971c6().m42440k4(i11, null, CoreUtility.f89233i);
            C7960e.m41971c6().m42450l4(i11, null, CoreUtility.f89233i);
            C28644j.m143233Y().m143286T();
            C28644j.m143233Y().m143285S();
            C28644j.m143226P(-2);
            C28644j.m143226P(-3);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: l */
    public final void m141197l(int i11) {
        try {
            String str = C20131e.f99303a.m104942a0() + "temp/" + i11;
            AbstractC23041d2.m118208g(str);
            AbstractC23041d2.m118208g(str + ".jpg");
            AbstractC23041d2.m118208g(str + ".png");
            AbstractC23041d2.m118208g(str + ".gif");
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: m */
    public final void m141198m(int i11) {
        C20131e c20131e = C20131e.f99303a;
        File file = new File(c20131e.m104942a0() + i11);
        File file2 = new File(c20131e.m104942a0() + i11 + "_delete");
        file.renameTo(file2);
        C0824j.m2153b(new e(file2.getAbsolutePath(), i11));
    }

    /* renamed from: n */
    public final void m141199n(int i11) {
        m141176p(this, i11, null, 2, null);
    }

    /* renamed from: o */
    public final void m141200o(int i11, a aVar) {
        try {
            C0824j.m2153b(new f(i11, aVar));
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: q */
    public final synchronized void m141201q(C3245i c3245i, boolean z11) {
        try {
            try {
            } catch (Exception e11) {
                e11.printStackTrace();
            }
            if (c3245i != null) {
                C19515b.Companion.m102006a().m102004m(c3245i, 0, new g(z11, c3245i));
            } else {
                throw new IllegalArgumentException("stickerCate is null");
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* renamed from: r */
    public final void m141202r(C25630b c25630b) {
        AbstractC19074t.m100208f(c25630b, "stickerInfo");
        String str = AbstractC29039u0.m145033a(AbstractC29039u0.b.ZALO_STICKER_VOICE_DOWNLOAD_URL) + "session_key=" + CoreUtility.f89232h + "&eid=" + c25630b.m132429g();
        if (C19027a.m100086c().m100088b(str) != null) {
            return;
        }
        h hVar = new h(str, c25630b);
        C19032f c19032f = new C19032f(str, 2);
        c19032f.m100108f(hVar);
        C19027a.m100086c().m100090e(c19032f);
    }

    /* renamed from: t */
    public final void m141203t() {
        m141200o(0, new i());
    }

    /* renamed from: u */
    public final void m141204u(C25630b c25630b, c cVar, boolean z11) {
        if (c25630b == null) {
            return;
        }
        Bitmap m141205v = m141205v(c25630b, z11);
        if (m141205v != null) {
            if (cVar != null) {
                cVar.mo76556a(c25630b, m141205v);
            }
        } else {
            if (c25630b.m132448z()) {
                Bitmap m141206w = m141206w(c25630b);
                if (m141206w != null && cVar != null) {
                    cVar.mo76556a(c25630b, m141206w);
                    return;
                }
                return;
            }
            MainApplication.C6895a c6895a = MainApplication.Companion;
            m141166H(this, new C3977j(c6895a.m35500c()), new C23528a(c6895a.m35500c()), c25630b, null, false, new j(cVar), 12, null);
        }
    }

    /* renamed from: v */
    public final Bitmap m141205v(C25630b c25630b, boolean z11) {
        if (c25630b == null) {
            return null;
        }
        if (c25630b.m132448z()) {
            return (Bitmap) f130651d.get(String.valueOf(c25630b.m132429g()));
        }
        C3979l m125837F1 = AbstractC24006q.m125837F1(AbstractC24006q.m125850W1(c25630b.m132446x(), z11));
        if (m125837F1 == null || m125837F1.m18839c() == null || m125837F1.m18839c().isRecycled()) {
            return null;
        }
        return m125837F1.m18839c();
    }

    /* renamed from: w */
    public final Bitmap m141206w(C25630b c25630b) {
        Bitmap bitmap;
        AbstractC19074t.m100208f(c25630b, "stickerInfo");
        Bitmap m141205v = m141205v(c25630b, false);
        if (m141205v != null) {
            return m141205v;
        }
        String valueOf = String.valueOf(c25630b.m132429g());
        String valueOf2 = String.valueOf(c25630b.m132432j());
        String str = C20131e.f99303a.m104946c0() + valueOf2 + "/" + valueOf;
        if (AbstractC23041d2.m118194A(str)) {
            Bitmap m142195f = AbstractC28236y3.m142195f(str);
            if (m142195f != null && m142195f.getWidth() > 0 && m142195f.getHeight() > 0) {
                m141205v = m142195f;
            }
        } else {
            InterfaceC17872f m141720n = C28181s2.m141720n(C28181s2.f131306a, c25630b, true, 0, 0, 0, 28, null);
            int m132430h = c25630b.m132430h();
            if (m141720n != null) {
                bitmap = m141720n.mo88377d(m132430h);
            } else {
                bitmap = null;
            }
            if (bitmap != null) {
                if (m141720n instanceof C26253e) {
                    m141177s(m141720n, c25630b);
                }
                m141205v = bitmap;
            }
        }
        if (m141205v != null) {
            f130651d.put(valueOf, m141205v);
        }
        return m141205v;
    }

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x00f3 -> B:7:0x00f5). Please report as a decompilation issue!!! */
    /* renamed from: x */
    public final String m141207x(C25630b c25630b) {
        String str;
        AbstractC19074t.m100208f(c25630b, "stickerInfo");
        try {
        } catch (Exception e11) {
            AbstractC20110a.f98889a.mo104552e(e11);
        }
        if (c25630b.m132448z()) {
            str = C20131e.f99303a.m104946c0() + c25630b.m132427f() + "/" + c25630b.m132429g();
        } else {
            if (c25630b.m132393A()) {
                String m132436n = c25630b.m132436n();
                String str2 = c25630b.m132439q() + "/" + c25630b.m132429g() + ".gif";
                String str3 = c25630b.m132439q() + "/" + c25630b.m132429g() + ".png";
                String str4 = c25630b.m132439q() + "/" + c25630b.m132429g() + ".jpg";
                if (AbstractC23041d2.m118194A(m132436n)) {
                    str = AbstractC3972e.m18757N(c25630b.m132439q(), c25630b.m132430h());
                    AbstractC19074t.m100207e(str, "getStickerThumbPath(...)");
                } else if (AbstractC23041d2.m118194A(str2)) {
                    str = C20131e.f99303a.m104946c0() + c25630b.m132432j() + "/" + c25630b.m132429g();
                } else if (AbstractC23041d2.m118194A(str3)) {
                    str = str3;
                } else if (AbstractC23041d2.m118194A(str4)) {
                    str = str4;
                }
            }
            str = "";
        }
        return str;
    }

    /* renamed from: y */
    public final String m141208y(String str, InterfaceC27218a interfaceC27218a) {
        String str2;
        AbstractC19074t.m100208f(str, "prefix");
        AbstractC19074t.m100208f(interfaceC27218a, "activity");
        if (interfaceC27218a.mo35586v2()) {
            str2 = "BUBBLE_";
        } else {
            str2 = "MAIN_APP_";
        }
        return str + str2;
    }

    /* renamed from: z */
    public final String m141209z(String str) {
        String str2;
        if (!TextUtils.isEmpty(str) && (str2 = (String) f130652e.get(str)) != null) {
            return str2;
        }
        return "";
    }
}
