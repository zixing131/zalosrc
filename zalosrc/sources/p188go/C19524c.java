package p188go;

import ag0.C0815e1;
import android.text.TextUtils;
import bo.C3000l0;
import bo.C3020p0;
import bo.C3047v0;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.control.ContactProfile;
import com.zing.zalo.control.TrackingSource;
import com.zing.zalo.feed.mvp.bottomsheetmenu.BottomSheetMenuView;
import com.zing.zalo.feed.mvp.bottomsheetmenu.C8538a;
import com.zing.zalo.feed.mvp.bottomsheetmenu.model.BottomSheetMenuBundleData;
import com.zing.zalo.feed.mvp.bottomsheetmenu.model.BottomSheetMenuBundleDataPhotoViewfull;
import com.zing.zalo.feed.mvp.bottomsheetmenu.model.BottomSheetMenuBundleDataPrivacyQuickSetting;
import com.zing.zalo.feed.mvp.bottomsheetmenu.model.BottomSheetMenuResult;
import com.zing.zalo.utils.ToastUtils;
import com.zing.zalo.zinstant.zom.node.ZOM;
import com.zing.zalo.zvideoutil.ZVideoUtilMetadata;
import en0.InterfaceC18509p;
import fn0.AbstractC19074t;
import hm0.C20096c;
import hm0.InterfaceC20094a;
import ho0.AbstractC20110a;
import io.AbstractC20641e;
import io.C20637a;
import io.C20638b;
import io.C20639c;
import io.C20640d;
import java.util.ArrayList;
import java.util.List;
import jo.C21322c;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import me0.AbstractC23136l9;
import org.json.JSONObject;
import p205hc.AbstractC19962a;
import p205hc.InterfaceC19966e;
import p205hc.InterfaceC19968g;
import p236ic.AbstractC20504a;
import p302ko.C21785g;
import p304ks.C21912a;
import p304ks.C21937w;
import p361nb.C23648e;
import p455qo.C25429q;
import p458qr.AbstractC25468a;
import p458qr.C25470c;
import p716zh.C31980jc;
import p716zh.C32123ta;
import pm0.AbstractC24862s;
import pm0.C24848g0;
import qm0.AbstractC25366r;
import to.C26852b;
import to.C26854d;
import vm0.AbstractC28298d;
import wm0.AbstractC29094b;
import wm0.AbstractC29104l;

/* renamed from: go.c */
/* loaded from: classes4.dex */
public final class C19524c extends AbstractC19962a implements InterfaceC19966e {

    /* renamed from: A */
    private BottomSheetMenuBundleDataPrivacyQuickSetting f96891A;

    /* renamed from: B */
    private C20638b f96892B;

    /* renamed from: C */
    private AbstractC20641e f96893C;

    /* renamed from: D */
    private int f96894D;

    /* renamed from: E */
    private boolean f96895E;

    /* renamed from: F */
    private boolean f96896F;

    /* renamed from: t */
    private final C21322c f96897t;

    /* renamed from: u */
    private final C21785g f96898u;

    /* renamed from: v */
    private BottomSheetMenuBundleData f96899v;

    /* renamed from: w */
    private List f96900w;

    /* renamed from: x */
    private C20637a f96901x;

    /* renamed from: y */
    private String f96902y;

    /* renamed from: z */
    private BottomSheetMenuBundleDataPhotoViewfull f96903z;

    /* renamed from: go.c$a */
    /* loaded from: classes4.dex */
    public static final class a implements InterfaceC20094a {

        /* renamed from: b */
        final /* synthetic */ ContactProfile f96905b;

        a(ContactProfile contactProfile) {
            this.f96905b = contactProfile;
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
            AbstractC19074t.m100208f(c20096c, "error_message");
            C19524c.this.m102050nq(false);
            if (((InterfaceC19522a) C19524c.this.m103742Dp()).mo45894h0()) {
                ((InterfaceC19522a) C19524c.this.m103742Dp()).mo49315c4();
                ToastUtils.showMess(AbstractC23136l9.m118743r0(AbstractC8020f0.error_message));
                C19524c.this.m102047jq();
            }
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            AbstractC19074t.m100208f(obj, "entity");
            C19524c.this.m102050nq(false);
            C21912a.m114159g().m114162b(this.f96905b);
            BottomSheetMenuBundleDataPrivacyQuickSetting m102035Np = C19524c.this.m102035Np();
            if (m102035Np != null) {
                m102035Np.m45559d(Boolean.TRUE);
            }
            if (((InterfaceC19522a) C19524c.this.m103742Dp()).mo45894h0()) {
                ((InterfaceC19522a) C19524c.this.m103742Dp()).mo49315c4();
                ToastUtils.showMess(AbstractC23136l9.m118743r0(AbstractC8020f0.str_toast_hide_my_timeline_from_friend_successfully));
                C19524c.this.m102047jq();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: go.c$b */
    /* loaded from: classes4.dex */
    public static final class b extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        int f96906t;

        /* renamed from: u */
        final /* synthetic */ ContactProfile f96907u;

        /* renamed from: v */
        final /* synthetic */ TrackingSource f96908v;

        /* renamed from: w */
        final /* synthetic */ C19524c f96909w;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: go.c$b$a */
        /* loaded from: classes4.dex */
        public static final class a implements FlowCollector {

            /* renamed from: p */
            final /* synthetic */ C19524c f96910p;

            /* renamed from: q */
            final /* synthetic */ ContactProfile f96911q;

            a(C19524c c19524c, ContactProfile contactProfile) {
                this.f96910p = c19524c;
                this.f96911q = contactProfile;
            }

            @Override // kotlinx.coroutines.flow.FlowCollector
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object mo12109b(AbstractC25468a abstractC25468a, Continuation continuation) {
                if (abstractC25468a instanceof AbstractC25468a.c) {
                    ((InterfaceC19522a) this.f96910p.m103742Dp()).mo49315c4();
                    InterfaceC19522a interfaceC19522a = (InterfaceC19522a) this.f96910p.m103742Dp();
                    String m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_toast_unsubcribed_friend_successfully);
                    AbstractC19074t.m100207e(m118743r0, "getString(...)");
                    interfaceC19522a.mo78936E(m118743r0);
                    C21937w.f108027a.m114568f(this.f96911q);
                    BottomSheetMenuBundleDataPrivacyQuickSetting m102035Np = this.f96910p.m102035Np();
                    if (m102035Np != null) {
                        m102035Np.m45561f(AbstractC29094b.m145339a(true));
                    }
                    this.f96910p.m102047jq();
                } else if (abstractC25468a instanceof AbstractC25468a.a) {
                    ((InterfaceC19522a) this.f96910p.m103742Dp()).mo49315c4();
                    InterfaceC19522a interfaceC19522a2 = (InterfaceC19522a) this.f96910p.m103742Dp();
                    String m118743r02 = AbstractC23136l9.m118743r0(AbstractC8020f0.error_message);
                    AbstractC19074t.m100207e(m118743r02, "getString(...)");
                    interfaceC19522a2.mo78936E(m118743r02);
                    this.f96910p.m102047jq();
                } else if (abstractC25468a instanceof AbstractC25468a.b) {
                    ((InterfaceC19522a) this.f96910p.m103742Dp()).mo46829Y();
                }
                return C24848g0.f119245a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(ContactProfile contactProfile, TrackingSource trackingSource, C19524c c19524c, Continuation continuation) {
            super(2, continuation);
            this.f96907u = contactProfile;
            this.f96908v = trackingSource;
            this.f96909w = c19524c;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            return new b(this.f96907u, this.f96908v, this.f96909w, continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            Object m142578e;
            List m131496e;
            m142578e = AbstractC28298d.m142578e();
            int i11 = this.f96906t;
            if (i11 != 0) {
                if (i11 != 1) {
                    if (i11 == 2) {
                        AbstractC24862s.m129228b(obj);
                        return C24848g0.f119245a;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC24862s.m129228b(obj);
            } else {
                AbstractC24862s.m129228b(obj);
                C26852b c26852b = new C26852b(null, 1, null);
                m131496e = AbstractC25366r.m131496e(this.f96907u.f42434r);
                C26852b.a aVar = new C26852b.a(m131496e, this.f96908v);
                this.f96906t = 1;
                obj = c26852b.m101498a(aVar, this);
                if (obj == m142578e) {
                    return m142578e;
                }
            }
            Flow flow = (Flow) obj;
            if (flow != null) {
                a aVar2 = new a(this.f96909w, this.f96907u);
                this.f96906t = 2;
                if (flow.mo97893a(aVar2, this) == m142578e) {
                    return m142578e;
                }
            }
            return C24848g0.f119245a;
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: r, reason: merged with bridge method [inline-methods] */
        public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
            return ((b) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* renamed from: go.c$c */
    /* loaded from: classes4.dex */
    public static final class c implements InterfaceC20094a {

        /* renamed from: b */
        final /* synthetic */ ContactProfile f96913b;

        c(ContactProfile contactProfile) {
            this.f96913b = contactProfile;
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
            AbstractC19074t.m100208f(c20096c, "error_message");
            C19524c.this.m102051oq(false);
            if (((InterfaceC19522a) C19524c.this.m103742Dp()).mo45894h0()) {
                ((InterfaceC19522a) C19524c.this.m103742Dp()).mo49315c4();
                ToastUtils.showMess(AbstractC23136l9.m118743r0(AbstractC8020f0.error_message));
                C19524c.this.m102047jq();
            }
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            AbstractC19074t.m100208f(obj, "entity");
            try {
                C19524c.this.m102051oq(false);
                C21912a.m114159g().m114173o(this.f96913b.f42434r);
                BottomSheetMenuBundleDataPrivacyQuickSetting m102035Np = C19524c.this.m102035Np();
                if (m102035Np != null) {
                    m102035Np.m45559d(Boolean.FALSE);
                }
                if (((InterfaceC19522a) C19524c.this.m103742Dp()).mo45894h0()) {
                    ((InterfaceC19522a) C19524c.this.m103742Dp()).mo49315c4();
                    C19524c.this.m102047jq();
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: go.c$d */
    /* loaded from: classes4.dex */
    public static final class d extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        int f96914t;

        /* renamed from: u */
        final /* synthetic */ ContactProfile f96915u;

        /* renamed from: v */
        final /* synthetic */ TrackingSource f96916v;

        /* renamed from: w */
        final /* synthetic */ C19524c f96917w;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: go.c$d$a */
        /* loaded from: classes4.dex */
        public static final class a implements FlowCollector {

            /* renamed from: p */
            final /* synthetic */ C19524c f96918p;

            /* renamed from: q */
            final /* synthetic */ ContactProfile f96919q;

            a(C19524c c19524c, ContactProfile contactProfile) {
                this.f96918p = c19524c;
                this.f96919q = contactProfile;
            }

            @Override // kotlinx.coroutines.flow.FlowCollector
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object mo12109b(AbstractC25468a abstractC25468a, Continuation continuation) {
                if (abstractC25468a instanceof AbstractC25468a.c) {
                    ((InterfaceC19522a) this.f96918p.m103742Dp()).mo49315c4();
                    C21937w.f108027a.m114576o(this.f96919q.f42434r);
                    BottomSheetMenuBundleDataPrivacyQuickSetting m102035Np = this.f96918p.m102035Np();
                    if (m102035Np != null) {
                        m102035Np.m45561f(AbstractC29094b.m145339a(false));
                    }
                    this.f96918p.m102047jq();
                } else if (abstractC25468a instanceof AbstractC25468a.a) {
                    ((InterfaceC19522a) this.f96918p.m103742Dp()).mo49315c4();
                    InterfaceC19522a interfaceC19522a = (InterfaceC19522a) this.f96918p.m103742Dp();
                    String m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.error_message);
                    AbstractC19074t.m100207e(m118743r0, "getString(...)");
                    interfaceC19522a.mo78936E(m118743r0);
                    this.f96918p.m102047jq();
                } else if (abstractC25468a instanceof AbstractC25468a.b) {
                    ((InterfaceC19522a) this.f96918p.m103742Dp()).mo46829Y();
                }
                return C24848g0.f119245a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(ContactProfile contactProfile, TrackingSource trackingSource, C19524c c19524c, Continuation continuation) {
            super(2, continuation);
            this.f96915u = contactProfile;
            this.f96916v = trackingSource;
            this.f96917w = c19524c;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            return new d(this.f96915u, this.f96916v, this.f96917w, continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            Object m142578e;
            m142578e = AbstractC28298d.m142578e();
            int i11 = this.f96914t;
            if (i11 != 0) {
                if (i11 != 1) {
                    if (i11 == 2) {
                        AbstractC24862s.m129228b(obj);
                        return C24848g0.f119245a;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC24862s.m129228b(obj);
            } else {
                AbstractC24862s.m129228b(obj);
                C26854d c26854d = new C26854d(null, 1, null);
                C26854d.a aVar = new C26854d.a(this.f96915u, this.f96916v);
                this.f96914t = 1;
                obj = c26854d.m101498a(aVar, this);
                if (obj == m142578e) {
                    return m142578e;
                }
            }
            Flow flow = (Flow) obj;
            if (flow != null) {
                a aVar2 = new a(this.f96917w, this.f96915u);
                this.f96914t = 2;
                if (flow.mo97893a(aVar2, this) == m142578e) {
                    return m142578e;
                }
            }
            return C24848g0.f119245a;
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: r, reason: merged with bridge method [inline-methods] */
        public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
            return ((d) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C19524c(BottomSheetMenuView bottomSheetMenuView, C21322c c21322c, C21785g c21785g) {
        super(bottomSheetMenuView);
        AbstractC19074t.m100208f(bottomSheetMenuView, "mvpView");
        AbstractC19074t.m100208f(c21322c, "bottomSheetMenuRepo");
        AbstractC19074t.m100208f(c21785g, "feedRepo");
        this.f96897t = c21322c;
        this.f96898u = c21785g;
        this.f96900w = new ArrayList();
        this.f96902y = "";
    }

    /* renamed from: Tp */
    private final void m102019Tp(C20637a c20637a) {
        this.f96901x = c20637a;
        if (c20637a != null) {
            this.f96900w.clear();
            this.f96900w = this.f96897t.mo110389b(c20637a.m107540b(), c20637a.m107542d(), c20637a.m107545g());
        }
    }

    /* renamed from: Wp */
    private final void m102020Wp(C20637a c20637a) {
        this.f96901x = c20637a;
        if (c20637a != null) {
            this.f96900w.clear();
            this.f96900w = this.f96897t.mo110391d(c20637a.m107541c(), c20637a.m107544f(), c20637a.m107545g(), c20637a.m107543e(), c20637a.m107539a());
        }
    }

    /* renamed from: Xp */
    private final void m102021Xp(C20637a c20637a) {
        this.f96901x = c20637a;
        if (c20637a != null) {
            this.f96900w.clear();
            this.f96900w = this.f96897t.mo110392e(c20637a.m107541c());
        }
    }

    /* renamed from: Yp */
    private final void m102022Yp(C20637a c20637a) {
        this.f96901x = c20637a;
        if (c20637a != null) {
            this.f96900w.clear();
            this.f96900w = this.f96897t.mo110398k(c20637a.m107541c(), c20637a.m107545g());
        }
    }

    /* renamed from: Zp */
    private final void m102023Zp(C20637a c20637a) {
        this.f96901x = c20637a;
        if (c20637a != null) {
            this.f96900w.clear();
            this.f96900w = this.f96897t.mo110395h(c20637a);
        }
    }

    /* renamed from: aq */
    private final void m102024aq(String str) {
        this.f96902y = str;
        if (str != null) {
            this.f96900w.clear();
            this.f96900w = this.f96897t.mo110393f();
        }
    }

    /* renamed from: bq */
    private final void m102025bq(BottomSheetMenuBundleDataPhotoViewfull bottomSheetMenuBundleDataPhotoViewfull) {
        this.f96903z = bottomSheetMenuBundleDataPhotoViewfull;
        if (bottomSheetMenuBundleDataPhotoViewfull != null) {
            this.f96900w.clear();
            this.f96900w = this.f96897t.mo110394g(bottomSheetMenuBundleDataPhotoViewfull);
        }
    }

    /* renamed from: cq */
    private final void m102026cq(BottomSheetMenuBundleDataPrivacyQuickSetting bottomSheetMenuBundleDataPrivacyQuickSetting) {
        this.f96891A = bottomSheetMenuBundleDataPrivacyQuickSetting;
        if (bottomSheetMenuBundleDataPrivacyQuickSetting != null) {
            this.f96900w.clear();
            this.f96900w = this.f96897t.mo110397j(bottomSheetMenuBundleDataPrivacyQuickSetting);
        }
    }

    /* renamed from: dq */
    private final void m102027dq(C20638b c20638b) {
        this.f96892B = c20638b;
        if (c20638b != null) {
            this.f96900w.clear();
            this.f96900w = this.f96897t.mo110390c(c20638b);
        }
    }

    /* renamed from: eq */
    private final void m102028eq(BottomSheetMenuBundleDataPhotoViewfull bottomSheetMenuBundleDataPhotoViewfull) {
        this.f96903z = bottomSheetMenuBundleDataPhotoViewfull;
        if (bottomSheetMenuBundleDataPhotoViewfull != null) {
            this.f96900w.clear();
            this.f96900w = this.f96897t.mo110396i(bottomSheetMenuBundleDataPhotoViewfull);
        }
    }

    /* renamed from: fq */
    private final void m102029fq(BottomSheetMenuBundleDataPhotoViewfull bottomSheetMenuBundleDataPhotoViewfull) {
        this.f96903z = bottomSheetMenuBundleDataPhotoViewfull;
        if (bottomSheetMenuBundleDataPhotoViewfull != null) {
            this.f96900w.clear();
            this.f96900w = this.f96897t.mo110388a(bottomSheetMenuBundleDataPhotoViewfull);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: kq */
    public static final void m102030kq(C19524c c19524c) {
        AbstractC19074t.m100208f(c19524c, "this$0");
        ((InterfaceC19522a) c19524c.m103742Dp()).mo45460Ii();
    }

    /* renamed from: rq */
    private final boolean m102031rq(BottomSheetMenuBundleData bottomSheetMenuBundleData) {
        C20637a c20637a;
        if (bottomSheetMenuBundleData != null) {
            c20637a = bottomSheetMenuBundleData.m45501a();
        } else {
            c20637a = null;
        }
        if (c20637a != null && (bottomSheetMenuBundleData.m45505e() == 1 || bottomSheetMenuBundleData.m45505e() == 3 || bottomSheetMenuBundleData.m45505e() == 4 || bottomSheetMenuBundleData.m45505e() == 5)) {
            return true;
        }
        return false;
    }

    /* renamed from: Jp */
    public final void m102032Jp(ContactProfile contactProfile, TrackingSource trackingSource) {
        AbstractC19074t.m100208f(contactProfile, "contactProfile");
        AbstractC19074t.m100208f(trackingSource, "trackingSource");
        String str = "[" + contactProfile.f42434r + "]";
        if (this.f96895E) {
            return;
        }
        this.f96895E = true;
        C0815e1.m2075D().m2100V(new C23648e(23, "", 0, "social_profile_privacy_block_on", new String[0]), false);
        a aVar = new a(contactProfile);
        ((InterfaceC19522a) m103742Dp()).mo46829Y();
        this.f96898u.mo112357Y(str, aVar, trackingSource);
    }

    /* renamed from: Kp */
    public final void m102033Kp(ContactProfile contactProfile, TrackingSource trackingSource) {
        AbstractC19074t.m100208f(contactProfile, "contactProfile");
        AbstractC19074t.m100208f(trackingSource, "trackingSource");
        C0815e1.m2075D().m2100V(new C23648e(23, "", 0, "social_profile_privacy_hide_on", new String[0]), false);
        BuildersKt__Builders_commonKt.m112540d(AbstractC20504a.m106544a(this), null, null, new b(contactProfile, trackingSource, this, null), 3, null);
    }

    /* renamed from: Mp */
    public final List m102034Mp() {
        return this.f96900w;
    }

    /* renamed from: Np */
    public final BottomSheetMenuBundleDataPrivacyQuickSetting m102035Np() {
        return this.f96891A;
    }

    /* renamed from: Op */
    public final int m102036Op() {
        return this.f96894D;
    }

    /* renamed from: Pp */
    public BottomSheetMenuResult m102037Pp() {
        int i11;
        BottomSheetMenuResult bottomSheetMenuResult = new BottomSheetMenuResult();
        BottomSheetMenuBundleData bottomSheetMenuBundleData = this.f96899v;
        int i12 = 0;
        if (bottomSheetMenuBundleData != null) {
            i11 = bottomSheetMenuBundleData.m45505e();
        } else {
            i11 = 0;
        }
        bottomSheetMenuResult.m45576m(i11);
        C20637a c20637a = null;
        C20638b c20638b = null;
        BottomSheetMenuBundleDataPrivacyQuickSetting bottomSheetMenuBundleDataPrivacyQuickSetting = null;
        C20637a c20637a2 = null;
        BottomSheetMenuBundleDataPhotoViewfull bottomSheetMenuBundleDataPhotoViewfull = null;
        BottomSheetMenuBundleDataPhotoViewfull bottomSheetMenuBundleDataPhotoViewfull2 = null;
        BottomSheetMenuBundleDataPhotoViewfull bottomSheetMenuBundleDataPhotoViewfull3 = null;
        C20637a c20637a3 = null;
        C20637a c20637a4 = null;
        C20637a c20637a5 = null;
        switch (bottomSheetMenuResult.m45569e()) {
            case 1:
                BottomSheetMenuBundleData bottomSheetMenuBundleData2 = this.f96899v;
                if (bottomSheetMenuBundleData2 != null) {
                    c20637a = bottomSheetMenuBundleData2.m45501a();
                }
                bottomSheetMenuResult.m45572i(c20637a);
                break;
            case 2:
                bottomSheetMenuResult.m45577n(this.f96902y);
                break;
            case 3:
                BottomSheetMenuBundleData bottomSheetMenuBundleData3 = this.f96899v;
                if (bottomSheetMenuBundleData3 != null) {
                    c20637a5 = bottomSheetMenuBundleData3.m45501a();
                }
                bottomSheetMenuResult.m45572i(c20637a5);
                break;
            case 4:
                BottomSheetMenuBundleData bottomSheetMenuBundleData4 = this.f96899v;
                if (bottomSheetMenuBundleData4 != null) {
                    c20637a4 = bottomSheetMenuBundleData4.m45501a();
                }
                bottomSheetMenuResult.m45572i(c20637a4);
                break;
            case 5:
                BottomSheetMenuBundleData bottomSheetMenuBundleData5 = this.f96899v;
                if (bottomSheetMenuBundleData5 != null) {
                    c20637a3 = bottomSheetMenuBundleData5.m45501a();
                }
                bottomSheetMenuResult.m45572i(c20637a3);
                break;
            case 6:
                BottomSheetMenuBundleData bottomSheetMenuBundleData6 = this.f96899v;
                if (bottomSheetMenuBundleData6 != null) {
                    bottomSheetMenuBundleDataPhotoViewfull3 = bottomSheetMenuBundleData6.m45502b();
                }
                bottomSheetMenuResult.m45573j(bottomSheetMenuBundleDataPhotoViewfull3);
                break;
            case 7:
                BottomSheetMenuBundleData bottomSheetMenuBundleData7 = this.f96899v;
                if (bottomSheetMenuBundleData7 != null) {
                    bottomSheetMenuBundleDataPhotoViewfull2 = bottomSheetMenuBundleData7.m45502b();
                }
                bottomSheetMenuResult.m45573j(bottomSheetMenuBundleDataPhotoViewfull2);
                break;
            case 8:
                BottomSheetMenuBundleData bottomSheetMenuBundleData8 = this.f96899v;
                if (bottomSheetMenuBundleData8 != null) {
                    bottomSheetMenuBundleDataPhotoViewfull = bottomSheetMenuBundleData8.m45502b();
                }
                bottomSheetMenuResult.m45573j(bottomSheetMenuBundleDataPhotoViewfull);
                break;
            case 9:
                BottomSheetMenuBundleData bottomSheetMenuBundleData9 = this.f96899v;
                if (bottomSheetMenuBundleData9 != null) {
                    c20637a2 = bottomSheetMenuBundleData9.m45501a();
                }
                bottomSheetMenuResult.m45572i(c20637a2);
                break;
            case 10:
                BottomSheetMenuBundleData bottomSheetMenuBundleData10 = this.f96899v;
                if (bottomSheetMenuBundleData10 != null) {
                    bottomSheetMenuBundleDataPrivacyQuickSetting = bottomSheetMenuBundleData10.m45503c();
                }
                bottomSheetMenuResult.m45574k(bottomSheetMenuBundleDataPrivacyQuickSetting);
                break;
            case 11:
                BottomSheetMenuBundleData bottomSheetMenuBundleData11 = this.f96899v;
                if (bottomSheetMenuBundleData11 != null) {
                    c20638b = bottomSheetMenuBundleData11.m45504d();
                }
                bottomSheetMenuResult.m45575l(c20638b);
                break;
        }
        AbstractC20641e abstractC20641e = this.f96893C;
        if (abstractC20641e != null) {
            i12 = abstractC20641e.m107579b();
        }
        bottomSheetMenuResult.m45578o(i12);
        return bottomSheetMenuResult;
    }

    /* renamed from: Qp */
    public void m102038Qp(C20640d c20640d) {
        ContactProfile contactProfile;
        AbstractC19074t.m100208f(c20640d, "data");
        BottomSheetMenuBundleDataPrivacyQuickSetting bottomSheetMenuBundleDataPrivacyQuickSetting = this.f96891A;
        if (bottomSheetMenuBundleDataPrivacyQuickSetting != null) {
            if (bottomSheetMenuBundleDataPrivacyQuickSetting != null) {
                contactProfile = bottomSheetMenuBundleDataPrivacyQuickSetting.m45556a();
            } else {
                contactProfile = null;
            }
            if (contactProfile != null) {
                BottomSheetMenuBundleDataPrivacyQuickSetting bottomSheetMenuBundleDataPrivacyQuickSetting2 = this.f96891A;
                if ((bottomSheetMenuBundleDataPrivacyQuickSetting2 != null && AbstractC19074t.m100204b(bottomSheetMenuBundleDataPrivacyQuickSetting2.m45557b(), Boolean.TRUE)) || C21912a.m114159g().m114169j(contactProfile.f42434r)) {
                    m102048lq(contactProfile, new TrackingSource(104));
                } else {
                    m102032Jp(contactProfile, new TrackingSource(104));
                }
            }
        }
    }

    /* renamed from: Rp */
    public void m102039Rp() {
        AbstractC20641e abstractC20641e;
        JSONObject jSONObject;
        if (AbstractC19074t.m100204b(new C25429q().m101506a(), Boolean.TRUE) && (abstractC20641e = this.f96893C) != null && abstractC20641e.m107579b() == 43) {
            C20637a c20637a = this.f96901x;
            C20638b c20638b = this.f96892B;
            if (c20637a != null) {
                ((InterfaceC19522a) m103742Dp()).mo45461Nl(c20637a.m107554r());
                return;
            }
            if (c20638b != null) {
                try {
                    C31980jc m107555a = c20638b.m107555a();
                    if (m107555a != null) {
                        C32123ta m153825r = m107555a.m153825r();
                        if (m153825r != null) {
                            jSONObject = m153825r.m155082i0();
                        } else {
                            jSONObject = null;
                        }
                        if (jSONObject != null) {
                            ((InterfaceC19522a) m103742Dp()).mo45461Nl(jSONObject.toString());
                        }
                    }
                } catch (Exception e11) {
                    AbstractC20110a.f98889a.mo104552e(e11);
                }
            }
        }
    }

    /* renamed from: Sp */
    public void m102040Sp(C20640d c20640d) {
        ContactProfile contactProfile;
        AbstractC19074t.m100208f(c20640d, "data");
        BottomSheetMenuBundleDataPrivacyQuickSetting bottomSheetMenuBundleDataPrivacyQuickSetting = this.f96891A;
        if (bottomSheetMenuBundleDataPrivacyQuickSetting != null) {
            if (bottomSheetMenuBundleDataPrivacyQuickSetting != null) {
                contactProfile = bottomSheetMenuBundleDataPrivacyQuickSetting.m45556a();
            } else {
                contactProfile = null;
            }
            if (contactProfile != null) {
                BottomSheetMenuBundleDataPrivacyQuickSetting bottomSheetMenuBundleDataPrivacyQuickSetting2 = this.f96891A;
                if ((bottomSheetMenuBundleDataPrivacyQuickSetting2 != null && AbstractC19074t.m100204b(bottomSheetMenuBundleDataPrivacyQuickSetting2.m45558c(), Boolean.TRUE)) || C21937w.f108027a.m114574m(contactProfile.f42434r)) {
                    m102049mq(contactProfile, new TrackingSource(104));
                } else {
                    m102033Kp(contactProfile, new TrackingSource(104));
                }
            }
        }
    }

    /* renamed from: b */
    public final void m102041b(C25470c c25470c) {
        AbstractC19074t.m100208f(c25470c, "dataRetain");
        try {
            this.f96899v = (BottomSheetMenuBundleData) c25470c.m131941d("bundleData");
            this.f96894D = c25470c.m131940c("hiddenAreaHeight", 0);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: c */
    public final C25470c m102042c() {
        C25470c c25470c = new C25470c();
        c25470c.m131947j("bundleData", this.f96899v);
        c25470c.m131946i("hiddenAreaHeight", this.f96894D);
        return c25470c;
    }

    /* renamed from: d */
    public void m102043d() {
        BottomSheetMenuBundleData bottomSheetMenuBundleData = this.f96899v;
        if (bottomSheetMenuBundleData != null) {
            switch (bottomSheetMenuBundleData.m45505e()) {
                case 1:
                    m102019Tp(bottomSheetMenuBundleData.m45501a());
                    return;
                case 2:
                    m102024aq(bottomSheetMenuBundleData.m45506f());
                    return;
                case 3:
                    m102020Wp(bottomSheetMenuBundleData.m45501a());
                    return;
                case 4:
                    m102022Yp(bottomSheetMenuBundleData.m45501a());
                    return;
                case 5:
                    m102021Xp(bottomSheetMenuBundleData.m45501a());
                    return;
                case 6:
                    m102028eq(bottomSheetMenuBundleData.m45502b());
                    return;
                case 7:
                    m102029fq(bottomSheetMenuBundleData.m45502b());
                    return;
                case 8:
                    m102025bq(bottomSheetMenuBundleData.m45502b());
                    return;
                case 9:
                    m102023Zp(bottomSheetMenuBundleData.m45501a());
                    return;
                case 10:
                    m102026cq(bottomSheetMenuBundleData.m45503c());
                    return;
                case 11:
                    m102027dq(bottomSheetMenuBundleData.m45504d());
                    return;
                default:
                    return;
            }
        }
    }

    /* renamed from: gq */
    public final boolean m102044gq(BottomSheetMenuBundleData bottomSheetMenuBundleData, C20637a c20637a) {
        C3020p0 c3020p0;
        if (bottomSheetMenuBundleData == null || c20637a == null) {
            return false;
        }
        if (bottomSheetMenuBundleData.m45505e() == 1) {
            C3000l0 m107540b = c20637a.m107540b();
            if (m107540b != null) {
                c3020p0 = m107540b.m14325c0(c20637a.m107542d());
            } else {
                c3020p0 = null;
            }
            if (c3020p0 == null || !c3020p0.m14494Y()) {
                return false;
            }
        } else {
            C3020p0 m107541c = c20637a.m107541c();
            if (m107541c == null || !m107541c.m14494Y()) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:39:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0078 A[PHI: r0
  0x0078: PHI (r0v7 java.lang.String) = (r0v6 java.lang.String), (r0v8 java.lang.String) binds: [B:14:0x002e, B:16:0x0037] A[DONT_GENERATE, DONT_INLINE]] */
    /* renamed from: hq */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void m102045hq(C20639c c20639c) {
        String str;
        String str2;
        C3020p0 c3020p0;
        String str3;
        C3000l0 m107540b;
        AbstractC19074t.m100208f(c20639c, "data");
        if (c20639c.m107578a() != 3) {
            return;
        }
        int m107579b = c20639c.m107579b();
        if (m107579b != 3) {
            if (m107579b != 41) {
                str = "setting_hide_ad";
                if (m107579b != 15) {
                    if (m107579b != 16) {
                        String str4 = "setting_delete_friend_post";
                        C20637a c20637a = null;
                        String str5 = null;
                        switch (m107579b) {
                            case 5:
                                str = "setting_hide_banner";
                                break;
                            case 6:
                                break;
                            case 7:
                                str = "setting_report_ad";
                                break;
                            case 8:
                                if (m102031rq(this.f96899v)) {
                                    BottomSheetMenuBundleData bottomSheetMenuBundleData = this.f96899v;
                                    if (bottomSheetMenuBundleData != null) {
                                        c20637a = bottomSheetMenuBundleData.m45501a();
                                    }
                                    if (!m102044gq(this.f96899v, c20637a)) {
                                        str = "setting_delete_friend_post";
                                        break;
                                    } else {
                                        str = "setting_delete_my_post";
                                        break;
                                    }
                                }
                                str2 = "";
                                break;
                            case 9:
                                str2 = "setting_report";
                                break;
                            case 10:
                                str2 = "setting_remove_tag";
                                break;
                            case 11:
                                str = "setting_edit_post";
                                break;
                            case 12:
                                str2 = str4;
                                break;
                            case 13:
                                str = "setting_hide_post";
                                break;
                            default:
                                str = "setting_post_on_timeline";
                                str4 = "setting_save_photo";
                                switch (m107579b) {
                                    case 22:
                                    case 29:
                                        break;
                                    case 23:
                                    case 28:
                                        break;
                                    case 24:
                                    case ZOM.FLAG_RELATIVE_VISIBILITY_CHANGED /* 32 */:
                                        str2 = "setting_share";
                                        break;
                                    case 25:
                                    case 26:
                                        break;
                                    case 27:
                                    case ZVideoUtilMetadata.FF_PROFILE_H264_LEVEL_30 /* 30 */:
                                        str2 = "setting_delete_my_post";
                                        break;
                                    case 31:
                                        break;
                                    case 33:
                                        break;
                                    case 34:
                                        C20637a c20637a2 = this.f96901x;
                                        if (c20637a2 != null) {
                                            if (c20637a2 != null && (m107540b = c20637a2.m107540b()) != null) {
                                                c3020p0 = m107540b.m14325c0(c20637a2.m107542d());
                                            } else {
                                                c3020p0 = null;
                                            }
                                            if (c3020p0 == null) {
                                                str = "";
                                                break;
                                            } else {
                                                C21912a m114159g = C21912a.m114159g();
                                                C3047v0 c3047v0 = c3020p0.f12022B;
                                                if (c3047v0 != null) {
                                                    str5 = c3047v0.f12280b;
                                                }
                                                if (m114159g.m114169j(str5)) {
                                                    str3 = "social_bottom_sheet_unblock";
                                                } else {
                                                    str3 = "social_bottom_sheet_block";
                                                }
                                                str = str3;
                                                break;
                                            }
                                        }
                                        str2 = "";
                                        break;
                                    default:
                                        str2 = "";
                                        break;
                                }
                        }
                        if (!TextUtils.isEmpty(str2)) {
                            C0815e1.m2075D().m2100V(new C23648e(15, "bottom_sheet_menu", 0, str2, new String[0]), false);
                            return;
                        }
                        return;
                    }
                    str2 = "setting_on_off_notification";
                    if (!TextUtils.isEmpty(str2)) {
                    }
                }
            } else {
                str = "social_bottom_sheet_unfriend";
            }
        } else {
            str = "setting_edit_privacy";
        }
        str2 = str;
        if (!TextUtils.isEmpty(str2)) {
        }
    }

    /* renamed from: iq */
    public void m102046iq(C8538a c8538a, InterfaceC19968g interfaceC19968g) {
        super.mo995Nd(c8538a, interfaceC19968g);
        if (c8538a != null) {
            this.f96899v = c8538a.m45467a();
        }
    }

    /* renamed from: jq */
    public final void m102047jq() {
        BottomSheetMenuBundleDataPrivacyQuickSetting bottomSheetMenuBundleDataPrivacyQuickSetting = this.f96891A;
        if (bottomSheetMenuBundleDataPrivacyQuickSetting != null) {
            this.f96900w.clear();
            this.f96900w = this.f96897t.mo110397j(bottomSheetMenuBundleDataPrivacyQuickSetting);
        }
        ((InterfaceC19522a) m103742Dp()).mo70710wy(new Runnable() { // from class: go.b
            @Override // java.lang.Runnable
            public final void run() {
                C19524c.m102030kq(C19524c.this);
            }
        });
    }

    /* renamed from: lq */
    public final void m102048lq(ContactProfile contactProfile, TrackingSource trackingSource) {
        AbstractC19074t.m100208f(contactProfile, "contactProfile");
        AbstractC19074t.m100208f(trackingSource, "trackingSource");
        if (this.f96896F) {
            return;
        }
        this.f96896F = true;
        C0815e1.m2075D().m2100V(new C23648e(23, "", 0, "social_profile_privacy_block_off", new String[0]), false);
        c cVar = new c(contactProfile);
        ((InterfaceC19522a) m103742Dp()).mo46829Y();
        C21785g c21785g = this.f96898u;
        String str = contactProfile.f42434r;
        AbstractC19074t.m100207e(str, "uid");
        c21785g.mo112355O(str, cVar, trackingSource);
    }

    /* renamed from: mq */
    public final void m102049mq(ContactProfile contactProfile, TrackingSource trackingSource) {
        AbstractC19074t.m100208f(contactProfile, "contactProfile");
        AbstractC19074t.m100208f(trackingSource, "trackingSource");
        C0815e1.m2075D().m2100V(new C23648e(23, "", 0, "social_profile_privacy_hide_off", new String[0]), false);
        BuildersKt__Builders_commonKt.m112540d(AbstractC20504a.m106544a(this), null, null, new d(contactProfile, trackingSource, this, null), 3, null);
    }

    /* renamed from: nq */
    public final void m102050nq(boolean z11) {
        this.f96895E = z11;
    }

    /* renamed from: oq */
    public final void m102051oq(boolean z11) {
        this.f96896F = z11;
    }

    /* renamed from: pq */
    public final void m102052pq(int i11) {
        this.f96894D = i11;
    }

    /* renamed from: qq */
    public final void m102053qq(AbstractC20641e abstractC20641e) {
        this.f96893C = abstractC20641e;
    }
}
