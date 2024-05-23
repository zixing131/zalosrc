package ke0;

import en0.InterfaceC18509p;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import java.util.HashMap;
import java.util.Map;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import nl.C23870a;
import og0.C24252c;
import og0.EnumC24251b;
import p185gc.AbstractC19377a;
import p487rl.C25826g;
import pm0.AbstractC24862s;
import pm0.C24848g0;
import tg0.C26676b;
import vm0.AbstractC28298d;
import wm0.AbstractC29094b;
import wm0.AbstractC29104l;

/* renamed from: ke0.a */
/* loaded from: classes4.dex */
public final class C21699a extends AbstractC19377a {
    public static final a Companion = new a(null);

    /* renamed from: a */
    private final C23870a f105390a;

    /* renamed from: ke0.a$a */
    /* loaded from: classes4.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC19060k abstractC19060k) {
            this();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: ke0.a$b */
    /* loaded from: classes4.dex */
    public static final class b extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        int f105391t;

        /* renamed from: v */
        final /* synthetic */ Map f105393v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(Map map, Continuation continuation) {
            super(2, continuation);
            this.f105393v = map;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            return new b(this.f105393v, continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            Object m142578e;
            m142578e = AbstractC28298d.m142578e();
            int i11 = this.f105391t;
            if (i11 != 0) {
                if (i11 == 1) {
                    AbstractC24862s.m129228b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                AbstractC24862s.m129228b(obj);
                Map m111987e = C21699a.this.m111987e(this.f105393v);
                C26676b.m136957g("SMLZCloudOptInUseCase", m111987e.toString(), null, 4, null);
                C23870a c23870a = C21699a.this.f105390a;
                int m126595a = C24252c.f117152a.m126595a(m111987e);
                this.f105391t = 1;
                obj = c23870a.m124799Z0(m126595a, this);
                if (obj == m142578e) {
                    return m142578e;
                }
            }
            if (((Boolean) obj).booleanValue()) {
                for (Map.Entry entry : this.f105393v.entrySet()) {
                    EnumC24251b enumC24251b = (EnumC24251b) entry.getKey();
                    if (((C25826g) entry.getValue()).m133200a()) {
                        C24252c.f117152a.m126604k(enumC24251b);
                    } else {
                        C24252c.f117152a.m126601g(enumC24251b);
                    }
                }
                return AbstractC29094b.m145339a(true);
            }
            return AbstractC29094b.m145339a(false);
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: r, reason: merged with bridge method [inline-methods] */
        public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
            return ((b) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
        }
    }

    public C21699a(C23870a c23870a) {
        AbstractC19074t.m100208f(c23870a, "cloudRepo");
        this.f105390a = c23870a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: e */
    public final Map m111987e(Map map) {
        HashMap hashMap = new HashMap();
        for (EnumC24251b enumC24251b : EnumC24251b.values()) {
            if (map.containsKey(enumC24251b)) {
                C25826g c25826g = (C25826g) map.get(enumC24251b);
                if (c25826g == null) {
                    c25826g = new C25826g(false);
                }
                hashMap.put(enumC24251b, c25826g);
            } else if (C24252c.f117152a.m126600f(enumC24251b)) {
                hashMap.put(enumC24251b, new C25826g(true));
            } else {
                hashMap.put(enumC24251b, new C25826g(false));
            }
        }
        return hashMap;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p185gc.AbstractC19377a
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public Object mo451b(Map map, Continuation continuation) {
        return BuildersKt.m112534g(Dispatchers.m112680b(), new b(map, null), continuation);
    }
}
