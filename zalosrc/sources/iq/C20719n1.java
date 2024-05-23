package iq;

import ag0.C0815e1;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import bo.C2948a3;
import bo.C2958c3;
import bo.C2966e1;
import bo.C2977g2;
import bo.C2978g3;
import bo.C3000l0;
import bo.C3008m3;
import bo.C3010n0;
import bo.C3020p0;
import bo.C3054x;
import bo.C3062z;
import com.zing.zalo.AbstractC16781w;
import com.zing.zalo.AbstractC16803z;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.control.ContactProfile;
import com.zing.zalo.control.ItemAlbumMobile;
import com.zing.zalo.control.TrackingSource;
import com.zing.zalo.feed.mvp.profile.model.C8676a;
import com.zing.zalo.feed.mvp.profile.model.ProfilePreviewAlbumItem;
import com.zing.zalo.utils.ToastUtils;
import com.zing.zalo.zview.animation.AnimationTarget;
import com.zing.zalocore.CoreUtility;
import en0.InterfaceC18509p;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import fn0.C19067n0;
import fo.C19086f;
import fo.C19087g;
import hm0.C20096c;
import hm0.InterfaceC20094a;
import ho0.AbstractC20110a;
import iq.C20719n1;
import is.C20815q;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
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
import org.json.JSONArray;
import org.json.JSONObject;
import p111du.AbstractC18069a;
import p137eo.C18524h;
import p205hc.AbstractC19962a;
import p205hc.InterfaceC19968g;
import p205hc.InterfaceC19969h;
import p236ic.AbstractC20504a;
import p302ko.C21785g;
import p331lq.C22638b;
import p348mi.AbstractC23304d;
import p361nb.AbstractC23647d;
import p492rr.C25973p;
import p716zh.AbstractC32173x4;
import p716zh.C31965ic;
import p716zh.C32002l4;
import p716zh.C32017m4;
import p716zh.C32187y4;
import pm0.AbstractC24862s;
import pm0.C24848g0;
import vg.C28203u6;
import vm0.AbstractC28298d;
import wm0.AbstractC29104l;

/* renamed from: iq.n1 */
/* loaded from: classes4.dex */
public final class C20719n1 extends AbstractC19962a implements InterfaceC20684g1 {
    public static final a Companion = new a(null);

    /* renamed from: A */
    private boolean f101838A;

    /* renamed from: B */
    private boolean f101839B;

    /* renamed from: C */
    private long f101840C;

    /* renamed from: D */
    private long f101841D;

    /* renamed from: E */
    private boolean f101842E;

    /* renamed from: F */
    private int f101843F;

    /* renamed from: G */
    private boolean f101844G;

    /* renamed from: H */
    private C8676a f101845H;

    /* renamed from: I */
    private boolean f101846I;

    /* renamed from: J */
    private final C23420b f101847J;

    /* renamed from: K */
    private final C22638b f101848K;

    /* renamed from: L */
    private boolean f101849L;

    /* renamed from: M */
    private C20815q f101850M;

    /* renamed from: N */
    private List f101851N;

    /* renamed from: O */
    private boolean f101852O;

    /* renamed from: t */
    private final C21785g f101853t;

    /* renamed from: u */
    private C19086f f101854u;

    /* renamed from: v */
    private C19087g f101855v;

    /* renamed from: w */
    private C32002l4 f101856w;

    /* renamed from: x */
    private String f101857x;

    /* renamed from: y */
    private ArrayList f101858y;

    /* renamed from: z */
    private int f101859z;

    /* renamed from: iq.n1$a */
    /* loaded from: classes4.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC19060k abstractC19060k) {
            this();
        }
    }

    /* renamed from: iq.n1$b */
    /* loaded from: classes4.dex */
    public static final class b implements InterfaceC20094a {
        b() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: d */
        public static final void m108156d(C20719n1 c20719n1, C20096c c20096c) {
            AbstractC19074t.m100208f(c20719n1, "this$0");
            AbstractC19074t.m100208f(c20096c, "$error_message");
            try {
                c20719n1.f101839B = false;
                c20719n1.m108142Yp(new C3010n0(1));
                ((InterfaceC20689h1) c20719n1.m103742Dp()).mo46104a0();
                if (c20096c.m104491c() != 500) {
                    ArrayList arrayList = c20719n1.f101858y;
                    AbstractC19074t.m100205c(arrayList);
                    if (!arrayList.isEmpty()) {
                        c20719n1.f101849L = false;
                        c20719n1.m108143Zp(new C2977g2(2));
                        c20719n1.m108145iq(c20719n1.f101858y);
                        c20719n1.m108104Gq();
                    }
                }
                c20719n1.f101849L = true;
                ArrayList arrayList2 = c20719n1.f101858y;
                AbstractC19074t.m100205c(arrayList2);
                arrayList2.clear();
                c20719n1.m108143Zp(new C2977g2(8));
                c20719n1.m108145iq(c20719n1.f101858y);
                c20719n1.m108104Gq();
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(final C20096c c20096c) {
            AbstractC19074t.m100208f(c20096c, "error_message");
            C20719n1.this.m108138Lq(true);
            InterfaceC20689h1 interfaceC20689h1 = (InterfaceC20689h1) C20719n1.this.m103742Dp();
            final C20719n1 c20719n1 = C20719n1.this;
            interfaceC20689h1.mo70710wy(new Runnable() { // from class: iq.o1
                @Override // java.lang.Runnable
                public final void run() {
                    C20719n1.b.m108156d(C20719n1.this, c20096c);
                }
            });
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            AbstractC19074t.m100208f(obj, "entity");
            C20719n1.this.f101849L = false;
            C20719n1.this.m108134Aq(obj);
        }
    }

    /* renamed from: iq.n1$c */
    /* loaded from: classes4.dex */
    public static final class c implements InterfaceC20094a {

        /* renamed from: b */
        final /* synthetic */ String f101862b;

        c(String str) {
            this.f101862b = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: d */
        public static final void m108158d(C20719n1 c20719n1) {
            AbstractC19074t.m100208f(c20719n1, "this$0");
            c20719n1.m108145iq(c20719n1.f101858y);
            c20719n1.m108104Gq();
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
            AbstractC19074t.m100208f(c20096c, "error_message");
            C20719n1.this.m108136Jq(false);
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            int i11;
            AbstractC19074t.m100208f(obj, "entity");
            try {
                JSONObject jSONObject = ((JSONObject) obj).getJSONObject("data");
                if (jSONObject.has("photo")) {
                    C20719n1.this.m108139Mq(AbstractC18069a.m96085d(jSONObject.getJSONObject("photo"), "total"));
                }
                if (jSONObject.has("vip_follow")) {
                    i11 = AbstractC18069a.m96085d(jSONObject.getJSONObject("vip_follow"), "total");
                } else {
                    i11 = 0;
                }
                if (jSONObject.has("limit_visible_feed_value")) {
                    C20719n1.this.m108135Iq(C25973p.f123927a.m133794g(jSONObject));
                }
                C31965ic c31965ic = new C31965ic(i11, C20719n1.this.m108150oq());
                c31965ic.m153685e(C20719n1.this.m108148mq());
                Map map = AbstractC23304d.f113405l;
                AbstractC19074t.m100207e(map, "userInfoList");
                map.put(this.f101862b, c31965ic);
                InterfaceC20689h1 interfaceC20689h1 = (InterfaceC20689h1) C20719n1.this.m103742Dp();
                final C20719n1 c20719n1 = C20719n1.this;
                interfaceC20689h1.mo70710wy(new Runnable() { // from class: iq.p1
                    @Override // java.lang.Runnable
                    public final void run() {
                        C20719n1.c.m108158d(C20719n1.this);
                    }
                });
            } catch (Exception e11) {
                e11.printStackTrace();
            }
            C20719n1.this.m108136Jq(false);
        }
    }

    /* renamed from: iq.n1$d */
    /* loaded from: classes4.dex */
    public static final class d implements C20815q.f {

        /* renamed from: b */
        final /* synthetic */ AnimationTarget f101864b;

        d(AnimationTarget animationTarget) {
            this.f101864b = animationTarget;
        }

        @Override // is.C20815q.f
        /* renamed from: a */
        public void mo46249a(ItemAlbumMobile itemAlbumMobile) {
            AbstractC19074t.m100208f(itemAlbumMobile, "photoItem");
            ((InterfaceC20689h1) C20719n1.this.m103742Dp()).mo49315c4();
            C20719n1.this.m108154yq(itemAlbumMobile, this.f101864b);
        }

        @Override // is.C20815q.f
        /* renamed from: b */
        public void mo46250b(C20096c c20096c) {
            ((InterfaceC20689h1) C20719n1.this.m103742Dp()).mo49315c4();
            if (((InterfaceC20689h1) C20719n1.this.m103742Dp()).mo45894h0()) {
                String m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.unknown_error);
                if (c20096c != null && !TextUtils.isEmpty(c20096c.m104492d())) {
                    m118743r0 = c20096c.m104492d();
                }
                ToastUtils.showMess(m118743r0);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: iq.n1$e */
    /* loaded from: classes4.dex */
    public static final class e extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        int f101865t;

        e(Continuation continuation) {
            super(2, continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            return new e(continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            Object m142578e;
            m142578e = AbstractC28298d.m142578e();
            int i11 = this.f101865t;
            if (i11 != 0) {
                if (i11 == 1) {
                    AbstractC24862s.m129228b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                AbstractC24862s.m129228b(obj);
                C19086f m108149nq = C20719n1.this.m108149nq();
                C19086f.a aVar = new C19086f.a(C20719n1.this.m108141Ya(), 2, 1, null);
                this.f101865t = 1;
                if (m108149nq.m101507a(aVar, this) == m142578e) {
                    return m142578e;
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

    /* renamed from: iq.n1$f */
    /* loaded from: classes4.dex */
    static final class f extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        int f101867t;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: iq.n1$f$a */
        /* loaded from: classes4.dex */
        public static final class a implements FlowCollector {

            /* renamed from: p */
            final /* synthetic */ C20719n1 f101869p;

            a(C20719n1 c20719n1) {
                this.f101869p = c20719n1;
            }

            /* JADX INFO: Access modifiers changed from: private */
            /* renamed from: e */
            public static final void m108162e(C20719n1 c20719n1) {
                AbstractC19074t.m100208f(c20719n1, "this$0");
                c20719n1.m108145iq(c20719n1.f101858y);
                c20719n1.m108104Gq();
            }

            @Override // kotlinx.coroutines.flow.FlowCollector
            /* renamed from: c, reason: merged with bridge method [inline-methods] */
            public final Object mo12109b(C18524h.b bVar, Continuation continuation) {
                if (bVar.m97913d()) {
                    this.f101869p.m108140Nq(bVar.m97910a());
                }
                this.f101869p.m108137Kq(true);
                InterfaceC20689h1 interfaceC20689h1 = (InterfaceC20689h1) this.f101869p.m103742Dp();
                final C20719n1 c20719n1 = this.f101869p;
                interfaceC20689h1.mo70710wy(new Runnable() { // from class: iq.q1
                    @Override // java.lang.Runnable
                    public final void run() {
                        C20719n1.f.a.m108162e(C20719n1.this);
                    }
                });
                return C24848g0.f119245a;
            }
        }

        f(Continuation continuation) {
            super(2, continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            return new f(continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            Object m142578e;
            m142578e = AbstractC28298d.m142578e();
            int i11 = this.f101867t;
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
                C19087g m108151pq = C20719n1.this.m108151pq();
                C19087g.a aVar = new C19087g.a(C20719n1.this.m108141Ya(), 2);
                this.f101867t = 1;
                obj = m108151pq.m101498a(aVar, this);
                if (obj == m142578e) {
                    return m142578e;
                }
            }
            Flow flow = (Flow) obj;
            if (flow != null) {
                a aVar2 = new a(C20719n1.this);
                this.f101867t = 2;
                if (flow.mo97893a(aVar2, this) == m142578e) {
                    return m142578e;
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

    /* renamed from: iq.n1$g */
    /* loaded from: classes4.dex */
    public static final class g extends AbstractC32173x4 {
        g(JSONObject jSONObject) {
            super(jSONObject);
        }

        @Override // p716zh.AbstractC32173x4
        /* renamed from: d */
        public boolean mo46310d(C32187y4 c32187y4) {
            AbstractC19074t.m100208f(c32187y4, "item");
            Iterator it = m155151j().iterator();
            while (it.hasNext()) {
                if (((C32187y4) it.next()).m155183k() == c32187y4.m155183k()) {
                    return true;
                }
            }
            return false;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20719n1(InterfaceC20689h1 interfaceC20689h1) {
        super(interfaceC20689h1);
        AbstractC19074t.m100208f(interfaceC20689h1, "mvpView");
        this.f101853t = C21785g.Companion.m112431a();
        this.f101854u = new C19086f(null, 1, null);
        this.f101855v = new C19087g(null, 1, null);
        this.f101857x = "";
        this.f101858y = new ArrayList();
        this.f101859z = 1;
        this.f101847J = new C23420b();
        this.f101848K = new C22638b();
        this.f101850M = new C20815q();
        this.f101851N = new ArrayList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: Bq */
    public static final void m108099Bq(C20719n1 c20719n1) {
        AbstractC19074t.m100208f(c20719n1, "this$0");
        c20719n1.f101859z++;
        c20719n1.m108144eq(c20719n1.f101857x, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: Cq */
    public static final void m108100Cq(C20719n1 c20719n1) {
        AbstractC19074t.m100208f(c20719n1, "this$0");
        try {
            c20719n1.m108142Yp(new C3010n0(0));
            ((InterfaceC20689h1) c20719n1.m103742Dp()).mo46104a0();
            c20719n1.m108145iq(c20719n1.f101858y);
            c20719n1.m108104Gq();
            c20719n1.m108143Zp(new C2977g2(2));
            c20719n1.f101859z++;
            c20719n1.f101839B = false;
            if (!c20719n1.f101838A) {
                c20719n1.m108116Tp();
            }
        } catch (Exception unused) {
            c20719n1.f101839B = false;
        }
    }

    /* renamed from: Dq */
    private final void m108101Dq(ItemAlbumMobile itemAlbumMobile, AnimationTarget animationTarget) {
        C3020p0 c3020p0;
        ArrayList<? extends Parcelable> arrayList = new ArrayList<>();
        ArrayList arrayList2 = this.f101858y;
        AbstractC19074t.m100205c(arrayList2);
        int size = arrayList2.size();
        int i11 = -1;
        int i12 = 0;
        for (int i13 = 0; i13 < size; i13++) {
            Object obj = arrayList2.get(i13);
            AbstractC19074t.m100207e(obj, "get(...)");
            AbstractC32173x4 abstractC32173x4 = (AbstractC32173x4) obj;
            int size2 = abstractC32173x4.m155151j().size();
            for (int i14 = 0; i14 < size2; i14++) {
                i11++;
                C32187y4 c32187y4 = (C32187y4) abstractC32173x4.m155151j().get(i14);
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
        bundle.putParcelableArrayList("medialist", arrayList);
        bundle.putInt("totalPhoto", this.f101843F);
        bundle.putInt("EXTRA_INT_PAGE_PHOTO", this.f101859z);
        bundle.putLong("EXTRA_LONG_LAST_PHOTO", this.f101840C);
        bundle.putLong("EXTRA_LONG_LAST_ALBUM", this.f101841D);
        bundle.putBoolean("EXTRA_BOL_LOADMORE_PHOTO", this.f101838A);
        bundle.putInt("currentIndex", i12);
        bundle.putString("userId", this.f101857x);
        C32002l4 c32002l4 = this.f101856w;
        if (c32002l4 == null) {
            AbstractC19074t.m100223u("entryPointChain");
            c32002l4 = null;
        }
        bundle.putString("extra_entry_point_flow", c32002l4.m154277l());
        int i15 = 1;
        bundle.putBoolean("fromAlbum", true);
        if (!this.f101844G) {
            i15 = 3;
        }
        bundle.putInt("EXTRA_INT_SUB_TITLE_MODE", i15);
        bundle.putInt("EXTRA_INT_IMAGE_VIEWER_TYPE", 4);
        ((InterfaceC20689h1) m103742Dp()).mo46101O3(animationTarget, itemAlbumMobile, i12, bundle);
    }

    /* renamed from: Eq */
    private final void m108102Eq(String str) {
        ArrayList arrayList = this.f101858y;
        if (arrayList == null) {
            return;
        }
        AbstractC19074t.m100205c(arrayList);
        C23250w4.m119813p(str, arrayList, 3, true);
    }

    /* renamed from: Fq */
    private final void m108103Fq(List list) {
        if (list != null) {
            try {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    m108102Eq((String) it.next());
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: Gq */
    public final void m108104Gq() {
        ((InterfaceC20689h1) m103742Dp()).mo70710wy(new Runnable() { // from class: iq.i1
            @Override // java.lang.Runnable
            public final void run() {
                C20719n1.m108105Hq(C20719n1.this);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: Hq */
    public static final void m108105Hq(C20719n1 c20719n1) {
        AbstractC19074t.m100208f(c20719n1, "this$0");
        try {
            ((InterfaceC20689h1) c20719n1.m103742Dp()).mo46109ih(c20719n1.f101851N);
        } catch (Exception e11) {
            AbstractC20110a.f98889a.mo104552e(e11);
        }
    }

    /* renamed from: Sp */
    private final void m108115Sp() {
        String m154352b;
        C32002l4 c32002l4 = this.f101856w;
        if (c32002l4 == null) {
            AbstractC19074t.m100223u("entryPointChain");
            c32002l4 = null;
        }
        C32002l4 m154284u = c32002l4.m154284u(14);
        if (AbstractC19074t.m100204b(CoreUtility.f89233i, this.f101857x)) {
            m154352b = C32017m4.m154326S().m154354c(m154284u);
        } else {
            m154352b = C32017m4.m154326S().m154352b(m154284u);
        }
        AbstractC23647d.m123897g(m154352b);
    }

    /* renamed from: Tp */
    private final void m108116Tp() {
        m108118Xp(new C3062z(AbstractC23136l9.m118742r(50.0f)));
    }

    /* renamed from: Wp */
    private final void m108117Wp(C3054x c3054x) {
        this.f101848K.m117206h(c3054x);
        m108104Gq();
    }

    /* renamed from: Xp */
    private final void m108118Xp(C3062z c3062z) {
        c3062z.m14724c(C23212s8.m119606n(AbstractC16781w.ProfileSectionPhotoPrimaryBackgroundColor));
        this.f101848K.m117207i(c3062z);
        m108104Gq();
    }

    /* renamed from: aq */
    private final void m108119aq(AbstractC32173x4 abstractC32173x4) {
        try {
            if (this.f101858y == null) {
                this.f101858y = new ArrayList();
            }
            ArrayList arrayList = this.f101858y;
            AbstractC19074t.m100205c(arrayList);
            Iterator it = arrayList.iterator();
            boolean z11 = false;
            while (it.hasNext()) {
                AbstractC32173x4 abstractC32173x42 = (AbstractC32173x4) it.next();
                if (abstractC32173x42.m155146e() == abstractC32173x4.m155146e()) {
                    int m155149h = abstractC32173x42.m155149h() + 1;
                    int size = abstractC32173x4.m155151j().size();
                    for (int i11 = 0; i11 < size; i11++) {
                        C32187y4 c32187y4 = (C32187y4) abstractC32173x4.m155151j().get(i11);
                        if (c32187y4.m155176d() != null) {
                            C32187y4.b m155176d = c32187y4.m155176d();
                            AbstractC19074t.m100205c(m155176d);
                            m155176d.m155198g(m155176d.m155193b() + m155149h);
                        }
                    }
                    abstractC32173x42.m155145c(abstractC32173x4.m155151j());
                    z11 = true;
                }
            }
            if (!z11) {
                ArrayList arrayList2 = this.f101858y;
                AbstractC19074t.m100205c(arrayList2);
                arrayList2.add(abstractC32173x4);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: bq */
    private final C3054x m108120bq() {
        C3054x m117201c = this.f101848K.m117201c();
        m117201c.m14666X("");
        m117201c.m14650H("");
        return m117201c;
    }

    /* renamed from: cq */
    private final void m108121cq() {
        this.f101848K.m117200b();
        this.f101848K.mo117197a(70);
        this.f101848K.mo117197a(84);
        this.f101848K.mo117197a(72);
    }

    /* renamed from: dq */
    private final void m108122dq() {
        this.f101847J.m123092b();
    }

    /* renamed from: fq */
    private final void m108123fq(String str) {
        if (this.f101852O) {
            return;
        }
        c cVar = new c(str);
        this.f101852O = true;
        this.f101853t.mo112382w(str, 160, cVar);
    }

    /* renamed from: gq */
    private final void m108124gq(ItemAlbumMobile itemAlbumMobile, AnimationTarget animationTarget) {
        String str;
        ((InterfaceC20689h1) m103742Dp()).mo46829Y();
        this.f101850M.m108704d(itemAlbumMobile, new d(animationTarget), mo107814g());
        if (m108153uq()) {
            str = "6630";
        } else {
            str = "7630";
        }
        AbstractC23647d.m123897g(str);
    }

    /* renamed from: hq */
    private final void m108125hq(boolean z11) {
        m108144eq(this.f101857x, z11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: jq */
    public static final void m108126jq(C20719n1 c20719n1) {
        AbstractC19074t.m100208f(c20719n1, "this$0");
        ((InterfaceC20689h1) c20719n1.m103742Dp()).mo46096Ck(false);
    }

    /* renamed from: qq */
    private final boolean m108127qq() {
        C8676a c8676a = this.f101845H;
        if (c8676a == null) {
            return true;
        }
        AbstractC19074t.m100205c(c8676a);
        if (c8676a.m46341l() == 0) {
            return true;
        }
        C8676a c8676a2 = this.f101845H;
        AbstractC19074t.m100205c(c8676a2);
        if (c8676a2.m46342m().isEmpty()) {
            C8676a c8676a3 = this.f101845H;
            AbstractC19074t.m100205c(c8676a3);
            if (c8676a3.m46338i().isEmpty()) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: rq */
    private final boolean m108128rq() {
        if (this.f101848K.m117201c().m14692x() == 1) {
            return true;
        }
        return false;
    }

    /* renamed from: tq */
    private final boolean m108129tq() {
        return m108153uq();
    }

    /* renamed from: vq */
    private final C3054x m108130vq() {
        C3054x m108120bq = m108120bq();
        m108120bq.m14664V(2);
        m108120bq.m14663U(true);
        m108120bq.m14648F(C23212s8.m119606n(AbstractC16781w.ProfileSectionPhotoPrimaryBackgroundColor));
        m108120bq.m14666X(AbstractC23136l9.m118743r0(AbstractC8020f0.str_profile_empty_photo_title));
        m108120bq.m14650H(AbstractC23136l9.m118743r0(AbstractC8020f0.str_profile_empty_photo_desc));
        m108120bq.m14661S(AbstractC23136l9.m118742r(16.0f));
        m108120bq.m14657O(AbstractC16803z.icon_profile_empty_section_photo);
        if (m108129tq()) {
            m108120bq.m14667Y(AbstractC23136l9.m118743r0(AbstractC8020f0.str_profile_empty_photo_button));
        }
        m108120bq.m14665W(1);
        return m108120bq;
    }

    /* renamed from: wq */
    private final C3054x m108131wq() {
        C3054x m108120bq = m108120bq();
        m108120bq.m14664V(1);
        m108120bq.m14663U(true);
        m108120bq.m14648F(C23212s8.m119606n(AbstractC16781w.ProfileSecondaryBackgroundColor));
        m108120bq.m14666X(AbstractC23136l9.m118743r0(AbstractC8020f0.str_connection_error));
        m108120bq.m14650H(AbstractC23136l9.m118743r0(AbstractC8020f0.str_network_error_detail));
        m108120bq.m14657O(AbstractC16803z.im_connect);
        m108120bq.m14667Y(AbstractC23136l9.m118743r0(AbstractC8020f0.tap_to_retry));
        m108120bq.m14665W(0);
        return m108120bq;
    }

    /* renamed from: xq */
    private final C3054x m108132xq() {
        C3054x m108120bq = m108120bq();
        m108120bq.m14664V(0);
        m108120bq.m14663U(false);
        return m108120bq;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zq */
    public static final void m108133zq(C20719n1 c20719n1, ItemAlbumMobile itemAlbumMobile, AnimationTarget animationTarget) {
        AbstractC19074t.m100208f(c20719n1, "this$0");
        AbstractC19074t.m100205c(animationTarget);
        c20719n1.m108101Dq(itemAlbumMobile, animationTarget);
    }

    /* renamed from: Aq */
    public final void m108134Aq(Object obj) {
        boolean z11;
        this.f101842E = true;
        if (obj != null) {
            try {
                JSONObject jSONObject = ((JSONObject) obj).getJSONObject("data");
                this.f101840C = AbstractC18069a.m96087f(jSONObject, "lastPhotoId");
                this.f101841D = AbstractC18069a.m96087f(jSONObject, "lastAlbumId");
                if (AbstractC18069a.m96087f(jSONObject, "hasMore") == 1) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                this.f101838A = z11;
                if (jSONObject.has("page")) {
                    this.f101859z = AbstractC18069a.m96085d(jSONObject, "page");
                }
                if (this.f101859z == 1) {
                    ArrayList arrayList = this.f101858y;
                    AbstractC19074t.m100205c(arrayList);
                    arrayList.clear();
                }
                JSONArray optJSONArray = jSONObject.optJSONArray("content");
                if (optJSONArray != null) {
                    int length = optJSONArray.length();
                    for (int i11 = 0; i11 < length; i11++) {
                        JSONObject optJSONObject = optJSONArray.optJSONObject(i11);
                        if (optJSONObject != null) {
                            m108119aq(new g(optJSONObject));
                        }
                    }
                }
                if ((optJSONArray == null || optJSONArray.length() == 0) && this.f101838A) {
                    this.f101839B = false;
                    ((InterfaceC20689h1) m103742Dp()).mo70710wy(new Runnable() { // from class: iq.k1
                        @Override // java.lang.Runnable
                        public final void run() {
                            C20719n1.m108099Bq(C20719n1.this);
                        }
                    });
                    return;
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
        ((InterfaceC20689h1) m103742Dp()).mo70710wy(new Runnable() { // from class: iq.l1
            @Override // java.lang.Runnable
            public final void run() {
                C20719n1.m108100Cq(C20719n1.this);
            }
        });
    }

    @Override // iq.InterfaceC20684g1
    /* renamed from: D */
    public void mo107802D() {
        try {
            BuildersKt__Builders_commonKt.m112540d(AbstractC20504a.m106544a(this), null, null, new f(null), 3, null);
            m108147lq();
            this.f101859z = 1;
            this.f101840C = 0L;
            this.f101841D = 0L;
            m108125hq(false);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // iq.InterfaceC20684g1
    /* renamed from: Dg */
    public void mo107803Dg(ItemAlbumMobile itemAlbumMobile, AnimationTarget animationTarget, int i11) {
        AbstractC19074t.m100208f(animationTarget, "animationTarget");
        try {
            m108124gq(itemAlbumMobile, animationTarget);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // iq.InterfaceC20684g1
    /* renamed from: E */
    public void mo107804E() {
        m108147lq();
        this.f101859z = 1;
        this.f101840C = 0L;
        this.f101841D = 0L;
        m108125hq(true);
        m108123fq(this.f101857x);
    }

    @Override // iq.InterfaceC20684g1
    /* renamed from: E2 */
    public void mo107805E2(ItemAlbumMobile itemAlbumMobile) {
        String str;
        if (itemAlbumMobile != null && itemAlbumMobile.f42591p == 1) {
            ((InterfaceC20689h1) m103742Dp()).mo46098D3(itemAlbumMobile);
            if (AbstractC19074t.m100204b(this.f101857x, CoreUtility.f89233i)) {
                str = "661001";
            } else {
                str = "761001";
            }
            AbstractC23647d.m123897g(str);
        }
    }

    @Override // iq.InterfaceC20684g1
    /* renamed from: E3 */
    public void mo107806E3(String str) {
        AbstractC19074t.m100208f(str, "idDeletedVideo");
        m108102Eq(str);
        m108145iq(this.f101858y);
        m108104Gq();
    }

    /* renamed from: Iq */
    public final void m108135Iq(boolean z11) {
        this.f101844G = z11;
    }

    /* renamed from: Jq */
    public final void m108136Jq(boolean z11) {
        this.f101852O = z11;
    }

    @Override // iq.InterfaceC20684g1
    /* renamed from: K0 */
    public void mo107807K0(Bundle bundle) {
        boolean z11;
        if (bundle != null) {
            if (!TextUtils.isEmpty(this.f101857x) && AbstractC19074t.m100204b(CoreUtility.f89233i, this.f101857x)) {
                z11 = true;
            } else {
                z11 = false;
            }
            bundle.putBoolean("fromMyProfile", z11);
        }
    }

    /* renamed from: Kq */
    public final void m108137Kq(boolean z11) {
        this.f101846I = z11;
    }

    /* renamed from: Lq */
    public final void m108138Lq(boolean z11) {
        this.f101842E = z11;
    }

    /* renamed from: Mq */
    public final void m108139Mq(int i11) {
        this.f101843F = i11;
    }

    @Override // p205hc.AbstractC19962a, p205hc.InterfaceC19966e
    /* renamed from: Nd */
    public void mo995Nd(InterfaceC19969h interfaceC19969h, InterfaceC19968g interfaceC19968g) {
        C32002l4 m154287a;
        super.mo995Nd(interfaceC19969h, interfaceC19968g);
        C20774y1 c20774y1 = (C20774y1) interfaceC19969h;
        if (c20774y1 != null) {
            String str = c20774y1.f102120b;
            AbstractC19074t.m100207e(str, "userID");
            this.f101857x = str;
            C32002l4 c32002l4 = c20774y1.f102119a;
            if (c32002l4 == null || (m154287a = c32002l4.m154271a(10012)) == null) {
                m154287a = C32002l4.Companion.m154287a(10012);
            }
            this.f101856w = m154287a;
        }
        Map map = AbstractC23304d.f113405l;
        if (map.get(this.f101857x) != null) {
            Object obj = map.get(this.f101857x);
            AbstractC19074t.m100205c(obj);
            this.f101843F = ((C31965ic) obj).m153682b();
            Object obj2 = map.get(this.f101857x);
            AbstractC19074t.m100205c(obj2);
            this.f101844G = ((C31965ic) obj2).m153683c();
        }
    }

    /* renamed from: Nq */
    public final void m108140Nq(C8676a c8676a) {
        this.f101845H = c8676a;
    }

    /* renamed from: Ya */
    public final String m108141Ya() {
        return this.f101857x;
    }

    /* renamed from: Yp */
    public final void m108142Yp(C3010n0 c3010n0) {
        C22638b c22638b = this.f101848K;
        AbstractC19074t.m100205c(c3010n0);
        c22638b.m117208j(c3010n0);
        m108104Gq();
    }

    @Override // iq.InterfaceC20684g1
    /* renamed from: Z7 */
    public void mo107808Z7(ArrayList arrayList) {
        if (arrayList != null && arrayList.size() > 0) {
            m108103Fq(arrayList);
            m108145iq(this.f101858y);
            m108104Gq();
        }
    }

    @Override // iq.InterfaceC20684g1
    /* renamed from: Zb */
    public void mo107809Zb(List list, long j11) {
        AbstractC19074t.m100208f(list, "deletedPhotos");
        mo107812e();
    }

    /* renamed from: Zp */
    public final void m108143Zp(C2977g2 c2977g2) {
        AbstractC19074t.m100208f(c2977g2, "data");
        c2977g2.m14130d(C23212s8.m119606n(AbstractC16781w.ProfileSecondaryBackgroundColor));
        this.f101848K.m117209k(c2977g2);
        m108104Gq();
    }

    @Override // iq.InterfaceC20684g1
    /* renamed from: a1 */
    public void mo107810a1() {
        ((InterfaceC20689h1) m103742Dp()).mo46105h2();
        if (m108152sq()) {
            ((InterfaceC20689h1) m103742Dp()).mo46110ke();
        }
        ((InterfaceC20689h1) m103742Dp()).mo46107i2();
        ((InterfaceC20689h1) m103742Dp()).mo46106hk();
        m108145iq(this.f101858y);
        m108104Gq();
    }

    @Override // iq.InterfaceC20684g1
    /* renamed from: a4 */
    public void mo107811a4(ProfilePreviewAlbumItem profilePreviewAlbumItem) {
        AbstractC19074t.m100208f(profilePreviewAlbumItem, "profilePreviewAlbumItem");
        try {
            InterfaceC20689h1 interfaceC20689h1 = (InterfaceC20689h1) m103742Dp();
            String str = this.f101857x;
            C32002l4 c32002l4 = this.f101856w;
            if (c32002l4 == null) {
                AbstractC19074t.m100223u("entryPointChain");
                c32002l4 = null;
            }
            interfaceC20689h1.mo46113yG(str, profilePreviewAlbumItem, c32002l4.m154284u(14).m154285v("pos_album", Integer.valueOf(m108146kq().indexOf(profilePreviewAlbumItem))));
            m108115Sp();
        } catch (Exception e11) {
            AbstractC20110a.f98889a.mo104552e(e11);
        }
    }

    @Override // iq.InterfaceC20684g1
    /* renamed from: e */
    public void mo107812e() {
        try {
            if (!C23055e5.m118273h(false, 1, null)) {
                ((InterfaceC20689h1) m103742Dp()).mo46104a0();
                if (!m108128rq()) {
                    ((InterfaceC20689h1) m103742Dp()).mo46102S();
                }
            } else {
                ((InterfaceC20689h1) m103742Dp()).mo46103T();
                m108147lq();
                this.f101859z = 1;
                this.f101840C = 0L;
                this.f101841D = 0L;
                m108125hq(false);
                m108123fq(this.f101857x);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: eq */
    public final void m108144eq(String str, boolean z11) {
        AbstractC19074t.m100208f(str, "userId");
        try {
            m108143Zp(new C2977g2(0));
            if (!C23055e5.m118272g(z11)) {
                ArrayList arrayList = this.f101858y;
                AbstractC19074t.m100205c(arrayList);
                if (arrayList.isEmpty()) {
                    this.f101849L = true;
                    m108117Wp(m108131wq());
                    m108142Yp(new C3010n0(0));
                    ((InterfaceC20689h1) m103742Dp()).mo46096Ck(false);
                } else {
                    m108143Zp(new C2977g2(0));
                    m108142Yp(new C3010n0(1));
                }
                m108145iq(this.f101858y);
                m108104Gq();
                ((InterfaceC20689h1) m103742Dp()).mo46104a0();
                return;
            }
            if (this.f101839B) {
                return;
            }
            this.f101839B = true;
            m108117Wp(m108132xq());
            if (z11) {
                m108143Zp(new C2977g2(1));
                m108142Yp(new C3010n0(0));
                m108145iq(this.f101858y);
                m108104Gq();
            }
            b bVar = new b();
            TrackingSource m154371q = C32017m4.m154326S().m154371q(mo107814g());
            m154371q.m40677a("total_photo", Integer.valueOf(this.f101843F));
            this.f101853t.mo112367g0(str, this.f101859z, 48, this.f101840C, this.f101841D, "", C23250w4.m119786E(), m154371q, bVar);
        } catch (Exception e11) {
            e11.printStackTrace();
            this.f101839B = false;
        }
    }

    @Override // iq.InterfaceC20684g1
    /* renamed from: fp */
    public void mo107813fp(ProfilePreviewAlbumItem profilePreviewAlbumItem) {
        AbstractC19074t.m100208f(profilePreviewAlbumItem, "profilePreviewAlbumItem");
        C0815e1 m2075D = C0815e1.m2075D();
        C32017m4 m154326S = C32017m4.m154326S();
        C32002l4 c32002l4 = this.f101856w;
        if (c32002l4 == null) {
            AbstractC19074t.m100223u("entryPointChain");
            c32002l4 = null;
        }
        m2075D.m2100V(m154326S.m154343Q(c32002l4.m154284u(14)), false);
    }

    @Override // iq.InterfaceC20684g1
    /* renamed from: g */
    public C32002l4 mo107814g() {
        C32002l4 c32002l4 = this.f101856w;
        if (c32002l4 == null) {
            AbstractC19074t.m100223u("entryPointChain");
            return null;
        }
        return c32002l4;
    }

    @Override // iq.InterfaceC20684g1
    /* renamed from: hp */
    public void mo107815hp(ItemAlbumMobile itemAlbumMobile, AnimationTarget animationTarget, int i11) {
        String str;
        String mo46112y;
        AbstractC19074t.m100208f(itemAlbumMobile, "photo");
        AbstractC19074t.m100208f(animationTarget, "animationTarget");
        try {
            if (m108153uq()) {
                str = "6610";
                mo46112y = ((InterfaceC20689h1) m103742Dp()).mo46112y();
            } else {
                str = "7610";
                mo46112y = ((InterfaceC20689h1) m103742Dp()).mo46112y();
            }
            AbstractC23647d.m123907q(str, mo46112y);
            AbstractC23647d.m123893c();
            m108101Dq(itemAlbumMobile, animationTarget);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x00d5 A[Catch: Exception -> 0x00aa, TryCatch #0 {Exception -> 0x00aa, blocks: (B:3:0x0004, B:5:0x0021, B:8:0x0030, B:10:0x0034, B:12:0x003a, B:15:0x0065, B:16:0x00bc, B:17:0x0047, B:18:0x00d1, B:20:0x00d5, B:22:0x00db, B:23:0x00e0, B:25:0x00f1, B:27:0x010c, B:29:0x011d, B:31:0x0127, B:33:0x012d, B:35:0x013b, B:36:0x0143, B:38:0x014b, B:39:0x0161, B:40:0x0169, B:42:0x016f, B:45:0x018e, B:47:0x0194, B:54:0x01ce, B:55:0x01d9, B:56:0x00f5, B:57:0x00de, B:58:0x01ef, B:59:0x00ad, B:60:0x01ff), top: B:2:0x0004 }] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x01ef A[Catch: Exception -> 0x00aa, TryCatch #0 {Exception -> 0x00aa, blocks: (B:3:0x0004, B:5:0x0021, B:8:0x0030, B:10:0x0034, B:12:0x003a, B:15:0x0065, B:16:0x00bc, B:17:0x0047, B:18:0x00d1, B:20:0x00d5, B:22:0x00db, B:23:0x00e0, B:25:0x00f1, B:27:0x010c, B:29:0x011d, B:31:0x0127, B:33:0x012d, B:35:0x013b, B:36:0x0143, B:38:0x014b, B:39:0x0161, B:40:0x0169, B:42:0x016f, B:45:0x018e, B:47:0x0194, B:54:0x01ce, B:55:0x01d9, B:56:0x00f5, B:57:0x00de, B:58:0x01ef, B:59:0x00ad, B:60:0x01ff), top: B:2:0x0004 }] */
    /* renamed from: iq */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final List m108145iq(List list) {
        int i11;
        AbstractC32173x4 abstractC32173x4;
        String format;
        try {
            this.f101851N.clear();
            m108122dq();
            this.f101851N.addAll(this.f101847J.m123093c());
            Calendar calendar = Calendar.getInstance();
            if (!this.f101849L) {
                String str = "";
                int i12 = 0;
                int i13 = 1;
                if (this.f101846I) {
                    if (this.f101845H != null && !m108127qq()) {
                        C8676a c8676a = this.f101845H;
                        AbstractC19074t.m100205c(c8676a);
                        if (c8676a.m46335f()) {
                            format = "";
                        } else {
                            C19067n0 c19067n0 = C19067n0.f94947a;
                            C8676a c8676a2 = this.f101845H;
                            AbstractC19074t.m100205c(c8676a2);
                            format = String.format("(%d)", Arrays.copyOf(new Object[]{Integer.valueOf(c8676a2.m46341l())}, 1));
                            AbstractC19074t.m100207e(format, "format(...)");
                        }
                        C8676a c8676a3 = this.f101845H;
                        AbstractC19074t.m100205c(c8676a3);
                        C3008m3 c3008m3 = new C3008m3(c8676a3.m46340k(), format);
                        String m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_profile_album_see_all_album);
                        AbstractC19074t.m100207e(m118743r0, "getString(...)");
                        c3008m3.m14424f(m118743r0);
                        c3008m3.m14423e(AbstractC16803z.ic_chevron_right_line_24_blue);
                        this.f101851N.add(new C2966e1(c3008m3));
                        this.f101851N.add(new C2966e1(new C2978g3(m108146kq(), m108153uq(), m108153uq())));
                    }
                    if (!this.f101842E) {
                        if (m108153uq()) {
                            i11 = AbstractC8020f0.str_title_my_profile_section_photo;
                        } else {
                            i11 = AbstractC8020f0.str_title_user_profile_section_photo;
                        }
                        String m118743r02 = AbstractC23136l9.m118743r0(i11);
                        AbstractC19074t.m100207e(m118743r02, "getString(...)");
                        if (AbstractC19074t.m100204b(CoreUtility.f89233i, this.f101857x) || !this.f101844G) {
                            C19067n0 c19067n02 = C19067n0.f94947a;
                            str = String.format("(%d)", Arrays.copyOf(new Object[]{Integer.valueOf(this.f101843F)}, 1));
                            AbstractC19074t.m100207e(str, "format(...)");
                        }
                        this.f101851N.add(new C2966e1(new C3008m3(m118743r02, str)));
                        if (list != null && (!list.isEmpty())) {
                            int size = list.size();
                            while (i12 < size) {
                                AbstractC32173x4 abstractC32173x42 = (AbstractC32173x4) list.get(i12);
                                i12++;
                                if (i12 < list.size()) {
                                    abstractC32173x4 = (AbstractC32173x4) list.get(i12);
                                } else {
                                    abstractC32173x4 = null;
                                }
                                if (abstractC32173x42.m155153l()) {
                                    this.f101851N.add(new C2966e1(55, abstractC32173x42, (List) null));
                                    this.f101851N.add(new C2966e1(58, abstractC32173x42, (List) null));
                                }
                                Iterator it = abstractC32173x42.m155150i().iterator();
                                while (it.hasNext()) {
                                    this.f101851N.add(new C2966e1(56, abstractC32173x42, (List) it.next()));
                                    this.f101851N.add(new C2966e1(58, abstractC32173x42, (List) null));
                                }
                                if (abstractC32173x4 != null && !C23250w4.m119791S(abstractC32173x42, abstractC32173x4)) {
                                    calendar.setTimeInMillis(abstractC32173x4.m155147f());
                                    this.f101851N.add(new C2966e1(new C2948a3(String.valueOf(calendar.get(i13)), 0, 0, 6, null), abstractC32173x4));
                                    this.f101851N.add(new C2966e1(58, abstractC32173x42, (List) null));
                                }
                                i13 = 1;
                            }
                            ((InterfaceC20689h1) m103742Dp()).mo46096Ck(true);
                        } else {
                            m108117Wp(m108130vq());
                            ((InterfaceC20689h1) m103742Dp()).mo70710wy(new Runnable() { // from class: iq.j1
                                @Override // java.lang.Runnable
                                public final void run() {
                                    C20719n1.m108126jq(C20719n1.this);
                                }
                            });
                        }
                    } else {
                        this.f101851N.add(new C2966e1(new C2958c3(2)));
                    }
                } else {
                    this.f101851N.add(new C2966e1(new C2958c3(1)));
                }
                List list2 = this.f101851N;
                C2966e1 m14032d = new C2966e1((C3000l0) null, (C3020p0) null, 64).m14032d(false);
                AbstractC19074t.m100207e(m14032d, "setEnableTimebar(...)");
                list2.add(m14032d);
                if (!this.f101842E) {
                }
            }
            m108121cq();
            this.f101851N.addAll(this.f101848K.m117204f());
        } catch (Exception e11) {
            e11.printStackTrace();
        }
        return this.f101851N;
    }

    @Override // iq.InterfaceC20684g1
    /* renamed from: j4 */
    public void mo107816j4() {
        if (this.f101838A && !this.f101839B) {
            m108142Yp(new C3010n0(2));
            m108125hq(false);
        }
    }

    @Override // iq.InterfaceC20684g1
    /* renamed from: k */
    public void mo107817k() {
        ContactProfile m141798e = C28203u6.m141798e(C28203u6.f131407a, this.f101857x, null, 2, null);
        if (m141798e != null) {
            if (m108153uq()) {
                ((InterfaceC20689h1) m103742Dp()).mo46108ia(AbstractC23136l9.m118743r0(AbstractC8020f0.str_title_my_profile_section_photo_action_bar));
                return;
            }
            String m40383Q = m141798e.m40383Q(true, false);
            InterfaceC20689h1 interfaceC20689h1 = (InterfaceC20689h1) m103742Dp();
            C19067n0 c19067n0 = C19067n0.f94947a;
            String m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_title_profile_section_photo_action_bar);
            AbstractC19074t.m100207e(m118743r0, "getString(...)");
            String format = String.format(m118743r0, Arrays.copyOf(new Object[]{m40383Q}, 1));
            AbstractC19074t.m100207e(format, "format(...)");
            interfaceC20689h1.mo46108ia(format);
        }
    }

    /* renamed from: kq */
    public final List m108146kq() {
        ArrayList arrayList = new ArrayList();
        C8676a c8676a = this.f101845H;
        AbstractC19074t.m100205c(c8676a);
        arrayList.addAll(c8676a.m46342m());
        C8676a c8676a2 = this.f101845H;
        AbstractC19074t.m100205c(c8676a2);
        arrayList.addAll(c8676a2.m46338i());
        return arrayList;
    }

    @Override // iq.InterfaceC20684g1
    /* renamed from: l0 */
    public void mo107818l0() {
        ((InterfaceC20689h1) m103742Dp()).mo46097Cn(this.f101857x);
    }

    /* renamed from: lq */
    public final void m108147lq() {
        BuildersKt__Builders_commonKt.m112540d(AbstractC20504a.m106544a(this), null, null, new e(null), 3, null);
    }

    @Override // iq.InterfaceC20684g1
    /* renamed from: m3 */
    public int mo107819m3() {
        return this.f101848K.m117203e();
    }

    /* renamed from: mq */
    public final boolean m108148mq() {
        return this.f101844G;
    }

    /* renamed from: nq */
    public final C19086f m108149nq() {
        return this.f101854u;
    }

    /* renamed from: oq */
    public final int m108150oq() {
        return this.f101843F;
    }

    /* renamed from: pq */
    public final C19087g m108151pq() {
        return this.f101855v;
    }

    @Override // iq.InterfaceC20684g1
    /* renamed from: s1 */
    public void mo107820s1() {
        AbstractC23647d.m123907q("6802", ((InterfaceC20689h1) m103742Dp()).mo46112y());
        ((InterfaceC20689h1) m103742Dp()).mo46100I1(false, false, -100, 161);
        AbstractC23647d.m123893c();
    }

    /* renamed from: sq */
    public final boolean m108152sq() {
        return m108153uq();
    }

    @Override // iq.InterfaceC20684g1
    /* renamed from: u */
    public void mo107821u() {
    }

    @Override // iq.InterfaceC20684g1
    /* renamed from: uf */
    public void mo107822uf() {
        int m14693y = this.f101848K.m117201c().m14693y();
        if (m14693y != 0) {
            if (m14693y == 1) {
                ((InterfaceC20689h1) m103742Dp()).mo46100I1(false, false, -100, 29);
            }
        } else {
            m108147lq();
            this.f101859z = 1;
            this.f101840C = 0L;
            this.f101841D = 0L;
            m108125hq(true);
            m108123fq(this.f101857x);
        }
    }

    /* renamed from: uq */
    public final boolean m108153uq() {
        return AbstractC19074t.m100204b(this.f101857x, CoreUtility.f89233i);
    }

    @Override // iq.InterfaceC20684g1
    /* renamed from: vh */
    public void mo107823vh() {
        C8676a c8676a = this.f101845H;
        AbstractC19074t.m100205c(c8676a);
        if (c8676a.m46339j() > 0) {
            ((InterfaceC20689h1) m103742Dp()).mo46094A4();
        } else {
            ((InterfaceC20689h1) m103742Dp()).mo46099Em();
        }
    }

    /* renamed from: yq */
    protected final void m108154yq(final ItemAlbumMobile itemAlbumMobile, final AnimationTarget animationTarget) {
        C3020p0 c3020p0;
        if (itemAlbumMobile != null) {
            try {
                c3020p0 = itemAlbumMobile.f42594q0;
            } catch (Exception e11) {
                e11.printStackTrace();
                return;
            }
        } else {
            c3020p0 = null;
        }
        if (c3020p0 != null) {
            itemAlbumMobile.m40529p0();
            ((InterfaceC20689h1) m103742Dp()).mo70710wy(new Runnable() { // from class: iq.m1
                @Override // java.lang.Runnable
                public final void run() {
                    C20719n1.m108133zq(C20719n1.this, itemAlbumMobile, animationTarget);
                }
            });
        }
    }
}
