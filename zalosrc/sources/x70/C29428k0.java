package x70;

import ag0.AbstractC0837p0;
import am.C0943w;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import au.EnumC2380x;
import b40.C2535j;
import b40.C2549x;
import ci.C3531z;
import com.androidquery.util.AbstractC3972e;
import com.androidquery.util.C3979l;
import com.androidquery.util.RecyclingImageView;
import com.zing.zalo.AbstractC16803z;
import com.zing.zalo.MainApplication;
import com.zing.zalo.control.MediaStoreItem;
import com.zing.zalo.data.entity.chat.message.MessageId;
import com.zing.zalo.p062db.C7956b;
import com.zing.zalo.p077ui.toolstorage.detail.C13380a;
import com.zing.zalo.zalocloud.utils.AbstractC16893a;
import com.zing.zalo.zmedia.player.ZMediaHandlerThread;
import com.zing.zalo.zmedia.player.ZMediaPlayer;
import com.zing.zalo.zmedia.player.ZMediaPlayerSettings;
import com.zing.zalocore.CoreUtility;
import dg0.AbstractC17930e;
import dj.C17945a0;
import dj.C17961f1;
import dj.C17969i0;
import dj.C17981m0;
import dj.C18009w0;
import eg0.AbstractC18428c;
import en0.InterfaceC18509p;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import fn0.C19059j0;
import gg0.AbstractC19444a;
import gw.AbstractC19646n0;
import ho0.AbstractC20110a;
import hu.C20131e;
import id0.C20518d;
import java.io.File;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import l80.C22122a0;
import lc.EnumC22425a;
import me0.AbstractC23009a3;
import me0.AbstractC23041d2;
import me0.AbstractC23136l9;
import me0.AbstractC23160o0;
import me0.AbstractC23170p;
import me0.AbstractC23258x2;
import me0.C23278z2;
import mg.C23288a;
import mm0.AbstractC23350e;
import mm0.AbstractC23352g;
import on0.AbstractC24341v;
import p019aj.C0877k;
import p239ih.C20556f;
import p263jc.C21216s;
import p268ji.C21270p;
import p296kc.C21661h;
import p348mi.AbstractC23306f;
import p354n3.C23528a;
import p379o3.C23994e;
import p379o3.C23995f;
import p379o3.C23999j;
import p379o3.C24003n;
import p396ol.C24302e;
import p396ol.EnumC24298a;
import p396ol.InterfaceC24301d;
import p423pi.C24759a;
import p461qu.AbstractC25495a;
import p487rl.C25821b;
import p698yz.AbstractC31111g;
import p716zh.AbstractC32161w6;
import p716zh.C31973j5;
import p716zh.C32032n4;
import p716zh.C32042o;
import p716zh.C32047o4;
import p716zh.C32061p4;
import p716zh.C32075q4;
import p716zh.C32089r4;
import p716zh.C32103s4;
import p716zh.C32117t4;
import p716zh.C32175x6;
import qm0.AbstractC25332a0;
import qm0.AbstractC25368s;
import qm0.AbstractC25376w;
import x70.C29428k0;
import xd0.C29604t;

/* renamed from: x70.k0 */
/* loaded from: classes6.dex */
public final class C29428k0 {
    public static final c Companion = new c(null);

    /* renamed from: q */
    private static boolean f135998q;

    /* renamed from: a */
    private final int f135999a;

    /* renamed from: b */
    private final Context f136000b;

    /* renamed from: c */
    private final C23528a f136001c;

    /* renamed from: d */
    private final C22122a0 f136002d;

    /* renamed from: e */
    private final RecyclingImageView f136003e;

    /* renamed from: f */
    private a f136004f;

    /* renamed from: g */
    private final String f136005g;

    /* renamed from: h */
    private List f136006h;

    /* renamed from: i */
    private String f136007i;

    /* renamed from: j */
    private int f136008j;

    /* renamed from: k */
    private Drawable f136009k;

    /* renamed from: l */
    private C24003n f136010l;

    /* renamed from: m */
    private boolean f136011m;

    /* renamed from: n */
    private int f136012n;

    /* renamed from: o */
    private h f136013o;

    /* renamed from: p */
    private boolean f136014p;

    /* renamed from: x70.k0$a */
    /* loaded from: classes6.dex */
    public static abstract class a {
        /* renamed from: a */
        public abstract String mo146631a();

        /* renamed from: b */
        public abstract long mo146632b();

        /* renamed from: c */
        public abstract C32175x6 mo146633c();

        /* renamed from: d */
        public abstract String mo146634d();

        /* renamed from: e */
        public abstract String mo146635e();

        /* renamed from: f */
        public abstract C17945a0 mo146636f();

        /* renamed from: g */
        public abstract MessageId mo146637g();

        /* renamed from: h */
        public abstract String mo146638h();

        /* renamed from: i */
        public abstract boolean mo146639i();

        /* renamed from: j */
        public abstract boolean mo146640j();

        /* renamed from: k */
        public abstract boolean mo146641k();

        /* renamed from: l */
        public abstract boolean mo146642l();

        /* renamed from: m */
        public abstract void mo146643m(C32175x6 c32175x6);

        /* renamed from: n */
        public abstract void mo146644n(String str);

        /* renamed from: o */
        public abstract void mo146645o(String str);
    }

    /* renamed from: x70.k0$b */
    /* loaded from: classes6.dex */
    public static final class b extends a {

        /* renamed from: a */
        private final C17945a0 f136015a;

        /* renamed from: b */
        private C32175x6 f136016b;

        /* renamed from: c */
        private String f136017c;

        public b(C17945a0 c17945a0) {
            AbstractC19074t.m100208f(c17945a0, "chatContent");
            this.f136015a = c17945a0;
        }

        @Override // x70.C29428k0.a
        /* renamed from: a */
        public String mo146631a() {
            String mo95039W2 = this.f136015a.mo95039W2();
            AbstractC19074t.m100207e(mo95039W2, "getOwnerId(...)");
            return mo95039W2;
        }

        @Override // x70.C29428k0.a
        /* renamed from: b */
        public long mo146632b() {
            return this.f136015a.m94974P4();
        }

        @Override // x70.C29428k0.a
        /* renamed from: c */
        public C32175x6 mo146633c() {
            return this.f136016b;
        }

        @Override // x70.C29428k0.a
        /* renamed from: d */
        public String mo146634d() {
            return this.f136017c;
        }

        @Override // x70.C29428k0.a
        /* renamed from: e */
        public String mo146635e() {
            String m94983Q3 = this.f136015a.m94983Q3();
            AbstractC19074t.m100207e(m94983Q3, "getLocalpath(...)");
            return m94983Q3;
        }

        @Override // x70.C29428k0.a
        /* renamed from: f */
        public C17945a0 mo146636f() {
            return this.f136015a;
        }

        @Override // x70.C29428k0.a
        /* renamed from: g */
        public MessageId mo146637g() {
            MessageId m95029V3 = this.f136015a.m95029V3();
            AbstractC19074t.m100207e(m95029V3, "getMessageId(...)");
            return m95029V3;
        }

        @Override // x70.C29428k0.a
        /* renamed from: h */
        public String mo146638h() {
            C18009w0 c18009w0;
            String str;
            C17969i0 m94929K2 = this.f136015a.m94929K2();
            if (m94929K2 instanceof C18009w0) {
                c18009w0 = (C18009w0) m94929K2;
            } else {
                c18009w0 = null;
            }
            if (c18009w0 == null || (str = c18009w0.f91014s) == null) {
                return "";
            }
            return str;
        }

        @Override // x70.C29428k0.a
        /* renamed from: i */
        public boolean mo146639i() {
            return this.f136015a.m94959N6();
        }

        @Override // x70.C29428k0.a
        /* renamed from: j */
        public boolean mo146640j() {
            if (!this.f136015a.m94871D7() && !this.f136015a.m95120e6()) {
                return false;
            }
            return true;
        }

        @Override // x70.C29428k0.a
        /* renamed from: k */
        public boolean mo146641k() {
            return this.f136015a.m95022U7();
        }

        @Override // x70.C29428k0.a
        /* renamed from: l */
        public boolean mo146642l() {
            return this.f136015a.m95306y8();
        }

        @Override // x70.C29428k0.a
        /* renamed from: m */
        public void mo146643m(C32175x6 c32175x6) {
            this.f136016b = c32175x6;
        }

        @Override // x70.C29428k0.a
        /* renamed from: n */
        public void mo146644n(String str) {
            this.f136017c = str;
        }

        @Override // x70.C29428k0.a
        /* renamed from: o */
        public void mo146645o(String str) {
            AbstractC19074t.m100208f(str, "value");
            this.f136015a.m94934Ka(str);
            C17945a0 c17945a0 = this.f136015a;
            c17945a0.m95114dc(c17945a0.m95249s4());
        }

        /* renamed from: p */
        public final C17945a0 m146646p() {
            return this.f136015a;
        }
    }

    /* renamed from: x70.k0$c */
    /* loaded from: classes6.dex */
    public static final class c {

        /* renamed from: x70.k0$c$a */
        /* loaded from: classes6.dex */
        public /* synthetic */ class a {

            /* renamed from: a */
            public static final /* synthetic */ int[] f136018a;

            static {
                int[] iArr = new int[EnumC2380x.values().length];
                try {
                    iArr[EnumC2380x.f9933p.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[EnumC2380x.f9934q.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[EnumC2380x.f9935r.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[EnumC2380x.f9936s.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                f136018a = iArr;
            }
        }

        /* renamed from: x70.k0$c$b */
        /* loaded from: classes6.dex */
        public static final class b implements InterfaceC24301d {

            /* renamed from: a */
            final /* synthetic */ a f136019a;

            /* renamed from: b */
            final /* synthetic */ String f136020b;

            /* renamed from: c */
            final /* synthetic */ d f136021c;

            b(a aVar, String str, d dVar) {
                this.f136019a = aVar;
                this.f136020b = str;
                this.f136021c = dVar;
            }

            @Override // p396ol.InterfaceC24301d
            /* renamed from: a */
            public void mo66919a(String str, long j11) {
                AbstractC19074t.m100208f(str, "downloadId");
            }

            @Override // p396ol.InterfaceC24301d
            /* renamed from: b */
            public boolean mo66920b() {
                return false;
            }

            @Override // p396ol.InterfaceC24301d
            /* renamed from: c */
            public EnumC24298a mo66921c() {
                return EnumC24298a.f117299r;
            }

            @Override // p396ol.InterfaceC24301d
            /* renamed from: d */
            public void mo66922d(String str, int i11, String str2) {
                AbstractC32161w6 abstractC32161w6;
                AbstractC19074t.m100208f(str, ZMediaPlayer.OnNativeInvokeListener.ARG_URL);
                AbstractC19074t.m100208f(str2, "errorMessage");
                boolean m126915d = C24302e.Companion.m126915d(i11, this.f136019a.mo146632b());
                C29428k0.Companion.m146659P(this.f136020b, this.f136019a, m126915d);
                d dVar = this.f136021c;
                if (m126915d) {
                    abstractC32161w6 = C32089r4.f147853a;
                } else {
                    abstractC32161w6 = C32032n4.f147496a;
                }
                dVar.mo97203c(abstractC32161w6);
            }

            /* JADX WARN: Code restructure failed: missing block: B:17:0x003c, code lost:            if (r0 != false) goto L36;     */
            @Override // p396ol.InterfaceC24301d
            /* renamed from: e */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public void mo66923e(String str, String str2) {
                Bitmap m117961l;
                AbstractC19074t.m100208f(str, ZMediaPlayer.OnNativeInvokeListener.ARG_URL);
                AbstractC19074t.m100208f(str2, "path");
                File file = new File(str2);
                if (file.exists() && file.length() > 0 && AbstractC19646n0.m102927R0(str2) == 3) {
                    boolean m119958q = AbstractC23258x2.m119958q(str2);
                    if (!m119958q && (m117961l = AbstractC23009a3.m117961l(str2)) != null) {
                        if (!m117961l.isRecycled()) {
                            m117961l.recycle();
                        }
                    }
                    C29428k0.Companion.m146657N(this.f136020b, this.f136019a, str2, true);
                    this.f136021c.mo97202b(file);
                    return;
                }
                c cVar = C29428k0.Companion;
                a aVar = this.f136019a;
                C32032n4 c32032n4 = C32032n4.f147496a;
                cVar.m146659P(this.f136020b, this.f136019a, cVar.m146677p(aVar, null, c32032n4));
                this.f136021c.mo97203c(c32032n4);
            }

            @Override // p396ol.InterfaceC24301d
            /* renamed from: h */
            public int mo66924h() {
                return InterfaceC24301d.a.m126884a(this);
            }
        }

        /* renamed from: x70.k0$c$c */
        /* loaded from: classes6.dex */
        public static final class C33049c implements e {

            /* renamed from: a */
            final /* synthetic */ a f136022a;

            /* renamed from: b */
            final /* synthetic */ String f136023b;

            /* renamed from: c */
            final /* synthetic */ String f136024c;

            /* renamed from: d */
            final /* synthetic */ d f136025d;

            /* renamed from: e */
            final /* synthetic */ boolean f136026e;

            /* renamed from: f */
            final /* synthetic */ String f136027f;

            C33049c(a aVar, String str, String str2, d dVar, boolean z11, String str3) {
                this.f136022a = aVar;
                this.f136023b = str;
                this.f136024c = str2;
                this.f136025d = dVar;
                this.f136026e = z11;
                this.f136027f = str3;
            }

            @Override // x70.C29428k0.e
            /* renamed from: b */
            public void mo97202b(File file) {
                AbstractC19074t.m100208f(file, "result");
                c cVar = C29428k0.Companion;
                String str = this.f136024c;
                a aVar = this.f136022a;
                String path = file.getPath();
                AbstractC19074t.m100207e(path, "getPath(...)");
                cVar.m146657N(str, aVar, path, false);
                this.f136025d.mo97202b(file);
            }

            @Override // x70.C29428k0.e
            /* renamed from: c */
            public void mo97203c(AbstractC32161w6 abstractC32161w6) {
                AbstractC19074t.m100208f(abstractC32161w6, "errorCode");
                try {
                    new File(this.f136027f).delete();
                } catch (Exception e11) {
                    AbstractC20110a.f98889a.mo104552e(e11);
                }
                if (!this.f136026e && (abstractC32161w6 instanceof C32032n4) && AbstractC19646n0.m102999l1() && this.f136025d.mo97204a() && !AbstractC23306f.m120691m2().m2466q()) {
                    C29428k0.Companion.m146678q(this.f136024c, this.f136022a, this.f136025d);
                } else {
                    this.f136025d.mo97203c(abstractC32161w6);
                }
            }
        }

        /* renamed from: x70.k0$c$d */
        /* loaded from: classes6.dex */
        public static final class d implements InterfaceC24301d {

            /* renamed from: a */
            final /* synthetic */ boolean f136028a;

            /* renamed from: b */
            final /* synthetic */ a f136029b;

            /* renamed from: c */
            final /* synthetic */ d f136030c;

            /* renamed from: d */
            final /* synthetic */ String f136031d;

            d(boolean z11, a aVar, d dVar, String str) {
                this.f136028a = z11;
                this.f136029b = aVar;
                this.f136030c = dVar;
                this.f136031d = str;
            }

            @Override // p396ol.InterfaceC24301d
            /* renamed from: a */
            public void mo66919a(String str, long j11) {
                AbstractC19074t.m100208f(str, "downloadId");
            }

            @Override // p396ol.InterfaceC24301d
            /* renamed from: b */
            public boolean mo66920b() {
                return true;
            }

            @Override // p396ol.InterfaceC24301d
            /* renamed from: c */
            public EnumC24298a mo66921c() {
                if (this.f136028a) {
                    return EnumC24298a.f117299r;
                }
                return EnumC24298a.f117297p;
            }

            @Override // p396ol.InterfaceC24301d
            /* renamed from: d */
            public void mo66922d(String str, int i11, String str2) {
                AbstractC32161w6 abstractC32161w6;
                AbstractC19074t.m100208f(str, ZMediaPlayer.OnNativeInvokeListener.ARG_URL);
                AbstractC19074t.m100208f(str2, "errorMessage");
                boolean m126916e = C24302e.Companion.m126916e(i11);
                C29428k0.Companion.m146659P(this.f136031d, this.f136029b, m126916e);
                if (m126916e) {
                    abstractC32161w6 = C32089r4.f147853a;
                } else {
                    abstractC32161w6 = C32117t4.f148054a;
                }
                this.f136030c.mo97203c(abstractC32161w6);
            }

            /* JADX WARN: Code restructure failed: missing block: B:15:0x0035, code lost:            if (r0 != false) goto L32;     */
            @Override // p396ol.InterfaceC24301d
            /* renamed from: e */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public void mo66923e(String str, String str2) {
                Bitmap m117961l;
                AbstractC19074t.m100208f(str, ZMediaPlayer.OnNativeInvokeListener.ARG_URL);
                AbstractC19074t.m100208f(str2, "path");
                File file = new File(str2);
                if (file.exists() && file.length() > 0) {
                    boolean m119958q = AbstractC23258x2.m119958q(str2);
                    if (!m119958q && (m117961l = AbstractC23009a3.m117961l(str2)) != null) {
                        if (!m117961l.isRecycled()) {
                            m117961l.recycle();
                        }
                    }
                    this.f136030c.mo97202b(file);
                    return;
                }
                C29428k0.Companion.m146659P(this.f136031d, this.f136029b, false);
                this.f136030c.mo97203c(C32117t4.f148054a);
            }

            @Override // p396ol.InterfaceC24301d
            /* renamed from: h */
            public int mo66924h() {
                return InterfaceC24301d.a.m126884a(this);
            }
        }

        /* renamed from: x70.k0$c$e */
        /* loaded from: classes6.dex */
        public static final class e extends C23994e {

            /* renamed from: v0 */
            final /* synthetic */ e f136032v0;

            /* renamed from: w0 */
            final /* synthetic */ File f136033w0;

            e(e eVar, File file) {
                this.f136032v0 = eVar;
                this.f136033w0 = file;
            }

            @Override // p379o3.AbstractRunnableC23992c
            /* renamed from: B1 */
            public void mo1932C(String str, File file, C23995f c23995f) {
                AbstractC32161w6 abstractC32161w6;
                AbstractC19074t.m100208f(str, ZMediaPlayer.OnNativeInvokeListener.ARG_URL);
                AbstractC19074t.m100208f(c23995f, "status");
                if (c23995f.m125657h() == 200 && file != null && AbstractC23258x2.m119958q(file.getPath())) {
                    this.f136032v0.mo97202b(this.f136033w0);
                    return;
                }
                int m125657h = c23995f.m125657h();
                if (m125657h != 404) {
                    if (m125657h != 502 && m125657h != 504) {
                        abstractC32161w6 = C32103s4.f148000a;
                    } else {
                        abstractC32161w6 = C32047o4.f147570a;
                    }
                } else {
                    abstractC32161w6 = C32032n4.f147496a;
                }
                this.f136032v0.mo97203c(abstractC32161w6);
            }
        }

        /* renamed from: x70.k0$c$f */
        /* loaded from: classes6.dex */
        public static final class f extends AbstractC19075u implements InterfaceC18509p {

            /* renamed from: q */
            public static final f f136034q = new f();

            f() {
                super(2);
            }

            @Override // en0.InterfaceC18509p
            /* renamed from: a */
            public final Integer mo240pC(C32175x6 c32175x6, C32175x6 c32175x62) {
                AbstractC19074t.m100208f(c32175x6, "o1");
                AbstractC19074t.m100208f(c32175x62, "o2");
                return Integer.valueOf(c32175x6.m155166a() - c32175x62.m155166a());
            }
        }

        /* renamed from: x70.k0$c$g */
        /* loaded from: classes6.dex */
        public static final class g extends AbstractC19075u implements InterfaceC18509p {

            /* renamed from: q */
            public static final g f136035q = new g();

            g() {
                super(2);
            }

            @Override // en0.InterfaceC18509p
            /* renamed from: a */
            public final Integer mo240pC(C32175x6 c32175x6, C32175x6 c32175x62) {
                AbstractC19074t.m100208f(c32175x6, "o1");
                AbstractC19074t.m100208f(c32175x62, "o2");
                return Integer.valueOf(c32175x6.m155166a() - c32175x62.m155166a());
            }
        }

        /* renamed from: x70.k0$c$h */
        /* loaded from: classes6.dex */
        public static final class h extends AbstractC19075u implements InterfaceC18509p {

            /* renamed from: q */
            public static final h f136036q = new h();

            h() {
                super(2);
            }

            @Override // en0.InterfaceC18509p
            /* renamed from: a */
            public final Integer mo240pC(C32175x6 c32175x6, C32175x6 c32175x62) {
                AbstractC19074t.m100208f(c32175x6, "o1");
                AbstractC19074t.m100208f(c32175x62, "o2");
                return Integer.valueOf(c32175x6.m155166a() - c32175x62.m155166a());
            }
        }

        /* renamed from: x70.k0$c$i */
        /* loaded from: classes6.dex */
        public static final class i extends AbstractC19075u implements InterfaceC18509p {

            /* renamed from: q */
            public static final i f136037q = new i();

            i() {
                super(2);
            }

            @Override // en0.InterfaceC18509p
            /* renamed from: a */
            public final Integer mo240pC(C32175x6 c32175x6, C32175x6 c32175x62) {
                AbstractC19074t.m100208f(c32175x6, "o1");
                AbstractC19074t.m100208f(c32175x62, "o2");
                return Integer.valueOf(c32175x6.m155166a() - c32175x62.m155166a());
            }
        }

        private c() {
        }

        public /* synthetic */ c(AbstractC19060k abstractC19060k) {
            this();
        }

        /* renamed from: A */
        static /* synthetic */ String m146647A(c cVar, a aVar, boolean z11, int i11, Object obj) {
            if ((i11 & 2) != 0) {
                z11 = true;
            }
            return cVar.m146685z(aVar, z11);
        }

        /* renamed from: B */
        private final List m146648B(C17945a0 c17945a0) {
            List m131502j;
            if (c17945a0 == null) {
                m131502j = AbstractC25368s.m131502j();
                return m131502j;
            }
            ArrayList arrayList = new ArrayList();
            if (!c17945a0.m94871D7() && !c17945a0.m95306y8() && !c17945a0.m95120e6()) {
                return arrayList;
            }
            if (c17945a0.m94871D7() && c17945a0.m94888F5()) {
                String m18001b = c17945a0.m95002S3().m18001b();
                AbstractC19074t.m100207e(m18001b, "getData(...)");
                arrayList.add(new C32175x6(1, m18001b));
            }
            if ((c17945a0.m94871D7() || c17945a0.m95120e6()) && !TextUtils.isEmpty(c17945a0.m94983Q3())) {
                String m94983Q3 = c17945a0.m94983Q3();
                AbstractC19074t.m100207e(m94983Q3, "getLocalpath(...)");
                arrayList.add(new C32175x6(2, m94983Q3));
            }
            if (!TextUtils.isEmpty(c17945a0.m94947M4()) && !TextUtils.equals(c17945a0.m94947M4(), c17945a0.m94983Q3())) {
                String m94947M4 = c17945a0.m94947M4();
                AbstractC19074t.m100207e(m94947M4, "getThumbLocalPath(...)");
                arrayList.add(new C32175x6(3, m94947M4));
            }
            AbstractC25376w.m131534w(arrayList, new Comparator() { // from class: x70.l0
                public /* synthetic */ C29431l0() {
                }

                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    int m146649C;
                    m146649C = C29428k0.c.m146649C(InterfaceC18509p.this, obj, obj2);
                    return m146649C;
                }
            });
            return arrayList;
        }

        /* renamed from: C */
        public static final int m146649C(InterfaceC18509p interfaceC18509p, Object obj, Object obj2) {
            AbstractC19074t.m100208f(interfaceC18509p, "$tmp0");
            return ((Number) interfaceC18509p.mo240pC(obj, obj2)).intValue();
        }

        /* renamed from: G */
        public static final int m146650G(InterfaceC18509p interfaceC18509p, Object obj, Object obj2) {
            AbstractC19074t.m100208f(interfaceC18509p, "$tmp0");
            return ((Number) interfaceC18509p.mo240pC(obj, obj2)).intValue();
        }

        /* renamed from: H */
        public static final int m146651H(InterfaceC18509p interfaceC18509p, Object obj, Object obj2) {
            AbstractC19074t.m100208f(interfaceC18509p, "$tmp0");
            return ((Number) interfaceC18509p.mo240pC(obj, obj2)).intValue();
        }

        /* renamed from: I */
        private final List m146652I(j jVar) {
            ArrayList arrayList = new ArrayList();
            String path = C24302e.Companion.m126918g(jVar.m146699p()).getPath();
            AbstractC19074t.m100207e(path, "getPath(...)");
            arrayList.add(new C32175x6(8, path));
            return arrayList;
        }

        /* renamed from: J */
        private final List m146653J(i iVar, boolean z11) {
            String str;
            C17945a0 m146698p = iVar.m146698p();
            ArrayList arrayList = new ArrayList();
            if (iVar.m146698p().m94959N6()) {
                if (m146698p.m94888F5()) {
                    str = m146698p.m95002S3().m18001b();
                } else {
                    str = "";
                }
                if (iVar.m146698p().m94871D7() && !TextUtils.isEmpty(str)) {
                    AbstractC19074t.m100205c(str);
                    arrayList.add(new C32175x6(1, str));
                }
                if ((m146698p.m94871D7() || m146698p.m95120e6()) && C24302e.Companion.m126917f(iVar.m146698p()).exists()) {
                    String m95090b5 = m146698p.m95090b5();
                    AbstractC19074t.m100207e(m95090b5, "getUrl(...)");
                    arrayList.add(new C32175x6(8, m95090b5));
                }
                C2535j c2535j = C2535j.f10308a;
                MessageId m95029V3 = m146698p.m95029V3();
                AbstractC19074t.m100207e(m95029V3, "getMessageId(...)");
                c2535j.m12771n(m95029V3);
                return arrayList;
            }
            arrayList.addAll(m146648B(m146698p));
            boolean m151135p = AbstractC31111g.m151135p(m146698p);
            if (m146698p.m94929K2() instanceof C18009w0) {
                C17969i0 m94929K2 = m146698p.m94929K2();
                AbstractC19074t.m100206d(m94929K2, "null cannot be cast to non-null type com.zing.zalo.data.chat.model.message.ChatRichContentPhoto");
                C18009w0 c18009w0 = (C18009w0) m94929K2;
                if (!TextUtils.isEmpty(c18009w0.f91013r) && !m151135p) {
                    arrayList.add(new C32175x6(4, c18009w0.f91013r));
                }
                if (!TextUtils.isEmpty(c18009w0.f91014s)) {
                    arrayList.add(new C32175x6(5, c18009w0.f91014s));
                }
            } else if (m146698p.m94929K2() instanceof C17961f1) {
                C17969i0 m94929K22 = m146698p.m94929K2();
                AbstractC19074t.m100206d(m94929K22, "null cannot be cast to non-null type com.zing.zalo.data.chat.model.message.ChatRichContentVideo");
                C17961f1 c17961f1 = (C17961f1) m94929K22;
                if (!TextUtils.isEmpty(c17961f1.f91013r) && !m151135p) {
                    arrayList.add(new C32175x6(4, c17961f1.f91013r));
                }
            } else if (m146698p.m94929K2() instanceof C17981m0) {
                C17969i0 m94929K23 = m146698p.m94929K2();
                AbstractC19074t.m100206d(m94929K23, "null cannot be cast to non-null type com.zing.zalo.data.chat.model.message.ChatRichContentDoodle");
                C17981m0 c17981m0 = (C17981m0) m94929K23;
                if (!TextUtils.isEmpty(c17981m0.f91013r) && !m151135p) {
                    arrayList.add(new C32175x6(4, c17981m0.f91013r));
                }
                if (!TextUtils.isEmpty(c17981m0.f91014s)) {
                    arrayList.add(new C32175x6(5, c17981m0.f91014s));
                }
            }
            if (m146698p.m94871D7() || m146698p.m95120e6()) {
                String m95090b52 = m146698p.m95090b5();
                AbstractC19074t.m100207e(m95090b52, "getUrl(...)");
                arrayList.add(new C32175x6(8, m95090b52));
            }
            AbstractC25376w.m131534w(arrayList, new Comparator() { // from class: x70.m0
                public /* synthetic */ C29434m0() {
                }

                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    int m146654K;
                    m146654K = C29428k0.c.m146654K(InterfaceC18509p.this, obj, obj2);
                    return m146654K;
                }
            });
            return arrayList;
        }

        /* renamed from: K */
        public static final int m146654K(InterfaceC18509p interfaceC18509p, Object obj, Object obj2) {
            AbstractC19074t.m100208f(interfaceC18509p, "$tmp0");
            return ((Number) interfaceC18509p.mo240pC(obj, obj2)).intValue();
        }

        /* renamed from: L */
        private final boolean m146655L(String str) {
            boolean m127120J;
            boolean m127120J2;
            m127120J = AbstractC24341v.m127120J(str, "http://", false, 2, null);
            if (!m127120J) {
                m127120J2 = AbstractC24341v.m127120J(str, "https://", false, 2, null);
                if (m127120J2) {
                    return false;
                }
                return true;
            }
            return false;
        }

        /* renamed from: M */
        private final void m146656M(C17945a0 c17945a0, String str) {
            c17945a0.m94934Ka(str);
            if (c17945a0.m95107d3() != 5) {
                c17945a0.m95165ic(5, false);
            }
            c17945a0.m95147gc(str, true, false);
            c17945a0.m95114dc(c17945a0.m95249s4());
        }

        /* renamed from: N */
        public final void m146657N(String str, a aVar, String str2, boolean z11) {
            C17945a0 m146682w;
            if (TextUtils.isEmpty(aVar.mo146631a())) {
                return;
            }
            MessageId mo146637g = aVar.mo146637g();
            boolean z12 = aVar instanceof b;
            if (z12) {
                m146682w = ((b) aVar).m146646p();
            } else if (aVar instanceof g) {
                m146682w = ((g) aVar).m146697p().m40599m();
            } else if (aVar instanceof i) {
                m146682w = ((i) aVar).m146698p();
            } else {
                m146682w = m146682w(mo146637g);
            }
            if (m146682w != null) {
                m146656M(m146682w, str2);
                m146661R(str, m146682w, z11);
            } else {
                AbstractC18428c.m97659b(C23288a.f113033a, aVar.mo146631a(), 0, new Runnable() { // from class: x70.p0

                    /* renamed from: q */
                    public final /* synthetic */ String f136077q;

                    /* renamed from: r */
                    public final /* synthetic */ String f136078r;

                    /* renamed from: s */
                    public final /* synthetic */ boolean f136079s;

                    public /* synthetic */ RunnableC29443p0(String str22, String str3, boolean z112) {
                        r2 = str22;
                        r3 = str3;
                        r4 = z112;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        C29428k0.c.m146658O(MessageId.this, r2, r3, r4);
                    }
                }, 2, null);
            }
            if (z12) {
                b bVar = (b) aVar;
                if (!AbstractC19074t.m100204b(bVar.m146646p(), m146682w)) {
                    m146656M(bVar.m146646p(), str22);
                }
            }
        }

        /* renamed from: O */
        public static final void m146658O(MessageId messageId, String str, String str2, boolean z11) {
            AbstractC19074t.m100208f(messageId, "$messageId");
            AbstractC19074t.m100208f(str, "$localPath");
            AbstractC19074t.m100208f(str2, "$currentUserUid");
            C17945a0 m41553q = C7956b.Companion.m41573b().m41553q(messageId);
            if (m41553q != null) {
                c cVar = C29428k0.Companion;
                cVar.m146656M(m41553q, str);
                cVar.m146661R(str2, m41553q, z11);
            }
        }

        /* renamed from: P */
        public final void m146659P(String str, a aVar, boolean z11) {
            C17945a0 c17945a0;
            if (C29428k0.f135998q) {
                String mo146631a = aVar.mo146631a();
                MessageId mo146637g = aVar.mo146637g();
                StringBuilder sb2 = new StringBuilder();
                sb2.append("updateChatContentStateRolled conversationId:");
                sb2.append(mo146631a);
                sb2.append(", messageId:");
                sb2.append(mo146637g);
                sb2.append(", isRolledForever:");
                sb2.append(z11);
            }
            if (z11) {
                if (aVar instanceof b) {
                    c17945a0 = ((b) aVar).m146646p();
                } else if (aVar instanceof g) {
                    c17945a0 = ((g) aVar).m146697p().m40599m();
                } else if (aVar instanceof i) {
                    c17945a0 = ((i) aVar).m146698p();
                } else {
                    c17945a0 = null;
                }
                if (c17945a0 != null) {
                    c17945a0.m95272uc();
                    AbstractC23306f.m120652d().m109879g1(str, c17945a0, null);
                    C2549x.f10397a.m12853g("chat_storedmedia", c17945a0);
                    return;
                }
                AbstractC18428c.m97659b(C23288a.f113033a, aVar.mo146631a(), 0, new Runnable() { // from class: x70.r0

                    /* renamed from: q */
                    public final /* synthetic */ String f136090q;

                    public /* synthetic */ RunnableC29449r0(String str2) {
                        r2 = str2;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        C29428k0.c.m146660Q(C29428k0.a.this, r2);
                    }
                }, 2, null);
                return;
            }
            AbstractC23306f.m120618S1().m101508a(new C29604t.a(str2, aVar.mo146631a(), aVar.mo146637g(), aVar.mo146637g().m41050n(), "chat_storedmedia"));
        }

        /* renamed from: Q */
        public static final void m146660Q(a aVar, String str) {
            AbstractC19074t.m100208f(aVar, "$photoEntity");
            AbstractC19074t.m100208f(str, "$currentUserUid");
            C17945a0 m41553q = C7956b.Companion.m41573b().m41553q(aVar.mo146637g());
            if (m41553q != null) {
                m41553q.m95272uc();
                AbstractC23306f.m120652d().m109879g1(str, m41553q, null);
                C2549x.f10397a.m12853g("chat_storedmedia", m41553q);
            }
        }

        /* renamed from: R */
        private final void m146661R(String str, C17945a0 c17945a0, boolean z11) {
            C21270p.a aVar;
            C21216s m120652d = AbstractC23306f.m120652d();
            if (!z11) {
                if (m120652d.m109883j0(c17945a0) == null) {
                    C21661h.f105066a.m111635x(c17945a0, EnumC22425a.f109727r);
                }
                aVar = C21270p.a.f103625r;
            } else {
                aVar = null;
            }
            m120652d.m109879g1(str, c17945a0, aVar);
        }

        /* renamed from: p */
        public final boolean m146677p(a aVar, C32175x6 c32175x6, AbstractC32161w6 abstractC32161w6) {
            if (!C24302e.Companion.m126922m()) {
                return false;
            }
            if (AbstractC19074t.m100204b(abstractC32161w6, C32032n4.f147496a)) {
                if (!AbstractC19646n0.m103038v1(1, aVar.mo146632b())) {
                    return true;
                }
            } else {
                if (AbstractC19074t.m100204b(abstractC32161w6, C32075q4.f147690a) || AbstractC19074t.m100204b(abstractC32161w6, C32089r4.f147853a)) {
                    return true;
                }
                if (!AbstractC19074t.m100204b(abstractC32161w6, C32103s4.f148000a)) {
                    return false;
                }
                if (c32175x6 == null || (m146655L(c32175x6.m155168c()) && !AbstractC23041d2.m118194A(c32175x6.m155168c()))) {
                    return !AbstractC19646n0.m103038v1(1, aVar.mo146632b());
                }
            }
            return false;
        }

        /* renamed from: q */
        public final void m146678q(String str, a aVar, d dVar) {
            AbstractC18428c.m97659b(C23288a.f113033a, aVar.mo146631a(), 0, new Runnable() { // from class: x70.q0

                /* renamed from: q */
                public final /* synthetic */ C29428k0.d f136084q;

                /* renamed from: r */
                public final /* synthetic */ String f136085r;

                public /* synthetic */ RunnableC29446q0(C29428k0.d dVar2, String str2) {
                    r2 = dVar2;
                    r3 = str2;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    C29428k0.c.m146679r(C29428k0.a.this, r2, r3);
                }
            }, 2, null);
        }

        /* renamed from: r */
        public static final void m146679r(a aVar, d dVar, String str) {
            AbstractC19074t.m100208f(aVar, "$photoEntity");
            AbstractC19074t.m100208f(dVar, "$listener");
            AbstractC19074t.m100208f(str, "$currentUserUid");
            C17945a0 m41553q = C7956b.Companion.m41573b().m41553q(aVar.mo146637g());
            if (m41553q == null) {
                dVar.mo97203c(C32103s4.f148000a);
                return;
            }
            String m95293x2 = m41553q.m95293x2();
            AbstractC19074t.m100207e(m95293x2, "genDownloadTaskUrl(...)");
            if (TextUtils.isEmpty(m95293x2)) {
                return;
            }
            m41553q.m95273v2(m95293x2);
            m41553q.m95094bb(1);
            C24302e.Companion.m126919j().m126904m(m41553q, new b(aVar, str, dVar));
        }

        /* renamed from: t */
        public final void m146680t(boolean z11, String str, a aVar, d dVar) {
            AbstractC18428c.m97659b(C23288a.f113033a, aVar.mo146631a(), 0, new Runnable() { // from class: x70.s0

                /* renamed from: q */
                public final /* synthetic */ C29428k0.d f136095q;

                /* renamed from: r */
                public final /* synthetic */ C29428k0.c.d f136096r;

                public /* synthetic */ RunnableC29452s0(C29428k0.d dVar2, C29428k0.c.d dVar3) {
                    r2 = dVar2;
                    r3 = dVar3;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    C29428k0.c.m146681u(C29428k0.a.this, r2, r3);
                }
            }, 2, null);
        }

        /* renamed from: u */
        public static final void m146681u(a aVar, d dVar, d dVar2) {
            AbstractC19074t.m100208f(aVar, "$photoEntity");
            AbstractC19074t.m100208f(dVar, "$listener");
            AbstractC19074t.m100208f(dVar2, "$zaloCloudListener");
            C17945a0 m41553q = C7956b.Companion.m41573b().m41553q(aVar.mo146637g());
            if (m41553q == null) {
                dVar.mo97203c(C32103s4.f148000a);
                return;
            }
            String m95293x2 = m41553q.m95293x2();
            AbstractC19074t.m100207e(m95293x2, "genDownloadTaskUrl(...)");
            if (TextUtils.isEmpty(m95293x2)) {
                return;
            }
            m41553q.m95273v2(m95293x2);
            m41553q.m95094bb(1);
            String m95090b5 = m41553q.m95090b5();
            StringBuilder sb2 = new StringBuilder();
            sb2.append("downloadFullPhotoFromZaloCloud: photoUrl - ");
            sb2.append(m95090b5);
            C24302e.Companion.m126919j().m126906o(m41553q, dVar2);
        }

        /* renamed from: w */
        public final C17945a0 m146682w(MessageId messageId) {
            C17945a0 m2636s = AbstractC23306f.m120584H0().m2636s(messageId);
            if (m2636s == null) {
                C17945a0 m95365a = new C17945a0.w(messageId, 0).m95365a();
                AbstractC19074t.m100207e(m95365a, "build(...)");
                C17945a0 m2660a = C0877k.f3256a.m2660a(m95365a);
                if (m2660a == m95365a) {
                    return null;
                }
                return m2660a;
            }
            return m2636s;
        }

        /* renamed from: x */
        private final String m146683x(a aVar, String str) {
            if (!TextUtils.isEmpty(aVar.mo146631a())) {
                return C32042o.f147549a.m154589e(aVar.mo146631a(), aVar.mo146637g(), str);
            }
            String path = new File(C20131e.f99303a.m104947d(), AbstractC23352g.m122788d(str) + ".jpg").getPath();
            AbstractC19074t.m100205c(path);
            return path;
        }

        /* renamed from: y */
        public final C24003n m146684y(a aVar) {
            if (aVar instanceof g) {
                int i11 = a.f136018a[((g) aVar).m146697p().m40570K().ordinal()];
                if (i11 != 1) {
                    if (i11 != 2) {
                        if (i11 != 3) {
                            if (i11 == 4) {
                                return C23278z2.m120159v0();
                            }
                            throw new NoWhenBranchMatchedException();
                        }
                        return C23278z2.f112845a.m120175x0();
                    }
                    return C23278z2.f112845a.m120176z0();
                }
                return C23278z2.f112845a.m120166A0();
            }
            return C23278z2.f112845a.m120176z0();
        }

        /* renamed from: z */
        private final String m146685z(a aVar, boolean z11) {
            if (aVar instanceof g) {
                MediaStoreItem m146697p = ((g) aVar).m146697p();
                return z11 + " - " + aVar.mo146637g() + " - " + m146697p.m40577U() + " - " + m146697p.m40588e0() + " - " + aVar.mo146639i();
            }
            if (aVar instanceof b) {
                C17945a0 m146646p = ((b) aVar).m146646p();
                return z11 + " - " + aVar.mo146637g() + " - " + m146646p.m95041W4() + " - " + aVar.mo146639i();
            }
            return z11 + " - " + aVar.mo146637g();
        }

        /* renamed from: D */
        public final List m146686D(MediaStoreItem mediaStoreItem, boolean z11) {
            String str;
            AbstractC19074t.m100208f(mediaStoreItem, "mediaStoreItem");
            ArrayList arrayList = new ArrayList();
            if (!mediaStoreItem.m40594i0() && !mediaStoreItem.m40602n0()) {
                return arrayList;
            }
            if (mediaStoreItem.m40599m().m94888F5()) {
                str = mediaStoreItem.m40599m().m95002S3().m18001b();
            } else {
                str = "";
            }
            if (mediaStoreItem.m40599m().m94959N6()) {
                if (mediaStoreItem.m40594i0() && !TextUtils.isEmpty(str)) {
                    AbstractC19074t.m100205c(str);
                    arrayList.add(new C32175x6(1, str));
                }
                C2535j.f10308a.m12771n(mediaStoreItem.m40571M());
                return arrayList;
            }
            if (z11) {
                if (mediaStoreItem.m40594i0() && !TextUtils.isEmpty(str)) {
                    AbstractC19074t.m100205c(str);
                    arrayList.add(new C32175x6(1, str));
                }
                if (mediaStoreItem.m40594i0() && !TextUtils.isEmpty(mediaStoreItem.m40599m().m94983Q3())) {
                    String m94983Q3 = mediaStoreItem.m40599m().m94983Q3();
                    AbstractC19074t.m100207e(m94983Q3, "getLocalpath(...)");
                    arrayList.add(new C32175x6(2, m94983Q3));
                }
                if (!TextUtils.isEmpty(mediaStoreItem.m40599m().m94947M4()) && !TextUtils.equals(mediaStoreItem.m40599m().m94947M4(), mediaStoreItem.m40599m().m94983Q3())) {
                    String m94947M4 = mediaStoreItem.m40599m().m94947M4();
                    AbstractC19074t.m100207e(m94947M4, "getThumbLocalPath(...)");
                    arrayList.add(new C32175x6(3, m94947M4));
                }
                if (!mediaStoreItem.m40588e0()) {
                    if (!TextUtils.isEmpty(mediaStoreItem.m40599m().m95131f5()) && !AbstractC31111g.m151135p(mediaStoreItem.m40599m())) {
                        String m95131f5 = mediaStoreItem.m40599m().m95131f5();
                        AbstractC19074t.m100207e(m95131f5, "getUrl_thumb(...)");
                        arrayList.add(new C32175x6(4, m95131f5));
                    }
                    if (mediaStoreItem.m40594i0() && !TextUtils.isEmpty(mediaStoreItem.m40599m().m95090b5())) {
                        String m95090b5 = mediaStoreItem.m40599m().m95090b5();
                        AbstractC19074t.m100207e(m95090b5, "getUrl(...)");
                        arrayList.add(new C32175x6(5, m95090b5));
                    }
                }
            } else {
                if (mediaStoreItem.m40594i0() && !TextUtils.isEmpty(str)) {
                    AbstractC19074t.m100205c(str);
                    arrayList.add(new C32175x6(1, str));
                }
                if (!mediaStoreItem.m40588e0() && !TextUtils.isEmpty(mediaStoreItem.m40599m().m95131f5())) {
                    String m95131f52 = mediaStoreItem.m40599m().m95131f5();
                    AbstractC19074t.m100207e(m95131f52, "getUrl_thumb(...)");
                    arrayList.add(new C32175x6(4, m95131f52));
                }
            }
            AbstractC25376w.m131534w(arrayList, new Comparator() { // from class: x70.o0
                public /* synthetic */ C29440o0() {
                }

                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    int m146650G;
                    m146650G = C29428k0.c.m146650G(InterfaceC18509p.this, obj, obj2);
                    return m146650G;
                }
            });
            return arrayList;
        }

        /* renamed from: E */
        public final List m146687E(C17945a0 c17945a0) {
            boolean z11;
            AbstractC19074t.m100208f(c17945a0, "chatContent");
            ArrayList arrayList = new ArrayList();
            if (!c17945a0.m94871D7() && !c17945a0.m95120e6()) {
                z11 = false;
            } else {
                z11 = true;
            }
            boolean m95306y8 = c17945a0.m95306y8();
            if (!z11 && !m95306y8) {
                return arrayList;
            }
            if (c17945a0.m94959N6()) {
                if (z11 && c17945a0.m94888F5()) {
                    String m18001b = c17945a0.m95002S3().m18001b();
                    AbstractC19074t.m100207e(m18001b, "getData(...)");
                    arrayList.add(new C32175x6(1, m18001b));
                }
                return arrayList;
            }
            if (z11 && c17945a0.m94888F5()) {
                String m18001b2 = c17945a0.m95002S3().m18001b();
                AbstractC19074t.m100207e(m18001b2, "getData(...)");
                arrayList.add(new C32175x6(1, m18001b2));
            }
            if (z11 && !TextUtils.isEmpty(c17945a0.m94983Q3())) {
                String m94983Q3 = c17945a0.m94983Q3();
                AbstractC19074t.m100207e(m94983Q3, "getLocalpath(...)");
                arrayList.add(new C32175x6(2, m94983Q3));
            }
            if (!TextUtils.isEmpty(c17945a0.m94947M4()) && !TextUtils.equals(c17945a0.m94947M4(), c17945a0.m94983Q3())) {
                String m94947M4 = c17945a0.m94947M4();
                AbstractC19074t.m100207e(m94947M4, "getThumbLocalPath(...)");
                arrayList.add(new C32175x6(3, m94947M4));
            }
            boolean m151135p = AbstractC31111g.m151135p(c17945a0);
            if (c17945a0.m94929K2() instanceof C18009w0) {
                C17969i0 m94929K2 = c17945a0.m94929K2();
                AbstractC19074t.m100206d(m94929K2, "null cannot be cast to non-null type com.zing.zalo.data.chat.model.message.ChatRichContentPhoto");
                C18009w0 c18009w0 = (C18009w0) m94929K2;
                if (!TextUtils.isEmpty(c18009w0.f91013r) && !m151135p) {
                    arrayList.add(new C32175x6(4, c18009w0.f91013r));
                }
                if (!TextUtils.isEmpty(c18009w0.f91014s)) {
                    arrayList.add(new C32175x6(5, c18009w0.f91014s));
                }
            } else if (c17945a0.m94929K2() instanceof C17961f1) {
                C17969i0 m94929K22 = c17945a0.m94929K2();
                AbstractC19074t.m100206d(m94929K22, "null cannot be cast to non-null type com.zing.zalo.data.chat.model.message.ChatRichContentVideo");
                C17961f1 c17961f1 = (C17961f1) m94929K22;
                if (!TextUtils.isEmpty(c17961f1.f91013r) && !m151135p) {
                    arrayList.add(new C32175x6(4, c17961f1.f91013r));
                }
            } else if (c17945a0.m94929K2() instanceof C17981m0) {
                C17969i0 m94929K23 = c17945a0.m94929K2();
                AbstractC19074t.m100206d(m94929K23, "null cannot be cast to non-null type com.zing.zalo.data.chat.model.message.ChatRichContentDoodle");
                C17981m0 c17981m0 = (C17981m0) m94929K23;
                if (!TextUtils.isEmpty(c17981m0.f91013r) && !m151135p) {
                    arrayList.add(new C32175x6(4, c17981m0.f91013r));
                }
                if (!TextUtils.isEmpty(c17981m0.f91014s)) {
                    arrayList.add(new C32175x6(5, c17981m0.f91014s));
                }
            }
            AbstractC25376w.m131534w(arrayList, new Comparator() { // from class: x70.n0
                public /* synthetic */ C29437n0() {
                }

                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    int m146651H;
                    m146651H = C29428k0.c.m146651H(InterfaceC18509p.this, obj, obj2);
                    return m146651H;
                }
            });
            return arrayList;
        }

        /* renamed from: F */
        public final List m146688F(a aVar, boolean z11) {
            List m131502j;
            AbstractC19074t.m100208f(aVar, "photoEntity");
            if (aVar instanceof g) {
                return m146686D(((g) aVar).m146697p(), true);
            }
            if (aVar instanceof b) {
                return m146687E(((b) aVar).m146646p());
            }
            if (aVar instanceof f) {
                return m146648B(((f) aVar).m146696p().m75089k());
            }
            if (aVar instanceof i) {
                return m146653J((i) aVar, z11);
            }
            if (!(aVar instanceof j)) {
                m131502j = AbstractC25368s.m131502j();
                return m131502j;
            }
            return m146652I((j) aVar);
        }

        /* renamed from: s */
        public final void m146689s(String str, C23528a c23528a, a aVar, String str2, boolean z11, d dVar) {
            AbstractC19074t.m100208f(str, "currentUserUid");
            AbstractC19074t.m100208f(c23528a, "aQuery");
            AbstractC19074t.m100208f(aVar, "photoEntity");
            AbstractC19074t.m100208f(str2, "photoUrl");
            AbstractC19074t.m100208f(dVar, "listener");
            String m146683x = m146683x(aVar, str2);
            m146690v(c23528a, str2, m146683x, new C33049c(aVar, str2, str, dVar, z11, m146683x));
        }

        /* renamed from: v */
        public final void m146690v(C23528a c23528a, String str, String str2, e eVar) {
            AbstractC19074t.m100208f(c23528a, "aQuery");
            AbstractC19074t.m100208f(str, "path");
            AbstractC19074t.m100208f(str2, "pathOut");
            AbstractC19074t.m100208f(eVar, "listener");
            try {
                File file = new File(str2);
                if (AbstractC23258x2.m119958q(file.getPath())) {
                    eVar.mo97202b(file);
                } else {
                    file.delete();
                    c23528a.m123600e(str, file, new e(eVar, file));
                }
            } catch (Exception e11) {
                AbstractC20110a.f98889a.mo104552e(e11);
                eVar.mo97203c(C32103s4.f148000a);
            }
        }
    }

    /* renamed from: x70.k0$d */
    /* loaded from: classes6.dex */
    public interface d extends e {
        /* renamed from: a */
        boolean mo97204a();
    }

    /* renamed from: x70.k0$e */
    /* loaded from: classes6.dex */
    public interface e {
        /* renamed from: b */
        void mo97202b(File file);

        /* renamed from: c */
        void mo97203c(AbstractC32161w6 abstractC32161w6);
    }

    /* renamed from: x70.k0$f */
    /* loaded from: classes6.dex */
    public static final class f extends a {

        /* renamed from: a */
        private final C13380a f136038a;

        public f(C13380a c13380a) {
            AbstractC19074t.m100208f(c13380a, "storageUsageDetailItem");
            this.f136038a = c13380a;
        }

        @Override // x70.C29428k0.a
        /* renamed from: a */
        public String mo146631a() {
            C17945a0 m75089k = this.f136038a.m75089k();
            AbstractC19074t.m100205c(m75089k);
            String mo95039W2 = m75089k.mo95039W2();
            AbstractC19074t.m100207e(mo95039W2, "getOwnerId(...)");
            return mo95039W2;
        }

        @Override // x70.C29428k0.a
        /* renamed from: b */
        public long mo146632b() {
            C17945a0 m75089k = this.f136038a.m75089k();
            AbstractC19074t.m100205c(m75089k);
            return m75089k.m94974P4();
        }

        @Override // x70.C29428k0.a
        /* renamed from: c */
        public C32175x6 mo146633c() {
            return null;
        }

        @Override // x70.C29428k0.a
        /* renamed from: d */
        public String mo146634d() {
            return null;
        }

        @Override // x70.C29428k0.a
        /* renamed from: e */
        public String mo146635e() {
            C17945a0 m75089k = this.f136038a.m75089k();
            AbstractC19074t.m100205c(m75089k);
            String m94983Q3 = m75089k.m94983Q3();
            AbstractC19074t.m100207e(m94983Q3, "getLocalpath(...)");
            return m94983Q3;
        }

        @Override // x70.C29428k0.a
        /* renamed from: f */
        public C17945a0 mo146636f() {
            C17945a0 m75089k = this.f136038a.m75089k();
            AbstractC19074t.m100205c(m75089k);
            return m75089k;
        }

        @Override // x70.C29428k0.a
        /* renamed from: g */
        public MessageId mo146637g() {
            C17945a0 m75089k = this.f136038a.m75089k();
            AbstractC19074t.m100205c(m75089k);
            MessageId m95029V3 = m75089k.m95029V3();
            AbstractC19074t.m100207e(m95029V3, "getMessageId(...)");
            return m95029V3;
        }

        @Override // x70.C29428k0.a
        /* renamed from: h */
        public String mo146638h() {
            C17945a0 m75089k = this.f136038a.m75089k();
            AbstractC19074t.m100205c(m75089k);
            String m95090b5 = m75089k.m95090b5();
            AbstractC19074t.m100207e(m95090b5, "getUrl(...)");
            return m95090b5;
        }

        @Override // x70.C29428k0.a
        /* renamed from: i */
        public boolean mo146639i() {
            return false;
        }

        @Override // x70.C29428k0.a
        /* renamed from: j */
        public boolean mo146640j() {
            C17945a0 m75089k = this.f136038a.m75089k();
            AbstractC19074t.m100205c(m75089k);
            return m75089k.m94871D7();
        }

        @Override // x70.C29428k0.a
        /* renamed from: k */
        public boolean mo146641k() {
            C17945a0 m75089k = this.f136038a.m75089k();
            AbstractC19074t.m100205c(m75089k);
            return m75089k.m95022U7();
        }

        @Override // x70.C29428k0.a
        /* renamed from: l */
        public boolean mo146642l() {
            C17945a0 m75089k = this.f136038a.m75089k();
            AbstractC19074t.m100205c(m75089k);
            return m75089k.m95306y8();
        }

        @Override // x70.C29428k0.a
        /* renamed from: m */
        public void mo146643m(C32175x6 c32175x6) {
        }

        @Override // x70.C29428k0.a
        /* renamed from: n */
        public void mo146644n(String str) {
        }

        @Override // x70.C29428k0.a
        /* renamed from: o */
        public void mo146645o(String str) {
            AbstractC19074t.m100208f(str, "value");
        }

        /* renamed from: p */
        public final C13380a m146696p() {
            return this.f136038a;
        }
    }

    /* renamed from: x70.k0$g */
    /* loaded from: classes6.dex */
    public static final class g extends a {

        /* renamed from: a */
        private final MediaStoreItem f136039a;

        public g(MediaStoreItem mediaStoreItem) {
            AbstractC19074t.m100208f(mediaStoreItem, "mediaStoreItem");
            this.f136039a = mediaStoreItem;
        }

        @Override // x70.C29428k0.a
        /* renamed from: a */
        public String mo146631a() {
            String mo95039W2 = this.f136039a.m40599m().mo95039W2();
            AbstractC19074t.m100207e(mo95039W2, "getOwnerId(...)");
            return mo95039W2;
        }

        @Override // x70.C29428k0.a
        /* renamed from: b */
        public long mo146632b() {
            return this.f136039a.m40599m().m95313z4();
        }

        @Override // x70.C29428k0.a
        /* renamed from: c */
        public C32175x6 mo146633c() {
            return this.f136039a.m40601n();
        }

        @Override // x70.C29428k0.a
        /* renamed from: d */
        public String mo146634d() {
            return this.f136039a.m40603o();
        }

        @Override // x70.C29428k0.a
        /* renamed from: e */
        public String mo146635e() {
            String m94983Q3 = this.f136039a.m40599m().m94983Q3();
            AbstractC19074t.m100207e(m94983Q3, "getLocalpath(...)");
            return m94983Q3;
        }

        @Override // x70.C29428k0.a
        /* renamed from: f */
        public C17945a0 mo146636f() {
            return this.f136039a.m40599m();
        }

        @Override // x70.C29428k0.a
        /* renamed from: g */
        public MessageId mo146637g() {
            return this.f136039a.m40571M();
        }

        @Override // x70.C29428k0.a
        /* renamed from: h */
        public String mo146638h() {
            String m95090b5 = this.f136039a.m40599m().m95090b5();
            AbstractC19074t.m100207e(m95090b5, "getUrl(...)");
            return m95090b5;
        }

        @Override // x70.C29428k0.a
        /* renamed from: i */
        public boolean mo146639i() {
            return this.f136039a.m40599m().m94959N6();
        }

        @Override // x70.C29428k0.a
        /* renamed from: j */
        public boolean mo146640j() {
            return this.f136039a.m40594i0();
        }

        @Override // x70.C29428k0.a
        /* renamed from: k */
        public boolean mo146641k() {
            return this.f136039a.m40596j0();
        }

        @Override // x70.C29428k0.a
        /* renamed from: l */
        public boolean mo146642l() {
            return this.f136039a.m40602n0();
        }

        @Override // x70.C29428k0.a
        /* renamed from: m */
        public void mo146643m(C32175x6 c32175x6) {
            this.f136039a.m40608q0(c32175x6);
        }

        @Override // x70.C29428k0.a
        /* renamed from: n */
        public void mo146644n(String str) {
            this.f136039a.m40609r0(str);
        }

        @Override // x70.C29428k0.a
        /* renamed from: o */
        public void mo146645o(String str) {
            AbstractC19074t.m100208f(str, "value");
            this.f136039a.m40599m().m94934Ka(str);
        }

        /* renamed from: p */
        public final MediaStoreItem m146697p() {
            return this.f136039a;
        }
    }

    /* renamed from: x70.k0$h */
    /* loaded from: classes6.dex */
    public interface h {
        /* renamed from: a */
        void mo65107a(a aVar, C32175x6 c32175x6);

        /* renamed from: b */
        void mo65108b(a aVar, C32175x6 c32175x6);
    }

    /* renamed from: x70.k0$i */
    /* loaded from: classes6.dex */
    public static final class i extends a {

        /* renamed from: a */
        private final C17945a0 f136040a;

        public i(C17945a0 c17945a0) {
            AbstractC19074t.m100208f(c17945a0, "chatContent");
            this.f136040a = c17945a0;
        }

        @Override // x70.C29428k0.a
        /* renamed from: a */
        public String mo146631a() {
            String mo95039W2 = this.f136040a.mo95039W2();
            AbstractC19074t.m100207e(mo95039W2, "getOwnerId(...)");
            return mo95039W2;
        }

        @Override // x70.C29428k0.a
        /* renamed from: b */
        public long mo146632b() {
            return this.f136040a.m94974P4();
        }

        @Override // x70.C29428k0.a
        /* renamed from: c */
        public C32175x6 mo146633c() {
            return null;
        }

        @Override // x70.C29428k0.a
        /* renamed from: d */
        public String mo146634d() {
            return null;
        }

        @Override // x70.C29428k0.a
        /* renamed from: e */
        public String mo146635e() {
            String m94983Q3 = this.f136040a.m94983Q3();
            AbstractC19074t.m100207e(m94983Q3, "getLocalpath(...)");
            return m94983Q3;
        }

        @Override // x70.C29428k0.a
        /* renamed from: f */
        public C17945a0 mo146636f() {
            return this.f136040a;
        }

        @Override // x70.C29428k0.a
        /* renamed from: g */
        public MessageId mo146637g() {
            MessageId m95029V3 = this.f136040a.m95029V3();
            AbstractC19074t.m100207e(m95029V3, "getMessageId(...)");
            return m95029V3;
        }

        @Override // x70.C29428k0.a
        /* renamed from: h */
        public String mo146638h() {
            String m95090b5 = this.f136040a.m95090b5();
            AbstractC19074t.m100207e(m95090b5, "getUrl(...)");
            return m95090b5;
        }

        @Override // x70.C29428k0.a
        /* renamed from: i */
        public boolean mo146639i() {
            return this.f136040a.m94959N6();
        }

        @Override // x70.C29428k0.a
        /* renamed from: j */
        public boolean mo146640j() {
            return this.f136040a.m94871D7();
        }

        @Override // x70.C29428k0.a
        /* renamed from: k */
        public boolean mo146641k() {
            return this.f136040a.m95022U7();
        }

        @Override // x70.C29428k0.a
        /* renamed from: l */
        public boolean mo146642l() {
            return this.f136040a.m95306y8();
        }

        @Override // x70.C29428k0.a
        /* renamed from: m */
        public void mo146643m(C32175x6 c32175x6) {
        }

        @Override // x70.C29428k0.a
        /* renamed from: n */
        public void mo146644n(String str) {
        }

        @Override // x70.C29428k0.a
        /* renamed from: o */
        public void mo146645o(String str) {
            AbstractC19074t.m100208f(str, "value");
        }

        /* renamed from: p */
        public final C17945a0 m146698p() {
            return this.f136040a;
        }
    }

    /* renamed from: x70.k0$j */
    /* loaded from: classes6.dex */
    public static final class j extends a {

        /* renamed from: a */
        private final C25821b f136041a;

        public j(C25821b c25821b) {
            AbstractC19074t.m100208f(c25821b, "cloudMediaItem");
            this.f136041a = c25821b;
        }

        @Override // x70.C29428k0.a
        /* renamed from: a */
        public String mo146631a() {
            String mo95039W2 = mo146636f().mo95039W2();
            AbstractC19074t.m100207e(mo95039W2, "getOwnerId(...)");
            return mo95039W2;
        }

        @Override // x70.C29428k0.a
        /* renamed from: b */
        public long mo146632b() {
            return this.f136041a.m133150m();
        }

        @Override // x70.C29428k0.a
        /* renamed from: c */
        public C32175x6 mo146633c() {
            return null;
        }

        @Override // x70.C29428k0.a
        /* renamed from: d */
        public String mo146634d() {
            return null;
        }

        @Override // x70.C29428k0.a
        /* renamed from: e */
        public String mo146635e() {
            return "";
        }

        @Override // x70.C29428k0.a
        /* renamed from: f */
        public C17945a0 mo146636f() {
            C17945a0 m95365a = new C17945a0.w(this.f136041a.m133146i(), this.f136041a.m133147j()).m95365a();
            AbstractC19074t.m100207e(m95365a, "build(...)");
            return m95365a;
        }

        @Override // x70.C29428k0.a
        /* renamed from: g */
        public MessageId mo146637g() {
            MessageId m95029V3 = mo146636f().m95029V3();
            AbstractC19074t.m100207e(m95029V3, "getMessageId(...)");
            return m95029V3;
        }

        @Override // x70.C29428k0.a
        /* renamed from: h */
        public String mo146638h() {
            return "";
        }

        @Override // x70.C29428k0.a
        /* renamed from: i */
        public boolean mo146639i() {
            return false;
        }

        @Override // x70.C29428k0.a
        /* renamed from: j */
        public boolean mo146640j() {
            return AbstractC16893a.m90330g(this.f136041a);
        }

        @Override // x70.C29428k0.a
        /* renamed from: k */
        public boolean mo146641k() {
            return false;
        }

        @Override // x70.C29428k0.a
        /* renamed from: l */
        public boolean mo146642l() {
            return AbstractC16893a.m90331h(this.f136041a);
        }

        @Override // x70.C29428k0.a
        /* renamed from: m */
        public void mo146643m(C32175x6 c32175x6) {
        }

        @Override // x70.C29428k0.a
        /* renamed from: n */
        public void mo146644n(String str) {
        }

        @Override // x70.C29428k0.a
        /* renamed from: o */
        public void mo146645o(String str) {
            AbstractC19074t.m100208f(str, "value");
        }

        /* renamed from: p */
        public final C25821b m146699p() {
            return this.f136041a;
        }
    }

    /* renamed from: x70.k0$k */
    /* loaded from: classes6.dex */
    public static final class k implements InterfaceC24301d {

        /* renamed from: b */
        final /* synthetic */ C32175x6 f136043b;

        k(C32175x6 c32175x6) {
            this.f136043b = c32175x6;
        }

        @Override // p396ol.InterfaceC24301d
        /* renamed from: a */
        public void mo66919a(String str, long j11) {
            AbstractC19074t.m100208f(str, "downloadId");
        }

        @Override // p396ol.InterfaceC24301d
        /* renamed from: b */
        public boolean mo66920b() {
            return true;
        }

        @Override // p396ol.InterfaceC24301d
        /* renamed from: c */
        public EnumC24298a mo66921c() {
            if (C29428k0.this.m146582L()) {
                return EnumC24298a.f117299r;
            }
            return EnumC24298a.f117297p;
        }

        @Override // p396ol.InterfaceC24301d
        /* renamed from: d */
        public void mo66922d(String str, int i11, String str2) {
            AbstractC19074t.m100208f(str, ZMediaPlayer.OnNativeInvokeListener.ARG_URL);
            AbstractC19074t.m100208f(str2, "errorMessage");
        }

        @Override // p396ol.InterfaceC24301d
        /* renamed from: e */
        public void mo66923e(String str, String str2) {
            AbstractC19074t.m100208f(str, ZMediaPlayer.OnNativeInvokeListener.ARG_URL);
            AbstractC19074t.m100208f(str2, "path");
            if (AbstractC19074t.m100204b(C29428k0.this.m146621H().m89133b0(), str2) && !C29428k0.this.f136014p) {
                C29428k0.this.m146587R(this.f136043b);
            }
        }

        @Override // p396ol.InterfaceC24301d
        /* renamed from: h */
        public int mo66924h() {
            return InterfaceC24301d.a.m126884a(this);
        }
    }

    /* renamed from: x70.k0$l */
    /* loaded from: classes6.dex */
    public static final class l extends C22122a0.d {

        /* renamed from: c */
        final /* synthetic */ String f136044c;

        /* renamed from: d */
        final /* synthetic */ C29428k0 f136045d;

        /* renamed from: e */
        final /* synthetic */ C32175x6 f136046e;

        /* renamed from: f */
        final /* synthetic */ File f136047f;

        /* renamed from: g */
        final /* synthetic */ d f136048g;

        l(String str, C29428k0 c29428k0, C32175x6 c32175x6, File file, d dVar) {
            this.f136044c = str;
            this.f136045d = c29428k0;
            this.f136046e = c32175x6;
            this.f136047f = file;
            this.f136048g = dVar;
        }

        @Override // l80.C22122a0.d
        /* renamed from: h */
        public void mo43943h(String str, C22122a0 c22122a0, C3979l c3979l, C23995f c23995f, boolean z11) {
            Object obj;
            super.mo43943h(str, c22122a0, c3979l, c23995f, z11);
            if (c22122a0 != null) {
                obj = c22122a0.m89133b0();
            } else {
                obj = null;
            }
            if (AbstractC19074t.m100204b(obj, this.f136044c) && !this.f136045d.f136014p) {
                if (c3979l != null && c3979l.m18839c() != null && !c3979l.m18839c().isRecycled()) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("loadCachePhoto SUCCESS: photoUrl - ");
                    sb2.append(str);
                    this.f136045d.m146620G().setImageInfo(null, false);
                    this.f136045d.m146593X(this.f136046e);
                    return;
                }
                StringBuilder sb3 = new StringBuilder();
                sb3.append("loadCachePhoto FAILED: photoUrl - ");
                sb3.append(str);
                this.f136047f.delete();
                c cVar = C29428k0.Companion;
                boolean m146582L = this.f136045d.m146582L();
                String str2 = this.f136045d.f136005g;
                AbstractC19074t.m100207e(str2, "access$getCurrentUserUid$p(...)");
                cVar.m146680t(m146582L, str2, this.f136045d.m146622I(), this.f136048g);
            }
        }
    }

    /* renamed from: x70.k0$m */
    /* loaded from: classes6.dex */
    public static final class m implements d {

        /* renamed from: b */
        final /* synthetic */ String f136050b;

        /* renamed from: c */
        final /* synthetic */ C32175x6 f136051c;

        m(String str, C32175x6 c32175x6) {
            this.f136050b = str;
            this.f136051c = c32175x6;
        }

        /* renamed from: e */
        public static final void m146701e(C29428k0 c29428k0, String str, C32175x6 c32175x6, File file, m mVar) {
            AbstractC19074t.m100208f(c29428k0, "this$0");
            AbstractC19074t.m100208f(str, "$photoUrl");
            AbstractC19074t.m100208f(c32175x6, "$photoItem");
            AbstractC19074t.m100208f(file, "$result");
            AbstractC19074t.m100208f(mVar, "this$1");
            if (AbstractC19074t.m100204b(c29428k0.m146621H().m89133b0(), str) && !c29428k0.f136014p) {
                if (C29428k0.f135998q) {
                    int m155166a = c32175x6.m155166a();
                    MessageId mo146637g = c29428k0.m146622I().mo146637g();
                    String path = file.getPath();
                    C22122a0 m146621H = c29428k0.m146621H();
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("loadPhoto[FILE-DONE] quality: ");
                    sb2.append(m155166a);
                    sb2.append(", msgId: ");
                    sb2.append(mo146637g);
                    sb2.append(", photoUrl: ");
                    sb2.append(str);
                    sb2.append("\ndownloaded file path: ");
                    sb2.append(path);
                    sb2.append("\nimageModule: ");
                    sb2.append(m146621H);
                }
                a m146622I = c29428k0.m146622I();
                String path2 = file.getPath();
                AbstractC19074t.m100207e(path2, "getPath(...)");
                m146622I.mo146645o(path2);
                c29428k0.f136008j = 0;
                if (c32175x6.m155166a() == 8) {
                    c29428k0.m146583M(c32175x6, mVar);
                } else {
                    c29428k0.f136006h = C29428k0.Companion.m146688F(c29428k0.m146622I(), c29428k0.m146582L());
                    c29428k0.m146623O();
                }
            }
        }

        @Override // x70.C29428k0.d
        /* renamed from: a */
        public boolean mo97204a() {
            return !C29428k0.this.f136014p;
        }

        @Override // x70.C29428k0.e
        /* renamed from: b */
        public void mo97202b(File file) {
            AbstractC19074t.m100208f(file, "result");
            AbstractC19444a.m101697e(new Runnable() { // from class: x70.t0

                /* renamed from: q */
                public final /* synthetic */ String f136100q;

                /* renamed from: r */
                public final /* synthetic */ C32175x6 f136101r;

                /* renamed from: s */
                public final /* synthetic */ File f136102s;

                /* renamed from: t */
                public final /* synthetic */ C29428k0.m f136103t;

                public /* synthetic */ RunnableC29455t0(String str, C32175x6 c32175x6, File file2, C29428k0.m this) {
                    r2 = str;
                    r3 = c32175x6;
                    r4 = file2;
                    r5 = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    C29428k0.m.m146701e(C29428k0.this, r2, r3, r4, r5);
                }
            });
        }

        @Override // x70.C29428k0.e
        /* renamed from: c */
        public void mo97203c(AbstractC32161w6 abstractC32161w6) {
            AbstractC19074t.m100208f(abstractC32161w6, "errorCode");
            if (AbstractC19074t.m100204b(C29428k0.this.m146621H().m89133b0(), this.f136050b) && !C29428k0.this.f136014p) {
                if (C29428k0.f135998q) {
                    int m155166a = this.f136051c.m155166a();
                    MessageId mo146637g = C29428k0.this.m146622I().mo146637g();
                    String str = this.f136050b;
                    C22122a0 m146621H = C29428k0.this.m146621H();
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("loadPhoto[FILE-FAILED] quality: ");
                    sb2.append(m155166a);
                    sb2.append(", msgId: ");
                    sb2.append(mo146637g);
                    sb2.append(", photoUrl: ");
                    sb2.append(str);
                    sb2.append("\nerrorCode: ");
                    sb2.append(abstractC32161w6);
                    sb2.append("\nimageModule: ");
                    sb2.append(m146621H);
                }
                C29428k0.this.m146589T(this.f136051c, abstractC32161w6);
            }
        }
    }

    /* renamed from: x70.k0$n */
    /* loaded from: classes6.dex */
    public static final class n extends C22122a0.d {

        /* renamed from: d */
        final /* synthetic */ C32175x6 f136053d;

        /* renamed from: e */
        final /* synthetic */ String f136054e;

        n(C32175x6 c32175x6, String str) {
            this.f136053d = c32175x6;
            this.f136054e = str;
        }

        @Override // l80.C22122a0.d
        /* renamed from: h */
        public void mo43943h(String str, C22122a0 c22122a0, C3979l c3979l, C23995f c23995f, boolean z11) {
            AbstractC19074t.m100208f(str, ZMediaPlayer.OnNativeInvokeListener.ARG_URL);
            AbstractC19074t.m100208f(c22122a0, "imageModule");
            AbstractC19074t.m100208f(c23995f, "status");
            super.mo43943h(str, c22122a0, c3979l, c23995f, z11);
            if (AbstractC19074t.m100204b(c22122a0.m89133b0(), str) && !C29428k0.this.f136014p) {
                if (C29428k0.f135998q && c23995f.m125657h() != 200) {
                    int m155166a = this.f136053d.m155166a();
                    MessageId mo146637g = C29428k0.this.m146622I().mo146637g();
                    String str2 = this.f136054e;
                    int m125666q = c23995f.m125666q();
                    int m125657h = c23995f.m125657h();
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("loadPhoto[AQUERY-RESULT] quality: ");
                    sb2.append(m155166a);
                    sb2.append(", msgId: ");
                    sb2.append(mo146637g);
                    sb2.append(", photoUrl: ");
                    sb2.append(str2);
                    sb2.append("\nimageModule: ");
                    sb2.append(c22122a0);
                    sb2.append("\nstatus source: ");
                    sb2.append(m125666q);
                    sb2.append(", code: ");
                    sb2.append(m125657h);
                }
                if (c3979l != null && c3979l.m18839c() != null && !c3979l.m18839c().isRecycled()) {
                    C29428k0.this.m146620G().setImageInfo(c3979l, false);
                    C29428k0.this.m146593X(this.f136053d);
                    return;
                }
                AbstractC32161w6 abstractC32161w6 = C32103s4.f148000a;
                if (this.f136053d.m155166a() == 6 && (c23995f.m125658i() == 301 || c23995f.m125658i() == 302)) {
                    abstractC32161w6 = C32075q4.f147690a;
                } else if (c23995f.m125657h() == 404) {
                    abstractC32161w6 = C32032n4.f147496a;
                } else if (c23995f.m125657h() != 502 && c23995f.m125657h() != 504) {
                    if (c23995f.m125657h() == -101) {
                        abstractC32161w6 = C32061p4.f147625a;
                    }
                } else {
                    abstractC32161w6 = C32047o4.f147570a;
                }
                C29428k0.this.m146619y(this.f136054e);
                C29428k0.this.m146589T(this.f136053d, abstractC32161w6);
            }
        }
    }

    /* renamed from: x70.k0$o */
    /* loaded from: classes6.dex */
    public static final class o extends C22122a0.d {

        /* renamed from: d */
        final /* synthetic */ C32175x6 f136056d;

        /* renamed from: e */
        final /* synthetic */ File f136057e;

        o(C32175x6 c32175x6, File file) {
            this.f136056d = c32175x6;
            this.f136057e = file;
        }

        @Override // l80.C22122a0.d
        /* renamed from: h */
        public void mo43943h(String str, C22122a0 c22122a0, C3979l c3979l, C23995f c23995f, boolean z11) {
            super.mo43943h(str, c22122a0, c3979l, c23995f, z11);
            if (AbstractC19074t.m100204b(C29428k0.this.m146621H().m89133b0(), str) && !C29428k0.this.f136014p) {
                if (c3979l != null && c3979l.m18839c() != null && !c3979l.m18839c().isRecycled()) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("loadCachePhoto SUCCESS: photoUrl - ");
                    sb2.append(str);
                    C29428k0.this.m146620G().setImageInfo(c3979l, false);
                    C29428k0.this.m146593X(this.f136056d);
                    return;
                }
                StringBuilder sb3 = new StringBuilder();
                sb3.append("loadCachePhoto FAILED: photoUrl - ");
                sb3.append(str);
                try {
                    this.f136057e.delete();
                } catch (Exception e11) {
                    AbstractC23350e.m122778h(e11);
                }
                C29428k0 c29428k0 = C29428k0.this;
                a m146622I = c29428k0.m146622I();
                AbstractC19074t.m100206d(m146622I, "null cannot be cast to non-null type com.zing.zalo.ui.mediastore.MediaStorePhotoLoader.ZCloudItemEntity");
                c29428k0.m146574A((j) m146622I, this.f136056d);
                return;
            }
            StringBuilder sb4 = new StringBuilder();
            sb4.append("loadCachePhoto invalid condition: photoUrl - ");
            sb4.append(str);
        }
    }

    /* renamed from: x70.k0$p */
    /* loaded from: classes6.dex */
    public static final class p implements d {

        /* renamed from: b */
        final /* synthetic */ String f136059b;

        p(String str) {
            this.f136059b = str;
        }

        @Override // x70.C29428k0.d
        /* renamed from: a */
        public boolean mo97204a() {
            return false;
        }

        @Override // x70.C29428k0.e
        /* renamed from: b */
        public void mo97202b(File file) {
            AbstractC19074t.m100208f(file, "result");
            if (C29428k0.f135998q) {
                MessageId mo146637g = C29428k0.this.m146622I().mo146637g();
                String str = this.f136059b;
                String path = file.getPath();
                StringBuilder sb2 = new StringBuilder();
                sb2.append("loadFullPhotoSilently[DONE] msgId: ");
                sb2.append(mo146637g);
                sb2.append(", photoUrl: ");
                sb2.append(str);
                sb2.append("\ndownloaded file path: ");
                sb2.append(path);
            }
        }

        @Override // x70.C29428k0.e
        /* renamed from: c */
        public void mo97203c(AbstractC32161w6 abstractC32161w6) {
            AbstractC19074t.m100208f(abstractC32161w6, "errorCode");
            if (AbstractC19074t.m100204b(C29428k0.this.m146621H().m89133b0(), this.f136059b) && !C29428k0.this.f136014p && C29428k0.f135998q) {
                MessageId mo146637g = C29428k0.this.m146622I().mo146637g();
                String str = this.f136059b;
                StringBuilder sb2 = new StringBuilder();
                sb2.append("loadFullPhotoSilently[FAILED] msgId: ");
                sb2.append(mo146637g);
                sb2.append(", photoUrl: ");
                sb2.append(str);
                sb2.append("\nerrorCode: ");
                sb2.append(abstractC32161w6);
            }
        }
    }

    public C29428k0(int i11, Context context, C23528a c23528a, C22122a0 c22122a0, RecyclingImageView recyclingImageView, a aVar) {
        AbstractC19074t.m100208f(context, "context");
        AbstractC19074t.m100208f(c23528a, "aQuery");
        AbstractC19074t.m100208f(c22122a0, "imageModule");
        AbstractC19074t.m100208f(recyclingImageView, "dumbThumbImageView");
        AbstractC19074t.m100208f(aVar, "photoEntity");
        this.f135999a = i11;
        this.f136000b = context;
        this.f136001c = c23528a;
        this.f136002d = c22122a0;
        this.f136003e = recyclingImageView;
        this.f136004f = aVar;
        this.f136005g = CoreUtility.f89233i;
        c cVar = Companion;
        this.f136006h = cVar.m146688F(aVar, m146582L());
        this.f136007i = c.m146647A(cVar, this.f136004f, false, 2, null);
        Drawable m118665N = AbstractC23136l9.m118665N(context, AbstractC16803z.chat_icloud_default);
        this.f136009k = m118665N != null ? m118665N.mutate() : null;
        this.f136012n = -1;
    }

    /* renamed from: A */
    public final void m146574A(j jVar, C32175x6 c32175x6) {
        C24302e.Companion.m126919j().m126908q(jVar.m146699p(), new k(c32175x6));
    }

    /* renamed from: B */
    private final C32175x6 m146575B(int i11) {
        for (C32175x6 c32175x6 : this.f136006h) {
            if (c32175x6.m155166a() > i11) {
                return c32175x6;
            }
        }
        return null;
    }

    /* renamed from: C */
    private final C32175x6 m146576C(int i11) {
        for (C32175x6 c32175x6 : this.f136006h) {
            if (c32175x6.m155166a() == i11) {
                return c32175x6;
            }
        }
        return null;
    }

    /* renamed from: D */
    private final void m146577D(C32175x6 c32175x6, String str) {
        String m41044h = this.f136004f.mo146637g().m41044h();
        Bitmap m146703b = C29448r.f136087a.m146703b(m41044h);
        if (m146703b == null || m146703b.isRecycled()) {
            AbstractC0837p0.Companion.m2236a().mo2040a(new Runnable() { // from class: x70.c0

                /* renamed from: q */
                public final /* synthetic */ String f135954q;

                /* renamed from: r */
                public final /* synthetic */ String f135955r;

                /* renamed from: s */
                public final /* synthetic */ C32175x6 f135956s;

                public /* synthetic */ RunnableC29404c0(String str2, String m41044h2, C32175x6 c32175x62) {
                    r2 = str2;
                    r3 = m41044h2;
                    r4 = c32175x62;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    C29428k0.m146578E(C29428k0.this, r2, r3, r4);
                }
            });
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ProcessVariables
        jadx.core.utils.exceptions.JadxRuntimeException: Method arg registers not loaded: x70.f0.<init>(java.lang.String, android.graphics.Bitmap, x70.k0, zh.x6):void, class status: GENERATED_AND_UNLOADED
        	at jadx.core.dex.nodes.MethodNode.getArgRegs(MethodNode.java:289)
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables$1.isArgUnused(ProcessVariables.java:146)
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables$1.lambda$isVarUnused$0(ProcessVariables.java:131)
        	at jadx.core.utils.ListUtils.allMatch(ListUtils.java:172)
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables$1.isVarUnused(ProcessVariables.java:131)
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables$1.processBlock(ProcessVariables.java:82)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:64)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:19)
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables.removeUnusedResults(ProcessVariables.java:73)
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables.visit(ProcessVariables.java:48)
        */
    /* renamed from: E */
    public static final void m146578E(x70.C29428k0 r2, java.lang.String r3, java.lang.String r4, p716zh.C32175x6 r5) {
        /*
            java.lang.String r0 = "this$0"
            fn0.AbstractC19074t.m100208f(r2, r0)
            java.lang.String r0 = "$lqipThumbString"
            fn0.AbstractC19074t.m100208f(r3, r0)
            java.lang.String r0 = "$key"
            fn0.AbstractC19074t.m100208f(r4, r0)
            java.lang.String r0 = "$photoItem"
            fn0.AbstractC19074t.m100208f(r5, r0)
            int r0 = r2.f136008j     // Catch: java.lang.Exception -> L4c
            r1 = 1
            if (r0 <= r1) goto L1a
            return
        L1a:
            byte[] r3 = me0.AbstractC23244v8.m119741e(r3)     // Catch: java.lang.Exception -> L4c
            if (r3 == 0) goto L4e
            int r0 = r3.length     // Catch: java.lang.Exception -> L4c
            if (r0 != 0) goto L24
            goto L4e
        L24:
            me0.o4 r0 = me0.C23164o4.m119328j()     // Catch: java.lang.Exception -> L4c
            android.graphics.Bitmap r3 = r0.m119330f(r3)     // Catch: java.lang.Exception -> L4c
            if (r3 == 0) goto L54
            android.renderscript.RenderScript r0 = ru.C25978a.m133807a()     // Catch: java.lang.Exception -> L4c
            au.p r0 = au.C2365p.m12377i(r0)     // Catch: java.lang.Exception -> L4c
            r1 = 1128792064(0x43480000, float:200.0)
            au.p r0 = r0.m12382h(r1)     // Catch: java.lang.Exception -> L4c
            android.graphics.Bitmap r0 = r0.m12381f(r3)     // Catch: java.lang.Exception -> L4c
            r3.recycle()     // Catch: java.lang.Exception -> L4c
            x70.f0 r3 = new x70.f0     // Catch: java.lang.Exception -> L4c
            r3.<init>()     // Catch: java.lang.Exception -> L4c
            gg0.AbstractC19444a.m101697e(r3)     // Catch: java.lang.Exception -> L4c
            goto L54
        L4c:
            r2 = move-exception
            goto L4f
        L4e:
            return
        L4f:
            ho0.a$a r3 = ho0.AbstractC20110a.f98889a
            r3.mo104552e(r2)
        L54:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: x70.C29428k0.m146578E(x70.k0, java.lang.String, java.lang.String, zh.x6):void");
    }

    /* renamed from: F */
    public static final void m146579F(String str, Bitmap bitmap, C29428k0 c29428k0, C32175x6 c32175x6) {
        AbstractC19074t.m100208f(str, "$key");
        AbstractC19074t.m100208f(c29428k0, "this$0");
        AbstractC19074t.m100208f(c32175x6, "$photoItem");
        C29448r c29448r = C29448r.f136087a;
        AbstractC19074t.m100205c(bitmap);
        c29448r.m146704c(str, bitmap);
        c29428k0.m146588S(c32175x6, bitmap);
    }

    /* renamed from: J */
    private final int m146580J(int i11) {
        if (i11 == 2) {
            return 26000;
        }
        if (i11 == 3) {
            return 26003;
        }
        if (i11 != 4) {
            return i11 != 5 ? 0 : 26006;
        }
        return 26008;
    }

    /* renamed from: K */
    private final boolean m146581K() {
        for (C32175x6 c32175x6 : this.f136006h) {
            if (c32175x6.m155166a() > 1 && C23999j.m125696L2(c32175x6.m155168c(), this.f136010l)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: L */
    public final boolean m146582L() {
        return this.f135999a == 1;
    }

    /* renamed from: M */
    public final void m146583M(C32175x6 c32175x6, d dVar) {
        String m155168c = c32175x6.m155168c();
        this.f136002d.m89129Y0(m155168c);
        File m126917f = C24302e.Companion.m126917f(this.f136004f.mo146636f());
        String path = m126917f.getPath();
        StringBuilder sb2 = new StringBuilder();
        sb2.append("loadCachePhoto: photoUrl - ");
        sb2.append(path);
        this.f136002d.m115381O1(this.f136001c, path, this.f136010l, new l(m155168c, this, c32175x6, m126917f, dVar).m115397c(new C20518d()));
    }

    /* renamed from: N */
    private final void m146584N(C32175x6 c32175x6) {
        Bitmap m146703b = C29448r.f136087a.m146703b(this.f136004f.mo146637g().m41044h());
        if (m146703b != null && !m146703b.isRecycled()) {
            m146588S(c32175x6, m146703b);
            return;
        }
        if (!m146581K()) {
            m146577D(c32175x6, c32175x6.m155168c());
        }
        C24003n c24003n = this.f136010l;
        if (c24003n != null) {
            c24003n.f116261b = this.f136009k;
        }
        this.f136002d.mo111925v1(this.f136009k);
        this.f136004f.mo146643m(null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x008c, code lost:            if (r0 != false) goto L83;     */
    /* renamed from: P */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void m146585P(C32175x6 c32175x6) {
        boolean m127120J;
        boolean m127120J2;
        this.f136003e.setImageDrawable(AbstractC23170p.m119358p(this.f136000b));
        Bitmap m146703b = C29448r.f136087a.m146703b(this.f136004f.mo146637g().m41044h());
        if (m146703b != null && !m146703b.isRecycled()) {
            C24003n c24003n = this.f136010l;
            if (c24003n != null) {
                c24003n.f116261b = new BitmapDrawable(this.f136000b.getResources(), m146703b);
            }
            this.f136003e.setImageBitmap(m146703b);
        } else {
            C24003n c24003n2 = this.f136010l;
            if (c24003n2 != null) {
                c24003n2.f116261b = this.f136009k;
            }
        }
        String m155168c = c32175x6.m155168c();
        m mVar = new m(m155168c, c32175x6);
        a aVar = this.f136004f;
        if (aVar instanceof j) {
            m146587R(c32175x6);
            return;
        }
        if (aVar instanceof i) {
            if (c32175x6.m155166a() == 8) {
                m146583M(c32175x6, mVar);
                return;
            } else {
                m146586Q(c32175x6);
                return;
            }
        }
        if (aVar.mo146640j() && c32175x6.m155166a() == 5) {
            m127120J = AbstractC24341v.m127120J(m155168c, "http://", false, 2, null);
            if (!m127120J) {
                m127120J2 = AbstractC24341v.m127120J(m155168c, "https://", false, 2, null);
            }
            this.f136002d.m89129Y0(m155168c);
            if (f135998q) {
                int m155166a = c32175x6.m155166a();
                MessageId mo146637g = this.f136004f.mo146637g();
                C22122a0 c22122a0 = this.f136002d;
                StringBuilder sb2 = new StringBuilder();
                sb2.append("loadPhoto[FILE-START] quality: ");
                sb2.append(m155166a);
                sb2.append(", msgId: ");
                sb2.append(mo146637g);
                sb2.append(", photoUrl: ");
                sb2.append(m155168c);
                sb2.append("\nimageModule: ");
                sb2.append(c22122a0);
            }
            if (AbstractC31111g.m151135p(this.f136004f.mo146636f()) && !AbstractC23306f.m120691m2().m2466q()) {
                if (f135998q) {
                    int m155166a2 = c32175x6.m155166a();
                    MessageId mo146637g2 = this.f136004f.mo146637g();
                    C22122a0 c22122a02 = this.f136002d;
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append("loadPhoto[FILE-FAILED QUICK_ROLL_DETECTION] quality: ");
                    sb3.append(m155166a2);
                    sb3.append(", msgId: ");
                    sb3.append(mo146637g2);
                    sb3.append(", photoUrl: ");
                    sb3.append(m155168c);
                    sb3.append("\nimageModule: ");
                    sb3.append(c22122a02);
                }
                c cVar = Companion;
                String str = this.f136005g;
                AbstractC19074t.m100207e(str, "currentUserUid");
                cVar.m146678q(str, this.f136004f, mVar);
                return;
            }
            c cVar2 = Companion;
            String str2 = this.f136005g;
            AbstractC19074t.m100207e(str2, "currentUserUid");
            cVar2.m146689s(str2, this.f136001c, this.f136004f, m155168c, false, mVar);
            return;
        }
        m146586Q(c32175x6);
    }

    /* renamed from: Q */
    private final void m146586Q(C32175x6 c32175x6) {
        C20518d c20518d;
        String m155168c = c32175x6.m155168c();
        this.f136002d.m89129Y0(m155168c);
        boolean m125696L2 = C23999j.m125696L2(m155168c, this.f136010l);
        if (f135998q) {
            int m155166a = c32175x6.m155166a();
            MessageId mo146637g = this.f136004f.mo146637g();
            C22122a0 c22122a0 = this.f136002d;
            StringBuilder sb2 = new StringBuilder();
            sb2.append("loadPhoto[AQUERY-START] quality: ");
            sb2.append(m155166a);
            sb2.append(", msgId: ");
            sb2.append(mo146637g);
            sb2.append(", photoUrl: ");
            sb2.append(m155168c);
            sb2.append("\nhasMemCached: ");
            sb2.append(m125696L2);
            sb2.append("\nimageModule: ");
            sb2.append(c22122a0);
        }
        if (!this.f136011m || m125696L2) {
            C32175x6 mo146633c = this.f136004f.mo146633c();
            if (this.f136008j < c32175x6.m155166a() || this.f136002d.m115373D1() == null || mo146633c == null || mo146633c.m155166a() < c32175x6.m155166a()) {
                if (!m125696L2 && TextUtils.isEmpty(this.f136004f.mo146634d()) && this.f136002d.m115373D1() == null) {
                    c20518d = new C20518d();
                } else {
                    c20518d = null;
                }
                this.f136002d.m115382P1(this.f136001c, m155168c, this.f136010l, new n(c32175x6, m155168c).m115397c(c20518d), m146580J(this.f136012n));
            }
        }
    }

    /* renamed from: R */
    public final void m146587R(C32175x6 c32175x6) {
        String m155168c = c32175x6.m155168c();
        this.f136002d.m89129Y0(m155168c);
        File file = new File(m155168c);
        StringBuilder sb2 = new StringBuilder();
        sb2.append("loadZCloudMediaPhoto: photoUrl - ");
        sb2.append(m155168c);
        this.f136002d.m115381O1(this.f136001c, m155168c, this.f136010l, new o(c32175x6, file).m115397c(new C20518d()));
    }

    /* renamed from: S */
    private final void m146588S(C32175x6 c32175x6, Bitmap bitmap) {
        if (!this.f136014p && this.f136008j <= 1) {
            C24003n c24003n = this.f136010l;
            if (c24003n != null) {
                c24003n.f116261b = new BitmapDrawable(this.f136000b.getResources(), bitmap);
            }
            this.f136002d.m115385S1(bitmap, false);
            this.f136008j = 1;
            this.f136004f.mo146643m(c32175x6);
        }
    }

    /* renamed from: T */
    public final void m146589T(C32175x6 c32175x6, AbstractC32161w6 abstractC32161w6) {
        if (f135998q) {
            int m155166a = c32175x6.m155166a();
            MessageId mo146637g = this.f136004f.mo146637g();
            String m155168c = c32175x6.m155168c();
            StringBuilder sb2 = new StringBuilder();
            sb2.append("onPhotoLoadFailed quality: ");
            sb2.append(m155166a);
            sb2.append(", msgId: ");
            sb2.append(mo146637g);
            sb2.append(", photoUrl: ");
            sb2.append(m155168c);
            sb2.append("\nerrorCode: ");
            sb2.append(abstractC32161w6);
        }
        if (this.f136014p) {
            return;
        }
        if (abstractC32161w6.mo154486a() && AbstractC23306f.m120579F1().mo124314i() - this.f136004f.mo146632b() < 86400000 && c32175x6.m155167b() < 3) {
            c32175x6.m155169d(c32175x6.m155167b() + 1);
            AbstractC17930e.Companion.m94550a().mo94531e(new Runnable() { // from class: x70.g0

                /* renamed from: q */
                public final /* synthetic */ C32175x6 f135979q;

                public /* synthetic */ RunnableC29416g0(C32175x6 c32175x62) {
                    r2 = c32175x62;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    C29428k0.m146590U(C29428k0.this, r2);
                }
            }, AbstractC23160o0.m119261j0(c32175x62.m155167b(), 2000L));
            return;
        }
        C32175x6 m146575B = m146575B(c32175x62.m155166a());
        StringBuilder sb3 = new StringBuilder();
        sb3.append("onPhotoLoadFailed - nextPhotoItem = ");
        sb3.append(m146575B);
        if (m146575B != null) {
            m146585P(m146575B);
            return;
        }
        if (!this.f136004f.mo146642l()) {
            c cVar = Companion;
            if (cVar.m146677p(this.f136004f, c32175x62, abstractC32161w6)) {
                String str = this.f136005g;
                AbstractC19074t.m100207e(str, "currentUserUid");
                cVar.m146659P(str, this.f136004f, true);
            }
        }
        AbstractC19444a.m101697e(new Runnable() { // from class: x70.h0

            /* renamed from: q */
            public final /* synthetic */ C32175x6 f135983q;

            public /* synthetic */ RunnableC29419h0(C32175x6 c32175x62) {
                r2 = c32175x62;
            }

            @Override // java.lang.Runnable
            public final void run() {
                C29428k0.m146592W(C29428k0.this, r2);
            }
        });
        if (this.f136004f.mo146642l()) {
            if (c32175x62.m155166a() == 3 || c32175x62.m155166a() == 4) {
                m146616v();
            }
        }
    }

    /* renamed from: U */
    public static final void m146590U(C29428k0 c29428k0, C32175x6 c32175x6) {
        AbstractC19074t.m100208f(c29428k0, "this$0");
        AbstractC19074t.m100208f(c32175x6, "$photoItem");
        AbstractC19444a.m101697e(new Runnable() { // from class: x70.j0

            /* renamed from: q */
            public final /* synthetic */ C32175x6 f135994q;

            public /* synthetic */ RunnableC29425j0(C32175x6 c32175x62) {
                r2 = c32175x62;
            }

            @Override // java.lang.Runnable
            public final void run() {
                C29428k0.m146591V(C29428k0.this, r2);
            }
        });
    }

    /* renamed from: V */
    public static final void m146591V(C29428k0 c29428k0, C32175x6 c32175x6) {
        AbstractC19074t.m100208f(c29428k0, "this$0");
        AbstractC19074t.m100208f(c32175x6, "$photoItem");
        if (c29428k0.f136014p) {
            return;
        }
        c29428k0.m146585P(c32175x6);
    }

    /* renamed from: W */
    public static final void m146592W(C29428k0 c29428k0, C32175x6 c32175x6) {
        AbstractC19074t.m100208f(c29428k0, "this$0");
        AbstractC19074t.m100208f(c32175x6, "$photoItem");
        if (c29428k0.f136014p) {
            return;
        }
        if (c29428k0.f136008j < 1) {
            c29428k0.f136002d.mo111925v1(c29428k0.f136009k);
            c29428k0.f136004f.mo146643m(null);
        }
        h hVar = c29428k0.f136013o;
        if (hVar != null) {
            hVar.mo65108b(c29428k0.f136004f, c32175x6);
        }
    }

    /* renamed from: X */
    public final void m146593X(C32175x6 c32175x6) {
        c32175x6.m155169d(0);
        this.f136008j = c32175x6.m155166a();
        this.f136004f.mo146644n(c32175x6.m155168c());
        this.f136004f.mo146643m(c32175x6);
        a aVar = this.f136004f;
        if ((aVar instanceof g) && aVar.mo146640j() && c32175x6.m155166a() == 5) {
            C3531z.f14843a.m17893e(((g) aVar).m146697p(), c32175x6.m155168c());
        }
        AbstractC19444a.m101697e(new Runnable() { // from class: x70.i0

            /* renamed from: q */
            public final /* synthetic */ C29428k0.a f135987q;

            /* renamed from: r */
            public final /* synthetic */ C32175x6 f135988r;

            public /* synthetic */ RunnableC29422i0(C29428k0.a aVar2, C32175x6 c32175x62) {
                r2 = aVar2;
                r3 = c32175x62;
            }

            @Override // java.lang.Runnable
            public final void run() {
                C29428k0.m146594Y(C29428k0.this, r2, r3);
            }
        });
        if (m146582L()) {
            m146600e0();
        }
        if (aVar2.mo146642l()) {
            if (c32175x62.m155166a() == 3 || c32175x62.m155166a() == 4) {
                m146616v();
            }
        }
    }

    /* renamed from: Y */
    public static final void m146594Y(C29428k0 c29428k0, a aVar, C32175x6 c32175x6) {
        h hVar;
        AbstractC19074t.m100208f(c29428k0, "this$0");
        AbstractC19074t.m100208f(aVar, "$photoEntity");
        AbstractC19074t.m100208f(c32175x6, "$photoItem");
        if (!c29428k0.f136014p && (hVar = c29428k0.f136013o) != null) {
            hVar.mo65107a(aVar, c32175x6);
        }
    }

    /* renamed from: e0 */
    private final void m146600e0() {
        boolean m127120J;
        boolean m127120J2;
        C31973j5 m4472f;
        if (!this.f136004f.mo146639i() && !this.f136004f.mo146642l() && !TextUtils.isEmpty(this.f136004f.mo146631a()) && TextUtils.isEmpty(this.f136004f.mo146635e()) && this.f136008j < 5 && !AbstractC31111g.m151135p(this.f136004f.mo146636f())) {
            C21216s.a aVar = C21216s.Companion;
            C24759a m109886m0 = ((C21216s) aVar.m122672a()).m109886m0();
            if (((C21216s) aVar.m122672a()).m109865S0()) {
                if (!AbstractC25495a.m132079d(this.f136004f.mo146631a()) || ((m4472f = C0943w.f3447a.m4472f(this.f136004f.mo146631a())) != null && m4472f.m153732O() <= m109886m0.m128643e())) {
                    MessageId mo146637g = this.f136004f.mo146637g();
                    c cVar = Companion;
                    C17945a0 m146682w = cVar.m146682w(mo146637g);
                    if (m146682w != null && m146682w.m95142g6()) {
                        return;
                    }
                    String mo146638h = this.f136004f.mo146638h();
                    if (!TextUtils.isEmpty(mo146638h)) {
                        m127120J = AbstractC24341v.m127120J(mo146638h, "http://", false, 2, null);
                        if (!m127120J) {
                            m127120J2 = AbstractC24341v.m127120J(mo146638h, "https://", false, 2, null);
                            if (!m127120J2) {
                                return;
                            }
                        }
                        String str = this.f136005g;
                        AbstractC19074t.m100207e(str, "currentUserUid");
                        cVar.m146689s(str, this.f136001c, this.f136004f, mo146638h, true, new p(mo146638h));
                    }
                }
            }
        }
    }

    /* renamed from: v */
    private final void m146616v() {
        if (!this.f136004f.mo146642l()) {
            return;
        }
        C19059j0 c19059j0 = new C19059j0();
        c19059j0.f94941p = "";
        a aVar = this.f136004f;
        if (aVar instanceof g) {
            g gVar = (g) aVar;
            String m94983Q3 = gVar.m146697p().m40599m().m94983Q3();
            AbstractC19074t.m100207e(m94983Q3, "getLocalpath(...)");
            c19059j0.f94941p = m94983Q3;
            if (m94983Q3.length() == 0) {
                c19059j0.f94941p = gVar.m146697p().m40576T();
            }
        } else if (aVar instanceof b) {
            String m102945X0 = AbstractC19646n0.m102945X0(((b) aVar).m146646p());
            AbstractC19074t.m100207e(m102945X0, "getVideoUrl(...)");
            c19059j0.f94941p = m102945X0;
        }
        if (((CharSequence) c19059j0.f94941p).length() == 0) {
            return;
        }
        ZMediaHandlerThread.getInstance().execute(new Runnable() { // from class: x70.d0

            /* renamed from: q */
            public final /* synthetic */ C19059j0 f135962q;

            /* renamed from: r */
            public final /* synthetic */ C29428k0 f135963r;

            public /* synthetic */ RunnableC29407d0(C19059j0 c19059j02, C29428k0 this) {
                r2 = c19059j02;
                r3 = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                C29428k0.m146617w(C29428k0.a.this, r2, r3);
            }
        });
    }

    /* renamed from: w */
    public static final void m146617w(a aVar, C19059j0 c19059j0, C29428k0 c29428k0) {
        AbstractC19074t.m100208f(aVar, "$photoEntity");
        AbstractC19074t.m100208f(c19059j0, "$videoUrl");
        AbstractC19074t.m100208f(c29428k0, "this$0");
        if (!AbstractC31111g.m151135p(aVar.mo146636f())) {
            return;
        }
        C20556f c20556f = new C20556f((String) c19059j0.f94941p);
        if (c20556f.m106830b() && c20556f.m106845r() > 0) {
            return;
        }
        int cacheValidate = ZMediaPlayer.cacheValidate(ZMediaPlayerSettings.getCacheDir(0), (String) c19059j0.f94941p);
        AbstractC23350e.m122772b("RolledVideo msgId:" + aVar.mo146637g() + ", videoUrl:" + c19059j0.f94941p + "\nstatus:" + cacheValidate, new Object[0]);
        if (cacheValidate == -1) {
            AbstractC23350e.m122772b("RolledVideo SET VIDEO ROLLED, msgId:" + aVar.mo146637g(), new Object[0]);
            c cVar = Companion;
            boolean m146677p = cVar.m146677p(aVar, null, C32032n4.f147496a);
            String str = c29428k0.f136005g;
            AbstractC19074t.m100207e(str, "currentUserUid");
            cVar.m146659P(str, aVar, m146677p);
            AbstractC19444a.m101697e(new Runnable() { // from class: x70.e0

                /* renamed from: q */
                public final /* synthetic */ C29428k0.a f135968q;

                public /* synthetic */ RunnableC29410e0(C29428k0.a aVar2) {
                    r2 = aVar2;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    C29428k0.m146618x(C29428k0.this, r2);
                }
            });
        }
    }

    /* renamed from: x */
    public static final void m146618x(C29428k0 c29428k0, a aVar) {
        AbstractC19074t.m100208f(c29428k0, "this$0");
        AbstractC19074t.m100208f(aVar, "$photoEntity");
        if (c29428k0.f136014p) {
            return;
        }
        c29428k0.f136002d.mo111925v1(c29428k0.f136009k);
        aVar.mo146643m(null);
        h hVar = c29428k0.f136013o;
        if (hVar != null) {
            hVar.mo65108b(aVar, null);
        }
    }

    /* renamed from: y */
    public final boolean m146619y(String str) {
        try {
            AbstractC3972e.m18808u(AbstractC3972e.m18806s(MainApplication.Companion.m35500c()), str).delete();
            return true;
        } catch (Exception e11) {
            AbstractC23350e.m122776f("MSPhotoLoader", e11);
            return false;
        }
    }

    /* renamed from: G */
    public final RecyclingImageView m146620G() {
        return this.f136003e;
    }

    /* renamed from: H */
    public final C22122a0 m146621H() {
        return this.f136002d;
    }

    /* renamed from: I */
    public final a m146622I() {
        return this.f136004f;
    }

    /* renamed from: O */
    public final void m146623O() {
        Object m131206f0;
        if (this.f136004f.mo146641k()) {
            return;
        }
        if (!this.f136006h.isEmpty()) {
            m131206f0 = AbstractC25332a0.m131206f0(this.f136006h);
            C32175x6 c32175x6 = (C32175x6) m131206f0;
            if (c32175x6 != null && c32175x6.m155166a() == 1) {
                try {
                    this.f136010l = Companion.m146684y(this.f136004f);
                    m146584N((C32175x6) this.f136006h.get(0));
                } catch (Exception e11) {
                    AbstractC23350e.m122776f("MSPhotoLoader", e11);
                }
            }
            int i11 = this.f136008j;
            if (i11 != 0 && i11 != 1) {
                C32175x6 m146576C = m146576C(i11);
                if (m146576C != null) {
                    m146585P(m146576C);
                    return;
                } else {
                    this.f136008j = 0;
                    m146623O();
                    return;
                }
            }
            this.f136002d.mo111925v1(this.f136009k);
            this.f136010l = Companion.m146684y(this.f136004f);
            if (((C32175x6) this.f136006h.get(0)).m155166a() == 1) {
                m146584N((C32175x6) this.f136006h.get(0));
                if (this.f136006h.size() > 1) {
                    m146585P((C32175x6) this.f136006h.get(1));
                    return;
                }
                return;
            }
            m146585P((C32175x6) this.f136006h.get(0));
            return;
        }
        this.f136002d.mo111925v1(this.f136009k);
        if (this.f136004f.mo146642l()) {
            m146616v();
        }
    }

    /* renamed from: Z */
    public final void m146624Z(Drawable drawable) {
        this.f136009k = drawable;
    }

    /* renamed from: a0 */
    public final void m146625a0(boolean z11) {
        this.f136011m = z11;
    }

    /* renamed from: b0 */
    public final void m146626b0(a aVar) {
        AbstractC19074t.m100208f(aVar, "photoEntity");
        c cVar = Companion;
        String m146647A = c.m146647A(cVar, aVar, false, 2, null);
        if (AbstractC19074t.m100204b(this.f136004f, aVar) && AbstractC19074t.m100204b(this.f136007i, m146647A)) {
            return;
        }
        if (!AbstractC19074t.m100204b(this.f136004f.mo146637g(), aVar.mo146637g())) {
            this.f136008j = 0;
            this.f136002d.mo111924u1(null);
            this.f136002d.m89129Y0(null);
            this.f136003e.setImageInfo(null);
            aVar.mo146643m(null);
        }
        this.f136004f = aVar;
        this.f136007i = m146647A;
        this.f136006h = cVar.m146688F(aVar, m146582L());
    }

    /* renamed from: c0 */
    public final void m146627c0(h hVar) {
        this.f136013o = hVar;
    }

    /* renamed from: d0 */
    public final void m146628d0(int i11) {
        this.f136012n = i11;
    }

    /* renamed from: u */
    public final void m146629u() {
        this.f136002d.m115371B1();
    }

    /* renamed from: z */
    public final void m146630z() {
        this.f136008j = 0;
        this.f136002d.mo111924u1(null);
        this.f136002d.m89129Y0(null);
        this.f136003e.setImageInfo(null);
        this.f136014p = true;
        if (f135998q) {
            C22122a0 c22122a0 = this.f136002d;
            StringBuilder sb2 = new StringBuilder();
            sb2.append("reset imageModule: ");
            sb2.append(c22122a0);
        }
    }
}
