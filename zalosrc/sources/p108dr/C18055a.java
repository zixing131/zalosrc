package p108dr;

import ac.C0708i;
import ac.C0732w;
import ae.C0766k;
import ag0.C0824j;
import am.AbstractC0939u;
import am.C0927o;
import android.text.TextUtils;
import androidx.lifecycle.AbstractC1798u0;
import androidx.lifecycle.C1761c0;
import androidx.lifecycle.C1780l0;
import androidx.lifecycle.LiveData;
import androidx.work.AbstractC2144f;
import androidx.work.AbstractC2147g0;
import bi0.AbstractC2808b;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.camera.common.models.CameraInputParams;
import com.zing.zalo.control.ContactProfile;
import com.zing.zalo.control.TrackingSource;
import com.zing.zalo.feed.models.SongInfo;
import com.zing.zalo.feed.mvp.storymusic.model.StoryMusicAttachment;
import com.zing.zalo.p062db.C7960e;
import com.zing.zalo.story.usecase.story_interaction.HideOrReportAdsUseCase;
import com.zing.zalo.utils.ToastUtils;
import com.zing.zalo.zvideoutil.ZAbstractBase;
import com.zing.zalocore.CoreUtility;
import dj.C17994q1;
import en0.InterfaceC18509p;
import fn0.AbstractC19074t;
import gg0.AbstractC19444a;
import hm0.C20096c;
import hm0.InterfaceC20094a;
import is.C20834z0;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import l30.AbstractC22055v0;
import l30.C22021e0;
import l30.C22037m0;
import me0.AbstractC23112j7;
import me0.AbstractC23136l9;
import me0.AbstractC23161o1;
import me0.AbstractC23181q;
import me0.C23055e5;
import mj0.AbstractC23322a;
import mm0.AbstractC23350e;
import on0.AbstractC24341v;
import org.json.JSONArray;
import org.json.JSONObject;
import p108dr.C18055a;
import p205hc.AbstractC19963b;
import p304ks.C21927m;
import p348mi.AbstractC23304d;
import p348mi.AbstractC23306f;
import p363nh.C23744a;
import p458qr.AbstractC25468a;
import p716zh.C31965ic;
import p716zh.C31980jc;
import p716zh.C32123ta;
import pm0.AbstractC24862s;
import pm0.C24848g0;
import pm0.C24860q;
import q30.C25106c;
import q30.C25107d;
import qm0.AbstractC25332a0;
import qm0.AbstractC25368s;
import qm0.AbstractC25378x;
import sn.C26333b;
import sx.C26406h;
import vg.C28203u6;
import vm0.AbstractC28298d;
import wd0.C28927g;
import wm0.AbstractC29094b;
import wm0.AbstractC29104l;

/* renamed from: dr.a */
/* loaded from: classes4.dex */
public final class C18055a extends AbstractC19963b {

    /* renamed from: A */
    private Job f91354A;

    /* renamed from: B */
    private final C1761c0 f91355B;

    /* renamed from: C */
    private final C1761c0 f91356C;

    /* renamed from: D */
    private final C1761c0 f91357D;

    /* renamed from: E */
    private final C1761c0 f91358E;

    /* renamed from: F */
    private final C1761c0 f91359F;

    /* renamed from: G */
    private final C1761c0 f91360G;

    /* renamed from: H */
    private final C1761c0 f91361H;

    /* renamed from: I */
    private boolean f91362I;

    /* renamed from: J */
    private boolean f91363J;

    /* renamed from: K */
    private Map f91364K;

    /* renamed from: L */
    private Map f91365L;

    /* renamed from: M */
    private Map f91366M;

    /* renamed from: N */
    private final Map f91367N;

    /* renamed from: O */
    private final Map f91368O;

    /* renamed from: P */
    private C32123ta f91369P;

    /* renamed from: Q */
    private final Set f91370Q;

    /* renamed from: R */
    private String f91371R;

    /* renamed from: S */
    private final Set f91372S;

    /* renamed from: T */
    private String f91373T;

    /* renamed from: U */
    private int f91374U;

    /* renamed from: V */
    private int f91375V;

    /* renamed from: W */
    private int f91376W;

    /* renamed from: X */
    private int f91377X;

    /* renamed from: Y */
    private int f91378Y;

    /* renamed from: Z */
    private int f91379Z;

    /* renamed from: a0 */
    private int f91380a0;

    /* renamed from: b0 */
    private long f91381b0;

    /* renamed from: t */
    private final C25107d f91382t;

    /* renamed from: u */
    private final C25106c f91383u;

    /* renamed from: v */
    private final C1780l0 f91384v;

    /* renamed from: w */
    private final C1761c0 f91385w;

    /* renamed from: x */
    private final C1761c0 f91386x;

    /* renamed from: y */
    private final C1761c0 f91387y;

    /* renamed from: z */
    private final C1761c0 f91388z;

    /* renamed from: dr.a$a */
    /* loaded from: classes4.dex */
    public static final class a {

        /* renamed from: a */
        private final String f91389a;

        /* renamed from: b */
        private final int f91390b;

        /* renamed from: c */
        private final int f91391c;

        /* renamed from: d */
        private final int f91392d;

        public a(String str, int i11, int i12, int i13) {
            AbstractC19074t.m100208f(str, "description");
            this.f91389a = str;
            this.f91390b = i11;
            this.f91391c = i12;
            this.f91392d = i13;
        }

        /* renamed from: a */
        public final String m96002a() {
            return this.f91389a;
        }

        /* renamed from: b */
        public final int m96003b() {
            return this.f91392d;
        }

        /* renamed from: c */
        public final int m96004c() {
            return this.f91391c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return AbstractC19074t.m100204b(this.f91389a, aVar.f91389a) && this.f91390b == aVar.f91390b && this.f91391c == aVar.f91391c && this.f91392d == aVar.f91392d;
        }

        public int hashCode() {
            return (((((this.f91389a.hashCode() * 31) + this.f91390b) * 31) + this.f91391c) * 31) + this.f91392d;
        }

        public String toString() {
            return "SnackBarData(description=" + this.f91389a + ", timeout=" + this.f91390b + ", iconRes=" + this.f91391c + ", iconColor=" + this.f91392d + ")";
        }
    }

    /* renamed from: dr.a$b */
    /* loaded from: classes4.dex */
    public static final class b {

        /* renamed from: a */
        private final boolean f91393a;

        /* renamed from: b */
        private final long f91394b;

        public b(boolean z11, long j11) {
            this.f91393a = z11;
            this.f91394b = j11;
        }

        /* renamed from: a */
        public final long m96005a() {
            return this.f91394b;
        }

        /* renamed from: b */
        public final boolean m96006b() {
            return this.f91393a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.f91393a == bVar.f91393a && this.f91394b == bVar.f91394b;
        }

        public int hashCode() {
            return (AbstractC2144f.m11520a(this.f91393a) * 31) + AbstractC2147g0.m11521a(this.f91394b);
        }

        public String toString() {
            return "StoryLoadingInfo(isLoading=" + this.f91393a + ", progress=" + this.f91394b + ")";
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: dr.a$c */
    /* loaded from: classes4.dex */
    public static final class c extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        int f91395t;

        /* renamed from: u */
        final /* synthetic */ C32123ta f91396u;

        /* renamed from: v */
        final /* synthetic */ C31980jc f91397v;

        /* renamed from: w */
        final /* synthetic */ boolean f91398w;

        /* renamed from: x */
        final /* synthetic */ C18055a f91399x;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: dr.a$c$a */
        /* loaded from: classes4.dex */
        public static final class a implements FlowCollector {

            /* renamed from: p */
            final /* synthetic */ C18055a f91400p;

            a(C18055a c18055a) {
                this.f91400p = c18055a;
            }

            /* JADX INFO: Access modifiers changed from: private */
            /* renamed from: g */
            public static final void m96011g(C18055a c18055a) {
                AbstractC19074t.m100208f(c18055a, "this$0");
                c18055a.f91360G.mo9224q(C24848g0.f119245a);
                c18055a.f91386x.mo9224q(Boolean.TRUE);
            }

            /* JADX INFO: Access modifiers changed from: private */
            /* renamed from: j */
            public static final void m96012j(C18055a c18055a, AbstractC25468a abstractC25468a) {
                AbstractC19074t.m100208f(c18055a, "this$0");
                AbstractC19074t.m100208f(abstractC25468a, "$result");
                AbstractC25468a.c cVar = (AbstractC25468a.c) abstractC25468a;
                c18055a.f91359F.mo9224q(new C24860q(((HideOrReportAdsUseCase.C10917b) cVar.m131935a()).m56617d(), ((HideOrReportAdsUseCase.C10917b) cVar.m131935a()).m56614a()));
                c18055a.f91361H.mo9224q(C24848g0.f119245a);
                c18055a.f91386x.mo9224q(Boolean.FALSE);
                if (((HideOrReportAdsUseCase.C10917b) cVar.m131935a()).m56615b().length() > 0) {
                    c18055a.f91385w.mo9224q(((HideOrReportAdsUseCase.C10917b) cVar.m131935a()).m56615b());
                }
            }

            /* JADX INFO: Access modifiers changed from: private */
            /* renamed from: k */
            public static final void m96013k(C18055a c18055a, AbstractC25468a abstractC25468a) {
                AbstractC19074t.m100208f(c18055a, "this$0");
                AbstractC19074t.m100208f(abstractC25468a, "$result");
                c18055a.f91361H.mo9224q(C24848g0.f119245a);
                c18055a.f91386x.mo9224q(Boolean.FALSE);
                AbstractC25468a.a aVar = (AbstractC25468a.a) abstractC25468a;
                if (aVar.m131934a() instanceof HideOrReportAdsUseCase.ExceptionHideOrReportStoryAds) {
                    c18055a.f91385w.mo9224q(((HideOrReportAdsUseCase.ExceptionHideOrReportStoryAds) aVar.m131934a()).m56610a());
                }
            }

            @Override // kotlinx.coroutines.flow.FlowCollector
            /* renamed from: f, reason: merged with bridge method [inline-methods] */
            public final Object mo12109b(final AbstractC25468a abstractC25468a, Continuation continuation) {
                if (abstractC25468a instanceof AbstractC25468a.b) {
                    final C18055a c18055a = this.f91400p;
                    AbstractC19444a.m101695c(new Runnable() { // from class: dr.b
                        @Override // java.lang.Runnable
                        public final void run() {
                            C18055a.c.a.m96011g(C18055a.this);
                        }
                    });
                } else if (abstractC25468a instanceof AbstractC25468a.c) {
                    AbstractC25468a.c cVar = (AbstractC25468a.c) abstractC25468a;
                    if (((HideOrReportAdsUseCase.C10917b) cVar.m131935a()).m56616c().length() > 0) {
                        this.f91400p.f91358E.mo9221n(((HideOrReportAdsUseCase.C10917b) cVar.m131935a()).m56616c());
                    }
                    final C18055a c18055a2 = this.f91400p;
                    AbstractC19444a.m101694b(new Runnable() { // from class: dr.c
                        @Override // java.lang.Runnable
                        public final void run() {
                            C18055a.c.a.m96012j(C18055a.this, abstractC25468a);
                        }
                    }, 500L);
                } else if (abstractC25468a instanceof AbstractC25468a.a) {
                    final C18055a c18055a3 = this.f91400p;
                    AbstractC19444a.m101695c(new Runnable() { // from class: dr.d
                        @Override // java.lang.Runnable
                        public final void run() {
                            C18055a.c.a.m96013k(C18055a.this, abstractC25468a);
                        }
                    });
                }
                return C24848g0.f119245a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(C32123ta c32123ta, C31980jc c31980jc, boolean z11, C18055a c18055a, Continuation continuation) {
            super(2, continuation);
            this.f91396u = c32123ta;
            this.f91397v = c31980jc;
            this.f91398w = z11;
            this.f91399x = c18055a;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            return new c(this.f91396u, this.f91397v, this.f91398w, this.f91399x, continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            Object m142578e;
            m142578e = AbstractC28298d.m142578e();
            int i11 = this.f91395t;
            if (i11 != 0) {
                if (i11 == 1) {
                    AbstractC24862s.m129228b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                AbstractC24862s.m129228b(obj);
                Flow flow = (Flow) new HideOrReportAdsUseCase(new C0766k()).m101509a(new HideOrReportAdsUseCase.C10916a(this.f91396u, this.f91397v, this.f91398w));
                if (flow != null) {
                    a aVar = new a(this.f91399x);
                    this.f91395t = 1;
                    if (flow.mo97893a(aVar, this) == m142578e) {
                        return m142578e;
                    }
                }
            }
            return C24848g0.f119245a;
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: r, reason: merged with bridge method [inline-methods] */
        public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
            return ((c) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: dr.a$d */
    /* loaded from: classes4.dex */
    public static final class d extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        int f91401t;

        /* renamed from: v */
        final /* synthetic */ C32123ta f91403v;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: dr.a$d$a */
        /* loaded from: classes4.dex */
        public static final class a implements FlowCollector {

            /* renamed from: p */
            final /* synthetic */ C18055a f91404p;

            a(C18055a c18055a) {
                this.f91404p = c18055a;
            }

            @Override // kotlinx.coroutines.flow.FlowCollector
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object mo12109b(C25106c.c cVar, Continuation continuation) {
                if (cVar instanceof C25106c.c.b) {
                    this.f91404p.f91386x.mo9224q(AbstractC29094b.m145339a(true));
                } else if (cVar instanceof C25106c.c.a) {
                    this.f91404p.f91386x.mo9224q(AbstractC29094b.m145339a(false));
                    this.f91404p.f91388z.mo9224q(C24848g0.f119245a);
                } else if (cVar instanceof C25106c.c.C32944c) {
                    this.f91404p.f91386x.mo9224q(AbstractC29094b.m145339a(false));
                    this.f91404p.f91387y.mo9224q(((C25106c.c.C32944c) cVar).m130198a());
                    this.f91404p.f91362I = false;
                }
                return C24848g0.f119245a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(C32123ta c32123ta, Continuation continuation) {
            super(2, continuation);
            this.f91403v = c32123ta;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            return new d(this.f91403v, continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            Object m142578e;
            m142578e = AbstractC28298d.m142578e();
            int i11 = this.f91401t;
            if (i11 != 0) {
                if (i11 == 1) {
                    AbstractC24862s.m129228b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                AbstractC24862s.m129228b(obj);
                Flow flow = (Flow) C18055a.this.f91383u.m101509a(new C25106c.b(this.f91403v, false));
                if (flow != null) {
                    a aVar = new a(C18055a.this);
                    this.f91401t = 1;
                    if (flow.mo97893a(aVar, this) == m142578e) {
                        return m142578e;
                    }
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

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: dr.a$e */
    /* loaded from: classes4.dex */
    public static final class e extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: A */
        final /* synthetic */ double f91405A;

        /* renamed from: B */
        final /* synthetic */ double f91406B;

        /* renamed from: C */
        final /* synthetic */ double f91407C;

        /* renamed from: D */
        final /* synthetic */ double f91408D;

        /* renamed from: t */
        int f91409t;

        /* renamed from: v */
        final /* synthetic */ C32123ta f91411v;

        /* renamed from: w */
        final /* synthetic */ int f91412w;

        /* renamed from: x */
        final /* synthetic */ long f91413x;

        /* renamed from: y */
        final /* synthetic */ String f91414y;

        /* renamed from: z */
        final /* synthetic */ int f91415z;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: dr.a$e$a */
        /* loaded from: classes4.dex */
        public static final class a implements FlowCollector {

            /* renamed from: p */
            final /* synthetic */ C18055a f91416p;

            /* renamed from: q */
            final /* synthetic */ int f91417q;

            /* renamed from: r */
            final /* synthetic */ long f91418r;

            /* renamed from: s */
            final /* synthetic */ String f91419s;

            /* renamed from: t */
            final /* synthetic */ int f91420t;

            /* renamed from: u */
            final /* synthetic */ double f91421u;

            /* renamed from: v */
            final /* synthetic */ double f91422v;

            /* renamed from: w */
            final /* synthetic */ double f91423w;

            /* renamed from: x */
            final /* synthetic */ double f91424x;

            a(C18055a c18055a, int i11, long j11, String str, int i12, double d11, double d12, double d13, double d14) {
                this.f91416p = c18055a;
                this.f91417q = i11;
                this.f91418r = j11;
                this.f91419s = str;
                this.f91420t = i12;
                this.f91421u = d11;
                this.f91422v = d12;
                this.f91423w = d13;
                this.f91424x = d14;
            }

            @Override // kotlinx.coroutines.flow.FlowCollector
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object mo12109b(C25106c.c cVar, Continuation continuation) {
                if (cVar instanceof C25106c.c.b) {
                    this.f91416p.f91356C.mo9224q(new b(true, ((C25106c.c.b) cVar).m130197a()));
                } else if (cVar instanceof C25106c.c.C32944c) {
                    this.f91416p.f91356C.mo9224q(new b(false, 100L));
                    CameraInputParams cameraInputParams = new CameraInputParams();
                    cameraInputParams.f41129s = 7;
                    cameraInputParams.f41133u = 3;
                    int i11 = this.f91417q;
                    if (i11 == 1) {
                        cameraInputParams.f41137w = ((C25106c.c.C32944c) cVar).m130198a();
                    } else if (i11 == 2) {
                        cameraInputParams.f41139x = ((C25106c.c.C32944c) cVar).m130198a();
                    }
                    cameraInputParams.f41141y = ((C25106c.c.C32944c) cVar).m130198a();
                    cameraInputParams.f41110c0 = this.f91418r;
                    cameraInputParams.f41111d0 = this.f91419s;
                    cameraInputParams.f41112e0 = this.f91420t;
                    cameraInputParams.f41113f0 = this.f91421u;
                    cameraInputParams.f41114g0 = this.f91422v;
                    cameraInputParams.f41115h0 = this.f91423w;
                    cameraInputParams.f41116i0 = this.f91424x;
                    cameraInputParams.f41117j0 = true;
                    this.f91416p.f91355B.mo9224q(cameraInputParams);
                } else if (cVar instanceof C25106c.c.a) {
                    this.f91416p.f91356C.mo9224q(new b(false, 0L));
                    if (((C25106c.c.a) cVar).m130196a() == C25106c.a.f120606s) {
                        C1761c0 c1761c0 = this.f91416p.f91357D;
                        String m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_story_reshare_download_fail_no_network);
                        AbstractC19074t.m100207e(m118743r0, "getString(...)");
                        c1761c0.mo9224q(new a(m118743r0, ZAbstractBase.ZVU_PROCESS_FLUSH, AbstractC23322a.zds_ic_wifi_off_solid_24, AbstractC2808b.ng60));
                    } else {
                        C1761c0 c1761c02 = this.f91416p.f91357D;
                        String m118743r02 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_story_reshare_download_fail);
                        AbstractC19074t.m100207e(m118743r02, "getString(...)");
                        c1761c02.mo9224q(new a(m118743r02, ZAbstractBase.ZVU_PROCESS_FLUSH, AbstractC23322a.zds_ic_close_circle_solid_24, AbstractC2808b.ng60));
                    }
                }
                return C24848g0.f119245a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(C32123ta c32123ta, int i11, long j11, String str, int i12, double d11, double d12, double d13, double d14, Continuation continuation) {
            super(2, continuation);
            this.f91411v = c32123ta;
            this.f91412w = i11;
            this.f91413x = j11;
            this.f91414y = str;
            this.f91415z = i12;
            this.f91405A = d11;
            this.f91406B = d12;
            this.f91407C = d13;
            this.f91408D = d14;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            return new e(this.f91411v, this.f91412w, this.f91413x, this.f91414y, this.f91415z, this.f91405A, this.f91406B, this.f91407C, this.f91408D, continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            Object m142578e;
            m142578e = AbstractC28298d.m142578e();
            int i11 = this.f91409t;
            if (i11 != 0) {
                if (i11 == 1) {
                    AbstractC24862s.m129228b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                AbstractC24862s.m129228b(obj);
                Flow flow = (Flow) C18055a.this.f91383u.m101509a(new C25106c.b(this.f91411v, false));
                if (flow != null) {
                    a aVar = new a(C18055a.this, this.f91412w, this.f91413x, this.f91414y, this.f91415z, this.f91405A, this.f91406B, this.f91407C, this.f91408D);
                    this.f91409t = 1;
                    if (flow.mo97893a(aVar, this) == m142578e) {
                        return m142578e;
                    }
                }
            }
            return C24848g0.f119245a;
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: r, reason: merged with bridge method [inline-methods] */
        public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
            return ((e) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: dr.a$f */
    /* loaded from: classes4.dex */
    public static final class f extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        int f91425t;

        /* renamed from: v */
        final /* synthetic */ C32123ta f91427v;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: dr.a$f$a */
        /* loaded from: classes4.dex */
        public static final class a implements FlowCollector {

            /* renamed from: p */
            final /* synthetic */ C18055a f91428p;

            /* renamed from: q */
            final /* synthetic */ C32123ta f91429q;

            /* renamed from: dr.a$f$a$a, reason: collision with other inner class name */
            /* loaded from: classes4.dex */
            public /* synthetic */ class C32807a {

                /* renamed from: a */
                public static final /* synthetic */ int[] f91430a;

                static {
                    int[] iArr = new int[C25106c.a.values().length];
                    try {
                        iArr[C25106c.a.f120603p.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[C25106c.a.f120604q.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    try {
                        iArr[C25106c.a.f120605r.ordinal()] = 3;
                    } catch (NoSuchFieldError unused3) {
                    }
                    try {
                        iArr[C25106c.a.f120606s.ordinal()] = 4;
                    } catch (NoSuchFieldError unused4) {
                    }
                    f91430a = iArr;
                }
            }

            a(C18055a c18055a, C32123ta c32123ta) {
                this.f91428p = c18055a;
                this.f91429q = c32123ta;
            }

            @Override // kotlinx.coroutines.flow.FlowCollector
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object mo12109b(C25107d.a aVar, Continuation continuation) {
                String m118746s0;
                String m118743r0;
                if (aVar instanceof C25107d.a.b) {
                    this.f91428p.f91386x.mo9224q(AbstractC29094b.m145339a(true));
                } else if (aVar instanceof C25107d.a.C32945a) {
                    this.f91428p.f91386x.mo9224q(AbstractC29094b.m145339a(false));
                    int i11 = C32807a.f91430a[((C25107d.a.C32945a) aVar).m130207a().ordinal()];
                    if (i11 != 1) {
                        if (i11 != 2) {
                            if (i11 != 3) {
                                if (i11 == 4) {
                                    m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_story_reshare_download_fail_no_network);
                                } else {
                                    throw new NoWhenBranchMatchedException();
                                }
                            } else if (this.f91429q.f148140i == 2) {
                                m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_story_video_save_error_msg);
                            } else {
                                m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_story_photo_save_error_msg);
                            }
                        } else {
                            m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.error_full_sdcard);
                        }
                    } else {
                        m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.error_sdcard);
                    }
                    AbstractC19074t.m100205c(m118743r0);
                    this.f91428p.f91385w.mo9224q(m118743r0);
                    this.f91428p.f91362I = false;
                } else if (aVar instanceof C25107d.a.c) {
                    this.f91428p.f91386x.mo9224q(AbstractC29094b.m145339a(false));
                    if (this.f91429q.f148140i == 2) {
                        m118746s0 = AbstractC23136l9.m118746s0(AbstractC8020f0.str_story_video_saved_at, ((C25107d.a.c) aVar).m130208a());
                    } else {
                        m118746s0 = AbstractC23136l9.m118746s0(AbstractC8020f0.str_story_photo_saved_at, ((C25107d.a.c) aVar).m130208a());
                    }
                    AbstractC19074t.m100205c(m118746s0);
                    this.f91428p.f91385w.mo9224q(m118746s0);
                    this.f91428p.f91362I = false;
                }
                return C24848g0.f119245a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(C32123ta c32123ta, Continuation continuation) {
            super(2, continuation);
            this.f91427v = c32123ta;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            return new f(this.f91427v, continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            Object m142578e;
            m142578e = AbstractC28298d.m142578e();
            int i11 = this.f91425t;
            if (i11 != 0) {
                if (i11 == 1) {
                    AbstractC24862s.m129228b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                AbstractC24862s.m129228b(obj);
                C18055a.this.f91362I = true;
                Flow flow = (Flow) C18055a.this.f91382t.m101509a(this.f91427v);
                if (flow != null) {
                    a aVar = new a(C18055a.this, this.f91427v);
                    this.f91425t = 1;
                    if (flow.mo97893a(aVar, this) == m142578e) {
                        return m142578e;
                    }
                }
            }
            return C24848g0.f119245a;
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: r, reason: merged with bridge method [inline-methods] */
        public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
            return ((f) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* renamed from: dr.a$g */
    /* loaded from: classes4.dex */
    public static final class g implements InterfaceC20094a {

        /* renamed from: a */
        final /* synthetic */ String f91431a;

        /* renamed from: b */
        final /* synthetic */ String f91432b;

        /* renamed from: c */
        final /* synthetic */ long f91433c;

        g(String str, String str2, long j11) {
            this.f91431a = str;
            this.f91432b = str2;
            this.f91433c = j11;
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
            AbstractC19074t.m100208f(c20096c, "errorMessage");
            ToastUtils.showMess(c20096c.m104492d());
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            AbstractC19074t.m100208f(obj, C0927o.f3427r);
            C22037m0 c22037m0 = C22037m0.f108553a;
            String str = this.f91431a;
            AbstractC19074t.m100207e(str, "$storyId");
            c22037m0.m115031e(str, this.f91432b, this.f91433c);
        }
    }

    /* renamed from: dr.a$h */
    /* loaded from: classes4.dex */
    public static final class h implements InterfaceC20094a {

        /* renamed from: a */
        final /* synthetic */ String f91434a;

        /* renamed from: b */
        final /* synthetic */ C18055a f91435b;

        /* renamed from: dr.a$h$a */
        /* loaded from: classes4.dex */
        public static final class a extends AbstractC0939u {

            /* renamed from: a */
            final /* synthetic */ String f91436a;

            a(String str) {
                this.f91436a = str;
            }

            @Override // p660xw.InterfaceC30214a
            /* renamed from: a */
            public void mo928a() {
                C7960e.m41971c6().m42343ac(this.f91436a);
                C7960e.m41971c6().m42376e4(this.f91436a);
            }
        }

        h(String str, C18055a c18055a) {
            this.f91434a = str;
            this.f91435b = c18055a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: e */
        public static final void m96023e(C18055a c18055a) {
            AbstractC19074t.m100208f(c18055a, "this$0");
            c18055a.f91363J = false;
            c18055a.f91386x.mo9224q(Boolean.FALSE);
            c18055a.f91361H.mo9224q(C24848g0.f119245a);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: f */
        public static final void m96024f(C18055a c18055a) {
            AbstractC19074t.m100208f(c18055a, "this$0");
            c18055a.f91363J = false;
            c18055a.f91386x.mo9224q(Boolean.FALSE);
            c18055a.f91361H.mo9224q(C24848g0.f119245a);
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
            Runnable runnable;
            AbstractC19074t.m100208f(c20096c, "errorMessage");
            try {
                try {
                    ToastUtils.m89264l(c20096c);
                    final C18055a c18055a = this.f91435b;
                    runnable = new Runnable() { // from class: dr.e
                        @Override // java.lang.Runnable
                        public final void run() {
                            C18055a.h.m96024f(C18055a.this);
                        }
                    };
                } catch (Exception e11) {
                    AbstractC23350e.m122778h(e11);
                    final C18055a c18055a2 = this.f91435b;
                    runnable = new Runnable() { // from class: dr.e
                        @Override // java.lang.Runnable
                        public final void run() {
                            C18055a.h.m96024f(C18055a.this);
                        }
                    };
                }
                AbstractC19444a.m101694b(runnable, 300L);
            } catch (Throwable th2) {
                final C18055a c18055a3 = this.f91435b;
                AbstractC19444a.m101694b(new Runnable() { // from class: dr.e
                    @Override // java.lang.Runnable
                    public final void run() {
                        C18055a.h.m96024f(C18055a.this);
                    }
                }, 300L);
                throw th2;
            }
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            Runnable runnable;
            AbstractC19074t.m100208f(obj, C0927o.f3427r);
            boolean z11 = false;
            try {
                try {
                    JSONObject jSONObject = (JSONObject) obj;
                    if (jSONObject.has("error_code") && jSONObject.has("data")) {
                        int optInt = jSONObject.optInt("error_code", -1000);
                        if (optInt == 0) {
                            C21927m.m114302u().m114342k0(this.f91434a);
                            C28927g m120616S = AbstractC23306f.m120616S();
                            AbstractC19074t.m100207e(m120616S, "provideDeleteTabMsgItemUseCase(...)");
                            String str = this.f91434a;
                            AbstractC19074t.m100207e(str, "$uid");
                            m120616S.m101508a(new C28927g.b(str, z11, 2, null));
                            C0824j.m2153b(new a(this.f91434a));
                            Map map = AbstractC23304d.f113405l;
                            C31965ic c31965ic = (C31965ic) map.get(CoreUtility.f89233i);
                            if (c31965ic != null) {
                                int m153681a = c31965ic.m153681a();
                                if (m153681a > 0) {
                                    m153681a--;
                                }
                                C31965ic c31965ic2 = (C31965ic) map.get(CoreUtility.f89233i);
                                if (c31965ic2 != null) {
                                    c31965ic2.m153684d(m153681a);
                                }
                            }
                            String str2 = this.f91434a;
                            AbstractC19074t.m100207e(str2, "$uid");
                            if (str2.length() > 0) {
                                AbstractC23181q.m119431d(this.f91434a, false);
                            }
                        } else {
                            ToastUtils.m89264l(new C20096c(optInt, AbstractC23161o1.m119318c(optInt, "")));
                        }
                    }
                    C20834z0.f102412a.m108927f(true);
                    C23744a.Companion.m124119a().m124116d(60065, new Object[0]);
                    final C18055a c18055a = this.f91435b;
                    runnable = new Runnable() { // from class: dr.f
                        @Override // java.lang.Runnable
                        public final void run() {
                            C18055a.h.m96023e(C18055a.this);
                        }
                    };
                } catch (Exception e11) {
                    AbstractC23350e.m122778h(e11);
                    C20834z0.f102412a.m108927f(true);
                    C23744a.Companion.m124119a().m124116d(60065, new Object[0]);
                    final C18055a c18055a2 = this.f91435b;
                    runnable = new Runnable() { // from class: dr.f
                        @Override // java.lang.Runnable
                        public final void run() {
                            C18055a.h.m96023e(C18055a.this);
                        }
                    };
                }
                AbstractC19444a.m101694b(runnable, 300L);
            } catch (Throwable th2) {
                C20834z0.f102412a.m108927f(true);
                C23744a.Companion.m124119a().m124116d(60065, new Object[0]);
                final C18055a c18055a3 = this.f91435b;
                AbstractC19444a.m101694b(new Runnable() { // from class: dr.f
                    @Override // java.lang.Runnable
                    public final void run() {
                        C18055a.h.m96023e(C18055a.this);
                    }
                }, 300L);
                throw th2;
            }
        }
    }

    public C18055a(C25107d c25107d, C25106c c25106c, C1780l0 c1780l0) {
        AbstractC19074t.m100208f(c25107d, "saveStoryToLocalGalleryUseCase");
        AbstractC19074t.m100208f(c25106c, "saveStoryAndDoSomethingUseCase");
        AbstractC19074t.m100208f(c1780l0, "savedStateHandle");
        this.f91382t = c25107d;
        this.f91383u = c25106c;
        this.f91384v = c1780l0;
        this.f91385w = new C1761c0();
        this.f91386x = new C1761c0();
        this.f91387y = new C1761c0();
        this.f91388z = new C1761c0();
        this.f91355B = new C1761c0();
        this.f91356C = new C1761c0();
        this.f91357D = new C1761c0();
        this.f91358E = new C1761c0();
        this.f91359F = new C1761c0();
        this.f91360G = new C1761c0();
        this.f91361H = new C1761c0();
        this.f91364K = new LinkedHashMap();
        this.f91365L = new LinkedHashMap();
        this.f91366M = new LinkedHashMap();
        this.f91367N = new LinkedHashMap();
        this.f91368O = new LinkedHashMap();
        this.f91370Q = new LinkedHashSet();
        this.f91371R = "";
        this.f91372S = new LinkedHashSet();
        this.f91373T = "";
        this.f91374U = -1;
    }

    /* renamed from: D0 */
    private final int m95950D0(int i11) {
        if (i11 == 334) {
            return 1;
        }
        if (i11 == 352) {
            return 9;
        }
        if (i11 == 361) {
            return 2;
        }
        if (i11 == 364) {
            return 12;
        }
        switch (i11) {
            case 338:
                return 7;
            case 339:
                return 4;
            case 340:
                return 11;
            default:
                switch (i11) {
                    case 344:
                        return 6;
                    case 345:
                        return 10;
                    case 346:
                        return 8;
                    default:
                        switch (i11) {
                            case 357:
                            case 358:
                                return 5;
                            case 359:
                                return 3;
                            default:
                                return 0;
                        }
                }
        }
    }

    /* renamed from: I0 */
    private final void m95951I0(Map map, String str) {
        Integer num = (Integer) map.get(str);
        if (num == null) {
            map.put(str, 1);
        } else {
            map.put(str, Integer.valueOf(num.intValue() + 1));
        }
    }

    /* renamed from: A0 */
    public final LiveData m95967A0() {
        return this.f91357D;
    }

    /* renamed from: B0 */
    public final LiveData m95968B0() {
        return this.f91385w;
    }

    /* renamed from: C0 */
    public final LiveData m95969C0() {
        return this.f91386x;
    }

    /* renamed from: E0 */
    public final void m95970E0(String str) {
        int i11;
        AbstractC19074t.m100208f(str, "storyId");
        Integer num = (Integer) this.f91367N.get(str);
        if (num != null) {
            i11 = num.intValue();
        } else {
            i11 = -1;
        }
        this.f91374U = i11;
    }

    /* renamed from: F0 */
    public final void m95971F0(String str) {
        AbstractC19074t.m100208f(str, "storyId");
        this.f91372S.add(str);
        this.f91373T = str;
    }

    /* renamed from: G0 */
    public final void m95972G0(String str) {
        AbstractC19074t.m100208f(str, "uid");
        this.f91370Q.add(str);
        this.f91371R = str;
    }

    /* renamed from: J0 */
    public final String m95973J0() {
        try {
            JSONArray jSONArray = new JSONArray();
            for (Map.Entry entry : this.f91365L.entrySet()) {
                String str = (String) entry.getKey();
                Map map = (Map) entry.getValue();
                JSONArray jSONArray2 = new JSONArray();
                for (Map.Entry entry2 : map.entrySet()) {
                    String str2 = (String) entry2.getKey();
                    int intValue = ((Number) entry2.getValue()).intValue();
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("reaction", str2);
                    jSONObject.put("count", intValue);
                    jSONArray2.put(jSONObject);
                }
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("storyId", str);
                jSONObject2.put("map", jSONArray2);
                jSONArray.put(jSONObject2);
            }
            String jSONArray3 = jSONArray.toString();
            AbstractC19074t.m100207e(jSONArray3, "toString(...)");
            return jSONArray3;
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
            return "";
        }
    }

    /* renamed from: K0 */
    public final void m95974K0(String str) {
        AbstractC19074t.m100208f(str, "input");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        try {
            JSONArray jSONArray = new JSONArray(str);
            int length = jSONArray.length();
            for (int i11 = 0; i11 < length; i11++) {
                JSONObject optJSONObject = jSONArray.optJSONObject(i11);
                if (optJSONObject != null) {
                    String optString = optJSONObject.optString("storyId");
                    JSONArray optJSONArray = optJSONObject.optJSONArray("map");
                    if (optString != null && optString.length() != 0 && optJSONArray != null) {
                        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                        int length2 = optJSONArray.length();
                        for (int i12 = 0; i12 < length2; i12++) {
                            JSONObject optJSONObject2 = optJSONArray.optJSONObject(i12);
                            if (optJSONObject2 != null) {
                                String optString2 = optJSONObject2.optString("reaction");
                                Integer valueOf = Integer.valueOf(optJSONObject2.optInt("count"));
                                AbstractC19074t.m100205c(optString2);
                                linkedHashMap2.put(optString2, valueOf);
                            }
                        }
                        AbstractC19074t.m100205c(optString);
                        linkedHashMap.put(optString, linkedHashMap2);
                    }
                }
            }
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
        this.f91365L = linkedHashMap;
    }

    /* renamed from: L0 */
    public final void m95975L0(C32123ta c32123ta) {
        if (this.f91362I) {
            this.f91385w.mo9224q(AbstractC23136l9.m118743r0(AbstractC8020f0.str_story_saving_msg));
        } else if (c32123ta != null) {
            BuildersKt__Builders_commonKt.m112540d(AbstractC1798u0.m9374a(this), null, null, new f(c32123ta, null), 3, null);
        }
    }

    /* renamed from: M0 */
    public final boolean m95976M0(C31980jc c31980jc, String str, boolean z11, boolean z12) {
        String str2;
        C32123ta m153825r;
        AbstractC19074t.m100208f(str, "plainMessage");
        if (c31980jc != null && (m153825r = c31980jc.m153825r()) != null) {
            str2 = m153825r.f148138h;
        } else {
            str2 = null;
        }
        if (str2 == null) {
            str2 = "";
        }
        StringBuilder sb2 = (StringBuilder) this.f91364K.get(str2);
        if (sb2 == null) {
            sb2 = new StringBuilder();
        }
        boolean z13 = false;
        if (sb2.length() == 0 && str.length() == 0) {
            return false;
        }
        if (!z11 || sb2.length() != 0) {
            if (!z11) {
                sb2.append(str);
            }
            String sb3 = sb2.toString();
            AbstractC19074t.m100207e(sb3, "toString(...)");
            try {
                StringBuilder sb4 = new StringBuilder();
                if (sb4.length() > 0) {
                    sb3 = sb4.toString();
                }
                AbstractC19074t.m100205c(sb3);
                if (sb3.length() > 0 && c31980jc != null && !AbstractC19074t.m100204b(c31980jc.f147023p, CoreUtility.f89233i)) {
                    C28203u6 c28203u6 = C28203u6.f131407a;
                    String str3 = c31980jc.f147023p;
                    AbstractC19074t.m100207e(str3, "uid");
                    ContactProfile m141816n = c28203u6.m141816n(str3, null);
                    if (TextUtils.isEmpty(m141816n.f42437s) || TextUtils.isEmpty(m141816n.f42446v)) {
                        m141816n.f42437s = c31980jc.f147024q;
                        m141816n.f42446v = c31980jc.f147025r;
                    }
                    C32123ta m153825r2 = c31980jc.m153825r();
                    if (m153825r2 != null) {
                        String jSONObject = m153825r2.m155082i0().toString();
                        AbstractC19074t.m100207e(jSONObject, "toString(...)");
                        C17994q1 c17994q1 = new C17994q1(1, jSONObject);
                        C26406h c26406h = new C26406h();
                        c26406h.m136195s(null);
                        c26406h.m136196t(c17994q1);
                        if (z12) {
                            AbstractC23112j7.m118538k0(c31980jc.f147023p, sb3, c26406h);
                        } else {
                            AbstractC23112j7.m118532h0(c31980jc.f147023p, sb3);
                        }
                        String m40383Q = m141816n.m40383Q(true, false);
                        AbstractC19074t.m100205c(m40383Q);
                        if (m40383Q.length() > 0) {
                            ToastUtils.showMess(AbstractC23136l9.m118746s0(AbstractC8020f0.str_story_send_message_success, m40383Q));
                        }
                        z13 = true;
                    }
                }
            } catch (Exception e11) {
                AbstractC23350e.m122778h(e11);
            }
            if (str2.length() > 0) {
                this.f91364K.put(str2, new StringBuilder());
            }
        }
        return z13;
    }

    /* renamed from: N0 */
    public final void m95977N0(C32123ta c32123ta) {
        if (c32123ta != null) {
            try {
                String str = c32123ta.f148138h;
                Map map = (Map) this.f91365L.get(str);
                String str2 = (String) this.f91366M.get(str);
                if (str2 == null) {
                    str2 = "";
                }
                if (map != null && !map.isEmpty()) {
                    long j11 = c32123ta.f148150p;
                    C0766k c0766k = new C0766k();
                    c0766k.mo1704o8(new g(str, str2, j11));
                    c0766k.mo1519Q9(str, map);
                }
                this.f91365L.remove(str);
            } catch (Exception e11) {
                AbstractC23350e.m122778h(e11);
            }
        }
    }

    /* renamed from: O0 */
    public final void m95978O0(C31980jc c31980jc) {
        String str;
        boolean m127128x;
        try {
            if (this.f91363J) {
                return;
            }
            if (c31980jc != null && c31980jc.f147029v == 2) {
                str = c31980jc.f147023p;
            } else {
                str = "";
            }
            C0766k c0766k = new C0766k();
            c0766k.mo1704o8(new h(str, this));
            AbstractC19074t.m100205c(str);
            m127128x = AbstractC24341v.m127128x(str);
            if (!m127128x) {
                this.f91363J = true;
                this.f91386x.mo9224q(Boolean.TRUE);
                this.f91360G.mo9224q(C24848g0.f119245a);
                c0766k.mo1766w6(Integer.parseInt(str), new TrackingSource(-1));
            }
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    /* renamed from: P0 */
    public final void m95979P0(List list) {
        AbstractC19074t.m100208f(list, "userStories");
        try {
            Map m114965r = C22021e0.m114965r();
            AbstractC19074t.m100207e(m114965r, "getUserStoryIndexMap(...)");
            synchronized (m114965r) {
                this.f91367N.clear();
                Map map = this.f91367N;
                Map m114965r2 = C22021e0.m114965r();
                AbstractC19074t.m100207e(m114965r2, "getUserStoryIndexMap(...)");
                map.putAll(m114965r2);
                C24848g0 c24848g0 = C24848g0.f119245a;
            }
            this.f91368O.clear();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                C31980jc c31980jc = (C31980jc) it.next();
                if (c31980jc != null) {
                    Iterator it2 = c31980jc.f147031x.iterator();
                    while (it2.hasNext()) {
                        C32123ta c32123ta = (C32123ta) it2.next();
                        Map map2 = this.f91368O;
                        String str = c32123ta.f148138h;
                        AbstractC19074t.m100207e(str, "storyId");
                        map2.put(str, Integer.valueOf(this.f91368O.size()));
                    }
                }
            }
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    /* renamed from: e0 */
    public final void m95980e0(String str, String str2, String str3) {
        AbstractC19074t.m100208f(str, "storyId");
        AbstractC19074t.m100208f(str2, "reactionId");
        AbstractC19074t.m100208f(str3, "reactionEmoStr");
        if (C22037m0.f108553a.m115034h()) {
            if (C23055e5.m118272g(false)) {
                Map map = (Map) this.f91365L.get(str);
                if (map == null) {
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    m95951I0(linkedHashMap, str2);
                    this.f91365L.put(str, linkedHashMap);
                } else {
                    m95951I0(map, str2);
                }
                this.f91366M.put(str, str2);
                return;
            }
            return;
        }
        StringBuilder sb2 = (StringBuilder) this.f91364K.get(str);
        if (sb2 == null) {
            Map map2 = this.f91364K;
            StringBuilder sb3 = new StringBuilder();
            sb3.append(str3);
            sb3.append(" ");
            map2.put(str, sb3);
            return;
        }
        sb2.append(str3);
        sb2.append(" ");
    }

    /* renamed from: f0 */
    public final void m95981f0() {
        this.f91378Y++;
    }

    /* renamed from: g0 */
    public final void m95982g0() {
        this.f91379Z++;
    }

    /* renamed from: h0 */
    public final void m95983h0(long j11, C31980jc c31980jc) {
        if (c31980jc != null && c31980jc.f147029v == 2) {
            C32123ta m153825r = c31980jc.m153825r();
            if (m153825r != null) {
                C0732w m1189a = C0732w.Companion.m1189a();
                C0708i c0708i = new C0708i();
                String str = m153825r.f148121X;
                AbstractC19074t.m100207e(str, "adsId");
                c0708i.m1075f("ad_uid", str);
                c0708i.m1073d("hold_duration", j11);
                C24848g0 c24848g0 = C24848g0.f119245a;
                C0732w.m1177r(m1189a, "story_ad_hold", "", c0708i, null, 8, null);
                return;
            }
            return;
        }
        this.f91380a0++;
        this.f91381b0 += j11;
    }

    /* renamed from: i0 */
    public final void m95984i0() {
        this.f91375V++;
    }

    /* renamed from: j0 */
    public final void m95985j0() {
        this.f91376W++;
    }

    /* renamed from: k0 */
    public final void m95986k0() {
        this.f91377X++;
    }

    /* renamed from: l0 */
    public final void m95987l0(List list) {
        List m131222v0;
        int i11;
        List m131222v02;
        int i12;
        int i13;
        Object obj;
        int i14;
        int i15;
        int i16;
        AbstractC19074t.m100208f(list, "userStoryList");
        List list2 = list;
        HashSet hashSet = new HashSet();
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : list2) {
            if (hashSet.add(((C31980jc) obj2).f147023p)) {
                arrayList.add(obj2);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ArrayList arrayList3 = ((C31980jc) it.next()).f147031x;
            AbstractC19074t.m100207e(arrayList3, "mStories");
            AbstractC25378x.m131548x(arrayList2, arrayList3);
        }
        ArrayList arrayList4 = new ArrayList();
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            ArrayList arrayList5 = ((C31980jc) it2.next()).f147032y;
            AbstractC19074t.m100207e(arrayList5, "mUnseenStories");
            AbstractC25378x.m131548x(arrayList4, arrayList5);
        }
        m131222v0 = AbstractC25332a0.m131222v0(arrayList2, arrayList4);
        HashSet hashSet2 = new HashSet();
        ArrayList arrayList6 = new ArrayList();
        for (Object obj3 : m131222v0) {
            if (hashSet2.add(((C32123ta) obj3).f148138h)) {
                arrayList6.add(obj3);
            }
        }
        ArrayList<C31980jc> arrayList7 = new ArrayList();
        for (Object obj4 : arrayList) {
            if (((C31980jc) obj4).f147029v != 2) {
                arrayList7.add(obj4);
            }
        }
        if (arrayList7.isEmpty()) {
            i11 = 0;
        } else {
            i11 = 0;
            for (C31980jc c31980jc : arrayList7) {
                if (!c31980jc.m153829v() && !AbstractC19074t.m100204b(c31980jc.f147023p, CoreUtility.f89233i) && (i11 = i11 + 1) < 0) {
                    AbstractC25368s.m131508p();
                }
            }
        }
        ArrayList arrayList8 = new ArrayList();
        Iterator it3 = arrayList7.iterator();
        while (it3.hasNext()) {
            ArrayList arrayList9 = ((C31980jc) it3.next()).f147031x;
            AbstractC19074t.m100207e(arrayList9, "mStories");
            AbstractC25378x.m131548x(arrayList8, arrayList9);
        }
        ArrayList arrayList10 = new ArrayList();
        Iterator it4 = arrayList7.iterator();
        while (it4.hasNext()) {
            ArrayList arrayList11 = ((C31980jc) it4.next()).f147032y;
            AbstractC19074t.m100207e(arrayList11, "mUnseenStories");
            AbstractC25378x.m131548x(arrayList10, arrayList11);
        }
        m131222v02 = AbstractC25332a0.m131222v0(arrayList8, arrayList10);
        HashSet hashSet3 = new HashSet();
        ArrayList arrayList12 = new ArrayList();
        for (Object obj5 : m131222v02) {
            if (hashSet3.add(((C32123ta) obj5).f148138h)) {
                arrayList12.add(obj5);
            }
        }
        if (arrayList12.isEmpty()) {
            i12 = 0;
        } else {
            Iterator it5 = arrayList12.iterator();
            i12 = 0;
            while (it5.hasNext()) {
                if ((!((C32123ta) it5.next()).f148152r) && (i12 = i12 + 1) < 0) {
                    AbstractC25368s.m131508p();
                }
            }
        }
        Iterator it6 = arrayList.iterator();
        int i17 = 0;
        while (true) {
            i13 = -1;
            if (it6.hasNext()) {
                if (AbstractC19074t.m100204b(((C31980jc) it6.next()).f147023p, this.f91371R)) {
                    break;
                } else {
                    i17++;
                }
            } else {
                i17 = -1;
                break;
            }
        }
        Iterator it7 = arrayList6.iterator();
        int i18 = 0;
        while (true) {
            if (!it7.hasNext()) {
                break;
            }
            if (AbstractC19074t.m100204b(((C32123ta) it7.next()).f148138h, this.f91373T)) {
                i13 = i18;
                break;
            }
            i18++;
        }
        Iterator it8 = arrayList.iterator();
        while (true) {
            if (it8.hasNext()) {
                obj = it8.next();
                if (AbstractC19074t.m100204b(((C31980jc) obj).f147023p, CoreUtility.f89233i)) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        if (obj != null) {
            i14 = 1;
        } else {
            i14 = 0;
        }
        ArrayList arrayList13 = new ArrayList();
        for (Object obj6 : list2) {
            if (((C31980jc) obj6).f147029v == 2) {
                arrayList13.add(obj6);
            }
        }
        ArrayList arrayList14 = new ArrayList();
        Iterator it9 = arrayList13.iterator();
        while (it9.hasNext()) {
            ArrayList arrayList15 = ((C31980jc) it9.next()).f147031x;
            AbstractC19074t.m100207e(arrayList15, "mStories");
            AbstractC25378x.m131548x(arrayList14, arrayList15);
        }
        if (arrayList14.isEmpty()) {
            i15 = 0;
        } else {
            Iterator it10 = arrayList14.iterator();
            i15 = 0;
            while (it10.hasNext()) {
                if (((C32123ta) it10.next()).f148140i == 1 && (i15 = i15 + 1) < 0) {
                    AbstractC25368s.m131508p();
                }
            }
        }
        if (arrayList14.isEmpty()) {
            i16 = 0;
        } else {
            Iterator it11 = arrayList14.iterator();
            i16 = 0;
            while (it11.hasNext()) {
                if (((C32123ta) it11.next()).f148140i == 2 && (i16 = i16 + 1) < 0) {
                    AbstractC25368s.m131508p();
                }
            }
        }
        C0732w.b bVar = C0732w.Companion;
        C0732w m1189a = bVar.m1189a();
        C0708i c0708i = new C0708i();
        c0708i.m1072c("total_page_view_detail", arrayList.size());
        c0708i.m1072c("page_seen_view_detail", this.f91370Q.size());
        c0708i.m1072c("new_page_missed_view_detail", i11);
        c0708i.m1072c("page_index_stopped_view_detail", i17);
        c0708i.m1072c("page_index_started_story_bar", this.f91374U);
        c0708i.m1072c("total_story_view_detail", arrayList6.size());
        c0708i.m1072c("story_seen_view_detail", this.f91372S.size());
        c0708i.m1072c("new_story_missed_view_detail", i12);
        c0708i.m1072c("story_index_stopped_view_detail", i13);
        c0708i.m1072c("self_story", i14);
        C24848g0 c24848g0 = C24848g0.f119245a;
        C0732w.m1177r(m1189a, "story_view_tracking", "", c0708i, null, 8, null);
        C0732w m1189a2 = bVar.m1189a();
        C0708i c0708i2 = new C0708i();
        c0708i2.m1072c("swipe_left", this.f91375V);
        c0708i2.m1072c("swipe_right", this.f91376W);
        c0708i2.m1072c("swipe_up_story", this.f91377X);
        c0708i2.m1072c("click_left", this.f91378Y);
        c0708i2.m1072c("click_right", this.f91379Z);
        c0708i2.m1072c("hold_story_number", this.f91380a0);
        c0708i2.m1073d("hold_duration", this.f91381b0);
        C0732w.m1177r(m1189a2, "story_action_tracking", "", c0708i2, null, 8, null);
        C0732w m1189a3 = bVar.m1189a();
        C0708i c0708i3 = new C0708i();
        c0708i3.m1072c("photo_ads", i15);
        c0708i3.m1072c("video_ads", i16);
        c0708i3.m1072c("multiphoto_ads", 0);
        C0732w.m1177r(m1189a3, "story_ad_view_tracking", "", c0708i3, null, 8, null);
    }

    /* renamed from: m0 */
    public final void m95988m0() {
        Job job = this.f91354A;
        if (job != null) {
            Job.DefaultImpls.m112740a(job, null, 1, null);
        }
        this.f91356C.mo9224q(new b(false, 0L));
    }

    /* renamed from: n0 */
    public final void m95989n0(C31980jc c31980jc, C32123ta c32123ta, String str, boolean z11, boolean z12) {
        AbstractC19074t.m100208f(str, "plainMessage");
        if (C22037m0.f108553a.m115034h()) {
            m95977N0(c32123ta);
        } else {
            m95976M0(c31980jc, str, z11, z12);
        }
    }

    /* renamed from: o0 */
    public final void m95990o0(C32123ta c32123ta, int i11) {
        boolean m127128x;
        int i12;
        if (c32123ta == null) {
            return;
        }
        try {
            String str = c32123ta.f148121X;
            AbstractC19074t.m100207e(str, "adsId");
            m127128x = AbstractC24341v.m127128x(str);
            if (!m127128x) {
                if (this.f91369P != null) {
                    AbstractC22055v0.m115150j(c32123ta);
                }
                AbstractC22055v0.m115166z(c32123ta, 10);
                AbstractC22055v0.m115166z(c32123ta, 50);
                this.f91369P = c32123ta;
                return;
            }
            Integer num = (Integer) this.f91367N.get(c32123ta.f148136g);
            int i13 = -1;
            if (num != null) {
                i12 = num.intValue();
            } else {
                i12 = -1;
            }
            Integer num2 = (Integer) this.f91368O.get(c32123ta.f148138h);
            if (num2 != null) {
                i13 = num2.intValue();
            }
            C32123ta c32123ta2 = this.f91369P;
            if (c32123ta2 != null) {
                C26333b c26333b = C26333b.f125013a;
                String str2 = c32123ta2.f148138h;
                AbstractC19074t.m100207e(str2, "storyId");
                c26333b.m135518n(str2, 3);
            }
            C26333b.f125013a.m135522r(c32123ta, m95950D0(i11), i12, i13);
            this.f91369P = c32123ta;
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    /* renamed from: p0 */
    public final void m95991p0(C32123ta c32123ta, C31980jc c31980jc, boolean z11) {
        BuildersKt__Builders_commonKt.m112540d(AbstractC1798u0.m9374a(this), null, null, new c(c32123ta, c31980jc, z11, this, null), 3, null);
    }

    /* renamed from: q0 */
    public final void m95992q0(C32123ta c32123ta) {
        BuildersKt__Builders_commonKt.m112540d(AbstractC1798u0.m9374a(this), null, null, new d(c32123ta, null), 3, null);
    }

    /* renamed from: r0 */
    public final void m95993r0(C32123ta c32123ta) {
        String str;
        int i11;
        double d11;
        double d12;
        double d13;
        double d14;
        Job m112540d;
        if (c32123ta != null) {
            int i12 = c32123ta.f148140i;
            long j11 = c32123ta.f148150p;
            SongInfo songInfo = c32123ta.f148119V;
            if (songInfo != null) {
                str = songInfo.m45182d();
            } else {
                str = "";
            }
            String str2 = str;
            StoryMusicAttachment storyMusicAttachment = c32123ta.f148120W;
            if (storyMusicAttachment != null) {
                i11 = storyMusicAttachment.m46924b();
            } else {
                i11 = -1;
            }
            StoryMusicAttachment storyMusicAttachment2 = c32123ta.f148120W;
            if (storyMusicAttachment2 != null) {
                d11 = storyMusicAttachment2.m46928f();
            } else {
                d11 = 0.0d;
            }
            StoryMusicAttachment storyMusicAttachment3 = c32123ta.f148120W;
            if (storyMusicAttachment3 != null) {
                d12 = storyMusicAttachment3.m46929g();
            } else {
                d12 = 0.0d;
            }
            StoryMusicAttachment storyMusicAttachment4 = c32123ta.f148120W;
            if (storyMusicAttachment4 != null) {
                d13 = storyMusicAttachment4.m46926d();
            } else {
                d13 = 0.0d;
            }
            StoryMusicAttachment storyMusicAttachment5 = c32123ta.f148120W;
            if (storyMusicAttachment5 != null) {
                d14 = storyMusicAttachment5.m46927e();
            } else {
                d14 = 0.0d;
            }
            m112540d = BuildersKt__Builders_commonKt.m112540d(AbstractC1798u0.m9374a(this), null, null, new e(c32123ta, i12, j11, str2, i11, d11, d12, d13, d14, null), 3, null);
            this.f91354A = m112540d;
        }
    }

    /* renamed from: s0 */
    public final C1761c0 m95994s0() {
        return this.f91359F;
    }

    /* renamed from: t0 */
    public final LiveData m95995t0() {
        return this.f91388z;
    }

    /* renamed from: u0 */
    public final LiveData m95996u0() {
        return this.f91355B;
    }

    /* renamed from: v0 */
    public final LiveData m95997v0() {
        return this.f91387y;
    }

    /* renamed from: w0 */
    public final LiveData m95998w0() {
        return this.f91358E;
    }

    /* renamed from: x0 */
    public final LiveData m95999x0() {
        return this.f91360G;
    }

    /* renamed from: y0 */
    public final LiveData m96000y0() {
        return this.f91361H;
    }

    /* renamed from: z0 */
    public final LiveData m96001z0() {
        return this.f91356C;
    }
}
