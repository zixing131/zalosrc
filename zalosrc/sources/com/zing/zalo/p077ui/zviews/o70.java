package com.zing.zalo.p077ui.zviews;

import a30.C0103b;
import android.text.TextUtils;
import androidx.lifecycle.AbstractC1803x;
import bi0.AbstractC2810d;
import com.zing.zalo.AbstractC8020f0;
import en0.InterfaceC18509p;
import fn0.AbstractC19074t;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import me0.AbstractC23136l9;
import p542ub.InterfaceC27218a;
import pm0.AbstractC24862s;
import pm0.C24848g0;
import vm0.AbstractC28298d;
import wm0.AbstractC29104l;

/* loaded from: classes6.dex */
public abstract class o70 {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.zviews.o70$a */
    /* loaded from: classes6.dex */
    public static final class C15972a extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        int f81435t;

        /* renamed from: u */
        final /* synthetic */ MyInfoView f81436u;

        /* renamed from: v */
        final /* synthetic */ String f81437v;

        /* renamed from: w */
        final /* synthetic */ long f81438w;

        /* renamed from: x */
        final /* synthetic */ String f81439x;

        /* renamed from: y */
        final /* synthetic */ String f81440y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C15972a(MyInfoView myInfoView, String str, long j11, String str2, String str3, Continuation continuation) {
            super(2, continuation);
            this.f81436u = myInfoView;
            this.f81437v = str;
            this.f81438w = j11;
            this.f81439x = str2;
            this.f81440y = str3;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            return new C15972a(this.f81436u, this.f81437v, this.f81438w, this.f81439x, this.f81440y, continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            Object m142578e;
            m142578e = AbstractC28298d.m142578e();
            int i11 = this.f81435t;
            if (i11 != 0) {
                if (i11 == 1) {
                    AbstractC24862s.m129228b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                AbstractC24862s.m129228b(obj);
                C0103b c0103b = new C0103b();
                InterfaceC27218a m92692wK = this.f81436u.m92692wK();
                String str = this.f81437v;
                AbstractC19074t.m100205c(str);
                C0103b.a aVar = new C0103b.a(m92692wK, str, this.f81438w);
                this.f81435t = 1;
                obj = c0103b.m101498a(aVar, this);
                if (obj == m142578e) {
                    return m142578e;
                }
            }
            String str2 = (String) obj;
            this.f81436u.mo49315c4();
            if (!TextUtils.isEmpty(str2)) {
                this.f81436u.m82215dP(this.f81439x, str2, this.f81440y);
            } else {
                this.f81436u.mo82225k8(AbstractC2810d.zds_ic_warning_circle_solid_24, AbstractC23136l9.m118743r0(AbstractC8020f0.str_general_error));
            }
            return C24848g0.f119245a;
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: r, reason: merged with bridge method [inline-methods] */
        public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
            return ((C15972a) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* renamed from: b */
    public static final void m87382b(final MyInfoView myInfoView, String str, String str2, long j11, String str3) {
        AbstractC19074t.m100208f(myInfoView, "<this>");
        myInfoView.mo46829Y();
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            BuildersKt__Builders_commonKt.m112540d(AbstractC1803x.m9388a(myInfoView), null, null, new C15972a(myInfoView, str, j11, str2, str3, null), 3, null);
        } else {
            myInfoView.mo49315c4();
            myInfoView.mo70710wy(new Runnable() { // from class: com.zing.zalo.ui.zviews.n70
                @Override // java.lang.Runnable
                public final void run() {
                    o70.m87383c(MyInfoView.this);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: c */
    public static final void m87383c(MyInfoView myInfoView) {
        AbstractC19074t.m100208f(myInfoView, "$this_onDownloadThumbZMp3");
        myInfoView.mo82225k8(AbstractC2810d.zds_ic_warning_circle_solid_24, AbstractC23136l9.m118743r0(AbstractC8020f0.str_general_error));
    }
}
