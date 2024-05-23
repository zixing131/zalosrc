package q30;

import androidx.work.AbstractC2144f;
import androidx.work.AbstractC2147g0;
import com.zing.zalo.SensitiveData;
import com.zing.zalo.zmedia.view.C17391z;
import en0.InterfaceC18509p;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.channels.ProduceKt;
import kotlinx.coroutines.channels.ProducerScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import p164fn.AbstractC19037k;
import p185gc.AbstractC19384h;
import p716zh.C32123ta;
import pm0.AbstractC24862s;
import pm0.C24848g0;
import vm0.AbstractC28298d;
import wm0.AbstractC29104l;

/* renamed from: q30.b */
/* loaded from: classes5.dex */
public final class C25105b extends AbstractC19384h {

    /* renamed from: q30.b$a */
    /* loaded from: classes5.dex */
    public static final class a extends d {

        /* renamed from: a */
        private final String f120593a;

        /* renamed from: b */
        private final int f120594b;

        public a(String str, int i11) {
            super(null);
            this.f120593a = str;
            this.f120594b = i11;
        }

        /* renamed from: a */
        public final String m130184a() {
            return this.f120593a;
        }

        /* renamed from: b */
        public final int m130185b() {
            return this.f120594b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return AbstractC19074t.m100204b(this.f120593a, aVar.f120593a) && this.f120594b == aVar.f120594b;
        }

        public int hashCode() {
            String str = this.f120593a;
            return ((str == null ? 0 : str.hashCode()) * 31) + this.f120594b;
        }

        public String toString() {
            return "FinishedResult(savedPath=" + this.f120593a + ", status=" + this.f120594b + ")";
        }
    }

    /* renamed from: q30.b$b */
    /* loaded from: classes5.dex */
    public static final class b extends d {

        /* renamed from: a */
        private final long f120595a;

        public b(long j11) {
            super(null);
            this.f120595a = j11;
        }

        /* renamed from: a */
        public final long m130186a() {
            return this.f120595a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && this.f120595a == ((b) obj).f120595a;
        }

        public int hashCode() {
            return AbstractC2147g0.m11521a(this.f120595a);
        }

        public String toString() {
            return "LoadingResult(progress=" + this.f120595a + ")";
        }
    }

    /* renamed from: q30.b$c */
    /* loaded from: classes5.dex */
    public static final class c {

        /* renamed from: a */
        private final C32123ta f120596a;

        /* renamed from: b */
        private final boolean f120597b;

        public c(C32123ta c32123ta, boolean z11) {
            this.f120596a = c32123ta;
            this.f120597b = z11;
        }

        /* renamed from: a */
        public final C32123ta m130187a() {
            return this.f120596a;
        }

        /* renamed from: b */
        public final boolean m130188b() {
            return this.f120597b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return AbstractC19074t.m100204b(this.f120596a, cVar.f120596a) && this.f120597b == cVar.f120597b;
        }

        public int hashCode() {
            C32123ta c32123ta = this.f120596a;
            return ((c32123ta == null ? 0 : c32123ta.hashCode()) * 31) + AbstractC2144f.m11520a(this.f120597b);
        }

        public String toString() {
            return "Param(storyItem=" + this.f120596a + ", isSaveToGallery=" + this.f120597b + ")";
        }
    }

    /* renamed from: q30.b$d */
    /* loaded from: classes5.dex */
    public static abstract class d {
        private d() {
        }

        public /* synthetic */ d(AbstractC19060k abstractC19060k) {
            this();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: q30.b$e */
    /* loaded from: classes5.dex */
    public static final class e extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        int f120598t;

        /* renamed from: u */
        private /* synthetic */ Object f120599u;

        /* renamed from: v */
        final /* synthetic */ c f120600v;

        /* renamed from: q30.b$e$a */
        /* loaded from: classes5.dex */
        public static final class a implements AbstractC19037k.f {

            /* renamed from: a */
            final /* synthetic */ ProducerScope f120601a;

            a(ProducerScope producerScope) {
                this.f120601a = producerScope;
            }

            @Override // p164fn.AbstractC19037k.f
            /* renamed from: a */
            public void mo463a(AbstractC19037k.e eVar, long j11) {
                this.f120601a.mo112912p(new b(j11));
            }

            @Override // p164fn.AbstractC19037k.f
            /* renamed from: b */
            public void mo464b(boolean z11, AbstractC19037k.e eVar, int i11) {
                ProducerScope producerScope = this.f120601a;
                String str = null;
                if (z11 && eVar != null) {
                    str = eVar.f94898d;
                }
                producerScope.mo112912p(new a(str, i11));
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(c cVar, Continuation continuation) {
            super(2, continuation);
            this.f120600v = cVar;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            e eVar = new e(this.f120600v, continuation);
            eVar.f120599u = obj;
            return eVar;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            Object m142578e;
            ProducerScope producerScope;
            boolean z11;
            m142578e = AbstractC28298d.m142578e();
            int i11 = this.f120598t;
            if (i11 != 0) {
                if (i11 != 1 && i11 != 2 && i11 != 3) {
                    if (i11 == 4) {
                        AbstractC24862s.m129228b(obj);
                        return C24848g0.f119245a;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                producerScope = (ProducerScope) this.f120599u;
                AbstractC24862s.m129228b(obj);
            } else {
                AbstractC24862s.m129228b(obj);
                producerScope = (ProducerScope) this.f120599u;
                a aVar = new a(producerScope);
                C32123ta m130187a = this.f120600v.m130187a();
                if (m130187a != null) {
                    if (m130187a.f148126b == 2) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    int i12 = m130187a.f148140i;
                    if (i12 != 1) {
                        if (i12 != 2) {
                            a aVar2 = new a(null, -1);
                            this.f120599u = producerScope;
                            this.f120598t = 2;
                            if (producerScope.mo112908S(aVar2, this) == m142578e) {
                                return m142578e;
                            }
                        } else {
                            C17391z c17391z = m130187a.f148101D;
                            if (c17391z != null) {
                                AbstractC19037k.e m100141d = AbstractC19037k.e.m100141d(c17391z, this.f120600v.m130188b(), aVar);
                                AbstractC19074t.m100207e(m100141d, "getVideoDownloadInfo(...)");
                                AbstractC19037k.m100125k(m100141d, z11, new SensitiveData("gallery_save_story_video", "social_timeline", null, 4, null));
                            } else {
                                a aVar3 = new a(null, -1);
                                this.f120599u = producerScope;
                                this.f120598t = 1;
                                if (producerScope.mo112908S(aVar3, this) == m142578e) {
                                    return m142578e;
                                }
                            }
                        }
                    } else {
                        AbstractC19037k.e m100140b = AbstractC19037k.e.m100140b(m130187a.f148147m, this.f120600v.m130188b(), aVar);
                        AbstractC19074t.m100207e(m100140b, "getPhotoDownloadInfo(...)");
                        AbstractC19037k.m100124j(m100140b, z11);
                    }
                } else {
                    a aVar4 = new a(null, -1);
                    this.f120599u = producerScope;
                    this.f120598t = 3;
                    if (producerScope.mo112908S(aVar4, this) == m142578e) {
                        return m142578e;
                    }
                }
            }
            this.f120599u = null;
            this.f120598t = 4;
            if (ProduceKt.m113185b(producerScope, null, this, 1, null) == m142578e) {
                return m142578e;
            }
            return C24848g0.f119245a;
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: r, reason: merged with bridge method [inline-methods] */
        public final Object mo240pC(ProducerScope producerScope, Continuation continuation) {
            return ((e) mo238a(producerScope, continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p185gc.AbstractC19384h
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public Flow mo13388b(c cVar) {
        AbstractC19074t.m100208f(cVar, "params");
        return FlowKt.m113287e(new e(cVar, null));
    }
}
