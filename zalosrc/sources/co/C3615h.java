package co;

import ac.C0708i;
import ac.C0732w;
import ae.C0766k;
import ag0.C0815e1;
import am.AbstractC0924m0;
import android.content.Context;
import android.content.Intent;
import androidx.lifecycle.C1761c0;
import bo.C2974g;
import bo.C2984i;
import bo.C3004m;
import bo.C3008m3;
import bo.C3054x;
import bo.C3061y2;
import co.C3615h;
import com.zing.zalo.AbstractC16781w;
import com.zing.zalo.AbstractC16803z;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.control.ItemAlbumMobile;
import com.zing.zalo.control.TrackingSource;
import com.zing.zalo.data.mediapicker.model.MediaItem;
import com.zing.zalo.feed.models.PrivacyInfo;
import com.zing.zalo.feed.mvp.album.C8534d;
import com.zing.zalo.feed.mvp.profile.model.ProfileAlbumHeader;
import com.zing.zalo.feed.mvp.profile.model.ProfileAlbumItem;
import com.zing.zalo.feed.mvp.profile.model.ProfilePreviewAlbumItem;
import com.zing.zalo.feed.mvp.profile.model.theme.ContentImpl;
import com.zing.zalo.feed.mvp.profile.model.theme.DecorAlbumImpl;
import com.zing.zalo.feed.mvp.profile.model.theme.DecorItemImpl;
import com.zing.zalo.feed.mvp.profile.model.theme.ThemeItem;
import com.zing.zalo.feed.mvp.profile.model.theme.ThemeItemImpl;
import com.zing.zalo.zview.ZaloView;
import com.zing.zalo.zview.animation.AnimationTarget;
import com.zing.zalocore.CoreUtility;
import en0.InterfaceC18494a;
import en0.InterfaceC18505l;
import en0.InterfaceC18509p;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import fo.C19083c;
import hm0.C20096c;
import hm0.InterfaceC20094a;
import ho0.AbstractC20110a;
import is.AbstractC20783a;
import is.AbstractC20784a0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import me0.AbstractC23136l9;
import me0.C23212s8;
import on0.AbstractC24341v;
import on0.AbstractC24344y;
import org.json.JSONObject;
import p137eo.AbstractC18522f;
import p137eo.AbstractC18523g;
import p205hc.AbstractC19962a;
import p205hc.InterfaceC19968g;
import p205hc.InterfaceC19969h;
import p227i3.C20215s;
import p368nq.C23926a;
import p458qr.C25470c;
import p559uv.C27373c;
import p716zh.C32002l4;
import p716zh.C32017m4;
import pm0.AbstractC24856m;
import pm0.AbstractC24862s;
import pm0.C24848g0;
import pm0.InterfaceC24854k;
import qm0.AbstractC25332a0;
import qm0.AbstractC25368s;
import vm0.AbstractC28298d;
import wm0.AbstractC29104l;

/* renamed from: co.h */
/* loaded from: classes4.dex */
public final class C3615h extends AbstractC19962a implements InterfaceC3612f {
    public static final a Companion = new a(null);

    /* renamed from: A */
    private int f15223A;

    /* renamed from: B */
    private int f15224B;

    /* renamed from: C */
    private C27373c f15225C;

    /* renamed from: D */
    private ArrayList f15226D;

    /* renamed from: E */
    private ArrayList f15227E;

    /* renamed from: F */
    private ArrayList f15228F;

    /* renamed from: G */
    private long f15229G;

    /* renamed from: H */
    private String f15230H;

    /* renamed from: I */
    private String f15231I;

    /* renamed from: J */
    private PrivacyInfo f15232J;

    /* renamed from: K */
    private ThemeItem f15233K;

    /* renamed from: L */
    private boolean f15234L;

    /* renamed from: M */
    private boolean f15235M;

    /* renamed from: N */
    private boolean f15236N;

    /* renamed from: O */
    private boolean f15237O;

    /* renamed from: P */
    private final String f15238P;

    /* renamed from: Q */
    private final String f15239Q;

    /* renamed from: R */
    private final String f15240R;

    /* renamed from: S */
    private final String f15241S;

    /* renamed from: T */
    private final String f15242T;

    /* renamed from: U */
    private final String f15243U;

    /* renamed from: V */
    private final String f15244V;

    /* renamed from: W */
    private boolean f15245W;

    /* renamed from: t */
    private final InterfaceC24854k f15246t;

    /* renamed from: u */
    private final CoroutineScope f15247u;

    /* renamed from: v */
    private C32002l4 f15248v;

    /* renamed from: w */
    private final List f15249w;

    /* renamed from: x */
    private final C1761c0 f15250x;

    /* renamed from: y */
    private final C1761c0 f15251y;

    /* renamed from: z */
    private final C1761c0 f15252z;

    /* renamed from: co.h$a */
    /* loaded from: classes4.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC19060k abstractC19060k) {
            this();
        }
    }

    /* renamed from: co.h$b */
    /* loaded from: classes4.dex */
    public static final class b implements InterfaceC20094a {
        b() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: e */
        public static final void m18312e(ProfilePreviewAlbumItem profilePreviewAlbumItem, C3615h c3615h) {
            int i11;
            AbstractC19074t.m100208f(profilePreviewAlbumItem, "$album");
            AbstractC19074t.m100208f(c3615h, "this$0");
            profilePreviewAlbumItem.setTitle(c3615h.m18303eq());
            profilePreviewAlbumItem.setDesc(c3615h.m18290Np(c3615h.m18295Wp()));
            profilePreviewAlbumItem.setPrivacyType(c3615h.f15232J.f45973p);
            profilePreviewAlbumItem.setThumb(c3615h.m18294Tp());
            profilePreviewAlbumItem.setSize(c3615h.m18298Zp());
            ((InterfaceC3614g) c3615h.m103742Dp()).mo18262ft(c3615h.f15232J.f45973p, c3615h.m18301cq(), c3615h.m18304fq(), c3615h.f15233K.getId());
            InterfaceC3614g interfaceC3614g = (InterfaceC3614g) c3615h.m103742Dp();
            PrivacyInfo privacyInfo = c3615h.f15232J;
            int m18300bq = c3615h.m18300bq();
            ArrayList m18299aq = c3615h.m18299aq();
            C27373c m18289K7 = c3615h.m18289K7();
            if (c3615h.f15237O) {
                i11 = 35;
            } else {
                i11 = 0;
            }
            interfaceC3614g.mo18250C9(profilePreviewAlbumItem, privacyInfo, m18300bq, m18299aq, m18289K7, new TrackingSource(i11));
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: f */
        public static final void m18313f(C3615h c3615h, C20096c c20096c) {
            ZaloView zaloView;
            Context context;
            AbstractC19074t.m100208f(c3615h, "this$0");
            AbstractC19074t.m100208f(c20096c, "$p0");
            ((InterfaceC3614g) c3615h.m103742Dp()).mo49315c4();
            Object m103742Dp = c3615h.m103742Dp();
            if (m103742Dp instanceof ZaloView) {
                zaloView = (ZaloView) m103742Dp;
            } else {
                zaloView = null;
            }
            if (zaloView != null && (context = zaloView.getContext()) != null) {
                AbstractC20783a.Companion.m108434c(context, c20096c);
            }
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(final C20096c c20096c) {
            AbstractC19074t.m100208f(c20096c, "p0");
            C3615h.this.m18305rq(false);
            InterfaceC3614g interfaceC3614g = (InterfaceC3614g) C3615h.this.m103742Dp();
            final C3615h c3615h = C3615h.this;
            interfaceC3614g.mo70710wy(new Runnable() { // from class: co.j
                @Override // java.lang.Runnable
                public final void run() {
                    C3615h.b.m18313f(C3615h.this, c20096c);
                }
            });
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            AbstractC19074t.m100208f(obj, "p0");
            C3615h.this.m18305rq(false);
            JSONObject optJSONObject = ((JSONObject) obj).optJSONObject("data");
            if (optJSONObject != null) {
                final C3615h c3615h = C3615h.this;
                ProfilePreviewAlbumItem.C8670b c8670b = ProfilePreviewAlbumItem.Companion;
                String jSONObject = optJSONObject.toString();
                AbstractC19074t.m100207e(jSONObject, "toString(...)");
                final ProfilePreviewAlbumItem m46319a = c8670b.m46319a(jSONObject);
                ((InterfaceC3614g) c3615h.m103742Dp()).mo70710wy(new Runnable() { // from class: co.i
                    @Override // java.lang.Runnable
                    public final void run() {
                        C3615h.b.m18312e(ProfilePreviewAlbumItem.this, c3615h);
                    }
                });
                C23926a.f115594a.m125058g(true);
            }
            ((InterfaceC3614g) C3615h.this.m103742Dp()).mo49315c4();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: co.h$c */
    /* loaded from: classes4.dex */
    public static final class c extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        int f15254t;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: co.h$c$a */
        /* loaded from: classes4.dex */
        public static final class a extends AbstractC19075u implements InterfaceC18505l {

            /* renamed from: q */
            public static final a f15256q = new a();

            a() {
                super(1);
            }

            /* renamed from: a */
            public final void m18315a(AbstractC18523g abstractC18523g) {
                AbstractC19074t.m100208f(abstractC18523g, "it");
            }

            @Override // en0.InterfaceC18505l
            /* renamed from: i9 */
            public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
                m18315a((AbstractC18523g) obj);
                return C24848g0.f119245a;
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: co.h$c$b */
        /* loaded from: classes4.dex */
        public static final class b extends AbstractC19075u implements InterfaceC18505l {

            /* renamed from: q */
            final /* synthetic */ C3615h f15257q;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(C3615h c3615h) {
                super(1);
                this.f15257q = c3615h;
            }

            /* renamed from: a */
            public final void m18316a(boolean z11) {
                ((InterfaceC3614g) this.f15257q.m103742Dp()).mo18263g();
                ((InterfaceC3614g) this.f15257q.m103742Dp()).mo59032jx(AbstractC8020f0.str_profile_album_edit_album_option_edit_album_successfull);
            }

            @Override // en0.InterfaceC18505l
            /* renamed from: i9 */
            public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
                m18316a(((Boolean) obj).booleanValue());
                return C24848g0.f119245a;
            }
        }

        c(Continuation continuation) {
            super(2, continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            return new c(continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            Object m142578e;
            m142578e = AbstractC28298d.m142578e();
            int i11 = this.f15254t;
            if (i11 != 0) {
                if (i11 == 1) {
                    AbstractC24862s.m129228b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                AbstractC24862s.m129228b(obj);
                C19083c m18296Xp = C3615h.this.m18296Xp();
                String str = CoreUtility.f89233i;
                AbstractC19074t.m100207e(str, "currentUserUid");
                long m18293Sp = C3615h.this.m18293Sp();
                String m18303eq = C3615h.this.m18303eq();
                C3615h c3615h = C3615h.this;
                String m18290Np = c3615h.m18290Np(c3615h.m18295Wp());
                ThemeItem themeItem = C3615h.this.f15233K;
                TrackingSource m154374t = C32017m4.m154326S().m154374t(C3615h.this.f15248v.m154284u(40));
                AbstractC19074t.m100207e(m154374t, "createTrackingSourceEditAlbum(...)");
                C19083c.a aVar = new C19083c.a(str, m18293Sp, 5, m18303eq, m18290Np, themeItem, m154374t);
                this.f15254t = 1;
                obj = m18296Xp.m101498a(aVar, this);
                if (obj == m142578e) {
                    return m142578e;
                }
            }
            AbstractC18522f abstractC18522f = (AbstractC18522f) obj;
            if (abstractC18522f != null) {
                abstractC18522f.m97904a(a.f15256q, new b(C3615h.this));
            }
            ((InterfaceC3614g) C3615h.this.m103742Dp()).mo49315c4();
            return C24848g0.f119245a;
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: r, reason: merged with bridge method [inline-methods] */
        public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
            return ((c) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* renamed from: co.h$d */
    /* loaded from: classes4.dex */
    static final class d extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final d f15258q = new d();

        d() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C19083c mo12V4() {
            return new C19083c(null, 1, null);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3615h(InterfaceC3614g interfaceC3614g) {
        super(interfaceC3614g);
        InterfaceC24854k m129210a;
        AbstractC19074t.m100208f(interfaceC3614g, "mvpView");
        m129210a = AbstractC24856m.m129210a(d.f15258q);
        this.f15246t = m129210a;
        this.f15247u = CoroutineScopeKt.m112637a(Dispatchers.m112681c());
        this.f15248v = C32002l4.Companion.m154287a(10017);
        this.f15249w = new ArrayList();
        this.f15250x = new C1761c0();
        this.f15251y = new C1761c0();
        this.f15252z = new C1761c0();
        this.f15226D = new ArrayList();
        this.f15227E = new ArrayList();
        this.f15228F = new ArrayList();
        this.f15230H = "";
        this.f15231I = "";
        this.f15232J = new PrivacyInfo();
        this.f15233K = ThemeItem.Companion.m46365a();
        String m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_profile_album_create_album);
        AbstractC19074t.m100207e(m118743r0, "getString(...)");
        this.f15238P = m118743r0;
        String m118743r02 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_profile_album_create_album_mode_edit_title);
        AbstractC19074t.m100207e(m118743r02, "getString(...)");
        this.f15239Q = m118743r02;
        String m118743r03 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_profile_album_input_name_hint);
        AbstractC19074t.m100207e(m118743r03, "getString(...)");
        this.f15240R = m118743r03;
        String m118743r04 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_profile_album_input_description_hint);
        AbstractC19074t.m100207e(m118743r04, "getString(...)");
        this.f15241S = m118743r04;
        String m118743r05 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_profile_album_select_theme);
        AbstractC19074t.m100207e(m118743r05, "getString(...)");
        this.f15242T = m118743r05;
        String m118743r06 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_profile_album_theme_description_hint);
        AbstractC19074t.m100207e(m118743r06, "getString(...)");
        this.f15243U = m118743r06;
        String m118743r07 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_profile_album_section_photo_title);
        AbstractC19074t.m100207e(m118743r07, "getString(...)");
        this.f15244V = m118743r07;
    }

    /* renamed from: Op */
    private final C3054x m18274Op() {
        C3054x c3054x = new C3054x(false, 1, null);
        c3054x.m14648F(C23212s8.m119606n(AbstractC16781w.PrimaryBackgroundColor));
        c3054x.m14666X(AbstractC23136l9.m118743r0(AbstractC8020f0.str_profile_album_create_album_empty_state_title));
        c3054x.m14650H(AbstractC23136l9.m118743r0(AbstractC8020f0.str_profile_album_create_album_empty_state_description));
        c3054x.m14657O(AbstractC16803z.icon_profile_empty_section_photo);
        c3054x.m14667Y(AbstractC23136l9.m118743r0(AbstractC8020f0.str_profile_album_create_album_empty_state_cta_post));
        c3054x.m14655M(true);
        c3054x.m14649G(C23212s8.m119606n(AbstractC16781w.HeaderFormBottomLineColor));
        c3054x.m14660R(AbstractC23136l9.m118742r(4.0f));
        c3054x.m14654L(true);
        c3054x.m14653K(true);
        return c3054x;
    }

    /* renamed from: Rp */
    private final void m18275Rp() {
        this.f15249w.clear();
        int i11 = this.f15223A;
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 == 2) {
                    m18284oq();
                }
            } else {
                m18283nq();
            }
        } else {
            m18282mq();
        }
        this.f15250x.mo9221n(this.f15249w);
    }

    /* renamed from: gq */
    private final void m18276gq() {
        ((InterfaceC3614g) m103742Dp()).mo18254Nf(this.f15226D);
        ((InterfaceC3614g) m103742Dp()).mo18264gt(this.f15227E.size());
    }

    /* renamed from: hq */
    private final boolean m18277hq() {
        boolean m127128x;
        m127128x = AbstractC24341v.m127128x(this.f15230H);
        return !m127128x;
    }

    /* renamed from: iq */
    private final boolean m18278iq() {
        boolean m127128x;
        m127128x = AbstractC24341v.m127128x(this.f15230H);
        return !m127128x;
    }

    /* renamed from: jq */
    private final boolean m18279jq() {
        return true;
    }

    /* renamed from: kq */
    private final boolean m18280kq() {
        boolean m127128x;
        boolean m127128x2;
        m127128x = AbstractC24341v.m127128x(this.f15230H);
        if (m127128x) {
            m127128x2 = AbstractC24341v.m127128x(this.f15231I);
            if (m127128x2 && m18298Zp() <= 0) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: lq */
    private final boolean m18281lq(MediaItem mediaItem) {
        ArrayList arrayList = this.f15226D;
        if ((arrayList instanceof Collection) && arrayList.isEmpty()) {
            return false;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            if (AbstractC19074t.m100204b(((MediaItem) it.next()).m41104I(), mediaItem.m41104I())) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: mq */
    private final void m18282mq() {
        String thumb;
        List list = this.f15249w;
        C2974g.a.C32652a c32652a = C2974g.a.Companion;
        C2984i c2984i = new C2984i(this.f15230H, this.f15240R, false, 4, null);
        c2984i.m14152f(40);
        C24848g0 c24848g0 = C24848g0.f119245a;
        list.add(c32652a.m14104e(c2984i));
        List list2 = this.f15249w;
        C2984i c2984i2 = new C2984i(this.f15231I, this.f15241S, false);
        c2984i2.m14152f(150);
        list2.add(c32652a.m14103d(c2984i2));
        this.f15249w.add(c32652a.m14110k());
        List list3 = this.f15249w;
        String m45149t = this.f15232J.m45149t();
        AbstractC19074t.m100207e(m45149t, "getStringInFeed(...)");
        C3004m c3004m = new C3004m(0, m45149t, m18302dq(), true);
        c3004m.m14408i(this.f15232J.m45143k());
        list3.add(c32652a.m14109j(c3004m));
        List list4 = this.f15249w;
        C3004m c3004m2 = new C3004m(1, this.f15242T, this.f15243U, false);
        c3004m2.m14408i(AbstractC16803z.ic_magicwand);
        if (this.f15233K.getId() == 0) {
            thumb = "";
        } else {
            thumb = this.f15233K.getContent().getThumb();
        }
        c3004m2.m14409j(thumb);
        list4.add(c32652a.m14109j(c3004m2));
        this.f15249w.add(c32652a.m14110k());
        this.f15249w.add(c32652a.m14112m(new C3008m3(this.f15244V, null, 2, null)));
        if (m18297Yp().isEmpty() && this.f15225C == null) {
            this.f15249w.add(c32652a.m14102c(m18274Op()));
            return;
        }
        List list5 = this.f15249w;
        C3061y2 c3061y2 = new C3061y2(m18297Yp(), this.f15225C);
        c3061y2.m14721j(AbstractC23136l9.m118742r(0.0f));
        list5.add(c32652a.m14107h(c3061y2));
    }

    /* renamed from: nq */
    private final void m18283nq() {
        String thumb;
        List list = this.f15249w;
        C2974g.a.C32652a c32652a = C2974g.a.Companion;
        C2984i c2984i = new C2984i(this.f15230H, this.f15240R, false, 4, null);
        c2984i.m14152f(40);
        C24848g0 c24848g0 = C24848g0.f119245a;
        list.add(c32652a.m14104e(c2984i));
        List list2 = this.f15249w;
        C2984i c2984i2 = new C2984i(this.f15231I, this.f15241S, false);
        c2984i2.m14152f(150);
        list2.add(c32652a.m14103d(c2984i2));
        this.f15249w.add(c32652a.m14110k());
        List list3 = this.f15249w;
        C3004m c3004m = new C3004m(1, this.f15242T, this.f15243U, false);
        c3004m.m14408i(AbstractC16803z.ic_magicwand);
        if (this.f15233K.getId() == 0) {
            thumb = "";
        } else {
            thumb = this.f15233K.getContent().getThumb();
        }
        c3004m.m14409j(thumb);
        list3.add(c32652a.m14109j(c3004m));
        this.f15249w.add(c32652a.m14110k());
    }

    /* renamed from: oq */
    private final void m18284oq() {
        String thumb;
        List list = this.f15249w;
        C2974g.a.C32652a c32652a = C2974g.a.Companion;
        C2984i c2984i = new C2984i(this.f15230H, this.f15240R, false, 4, null);
        c2984i.m14152f(40);
        C24848g0 c24848g0 = C24848g0.f119245a;
        list.add(c32652a.m14104e(c2984i));
        List list2 = this.f15249w;
        C2984i c2984i2 = new C2984i(this.f15231I, this.f15241S, false);
        c2984i2.m14152f(150);
        list2.add(c32652a.m14103d(c2984i2));
        this.f15249w.add(c32652a.m14110k());
        List list3 = this.f15249w;
        C3004m c3004m = new C3004m(1, this.f15242T, this.f15243U, false);
        c3004m.m14408i(AbstractC16803z.ic_magicwand);
        if (this.f15233K.getId() == 0) {
            thumb = "";
        } else {
            thumb = this.f15233K.getContent().getThumb();
        }
        c3004m.m14409j(thumb);
        list3.add(c32652a.m14109j(c3004m));
        this.f15249w.add(c32652a.m14110k());
    }

    /* renamed from: pq */
    private final void m18285pq() {
        int i11;
        ProfileAlbumItem profileAlbumItem = new ProfileAlbumItem(null, 1, null);
        profileAlbumItem.m46300c().m46271D(this.f15230H);
        profileAlbumItem.m46300c().m46291u(m18290Np(this.f15231I));
        ProfileAlbumHeader m46300c = profileAlbumItem.m46300c();
        boolean z11 = false;
        if (!m18297Yp().isEmpty()) {
            i11 = m18297Yp().size();
        } else if (this.f15225C != null) {
            i11 = 1;
        } else {
            i11 = 0;
        }
        m46300c.m46272F(i11);
        profileAlbumItem.m46300c().m46290t(m18294Tp());
        profileAlbumItem.m46300c().m46269B(this.f15232J);
        profileAlbumItem.m46300c().m46270C(this.f15233K);
        InterfaceC3614g interfaceC3614g = (InterfaceC3614g) m103742Dp();
        ArrayList m18297Yp = m18297Yp();
        C27373c c27373c = this.f15225C;
        if (!this.f15236N && profileAlbumItem.m46300c().m46285m().isThemeDefault()) {
            z11 = true;
        }
        interfaceC3614g.mo18251Cr(profileAlbumItem, m18297Yp, c27373c, z11, this.f15248v);
    }

    /* renamed from: qq */
    private final void m18286qq() {
        this.f15226D.clear();
        this.f15226D.addAll(this.f15227E);
    }

    /* renamed from: tq */
    private final void m18287tq(PrivacyInfo privacyInfo) {
        int i11 = privacyInfo.f45973p;
        if (i11 != 0 && i11 != 1 && i11 != 2 && i11 != 3) {
            privacyInfo = PrivacyInfo.m45134q(privacyInfo.f45977t);
            AbstractC19074t.m100207e(privacyInfo, "getRecentPrivacy(...)");
        }
        this.f15232J = privacyInfo;
    }

    /* renamed from: vq */
    private final void m18288vq() {
        this.f15252z.mo9221n(Boolean.valueOf(m18277hq()));
    }

    @Override // co.InterfaceC3612f
    /* renamed from: C5 */
    public void mo18220C5() {
        List m131502j;
        InterfaceC3614g interfaceC3614g = (InterfaceC3614g) m103742Dp();
        ArrayList arrayList = this.f15226D;
        m131502j = AbstractC25368s.m131502j();
        interfaceC3614g.mo18266vo(arrayList, m131502j);
        m18276gq();
    }

    @Override // co.InterfaceC3612f
    /* renamed from: D */
    public void mo18221D() {
        m18275Rp();
        m18288vq();
    }

    @Override // co.InterfaceC3612f
    /* renamed from: Fm */
    public void mo18222Fm(List list) {
        AbstractC19074t.m100208f(list, "selectedItems");
        m18286qq();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            MediaItem mediaItem = (MediaItem) it.next();
            if (mediaItem.m41173u0() && !m18281lq(mediaItem)) {
                this.f15226D.add(mediaItem);
            }
        }
        m18275Rp();
    }

    @Override // co.InterfaceC3612f
    /* renamed from: G0 */
    public void mo18223G0(int i11) {
        List m131502j;
        List m131502j2;
        ((InterfaceC3614g) m103742Dp()).mo18259U2();
        if (i11 != 70) {
            if (i11 != 80) {
                if (i11 != 90) {
                    m18308wq(i11);
                    return;
                }
                InterfaceC3614g interfaceC3614g = (InterfaceC3614g) m103742Dp();
                PrivacyInfo privacyInfo = this.f15232J;
                if (privacyInfo.f45977t != i11) {
                    m131502j2 = AbstractC25368s.m131502j();
                } else {
                    m131502j2 = privacyInfo.m45138e();
                    AbstractC19074t.m100207e(m131502j2, "convertToInviteContactProfile(...)");
                }
                interfaceC3614g.mo18252D2(m131502j2);
                return;
            }
            ((InterfaceC3614g) m103742Dp()).mo18260f4();
            return;
        }
        InterfaceC3614g interfaceC3614g2 = (InterfaceC3614g) m103742Dp();
        PrivacyInfo privacyInfo2 = this.f15232J;
        if (privacyInfo2.f45977t != i11) {
            m131502j = AbstractC25368s.m131502j();
        } else {
            m131502j = privacyInfo2.m45138e();
            AbstractC19074t.m100207e(m131502j, "convertToInviteContactProfile(...)");
        }
        interfaceC3614g2.mo18265u0(m131502j);
    }

    @Override // co.InterfaceC3612f
    /* renamed from: Ia */
    public void mo18224Ia(int i11, Intent intent) {
        try {
            this.f15235M = true;
            if (i11 == -1 && intent != null && intent.hasExtra("EXTRA_RESULT_THEME_ID")) {
                ThemeItem themeItem = (ThemeItem) intent.getParcelableExtra("EXTRA_RESULT_THEME_ID");
                if (themeItem == null) {
                    themeItem = this.f15233K;
                }
                this.f15233K = themeItem;
                boolean booleanExtra = intent.getBooleanExtra("EXTRA_RESULT_FROM_BACK", false);
                this.f15236N = true;
                m18275Rp();
                if (this.f15234L && !booleanExtra) {
                    m18291Pp();
                }
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: K7 */
    public final C27373c m18289K7() {
        return this.f15225C;
    }

    @Override // co.InterfaceC3612f
    /* renamed from: Kb */
    public void mo18225Kb() {
        Intent intent = new Intent();
        intent.putParcelableArrayListExtra("EXTRA_SELECTED_PHOTOS", this.f15226D);
        ((InterfaceC3614g) m103742Dp()).mo18253N9(-1, intent);
        ((InterfaceC3614g) m103742Dp()).mo18263g();
    }

    @Override // p205hc.AbstractC19962a, p205hc.InterfaceC19966e
    /* renamed from: Nd */
    public void mo995Nd(InterfaceC19969h interfaceC19969h, InterfaceC19968g interfaceC19968g) {
        super.mo995Nd(interfaceC19969h, interfaceC19968g);
        C8534d c8534d = (C8534d) interfaceC19969h;
        if (c8534d != null) {
            C32002l4 m45437c = c8534d.m45437c();
            if (m45437c != null) {
                this.f15248v.m154273c(m45437c);
            }
            List m45439e = c8534d.m45439e();
            if (m45439e != null) {
                Iterator it = m45439e.iterator();
                while (it.hasNext()) {
                    this.f15226D.add(new MediaItem((MediaItem) it.next()));
                }
            }
            List m45438d = c8534d.m45438d();
            if (m45438d != null) {
                Iterator it2 = m45438d.iterator();
                while (it2.hasNext()) {
                    this.f15227E.add(new MediaItem((MediaItem) it2.next()));
                }
            }
            this.f15225C = c8534d.m45445k();
            this.f15224B = c8534d.m45440f();
            m18287tq(c8534d.m45442h());
            m18307uq(c8534d.m45444j());
            this.f15233K = c8534d.m45443i();
            m18306sq(c8534d.m45436b());
            this.f15229G = c8534d.m45435a();
            this.f15223A = c8534d.m45441g();
            this.f15232J.m45137N();
        }
    }

    /* renamed from: Np */
    public final String m18290Np(String str) {
        Character ch2;
        List m131505m;
        AbstractC19074t.m100208f(str, "<this>");
        int i11 = 0;
        while (true) {
            if (i11 < str.length()) {
                char charAt = str.charAt(i11);
                m131505m = AbstractC25368s.m131505m('\n', ' ');
                if (m131505m.indexOf(Character.valueOf(charAt)) < 0) {
                    ch2 = Character.valueOf(charAt);
                    break;
                }
                i11++;
            } else {
                ch2 = null;
                break;
            }
        }
        if (ch2 != null) {
            ch2.charValue();
            return str;
        }
        return "";
    }

    @Override // co.InterfaceC3612f
    /* renamed from: O */
    public void mo18226O(MediaItem mediaItem) {
        Object obj;
        AbstractC19074t.m100208f(mediaItem, "photo");
        if (!mediaItem.m41173u0()) {
            ArrayList arrayList = this.f15227E;
            if (!(arrayList instanceof Collection) || !arrayList.isEmpty()) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    if (AbstractC19074t.m100204b(((MediaItem) it.next()).m41104I(), mediaItem.m41104I())) {
                        return;
                    }
                }
            }
            Iterator it2 = this.f15226D.iterator();
            while (true) {
                if (it2.hasNext()) {
                    obj = it2.next();
                    if (AbstractC19074t.m100204b(((MediaItem) obj).m41104I(), mediaItem.m41104I())) {
                        break;
                    }
                } else {
                    obj = null;
                    break;
                }
            }
            MediaItem mediaItem2 = (MediaItem) obj;
            if (mediaItem2 != null) {
                this.f15226D.remove(mediaItem2);
                return;
            }
            return;
        }
        if (this.f15226D.size() < AbstractC0924m0.m3769e3() && !m18281lq(mediaItem)) {
            this.f15226D.add(mediaItem);
        }
    }

    @Override // co.InterfaceC3612f
    /* renamed from: O6 */
    public void mo18227O6(C3004m c3004m) {
        AbstractC19074t.m100208f(c3004m, "albumRowSelectInfo");
        int m14406g = c3004m.m14406g();
        if (m14406g != 0) {
            if (m14406g == 1) {
                C0732w m1189a = C0732w.Companion.m1189a();
                C0708i c0708i = new C0708i();
                c0708i.m1072c("re_select", this.f15236N ? 1 : 0);
                C24848g0 c24848g0 = C24848g0.f119245a;
                C0732w.m1177r(m1189a, "click_select_theme", null, c0708i, null, 10, null);
                m18309xq();
                return;
            }
            return;
        }
        C0732w.m1177r(C0732w.Companion.m1189a(), "click_edit_privacy", null, null, null, 14, null);
        ((InterfaceC3614g) m103742Dp()).mo18258U0(this.f15232J);
        C0815e1.m2075D().m2100V(C32017m4.m154326S().m154343Q(this.f15248v.m154284u(48)), false);
    }

    /* renamed from: Pp */
    public final void m18291Pp() {
        C32002l4 m154284u;
        if (this.f15245W) {
            return;
        }
        this.f15245W = true;
        ((InterfaceC3614g) m103742Dp()).mo46829Y();
        C0766k c0766k = new C0766k();
        c0766k.mo1704o8(new b());
        String str = this.f15230H;
        String m18290Np = m18290Np(this.f15231I);
        PrivacyInfo privacyInfo = this.f15232J;
        int id2 = this.f15233K.getId();
        C32017m4 m154326S = C32017m4.m154326S();
        C32002l4 c32002l4 = this.f15248v;
        if (this.f15234L) {
            m154284u = c32002l4.m154284u(38);
        } else {
            m154284u = c32002l4.m154284u(39);
        }
        c0766k.m1851j(str, m18290Np, privacyInfo, id2, m154326S.m154373s(m154284u));
    }

    @Override // co.InterfaceC3612f
    /* renamed from: Qo */
    public void mo18228Qo() {
        if (!m18280kq() && this.f15223A == 0) {
            ((InterfaceC3614g) m103742Dp()).mo18269zi();
        } else {
            ((InterfaceC3614g) m103742Dp()).mo18263g();
        }
    }

    /* renamed from: Qp */
    public final void m18292Qp() {
        BuildersKt__Builders_commonKt.m112540d(this.f15247u, null, null, new c(null), 3, null);
    }

    @Override // co.InterfaceC3612f
    /* renamed from: Rd */
    public void mo18229Rd(List list) {
        AbstractC19074t.m100208f(list, "selectedItems");
        m18286qq();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            MediaItem mediaItem = (MediaItem) it.next();
            if (mediaItem.m41173u0() && !m18281lq(mediaItem)) {
                this.f15226D.add(mediaItem);
            }
        }
        m18275Rp();
        ((InterfaceC3614g) m103742Dp()).mo18257Tr();
        m18288vq();
    }

    @Override // co.InterfaceC3612f
    /* renamed from: Re */
    public void mo18230Re() {
        int i11 = this.f15223A;
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 == 2) {
                    Intent intent = new Intent();
                    intent.putExtra("title_updated", this.f15230H);
                    intent.putExtra("desc_updated", m18290Np(this.f15231I));
                    intent.putExtra("theme_updated", this.f15233K);
                    ((InterfaceC3614g) m103742Dp()).mo18253N9(-1, intent);
                    return;
                }
                return;
            }
            if (m18278iq()) {
                m18292Qp();
                return;
            }
            return;
        }
        if (m18277hq()) {
            if (!this.f15235M && AbstractC0924m0.m3017E9()) {
                this.f15234L = true;
                m18285pq();
            } else {
                m18291Pp();
            }
        }
    }

    /* renamed from: Sp */
    public final long m18293Sp() {
        return this.f15229G;
    }

    @Override // co.InterfaceC3612f
    /* renamed from: To */
    public C1761c0 mo18231To() {
        return this.f15251y;
    }

    /* renamed from: Tp */
    public final String m18294Tp() {
        if (!m18297Yp().isEmpty()) {
            String str = ((ItemAlbumMobile) m18297Yp().get(0)).f42609y;
            AbstractC19074t.m100207e(str, "localPath");
            return str;
        }
        C27373c c27373c = this.f15225C;
        if (c27373c != null) {
            AbstractC19074t.m100205c(c27373c);
            if (c27373c.m140268v() != null) {
                String m140268v = c27373c.m140268v();
                AbstractC19074t.m100205c(m140268v);
                return m140268v;
            }
            if (c27373c.m140267u() != null) {
                String m140267u = c27373c.m140267u();
                AbstractC19074t.m100205c(m140267u);
                return m140267u;
            }
        }
        return "";
    }

    @Override // co.InterfaceC3612f
    /* renamed from: V3 */
    public void mo18232V3(String str) {
        AbstractC19074t.m100208f(str, C20215s.f99966b);
        m18306sq(str);
        m18288vq();
    }

    /* renamed from: Wp */
    public final String m18295Wp() {
        return this.f15231I;
    }

    /* renamed from: Xp */
    public final C19083c m18296Xp() {
        return (C19083c) this.f15246t.getValue();
    }

    @Override // co.InterfaceC3612f
    /* renamed from: Y1 */
    public void mo18233Y1(int i11, Intent intent) {
        ArrayList parcelableArrayListExtra;
        int i12;
        try {
            if (i11 == -1 && intent != null) {
                if (intent.hasExtra("extra_selected_profiles") && (parcelableArrayListExtra = intent.getParcelableArrayListExtra("extra_selected_profiles")) != null) {
                    PrivacyInfo.m45127K(parcelableArrayListExtra);
                    if (parcelableArrayListExtra.size() == 0) {
                        i12 = 40;
                    } else {
                        i12 = 90;
                    }
                    m18308wq(i12);
                }
            } else {
                ((InterfaceC3614g) m103742Dp()).mo18258U0(this.f15232J);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: Yp */
    public final ArrayList m18297Yp() {
        ArrayList arrayList = new ArrayList();
        List m108447k = AbstractC20784a0.m108447k(this.f15226D);
        int i11 = 0;
        for (Object obj : this.f15226D) {
            int i12 = i11 + 1;
            if (i11 < 0) {
                AbstractC25368s.m131509q();
            }
            ItemAlbumMobile itemAlbumMobile = new ItemAlbumMobile();
            itemAlbumMobile.m40513X((MediaItem) obj, true);
            if (i11 < m108447k.size()) {
                itemAlbumMobile.f42596r0 = (ItemAlbumMobile.C7883c) m108447k.get(i11);
                arrayList.add(itemAlbumMobile);
            }
            i11 = i12;
        }
        return arrayList;
    }

    @Override // co.InterfaceC3612f
    /* renamed from: Z */
    public void mo18234Z(C27373c c27373c, String str) {
        AbstractC19074t.m100208f(c27373c, "video");
        this.f15225C = c27373c;
        m18275Rp();
    }

    /* renamed from: Zp */
    public final int m18298Zp() {
        if (!this.f15226D.isEmpty()) {
            return this.f15226D.size();
        }
        if (this.f15225C != null) {
            return 1;
        }
        return 0;
    }

    /* renamed from: aq */
    public final ArrayList m18299aq() {
        return this.f15226D;
    }

    @Override // co.InterfaceC3612f
    /* renamed from: b */
    public void mo18235b(C25470c c25470c) {
        AbstractC19074t.m100208f(c25470c, "dataRetain");
        String m131944g = c25470c.m131944g("EXTRA_SAVE_TITLE", "");
        AbstractC19074t.m100207e(m131944g, "getString(...)");
        m18307uq(m131944g);
        String m131944g2 = c25470c.m131944g("EXTRA_SAVE_DECS", "");
        AbstractC19074t.m100207e(m131944g2, "getString(...)");
        m18306sq(m131944g2);
        ThemeItem themeItem = (ThemeItem) c25470c.m131941d("EXTRA_SAVE_THEME");
        if (themeItem == null) {
            themeItem = new ThemeItemImpl(0, (DecorItemImpl) null, (DecorItemImpl) null, (DecorAlbumImpl) null, (DecorAlbumImpl) null, (ContentImpl) null, (ContentImpl) null, 127, (AbstractC19060k) null);
        }
        this.f15233K = themeItem;
        this.f15236N = c25470c.m131938a("EXTRA_SAVE_THEME");
        if (c25470c.m131938a("EXTRA_SAVE_PRIVACY_TYPE")) {
            this.f15232J.f45973p = c25470c.m131940c("EXTRA_SAVE_PRIVACY_TYPE", 0);
        }
        if (c25470c.m131938a("EXTRA_SAVE_PRIVACY_ID")) {
            this.f15232J.f45977t = c25470c.m131940c("EXTRA_SAVE_PRIVACY_ID", 0);
        }
        this.f15223A = c25470c.m131940c("EXTRA_SAVE_MODE", 0);
        String m131944g3 = c25470c.m131944g("EXTRA_SAVE_ALBUM_ID", "0");
        AbstractC19074t.m100207e(m131944g3, "getString(...)");
        this.f15229G = Long.parseLong(m131944g3);
        m18275Rp();
        m18288vq();
    }

    /* renamed from: bq */
    public final int m18300bq() {
        return this.f15224B;
    }

    @Override // co.InterfaceC3612f
    /* renamed from: c */
    public C25470c mo18236c() {
        C25470c c25470c = new C25470c();
        c25470c.m131950m("EXTRA_SAVE_TITLE", this.f15230H);
        c25470c.m131950m("EXTRA_SAVE_DECS", this.f15231I);
        c25470c.m131947j("EXTRA_SAVE_THEME", this.f15233K);
        c25470c.m131946i("EXTRA_SAVE_PRIVACY_TYPE", this.f15232J.f45973p);
        c25470c.m131946i("EXTRA_SAVE_PRIVACY_ID", this.f15232J.f45977t);
        c25470c.m131946i("EXTRA_SAVE_MODE", this.f15223A);
        c25470c.m131950m("EXTRA_SAVE_ALBUM_ID", String.valueOf(this.f15229G));
        return c25470c;
    }

    /* renamed from: cq */
    public final int m18301cq() {
        if (!this.f15226D.isEmpty()) {
            return this.f15226D.size();
        }
        return 0;
    }

    @Override // co.InterfaceC3612f
    /* renamed from: di */
    public void mo18237di(AnimationTarget animationTarget, ItemAlbumMobile itemAlbumMobile, int i11) {
        if (this.f15226D.size() > 9 && i11 == 8) {
            ((InterfaceC3614g) m103742Dp()).mo18255PD(this.f15226D);
        } else {
            ((InterfaceC3614g) m103742Dp()).mo18256RG(this.f15226D, animationTarget, i11);
        }
    }

    /* renamed from: dq */
    protected final String m18302dq() {
        PrivacyInfo privacyInfo = this.f15232J;
        int i11 = privacyInfo.f45973p;
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 != 2 && i11 != 3) {
                    String m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_privacy_share_all_new);
                    AbstractC19074t.m100207e(m118743r0, "getString(...)");
                    return m118743r0;
                }
                privacyInfo.m45139f();
                String str = privacyInfo.f45975r;
                AbstractC19074t.m100207e(str, "textShareInfo");
                return str;
            }
            String m118743r02 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_privacy_share_only_me_new);
            AbstractC19074t.m100207e(m118743r02, "getString(...)");
            return m118743r02;
        }
        String m118743r03 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_privacy_share_all_new);
        AbstractC19074t.m100207e(m118743r03, "getString(...)");
        return m118743r03;
    }

    @Override // co.InterfaceC3612f
    /* renamed from: e7 */
    public C1761c0 mo18238e7() {
        return this.f15250x;
    }

    /* renamed from: eq */
    public final String m18303eq() {
        return this.f15230H;
    }

    /* renamed from: fq */
    public final int m18304fq() {
        return this.f15225C != null ? 1 : 0;
    }

    @Override // co.InterfaceC3612f
    /* renamed from: ge */
    public void mo18239ge(int i11) {
        Object m131207g0;
        Object obj;
        if (i11 >= 0) {
            try {
                if (i11 < this.f15226D.size()) {
                    InterfaceC3614g interfaceC3614g = (InterfaceC3614g) m103742Dp();
                    Object obj2 = this.f15226D.get(i11);
                    AbstractC19074t.m100207e(obj2, "get(...)");
                    interfaceC3614g.mo18261fF((MediaItem) obj2);
                    if (!this.f15227E.isEmpty()) {
                        m131207g0 = AbstractC25332a0.m131207g0(this.f15226D, i11);
                        MediaItem mediaItem = (MediaItem) m131207g0;
                        if (mediaItem != null) {
                            Iterator it = this.f15227E.iterator();
                            while (true) {
                                if (it.hasNext()) {
                                    obj = it.next();
                                    if (AbstractC19074t.m100204b(((MediaItem) obj).m41104I(), mediaItem.m41104I())) {
                                        break;
                                    }
                                } else {
                                    obj = null;
                                    break;
                                }
                            }
                            MediaItem mediaItem2 = (MediaItem) obj;
                            if (mediaItem2 != null) {
                                this.f15227E.remove(mediaItem2);
                                ((InterfaceC3614g) m103742Dp()).mo18264gt(this.f15227E.size());
                            }
                        }
                    }
                    this.f15226D.remove(i11);
                    m18275Rp();
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    @Override // co.InterfaceC3612f
    /* renamed from: k */
    public void mo18240k() {
        String str;
        C1761c0 c1761c0 = this.f15251y;
        int i11 = this.f15223A;
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 != 2) {
                    str = "";
                } else {
                    str = this.f15239Q;
                }
            } else {
                str = this.f15239Q;
            }
        } else {
            str = this.f15238P;
        }
        c1761c0.mo9224q(str);
    }

    @Override // co.InterfaceC3612f
    /* renamed from: kg */
    public C1761c0 mo18241kg() {
        return this.f15252z;
    }

    @Override // co.InterfaceC3612f
    /* renamed from: m5 */
    public void mo18242m5() {
        m18275Rp();
        ((InterfaceC3614g) m103742Dp()).mo18257Tr();
        m18288vq();
    }

    @Override // co.InterfaceC3612f
    /* renamed from: n1 */
    public void mo18243n1() {
        this.f15237O = true;
        ((InterfaceC3614g) m103742Dp()).mo18268yt(this.f15224B);
    }

    @Override // co.InterfaceC3612f
    /* renamed from: p2 */
    public void mo18244p2(int i11) {
        ((InterfaceC3614g) m103742Dp()).mo18259U2();
        InterfaceC3614g interfaceC3614g = (InterfaceC3614g) m103742Dp();
        List m45138e = this.f15232J.m45138e();
        AbstractC19074t.m100207e(m45138e, "convertToInviteContactProfile(...)");
        interfaceC3614g.mo18265u0(m45138e);
    }

    @Override // co.InterfaceC3612f
    /* renamed from: r2 */
    public void mo18245r2() {
        ((InterfaceC3614g) m103742Dp()).mo18267wI(this.f15225C);
    }

    /* renamed from: rq */
    public final void m18305rq(boolean z11) {
        this.f15245W = z11;
    }

    /* renamed from: sq */
    public final void m18306sq(String str) {
        String m127212k1;
        AbstractC19074t.m100208f(str, "value");
        m127212k1 = AbstractC24344y.m127212k1(str, 150);
        this.f15231I = m127212k1;
    }

    /* renamed from: uq */
    public final void m18307uq(String str) {
        String m127212k1;
        AbstractC19074t.m100208f(str, "value");
        m127212k1 = AbstractC24344y.m127212k1(str, 40);
        this.f15230H = m127212k1;
    }

    @Override // co.InterfaceC3612f
    /* renamed from: w3 */
    public void mo18246w3(int i11, Intent intent) {
        ArrayList parcelableArrayListExtra;
        try {
            if (i11 == -1 && intent != null) {
                if (intent.hasExtra("extra_selected_profiles") && (parcelableArrayListExtra = intent.getParcelableArrayListExtra("extra_selected_profiles")) != null) {
                    if (parcelableArrayListExtra.size() == 0) {
                        m18308wq(50);
                    } else {
                        m18308wq(PrivacyInfo.m45129a(parcelableArrayListExtra));
                    }
                }
            } else {
                ((InterfaceC3614g) m103742Dp()).mo18258U0(this.f15232J);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: wq */
    public final void m18308wq(int i11) {
        PrivacyInfo privacyInfo = this.f15232J;
        privacyInfo.f45977t = i11;
        if (i11 != 40) {
            if (i11 != 50) {
                if (i11 != 90) {
                    PrivacyInfo m45134q = PrivacyInfo.m45134q(i11);
                    AbstractC19074t.m100207e(m45134q, "getRecentPrivacy(...)");
                    m18287tq(m45134q);
                } else {
                    PrivacyInfo m45133i = PrivacyInfo.m45133i();
                    AbstractC19074t.m100207e(m45133i, "getExcludedFriendsPrivacy(...)");
                    m18287tq(m45133i);
                }
            } else {
                privacyInfo.f45973p = 1;
            }
        } else {
            privacyInfo.f45973p = 0;
        }
        this.f15232J.m45137N();
        m18275Rp();
    }

    @Override // co.InterfaceC3612f
    /* renamed from: x1 */
    public void mo18247x1() {
        this.f15225C = null;
        m18275Rp();
    }

    /* renamed from: xq */
    public final void m18309xq() {
        if (!m18279jq()) {
            ((InterfaceC3614g) m103742Dp()).mo59032jx(AbstractC8020f0.str_profile_album_create_album_empty_title);
        } else {
            m18285pq();
        }
    }

    @Override // co.InterfaceC3612f
    /* renamed from: y8 */
    public void mo18248y8(int i11, Intent intent) {
        if (i11 == -1 && intent != null) {
            try {
                if (intent.hasExtra("EXTRA_SELECTED_PHOTOS")) {
                    ArrayList parcelableArrayListExtra = intent.getParcelableArrayListExtra("EXTRA_SELECTED_PHOTOS");
                    ArrayList parcelableArrayListExtra2 = intent.getParcelableArrayListExtra("EXTRA_MODIFIED_PHOTOS");
                    if (parcelableArrayListExtra != null) {
                        mo18229Rd(parcelableArrayListExtra);
                        if (parcelableArrayListExtra2 != null) {
                            ((InterfaceC3614g) m103742Dp()).mo18266vo(parcelableArrayListExtra, parcelableArrayListExtra2);
                        }
                    }
                }
            } catch (Exception e11) {
                AbstractC20110a.f98889a.mo104552e(e11);
            }
        }
    }

    @Override // co.InterfaceC3612f
    /* renamed from: z2 */
    public void mo18249z2(String str) {
        AbstractC19074t.m100208f(str, C20215s.f99966b);
        m18307uq(str);
        m18288vq();
    }
}
