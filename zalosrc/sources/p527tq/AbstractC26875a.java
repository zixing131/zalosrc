package p527tq;

import android.text.TextUtils;
import com.zing.zalo.feed.components.ProfileMusicView;
import en0.InterfaceC18509p;
import fn0.AbstractC19074t;
import iq.C20713m0;
import iq.InterfaceC20656b;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import p236ic.AbstractC20504a;
import p426pp.C24902e;
import p426pp.C24903f;
import p456qp.C25453e;
import pm0.AbstractC24862s;
import pm0.C24848g0;
import vm0.AbstractC28298d;
import wm0.AbstractC29104l;

/* renamed from: tq.a */
/* loaded from: classes4.dex */
public abstract class AbstractC26875a {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: tq.a$a */
    /* loaded from: classes4.dex */
    public static final class a extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        int f127173t;

        /* renamed from: u */
        private /* synthetic */ Object f127174u;

        /* renamed from: v */
        final /* synthetic */ C20713m0 f127175v;

        /* renamed from: tq.a$a$a */
        /* loaded from: classes4.dex */
        public static final class C32986a implements C25453e.a {

            /* renamed from: a */
            final /* synthetic */ String f127176a;

            /* renamed from: b */
            final /* synthetic */ C20713m0 f127177b;

            C32986a(String str, C20713m0 c20713m0) {
                this.f127176a = str;
                this.f127177b = c20713m0;
            }

            @Override // p456qp.C25453e.a
            /* renamed from: a */
            public void mo87822a(String str, Exception exc) {
                AbstractC19074t.m100208f(str, "songId");
                AbstractC19074t.m100208f(exc, "errorCode");
                try {
                    if (TextUtils.equals(this.f127176a, str)) {
                        int m44477c = ProfileMusicView.m44477c(exc);
                        this.f127177b.m108069at(m44477c);
                        if (m44477c == 800) {
                            this.f127177b.m107772Xp();
                        }
                        ((InterfaceC20656b) this.f127177b.m103742Dp()).mo82998pf(false);
                    }
                } catch (Exception e11) {
                    e11.printStackTrace();
                }
            }

            @Override // p456qp.C25453e.a
            /* renamed from: b */
            public void mo87823b(C24902e c24902e, C24903f c24903f) {
                AbstractC19074t.m100208f(c24902e, "song");
                AbstractC19074t.m100208f(c24903f, "streaming");
                try {
                    if (TextUtils.equals(this.f127176a, c24902e.m129490f())) {
                        C20713m0 c20713m0 = this.f127177b;
                        c20713m0.f101794j0 = c24902e;
                        c20713m0.f101795k0 = c24903f;
                        c20713m0.m108071ct(c20713m0.m107783jq(c24902e));
                        this.f127177b.m107794zq(false);
                        this.f127177b.m108085wr();
                        ((InterfaceC20656b) this.f127177b.m103742Dp()).mo49315c4();
                        this.f127177b.m108086wt();
                    }
                } catch (Exception e11) {
                    e11.printStackTrace();
                }
            }

            @Override // p456qp.C25453e.a
            /* renamed from: c */
            public void mo87824c(Job job) {
                AbstractC19074t.m100208f(job, "job");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(C20713m0 c20713m0, Continuation continuation) {
            super(2, continuation);
            this.f127175v = c20713m0;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            a aVar = new a(this.f127175v, continuation);
            aVar.f127174u = obj;
            return aVar;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            AbstractC28298d.m142578e();
            if (this.f127173t == 0) {
                AbstractC24862s.m129228b(obj);
                CoroutineScope coroutineScope = (CoroutineScope) this.f127174u;
                String mo107929t3 = this.f127175v.mo107929t3();
                if (!TextUtils.isEmpty(mo107929t3)) {
                    C25453e c25453e = new C25453e(null, 1, null);
                    AbstractC19074t.m100205c(mo107929t3);
                    c25453e.m101508a(new C25453e.b(mo107929t3, coroutineScope, new C32986a(mo107929t3, this.f127175v)));
                } else if (!this.f127175v.mo107643H6()) {
                    this.f127175v.m108075ht();
                } else {
                    this.f127175v.m108073ft();
                    this.f127175v.m108076mt();
                }
                return C24848g0.f119245a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: r */
        public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
            return ((a) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* renamed from: a */
    public static final void m138437a(C20713m0 c20713m0) {
        AbstractC19074t.m100208f(c20713m0, "<this>");
        BuildersKt__Builders_commonKt.m112540d(AbstractC20504a.m106544a(c20713m0), Dispatchers.m112681c(), null, new a(c20713m0, null), 2, null);
    }
}
