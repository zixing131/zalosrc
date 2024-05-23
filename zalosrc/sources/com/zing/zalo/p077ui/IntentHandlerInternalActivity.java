package com.zing.zalo.p077ui;

import ae.C0766k;
import ae.InterfaceC0765j;
import ag0.C0804b;
import ag0.C0824j;
import am.AbstractC0939u;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.MainApplication;
import com.zing.zalo.common.chat.label.C7860a;
import com.zing.zalo.control.ContactProfile;
import com.zing.zalo.control.ContentMessagePopup;
import com.zing.zalo.control.MuteTrackingSource;
import com.zing.zalo.control.TrackingSource;
import com.zing.zalo.data.entity.chat.message.MessageId;
import com.zing.zalo.p062db.C7960e;
import com.zing.zalo.p077ui.IntentHandlerInternalActivity;
import com.zing.zalo.p077ui.group.manage.ManageGroupView;
import com.zing.zalo.utils.ToastUtils;
import com.zing.zalo.zview.dialog.InterfaceC17463d;
import com.zing.zalo.zview.dialog.KeyEventCallbackC17462c;
import dj.C17945a0;
import dj.C17979l1;
import eg0.C18427b;
import f80.C18823a;
import f80.C18824b;
import gw.AbstractC19646n0;
import hm0.C20096c;
import hm0.InterfaceC20094a;
import ho0.AbstractC20110a;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import me0.AbstractC23059e9;
import me0.AbstractC23063f2;
import me0.AbstractC23112j7;
import me0.AbstractC23116k0;
import me0.AbstractC23152n3;
import me0.AbstractC23161o1;
import me0.C23055e5;
import mg.C23288a;
import org.json.JSONObject;
import p142ey.C18644n;
import p304ks.AbstractC21935u;
import p304ks.C21927m;
import p348mi.AbstractC23306f;
import p361nb.AbstractC23647d;
import p394oj.C24275a;
import p461qu.AbstractC25495a;
import p588vw.C28652r;
import p716zh.C31991k8;
import p716zh.C32002l4;
import ph.C24753f;
import sx.C26406h;
import vg.C28023b6;
import vg.C28203u6;

/* loaded from: classes5.dex */
public class IntentHandlerInternalActivity extends IntentHandlerBaseActivity {

    /* renamed from: X */
    boolean f55247X = false;

    /* renamed from: Y */
    InterfaceC0765j f55248Y = new C0766k();

    /* renamed from: Z */
    boolean f55249Z = false;

    /* renamed from: a0 */
    boolean f55250a0 = false;

    /* renamed from: b0 */
    InterfaceC0765j f55251b0 = new C0766k();

    /* renamed from: c0 */
    boolean f55252c0 = false;

    /* renamed from: d0 */
    boolean f55253d0 = false;

    /* renamed from: com.zing.zalo.ui.IntentHandlerInternalActivity$a */
    /* loaded from: classes5.dex */
    class C10938a extends AbstractC23116k0.a {

        /* renamed from: a */
        final /* synthetic */ String f55254a;

        C10938a(String str) {
            this.f55254a = str;
        }

        @Override // me0.AbstractC23116k0.a
        /* renamed from: b */
        public void mo56829b(InterfaceC17463d interfaceC17463d, int i11) {
            if (i11 == 4) {
                Bundle bundle = new Bundle();
                bundle.putString("extra_chat_id", this.f55254a);
                bundle.putInt("other_setting_type", 52);
                bundle.putBoolean("only_show_mute_section", true);
                IntentHandlerInternalActivity.this.startActivity(AbstractC23152n3.m119012O(ManageGroupView.class, bundle));
            } else {
                IntentHandlerInternalActivity.this.m56828z3(i11, this.f55254a);
            }
            C28023b6.m141250h0().m141293J(this.f55254a);
            IntentHandlerInternalActivity.this.finish();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.IntentHandlerInternalActivity$b */
    /* loaded from: classes5.dex */
    public class C10939b implements InterfaceC20094a {

        /* renamed from: a */
        final /* synthetic */ String f55256a;

        /* renamed from: b */
        final /* synthetic */ ContactProfile f55257b;

        C10939b(String str, ContactProfile contactProfile) {
            this.f55256a = str;
            this.f55257b = contactProfile;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: d */
        public /* synthetic */ void m56831d(ContactProfile contactProfile) {
            IntentHandlerInternalActivity.this.m56824B3(contactProfile);
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
            try {
                try {
                    ToastUtils.m89270r(IntentHandlerInternalActivity.this.getString(AbstractC8020f0.error_message));
                } catch (Exception e11) {
                    e11.printStackTrace();
                }
            } finally {
                IntentHandlerInternalActivity.this.f55249Z = false;
            }
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            int i11;
            int i12;
            int i13;
            try {
                try {
                    JSONObject jSONObject = (JSONObject) obj;
                    if (jSONObject != null && !jSONObject.isNull("data")) {
                        JSONObject jSONObject2 = jSONObject.getJSONObject("data");
                        if (jSONObject2.isNull("isRequested")) {
                            i11 = 0;
                        } else {
                            i11 = jSONObject2.getInt("isRequested");
                        }
                        if (jSONObject2.isNull("isFriend")) {
                            i12 = 0;
                        } else {
                            i12 = jSONObject2.getInt("isFriend");
                        }
                        if (jSONObject2.isNull("isRequesting")) {
                            i13 = 0;
                        } else {
                            i13 = jSONObject2.getInt("isRequesting");
                        }
                        int optInt = jSONObject2.optInt("addFriendPrivacy", 1);
                        int optInt2 = jSONObject2.optInt("ranking", 0);
                        if (optInt == 1) {
                            if (i11 == 0 && i13 == 0) {
                                if (i12 == 0) {
                                    if (!C18644n.m98531l().m98558u(this.f55256a)) {
                                        TrackingSource m114310H = C21927m.m114302u().m114310H(this.f55256a);
                                        if (m114310H == null) {
                                            m114310H = new TrackingSource(this.f55257b.f42373R0);
                                        }
                                        m114310H.m40677a("sourceView", 21);
                                        C21927m.m114302u().m114330e0(this.f55256a, m114310H);
                                        IntentHandlerInternalActivity.this.m56827y3(this.f55257b);
                                    } else {
                                        ToastUtils.m89270r(IntentHandlerInternalActivity.this.getString(AbstractC8020f0.str_hint_alreadyFriend));
                                        AbstractC23059e9.m118317F(this.f55256a);
                                        AbstractC21935u.m114533W(this.f55256a, 3, "");
                                    }
                                } else if (i12 == 1) {
                                    ToastUtils.m89270r(IntentHandlerInternalActivity.this.getString(AbstractC8020f0.str_hint_alreadyFriend));
                                    AbstractC23059e9.m118317F(this.f55256a);
                                    AbstractC21935u.m114533W(this.f55256a, 3, "");
                                    if (!AbstractC21935u.m114558y(this.f55256a)) {
                                        IntentHandlerInternalActivity.this.m56823A3(this.f55256a);
                                    }
                                }
                            } else if (i13 != 0) {
                                final ContactProfile mo98491j = AbstractC23063f2.m118350b(false).mo98491j(this.f55256a);
                                if (mo98491j != null) {
                                    mo98491j.f42369Q = optInt2;
                                }
                                C7960e.m41971c6().m42566vd(this.f55256a, optInt2);
                                IntentHandlerInternalActivity.this.runOnUiThread(new Runnable() { // from class: com.zing.zalo.ui.g
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        IntentHandlerInternalActivity.C10939b.this.m56831d(mo98491j);
                                    }
                                });
                            } else if (i11 != 0) {
                                AbstractC23063f2.m118349a(this.f55257b);
                                ToastUtils.m89270r(IntentHandlerInternalActivity.this.getString(AbstractC8020f0.str_already_send_friend_request_new));
                                AbstractC23059e9.m118317F(this.f55256a);
                                AbstractC21935u.m114533W(this.f55256a, 3, "");
                            }
                        } else if (optInt < 0) {
                            if (optInt != -40 && optInt != -41 && optInt != -42 && optInt != -43 && optInt != -44) {
                                ToastUtils.m89259g(optInt);
                            }
                            ToastUtils.m89270r(AbstractC23161o1.m119317b(optInt));
                        }
                    }
                } catch (Exception e11) {
                    e11.printStackTrace();
                }
                IntentHandlerInternalActivity.this.f55249Z = false;
            } catch (Throwable th2) {
                IntentHandlerInternalActivity.this.f55249Z = false;
                throw th2;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.IntentHandlerInternalActivity$c */
    /* loaded from: classes5.dex */
    public class C10940c implements InterfaceC20094a {

        /* renamed from: a */
        final /* synthetic */ ContactProfile f55259a;

        C10940c(ContactProfile contactProfile) {
            this.f55259a = contactProfile;
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
            try {
                try {
                    ToastUtils.m89270r(IntentHandlerInternalActivity.this.getString(AbstractC8020f0.str_hint_sendFriendRequestFail));
                } catch (Exception e11) {
                    e11.printStackTrace();
                }
            } finally {
                IntentHandlerInternalActivity.this.f55250a0 = false;
            }
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            JSONObject jSONObject;
            try {
                try {
                    JSONObject jSONObject2 = (JSONObject) obj;
                    if (!jSONObject2.isNull("data") && (jSONObject = jSONObject2.getJSONObject("data")) != null && !jSONObject.isNull("code")) {
                        int i11 = jSONObject.getInt("code");
                        if (i11 == 0) {
                            ToastUtils.m89270r(IntentHandlerInternalActivity.this.getString(AbstractC8020f0.str_hint_sendFriendRequestSuccessNew));
                            AbstractC23059e9.m118317F(this.f55259a.f42434r);
                            AbstractC21935u.m114533W(this.f55259a.f42434r, 3, "");
                            AbstractC23063f2.m118349a(this.f55259a);
                        } else {
                            AbstractC23063f2.m118357i(i11, this.f55259a.f42434r);
                            if (i11 != -40 && i11 != -41 && i11 != -42 && i11 != -43 && i11 != -44) {
                                ToastUtils.m89259g(i11);
                            }
                            ToastUtils.m89270r(AbstractC23161o1.m119317b(i11));
                        }
                    }
                } catch (Exception e11) {
                    e11.printStackTrace();
                }
                IntentHandlerInternalActivity.this.f55250a0 = false;
            } catch (Throwable th2) {
                IntentHandlerInternalActivity.this.f55250a0 = false;
                throw th2;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.IntentHandlerInternalActivity$d */
    /* loaded from: classes5.dex */
    public class C10941d implements InterfaceC20094a {

        /* renamed from: com.zing.zalo.ui.IntentHandlerInternalActivity$d$a */
        /* loaded from: classes5.dex */
        class a extends AbstractC0939u {

            /* renamed from: a */
            final /* synthetic */ ContactProfile f55262a;

            a(ContactProfile contactProfile) {
                this.f55262a = contactProfile;
            }

            @Override // p660xw.InterfaceC30214a
            /* renamed from: a */
            public void mo928a() {
                C7960e.m41971c6().m42234Pb(this.f55262a.f42434r);
            }
        }

        C10941d() {
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
            ToastUtils.m89270r(IntentHandlerInternalActivity.this.getString(AbstractC8020f0.error_message));
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            if (obj != null) {
                try {
                    ContactProfile contactProfile = new ContactProfile((JSONObject) obj);
                    contactProfile.m40423p1(true);
                    C18644n.m98531l().m98543e(contactProfile);
                    C0824j.m2153b(new a(contactProfile));
                    C18644n.m98524E();
                } catch (Exception e11) {
                    AbstractC20110a.m104539h(e11);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.IntentHandlerInternalActivity$e */
    /* loaded from: classes5.dex */
    public class C10942e implements InterfaceC20094a {

        /* renamed from: a */
        final /* synthetic */ C24275a f55264a;

        C10942e(C24275a c24275a) {
            this.f55264a = c24275a;
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
            try {
                IntentHandlerInternalActivity.this.m56815c4();
                IntentHandlerInternalActivity.this.f55253d0 = false;
                ToastUtils.m89270r(c20096c.m104492d());
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            String format;
            try {
                C7860a.Companion.m40303b().m40260C0();
                IntentHandlerInternalActivity.this.m56815c4();
                IntentHandlerInternalActivity.this.f55253d0 = false;
                C0804b.m2025g().m2029b(this.f55264a);
                if (this.f55264a.m126772i()) {
                    format = MainApplication.getAppContext().getString(AbstractC8020f0.str_mute_msg_mute_until_reset);
                } else {
                    SimpleDateFormat simpleDateFormat = new SimpleDateFormat("HH:mm dd:MM:yyyy");
                    long m126767d = this.f55264a.m126767d();
                    Calendar calendar = Calendar.getInstance();
                    calendar.setTimeInMillis(m126767d);
                    format = String.format(MainApplication.getAppContext().getString(AbstractC8020f0.str_mute_msg_success_with_time), simpleDateFormat.format(calendar.getTime()));
                }
                ToastUtils.m89270r(format);
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    /* renamed from: r3 */
    private void m56819r3(C24275a c24275a) {
        if (c24275a == null || this.f55253d0) {
            return;
        }
        m56814B8(null, true);
        C0766k c0766k = new C0766k();
        c0766k.mo1704o8(new C10942e(c24275a));
        this.f55253d0 = true;
        c0766k.mo1652h7(c24275a, new MuteTrackingSource(4));
    }

    /* renamed from: t3 */
    private void m56820t3(Intent intent) {
        final String stringExtra = intent.getStringExtra("EXTRA_UID");
        final int intExtra = intent.getIntExtra("EXTRA_REACT_TYPE", 0);
        final String stringExtra2 = intent.getStringExtra("EXTRA_REACT_ICON");
        final String stringExtra3 = intent.getStringExtra("EXTRA_GLOBAL_MSG_ID");
        if (!TextUtils.isEmpty(stringExtra) && C23055e5.m118272g(true)) {
            if (!TextUtils.isEmpty(stringExtra2) && !TextUtils.isEmpty(stringExtra3)) {
                C23288a.f113033a.mo13474a(new C18427b(stringExtra, new Runnable() { // from class: h40.p0
                    @Override // java.lang.Runnable
                    public final void run() {
                        IntentHandlerInternalActivity.m56822x3(stringExtra3, stringExtra, intExtra, stringExtra2);
                    }
                }));
            }
            C28023b6.m141250h0().m141293J(stringExtra);
            C18823a.f94109a.m98806a(stringExtra);
            if (MessagePopupActivity.m56886u4() != null) {
                MessagePopupActivity.m56886u4().finish();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: v3 */
    public /* synthetic */ void m56821v3(InterfaceC17463d interfaceC17463d) {
        finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: x3 */
    public static /* synthetic */ void m56822x3(String str, String str2, int i11, String str3) {
        C17945a0 m2635r = AbstractC23306f.m120584H0().m2635r(MessageId.m41038e("", str, str2, ""));
        if (m2635r != null && m2635r.m95144g8()) {
            AbstractC19646n0.m102956a2(m2635r, C24753f.m128590d(i11, str3), 5, false);
            ToastUtils.m89266n(AbstractC8020f0.str_reacted_message, new Object[0]);
        }
    }

    /* renamed from: A3 */
    public void m56823A3(String str) {
        int i11;
        try {
            ContactProfile m141809c = C28203u6.f131407a.m141809c(str);
            if (m141809c != null) {
                i11 = m141809c.f42385V0;
            } else {
                i11 = 0;
            }
            C0766k c0766k = new C0766k();
            c0766k.mo1704o8(new C10941d());
            c0766k.mo1514Q4(str, i11, new TrackingSource((short) 1023));
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: B3 */
    public void m56824B3(ContactProfile contactProfile) {
        try {
            TrackingSource trackingSource = new TrackingSource(9000);
            trackingSource.m40677a("sourceView", 21);
            C21927m.m114302u().m114328d0(contactProfile.f42434r, trackingSource);
            startActivity(AbstractC23152n3.m119022T(contactProfile, 1));
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: E3 */
    public void m56825E3(String str, int i11) {
        try {
            C28023b6.m141250h0().m141290I(i11);
            startActivity(AbstractC23152n3.m118998H(new C31991k8(str, false, C32002l4.m154264g(41))));
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // com.zing.zalo.p077ui.IntentHandlerBaseActivity
    /* renamed from: Q2 */
    protected void mo56788Q2(Intent intent) {
        char c11;
        KeyEventCallbackC17462c m118580h;
        if (intent == null) {
            return;
        }
        String action = intent.getAction();
        AbstractC20110a.m104535d("action: %s", action);
        if (TextUtils.isEmpty(action)) {
            return;
        }
        try {
            switch (action.hashCode()) {
                case -1173428130:
                    if (action.equals("android.intent.action.MUTE")) {
                        c11 = '\b';
                        break;
                    }
                    c11 = 65535;
                    break;
                case -1007715467:
                    if (action.equals("android.intent.action.SEND_MESSAGE")) {
                        c11 = 2;
                        break;
                    }
                    c11 = 65535;
                    break;
                case -1001881997:
                    if (action.equals("android.intent.action.REQUEST_FRIEND")) {
                        c11 = 1;
                        break;
                    }
                    c11 = 65535;
                    break;
                case -308815136:
                    if (action.equals("android.intent.action.ACCEPT_REQUEST_FRIEND")) {
                        c11 = 0;
                        break;
                    }
                    c11 = 65535;
                    break;
                case -133769368:
                    if (action.equals("android.intent.action.SEEN_MESSAGE")) {
                        c11 = 7;
                        break;
                    }
                    c11 = 65535;
                    break;
                case -81624371:
                    if (action.equals("android.intent.action.REPLY_MESSAGE")) {
                        c11 = 3;
                        break;
                    }
                    c11 = 65535;
                    break;
                case 133616291:
                    if (action.equals("android.intent.action.ACTION_QUICK_REPLY_EMOJI_MESSAGE")) {
                        c11 = 6;
                        break;
                    }
                    c11 = 65535;
                    break;
                case 892391185:
                    if (action.equals("android.intent.action.ACTION_QUICK_REACT_MESSAGE")) {
                        c11 = 5;
                        break;
                    }
                    c11 = 65535;
                    break;
                case 1304036148:
                    if (action.equals("android.intent.action.VIEW_PROFILE")) {
                        c11 = '\n';
                        break;
                    }
                    c11 = 65535;
                    break;
                case 1339205531:
                    if (action.equals("android.intent.action.QUICK_REPLY_MESSAGE")) {
                        c11 = 4;
                        break;
                    }
                    c11 = 65535;
                    break;
                case 2121241629:
                    if (action.equals("android.intent.action.MUTE_IN_AN_HOUR")) {
                        c11 = '\t';
                        break;
                    }
                    c11 = 65535;
                    break;
                default:
                    c11 = 65535;
                    break;
            }
            switch (c11) {
                case 0:
                    String stringExtra = intent.getStringExtra("EXTRA_UID");
                    int intExtra = intent.getIntExtra("EXTRA_MSG_ID", 0);
                    if (!TextUtils.isEmpty(stringExtra)) {
                        if (AbstractC23063f2.m118361m(stringExtra)) {
                            C28023b6.m141250h0().m141290I(intExtra);
                            m56824B3(new ContactProfile(stringExtra));
                        } else {
                            m56825E3(stringExtra, intExtra);
                        }
                    }
                    finish();
                    break;
                case 1:
                    String stringExtra2 = intent.getStringExtra("EXTRA_UID");
                    String stringExtra3 = intent.getStringExtra("EXTRA_DPN");
                    String stringExtra4 = intent.getStringExtra("EXTRA_AVT");
                    ContactProfile contactProfile = new ContactProfile(stringExtra2);
                    contactProfile.f42437s = stringExtra3;
                    contactProfile.f42446v = stringExtra4;
                    int intExtra2 = intent.getIntExtra("EXTRA_MSG_ID", 0);
                    if (!TextUtils.isEmpty(stringExtra2)) {
                        C28023b6.m141250h0().m141290I(intExtra2);
                        m56826o3(contactProfile);
                    }
                    finish();
                    break;
                case 2:
                    String stringExtra5 = intent.getStringExtra("EXTRA_UID");
                    String stringExtra6 = intent.getStringExtra("EXTRA_MSG");
                    if (!TextUtils.isEmpty(stringExtra5) && !TextUtils.isEmpty(stringExtra6)) {
                        AbstractC23112j7.m118532h0(stringExtra5, stringExtra6);
                        C28023b6.m141250h0().m141293J(stringExtra5);
                        if (MessagePopupActivity.m56886u4() != null) {
                            MessagePopupActivity.m56886u4().finish();
                        }
                    }
                    finish();
                    break;
                case 3:
                    ContentMessagePopup contentMessagePopup = new ContentMessagePopup(intent.getStringExtra("EXTRA_UID"), intent.getStringExtra("EXTRA_DPN"), intent.getStringExtra("EXTRA_MSG"), intent.getIntExtra("EXTRA_TYPE", 0), intent.getStringExtra("EXTRA_AVT"), intent.getLongExtra("EXTRA_TIME_STAMP", 0L), intent.getStringExtra("EXTRA_GLOBAL_MSG_ID"), intent.getBooleanExtra("EXTRA_IS_STORY", false));
                    MessagePopupActivity.m56885s5(new ArrayList());
                    MessagePopupActivity.m56887v4().add(contentMessagePopup);
                    Intent intent2 = new Intent(this, (Class<?>) MessagePopupActivity.class);
                    intent2.addFlags(67108864);
                    intent2.addFlags(268435456);
                    if (RetryMsgPopupActivity.m56950X3() != null) {
                        RetryMsgPopupActivity.m56954u4(false);
                        RetryMsgPopupActivity.m56950X3().finish();
                    }
                    if (MessageHintSuggestActivity.m56851y4() != null) {
                        MessageHintSuggestActivity.m56835R5(false);
                        MessageHintSuggestActivity.m56851y4().finish();
                    }
                    startActivity(intent2);
                    finish();
                    break;
                case 4:
                    new C18824b().m98807a(intent);
                    finish();
                    break;
                case 5:
                    m56820t3(intent);
                    finish();
                    break;
                case 6:
                    String stringExtra7 = intent.getStringExtra("EXTRA_UID");
                    if (!TextUtils.isEmpty(stringExtra7) && C23055e5.m118272g(true)) {
                        String stringExtra8 = intent.getStringExtra("EXTRA_REPLY_EMOJI_TEXT");
                        if (!TextUtils.isEmpty(stringExtra8)) {
                            C17979l1 c17979l1 = new C17979l1();
                            if (C28652r.m143349v().m143373k(stringExtra8)) {
                                c17979l1.f91058a = 200;
                            }
                            AbstractC23112j7.m118538k0(stringExtra7, stringExtra8, C26406h.m136178b(c17979l1));
                            ToastUtils.m89266n(AbstractC8020f0.str_msg_send_via_notification, new Object[0]);
                        }
                        C28023b6.m141250h0().m141293J(stringExtra7);
                        C18823a.f94109a.m98806a(stringExtra7);
                        if (MessagePopupActivity.m56886u4() != null) {
                            MessagePopupActivity.m56886u4().finish();
                        }
                    }
                    finish();
                    break;
                case 7:
                    String stringExtra9 = intent.getStringExtra("EXTRA_UID");
                    int intExtra3 = intent.getIntExtra("EXTRA_MSG_ID", 0);
                    C18823a.f94109a.m98806a(stringExtra9);
                    C28023b6.m141250h0().m141290I(intExtra3);
                    if (MessagePopupActivity.m56886u4() != null) {
                        MessagePopupActivity.m56886u4().finish();
                    }
                    finish();
                    break;
                case '\b':
                    String stringExtra10 = intent.getStringExtra("EXTRA_UID");
                    if (!TextUtils.isEmpty(stringExtra10) && (m118580h = AbstractC23116k0.m118580h(getContext(), AbstractC25495a.m132079d(stringExtra10), new C10938a(stringExtra10))) != null) {
                        m118580h.m92855F(new InterfaceC17463d.e() { // from class: h40.o0
                            @Override // com.zing.zalo.zview.dialog.InterfaceC17463d.e
                            /* renamed from: Tv */
                            public final void mo12457Tv(InterfaceC17463d interfaceC17463d) {
                                IntentHandlerInternalActivity.this.m56821v3(interfaceC17463d);
                            }
                        });
                        m118580h.mo13822K();
                        break;
                    }
                    break;
                case '\t':
                    String stringExtra11 = intent.getStringExtra("EXTRA_UID");
                    if (!TextUtils.isEmpty(stringExtra11)) {
                        m56828z3(0, stringExtra11);
                        C28023b6.m141250h0().m141293J(stringExtra11);
                        finish();
                        break;
                    }
                    break;
                case '\n':
                    String stringExtra12 = intent.getStringExtra("EXTRA_UID");
                    int intExtra4 = intent.getIntExtra("EXTRA_MSG_ID", 0);
                    if (!TextUtils.isEmpty(stringExtra12)) {
                        m56825E3(stringExtra12, intExtra4);
                    }
                    finish();
                    break;
            }
            String stringExtra13 = intent.getStringExtra("EXTRA_NOTI_TYPE");
            int intExtra5 = intent.getIntExtra("EXTRA_ACTION_TYPE", 0);
            if (!TextUtils.isEmpty(stringExtra13)) {
                AbstractC23647d.m123906p(String.format(stringExtra13, Integer.valueOf(intExtra5)));
                AbstractC23647d.m123893c();
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: o3 */
    public void m56826o3(ContactProfile contactProfile) {
        try {
            String str = contactProfile.f42434r;
            if (this.f55249Z) {
                return;
            }
            this.f55249Z = true;
            C0766k c0766k = new C0766k();
            c0766k.mo1704o8(new C10939b(str, contactProfile));
            c0766k.mo1615ca(contactProfile.f42434r);
        } catch (Exception e11) {
            e11.printStackTrace();
            this.f55249Z = false;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0028, code lost:            if (android.text.TextUtils.isEmpty(r0) == false) goto L11;     */
    /* renamed from: y3 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void m56827y3(ContactProfile contactProfile) {
        String str;
        if (this.f55250a0) {
            return;
        }
        this.f55250a0 = true;
        this.f55251b0.mo1704o8(new C10940c(contactProfile));
        TrackingSource m114310H = C21927m.m114302u().m114310H(contactProfile.f42434r);
        if (m114310H != null) {
            str = m114310H.m40682o();
        }
        str = "";
        this.f55251b0.mo1620d7(contactProfile.f42434r, "", -1, str);
    }

    /* renamed from: z3 */
    public boolean m56828z3(int i11, String str) {
        try {
            m56819r3(AbstractC19646n0.m103040w0(i11, str, AbstractC25495a.m132079d(str), 3));
            return false;
        } catch (Exception e11) {
            e11.printStackTrace();
            return false;
        }
    }
}
