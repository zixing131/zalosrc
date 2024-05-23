package bp0;

import ae.C0766k;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.telephony.PhoneNumberUtils;
import android.text.TextUtils;
import ap0.C2279a;
import bp0.AbstractC3102n;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.MainApplication;
import com.zing.zalo.activity.ZaloActivity;
import com.zing.zalo.control.ContactProfile;
import com.zing.zalo.data.chat.model.tabmessage.Conversation;
import com.zing.zalo.p062db.C7960e;
import com.zing.zalo.p077ui.zviews.AddFriendView;
import com.zing.zalo.utils.ToastUtils;
import com.zing.zalo.zview.ZaloView;
import com.zing.zalo.zview.dialog.KeyEventCallbackC17462c;
import com.zing.zalocore.CoreUtility;
import en0.InterfaceC18494a;
import gg0.AbstractC19444a;
import hm0.C20096c;
import hm0.InterfaceC20094a;
import java.util.List;
import me0.AbstractC23034c6;
import me0.AbstractC23057e7;
import me0.AbstractC23136l9;
import me0.C23024b7;
import me0.C23055e5;
import org.json.JSONObject;
import p172fy.C19171b;
import p207he.C20024r;
import p304ks.AbstractC21935u;
import p348mi.AbstractC23304d;
import p348mi.AbstractC23306f;
import p348mi.AbstractC23309i;
import p510sq.C26365a;
import p542ub.InterfaceC27218a;
import p716zh.C32002l4;
import pm0.C24848g0;

/* renamed from: bp0.n */
/* loaded from: classes7.dex */
public abstract class AbstractC3102n {

    /* renamed from: a */
    public static ContactProfile f13180a;

    /* renamed from: bp0.n$a */
    /* loaded from: classes7.dex */
    public class a implements InterfaceC20094a {

        /* renamed from: a */
        final /* synthetic */ b f13181a;

        /* renamed from: b */
        final /* synthetic */ InterfaceC27218a f13182b;

        /* renamed from: c */
        final /* synthetic */ String f13183c;

        a(b bVar, InterfaceC27218a interfaceC27218a, String str) {
            this.f13181a = bVar;
            this.f13182b = interfaceC27218a;
            this.f13183c = str;
        }

        /* renamed from: e */
        public static /* synthetic */ C24848g0 m15610e() {
            return null;
        }

        /* renamed from: f */
        public static /* synthetic */ void m15611f(InterfaceC27218a interfaceC27218a, String str) {
            KeyEventCallbackC17462c m78064c = AddFriendView.Companion.m78064c(interfaceC27218a.getContext(), str, new InterfaceC18494a() { // from class: bp0.m
                @Override // en0.InterfaceC18494a
                /* renamed from: V4 */
                public final Object mo12V4() {
                    C24848g0 m15610e;
                    m15610e = AbstractC3102n.a.m15610e();
                    return m15610e;
                }
            });
            if (m78064c != null) {
                m78064c.mo13822K();
            }
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
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
                AbstractC19444a.m101697e(new Runnable() { // from class: bp0.l

                    /* renamed from: q */
                    public final /* synthetic */ String f13179q;

                    public /* synthetic */ RunnableC3100l(String str2) {
                        r2 = str2;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        AbstractC3102n.a.m15611f(InterfaceC27218a.this, r2);
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
            if (obj != null) {
                try {
                    JSONObject jSONObject2 = (JSONObject) obj;
                    if (jSONObject2.isNull("data")) {
                        jSONObject = null;
                    } else {
                        jSONObject = new JSONObject(jSONObject2.getString("data"));
                    }
                    if (jSONObject != null) {
                        this.f13181a.mo15476a(jSONObject);
                    }
                } catch (Exception e11) {
                    AbstractC3082b0.m15423e("CallUtils", "getProfileFromNumber 164: " + e11.getMessage(), e11);
                    e11.printStackTrace();
                }
            }
        }
    }

    /* renamed from: bp0.n$b */
    /* loaded from: classes7.dex */
    public interface b {
        /* renamed from: a */
        void mo15476a(JSONObject jSONObject);
    }

    /* renamed from: A */
    public static void m15581A(String str, String str2, InterfaceC27218a interfaceC27218a) {
        m15607z(str, str2, null, interfaceC27218a);
    }

    /* renamed from: e */
    public static boolean m15586e(Conversation conversation) {
        return !conversation.m41015u();
    }

    /* renamed from: f */
    public static Context m15587f(InterfaceC27218a interfaceC27218a) {
        if (interfaceC27218a instanceof ZaloActivity) {
            return (ZaloActivity) interfaceC27218a;
        }
        return interfaceC27218a.getContext();
    }

    /* renamed from: g */
    public static boolean m15588g(ContactProfile contactProfile) {
        if (contactProfile != null && !contactProfile.m40372J0()) {
            return true;
        }
        return false;
    }

    /* renamed from: h */
    public static String m15589h(Context context, ContactProfile contactProfile) {
        if (contactProfile != null) {
            if (AbstractC23309i.m121109K2() == 1) {
                return m15591j(context, contactProfile.m40383Q(true, false), contactProfile.f42434r, true);
            }
            return m15591j(context, contactProfile.m40383Q(true, false), contactProfile.f42434r, false);
        }
        return "";
    }

    /* renamed from: i */
    private static void m15590i(InterfaceC27218a interfaceC27218a, String str, b bVar) {
        try {
            String m121779c5 = AbstractC23309i.m121779c5();
            if (m121779c5 == null) {
                m121779c5 = AbstractC23309i.m121704a5();
            }
            C0766k c0766k = new C0766k();
            c0766k.mo1704o8(new a(bVar, interfaceC27218a, str));
            c0766k.mo1583Y9(str, m121779c5, 6);
        } catch (Exception e11) {
            AbstractC3082b0.m15423e("CallUtils", "getProfileFromNumber 200: " + e11.getMessage(), e11);
        }
    }

    /* renamed from: j */
    static String m15591j(Context context, String str, String str2, boolean z11) {
        if (context == null) {
            return str;
        }
        if (TextUtils.isEmpty(str)) {
            return context.getResources().getString(AbstractC8020f0.unknown_user);
        }
        if (z11 && !AbstractC21935u.m114555v(str2, true) && !TextUtils.isEmpty(str2)) {
            return String.format(context.getResources().getString(AbstractC8020f0.str_dpn_miss_call_stranger), str);
        }
        return str;
    }

    /* renamed from: k */
    public static boolean m15592k(String str) {
        List list;
        try {
            if (TextUtils.isEmpty(str)) {
                return false;
            }
            String replaceAll = str.replaceAll("\\D+", "");
            if (replaceAll.length() < 9 || replaceAll.length() > 12 || (list = AbstractC23304d.f113371c3) == null || list.size() == 0) {
                return false;
            }
            String substring = replaceAll.substring(0, 5);
            for (int i11 = 0; i11 < list.size(); i11++) {
                if (substring.contains((CharSequence) list.get(i11))) {
                    return true;
                }
            }
            return false;
        } catch (Exception e11) {
            e11.printStackTrace();
            return false;
        }
    }

    /* renamed from: l */
    public static /* synthetic */ void m15593l(ContactProfile contactProfile, InterfaceC27218a interfaceC27218a, int i11, int i12) {
        if (contactProfile != null) {
            try {
                if (!AbstractC23057e7.m118300g(m15587f(interfaceC27218a)) && C23055e5.m118272g(true)) {
                    if (TextUtils.equals(contactProfile.f42434r, CoreUtility.f89233i)) {
                        new C19171b().m101508a(new C19171b.a(interfaceC27218a, new C26365a.b(contactProfile.f42434r, C32002l4.m154265h(0, 8)).m135743b(), 0, 1));
                    } else if (C20024r.m103941j()) {
                        if (TextUtils.equals(String.valueOf(C20024r.m103938d()), contactProfile.f42434r)) {
                            C20024r.m103949w();
                        } else {
                            ToastUtils.showMess(MainApplication.getAppContext().getString(AbstractC8020f0.str_warning_make_newcall_while_calling));
                        }
                    } else {
                        Context m15587f = m15587f(interfaceC27218a);
                        String[] strArr = AbstractC23034c6.f112030g;
                        if (AbstractC23034c6.m118167n(m15587f, strArr) != 0) {
                            AbstractC23034c6.m118186w0(interfaceC27218a, strArr, i11);
                        } else {
                            AbstractC23306f.m120722w0().m101508a(new C2279a.a(contactProfile.f42434r, contactProfile.m40383Q(true, false), contactProfile.f42446v, false, i12));
                        }
                    }
                }
            } catch (Exception e11) {
                AbstractC3082b0.m15423e("CallUtils", "checkToStartZaloService: " + e11.getMessage(), e11);
            }
        }
    }

    /* renamed from: m */
    public static /* synthetic */ void m15594m(InterfaceC27218a interfaceC27218a, JSONObject jSONObject) {
        String string;
        try {
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
                AbstractC3082b0.m15423e("CallUtils", "processFindFriend 113:" + e11.getMessage(), e11);
            }
            if (string.length() > 0 && !string.equalsIgnoreCase("null")) {
                m15581A(string, "", interfaceC27218a);
            }
        } catch (Exception e12) {
            AbstractC3082b0.m15423e("CallUtils", "processFindFriend 128: " + e12.getMessage(), e12);
        }
    }

    /* renamed from: n */
    public static /* synthetic */ void m15595n(InterfaceC27218a interfaceC27218a, JSONObject jSONObject) {
        f13180a = new ContactProfile(jSONObject);
        m15600s(interfaceC27218a);
    }

    /* renamed from: o */
    public static /* synthetic */ void m15596o(InterfaceC27218a interfaceC27218a, C26365a c26365a) {
        new C19171b().m101508a(new C19171b.a(interfaceC27218a, c26365a, 1009, 1));
    }

    /* renamed from: p */
    public static void m15597p(ZaloView zaloView) {
        m15598q(zaloView, 83, f13180a);
    }

    /* renamed from: q */
    public static void m15598q(ZaloView zaloView, int i11, ContactProfile contactProfile) {
        m15599r(zaloView, i11, contactProfile, 125);
    }

    /* renamed from: r */
    public static void m15599r(ZaloView zaloView, int i11, ContactProfile contactProfile, int i12) {
        m15602u(zaloView.m92676n2(), i11, contactProfile, i12);
    }

    /* renamed from: s */
    public static void m15600s(InterfaceC27218a interfaceC27218a) {
        m15601t(interfaceC27218a, 83, f13180a);
    }

    /* renamed from: t */
    public static void m15601t(InterfaceC27218a interfaceC27218a, int i11, ContactProfile contactProfile) {
        m15602u(interfaceC27218a, i11, contactProfile, 125);
    }

    /* renamed from: u */
    public static void m15602u(InterfaceC27218a interfaceC27218a, int i11, ContactProfile contactProfile, int i12) {
        if (interfaceC27218a == null) {
            return;
        }
        interfaceC27218a.runOnUiThread(new Runnable() { // from class: bp0.h

            /* renamed from: q */
            public final /* synthetic */ InterfaceC27218a f13153q;

            /* renamed from: r */
            public final /* synthetic */ int f13154r;

            /* renamed from: s */
            public final /* synthetic */ int f13155s;

            public /* synthetic */ RunnableC3093h(InterfaceC27218a interfaceC27218a2, int i122, int i112) {
                r2 = interfaceC27218a2;
                r3 = i122;
                r4 = i112;
            }

            @Override // java.lang.Runnable
            public final void run() {
                AbstractC3102n.m15593l(ContactProfile.this, r2, r3, r4);
            }
        });
    }

    /* renamed from: v */
    public static String m15603v(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        StringBuilder sb2 = new StringBuilder();
        int length = str.length();
        for (int i11 = 0; i11 < length; i11++) {
            char charAt = str.charAt(i11);
            int digit = Character.digit(charAt, 10);
            if (digit != -1) {
                sb2.append(digit);
            } else if (sb2.length() == 0 && charAt == '+') {
                sb2.append(charAt);
            } else if ((charAt >= 'a' && charAt <= 'z') || (charAt >= 'A' && charAt <= 'Z')) {
                return m15603v(PhoneNumberUtils.convertKeypadLettersToDigits(str));
            }
        }
        return sb2.toString();
    }

    /* renamed from: w */
    public static void m15604w(InterfaceC27218a interfaceC27218a, String str) {
        if (interfaceC27218a == null) {
            return;
        }
        try {
            if (TextUtils.isEmpty(str)) {
                return;
            }
            m15590i(interfaceC27218a, str, new b() { // from class: bp0.j
                public /* synthetic */ C3097j() {
                }

                @Override // bp0.AbstractC3102n.b
                /* renamed from: a */
                public final void mo15476a(JSONObject jSONObject) {
                    AbstractC3102n.m15594m(InterfaceC27218a.this, jSONObject);
                }
            });
        } catch (Exception e11) {
            AbstractC3082b0.m15423e("CallUtils", "processFindFriend 133: " + e11.getMessage(), e11);
        }
    }

    /* renamed from: x */
    public static void m15605x(InterfaceC27218a interfaceC27218a, String str) {
        if (interfaceC27218a == null) {
            return;
        }
        try {
            if (TextUtils.isEmpty(str)) {
                return;
            }
            m15590i(interfaceC27218a, str, new b() { // from class: bp0.i
                public /* synthetic */ C3095i() {
                }

                @Override // bp0.AbstractC3102n.b
                /* renamed from: a */
                public final void mo15476a(JSONObject jSONObject) {
                    AbstractC3102n.m15595n(InterfaceC27218a.this, jSONObject);
                }
            });
        } catch (Exception e11) {
            AbstractC3082b0.m15423e("CallUtils", "processMakeCall: " + e11.getMessage(), e11);
        }
    }

    /* renamed from: y */
    public static void m15606y(String str, Context context) {
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse("tel:" + str));
        intent.putExtra("com.android.browser.application_id", context.getPackageName());
        try {
            context.startActivity(intent);
        } catch (ActivityNotFoundException unused) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Actvity was not found for intent, ");
            sb2.append(intent.toString());
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ProcessVariables
        jadx.core.utils.exceptions.JadxRuntimeException: Method arg registers not loaded: bp0.k.<init>(ub.a, sq.a):void, class status: GENERATED_AND_UNLOADED
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
    /* renamed from: z */
    public static void m15607z(java.lang.String r3, java.lang.String r4, com.zing.zalo.feed.adapters.C8050a.d0 r5, p542ub.InterfaceC27218a r6) {
        /*
            java.lang.String r0 = com.zing.zalocore.CoreUtility.f89233i     // Catch: java.lang.Exception -> L1c
            boolean r0 = r3.equals(r0)     // Catch: java.lang.Exception -> L1c
            if (r0 != 0) goto L1e
            com.zing.zalo.control.TrackingSource r0 = new com.zing.zalo.control.TrackingSource     // Catch: java.lang.Exception -> L1c
            r1 = 10
            r0.<init>(r1)     // Catch: java.lang.Exception -> L1c
            java.lang.String r1 = "uidTo"
            r0.m40677a(r1, r3)     // Catch: java.lang.Exception -> L1c
            ks.m r1 = p304ks.C21927m.m114302u()     // Catch: java.lang.Exception -> L1c
            r1.m114330e0(r3, r0)     // Catch: java.lang.Exception -> L1c
            goto L1e
        L1c:
            r3 = move-exception
            goto L4e
        L1e:
            if (r6 == 0) goto L25
            com.zing.zalo.zview.o0 r0 = r6.mo35579p()     // Catch: java.lang.Exception -> L1c
            goto L26
        L25:
            r0 = 0
        L26:
            r1 = 0
            r2 = 8
            zh.l4 r1 = p716zh.C32002l4.m154265h(r1, r2)     // Catch: java.lang.Exception -> L1c
            sq.a$b r2 = new sq.a$b     // Catch: java.lang.Exception -> L1c
            r2.<init>(r3, r1)     // Catch: java.lang.Exception -> L1c
            r3 = 1
            sq.a$b r3 = r2.m135757p(r3)     // Catch: java.lang.Exception -> L1c
            sq.a$b r3 = r3.m135739F(r4)     // Catch: java.lang.Exception -> L1c
            sq.a$b r3 = r3.m135735B(r5)     // Catch: java.lang.Exception -> L1c
            sq.a r3 = r3.m135743b()     // Catch: java.lang.Exception -> L1c
            if (r0 == 0) goto L68
            bp0.k r4 = new bp0.k     // Catch: java.lang.Exception -> L1c
            r4.<init>()     // Catch: java.lang.Exception -> L1c
            gg0.AbstractC19444a.m101695c(r4)     // Catch: java.lang.Exception -> L1c
            goto L68
        L4e:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "checkToStartZaloService: "
            r4.append(r5)
            java.lang.String r5 = r3.getMessage()
            r4.append(r5)
            java.lang.String r4 = r4.toString()
            java.lang.String r5 = "CallUtils"
            bp0.AbstractC3082b0.m15423e(r5, r4, r3)
        L68:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: bp0.AbstractC3102n.m15607z(java.lang.String, java.lang.String, com.zing.zalo.feed.adapters.a$d0, ub.a):void");
    }
}
