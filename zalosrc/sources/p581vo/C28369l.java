package p581vo;

import androidx.work.AbstractC2144f;
import bo.C2949b;
import bo.C3000l0;
import bo.C3003l3;
import bo.C3063z0;
import com.zing.zalo.control.TrackingSource;
import com.zing.zalo.feed.models.PrivacyInfo;
import com.zing.zalo.feed.mvp.profile.model.ProfilePreviewAlbumItem;
import en0.InterfaceC18505l;
import en0.InterfaceC18509p;
import fn0.AbstractC19074t;
import is.AbstractC20826v0;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import p185gc.AbstractC19377a;
import p348mi.AbstractC23309i;
import p458qr.AbstractC25468a;
import p559uv.C27373c;
import p581vo.AbstractC28358a;
import p581vo.C28362e;
import p716zh.C31890dc;
import pm0.AbstractC24862s;
import pm0.C24848g0;
import ro.AbstractC25936a;
import vm0.AbstractC28298d;
import wm0.AbstractC29094b;
import wm0.AbstractC29104l;

/* renamed from: vo.l */
/* loaded from: classes4.dex */
public final class C28369l extends AbstractC19377a {

    /* renamed from: vo.l$a */
    /* loaded from: classes4.dex */
    public static final class a extends AbstractC25936a {

        /* renamed from: a */
        private final String f132255a;

        /* renamed from: b */
        private final C27373c f132256b;

        /* renamed from: c */
        private final C3003l3 f132257c;

        /* renamed from: d */
        private final C3063z0 f132258d;

        /* renamed from: e */
        private final PrivacyInfo f132259e;

        /* renamed from: f */
        private final String f132260f;

        /* renamed from: g */
        private final C31890dc f132261g;

        /* renamed from: h */
        private final TrackingSource f132262h;

        /* renamed from: i */
        private final ProfilePreviewAlbumItem f132263i;

        /* renamed from: j */
        private final boolean f132264j;

        /* renamed from: k */
        private final InterfaceC18505l f132265k;

        /* renamed from: l */
        private final String f132266l;

        public a(String str, C27373c c27373c, C3003l3 c3003l3, C3063z0 c3063z0, PrivacyInfo privacyInfo, String str2, C31890dc c31890dc, TrackingSource trackingSource, ProfilePreviewAlbumItem profilePreviewAlbumItem, boolean z11, InterfaceC18505l interfaceC18505l, String str3) {
            AbstractC19074t.m100208f(str, "desc");
            AbstractC19074t.m100208f(str2, "cameraLog");
            AbstractC19074t.m100208f(interfaceC18505l, "callback");
            AbstractC19074t.m100208f(str3, "postFeedCallbackId");
            this.f132255a = str;
            this.f132256b = c27373c;
            this.f132257c = c3003l3;
            this.f132258d = c3063z0;
            this.f132259e = privacyInfo;
            this.f132260f = str2;
            this.f132261g = c31890dc;
            this.f132262h = trackingSource;
            this.f132263i = profilePreviewAlbumItem;
            this.f132264j = z11;
            this.f132265k = interfaceC18505l;
            this.f132266l = str3;
        }

        /* renamed from: a */
        public final InterfaceC18505l m142911a() {
            return this.f132265k;
        }

        /* renamed from: b */
        public final String m142912b() {
            return this.f132260f;
        }

        /* renamed from: c */
        public final String m142913c() {
            return this.f132255a;
        }

        /* renamed from: d */
        public C3063z0 m142914d() {
            return this.f132258d;
        }

        /* renamed from: e */
        public String m142915e() {
            return this.f132266l;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return AbstractC19074t.m100204b(this.f132255a, aVar.f132255a) && AbstractC19074t.m100204b(this.f132256b, aVar.f132256b) && AbstractC19074t.m100204b(this.f132257c, aVar.f132257c) && AbstractC19074t.m100204b(this.f132258d, aVar.f132258d) && AbstractC19074t.m100204b(this.f132259e, aVar.f132259e) && AbstractC19074t.m100204b(this.f132260f, aVar.f132260f) && AbstractC19074t.m100204b(this.f132261g, aVar.f132261g) && AbstractC19074t.m100204b(this.f132262h, aVar.f132262h) && AbstractC19074t.m100204b(this.f132263i, aVar.f132263i) && this.f132264j == aVar.f132264j && AbstractC19074t.m100204b(this.f132265k, aVar.f132265k) && AbstractC19074t.m100204b(this.f132266l, aVar.f132266l);
        }

        /* renamed from: f */
        public PrivacyInfo m142916f() {
            return this.f132259e;
        }

        /* renamed from: g */
        public final ProfilePreviewAlbumItem m142917g() {
            return this.f132263i;
        }

        /* renamed from: h */
        public C3003l3 m142918h() {
            return this.f132257c;
        }

        public int hashCode() {
            int hashCode = this.f132255a.hashCode() * 31;
            C27373c c27373c = this.f132256b;
            int hashCode2 = (hashCode + (c27373c == null ? 0 : c27373c.hashCode())) * 31;
            C3003l3 c3003l3 = this.f132257c;
            int hashCode3 = (hashCode2 + (c3003l3 == null ? 0 : c3003l3.hashCode())) * 31;
            C3063z0 c3063z0 = this.f132258d;
            int hashCode4 = (hashCode3 + (c3063z0 == null ? 0 : c3063z0.hashCode())) * 31;
            PrivacyInfo privacyInfo = this.f132259e;
            int hashCode5 = (((hashCode4 + (privacyInfo == null ? 0 : privacyInfo.hashCode())) * 31) + this.f132260f.hashCode()) * 31;
            C31890dc c31890dc = this.f132261g;
            int hashCode6 = (hashCode5 + (c31890dc == null ? 0 : c31890dc.hashCode())) * 31;
            TrackingSource trackingSource = this.f132262h;
            int hashCode7 = (hashCode6 + (trackingSource == null ? 0 : trackingSource.hashCode())) * 31;
            ProfilePreviewAlbumItem profilePreviewAlbumItem = this.f132263i;
            return ((((((hashCode7 + (profilePreviewAlbumItem != null ? profilePreviewAlbumItem.hashCode() : 0)) * 31) + AbstractC2144f.m11520a(this.f132264j)) * 31) + this.f132265k.hashCode()) * 31) + this.f132266l.hashCode();
        }

        /* renamed from: i */
        public TrackingSource m142919i() {
            return this.f132262h;
        }

        /* renamed from: j */
        public C31890dc m142920j() {
            return this.f132261g;
        }

        /* renamed from: k */
        public final C27373c m142921k() {
            return this.f132256b;
        }

        /* renamed from: l */
        public boolean m142922l() {
            return this.f132264j;
        }

        public String toString() {
            return "Param(desc=" + this.f132255a + ", videoInfo=" + this.f132256b + ", tag=" + this.f132257c + ", location=" + this.f132258d + ", privacyInfo=" + this.f132259e + ", cameraLog=" + this.f132260f + ", typo=" + this.f132261g + ", trackingSource=" + this.f132262h + ", profilePreviewAlbumItem=" + this.f132263i + ", isMutualFeed=" + this.f132264j + ", callback=" + this.f132265k + ", postFeedCallbackId=" + this.f132266l + ")";
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: vo.l$b */
    /* loaded from: classes4.dex */
    public static final class b extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        int f132267t;

        /* renamed from: u */
        private /* synthetic */ Object f132268u;

        /* renamed from: v */
        final /* synthetic */ a f132269v;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: vo.l$b$a */
        /* loaded from: classes4.dex */
        public static final class a implements FlowCollector {

            /* renamed from: p */
            public static final a f132270p = new a();

            a() {
            }

            @Override // kotlinx.coroutines.flow.FlowCollector
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object mo12109b(AbstractC25468a abstractC25468a, Continuation continuation) {
                return C24848g0.f119245a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(a aVar, Continuation continuation) {
            super(2, continuation);
            this.f132269v = aVar;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            b bVar = new b(this.f132269v, continuation);
            bVar.f132268u = obj;
            return bVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:22:0x00fb A[Catch: Exception -> 0x003c, TRY_LEAVE, TryCatch #2 {Exception -> 0x003c, blocks: (B:18:0x0035, B:20:0x00f7, B:22:0x00fb), top: B:17:0x0035 }] */
        /* JADX WARN: Removed duplicated region for block: B:30:0x011b A[RETURN] */
        /* JADX WARN: Type inference failed for: r4v0 */
        /* JADX WARN: Type inference failed for: r4v1, types: [kotlinx.coroutines.flow.FlowCollector] */
        /* JADX WARN: Type inference failed for: r4v2 */
        /* JADX WARN: Type inference failed for: r4v4 */
        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object mo239o(Object obj) {
            Object m142578e;
            AbstractC28358a.b bVar;
            long j11;
            Object m101498a;
            FlowCollector flowCollector;
            Flow flow;
            m142578e = AbstractC28298d.m142578e();
            int i11 = this.f132267t;
            ?? r42 = 3;
            try {
            } catch (Exception e11) {
                e = e11;
            }
            if (i11 != 0) {
                if (i11 != 1) {
                    if (i11 != 2) {
                        if (i11 != 3) {
                            if (i11 == 4) {
                                AbstractC24862s.m129228b(obj);
                            } else {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                        } else {
                            AbstractC24862s.m129228b(obj);
                        }
                        return C24848g0.f119245a;
                    }
                    flowCollector = (FlowCollector) this.f132268u;
                    try {
                        AbstractC24862s.m129228b(obj);
                        m101498a = obj;
                        flow = (Flow) m101498a;
                        if (flow != null) {
                            a aVar = a.f132270p;
                            this.f132268u = flowCollector;
                            this.f132267t = 3;
                            if (flow.mo97893a(aVar, this) == m142578e) {
                                return m142578e;
                            }
                        }
                    } catch (Exception e12) {
                        e = e12;
                        r42 = flowCollector;
                        e.printStackTrace();
                        bVar = new AbstractC28358a.b(null, e);
                        this.f132268u = null;
                        this.f132267t = 4;
                        if (r42.mo12109b(bVar, this) == m142578e) {
                        }
                        return C24848g0.f119245a;
                    }
                    return C24848g0.f119245a;
                }
                AbstractC24862s.m129228b(obj);
                return C24848g0.f119245a;
            }
            AbstractC24862s.m129228b(obj);
            FlowCollector flowCollector2 = (FlowCollector) this.f132268u;
            try {
            } catch (Exception e13) {
                e = e13;
                r42 = flowCollector2;
                e.printStackTrace();
                bVar = new AbstractC28358a.b(null, e);
                this.f132268u = null;
                this.f132267t = 4;
                if (r42.mo12109b(bVar, this) == m142578e) {
                    return m142578e;
                }
                return C24848g0.f119245a;
            }
            if (this.f132269v.m142921k() == null) {
                AbstractC28358a.a aVar2 = new AbstractC28358a.a();
                this.f132268u = flowCollector2;
                this.f132267t = 1;
                if (flowCollector2.mo12109b(aVar2, this) == m142578e) {
                    return m142578e;
                }
                return C24848g0.f119245a;
            }
            C2949b m108833s = AbstractC20826v0.m108833s(this.f132269v.m142917g());
            String m142913c = this.f132269v.m142913c();
            C27373c m142921k = this.f132269v.m142921k();
            C3003l3 m142918h = this.f132269v.m142918h();
            C3063z0 m142914d = this.f132269v.m142914d();
            PrivacyInfo m142916f = this.f132269v.m142916f();
            String m142912b = this.f132269v.m142912b();
            C31890dc m142920j = this.f132269v.m142920j();
            TrackingSource m142919i = this.f132269v.m142919i();
            if (this.f132269v.m142917g() != null) {
                j11 = this.f132269v.m142917g().getId();
            } else {
                j11 = 0;
            }
            C3000l0 m14244D = C3000l0.m14244D(m142913c, m142921k, m142918h, m142914d, m142916f, m142912b, m142920j, m142919i, j11, m108833s, this.f132269v.m142915e());
            AbstractC23309i.m122403sq(System.currentTimeMillis());
            C28362e c28362e = new C28362e();
            C28362e.a aVar3 = new C28362e.a(m14244D, AbstractC29094b.m145339a(this.f132269v.m142922l()), this.f132269v.m142911a());
            this.f132268u = flowCollector2;
            this.f132267t = 2;
            m101498a = c28362e.m101498a(aVar3, this);
            if (m101498a == m142578e) {
                return m142578e;
            }
            flowCollector = flowCollector2;
            flow = (Flow) m101498a;
            if (flow != null) {
            }
            return C24848g0.f119245a;
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: r, reason: merged with bridge method [inline-methods] */
        public final Object mo240pC(FlowCollector flowCollector, Continuation continuation) {
            return ((b) mo238a(flowCollector, continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p185gc.AbstractC19377a
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public Object mo451b(a aVar, Continuation continuation) {
        return FlowKt.m113265A(new b(aVar, null));
    }
}
