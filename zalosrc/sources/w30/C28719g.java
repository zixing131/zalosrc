package w30;

import ae.C0757b;
import ag0.AbstractC0837p0;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.common.C7853b;
import com.zing.zalo.data.entity.chat.message.MessageId;
import com.zing.zalo.utils.ToastUtils;
import com.zing.zalo.zmedia.player.ZMediaPlayer;
import fn0.AbstractC19074t;
import hm0.C20096c;
import hm0.InterfaceC20094a;
import ho0.AbstractC20110a;
import in.C20629c;
import in.InterfaceC20633g;
import java.io.File;
import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;
import ln0.AbstractC22543l;
import me0.AbstractC23136l9;
import mm0.AbstractC23352g;
import org.json.JSONObject;
import p348mi.AbstractC23306f;
import vi0.EnumC28265c;
import xm0.AbstractC30166b;
import xm0.InterfaceC30165a;

/* renamed from: w30.g */
/* loaded from: classes5.dex */
public final class C28719g {

    /* renamed from: c */
    private static C28713a f133216c;

    /* renamed from: d */
    private static b f133217d;

    /* renamed from: e */
    private static int f133218e;

    /* renamed from: f */
    private static boolean f133219f;

    /* renamed from: a */
    public static final C28719g f133214a = new C28719g();

    /* renamed from: b */
    private static a f133215b = a.f133224p;

    /* renamed from: g */
    private static String f133220g = "0";

    /* renamed from: h */
    private static final Handler f133221h = new Handler(Looper.getMainLooper(), new Handler.Callback() { // from class: w30.b
        @Override // android.os.Handler.Callback
        public final boolean handleMessage(Message message) {
            boolean m143834r;
            m143834r = C28719g.m143834r(message);
            return m143834r;
        }
    });

    /* renamed from: i */
    private static final HashMap f133222i = new HashMap();

    /* renamed from: j */
    private static final ConcurrentHashMap f133223j = new ConcurrentHashMap();

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* renamed from: w30.g$a */
    /* loaded from: classes5.dex */
    public static final class a {

        /* renamed from: p */
        public static final a f133224p = new a("IDLE", 0);

        /* renamed from: q */
        public static final a f133225q = new a("PREPARING", 1);

        /* renamed from: r */
        public static final a f133226r = new a("CONVERTING", 2);

        /* renamed from: s */
        public static final a f133227s = new a("DOWNLOADING", 3);

        /* renamed from: t */
        public static final a f133228t = new a("PLAYING", 4);

        /* renamed from: u */
        private static final /* synthetic */ a[] f133229u;

        /* renamed from: v */
        private static final /* synthetic */ InterfaceC30165a f133230v;

        static {
            a[] m143846b = m143846b();
            f133229u = m143846b;
            f133230v = AbstractC30166b.m148796a(m143846b);
        }

        private a(String str, int i11) {
        }

        /* renamed from: b */
        private static final /* synthetic */ a[] m143846b() {
            return new a[]{f133224p, f133225q, f133226r, f133227s, f133228t};
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) f133229u.clone();
        }
    }

    /* renamed from: w30.g$b */
    /* loaded from: classes5.dex */
    public interface b {
        /* renamed from: a */
        boolean mo64423a();

        /* renamed from: b */
        void mo64424b(C28713a c28713a);

        /* renamed from: j */
        void mo64425j(C7853b.b bVar);

        /* renamed from: k */
        void mo64426k();

        /* renamed from: m */
        void mo64427m(C7853b.d dVar);
    }

    /* renamed from: w30.g$c */
    /* loaded from: classes5.dex */
    public /* synthetic */ class c {

        /* renamed from: a */
        public static final /* synthetic */ int[] f133231a;

        static {
            int[] iArr = new int[a.values().length];
            try {
                iArr[a.f133224p.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[a.f133225q.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[a.f133226r.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[a.f133227s.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[a.f133228t.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            f133231a = iArr;
        }
    }

    /* renamed from: w30.g$d */
    /* loaded from: classes5.dex */
    public static final class d implements InterfaceC20633g {

        /* renamed from: a */
        final /* synthetic */ C28713a f133232a;

        /* renamed from: b */
        final /* synthetic */ InterfaceC20633g f133233b;

        d(C28713a c28713a, InterfaceC20633g interfaceC20633g) {
            this.f133232a = c28713a;
            this.f133233b = interfaceC20633g;
        }

        @Override // in.InterfaceC20633g
        /* renamed from: a */
        public void mo62757a(String str, long j11) {
        }

        @Override // in.InterfaceC20633g
        /* renamed from: b */
        public void mo62758b(String str, int i11) {
            this.f133233b.mo62758b(str, i11);
        }

        @Override // in.InterfaceC20633g
        /* renamed from: c */
        public void mo62759c(String str, String str2, boolean z11) {
            if (!AbstractC19074t.m100204b(str, this.f133232a.m143797b())) {
                return;
            }
            if (str2 != null && str2.length() != 0) {
                this.f133233b.mo62759c(str, str2, z11);
            } else {
                this.f133233b.mo62758b(str, 3);
            }
        }
    }

    /* renamed from: w30.g$e */
    /* loaded from: classes5.dex */
    public static final class e implements C7853b.d {
        e() {
        }

        @Override // com.zing.zalo.common.C7853b.d
        /* renamed from: a */
        public void mo40156a(String str, int i11) {
            C28719g.f133218e = Math.max(i11, C28719g.f133218e);
        }

        @Override // com.zing.zalo.common.C7853b.d
        /* renamed from: b */
        public void mo40157b(String str, String str2) {
        }

        @Override // com.zing.zalo.common.C7853b.d
        /* renamed from: c */
        public void mo40158c(String str, int i11) {
        }

        @Override // com.zing.zalo.common.C7853b.d
        public void onAudioFocusChange(int i11) {
        }
    }

    /* renamed from: w30.g$f */
    /* loaded from: classes5.dex */
    public static final class f implements InterfaceC20094a {

        /* renamed from: a */
        final /* synthetic */ C28713a f133234a;

        f(C28713a c28713a) {
            this.f133234a = c28713a;
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
            AbstractC19074t.m100208f(c20096c, "errorMessage");
            this.f133234a.m143803h(c20096c);
            C28719g.f133221h.sendMessage(C28719g.f133221h.obtainMessage(103, this.f133234a));
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            JSONObject jSONObject;
            JSONObject jSONObject2;
            long m116589l;
            AbstractC19074t.m100208f(obj, "res");
            try {
                String str = null;
                if (obj instanceof JSONObject) {
                    jSONObject = (JSONObject) obj;
                } else {
                    jSONObject = null;
                }
                if (jSONObject != null) {
                    jSONObject2 = jSONObject.optJSONObject("data");
                } else {
                    jSONObject2 = null;
                }
                if (jSONObject2 != null) {
                    str = jSONObject2.optString(ZMediaPlayer.OnNativeInvokeListener.ARG_URL, "");
                }
                if (str == null) {
                    return;
                }
                this.f133234a.m143805j(str);
                C28719g.f133222i.put(this.f133234a.m143797b(), str);
                m116589l = AbstractC22543l.m116589l((this.f133234a.m143800e().length() / 2) + 100, 100L, 1000L);
                C28719g.f133221h.sendMessageDelayed(C28719g.f133221h.obtainMessage(101, this.f133234a), m116589l);
            } catch (Exception e11) {
                AbstractC20110a.f98889a.m104564x("TextToSpeechController").mo104552e(e11);
                C28719g.f133221h.sendMessage(C28719g.f133221h.obtainMessage(103, this.f133234a));
            }
        }
    }

    /* renamed from: w30.g$g */
    /* loaded from: classes5.dex */
    public static final class g implements InterfaceC20633g {

        /* renamed from: a */
        final /* synthetic */ C28713a f133235a;

        g(C28713a c28713a) {
            this.f133235a = c28713a;
        }

        @Override // in.InterfaceC20633g
        /* renamed from: a */
        public void mo62757a(String str, long j11) {
        }

        @Override // in.InterfaceC20633g
        /* renamed from: b */
        public void mo62758b(String str, int i11) {
            AbstractC19074t.m100208f(str, "id");
            C28719g c28719g = C28719g.f133214a;
            c28719g.m143837w(this.f133235a);
            if (i11 != 7 || !c28719g.m143830n(this.f133235a)) {
                c28719g.m143836v(this.f133235a);
                if (i11 != 1) {
                    this.f133235a.m143803h(new C20096c(502, AbstractC23136l9.m118743r0(AbstractC8020f0.str_text_to_speech_server_error)));
                    C28719g.f133221h.sendMessage(C28719g.f133221h.obtainMessage(103, this.f133235a));
                    return;
                }
                return;
            }
            Thread.sleep(500L);
            c28719g.m143831o(this.f133235a, this);
        }

        @Override // in.InterfaceC20633g
        /* renamed from: c */
        public void mo62759c(String str, String str2, boolean z11) {
            AbstractC19074t.m100208f(str, "id");
            AbstractC19074t.m100208f(str2, "path");
            C28719g.f133214a.m143836v(this.f133235a);
            C28719g.f133221h.sendMessage(C28719g.f133221h.obtainMessage(102, this.f133235a));
        }
    }

    private C28719g() {
    }

    /* renamed from: A */
    private final void m143806A(C28713a c28713a) {
        EnumC28720h enumC28720h;
        if (m143835s(c28713a)) {
            if (f133215b == a.f133228t) {
                enumC28720h = EnumC28720h.f133237q;
            } else {
                enumC28720h = EnumC28720h.f133236p;
            }
            if (enumC28720h == EnumC28720h.f133237q) {
                m143815L();
            }
            f133215b = a.f133224p;
            c28713a.m143802g();
            m143807B();
        }
    }

    /* renamed from: B */
    private final void m143807B() {
        f133215b = a.f133224p;
        f133216c = null;
        f133217d = null;
    }

    /* renamed from: D */
    private final void m143808D() {
        b bVar = f133217d;
        if (bVar != null) {
            bVar.mo64427m(new e());
        }
        b bVar2 = f133217d;
        if (bVar2 != null) {
            bVar2.mo64425j(new C7853b.b() { // from class: w30.c
                @Override // com.zing.zalo.common.C7853b.b
                /* renamed from: a */
                public final void mo40153a(String str) {
                    C28719g.m143809E(str);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: E */
    public static final void m143809E(String str) {
        f133219f = true;
    }

    /* renamed from: F */
    private final void m143810F(C28713a c28713a) {
        if (!m143835s(c28713a)) {
            return;
        }
        f133215b = a.f133226r;
        f fVar = new f(c28713a);
        m143840z(c28713a);
        C0757b c0757b = new C0757b();
        c0757b.m1341j(fVar);
        c0757b.m1351r(c28713a.m143800e());
    }

    /* renamed from: G */
    private final void m143811G(final C28713a c28713a) {
        if (!m143835s(c28713a) || c28713a.m143801f().length() == 0 || c28713a.m143798c().length() == 0) {
            return;
        }
        f133215b = a.f133227s;
        AbstractC0837p0.Companion.m2239h().mo2040a(new Runnable() { // from class: w30.e
            @Override // java.lang.Runnable
            public final void run() {
                C28719g.m143812H(C28713a.this);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: H */
    public static final void m143812H(C28713a c28713a) {
        AbstractC19074t.m100208f(c28713a, "$content");
        f133214a.m143831o(c28713a, new g(c28713a));
    }

    /* renamed from: I */
    private final void m143813I(C28713a c28713a) {
        if (!m143835s(c28713a) || c28713a.m143798c().length() == 0) {
            return;
        }
        b bVar = f133217d;
        if (bVar != null && bVar.mo64423a()) {
            f133215b = a.f133228t;
            b bVar2 = f133217d;
            if (bVar2 != null) {
                bVar2.mo64424b(c28713a);
            }
            m143839y(c28713a);
            return;
        }
        m143806A(c28713a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: K */
    public static final void m143814K(C28713a c28713a) {
        AbstractC19074t.m100208f(c28713a, "$content");
        try {
            File m143832p = f133214a.m143832p(c28713a.m143797b());
            String path = m143832p.getPath();
            AbstractC19074t.m100205c(path);
            c28713a.m143804i(path);
            if (m143832p.exists() && m143832p.length() > 0) {
                Handler handler = f133221h;
                handler.sendMessage(handler.obtainMessage(102, c28713a));
                return;
            }
            String str = (String) f133222i.get(c28713a.m143797b());
            if (str != null && str.length() != 0) {
                c28713a.m143805j(str);
                Handler handler2 = f133221h;
                handler2.sendMessage(handler2.obtainMessage(101, c28713a));
                return;
            }
            if (C28722j.f133241a.m143851a() > 0) {
                c28713a.m143803h(new C20096c(-29, AbstractC23136l9.m118743r0(AbstractC8020f0.str_text_to_speech_limit_quota)));
                Handler handler3 = f133221h;
                handler3.sendMessage(handler3.obtainMessage(103, c28713a));
            } else {
                Handler handler4 = f133221h;
                handler4.sendMessage(handler4.obtainMessage(100, c28713a));
            }
        } catch (Exception e11) {
            AbstractC20110a.f98889a.m104564x("TextToSpeechController").mo104552e(e11);
            Handler handler5 = f133221h;
            handler5.sendMessage(handler5.obtainMessage(103, c28713a));
        }
    }

    /* renamed from: L */
    private final void m143815L() {
        C28721i.f133240a.m143848a(f133220g, f133218e, !f133219f);
        f133218e = 0;
        f133219f = false;
        f133220g = "0";
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: N */
    public static final void m143816N(C28713a c28713a) {
        AbstractC19074t.m100208f(c28713a, "$content");
        C20629c.Companion.m107461a().m107452f(c28713a.m143801f(), c28713a.m143797b());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: n */
    public final boolean m143830n(C28713a c28713a) {
        Integer num = (Integer) f133223j.get(c28713a.m143797b());
        if (num == null) {
            num = 0;
        }
        if (num.intValue() >= 5) {
            return false;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: o */
    public final void m143831o(C28713a c28713a, InterfaceC20633g interfaceC20633g) {
        try {
            C20629c m107461a = C20629c.Companion.m107461a();
            MessageId m95029V3 = c28713a.m143799d().m95029V3();
            AbstractC19074t.m100207e(m95029V3, "getMessageId(...)");
            m107461a.m107455o(m95029V3, c28713a.m143801f(), c28713a.m143798c(), c28713a.m143797b(), new d(c28713a, interfaceC20633g), true, 26026, 1, AbstractC23306f.m120579F1().mo124310e(), 1, 0L, null, null, false, "");
        } catch (Exception e11) {
            AbstractC20110a.f98889a.m104564x("TextToSpeechController").mo104552e(e11);
            Handler handler = f133221h;
            handler.sendMessage(handler.obtainMessage(103, c28713a));
        }
    }

    /* renamed from: p */
    private final File m143832p(String str) {
        return new File(AbstractC23306f.m120712t().m142367c(EnumC28265c.f131802r), AbstractC23352g.m122788d(str));
    }

    /* renamed from: q */
    private final void m143833q(C28713a c28713a) {
        String m118743r0;
        C20096c m143796a = c28713a.m143796a();
        if (m143796a == null) {
            return;
        }
        int m104491c = m143796a.m104491c();
        if (m104491c == -29) {
            String m104490b = m143796a.m104490b();
            AbstractC19074t.m100207e(m104490b, "getData(...)");
            if (m104490b.length() > 0) {
                try {
                    C28722j.f133241a.m143854d(new JSONObject(m143796a.m104490b()).optLong("available_after", 60L) * 1000);
                } catch (Exception e11) {
                    AbstractC20110a.f98889a.mo104552e(e11);
                }
            }
        }
        if (m104491c != -29) {
            if (m104491c != 413 && m104491c != 429 && m104491c != 500) {
                if (m104491c != 1002) {
                    if (m104491c != 50001) {
                        m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_text_to_speech_server_error);
                        AbstractC19074t.m100207e(m118743r0, "getString(...)");
                    } else {
                        m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_connection_error);
                        AbstractC19074t.m100207e(m118743r0, "getString(...)");
                    }
                } else {
                    m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_text_to_speech_special_symbols);
                    AbstractC19074t.m100207e(m118743r0, "getString(...)");
                }
            } else {
                m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_text_to_speech_server_error);
                AbstractC19074t.m100207e(m118743r0, "getString(...)");
            }
        } else {
            m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_text_to_speech_limit_quota);
            AbstractC19074t.m100207e(m118743r0, "getString(...)");
        }
        ToastUtils.showMess(m118743r0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: r */
    public static final boolean m143834r(Message message) {
        AbstractC19074t.m100208f(message, "msg");
        try {
            switch (message.what) {
                case 100:
                    Object obj = message.obj;
                    AbstractC19074t.m100206d(obj, "null cannot be cast to non-null type com.zing.zalo.texttospeech.TextToSpeechContent");
                    f133214a.m143810F((C28713a) obj);
                    break;
                case 101:
                    Object obj2 = message.obj;
                    AbstractC19074t.m100206d(obj2, "null cannot be cast to non-null type com.zing.zalo.texttospeech.TextToSpeechContent");
                    f133214a.m143811G((C28713a) obj2);
                    break;
                case 102:
                    Object obj3 = message.obj;
                    AbstractC19074t.m100206d(obj3, "null cannot be cast to non-null type com.zing.zalo.texttospeech.TextToSpeechContent");
                    f133214a.m143813I((C28713a) obj3);
                    break;
                case 103:
                    Object obj4 = message.obj;
                    AbstractC19074t.m100206d(obj4, "null cannot be cast to non-null type com.zing.zalo.texttospeech.TextToSpeechContent");
                    f133214a.m143838x((C28713a) obj4);
                    break;
            }
            return true;
        } catch (Exception e11) {
            AbstractC20110a.f98889a.m104564x("TextToSpeechController").mo104552e(e11);
            return true;
        }
    }

    /* renamed from: s */
    private final boolean m143835s(C28713a c28713a) {
        String str;
        C28713a c28713a2 = f133216c;
        if (c28713a2 != null) {
            str = c28713a2.m143797b();
        } else {
            str = null;
        }
        return AbstractC19074t.m100204b(str, c28713a.m143797b());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: v */
    public final void m143836v(C28713a c28713a) {
        f133223j.remove(c28713a.m143797b());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: w */
    public final void m143837w(C28713a c28713a) {
        ConcurrentHashMap concurrentHashMap = f133223j;
        Integer num = (Integer) concurrentHashMap.get(c28713a.m143797b());
        if (num == null) {
            num = 0;
        }
        concurrentHashMap.put(c28713a.m143797b(), Integer.valueOf(num.intValue() + 1));
    }

    /* renamed from: x */
    private final void m143838x(C28713a c28713a) {
        EnumC28720h enumC28720h;
        if (m143835s(c28713a)) {
            m143833q(c28713a);
            if (f133215b == a.f133228t) {
                enumC28720h = EnumC28720h.f133237q;
            } else {
                enumC28720h = EnumC28720h.f133236p;
            }
            if (enumC28720h == EnumC28720h.f133237q) {
                m143815L();
            }
            f133215b = a.f133224p;
            c28713a.m143802g();
            m143807B();
        }
    }

    /* renamed from: y */
    private final void m143839y(C28713a c28713a) {
        if (m143835s(c28713a)) {
            m143808D();
            c28713a.m143802g();
        }
    }

    /* renamed from: z */
    private final void m143840z(C28713a c28713a) {
        if (m143835s(c28713a)) {
            c28713a.m143802g();
        }
    }

    /* renamed from: C */
    public final void m143841C(String str) {
        AbstractC19074t.m100208f(str, "<set-?>");
        f133220g = str;
    }

    /* renamed from: J */
    public final void m143842J(final C28713a c28713a, b bVar) {
        AbstractC19074t.m100208f(c28713a, "content");
        if (!m143835s(c28713a) || f133215b == a.f133228t) {
            m143843M(true);
        }
        if (f133215b != a.f133224p && f133215b != a.f133228t) {
            return;
        }
        f133215b = a.f133225q;
        f133216c = c28713a;
        f133217d = bVar;
        AbstractC0837p0.Companion.m2239h().mo2040a(new Runnable() { // from class: w30.f
            @Override // java.lang.Runnable
            public final void run() {
                C28719g.m143814K(C28713a.this);
            }
        });
    }

    /* renamed from: M */
    public final void m143843M(boolean z11) {
        try {
            final C28713a c28713a = f133216c;
            if (c28713a == null) {
                return;
            }
            int i11 = c.f133231a[f133215b.ordinal()];
            if (i11 != 2 && i11 != 3) {
                if (i11 != 4) {
                    if (i11 == 5) {
                        b bVar = f133217d;
                        m143806A(c28713a);
                        if (z11 && bVar != null) {
                            bVar.mo64426k();
                        }
                    }
                } else {
                    m143806A(c28713a);
                    AbstractC0837p0.Companion.m2239h().mo2040a(new Runnable() { // from class: w30.d
                        @Override // java.lang.Runnable
                        public final void run() {
                            C28719g.m143816N(C28713a.this);
                        }
                    });
                }
            } else {
                m143806A(c28713a);
            }
        } catch (Exception e11) {
            AbstractC20110a.f98889a.mo104552e(e11);
        }
    }

    /* renamed from: t */
    public final boolean m143844t(String str) {
        String str2;
        AbstractC19074t.m100208f(str, "id");
        C28713a c28713a = f133216c;
        if (c28713a != null) {
            str2 = c28713a.m143797b();
        } else {
            str2 = null;
        }
        if (AbstractC19074t.m100204b(str, str2) && f133215b == a.f133228t) {
            return true;
        }
        return false;
    }

    /* renamed from: u */
    public final boolean m143845u(String str) {
        String str2;
        AbstractC19074t.m100208f(str, "id");
        C28713a c28713a = f133216c;
        if (c28713a != null) {
            str2 = c28713a.m143797b();
        } else {
            str2 = null;
        }
        if (AbstractC19074t.m100204b(str, str2) && f133215b != a.f133228t && f133215b != a.f133224p) {
            return true;
        }
        return false;
    }
}
