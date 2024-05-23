package com.zing.zalo.p077ui.chat.dialog;

import ac.C0708i;
import ac.C0732w;
import ae.C0766k;
import ag0.AbstractC0837p0;
import ag0.AbstractC0852x;
import am.AbstractC0924m0;
import am.C0943w;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.text.style.URLSpan;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.SimpleAdapter;
import android.widget.TextView;
import androidx.core.text.AbstractC1463b;
import au.AbstractC2379w;
import b40.C2526d;
import b60.InterfaceC2585a;
import bn.C2852a1;
import bp0.AbstractC3102n;
import c30.C3246i0;
import c30.C3255n;
import c30.ViewOnClickListenerC3266y;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.AbstractC7921d0;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.MainApplication;
import com.zing.zalo.SensitiveData;
import com.zing.zalo.adapters.C7189r;
import com.zing.zalo.common.chat.label.C7860a;
import com.zing.zalo.control.C7904b;
import com.zing.zalo.control.ContactProfile;
import com.zing.zalo.data.chat.model.tabmessage.Conversation;
import com.zing.zalo.dialog.C8009j;
import com.zing.zalo.p062db.C7960e;
import com.zing.zalo.p077ui.ZaloBubbleActivity;
import com.zing.zalo.p077ui.chat.C11318b;
import com.zing.zalo.p077ui.chat.ChatView;
import com.zing.zalo.p077ui.chat.dialog.ChatDialogView;
import com.zing.zalo.p077ui.settings.SettingMessageV2View;
import com.zing.zalo.p077ui.widget.reaction.ReactionPickerView;
import com.zing.zalo.p077ui.zviews.CodeLockMessageView;
import com.zing.zalo.p077ui.zviews.GroupSelectNewOwnerView;
import com.zing.zalo.p077ui.zviews.JumpLinkSettingBottomView;
import com.zing.zalo.p077ui.zviews.NearbyZView;
import com.zing.zalo.social.controls.C10862a0;
import com.zing.zalo.utils.ToastUtils;
import com.zing.zalo.zdesign.component.C16972e0;
import com.zing.zalo.zinstant.AbstractC17148f0;
import com.zing.zalo.zinstant.AbstractC17155h1;
import com.zing.zalo.zinstant.zom.properties.ZOMInsight;
import com.zing.zalo.zvideoutil.ZVideoUtilMetadata;
import com.zing.zalo.zview.DialogView;
import com.zing.zalo.zview.dialog.C17465f;
import com.zing.zalo.zview.dialog.InterfaceC17463d;
import com.zing.zalo.zview.dialog.KeyEventCallbackC17462c;
import df0.C17914d;
import dj.C17945a0;
import fi.C18946d;
import g30.AbstractC19215a;
import g30.C19216b;
import gg0.AbstractC19444a;
import gw.AbstractC19620d0;
import gw.AbstractC19646n0;
import gw.AbstractC19656s0;
import gw.C19669z;
import hm0.C20096c;
import hm0.InterfaceC20094a;
import ho0.AbstractC20110a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import lb0.C22423y;
import me0.AbstractC23093i;
import me0.AbstractC23112j7;
import me0.AbstractC23116k0;
import me0.AbstractC23126l;
import me0.AbstractC23136l9;
import me0.AbstractC23152n3;
import me0.AbstractC23160o0;
import me0.AbstractC23184q2;
import me0.AbstractC23262x6;
import me0.C23024b7;
import me0.C23055e5;
import me0.ClipboardManagerOnPrimaryClipChangedListenerC23245w;
import mm0.AbstractC23350e;
import nh0.C23793c;
import org.json.JSONObject;
import p038bl.C2834f;
import p130eh.C18431b;
import p268ji.C21270p;
import p304ks.AbstractC21935u;
import p348mi.AbstractC23304d;
import p348mi.AbstractC23309i;
import p361nb.AbstractC23647d;
import p361nb.C23648e;
import p363nh.C23744a;
import p394oj.C24277c;
import p459qs.C25489b;
import p461qu.AbstractC25495a;
import p471r3.C25630b;
import p549uj.AbstractC27282a;
import p588vw.C28644j;
import p604wb.C28905e;
import p693yu.InterfaceC31084b;
import p716zh.C31877d;
import p716zh.C31902e9;
import p716zh.C31931g8;
import p716zh.C31950hc;
import p716zh.C31973j5;
import p716zh.C31986k3;
import p716zh.C32002l4;
import p716zh.C32012m;
import p716zh.C32044o1;
import p716zh.C32108s9;
import ph.C24753f;
import pm0.C24848g0;
import sx.C26406h;
import th.C26688i;
import tj.C26713e;
import u00.C26939u;
import v50.C27870vb;
import vg.C28203u6;
import w90.C28829a;

/* loaded from: classes5.dex */
public class ChatDialogView extends DialogView {

    /* renamed from: H0 */
    private ChatView f59781H0;

    /* renamed from: I0 */
    private InterfaceC2585a f59782I0;

    /* renamed from: J0 */
    private Object f59783J0;

    /* renamed from: M0 */
    InterfaceC11590m f59786M0;

    /* renamed from: K0 */
    ChatDialogView f59784K0 = this;

    /* renamed from: L0 */
    boolean f59785L0 = false;

    /* renamed from: N0 */
    private final InterfaceC17463d.d f59787N0 = new InterfaceC17463d.b();

    /* renamed from: O0 */
    private final InterfaceC17463d.d f59788O0 = new C11581d();

    /* renamed from: P0 */
    InterfaceC17463d.d f59789P0 = new C11582e();

    /* renamed from: com.zing.zalo.ui.chat.dialog.ChatDialogView$a */
    /* loaded from: classes5.dex */
    public class C11578a implements ViewOnClickListenerC3266y.e {
        C11578a() {
        }

        /* renamed from: d */
        public /* synthetic */ void m62973d() {
            if (ChatDialogView.this.f59781H0 != null && ChatDialogView.this.f59781H0.f56846e3 == 4) {
                ChatDialogView.this.f59781H0.mo59706Ka(0);
            }
        }

        @Override // c30.ViewOnClickListenerC3266y.e
        /* renamed from: a */
        public void mo16644a() {
            AbstractC19444a.m101695c(new Runnable() { // from class: com.zing.zalo.ui.chat.dialog.a
                public /* synthetic */ RunnableC11591a() {
                }

                @Override // java.lang.Runnable
                public final void run() {
                    ChatDialogView.C11578a.this.m62973d();
                }
            });
        }

        @Override // c30.ViewOnClickListenerC3266y.e
        /* renamed from: b */
        public void mo16645b(C25630b c25630b) {
            if (c25630b != null) {
                try {
                    if (ChatDialogView.this.f59781H0 != null && ChatDialogView.this.f59781H0.f56793R1 != null) {
                        if (C3255n.m16558i() && !c25630b.m132399G()) {
                            return;
                        }
                        ChatDialogView.this.f59781H0.m60277xT(c25630b, -1, false, true);
                    }
                } catch (Exception e11) {
                    e11.printStackTrace();
                }
            }
        }
    }

    /* renamed from: com.zing.zalo.ui.chat.dialog.ChatDialogView$b */
    /* loaded from: classes5.dex */
    public class C11579b implements InterfaceC20094a {
        C11579b() {
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
            try {
                if (ChatDialogView.this.f59781H0 != null && ChatDialogView.this.f59781H0.mo59787QH()) {
                    ToastUtils.m89266n(AbstractC8020f0.game_manage_detail_block_status_pulling_block_error_message, new Object[0]);
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            try {
                if (ChatDialogView.this.f59781H0 != null && ChatDialogView.this.f59781H0.mo59787QH()) {
                    ToastUtils.m89266n(AbstractC8020f0.game_manage_detail_block_status_pulling_block_success_message, new Object[0]);
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    /* renamed from: com.zing.zalo.ui.chat.dialog.ChatDialogView$c */
    /* loaded from: classes5.dex */
    public class C11580c implements InterfaceC20094a {

        /* renamed from: a */
        final /* synthetic */ String f59792a;

        C11580c(String str) {
            this.f59792a = str;
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
            if (ChatDialogView.this.f59781H0 != null) {
                ChatDialogView.this.f59781H0.mo78960q3();
                AbstractC23152n3.m118995F0(ChatDialogView.this.f59781H0, this.f59792a, String.format(AbstractC23136l9.m118743r0(AbstractC8020f0.bodyinvite), AbstractC23262x6.m120002o(AbstractC23304d.f113368c0.f42437s)), 1043);
            }
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            if (ChatDialogView.this.f59781H0 != null) {
                try {
                    ChatDialogView.this.f59781H0.mo78960q3();
                    JSONObject jSONObject = (JSONObject) obj;
                    String str = "";
                    if (!jSONObject.isNull("data")) {
                        str = new JSONObject(jSONObject.getString("data")).optString("text");
                    }
                    if (TextUtils.isEmpty(str)) {
                        str = String.format(AbstractC23136l9.m118743r0(AbstractC8020f0.bodyinvite), AbstractC23262x6.m120002o(AbstractC23304d.f113368c0.f42437s));
                    }
                    AbstractC23152n3.m118995F0(ChatDialogView.this.f59781H0, this.f59792a, str, 1043);
                } catch (Exception e11) {
                    AbstractC23350e.m122778h(e11);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.chat.dialog.ChatDialogView$d */
    /* loaded from: classes5.dex */
    public class C11581d implements InterfaceC17463d.d {
        C11581d() {
        }

        @Override // com.zing.zalo.zview.dialog.InterfaceC17463d.d
        /* renamed from: K8 */
        public void mo605K8(InterfaceC17463d interfaceC17463d, int i11) {
            C32012m c32012m;
            String str = "";
            C7904b c7904b = null;
            switch (ChatDialogView.this.m92642L3().getInt("id")) {
                case 109:
                    interfaceC17463d.dismiss();
                    if (ChatDialogView.this.f59782I0 != null) {
                        ChatDialogView.this.f59782I0.mo13050w5(true);
                        return;
                    }
                    return;
                case ZVideoUtilMetadata.FF_PROFILE_H264_HIGH_10 /* 110 */:
                    interfaceC17463d.dismiss();
                    if (ChatDialogView.this.f59782I0 != null) {
                        ChatDialogView.this.f59782I0.mo13023Mi();
                        return;
                    }
                    return;
                case 115:
                    if (interfaceC17463d != null) {
                        interfaceC17463d.dismiss();
                    }
                    if (ChatDialogView.this.f59782I0 != null && ChatDialogView.this.f59783J0 != null) {
                        try {
                            Bundle bundle = (Bundle) ChatDialogView.this.f59783J0;
                            C25630b c25630b = (C25630b) bundle.getSerializable("gifInfo");
                            int i12 = bundle.getInt("source");
                            C18946d c18946d = (C18946d) bundle.getSerializable("searchInlineAdditionalInfo");
                            C28829a c28829a = (C28829a) bundle.getSerializable("stickerFromPanelBundle");
                            if (c25630b != null) {
                                if (c18946d != null) {
                                    C31902e9 c31902e9 = (C31902e9) bundle.getSerializable("search_inline_result");
                                    AbstractC19215a abstractC19215a = (AbstractC19215a) bundle.getSerializable("tracking_data");
                                    if (abstractC19215a instanceof C19216b) {
                                        C19216b c19216b = (C19216b) abstractC19215a;
                                        c19216b.m100856o(1);
                                        C21270p.m110079C().m110148T(c19216b);
                                    }
                                    ChatDialogView.this.f59782I0.mo13036c7(c31902e9, c25630b, c18946d);
                                    return;
                                }
                                ChatDialogView.this.f59782I0.mo13021Ka(c25630b, i12, c28829a);
                                return;
                            }
                            return;
                        } catch (Exception e11) {
                            AbstractC20110a.m104539h(e11);
                            return;
                        }
                    }
                    return;
                case 116:
                    if (interfaceC17463d != null) {
                        interfaceC17463d.dismiss();
                    }
                    if (ChatDialogView.this.f59782I0 != null) {
                        ChatDialogView.this.f59782I0.mo13051wc(ChatDialogView.this.f59783J0);
                        return;
                    }
                    return;
                case 120:
                    if (interfaceC17463d != null) {
                        interfaceC17463d.dismiss();
                    }
                    AbstractC23309i.m122299px(2);
                    ToastUtils.showMess(AbstractC23136l9.m118743r0(AbstractC8020f0.str_hint_disable_smsIntegration_success));
                    return;
                case 121:
                    interfaceC17463d.dismiss();
                    if (ChatDialogView.this.f59781H0.f56860i1 != null) {
                        ChatDialogView.this.f59781H0.f56789Q1.m153925w(ChatDialogView.this.f59781H0.f56860i1.getFileRecordName());
                        return;
                    }
                    return;
                case ZVideoUtilMetadata.FF_PROFILE_H264_HIGH_422 /* 122 */:
                    interfaceC17463d.dismiss();
                    if (ChatDialogView.this.f59781H0.f56860i1 != null) {
                        ChatDialogView.this.f59781H0.m59853UT(false);
                        ChatDialogView.this.f59781H0.f56860i1.setMaxAmplitudeRecorder(1);
                        ChatDialogView.this.f59781H0.f56789Q1.m153925w(ChatDialogView.this.f59781H0.f56860i1.getFileRecordName());
                        return;
                    }
                    return;
                case 124:
                    interfaceC17463d.dismiss();
                    if (ChatDialogView.this.f59781H0.f56860i1 != null) {
                        ChatDialogView.this.f59781H0.f56860i1.mo87650c();
                        return;
                    }
                    return;
                case 129:
                    interfaceC17463d.dismiss();
                    AbstractC23309i.m121177Lx(true);
                    ChatDialogView.this.f59781H0.m92662fJ().m93069k2(NearbyZView.class, null, 1, true);
                    return;
                case 136:
                    if (interfaceC17463d != null) {
                        interfaceC17463d.dismiss();
                    }
                    AbstractC23309i.m122407su(3);
                    return;
                case 137:
                    if (interfaceC17463d != null) {
                        interfaceC17463d.dismiss();
                    }
                    int m120894E9 = AbstractC23309i.m120894E9();
                    if (m120894E9 < 3) {
                        AbstractC23309i.m122407su(m120894E9 + 1);
                        return;
                    }
                    return;
                case 140:
                    interfaceC17463d.dismiss();
                    if (ChatDialogView.this.f59783J0 != null && (ChatDialogView.this.f59783J0 instanceof String)) {
                        ChatDialogView.this.f59781H0.f56793R1.m64709B3((String) ChatDialogView.this.f59783J0);
                        return;
                    }
                    return;
                case 150:
                    if (ChatDialogView.this.f59782I0 != null) {
                        ChatDialogView.this.f59782I0.mo13038ic(ChatDialogView.this.f59783J0);
                        return;
                    }
                    return;
                case 160:
                    if (interfaceC17463d != null) {
                        interfaceC17463d.dismiss();
                    }
                    if (ChatDialogView.this.f59783J0 != null && (ChatDialogView.this.f59783J0 instanceof C32012m) && (c32012m = (C32012m) ChatDialogView.this.f59783J0) != null && c32012m.f147323q > 0 && !TextUtils.isEmpty(c32012m.f147324r)) {
                        ChatDialogView.this.m62971hM(c32012m.f147323q);
                        return;
                    }
                    return;
                case 162:
                    AbstractC23309i.m120772Az(false);
                    if (ChatDialogView.this.f59781H0 != null) {
                        ChatDialogView.this.f59781H0.m60020gQ().mo60602M5();
                    }
                    if (interfaceC17463d != null) {
                        interfaceC17463d.dismiss();
                        return;
                    }
                    return;
                case 163:
                    if (ChatDialogView.this.f59782I0 != null) {
                        ChatDialogView.this.f59782I0.mo13033Y9(ChatDialogView.this.f59783J0);
                        return;
                    }
                    return;
                case 164:
                    if (ChatDialogView.this.f59782I0 != null) {
                        ChatDialogView.this.f59782I0.mo13035ac(ChatDialogView.this.f59783J0);
                        return;
                    }
                    return;
                case 168:
                    if (interfaceC17463d != null) {
                        interfaceC17463d.dismiss();
                    }
                    if (ChatDialogView.this.f59782I0 != null) {
                        ChatDialogView.this.f59782I0.mo13043ma();
                    }
                    if (Build.VERSION.SDK_INT >= 25) {
                        C26939u.m138770q().m138782m(ChatDialogView.this.f59781H0.m60020gQ().mo60615Oc().m17944I0());
                        return;
                    }
                    return;
                case 173:
                    if (interfaceC17463d != null) {
                        interfaceC17463d.dismiss();
                    }
                    if (ChatDialogView.this.f59782I0 != null) {
                        ChatDialogView.this.f59782I0.mo13027Qc();
                        return;
                    }
                    return;
                case 176:
                    if (ChatDialogView.this.f59783J0 != null && (ChatDialogView.this.f59783J0 instanceof C17945a0)) {
                        C17945a0 c17945a0 = (C17945a0) ChatDialogView.this.f59783J0;
                        if (ChatDialogView.this.f59782I0 != null && c17945a0 != null) {
                            ChatDialogView.this.f59782I0.mo13022Kc(c17945a0);
                        }
                    }
                    if (interfaceC17463d != null) {
                        interfaceC17463d.dismiss();
                        return;
                    }
                    return;
                case 180:
                    if (interfaceC17463d != null) {
                        interfaceC17463d.dismiss();
                    }
                    if (ChatDialogView.this.f59782I0 != null) {
                        ChatDialogView.this.f59782I0.mo13048qo();
                        return;
                    }
                    return;
                case 181:
                    if (ChatDialogView.this.f59782I0 != null) {
                        ChatDialogView.this.f59782I0.mo13054ym();
                        return;
                    }
                    return;
                case 200:
                case 414:
                    interfaceC17463d.dismiss();
                    if (ChatDialogView.this.f59782I0 != null) {
                        ChatDialogView.this.f59782I0.mo13032Xl(ChatDialogView.this.f59783J0);
                        return;
                    }
                    return;
                case 201:
                    interfaceC17463d.dismiss();
                    if (ChatDialogView.this.f59782I0 != null) {
                        ChatDialogView.this.f59782I0.mo13025Nk(ChatDialogView.this.f59783J0);
                        return;
                    }
                    return;
                case 204:
                    if (interfaceC17463d != null) {
                        interfaceC17463d.dismiss();
                    }
                    if (ChatDialogView.this.f59782I0 != null) {
                        ChatDialogView.this.f59782I0.mo13020K6();
                        return;
                    }
                    return;
                case 305:
                    if (i11 == -1) {
                        if (interfaceC17463d != null) {
                            interfaceC17463d.dismiss();
                        }
                        try {
                            if (ChatDialogView.this.f59783J0 instanceof String) {
                                str = (String) ChatDialogView.this.f59783J0;
                            }
                            Bundle bundle2 = new Bundle();
                            bundle2.putInt("case_passcode_process", 0);
                            bundle2.putString("uid_set_hidden_chat", str);
                            ChatDialogView.this.m92676n2().mo35579p().m93066i2(CodeLockMessageView.class, bundle2, 1042, 1, true);
                            ChatDialogView.this.removeDialog(305);
                            AbstractC23647d.m123906p("22001301");
                            AbstractC23647d.m123893c();
                            return;
                        } catch (Exception e12) {
                            e12.printStackTrace();
                            return;
                        }
                    }
                    return;
                case 306:
                    if (i11 == -1) {
                        if (interfaceC17463d != null) {
                            try {
                                interfaceC17463d.dismiss();
                            } catch (Exception e13) {
                                e13.printStackTrace();
                                return;
                            }
                        }
                        if (ChatDialogView.this.f59783J0 instanceof String) {
                            str = (String) ChatDialogView.this.f59783J0;
                        }
                        if (!TextUtils.isEmpty(str)) {
                            ToastUtils.showMess(String.format(ChatDialogView.this.m92652XI(AbstractC8020f0.str_hint_hidden_setup_with_friend_done), str));
                        }
                        if (Build.VERSION.SDK_INT >= 25) {
                            C26939u.m138770q().m138779h(ChatDialogView.this.f59781H0.m60020gQ().mo60615Oc().m17944I0());
                            return;
                        }
                        return;
                    }
                    return;
                case 315:
                    try {
                        Object[] objArr = (Object[]) ChatDialogView.this.f59783J0;
                        C7904b c7904b2 = (C7904b) objArr[0];
                        String str2 = (String) objArr[1];
                        if (c7904b2 != null) {
                            if (!c7904b2.f42726N) {
                                AbstractC23184q2.m119466x(c7904b2, str2, ChatDialogView.this.m92676n2().mo35579p(), true);
                            } else {
                                AbstractC23184q2.m119467y(c7904b2.f42715C, str2, ChatDialogView.this.m92676n2().mo35579p(), true);
                            }
                        }
                        return;
                    } catch (Exception e14) {
                        e14.printStackTrace();
                        return;
                    }
                case 410:
                    try {
                        ChatDialogView.this.f59781H0.mo59957cF((String) ChatDialogView.this.f59783J0, 11);
                        return;
                    } catch (Exception e15) {
                        e15.printStackTrace();
                        return;
                    }
                case 418:
                    interfaceC17463d.dismiss();
                    if (ChatDialogView.this.f59782I0 != null) {
                        ChatDialogView.this.f59782I0.mo13017Ed();
                        return;
                    }
                    return;
                case 419:
                    if (interfaceC17463d != null) {
                        interfaceC17463d.dismiss();
                    }
                    if (ChatDialogView.this.f59783J0 instanceof C7904b) {
                        c7904b = (C7904b) ChatDialogView.this.f59783J0;
                    }
                    if (c7904b != null) {
                        ChatDialogView.this.f59781H0.m60020gQ().mo60550D8(c7904b);
                        return;
                    }
                    return;
                case 420:
                    if (interfaceC17463d != null) {
                        interfaceC17463d.dismiss();
                    }
                    Object obj = ChatDialogView.this.f59783J0;
                    if ((obj instanceof C17914d.b) && ((C17914d.b) obj).m94512g() == 1) {
                        ChatDialogView.this.f59781H0.m60020gQ().mo60803th(true);
                        return;
                    }
                    return;
                default:
                    return;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.chat.dialog.ChatDialogView$e */
    /* loaded from: classes5.dex */
    public class C11582e implements InterfaceC17463d.d {
        C11582e() {
        }

        @Override // com.zing.zalo.zview.dialog.InterfaceC17463d.d
        /* renamed from: K8 */
        public void mo605K8(InterfaceC17463d interfaceC17463d, int i11) {
            int i12 = ChatDialogView.this.m92642L3().getInt("id");
            if (i12 != 109) {
                if (i12 != 115) {
                    if (i12 != 418) {
                        if (i12 != 420) {
                            if (i12 != 121) {
                                if (i12 != 122) {
                                    if (i12 != 136) {
                                        if (i12 == 137) {
                                            if (interfaceC17463d != null) {
                                                interfaceC17463d.dismiss();
                                            }
                                            Bundle bundle = new Bundle();
                                            bundle.putInt("EXTRA_HIGHTLIGHT_SETTING_ID", 21);
                                            ChatDialogView.this.f59781H0.m92662fJ().m93069k2(SettingMessageV2View.class, bundle, 1, true);
                                            return;
                                        }
                                        return;
                                    }
                                    if (interfaceC17463d != null) {
                                        interfaceC17463d.dismiss();
                                    }
                                    AbstractC23309i.m122407su(3);
                                    Bundle bundle2 = new Bundle();
                                    bundle2.putInt("EXTRA_HIGHTLIGHT_SETTING_ID", 21);
                                    ChatDialogView.this.f59781H0.m92662fJ().m93069k2(SettingMessageV2View.class, bundle2, 1, true);
                                    return;
                                }
                                if (interfaceC17463d != null) {
                                    interfaceC17463d.dismiss();
                                }
                                ChatDialogView.this.f59781H0.m59853UT(false);
                                return;
                            }
                            if (interfaceC17463d != null) {
                                interfaceC17463d.dismiss();
                            }
                            ChatDialogView.this.f59781H0.m59853UT(false);
                            return;
                        }
                        if (interfaceC17463d != null) {
                            interfaceC17463d.dismiss();
                        }
                        Object obj = ChatDialogView.this.f59783J0;
                        if ((obj instanceof C17914d.b) && ((C17914d.b) obj).m94512g() == 1) {
                            ChatDialogView.this.f59781H0.m60020gQ().mo60803th(false);
                            return;
                        }
                        return;
                    }
                    interfaceC17463d.dismiss();
                    return;
                }
                if (interfaceC17463d != null) {
                    interfaceC17463d.dismiss();
                }
                if (ChatDialogView.this.f59782I0 != null) {
                    ChatDialogView.this.f59782I0.mo13047q5();
                    return;
                }
                return;
            }
            interfaceC17463d.dismiss();
            if (ChatDialogView.this.f59782I0 != null) {
                ChatDialogView.this.f59782I0.mo13050w5(false);
            }
        }
    }

    /* renamed from: com.zing.zalo.ui.chat.dialog.ChatDialogView$f */
    /* loaded from: classes5.dex */
    class C11583f implements ReactionPickerView.InterfaceC13747a {

        /* renamed from: p */
        final /* synthetic */ C17945a0 f59796p;

        /* renamed from: q */
        final /* synthetic */ C17945a0 f59797q;

        C11583f(C17945a0 c17945a0, C17945a0 c17945a02) {
            this.f59796p = c17945a0;
            this.f59797q = c17945a02;
        }

        @Override // com.zing.zalo.p077ui.widget.reaction.ReactionPickerView.InterfaceC13747a
        /* renamed from: G8 */
        public void mo62725G8(C24753f c24753f, String str) {
            try {
                if (!C23055e5.m118272g(true)) {
                    return;
                }
                if (ChatDialogView.this.f59781H0 != null) {
                    ChatDialogView.this.f59781H0.mo59825Su(new ArrayList(Arrays.asList(this.f59796p.m95029V3())), c24753f.m128595h());
                }
                AbstractC19646n0.m102956a2(this.f59796p, c24753f, 0, true);
                C0732w.Companion.m1189a().m1187q("reaction_send", str, null, C22423y.m115852c(c24753f.m128595h(), this.f59797q, true));
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }

        @Override // com.zing.zalo.p077ui.widget.reaction.ReactionPickerView.InterfaceC13747a
        /* renamed from: Rp */
        public void mo62726Rp() {
            AbstractC19646n0.m103004m2(this.f59796p, true);
        }

        @Override // com.zing.zalo.p077ui.widget.reaction.ReactionPickerView.InterfaceC13747a
        /* renamed from: WE */
        public void mo62727WE(String str) {
            try {
                if (ChatDialogView.this.f59781H0 != null) {
                    ChatDialogView.this.f59781H0.mo60051id(203);
                    ChatDialogView.this.f59781H0.m59974dQ().requestDisallowInterceptTouchEvent(false);
                }
                C23744a.m124114c().m124116d(75, this.f59797q.m95029V3(), str);
            } catch (Exception e11) {
                AbstractC23350e.m122778h(e11);
            }
        }

        @Override // com.zing.zalo.p077ui.widget.reaction.ReactionPickerView.InterfaceC13747a
        /* renamed from: p2 */
        public void mo62730p2() {
            if (ChatDialogView.this.f59781H0 != null) {
                ChatDialogView.this.f59781H0.mo60051id(203);
                ChatDialogView.this.f59781H0.m59974dQ().requestDisallowInterceptTouchEvent(false);
            }
        }
    }

    /* renamed from: com.zing.zalo.ui.chat.dialog.ChatDialogView$g */
    /* loaded from: classes5.dex */
    public class C11584g implements InterfaceC20094a {

        /* renamed from: a */
        final /* synthetic */ String f59799a;

        C11584g(String str) {
            this.f59799a = str;
        }

        /* renamed from: e */
        public /* synthetic */ void m62976e(String str) {
            ChatDialogView.this.f59781H0.m60020gQ().mo60772nh(str, ChatDialogView.this.f59781H0.m60020gQ().mo60722g().m154284u(11), null);
        }

        /* renamed from: f */
        public /* synthetic */ void m62977f(String str) {
            ChatDialogView.this.f59781H0.mo60056iu(417, str);
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
            ChatDialogView.this.f59781H0.mo78960q3();
            ChatDialogView.this.f59785L0 = false;
            String m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.error_message);
            String str = "";
            if (c20096c != null) {
                int m104491c = c20096c.m104491c();
                if (m104491c == 1010) {
                    m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_search_global_search_phone_error_1);
                } else if (m104491c == 111) {
                    m118743r0 = AbstractC23136l9.m118746s0(AbstractC8020f0.str_missparam, 111);
                } else if (m104491c == 102) {
                    m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_search_error_login);
                } else if (m104491c == 515) {
                    m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.WRONG_DATE_TIME_MSG);
                } else if (m104491c == 2027) {
                    m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.TOO_MANY_REQUEST_MSG);
                } else if (m104491c == 1001) {
                    try {
                        if (!TextUtils.isEmpty(c20096c.m104490b())) {
                            str = C23024b7.m118048i(new JSONObject(c20096c.m104490b()));
                        }
                    } catch (Exception e11) {
                        e11.printStackTrace();
                    }
                } else if (m104491c == 1012 || m104491c == 1011) {
                    m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_search_global_search_phone_error_2_desc);
                }
            }
            if (!TextUtils.isEmpty(str)) {
                AbstractC19444a.m101695c(new Runnable() { // from class: com.zing.zalo.ui.chat.dialog.c

                    /* renamed from: q */
                    public final /* synthetic */ String f59813q;

                    public /* synthetic */ RunnableC11593c(String str2) {
                        r2 = str2;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        ChatDialogView.C11584g.this.m62977f(r2);
                    }
                });
            } else if (!TextUtils.isEmpty(m118743r0)) {
                ToastUtils.showMess(m118743r0);
            }
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            JSONObject jSONObject;
            String string;
            try {
                ChatDialogView chatDialogView = ChatDialogView.this;
                chatDialogView.f59785L0 = false;
                chatDialogView.f59781H0.mo78960q3();
                if (obj != null) {
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
                            if (C7960e.m41971c6() != null && string.length() > 0 && !string.equalsIgnoreCase("null")) {
                                C7960e.m41971c6().m42221O7(contactProfile, AbstractC21935u.m114558y(string));
                            }
                        } catch (Exception e11) {
                            AbstractC23350e.m122778h(e11);
                        }
                        if (string.length() > 0 && !string.equalsIgnoreCase("null")) {
                            AbstractC19444a.m101695c(new Runnable() { // from class: com.zing.zalo.ui.chat.dialog.b

                                /* renamed from: q */
                                public final /* synthetic */ String f59811q;

                                public /* synthetic */ RunnableC11592b(String string2) {
                                    r2 = string2;
                                }

                                @Override // java.lang.Runnable
                                public final void run() {
                                    ChatDialogView.C11584g.this.m62976e(r2);
                                }
                            });
                        }
                    }
                }
            } catch (Exception e12) {
                AbstractC23350e.m122778h(e12);
            }
        }
    }

    /* renamed from: com.zing.zalo.ui.chat.dialog.ChatDialogView$h */
    /* loaded from: classes5.dex */
    class C11585h extends AbstractC23116k0.a {
        C11585h() {
        }

        @Override // me0.AbstractC23116k0.a
        /* renamed from: b */
        public void mo56829b(InterfaceC17463d interfaceC17463d, int i11) {
            if (interfaceC17463d != null) {
                interfaceC17463d.dismiss();
            }
            if (ChatDialogView.this.f59782I0 != null) {
                ChatDialogView.this.f59782I0.mo13039il(i11);
            }
        }
    }

    /* renamed from: com.zing.zalo.ui.chat.dialog.ChatDialogView$i */
    /* loaded from: classes5.dex */
    public class C11586i implements C7860a.c {

        /* renamed from: a */
        final /* synthetic */ int f59802a;

        C11586i(int i11) {
            this.f59802a = i11;
        }

        /* renamed from: f */
        public /* synthetic */ void m62979f(int i11) {
            ChatDialogView.this.f59781H0.mo60206sG();
            ToastUtils.m89268p(AbstractC23136l9.m118746s0(AbstractC8020f0.str_toast_label_as_read_later, C7860a.Companion.m40303b().m40272P(i11)));
            C19669z.m103146Y().m103198O0();
        }

        @Override // com.zing.zalo.common.chat.label.C7860a.c
        /* renamed from: a */
        public void mo40215a(C20096c c20096c) {
            if (c20096c != null) {
                ToastUtils.m89268p(c20096c.m104492d());
            }
        }

        @Override // com.zing.zalo.common.chat.label.C7860a.c
        /* renamed from: b */
        public void mo40216b(Object obj) {
            if (ChatDialogView.this.f59781H0 != null) {
                ChatDialogView.this.f59781H0.mo70710wy(new Runnable() { // from class: com.zing.zalo.ui.chat.dialog.d

                    /* renamed from: q */
                    public final /* synthetic */ int f59815q;

                    public /* synthetic */ RunnableC11594d(int i11) {
                        r2 = i11;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        ChatDialogView.C11586i.this.m62979f(r2);
                    }
                });
            }
        }

        @Override // com.zing.zalo.common.chat.label.C7860a.c
        /* renamed from: c */
        public void mo40217c() {
            ChatDialogView.this.f59781H0.mo46829Y();
        }

        @Override // com.zing.zalo.common.chat.label.C7860a.c
        /* renamed from: d */
        public void mo40218d() {
            ChatDialogView.this.f59781H0.mo49315c4();
        }
    }

    /* renamed from: com.zing.zalo.ui.chat.dialog.ChatDialogView$j */
    /* loaded from: classes5.dex */
    public class C11587j implements C7860a.c {

        /* renamed from: a */
        final /* synthetic */ int f59804a;

        C11587j(int i11) {
            this.f59804a = i11;
        }

        /* renamed from: f */
        public /* synthetic */ void m62981f(int i11) {
            ChatDialogView.this.f59781H0.mo60206sG();
            ToastUtils.m89268p(AbstractC23136l9.m118746s0(AbstractC8020f0.str_toast_label_as_focused, C7860a.Companion.m40303b().m40272P(i11)));
            C19669z.m103146Y().m103198O0();
        }

        @Override // com.zing.zalo.common.chat.label.C7860a.c
        /* renamed from: a */
        public void mo40215a(C20096c c20096c) {
            if (c20096c != null) {
                ToastUtils.m89268p(c20096c.m104492d());
            }
        }

        @Override // com.zing.zalo.common.chat.label.C7860a.c
        /* renamed from: b */
        public void mo40216b(Object obj) {
            if (ChatDialogView.this.f59781H0 != null) {
                ChatDialogView.this.f59781H0.mo70710wy(new Runnable() { // from class: com.zing.zalo.ui.chat.dialog.e

                    /* renamed from: q */
                    public final /* synthetic */ int f59817q;

                    public /* synthetic */ RunnableC11595e(int i11) {
                        r2 = i11;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        ChatDialogView.C11587j.this.m62981f(r2);
                    }
                });
            }
        }

        @Override // com.zing.zalo.common.chat.label.C7860a.c
        /* renamed from: c */
        public void mo40217c() {
            ChatDialogView.this.f59781H0.mo46829Y();
        }

        @Override // com.zing.zalo.common.chat.label.C7860a.c
        /* renamed from: d */
        public void mo40218d() {
            ChatDialogView.this.f59781H0.mo49315c4();
        }
    }

    /* renamed from: com.zing.zalo.ui.chat.dialog.ChatDialogView$k */
    /* loaded from: classes5.dex */
    class C11588k extends AbstractC23116k0.a {
        C11588k() {
        }

        @Override // me0.AbstractC23116k0.a
        /* renamed from: a */
        public void mo62982a(InterfaceC17463d interfaceC17463d, int i11, Object... objArr) {
            if (ChatDialogView.this.f59782I0 != null) {
                ChatDialogView.this.f59782I0.mo13037gh(i11, objArr);
            }
            interfaceC17463d.dismiss();
        }
    }

    /* renamed from: com.zing.zalo.ui.chat.dialog.ChatDialogView$l */
    /* loaded from: classes5.dex */
    public class C11589l implements InterfaceC31084b.a {

        /* renamed from: a */
        final /* synthetic */ int f59807a;

        C11589l(int i11) {
            this.f59807a = i11;
        }

        /* renamed from: f */
        public /* synthetic */ void m62985f() {
            ChatDialogView.this.dismiss();
        }

        /* renamed from: g */
        public /* synthetic */ void m62986g() {
            ChatDialogView.this.dismiss();
            if (ChatDialogView.this.f59781H0 != null) {
                C23744a.m124114c().m124116d(4, new Object[0]);
                C2834f.f11325a.m13689k();
                ChatDialogView.this.f59781H0.mo59706Ka(4);
            }
        }

        @Override // p693yu.InterfaceC31084b.a
        /* renamed from: a */
        public void mo62987a() {
        }

        @Override // p693yu.InterfaceC31084b.a
        /* renamed from: b */
        public void mo62988b() {
            try {
                if (C28644j.m143233Y().m143312x0(this.f59807a)) {
                    AbstractC19444a.m101695c(new Runnable() { // from class: com.zing.zalo.ui.chat.dialog.g
                        public /* synthetic */ RunnableC11597g() {
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            ChatDialogView.C11589l.this.m62986g();
                        }
                    });
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }

        @Override // p693yu.InterfaceC31084b.a
        /* renamed from: c */
        public void mo62989c(C20096c c20096c) {
            String string;
            try {
                if (c20096c.m104491c() == 50001) {
                    string = ChatDialogView.this.f59781H0.getContext().getString(AbstractC8020f0.error_message);
                } else if (c20096c.m104491c() == 1001) {
                    string = ChatDialogView.this.f59781H0.getContext().getString(AbstractC8020f0.str_error_sticker_cate_not_exist);
                } else {
                    string = ChatDialogView.this.f59781H0.getContext().getString(AbstractC8020f0.error_general);
                }
                ToastUtils.showMess(string);
                AbstractC19444a.m101695c(new Runnable() { // from class: com.zing.zalo.ui.chat.dialog.f
                    public /* synthetic */ RunnableC11596f() {
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        ChatDialogView.C11589l.this.m62985f();
                    }
                });
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    /* renamed from: com.zing.zalo.ui.chat.dialog.ChatDialogView$m */
    /* loaded from: classes5.dex */
    public interface InterfaceC11590m {
        void onDismiss();
    }

    /* renamed from: AM */
    private KeyEventCallbackC17462c m62822AM() {
        try {
            C16972e0.a aVar = new C16972e0.a(m92689tK());
            aVar.m90932i(C16972e0.b.DIALOG_INFORMATION).m90931h("popup_single_delete").m90947x("popup_single_delete_delete").m90937n("popup_single_delete_cancel").m90921E(true).m90943t(m92652XI(AbstractC8020f0.str_delete), new InterfaceC17463d.d() { // from class: b60.g0
                public /* synthetic */ C2604g0() {
                }

                @Override // com.zing.zalo.zview.dialog.InterfaceC17463d.d
                /* renamed from: K8 */
                public final void mo605K8(InterfaceC17463d interfaceC17463d, int i11) {
                    ChatDialogView.this.m62903eN(interfaceC17463d, i11);
                }
            }).m90934k(m92652XI(AbstractC8020f0.str_cancel), new InterfaceC17463d.d() { // from class: b60.h0
                @Override // com.zing.zalo.zview.dialog.InterfaceC17463d.d
                /* renamed from: K8 */
                public final void mo605K8(InterfaceC17463d interfaceC17463d, int i11) {
                    interfaceC17463d.dismiss();
                }
            }).m90918B(m92652XI(AbstractC8020f0.str_delete_my_cloud_thread_title));
            return aVar.m90927d();
        } catch (Exception e11) {
            AbstractC23350e.m122776f("ChatDialogView", e11);
            return null;
        }
    }

    /* renamed from: AN */
    public /* synthetic */ void m62823AN(ContactProfile contactProfile, View view) {
        String str;
        JSONObject m40406h0 = contactProfile.m40406h0();
        ChatView chatView = this.f59781H0;
        if (m40406h0 != null) {
            str = m40406h0.toString();
        } else {
            str = "";
        }
        chatView.mo60144oG(104, contactProfile, str);
        dismiss();
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ProcessVariables
        jadx.core.utils.exceptions.JadxRuntimeException: Method arg registers not loaded: b60.d1.<init>(android.content.Context, java.lang.String, int, java.lang.String):void, class status: GENERATED_AND_UNLOADED
        	at jadx.core.dex.nodes.MethodNode.getArgRegs(MethodNode.java:289)
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables$1.isArgUnused(ProcessVariables.java:146)
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables$1.lambda$isVarUnused$0(ProcessVariables.java:131)
        	at jadx.core.utils.ListUtils.allMatch(ListUtils.java:172)
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables$1.isVarUnused(ProcessVariables.java:131)
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables$1.processBlock(ProcessVariables.java:82)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:64)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:19)
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables.removeUnusedResults(ProcessVariables.java:73)
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables.visit(ProcessVariables.java:48)
        */
    /* renamed from: BM */
    public static com.zing.zalo.zview.dialog.KeyEventCallbackC17462c m62825BM(android.content.Context r9, android.os.Bundle r10) {
        /*
            java.lang.String r0 = ""
            java.lang.String r1 = "photo_path"
            java.lang.String r1 = r10.getString(r1, r0)     // Catch: java.lang.Exception -> L48
            java.lang.String r2 = "photo_caption"
            java.lang.String r0 = r10.getString(r2, r0)     // Catch: java.lang.Exception -> L48
            java.lang.String r2 = "photo_type"
            r3 = 2
            int r10 = r10.getInt(r2, r3)     // Catch: java.lang.Exception -> L48
            com.zing.zalo.dialog.j$a r2 = new com.zing.zalo.dialog.j$a     // Catch: java.lang.Exception -> L48
            r2.<init>(r9)     // Catch: java.lang.Exception -> L48
            r4 = 1
            com.zing.zalo.dialog.j$a r5 = r2.m43155d(r4)     // Catch: java.lang.Exception -> L48
            r6 = 3
            java.lang.String[] r6 = new java.lang.String[r6]     // Catch: java.lang.Exception -> L48
            int r7 = com.zing.zalo.AbstractC8020f0.str_copy_photo     // Catch: java.lang.Exception -> L48
            java.lang.String r7 = me0.AbstractC23136l9.m118743r0(r7)     // Catch: java.lang.Exception -> L48
            r8 = 0
            r6[r8] = r7     // Catch: java.lang.Exception -> L48
            int r7 = com.zing.zalo.AbstractC8020f0.str_copy_caption     // Catch: java.lang.Exception -> L48
            java.lang.String r7 = me0.AbstractC23136l9.m118743r0(r7)     // Catch: java.lang.Exception -> L48
            r6[r4] = r7     // Catch: java.lang.Exception -> L48
            int r4 = com.zing.zalo.AbstractC8020f0.str_cancel     // Catch: java.lang.Exception -> L48
            java.lang.String r4 = me0.AbstractC23136l9.m118743r0(r4)     // Catch: java.lang.Exception -> L48
            r6[r3] = r4     // Catch: java.lang.Exception -> L48
            b60.d1 r3 = new b60.d1     // Catch: java.lang.Exception -> L48
            r3.<init>()     // Catch: java.lang.Exception -> L48
            r5.m43160i(r6, r3)     // Catch: java.lang.Exception -> L48
            com.zing.zalo.dialog.j r9 = r2.m43152a()     // Catch: java.lang.Exception -> L48
            return r9
        L48:
            r9 = move-exception
            java.lang.String r10 = "ChatDialogView"
            mm0.AbstractC23350e.m122776f(r10, r9)
            r9 = 0
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zing.zalo.p077ui.chat.dialog.ChatDialogView.m62825BM(android.content.Context, android.os.Bundle):com.zing.zalo.zview.dialog.c");
    }

    /* renamed from: BN */
    public /* synthetic */ void m62826BN(C32108s9 c32108s9, C31877d c31877d, InterfaceC17463d interfaceC17463d, int i11) {
        this.f59781H0.mo60271wv(c32108s9.m154991g(), c32108s9.m154992h(), null, c31877d);
    }

    /* renamed from: CM */
    public static ChatDialogView m62828CM(int i11, ChatView chatView, InterfaceC2585a interfaceC2585a, Object obj, String str) {
        ChatDialogView chatDialogView = new ChatDialogView();
        chatDialogView.m62967MN(chatView);
        chatDialogView.m62968NN(interfaceC2585a);
        chatDialogView.m62970PN(obj);
        Bundle bundle = new Bundle();
        bundle.putInt("id", i11);
        bundle.putString("STR_LOG_CHAT_TYPE", str);
        chatDialogView.mo60305zK(bundle);
        if (i11 != 109 && i11 != 110 && i11 != 118 && i11 != 119 && i11 != 125 && i11 != 173 && i11 != 136 && i11 != 137 && i11 != 170 && i11 != 171) {
            switch (i11) {
            }
        }
        chatDialogView.mo43041MK(false);
        return chatDialogView;
    }

    /* renamed from: CN */
    public static /* synthetic */ void m62829CN(String str, Integer num, boolean z11, InterfaceC17463d interfaceC17463d, int i11) {
        int i12;
        C31986k3 c31986k3 = C31986k3.f147083a;
        int intValue = num.intValue();
        if (z11) {
            i12 = 5;
        } else {
            i12 = 0;
        }
        c31986k3.m154104P0(str, intValue, i12, 0L);
    }

    /* renamed from: DM */
    public /* synthetic */ void m62831DM(InterfaceC17463d interfaceC17463d, int i11) {
        InterfaceC2585a interfaceC2585a = this.f59782I0;
        if (interfaceC2585a != null) {
            interfaceC2585a.mo13040k7();
        }
    }

    /* renamed from: DN */
    public static /* synthetic */ C24848g0 m62832DN() {
        return null;
    }

    /* renamed from: EM */
    public /* synthetic */ void m62834EM(InterfaceC17463d interfaceC17463d, int i11) {
        InterfaceC2585a interfaceC2585a = this.f59782I0;
        if (interfaceC2585a != null) {
            interfaceC2585a.mo13019J8();
        }
    }

    /* renamed from: EN */
    public /* synthetic */ void m62835EN(boolean z11, String str, String str2, URLSpan uRLSpan, boolean z12, InterfaceC17463d interfaceC17463d, int i11) {
        ChatView chatView;
        try {
            if (z11) {
                if (i11 != 0) {
                    if (i11 != 1) {
                        if (i11 == 2 && (chatView = this.f59781H0) != null) {
                            chatView.m60147oU(str);
                            C2526d.f10270a.m12731w0(str2, "csc_msgmenu", JumpLinkSettingBottomView.EnumC14502b.f74557r.m81045c());
                            ZaloBubbleActivity.m57031a5();
                        }
                    } else {
                        ChatView chatView2 = this.f59781H0;
                        if (chatView2 != null) {
                            chatView2.mo60063jA(str);
                            C2526d.f10270a.m12731w0(str2, "csc_msgmenu", JumpLinkSettingBottomView.EnumC14502b.f74556q.m81045c());
                        }
                    }
                } else {
                    ClipboardManagerOnPrimaryClipChangedListenerC23245w.m119767f(getContext(), str, new SensitiveData("clipboard_copy_text_attributed_label_dialog", "comm_csc"));
                }
            } else {
                AbstractC23647d.m123897g("400809");
                if (i11 != 0) {
                    if (i11 != 1) {
                        if (i11 != 2) {
                            if (i11 == 3 && !z12) {
                                AbstractC23647d.m123897g("400804");
                                AbstractC0852x.m2336M("", str);
                                C2526d.m12671v0("csc_message", this.f59781H0.m60004fQ());
                            }
                        } else {
                            AbstractC23647d.m123897g("400803");
                            ChatView chatView3 = this.f59781H0;
                            if (chatView3 != null && !this.f59785L0) {
                                chatView3.mo46829Y();
                                this.f59785L0 = true;
                                String m121779c5 = AbstractC23309i.m121779c5();
                                if (m121779c5 == null) {
                                    m121779c5 = AbstractC23309i.m121704a5();
                                }
                                C0766k c0766k = new C0766k();
                                c0766k.mo1704o8(new C11584g(str));
                                c0766k.mo1583Y9(str, m121779c5, 1);
                            }
                        }
                    } else {
                        AbstractC23647d.m123897g("400801");
                        uRLSpan.onClick(this.f59781H0.m92656bJ());
                        ZaloBubbleActivity.m57031a5();
                    }
                } else {
                    AbstractC23647d.m123897g("400802");
                    ClipboardManagerOnPrimaryClipChangedListenerC23245w.m119767f(getContext(), str, new SensitiveData("clipboard_copy_text_attributed_label_dialog", "comm_csc"));
                    C2526d.m12661k("csc_message", this.f59781H0.m60004fQ());
                }
            }
            interfaceC17463d.dismiss();
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: FM */
    public /* synthetic */ void m62837FM(InterfaceC17463d interfaceC17463d) {
        InterfaceC2585a interfaceC2585a = this.f59782I0;
        if (interfaceC2585a != null) {
            interfaceC2585a.mo13040k7();
        }
    }

    /* renamed from: GM */
    public /* synthetic */ void m62840GM(InterfaceC17463d interfaceC17463d, int i11) {
        InterfaceC2585a interfaceC2585a = this.f59782I0;
        if (interfaceC2585a != null) {
            interfaceC2585a.mo13053xn();
        }
    }

    /* renamed from: GN */
    public /* synthetic */ void m62841GN(String str, InterfaceC17463d interfaceC17463d, int i11) {
        m62966LN(str);
        interfaceC17463d.dismiss();
        AbstractC23126l.m118627a("Intive friend in Phone List");
    }

    /* renamed from: HM */
    public static /* synthetic */ void m62843HM(Conversation conversation, InterfaceC17463d interfaceC17463d, int i11) {
        C32044o1.m154612r().m154616K("rmenu", Collections.singletonList(conversation.f42893q), false);
        interfaceC17463d.dismiss();
    }

    /* renamed from: IM */
    public /* synthetic */ void m62846IM(boolean z11, Object obj, InterfaceC17463d interfaceC17463d, int i11) {
        InterfaceC2585a interfaceC2585a = this.f59782I0;
        if (interfaceC2585a != null) {
            interfaceC2585a.mo13024Mm(false, z11, obj);
        }
    }

    /* renamed from: JM */
    public /* synthetic */ void m62849JM(List list, InterfaceC17463d interfaceC17463d, int i11) {
        m62866QN(list);
        interfaceC17463d.dismiss();
    }

    /* renamed from: JN */
    public static /* synthetic */ void m62850JN(AbstractC27282a abstractC27282a, InterfaceC17463d interfaceC17463d, int i11) {
        try {
            if (abstractC27282a.m139676h()) {
                C28905e.m144373n().m144401w(abstractC27282a.m139674f(), 2, C23793c.m124316k().mo124311f());
            }
            if (interfaceC17463d != null) {
                interfaceC17463d.dismiss();
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: KM */
    public /* synthetic */ void m62852KM(CheckBox checkBox, boolean z11, Object obj, InterfaceC17463d interfaceC17463d, int i11) {
        List list;
        if (checkBox.isChecked()) {
            AbstractC23309i.m121031Hz(true);
        }
        if (z11) {
            list = (List) obj;
        } else {
            ArrayList arrayList = new ArrayList();
            arrayList.add((C17945a0) obj);
            list = arrayList;
        }
        m62866QN(list);
    }

    /* renamed from: KN */
    public static /* synthetic */ void m62853KN(C10862a0 c10862a0, InterfaceC17463d interfaceC17463d, int i11) {
        try {
            ZOMInsight zOMInsight = new ZOMInsight(c10862a0.m56345e());
            JSONObject valueJson = zOMInsight.getValueJson();
            JSONObject optJSONObject = valueJson.optJSONObject("params");
            if (optJSONObject == null) {
                optJSONObject = new JSONObject();
            }
            optJSONObject.put("dialog", "0");
            valueJson.put("params", optJSONObject);
            zOMInsight.updateValueJson(valueJson);
            AbstractC17155h1.m91735b(AbstractC17148f0.m91690i(c10862a0.m56343c()), c10862a0.m56350j(), c10862a0.m56351k(), zOMInsight);
            if (interfaceC17463d != null) {
                interfaceC17463d.dismiss();
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: LM */
    public /* synthetic */ void m62855LM(CheckBox checkBox, boolean z11, Object obj, InterfaceC17463d interfaceC17463d, int i11) {
        if (checkBox.isChecked()) {
            AbstractC23309i.m121031Hz(true);
        }
        InterfaceC2585a interfaceC2585a = this.f59782I0;
        if (interfaceC2585a != null) {
            interfaceC2585a.mo13024Mm(false, z11, obj);
        }
    }

    /* renamed from: NM */
    public /* synthetic */ void m62859NM(List list, InterfaceC17463d interfaceC17463d, int i11) {
        m62866QN(list);
    }

    /* renamed from: OM */
    public /* synthetic */ void m62861OM(List list, InterfaceC17463d interfaceC17463d, int i11) {
        try {
            InterfaceC2585a interfaceC2585a = this.f59782I0;
            if (interfaceC2585a != null) {
                interfaceC2585a.mo13034Z9(list, false);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: PM */
    public /* synthetic */ void m62863PM(List list, InterfaceC17463d interfaceC17463d, int i11) {
        InterfaceC2585a interfaceC2585a = this.f59782I0;
        if (interfaceC2585a != null) {
            interfaceC2585a.mo13034Z9(list, false);
        }
    }

    /* renamed from: QM */
    public /* synthetic */ void m62865QM(List list, InterfaceC17463d interfaceC17463d, int i11) {
        m62866QN(list);
        interfaceC17463d.dismiss();
    }

    /* renamed from: QN */
    private void m62866QN(List list) {
        C31950hc.f146830a.m153638L("csc_msgmenu", 0, "msg_chat_delete_withdraw", list, null);
    }

    /* renamed from: RM */
    public /* synthetic */ void m62868RM(List list, InterfaceC17463d interfaceC17463d, int i11) {
        m62866QN(list);
    }

    /* renamed from: SM */
    public /* synthetic */ void m62870SM(List list, InterfaceC17463d interfaceC17463d, int i11) {
        InterfaceC2585a interfaceC2585a = this.f59782I0;
        if (interfaceC2585a != null) {
            interfaceC2585a.mo13034Z9(list, true);
        }
    }

    /* renamed from: TM */
    public /* synthetic */ void m62872TM(Object obj, InterfaceC17463d interfaceC17463d, int i11) {
        InterfaceC2585a interfaceC2585a = this.f59782I0;
        if (interfaceC2585a != null) {
            interfaceC2585a.mo13024Mm(false, false, obj);
        }
    }

    /* renamed from: UM */
    public /* synthetic */ void m62874UM(C17945a0 c17945a0, InterfaceC17463d interfaceC17463d, int i11) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(c17945a0);
        m62866QN(arrayList);
        interfaceC17463d.dismiss();
    }

    /* renamed from: VM */
    public /* synthetic */ void m62876VM(List list, InterfaceC17463d interfaceC17463d, int i11) {
        InterfaceC2585a interfaceC2585a = this.f59782I0;
        if (interfaceC2585a != null) {
            interfaceC2585a.mo13044ml(list);
        }
        if (interfaceC17463d != null) {
            interfaceC17463d.dismiss();
        }
    }

    /* renamed from: WM */
    public static /* synthetic */ void m62879WM(Context context, Object obj, InterfaceC17463d interfaceC17463d, int i11) {
        try {
            ClipboardManagerOnPrimaryClipChangedListenerC23245w.m119767f(context, ((String[]) obj)[i11], new SensitiveData("clipboard_copy_text_attributed_label_dialog", "comm_csc"));
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: XM */
    public /* synthetic */ void m62882XM(boolean z11, Object obj, InterfaceC17463d interfaceC17463d, int i11) {
        InterfaceC2585a interfaceC2585a = this.f59782I0;
        if (interfaceC2585a != null) {
            interfaceC2585a.mo13024Mm(true, z11, obj);
        }
    }

    /* renamed from: YM */
    public /* synthetic */ void m62885YM(boolean z11, Object obj, InterfaceC17463d interfaceC17463d, int i11) {
        boolean z12;
        if (i11 == 1) {
            z12 = true;
        } else {
            z12 = false;
        }
        if (z12 && AbstractC23309i.m122094kg()) {
            AbstractC23309i.m122290po(false);
            String m119211P = AbstractC23160o0.m119211P(AbstractC23309i.m121226N8() * 1000);
            C8009j.a aVar = new C8009j.a(this.f59781H0.getContext());
            aVar.m43159h(4);
            aVar.m43162k(String.format(m92652XI(AbstractC8020f0.str_delete_message_for_everyone_intro), m119211P));
            aVar.m43155d(false);
            aVar.m43169r(AbstractC8020f0.close, new InterfaceC17463d.d() { // from class: b60.c1

                /* renamed from: q */
                public final /* synthetic */ boolean f10513q;

                /* renamed from: r */
                public final /* synthetic */ Object f10514r;

                public /* synthetic */ C2593c1(boolean z112, Object obj2) {
                    r2 = z112;
                    r3 = obj2;
                }

                @Override // com.zing.zalo.zview.dialog.InterfaceC17463d.d
                /* renamed from: K8 */
                public final void mo605K8(InterfaceC17463d interfaceC17463d2, int i12) {
                    ChatDialogView.this.m62882XM(r2, r3, interfaceC17463d2, i12);
                }
            });
            aVar.m43151B();
            return;
        }
        InterfaceC2585a interfaceC2585a = this.f59782I0;
        if (interfaceC2585a != null) {
            interfaceC2585a.mo13024Mm(z12, z112, obj2);
        }
    }

    /* renamed from: ZM */
    public /* synthetic */ void m62888ZM(List list, InterfaceC17463d interfaceC17463d, int i11) {
        m62866QN(list);
        interfaceC17463d.dismiss();
    }

    /* renamed from: aN */
    public /* synthetic */ void m62891aN(List list, InterfaceC17463d interfaceC17463d, int i11) {
        m62866QN(list);
        interfaceC17463d.dismiss();
    }

    /* renamed from: bN */
    public /* synthetic */ void m62894bN(C31973j5 c31973j5, InterfaceC17463d interfaceC17463d, int i11) {
        if (interfaceC17463d != null) {
            interfaceC17463d.dismiss();
        }
        InterfaceC2585a interfaceC2585a = this.f59782I0;
        if (interfaceC2585a != null) {
            interfaceC2585a.mo13030We(c31973j5);
        }
    }

    /* renamed from: cN */
    public /* synthetic */ void m62897cN(int i11, C31931g8 c31931g8) {
        InterfaceC2585a interfaceC2585a = this.f59782I0;
        if (interfaceC2585a != null) {
            interfaceC2585a.mo13031Xg(i11, c31931g8);
        }
    }

    /* renamed from: dN */
    public /* synthetic */ void m62900dN(boolean z11, Object obj, InterfaceC17463d interfaceC17463d, int i11) {
        InterfaceC2585a interfaceC2585a = this.f59782I0;
        if (interfaceC2585a != null) {
            interfaceC2585a.mo13024Mm(false, z11, obj);
        }
    }

    /* renamed from: eN */
    public /* synthetic */ void m62903eN(InterfaceC17463d interfaceC17463d, int i11) {
        InterfaceC2585a interfaceC2585a = this.f59782I0;
        if (interfaceC2585a != null) {
            interfaceC2585a.mo13053xn();
        }
    }

    /* renamed from: gN */
    public static /* synthetic */ void m62909gN(Context context, String str, int i11, String str2, InterfaceC17463d interfaceC17463d, int i12) {
        if (i12 == 0) {
            ClipboardManagerOnPrimaryClipChangedListenerC23245w.f112633a.m119775b(context, str, i11);
        } else if (i12 == 1) {
            ClipboardManagerOnPrimaryClipChangedListenerC23245w.m119767f(context, str2, new SensitiveData("clipboard_copy_text_attributed_label_dialog", "comm_csc"));
        } else {
            interfaceC17463d.dismiss();
        }
    }

    /* renamed from: hN */
    public /* synthetic */ void m62911hN(int i11, String str, int i12, String str2, boolean z11) {
        if (this.f59782I0 != null) {
            JSONObject jSONObject = new JSONObject();
            if (i11 == 407) {
                try {
                    jSONObject.put("globalMsgId", ((C17945a0) this.f59781H0.m60020gQ().mo60562Fi().get(0)).m95029V3().m41047k());
                    if (z11) {
                        jSONObject.put("msgContent", ((C17945a0) this.f59781H0.m60020gQ().mo60562Fi().get(0)).m95019U3());
                    }
                    this.f59781H0.m60020gQ().mo60591K3((C17945a0) this.f59781H0.m60020gQ().mo60562Fi().get(0));
                } catch (Exception e11) {
                    e11.printStackTrace();
                }
            }
            this.f59782I0.mo13049rf(str, i12, str2, z11, jSONObject.toString());
        }
    }

    /* renamed from: iM */
    private KeyEventCallbackC17462c m62913iM(Object obj) {
        String str;
        int intValue = ((Integer) obj).intValue();
        if (intValue == 1) {
            str = AbstractC23136l9.m118743r0(AbstractC8020f0.str_tv_banned_user);
        } else if (intValue == 2) {
            str = AbstractC23136l9.m118743r0(AbstractC8020f0.str_tv_deleted_user_v2);
        } else {
            str = "";
        }
        C8009j.a aVar = new C8009j.a(this.f59781H0.getContext());
        aVar.m43171t(AbstractC8020f0.str_titleDlg9);
        aVar.m43162k(str).m43170s(AbstractC23136l9.m118743r0(AbstractC8020f0.str_close), this.f59788O0);
        return aVar.m43152a();
    }

    /* renamed from: iN */
    public /* synthetic */ void m62914iN(String str, int i11, String str2) {
        InterfaceC2585a interfaceC2585a = this.f59782I0;
        if (interfaceC2585a != null) {
            interfaceC2585a.mo13042lc(str, i11, str2);
        }
    }

    /* renamed from: jM */
    private KeyEventCallbackC17462c m62916jM(Object obj) {
        return AbstractC23093i.m118459l(this.f59781H0.getContext(), new InterfaceC17463d.d() { // from class: b60.l0
            public /* synthetic */ C2617l0() {
            }

            @Override // com.zing.zalo.zview.dialog.InterfaceC17463d.d
            /* renamed from: K8 */
            public final void mo605K8(InterfaceC17463d interfaceC17463d, int i11) {
                ChatDialogView.this.m62831DM(interfaceC17463d, i11);
            }
        }, new InterfaceC17463d.d() { // from class: b60.m0
            public /* synthetic */ C2619m0() {
            }

            @Override // com.zing.zalo.zview.dialog.InterfaceC17463d.d
            /* renamed from: K8 */
            public final void mo605K8(InterfaceC17463d interfaceC17463d, int i11) {
                ChatDialogView.this.m62834EM(interfaceC17463d, i11);
            }
        }, new InterfaceC17463d.c() { // from class: b60.n0
            public /* synthetic */ C2621n0() {
            }

            @Override // com.zing.zalo.zview.dialog.InterfaceC17463d.c
            /* renamed from: p7 */
            public final void mo13013p7(InterfaceC17463d interfaceC17463d) {
                ChatDialogView.this.m62837FM(interfaceC17463d);
            }
        });
    }

    /* renamed from: jN */
    public static /* synthetic */ void m62917jN(InterfaceC17463d interfaceC17463d, int i11) {
        AbstractC23309i.m122327qo(false);
        if (interfaceC17463d != null) {
            interfaceC17463d.dismiss();
        }
    }

    /* renamed from: kM */
    private KeyEventCallbackC17462c m62919kM(Object obj) {
        String m92653YI;
        Conversation conversation = (Conversation) obj;
        String m40999b = conversation.m40999b(true, false);
        if (!conversation.m41013q() && !AbstractC21935u.m114518H(conversation.f42893q)) {
            m92653YI = m92653YI(AbstractC8020f0.str_confirm_delete_dialog_single_contact_title, m40999b);
        } else {
            m92653YI = m92653YI(AbstractC8020f0.str_confirm_delete_dialog_single_conversation_title, m40999b);
        }
        try {
            C16972e0.a aVar = new C16972e0.a(m92689tK());
            aVar.m90932i(C16972e0.b.DIALOG_INFORMATION).m90931h("popup_single_delete").m90947x("popup_single_delete_delete").m90937n("popup_single_delete_cancel").m90921E(true).m90943t(m92652XI(AbstractC8020f0.str_storage_btn_delete_conversation), new InterfaceC17463d.d() { // from class: b60.z
                public /* synthetic */ C2644z() {
                }

                @Override // com.zing.zalo.zview.dialog.InterfaceC17463d.d
                /* renamed from: K8 */
                public final void mo605K8(InterfaceC17463d interfaceC17463d, int i11) {
                    ChatDialogView.this.m62840GM(interfaceC17463d, i11);
                }
            }).m90934k(m92652XI(AbstractC8020f0.str_cancel), new InterfaceC17463d.d() { // from class: b60.a0
                public /* synthetic */ C2586a0() {
                }

                @Override // com.zing.zalo.zview.dialog.InterfaceC17463d.d
                /* renamed from: K8 */
                public final void mo605K8(InterfaceC17463d interfaceC17463d, int i11) {
                    ChatDialogView.m62843HM(Conversation.this, interfaceC17463d, i11);
                }
            }).m90918B(m92653YI);
            return aVar.m90927d();
        } catch (Exception e11) {
            AbstractC20110a.m104543l("ChatDialogView").mo104552e(e11);
            return null;
        }
    }

    /* renamed from: kN */
    public /* synthetic */ void m62920kN(SimpleAdapter simpleAdapter, int i11, ContactProfile contactProfile, int i12, InterfaceC17463d interfaceC17463d, int i13) {
        if (interfaceC17463d != null) {
            try {
                interfaceC17463d.dismiss();
            } catch (Exception e11) {
                e11.printStackTrace();
                return;
            }
        }
        int intValue = ((Integer) ((HashMap) simpleAdapter.getItem(i13)).get("id")).intValue();
        if (intValue == AbstractC8020f0.str_mode_call_normal) {
            this.f59781H0.mo59614Dk(i11, contactProfile);
        } else if (intValue == AbstractC8020f0.str_mode_call_video) {
            this.f59781H0.mo59855Ua(i12, contactProfile);
        }
    }

    /* renamed from: lM */
    private KeyEventCallbackC17462c m62922lM(Object obj) {
        List arrayList;
        boolean z11 = obj instanceof List;
        if (z11) {
            arrayList = (List) obj;
        } else {
            arrayList = new ArrayList();
            arrayList.add((C17945a0) obj);
        }
        C8009j.a aVar = new C8009j.a(this.f59781H0.m92648SI());
        aVar.m43159h(1).m43172u(m92651WI().getQuantityString(AbstractC7921d0.plural_delete_multi_messages_for_me_title, arrayList.size(), Integer.valueOf(arrayList.size()))).m43162k(AbstractC19620d0.m102671H(arrayList, false)).m43155d(true).m43170s(m92652XI(AbstractC8020f0.str_delete_msg), new InterfaceC17463d.d() { // from class: b60.w

            /* renamed from: q */
            public final /* synthetic */ boolean f10595q;

            /* renamed from: r */
            public final /* synthetic */ Object f10596r;

            public /* synthetic */ C2638w(boolean z112, Object obj2) {
                r2 = z112;
                r3 = obj2;
            }

            @Override // com.zing.zalo.zview.dialog.InterfaceC17463d.d
            /* renamed from: K8 */
            public final void mo605K8(InterfaceC17463d interfaceC17463d, int i11) {
                ChatDialogView.this.m62846IM(r2, r3, interfaceC17463d, i11);
            }
        }).m43165n(m92652XI(AbstractC8020f0.str_cancel), new InterfaceC17463d.d() { // from class: b60.y

            /* renamed from: q */
            public final /* synthetic */ List f10611q;

            public /* synthetic */ C2642y(List arrayList2) {
                r2 = arrayList2;
            }

            @Override // com.zing.zalo.zview.dialog.InterfaceC17463d.d
            /* renamed from: K8 */
            public final void mo605K8(InterfaceC17463d interfaceC17463d, int i11) {
                ChatDialogView.this.m62849JM(r2, interfaceC17463d, i11);
            }
        });
        AbstractC0924m0.m3377Ql(true);
        return aVar.m43152a();
    }

    /* renamed from: lN */
    public /* synthetic */ void m62923lN(String str, SimpleAdapter simpleAdapter, LinkedHashMap linkedHashMap, ArrayList arrayList, InterfaceC17463d interfaceC17463d, int i11) {
        try {
            ArrayList arrayList2 = new ArrayList();
            arrayList2.add(str);
            HashMap hashMap = (HashMap) simpleAdapter.getItem(i11);
            if (hashMap.get("id") != null) {
                int intValue = ((Integer) hashMap.get("id")).intValue();
                if (!linkedHashMap.containsKey(Integer.valueOf(intValue))) {
                    if (intValue != -1) {
                        C7860a.b bVar = C7860a.Companion;
                        bVar.m40303b().m40295v(intValue, arrayList2, new C11586i(intValue), bVar.m40303b().m40261E(C23648e.Companion.m123930b(), "rmenu", "chat_label", 0, arrayList));
                    } else {
                        for (C18431b c18431b : linkedHashMap.values()) {
                            if (c18431b.m97665c() != intValue) {
                                C7860a.b bVar2 = C7860a.Companion;
                                bVar2.m40303b().m40288j0(c18431b.m97665c(), arrayList2, new C11587j(intValue), bVar2.m40303b().m40261E(C23648e.Companion.m123930b(), "rmenu", "chat_unlabel", 0, arrayList));
                            }
                        }
                    }
                }
            }
            if (interfaceC17463d != null) {
                interfaceC17463d.dismiss();
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ProcessVariables
        jadx.core.utils.exceptions.JadxRuntimeException: Method arg registers not loaded: b60.w0.<init>(com.zing.zalo.ui.chat.dialog.ChatDialogView, android.widget.CheckBox, boolean, java.lang.Object):void, class status: GENERATED_AND_UNLOADED
        	at jadx.core.dex.nodes.MethodNode.getArgRegs(MethodNode.java:289)
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables$1.isArgUnused(ProcessVariables.java:146)
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables$1.lambda$isVarUnused$0(ProcessVariables.java:131)
        	at jadx.core.utils.ListUtils.allMatch(ListUtils.java:172)
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables$1.isVarUnused(ProcessVariables.java:131)
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables$1.processBlock(ProcessVariables.java:82)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:64)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:19)
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables.removeUnusedResults(ProcessVariables.java:73)
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables.visit(ProcessVariables.java:48)
        */
    /* renamed from: mM */
    private com.zing.zalo.zview.dialog.KeyEventCallbackC17462c m62925mM(java.lang.Object r11) {
        /*
            r10 = this;
            boolean r0 = r11 instanceof java.util.List
            android.content.Context r1 = r10.m92648SI()
            android.view.LayoutInflater r1 = android.view.LayoutInflater.from(r1)
            int r2 = com.zing.zalo.AbstractC7409c0.layout_confirm_not_show_again
            r3 = 0
            android.view.View r1 = r1.inflate(r2, r3)
            int r2 = com.zing.zalo.AbstractC6918a0.cb_not_show_again
            android.view.View r2 = r1.findViewById(r2)
            android.widget.CheckBox r2 = (android.widget.CheckBox) r2
            r3 = 1098907648(0x41800000, float:16.0)
            int r8 = me0.AbstractC23136l9.m118742r(r3)
            com.zing.zalo.dialog.j$a r3 = new com.zing.zalo.dialog.j$a
            android.content.Context r4 = r10.m92648SI()
            r3.<init>(r4)
            r4 = 7
            com.zing.zalo.dialog.j$a r4 = r3.m43159h(r4)
            int r5 = com.zing.zalo.AbstractC8020f0.str_dialog_confirm_delete_msg_content
            java.lang.String r5 = r10.m92652XI(r5)
            com.zing.zalo.dialog.j$a r4 = r4.m43162k(r5)
            r5 = 1
            com.zing.zalo.dialog.j$a r4 = r4.m43155d(r5)
            r9 = 0
            r5 = r1
            r6 = r8
            r7 = r8
            com.zing.zalo.dialog.j$a r4 = r4.m43150A(r5, r6, r7, r8, r9)
            int r5 = com.zing.zalo.AbstractC8020f0.str_close
            java.lang.String r5 = r10.m92652XI(r5)
            b60.w0 r6 = new b60.w0
            r6.<init>()
            com.zing.zalo.dialog.j$a r4 = r4.m43165n(r5, r6)
            int r5 = com.zing.zalo.AbstractC8020f0.str_delete_msg
            java.lang.String r5 = r10.m92652XI(r5)
            b60.x0 r6 = new b60.x0
            r6.<init>()
            r4.m43170s(r5, r6)
            int r11 = com.zing.zalo.AbstractC6918a0.tv_not_show_again
            android.view.View r11 = r1.findViewById(r11)
            if (r11 == 0) goto L71
            b60.y0 r0 = new b60.y0
            r0.<init>()
            r11.setOnClickListener(r0)
        L71:
            com.zing.zalo.dialog.j r11 = r3.m43152a()
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zing.zalo.p077ui.chat.dialog.ChatDialogView.m62925mM(java.lang.Object):com.zing.zalo.zview.dialog.c");
    }

    /* renamed from: mN */
    public /* synthetic */ void m62926mN(C31973j5 c31973j5, InterfaceC17463d interfaceC17463d, int i11) {
        int i12;
        if (i11 == -1) {
            if (interfaceC17463d != null) {
                interfaceC17463d.dismiss();
            }
            if (c31973j5.m153747Y()) {
                i12 = AbstractC8020f0.str_select_new_community_owner;
            } else {
                i12 = AbstractC8020f0.str_select_new_group_owner;
            }
            Bundle m80656XN = GroupSelectNewOwnerView.m80656XN(AbstractC23136l9.m118743r0(i12));
            m80656XN.putString("extra_group_id", c31973j5.m153781r());
            m80656XN.putString("extra_activity_title", AbstractC23136l9.m118743r0(i12));
            m80656XN.putBoolean("BOL_EXTRA_LEAVE_GROUP_AFTER_SELECTED_NEW_GROUP_OWNER", false);
            if (m92676n2() != null && m92676n2().mo35579p() != null) {
                m92676n2().mo35579p().m93066i2(GroupSelectNewOwnerView.class, m80656XN, 1049, 1, true);
            }
        }
    }

    /* renamed from: nM */
    private KeyEventCallbackC17462c m62928nM(Object obj) {
        try {
            List list = (List) obj;
            return new C8009j.a(m92648SI()).m43159h(7).m43172u(getContext().getResources().getQuantityString(AbstractC7921d0.plural_delete_multi_messages_for_me_title, list.size(), Integer.valueOf(list.size()))).m43173v(2).m43162k(AbstractC19620d0.m102671H(list, false)).m43155d(true).m43165n(m92652XI(AbstractC8020f0.str_cancel), new InterfaceC17463d.d() { // from class: b60.z0

                /* renamed from: q */
                public final /* synthetic */ List f10615q;

                public /* synthetic */ C2645z0(List list2) {
                    r2 = list2;
                }

                @Override // com.zing.zalo.zview.dialog.InterfaceC17463d.d
                /* renamed from: K8 */
                public final void mo605K8(InterfaceC17463d interfaceC17463d, int i11) {
                    ChatDialogView.this.m62859NM(r2, interfaceC17463d, i11);
                }
            }).m43170s(m92652XI(AbstractC8020f0.str_delete), new InterfaceC17463d.d() { // from class: b60.a1

                /* renamed from: q */
                public final /* synthetic */ List f10499q;

                public /* synthetic */ C2587a1(List list2) {
                    r2 = list2;
                }

                @Override // com.zing.zalo.zview.dialog.InterfaceC17463d.d
                /* renamed from: K8 */
                public final void mo605K8(InterfaceC17463d interfaceC17463d, int i11) {
                    ChatDialogView.this.m62861OM(r2, interfaceC17463d, i11);
                }
            }).m43152a();
        } catch (Exception e11) {
            e11.printStackTrace();
            return null;
        }
    }

    /* renamed from: nN */
    public /* synthetic */ void m62929nN(ContactProfile contactProfile, InterfaceC17463d interfaceC17463d, int i11) {
        if (interfaceC17463d != null) {
            interfaceC17463d.dismiss();
        }
        if (contactProfile != null && !TextUtils.isEmpty(contactProfile.f42434r)) {
            Bundle m140776b = new C27870vb(contactProfile.mo2478b()).m140780g(contactProfile).m140776b();
            if (m92676n2() != null) {
                m92676n2().mo35573l4(ChatView.class, m140776b, 1, true);
            }
        }
    }

    /* renamed from: oM */
    private KeyEventCallbackC17462c m62931oM(Object obj) {
        try {
            ArrayList arrayList = new ArrayList((List) obj);
            boolean m103081x = AbstractC19656s0.m103081x(arrayList);
            boolean m94889F6 = ((C17945a0) arrayList.get(0)).m94889F6();
            int size = arrayList.size();
            C0708i c0708i = new C0708i();
            c0708i.m1072c("msg_type", !m103081x ? 1 : 0);
            c0708i.m1072c("is_mycloud", m94889F6 ? 1 : 0);
            c0708i.m1072c("delete_count", size);
            C16972e0.a aVar = new C16972e0.a(m92689tK());
            aVar.m90932i(C16972e0.b.DIALOG_INFORMATION).m90931h("popup_multi_delete").m90921E(true).m90947x("popup_multi_delete_delete").m90937n("popup_multi_delete_cancel").m90930g(c0708i).m90946w(c0708i).m90936m(c0708i).m90943t(m92652XI(AbstractC8020f0.str_delete), new InterfaceC17463d.d() { // from class: b60.u0

                /* renamed from: q */
                public final /* synthetic */ List f10590q;

                public /* synthetic */ C2635u0(List arrayList2) {
                    r2 = arrayList2;
                }

                @Override // com.zing.zalo.zview.dialog.InterfaceC17463d.d
                /* renamed from: K8 */
                public final void mo605K8(InterfaceC17463d interfaceC17463d, int i11) {
                    ChatDialogView.this.m62863PM(r2, interfaceC17463d, i11);
                }
            }).m90934k(m92652XI(AbstractC8020f0.str_cancel), new InterfaceC17463d.d() { // from class: b60.v0

                /* renamed from: q */
                public final /* synthetic */ List f10593q;

                public /* synthetic */ C2637v0(List arrayList2) {
                    r2 = arrayList2;
                }

                @Override // com.zing.zalo.zview.dialog.InterfaceC17463d.d
                /* renamed from: K8 */
                public final void mo605K8(InterfaceC17463d interfaceC17463d, int i11) {
                    ChatDialogView.this.m62865QM(r2, interfaceC17463d, i11);
                }
            });
            if (m103081x && !m94889F6 && AbstractC19656s0.m103082y(arrayList2)) {
                aVar.m90918B(m92651WI().getQuantityString(AbstractC7921d0.plural_delete_multi_messages_for_me_title, size, Integer.valueOf(size))).m90949z(AbstractC1463b.m7440a(m92652XI(AbstractC8020f0.str_delete_msg_des_popup), 63));
            } else if (m94889F6) {
                aVar.m90918B(m92651WI().getQuantityString(AbstractC7921d0.str_title_delete_message_my_cloud_v2, size, Integer.valueOf(size)));
            } else {
                aVar.m90949z(m92651WI().getQuantityString(AbstractC7921d0.plural_delete_multi_messages_for_me_title, size, Integer.valueOf(size)));
            }
            return aVar.m90927d();
        } catch (Exception e11) {
            AbstractC20110a.m104539h(e11);
            return null;
        }
    }

    /* renamed from: oN */
    public static /* synthetic */ boolean m62932oN(TextView textView, int i11, KeyEvent keyEvent) {
        if (keyEvent != null && keyEvent.getKeyCode() == 66) {
            return true;
        }
        return false;
    }

    /* renamed from: pM */
    private KeyEventCallbackC17462c m62934pM(Object obj) {
        try {
            List list = (List) obj;
            return new C8009j.a(m92648SI()).m43159h(7).m43155d(true).m43172u(getContext().getResources().getQuantityString(AbstractC7921d0.plural_delete_multi_messages_for_admin_title, list.size(), Integer.valueOf(list.size()))).m43162k(AbstractC19620d0.m102671H(list, true)).m43165n(m92652XI(AbstractC8020f0.str_cancel), new InterfaceC17463d.d() { // from class: b60.c0

                /* renamed from: q */
                public final /* synthetic */ List f10511q;

                public /* synthetic */ C2592c0(List list2) {
                    r2 = list2;
                }

                @Override // com.zing.zalo.zview.dialog.InterfaceC17463d.d
                /* renamed from: K8 */
                public final void mo605K8(InterfaceC17463d interfaceC17463d, int i11) {
                    ChatDialogView.this.m62868RM(r2, interfaceC17463d, i11);
                }
            }).m43170s(m92652XI(AbstractC8020f0.str_delete), new InterfaceC17463d.d() { // from class: b60.d0

                /* renamed from: q */
                public final /* synthetic */ List f10518q;

                public /* synthetic */ C2595d0(List list2) {
                    r2 = list2;
                }

                @Override // com.zing.zalo.zview.dialog.InterfaceC17463d.d
                /* renamed from: K8 */
                public final void mo605K8(InterfaceC17463d interfaceC17463d, int i11) {
                    ChatDialogView.this.m62870SM(r2, interfaceC17463d, i11);
                }
            }).m43152a();
        } catch (Exception e11) {
            e11.printStackTrace();
            return null;
        }
    }

    /* renamed from: pN */
    public static /* synthetic */ void m62935pN(EditText editText, InterfaceC17463d interfaceC17463d, int i11) {
        if (editText != null) {
            AbstractC2379w.m12430d(editText);
        }
        if (interfaceC17463d != null) {
            interfaceC17463d.dismiss();
        }
    }

    /* renamed from: qM */
    private KeyEventCallbackC17462c m62937qM(Object obj) {
        try {
            if (obj instanceof C17945a0) {
                C17945a0 c17945a0 = (C17945a0) obj;
                boolean m95032V6 = c17945a0.m95032V6();
                boolean m94889F6 = c17945a0.m94889F6();
                C0708i c0708i = new C0708i();
                c0708i.m1072c("msg_type", !m95032V6 ? 1 : 0);
                c0708i.m1072c("is_mycloud", m94889F6 ? 1 : 0);
                C16972e0.a aVar = new C16972e0.a(m92689tK());
                aVar.m90932i(C16972e0.b.DIALOG_INFORMATION).m90931h("popup_single_delete").m90947x("popup_single_delete_delete").m90937n("popup_single_delete_cancel").m90930g(c0708i).m90946w(c0708i).m90936m(c0708i).m90921E(true).m90943t(m92652XI(AbstractC8020f0.str_delete), new InterfaceC17463d.d() { // from class: b60.q0

                    /* renamed from: q */
                    public final /* synthetic */ Object f10579q;

                    public /* synthetic */ C2627q0(Object obj2) {
                        r2 = obj2;
                    }

                    @Override // com.zing.zalo.zview.dialog.InterfaceC17463d.d
                    /* renamed from: K8 */
                    public final void mo605K8(InterfaceC17463d interfaceC17463d, int i11) {
                        ChatDialogView.this.m62872TM(r2, interfaceC17463d, i11);
                    }
                }).m90934k(m92652XI(AbstractC8020f0.str_cancel), new InterfaceC17463d.d() { // from class: b60.r0

                    /* renamed from: q */
                    public final /* synthetic */ C17945a0 f10583q;

                    public /* synthetic */ C2629r0(C17945a0 c17945a02) {
                        r2 = c17945a02;
                    }

                    @Override // com.zing.zalo.zview.dialog.InterfaceC17463d.d
                    /* renamed from: K8 */
                    public final void mo605K8(InterfaceC17463d interfaceC17463d, int i11) {
                        ChatDialogView.this.m62874UM(r2, interfaceC17463d, i11);
                    }
                });
                if (!m94889F6 && m95032V6 && c17945a02.m95099c7()) {
                    aVar.m90918B(m92652XI(AbstractC8020f0.str_delete_single_msg_title_popup)).m90949z(AbstractC1463b.m7440a(m92652XI(AbstractC8020f0.str_delete_msg_des_popup), 63));
                } else if (m94889F6) {
                    aVar.m90918B(m92651WI().getQuantityString(AbstractC7921d0.str_title_delete_message_my_cloud_v2, 1, 1));
                } else {
                    aVar.m90949z(m92652XI(AbstractC8020f0.str_delete_single_msg_title_popup));
                }
                return aVar.m90927d();
            }
            return null;
        } catch (Exception e11) {
            AbstractC20110a.m104539h(e11);
            return null;
        }
    }

    /* renamed from: qN */
    public static /* synthetic */ void m62938qN(String str, String str2) {
        try {
            for (String str3 : TextUtils.split(str, ";")) {
                ContactProfile m141809c = C28203u6.f131407a.m141809c(str3);
                if (m141809c != null) {
                    AbstractC23112j7.m118538k0(m141809c.f42434r, str2, C26406h.m136177a(new C26713e(MainApplication.getAppContext().getString(AbstractC8020f0.str_choose_group_to_leave), 2, "action.open.grouptab.with.tip", "", false, 0)));
                }
            }
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    /* renamed from: rM */
    private KeyEventCallbackC17462c m62940rM(Object obj) {
        try {
            List list = (List) obj;
            C8009j.a aVar = new C8009j.a(m92648SI());
            aVar.m43159h(4).m43172u(getContext().getResources().getQuantityString(AbstractC7921d0.plural_undo_multi_messages, list.size(), Integer.valueOf(list.size()))).m43162k(m92652XI(AbstractC8020f0.undo_msg_first_time_use)).m43155d(true).m43165n(m92652XI(AbstractC8020f0.str_close), null).m43170s(m92652XI(AbstractC8020f0.str_item_cm_undo_send_msg), new InterfaceC17463d.d() { // from class: b60.k0

                /* renamed from: q */
                public final /* synthetic */ List f10560q;

                public /* synthetic */ C2615k0(List list2) {
                    r2 = list2;
                }

                @Override // com.zing.zalo.zview.dialog.InterfaceC17463d.d
                /* renamed from: K8 */
                public final void mo605K8(InterfaceC17463d interfaceC17463d, int i11) {
                    ChatDialogView.this.m62876VM(r2, interfaceC17463d, i11);
                }
            });
            return aVar.m43152a();
        } catch (Exception e11) {
            e11.printStackTrace();
            return null;
        }
    }

    /* renamed from: rN */
    public static /* synthetic */ void m62941rN(EditText editText, String str, InterfaceC17463d interfaceC17463d, int i11) {
        if (editText != null) {
            AbstractC2379w.m12430d(editText);
        }
        String trim = editText.getText().toString().trim();
        if (!TextUtils.isEmpty(trim)) {
            if (interfaceC17463d != null) {
                interfaceC17463d.dismiss();
            }
            AbstractC0837p0.m2225f().mo2040a(new Runnable() { // from class: b60.e0

                /* renamed from: p */
                public final /* synthetic */ String f10528p;

                /* renamed from: q */
                public final /* synthetic */ String f10529q;

                public /* synthetic */ RunnableC2598e0(String str2, String trim2) {
                    r1 = str2;
                    r2 = trim2;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    ChatDialogView.m62938qN(r1, r2);
                }
            });
        }
    }

    /* renamed from: sM */
    public static KeyEventCallbackC17462c m62943sM(Object obj, Context context) {
        if (context == null) {
            return null;
        }
        try {
            String[] strArr = (String[]) obj;
            if (strArr != null && strArr.length > 0) {
                C8009j.a aVar = new C8009j.a(context);
                aVar.m43172u(AbstractC23136l9.m118743r0(AbstractC8020f0.copy)).m43155d(true).m43160i(new String[]{context.getString(AbstractC8020f0.str_dialog_copy_item_caption), context.getString(AbstractC8020f0.str_dialog_copy_item_link)}, new InterfaceC17463d.d() { // from class: b60.s0

                    /* renamed from: p */
                    public final /* synthetic */ Context f10584p;

                    /* renamed from: q */
                    public final /* synthetic */ Object f10585q;

                    public /* synthetic */ C2631s0(Context context2, Object obj2) {
                        r1 = context2;
                        r2 = obj2;
                    }

                    @Override // com.zing.zalo.zview.dialog.InterfaceC17463d.d
                    /* renamed from: K8 */
                    public final void mo605K8(InterfaceC17463d interfaceC17463d, int i11) {
                        ChatDialogView.m62879WM(r1, r2, interfaceC17463d, i11);
                    }
                });
                return aVar.m43152a();
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
        return null;
    }

    /* renamed from: sN */
    public /* synthetic */ void m62944sN(InterfaceC17463d interfaceC17463d, int i11) {
        if (interfaceC17463d != null) {
            interfaceC17463d.dismiss();
        }
        AbstractC23184q2.m119464v(this.f59781H0);
    }

    /* renamed from: tM */
    private KeyEventCallbackC17462c m62946tM(Object obj) {
        ChatView chatView;
        try {
            String m60513g = C11318b.m60507e().m60513g();
            if (!m60513g.isEmpty() && AbstractC25495a.m132079d(m60513g)) {
                C25489b c25489b = C25489b.f122105a;
                if (c25489b.m132046f(m60513g) && (chatView = this.f59781H0) != null) {
                    chatView.m59884WT(c25489b.m132050m(m60513g));
                    if (!C26688i.f126427a.m137069c()) {
                        c25489b.m132045e();
                    }
                    C8009j.a aVar = new C8009j.a(this.f59781H0.getContext());
                    aVar.m43172u(AbstractC23136l9.m118743r0(AbstractC8020f0.str_delete_group_title)).m43170s(AbstractC23136l9.m118743r0(AbstractC8020f0.str_titleClose), this.f59788O0);
                    if (this.f59781H0.m60113mQ().equals("1")) {
                        aVar.m43162k(AbstractC23136l9.m118743r0(AbstractC8020f0.str_delete_group_message));
                    } else if (this.f59781H0.m60113mQ().equals("2")) {
                        aVar.m43162k(AbstractC23136l9.m118743r0(AbstractC8020f0.str_force_leave_group_message));
                    } else {
                        aVar.m43162k(String.format(AbstractC23136l9.m118743r0(AbstractC8020f0.str_chat_dialog_title_delete_group), this.f59781H0.m60113mQ()));
                    }
                    C8009j m43152a = aVar.m43152a();
                    m43152a.m92873y(false);
                    return m43152a;
                }
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
        return null;
    }

    /* renamed from: tN */
    public /* synthetic */ void m62947tN(C24277c c24277c) {
        InterfaceC2585a interfaceC2585a = this.f59782I0;
        if (interfaceC2585a != null) {
            interfaceC2585a.mo13041ko(c24277c);
        }
    }

    /* renamed from: uM */
    private KeyEventCallbackC17462c m62949uM(Object obj) {
        boolean z11;
        boolean z12 = obj instanceof List;
        ArrayAdapter arrayAdapter = new ArrayAdapter(getContext(), AbstractC7409c0.chat_context_menu_item, AbstractC6918a0.context_item_name, new String[]{AbstractC23136l9.m118743r0(AbstractC8020f0.str_delete_message_for_me), AbstractC23136l9.m118743r0(AbstractC8020f0.str_dialog_del_msg_for_admin)});
        C8009j.a aVar = new C8009j.a(this.f59781H0.getContext());
        View inflate = LayoutInflater.from(getContext()).inflate(AbstractC7409c0.admin_del_title_view, (ViewGroup) null);
        TextView textView = (TextView) inflate.findViewById(AbstractC6918a0.tv_title);
        TextView textView2 = (TextView) inflate.findViewById(AbstractC6918a0.tv_message);
        if (textView2 != null) {
            try {
                if (obj instanceof List) {
                    z11 = AbstractC19646n0.m102955a1((List) obj);
                } else {
                    z11 = AbstractC19646n0.m103023r1((C17945a0) obj);
                }
            } catch (Exception e11) {
                e11.printStackTrace();
                z11 = false;
            }
            if (z11) {
                if (z12) {
                    textView2.setText(AbstractC8020f0.str_dialog_del_multiple_media_msg_for_admin_desc);
                } else {
                    textView2.setText(AbstractC8020f0.str_dialog_del_single_media_msg_for_admin_desc);
                }
            } else {
                textView2.setText(AbstractC8020f0.str_dialog_del_msg_for_admin_desc);
            }
        } else {
            z11 = false;
        }
        if (textView != null) {
            if (z11 && z12) {
                textView.setText(AbstractC23136l9.m118746s0(AbstractC8020f0.str_title_delete_popup_group_media, AbstractC19646n0.m102885D0((List) obj)));
                textView.setSingleLine(false);
                textView.setMaxLines(2);
            } else {
                textView.setText(AbstractC8020f0.str_delete_message_dialog_title);
            }
        }
        aVar.m43158g(inflate);
        aVar.m43155d(true);
        aVar.m43153b(arrayAdapter, new InterfaceC17463d.d() { // from class: b60.o0

            /* renamed from: q */
            public final /* synthetic */ boolean f10569q;

            /* renamed from: r */
            public final /* synthetic */ Object f10570r;

            public /* synthetic */ C2623o0(boolean z122, Object obj2) {
                r2 = z122;
                r3 = obj2;
            }

            @Override // com.zing.zalo.zview.dialog.InterfaceC17463d.d
            /* renamed from: K8 */
            public final void mo605K8(InterfaceC17463d interfaceC17463d, int i11) {
                ChatDialogView.this.m62885YM(r2, r3, interfaceC17463d, i11);
            }
        });
        return aVar.m43152a();
    }

    /* renamed from: uN */
    public /* synthetic */ void m62950uN(SimpleAdapter simpleAdapter, InterfaceC17463d interfaceC17463d, int i11) {
        InterfaceC2585a interfaceC2585a;
        if (interfaceC17463d != null) {
            try {
                interfaceC17463d.dismiss();
            } catch (Exception e11) {
                e11.printStackTrace();
                return;
            }
        }
        if (((Integer) ((HashMap) simpleAdapter.getItem(i11)).get("id")).intValue() == AbstractC8020f0.str_create_new_post && (interfaceC2585a = this.f59782I0) != null) {
            interfaceC2585a.mo13028U8();
        }
    }

    /* renamed from: vM */
    private KeyEventCallbackC17462c m62952vM(Object obj) {
        List list = (List) obj;
        C8009j.a aVar = new C8009j.a(this.f59781H0.m92648SI());
        aVar.m43159h(3).m43172u(AbstractC19620d0.m102672I(list)).m43173v(2).m43162k(AbstractC19620d0.m102671H(list, false)).m43170s(AbstractC23136l9.m118743r0(AbstractC8020f0.str_yes), this.f59788O0).m43165n(AbstractC23136l9.m118743r0(AbstractC8020f0.str_no), new InterfaceC17463d.d() { // from class: b60.f0

            /* renamed from: q */
            public final /* synthetic */ List f10536q;

            public /* synthetic */ C2601f0(List list2) {
                r2 = list2;
            }

            @Override // com.zing.zalo.zview.dialog.InterfaceC17463d.d
            /* renamed from: K8 */
            public final void mo605K8(InterfaceC17463d interfaceC17463d, int i11) {
                ChatDialogView.this.m62888ZM(r2, interfaceC17463d, i11);
            }
        });
        return aVar.m43152a();
    }

    /* renamed from: vN */
    public /* synthetic */ void m62953vN(C7189r c7189r, ContactProfile contactProfile, String str, C32002l4 c32002l4, InterfaceC17463d interfaceC17463d, int i11) {
        ChatView chatView;
        if (interfaceC17463d != null) {
            try {
                interfaceC17463d.dismiss();
            } catch (Exception e11) {
                AbstractC20110a.m104539h(e11);
                return;
            }
        }
        int intValue = ((Integer) ((HashMap) c7189r.getItem(i11)).get("id")).intValue();
        if (intValue == AbstractC8020f0.bump_add_friend) {
            InterfaceC2585a interfaceC2585a = this.f59782I0;
            if (interfaceC2585a != null) {
                interfaceC2585a.mo13018J4(contactProfile);
                return;
            }
            return;
        }
        if (intValue == AbstractC8020f0.str_send_private_message) {
            InterfaceC2585a interfaceC2585a2 = this.f59782I0;
            if (interfaceC2585a2 != null) {
                interfaceC2585a2.mo13026Q4(str);
                return;
            }
            return;
        }
        if (intValue == AbstractC8020f0.str_view_profile) {
            InterfaceC2585a interfaceC2585a3 = this.f59782I0;
            if (interfaceC2585a3 != null) {
                interfaceC2585a3.mo13045n8(str, c32002l4);
                return;
            }
            return;
        }
        if (intValue == AbstractC8020f0.str_remove_user_from_group) {
            InterfaceC2585a interfaceC2585a4 = this.f59782I0;
            if (interfaceC2585a4 != null) {
                interfaceC2585a4.mo13029Vj(str);
                return;
            }
            return;
        }
        if (intValue == AbstractC8020f0.str_reportabuse) {
            ChatView chatView2 = this.f59781H0;
            if (chatView2 != null) {
                chatView2.m60050iU(str);
                return;
            }
            return;
        }
        if (intValue == AbstractC8020f0.str_mention) {
            if (this.f59781H0 != null && contactProfile != null) {
                AbstractC23647d.m123897g("1591107");
                this.f59781H0.m60145oQ(contactProfile.mo2475c(), Long.parseLong(contactProfile.f42434r));
                return;
            }
            return;
        }
        if (intValue == AbstractC8020f0.str_call_zalo_for_free && contactProfile != null && (chatView = this.f59781H0) != null) {
            chatView.f56747E2 = contactProfile;
            AbstractC3102n.m15599r(chatView, 98, contactProfile, 126);
        }
    }

    /* renamed from: wM */
    private KeyEventCallbackC17462c m62955wM(Object obj) {
        try {
            List list = (List) obj;
            boolean m103081x = AbstractC19656s0.m103081x(list);
            boolean m94889F6 = ((C17945a0) list.get(0)).m94889F6();
            C0708i c0708i = new C0708i();
            c0708i.m1072c("msg_type", !m103081x ? 1 : 0);
            C16972e0.a aVar = new C16972e0.a(m92689tK());
            aVar.m90932i(C16972e0.b.DIALOG_INFORMATION).m90931h("popup_multi_delete").m90921E(true).m90947x("popup_multi_delete_delete").m90937n("popup_multi_delete_cancel").m90930g(c0708i).m90946w(c0708i).m90936m(c0708i).m90943t(m92652XI(AbstractC8020f0.str_delete), this.f59788O0).m90934k(m92652XI(AbstractC8020f0.str_cancel), new InterfaceC17463d.d() { // from class: b60.b0

                /* renamed from: q */
                public final /* synthetic */ List f10504q;

                public /* synthetic */ C2589b0(List list2) {
                    r2 = list2;
                }

                @Override // com.zing.zalo.zview.dialog.InterfaceC17463d.d
                /* renamed from: K8 */
                public final void mo605K8(InterfaceC17463d interfaceC17463d, int i11) {
                    ChatDialogView.this.m62891aN(r2, interfaceC17463d, i11);
                }
            });
            if (m94889F6) {
                aVar.m90918B(m92651WI().getQuantityString(AbstractC7921d0.str_title_delete_message_my_cloud_v2, list2.size(), Integer.valueOf(list2.size())));
            } else if (AbstractC19646n0.m102955a1(list2)) {
                if (m103081x && AbstractC19656s0.m103082y(list2)) {
                    aVar.m90918B(AbstractC23136l9.m118746s0(AbstractC8020f0.str_content_delete_group_media, AbstractC19646n0.m102885D0(list2))).m90949z(AbstractC1463b.m7440a(m92652XI(AbstractC8020f0.str_delete_msg_des_popup), 63));
                } else {
                    aVar.m90949z(AbstractC23136l9.m118746s0(AbstractC8020f0.str_content_delete_group_media, AbstractC19646n0.m102885D0(list2)));
                }
            } else {
                aVar.m90949z(m92651WI().getQuantityString(AbstractC7921d0.plural_delete_multi_messages_for_me_title, list2.size(), Integer.valueOf(list2.size())));
            }
            return aVar.m90927d();
        } catch (Exception e11) {
            AbstractC20110a.m104539h(e11);
            return null;
        }
    }

    /* renamed from: wN */
    public /* synthetic */ void m62956wN(SimpleAdapter simpleAdapter, int i11, InterfaceC17463d interfaceC17463d, int i12) {
        if (interfaceC17463d != null) {
            try {
                interfaceC17463d.dismiss();
            } catch (Exception e11) {
                e11.printStackTrace();
                return;
            }
        }
        int intValue = ((Integer) ((HashMap) simpleAdapter.getItem(i12)).get("id")).intValue();
        int i13 = 3;
        if (intValue == AbstractC8020f0.str_reminder) {
            if (i11 == 313) {
                AbstractC23647d.m123897g("777050012");
                i13 = 1;
            }
            ChatView chatView = this.f59781H0;
            if (chatView != null) {
                chatView.m60020gQ().mo60755kc(false, i13);
                return;
            }
            return;
        }
        if (intValue == AbstractC8020f0.str_anniversary) {
            if (i11 == 313) {
                AbstractC23647d.m123897g("777050011");
                i13 = 1;
            }
            ChatView chatView2 = this.f59781H0;
            if (chatView2 != null) {
                chatView2.m60020gQ().mo60755kc(true, i13);
                return;
            }
            return;
        }
        if (intValue == AbstractC8020f0.str_poll_title) {
            ChatView chatView3 = this.f59781H0;
            if (chatView3 != null) {
                chatView3.m60020gQ().mo60611No();
                return;
            }
            return;
        }
        if (intValue == AbstractC8020f0.str_group_post) {
            if (i11 == 313) {
                i13 = 1;
            }
            ChatView chatView4 = this.f59781H0;
            if (chatView4 != null) {
                chatView4.m60020gQ().mo60535Al(i13);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x002f A[Catch: Exception -> 0x002a, TryCatch #0 {Exception -> 0x002a, blocks: (B:4:0x0003, B:6:0x0021, B:11:0x002f, B:12:0x003c, B:14:0x0050, B:15:0x0052, B:16:0x005a, B:20:0x0057, B:21:0x0036), top: B:3:0x0003 }] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0050 A[Catch: Exception -> 0x002a, TryCatch #0 {Exception -> 0x002a, blocks: (B:4:0x0003, B:6:0x0021, B:11:0x002f, B:12:0x003c, B:14:0x0050, B:15:0x0052, B:16:0x005a, B:20:0x0057, B:21:0x0036), top: B:3:0x0003 }] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0057 A[Catch: Exception -> 0x002a, TryCatch #0 {Exception -> 0x002a, blocks: (B:4:0x0003, B:6:0x0021, B:11:0x002f, B:12:0x003c, B:14:0x0050, B:15:0x0052, B:16:0x005a, B:20:0x0057, B:21:0x0036), top: B:3:0x0003 }] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0036 A[Catch: Exception -> 0x002a, TryCatch #0 {Exception -> 0x002a, blocks: (B:4:0x0003, B:6:0x0021, B:11:0x002f, B:12:0x003c, B:14:0x0050, B:15:0x0052, B:16:0x005a, B:20:0x0057, B:21:0x0036), top: B:3:0x0003 }] */
    /* renamed from: xM */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private KeyEventCallbackC17462c m62958xM(Object obj) {
        boolean z11;
        String m118743r0;
        int i11;
        C8009j c8009j = null;
        if (obj == null) {
            return null;
        }
        try {
            Object[] objArr = (Object[]) obj;
            String str = (String) objArr[0];
            int intValue = ((Integer) objArr[1]).intValue();
            C31973j5 m4472f = C0943w.m4462l().m4472f(str);
            if (!m4472f.m153743U() && !m4472f.m153778p0()) {
                z11 = false;
                if (!z11) {
                    m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_dialog_max_add_participant_admin_role_msg);
                } else {
                    m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_dialog_max_add_participant_member_role_msg);
                }
                String format = String.format(m118743r0, Integer.valueOf(intValue));
                String m118743r02 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_cancel);
                if (!z11) {
                    i11 = AbstractC8020f0.str_select_participant;
                } else {
                    i11 = AbstractC8020f0.str_contact_to_admin;
                }
                String m118743r03 = AbstractC23136l9.m118743r0(i11);
                C8009j.a aVar = new C8009j.a(m92648SI());
                aVar.m43159h(4).m43162k(format).m43165n(m118743r02, new InterfaceC17463d.b()).m43170s(m118743r03, new InterfaceC17463d.d() { // from class: b60.j0

                    /* renamed from: q */
                    public final /* synthetic */ C31973j5 f10555q;

                    public /* synthetic */ C2613j0(C31973j5 m4472f2) {
                        r2 = m4472f2;
                    }

                    @Override // com.zing.zalo.zview.dialog.InterfaceC17463d.d
                    /* renamed from: K8 */
                    public final void mo605K8(InterfaceC17463d interfaceC17463d, int i12) {
                        ChatDialogView.this.m62894bN(r2, interfaceC17463d, i12);
                    }
                });
                c8009j = aVar.m43152a();
                c8009j.m92873y(true);
                return c8009j;
            }
            z11 = true;
            if (!z11) {
            }
            String format2 = String.format(m118743r0, Integer.valueOf(intValue));
            String m118743r022 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_cancel);
            if (!z11) {
            }
            String m118743r032 = AbstractC23136l9.m118743r0(i11);
            C8009j.a aVar2 = new C8009j.a(m92648SI());
            aVar2.m43159h(4).m43162k(format2).m43165n(m118743r022, new InterfaceC17463d.b()).m43170s(m118743r032, new InterfaceC17463d.d() { // from class: b60.j0

                /* renamed from: q */
                public final /* synthetic */ C31973j5 f10555q;

                public /* synthetic */ C2613j0(C31973j5 m4472f2) {
                    r2 = m4472f2;
                }

                @Override // com.zing.zalo.zview.dialog.InterfaceC17463d.d
                /* renamed from: K8 */
                public final void mo605K8(InterfaceC17463d interfaceC17463d, int i12) {
                    ChatDialogView.this.m62894bN(r2, interfaceC17463d, i12);
                }
            });
            c8009j = aVar2.m43152a();
            c8009j.m92873y(true);
            return c8009j;
        } catch (Exception e11) {
            e11.printStackTrace();
            return c8009j;
        }
    }

    /* renamed from: xN */
    public /* synthetic */ void m62959xN(View view) {
        dismiss();
    }

    /* renamed from: yM */
    private KeyEventCallbackC17462c m62961yM(Object obj) {
        if (!(obj instanceof C2852a1.a)) {
            return null;
        }
        return new C2852a1(this.f59781H0.getContext(), (C2852a1.a) obj, new C2852a1.d() { // from class: b60.p0
            public /* synthetic */ C2625p0() {
            }

            @Override // bn.C2852a1.d
            /* renamed from: tA */
            public final void mo13059tA(int i11, C31931g8 c31931g8) {
                ChatDialogView.this.m62897cN(i11, c31931g8);
            }
        }).m13747c();
    }

    /* renamed from: yN */
    public /* synthetic */ void m62962yN(ContactProfile contactProfile, ContactProfile.C7867c c7867c, boolean z11) {
        if (z11) {
            this.f59781H0.mo60144oG(103, contactProfile, c7867c.m40445e().toString());
        } else {
            this.f59781H0.mo60243uy(104, contactProfile, c7867c.m40445e().toString());
        }
        dismiss();
    }

    /* renamed from: zM */
    private KeyEventCallbackC17462c m62964zM(Object obj) {
        boolean m103023r1;
        boolean z11 = obj instanceof List;
        ArrayAdapter arrayAdapter = new ArrayAdapter(getContext(), AbstractC7409c0.chat_context_menu_item, AbstractC6918a0.context_item_name, new String[]{AbstractC23136l9.m118743r0(AbstractC8020f0.str_delete_message_for_me)});
        C8009j.a aVar = new C8009j.a(this.f59781H0.getContext());
        View inflate = LayoutInflater.from(getContext()).inflate(AbstractC7409c0.admin_del_title_view, (ViewGroup) null);
        TextView textView = (TextView) inflate.findViewById(AbstractC6918a0.tv_title);
        TextView textView2 = (TextView) inflate.findViewById(AbstractC6918a0.tv_message);
        if (z11) {
            m103023r1 = AbstractC19646n0.m102955a1((List) obj);
        } else {
            m103023r1 = AbstractC19646n0.m103023r1((C17945a0) obj);
        }
        if (textView2 != null) {
            if (m103023r1) {
                if (z11) {
                    textView2.setText(AbstractC8020f0.str_dialog_del_multiple_media_msg_for_admin_desc);
                } else {
                    textView2.setText(AbstractC8020f0.str_dialog_del_single_media_msg_for_admin_desc);
                }
            } else {
                textView2.setVisibility(8);
            }
        }
        if (textView != null) {
            if (m103023r1 && z11) {
                textView.setText(AbstractC23136l9.m118746s0(AbstractC8020f0.str_title_delete_popup_group_media, AbstractC19646n0.m102885D0((List) obj)));
                textView.setSingleLine(false);
                textView.setMaxLines(2);
            } else {
                textView.setText(AbstractC8020f0.str_delete_message_dialog_title);
            }
        }
        aVar.m43158g(inflate);
        aVar.m43155d(true);
        aVar.m43153b(arrayAdapter, new InterfaceC17463d.d() { // from class: b60.b1

            /* renamed from: q */
            public final /* synthetic */ boolean f10506q;

            /* renamed from: r */
            public final /* synthetic */ Object f10507r;

            public /* synthetic */ C2590b1(boolean z112, Object obj2) {
                r2 = z112;
                r3 = obj2;
            }

            @Override // com.zing.zalo.zview.dialog.InterfaceC17463d.d
            /* renamed from: K8 */
            public final void mo605K8(InterfaceC17463d interfaceC17463d, int i11) {
                ChatDialogView.this.m62900dN(r2, r3, interfaceC17463d, i11);
            }
        });
        return aVar.m43152a();
    }

    /* renamed from: zN */
    public /* synthetic */ void m62965zN(ContactProfile contactProfile, View view) {
        String str;
        JSONObject m40406h0 = contactProfile.m40406h0();
        ChatView chatView = this.f59781H0;
        if (m40406h0 != null) {
            str = m40406h0.toString();
        } else {
            str = "";
        }
        chatView.mo60243uy(103, contactProfile, str);
        dismiss();
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ProcessVariables
        jadx.core.utils.exceptions.JadxRuntimeException: Method arg registers not loaded: b60.e1.<init>(com.zing.zalo.ui.chat.dialog.ChatDialogView, com.zing.zalo.control.ContactProfile):void, class status: GENERATED_AND_UNLOADED
        	at jadx.core.dex.nodes.MethodNode.getArgRegs(MethodNode.java:289)
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables$1.isArgUnused(ProcessVariables.java:146)
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables$1.lambda$isVarUnused$0(ProcessVariables.java:131)
        	at jadx.core.utils.ListUtils.allMatch(ListUtils.java:172)
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables$1.isVarUnused(ProcessVariables.java:131)
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables$1.processBlock(ProcessVariables.java:82)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:64)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:19)
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables.removeUnusedResults(ProcessVariables.java:73)
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables.visit(ProcessVariables.java:48)
        */
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:116:0x0064. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:117:0x0067. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:17:0x0052. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:18:0x0055. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:19:0x0058. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:20:0x005b. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:21:0x005e. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:22:0x0061. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:194:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x0195 A[Catch: Exception -> 0x01f3, TRY_LEAVE, TryCatch #7 {Exception -> 0x01f3, blocks: (B:151:0x006d, B:154:0x0072, B:156:0x00af, B:158:0x00b8, B:161:0x00e8, B:166:0x00f9, B:171:0x011b, B:192:0x018d, B:195:0x0195, B:199:0x01b8, B:208:0x01ca, B:210:0x01d3, B:212:0x01df, B:257:0x00f7), top: B:150:0x006d }] */
    /* JADX WARN: Removed duplicated region for block: B:237:0x024a A[Catch: Exception -> 0x01ef, TryCatch #1 {Exception -> 0x01ef, blocks: (B:215:0x01eb, B:216:0x01f7, B:218:0x020b, B:220:0x0211, B:222:0x021b, B:223:0x0234, B:225:0x023a, B:227:0x0280, B:229:0x0286, B:231:0x028c, B:232:0x0297, B:235:0x0240, B:237:0x024a, B:238:0x024d, B:240:0x0253, B:242:0x0259, B:243:0x025e, B:244:0x025c, B:245:0x026a, B:247:0x0270, B:248:0x0275, B:249:0x0273), top: B:214:0x01eb }] */
    /* JADX WARN: Removed duplicated region for block: B:240:0x0253 A[Catch: Exception -> 0x01ef, TryCatch #1 {Exception -> 0x01ef, blocks: (B:215:0x01eb, B:216:0x01f7, B:218:0x020b, B:220:0x0211, B:222:0x021b, B:223:0x0234, B:225:0x023a, B:227:0x0280, B:229:0x0286, B:231:0x028c, B:232:0x0297, B:235:0x0240, B:237:0x024a, B:238:0x024d, B:240:0x0253, B:242:0x0259, B:243:0x025e, B:244:0x025c, B:245:0x026a, B:247:0x0270, B:248:0x0275, B:249:0x0273), top: B:214:0x01eb }] */
    /* JADX WARN: Removed duplicated region for block: B:245:0x026a A[Catch: Exception -> 0x01ef, TryCatch #1 {Exception -> 0x01ef, blocks: (B:215:0x01eb, B:216:0x01f7, B:218:0x020b, B:220:0x0211, B:222:0x021b, B:223:0x0234, B:225:0x023a, B:227:0x0280, B:229:0x0286, B:231:0x028c, B:232:0x0297, B:235:0x0240, B:237:0x024a, B:238:0x024d, B:240:0x0253, B:242:0x0259, B:243:0x025e, B:244:0x025c, B:245:0x026a, B:247:0x0270, B:248:0x0275, B:249:0x0273), top: B:214:0x01eb }] */
    /* JADX WARN: Removed duplicated region for block: B:404:0x0452  */
    /* JADX WARN: Type inference failed for: r10v10 */
    /* JADX WARN: Type inference failed for: r10v22 */
    /* JADX WARN: Type inference failed for: r10v24 */
    /* JADX WARN: Type inference failed for: r10v27 */
    /* JADX WARN: Type inference failed for: r10v28 */
    /* JADX WARN: Type inference failed for: r10v34 */
    /* JADX WARN: Type inference failed for: r10v35 */
    /* JADX WARN: Type inference failed for: r10v36 */
    /* JADX WARN: Type inference failed for: r10v43 */
    /* JADX WARN: Type inference failed for: r10v46 */
    /* JADX WARN: Type inference failed for: r10v47 */
    /* JADX WARN: Type inference failed for: r10v48 */
    /* JADX WARN: Type inference failed for: r10v5, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r10v51 */
    /* JADX WARN: Type inference failed for: r10v6 */
    /* JADX WARN: Type inference failed for: r10v64 */
    /* JADX WARN: Type inference failed for: r10v65 */
    /* JADX WARN: Type inference failed for: r10v7 */
    /* JADX WARN: Type inference failed for: r10v79 */
    /* JADX WARN: Type inference failed for: r10v82 */
    /* JADX WARN: Type inference failed for: r10v84 */
    /* JADX WARN: Type inference failed for: r13v0 */
    /* JADX WARN: Type inference failed for: r13v12 */
    /* JADX WARN: Type inference failed for: r13v33 */
    /* JADX WARN: Type inference failed for: r13v37 */
    /* JADX WARN: Type inference failed for: r15v0 */
    /* JADX WARN: Type inference failed for: r15v1 */
    /* JADX WARN: Type inference failed for: r15v145 */
    /* JADX WARN: Type inference failed for: r15v146 */
    /* JADX WARN: Type inference failed for: r15v147 */
    /* JADX WARN: Type inference failed for: r15v148 */
    /* JADX WARN: Type inference failed for: r15v149 */
    /* JADX WARN: Type inference failed for: r15v150 */
    /* JADX WARN: Type inference failed for: r15v151 */
    /* JADX WARN: Type inference failed for: r15v152 */
    /* JADX WARN: Type inference failed for: r15v153 */
    /* JADX WARN: Type inference failed for: r15v154 */
    /* JADX WARN: Type inference failed for: r15v155 */
    /* JADX WARN: Type inference failed for: r15v156 */
    /* JADX WARN: Type inference failed for: r15v157 */
    /* JADX WARN: Type inference failed for: r15v158 */
    /* JADX WARN: Type inference failed for: r15v159 */
    /* JADX WARN: Type inference failed for: r15v160 */
    /* JADX WARN: Type inference failed for: r15v161 */
    /* JADX WARN: Type inference failed for: r15v162 */
    /* JADX WARN: Type inference failed for: r15v163 */
    /* JADX WARN: Type inference failed for: r15v164 */
    /* JADX WARN: Type inference failed for: r15v165 */
    /* JADX WARN: Type inference failed for: r15v6, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r15v7 */
    /* JADX WARN: Type inference failed for: r15v93, types: [com.zing.zalo.zview.dialog.c] */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r1v20 */
    /* JADX WARN: Type inference failed for: r1v22, types: [c30.g, com.zing.zalo.zview.dialog.c] */
    /* JADX WARN: Type inference failed for: r1v28 */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v30, types: [c30.h, com.zing.zalo.zview.dialog.c] */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v8, types: [com.zing.zalo.zview.dialog.c] */
    @Override // com.zing.zalo.zview.DialogView
    /* renamed from: LK */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public com.zing.zalo.zview.dialog.KeyEventCallbackC17462c mo13885LK(android.os.Bundle r29) {
        /*
            Method dump skipped, instructions count: 6706
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zing.zalo.p077ui.chat.dialog.ChatDialogView.mo13885LK(android.os.Bundle):com.zing.zalo.zview.dialog.c");
    }

    /* renamed from: LN */
    void m62966LN(String str) {
        try {
            this.f59781H0.mo46829Y();
            C0766k c0766k = new C0766k();
            c0766k.mo1704o8(new C11580c(str));
            c0766k.m1810G(str);
        } catch (RuntimeException e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    /* renamed from: MN */
    public void m62967MN(ChatView chatView) {
        this.f59781H0 = chatView;
    }

    /* renamed from: NN */
    public void m62968NN(InterfaceC2585a interfaceC2585a) {
        this.f59782I0 = interfaceC2585a;
    }

    /* renamed from: ON */
    public void m62969ON(InterfaceC11590m interfaceC11590m) {
        this.f59786M0 = interfaceC11590m;
    }

    /* renamed from: PN */
    public void m62970PN(Object obj) {
        this.f59783J0 = obj;
    }

    @Override // com.zing.zalo.zview.DialogView, com.zing.zalo.zview.dialog.InterfaceC17463d.e
    /* renamed from: Tv */
    public void mo12457Tv(InterfaceC17463d interfaceC17463d) {
        InterfaceC2585a interfaceC2585a;
        try {
            int i11 = m92642L3().getInt("id");
            if (i11 != 115) {
                if (i11 == 306 && (interfaceC2585a = this.f59782I0) != null) {
                    interfaceC2585a.mo13046pk();
                }
            } else {
                C3246i0.a aVar = this.f59781H0.f56908u1;
                if (aVar != null) {
                    aVar.m16483h();
                }
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
        super.mo12457Tv(interfaceC17463d);
        InterfaceC11590m interfaceC11590m = this.f59786M0;
        if (interfaceC11590m != null) {
            interfaceC11590m.onDismiss();
        }
        ChatView chatView = this.f59781H0;
        if (chatView != null && chatView.mo59999fA()) {
            this.f59781H0.mo59915Yi();
        }
    }

    /* renamed from: hM */
    void m62971hM(long j11) {
        try {
            C0766k c0766k = new C0766k();
            c0766k.mo1704o8(new C11579b());
            c0766k.mo1397B8(j11, true);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // com.zing.zalo.zview.ZaloView
    public void onResume() {
        super.onResume();
        KeyEventCallbackC17462c m92594JK = m92594JK();
        if (C3255n.m16558i() && (m92594JK instanceof ViewOnClickListenerC3266y)) {
            ViewOnClickListenerC3266y viewOnClickListenerC3266y = (ViewOnClickListenerC3266y) m92594JK;
            if (viewOnClickListenerC3266y.m92868m()) {
                viewOnClickListenerC3266y.m16627f0();
            }
        }
    }

    @Override // com.zing.zalo.zview.DialogView, com.zing.zalo.zview.dialog.InterfaceC17463d.c
    /* renamed from: p7 */
    public void mo13013p7(InterfaceC17463d interfaceC17463d) {
        try {
            int i11 = m92642L3().getInt("id");
            if (i11 != 110) {
                if (i11 != 115) {
                    if (i11 != 128) {
                        if (i11 != 166 && i11 != 169) {
                            if (i11 != 173) {
                                if (i11 == 407 && this.f59781H0.m60020gQ().mo60562Fi().size() > 0) {
                                    this.f59781H0.m60020gQ().mo60591K3((C17945a0) this.f59781H0.m60020gQ().mo60562Fi().get(0));
                                }
                            } else {
                                InterfaceC2585a interfaceC2585a = this.f59782I0;
                                if (interfaceC2585a != null) {
                                    interfaceC2585a.mo13027Qc();
                                }
                            }
                        }
                    } else {
                        InterfaceC2585a interfaceC2585a2 = this.f59782I0;
                        if (interfaceC2585a2 != null) {
                            interfaceC2585a2.mo13052xd();
                        }
                    }
                }
                InterfaceC2585a interfaceC2585a3 = this.f59782I0;
                if (interfaceC2585a3 != null) {
                    interfaceC2585a3.mo13016Ae();
                }
            } else {
                InterfaceC2585a interfaceC2585a4 = this.f59782I0;
                if (interfaceC2585a4 != null) {
                    interfaceC2585a4.mo13023Mi();
                }
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
        super.mo13013p7(interfaceC17463d);
    }

    @Override // com.zing.zalo.zview.DialogView, com.zing.zalo.zview.ZaloView
    /* renamed from: xJ */
    public void mo37135xJ(Bundle bundle) {
        try {
            super.mo37135xJ(bundle);
            if (m92642L3() != null) {
                int i11 = m92642L3().getInt("id");
                if (i11 == 202 || i11 == 115 || i11 == 166 || i11 == 169) {
                    C17465f m92867k = m92594JK().m92867k();
                    m92867k.m92890I(1);
                    m92867k.m92895b(131072);
                }
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }
}
