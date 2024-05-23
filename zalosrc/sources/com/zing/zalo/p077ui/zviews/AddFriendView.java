package com.zing.zalo.p077ui.zviews;

import ac.C0732w;
import ae.C0766k;
import am.AbstractC0924m0;
import android.content.Context;
import android.content.Intent;
import android.database.ContentObserver;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.provider.MediaStore;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.core.graphics.drawable.AbstractC1414a;
import au.AbstractC2379w;
import bi0.AbstractC2808b;
import bi0.AbstractC2814h;
import com.androidquery.util.C3979l;
import com.androidquery.util.InterfaceC3968a;
import com.zing.zalo.AbstractC16801x;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.MainApplication;
import com.zing.zalo.SensitiveData;
import com.zing.zalo.control.ContactProfile;
import com.zing.zalo.control.TrackingSource;
import com.zing.zalo.dialog.C8009j;
import com.zing.zalo.p062db.C7960e;
import com.zing.zalo.p077ui.settings.widget.ListItemSetting;
import com.zing.zalo.p077ui.widget.RobotoTextView;
import com.zing.zalo.p077ui.widget.edittext.PhoneInputCustom;
import com.zing.zalo.p077ui.zviews.AddFriendView;
import com.zing.zalo.p077ui.zviews.multistate.MultiStateView;
import com.zing.zalo.utils.ToastUtils;
import com.zing.zalo.utils.phonenumbers.C16741a;
import com.zing.zalo.zdesign.component.Button;
import com.zing.zalo.zdesign.component.C16972e0;
import com.zing.zalo.zdesign.component.TrackingFrameLayout;
import com.zing.zalo.zdesign.component.header.ZdsActionBar;
import com.zing.zalo.zmedia.player.IMediaPlayer;
import com.zing.zalo.zmedia.player.ZMediaPlayer;
import com.zing.zalo.zview.C17487o0;
import com.zing.zalo.zview.dialog.InterfaceC17463d;
import com.zing.zalo.zview.dialog.KeyEventCallbackC17462c;
import com.zing.zalocore.CoreUtility;
import en0.InterfaceC18494a;
import en0.InterfaceC18509p;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import gg0.AbstractC19444a;
import hm0.C20096c;
import hm0.InterfaceC20094a;
import ho0.AbstractC20110a;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import me0.AbstractC23009a3;
import me0.AbstractC23034c6;
import me0.AbstractC23041d2;
import me0.AbstractC23136l9;
import me0.AbstractC23152n3;
import me0.AbstractC23254w8;
import me0.AbstractC23280z4;
import me0.C23024b7;
import me0.C23055e5;
import me0.C23212s8;
import me0.C23278z2;
import mj0.AbstractC23322a;
import mm0.AbstractC23352g;
import my.C23484g;
import on0.AbstractC24341v;
import org.json.JSONObject;
import p173fz.C19172a;
import p262jb.AbstractC21196a;
import p304ks.AbstractC21935u;
import p304ks.C21927m;
import p306ku.AbstractC21943a;
import p348mi.AbstractC23304d;
import p348mi.AbstractC23309i;
import p354n3.C23528a;
import p361nb.AbstractC23647d;
import p363nh.C23744a;
import p379o3.C23995f;
import p379o3.C23999j;
import p542ub.InterfaceC27218a;
import p588vw.C28647m;
import p588vw.C28655u;
import p649xl.C29773e;
import p716zh.C31991k8;
import p716zh.C32002l4;
import pm0.AbstractC24862s;
import pm0.C24848g0;
import qm0.AbstractC25332a0;
import qm0.AbstractC25368s;
import sy.AbstractC26412d;
import vg.AbstractC28207v1;
import vm0.AbstractC28298d;
import wm0.AbstractC29104l;

/* loaded from: classes6.dex */
public final class AddFriendView extends SlidableZaloView implements C23744a.c {
    public static final C14026a Companion = new C14026a(null);

    /* renamed from: Q0 */
    public C29773e f72116Q0;

    /* renamed from: S0 */
    private C23528a f72118S0;

    /* renamed from: T0 */
    private long f72119T0;

    /* renamed from: U0 */
    private boolean f72120U0;

    /* renamed from: W0 */
    public ContentObserver f72122W0;

    /* renamed from: a1 */
    private long f72126a1;

    /* renamed from: c1 */
    private boolean f72128c1;

    /* renamed from: P0 */
    private final int f72115P0 = 1001;

    /* renamed from: R0 */
    private C23484g f72117R0 = new C23484g();

    /* renamed from: V0 */
    private String f72121V0 = "";

    /* renamed from: X0 */
    private final int f72123X0 = 1;

    /* renamed from: Y0 */
    private final int f72124Y0 = 2;

    /* renamed from: Z0 */
    private String f72125Z0 = "";

    /* renamed from: b1 */
    private String f72127b1 = "";

    /* renamed from: com.zing.zalo.ui.zviews.AddFriendView$a */
    /* loaded from: classes6.dex */
    public static final class C14026a {
        private C14026a() {
        }

        public /* synthetic */ C14026a(AbstractC19060k abstractC19060k) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: d */
        public static final void m78062d(InterfaceC17463d interfaceC17463d, int i11) {
            AbstractC19074t.m100208f(interfaceC17463d, "dialog");
            interfaceC17463d.dismiss();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: e */
        public static final void m78063e(InterfaceC18494a interfaceC18494a, InterfaceC17463d interfaceC17463d) {
            AbstractC19074t.m100208f(interfaceC18494a, "$onDismiss");
            interfaceC18494a.mo12V4();
        }

        /* renamed from: c */
        public final KeyEventCallbackC17462c m78064c(Context context, String str, final InterfaceC18494a interfaceC18494a) {
            AbstractC19074t.m100208f(context, "context");
            AbstractC19074t.m100208f(interfaceC18494a, "onDismiss");
            if (str != null && str.length() != 0) {
                Button button = new Button(context);
                button.m90539c(AbstractC2814h.ButtonMedium_Tertiary);
                button.setText(AbstractC8020f0.str_search_limit_got_it);
                Drawable m118663M = AbstractC23136l9.m118663M(AbstractC23322a.zds_ic_warning_solid_24);
                ImageView imageView = new ImageView(context);
                FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(AbstractC23136l9.m118712h(context, 40.0f), AbstractC23136l9.m118712h(context, 40.0f));
                layoutParams.setMargins(AbstractC23136l9.m118712h(context, 24.0f), AbstractC23136l9.m118712h(context, 24.0f), 0, 0);
                imageView.setLayoutParams(layoutParams);
                if (m118663M != null) {
                    AbstractC1414a.m7196n(m118663M, context.getResources().getColor(AbstractC16801x.yellow_warning_color));
                    imageView.setImageDrawable(m118663M);
                }
                C16972e0.a aVar = new C16972e0.a(context);
                C16972e0.a m90932i = aVar.m90932i(C16972e0.b.DIALOG_INFORMATION);
                String m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_you_have_searched_too_many_times);
                AbstractC19074t.m100207e(m118743r0, "getString(...)");
                C16972e0.a m90949z = m90932i.m90918B(m118743r0).m90920D(imageView).m90949z(str);
                String m118743r02 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_search_limit_got_it);
                AbstractC19074t.m100207e(m118743r02, "getString(...)");
                m90949z.m90943t(m118743r02, new InterfaceC17463d.d() { // from class: com.zing.zalo.ui.zviews.a0
                    @Override // com.zing.zalo.zview.dialog.InterfaceC17463d.d
                    /* renamed from: K8 */
                    public final void mo605K8(InterfaceC17463d interfaceC17463d, int i11) {
                        AddFriendView.C14026a.m78062d(interfaceC17463d, i11);
                    }
                });
                C16972e0 m90927d = aVar.m90927d();
                m90927d.m92855F(new InterfaceC17463d.e() { // from class: com.zing.zalo.ui.zviews.b0
                    @Override // com.zing.zalo.zview.dialog.InterfaceC17463d.e
                    /* renamed from: Tv */
                    public final void mo12457Tv(InterfaceC17463d interfaceC17463d) {
                        AddFriendView.C14026a.m78063e(InterfaceC18494a.this, interfaceC17463d);
                    }
                });
                return m90927d;
            }
            return null;
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.AddFriendView$b */
    /* loaded from: classes6.dex */
    public static final class C14027b implements InterfaceC20094a {
        C14027b() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: e */
        public static final void m78067e(AddFriendView addFriendView) {
            AbstractC19074t.m100208f(addFriendView, "this$0");
            addFriendView.m78047NM();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: f */
        public static final void m78068f(AddFriendView addFriendView) {
            AbstractC19074t.m100208f(addFriendView, "this$0");
            addFriendView.m78056uM().f137617x.setVisibility(4);
            addFriendView.m78056uM().f137605A.setVisibility(0);
            addFriendView.m78056uM().f137605A.setState(MultiStateView.EnumC15914e.ERROR);
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
            AbstractC19074t.m100208f(c20096c, ZMediaPlayer.OnNativeInvokeListener.ARG_ERROR);
            final AddFriendView addFriendView = AddFriendView.this;
            addFriendView.mo70710wy(new Runnable() { // from class: com.zing.zalo.ui.zviews.d0
                @Override // java.lang.Runnable
                public final void run() {
                    AddFriendView.C14027b.m78068f(AddFriendView.this);
                }
            });
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            AbstractC19074t.m100208f(obj, "entity");
            try {
                JSONObject optJSONObject = ((JSONObject) obj).optJSONObject("data");
                if (optJSONObject != null) {
                    final AddFriendView addFriendView = AddFriendView.this;
                    addFriendView.m78057xM().m123277g(optJSONObject);
                    if (addFriendView.m78017BM()) {
                        AbstractC0924m0.m3900ie(optJSONObject.toString());
                    }
                    addFriendView.mo70710wy(new Runnable() { // from class: com.zing.zalo.ui.zviews.c0
                        @Override // java.lang.Runnable
                        public final void run() {
                            AddFriendView.C14027b.m78067e(AddFriendView.this);
                        }
                    });
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.AddFriendView$c */
    /* loaded from: classes6.dex */
    public static final class C14028c extends ContentObserver {
        C14028c(Handler handler) {
            super(handler);
        }

        @Override // android.database.ContentObserver
        public void onChange(boolean z11, Uri uri) {
            String m119855c;
            try {
                super.onChange(z11, uri);
                if (uri != null && (m119855c = AbstractC23254w8.m119855c(AddFriendView.this.getContext(), uri)) != null && AbstractC23009a3.m117960k(m119855c)) {
                    C0732w.m1177r(C0732w.Companion.m1189a(), "add_friend_screenshot", null, null, null, 14, null);
                }
            } catch (Exception e11) {
                AbstractC20110a.f98889a.mo104552e(e11);
            }
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.AddFriendView$d */
    /* loaded from: classes6.dex */
    static final class C14029d extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final C14029d f72131q = new C14029d();

        C14029d() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: V4 */
        public /* bridge */ /* synthetic */ Object mo12V4() {
            m78069a();
            return C24848g0.f119245a;
        }

        /* renamed from: a */
        public final void m78069a() {
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.AddFriendView$e */
    /* loaded from: classes6.dex */
    public static final class ViewOnKeyListenerC14030e implements View.OnKeyListener {
        ViewOnKeyListenerC14030e() {
        }

        @Override // android.view.View.OnKeyListener
        public boolean onKey(View view, int i11, KeyEvent keyEvent) {
            AbstractC19074t.m100208f(keyEvent, "event");
            if (keyEvent.getAction() == 0 && i11 == 66) {
                AddFriendView.this.m78059zM();
                return true;
            }
            return false;
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.AddFriendView$f */
    /* loaded from: classes6.dex */
    public static final class C14031f extends C23999j {
        C14031f() {
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
                        AddFriendView.this.m78056uM().f137618y.setImageInfo(c3979l);
                        AddFriendView.this.m78056uM().f137605A.setVisibility(8);
                        AddFriendView.this.m78056uM().f137617x.setVisibility(0);
                        return;
                    }
                } catch (Exception e11) {
                    e11.printStackTrace();
                }
            }
            AddFriendView.this.m78056uM().f137605A.setVisibility(0);
            AddFriendView.this.m78056uM().f137617x.setVisibility(4);
            AddFriendView.this.m78056uM().f137605A.setState(MultiStateView.EnumC15914e.ERROR);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.zviews.AddFriendView$g */
    /* loaded from: classes6.dex */
    public static final class C14032g extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        int f72134t;

        /* renamed from: u */
        final /* synthetic */ String f72135u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C14032g(String str, Continuation continuation) {
            super(2, continuation);
            this.f72135u = str;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            return new C14032g(this.f72135u, continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            AbstractC28298d.m142578e();
            if (this.f72134t == 0) {
                AbstractC24862s.m129228b(obj);
                if (!TextUtils.isEmpty(this.f72135u)) {
                    ToastUtils.showMess(AbstractC23136l9.m118743r0(AbstractC8020f0.str_title_popup_save_qrcode));
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
            return ((C14032g) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.AddFriendView$h */
    /* loaded from: classes6.dex */
    public static final class C14033h implements InterfaceC20094a {

        /* renamed from: b */
        final /* synthetic */ String f72137b;

        C14033h(String str) {
            this.f72137b = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: f */
        public static final void m78074f(String str, AddFriendView addFriendView, String str2) {
            boolean m127126v;
            AbstractC19074t.m100208f(addFriendView, "this$0");
            AbstractC19074t.m100208f(str2, "$strSearch");
            AbstractC19074t.m100205c(str);
            if (str.length() > 0) {
                m127126v = AbstractC24341v.m127126v(str, "null", true);
                if (!m127126v) {
                    addFriendView.m78046C();
                    C32002l4 m154287a = C32002l4.Companion.m154287a(2);
                    if (AbstractC19074t.m100204b(str, CoreUtility.f89233i)) {
                        Bundle bundle = new Bundle();
                        bundle.putBoolean("fromChat", false);
                        bundle.putString("extra_entry_point_flow", m154287a.m154277l());
                        C17487o0 m92662fJ = addFriendView.m92662fJ();
                        if (m92662fJ != null) {
                            m92662fJ.m93069k2(MyInfoView.class, bundle, 1, true);
                            return;
                        }
                        return;
                    }
                    TrackingSource trackingSource = new TrackingSource(40);
                    trackingSource.m40677a("sourceView", 16);
                    C21927m.m114302u().m114330e0(str, trackingSource);
                    C31991k8 c31991k8 = new C31991k8(str, false, m154287a);
                    c31991k8.f147212h = str2;
                    AbstractC23152n3.m119060o0(addFriendView.m92662fJ(), c31991k8, 0, 1);
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Removed duplicated region for block: B:19:0x0095 A[Catch: all -> 0x0035, Exception -> 0x0038, TryCatch #2 {Exception -> 0x0038, blocks: (B:3:0x000b, B:15:0x002b, B:17:0x008c, B:19:0x0095, B:23:0x00a1, B:25:0x00a7, B:26:0x003b, B:27:0x0042, B:28:0x0049, B:36:0x0069, B:37:0x006e, B:38:0x0075, B:39:0x0085), top: B:2:0x000b, outer: #0 }] */
        /* JADX WARN: Removed duplicated region for block: B:23:0x00a1 A[Catch: all -> 0x0035, Exception -> 0x0038, TryCatch #2 {Exception -> 0x0038, blocks: (B:3:0x000b, B:15:0x002b, B:17:0x008c, B:19:0x0095, B:23:0x00a1, B:25:0x00a7, B:26:0x003b, B:27:0x0042, B:28:0x0049, B:36:0x0069, B:37:0x006e, B:38:0x0075, B:39:0x0085), top: B:2:0x000b, outer: #0 }] */
        /* renamed from: g */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public static final void m78075g(final AddFriendView addFriendView, C20096c c20096c) {
            int m104491c;
            String str;
            String m118743r0;
            String str2;
            AbstractC19074t.m100208f(addFriendView, "this$0");
            AbstractC19074t.m100208f(c20096c, "$errorMessage");
            try {
                try {
                    addFriendView.mo49315c4();
                    m104491c = c20096c.m104491c();
                    str = "";
                } catch (Exception e11) {
                    e11.printStackTrace();
                }
                if (m104491c != 102) {
                    if (m104491c != 111) {
                        if (m104491c != 515) {
                            if (m104491c != 1001) {
                                if (m104491c != 2027) {
                                    switch (m104491c) {
                                        case 1010:
                                            m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_search_global_search_phone_error_1);
                                            break;
                                        case 1011:
                                        case 1012:
                                            m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_search_global_search_phone_error_2_desc);
                                            break;
                                        default:
                                            m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.error_message);
                                            break;
                                    }
                                } else {
                                    m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.TOO_MANY_REQUEST_MSG);
                                }
                            } else {
                                try {
                                } catch (Exception e12) {
                                    e12.printStackTrace();
                                }
                                if (!TextUtils.isEmpty(c20096c.m104490b())) {
                                    str2 = C23024b7.m118048i(new JSONObject(c20096c.m104490b()));
                                    AbstractC19074t.m100205c(str);
                                    if (!TextUtils.isEmpty(str2)) {
                                        addFriendView.m78051SM(str2);
                                        AbstractC19444a.m101695c(new Runnable() { // from class: com.zing.zalo.ui.zviews.g0
                                            @Override // java.lang.Runnable
                                            public final void run() {
                                                AddFriendView.C14033h.m78076h(AddFriendView.this);
                                            }
                                        });
                                    } else if (!TextUtils.isEmpty(str)) {
                                        ToastUtils.showMess(str);
                                    }
                                    addFriendView.m78053UM(false);
                                }
                                str2 = "";
                                AbstractC19074t.m100205c(str);
                                if (!TextUtils.isEmpty(str2)) {
                                }
                                addFriendView.m78053UM(false);
                            }
                        } else {
                            m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.WRONG_DATE_TIME_MSG);
                        }
                    } else {
                        m118743r0 = AbstractC23136l9.m118746s0(AbstractC8020f0.str_missparam, 111);
                    }
                } else {
                    m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_search_error_login);
                }
                str = m118743r0;
                str2 = "";
                AbstractC19074t.m100205c(str);
                if (!TextUtils.isEmpty(str2)) {
                }
                addFriendView.m78053UM(false);
            } catch (Throwable th2) {
                addFriendView.m78053UM(false);
                throw th2;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: h */
        public static final void m78076h(AddFriendView addFriendView) {
            AbstractC19074t.m100208f(addFriendView, "this$0");
            addFriendView.showDialog(addFriendView.f72124Y0);
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(final C20096c c20096c) {
            AbstractC19074t.m100208f(c20096c, "errorMessage");
            final AddFriendView addFriendView = AddFriendView.this;
            addFriendView.mo78955kl(new Runnable() { // from class: com.zing.zalo.ui.zviews.f0
                @Override // java.lang.Runnable
                public final void run() {
                    AddFriendView.C14033h.m78075g(AddFriendView.this, c20096c);
                }
            }, 500L);
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            JSONObject jSONObject;
            final String string;
            boolean m127126v;
            AbstractC19074t.m100208f(obj, "entity");
            try {
                try {
                    AddFriendView.this.mo78960q3();
                    JSONObject jSONObject2 = (JSONObject) obj;
                    if (jSONObject2.isNull("data")) {
                        jSONObject = null;
                    } else {
                        jSONObject = new JSONObject(jSONObject2.getString("data"));
                    }
                    if (jSONObject != null) {
                        if (jSONObject.isNull("uid")) {
                            string = "";
                        } else {
                            string = jSONObject.getString("uid");
                        }
                        ContactProfile contactProfile = new ContactProfile(jSONObject);
                        try {
                            if (C7960e.m41971c6() != null) {
                                AbstractC19074t.m100205c(string);
                                if (string.length() > 0) {
                                    m127126v = AbstractC24341v.m127126v(string, "null", true);
                                    if (!m127126v) {
                                        C7960e.m41971c6().m42221O7(contactProfile, AbstractC21935u.m114558y(string));
                                    }
                                }
                            }
                        } catch (Exception e11) {
                            e11.printStackTrace();
                        }
                        final AddFriendView addFriendView = AddFriendView.this;
                        final String str = this.f72137b;
                        addFriendView.mo70710wy(new Runnable() { // from class: com.zing.zalo.ui.zviews.e0
                            @Override // java.lang.Runnable
                            public final void run() {
                                AddFriendView.C14033h.m78074f(string, addFriendView, str);
                            }
                        });
                    }
                } catch (Throwable th2) {
                    AddFriendView.this.m78053UM(false);
                    throw th2;
                }
            } catch (Exception e12) {
                e12.printStackTrace();
                ToastUtils.showMess(AbstractC23136l9.m118743r0(AbstractC8020f0.str_contentDlg4));
            }
            AddFriendView.this.m78053UM(false);
        }
    }

    /* renamed from: AM */
    private final void m78016AM() {
        try {
            m78052TM(new C14028c(this.f72827B0));
        } catch (Exception e11) {
            AbstractC20110a.f98889a.mo104552e(e11);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: BM */
    public final boolean m78017BM() {
        if (C19172a.m100600k("friend_new_finding_ui@use_qr_cache", 0) != 1) {
            return false;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: CM */
    public static final void m78018CM(InterfaceC17463d interfaceC17463d, int i11) {
        if (interfaceC17463d != null) {
            interfaceC17463d.dismiss();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: DM */
    public static final void m78019DM(AddFriendView addFriendView, View view) {
        AbstractC19074t.m100208f(addFriendView, "this$0");
        addFriendView.m78046C();
        AbstractC23647d.m123897g("3602");
        AbstractC26412d.Companion.m136233E(addFriendView.m92676n2(), null, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: EM */
    public static final void m78020EM(AddFriendView addFriendView, View view) {
        AbstractC19074t.m100208f(addFriendView, "this$0");
        AbstractC23647d.m123897g("5801176");
        Bundle bundle = new Bundle();
        bundle.putBoolean("EXTRA_DISCARD", true);
        C17487o0 m92662fJ = addFriendView.m92662fJ();
        if (m92662fJ != null) {
            m92662fJ.m93066i2(CountryListView.class, bundle, addFriendView.f72115P0, 1, true);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: FM */
    public static final boolean m78021FM(AddFriendView addFriendView, View view, MotionEvent motionEvent) {
        AbstractC19074t.m100208f(addFriendView, "this$0");
        addFriendView.f72119T0 = System.currentTimeMillis() + IMediaPlayer.MEDIA_INFO_BAD_INTERLEAVING;
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: GM */
    public static final void m78022GM(AddFriendView addFriendView, View view) {
        String m123271a;
        AbstractC19074t.m100208f(addFriendView, "this$0");
        addFriendView.m78046C();
        if (!addFriendView.m78017BM()) {
            addFriendView.f72120U0 = true;
        }
        String m123272b = addFriendView.f72117R0.m123272b();
        if (m123272b != null && m123272b.length() != 0) {
            try {
                JSONObject jSONObject = new JSONObject(addFriendView.f72117R0.m123271a());
                jSONObject.put("sourceOpen", 1400);
                m123271a = jSONObject.toString();
            } catch (Exception unused) {
                m123271a = addFriendView.f72117R0.m123271a();
            }
            AbstractC28207v1.m141994i3(addFriendView.f72117R0.m123272b(), 4, addFriendView.m92676n2(), addFriendView, m123271a, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: HM */
    public static final void m78023HM(AddFriendView addFriendView) {
        AbstractC19074t.m100208f(addFriendView, "this$0");
        addFriendView.m78046C();
        addFriendView.m78044vM();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: IM */
    public static final void m78024IM(AddFriendView addFriendView, View view, int i11, int i12, int i13, int i14) {
        AbstractC19074t.m100208f(addFriendView, "this$0");
        if (System.currentTimeMillis() > addFriendView.f72119T0) {
            addFriendView.m78046C();
            addFriendView.f72119T0 = System.currentTimeMillis() + 300;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: JM */
    public static final void m78025JM(AddFriendView addFriendView, View view) {
        AbstractC19074t.m100208f(addFriendView, "this$0");
        addFriendView.m78046C();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: KM */
    public static final void m78026KM(AddFriendView addFriendView, View view) {
        AbstractC19074t.m100208f(addFriendView, "this$0");
        addFriendView.m78046C();
        C17487o0 m92662fJ = addFriendView.m92662fJ();
        if (m92662fJ != null) {
            m92662fJ.m93069k2(ListContactNativeView.class, null, 1, true);
        }
        AbstractC23647d.m123897g("3000201");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: LM */
    public static final void m78027LM(AddFriendView addFriendView, View view) {
        AbstractC19074t.m100208f(addFriendView, "this$0");
        addFriendView.m78046C();
        AbstractC23647d.m123897g("5801180");
        if (AbstractC23309i.m121344Qf()) {
            C17487o0 m92662fJ = addFriendView.m92662fJ();
            if (m92662fJ != null) {
                m92662fJ.m93069k2(PeopleYouMayKnowView.class, null, 1, true);
                return;
            }
            return;
        }
        C17487o0 m92662fJ2 = addFriendView.m92662fJ();
        if (m92662fJ2 != null) {
            m92662fJ2.m93069k2(IntroPeopleYouMayKnowView.class, null, 1, true);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: MM */
    public static final void m78028MM(AddFriendView addFriendView, View view) {
        AbstractC19074t.m100208f(addFriendView, "this$0");
        addFriendView.m78059zM();
    }

    /* renamed from: OM */
    private final void m78029OM(String str) {
        String m118212k;
        try {
            if (TextUtils.isEmpty(str)) {
                m118212k = m78045wM();
            } else {
                m118212k = AbstractC23041d2.m118212k(str);
            }
            BuildersKt__Builders_commonKt.m112540d(CoroutineScopeKt.m112637a(Dispatchers.m112681c()), null, null, new C14032g(AbstractC23280z4.m120304P(str, m118212k, true, false, false, new SensitiveData("gallery_save_qr", "scan_qr", null, 4, null)), null), 3, null);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: tM */
    private final void m78043tM() {
        String m2891A = AbstractC0924m0.m2891A();
        if (m2891A != null && m2891A.length() != 0) {
            if (m78017BM()) {
                this.f72117R0.m123277g(new JSONObject(m2891A));
                if (this.f72117R0.m123275e().length() > 0) {
                    m78047NM();
                    return;
                } else {
                    m78044vM();
                    return;
                }
            }
            AbstractC0924m0.m3900ie("");
            return;
        }
        m78044vM();
    }

    /* renamed from: vM */
    private final void m78044vM() {
        C0766k c0766k = new C0766k();
        c0766k.mo1704o8(new C14027b());
        c0766k.mo1719q7();
    }

    /* renamed from: wM */
    private final String m78045wM() {
        return "IMG_" + AbstractC23352g.m122788d(this.f72117R0.m123275e()) + ".jpg";
    }

    /* renamed from: C */
    public final void m78046C() {
        try {
            AbstractC2379w.m12430d(m78056uM().f137613t.getEditText());
            m78056uM().f137613t.getEditText().clearFocus();
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: DJ */
    public KeyEventCallbackC17462c mo39014DJ(int i11) {
        if (i11 == this.f72123X0) {
            C8009j.a aVar = new C8009j.a(m92648SI());
            aVar.m43172u(AbstractC23136l9.m118743r0(AbstractC8020f0.str_titleDlg9)).m43162k(this.f72127b1).m43165n(AbstractC23136l9.m118743r0(AbstractC8020f0.str_close), new InterfaceC17463d.d() { // from class: com.zing.zalo.ui.zviews.r
                @Override // com.zing.zalo.zview.dialog.InterfaceC17463d.d
                /* renamed from: K8 */
                public final void mo605K8(InterfaceC17463d interfaceC17463d, int i12) {
                    AddFriendView.m78018CM(interfaceC17463d, i12);
                }
            });
            return aVar.m43152a();
        }
        if (i11 == this.f72124Y0) {
            C14026a c14026a = Companion;
            Context m92686rK = m92686rK();
            AbstractC19074t.m100207e(m92686rK, "requireActivity(...)");
            return c14026a.m78064c(m92686rK, this.f72121V0, C14029d.f72131q);
        }
        return null;
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: GJ */
    public View mo37483GJ(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        ArrayList m131500h;
        int[] m131184L0;
        AbstractC19074t.m100208f(layoutInflater, "inflater");
        this.f72118S0 = new C23528a(getContext());
        C29773e m147874c = C29773e.m147874c(layoutInflater, viewGroup, false);
        AbstractC19074t.m100207e(m147874c, "inflate(...)");
        m78050RM(m147874c);
        C23744a.Companion.m124119a().m124115b(this, 6065);
        ListItemSetting listItemSetting = m78056uM().f137615v;
        listItemSetting.setIdTracking("add_friend_scan_qr");
        AbstractC19074t.m100205c(listItemSetting);
        ListItemSetting.m74603F(listItemSetting, AbstractC23322a.zds_ic_qr_scan_line_24, null, AbstractC2808b.f150822b70, 2, null);
        listItemSetting.m90592m(false);
        listItemSetting.setOnClickListener(new View.OnClickListener() { // from class: com.zing.zalo.ui.zviews.s
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                AddFriendView.m78019DM(AddFriendView.this, view);
            }
        });
        ListItemSetting listItemSetting2 = m78056uM().f137614u;
        listItemSetting2.setIdTracking("add_friend_contact_native");
        AbstractC19074t.m100205c(listItemSetting2);
        ListItemSetting.m74603F(listItemSetting2, AbstractC23322a.zds_ic_contact_list_line_24, null, AbstractC2808b.f150822b70, 2, null);
        listItemSetting2.setOnClickListener(new View.OnClickListener() { // from class: com.zing.zalo.ui.zviews.u
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                AddFriendView.m78026KM(AddFriendView.this, view);
            }
        });
        ListItemSetting listItemSetting3 = m78056uM().f137616w;
        listItemSetting3.setIdTracking("add_friend_suggest_friend");
        AbstractC19074t.m100205c(listItemSetting3);
        ListItemSetting.m74603F(listItemSetting3, AbstractC23322a.zds_ic_friend_suggestion_line_24, null, AbstractC2808b.f150822b70, 2, null);
        listItemSetting3.m90592m(false);
        listItemSetting3.setOnClickListener(new View.OnClickListener() { // from class: com.zing.zalo.ui.zviews.v
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                AddFriendView.m78027LM(AddFriendView.this, view);
            }
        });
        Button button = m78056uM().f137610q;
        button.setIdTracking("add_friend_search_phone");
        button.setOnClickListener(new View.OnClickListener() { // from class: com.zing.zalo.ui.zviews.w
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                AddFriendView.m78028MM(AddFriendView.this, view);
            }
        });
        PhoneInputCustom phoneInputCustom = m78056uM().f137613t;
        phoneInputCustom.setIdTracking("add_friend_input_phone");
        phoneInputCustom.getLeftControlsLayout().setOnClickListener(new View.OnClickListener() { // from class: com.zing.zalo.ui.zviews.x
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                AddFriendView.m78020EM(AddFriendView.this, view);
            }
        });
        phoneInputCustom.setBtnNext(m78056uM().f137610q);
        phoneInputCustom.getEditText().setOnKeyListener(new ViewOnKeyListenerC14030e());
        phoneInputCustom.getEditText().setOnTouchListener(new View.OnTouchListener() { // from class: com.zing.zalo.ui.zviews.y
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                boolean m78021FM;
                m78021FM = AddFriendView.m78021FM(AddFriendView.this, view, motionEvent);
                return m78021FM;
            }
        });
        TrackingFrameLayout trackingFrameLayout = m78056uM().f137617x;
        trackingFrameLayout.setIdTracking("add_friend_my_qr");
        trackingFrameLayout.setOnClickListener(new View.OnClickListener() { // from class: com.zing.zalo.ui.zviews.z
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                AddFriendView.m78022GM(AddFriendView.this, view);
            }
        });
        MultiStateView multiStateView = m78056uM().f137605A;
        GradientDrawable.Orientation orientation = GradientDrawable.Orientation.TR_BL;
        m131500h = AbstractC25368s.m131500h(-11571822, -13678490);
        m131184L0 = AbstractC25332a0.m131184L0(m131500h);
        GradientDrawable gradientDrawable = new GradientDrawable(orientation, m131184L0);
        gradientDrawable.setGradientType(0);
        gradientDrawable.setShape(0);
        multiStateView.setBackground(gradientDrawable);
        multiStateView.setState(MultiStateView.EnumC15914e.LOADING);
        multiStateView.setVisibility(0);
        multiStateView.setVisibilityLoadingText(0);
        multiStateView.setLoadingString(AbstractC23136l9.m118743r0(AbstractC8020f0.str_loadding_qr));
        multiStateView.setErrorTitleString(AbstractC23136l9.m118743r0(AbstractC8020f0.str_error_network));
        multiStateView.setTapToRetryString(AbstractC23136l9.m118743r0(AbstractC8020f0.str_btn_retry_qr));
        multiStateView.setOnTapToRetryListener(new MultiStateView.InterfaceC15916g() { // from class: com.zing.zalo.ui.zviews.p
            @Override // com.zing.zalo.p077ui.zviews.multistate.MultiStateView.InterfaceC15916g
            /* renamed from: a */
            public final void mo12138a() {
                AddFriendView.m78023HM(AddFriendView.this);
            }
        });
        if (Build.VERSION.SDK_INT >= 23) {
            m78056uM().f137619z.setOnScrollChangeListener(new View.OnScrollChangeListener() { // from class: com.zing.zalo.ui.zviews.q
                @Override // android.view.View.OnScrollChangeListener
                public final void onScrollChange(View view, int i11, int i12, int i13, int i14) {
                    AddFriendView.m78024IM(AddFriendView.this, view, i11, i12, i13, i14);
                }
            });
        }
        m78056uM().f137611r.setOnClickListener(new View.OnClickListener() { // from class: com.zing.zalo.ui.zviews.t
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                AddFriendView.m78025JM(AddFriendView.this, view);
            }
        });
        AbstractC23136l9.m118729m1(m78056uM().f137605A, AbstractC23136l9.m118742r(16.0f));
        AbstractC23136l9.m118729m1(m78056uM().f137617x, AbstractC23136l9.m118742r(16.0f));
        AbstractC23136l9.m118729m1(m78056uM().f137618y, AbstractC23136l9.m118742r(8.0f));
        m78043tM();
        m78055WM();
        m78016AM();
        LinearLayout root = m78056uM().getRoot();
        AbstractC19074t.m100207e(root, "getRoot(...)");
        return root;
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: JJ */
    public void mo37484JJ() {
        super.mo37484JJ();
        C23744a.Companion.m124119a().m124117e(this, 6065);
    }

    /* renamed from: NM */
    public final void m78047NM() {
        int[] m131184L0;
        String m123276f;
        String m123274d;
        if (this.f72117R0.m123275e().length() > 0) {
            GradientDrawable.Orientation orientation = GradientDrawable.Orientation.TR_BL;
            m131184L0 = AbstractC25332a0.m131184L0(this.f72117R0.m123273c());
            GradientDrawable gradientDrawable = new GradientDrawable(orientation, m131184L0);
            gradientDrawable.setGradientType(0);
            gradientDrawable.setShape(0);
            m78056uM().f137617x.setBackground(gradientDrawable);
            RobotoTextView robotoTextView = m78056uM().f137606B;
            if (this.f72117R0.m123276f() == null) {
                m123276f = AbstractC23304d.f113368c0.f42437s;
            } else {
                m123276f = this.f72117R0.m123276f();
            }
            robotoTextView.setText(m123276f);
            RobotoTextView robotoTextView2 = m78056uM().f137612s;
            if (this.f72117R0.m123274d() == null) {
                m123274d = AbstractC23136l9.m118743r0(AbstractC8020f0.str_hint_scan_qr_add_friend);
            } else {
                m123274d = this.f72117R0.m123274d();
            }
            robotoTextView2.setText(m123274d);
            C23528a c23528a = this.f72118S0;
            if (c23528a == null) {
                AbstractC19074t.m100223u("mAQ");
                c23528a = null;
            }
            ((C23528a) c23528a.m123612r(m78056uM().f137618y)).m123585I(this.f72117R0.m123275e(), true, true, AbstractC23136l9.m118742r(120.0f), 0, new C14031f(), C23278z2.m120110a());
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.zing.zalo.p077ui.zviews.ZaloViewNewActionBar
    /* renamed from: OK */
    public void mo39896OK() {
        super.mo39896OK();
        try {
            ZdsActionBar m87077NK = m87077NK();
            if (m87077NK != null) {
                String m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.findbyphone_title);
                AbstractC19074t.m100207e(m118743r0, "getString(...)");
                m87077NK.setMiddleTitle(m118743r0);
                m87077NK.setMiddleTitleTextColor(C23212s8.m119607o(m87077NK.getContext(), AbstractC21196a.TextColor1));
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: PM */
    public final void m78048PM() {
        try {
            TrackingFrameLayout trackingFrameLayout = m78056uM().f137617x;
            AbstractC19074t.m100207e(trackingFrameLayout, "layoutQrCode");
            Bitmap createBitmap = Bitmap.createBitmap(trackingFrameLayout.getWidth(), trackingFrameLayout.getHeight(), Bitmap.Config.ARGB_8888);
            AbstractC19074t.m100207e(createBitmap, "createBitmap(...)");
            trackingFrameLayout.draw(new Canvas(createBitmap));
            String path = AbstractC21943a.m114579c().getPath();
            FileOutputStream fileOutputStream = new FileOutputStream(path);
            createBitmap.compress(Bitmap.CompressFormat.PNG, 100, fileOutputStream);
            fileOutputStream.flush();
            fileOutputStream.close();
            AbstractC19074t.m100205c(path);
            m78029OM(path);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: QM */
    public final void m78049QM(String str, String str2) {
        AbstractC19074t.m100208f(str, "strSearch");
        if (!this.f72128c1 && C23055e5.m118272g(true)) {
            mo46829Y();
            this.f72128c1 = true;
            C0766k c0766k = new C0766k();
            c0766k.mo1704o8(new C14033h(str));
            c0766k.mo1583Y9(str, str2, 1);
        }
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: RJ */
    public void mo13886RJ() {
        super.mo13886RJ();
        try {
            MainApplication.Companion.m35500c().getContentResolver().unregisterContentObserver(m78058yM());
        } catch (Exception e11) {
            AbstractC20110a.f98889a.mo104552e(e11);
        }
    }

    /* renamed from: RM */
    public final void m78050RM(C29773e c29773e) {
        AbstractC19074t.m100208f(c29773e, "<set-?>");
        this.f72116Q0 = c29773e;
    }

    /* renamed from: SM */
    public final void m78051SM(String str) {
        AbstractC19074t.m100208f(str, "<set-?>");
        this.f72121V0 = str;
    }

    /* renamed from: TM */
    public final void m78052TM(ContentObserver contentObserver) {
        AbstractC19074t.m100208f(contentObserver, "<set-?>");
        this.f72122W0 = contentObserver;
    }

    @Override // com.zing.zalo.p077ui.zviews.SlidableZaloView, com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.zview.ZaloView
    /* renamed from: UJ */
    public void mo37584UJ() {
        super.mo37584UJ();
        InterfaceC27218a m92676n2 = m92676n2();
        if (m92676n2 != null) {
            m92676n2.mo35554O(18);
        }
    }

    /* renamed from: UM */
    public final void m78053UM(boolean z11) {
        this.f72128c1 = z11;
    }

    @Override // com.zing.zalo.p077ui.zviews.SlidableZaloView, com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.zview.ZaloView
    /* renamed from: VJ */
    public void mo37712VJ() {
        super.mo37712VJ();
        InterfaceC27218a m92676n2 = m92676n2();
        if (m92676n2 != null) {
            m92676n2.mo35554O(32);
        }
    }

    /* renamed from: VM */
    public final void m78054VM(String str) {
        if (m92672lJ() && str != null && str.length() != 0) {
            this.f72127b1 = str;
            showDialog(this.f72123X0);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0027 A[Catch: Exception -> 0x000d, TryCatch #0 {Exception -> 0x000d, blocks: (B:2:0x0000, B:4:0x0006, B:7:0x0011, B:9:0x0027, B:12:0x0031), top: B:1:0x0000 }] */
    /* renamed from: WM */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m78055WM() {
        C28655u c28655u;
        String str;
        try {
            String m121779c5 = AbstractC23309i.m121779c5();
            if (m121779c5 != null) {
                if (m121779c5.length() == 0) {
                }
                PhoneInputCustom phoneInputCustom = m78056uM().f137613t;
                c28655u = (C28655u) C28647m.m143325c().m143328b().get(m121779c5);
                if (c28655u == null) {
                    str = c28655u.m143391b();
                } else {
                    str = null;
                }
                if (str == null) {
                    str = "";
                }
                phoneInputCustom.setPhoneCode(str);
            }
            m121779c5 = "VN";
            PhoneInputCustom phoneInputCustom2 = m78056uM().f137613t;
            c28655u = (C28655u) C28647m.m143325c().m143328b().get(m121779c5);
            if (c28655u == null) {
            }
            if (str == null) {
            }
            phoneInputCustom2.setPhoneCode(str);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // ac.InterfaceC0733x
    public String getTrackingKey() {
        return "AddFriendView";
    }

    @Override // com.zing.zalo.zview.ZaloView
    public void onActivityResult(int i11, int i12, Intent intent) {
        try {
            if (i11 == this.f72115P0 && i12 == -1 && intent != null) {
                AbstractC23309i.m122661zp(intent.getStringExtra("EXTRA_RESULT_ISO_COUNTRY_CODE"));
                m78055WM();
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // com.zing.zalo.zview.ZaloView
    public void onRequestPermissionsResult(int i11, String[] strArr, int[] iArr) {
        AbstractC19074t.m100208f(strArr, "permissions");
        AbstractC19074t.m100208f(iArr, "grantResults");
        super.onRequestPermissionsResult(i11, strArr, iArr);
        if (i11 == 151 && AbstractC23034c6.m118121G()) {
            m78048PM();
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.ZaloViewNewActionBar, com.zing.zalo.zview.ZaloView
    public void onResume() {
        int i11;
        super.onResume();
        try {
            RobotoTextView robotoTextView = m78056uM().f137607C;
            if (C19172a.m100600k("friend_new_finding_ui@manage_request", 0) == 1) {
                i11 = 0;
            } else {
                i11 = 8;
            }
            robotoTextView.setVisibility(i11);
            if (this.f72120U0) {
                this.f72120U0 = false;
                m78044vM();
            }
            MainApplication.Companion.m35500c().getContentResolver().registerContentObserver(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, true, m78058yM());
        } catch (Exception e11) {
            AbstractC20110a.f98889a.mo104552e(e11);
        }
    }

    /* renamed from: uM */
    public final C29773e m78056uM() {
        C29773e c29773e = this.f72116Q0;
        if (c29773e != null) {
            return c29773e;
        }
        AbstractC19074t.m100223u("binding");
        return null;
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, p363nh.C23744a.c
    /* renamed from: x */
    public void mo17795x(int i11, Object... objArr) {
        AbstractC19074t.m100208f(objArr, "args");
        super.mo17795x(i11, Arrays.copyOf(objArr, objArr.length));
        if (i11 == 6065) {
            m78044vM();
        }
    }

    /* renamed from: xM */
    public final C23484g m78057xM() {
        return this.f72117R0;
    }

    /* renamed from: yM */
    public final ContentObserver m78058yM() {
        ContentObserver contentObserver = this.f72122W0;
        if (contentObserver != null) {
            return contentObserver;
        }
        AbstractC19074t.m100223u("screenshotObserver");
        return null;
    }

    /* renamed from: zM */
    public final void m78059zM() {
        int i11;
        boolean z11;
        int i12;
        boolean z12;
        m78046C();
        String valueOf = String.valueOf(m78056uM().f137613t.getEditText().getText());
        int length = valueOf.length() - 1;
        int i13 = 0;
        boolean z13 = false;
        while (i13 <= length) {
            if (!z13) {
                i12 = i13;
            } else {
                i12 = length;
            }
            if (AbstractC19074t.m100209g(valueOf.charAt(i12), 32) <= 0) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (!z13) {
                if (!z12) {
                    z13 = true;
                } else {
                    i13++;
                }
            } else if (!z12) {
                break;
            } else {
                length--;
            }
        }
        if (AbstractC19074t.m100204b(valueOf.subSequence(i13, length + 1).toString(), "")) {
            m78054VM(AbstractC23136l9.m118743r0(AbstractC8020f0.find_friend_input_phone_notify));
            return;
        }
        String m121779c5 = AbstractC23309i.m121779c5();
        if (m121779c5 == null) {
            m121779c5 = AbstractC23309i.m121704a5();
        }
        int length2 = valueOf.length() - 1;
        int i14 = 0;
        boolean z14 = false;
        while (i14 <= length2) {
            if (!z14) {
                i11 = i14;
            } else {
                i11 = length2;
            }
            if (AbstractC19074t.m100209g(valueOf.charAt(i11), 32) <= 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (!z14) {
                if (!z11) {
                    z14 = true;
                } else {
                    i14++;
                }
            } else if (!z11) {
                break;
            } else {
                length2--;
            }
        }
        String m89307S = C16741a.m89307S(valueOf.subSequence(i14, length2 + 1).toString());
        if (!TextUtils.isEmpty(m89307S) && m89307S.length() >= 6) {
            if (AbstractC19074t.m100204b(m89307S, this.f72125Z0) && System.currentTimeMillis() - this.f72126a1 < 2000) {
                return;
            }
            this.f72126a1 = System.currentTimeMillis();
            AbstractC19074t.m100205c(m89307S);
            this.f72125Z0 = m89307S;
            m78049QM(m89307S, m121779c5);
            return;
        }
        m78054VM(AbstractC23136l9.m118743r0(AbstractC8020f0.input_phone09));
    }
}
