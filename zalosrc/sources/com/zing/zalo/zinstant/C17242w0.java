package com.zing.zalo.zinstant;

import android.content.Context;
import android.content.DialogInterface;
import com.zing.zalo.dialog.C8009j;
import com.zing.zalo.utils.ToastUtils;
import com.zing.zalo.zinstant.C17242w0;
import com.zing.zalo.zview.dialog.InterfaceC17463d;
import en0.InterfaceC18509p;
import fn0.AbstractC19074t;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import pj0.InterfaceC24796v;
import pm0.AbstractC24862s;
import pm0.C24848g0;
import vm0.AbstractC28298d;
import wm0.AbstractC29104l;

/* renamed from: com.zing.zalo.zinstant.w0 */
/* loaded from: classes.dex */
public final class C17242w0 implements InterfaceC24796v {

    /* renamed from: a */
    private final String f87909a = "ZaloZinstantUtilityProv";

    /* renamed from: com.zing.zalo.zinstant.w0$a */
    /* loaded from: classes7.dex */
    static final class a extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: A */
        final /* synthetic */ DialogInterface.OnClickListener f87910A;

        /* renamed from: t */
        int f87911t;

        /* renamed from: u */
        final /* synthetic */ Context f87912u;

        /* renamed from: v */
        final /* synthetic */ String f87913v;

        /* renamed from: w */
        final /* synthetic */ String f87914w;

        /* renamed from: x */
        final /* synthetic */ String f87915x;

        /* renamed from: y */
        final /* synthetic */ String f87916y;

        /* renamed from: z */
        final /* synthetic */ DialogInterface.OnClickListener f87917z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(Context context, String str, String str2, String str3, String str4, DialogInterface.OnClickListener onClickListener, DialogInterface.OnClickListener onClickListener2, Continuation continuation) {
            super(2, continuation);
            this.f87912u = context;
            this.f87913v = str;
            this.f87914w = str2;
            this.f87915x = str3;
            this.f87916y = str4;
            this.f87917z = onClickListener;
            this.f87910A = onClickListener2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: u */
        public static final void m92059u(DialogInterface.OnClickListener onClickListener, DialogInterface.OnClickListener onClickListener2, InterfaceC17463d interfaceC17463d, int i11) {
            if (i11 != -2) {
                if (i11 == -1) {
                    AbstractC19074t.m100205c(interfaceC17463d);
                    onClickListener.onClick(new DialogInterfaceC17101a1(interfaceC17463d), i11);
                    return;
                }
                return;
            }
            AbstractC19074t.m100205c(interfaceC17463d);
            onClickListener2.onClick(new DialogInterfaceC17101a1(interfaceC17463d), i11);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: v */
        public static final void m92060v(DialogInterface.OnClickListener onClickListener, InterfaceC17463d interfaceC17463d) {
            AbstractC19074t.m100205c(interfaceC17463d);
            onClickListener.onClick(new DialogInterfaceC17101a1(interfaceC17463d), -2);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            return new a(this.f87912u, this.f87913v, this.f87914w, this.f87915x, this.f87916y, this.f87917z, this.f87910A, continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            AbstractC28298d.m142578e();
            if (this.f87911t == 0) {
                AbstractC24862s.m129228b(obj);
                final DialogInterface.OnClickListener onClickListener = this.f87917z;
                final DialogInterface.OnClickListener onClickListener2 = this.f87910A;
                InterfaceC17463d.d dVar = new InterfaceC17463d.d() { // from class: com.zing.zalo.zinstant.u0
                    @Override // com.zing.zalo.zview.dialog.InterfaceC17463d.d
                    /* renamed from: K8 */
                    public final void mo605K8(InterfaceC17463d interfaceC17463d, int i11) {
                        C17242w0.a.m92059u(onClickListener, onClickListener2, interfaceC17463d, i11);
                    }
                };
                final DialogInterface.OnClickListener onClickListener3 = this.f87910A;
                new C8009j.a(this.f87912u).m43172u(this.f87913v).m43162k(this.f87914w).m43170s(this.f87915x, dVar).m43165n(this.f87916y, dVar).m43167p(new InterfaceC17463d.c() { // from class: com.zing.zalo.zinstant.v0
                    @Override // com.zing.zalo.zview.dialog.InterfaceC17463d.c
                    /* renamed from: p7 */
                    public final void mo13013p7(InterfaceC17463d interfaceC17463d) {
                        C17242w0.a.m92060v(onClickListener3, interfaceC17463d);
                    }
                }).m43151B();
                return C24848g0.f119245a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: t, reason: merged with bridge method [inline-methods] */
        public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
            return ((a) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* renamed from: com.zing.zalo.zinstant.w0$b */
    /* loaded from: classes7.dex */
    static final class b extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        int f87918t;

        /* renamed from: u */
        final /* synthetic */ String f87919u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(String str, Continuation continuation) {
            super(2, continuation);
            this.f87919u = str;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            return new b(this.f87919u, continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            AbstractC28298d.m142578e();
            if (this.f87918t == 0) {
                AbstractC24862s.m129228b(obj);
                String str = this.f87919u;
                if (str != null) {
                    ToastUtils.showMess(false, str);
                }
                return C24848g0.f119245a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: r, reason: merged with bridge method [inline-methods] */
        public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
            return ((b) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
        }
    }

    @Override // pj0.InterfaceC24796v
    /* renamed from: a */
    public void mo92054a(Context context, String str, String str2, String str3, DialogInterface.OnClickListener onClickListener, String str4, DialogInterface.OnClickListener onClickListener2) {
        AbstractC19074t.m100208f(context, "context");
        AbstractC19074t.m100208f(onClickListener, "positiveListener");
        AbstractC19074t.m100208f(onClickListener2, "negativeListener");
        BuildersKt__Builders_commonKt.m112540d(CoroutineScopeKt.m112637a(Dispatchers.m112681c()), null, null, new a(context, str, str2, str3, str4, onClickListener, onClickListener2, null), 3, null);
    }

    @Override // pj0.InterfaceC24796v
    /* renamed from: b */
    public void mo92055b(String str) {
        BuildersKt__Builders_commonKt.m112540d(CoroutineScopeKt.m112637a(Dispatchers.m112681c()), null, null, new b(str, null), 3, null);
    }

    @Override // pj0.InterfaceC24796v
    /* renamed from: c */
    public void mo92056c(String str) {
        AbstractC19074t.m100208f(str, "message");
        AbstractC17153h.m91733y(str);
    }
}
