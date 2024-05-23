package com.zing.zalo.uicontrol;

import android.content.ClipDescription;
import android.os.Bundle;
import android.view.View;
import androidx.core.view.AbstractC1579n0;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.data.mediapicker.model.MediaItem;
import com.zing.zalo.utils.ToastUtils;
import en0.InterfaceC18505l;
import en0.InterfaceC18509p;
import fn0.AbstractC19074t;
import ge0.C19429b;
import java.util.ArrayList;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CompletableJob;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.SupervisorKt;
import me0.AbstractC23136l9;
import p716zh.C32205z8;
import pm0.AbstractC24862s;
import pm0.C24848g0;
import qm0.AbstractC25368s;
import vm0.AbstractC28298d;
import wm0.AbstractC29104l;

/* renamed from: com.zing.zalo.uicontrol.d1 */
/* loaded from: classes4.dex */
public final class C16572d1 implements C32205z8.b {

    /* renamed from: p */
    private final boolean f83679p;

    /* renamed from: q */
    private final InterfaceC18505l f83680q;

    /* renamed from: r */
    private C32205z8 f83681r;

    /* renamed from: s */
    private final CompletableJob f83682s;

    /* renamed from: t */
    private final CoroutineScope f83683t;

    /* renamed from: com.zing.zalo.uicontrol.d1$a */
    /* loaded from: classes4.dex */
    static final class a extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        int f83684t;

        /* renamed from: v */
        final /* synthetic */ C32205z8.c f83686v;

        /* renamed from: w */
        final /* synthetic */ ClipDescription f83687w;

        /* renamed from: x */
        final /* synthetic */ Bundle f83688x;

        /* renamed from: y */
        final /* synthetic */ int f83689y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(C32205z8.c cVar, ClipDescription clipDescription, Bundle bundle, int i11, Continuation continuation) {
            super(2, continuation);
            this.f83686v = cVar;
            this.f83687w = clipDescription;
            this.f83688x = bundle;
            this.f83689y = i11;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            return new a(this.f83686v, this.f83687w, this.f83688x, this.f83689y, continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            Object m142578e;
            ArrayList m131500h;
            m142578e = AbstractC28298d.m142578e();
            int i11 = this.f83684t;
            if (i11 != 0) {
                if (i11 == 1) {
                    AbstractC24862s.m129228b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                AbstractC24862s.m129228b(obj);
                C16572d1 c16572d1 = C16572d1.this;
                C32205z8.c cVar = this.f83686v;
                ClipDescription clipDescription = this.f83687w;
                Bundle bundle = this.f83688x;
                int i12 = this.f83689y;
                this.f83684t = 1;
                obj = c16572d1.m88289c(cVar, clipDescription, bundle, i12, this);
                if (obj == m142578e) {
                    return m142578e;
                }
            }
            String str = (String) obj;
            if (str != null && str.length() != 0 && C16572d1.this.f83680q != null) {
                InterfaceC18505l interfaceC18505l = C16572d1.this.f83680q;
                m131500h = AbstractC25368s.m131500h(new MediaItem(str));
                interfaceC18505l.mo205i9(m131500h);
            }
            return C24848g0.f119245a;
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: r */
        public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
            return ((a) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
        }
    }

    public C16572d1(View view, boolean z11, InterfaceC18505l interfaceC18505l) {
        this.f83679p = z11;
        this.f83680q = interfaceC18505l;
        CompletableJob m112864b = SupervisorKt.m112864b(null, 1, null);
        this.f83682s = m112864b;
        this.f83683t = CoroutineScopeKt.m112637a(Dispatchers.m112681c().mo112823d0(m112864b));
        this.f83681r = new C32205z8(this);
        if (view != null) {
            AbstractC1579n0.m7835R0(view, C32205z8.Companion.m155302a(), this.f83681r);
        }
    }

    /* renamed from: c */
    public final Object m88289c(C32205z8.c cVar, ClipDescription clipDescription, Bundle bundle, int i11, Continuation continuation) {
        return new C19429b().m101498a(new C19429b.a(cVar, clipDescription, bundle, i11), continuation);
    }

    @Override // p716zh.C32205z8.b
    /* renamed from: Jm */
    public boolean mo64111Jm() {
        return true;
    }

    @Override // p716zh.C32205z8.b
    /* renamed from: Vk */
    public void mo64138Vk(CharSequence charSequence, int i11) {
        AbstractC19074t.m100208f(charSequence, "text");
    }

    @Override // p716zh.C32205z8.b
    /* renamed from: Xf */
    public void mo64142Xf(C32205z8.c cVar, ClipDescription clipDescription, Bundle bundle, int i11) {
        AbstractC19074t.m100208f(cVar, "uri");
        if (this.f83679p) {
            BuildersKt__Builders_commonKt.m112540d(this.f83683t, null, null, new a(cVar, clipDescription, bundle, i11, null), 3, null);
        } else {
            ToastUtils.showMess(AbstractC23136l9.m118743r0(AbstractC8020f0.str_mime_type_unsupported_format));
        }
    }

    @Override // p716zh.C32205z8.b
    /* renamed from: q4 */
    public void mo64180q4(C32205z8.c cVar) {
        AbstractC19074t.m100208f(cVar, "uri");
        ToastUtils.showMess(AbstractC23136l9.m118743r0(AbstractC8020f0.str_mime_type_unsupported_format));
    }

    @Override // p716zh.C32205z8.b
    /* renamed from: s4 */
    public void mo64185s4(C32205z8.c cVar) {
        AbstractC19074t.m100208f(cVar, "uri");
        ToastUtils.showMess(AbstractC23136l9.m118743r0(AbstractC8020f0.str_mime_type_unsupported_format));
    }
}
