package com.zing.zalo.p077ui.group.leavegroup;

import ae.C0766k;
import ae.InterfaceC0765j;
import ag0.C0815e1;
import am.C0943w;
import android.text.TextUtils;
import androidx.lifecycle.AbstractC1796t0;
import androidx.lifecycle.AbstractC1798u0;
import androidx.work.AbstractC2144f;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.adapters.GroupFullMemberAdapter;
import com.zing.zalo.control.ContactProfile;
import com.zing.zalo.p062db.C7960e;
import com.zing.zalocore.CoreUtility;
import en0.InterfaceC18509p;
import en0.InterfaceC18511r;
import f70.AbstractC18799a;
import f70.AbstractC18811m;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import hm0.C20096c;
import hm0.InterfaceC20094a;
import ho0.AbstractC20110a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineExceptionHandler;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.channels.Channel;
import kotlinx.coroutines.channels.ChannelKt;
import kotlinx.coroutines.channels.ChannelResult;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.SharingStarted;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import me0.AbstractC23136l9;
import me0.AbstractC23262x6;
import me0.C23055e5;
import org.json.JSONArray;
import org.json.JSONObject;
import p173fz.C19172a;
import p304ks.C21927m;
import p361nb.C23648e;
import p656xs.C30202c;
import p716zh.C31973j5;
import pm0.AbstractC24862s;
import pm0.C24848g0;
import pm0.C24861r;
import qm0.AbstractC25368s;
import qm0.AbstractC25370t;
import um0.AbstractC27310a;
import um0.C27317h;
import um0.InterfaceC27315f;
import vg.C28203u6;
import vm0.AbstractC28297c;
import vm0.AbstractC28298d;
import wm0.AbstractC29096d;
import wm0.AbstractC29100h;
import wm0.AbstractC29104l;
import xm0.AbstractC30166b;
import xm0.InterfaceC30165a;

/* renamed from: com.zing.zalo.ui.group.leavegroup.b */
/* loaded from: classes5.dex */
public final class C11922b extends AbstractC1796t0 {
    public static final a Companion = new a(null);

    /* renamed from: A */
    private String f62066A;

    /* renamed from: B */
    private final Channel f62067B;

    /* renamed from: C */
    private final Flow f62068C;

    /* renamed from: D */
    private d f62069D;

    /* renamed from: E */
    private final MutableStateFlow f62070E;

    /* renamed from: F */
    private final MutableStateFlow f62071F;

    /* renamed from: G */
    private final MutableStateFlow f62072G;

    /* renamed from: H */
    private final StateFlow f62073H;

    /* renamed from: I */
    private InterfaceC0765j f62074I;

    /* renamed from: J */
    private boolean f62075J;

    /* renamed from: K */
    private boolean f62076K;

    /* renamed from: s */
    private final String f62077s;

    /* renamed from: t */
    private final String f62078t;

    /* renamed from: u */
    private final C21927m f62079u;

    /* renamed from: v */
    private final CoroutineDispatcher f62080v;

    /* renamed from: w */
    private final CoroutineExceptionHandler f62081w;

    /* renamed from: x */
    private final CoroutineScope f62082x;

    /* renamed from: y */
    private final C31973j5 f62083y;

    /* renamed from: z */
    private final HashSet f62084z;

    /* renamed from: com.zing.zalo.ui.group.leavegroup.b$a */
    /* loaded from: classes5.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC19060k abstractC19060k) {
            this();
        }

        /* renamed from: a */
        public final boolean m66332a() {
            if (C19172a.m100601l("leave_group_silently@enable", 0, 2, null) != 1) {
                return false;
            }
            return true;
        }
    }

    /* renamed from: com.zing.zalo.ui.group.leavegroup.b$b */
    /* loaded from: classes5.dex */
    public static abstract class b {

        /* renamed from: com.zing.zalo.ui.group.leavegroup.b$b$a */
        /* loaded from: classes5.dex */
        public static final class a extends b {

            /* renamed from: a */
            public static final a f62085a = new a();

            private a() {
                super(null);
            }
        }

        /* renamed from: com.zing.zalo.ui.group.leavegroup.b$b$b */
        /* loaded from: classes5.dex */
        public static final class C32761b extends b {

            /* renamed from: a */
            private final String f62086a;

            /* renamed from: b */
            private final String f62087b;

            /* renamed from: c */
            private final boolean f62088c;

            /* renamed from: d */
            private final boolean f62089d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C32761b(String str, String str2, boolean z11, boolean z12) {
                super(null);
                AbstractC19074t.m100208f(str, "groupId");
                this.f62086a = str;
                this.f62087b = str2;
                this.f62088c = z11;
                this.f62089d = z12;
            }

            /* renamed from: a */
            public final String m66333a() {
                return this.f62086a;
            }

            /* renamed from: b */
            public final String m66334b() {
                return this.f62087b;
            }

            /* renamed from: c */
            public final boolean m66335c() {
                return this.f62089d;
            }

            /* renamed from: d */
            public final boolean m66336d() {
                return this.f62088c;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C32761b)) {
                    return false;
                }
                C32761b c32761b = (C32761b) obj;
                return AbstractC19074t.m100204b(this.f62086a, c32761b.f62086a) && AbstractC19074t.m100204b(this.f62087b, c32761b.f62087b) && this.f62088c == c32761b.f62088c && this.f62089d == c32761b.f62089d;
            }

            public int hashCode() {
                int hashCode = this.f62086a.hashCode() * 31;
                String str = this.f62087b;
                return ((((hashCode + (str == null ? 0 : str.hashCode())) * 31) + AbstractC2144f.m11520a(this.f62088c)) * 31) + AbstractC2144f.m11520a(this.f62089d);
            }

            public String toString() {
                return "CloseWithData(groupId=" + this.f62086a + ", newOwner=" + this.f62087b + ", silentLeave=" + this.f62088c + ", preventAdd=" + this.f62089d + ")";
            }
        }

        /* renamed from: com.zing.zalo.ui.group.leavegroup.b$b$c */
        /* loaded from: classes5.dex */
        public static final class c extends b {

            /* renamed from: a */
            public static final c f62090a = new c();

            private c() {
                super(null);
            }
        }

        /* renamed from: com.zing.zalo.ui.group.leavegroup.b$b$d */
        /* loaded from: classes5.dex */
        public static final class d extends b {

            /* renamed from: a */
            private final d f62091a;

            /* renamed from: b */
            private final boolean f62092b;

            /* renamed from: c */
            private final boolean f62093c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public d(d dVar, boolean z11, boolean z12) {
                super(null);
                AbstractC19074t.m100208f(dVar, "mode");
                this.f62091a = dVar;
                this.f62092b = z11;
                this.f62093c = z12;
            }

            /* renamed from: a */
            public final boolean m66337a() {
                return this.f62092b;
            }

            /* renamed from: b */
            public final d m66338b() {
                return this.f62091a;
            }

            /* renamed from: c */
            public final boolean m66339c() {
                return this.f62093c;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof d)) {
                    return false;
                }
                d dVar = (d) obj;
                return this.f62091a == dVar.f62091a && this.f62092b == dVar.f62092b && this.f62093c == dVar.f62093c;
            }

            public int hashCode() {
                return (((this.f62091a.hashCode() * 31) + AbstractC2144f.m11520a(this.f62092b)) * 31) + AbstractC2144f.m11520a(this.f62093c);
            }

            public String toString() {
                return "SwitchViewMode(mode=" + this.f62091a + ", canSwitchView=" + this.f62092b + ", withAnim=" + this.f62093c + ")";
            }
        }

        private b() {
        }

        public /* synthetic */ b(AbstractC19060k abstractC19060k) {
            this();
        }
    }

    /* renamed from: com.zing.zalo.ui.group.leavegroup.b$c */
    /* loaded from: classes5.dex */
    public static abstract class c {

        /* renamed from: com.zing.zalo.ui.group.leavegroup.b$c$a */
        /* loaded from: classes5.dex */
        public static final class a extends c {

            /* renamed from: a */
            private final int f62094a;

            public a(int i11) {
                super(null);
                this.f62094a = i11;
            }

            /* renamed from: a */
            public final int m66340a() {
                return this.f62094a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof a) && this.f62094a == ((a) obj).f62094a;
            }

            public int hashCode() {
                return this.f62094a;
            }

            public String toString() {
                return "Error(error=" + this.f62094a + ")";
            }
        }

        /* renamed from: com.zing.zalo.ui.group.leavegroup.b$c$b */
        /* loaded from: classes5.dex */
        public static final class b extends c {

            /* renamed from: a */
            public static final b f62095a = new b();

            private b() {
                super(null);
            }
        }

        /* renamed from: com.zing.zalo.ui.group.leavegroup.b$c$c */
        /* loaded from: classes5.dex */
        public static final class C32762c extends c {

            /* renamed from: a */
            public static final C32762c f62096a = new C32762c();

            private C32762c() {
                super(null);
            }
        }

        /* renamed from: com.zing.zalo.ui.group.leavegroup.b$c$d */
        /* loaded from: classes5.dex */
        public static final class d extends c {

            /* renamed from: a */
            private List f62097a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public d(List list) {
                super(null);
                AbstractC19074t.m100208f(list, "members");
                this.f62097a = list;
            }

            /* renamed from: a */
            public final d m66341a(List list) {
                AbstractC19074t.m100208f(list, "members");
                return new d(list);
            }

            /* renamed from: b */
            public final List m66342b() {
                return this.f62097a;
            }

            /* renamed from: c */
            public final void m66343c(List list) {
                AbstractC19074t.m100208f(list, "<set-?>");
                this.f62097a = list;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof d) && AbstractC19074t.m100204b(this.f62097a, ((d) obj).f62097a);
            }

            public int hashCode() {
                return this.f62097a.hashCode();
            }

            public String toString() {
                return "Shown(members=" + this.f62097a + ")";
            }
        }

        private c() {
        }

        public /* synthetic */ c(AbstractC19060k abstractC19060k) {
            this();
        }
    }

    /* renamed from: com.zing.zalo.ui.group.leavegroup.b$d */
    /* loaded from: classes5.dex */
    public static final class d extends Enum {

        /* renamed from: p */
        public static final d f62098p = new d("SelectOwner", 0);

        /* renamed from: q */
        public static final d f62099q = new d("ConfirmLeave", 1);

        /* renamed from: r */
        private static final /* synthetic */ d[] f62100r;

        /* renamed from: s */
        private static final /* synthetic */ InterfaceC30165a f62101s;

        static {
            d[] m66344b = m66344b();
            f62100r = m66344b;
            f62101s = AbstractC30166b.m148796a(m66344b);
        }

        private d(String str, int i11) {
            super(str, i11);
        }

        /* renamed from: b */
        private static final /* synthetic */ d[] m66344b() {
            return new d[]{f62098p, f62099q};
        }

        public static d valueOf(String str) {
            return (d) Enum.valueOf(d.class, str);
        }

        public static d[] values() {
            return (d[]) f62100r.clone();
        }
    }

    /* renamed from: com.zing.zalo.ui.group.leavegroup.b$e */
    /* loaded from: classes5.dex */
    public static final class e extends AbstractC29096d {

        /* renamed from: s */
        Object f62102s;

        /* renamed from: t */
        /* synthetic */ Object f62103t;

        /* renamed from: v */
        int f62105v;

        e(Continuation continuation) {
            super(continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            this.f62103t = obj;
            this.f62105v |= Integer.MIN_VALUE;
            return C11922b.this.m66294S(false, null, false, false, this);
        }
    }

    /* renamed from: com.zing.zalo.ui.group.leavegroup.b$f */
    /* loaded from: classes5.dex */
    public static final class f implements InterfaceC20094a {

        /* renamed from: a */
        final /* synthetic */ Continuation f62106a;

        /* renamed from: b */
        final /* synthetic */ C11922b f62107b;

        /* renamed from: c */
        final /* synthetic */ boolean f62108c;

        f(Continuation continuation, C11922b c11922b, boolean z11) {
            this.f62106a = continuation;
            this.f62107b = c11922b;
            this.f62108c = z11;
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
            int i11;
            AbstractC19074t.m100208f(c20096c, "errorMessage");
            int m104491c = c20096c.m104491c();
            Continuation continuation = this.f62106a;
            C24861r.a aVar = C24861r.f119264q;
            if (m104491c == 50001) {
                i11 = 2;
            } else {
                i11 = 3;
            }
            continuation.mo112492g(C24861r.m129218b(new c.a(i11)));
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            AbstractC19074t.m100208f(obj, "entity");
            Continuation continuation = this.f62106a;
            C24861r.a aVar = C24861r.f119264q;
            continuation.mo112492g(C24861r.m129218b(new c.d(this.f62107b.m66281B0(new JSONObject(obj.toString()), this.f62108c))));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.group.leavegroup.b$g */
    /* loaded from: classes5.dex */
    public static final class g extends AbstractC29104l implements InterfaceC18511r {

        /* renamed from: t */
        int f62109t;

        /* renamed from: u */
        /* synthetic */ Object f62110u;

        /* renamed from: v */
        /* synthetic */ Object f62111v;

        /* renamed from: w */
        /* synthetic */ Object f62112w;

        g(Continuation continuation) {
            super(4, continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            int i11;
            boolean z11;
            AbstractC28298d.m142578e();
            if (this.f62109t == 0) {
                AbstractC24862s.m129228b(obj);
                c cVar = (c) this.f62110u;
                String str = (String) this.f62111v;
                String str2 = (String) this.f62112w;
                String m120002o = AbstractC23262x6.m120002o(str);
                AbstractC19074t.m100207e(m120002o, "convertSignToNoSign(...)");
                int length = m120002o.length() - 1;
                int i12 = 0;
                boolean z12 = false;
                while (i12 <= length) {
                    if (!z12) {
                        i11 = i12;
                    } else {
                        i11 = length;
                    }
                    if (AbstractC19074t.m100209g(m120002o.charAt(i11), 32) <= 0) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    if (!z12) {
                        if (!z11) {
                            z12 = true;
                        } else {
                            i12++;
                        }
                    } else {
                        if (!z11) {
                            break;
                        }
                        length--;
                    }
                }
                String obj2 = m120002o.subSequence(i12, length + 1).toString();
                C11922b c11922b = C11922b.this;
                return c11922b.m66297e0(c11922b.m66289M0(c11922b.m66296U(cVar, obj2), str2), obj2);
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // en0.InterfaceC18511r
        /* renamed from: r */
        public final Object mo49340Uc(c cVar, String str, String str2, Continuation continuation) {
            g gVar = new g(continuation);
            gVar.f62110u = cVar;
            gVar.f62111v = str;
            gVar.f62112w = str2;
            return gVar.mo239o(C24848g0.f119245a);
        }
    }

    /* renamed from: com.zing.zalo.ui.group.leavegroup.b$h */
    /* loaded from: classes5.dex */
    public static final class h extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        int f62114t;

        /* renamed from: v */
        final /* synthetic */ boolean f62116v;

        /* renamed from: w */
        final /* synthetic */ boolean f62117w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(boolean z11, boolean z12, Continuation continuation) {
            super(2, continuation);
            this.f62116v = z11;
            this.f62117w = z12;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            return new h(this.f62116v, this.f62117w, continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            Object m142578e;
            m142578e = AbstractC28298d.m142578e();
            int i11 = this.f62114t;
            if (i11 != 0) {
                if (i11 == 1) {
                    AbstractC24862s.m129228b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                AbstractC24862s.m129228b(obj);
                C11922b c11922b = C11922b.this;
                boolean m66318j0 = c11922b.m66318j0();
                String m66311Z = C11922b.this.m66311Z();
                boolean z11 = this.f62116v;
                boolean z12 = this.f62117w;
                this.f62114t = 1;
                if (c11922b.m66294S(m66318j0, m66311Z, z11, z12, this) == m142578e) {
                    return m142578e;
                }
            }
            return C24848g0.f119245a;
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: r */
        public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
            return ((h) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* renamed from: com.zing.zalo.ui.group.leavegroup.b$i */
    /* loaded from: classes5.dex */
    public static final class i extends AbstractC27310a implements CoroutineExceptionHandler {
        public i(CoroutineExceptionHandler.Key key) {
            super(key);
        }

        @Override // kotlinx.coroutines.CoroutineExceptionHandler
        /* renamed from: G */
        public void mo35525G(InterfaceC27315f interfaceC27315f, Throwable th2) {
            AbstractC20110a.f98889a.mo104552e(th2);
        }
    }

    public /* synthetic */ C11922b(String str, String str2, C0943w c0943w, C21927m c21927m, CoroutineDispatcher coroutineDispatcher, int i11, AbstractC19060k abstractC19060k) {
        this(str, str2, c0943w, c21927m, (i11 & 16) != 0 ? Dispatchers.m112680b() : coroutineDispatcher);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v4 */
    /* JADX WARN: Type inference failed for: r8v5, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r8v6 */
    /* renamed from: B0 */
    public final List m66281B0(JSONObject jSONObject, boolean z11) {
        List m131502j;
        List m131502j2;
        ContactProfile contactProfile;
        boolean z12;
        ?? r82;
        String obj;
        int i11;
        boolean z13;
        int i12;
        boolean z14;
        JSONArray jSONArray;
        JSONArray jSONArray2;
        int i13;
        try {
            JSONObject jSONObject2 = jSONObject.getJSONObject("data");
            if (!jSONObject.isNull("error_code") && jSONObject.getInt("error_code") == 0) {
                int optInt = jSONObject2.optInt("creatorId");
                StringBuilder sb2 = new StringBuilder();
                sb2.append(optInt);
                String sb3 = sb2.toString();
                int optInt2 = jSONObject2.optInt("proposedOwner");
                StringBuilder sb4 = new StringBuilder();
                sb4.append(optInt2);
                this.f62066A = sb4.toString();
                ArrayList<GroupFullMemberAdapter.C6938b> arrayList = new ArrayList();
                this.f62084z.clear();
                JSONArray optJSONArray = jSONObject2.optJSONArray("admins");
                if (optJSONArray != null) {
                    int length = optJSONArray.length();
                    int i14 = 0;
                    while (i14 < length) {
                        Object obj2 = optJSONArray.get(i14);
                        AbstractC19074t.m100206d(obj2, "null cannot be cast to non-null type org.json.JSONObject");
                        JSONObject jSONObject3 = (JSONObject) obj2;
                        int optInt3 = jSONObject3.optInt("id");
                        StringBuilder sb5 = new StringBuilder();
                        sb5.append(optInt3);
                        String sb6 = sb5.toString();
                        String optString = jSONObject3.optString("dName");
                        String optString2 = jSONObject3.optString("avatar");
                        int optInt4 = jSONObject3.optInt("typeContact");
                        if (!TextUtils.isEmpty(sb6)) {
                            jSONArray2 = optJSONArray;
                            if (!this.f62079u.m114357s().m153137g(sb6) && optInt4 <= 0 && !this.f62084z.contains(sb6)) {
                                i13 = length;
                                GroupFullMemberAdapter.C6938b c6938b = new GroupFullMemberAdapter.C6938b(0);
                                if (AbstractC19074t.m100204b(sb3, sb6)) {
                                    c6938b.f38025e = true;
                                } else {
                                    c6938b.f38027g = true;
                                }
                                c6938b.f38022b = m66307V(sb6, optString, optString2, optInt4);
                                if (!c6938b.f38025e) {
                                    arrayList.add(c6938b);
                                    this.f62084z.add(sb6);
                                }
                                i14++;
                                optJSONArray = jSONArray2;
                                length = i13;
                            }
                        } else {
                            jSONArray2 = optJSONArray;
                        }
                        i13 = length;
                        i14++;
                        optJSONArray = jSONArray2;
                        length = i13;
                    }
                }
                JSONArray optJSONArray2 = jSONObject2.optJSONArray("currentMems");
                if (optJSONArray2 != null) {
                    int length2 = optJSONArray2.length();
                    int i15 = 0;
                    while (i15 < length2) {
                        Object obj3 = optJSONArray2.get(i15);
                        AbstractC19074t.m100206d(obj3, "null cannot be cast to non-null type org.json.JSONObject");
                        JSONObject jSONObject4 = (JSONObject) obj3;
                        int optInt5 = jSONObject4.optInt("id");
                        StringBuilder sb7 = new StringBuilder();
                        sb7.append(optInt5);
                        String sb8 = sb7.toString();
                        String optString3 = jSONObject4.optString("dName");
                        String optString4 = jSONObject4.optString("avatar");
                        int optInt6 = jSONObject4.optInt("typeContact");
                        if (!TextUtils.isEmpty(sb8) && !this.f62079u.m114357s().m153137g(sb8) && optInt6 <= 0 && !this.f62084z.contains(sb8)) {
                            jSONArray = optJSONArray2;
                            GroupFullMemberAdapter.C6938b c6938b2 = new GroupFullMemberAdapter.C6938b(0);
                            c6938b2.f38025e = AbstractC19074t.m100204b(sb3, sb8);
                            c6938b2.f38022b = m66307V(sb8, optString3, optString4, optInt6);
                            if (!c6938b2.f38025e) {
                                arrayList.add(c6938b2);
                                this.f62084z.add(sb8);
                            }
                        } else {
                            jSONArray = optJSONArray2;
                        }
                        i15++;
                        optJSONArray2 = jSONArray;
                    }
                }
                boolean z15 = false;
                boolean z16 = false;
                for (GroupFullMemberAdapter.C6938b c6938b3 : arrayList) {
                    if (c6938b3.f38021a == 0 && (contactProfile = c6938b3.f38022b) != 0) {
                        if (AbstractC19074t.m100204b(CoreUtility.f89233i, contactProfile.f42434r)) {
                            String m120002o = AbstractC23262x6.m120002o(AbstractC23136l9.m118743r0(AbstractC8020f0.str_you));
                            AbstractC19074t.m100207e(m120002o, "convertSignToNoSign(...)");
                            int length3 = m120002o.length() - 1;
                            int i16 = 0;
                            boolean z17 = false;
                            while (i16 <= length3) {
                                if (!z17) {
                                    i12 = i16;
                                } else {
                                    i12 = length3;
                                }
                                if (AbstractC19074t.m100209g(m120002o.charAt(i12), 32) <= 0) {
                                    z14 = true;
                                } else {
                                    z14 = false;
                                }
                                if (!z17) {
                                    if (!z14) {
                                        z17 = true;
                                    } else {
                                        i16++;
                                    }
                                } else {
                                    if (!z14) {
                                        break;
                                    }
                                    length3--;
                                }
                            }
                            obj = m120002o.subSequence(i16, length3 + 1).toString();
                        } else {
                            if (AbstractC19074t.m100204b(contactProfile.f42434r, this.f62066A)) {
                                z15 = true;
                            }
                            if (AbstractC19074t.m100204b(contactProfile.f42434r, m66313b0())) {
                                z12 = false;
                                r82 = 1;
                                z16 = true;
                            } else {
                                z12 = false;
                                r82 = 1;
                            }
                            String m120002o2 = AbstractC23262x6.m120002o(contactProfile.m40383Q(r82, z12));
                            AbstractC19074t.m100207e(m120002o2, "convertSignToNoSign(...)");
                            int length4 = m120002o2.length() - r82;
                            int i17 = 0;
                            boolean z18 = false;
                            while (i17 <= length4) {
                                if (!z18) {
                                    i11 = i17;
                                } else {
                                    i11 = length4;
                                }
                                if (AbstractC19074t.m100209g(m120002o2.charAt(i11), 32) <= 0) {
                                    z13 = true;
                                } else {
                                    z13 = false;
                                }
                                if (!z18) {
                                    if (!z13) {
                                        z18 = true;
                                    } else {
                                        i17++;
                                    }
                                } else {
                                    if (!z13) {
                                        break;
                                    }
                                    length4--;
                                }
                            }
                            obj = m120002o2.subSequence(i17, length4 + 1).toString();
                        }
                        contactProfile.f42440t = obj;
                    }
                }
                if (m66314c0()) {
                    if (!z16) {
                        m66284G0("");
                    }
                } else if (z11 && z15) {
                    m66284G0(this.f62066A);
                }
                Collections.sort(arrayList, AbstractC18811m.m98776a(this.f62066A));
                return arrayList;
            }
            m131502j2 = AbstractC25368s.m131502j();
            return m131502j2;
        } catch (Exception e11) {
            AbstractC20110a.f98889a.mo104552e(e11);
            m131502j = AbstractC25368s.m131502j();
            return m131502j;
        }
    }

    /* renamed from: D0 */
    public static /* synthetic */ Job m66282D0(C11922b c11922b, boolean z11, boolean z12, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z11 = false;
        }
        if ((i11 & 2) != 0) {
            z12 = true;
        }
        return c11922b.m66303C0(z11, z12);
    }

    /* renamed from: E0 */
    private final d m66283E0() {
        d dVar;
        if (m66318j0()) {
            dVar = d.f62098p;
        } else {
            dVar = d.f62099q;
        }
        m66286K0(dVar, false, true);
        return dVar;
    }

    /* renamed from: G0 */
    private final void m66284G0(String str) {
        this.f62071F.setValue(str);
    }

    /* renamed from: J0 */
    private final void m66285J0(int i11) {
        d dVar = d.f62099q;
        if (i11 == dVar.ordinal()) {
            m66287L0(this, dVar, false, false, 4, null);
            return;
        }
        d dVar2 = d.f62098p;
        if (i11 == dVar2.ordinal()) {
            m66287L0(this, dVar2, false, false, 4, null);
        }
    }

    /* renamed from: K0 */
    private final void m66286K0(d dVar, boolean z11, boolean z12) {
        if ((z12 || m66306R()) && ChannelResult.m113088i(this.f62067B.mo112912p(new b.d(dVar, m66306R(), z11)))) {
            this.f62069D = dVar;
        }
    }

    /* renamed from: L0 */
    static /* synthetic */ void m66287L0(C11922b c11922b, d dVar, boolean z11, boolean z12, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            z11 = true;
        }
        if ((i11 & 4) != 0) {
            z12 = false;
        }
        c11922b.m66286K0(dVar, z11, z12);
    }

    /* renamed from: M0 */
    public final c m66289M0(c cVar, String str) {
        String str2;
        if (str != null && str.length() != 0 && (cVar instanceof c.d)) {
            for (GroupFullMemberAdapter.C6938b c6938b : ((c.d) cVar).m66342b()) {
                ContactProfile contactProfile = c6938b.f38022b;
                if (contactProfile != null) {
                    str2 = contactProfile.f42434r;
                } else {
                    str2 = null;
                }
                c6938b.f38036p = AbstractC19074t.m100204b(str2, str);
            }
        }
        return cVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /* renamed from: S */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m66294S(boolean z11, String str, boolean z12, boolean z13, Continuation continuation) {
        e eVar;
        Object m142578e;
        int i11;
        MutableStateFlow mutableStateFlow;
        MutableStateFlow mutableStateFlow2;
        Object obj;
        Object aVar;
        if (continuation instanceof e) {
            eVar = (e) continuation;
            int i12 = eVar.f62105v;
            if ((i12 & Integer.MIN_VALUE) != 0) {
                eVar.f62105v = i12 - Integer.MIN_VALUE;
                Object obj2 = eVar.f62103t;
                m142578e = AbstractC28298d.m142578e();
                i11 = eVar.f62105v;
                if (i11 == 0) {
                    if (i11 != 1) {
                        if (i11 == 2) {
                            mutableStateFlow2 = (MutableStateFlow) eVar.f62102s;
                            AbstractC24862s.m129228b(obj2);
                            aVar = (c) obj2;
                        } else {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    } else {
                        mutableStateFlow2 = (MutableStateFlow) eVar.f62102s;
                        AbstractC24862s.m129228b(obj2);
                        aVar = new c.a(2);
                    }
                } else {
                    AbstractC24862s.m129228b(obj2);
                    if (!z12) {
                        this.f62072G.setValue(c.b.f62095a);
                    }
                    mutableStateFlow = this.f62072G;
                    if (!z11) {
                        obj = c.C32762c.f62096a;
                        mutableStateFlow.setValue(obj);
                        return C24848g0.f119245a;
                    }
                    if (!C23055e5.m118273h(false, 1, null)) {
                        eVar.f62102s = mutableStateFlow;
                        eVar.f62105v = 1;
                        if (DelayKt.m112666b(500L, eVar) == m142578e) {
                            return m142578e;
                        }
                        mutableStateFlow2 = mutableStateFlow;
                        aVar = new c.a(2);
                    } else {
                        eVar.f62102s = mutableStateFlow;
                        eVar.f62105v = 2;
                        obj2 = m66295T(str, z13, eVar);
                        if (obj2 == m142578e) {
                            return m142578e;
                        }
                        mutableStateFlow2 = mutableStateFlow;
                        aVar = (c) obj2;
                    }
                }
                mutableStateFlow = mutableStateFlow2;
                obj = aVar;
                mutableStateFlow.setValue(obj);
                return C24848g0.f119245a;
            }
        }
        eVar = new e(continuation);
        Object obj22 = eVar.f62103t;
        m142578e = AbstractC28298d.m142578e();
        i11 = eVar.f62105v;
        if (i11 == 0) {
        }
        mutableStateFlow = mutableStateFlow2;
        obj = aVar;
        mutableStateFlow.setValue(obj);
        return C24848g0.f119245a;
    }

    /* renamed from: T */
    private final Object m66295T(String str, boolean z11, Continuation continuation) {
        Continuation m142576c;
        Object m142578e;
        m142576c = AbstractC28297c.m142576c(continuation);
        C27317h c27317h = new C27317h(m142576c);
        this.f62074I.mo1704o8(new f(c27317h, this, z11));
        this.f62074I.mo1387A6(str);
        Object m139856a = c27317h.m139856a();
        m142578e = AbstractC28298d.m142578e();
        if (m139856a == m142578e) {
            AbstractC29100h.m145355c(continuation);
        }
        return m139856a;
    }

    /* renamed from: U */
    public final c m66296U(c cVar, String str) {
        if (cVar instanceof c.d) {
            c.d dVar = (c.d) cVar;
            c.d m66341a = dVar.m66341a(AbstractC18799a.m98774b(dVar.m66342b(), str));
            if (str.length() > 0 && m66341a.m66342b().isEmpty()) {
                return new c.a(1);
            }
            return m66341a;
        }
        return cVar;
    }

    /* renamed from: e0 */
    public final c m66297e0(c cVar, String str) {
        int m131511r;
        if (cVar instanceof c.d) {
            c.d dVar = (c.d) cVar;
            List m66342b = dVar.m66342b();
            m131511r = AbstractC25370t.m131511r(m66342b, 10);
            ArrayList arrayList = new ArrayList(m131511r);
            Iterator it = m66342b.iterator();
            while (it.hasNext()) {
                arrayList.add(AbstractC18799a.m98773a((GroupFullMemberAdapter.C6938b) it.next()));
            }
            dVar.m66343c(AbstractC18799a.m98775c(arrayList, str));
        }
        return cVar;
    }

    /* renamed from: i0 */
    private final boolean m66298i0(String str) {
        if (str.length() > 0 && AbstractC19074t.m100204b(this.f62071F.getValue(), str)) {
            return true;
        }
        return false;
    }

    /* renamed from: m0 */
    private final void m66299m0() {
        C0815e1.m2075D().m2100V(new C23648e(62, this.f62078t, 0, "gr_leave_silent", new String[0]), false);
    }

    /* renamed from: n0 */
    private final void m66300n0() {
        C0815e1.m2075D().m2100V(new C23648e(62, this.f62078t, 0, "gr_leave_leave", new String[0]), false);
    }

    /* renamed from: o0 */
    private final void m66301o0(String str) {
        String str2;
        C0815e1 m2075D = C0815e1.m2075D();
        String str3 = this.f62078t;
        if (AbstractC19074t.m100204b(this.f62066A, str)) {
            str2 = "continue_df_owner";
        } else {
            str2 = "continue_non_df_owner";
        }
        m2075D.m2100V(new C23648e(62, str3, 0, str2, new String[0]), false);
    }

    /* renamed from: A0 */
    public final void m66302A0(String str) {
        AbstractC19074t.m100208f(str, "uid");
        if (!m66298i0(str)) {
            m66284G0(str);
        }
    }

    /* renamed from: C0 */
    public final Job m66303C0(boolean z11, boolean z12) {
        Job m112540d;
        m112540d = BuildersKt__Builders_commonKt.m112540d(this.f62082x, this.f62080v, null, new h(z11, z12, null), 2, null);
        return m112540d;
    }

    /* renamed from: F0 */
    public final void m66304F0(String str, Integer num) {
        if (str != null) {
            m66284G0(str);
        }
        if (num != null) {
            m66285J0(num.intValue());
        }
    }

    /* renamed from: I0 */
    public final boolean m66305I0() {
        if (!m66315f0() && !m66317h0()) {
            return true;
        }
        return false;
    }

    /* renamed from: R */
    public final boolean m66306R() {
        return m66318j0();
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0021, code lost:            if (android.text.TextUtils.isEmpty(r2) != false) goto L30;     */
    /* renamed from: V */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final ContactProfile m66307V(String str, String str2, String str3, int i11) {
        String str4;
        AbstractC19074t.m100208f(str, "uid");
        String str5 = null;
        ContactProfile m141798e = C28203u6.m141798e(C28203u6.f131407a, str, null, 2, null);
        if (m141798e != null) {
            str4 = m141798e.f42437s;
        } else {
            str4 = null;
        }
        if (!TextUtils.isEmpty(str4)) {
            if (m141798e != null) {
                str5 = m141798e.f42446v;
            }
        }
        m141798e = new ContactProfile(str);
        m141798e.f42437s = str2;
        m141798e.f42446v = str3;
        m141798e.f42352K0 = i11;
        m141798e.f42330D = System.currentTimeMillis();
        C7960e.m41971c6().m42221O7(m141798e, false);
        if (AbstractC19074t.m100204b(CoreUtility.f89233i, str)) {
            m141798e = new ContactProfile(str);
            m141798e.f42437s = str2;
            m141798e.f42446v = str3;
            m141798e.f42352K0 = i11;
            m141798e.f42330D = System.currentTimeMillis();
        }
        AbstractC19074t.m100205c(m141798e);
        return m141798e;
    }

    /* renamed from: W */
    public final d m66308W() {
        return this.f62069D;
    }

    /* renamed from: X */
    public final String m66309X() {
        return (String) this.f62070E.getValue();
    }

    /* renamed from: Y */
    public final Flow m66310Y() {
        return this.f62068C;
    }

    /* renamed from: Z */
    public final String m66311Z() {
        return this.f62077s;
    }

    /* renamed from: a0 */
    public final StateFlow m66312a0() {
        return this.f62073H;
    }

    /* renamed from: b0 */
    public final String m66313b0() {
        return (String) this.f62071F.getValue();
    }

    /* renamed from: c0 */
    public final boolean m66314c0() {
        boolean z11;
        String m66313b0 = m66313b0();
        if (m66313b0 != null && m66313b0.length() != 0) {
            z11 = false;
        } else {
            z11 = true;
        }
        return !z11;
    }

    /* renamed from: f0 */
    public final boolean m66315f0() {
        C31973j5 c31973j5 = this.f62083y;
        if (c31973j5 != null) {
            return c31973j5.m153745W();
        }
        return false;
    }

    /* renamed from: g0 */
    public final boolean m66316g0() {
        C31973j5 c31973j5 = this.f62083y;
        if (c31973j5 != null) {
            return c31973j5.m153747Y();
        }
        return false;
    }

    /* renamed from: h0 */
    public final boolean m66317h0() {
        C31973j5 c31973j5 = this.f62083y;
        if (c31973j5 == null || !C30202c.f140315a.m148952c(c31973j5) || !c31973j5.m153768k0()) {
            return false;
        }
        return true;
    }

    /* renamed from: j0 */
    public final boolean m66318j0() {
        C31973j5 c31973j5 = this.f62083y;
        if (c31973j5 != null) {
            return c31973j5.m153778p0();
        }
        return false;
    }

    /* renamed from: k0 */
    public final void m66319k0() {
        C0815e1.m2075D().m2100V(new C23648e(62, this.f62078t, 0, "gr_leave_cancel", new String[0]), false);
    }

    /* renamed from: l0 */
    public final void m66320l0() {
        C0815e1.m2075D().m2100V(new C23648e(62, this.f62078t, 0, "cancel_change_owner_leave", new String[0]), false);
    }

    /* renamed from: p0 */
    public final void m66321p0() {
        if (!this.f62075J) {
            this.f62075J = true;
            C0815e1.m2075D().m2100V(new C23648e(62, this.f62078t, 1, "gr_leave_bottomsheet", new String[0]), false);
        }
    }

    /* renamed from: q0 */
    public final void m66322q0() {
        if (!this.f62076K) {
            this.f62076K = true;
            C0815e1.m2075D().m2100V(new C23648e(62, this.f62078t, 1, "change_owner_leave", new String[0]), false);
        }
    }

    /* renamed from: r0 */
    public final void m66323r0() {
        m66287L0(this, d.f62098p, false, false, 6, null);
    }

    /* renamed from: s0 */
    public final void m66324s0(boolean z11, boolean z12) {
        m66300n0();
        if (m66318j0() && !m66314c0()) {
            this.f62067B.mo112912p(b.c.f62090a);
        } else {
            this.f62067B.mo112912p(new b.C32761b(this.f62077s, m66313b0(), z11, z12));
        }
    }

    /* renamed from: t0 */
    public final void m66325t0(Object... objArr) {
        List m131505m;
        AbstractC19074t.m100208f(objArr, "args");
        try {
            if (objArr.length >= 3) {
                Object obj = objArr[0];
                AbstractC19074t.m100206d(obj, "null cannot be cast to non-null type kotlin.String");
                if (!AbstractC19074t.m100204b(this.f62077s, (String) obj)) {
                    return;
                }
                Object obj2 = objArr[1];
                AbstractC19074t.m100206d(obj2, "null cannot be cast to non-null type kotlin.Int");
                int intValue = ((Integer) obj2).intValue();
                if (intValue != 3) {
                    if (intValue == 4 || intValue == 10) {
                        Object obj3 = objArr[2];
                        AbstractC19074t.m100206d(obj3, "null cannot be cast to non-null type kotlin.String");
                        String[] split = TextUtils.split((String) obj3, ";");
                        AbstractC19074t.m100207e(split, "split(...)");
                        m131505m = AbstractC25368s.m131505m(Arrays.copyOf(split, split.length));
                        if (new ArrayList(m131505m).contains(CoreUtility.f89233i)) {
                            this.f62067B.mo112912p(b.a.f62085a);
                        } else {
                            m66303C0(true, false);
                        }
                    }
                } else {
                    m66303C0(true, false);
                }
            }
        } catch (Exception e11) {
            AbstractC20110a.f98889a.mo104549b(e11);
        }
    }

    /* renamed from: u0 */
    public final void m66326u0(boolean z11, boolean z12) {
        this.f62067B.mo112912p(new b.C32761b(this.f62077s, null, z11, z12));
    }

    /* renamed from: v0 */
    public final boolean m66327v0() {
        if (m66306R() && this.f62069D == d.f62099q) {
            m66287L0(this, d.f62098p, false, false, 6, null);
            return true;
        }
        return false;
    }

    /* renamed from: w0 */
    public final void m66328w0() {
        m66287L0(this, d.f62099q, false, false, 6, null);
        m66301o0((String) this.f62071F.getValue());
    }

    /* renamed from: x0 */
    public final void m66329x0(boolean z11) {
        if (z11) {
            m66299m0();
        }
    }

    /* renamed from: y0 */
    public final void m66330y0() {
        m66303C0(true, true);
        m66287L0(this, d.f62098p, true, false, 4, null);
    }

    /* renamed from: z0 */
    public final void m66331z0(String str) {
        AbstractC19074t.m100208f(str, "newText");
        this.f62070E.setValue(str);
    }

    public C11922b(String str, String str2, C0943w c0943w, C21927m c21927m, CoroutineDispatcher coroutineDispatcher) {
        AbstractC19074t.m100208f(str, "groupId");
        AbstractC19074t.m100208f(str2, "source");
        AbstractC19074t.m100208f(c0943w, "groupDao");
        AbstractC19074t.m100208f(c21927m, "friendManager");
        AbstractC19074t.m100208f(coroutineDispatcher, "ioDispatcher");
        this.f62077s = str;
        this.f62078t = str2;
        this.f62079u = c21927m;
        this.f62080v = coroutineDispatcher;
        i iVar = new i(CoroutineExceptionHandler.f105837l);
        this.f62081w = iVar;
        CoroutineScope m112643g = CoroutineScopeKt.m112643g(AbstractC1798u0.m9374a(this), coroutineDispatcher.mo112823d0(iVar));
        this.f62082x = m112643g;
        this.f62083y = c0943w.m4472f(str);
        this.f62084z = new HashSet();
        this.f62066A = "";
        Channel m113079b = ChannelKt.m113079b(-1, null, null, 6, null);
        this.f62067B = m113079b;
        this.f62068C = FlowKt.m113274J(m113079b);
        this.f62069D = m66283E0();
        MutableStateFlow m113503a = StateFlowKt.m113503a("");
        this.f62070E = m113503a;
        MutableStateFlow m113503a2 = StateFlowKt.m113503a(null);
        this.f62071F = m113503a2;
        c.b bVar = c.b.f62095a;
        MutableStateFlow m113503a3 = StateFlowKt.m113503a(bVar);
        this.f62072G = m113503a3;
        this.f62073H = FlowKt.m113280P(FlowKt.m113293k(m113503a3, m113503a, m113503a2, new g(null)), m112643g, SharingStarted.Companion.m113490b(SharingStarted.f107140a, 5000L, 0L, 2, null), bVar);
        this.f62074I = new C0766k();
    }
}
