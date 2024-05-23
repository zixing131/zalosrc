package com.zing.zalo.feed.mvp.profile;

import ag0.C0815e1;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.core.graphics.AbstractC1409d;
import androidx.lifecycle.C1761c0;
import androidx.lifecycle.InterfaceC1764d0;
import bo.C2944a;
import bo.C2948a3;
import bo.C2958c3;
import bo.C2966e1;
import bo.C2996k1;
import bo.C3010n0;
import bo.C3020p0;
import bo.C3054x;
import bo.C3065z2;
import com.zing.zalo.AbstractC16781w;
import com.zing.zalo.AbstractC16803z;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.control.ContactProfile;
import com.zing.zalo.control.ItemAlbumMobile;
import com.zing.zalo.control.TrackingSource;
import com.zing.zalo.data.mediapicker.model.MediaItem;
import com.zing.zalo.feed.models.ActionDataImageViewer;
import com.zing.zalo.feed.models.PrivacyInfo;
import com.zing.zalo.feed.mvp.profile.C8662b;
import com.zing.zalo.feed.mvp.profile.ProfileAlbumDetailView;
import com.zing.zalo.feed.mvp.profile.model.ProfileAlbumHeader;
import com.zing.zalo.feed.mvp.profile.model.ProfileAlbumItem;
import com.zing.zalo.feed.mvp.profile.model.ProfilePreviewAlbumItem;
import com.zing.zalo.feed.mvp.profile.model.ProfilePreviewAlbumItemImpl;
import com.zing.zalo.feed.mvp.profile.model.theme.ThemeItem;
import com.zing.zalo.utils.ToastUtils;
import com.zing.zalo.zmedia.player.ZMediaPlayer;
import com.zing.zalo.zview.animation.AnimationTarget;
import com.zing.zalocore.CoreUtility;
import en0.InterfaceC18494a;
import en0.InterfaceC18505l;
import en0.InterfaceC18509p;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import fn0.C19071q;
import fo.C19081a;
import fo.C19082b;
import fo.C19083c;
import fo.C19084d;
import fo.C19085e;
import fo.C19088h;
import fo.C19089i;
import hm0.C20096c;
import ho0.AbstractC20110a;
import iq.C20679f1;
import iq.C20733q0;
import iq.C20738r0;
import iq.C20743s0;
import iq.InterfaceC20748t0;
import iq.InterfaceC20753u0;
import is.C20815q;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import me0.AbstractC23136l9;
import me0.C23055e5;
import me0.C23212s8;
import me0.C23250w4;
import mq.C23420b;
import nh0.C23793c;
import on0.AbstractC24341v;
import p137eo.AbstractC18522f;
import p137eo.AbstractC18523g;
import p137eo.C18528l;
import p137eo.C18529m;
import p137eo.InterfaceC18527k;
import p205hc.AbstractC19962a;
import p205hc.InterfaceC19968g;
import p205hc.InterfaceC19969h;
import p236ic.AbstractC20504a;
import p262jb.AbstractC21196a;
import p304ks.AbstractC21935u;
import p331lq.C22638b;
import p361nb.AbstractC23647d;
import p361nb.C23648e;
import p716zh.AbstractC32173x4;
import p716zh.C32002l4;
import p716zh.C32017m4;
import p716zh.C32187y4;
import pm0.AbstractC24856m;
import pm0.AbstractC24862s;
import pm0.C24848g0;
import pm0.InterfaceC24854k;
import qm0.AbstractC25332a0;
import qm0.AbstractC25366r;
import qm0.AbstractC25368s;
import vg.C28203u6;
import vm0.AbstractC28298d;
import wm0.AbstractC29104l;

/* renamed from: com.zing.zalo.feed.mvp.profile.b */
/* loaded from: classes4.dex */
public final class C8662b extends AbstractC19962a implements InterfaceC20748t0, InterfaceC1764d0 {
    public static final a Companion = new a(null);

    /* renamed from: A */
    private C32002l4 f46609A;

    /* renamed from: B */
    private int f46610B;

    /* renamed from: C */
    private String f46611C;

    /* renamed from: D */
    private String f46612D;

    /* renamed from: E */
    private long f46613E;

    /* renamed from: F */
    private int f46614F;

    /* renamed from: G */
    private int f46615G;

    /* renamed from: H */
    private int f46616H;

    /* renamed from: I */
    private int f46617I;

    /* renamed from: J */
    private int f46618J;

    /* renamed from: K */
    private int f46619K;

    /* renamed from: L */
    private C23420b f46620L;

    /* renamed from: M */
    private C22638b f46621M;

    /* renamed from: N */
    private List f46622N;

    /* renamed from: O */
    private boolean f46623O;

    /* renamed from: P */
    private boolean f46624P;

    /* renamed from: Q */
    private boolean f46625Q;

    /* renamed from: R */
    private int f46626R;

    /* renamed from: S */
    private ProfileAlbumItem f46627S;

    /* renamed from: T */
    private boolean f46628T;

    /* renamed from: U */
    private boolean f46629U;

    /* renamed from: V */
    private C20815q f46630V;

    /* renamed from: W */
    private final C1761c0 f46631W;

    /* renamed from: X */
    private final C1761c0 f46632X;

    /* renamed from: Y */
    private final C1761c0 f46633Y;

    /* renamed from: Z */
    private final C1761c0 f46634Z;

    /* renamed from: a0 */
    private ThemeItem f46635a0;

    /* renamed from: b0 */
    private long f46636b0;

    /* renamed from: c0 */
    private boolean f46637c0;

    /* renamed from: t */
    private final InterfaceC24854k f46638t;

    /* renamed from: u */
    private final InterfaceC24854k f46639u;

    /* renamed from: v */
    private final InterfaceC24854k f46640v;

    /* renamed from: w */
    private final InterfaceC24854k f46641w;

    /* renamed from: x */
    private final InterfaceC24854k f46642x;

    /* renamed from: y */
    private final InterfaceC24854k f46643y;

    /* renamed from: z */
    private C32002l4 f46644z;

    /* renamed from: com.zing.zalo.feed.mvp.profile.b$a */
    /* loaded from: classes4.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC19060k abstractC19060k) {
            this();
        }
    }

    /* renamed from: com.zing.zalo.feed.mvp.profile.b$b */
    /* loaded from: classes4.dex */
    public static final class b extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        int f46645t;

        /* renamed from: v */
        final /* synthetic */ ProfileAlbumItem f46647v;

        /* renamed from: com.zing.zalo.feed.mvp.profile.b$b$a */
        /* loaded from: classes4.dex */
        public static final class a extends AbstractC19075u implements InterfaceC18505l {

            /* renamed from: q */
            public static final a f46648q = new a();

            a() {
                super(1);
            }

            /* renamed from: a */
            public final void m46244a(AbstractC18523g abstractC18523g) {
                AbstractC19074t.m100208f(abstractC18523g, "it");
            }

            @Override // en0.InterfaceC18505l
            /* renamed from: i9 */
            public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
                m46244a((AbstractC18523g) obj);
                return C24848g0.f119245a;
            }
        }

        /* renamed from: com.zing.zalo.feed.mvp.profile.b$b$b */
        /* loaded from: classes4.dex */
        public static final class C32709b extends AbstractC19075u implements InterfaceC18505l {

            /* renamed from: q */
            final /* synthetic */ ProfileAlbumItem f46649q;

            /* renamed from: r */
            final /* synthetic */ C8662b f46650r;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C32709b(ProfileAlbumItem profileAlbumItem, C8662b c8662b) {
                super(1);
                this.f46649q = profileAlbumItem;
                this.f46650r = c8662b;
            }

            /* renamed from: a */
            public final void m46245a(ArrayList arrayList) {
                this.f46649q.m46300c().m46282j().m45136H(arrayList);
                ((InterfaceC20753u0) this.f46650r.m103742Dp()).mo46032U0(this.f46649q.m46300c().m46282j());
            }

            @Override // en0.InterfaceC18505l
            /* renamed from: i9 */
            public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
                m46245a((ArrayList) obj);
                return C24848g0.f119245a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(ProfileAlbumItem profileAlbumItem, Continuation continuation) {
            super(2, continuation);
            this.f46647v = profileAlbumItem;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            return new b(this.f46647v, continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            Object m142578e;
            m142578e = AbstractC28298d.m142578e();
            int i11 = this.f46645t;
            if (i11 != 0) {
                if (i11 == 1) {
                    AbstractC24862s.m129228b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                AbstractC24862s.m129228b(obj);
                C19084d m46181tq = C8662b.this.m46181tq();
                C19084d.a aVar = new C19084d.a(C8662b.this.m46206Ya(), this.f46647v);
                this.f46645t = 1;
                obj = m46181tq.m101498a(aVar, this);
                if (obj == m142578e) {
                    return m142578e;
                }
            }
            AbstractC18522f abstractC18522f = (AbstractC18522f) obj;
            if (abstractC18522f != null) {
                abstractC18522f.m97904a(a.f46648q, new C32709b(this.f46647v, C8662b.this));
            }
            ((InterfaceC20753u0) C8662b.this.m103742Dp()).mo49315c4();
            return C24848g0.f119245a;
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: r */
        public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
            return ((b) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.feed.mvp.profile.b$c */
    /* loaded from: classes4.dex */
    public static final class c extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final c f46651q = new c();

        c() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a */
        public final C19081a mo12V4() {
            return new C19081a(null, 1, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.feed.mvp.profile.b$d */
    /* loaded from: classes4.dex */
    public static final class d extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final d f46652q = new d();

        d() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a */
        public final C19082b mo12V4() {
            return new C19082b(null, 1, null);
        }
    }

    /* renamed from: com.zing.zalo.feed.mvp.profile.b$e */
    /* loaded from: classes4.dex */
    public static final class e extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        int f46653t;

        /* renamed from: v */
        final /* synthetic */ ProfileAlbumItem f46655v;

        /* renamed from: w */
        final /* synthetic */ TrackingSource f46656w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(ProfileAlbumItem profileAlbumItem, TrackingSource trackingSource, Continuation continuation) {
            super(2, continuation);
            this.f46655v = profileAlbumItem;
            this.f46656w = trackingSource;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            return new e(this.f46655v, this.f46656w, continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            Object m142578e;
            m142578e = AbstractC28298d.m142578e();
            int i11 = this.f46653t;
            if (i11 != 0) {
                if (i11 == 1) {
                    AbstractC24862s.m129228b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                AbstractC24862s.m129228b(obj);
                ((InterfaceC20753u0) C8662b.this.m103742Dp()).mo46829Y();
                C19083c m46179pq = C8662b.this.m46179pq();
                C19083c.a aVar = new C19083c.a(C8662b.this.m46206Ya(), this.f46655v.m46300c().m46277e(), this.f46655v.m46300c().m46288p(), this.f46655v.m46300c().m46286n(), this.f46655v.m46300c().m46274b(), this.f46655v.m46300c().m46285m(), this.f46656w);
                this.f46653t = 1;
                if (m46179pq.m101498a(aVar, this) == m142578e) {
                    return m142578e;
                }
            }
            ((InterfaceC20753u0) C8662b.this.m103742Dp()).mo49315c4();
            return C24848g0.f119245a;
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: r */
        public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
            return ((e) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* renamed from: com.zing.zalo.feed.mvp.profile.b$f */
    /* loaded from: classes4.dex */
    public static final class f implements C20815q.f {

        /* renamed from: b */
        final /* synthetic */ AnimationTarget f46658b;

        f(AnimationTarget animationTarget) {
            this.f46658b = animationTarget;
        }

        @Override // is.C20815q.f
        /* renamed from: a */
        public void mo46249a(ItemAlbumMobile itemAlbumMobile) {
            AbstractC19074t.m100208f(itemAlbumMobile, "photoItem");
            ((InterfaceC20753u0) C8662b.this.m103742Dp()).mo49315c4();
            C8662b.this.m46158Uq(itemAlbumMobile, this.f46658b);
        }

        @Override // is.C20815q.f
        /* renamed from: b */
        public void mo46250b(C20096c c20096c) {
            ((InterfaceC20753u0) C8662b.this.m103742Dp()).mo49315c4();
            if (((InterfaceC20753u0) C8662b.this.m103742Dp()).mo45894h0()) {
                String m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.unknown_error);
                AbstractC19074t.m100207e(m118743r0, "getString(...)");
                if (c20096c != null && !TextUtils.isEmpty(c20096c.m104492d())) {
                    m118743r0 = c20096c.m104492d();
                    AbstractC19074t.m100207e(m118743r0, "getError_message(...)");
                }
                ToastUtils.showMess(m118743r0);
            }
        }
    }

    /* renamed from: com.zing.zalo.feed.mvp.profile.b$g */
    /* loaded from: classes4.dex */
    public static final class g extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        Object f46659t;

        /* renamed from: u */
        int f46660u;

        /* renamed from: com.zing.zalo.feed.mvp.profile.b$g$a */
        /* loaded from: classes4.dex */
        public static final class a extends AbstractC19075u implements InterfaceC18505l {

            /* renamed from: q */
            public static final a f46662q = new a();

            a() {
                super(1);
            }

            /* renamed from: a */
            public final void m46252a(AbstractC18523g abstractC18523g) {
                AbstractC19074t.m100208f(abstractC18523g, "it");
            }

            @Override // en0.InterfaceC18505l
            /* renamed from: i9 */
            public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
                m46252a((AbstractC18523g) obj);
                return C24848g0.f119245a;
            }
        }

        /* renamed from: com.zing.zalo.feed.mvp.profile.b$g$b */
        /* loaded from: classes4.dex */
        public static final class b extends AbstractC19075u implements InterfaceC18505l {

            /* renamed from: q */
            final /* synthetic */ C8662b f46663q;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(C8662b c8662b) {
                super(1);
                this.f46663q = c8662b;
            }

            /* renamed from: a */
            public final void m46253a(boolean z11) {
                ((InterfaceC20753u0) this.f46663q.m103742Dp()).mo59032jx(AbstractC8020f0.str_profile_album_edit_album_option_edit_privacy_successfull);
            }

            @Override // en0.InterfaceC18505l
            /* renamed from: i9 */
            public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
                m46253a(((Boolean) obj).booleanValue());
                return C24848g0.f119245a;
            }
        }

        g(Continuation continuation) {
            super(2, continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            return new g(continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            Object m142578e;
            C32002l4 m154284u;
            C8662b c8662b;
            m142578e = AbstractC28298d.m142578e();
            int i11 = this.f46660u;
            if (i11 != 0) {
                if (i11 == 1) {
                    c8662b = (C8662b) this.f46659t;
                    AbstractC24862s.m129228b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                AbstractC24862s.m129228b(obj);
                ProfileAlbumItem m46227jq = C8662b.this.m46227jq();
                if (m46227jq != null) {
                    C8662b c8662b2 = C8662b.this;
                    int i12 = c8662b2.f46610B;
                    if (i12 != 43) {
                        if (i12 != 44) {
                            m154284u = c8662b2.f46644z;
                        } else {
                            m154284u = c8662b2.f46644z.m154284u(44);
                        }
                    } else {
                        m154284u = c8662b2.f46644z.m154284u(43);
                    }
                    TrackingSource m154332D = C32017m4.m154326S().m154332D(m154284u);
                    C19089i m46185xq = c8662b2.m46185xq();
                    String m46206Ya = c8662b2.m46206Ya();
                    AbstractC19074t.m100205c(m154332D);
                    C19089i.a aVar = new C19089i.a(m46206Ya, m46227jq, m154332D);
                    this.f46659t = c8662b2;
                    this.f46660u = 1;
                    obj = m46185xq.m101498a(aVar, this);
                    if (obj == m142578e) {
                        return m142578e;
                    }
                    c8662b = c8662b2;
                }
                return C24848g0.f119245a;
            }
            AbstractC18522f abstractC18522f = (AbstractC18522f) obj;
            if (abstractC18522f != null) {
                abstractC18522f.m97904a(a.f46662q, new b(c8662b));
            }
            return C24848g0.f119245a;
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: r */
        public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
            return ((g) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.feed.mvp.profile.b$h */
    /* loaded from: classes4.dex */
    public static final class h extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final h f46664q = new h();

        h() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a */
        public final C19083c mo12V4() {
            return new C19083c(null, 1, null);
        }
    }

    /* renamed from: com.zing.zalo.feed.mvp.profile.b$i */
    /* loaded from: classes4.dex */
    public static final class i extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        int f46665t;

        /* renamed from: com.zing.zalo.feed.mvp.profile.b$i$a */
        /* loaded from: classes4.dex */
        public /* synthetic */ class a extends C19071q implements InterfaceC18505l {
            a(Object obj) {
                super(1, obj, C8662b.class, "handleError", "handleError(Lcom/zing/zalo/feed/mvp/album/repo/Failure;)V", 0);
            }

            /* renamed from: h */
            public final void m46256h(AbstractC18523g abstractC18523g) {
                AbstractC19074t.m100208f(abstractC18523g, "p0");
                ((C8662b) this.f94922q).m46242zq(abstractC18523g);
            }

            @Override // en0.InterfaceC18505l
            /* renamed from: i9 */
            public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
                m46256h((AbstractC18523g) obj);
                return C24848g0.f119245a;
            }
        }

        /* renamed from: com.zing.zalo.feed.mvp.profile.b$i$b */
        /* loaded from: classes4.dex */
        public /* synthetic */ class b extends C19071q implements InterfaceC18505l {
            b(Object obj) {
                super(1, obj, C8662b.class, "handleSuccess", "handleSuccess(Lcom/zing/zalo/feed/mvp/profile/model/ProfileAlbumItem;)V", 0);
            }

            /* renamed from: h */
            public final void m46257h(ProfileAlbumItem profileAlbumItem) {
                AbstractC19074t.m100208f(profileAlbumItem, "p0");
                ((C8662b) this.f94922q).m46129Aq(profileAlbumItem);
            }

            @Override // en0.InterfaceC18505l
            /* renamed from: i9 */
            public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
                m46257h((ProfileAlbumItem) obj);
                return C24848g0.f119245a;
            }
        }

        i(Continuation continuation) {
            super(2, continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            return new i(continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            Object m142578e;
            m142578e = AbstractC28298d.m142578e();
            int i11 = this.f46665t;
            if (i11 != 0) {
                if (i11 == 1) {
                    AbstractC24862s.m129228b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                AbstractC24862s.m129228b(obj);
                C19085e m46182uq = C8662b.this.m46182uq();
                String m46206Ya = C8662b.this.m46206Ya();
                long m46225iq = C8662b.this.m46225iq();
                int m46228kq = C8662b.this.m46228kq();
                TrackingSource m154370p = C32017m4.m154326S().m154370p(C8662b.this.f46644z);
                AbstractC19074t.m100207e(m154370p, "createTrackingSourceAlbumDetail(...)");
                C19085e.a aVar = new C19085e.a(m46206Ya, m46225iq, m46228kq, 1, 0L, m154370p, null);
                this.f46665t = 1;
                obj = m46182uq.m101498a(aVar, this);
                if (obj == m142578e) {
                    return m142578e;
                }
            }
            AbstractC18522f abstractC18522f = (AbstractC18522f) obj;
            if (abstractC18522f != null) {
                abstractC18522f.m97904a(new a(C8662b.this), new b(C8662b.this));
            }
            ((InterfaceC20753u0) C8662b.this.m103742Dp()).mo46038a0();
            return C24848g0.f119245a;
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: r */
        public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
            return ((i) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* renamed from: com.zing.zalo.feed.mvp.profile.b$j */
    /* loaded from: classes4.dex */
    public static final class j extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        int f46667t;

        /* renamed from: v */
        final /* synthetic */ ProfileAlbumItem f46669v;

        /* renamed from: com.zing.zalo.feed.mvp.profile.b$j$a */
        /* loaded from: classes4.dex */
        public /* synthetic */ class a extends C19071q implements InterfaceC18505l {
            a(Object obj) {
                super(1, obj, C8662b.class, "handleError", "handleError(Lcom/zing/zalo/feed/mvp/album/repo/Failure;)V", 0);
            }

            /* renamed from: h */
            public final void m46259h(AbstractC18523g abstractC18523g) {
                AbstractC19074t.m100208f(abstractC18523g, "p0");
                ((C8662b) this.f94922q).m46242zq(abstractC18523g);
            }

            @Override // en0.InterfaceC18505l
            /* renamed from: i9 */
            public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
                m46259h((AbstractC18523g) obj);
                return C24848g0.f119245a;
            }
        }

        /* renamed from: com.zing.zalo.feed.mvp.profile.b$j$b */
        /* loaded from: classes4.dex */
        public /* synthetic */ class b extends C19071q implements InterfaceC18505l {
            b(Object obj) {
                super(1, obj, C8662b.class, "handleSuccess", "handleSuccess(Lcom/zing/zalo/feed/mvp/profile/model/ProfileAlbumItem;)V", 0);
            }

            /* renamed from: h */
            public final void m46260h(ProfileAlbumItem profileAlbumItem) {
                AbstractC19074t.m100208f(profileAlbumItem, "p0");
                ((C8662b) this.f94922q).m46129Aq(profileAlbumItem);
            }

            @Override // en0.InterfaceC18505l
            /* renamed from: i9 */
            public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
                m46260h((ProfileAlbumItem) obj);
                return C24848g0.f119245a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        j(ProfileAlbumItem profileAlbumItem, Continuation continuation) {
            super(2, continuation);
            this.f46669v = profileAlbumItem;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            return new j(this.f46669v, continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            Object m142578e;
            m142578e = AbstractC28298d.m142578e();
            int i11 = this.f46667t;
            if (i11 != 0) {
                if (i11 == 1) {
                    AbstractC24862s.m129228b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                AbstractC24862s.m129228b(obj);
                C8662b.this.m46164Yp(new C3010n0(2));
                ProfileAlbumHeader m46300c = this.f46669v.m46300c();
                C19085e m46182uq = C8662b.this.m46182uq();
                String m46206Ya = C8662b.this.m46206Ya();
                long m46278f = m46300c.m46278f();
                int m46288p = m46300c.m46288p();
                int m46280h = m46300c.m46280h() + 1;
                long m46279g = m46300c.m46279g();
                TrackingSource m154370p = C32017m4.m154326S().m154370p(C8662b.this.f46644z);
                AbstractC19074t.m100207e(m154370p, "createTrackingSourceAlbumDetail(...)");
                C19085e.a aVar = new C19085e.a(m46206Ya, m46278f, m46288p, m46280h, m46279g, m154370p, this.f46669v);
                this.f46667t = 1;
                obj = m46182uq.m101498a(aVar, this);
                if (obj == m142578e) {
                    return m142578e;
                }
            }
            AbstractC18522f abstractC18522f = (AbstractC18522f) obj;
            if (abstractC18522f != null) {
                abstractC18522f.m97904a(new a(C8662b.this), new b(C8662b.this));
            }
            return C24848g0.f119245a;
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: r */
        public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
            return ((j) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.feed.mvp.profile.b$k */
    /* loaded from: classes4.dex */
    public static final class k extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final k f46670q = new k();

        k() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a */
        public final C19084d mo12V4() {
            return new C19084d(null, 1, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.feed.mvp.profile.b$l */
    /* loaded from: classes4.dex */
    public static final class l extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final l f46671q = new l();

        l() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a */
        public final C19085e mo12V4() {
            return new C19085e(null, 1, null);
        }
    }

    /* renamed from: com.zing.zalo.feed.mvp.profile.b$m */
    /* loaded from: classes4.dex */
    static final class m extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        int f46672t;

        /* renamed from: com.zing.zalo.feed.mvp.profile.b$m$a */
        /* loaded from: classes4.dex */
        public static final class a implements FlowCollector {

            /* renamed from: p */
            final /* synthetic */ C8662b f46674p;

            a(C8662b c8662b) {
                this.f46674p = c8662b;
            }

            @Override // kotlinx.coroutines.flow.FlowCollector
            /* renamed from: a */
            public final Object mo12109b(InterfaceC18527k interfaceC18527k, Continuation continuation) {
                if (interfaceC18527k instanceof C18529m) {
                    this.f46674p.m46187Bq(((C18529m) interfaceC18527k).m97917d());
                } else if (interfaceC18527k instanceof C18528l) {
                    this.f46674p.m46241yq();
                }
                return C24848g0.f119245a;
            }
        }

        m(Continuation continuation) {
            super(2, continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            return new m(continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            Object m142578e;
            m142578e = AbstractC28298d.m142578e();
            int i11 = this.f46672t;
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
                C19088h c19088h = new C19088h(null, 1, null);
                C19088h.a aVar = new C19088h.a(C8662b.this.m46206Ya(), C8662b.this.m46225iq(), C8662b.this.m46228kq());
                this.f46672t = 1;
                obj = c19088h.m101498a(aVar, this);
                if (obj == m142578e) {
                    return m142578e;
                }
            }
            Flow flow = (Flow) obj;
            if (flow != null) {
                a aVar2 = new a(C8662b.this);
                this.f46672t = 2;
                if (flow.mo97893a(aVar2, this) == m142578e) {
                    return m142578e;
                }
            }
            return C24848g0.f119245a;
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: r */
        public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
            return ((m) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* renamed from: com.zing.zalo.feed.mvp.profile.b$n */
    /* loaded from: classes4.dex */
    static final class n extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        int f46675t;

        /* renamed from: u */
        final /* synthetic */ String f46676u;

        /* renamed from: v */
        final /* synthetic */ C8662b f46677v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        n(String str, C8662b c8662b, Continuation continuation) {
            super(2, continuation);
            this.f46676u = str;
            this.f46677v = c8662b;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            return new n(this.f46676u, this.f46677v, continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            Object m142578e;
            List m131496e;
            m142578e = AbstractC28298d.m142578e();
            int i11 = this.f46675t;
            if (i11 != 0) {
                if (i11 == 1) {
                    AbstractC24862s.m129228b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                AbstractC24862s.m129228b(obj);
                String str = this.f46676u;
                if (str != null && str.length() > 0 && this.f46677v.m46227jq() != null) {
                    C19082b m46178oq = this.f46677v.m46178oq();
                    String m46206Ya = this.f46677v.m46206Ya();
                    long m46225iq = this.f46677v.m46225iq();
                    int m46228kq = this.f46677v.m46228kq();
                    m131496e = AbstractC25366r.m131496e(this.f46676u);
                    ProfileAlbumItem m46227jq = this.f46677v.m46227jq();
                    AbstractC19074t.m100205c(m46227jq);
                    C19082b.a aVar = new C19082b.a(m46206Ya, m46225iq, m46228kq, m131496e, m46227jq);
                    this.f46675t = 1;
                    if (m46178oq.m101498a(aVar, this) == m142578e) {
                        return m142578e;
                    }
                }
            }
            return C24848g0.f119245a;
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: r */
        public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
            return ((n) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* renamed from: com.zing.zalo.feed.mvp.profile.b$o */
    /* loaded from: classes4.dex */
    static final class o extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        int f46678t;

        o(Continuation continuation) {
            super(2, continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            return new o(continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            Object m142578e;
            m142578e = AbstractC28298d.m142578e();
            int i11 = this.f46678t;
            if (i11 != 0) {
                if (i11 == 1) {
                    AbstractC24862s.m129228b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                AbstractC24862s.m129228b(obj);
                ((InterfaceC20753u0) C8662b.this.m103742Dp()).mo46829Y();
                C19081a m46177nq = C8662b.this.m46177nq();
                C19081a.a aVar = new C19081a.a(C8662b.this.m46206Ya(), C8662b.this.m46225iq(), C8662b.this.m46228kq());
                this.f46678t = 1;
                if (m46177nq.m101498a(aVar, this) == m142578e) {
                    return m142578e;
                }
            }
            ((InterfaceC20753u0) C8662b.this.m103742Dp()).mo49315c4();
            return C24848g0.f119245a;
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: r */
        public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
            return ((o) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* renamed from: com.zing.zalo.feed.mvp.profile.b$p */
    /* loaded from: classes4.dex */
    static final class p extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        int f46680t;

        /* renamed from: u */
        final /* synthetic */ ArrayList f46681u;

        /* renamed from: v */
        final /* synthetic */ C8662b f46682v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        p(ArrayList arrayList, C8662b c8662b, Continuation continuation) {
            super(2, continuation);
            this.f46681u = arrayList;
            this.f46682v = c8662b;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            return new p(this.f46681u, this.f46682v, continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            Object m142578e;
            m142578e = AbstractC28298d.m142578e();
            int i11 = this.f46680t;
            if (i11 != 0) {
                if (i11 == 1) {
                    AbstractC24862s.m129228b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                AbstractC24862s.m129228b(obj);
                if (this.f46681u != null && (!r11.isEmpty()) && this.f46682v.m46227jq() != null) {
                    C19082b m46178oq = this.f46682v.m46178oq();
                    String m46206Ya = this.f46682v.m46206Ya();
                    long m46225iq = this.f46682v.m46225iq();
                    int m46228kq = this.f46682v.m46228kq();
                    ArrayList arrayList = this.f46681u;
                    ProfileAlbumItem m46227jq = this.f46682v.m46227jq();
                    AbstractC19074t.m100205c(m46227jq);
                    C19082b.a aVar = new C19082b.a(m46206Ya, m46225iq, m46228kq, arrayList, m46227jq);
                    this.f46680t = 1;
                    if (m46178oq.m101498a(aVar, this) == m142578e) {
                        return m142578e;
                    }
                }
            }
            return C24848g0.f119245a;
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: r */
        public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
            return ((p) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.feed.mvp.profile.b$q */
    /* loaded from: classes4.dex */
    public static final class q extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final q f46683q = new q();

        q() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a */
        public final C19089i mo12V4() {
            return new C19089i(null, 1, null);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8662b(InterfaceC20753u0 interfaceC20753u0) {
        super(interfaceC20753u0);
        InterfaceC24854k m129210a;
        InterfaceC24854k m129210a2;
        InterfaceC24854k m129210a3;
        InterfaceC24854k m129210a4;
        InterfaceC24854k m129210a5;
        InterfaceC24854k m129210a6;
        List m131502j;
        AbstractC19074t.m100208f(interfaceC20753u0, "mvpView");
        m129210a = AbstractC24856m.m129210a(l.f46671q);
        this.f46638t = m129210a;
        m129210a2 = AbstractC24856m.m129210a(h.f46664q);
        this.f46639u = m129210a2;
        m129210a3 = AbstractC24856m.m129210a(c.f46651q);
        this.f46640v = m129210a3;
        m129210a4 = AbstractC24856m.m129210a(d.f46652q);
        this.f46641w = m129210a4;
        m129210a5 = AbstractC24856m.m129210a(q.f46683q);
        this.f46642x = m129210a5;
        m129210a6 = AbstractC24856m.m129210a(k.f46670q);
        this.f46643y = m129210a6;
        C32002l4 m154287a = C32002l4.Companion.m154287a(10013);
        this.f46644z = m154287a;
        this.f46609A = m154287a;
        this.f46610B = -1;
        this.f46611C = "";
        this.f46612D = "";
        ProfileAlbumDetailView.C8634a c8634a = ProfileAlbumDetailView.Companion;
        this.f46615G = c8634a.m46060a();
        this.f46616H = c8634a.m46061b();
        this.f46617I = c8634a.m46061b();
        this.f46618J = c8634a.m46061b();
        this.f46619K = c8634a.m46061b();
        this.f46620L = new C23420b();
        this.f46621M = new C22638b();
        this.f46622N = new ArrayList();
        this.f46626R = 1;
        this.f46630V = new C20815q();
        this.f46631W = new C1761c0(Boolean.TRUE);
        this.f46632X = new C1761c0(new C20738r0(false, 0, 0, 7, null));
        this.f46633Y = new C1761c0(new C20733q0(null, false, 0, 0, 0, 0, 63, null));
        m131502j = AbstractC25368s.m131502j();
        this.f46634Z = new C1761c0(new C20743s0(m131502j));
        this.f46635a0 = ThemeItem.Companion.m46365a();
    }

    /* renamed from: Aq */
    public final void m46129Aq(ProfileAlbumItem profileAlbumItem) {
        m46162Xp(m46156Sq());
        ((InterfaceC20753u0) m103742Dp()).mo46039bt(TextUtils.equals(CoreUtility.f89233i, this.f46611C), profileAlbumItem);
    }

    /* renamed from: Cq */
    private final boolean m46130Cq() {
        ProfileAlbumItem profileAlbumItem = this.f46627S;
        if (profileAlbumItem != null) {
            return profileAlbumItem.m46303f();
        }
        return true;
    }

    /* renamed from: Dq */
    private final boolean m46131Dq() {
        if (this.f46621M.m117201c().m14692x() == 1) {
            return true;
        }
        return false;
    }

    /* renamed from: Eq */
    private final boolean m46132Eq() {
        if (m46142Lq() && m46141Kq()) {
            return true;
        }
        return false;
    }

    /* renamed from: Fq */
    private final boolean m46133Fq() {
        if (m46144Mq() && m46141Kq()) {
            return true;
        }
        return false;
    }

    /* renamed from: Gq */
    private final boolean m46134Gq() {
        ProfileAlbumItem profileAlbumItem = this.f46627S;
        if (profileAlbumItem != null) {
            AbstractC19074t.m100205c(profileAlbumItem);
            if (profileAlbumItem.m46300c().m46275c() && m46141Kq()) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: Hq */
    private final boolean m46135Hq() {
        if (m46146Nq() && m46141Kq()) {
            return true;
        }
        return false;
    }

    /* renamed from: Iq */
    private final boolean m46137Iq() {
        if (m46148Oq() && m46141Kq()) {
            return true;
        }
        return false;
    }

    /* renamed from: Jq */
    private final boolean m46139Jq() {
        return m46141Kq();
    }

    /* renamed from: Kq */
    private final boolean m46141Kq() {
        return AbstractC19074t.m100204b(this.f46611C, CoreUtility.f89233i);
    }

    /* renamed from: Lq */
    private final boolean m46142Lq() {
        ProfileAlbumItem profileAlbumItem = this.f46627S;
        if (profileAlbumItem != null) {
            AbstractC19074t.m100205c(profileAlbumItem);
            if (profileAlbumItem.m46304g()) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: Mq */
    private final boolean m46144Mq() {
        ProfileAlbumItem profileAlbumItem = this.f46627S;
        if (profileAlbumItem != null) {
            AbstractC19074t.m100205c(profileAlbumItem);
            if (profileAlbumItem.m46305h()) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: Nq */
    private final boolean m46146Nq() {
        ProfileAlbumItem profileAlbumItem = this.f46627S;
        if (profileAlbumItem != null) {
            AbstractC19074t.m100205c(profileAlbumItem);
            if (profileAlbumItem.m46308k()) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: Oq */
    private final boolean m46148Oq() {
        ProfileAlbumItem profileAlbumItem = this.f46627S;
        if (profileAlbumItem != null) {
            AbstractC19074t.m100205c(profileAlbumItem);
            if (profileAlbumItem.m46309l()) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: Pq */
    private final C3054x m46150Pq() {
        C3054x m46176mq = m46176mq();
        m46176mq.m14664V(1);
        m46176mq.m14663U(true);
        m46176mq.m14648F(this.f46615G);
        m46176mq.m14668Z(this.f46617I);
        m46176mq.m14651I(this.f46618J);
        m46176mq.m14666X(AbstractC23136l9.m118743r0(AbstractC8020f0.str_connection_error));
        m46176mq.m14650H(AbstractC23136l9.m118743r0(AbstractC8020f0.str_network_error_detail));
        m46176mq.m14657O(AbstractC16803z.im_connect);
        m46176mq.m14667Y(AbstractC23136l9.m118743r0(AbstractC8020f0.tap_to_retry));
        m46176mq.m14661S(AbstractC23136l9.m118742r(60.0f));
        m46176mq.m14665W(0);
        return m46176mq;
    }

    /* renamed from: Qq */
    private final C3054x m46152Qq() {
        int descColor;
        int m7147p;
        C3054x m46176mq = m46176mq();
        m46176mq.m14664V(2);
        m46176mq.m14663U(true);
        m46176mq.m14648F(this.f46615G);
        m46176mq.m14655M(true);
        ProfileAlbumItem profileAlbumItem = this.f46627S;
        if (profileAlbumItem != null) {
            ThemeItem m46285m = profileAlbumItem.m46300c().m46285m();
            m46176mq.m14648F(m46285m.getDecorAlbum().getBgColor());
            m46176mq.m14649G(m46285m.getContent().getEmptyBorderColor());
            if (m46285m.isThemeDefault()) {
                descColor = C23212s8.m119606n(AbstractC21196a.TextColor1);
            } else {
                descColor = m46285m.getContent().getDescColor();
            }
            m46176mq.m14668Z(descColor);
            if (m46285m.isThemeDefault()) {
                m7147p = C23212s8.m119606n(AbstractC21196a.TextColor1);
            } else {
                m7147p = AbstractC1409d.m7147p(m46285m.getContent().getDescColor(), 178);
            }
            m46176mq.m14651I(m7147p);
            if (m46141Kq()) {
                if (m46137Iq()) {
                    m46176mq.m14666X(AbstractC23136l9.m118743r0(AbstractC8020f0.str_profile_empty_video_album_title));
                    m46176mq.m14657O(AbstractC16803z.icon_profile_empty_video_album_detail);
                    m46176mq.m14667Y(AbstractC23136l9.m118743r0(AbstractC8020f0.str_profile_empty_video_album_button));
                    m46176mq.m14665W(1);
                } else if (m46135Hq()) {
                    m46176mq.m14666X(AbstractC23136l9.m118743r0(AbstractC8020f0.str_profile_user_album_empty_title));
                    m46176mq.m14650H(AbstractC23136l9.m118743r0(AbstractC8020f0.str_profile_user_album_empty_description));
                    m46176mq.m14657O(AbstractC16803z.icon_profile_empty_section_photo);
                    m46176mq.m14667Y(AbstractC23136l9.m118743r0(AbstractC8020f0.str_profile_user_album_empty_cta_button));
                    m46176mq.m14665W(4);
                } else if (m46133Fq() || m46132Eq()) {
                    m46176mq.m14666X(AbstractC23136l9.m118743r0(AbstractC8020f0.str_profile_empty_photo_title));
                    m46176mq.m14657O(AbstractC16803z.icon_profile_empty_section_photo);
                    if (m46133Fq()) {
                        m46176mq.m14667Y(AbstractC23136l9.m118743r0(AbstractC8020f0.str_profile_empty_cover_album_button));
                        m46176mq.m14665W(2);
                    } else if (m46132Eq()) {
                        m46176mq.m14667Y(AbstractC23136l9.m118743r0(AbstractC8020f0.str_profile_empty_avatar_album_button));
                        m46176mq.m14665W(3);
                    }
                }
            } else if (m46148Oq()) {
                m46176mq.m14666X(AbstractC23136l9.m118743r0(AbstractC8020f0.str_profile_empty_video_album_title));
                m46176mq.m14657O(AbstractC16803z.icon_profile_empty_video_album_detail);
            } else if (m46146Nq()) {
                m46176mq.m14666X(AbstractC23136l9.m118743r0(AbstractC8020f0.str_profile_user_album_empty_title));
                m46176mq.m14657O(AbstractC16803z.icon_profile_empty_section_photo);
            } else if (m46144Mq() || m46142Lq()) {
                m46176mq.m14666X(AbstractC23136l9.m118743r0(AbstractC8020f0.str_profile_empty_photo_title));
                m46176mq.m14657O(AbstractC16803z.icon_profile_empty_section_photo);
            }
        }
        return m46176mq;
    }

    /* renamed from: Rq */
    private final C3054x m46154Rq() {
        C3054x m46176mq = m46176mq();
        m46176mq.m14664V(3);
        m46176mq.m14663U(true);
        m46176mq.m14648F(this.f46615G);
        m46176mq.m14668Z(this.f46617I);
        m46176mq.m14651I(this.f46618J);
        m46176mq.m14657O(C23212s8.m119610r(AbstractC16781w.empty_deleted_feed));
        m46176mq.m14650H(AbstractC23136l9.m118743r0(AbstractC8020f0.str_profile_album_not_exist));
        m46176mq.m14661S(AbstractC23136l9.m118742r(60.0f));
        return m46176mq;
    }

    /* renamed from: Sq */
    private final C3054x m46156Sq() {
        C3054x m46167aq = m46167aq();
        m46167aq.m14664V(0);
        m46167aq.m14663U(false);
        return m46167aq;
    }

    /* renamed from: Uq */
    public final void m46158Uq(ItemAlbumMobile itemAlbumMobile, AnimationTarget animationTarget) {
        try {
            if (itemAlbumMobile.f42594q0 != null) {
                itemAlbumMobile.m40529p0();
                ((InterfaceC20753u0) m103742Dp()).mo70710wy(new Runnable() { // from class: iq.v0

                    /* renamed from: q */
                    public final /* synthetic */ ItemAlbumMobile f101929q;

                    /* renamed from: r */
                    public final /* synthetic */ AnimationTarget f101930r;

                    public /* synthetic */ RunnableC20758v0(ItemAlbumMobile itemAlbumMobile2, AnimationTarget animationTarget2) {
                        r2 = itemAlbumMobile2;
                        r3 = animationTarget2;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        C8662b.m46159Vq(C8662b.this, r2, r3);
                    }
                });
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: Vq */
    public static final void m46159Vq(C8662b c8662b, ItemAlbumMobile itemAlbumMobile, AnimationTarget animationTarget) {
        AbstractC19074t.m100208f(c8662b, "this$0");
        AbstractC19074t.m100208f(itemAlbumMobile, "$photoItem");
        AbstractC19074t.m100208f(animationTarget, "$animationTarget");
        c8662b.m46163Xq(itemAlbumMobile, animationTarget);
    }

    /* renamed from: Wq */
    private final void m46161Wq(int i11) {
        PrivacyInfo privacyInfo;
        ProfileAlbumHeader m46300c;
        InterfaceC20753u0 interfaceC20753u0 = (InterfaceC20753u0) m103742Dp();
        ProfilePreviewAlbumItemImpl m46320b = ProfilePreviewAlbumItem.Companion.m46320b();
        ProfileAlbumItem profileAlbumItem = this.f46627S;
        if (profileAlbumItem != null) {
            m46320b.setTitle(profileAlbumItem.m46300c().m46286n());
            m46320b.setId(profileAlbumItem.m46300c().m46277e());
            m46320b.setThemeInfo(profileAlbumItem.m46300c().m46285m());
            m46320b.setThumb(profileAlbumItem.m46300c().m46273a());
            m46320b.setPrivacyType(profileAlbumItem.m46300c().m46282j().f45973p);
            m46320b.setSize(profileAlbumItem.m46300c().m46287o());
            m46320b.setRemain(profileAlbumItem.m46300c().m46283k());
        }
        C24848g0 c24848g0 = C24848g0.f119245a;
        ProfileAlbumItem profileAlbumItem2 = this.f46627S;
        if (profileAlbumItem2 == null || (m46300c = profileAlbumItem2.m46300c()) == null || (privacyInfo = m46300c.m46282j()) == null) {
            privacyInfo = new PrivacyInfo();
        }
        interfaceC20753u0.mo46022GE(i11, m46320b, privacyInfo);
    }

    /* renamed from: Xp */
    private final void m46162Xp(C3054x c3054x) {
        this.f46621M.m117206h(c3054x);
        m46174er();
    }

    /* renamed from: Xq */
    private final void m46163Xq(ItemAlbumMobile itemAlbumMobile, AnimationTarget animationTarget) {
        C3020p0 c3020p0;
        ProfileAlbumItem profileAlbumItem = this.f46627S;
        if (profileAlbumItem != null) {
            ArrayList arrayList = new ArrayList();
            Iterator it = profileAlbumItem.m46301d().iterator();
            boolean z11 = false;
            int i11 = -1;
            int i12 = 0;
            while (it.hasNext()) {
                for (C32187y4 c32187y4 : ((AbstractC32173x4) it.next()).m155151j()) {
                    i11++;
                    ItemAlbumMobile itemAlbumMobile2 = new ItemAlbumMobile();
                    itemAlbumMobile2.f42607x = c32187y4.m155185m();
                    itemAlbumMobile2.f42548C = c32187y4.m155191s();
                    itemAlbumMobile2.f42591p = c32187y4.m155188p();
                    itemAlbumMobile2.f42594q0 = new C3020p0();
                    itemAlbumMobile2.f42593q = c32187y4.m155182j();
                    long m155183k = c32187y4.m155183k();
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(m155183k);
                    itemAlbumMobile2.f42595r = sb2.toString();
                    arrayList.add(itemAlbumMobile2);
                    if (AbstractC19074t.m100204b(itemAlbumMobile.f42595r, String.valueOf(c32187y4.m155183k()))) {
                        if (itemAlbumMobile.f42591p == 2 && (c3020p0 = itemAlbumMobile.f42594q0) != null) {
                            itemAlbumMobile2.f42594q0 = c3020p0;
                        }
                        i12 = i11;
                    }
                }
            }
            Bundle bundle = new Bundle();
            if (!TextUtils.isEmpty(this.f46611C) && AbstractC19074t.m100204b(CoreUtility.f89233i, this.f46611C)) {
                z11 = true;
            }
            bundle.putParcelableArrayList("medialist", new ArrayList<>(arrayList));
            bundle.putInt("currentIndex", i12);
            bundle.putString("userId", this.f46611C);
            if (m46142Lq()) {
                bundle.putBoolean("fromAlbumAvatar", true);
                if (z11) {
                    bundle.putParcelable("extra_action_data", ActionDataImageViewer.m45082c());
                }
            }
            bundle.putBoolean("EXTRA_BOL_IS_PICK_AVATAR", this.f46624P);
            if (m46144Mq()) {
                bundle.putBoolean("fromAlbumCover", true);
            }
            bundle.putString("extra_entry_point_flow", this.f46644z.m154277l());
            bundle.putBoolean("fromAlbum", true);
            bundle.putInt("EXTRA_INT_SUB_TITLE_MODE", 3);
            bundle.putInt("EXTRA_INT_IMAGE_VIEWER_TYPE", 4);
            bundle.putBoolean("fromMyProfile", z11);
            ((InterfaceC20753u0) m103742Dp()).mo46026O3(animationTarget, itemAlbumMobile, i12, bundle);
        }
    }

    /* renamed from: Yp */
    public final void m46164Yp(C3010n0 c3010n0) {
        this.f46621M.m117208j(c3010n0);
        m46174er();
    }

    /* renamed from: Yq */
    private final void m46165Yq() {
        C23055e5.m118272g(true);
        m46180sq();
    }

    /* renamed from: Zp */
    private final void m46166Zp() {
        ProfileAlbumItem profileAlbumItem = this.f46627S;
        if (profileAlbumItem != null) {
            if (profileAlbumItem.m46300c().m46282j().m45153y()) {
                profileAlbumItem.m46300c().m46282j().m45137N();
                if (C23055e5.m118272g(true)) {
                    ((InterfaceC20753u0) m103742Dp()).mo46829Y();
                    BuildersKt__Builders_commonKt.m112540d(AbstractC20504a.m106544a(this), null, null, new b(profileAlbumItem, null), 3, null);
                    return;
                }
                return;
            }
            if (profileAlbumItem.m46300c().m46282j().f45973p == 0) {
                profileAlbumItem.m46300c().m46282j().f45977t = 40;
            } else {
                profileAlbumItem.m46300c().m46282j().f45977t = 50;
            }
            ((InterfaceC20753u0) m103742Dp()).mo46032U0(profileAlbumItem.m46300c().m46282j());
        }
    }

    /* renamed from: aq */
    private final C3054x m46167aq() {
        C3054x m117201c = this.f46621M.m117201c();
        m117201c.m14666X("");
        m117201c.m14650H("");
        return m117201c;
    }

    /* renamed from: bq */
    private final void m46168bq() {
        C22638b c22638b = this.f46621M;
        c22638b.m117200b();
        c22638b.mo117197a(84);
        c22638b.mo117197a(72);
    }

    /* renamed from: br */
    private final void m46169br(boolean z11) {
        this.f46623O = z11;
        m46221gq();
    }

    /* renamed from: cq */
    private final void m46170cq() {
        this.f46620L.m123092b();
    }

    /* renamed from: cr */
    private final void m46171cr() {
        ProfileAlbumItem profileAlbumItem = this.f46627S;
        if (profileAlbumItem != null) {
            C1761c0 c1761c0 = this.f46633Y;
            C20733q0 c20733q0 = (C20733q0) c1761c0.mo9215f();
            if (c20733q0 != null) {
                c20733q0.m108170g(profileAlbumItem.m46300c().m46285m().getDecorAlbum().getBgColor());
                c20733q0.m108174k(profileAlbumItem.m46300c().m46285m().getContent().getTextColor01());
                c20733q0.m108172i(profileAlbumItem.m46300c().m46285m().getLineDividerColor());
                c20733q0.m108171h(profileAlbumItem.m46300c().m46285m().getContent().getArrowColor());
                c20733q0.m108173j(m46184wq());
            } else {
                c20733q0 = null;
            }
            c1761c0.mo9224q(c20733q0);
        }
    }

    /* renamed from: dr */
    private final void m46172dr() {
        boolean z11;
        if (this.f46627S != null) {
            C1761c0 c1761c0 = this.f46632X;
            C20738r0 c20738r0 = (C20738r0) c1761c0.mo9215f();
            if (c20738r0 != null) {
                if (!m46130Cq() && !((InterfaceC20753u0) m103742Dp()).mo46034Ww() && m46141Kq() && m46135Hq() && !this.f46629U && !this.f46625Q) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                c20738r0.m108181f(z11);
                c20738r0.m108180e(C23212s8.m119606n(AbstractC16781w.AppPrimaryColor));
                c20738r0.m108179d(C23212s8.m119606n(AbstractC16781w.PrimaryBackgroundColor));
            } else {
                c20738r0 = null;
            }
            c1761c0.mo9224q(c20738r0);
        }
    }

    /* renamed from: eq */
    private final void m46173eq(ItemAlbumMobile itemAlbumMobile, AnimationTarget animationTarget) {
        ((InterfaceC20753u0) m103742Dp()).mo46829Y();
        this.f46630V.m108704d(itemAlbumMobile, new f(animationTarget), this.f46644z);
        if (m46141Kq()) {
            AbstractC23647d.m123897g("6630");
        } else {
            AbstractC23647d.m123897g("7630");
        }
    }

    /* renamed from: er */
    private final void m46174er() {
        C1761c0 c1761c0 = this.f46634Z;
        C20743s0 c20743s0 = (C20743s0) c1761c0.mo9215f();
        if (c20743s0 != null) {
            c20743s0.m108183b(this.f46622N);
        } else {
            c20743s0 = null;
        }
        c1761c0.mo9224q(c20743s0);
    }

    /* renamed from: fq */
    private final void m46175fq() {
        BuildersKt__Builders_commonKt.m112540d(AbstractC20504a.m106544a(this), null, null, new g(null), 3, null);
    }

    /* renamed from: mq */
    private final C3054x m46176mq() {
        C3054x m117201c = this.f46621M.m117201c();
        m117201c.m14666X("");
        m117201c.m14650H("");
        return m117201c;
    }

    /* renamed from: nq */
    public final C19081a m46177nq() {
        return (C19081a) this.f46640v.getValue();
    }

    /* renamed from: oq */
    public final C19082b m46178oq() {
        return (C19082b) this.f46641w.getValue();
    }

    /* renamed from: pq */
    public final C19083c m46179pq() {
        return (C19083c) this.f46639u.getValue();
    }

    /* renamed from: sq */
    private final void m46180sq() {
        if (this.f46627S == null) {
            m46169br(true);
        }
        BuildersKt__Builders_commonKt.m112540d(AbstractC20504a.m106544a(this), null, null, new i(null), 3, null);
    }

    /* renamed from: tq */
    public final C19084d m46181tq() {
        return (C19084d) this.f46643y.getValue();
    }

    /* renamed from: uq */
    public final C19085e m46182uq() {
        return (C19085e) this.f46638t.getValue();
    }

    /* renamed from: vq */
    private final void m46183vq() {
        ProfileAlbumItem profileAlbumItem = this.f46627S;
        if (profileAlbumItem != null && profileAlbumItem.m46300c().m46276d()) {
            BuildersKt__Builders_commonKt.m112540d(AbstractC20504a.m106544a(this), null, null, new j(profileAlbumItem, null), 3, null);
        }
    }

    /* renamed from: wq */
    private final String m46184wq() {
        ProfileAlbumHeader m46300c;
        String m46286n;
        ProfileAlbumItem profileAlbumItem = this.f46627S;
        if (profileAlbumItem == null || (m46300c = profileAlbumItem.m46300c()) == null || (m46286n = m46300c.m46286n()) == null) {
            return "";
        }
        return m46286n;
    }

    /* renamed from: xq */
    public final C19089i m46185xq() {
        return (C19089i) this.f46642x.getValue();
    }

    @Override // iq.InterfaceC20748t0
    /* renamed from: Ag */
    public void mo46186Ag(String str, String str2) {
        if (!TextUtils.isEmpty(str) || !TextUtils.isEmpty(str2)) {
            if (TextUtils.isEmpty(str2)) {
                ((InterfaceC20753u0) m103742Dp()).mo46025Np(m46219g(), false);
            } else {
                ((InterfaceC20753u0) m103742Dp()).mo46019C8();
            }
        }
    }

    /* renamed from: Bq */
    public final void m46187Bq(ProfileAlbumItem profileAlbumItem) {
        AbstractC19074t.m100208f(profileAlbumItem, "albumItem");
        m46207Zq(profileAlbumItem);
    }

    @Override // iq.InterfaceC20748t0
    /* renamed from: D */
    public void mo46188D() {
        BuildersKt__Builders_commonKt.m112540d(AbstractC20504a.m106544a(this), null, null, new m(null), 3, null);
        m46221gq();
        m46180sq();
    }

    @Override // iq.InterfaceC20748t0
    /* renamed from: E */
    public void mo46189E() {
        m46180sq();
    }

    @Override // iq.InterfaceC20748t0
    /* renamed from: E2 */
    public void mo46190E2(ItemAlbumMobile itemAlbumMobile) {
        AbstractC19074t.m100208f(itemAlbumMobile, "photo");
        if (itemAlbumMobile.f42591p == 1) {
            ((InterfaceC20753u0) m103742Dp()).mo46021D3(itemAlbumMobile);
        }
    }

    @Override // iq.InterfaceC20748t0
    /* renamed from: E3 */
    public void mo46191E3(String str) {
        BuildersKt__Builders_commonKt.m112540d(AbstractC20504a.m106544a(this), null, null, new n(str, this, null), 3, null);
    }

    @Override // iq.InterfaceC20748t0
    /* renamed from: E5 */
    public void mo46192E5(int i11) {
        boolean z11;
        if (i11 > 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.f46629U = z11;
        m46172dr();
    }

    @Override // iq.InterfaceC20748t0
    /* renamed from: G0 */
    public void mo46193G0(int i11) {
        List m131502j;
        List m131502j2;
        ((InterfaceC20753u0) m103742Dp()).mo46033U2();
        if (i11 != 70) {
            if (i11 != 80) {
                if (i11 != 90) {
                    m46218fr(i11);
                    return;
                }
                ProfileAlbumItem profileAlbumItem = this.f46627S;
                if (profileAlbumItem != null) {
                    InterfaceC20753u0 interfaceC20753u0 = (InterfaceC20753u0) m103742Dp();
                    if (profileAlbumItem.m46300c().m46282j().f45977t != i11) {
                        m131502j2 = AbstractC25368s.m131502j();
                    } else {
                        m131502j2 = profileAlbumItem.m46300c().m46282j().m45138e();
                        AbstractC19074t.m100207e(m131502j2, "convertToInviteContactProfile(...)");
                    }
                    interfaceC20753u0.mo46020D2(m131502j2);
                    return;
                }
                return;
            }
            ((InterfaceC20753u0) m103742Dp()).mo46041f4();
            return;
        }
        ProfileAlbumItem profileAlbumItem2 = this.f46627S;
        if (profileAlbumItem2 != null) {
            InterfaceC20753u0 interfaceC20753u02 = (InterfaceC20753u0) m103742Dp();
            if (profileAlbumItem2.m46300c().m46282j().f45977t != i11) {
                m131502j = AbstractC25368s.m131502j();
            } else {
                m131502j = profileAlbumItem2.m46300c().m46282j().m45138e();
                AbstractC19074t.m100207e(m131502j, "convertToInviteContactProfile(...)");
            }
            interfaceC20753u02.mo46057u0(m131502j);
        }
    }

    @Override // iq.InterfaceC20748t0
    /* renamed from: Ih */
    public void mo46194Ih() {
        if (((InterfaceC20753u0) m103742Dp()).mo46034Ww()) {
            m46210ar(false);
        } else {
            ((InterfaceC20753u0) m103742Dp()).mo46019C8();
        }
    }

    @Override // iq.InterfaceC20748t0
    /* renamed from: L1 */
    public void mo46195L1() {
        m46210ar(false);
        ProfileAlbumItem profileAlbumItem = this.f46627S;
        if (profileAlbumItem != null) {
            profileAlbumItem.m46300c().m46270C(this.f46635a0);
        } else {
            profileAlbumItem = null;
        }
        m46207Zq(profileAlbumItem);
    }

    @Override // iq.InterfaceC20748t0
    /* renamed from: Lm */
    public void mo46196Lm(int i11, ArrayList arrayList) {
        BuildersKt__Builders_commonKt.m112540d(AbstractC20504a.m106544a(this), null, null, new p(arrayList, this, null), 3, null);
    }

    @Override // iq.InterfaceC20748t0
    /* renamed from: N2 */
    public void mo46197N2(ThemeItem themeItem) {
        AbstractC19074t.m100208f(themeItem, "theme");
        m46210ar(false);
        ProfileAlbumItem profileAlbumItem = this.f46627S;
        if (profileAlbumItem != null) {
            TrackingSource m154374t = C32017m4.m154326S().m154374t(this.f46609A);
            AbstractC19074t.m100207e(m154374t, "createTrackingSourceEditAlbum(...)");
            m46214dq(profileAlbumItem, m154374t);
        }
    }

    @Override // p205hc.AbstractC19962a, p205hc.InterfaceC19966e
    /* renamed from: Nd */
    public void mo995Nd(InterfaceC19969h interfaceC19969h, InterfaceC19968g interfaceC19968g) {
        super.mo995Nd(interfaceC19969h, interfaceC19968g);
        C20679f1 c20679f1 = (C20679f1) interfaceC19969h;
        if (c20679f1 != null) {
            String str = c20679f1.f101681b;
            AbstractC19074t.m100207e(str, "userID");
            this.f46611C = str;
            this.f46613E = c20679f1.f101683d;
            this.f46614F = c20679f1.f101682c;
            this.f46615G = c20679f1.f101689j;
            this.f46616H = c20679f1.f101690k;
            this.f46617I = c20679f1.f101691l;
            this.f46618J = c20679f1.f101692m;
            this.f46619K = c20679f1.f101693n;
            this.f46624P = c20679f1.f101687h;
            this.f46625Q = c20679f1.f101688i;
            C32002l4 c32002l4 = c20679f1.f101680a;
            if (c32002l4 != null) {
                this.f46644z.m154273c(c32002l4);
            }
            ContactProfile m141798e = C28203u6.m141798e(C28203u6.f131407a, this.f46611C, null, 2, null);
            if (m141798e != null) {
                String m114542i = AbstractC21935u.m114542i(this.f46611C, m141798e.f42437s);
                AbstractC19074t.m100207e(m114542i, "convertZingNameToPhoneName(...)");
                this.f46612D = m114542i;
            }
        }
    }

    @Override // iq.InterfaceC20748t0
    /* renamed from: S6 */
    public void mo46199S6() {
        BuildersKt__Builders_commonKt.m112540d(AbstractC20504a.m106544a(this), null, null, new o(null), 3, null);
    }

    @Override // androidx.lifecycle.InterfaceC1764d0
    /* renamed from: Tq */
    public void mo8524qp(ProfileAlbumItem profileAlbumItem) {
        if (profileAlbumItem == null) {
            return;
        }
        try {
            m46187Bq(profileAlbumItem);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // iq.InterfaceC20748t0
    /* renamed from: V0 */
    public void mo46201V0(ThemeItem themeItem) {
        AbstractC19074t.m100208f(themeItem, "theme");
        ProfileAlbumItem profileAlbumItem = this.f46627S;
        if (profileAlbumItem != null) {
            profileAlbumItem.m46300c().m46270C(themeItem);
        } else {
            profileAlbumItem = null;
        }
        m46207Zq(profileAlbumItem);
    }

    @Override // iq.InterfaceC20748t0
    /* renamed from: Vl */
    public void mo46202Vl() {
        this.f46609A = this.f46644z.m154284u(42);
        m46210ar(true);
    }

    @Override // iq.InterfaceC20748t0
    /* renamed from: W0 */
    public void mo46203W0() {
        if (m46134Gq()) {
            this.f46610B = 43;
            m46166Zp();
        }
    }

    @Override // iq.InterfaceC20748t0
    /* renamed from: W9 */
    public void mo46204W9() {
        this.f46609A = this.f46644z.m154284u(41);
        m46210ar(true);
    }

    @Override // iq.InterfaceC20748t0
    /* renamed from: Y1 */
    public void mo46205Y1(int i11, Intent intent) {
        ArrayList parcelableArrayListExtra;
        int i12;
        try {
            if (i11 == -1 && intent != null) {
                if (intent.hasExtra("extra_selected_profiles") && (parcelableArrayListExtra = intent.getParcelableArrayListExtra("extra_selected_profiles")) != null) {
                    PrivacyInfo.m45127K(parcelableArrayListExtra);
                    if (parcelableArrayListExtra.isEmpty()) {
                        i12 = 40;
                    } else {
                        i12 = 90;
                    }
                    m46218fr(i12);
                }
            } else {
                ProfileAlbumItem profileAlbumItem = this.f46627S;
                if (profileAlbumItem != null) {
                    ((InterfaceC20753u0) m103742Dp()).mo46032U0(profileAlbumItem.m46300c().m46282j());
                }
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: Ya */
    public final String m46206Ya() {
        return this.f46611C;
    }

    /* renamed from: Zq */
    public final void m46207Zq(ProfileAlbumItem profileAlbumItem) {
        this.f46627S = profileAlbumItem;
        if (profileAlbumItem != null) {
            m46169br(false);
            m46164Yp(new C3010n0(0));
            ((InterfaceC20753u0) m103742Dp()).mo46038a0();
            if (profileAlbumItem.m46301d().isEmpty()) {
                m46162Xp(m46152Qq());
            }
            if (profileAlbumItem.m46308k() && m46141Kq() && !this.f46625Q) {
                ((InterfaceC20753u0) m103742Dp()).mo46017As();
            } else {
                ((InterfaceC20753u0) m103742Dp()).mo46056tw();
            }
            m46172dr();
            m46171cr();
            if (!this.f46625Q) {
                ((InterfaceC20753u0) m103742Dp()).setBackgroundColor(profileAlbumItem.m46300c().m46285m().getDecorAlbum().getBgColor());
            }
        } else {
            m46162Xp(m46154Rq());
            m46164Yp(new C3010n0(0));
        }
        m46221gq();
    }

    @Override // iq.InterfaceC20748t0
    /* renamed from: a1 */
    public void mo46208a1() {
        ((InterfaceC20753u0) m103742Dp()).mo46043h2();
        ((InterfaceC20753u0) m103742Dp()).mo46046i2();
        ((InterfaceC20753u0) m103742Dp()).setBackgroundColor(this.f46615G);
        ((InterfaceC20753u0) m103742Dp()).mo46045hv();
        ((InterfaceC20753u0) m103742Dp()).mo46040dI(true);
        C1761c0 c1761c0 = this.f46633Y;
        C20733q0 c20733q0 = (C20733q0) c1761c0.mo9215f();
        if (c20733q0 != null) {
            c20733q0.m108170g(this.f46615G);
            c20733q0.m108174k(this.f46616H);
            c20733q0.m108173j(m46184wq());
            c20733q0.m108171h(this.f46619K);
        } else {
            c20733q0 = null;
        }
        c1761c0.mo9224q(c20733q0);
    }

    @Override // iq.InterfaceC20748t0
    /* renamed from: af */
    public void mo46209af() {
        int m14693y = this.f46621M.m117201c().m14693y();
        if (m14693y != 0) {
            if (m14693y != 1) {
                if (m14693y != 2) {
                    if (m14693y != 3) {
                        if (m14693y == 4) {
                            m46161Wq(36);
                            return;
                        }
                        return;
                    } else {
                        if (m46132Eq()) {
                            ((InterfaceC20753u0) m103742Dp()).mo46025Np(this.f46644z.m154284u(23), true);
                            return;
                        }
                        return;
                    }
                }
                if (m46133Fq()) {
                    ((InterfaceC20753u0) m103742Dp()).mo46055su(this.f46644z.m154284u(25));
                    return;
                }
                return;
            }
            if (m46137Iq()) {
                ((InterfaceC20753u0) m103742Dp()).mo46058uA(30);
                return;
            }
            return;
        }
        m46165Yq();
    }

    /* renamed from: ar */
    public final void m46210ar(boolean z11) {
        this.f46628T = z11;
        if (z11) {
            ProfileAlbumItem profileAlbumItem = this.f46627S;
            if (profileAlbumItem != null) {
                this.f46635a0 = profileAlbumItem.m46300c().m46285m();
                ((InterfaceC20753u0) m103742Dp()).mo46059ya(profileAlbumItem.m46300c().m46285m());
                m46172dr();
            }
        } else {
            ((InterfaceC20753u0) m103742Dp()).mo46054rh();
            m46172dr();
        }
        this.f46631W.mo9224q(Boolean.valueOf(!z11));
    }

    @Override // iq.InterfaceC20748t0
    /* renamed from: bh */
    public void mo46211bh(ItemAlbumMobile itemAlbumMobile, AnimationTarget animationTarget) {
        AbstractC19074t.m100208f(itemAlbumMobile, "photo");
        AbstractC19074t.m100208f(animationTarget, "animationTarget");
        m46173eq(itemAlbumMobile, animationTarget);
    }

    @Override // iq.InterfaceC20748t0
    /* renamed from: d8 */
    public void mo46212d8() {
        ProfileAlbumItem profileAlbumItem;
        ProfileAlbumHeader m46300c;
        if (!((InterfaceC20753u0) m103742Dp()).mo46034Ww() && (profileAlbumItem = this.f46627S) != null && (m46300c = profileAlbumItem.m46300c()) != null) {
            ((InterfaceC20753u0) m103742Dp()).mo46018Be(this.f46613E, m46300c.m46282j().f45973p);
        }
    }

    /* renamed from: dq */
    public final void m46214dq(ProfileAlbumItem profileAlbumItem, TrackingSource trackingSource) {
        AbstractC19074t.m100208f(profileAlbumItem, "<this>");
        AbstractC19074t.m100208f(trackingSource, "trackingSource");
        BuildersKt__Builders_commonKt.m112540d(AbstractC20504a.m106544a(this), null, null, new e(profileAlbumItem, trackingSource, null), 3, null);
    }

    @Override // iq.InterfaceC20748t0
    /* renamed from: e */
    public void mo46215e() {
        try {
            if (!C23055e5.m118273h(false, 1, null)) {
                ((InterfaceC20753u0) m103742Dp()).mo46038a0();
                if (!m46131Dq()) {
                    ((InterfaceC20753u0) m103742Dp()).mo46030S();
                }
            } else {
                ((InterfaceC20753u0) m103742Dp()).mo46031T();
                m46180sq();
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // iq.InterfaceC20748t0
    /* renamed from: e2 */
    public void mo46216e2() {
        if (m46132Eq()) {
            ((InterfaceC20753u0) m103742Dp()).mo46025Np(this.f46644z.m154284u(22), true);
            return;
        }
        if (m46133Fq()) {
            ((InterfaceC20753u0) m103742Dp()).mo46055su(this.f46644z.m154284u(24));
        } else if (m46137Iq()) {
            ((InterfaceC20753u0) m103742Dp()).mo46058uA(28);
        } else if (m46135Hq()) {
            m46161Wq(0);
        }
    }

    @Override // iq.InterfaceC20748t0
    /* renamed from: f8 */
    public void mo46217f8() {
        this.f46626R = 0;
        m46221gq();
    }

    /* renamed from: fr */
    public final void m46218fr(int i11) {
        ProfileAlbumHeader m46300c;
        ProfileAlbumItem profileAlbumItem = this.f46627S;
        if (profileAlbumItem != null && (m46300c = profileAlbumItem.m46300c()) != null) {
            m46300c.m46269B(new PrivacyInfo());
            m46300c.m46282j().f45977t = i11;
            if (i11 != 40) {
                if (i11 != 50) {
                    if (i11 != 90) {
                        PrivacyInfo m45134q = PrivacyInfo.m45134q(i11);
                        AbstractC19074t.m100207e(m45134q, "getRecentPrivacy(...)");
                        m46300c.m46269B(m45134q);
                    } else {
                        PrivacyInfo m45133i = PrivacyInfo.m45133i();
                        AbstractC19074t.m100207e(m45133i, "getExcludedFriendsPrivacy(...)");
                        m46300c.m46269B(m45133i);
                    }
                } else {
                    m46300c.m46282j().f45973p = 1;
                }
            } else {
                m46300c.m46282j().f45973p = 0;
            }
            m46175fq();
            m46221gq();
        }
    }

    /* renamed from: g */
    public C32002l4 m46219g() {
        return this.f46644z;
    }

    @Override // iq.InterfaceC20748t0
    /* renamed from: g2 */
    public void mo46220g2(ThemeItem themeItem) {
        AbstractC19074t.m100208f(themeItem, "selectedTheme");
        C0815e1.m2075D().m2100V(C32017m4.m154326S().m154343Q(this.f46644z.m154284u(50)), false);
    }

    /* renamed from: gq */
    public final List m46221gq() {
        Object m131207g0;
        Object m131217q0;
        boolean z11;
        boolean z12;
        float m14204d;
        String m127114D;
        try {
            ProfileAlbumItem profileAlbumItem = this.f46627S;
            this.f46622N.clear();
            if (this.f46623O) {
                List list = this.f46622N;
                C2958c3 c2958c3 = new C2958c3(3);
                c2958c3.m14008e(AbstractC1409d.m7135d(this.f46615G, C23212s8.m119606n(AbstractC16781w.ImagePlaceHolderColor), 0.1f));
                list.add(new C2966e1(c2958c3));
            } else if (profileAlbumItem != null) {
                String str = null;
                int i11 = 0;
                if (!this.f46625Q) {
                    List list2 = this.f46622N;
                    C2996k1 c2996k1 = new C2996k1(profileAlbumItem.m46300c().m46286n(), null, 2, null);
                    c2996k1.m14225y(profileAlbumItem.m46300c().m46285m());
                    c2996k1.m14214n(profileAlbumItem.m46300c().m46284l());
                    c2996k1.m14215o(profileAlbumItem.m46300c().m46274b());
                    if (!TextUtils.isEmpty(c2996k1.m14201a())) {
                        m127114D = AbstractC24341v.m127114D(c2996k1.m14201a(), "display_name", this.f46612D, false, 4, null);
                        c2996k1.m14215o(m127114D);
                    }
                    c2996k1.m14220t(profileAlbumItem.m46302e());
                    c2996k1.m14221u(profileAlbumItem.m46300c().m46282j());
                    if ((!profileAlbumItem.m46301d().isEmpty()) && profileAlbumItem.m46308k()) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    c2996k1.m14216p(z11);
                    if (this.f46626R == 1) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    c2996k1.m14223w(z12);
                    if (!profileAlbumItem.m46308k() && c2996k1.m14206f().isThemeDefault()) {
                        m14204d = 0.0f;
                    } else {
                        m14204d = c2996k1.m14204d();
                    }
                    c2996k1.m14222v(m14204d);
                    if (profileAlbumItem.m46308k()) {
                        c2996k1.m14217q(m46139Jq());
                        c2996k1.m14219s(false);
                    } else {
                        String m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_profile_album_privacy_user_album);
                        AbstractC19074t.m100207e(m118743r0, "getString(...)");
                        c2996k1.m14224x(m118743r0);
                        c2996k1.m14219s(m46141Kq());
                        c2996k1.m14218r(profileAlbumItem.m46300c().m46275c());
                        c2996k1.m14217q(false);
                        c2996k1.m14226z(false);
                    }
                    list2.add(new C2966e1(c2996k1));
                }
                Calendar calendar = Calendar.getInstance();
                int size = profileAlbumItem.m46301d().size();
                while (i11 < size) {
                    AbstractC32173x4 abstractC32173x4 = (AbstractC32173x4) profileAlbumItem.m46301d().get(i11);
                    i11++;
                    m131207g0 = AbstractC25332a0.m131207g0(profileAlbumItem.m46301d(), i11);
                    AbstractC32173x4 abstractC32173x42 = (AbstractC32173x4) m131207g0;
                    int textColor01 = profileAlbumItem.m46300c().m46285m().getContent().getTextColor01();
                    if (abstractC32173x4.m155153l()) {
                        this.f46622N.add(new C2966e1(new C3065z2(textColor01), abstractC32173x4));
                    }
                    for (List list3 : abstractC32173x4.m155150i()) {
                        m131217q0 = AbstractC25332a0.m131217q0(this.f46622N);
                        C2966e1 c2966e1 = (C2966e1) m131217q0;
                        if (c2966e1 != null && c2966e1.f11705c == 56) {
                            this.f46622N.add(new C2966e1(58, abstractC32173x4, (List) null));
                        }
                        this.f46622N.add(new C2966e1(56, abstractC32173x4, list3, profileAlbumItem));
                    }
                    if (abstractC32173x42 != null && !C23250w4.m119791S(abstractC32173x4, abstractC32173x42)) {
                        calendar.setTimeInMillis(abstractC32173x42.m155147f());
                        this.f46622N.add(new C2966e1(new C2948a3(String.valueOf(calendar.get(1)), textColor01, profileAlbumItem.m46300c().m46285m().getLineDividerColor()), abstractC32173x42));
                    }
                }
                if (!profileAlbumItem.m46300c().m46276d()) {
                    C2944a c2944a = new C2944a();
                    if (profileAlbumItem.m46300c().m46287o() > 8) {
                        c2944a.m13936e(profileAlbumItem.m46302e());
                    }
                    if (!this.f46625Q) {
                        if (m46132Eq()) {
                            str = AbstractC23136l9.m118743r0(AbstractC8020f0.str_profile_avatar_album_button);
                        } else if (m46133Fq()) {
                            str = AbstractC23136l9.m118743r0(AbstractC8020f0.str_profile_cover_album_button);
                        } else if (m46137Iq()) {
                            str = AbstractC23136l9.m118743r0(AbstractC8020f0.str_profile_video_album_button);
                        }
                        if (str != null) {
                            c2944a.m13939h(str);
                        }
                    }
                    this.f46622N.add(new C2966e1(c2944a));
                }
            }
            m46170cq();
            m46168bq();
            this.f46622N.addAll(this.f46620L.m123093c());
            this.f46622N.addAll(this.f46621M.m117204f());
            m46174er();
        } catch (Exception e11) {
            AbstractC20110a.f98889a.mo104552e(e11);
        }
        return this.f46622N;
    }

    @Override // iq.InterfaceC20748t0
    /* renamed from: h6 */
    public void mo46222h6(int i11) {
        boolean z11;
        C1761c0 c1761c0 = this.f46633Y;
        C20733q0 c20733q0 = (C20733q0) c1761c0.mo9215f();
        if (c20733q0 != null) {
            ProfileAlbumItem profileAlbumItem = this.f46627S;
            if ((profileAlbumItem != null && !profileAlbumItem.m46308k()) || i11 > 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            c20733q0.m108175l(z11);
        } else {
            c20733q0 = null;
        }
        c1761c0.mo9224q(c20733q0);
    }

    @Override // iq.InterfaceC20748t0
    /* renamed from: h9 */
    public void mo46223h9() {
        this.f46629U = false;
        m46172dr();
    }

    @Override // iq.InterfaceC20748t0
    /* renamed from: hq */
    public C1761c0 mo46230mi() {
        return this.f46633Y;
    }

    /* renamed from: iq */
    public final long m46225iq() {
        return this.f46613E;
    }

    @Override // iq.InterfaceC20748t0
    /* renamed from: j4 */
    public void mo46226j4() {
        m46183vq();
    }

    /* renamed from: jq */
    public final ProfileAlbumItem m46227jq() {
        return this.f46627S;
    }

    /* renamed from: kq */
    public final int m46228kq() {
        return this.f46614F;
    }

    @Override // iq.InterfaceC20748t0
    /* renamed from: lq */
    public C1761c0 mo46231oo() {
        return this.f46632X;
    }

    @Override // iq.InterfaceC20748t0
    /* renamed from: p2 */
    public void mo46232p2(int i11) {
        ((InterfaceC20753u0) m103742Dp()).mo46033U2();
        ProfileAlbumItem profileAlbumItem = this.f46627S;
        if (profileAlbumItem != null) {
            InterfaceC20753u0 interfaceC20753u0 = (InterfaceC20753u0) m103742Dp();
            List m45138e = profileAlbumItem.m46300c().m46282j().m45138e();
            AbstractC19074t.m100207e(m45138e, "convertToInviteContactProfile(...)");
            interfaceC20753u0.mo46057u0(m45138e);
        }
    }

    @Override // iq.InterfaceC20748t0
    /* renamed from: pm */
    public void mo46233pm(boolean z11) {
        C23648e m154343Q;
        if (!this.f46637c0 && z11) {
            this.f46636b0 = C23793c.Companion.m124321a().mo124311f();
        }
        if (!z11 && (m154343Q = C32017m4.m154326S().m154343Q(this.f46644z.m154284u(54))) != null) {
            m154343Q.m123919l()[0] = String.valueOf(C23793c.Companion.m124321a().mo124311f() - this.f46636b0);
            C0815e1.m2075D().m2100V(m154343Q, false);
        }
        this.f46637c0 = z11;
    }

    @Override // iq.InterfaceC20748t0
    /* renamed from: qq */
    public C1761c0 mo46213dj() {
        return this.f46631W;
    }

    @Override // iq.InterfaceC20748t0
    /* renamed from: rq */
    public C1761c0 mo46198Rh() {
        return this.f46634Z;
    }

    @Override // iq.InterfaceC20748t0
    /* renamed from: sa */
    public void mo46236sa() {
        m46161Wq(33);
    }

    @Override // iq.InterfaceC20748t0
    /* renamed from: t5 */
    public void mo46237t5() {
        this.f46610B = 44;
        m46166Zp();
    }

    @Override // iq.InterfaceC20748t0
    /* renamed from: tk */
    public void mo46238tk() {
        ProfileAlbumItem profileAlbumItem = this.f46627S;
        if (profileAlbumItem != null) {
            ArrayList arrayList = new ArrayList();
            Iterator it = profileAlbumItem.m46301d().iterator();
            while (it.hasNext()) {
                for (C32187y4 c32187y4 : ((AbstractC32173x4) it.next()).m155151j()) {
                    MediaItem mediaItem = new MediaItem();
                    mediaItem.m41149i1(c32187y4.m155187o());
                    mediaItem.mo41082W0(c32187y4.m155187o());
                    arrayList.add(mediaItem);
                }
            }
            ((InterfaceC20753u0) m103742Dp()).mo46037Zp(this.f46613E, profileAlbumItem.m46300c().m46286n(), profileAlbumItem.m46300c().m46274b(), profileAlbumItem.m46300c().m46285m(), profileAlbumItem.m46300c().m46282j(), new ArrayList(arrayList), this.f46644z.m154284u(42));
        }
    }

    @Override // iq.InterfaceC20748t0
    /* renamed from: w3 */
    public void mo46239w3(int i11, Intent intent) {
        ArrayList parcelableArrayListExtra;
        try {
            if (i11 == -1 && intent != null) {
                if (intent.hasExtra("extra_selected_profiles") && (parcelableArrayListExtra = intent.getParcelableArrayListExtra("extra_selected_profiles")) != null) {
                    if (parcelableArrayListExtra.isEmpty()) {
                        m46218fr(50);
                    } else {
                        m46218fr(PrivacyInfo.m45129a(parcelableArrayListExtra));
                    }
                }
            } else {
                ProfileAlbumItem profileAlbumItem = this.f46627S;
                if (profileAlbumItem != null) {
                    ((InterfaceC20753u0) m103742Dp()).mo46032U0(profileAlbumItem.m46300c().m46282j());
                }
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // iq.InterfaceC20748t0
    /* renamed from: x8 */
    public void mo46240x8(ItemAlbumMobile itemAlbumMobile, AnimationTarget animationTarget) {
        AbstractC19074t.m100208f(itemAlbumMobile, "photo");
        AbstractC19074t.m100208f(animationTarget, "animationTarget");
        try {
            m46163Xq(itemAlbumMobile, animationTarget);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: yq */
    public final void m46241yq() {
        ((InterfaceC20753u0) m103742Dp()).mo46019C8();
    }

    /* renamed from: zq */
    public final void m46242zq(AbstractC18523g abstractC18523g) {
        boolean z11;
        boolean z12;
        ProfileAlbumHeader m46300c;
        AbstractC19074t.m100208f(abstractC18523g, ZMediaPlayer.OnNativeInvokeListener.ARG_ERROR);
        ((InterfaceC20753u0) m103742Dp()).mo46038a0();
        m46169br(false);
        m46221gq();
        if (abstractC18523g instanceof AbstractC18523g.a) {
            m46207Zq(null);
            return;
        }
        if (!(abstractC18523g instanceof AbstractC18523g.b)) {
            ProfileAlbumItem profileAlbumItem = this.f46627S;
            if (profileAlbumItem == null) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (profileAlbumItem != null && profileAlbumItem != null && (m46300c = profileAlbumItem.m46300c()) != null && m46300c.m46276d()) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (z11) {
                m46162Xp(m46150Pq());
                m46164Yp(new C3010n0(0));
            } else if (z12) {
                m46164Yp(new C3010n0(1));
            }
        }
    }
}
