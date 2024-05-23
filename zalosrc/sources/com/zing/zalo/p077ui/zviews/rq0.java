package com.zing.zalo.p077ui.zviews;

import androidx.lifecycle.AbstractC1803x;
import com.zing.zalo.feed.mvp.feed.domain.usecase.UnTagFeedUseCase;
import en0.InterfaceC18509p;
import fn0.AbstractC19074t;
import java.util.List;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import p458qr.AbstractC25468a;
import pm0.AbstractC24862s;
import pm0.C24848g0;
import qm0.AbstractC25366r;
import vm0.AbstractC28298d;
import wm0.AbstractC29094b;
import wm0.AbstractC29104l;

/* loaded from: classes6.dex */
public abstract class rq0 {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.zviews.rq0$a */
    /* loaded from: classes6.dex */
    public static final class C16103a extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        int f81842t;

        /* renamed from: u */
        final /* synthetic */ String f81843u;

        /* renamed from: v */
        final /* synthetic */ String f81844v;

        /* renamed from: w */
        final /* synthetic */ TagsListView f81845w;

        /* renamed from: com.zing.zalo.ui.zviews.rq0$a$a */
        /* loaded from: classes6.dex */
        public static final class a implements FlowCollector {

            /* renamed from: p */
            final /* synthetic */ TagsListView f81846p;

            /* renamed from: q */
            final /* synthetic */ String f81847q;

            a(TagsListView tagsListView, String str) {
                this.f81846p = tagsListView;
                this.f81847q = str;
            }

            @Override // kotlinx.coroutines.flow.FlowCollector
            /* renamed from: a */
            public final Object mo12109b(AbstractC25468a abstractC25468a, Continuation continuation) {
                if (abstractC25468a instanceof AbstractC25468a.c) {
                    this.f81846p.mo49315c4();
                    this.f81846p.mo78936E(((UnTagFeedUseCase.C8547c) ((AbstractC25468a.c) abstractC25468a).m131935a()).m45590a());
                    this.f81846p.m85008zM(this.f81847q);
                } else if (abstractC25468a instanceof AbstractC25468a.a) {
                    this.f81846p.mo49315c4();
                    this.f81846p.m85007yM(AbstractC29094b.m145339a(((AbstractC25468a.a) abstractC25468a).m131934a() instanceof UnTagFeedUseCase.ExceptionUnTagFeed));
                } else if (abstractC25468a instanceof AbstractC25468a.b) {
                    this.f81846p.mo46829Y();
                }
                return C24848g0.f119245a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C16103a(String str, String str2, TagsListView tagsListView, Continuation continuation) {
            super(2, continuation);
            this.f81843u = str;
            this.f81844v = str2;
            this.f81845w = tagsListView;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            return new C16103a(this.f81843u, this.f81844v, this.f81845w, continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            Object m142578e;
            List m131496e;
            m142578e = AbstractC28298d.m142578e();
            int i11 = this.f81842t;
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
                UnTagFeedUseCase unTagFeedUseCase = new UnTagFeedUseCase(null, null, 3, null);
                String str = this.f81843u;
                AbstractC19074t.m100207e(str, "$feedId");
                m131496e = AbstractC25366r.m131496e(this.f81844v);
                UnTagFeedUseCase.C8546b c8546b = new UnTagFeedUseCase.C8546b(str, m131496e);
                this.f81842t = 1;
                obj = unTagFeedUseCase.m101498a(c8546b, this);
                if (obj == m142578e) {
                    return m142578e;
                }
            }
            Flow flow = (Flow) obj;
            if (flow != null) {
                a aVar = new a(this.f81845w, this.f81844v);
                this.f81842t = 2;
                if (flow.mo97893a(aVar, this) == m142578e) {
                    return m142578e;
                }
            }
            return C24848g0.f119245a;
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: r */
        public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
            return ((C16103a) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* renamed from: a */
    public static final void m87390a(TagsListView tagsListView, String str) {
        AbstractC19074t.m100208f(tagsListView, "<this>");
        AbstractC19074t.m100208f(str, "uid");
        String str2 = tagsListView.f78236Z0;
        if (str2 != null) {
            BuildersKt__Builders_commonKt.m112540d(AbstractC1803x.m9388a(tagsListView), null, null, new C16103a(str2, str, tagsListView, null), 3, null);
        }
    }
}
