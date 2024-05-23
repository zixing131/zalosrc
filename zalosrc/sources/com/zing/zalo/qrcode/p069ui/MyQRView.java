package com.zing.zalo.qrcode.p069ui;

import ac.InterfaceC0733x;
import ae.C0766k;
import ae.InterfaceC0765j;
import android.content.ContentResolver;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.provider.Settings;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.SimpleAdapter;
import androidx.appcompat.widget.ZAppCompatImageView;
import androidx.core.view.AbstractC1579n0;
import androidx.lifecycle.C1802w0;
import androidx.lifecycle.C1808z0;
import androidx.lifecycle.InterfaceC1756a1;
import androidx.lifecycle.InterfaceC1764d0;
import bp0.AbstractC3104p;
import com.androidquery.util.C3977j;
import com.androidquery.util.C3979l;
import com.androidquery.util.InterfaceC3968a;
import com.androidquery.util.RecyclingImageView;
import com.zing.zalo.AbstractC16803z;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.SensitiveData;
import com.zing.zalo.control.ContactProfile;
import com.zing.zalo.control.TrackingSource;
import com.zing.zalo.dialog.C8009j;
import com.zing.zalo.p077ui.widget.RobotoTextView;
import com.zing.zalo.p077ui.zviews.SlidableZaloView;
import com.zing.zalo.p077ui.zviews.UpdateStatusView;
import com.zing.zalo.p077ui.zviews.multistate.MultiStateView;
import com.zing.zalo.p077ui.zviews.share.ShareView;
import com.zing.zalo.qrcode.p069ui.MyQRView;
import com.zing.zalo.utils.ToastUtils;
import com.zing.zalo.zmedia.player.ZMediaPlayer;
import com.zing.zalo.zview.AbstractC17501r0;
import com.zing.zalo.zview.C17487o0;
import com.zing.zalo.zview.ZaloView;
import com.zing.zalo.zview.actionbar.ActionBarMenu;
import com.zing.zalo.zview.actionbar.ActionBarMenuItem;
import com.zing.zalo.zview.dialog.InterfaceC17463d;
import com.zing.zalocore.CoreUtility;
import en0.InterfaceC18494a;
import en0.InterfaceC18505l;
import en0.InterfaceC18509p;
import fn0.AbstractC19060k;
import fn0.AbstractC19061k0;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import fn0.C19055h0;
import fn0.InterfaceC19066n;
import hm0.C20096c;
import hm0.InterfaceC20094a;
import ho0.AbstractC20110a;
import hu.AbstractC20130d;
import java.io.File;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.HashMap;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.MainCoroutineDispatcher;
import me0.AbstractC23034c6;
import me0.AbstractC23041d2;
import me0.AbstractC23136l9;
import me0.AbstractC23280z4;
import me0.C23024b7;
import me0.C23278z2;
import mm0.AbstractC23352g;
import org.json.JSONObject;
import p227i3.C20218v;
import p306ku.AbstractC21943a;
import p348mi.AbstractC23309i;
import p354n3.C23528a;
import p379o3.C23995f;
import p379o3.C23999j;
import p379o3.C24003n;
import p531ty.C26904a;
import p531ty.C26905b;
import p542ub.InterfaceC27218a;
import p649xl.C30118x8;
import pm0.AbstractC24862s;
import pm0.C24848g0;
import pm0.C24861r;
import pm0.InterfaceC24847g;
import pm0.InterfaceC24854k;
import qe0.AbstractC25251g;
import qm0.AbstractC25368s;
import sy.AbstractC26412d;
import sy.AbstractC26423o;
import vg.C28203u6;
import vm0.AbstractC28298d;
import wm0.AbstractC29096d;
import wm0.AbstractC29104l;
import zl0.AbstractC32226c;

/* loaded from: classes4.dex */
public final class MyQRView extends SlidableZaloView implements View.OnClickListener, InterfaceC0733x {
    public static final C9186a Companion = new C9186a(null);

    /* renamed from: P0 */
    private final InterfaceC24854k f48795P0;

    /* renamed from: Q0 */
    private C8009j f48796Q0;

    /* renamed from: R0 */
    private MultiStateView f48797R0;

    /* renamed from: S0 */
    private ActionBarMenuItem f48798S0;

    /* renamed from: T0 */
    private C30118x8 f48799T0;

    /* renamed from: U0 */
    private C23528a f48800U0;

    /* renamed from: V0 */
    private boolean f48801V0;

    /* renamed from: W0 */
    private C3979l f48802W0;

    /* renamed from: X0 */
    private C3979l f48803X0;

    /* renamed from: Y0 */
    private C3979l f48804Y0;

    /* renamed from: Z0 */
    private C3977j f48805Z0;

    /* renamed from: a1 */
    private boolean f48806a1;

    /* renamed from: b1 */
    private int f48807b1;

    /* renamed from: c1 */
    private final int f48808c1;

    /* renamed from: d1 */
    private final int f48809d1;

    /* renamed from: e1 */
    private Handler f48810e1;

    /* renamed from: com.zing.zalo.qrcode.ui.MyQRView$a */
    /* loaded from: classes4.dex */
    public static final class C9186a {
        private C9186a() {
        }

        public /* synthetic */ C9186a(AbstractC19060k abstractC19060k) {
            this();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.qrcode.ui.MyQRView$b */
    /* loaded from: classes4.dex */
    public static final class C9187b extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        int f48811t;

        C9187b(Continuation continuation) {
            super(2, continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            return new C9187b(continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            AbstractC28298d.m142578e();
            if (this.f48811t == 0) {
                AbstractC24862s.m129228b(obj);
                C30118x8 c30118x8 = MyQRView.this.f48799T0;
                C30118x8 c30118x82 = null;
                if (c30118x8 == null) {
                    AbstractC19074t.m100223u("binding");
                    c30118x8 = null;
                }
                MyQRImageView myQRImageView = c30118x8.f139911B;
                AbstractC19074t.m100207e(myQRImageView, "qrCodeView");
                AbstractC26423o.m136269c(myQRImageView);
                C30118x8 c30118x83 = MyQRView.this.f48799T0;
                if (c30118x83 == null) {
                    AbstractC19074t.m100223u("binding");
                    c30118x83 = null;
                }
                LinearLayout linearLayout = c30118x83.f139920u;
                AbstractC19074t.m100207e(linearLayout, "buttonsLayout");
                AbstractC26423o.m136269c(linearLayout);
                C30118x8 c30118x84 = MyQRView.this.f48799T0;
                if (c30118x84 == null) {
                    AbstractC19074t.m100223u("binding");
                    c30118x84 = null;
                }
                LinearLayout linearLayout2 = c30118x84.f139924y;
                AbstractC19074t.m100207e(linearLayout2, "infoLayout");
                AbstractC26423o.m136269c(linearLayout2);
                C30118x8 c30118x85 = MyQRView.this.f48799T0;
                if (c30118x85 == null) {
                    AbstractC19074t.m100223u("binding");
                } else {
                    c30118x82 = c30118x85;
                }
                LinearLayout linearLayout3 = c30118x82.f139922w;
                AbstractC19074t.m100207e(linearLayout3, "disableLayout");
                AbstractC26423o.m136267a(linearLayout3);
                return C24848g0.f119245a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: r, reason: merged with bridge method [inline-methods] */
        public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
            return ((C9187b) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.qrcode.ui.MyQRView$c */
    /* loaded from: classes4.dex */
    public static final class C9188c extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        int f48813t;

        C9188c(Continuation continuation) {
            super(2, continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            return new C9188c(continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            AbstractC28298d.m142578e();
            if (this.f48813t == 0) {
                AbstractC24862s.m129228b(obj);
                C30118x8 c30118x8 = MyQRView.this.f48799T0;
                C30118x8 c30118x82 = null;
                if (c30118x8 == null) {
                    AbstractC19074t.m100223u("binding");
                    c30118x8 = null;
                }
                MyQRImageView myQRImageView = c30118x8.f139911B;
                AbstractC19074t.m100207e(myQRImageView, "qrCodeView");
                AbstractC26423o.m136267a(myQRImageView);
                C30118x8 c30118x83 = MyQRView.this.f48799T0;
                if (c30118x83 == null) {
                    AbstractC19074t.m100223u("binding");
                    c30118x83 = null;
                }
                LinearLayout linearLayout = c30118x83.f139920u;
                AbstractC19074t.m100207e(linearLayout, "buttonsLayout");
                AbstractC26423o.m136267a(linearLayout);
                C30118x8 c30118x84 = MyQRView.this.f48799T0;
                if (c30118x84 == null) {
                    AbstractC19074t.m100223u("binding");
                    c30118x84 = null;
                }
                LinearLayout linearLayout2 = c30118x84.f139924y;
                AbstractC19074t.m100207e(linearLayout2, "infoLayout");
                AbstractC26423o.m136267a(linearLayout2);
                C30118x8 c30118x85 = MyQRView.this.f48799T0;
                if (c30118x85 == null) {
                    AbstractC19074t.m100223u("binding");
                    c30118x85 = null;
                }
                LinearLayout linearLayout3 = c30118x85.f139922w;
                AbstractC19074t.m100207e(linearLayout3, "disableLayout");
                AbstractC26423o.m136269c(linearLayout3);
                C30118x8 c30118x86 = MyQRView.this.f48799T0;
                if (c30118x86 == null) {
                    AbstractC19074t.m100223u("binding");
                } else {
                    c30118x82 = c30118x86;
                }
                MultiStateView multiStateView = c30118x82.f139925z;
                AbstractC19074t.m100207e(multiStateView, "multiState");
                AbstractC26423o.m136267a(multiStateView);
                return C24848g0.f119245a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: r, reason: merged with bridge method [inline-methods] */
        public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
            return ((C9188c) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.qrcode.ui.MyQRView$d */
    /* loaded from: classes4.dex */
    public static final class C9189d extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        int f48815t;

        C9189d(Continuation continuation) {
            super(2, continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            return new C9189d(continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            Object m142578e;
            m142578e = AbstractC28298d.m142578e();
            int i11 = this.f48815t;
            if (i11 != 0) {
                if (i11 == 1) {
                    AbstractC24862s.m129228b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                AbstractC24862s.m129228b(obj);
                this.f48815t = 1;
                if (DelayKt.m112666b(1000L, this) == m142578e) {
                    return m142578e;
                }
            }
            MyQRView.this.f48806a1 = false;
            return C24848g0.f119245a;
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: r, reason: merged with bridge method [inline-methods] */
        public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
            return ((C9189d) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.qrcode.ui.MyQRView$e */
    /* loaded from: classes4.dex */
    public static final class C9190e extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        int f48817t;

        /* renamed from: v */
        final /* synthetic */ boolean f48819v;

        /* renamed from: com.zing.zalo.qrcode.ui.MyQRView$e$a */
        /* loaded from: classes4.dex */
        public static final class a implements InterfaceC20094a {

            /* renamed from: a */
            final /* synthetic */ MyQRView f48820a;

            /* renamed from: b */
            final /* synthetic */ boolean f48821b;

            a(MyQRView myQRView, boolean z11) {
                this.f48820a = myQRView;
                this.f48821b = z11;
            }

            /* JADX INFO: Access modifiers changed from: private */
            /* renamed from: d */
            public static final void m49079d(C20096c c20096c, MyQRView myQRView, boolean z11) {
                AbstractC19074t.m100208f(c20096c, "$error");
                AbstractC19074t.m100208f(myQRView, "this$0");
                if (c20096c.m104491c() == 1001 && myQRView.m49040ZM() && !z11) {
                    myQRView.m49037VM().m138669U().m138689l("");
                    AbstractC23309i.m122667zv(myQRView.m49037VM().m138669U().m138682e());
                    myQRView.m49037VM().m138675a0(C26904a.a.f127309q);
                    Message message = new Message();
                    message.what = 1;
                    message.obj = Boolean.TRUE;
                    myQRView.f48810e1.sendMessage(message);
                    return;
                }
                if (c20096c.m104491c() == 50001) {
                    myQRView.m49037VM().m138675a0(C26904a.a.f127311s);
                } else {
                    myQRView.m49037VM().m138675a0(C26904a.a.f127312t);
                }
            }

            @Override // hm0.InterfaceC20094a
            /* renamed from: a */
            public void mo926a(final C20096c c20096c) {
                AbstractC19074t.m100208f(c20096c, ZMediaPlayer.OnNativeInvokeListener.ARG_ERROR);
                this.f48820a.m49037VM().m138669U().m138689l("");
                InterfaceC27218a m92676n2 = this.f48820a.f72421L0.m92676n2();
                if (m92676n2 != null) {
                    final MyQRView myQRView = this.f48820a;
                    final boolean z11 = this.f48821b;
                    m92676n2.runOnUiThread(new Runnable() { // from class: oy.d
                        @Override // java.lang.Runnable
                        public final void run() {
                            MyQRView.C9190e.a.m49079d(C20096c.this, myQRView, z11);
                        }
                    });
                }
            }

            @Override // hm0.InterfaceC20094a
            /* renamed from: b */
            public void mo927b(Object obj) {
                AbstractC19074t.m100208f(obj, "entity");
                try {
                    this.f48820a.m49037VM().m138675a0(C26904a.a.f127310r);
                    JSONObject jSONObject = ((JSONObject) obj).getJSONObject("data");
                    AbstractC19074t.m100207e(jSONObject, "getJSONObject(...)");
                    if (jSONObject.has("qrImgLink")) {
                        C26904a.b m138669U = this.f48820a.m49037VM().m138669U();
                        String string = jSONObject.getString("qrImgLink");
                        AbstractC19074t.m100207e(string, "getString(...)");
                        m138669U.m138689l(string);
                    }
                    if (jSONObject.has("avt")) {
                        C26904a.b m138669U2 = this.f48820a.m49037VM().m138669U();
                        String string2 = jSONObject.getString("avt");
                        AbstractC19074t.m100207e(string2, "getString(...)");
                        m138669U2.m138684g(string2);
                    }
                    if (jSONObject.has("qrBackgroundLink")) {
                        C26904a.b m138669U3 = this.f48820a.m49037VM().m138669U();
                        String string3 = jSONObject.getString("qrBackgroundLink");
                        AbstractC19074t.m100207e(string3, "getString(...)");
                        m138669U3.m138685h(string3);
                    }
                    if (this.f48820a.m49040ZM() && !TextUtils.isEmpty(this.f48820a.m49037VM().m138669U().m138682e()) && !TextUtils.isEmpty(this.f48820a.m49037VM().m138669U().m138678a())) {
                        AbstractC23309i.m120768Av(this.f48820a.m49037VM().m138669U().m138682e(), this.f48820a.m49037VM().m138669U().m138678a());
                    }
                    this.f48820a.m49044dN();
                } catch (Exception e11) {
                    e11.printStackTrace();
                    this.f48820a.m49037VM().m138669U().m138689l("");
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C9190e(boolean z11, Continuation continuation) {
            super(2, continuation);
            this.f48819v = z11;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            return new C9190e(this.f48819v, continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            AbstractC28298d.m142578e();
            if (this.f48817t == 0) {
                AbstractC24862s.m129228b(obj);
                if (MyQRView.this.f72421L0.m92692wK().isFinishing()) {
                    return C24848g0.f119245a;
                }
                if (MyQRView.this.m49040ZM()) {
                    MyQRView.this.m49029NM();
                }
                MyQRView.this.m49037VM().m138675a0(C26904a.a.f127309q);
                C0766k c0766k = new C0766k();
                c0766k.mo1704o8(new a(MyQRView.this, this.f48819v));
                boolean z11 = this.f48819v;
                if (!z11) {
                    if (MyQRView.this.m49040ZM()) {
                        c0766k.mo1667j7();
                    } else if (MyQRView.this.m49041aN()) {
                        c0766k.mo1768w8(MyQRView.this.m49037VM().m138669U().m138680c());
                    } else {
                        MyQRView.this.m49037VM().m138675a0(C26904a.a.f127312t);
                    }
                } else if (z11) {
                    if (MyQRView.this.m49040ZM()) {
                        c0766k.mo1679l5();
                    } else if (MyQRView.this.m49041aN()) {
                        MyQRView.this.m49037VM().m138675a0(C26904a.a.f127312t);
                    } else {
                        MyQRView.this.m49037VM().m138675a0(C26904a.a.f127312t);
                    }
                }
                return C24848g0.f119245a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: r, reason: merged with bridge method [inline-methods] */
        public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
            return ((C9190e) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.qrcode.ui.MyQRView$f */
    /* loaded from: classes4.dex */
    public static final class C9191f extends AbstractC29096d {

        /* renamed from: s */
        /* synthetic */ Object f48822s;

        /* renamed from: u */
        int f48824u;

        C9191f(Continuation continuation) {
            super(continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            this.f48822s = obj;
            this.f48824u |= Integer.MIN_VALUE;
            return MyQRView.this.m49035TM(null, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.qrcode.ui.MyQRView$g */
    /* loaded from: classes4.dex */
    public static final class C9192g extends AbstractC19075u implements InterfaceC18505l {

        /* renamed from: q */
        final /* synthetic */ String f48825q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C9192g(String str) {
            super(1);
            this.f48825q = str;
        }

        /* renamed from: a */
        public final void m49080a(InterfaceC0765j interfaceC0765j) {
            AbstractC19074t.m100208f(interfaceC0765j, "it");
            interfaceC0765j.mo1514Q4(this.f48825q, 0, new TrackingSource((short) 1001));
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m49080a((InterfaceC0765j) obj);
            return C24848g0.f119245a;
        }
    }

    /* renamed from: com.zing.zalo.qrcode.ui.MyQRView$h */
    /* loaded from: classes4.dex */
    public static final class HandlerC9193h extends Handler {
        HandlerC9193h(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            boolean z11;
            AbstractC19074t.m100208f(message, "msg");
            if (message.what == 1) {
                Boolean bool = (Boolean) message.obj;
                MyQRView myQRView = MyQRView.this;
                if (bool != null) {
                    z11 = bool.booleanValue();
                } else {
                    z11 = false;
                }
                myQRView.m49034SM(z11);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.qrcode.ui.MyQRView$i */
    /* loaded from: classes4.dex */
    public static final class C9194i extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        int f48827t;

        /* renamed from: com.zing.zalo.qrcode.ui.MyQRView$i$a */
        /* loaded from: classes4.dex */
        public static final class a extends C23999j {

            /* renamed from: l1 */
            final /* synthetic */ MyQRView f48829l1;

            a(MyQRView myQRView) {
                this.f48829l1 = myQRView;
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // p379o3.C23999j
            /* renamed from: O1 */
            public void mo473O1(String str, InterfaceC3968a interfaceC3968a, C3979l c3979l, C23995f c23995f) {
                AbstractC19074t.m100208f(str, ZMediaPlayer.OnNativeInvokeListener.ARG_URL);
                AbstractC19074t.m100208f(interfaceC3968a, "imageview");
                AbstractC19074t.m100208f(c23995f, "status");
                if (c3979l != null) {
                    try {
                        if (c3979l.m18839c() != null) {
                            C30118x8 c30118x8 = this.f48829l1.f48799T0;
                            C30118x8 c30118x82 = null;
                            if (c30118x8 == null) {
                                AbstractC19074t.m100223u("binding");
                                c30118x8 = null;
                            }
                            RecyclingImageView recyclingImageView = c30118x8.f139916q;
                            AbstractC19074t.m100207e(recyclingImageView, "avt");
                            AbstractC26423o.m136269c(recyclingImageView);
                            C30118x8 c30118x83 = this.f48829l1.f48799T0;
                            if (c30118x83 == null) {
                                AbstractC19074t.m100223u("binding");
                            } else {
                                c30118x82 = c30118x83;
                            }
                            c30118x82.f139916q.setImageInfo(c3979l);
                            this.f48829l1.f48802W0 = c3979l;
                        }
                    } catch (Exception e11) {
                        e11.printStackTrace();
                    }
                }
            }
        }

        C9194i(Continuation continuation) {
            super(2, continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            return new C9194i(continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            AbstractC28298d.m142578e();
            if (this.f48827t == 0) {
                AbstractC24862s.m129228b(obj);
                if (TextUtils.isEmpty(MyQRView.this.m49037VM().m138669U().m138678a())) {
                    return C24848g0.f119245a;
                }
                C24003n m120143n = C23278z2.m120143n();
                C23528a c23528a = MyQRView.this.f48800U0;
                C30118x8 c30118x8 = null;
                if (c23528a == null) {
                    AbstractC19074t.m100223u("mAQ");
                    c23528a = null;
                }
                C30118x8 c30118x82 = MyQRView.this.f48799T0;
                if (c30118x82 == null) {
                    AbstractC19074t.m100223u("binding");
                    c30118x82 = null;
                }
                ((C23528a) c23528a.m123612r(c30118x82.f139916q)).m123579C(MyQRView.this.m49037VM().m138669U().m138678a(), m120143n, new a(MyQRView.this));
                C30118x8 c30118x83 = MyQRView.this.f48799T0;
                if (c30118x83 == null) {
                    AbstractC19074t.m100223u("binding");
                } else {
                    c30118x8 = c30118x83;
                }
                ZAppCompatImageView zAppCompatImageView = c30118x8.f139923x;
                MyQRView myQRView = MyQRView.this;
                if (myQRView.m49041aN() && myQRView.m49037VM().m138669U().m138683f()) {
                    zAppCompatImageView.setImageResource(AbstractC16803z.ic_oa_verify);
                    zAppCompatImageView.setVisibility(0);
                } else {
                    zAppCompatImageView.setVisibility(8);
                }
                return C24848g0.f119245a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: r, reason: merged with bridge method [inline-methods] */
        public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
            return ((C9194i) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.qrcode.ui.MyQRView$j */
    /* loaded from: classes4.dex */
    public static final class C9195j extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        int f48830t;

        /* renamed from: com.zing.zalo.qrcode.ui.MyQRView$j$a */
        /* loaded from: classes4.dex */
        public static final class a extends C23999j {

            /* renamed from: l1 */
            final /* synthetic */ MyQRView f48832l1;

            a(MyQRView myQRView) {
                this.f48832l1 = myQRView;
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // p379o3.C23999j
            /* renamed from: O1 */
            public void mo473O1(String str, InterfaceC3968a interfaceC3968a, C3979l c3979l, C23995f c23995f) {
                AbstractC19074t.m100208f(str, ZMediaPlayer.OnNativeInvokeListener.ARG_URL);
                AbstractC19074t.m100208f(interfaceC3968a, "imageview");
                AbstractC19074t.m100208f(c23995f, "status");
                if (c3979l != null) {
                    try {
                        if (c3979l.m18839c() != null) {
                            this.f48832l1.f48804Y0 = c3979l;
                        }
                    } catch (Exception e11) {
                        AbstractC20110a.f98889a.mo104552e(e11);
                    }
                }
            }
        }

        C9195j(Continuation continuation) {
            super(2, continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            return new C9195j(continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            AbstractC28298d.m142578e();
            if (this.f48830t == 0) {
                AbstractC24862s.m129228b(obj);
                C23528a c23528a = MyQRView.this.f48800U0;
                C3977j c3977j = null;
                if (c23528a == null) {
                    AbstractC19074t.m100223u("mAQ");
                    c23528a = null;
                }
                C3977j c3977j2 = MyQRView.this.f48805Z0;
                if (c3977j2 == null) {
                    AbstractC19074t.m100223u("dumpBackground");
                } else {
                    c3977j = c3977j2;
                }
                ((C23528a) c23528a.m123612r(c3977j)).m123585I(MyQRView.this.m49037VM().m138669U().m138679b(), true, true, MyQRView.this.f48808c1, 0, new a(MyQRView.this), C23278z2.m120110a());
                return C24848g0.f119245a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: r, reason: merged with bridge method [inline-methods] */
        public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
            return ((C9195j) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.qrcode.ui.MyQRView$k */
    /* loaded from: classes4.dex */
    public static final class C9196k extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        int f48833t;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: com.zing.zalo.qrcode.ui.MyQRView$k$a */
        /* loaded from: classes4.dex */
        public static final class a extends AbstractC29104l implements InterfaceC18509p {

            /* renamed from: t */
            int f48835t;

            /* renamed from: u */
            final /* synthetic */ MyQRView f48836u;

            /* renamed from: v */
            final /* synthetic */ ContactProfile f48837v;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(MyQRView myQRView, ContactProfile contactProfile, Continuation continuation) {
                super(2, continuation);
                this.f48836u = myQRView;
                this.f48837v = contactProfile;
            }

            @Override // wm0.AbstractC29093a
            /* renamed from: a */
            public final Continuation mo238a(Object obj, Continuation continuation) {
                return new a(this.f48836u, this.f48837v, continuation);
            }

            @Override // wm0.AbstractC29093a
            /* renamed from: o */
            public final Object mo239o(Object obj) {
                AbstractC28298d.m142578e();
                if (this.f48835t == 0) {
                    AbstractC24862s.m129228b(obj);
                    C26904a.b m138669U = this.f48836u.m49037VM().m138669U();
                    String str = this.f48837v.f42437s;
                    AbstractC19074t.m100207e(str, "dpn");
                    m138669U.m138688k(str);
                    C30118x8 c30118x8 = this.f48836u.f48799T0;
                    C30118x8 c30118x82 = null;
                    if (c30118x8 == null) {
                        AbstractC19074t.m100223u("binding");
                        c30118x8 = null;
                    }
                    c30118x8.f139910A.setText(this.f48837v.f42437s);
                    C30118x8 c30118x83 = this.f48836u.f48799T0;
                    if (c30118x83 == null) {
                        AbstractC19074t.m100223u("binding");
                    } else {
                        c30118x82 = c30118x83;
                    }
                    c30118x82.f139912C.setText(this.f48836u.m92652XI(AbstractC8020f0.str_qr_my_qr_hint));
                    return C24848g0.f119245a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }

            @Override // en0.InterfaceC18509p
            /* renamed from: r, reason: merged with bridge method [inline-methods] */
            public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
                return ((a) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: com.zing.zalo.qrcode.ui.MyQRView$k$b */
        /* loaded from: classes4.dex */
        public static final class b extends AbstractC29104l implements InterfaceC18509p {

            /* renamed from: t */
            int f48838t;

            /* renamed from: u */
            final /* synthetic */ MyQRView f48839u;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(MyQRView myQRView, Continuation continuation) {
                super(2, continuation);
                this.f48839u = myQRView;
            }

            @Override // wm0.AbstractC29093a
            /* renamed from: a */
            public final Continuation mo238a(Object obj, Continuation continuation) {
                return new b(this.f48839u, continuation);
            }

            @Override // wm0.AbstractC29093a
            /* renamed from: o */
            public final Object mo239o(Object obj) {
                AbstractC28298d.m142578e();
                if (this.f48838t == 0) {
                    AbstractC24862s.m129228b(obj);
                    C30118x8 c30118x8 = this.f48839u.f48799T0;
                    C30118x8 c30118x82 = null;
                    if (c30118x8 == null) {
                        AbstractC19074t.m100223u("binding");
                        c30118x8 = null;
                    }
                    c30118x8.f139910A.setText(this.f48839u.m49037VM().m138669U().m138681d());
                    C30118x8 c30118x83 = this.f48839u.f48799T0;
                    if (c30118x83 == null) {
                        AbstractC19074t.m100223u("binding");
                    } else {
                        c30118x82 = c30118x83;
                    }
                    c30118x82.f139912C.setText(this.f48839u.m92652XI(AbstractC8020f0.str_qr_oa_qr_hint));
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

        C9196k(Continuation continuation) {
            super(2, continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            return new C9196k(continuation);
        }

        /* JADX WARN: Removed duplicated region for block: B:16:0x0106 A[RETURN] */
        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object mo239o(Object obj) {
            Object m142578e;
            ContactProfile contactProfile;
            MainCoroutineDispatcher m112681c;
            b bVar;
            m142578e = AbstractC28298d.m142578e();
            int i11 = this.f48833t;
            boolean z11 = true;
            if (i11 != 0) {
                if (i11 != 1) {
                    if (i11 != 2) {
                        if (i11 != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    } else {
                        AbstractC24862s.m129228b(obj);
                        contactProfile = (ContactProfile) obj;
                        C26904a.b m138669U = MyQRView.this.m49037VM().m138669U();
                        if (contactProfile != null || !contactProfile.m40359B0()) {
                            z11 = false;
                        }
                        m138669U.m138686i(z11);
                        m112681c = Dispatchers.m112681c();
                        bVar = new b(MyQRView.this, null);
                        this.f48833t = 3;
                        if (BuildersKt.m112534g(m112681c, bVar, this) == m142578e) {
                            return m142578e;
                        }
                        MyQRView.this.m49042bN();
                        MyQRView.this.m49070eN();
                        MyQRView.this.m49043cN();
                        return C24848g0.f119245a;
                    }
                }
                AbstractC24862s.m129228b(obj);
                MyQRView.this.m49042bN();
                MyQRView.this.m49070eN();
                MyQRView.this.m49043cN();
                return C24848g0.f119245a;
            }
            AbstractC24862s.m129228b(obj);
            if (MyQRView.this.f72421L0.getContext() == null) {
                return C24848g0.f119245a;
            }
            if (MyQRView.this.m49040ZM()) {
                if (!MyQRView.this.m49029NM()) {
                    return C24848g0.f119245a;
                }
                if (TextUtils.isEmpty(MyQRView.this.m49037VM().m138669U().m138682e()) || TextUtils.isEmpty(MyQRView.this.m49037VM().m138669U().m138678a())) {
                    C26904a.b m138669U2 = MyQRView.this.m49037VM().m138669U();
                    String m121006Ha = AbstractC23309i.m121006Ha();
                    String str = "";
                    if (m121006Ha == null) {
                        m121006Ha = "";
                    }
                    m138669U2.m138689l(m121006Ha);
                    C26904a.b m138669U3 = MyQRView.this.m49037VM().m138669U();
                    String m120969Ga = AbstractC23309i.m120969Ga();
                    if (m120969Ga != null) {
                        str = m120969Ga;
                    }
                    m138669U3.m138684g(str);
                }
                ContactProfile m141798e = C28203u6.m141798e(C28203u6.f131407a, CoreUtility.f89233i, null, 2, null);
                AbstractC19074t.m100205c(m141798e);
                MainCoroutineDispatcher m112681c2 = Dispatchers.m112681c();
                a aVar = new a(MyQRView.this, m141798e, null);
                this.f48833t = 1;
                if (BuildersKt.m112534g(m112681c2, aVar, this) == m142578e) {
                    return m142578e;
                }
            } else if (MyQRView.this.m49041aN()) {
                MyQRView myQRView = MyQRView.this;
                String m138680c = myQRView.m49037VM().m138669U().m138680c();
                this.f48833t = 2;
                obj = myQRView.m49035TM(m138680c, this);
                if (obj == m142578e) {
                    return m142578e;
                }
                contactProfile = (ContactProfile) obj;
                C26904a.b m138669U4 = MyQRView.this.m49037VM().m138669U();
                if (contactProfile != null) {
                }
                z11 = false;
                m138669U4.m138686i(z11);
                m112681c = Dispatchers.m112681c();
                bVar = new b(MyQRView.this, null);
                this.f48833t = 3;
                if (BuildersKt.m112534g(m112681c, bVar, this) == m142578e) {
                }
            }
            MyQRView.this.m49042bN();
            MyQRView.this.m49070eN();
            MyQRView.this.m49043cN();
            return C24848g0.f119245a;
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: r, reason: merged with bridge method [inline-methods] */
        public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
            return ((C9196k) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.qrcode.ui.MyQRView$l */
    /* loaded from: classes4.dex */
    public static final class C9197l extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        int f48840t;

        /* renamed from: com.zing.zalo.qrcode.ui.MyQRView$l$a */
        /* loaded from: classes4.dex */
        public static final class a extends C23999j {

            /* renamed from: l1 */
            final /* synthetic */ MyQRView f48842l1;

            a(MyQRView myQRView) {
                this.f48842l1 = myQRView;
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // p379o3.C23999j
            /* renamed from: O1 */
            public void mo473O1(String str, InterfaceC3968a interfaceC3968a, C3979l c3979l, C23995f c23995f) {
                AbstractC19074t.m100208f(str, ZMediaPlayer.OnNativeInvokeListener.ARG_URL);
                AbstractC19074t.m100208f(interfaceC3968a, "imageview");
                AbstractC19074t.m100208f(c23995f, "status");
                if (c3979l != null) {
                    try {
                        if (c3979l.m18839c() != null) {
                            this.f48842l1.m49037VM().m138675a0(C26904a.a.f127310r);
                            C30118x8 c30118x8 = this.f48842l1.f48799T0;
                            C30118x8 c30118x82 = null;
                            if (c30118x8 == null) {
                                AbstractC19074t.m100223u("binding");
                                c30118x8 = null;
                            }
                            c30118x8.f139911B.setImageInfo(c3979l);
                            C30118x8 c30118x83 = this.f48842l1.f48799T0;
                            if (c30118x83 == null) {
                                AbstractC19074t.m100223u("binding");
                            } else {
                                c30118x82 = c30118x83;
                            }
                            MyQRImageView myQRImageView = c30118x82.f139911B;
                            AbstractC19074t.m100207e(myQRImageView, "qrCodeView");
                            AbstractC26423o.m136269c(myQRImageView);
                            this.f48842l1.f48803X0 = c3979l;
                        }
                    } catch (Exception e11) {
                        this.f48842l1.m49037VM().m138675a0(C26904a.a.f127312t);
                        e11.printStackTrace();
                    }
                }
            }
        }

        C9197l(Continuation continuation) {
            super(2, continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            return new C9197l(continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            AbstractC28298d.m142578e();
            if (this.f48840t == 0) {
                AbstractC24862s.m129228b(obj);
                if (MyQRView.this.f72421L0.m92672lJ() && !MyQRView.this.f72421L0.m92692wK().isFinishing()) {
                    C30118x8 c30118x8 = null;
                    if (TextUtils.isEmpty(MyQRView.this.m49037VM().m138669U().m138682e())) {
                        C30118x8 c30118x82 = MyQRView.this.f48799T0;
                        if (c30118x82 == null) {
                            AbstractC19074t.m100223u("binding");
                        } else {
                            c30118x8 = c30118x82;
                        }
                        c30118x8.f139911B.setVisibility(8);
                        MyQRView.this.m49037VM().m138675a0(C26904a.a.f127312t);
                        return C24848g0.f119245a;
                    }
                    MyQRView.this.m49037VM().m138675a0(C26904a.a.f127309q);
                    C23528a c23528a = MyQRView.this.f48800U0;
                    if (c23528a == null) {
                        AbstractC19074t.m100223u("mAQ");
                        c23528a = null;
                    }
                    C30118x8 c30118x83 = MyQRView.this.f48799T0;
                    if (c30118x83 == null) {
                        AbstractC19074t.m100223u("binding");
                    } else {
                        c30118x8 = c30118x83;
                    }
                    ((C23528a) c23528a.m123612r(c30118x8.f139911B)).m123585I(MyQRView.this.m49037VM().m138669U().m138682e(), true, true, MyQRView.this.f48809d1, 0, new a(MyQRView.this), C23278z2.m120110a());
                    return C24848g0.f119245a;
                }
                return C24848g0.f119245a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: r, reason: merged with bridge method [inline-methods] */
        public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
            return ((C9197l) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.qrcode.ui.MyQRView$m */
    /* loaded from: classes4.dex */
    public static final class C9198m implements InterfaceC1764d0, InterfaceC19066n {

        /* renamed from: p */
        private final /* synthetic */ InterfaceC18505l f48843p;

        C9198m(InterfaceC18505l interfaceC18505l) {
            AbstractC19074t.m100208f(interfaceC18505l, "function");
            this.f48843p = interfaceC18505l;
        }

        @Override // fn0.InterfaceC19066n
        /* renamed from: c */
        public final InterfaceC24847g mo9368c() {
            return this.f48843p;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof InterfaceC1764d0) && (obj instanceof InterfaceC19066n)) {
                return AbstractC19074t.m100204b(mo9368c(), ((InterfaceC19066n) obj).mo9368c());
            }
            return false;
        }

        public final int hashCode() {
            return mo9368c().hashCode();
        }

        @Override // androidx.lifecycle.InterfaceC1764d0
        /* renamed from: qp */
        public final /* synthetic */ void mo8524qp(Object obj) {
            this.f48843p.mo205i9(obj);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.qrcode.ui.MyQRView$n */
    /* loaded from: classes4.dex */
    public static final class C9199n extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        int f48844t;

        /* renamed from: u */
        final /* synthetic */ String f48845u;

        /* renamed from: v */
        final /* synthetic */ MyQRView f48846v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C9199n(String str, MyQRView myQRView, Continuation continuation) {
            super(2, continuation);
            this.f48845u = str;
            this.f48846v = myQRView;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            return new C9199n(this.f48845u, this.f48846v, continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            AbstractC28298d.m142578e();
            if (this.f48844t == 0) {
                AbstractC24862s.m129228b(obj);
                if (!TextUtils.isEmpty(this.f48845u)) {
                    this.f48846v.m49048hN();
                } else {
                    ToastUtils.showMess(AbstractC23136l9.m118743r0(AbstractC8020f0.unknown_error));
                }
                return C24848g0.f119245a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: r, reason: merged with bridge method [inline-methods] */
        public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
            return ((C9199n) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.qrcode.ui.MyQRView$o */
    /* loaded from: classes4.dex */
    public static final class C9200o extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        int f48847t;

        C9200o(Continuation continuation) {
            super(2, continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            return new C9200o(continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            AbstractC28298d.m142578e();
            if (this.f48847t == 0) {
                AbstractC24862s.m129228b(obj);
                C8009j.a aVar = new C8009j.a(MyQRView.this.f72421L0.m92648SI());
                aVar.m43172u(AbstractC23136l9.m118743r0(AbstractC8020f0.str_title_popup_save_qrcode)).m43159h(3).m43162k(AbstractC23136l9.m118743r0(AbstractC8020f0.str_description_popup_save_qrcode)).m43165n(AbstractC23136l9.m118743r0(AbstractC8020f0.str_close), new InterfaceC17463d.b());
                MyQRView.this.f48796Q0 = aVar.m43152a();
                C8009j c8009j = MyQRView.this.f48796Q0;
                if (c8009j != null) {
                    c8009j.mo13822K();
                }
                return C24848g0.f119245a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: r, reason: merged with bridge method [inline-methods] */
        public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
            return ((C9200o) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* renamed from: com.zing.zalo.qrcode.ui.MyQRView$p */
    /* loaded from: classes4.dex */
    public static final class C9201p extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        final /* synthetic */ InterfaceC18494a f48849q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C9201p(InterfaceC18494a interfaceC18494a) {
            super(0);
            this.f48849q = interfaceC18494a;
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C1808z0 mo12V4() {
            C1808z0 mo4644Oc = ((InterfaceC1756a1) this.f48849q.mo12V4()).mo4644Oc();
            AbstractC19074t.m100207e(mo4644Oc, "ownerProducer().viewModelStore");
            return mo4644Oc;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.qrcode.ui.MyQRView$q */
    /* loaded from: classes4.dex */
    public static final class C9202q extends AbstractC19075u implements InterfaceC18505l {

        /* renamed from: com.zing.zalo.qrcode.ui.MyQRView$q$a */
        /* loaded from: classes4.dex */
        public /* synthetic */ class a {

            /* renamed from: a */
            public static final /* synthetic */ int[] f48851a;

            static {
                int[] iArr = new int[C26904a.a.values().length];
                try {
                    iArr[C26904a.a.f127308p.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[C26904a.a.f127310r.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[C26904a.a.f127311s.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[C26904a.a.f127312t.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[C26904a.a.f127309q.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                f48851a = iArr;
            }
        }

        C9202q() {
            super(1);
        }

        /* renamed from: a */
        public final void m49090a(C26904a.a aVar) {
            int i11;
            if (aVar == null) {
                i11 = -1;
            } else {
                i11 = a.f48851a[aVar.ordinal()];
            }
            C30118x8 c30118x8 = null;
            MultiStateView multiStateView = null;
            MultiStateView multiStateView2 = null;
            MultiStateView multiStateView3 = null;
            if (i11 == 1 || i11 == 2) {
                MultiStateView multiStateView4 = MyQRView.this.f48797R0;
                if (multiStateView4 == null) {
                    AbstractC19074t.m100223u("stateView");
                    multiStateView4 = null;
                }
                AbstractC26423o.m136267a(multiStateView4);
                C30118x8 c30118x82 = MyQRView.this.f48799T0;
                if (c30118x82 == null) {
                    AbstractC19074t.m100223u("binding");
                } else {
                    c30118x8 = c30118x82;
                }
                RobotoTextView robotoTextView = c30118x8.f139912C;
                AbstractC19074t.m100207e(robotoTextView, "tvHint");
                AbstractC26423o.m136269c(robotoTextView);
                return;
            }
            if (i11 == 3) {
                MultiStateView multiStateView5 = MyQRView.this.f48797R0;
                if (multiStateView5 == null) {
                    AbstractC19074t.m100223u("stateView");
                    multiStateView5 = null;
                }
                AbstractC26423o.m136269c(multiStateView5);
                MultiStateView multiStateView6 = MyQRView.this.f48797R0;
                if (multiStateView6 == null) {
                    AbstractC19074t.m100223u("stateView");
                    multiStateView6 = null;
                }
                multiStateView6.setState(MultiStateView.EnumC15914e.ERROR);
                MultiStateView multiStateView7 = MyQRView.this.f48797R0;
                if (multiStateView7 == null) {
                    AbstractC19074t.m100223u("stateView");
                    multiStateView7 = null;
                }
                multiStateView7.setErrorType(MultiStateView.EnumC15915f.NETWORK_ERROR);
                MultiStateView multiStateView8 = MyQRView.this.f48797R0;
                if (multiStateView8 == null) {
                    AbstractC19074t.m100223u("stateView");
                } else {
                    multiStateView3 = multiStateView8;
                }
                multiStateView3.setErrorTitleString(AbstractC23136l9.m118743r0(AbstractC8020f0.NETWORK_ERROR_MSG));
                return;
            }
            if (i11 == 4) {
                MultiStateView multiStateView9 = MyQRView.this.f48797R0;
                if (multiStateView9 == null) {
                    AbstractC19074t.m100223u("stateView");
                    multiStateView9 = null;
                }
                AbstractC26423o.m136269c(multiStateView9);
                MultiStateView multiStateView10 = MyQRView.this.f48797R0;
                if (multiStateView10 == null) {
                    AbstractC19074t.m100223u("stateView");
                    multiStateView10 = null;
                }
                multiStateView10.setState(MultiStateView.EnumC15914e.ERROR);
                MultiStateView multiStateView11 = MyQRView.this.f48797R0;
                if (multiStateView11 == null) {
                    AbstractC19074t.m100223u("stateView");
                } else {
                    multiStateView2 = multiStateView11;
                }
                multiStateView2.setErrorType(MultiStateView.EnumC15915f.UNKNOWN_ERROR);
                return;
            }
            if (i11 == 5) {
                MultiStateView multiStateView12 = MyQRView.this.f48797R0;
                if (multiStateView12 == null) {
                    AbstractC19074t.m100223u("stateView");
                    multiStateView12 = null;
                }
                AbstractC26423o.m136269c(multiStateView12);
                MultiStateView multiStateView13 = MyQRView.this.f48797R0;
                if (multiStateView13 == null) {
                    AbstractC19074t.m100223u("stateView");
                } else {
                    multiStateView = multiStateView13;
                }
                multiStateView.setState(MultiStateView.EnumC15914e.LOADING);
            }
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m49090a((C26904a.a) obj);
            return C24848g0.f119245a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.qrcode.ui.MyQRView$r */
    /* loaded from: classes4.dex */
    public static final class C9203r extends AbstractC19075u implements InterfaceC18505l {
        C9203r() {
            super(1);
        }

        /* renamed from: a */
        public final void m49091a(Integer num) {
            if ((num == null || num.intValue() != 1) && (num == null || num.intValue() != 2)) {
                MyQRView.this.m49031PM();
                return;
            }
            if (MyQRView.this.f48801V0) {
                MyQRView.this.m49034SM(false);
                MyQRView.this.f48801V0 = false;
            } else {
                MyQRView.this.m49044dN();
            }
            MyQRView.this.m49030OM();
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m49091a((Integer) obj);
            return C24848g0.f119245a;
        }
    }

    /* renamed from: com.zing.zalo.qrcode.ui.MyQRView$s */
    /* loaded from: classes4.dex */
    public static final class ViewOnAttachStateChangeListenerC9204s implements View.OnAttachStateChangeListener {

        /* renamed from: p */
        final /* synthetic */ C19055h0 f48853p;

        /* renamed from: q */
        final /* synthetic */ LinearLayout f48854q;

        /* renamed from: r */
        final /* synthetic */ int f48855r;

        public ViewOnAttachStateChangeListenerC9204s(C19055h0 c19055h0, LinearLayout linearLayout, int i11) {
            this.f48853p = c19055h0;
            this.f48854q = linearLayout;
            this.f48855r = i11;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
            AbstractC19074t.m100208f(view, C20218v.f100059b);
            C19055h0 c19055h0 = this.f48853p;
            int i11 = c19055h0.f94931p;
            c19055h0.f94931p = AbstractC32226c.m155409h(this.f48854q.getRootView());
            if (this.f48853p.f94931p != i11) {
                AbstractC19074t.m100205c(this.f48854q);
                LinearLayout linearLayout = this.f48854q;
                ViewGroup.LayoutParams layoutParams = linearLayout.getLayoutParams();
                if (layoutParams != null) {
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                    marginLayoutParams.topMargin = this.f48855r + this.f48853p.f94931p;
                    linearLayout.setLayoutParams(marginLayoutParams);
                    return;
                }
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            }
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            AbstractC19074t.m100208f(view, C20218v.f100059b);
        }
    }

    /* renamed from: com.zing.zalo.qrcode.ui.MyQRView$t */
    /* loaded from: classes4.dex */
    static final class C9205t extends AbstractC19075u implements InterfaceC18494a {
        C9205t() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC1756a1 mo12V4() {
            return MyQRView.this.m49038WM();
        }
    }

    /* renamed from: com.zing.zalo.qrcode.ui.MyQRView$u */
    /* loaded from: classes4.dex */
    static final class C9206u extends AbstractC19075u implements InterfaceC18494a {
        C9206u() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C1802w0.b mo12V4() {
            return new C26905b(MyQRView.this, null, 2, null);
        }
    }

    public MyQRView() {
        C9205t c9205t = new C9205t();
        this.f48795P0 = AbstractC17501r0.m93124a(this, AbstractC19061k0.m100169b(C26904a.class), new C9201p(c9205t), new C9206u());
        this.f48801V0 = true;
        this.f48808c1 = AbstractC3104p.m15650a(420.0f);
        this.f48809d1 = AbstractC3104p.m15650a(300.0f);
        this.f48810e1 = new HandlerC9193h(Looper.getMainLooper());
    }

    /* renamed from: LM */
    private final void m49027LM() {
        C30118x8 c30118x8 = this.f48799T0;
        if (c30118x8 == null) {
            AbstractC19074t.m100223u("binding");
            c30118x8 = null;
        }
        MyQRImageView myQRImageView = c30118x8.f139911B;
        AbstractC19074t.m100207e(myQRImageView, "qrCodeView");
        if (myQRImageView.getVisibility() == 0) {
            if (m49037VM().m138669U().m138682e().length() < 5) {
                ToastUtils.showMess(AbstractC23136l9.m118743r0(AbstractC8020f0.unknown_error));
                return;
            }
            try {
                C8009j.a aVar = new C8009j.a(this.f72421L0.m92648SI());
                aVar.m43172u(AbstractC23136l9.m118743r0(AbstractC8020f0.str_popup_change_qrcode)).m43159h(3).m43162k(AbstractC23136l9.m118743r0(AbstractC8020f0.qrcode_change_code_warning)).m43165n(AbstractC23136l9.m118743r0(AbstractC8020f0.str_button_confirm_no), new InterfaceC17463d.b()).m43170s(AbstractC23136l9.m118743r0(AbstractC8020f0.change), new InterfaceC17463d.d() { // from class: oy.c
                    @Override // com.zing.zalo.zview.dialog.InterfaceC17463d.d
                    /* renamed from: K8 */
                    public final void mo605K8(InterfaceC17463d interfaceC17463d, int i11) {
                        MyQRView.m49028MM(MyQRView.this, interfaceC17463d, i11);
                    }
                });
                C8009j m43152a = aVar.m43152a();
                this.f48796Q0 = m43152a;
                AbstractC19074t.m100205c(m43152a);
                m43152a.mo13822K();
                return;
            } catch (Exception e11) {
                e11.printStackTrace();
                return;
            }
        }
        ToastUtils.showMess(AbstractC23136l9.m118743r0(AbstractC8020f0.qrcode_not_loaded));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: MM */
    public static final void m49028MM(MyQRView myQRView, InterfaceC17463d interfaceC17463d, int i11) {
        AbstractC19074t.m100208f(myQRView, "this$0");
        if (interfaceC17463d != null) {
            interfaceC17463d.dismiss();
        }
        myQRView.m49034SM(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: NM */
    public final boolean m49029NM() {
        if (AbstractC23309i.m122498va()) {
            BuildersKt__Builders_commonKt.m112540d(CoroutineScopeKt.m112637a(Dispatchers.m112681c()), null, null, new C9187b(null), 3, null);
            return true;
        }
        BuildersKt__Builders_commonKt.m112540d(CoroutineScopeKt.m112637a(Dispatchers.m112681c()), null, null, new C9188c(null), 3, null);
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: OM */
    public final void m49030OM() {
        ContentResolver contentResolver;
        InterfaceC27218a m92676n2;
        Window window;
        try {
            if (this.f72421L0.m92648SI() == null) {
                return;
            }
            Context m92648SI = this.f72421L0.m92648SI();
            if (m92648SI != null) {
                contentResolver = m92648SI.getContentResolver();
            } else {
                contentResolver = null;
            }
            int i11 = Settings.System.getInt(contentResolver, "screen_brightness");
            this.f48807b1 = i11;
            if (i11 < 220 && (m92676n2 = this.f72421L0.m92676n2()) != null && (window = m92676n2.getWindow()) != null) {
                WindowManager.LayoutParams attributes = window.getAttributes();
                attributes.screenBrightness = 0.8627451f;
                window.setAttributes(attributes);
            }
        } catch (Exception e11) {
            AbstractC20110a.f98889a.mo104552e(e11);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: PM */
    public final void m49031PM() {
        InterfaceC27218a m92676n2;
        Window window;
        try {
            if (this.f72421L0.m92648SI() != null && (m92676n2 = this.f72421L0.m92676n2()) != null && (window = m92676n2.getWindow()) != null) {
                WindowManager.LayoutParams attributes = window.getAttributes();
                attributes.screenBrightness = -1.0f;
                window.setAttributes(attributes);
            }
        } catch (Exception e11) {
            AbstractC20110a.f98889a.mo104552e(e11);
        }
    }

    /* renamed from: QM */
    private final String m49032QM(boolean z11) {
        Bitmap bitmap;
        C3979l c3979l;
        Bitmap bitmap2;
        try {
            C3979l c3979l2 = this.f48802W0;
            if (c3979l2 != null) {
                Bitmap bitmap3 = null;
                if (c3979l2 != null) {
                    bitmap = c3979l2.m18839c();
                } else {
                    bitmap = null;
                }
                if (bitmap != null && (c3979l = this.f48802W0) != null) {
                    if (c3979l != null) {
                        bitmap2 = c3979l.m18839c();
                    } else {
                        bitmap2 = null;
                    }
                    if (bitmap2 != null) {
                        if (this.f48806a1) {
                            return "";
                        }
                        this.f48806a1 = true;
                        BuildersKt__Builders_commonKt.m112540d(CoroutineScopeKt.m112637a(Dispatchers.m112679a()), null, null, new C9189d(null), 3, null);
                        Context context = getContext();
                        AbstractC19074t.m100205c(context);
                        Object systemService = context.getSystemService("layout_inflater");
                        AbstractC19074t.m100206d(systemService, "null cannot be cast to non-null type android.view.LayoutInflater");
                        View inflate = ((LayoutInflater) systemService).inflate(AbstractC7409c0.card_my_qr, (ViewGroup) null);
                        AbstractC19074t.m100207e(inflate, "inflate(...)");
                        RecyclingImageView recyclingImageView = (RecyclingImageView) inflate.findViewById(AbstractC6918a0.qr_view);
                        RecyclingImageView recyclingImageView2 = (RecyclingImageView) inflate.findViewById(AbstractC6918a0.background);
                        RecyclingImageView recyclingImageView3 = (RecyclingImageView) inflate.findViewById(AbstractC6918a0.avatar_view);
                        RobotoTextView robotoTextView = (RobotoTextView) inflate.findViewById(AbstractC6918a0.tv_name);
                        ZAppCompatImageView zAppCompatImageView = (ZAppCompatImageView) inflate.findViewById(AbstractC6918a0.icVipStatus);
                        if (m49041aN() && m49037VM().m138669U().m138683f()) {
                            zAppCompatImageView.setImageResource(AbstractC16803z.ic_oa_verify);
                            zAppCompatImageView.setVisibility(0);
                        } else {
                            zAppCompatImageView.setVisibility(8);
                        }
                        if (m49041aN()) {
                            ((RobotoTextView) inflate.findViewById(AbstractC6918a0.tv_description)).setText(m92652XI(AbstractC8020f0.str_qr_oa_qr_download_subtitle));
                        }
                        robotoTextView.setText(m49037VM().m138669U().m138681d());
                        recyclingImageView3.setImageInfo(this.f48802W0);
                        recyclingImageView.setImageInfo(this.f48803X0);
                        C3979l c3979l3 = this.f48804Y0;
                        if (c3979l3 != null) {
                            if (c3979l3 != null) {
                                bitmap3 = c3979l3.m18839c();
                            }
                            if (bitmap3 != null) {
                                recyclingImageView2.setBackgroundColor(-1);
                                recyclingImageView2.setImageInfo(this.f48804Y0);
                            }
                        }
                        Bitmap m136241l = AbstractC26412d.Companion.m136241l(inflate);
                        if (z11) {
                            String absolutePath = new File(AbstractC20130d.m104905y(), m49036UM()).getAbsolutePath();
                            FileOutputStream fileOutputStream = new FileOutputStream(absolutePath);
                            m136241l.compress(Bitmap.CompressFormat.PNG, 100, fileOutputStream);
                            fileOutputStream.flush();
                            fileOutputStream.close();
                            AbstractC19074t.m100205c(absolutePath);
                            return absolutePath;
                        }
                        String path = AbstractC21943a.m114579c().getPath();
                        FileOutputStream fileOutputStream2 = new FileOutputStream(path);
                        m136241l.compress(Bitmap.CompressFormat.PNG, 100, fileOutputStream2);
                        fileOutputStream2.flush();
                        fileOutputStream2.close();
                        AbstractC19074t.m100205c(path);
                        return m49045fN(path);
                    }
                }
            }
            ToastUtils.showMess(AbstractC23136l9.m118743r0(AbstractC8020f0.unknown_error));
            return "";
        } catch (Exception e11) {
            e11.printStackTrace();
            this.f48806a1 = false;
            return "";
        }
    }

    /* renamed from: RM */
    static /* synthetic */ String m49033RM(MyQRView myQRView, boolean z11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z11 = false;
        }
        return myQRView.m49032QM(z11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: SM */
    public final Job m49034SM(boolean z11) {
        Job m112540d;
        m112540d = BuildersKt__Builders_commonKt.m112540d(CoroutineScopeKt.m112637a(Dispatchers.m112679a()), null, null, new C9190e(z11, null), 3, null);
        return m112540d;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:12:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:17:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /* renamed from: TM */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m49035TM(String str, Continuation continuation) {
        C9191f c9191f;
        Object m142578e;
        int i11;
        Object m130683c;
        if (continuation instanceof C9191f) {
            c9191f = (C9191f) continuation;
            int i12 = c9191f.f48824u;
            if ((i12 & Integer.MIN_VALUE) != 0) {
                c9191f.f48824u = i12 - Integer.MIN_VALUE;
                Object obj = c9191f.f48822s;
                m142578e = AbstractC28298d.m142578e();
                i11 = c9191f.f48824u;
                if (i11 == 0) {
                    if (i11 == 1) {
                        AbstractC24862s.m129228b(obj);
                        m130683c = ((C24861r) obj).m129226j();
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    AbstractC24862s.m129228b(obj);
                    ContactProfile m118050n = C23024b7.m118050n(C23024b7.f111993a, str, false, 2, null);
                    if (m118050n == null) {
                        C0766k c0766k = new C0766k();
                        C9192g c9192g = new C9192g(str);
                        c9191f.f48824u = 1;
                        m130683c = AbstractC25251g.m130683c(c0766k, c9192g, c9191f);
                        if (m130683c == m142578e) {
                            return m142578e;
                        }
                    } else {
                        return m118050n;
                    }
                }
                if (C24861r.m129223g(m130683c)) {
                    m130683c = null;
                }
                if (m130683c != null) {
                    return null;
                }
                return new ContactProfile((JSONObject) m130683c);
            }
        }
        c9191f = new C9191f(continuation);
        Object obj2 = c9191f.f48822s;
        m142578e = AbstractC28298d.m142578e();
        i11 = c9191f.f48824u;
        if (i11 == 0) {
        }
        if (C24861r.m129223g(m130683c)) {
        }
        if (m130683c != null) {
        }
    }

    /* renamed from: UM */
    private final String m49036UM() {
        return "IMG_" + AbstractC23352g.m122788d(m49037VM().m138669U().m138682e()) + ".jpg";
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: VM */
    public final C26904a m49037VM() {
        return (C26904a) this.f48795P0.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: WM */
    public final InterfaceC1756a1 m49038WM() {
        Bundle m92642L3 = m92642L3();
        if (m92642L3 != null && m92642L3.getInt("destination") == 2) {
            return this;
        }
        ZaloView m92650VI = m92650VI();
        if (m92650VI == null) {
            m92650VI = this;
        }
        AbstractC19074t.m100205c(m92650VI);
        return m92650VI;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: YM */
    public static final void m49039YM(MyQRView myQRView) {
        AbstractC19074t.m100208f(myQRView, "this$0");
        myQRView.m49034SM(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ZM */
    public final boolean m49040ZM() {
        Integer num = (Integer) m49037VM().m138670V().mo9215f();
        if (num != null && num.intValue() == 1) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: aN */
    public final boolean m49041aN() {
        Integer num = (Integer) m49037VM().m138670V().mo9215f();
        if (num != null && num.intValue() == 2) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: bN */
    public final Job m49042bN() {
        Job m112540d;
        m112540d = BuildersKt__Builders_commonKt.m112540d(CoroutineScopeKt.m112637a(Dispatchers.m112681c()), null, null, new C9194i(null), 3, null);
        return m112540d;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: cN */
    public final Job m49043cN() {
        Job m112540d;
        m112540d = BuildersKt__Builders_commonKt.m112540d(CoroutineScopeKt.m112637a(Dispatchers.m112681c()), null, null, new C9195j(null), 3, null);
        return m112540d;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: dN */
    public final Job m49044dN() {
        Job m112540d;
        m112540d = BuildersKt__Builders_commonKt.m112540d(CoroutineScopeKt.m112637a(Dispatchers.m112679a()), null, null, new C9196k(null), 3, null);
        return m112540d;
    }

    /* renamed from: fN */
    private final String m49045fN(String str) {
        String m118212k;
        try {
            if (TextUtils.isEmpty(str)) {
                m118212k = m49036UM();
            } else {
                m118212k = AbstractC23041d2.m118212k(str);
            }
            String m120304P = AbstractC23280z4.m120304P(str, m118212k, true, false, false, new SensitiveData("gallery_save_qr", "scan_qr", null, 4, null));
            BuildersKt__Builders_commonKt.m112540d(CoroutineScopeKt.m112637a(Dispatchers.m112681c()), null, null, new C9199n(m120304P, this, null), 3, null);
            if (m120304P == null) {
                return "";
            }
            return m120304P;
        } catch (Exception e11) {
            e11.printStackTrace();
            return "";
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: hN */
    public final Job m49048hN() {
        Job m112540d;
        m112540d = BuildersKt__Builders_commonKt.m112540d(CoroutineScopeKt.m112637a(Dispatchers.m112681c()), null, null, new C9200o(null), 3, null);
        return m112540d;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: jN */
    public static final void m49051jN(MyQRView myQRView, SimpleAdapter simpleAdapter, InterfaceC17463d interfaceC17463d, int i11) {
        AbstractC19074t.m100208f(myQRView, "this$0");
        AbstractC19074t.m100208f(simpleAdapter, "$adapter");
        C30118x8 c30118x8 = myQRView.f48799T0;
        C30118x8 c30118x82 = null;
        if (c30118x8 == null) {
            AbstractC19074t.m100223u("binding");
            c30118x8 = null;
        }
        LinearLayout linearLayout = c30118x8.f139921v;
        AbstractC19074t.m100207e(linearLayout, "circularLoading");
        AbstractC26423o.m136269c(linearLayout);
        if (interfaceC17463d != null) {
            interfaceC17463d.cancel();
        }
        Object item = simpleAdapter.getItem(i11);
        AbstractC19074t.m100206d(item, "null cannot be cast to non-null type java.util.HashMap<kotlin.String, kotlin.Any>{ kotlin.collections.TypeAliasesKt.HashMap<kotlin.String, kotlin.Any> }");
        Object obj = ((HashMap) item).get("id");
        AbstractC19074t.m100206d(obj, "null cannot be cast to non-null type kotlin.Int");
        int intValue = ((Integer) obj).intValue();
        if (intValue == AbstractC8020f0.forward_to_friend) {
            myQRView.m49071gN(0);
        } else if (intValue == AbstractC8020f0.str_optionM_shareVipAccOnTimeLine) {
            myQRView.m49071gN(1);
        }
        C30118x8 c30118x83 = myQRView.f48799T0;
        if (c30118x83 == null) {
            AbstractC19074t.m100223u("binding");
        } else {
            c30118x82 = c30118x83;
        }
        LinearLayout linearLayout2 = c30118x82.f139921v;
        AbstractC19074t.m100207e(linearLayout2, "circularLoading");
        AbstractC26423o.m136267a(linearLayout2);
    }

    /* renamed from: lN */
    private final void m49054lN() {
        C30118x8 c30118x8 = this.f48799T0;
        if (c30118x8 == null) {
            AbstractC19074t.m100223u("binding");
            c30118x8 = null;
        }
        LinearLayout linearLayout = c30118x8.f139924y;
        C19055h0 c19055h0 = new C19055h0();
        ViewGroup.LayoutParams layoutParams = linearLayout.getLayoutParams();
        AbstractC19074t.m100206d(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        int i11 = ((ViewGroup.MarginLayoutParams) layoutParams).topMargin;
        AbstractC19074t.m100205c(linearLayout);
        linearLayout.addOnAttachStateChangeListener(new ViewOnAttachStateChangeListenerC9204s(c19055h0, linearLayout, i11));
        if (AbstractC1579n0.m7862d0(linearLayout)) {
            int i12 = c19055h0.f94931p;
            int m155409h = AbstractC32226c.m155409h(linearLayout.getRootView());
            c19055h0.f94931p = m155409h;
            if (m155409h != i12) {
                ViewGroup.LayoutParams layoutParams2 = linearLayout.getLayoutParams();
                if (layoutParams2 != null) {
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams2;
                    marginLayoutParams.topMargin = i11 + c19055h0.f94931p;
                    linearLayout.setLayoutParams(marginLayoutParams);
                    return;
                }
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            }
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.p077ui.zviews.ZaloViewNewActionBar, com.zing.zalo.zview.ZaloView
    /* renamed from: CJ */
    public void mo37111CJ(Bundle bundle) {
        super.mo37111CJ(bundle);
        Bundle m92642L3 = m92642L3();
        if (m92642L3 != null && m92642L3.getInt("destination") == 2) {
            m49037VM().m138673Y(C9207a.Companion.m49097a(m92642L3()));
        }
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: FJ */
    public void mo37482FJ(ActionBarMenu actionBarMenu) {
        AbstractC19074t.m100208f(actionBarMenu, "menu");
        super.mo37482FJ(actionBarMenu);
        if (m49041aN()) {
            return;
        }
        actionBarMenu.m92750r();
        this.f48798S0 = m78951gL(AbstractC6918a0.menu_qrcode_more, AbstractC16803z.ic_qr_more_menu);
        if (AbstractC23309i.m122498va()) {
            ActionBarMenuItem actionBarMenuItem = this.f48798S0;
            AbstractC19074t.m100205c(actionBarMenuItem);
            actionBarMenuItem.m92774j(AbstractC23136l9.m118724l(m92689tK(), AbstractC6918a0.menu_qrcode_change, AbstractC8020f0.qrcode_change));
            ActionBarMenuItem actionBarMenuItem2 = this.f48798S0;
            AbstractC19074t.m100205c(actionBarMenuItem2);
            actionBarMenuItem2.m92774j(AbstractC23136l9.m118724l(m92689tK(), AbstractC6918a0.menu_qrcode_disable, AbstractC8020f0.str_setting_off_add_friend_qrcode));
            return;
        }
        ActionBarMenuItem actionBarMenuItem3 = this.f48798S0;
        AbstractC19074t.m100205c(actionBarMenuItem3);
        actionBarMenuItem3.m92774j(AbstractC23136l9.m118724l(m92689tK(), AbstractC6918a0.menu_qrcode_enable, AbstractC8020f0.str_setting_on_add_friend_qrcode));
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: GJ */
    public View mo37483GJ(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        AbstractC19074t.m100208f(layoutInflater, "inflater");
        C30118x8 m148693c = C30118x8.m148693c(layoutInflater, viewGroup, false);
        AbstractC19074t.m100207e(m148693c, "inflate(...)");
        this.f48799T0 = m148693c;
        m92637BK(true);
        m49069XM();
        m49073kN();
        C30118x8 c30118x8 = this.f48799T0;
        if (c30118x8 == null) {
            AbstractC19074t.m100223u("binding");
            c30118x8 = null;
        }
        RelativeLayout root = c30118x8.getRoot();
        AbstractC19074t.m100207e(root, "getRoot(...)");
        return root;
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: QJ */
    public boolean mo37491QJ(int i11) {
        if (i11 == 16908332) {
            if (m49041aN()) {
                finish();
            } else {
                C26904a.m138666S(m49037VM(), null, 1, null);
            }
            return true;
        }
        if (i11 == AbstractC6918a0.menu_qrcode_change) {
            m49027LM();
            return true;
        }
        if (i11 == AbstractC6918a0.menu_qrcode_disable || i11 == AbstractC6918a0.menu_qrcode_enable) {
            m49037VM().m138672X();
            return true;
        }
        return false;
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: RJ */
    public void mo13886RJ() {
        super.mo13886RJ();
        m49031PM();
    }

    @Override // com.zing.zalo.p077ui.zviews.SlidableZaloView, com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.zview.ZaloView
    /* renamed from: VJ */
    public void mo37712VJ() {
        super.mo37712VJ();
        this.f48801V0 = false;
    }

    /* renamed from: XM */
    public final void m49069XM() {
        this.f48800U0 = new C23528a(getContext());
        Context m92689tK = m92689tK();
        AbstractC19074t.m100207e(m92689tK, "requireContext(...)");
        this.f48805Z0 = new C3977j(m92689tK);
        C30118x8 c30118x8 = this.f48799T0;
        MultiStateView multiStateView = null;
        if (c30118x8 == null) {
            AbstractC19074t.m100223u("binding");
            c30118x8 = null;
        }
        c30118x8.f139914E.setBackButtonImage(AbstractC16803z.ic_close_qr_view);
        C30118x8 c30118x82 = this.f48799T0;
        if (c30118x82 == null) {
            AbstractC19074t.m100223u("binding");
            c30118x82 = null;
        }
        c30118x82.f139917r.setOnClickListener(this);
        C30118x8 c30118x83 = this.f48799T0;
        if (c30118x83 == null) {
            AbstractC19074t.m100223u("binding");
            c30118x83 = null;
        }
        c30118x83.f139919t.setOnClickListener(this);
        C30118x8 c30118x84 = this.f48799T0;
        if (c30118x84 == null) {
            AbstractC19074t.m100223u("binding");
            c30118x84 = null;
        }
        c30118x84.f139911B.setOnClickListener(this);
        C30118x8 c30118x85 = this.f48799T0;
        if (c30118x85 == null) {
            AbstractC19074t.m100223u("binding");
            c30118x85 = null;
        }
        c30118x85.f139918s.setOnClickListener(this);
        C30118x8 c30118x86 = this.f48799T0;
        if (c30118x86 == null) {
            AbstractC19074t.m100223u("binding");
            c30118x86 = null;
        }
        c30118x86.f139913D.setOnClickListener(this);
        C30118x8 c30118x87 = this.f48799T0;
        if (c30118x87 == null) {
            AbstractC19074t.m100223u("binding");
            c30118x87 = null;
        }
        LinearLayout linearLayout = c30118x87.f139921v;
        AbstractC19074t.m100207e(linearLayout, "circularLoading");
        AbstractC26423o.m136267a(linearLayout);
        C30118x8 c30118x88 = this.f48799T0;
        if (c30118x88 == null) {
            AbstractC19074t.m100223u("binding");
            c30118x88 = null;
        }
        View findViewById = c30118x88.getRoot().findViewById(AbstractC6918a0.multiState);
        AbstractC19074t.m100207e(findViewById, "findViewById(...)");
        MultiStateView multiStateView2 = (MultiStateView) findViewById;
        this.f48797R0 = multiStateView2;
        if (multiStateView2 == null) {
            AbstractC19074t.m100223u("stateView");
        } else {
            multiStateView = multiStateView2;
        }
        multiStateView.setOnTapToRetryListener(new MultiStateView.InterfaceC15916g() { // from class: oy.b
            @Override // com.zing.zalo.p077ui.zviews.multistate.MultiStateView.InterfaceC15916g
            /* renamed from: a */
            public final void mo12138a() {
                MyQRView.m49039YM(MyQRView.this);
            }
        });
        m49037VM().m138675a0(C26904a.a.f127309q);
        m49054lN();
    }

    /* renamed from: eN */
    public final Job m49070eN() {
        Job m112540d;
        m112540d = BuildersKt__Builders_commonKt.m112540d(CoroutineScopeKt.m112637a(Dispatchers.m112681c()), null, null, new C9197l(null), 3, null);
        return m112540d;
    }

    /* renamed from: gN */
    public final void m49071gN(int i11) {
        ArrayList<String> m131500h;
        try {
            String m49032QM = m49032QM(true);
            if (i11 != 0) {
                if (i11 == 1) {
                    Bundle bundle = new Bundle();
                    m131500h = AbstractC25368s.m131500h(m49032QM);
                    bundle.putStringArrayList("path", m131500h);
                    bundle.putBoolean("fromShareVia", true);
                    ZaloView m92650VI = m92650VI();
                    if (m92650VI == null) {
                        m92650VI = this;
                    }
                    C17487o0 m92662fJ = m92650VI.m92662fJ();
                    if (m92662fJ != null) {
                        m92662fJ.m93069k2(UpdateStatusView.class, bundle, 1, true);
                    }
                }
            } else {
                Bundle bundle2 = new Bundle();
                bundle2.putString("imagePathUri", m49032QM);
                bundle2.putBoolean("bol_share_in_app", true);
                bundle2.putBoolean("btn_extra_show_hide_post_feed", true);
                ZaloView m92650VI2 = m92650VI();
                if (m92650VI2 == null) {
                    m92650VI2 = this;
                }
                C17487o0 m92662fJ2 = m92650VI2.m92662fJ();
                if (m92662fJ2 != null) {
                    m92662fJ2.m93069k2(ShareView.class, bundle2, 1, true);
                }
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // ac.InterfaceC0733x
    public String getTrackingKey() {
        return "MyQRView";
    }

    /* renamed from: iN */
    public final void m49072iN() {
        try {
            ArrayList arrayList = new ArrayList();
            HashMap hashMap = new HashMap();
            hashMap.put("name", AbstractC23136l9.m118743r0(AbstractC8020f0.forward_to_friend));
            hashMap.put("id", Integer.valueOf(AbstractC8020f0.forward_to_friend));
            arrayList.add(hashMap);
            HashMap hashMap2 = new HashMap();
            hashMap2.put("name", AbstractC23136l9.m118743r0(AbstractC8020f0.str_optionM_shareVipAccOnTimeLine));
            hashMap2.put("id", Integer.valueOf(AbstractC8020f0.str_optionM_shareVipAccOnTimeLine));
            arrayList.add(hashMap2);
            if (!arrayList.isEmpty()) {
                final SimpleAdapter simpleAdapter = new SimpleAdapter(this.f72421L0.m92648SI(), arrayList, AbstractC7409c0.active_passcode_time_menu_item, new String[]{"name"}, new int[]{AbstractC6918a0.tv_active_time_passcode});
                C8009j.a aVar = new C8009j.a(this.f72421L0.m92648SI());
                aVar.m43172u(AbstractC23136l9.m118743r0(AbstractC8020f0.qrcode_share));
                aVar.m43173v(100);
                aVar.m43155d(true);
                aVar.m43153b(simpleAdapter, new InterfaceC17463d.d() { // from class: oy.a
                    @Override // com.zing.zalo.zview.dialog.InterfaceC17463d.d
                    /* renamed from: K8 */
                    public final void mo605K8(InterfaceC17463d interfaceC17463d, int i11) {
                        MyQRView.m49051jN(MyQRView.this, simpleAdapter, interfaceC17463d, i11);
                    }
                });
                C8009j m43152a = aVar.m43152a();
                this.f48796Q0 = m43152a;
                if (m43152a != null) {
                    AbstractC19074t.m100205c(m43152a);
                    if (!m43152a.m92868m()) {
                        C8009j c8009j = this.f48796Q0;
                        AbstractC19074t.m100205c(c8009j);
                        c8009j.mo13822K();
                    }
                }
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: kN */
    public final void m49073kN() {
        m49037VM().m138668T().m9219j(this, new C9198m(new C9202q()));
        m49037VM().m138670V().m9219j(this, new C9198m(new C9203r()));
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        Integer num;
        if (view != null) {
            num = Integer.valueOf(view.getId());
        } else {
            num = null;
        }
        int i11 = AbstractC6918a0.btnDownload;
        if (num != null && num.intValue() == i11) {
            if (!AbstractC23034c6.m118118E()) {
                AbstractC23034c6.m118186w0(m92692wK(), AbstractC23034c6.f112029f, 151);
                return;
            } else {
                m49033RM(this, false, 1, null);
                return;
            }
        }
        int i12 = AbstractC6918a0.btnShare;
        if (num == null || num.intValue() != i12) {
            int i13 = AbstractC6918a0.qr_code_view;
            if (num == null || num.intValue() != i13) {
                int i14 = AbstractC6918a0.close;
                if (num != null && num.intValue() == i14) {
                    C26904a.m138666S(m49037VM(), null, 1, null);
                    return;
                }
                int i15 = AbstractC6918a0.btn_enable;
                if (num != null && num.intValue() == i15) {
                    m49037VM().m138672X();
                    return;
                }
                int i16 = AbstractC6918a0.tv_scan_qrcode;
                if (num != null && num.intValue() == i16) {
                    m49037VM().m138676b0(0);
                    return;
                }
                return;
            }
        }
        if (!m49037VM().m138671W()) {
            return;
        }
        m49072iN();
    }

    @Override // com.zing.zalo.zview.ZaloView
    public void onRequestPermissionsResult(int i11, String[] strArr, int[] iArr) {
        AbstractC19074t.m100208f(strArr, "permissions");
        AbstractC19074t.m100208f(iArr, "grantResults");
        super.onRequestPermissionsResult(i11, strArr, iArr);
        if (i11 == 151 && AbstractC23034c6.m118121G()) {
            m49033RM(this, false, 1, null);
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.ZaloViewNewActionBar, com.zing.zalo.zview.ZaloView
    public void onResume() {
        super.onResume();
        if (m49040ZM()) {
            m49044dN();
        }
        this.f72421L0.invalidateOptionsMenu();
        m49030OM();
    }
}
