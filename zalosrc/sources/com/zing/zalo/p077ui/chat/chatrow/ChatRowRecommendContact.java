package com.zing.zalo.p077ui.chat.chatrow;

import ae.C0766k;
import ag0.AbstractC0837p0;
import am.AbstractC0924m0;
import am.C0927o;
import am.C0943w;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.text.StaticLayout;
import android.view.MotionEvent;
import au.C2343e;
import com.androidquery.util.C3977j;
import com.androidquery.util.C3979l;
import com.androidquery.util.InterfaceC3968a;
import com.zing.zalo.AbstractC16781w;
import com.zing.zalo.AbstractC16801x;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.control.ContactProfile;
import com.zing.zalo.control.TrackingSource;
import com.zing.zalo.p062db.C7956b;
import com.zing.zalo.p077ui.chat.chatrow.ChatRowRecommendContact;
import com.zing.zalo.p077ui.widget.C13704p1;
import com.zing.zalo.p077ui.widget.C13804v0;
import com.zing.zalo.p077ui.zviews.QuickCreateGroupView;
import com.zing.zalo.uicontrol.C16640q2;
import com.zing.zalo.utils.ToastUtils;
import com.zing.zalo.zmedia.player.ZMediaPlayer;
import com.zing.zalocore.CoreUtility;
import dj.C17945a0;
import dj.C17969i0;
import dj.C17978l0;
import dj.C18013y0;
import eg0.AbstractC18428c;
import en0.InterfaceC18494a;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import gg0.AbstractC19444a;
import hm0.C20096c;
import hm0.InterfaceC20094a;
import java.util.ArrayList;
import java.util.List;
import ln0.AbstractC22543l;
import me0.AbstractC23028c0;
import me0.AbstractC23056e6;
import me0.AbstractC23136l9;
import me0.AbstractC23214t;
import me0.AbstractC23217t2;
import me0.C23212s8;
import me0.C23278z2;
import mg.C23288a;
import mm0.AbstractC23350e;
import org.json.JSONArray;
import org.json.JSONObject;
import p142ey.C18644n;
import p173fz.C19172a;
import p207he.C20011e;
import p304ks.AbstractC21935u;
import p304ks.C21927m;
import p348mi.C23302b;
import p354n3.C23528a;
import p379o3.C23995f;
import p379o3.C23999j;
import p461qu.AbstractC25495a;
import p620wt.AbstractC29233h;
import p620wt.AbstractC29235j;
import p620wt.C29234i;
import p620wt.InterfaceC29232g;
import p716zh.C31943h5;
import p716zh.C32076q5;
import pm0.AbstractC24856m;
import pm0.C24848g0;
import pm0.InterfaceC24854k;
import tj.C26713e;
import vg.C28203u6;
import vg.C28227x3;
import w50.C28769a;

/* loaded from: classes5.dex */
public final class ChatRowRecommendContact extends ChatRowHasCaption {
    public static final C11391f Companion = new C11391f(null);

    /* renamed from: H8 */
    private static boolean f58342H8 = AbstractC0924m0.m3307O9();

    /* renamed from: I8 */
    private static final C29234i f58343I8;

    /* renamed from: J8 */
    private static final int f58344J8;

    /* renamed from: K8 */
    private static final int f58345K8;

    /* renamed from: L8 */
    private static final int f58346L8;

    /* renamed from: M8 */
    private static final int f58347M8;

    /* renamed from: N8 */
    private static final int f58348N8;

    /* renamed from: O8 */
    private static final int f58349O8;

    /* renamed from: P8 */
    private static final int f58350P8;

    /* renamed from: Q8 */
    private static final InterfaceC29232g f58351Q8;

    /* renamed from: R8 */
    private static final InterfaceC29232g f58352R8;

    /* renamed from: S8 */
    private static final InterfaceC24854k f58353S8;

    /* renamed from: T8 */
    private static final InterfaceC29232g f58354T8;

    /* renamed from: U8 */
    private static final InterfaceC29232g f58355U8;

    /* renamed from: V8 */
    private static int f58356V8;

    /* renamed from: A8 */
    private int f58357A8;

    /* renamed from: B7 */
    private String f58358B7;

    /* renamed from: B8 */
    private int f58359B8;

    /* renamed from: C7 */
    private String f58360C7;

    /* renamed from: C8 */
    private int f58361C8;

    /* renamed from: D7 */
    private boolean f58362D7;

    /* renamed from: D8 */
    private Paint f58363D8;

    /* renamed from: E7 */
    private boolean f58364E7;

    /* renamed from: E8 */
    private C13804v0 f58365E8;

    /* renamed from: F7 */
    private boolean f58366F7;

    /* renamed from: F8 */
    private int f58367F8;

    /* renamed from: G7 */
    private boolean f58368G7;

    /* renamed from: G8 */
    private int f58369G8;

    /* renamed from: H7 */
    private boolean f58370H7;

    /* renamed from: I7 */
    private String f58371I7;

    /* renamed from: J7 */
    private int f58372J7;

    /* renamed from: K7 */
    private int f58373K7;

    /* renamed from: L7 */
    private StaticLayout f58374L7;

    /* renamed from: M7 */
    private int f58375M7;

    /* renamed from: N7 */
    private int f58376N7;

    /* renamed from: O7 */
    private Drawable f58377O7;

    /* renamed from: P7 */
    private boolean f58378P7;

    /* renamed from: Q7 */
    private int f58379Q7;

    /* renamed from: R7 */
    private int f58380R7;

    /* renamed from: S7 */
    private String f58381S7;

    /* renamed from: T7 */
    private final InterfaceC24854k f58382T7;

    /* renamed from: U7 */
    private boolean f58383U7;

    /* renamed from: V7 */
    private int f58384V7;

    /* renamed from: W7 */
    private int f58385W7;

    /* renamed from: X7 */
    private int f58386X7;

    /* renamed from: Y7 */
    private int f58387Y7;

    /* renamed from: Z7 */
    private String f58388Z7;

    /* renamed from: a8 */
    private Drawable f58389a8;

    /* renamed from: b8 */
    private final InterfaceC24854k f58390b8;

    /* renamed from: c8 */
    private int f58391c8;

    /* renamed from: d8 */
    private int f58392d8;

    /* renamed from: e8 */
    private int f58393e8;

    /* renamed from: f8 */
    private Drawable f58394f8;

    /* renamed from: g8 */
    private String f58395g8;

    /* renamed from: h8 */
    private String f58396h8;

    /* renamed from: i8 */
    private boolean f58397i8;

    /* renamed from: j8 */
    private boolean f58398j8;

    /* renamed from: k8 */
    private boolean f58399k8;

    /* renamed from: l8 */
    private int f58400l8;

    /* renamed from: m8 */
    private int f58401m8;

    /* renamed from: n8 */
    private int f58402n8;

    /* renamed from: o8 */
    private int f58403o8;

    /* renamed from: p8 */
    private int f58404p8;

    /* renamed from: q8 */
    private int f58405q8;

    /* renamed from: r8 */
    private int f58406r8;

    /* renamed from: s8 */
    private int f58407s8;

    /* renamed from: t8 */
    private int f58408t8;

    /* renamed from: u8 */
    private int f58409u8;

    /* renamed from: v8 */
    private boolean f58410v8;

    /* renamed from: w8 */
    private boolean f58411w8;

    /* renamed from: x8 */
    private StaticLayout f58412x8;

    /* renamed from: y8 */
    private String f58413y8;

    /* renamed from: z8 */
    private int f58414z8;

    /* renamed from: com.zing.zalo.ui.chat.chatrow.ChatRowRecommendContact$a */
    /* loaded from: classes5.dex */
    static final class C11386a extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final C11386a f58415q = new C11386a();

        C11386a() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a */
        public final Paint mo12V4() {
            Paint paint = new Paint(1);
            paint.setColor(-1);
            paint.setStyle(Paint.Style.STROKE);
            paint.setStrokeWidth(ChatRowRecommendContact.f58350P8);
            return paint;
        }
    }

    /* renamed from: com.zing.zalo.ui.chat.chatrow.ChatRowRecommendContact$b */
    /* loaded from: classes5.dex */
    static final class C11387b extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final C11387b f58416q = new C11387b();

        C11387b() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a */
        public final C13704p1 mo12V4() {
            C13704p1 c13704p1 = new C13704p1(1);
            c13704p1.m76613c();
            c13704p1.setTextSize(AbstractC23136l9.m118759w1(15));
            c13704p1.setColor(-1);
            return c13704p1;
        }
    }

    /* renamed from: com.zing.zalo.ui.chat.chatrow.ChatRowRecommendContact$c */
    /* loaded from: classes5.dex */
    static final class C11388c extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final C11388c f58417q = new C11388c();

        C11388c() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a */
        public final C13704p1 mo12V4() {
            C13704p1 c13704p1 = new C13704p1(1);
            c13704p1.m76612b(7);
            c13704p1.setColor(AbstractC11531v0.Companion.m62557a1());
            c13704p1.setTextSize(AbstractC23136l9.m118742r(15.0f));
            C11391f c11391f = ChatRowRecommendContact.Companion;
            ChatRowRecommendContact.f58356V8 = AbstractC23136l9.m118761x0(c13704p1, "Dg");
            return c13704p1;
        }
    }

    /* renamed from: com.zing.zalo.ui.chat.chatrow.ChatRowRecommendContact$d */
    /* loaded from: classes5.dex */
    static final class C11389d extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final C11389d f58418q = new C11389d();

        C11389d() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a */
        public final C13704p1 mo12V4() {
            C13704p1 c13704p1 = new C13704p1(1);
            c13704p1.m76612b(7);
            c13704p1.setColor(AbstractC11531v0.Companion.m62543V0());
            c13704p1.setTextSize(AbstractC23136l9.m118742r(15.0f));
            C11391f c11391f = ChatRowRecommendContact.Companion;
            ChatRowRecommendContact.f58356V8 = AbstractC23136l9.m118761x0(c13704p1, "Dg");
            return c13704p1;
        }
    }

    /* renamed from: com.zing.zalo.ui.chat.chatrow.ChatRowRecommendContact$e */
    /* loaded from: classes5.dex */
    static final class C11390e extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final C11390e f58419q = new C11390e();

        C11390e() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a */
        public final C13704p1 mo12V4() {
            C13704p1 c13704p1 = new C13704p1(1);
            c13704p1.m76612b(5);
            c13704p1.setTextSize(AbstractC23136l9.m118759w1(12));
            c13704p1.setColor(AbstractC23136l9.m118639A(AbstractC16801x.name_card_sub_text_user));
            return c13704p1;
        }
    }

    /* renamed from: com.zing.zalo.ui.chat.chatrow.ChatRowRecommendContact$f */
    /* loaded from: classes5.dex */
    public static final class C11391f {
        private C11391f() {
        }

        public /* synthetic */ C11391f(AbstractC19060k abstractC19060k) {
            this();
        }

        /* renamed from: f */
        public final Paint m61597f() {
            return (Paint) ChatRowRecommendContact.f58353S8.getValue();
        }

        /* renamed from: g */
        public final C13704p1 m61598g() {
            return (C13704p1) ChatRowRecommendContact.f58351Q8.getValue();
        }

        /* renamed from: h */
        public final C13704p1 m61599h() {
            return (C13704p1) ChatRowRecommendContact.f58355U8.getValue();
        }

        /* renamed from: i */
        public final C13704p1 m61600i() {
            return (C13704p1) ChatRowRecommendContact.f58354T8.getValue();
        }

        /* renamed from: j */
        public final C13704p1 m61601j() {
            return (C13704p1) ChatRowRecommendContact.f58352R8.getValue();
        }

        /* renamed from: k */
        public final int m61602k() {
            return C19172a.m100600k("features@name_card@msg_action_footer", 2);
        }

        /* renamed from: l */
        public final void m61603l() {
            ChatRowRecommendContact.f58343I8.m145993b();
        }

        /* renamed from: m */
        public final void m61604m(boolean z11) {
            ChatRowRecommendContact.f58342H8 = z11;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.chat.chatrow.ChatRowRecommendContact$g */
    /* loaded from: classes5.dex */
    public static final class C11392g extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        final /* synthetic */ Context f58420q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C11392g(Context context) {
            super(0);
            this.f58420q = context;
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a */
        public final C3977j mo12V4() {
            return new C3977j(this.f58420q);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.chat.chatrow.ChatRowRecommendContact$h */
    /* loaded from: classes5.dex */
    public static final class C11393h extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        final /* synthetic */ Context f58421q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C11393h(Context context) {
            super(0);
            this.f58421q = context;
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a */
        public final C3977j mo12V4() {
            return new C3977j(this.f58421q);
        }
    }

    /* renamed from: com.zing.zalo.ui.chat.chatrow.ChatRowRecommendContact$i */
    /* loaded from: classes5.dex */
    public static final class C11394i extends C23999j {
        C11394i() {
        }

        @Override // p379o3.C23999j
        /* renamed from: O1 */
        public void mo473O1(String str, InterfaceC3968a interfaceC3968a, C3979l c3979l, C23995f c23995f) {
            AbstractC19074t.m100208f(str, ZMediaPlayer.OnNativeInvokeListener.ARG_URL);
            AbstractC19074t.m100208f(interfaceC3968a, "imageview");
            AbstractC19074t.m100208f(c23995f, "status");
            try {
                ChatRowRecommendContact chatRowRecommendContact = ChatRowRecommendContact.this;
                if (chatRowRecommendContact.f57263B != null && AbstractC19074t.m100204b(str, chatRowRecommendContact.f58381S7) && c3979l != null && c3979l.m18839c() != null) {
                    if (c3979l.m18839c().getWidth() == 1 && c3979l.m18839c().getHeight() == 1) {
                        return;
                    }
                    ChatRowRecommendContact.this.f58378P7 = true;
                    ChatRowRecommendContact.this.getDumpContactImageView().setImageInfo(c3979l, false);
                    ChatRowRecommendContact.this.f58377O7 = new BitmapDrawable(AbstractC23136l9.m118698c0(), c3979l.m18839c());
                    ChatRowRecommendContact.this.invalidate();
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    /* renamed from: com.zing.zalo.ui.chat.chatrow.ChatRowRecommendContact$j */
    /* loaded from: classes5.dex */
    public static final class C11395j extends C23999j {
        C11395j() {
        }

        @Override // p379o3.C23999j
        /* renamed from: O1 */
        public void mo473O1(String str, InterfaceC3968a interfaceC3968a, C3979l c3979l, C23995f c23995f) {
            AbstractC19074t.m100208f(str, ZMediaPlayer.OnNativeInvokeListener.ARG_URL);
            AbstractC19074t.m100208f(interfaceC3968a, "imageview");
            AbstractC19074t.m100208f(c23995f, "status");
            try {
                if (AbstractC19074t.m100204b(str, ChatRowRecommendContact.this.f58388Z7) && c3979l != null && c3979l.m18839c() != null) {
                    if (c3979l.m18839c().getWidth() == 1 && c3979l.m18839c().getHeight() == 1) {
                        return;
                    }
                    ChatRowRecommendContact.this.getDumpQrCodeImageView().setImageInfo(c3979l, false);
                    ChatRowRecommendContact.this.f58389a8 = new BitmapDrawable(AbstractC23136l9.m118698c0(), c3979l.m18839c());
                    ChatRowRecommendContact.this.invalidate();
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    /* renamed from: com.zing.zalo.ui.chat.chatrow.ChatRowRecommendContact$k */
    /* loaded from: classes5.dex */
    public static final class C11396k implements InterfaceC20094a {
        C11396k() {
        }

        /* renamed from: d */
        public static final void m61608d(ChatRowRecommendContact chatRowRecommendContact) {
            AbstractC19074t.m100208f(chatRowRecommendContact, "this$0");
            chatRowRecommendContact.m61119v3(false);
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
            AbstractC19074t.m100208f(c20096c, "errorMessage");
            AbstractC23350e.m122777g(c20096c.m104492d(), new Object[0]);
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            AbstractC19074t.m100208f(obj, C0927o.f3427r);
            C28203u6.f131407a.m141823v(new ContactProfile((JSONObject) obj), false);
            AbstractC19444a.m101695c(new Runnable() { // from class: com.zing.zalo.ui.chat.chatrow.s0
                public /* synthetic */ RunnableC11522s0() {
                }

                @Override // java.lang.Runnable
                public final void run() {
                    ChatRowRecommendContact.C11396k.m61608d(ChatRowRecommendContact.this);
                }
            });
        }
    }

    static {
        InterfaceC24854k m129210a;
        C29234i m145994a = AbstractC29235j.m145994a();
        f58343I8 = m145994a;
        f58344J8 = AbstractC23136l9.m118742r(32.0f);
        f58345K8 = AbstractC23136l9.m118742r(16.0f);
        f58346L8 = AbstractC23136l9.m118742r(8.0f);
        f58347M8 = AbstractC23136l9.m118742r(56.0f);
        f58348N8 = AbstractC23136l9.m118742r(12.0f);
        f58349O8 = AbstractC23136l9.m118742r(14.0f);
        f58350P8 = AbstractC23136l9.m118742r(2.0f);
        f58351Q8 = AbstractC29233h.m145991b(m145994a, C11387b.f58416q);
        f58352R8 = AbstractC29233h.m145991b(m145994a, C11390e.f58419q);
        m129210a = AbstractC24856m.m129210a(C11386a.f58415q);
        f58353S8 = m129210a;
        f58354T8 = AbstractC29233h.m145991b(m145994a, C11389d.f58418q);
        f58355U8 = AbstractC29233h.m145991b(m145994a, C11388c.f58417q);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChatRowRecommendContact(Context context) {
        super(context);
        InterfaceC24854k m129210a;
        InterfaceC24854k m129210a2;
        AbstractC19074t.m100208f(context, "context");
        this.f58358B7 = "";
        this.f58360C7 = "";
        this.f58371I7 = "";
        this.f58381S7 = "";
        m129210a = AbstractC24856m.m129210a(new C11392g(context));
        this.f58382T7 = m129210a;
        this.f58388Z7 = "";
        m129210a2 = AbstractC24856m.m129210a(new C11393h(context));
        this.f58390b8 = m129210a2;
        this.f58395g8 = "";
        this.f58396h8 = "";
        this.f58399k8 = true;
        this.f58413y8 = "";
    }

    /* renamed from: R4 */
    private final void m61575R4(C17945a0 c17945a0) {
        C11391f c11391f = Companion;
        if (c11391f.m61602k() == 1) {
            m61576S4(c17945a0);
        } else if (c11391f.m61602k() == 2) {
            m61579V4(c17945a0);
        }
    }

    /* renamed from: S4 */
    private final void m61576S4(C17945a0 c17945a0) {
        C17969i0 m94929K2 = c17945a0.m94929K2();
        if (m94929K2 != null && c17945a0.m95032V6() && c17945a0.m95071Z3() == null) {
            AbstractC0837p0.Companion.m2237f().mo2040a(new Runnable() { // from class: com.zing.zalo.ui.chat.chatrow.q0

                /* renamed from: q */
                public final /* synthetic */ C17945a0 f59364q;

                /* renamed from: r */
                public final /* synthetic */ ChatRowRecommendContact f59365r;

                public /* synthetic */ RunnableC11515q0(C17945a0 c17945a02, ChatRowRecommendContact this) {
                    r2 = c17945a02;
                    r3 = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    ChatRowRecommendContact.m61577T4(C17969i0.this, r2, r3);
                }
            });
        }
    }

    /* renamed from: T4 */
    public static final void m61577T4(C17969i0 c17969i0, C17945a0 c17945a0, ChatRowRecommendContact chatRowRecommendContact) {
        C17945a0 c17945a02 = c17945a0;
        AbstractC19074t.m100208f(c17969i0, "$chatRichContent");
        AbstractC19074t.m100208f(c17945a02, "$message");
        AbstractC19074t.m100208f(chatRowRecommendContact, "this$0");
        String str = c17969i0.f91017v;
        String str2 = c17969i0.f91013r;
        String str3 = c17969i0.f91011p;
        String mo95039W2 = c17945a0.mo95039W2();
        AbstractC19074t.m100207e(mo95039W2, "getOwnerId(...)");
        if (c17945a0.m94847A6()) {
            String m132088m = AbstractC25495a.m132088m(mo95039W2);
            C32076q5 m4476k = C0943w.m4462l().m4476k(m132088m);
            if (m4476k != null && !m4476k.m154722k(str)) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("groupId", m132088m);
                JSONObject jSONObject2 = new JSONObject();
                JSONArray jSONArray = new JSONArray();
                JSONObject jSONObject3 = new JSONObject();
                jSONObject3.put("id", str);
                jSONObject3.put("avatar", str2);
                jSONObject3.put("dName", str3);
                jSONArray.put(jSONObject3);
                jSONObject2.put("memberList", jSONArray);
                jSONObject2.put("autoSelect", 1);
                jSONObject.put("suggestGroupMember", jSONObject2);
                String m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_invite_member);
                AbstractC19074t.m100207e(m118743r0, "getString(...)");
                String jSONObject4 = jSONObject.toString();
                AbstractC19074t.m100207e(jSONObject4, "toString(...)");
                c17945a02.m95008Sa(new C26713e(m118743r0, 2, "action.open.invitegroup", jSONObject4, true, 3));
            } else {
                String m118743r02 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_invite_member);
                AbstractC19074t.m100207e(m118743r02, "getString(...)");
                c17945a02.m95008Sa(new C26713e(m118743r02, 2, "action.open.invitegroup", "", false, 3));
            }
        } else if (!AbstractC19074t.m100204b(str, CoreUtility.f89233i) && !AbstractC19074t.m100204b(mo95039W2, str)) {
            JSONObject jSONObject5 = new JSONObject();
            JSONObject jSONObject6 = new JSONObject();
            JSONArray jSONArray2 = new JSONArray();
            JSONObject jSONObject7 = new JSONObject();
            jSONObject7.put("id", str);
            jSONObject7.put("avatar", str2);
            jSONObject7.put("dName", str3);
            jSONArray2.put(jSONObject7);
            JSONObject jSONObject8 = new JSONObject();
            jSONObject8.put("id", mo95039W2);
            jSONArray2.put(jSONObject8);
            jSONObject6.put("memberList", jSONArray2);
            jSONObject6.put("autoSelect", 1);
            jSONObject5.put("suggestGroupMember", jSONObject6);
            jSONObject5.put("initConfig", QuickCreateGroupView.m83233FM(1, AbstractC23136l9.m118743r0(AbstractC8020f0.str_new_group_title_intro_to)));
            String m118743r03 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_create_group_introduce);
            AbstractC19074t.m100207e(m118743r03, "getString(...)");
            String jSONObject9 = jSONObject5.toString();
            AbstractC19074t.m100207e(jSONObject9, "toString(...)");
            c17945a02 = c17945a0;
            c17945a02.m95008Sa(new C26713e(m118743r03, 2, "action.open.creategroup", jSONObject9, true, 3));
        } else {
            String m118743r04 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_create_group_introduce);
            AbstractC19074t.m100207e(m118743r04, "getString(...)");
            c17945a02.m95008Sa(new C26713e(m118743r04, 2, "action.open.creategroup", "", false, 3));
        }
        if (c17945a0.m95071Z3() != null) {
            AbstractC19444a.m101697e(new Runnable() { // from class: com.zing.zalo.ui.chat.chatrow.r0

                /* renamed from: q */
                public final /* synthetic */ ChatRowRecommendContact f59372q;

                public /* synthetic */ RunnableC11519r0(ChatRowRecommendContact chatRowRecommendContact2) {
                    r2 = chatRowRecommendContact2;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    ChatRowRecommendContact.m61578U4(C17945a0.this, r2);
                }
            });
        }
    }

    /* renamed from: U4 */
    public static final void m61578U4(C17945a0 c17945a0, ChatRowRecommendContact chatRowRecommendContact) {
        AbstractC19074t.m100208f(c17945a0, "$message");
        AbstractC19074t.m100208f(chatRowRecommendContact, "this$0");
        if (AbstractC19074t.m100204b(c17945a0, chatRowRecommendContact.f57263B)) {
            chatRowRecommendContact.m61119v3(false);
        }
    }

    /* renamed from: V4 */
    private final void m61579V4(C17945a0 c17945a0) {
        C17969i0 m94929K2;
        C17978l0 c17978l0;
        String str;
        try {
            if ((c17945a0.m95071Z3() == null || c17945a0.m95071Z3().m137357b() != 7) && (m94929K2 = c17945a0.m94929K2()) != null && (m94929K2 instanceof C18013y0) && (c17978l0 = ((C18013y0) m94929K2).f91253D) != null && (str = c17978l0.f91053a) != null) {
                AbstractC19074t.m100205c(str);
                if (str.length() > 0) {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("content", str);
                    String m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_copy_phone_number);
                    AbstractC19074t.m100207e(m118743r0, "getString(...)");
                    String jSONObject2 = jSONObject.toString();
                    AbstractC19074t.m100207e(jSONObject2, "toString(...)");
                    c17945a0.m95008Sa(new C26713e(m118743r0, 2, "action.copy.clipboard", jSONObject2, true, 7));
                    if (AbstractC19074t.m100204b(c17945a0, this.f57263B)) {
                        m61119v3(false);
                        return;
                    }
                    return;
                }
                String m118743r02 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_copy_phone_number);
                AbstractC19074t.m100207e(m118743r02, "getString(...)");
                c17945a0.m95008Sa(new C26713e(m118743r02, 2, "action.copy.clipboard", "", false, 7));
            }
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    /* renamed from: W4 */
    private final boolean m61580W4(float f11, float f12) {
        try {
            if (this.f58397i8) {
                if (f11 < this.f57530u0 || f11 > this.f58407s8) {
                    return false;
                }
                if (f12 < this.f58400l8) {
                    return false;
                }
                int i11 = ChatRow.f57201L5;
                if (f12 > r5 + i11 + f58356V8 + (i11 * 2)) {
                    return false;
                }
            } else {
                if (f11 < this.f57530u0 || f11 > this.f57536v0) {
                    return false;
                }
                if (f12 < this.f58400l8) {
                    return false;
                }
                int i12 = ChatRow.f57201L5;
                if (f12 > r5 + i12 + f58356V8 + (i12 * 2)) {
                    return false;
                }
            }
            return true;
        } catch (Exception e11) {
            e11.printStackTrace();
            return false;
        }
    }

    /* renamed from: X4 */
    private final boolean m61581X4(float f11, float f12) {
        try {
            if (f11 < this.f58407s8 || f11 > this.f57536v0) {
                return false;
            }
            if (f12 < this.f58400l8) {
                return false;
            }
            int i11 = ChatRow.f57201L5;
            if (f12 > r4 + i11 + f58356V8 + (i11 * 2)) {
                return false;
            }
            return true;
        } catch (Exception e11) {
            e11.printStackTrace();
            return false;
        }
    }

    /* renamed from: Y4 */
    private final void m61582Y4() {
        try {
            if (this.f58381S7.length() == 0) {
                return;
            }
            if (this.f58370H7) {
                this.f58377O7 = C23212s8.m119609q(getContext(), AbstractC16781w.default_avatar);
                this.f58378P7 = true;
                invalidate();
            } else if (C23302b.f113247a.m120523d(this.f58381S7)) {
                int m12307a = C2343e.m12307a(this.f58358B7, false);
                String m118087g = AbstractC23028c0.m118087g(this.f58371I7);
                AbstractC19074t.m100207e(m118087g, "getInitialShortNameByName(...)");
                C16640q2 mo88412f = C16640q2.m88404a().mo88412f(m118087g, m12307a);
                this.f57417b1 = mo88412f;
                this.f58377O7 = mo88412f;
                this.f58378P7 = true;
                invalidate();
            } else if (getDelegate().mo62069W3() || C23999j.m125696L2(this.f58381S7, C23278z2.m120143n())) {
                ((C23528a) this.f57275D.m123612r(getDumpContactImageView())).m123579C(this.f58381S7, C23278z2.m120143n(), new C11394i());
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: Z4 */
    private final void m61583Z4() {
        if (this.f58388Z7.length() == 0) {
            return;
        }
        ((C23528a) this.f57275D.m123612r(getDumpQrCodeImageView())).m123579C(this.f58388Z7, C23278z2.m120131i(), new C11395j());
    }

    /* renamed from: a5 */
    public static final void m61584a5(C17945a0 c17945a0, C17969i0 c17969i0) {
        AbstractC19074t.m100208f(c17945a0, "$message");
        AbstractC19074t.m100208f(c17969i0, "$chatRichContent");
        C7956b.Companion.m41573b().m41513J0(c17945a0, c17969i0);
    }

    public final C3977j getDumpContactImageView() {
        return (C3977j) this.f58382T7.getValue();
    }

    public final C3977j getDumpQrCodeImageView() {
        return (C3977j) this.f58390b8.getValue();
    }

    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRow
    /* renamed from: C2 */
    protected C28227x3 mo60952C2(int i11, int i12, C28227x3 c28227x3) {
        AbstractC19074t.m100208f(c28227x3, "result");
        c28227x3.f131648a = this.f57371T;
        c28227x3.f131649b = AbstractC23136l9.m118742r(128.0f) - ChatRow.f57201L5;
        return c28227x3;
    }

    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRowHasCaption, com.zing.zalo.p077ui.chat.chatrow.ChatRow
    /* renamed from: C3 */
    public void mo60953C3(C17945a0 c17945a0, C28769a c28769a, boolean z11) {
        String m118743r0;
        boolean z12;
        C17978l0 c17978l0;
        AbstractC19074t.m100208f(c17945a0, "message");
        AbstractC19074t.m100208f(c28769a, "chatBubbleData");
        super.mo60953C3(c17945a0, c28769a, z11);
        C17969i0 m94929K2 = c17945a0.m94929K2();
        boolean z13 = false;
        if (m94929K2 != null) {
            this.f58381S7 = m94929K2.f91013r;
            this.f58371I7 = m94929K2.f91011p;
            this.f58358B7 = m94929K2.f91017v;
            String str = "";
            if ((m94929K2 instanceof C18013y0) && (c17978l0 = ((C18013y0) m94929K2).f91253D) != null) {
                String str2 = c17978l0.f91057e;
                AbstractC19074t.m100207e(str2, "oaShortLink");
                if (str2.length() == 0) {
                    String str3 = c17978l0.f91053a;
                    AbstractC19074t.m100205c(str3);
                    if (str3.length() <= 0) {
                        str3 = null;
                    }
                    if (str3 != null) {
                        str2 = AbstractC23056e6.m118287m(str3);
                    } else {
                        str2 = null;
                    }
                    if (str2 == null) {
                        str2 = "";
                    }
                }
                this.f58413y8 = str2;
                String str4 = c17978l0.f91055c;
                AbstractC19074t.m100207e(str4, "gUid");
                this.f58360C7 = str4;
                String str5 = c17978l0.f91056d;
                AbstractC19074t.m100207e(str5, "qrCodeUrl");
                this.f58388Z7 = str5;
            }
            if (this.f58358B7.length() == 0 && this.f58360C7.length() > 0) {
                String m153507i = C31943h5.f146766a.m153507i(this.f58360C7, true);
                if (m153507i != null) {
                    str = m153507i;
                }
                this.f58358B7 = str;
                if (str.length() > 0) {
                    m94929K2.f91017v = this.f58358B7;
                    C23288a c23288a = C23288a.f113033a;
                    String mo95039W2 = c17945a0.mo95039W2();
                    AbstractC19074t.m100207e(mo95039W2, "getOwnerId(...)");
                    AbstractC18428c.m97658a(c23288a, mo95039W2, 5, new Runnable() { // from class: com.zing.zalo.ui.chat.chatrow.p0

                        /* renamed from: q */
                        public final /* synthetic */ C17969i0 f59358q;

                        public /* synthetic */ RunnableC11511p0(C17969i0 m94929K22) {
                            r2 = m94929K22;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            ChatRowRecommendContact.m61584a5(C17945a0.this, r2);
                        }
                    });
                } else {
                    this.f58370H7 = true;
                }
            }
            if (AbstractC19074t.m100204b(m94929K22.f91016u, "recommened.vip")) {
                this.f58362D7 = true;
                ContactProfile m141798e = C28203u6.m141798e(C28203u6.f131407a, this.f58358B7, null, 2, null);
                if (m141798e != null) {
                    if (!ContactProfile.m40345C0(m141798e.f42352K0) && !ContactProfile.m40345C0(m141798e.f42447v0)) {
                        z12 = false;
                    } else {
                        z12 = true;
                    }
                    this.f58383U7 = z12;
                } else if (this.f58358B7.length() > 0) {
                    C11396k c11396k = new C11396k();
                    C0766k c0766k = new C0766k();
                    c0766k.mo1704o8(c11396k);
                    c0766k.mo1514Q4(this.f58358B7, 0, new TrackingSource(88));
                }
            } else if (this.f58358B7.length() > 0) {
                if (AbstractC25495a.m132078c(this.f58358B7)) {
                    this.f58383U7 = true;
                } else if (AbstractC19074t.m100204b(this.f58358B7, CoreUtility.f89233i)) {
                    this.f58368G7 = true;
                } else {
                    this.f58366F7 = C18644n.m98531l().m98558u(this.f58358B7);
                }
                m61575R4(c17945a0);
            }
        }
        if (this.f58362D7) {
            this.f58399k8 = true;
            String m118743r02 = AbstractC23136l9.m118743r0(AbstractC8020f0.btn_vip_follow);
            AbstractC19074t.m100207e(m118743r02, "getString(...)");
            this.f58395g8 = m118743r02;
            String m118743r03 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_func_send_message);
            AbstractC19074t.m100207e(m118743r03, "getString(...)");
            this.f58396h8 = m118743r03;
            if (this.f58358B7.length() > 0 && C21927m.m114302u().m114357s() != null && !C21927m.m114302u().m114357s().m153137g(this.f58358B7)) {
                z13 = true;
            }
            this.f58364E7 = z13;
            this.f58398j8 = z13;
            C11391f c11391f = Companion;
            this.f58403o8 = AbstractC23136l9.m118764y0(c11391f.m61600i(), this.f58395g8);
            this.f58406r8 = AbstractC23136l9.m118764y0(c11391f.m61600i(), this.f58396h8);
            this.f58394f8 = AbstractC11531v0.Companion.m62554Z0();
            return;
        }
        if (this.f58358B7.length() > 0) {
            if (!this.f58368G7) {
                String m114539f = AbstractC21935u.m114539f(AbstractC23056e6.m118285k(this.f58413y8), this.f58358B7, this.f58371I7);
                AbstractC19074t.m100207e(m114539f, "convertNameUsePhoneOrId(...)");
                this.f58371I7 = m114539f;
                this.f58399k8 = true;
                this.f58397i8 = !getDelegate().mo62082f4(this.f58358B7);
                if (C20011e.f98374a.m103842c() && !C28203u6.f131407a.m141819r(this.f58358B7)) {
                    z13 = true;
                }
                this.f58398j8 = z13;
                if (this.f58366F7) {
                    m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_call);
                    AbstractC19074t.m100205c(m118743r0);
                } else {
                    m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.btn_func_Add);
                    AbstractC19074t.m100205c(m118743r0);
                }
                this.f58395g8 = m118743r0;
                String m118743r04 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_func_send_message);
                AbstractC19074t.m100207e(m118743r04, "getString(...)");
                this.f58396h8 = m118743r04;
                C11391f c11391f2 = Companion;
                this.f58403o8 = AbstractC23136l9.m118764y0(c11391f2.m61600i(), this.f58395g8);
                this.f58406r8 = AbstractC23136l9.m118764y0(c11391f2.m61600i(), this.f58396h8);
            }
        } else {
            this.f58399k8 = false;
        }
        this.f58394f8 = AbstractC11531v0.Companion.m62560b1();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRowHasCaption, com.zing.zalo.p077ui.chat.chatrow.ChatRow
    /* renamed from: I3 */
    public void mo60975I3(C17945a0 c17945a0, C28769a c28769a, int i11) {
        AbstractC19074t.m100208f(c17945a0, "message");
        AbstractC19074t.m100208f(c28769a, "chatBubbleData");
        super.mo60975I3(c17945a0, c28769a, i11);
        if (this.f58383U7 && AbstractC11531v0.Companion.m62621w0() != null) {
            this.f58386X7 = AbstractC23136l9.m118742r(15.0f);
            this.f58387Y7 = AbstractC23136l9.m118742r(15.0f);
        }
        int bubblePaddingLeft = (((i11 - getBubblePaddingLeft()) - f58344J8) - f58346L8) - getBubblePaddingRight();
        StaticLayout staticLayout = null;
        if (this.f58371I7.length() > 0) {
            StaticLayout m119625l = AbstractC23214t.m119625l(this.f58371I7, Companion.m61598g(), bubblePaddingLeft, 1);
            if (m119625l != null) {
                this.f58375M7 = (int) m119625l.getLineWidth(0);
                this.f58376N7 = m119625l.getHeight();
            } else {
                m119625l = null;
            }
            this.f58374L7 = m119625l;
        }
        if (this.f58413y8.length() > 0) {
            StaticLayout m119625l2 = AbstractC23214t.m119625l(this.f58413y8, Companion.m61601j(), bubblePaddingLeft, 1);
            if (m119625l2 != null) {
                this.f58414z8 = (int) m119625l2.getLineWidth(0);
                this.f58361C8 = m119625l2.getHeight();
                staticLayout = m119625l2;
            }
            this.f58412x8 = staticLayout;
        }
        if (this.f58395g8.length() > 0) {
            this.f58403o8 = AbstractC23136l9.m118764y0(Companion.m61600i(), this.f58395g8);
        }
        if (this.f58396h8.length() > 0) {
            this.f58406r8 = AbstractC23136l9.m118764y0(Companion.m61600i(), this.f58396h8);
        }
        if (this.f58370H7) {
            if (this.f58365E8 == null) {
                this.f58365E8 = new C13804v0(this);
            }
            if (this.f58363D8 == null) {
                Paint paint = new Paint(1);
                paint.setColor(C23212s8.m119607o(getContext(), AbstractC16781w.AvatarPlaceHolderColor));
                paint.setStyle(Paint.Style.FILL);
                this.f58363D8 = paint;
            }
        }
    }

    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRow
    /* renamed from: O0 */
    public int mo60998O0(boolean z11, boolean z12, boolean z13, boolean z14) {
        return (super.mo60998O0(z11, z12, z13, z14) >> 1) << 1;
    }

    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRow
    /* renamed from: O3 */
    protected boolean mo61001O3() {
        return false;
    }

    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRowHasCaption, com.zing.zalo.p077ui.chat.chatrow.ChatRow
    /* renamed from: Y2 */
    public void mo61036Y2(C17945a0 c17945a0, C28769a c28769a) {
        AbstractC19074t.m100208f(c17945a0, "message");
        AbstractC19074t.m100208f(c28769a, "chatBubbleData");
        super.mo61036Y2(c17945a0, c28769a);
        if (!this.f58378P7) {
            m61582Y4();
            m61583Z4();
        }
    }

    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRowHasCaption
    /* renamed from: a4 */
    public List mo61270a4(List list) {
        ArrayList m119662n;
        List list2;
        ArrayList m119662n2;
        List mo61270a4 = super.mo61270a4(list);
        try {
            List list3 = mo61270a4;
            if (list3 != null) {
                if (list3.isEmpty()) {
                }
                list2 = mo61270a4;
                if ((list2 != null || list2.isEmpty()) && this.f58413y8.length() > 0 && this.f58412x8 != null && (m119662n2 = AbstractC23217t2.m119662n(this.f58413y8, list)) != null && (!m119662n2.isEmpty())) {
                    return AbstractC23214t.m119614a(m119662n2, this.f58412x8, this.f58413y8.length(), this.f58357A8, this.f58359B8);
                }
                return mo61270a4;
            }
            if (this.f58371I7.length() > 0 && this.f58374L7 != null && (m119662n = AbstractC23217t2.m119662n(this.f58371I7, list)) != null && (!m119662n.isEmpty())) {
                mo61270a4 = AbstractC23214t.m119614a(m119662n, this.f58374L7, this.f58371I7.length(), this.f58372J7, this.f58373K7);
            }
            list2 = mo61270a4;
            if (list2 != null) {
            }
            return AbstractC23214t.m119614a(m119662n2, this.f58412x8, this.f58413y8.length(), this.f58357A8, this.f58359B8);
        } catch (Exception e11) {
            e11.printStackTrace();
            return mo61270a4;
        }
    }

    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRowHasCaption, com.zing.zalo.p077ui.chat.chatrow.ChatRow
    /* renamed from: c0 */
    public boolean mo61046c0(C17945a0 c17945a0, C28769a c28769a) {
        boolean z11;
        boolean z12;
        boolean z13;
        AbstractC19074t.m100208f(c17945a0, "message");
        AbstractC19074t.m100208f(c28769a, "chatBubbleData");
        if (super.mo61046c0(c17945a0, c28769a)) {
            return true;
        }
        if (this.f58358B7.length() > 0) {
            if (this.f58362D7) {
                ContactProfile m141798e = C28203u6.m141798e(C28203u6.f131407a, this.f58358B7, null, 2, null);
                if (m141798e != null && (ContactProfile.m40345C0(m141798e.f42352K0) || ContactProfile.m40345C0(m141798e.f42447v0))) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                if (C21927m.m114302u().m114357s() != null && !C21927m.m114302u().m114357s().m153137g(this.f58358B7)) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                if (this.f58383U7 != z12 || this.f58364E7 != z13) {
                    return true;
                }
            } else {
                if (C18644n.m98531l().m98552o(this.f58358B7) != null) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (this.f58366F7 != z11) {
                    return true;
                }
            }
        } else if (this.f58360C7.length() > 0) {
            return true;
        }
        return false;
    }

    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRow
    /* renamed from: d2 */
    public int mo61051d2(int i11, int i12, int i13, int i14, boolean z11) {
        int i15;
        int mo61051d2 = super.mo61051d2(i11, i12, i13, i14, z11);
        if (this.f58399k8) {
            if (this.f58398j8 || this.f58397i8) {
                this.f58400l8 = mo61051d2;
                int i16 = i13 - i11;
                int i17 = i16 / 2;
                int m118742r = AbstractC23136l9.m118742r(48.0f);
                if (this.f58397i8) {
                    this.f58401m8 = ((i17 - this.f58403o8) / 2) + i11;
                    int i18 = this.f58400l8;
                    int i19 = m118742r / 2;
                    int i21 = i18 + i19 + (f58356V8 / 2);
                    this.f58402n8 = i21;
                    boolean z12 = this.f58398j8;
                    if (z12) {
                        i15 = i11 + i17 + ((i17 - this.f58406r8) / 2);
                    } else {
                        i15 = ((i16 - this.f58406r8) / 2) + i11;
                    }
                    this.f58404p8 = i15;
                    this.f58405q8 = i21;
                    if (z12) {
                        this.f58407s8 = i11 + i17;
                        this.f58408t8 = (i18 + i19) - AbstractC23136l9.m118742r(12.0f);
                        this.f58409u8 = this.f58400l8 + i19 + AbstractC23136l9.m118742r(12.0f);
                    }
                } else {
                    this.f58401m8 = ((i11 + i13) / 2) - (this.f58403o8 / 2);
                    this.f58402n8 = this.f58400l8 + (m118742r / 2) + (f58356V8 / 2);
                }
                return mo61051d2 + m118742r;
            }
            return mo61051d2;
        }
        return mo61051d2;
    }

    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRow
    /* renamed from: g2 */
    protected void mo61063g2(int i11, int i12, int i13, int i14, boolean z11) {
        int i15;
        int i16;
        C13804v0 c13804v0;
        this.f58393e8 = i14;
        if (this.f58370H7 && (c13804v0 = this.f58365E8) != null) {
            int i17 = this.f58379Q7;
            int i18 = f58344J8;
            this.f58367F8 = i17 + ((i18 - c13804v0.m77064c()) / 2);
            int m77063b = this.f58380R7 + ((i18 - c13804v0.m77063b()) / 2);
            this.f58369G8 = m77063b;
            c13804v0.m77067f(this.f58367F8, m77063b);
        }
        int bubblePaddingLeft = i11 + getBubblePaddingLeft();
        this.f58379Q7 = bubblePaddingLeft;
        int i19 = ChatRow.f57201L5;
        int i21 = f58349O8;
        this.f58380R7 = (i12 - i19) + i21;
        int i22 = i12 + (i21 - i19);
        int i23 = f58344J8;
        this.f58372J7 = bubblePaddingLeft + i23 + f58346L8;
        if (this.f58413y8.length() > 0) {
            i15 = i22 + (i23 / 2);
            i16 = (this.f58376N7 + this.f58361C8) / 2;
        } else {
            i15 = i22 + (i23 / 2);
            i16 = this.f58376N7 / 2;
        }
        int i24 = i15 - i16;
        this.f58373K7 = i24;
        int i25 = this.f58379Q7 + i23;
        int i26 = f58350P8;
        this.f58384V7 = (i25 + i26) - this.f58386X7;
        this.f58385W7 = ((this.f58380R7 + i23) + i26) - this.f58387Y7;
        this.f58357A8 = this.f58372J7;
        this.f58359B8 = i24 + this.f58376N7;
        int i27 = f58348N8;
        int i28 = f58347M8;
        this.f58391c8 = (i13 - i27) - i28;
        this.f58392d8 = (i14 - i27) - i28;
    }

    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRow
    public int getBubbleMaxWidth() {
        return AbstractC23136l9.m118742r(270.0f);
    }

    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRow
    public int getBubbleMinWidth() {
        return AbstractC23136l9.m118742r(270.0f);
    }

    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRow
    public int getBubblePaddingLeft() {
        return f58345K8;
    }

    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRow
    public int getBubblePaddingRight() {
        return f58345K8;
    }

    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRow
    public int getDefaultBubblePaddingBottom() {
        return 0;
    }

    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRowHasCaption, com.zing.zalo.p077ui.chat.chatrow.ChatRow
    public String getMsgContentTalkText() {
        String msgContentTalkText = super.getMsgContentTalkText();
        try {
            String str = msgContentTalkText + this.f58371I7 + "\n";
            if (this.f58413y8.length() > 0) {
                str = str + this.f58413y8 + "\n";
            }
            if (this.f58399k8) {
                boolean z11 = this.f58398j8;
                if (z11 || this.f58397i8) {
                    if (z11) {
                        str = str + this.f58395g8 + "\n";
                    }
                    if (this.f58397i8) {
                        return str + this.f58396h8;
                    }
                    return str;
                }
                return str;
            }
            return str;
        } catch (Exception e11) {
            e11.printStackTrace();
            return msgContentTalkText;
        }
    }

    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRowHasCaption
    protected int getTextPositionX() {
        return 0;
    }

    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRowHasCaption
    protected int getTextPositionY() {
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:53:? A[RETURN, SYNTHETIC] */
    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRowHasCaption, com.zing.zalo.p077ui.chat.chatrow.ChatRow
    /* renamed from: j3 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean mo61075j3(MotionEvent motionEvent, int i11, float f11, float f12) {
        boolean z11;
        boolean z12;
        boolean m61581X4;
        AbstractC19074t.m100208f(motionEvent, "event");
        if (i11 != 0) {
            if (i11 == 1) {
                if (this.f58410v8 && m61580W4(f11, f12)) {
                    if (this.f58362D7) {
                        getDelegate().mo62055M4(this);
                        return true;
                    }
                    if (this.f58358B7.length() > 0) {
                        if (C18644n.m98531l().m98552o(this.f58358B7) != null) {
                            getDelegate().mo62043I3(this);
                            return true;
                        }
                        getDelegate().mo62056N3(this);
                        return true;
                    }
                    ToastUtils.m89266n(AbstractC8020f0.str_contact_info_loading, new Object[0]);
                    return true;
                }
                if (this.f58411w8 && m61581X4(f11, f12)) {
                    if (this.f58358B7.length() > 0) {
                        getDelegate().mo62058O3(this);
                        return true;
                    }
                    ToastUtils.m89266n(AbstractC8020f0.str_contact_info_loading, new Object[0]);
                    return true;
                }
            }
        } else {
            if (this.f58399k8 && this.f58398j8) {
                boolean m61580W4 = m61580W4(f11, f12);
                this.f58410v8 = m61580W4;
                if (m61580W4) {
                    z11 = true;
                    if (this.f58399k8 && this.f58397i8) {
                        m61581X4 = m61581X4(f11, f12);
                        this.f58411w8 = m61581X4;
                        C24848g0 c24848g0 = C24848g0.f119245a;
                        if (m61581X4) {
                            z12 = true;
                            if (z11 | z12) {
                                return true;
                            }
                        }
                    }
                    z12 = false;
                    if (z11 | z12) {
                    }
                }
            }
            z11 = false;
            if (this.f58399k8) {
                m61581X4 = m61581X4(f11, f12);
                this.f58411w8 = m61581X4;
                C24848g0 c24848g02 = C24848g0.f119245a;
                if (m61581X4) {
                }
            }
            z12 = false;
            if (z11 | z12) {
            }
        }
        if (super.mo61075j3(motionEvent, i11, f11, f12)) {
            return true;
        }
        return false;
    }

    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRowHasCaption
    /* renamed from: k4 */
    protected String mo61162k4(C17945a0 c17945a0) {
        AbstractC19074t.m100208f(c17945a0, "message");
        if (c17945a0.m94929K2() instanceof C18013y0) {
            C17969i0 m94929K2 = c17945a0.m94929K2();
            AbstractC19074t.m100206d(m94929K2, "null cannot be cast to non-null type com.zing.zalo.data.chat.model.message.ChatRichContentRecommend");
            if (((C18013y0) m94929K2).f91253D != null) {
                C17969i0 m94929K22 = c17945a0.m94929K2();
                AbstractC19074t.m100206d(m94929K22, "null cannot be cast to non-null type com.zing.zalo.data.chat.model.message.ChatRichContentRecommend");
                return ((C18013y0) m94929K22).f91253D.f91054b;
            }
        }
        return "";
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRowHasCaption
    /* renamed from: l4 */
    public boolean mo61163l4() {
        return false;
    }

    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRow
    /* renamed from: o0 */
    public void mo61093o0(Canvas canvas, int i11, int i12, int i13, int i14) {
        AbstractC19074t.m100208f(canvas, "canvas");
        super.mo61093o0(canvas, i11, i12, i13, i14);
        Path path = new Path();
        if (this.f57319K1) {
            i12 += this.f57389W;
        }
        float f11 = ChatRow.f57179A5;
        path.addRoundRect(i11, i12, i13, i14, f11, f11, Path.Direction.CW);
        canvas.save();
        canvas.clipPath(path);
        Drawable drawable = this.f58394f8;
        if (drawable != null) {
            drawable.setBounds(i11, i12, i13, this.f58393e8);
            drawable.draw(canvas);
        }
        canvas.restore();
    }

    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRow
    /* renamed from: q0 */
    public void mo61103q0(Canvas canvas) {
        AbstractC19074t.m100208f(canvas, "canvas");
        super.mo61103q0(canvas);
        if (this.f58399k8) {
            boolean z11 = this.f58398j8;
            if (z11 || this.f58397i8) {
                if (z11) {
                    canvas.drawText(this.f58395g8, this.f58401m8, this.f58402n8, Companion.m61600i());
                }
                if (this.f58397i8) {
                    canvas.drawText(this.f58396h8, this.f58404p8, this.f58405q8, Companion.m61599h());
                    int i11 = this.f58407s8;
                    canvas.drawLine(i11, this.f58408t8, i11, this.f58409u8, ChatRow.f57255z5);
                }
            }
        }
    }

    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRow
    /* renamed from: t0 */
    protected void mo61111t0(Canvas canvas) {
        Drawable m62621w0;
        Paint paint;
        Drawable drawable;
        AbstractC19074t.m100208f(canvas, "canvas");
        Drawable drawable2 = this.f58377O7;
        if (drawable2 != null) {
            int i11 = this.f58379Q7;
            int i12 = this.f58380R7;
            int i13 = f58344J8;
            drawable2.setBounds(i11, i12, i11 + i13, i12 + i13);
            drawable2.draw(canvas);
            canvas.drawCircle(this.f58379Q7 + (i13 / 2.0f), this.f58380R7 + (i13 / 2.0f), i13 / 2.0f, Companion.m61597f());
        }
        if (f58342H8 && (drawable = this.f58389a8) != null) {
            int i14 = this.f58391c8;
            int i15 = this.f58392d8;
            int i16 = f58347M8;
            drawable.setBounds(i14, i15, i14 + i16, i16 + i15);
            drawable.draw(canvas);
        }
        if (this.f58370H7 && this.f58365E8 != null && (paint = this.f58363D8) != null) {
            int i17 = this.f58379Q7;
            int i18 = f58344J8;
            AbstractC19074t.m100205c(paint);
            canvas.drawCircle(i17 + (i18 >> 1), this.f58380R7 + (i18 >> 1), i18 / 2.0f, paint);
            C13804v0 c13804v0 = this.f58365E8;
            AbstractC19074t.m100205c(c13804v0);
            c13804v0.m77062a(canvas);
        }
        StaticLayout staticLayout = this.f58374L7;
        if (staticLayout != null) {
            canvas.save();
            canvas.translate(this.f58372J7, this.f58373K7);
            staticLayout.draw(canvas);
            canvas.restore();
        }
        StaticLayout staticLayout2 = this.f58412x8;
        if (staticLayout2 != null) {
            canvas.save();
            canvas.translate(this.f58357A8, this.f58359B8);
            staticLayout2.draw(canvas);
            canvas.restore();
        }
        if (this.f58362D7 && this.f58383U7 && (m62621w0 = AbstractC11531v0.Companion.m62621w0()) != null) {
            int i19 = this.f58384V7;
            int i21 = this.f58385W7;
            m62621w0.setBounds(i19, i21, this.f58386X7 + i19, this.f58387Y7 + i21);
            m62621w0.draw(canvas);
        }
    }

    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRowHasCaption, com.zing.zalo.p077ui.chat.chatrow.ChatRow
    /* renamed from: w3 */
    public void mo61122w3() {
        super.mo61122w3();
        this.f58374L7 = null;
        this.f58381S7 = "";
        this.f58383U7 = false;
        this.f58371I7 = "";
        this.f58399k8 = false;
        this.f58413y8 = "";
        this.f58414z8 = 0;
        this.f58361C8 = 0;
        this.f58412x8 = null;
        this.f58388Z7 = "";
        this.f58389a8 = null;
        this.f58362D7 = false;
        this.f58397i8 = true;
        this.f58398j8 = C20011e.f98374a.m103842c();
        this.f58366F7 = false;
        this.f58378P7 = false;
        this.f58377O7 = C23278z2.m120143n().f116261b;
        this.f58395g8 = "";
        this.f58396h8 = "";
        this.f58403o8 = 0;
        this.f58406r8 = 0;
        this.f58368G7 = false;
        this.f58375M7 = 0;
        this.f58376N7 = 0;
        this.f58407s8 = -1;
        this.f58408t8 = 0;
        this.f58409u8 = 0;
        this.f58358B7 = "";
        this.f58360C7 = "";
        this.f58370H7 = false;
    }

    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRow
    /* renamed from: z2 */
    public C28227x3 mo61130z2(int i11, int i12, int i13, C28227x3 c28227x3) {
        int m116580c;
        AbstractC19074t.m100208f(c28227x3, "result");
        C28227x3 mo61130z2 = super.mo61130z2(i11, i12, i13, c28227x3);
        AbstractC19074t.m100207e(mo61130z2, "measureBubbleBottom(...)");
        if (this.f58399k8 && (this.f58398j8 || this.f58397i8)) {
            m116580c = AbstractC22543l.m116580c(mo61130z2.f131648a, i11);
            mo61130z2.f131648a = m116580c;
            mo61130z2.f131649b += AbstractC23136l9.m118742r(48.0f);
        }
        return mo61130z2;
    }
}
