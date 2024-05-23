package p716zh;

import ae.C0757b;
import ae.C0766k;
import ag0.AbstractC0837p0;
import ag0.C0814e0;
import ag0.InterfaceC0806b1;
import am.AbstractC0924m0;
import am.C0943w;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Base64;
import android.util.Pair;
import b40.AbstractC2531f0;
import b40.C2544s;
import b40.EnumC2523b0;
import bg0.C2797c;
import com.zing.zalo.AbstractC16801x;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.MainApplication;
import com.zing.zalo.control.E2eeEncryptException;
import com.zing.zalo.data.chat.model.tabmessage.Conversation;
import com.zing.zalo.data.entity.chat.message.MessageId;
import com.zing.zalo.p062db.AbstractC7963h;
import com.zing.zalo.p062db.C7956b;
import com.zing.zalo.p062db.C7959d;
import com.zing.zalo.p062db.C7960e;
import com.zing.zalo.p062db.C7965j;
import com.zing.zalo.utils.ToastUtils;
import com.zing.zalo.zmedia.player.ZMediaPlayer;
import com.zing.zalo.zvideoutil.ZAbstractBase;
import com.zing.zalocore.CoreUtility;
import com.zing.zalocore.connection.socket.AbstractC17522a;
import dj.C17945a0;
import dj.C18005u0;
import eg0.AbstractC18428c;
import eg0.AbstractC18429d;
import en0.InterfaceC18494a;
import en0.InterfaceC18505l;
import fj.C18980w;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import fn0.C19051f0;
import fn0.C19055h0;
import gg0.AbstractC19444a;
import gw.C19637j;
import gw.C19669z;
import hm0.C20096c;
import hm0.InterfaceC20094a;
import ho0.AbstractC20110a;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import ln0.AbstractC22543l;
import me0.AbstractC23028c0;
import me0.AbstractC23136l9;
import me0.C23055e5;
import mg.C23288a;
import mm0.AbstractC23350e;
import nh0.C23793c;
import on0.AbstractC24342w;
import on0.AbstractC24344y;
import on0.C24321d;
import org.json.JSONArray;
import org.json.JSONObject;
import p056cj.C3533a;
import p111du.AbstractC18069a;
import p173fz.C19172a;
import p185gc.AbstractC19378b;
import p212hj.AbstractC20071b;
import p304ks.AbstractC21935u;
import p304ks.C21927m;
import p348mi.AbstractC23306f;
import p348mi.AbstractC23309i;
import p363nh.C23744a;
import p405ov.C24559a;
import p461qu.AbstractC25495a;
import p620wt.AbstractC29233h;
import p620wt.AbstractC29239n;
import p620wt.InterfaceC29232g;
import p645xh.C29628e;
import p667y2.C30268e;
import p716zh.C31832a;
import p716zh.C31986k3;
import pm0.AbstractC24856m;
import pm0.AbstractC24866w;
import pm0.C24860q;
import pm0.InterfaceC24854k;
import qm0.AbstractC25332a0;
import qm0.AbstractC25366r;
import qm0.AbstractC25367r0;
import qm0.AbstractC25368s;
import qm0.AbstractC25370t;
import qm0.AbstractC25378x;
import sm0.AbstractC26327c;
import su.AbstractC26389c;
import wd0.C28931k;
import xd0.C29593i;
import xm0.AbstractC30166b;
import xm0.InterfaceC30165a;

/* renamed from: zh.k3 */
/* loaded from: classes3.dex */
public final class C31986k3 {

    /* renamed from: a */
    public static final C31986k3 f147083a;

    /* renamed from: b */
    private static final InterfaceC29232g f147084b;

    /* renamed from: c */
    private static final b0 f147085c;

    /* renamed from: d */
    private static final InterfaceC24854k f147086d;

    /* renamed from: e */
    private static long f147087e;

    /* renamed from: f */
    private static final InterfaceC24854k f147088f;

    /* renamed from: g */
    private static long f147089g;

    /* renamed from: h */
    private static final AtomicBoolean f147090h;

    /* renamed from: i */
    private static final InterfaceC24854k f147091i;

    /* renamed from: j */
    private static final InterfaceC24854k f147092j;

    /* renamed from: k */
    private static final InterfaceC29232g f147093k;

    /* renamed from: l */
    private static final Set f147094l;

    /* renamed from: zh.k3$a */
    /* loaded from: classes3.dex */
    public interface a {
        /* renamed from: a */
        void mo154154a(int i11);
    }

    /* renamed from: zh.k3$a0 */
    /* loaded from: classes3.dex */
    public static final class a0 extends AbstractC19075u implements InterfaceC18505l {

        /* renamed from: q */
        public static final a0 f147095q = new a0();

        a0() {
            super(1);
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: a */
        public final CharSequence mo205i9(Map.Entry entry) {
            AbstractC19074t.m100208f(entry, "<name for destructuring parameter 0>");
            return ((String) entry.getKey()) + "=" + ((String) entry.getValue());
        }
    }

    /* renamed from: zh.k3$b */
    /* loaded from: classes3.dex */
    public static final class b extends Enum {

        /* renamed from: p */
        public static final b f147096p = new b("NOT_YET_GET", 0);

        /* renamed from: q */
        public static final b f147097q = new b("REQUESTING", 1);

        /* renamed from: r */
        public static final b f147098r = new b("ALREADY_GET_SUCCESS", 2);

        /* renamed from: s */
        public static final b f147099s = new b("ALREADY_GET_ERROR", 3);

        /* renamed from: t */
        private static final /* synthetic */ b[] f147100t;

        /* renamed from: u */
        private static final /* synthetic */ InterfaceC30165a f147101u;

        static {
            b[] m154156b = m154156b();
            f147100t = m154156b;
            f147101u = AbstractC30166b.m148796a(m154156b);
        }

        private b(String str, int i11) {
            super(str, i11);
        }

        /* renamed from: b */
        private static final /* synthetic */ b[] m154156b() {
            return new b[]{f147096p, f147097q, f147098r, f147099s};
        }

        public static b valueOf(String str) {
            return (b) Enum.valueOf(b.class, str);
        }

        public static b[] values() {
            return (b[]) f147100t.clone();
        }
    }

    /* renamed from: zh.k3$b0 */
    /* loaded from: classes3.dex */
    public static final class b0 extends C2797c {
        b0(InterfaceC0806b1 interfaceC0806b1) {
            super(interfaceC0806b1);
        }

        @Override // bg0.C2797c
        /* renamed from: i */
        public void mo12810i(Exception exc) {
            AbstractC19074t.m100208f(exc, C30268e.f140632a);
            AbstractC23350e.m122776f("[E2EE]", exc);
        }
    }

    /* renamed from: zh.k3$c */
    /* loaded from: classes3.dex */
    public /* synthetic */ class c {

        /* renamed from: a */
        public static final /* synthetic */ int[] f147102a;

        static {
            int[] iArr = new int[EnumC31888da.values().length];
            try {
                iArr[EnumC31888da.f146476p.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC31888da.f146478r.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC31888da.f146479s.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[EnumC31888da.f146480t.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[EnumC31888da.f146477q.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            f147102a = iArr;
        }
    }

    /* renamed from: zh.k3$d */
    /* loaded from: classes3.dex */
    public static final class d implements C19637j.a {

        /* renamed from: a */
        final /* synthetic */ String f147103a;

        /* renamed from: b */
        final /* synthetic */ String f147104b;

        /* renamed from: c */
        final /* synthetic */ C17945a0 f147105c;

        d(String str, String str2, C17945a0 c17945a0) {
            this.f147103a = str;
            this.f147104b = str2;
            this.f147105c = c17945a0;
        }

        @Override // gw.C19637j.a
        /* renamed from: a */
        public void mo75322a(boolean z11, C31973j5 c31973j5) {
            Boolean bool;
            int i11;
            Integer num = 0;
            if (z11) {
                C31986k3 c31986k3 = C31986k3.f147083a;
                boolean m154108R1 = c31986k3.m154108R1(this.f147103a);
                if (c31973j5 != null) {
                    bool = Boolean.valueOf(c31973j5.m153750a0());
                } else {
                    bool = null;
                }
                C24559a.m127933c("[E2EE]", "Double check get Group Info SUCCESS: Group.isE2ee = " + bool + " | isE2EEThread = " + m154108R1);
                if (c31973j5 != null && c31973j5.m153750a0() && !m154108R1) {
                    String str = this.f147104b;
                    AbstractC19074t.m100207e(str, "$currentUid");
                    c31986k3.m154084A2(str, this.f147103a);
                } else if (c31973j5 != null && !c31973j5.m153750a0() && m154108R1) {
                    if (AbstractC19074t.m100204b(this.f147105c.m94862C4(), CoreUtility.f89233i)) {
                        i11 = 2;
                    } else {
                        i11 = 1;
                    }
                    String str2 = CoreUtility.f89233i;
                    AbstractC19074t.m100207e(str2, "currentUserUid");
                    c31986k3.m154107R0(str2, this.f147103a, i11, C23793c.Companion.m124321a().mo124308a());
                }
                c31986k3.m154049m1().put(this.f147103a, b.f147098r);
                c31986k3.m154051n1().put(this.f147103a, num);
                return;
            }
            C31986k3 c31986k32 = C31986k3.f147083a;
            C24559a.m127933c("[E2EE]", "Double check get Group Info ERROR: numRetry = " + c31986k32.m154051n1().get(this.f147103a));
            c31986k32.m154049m1().put(this.f147103a, b.f147099s);
            HashMap m154051n1 = c31986k32.m154051n1();
            String str3 = this.f147103a;
            Integer num2 = (Integer) c31986k32.m154051n1().get(this.f147103a);
            if (num2 != null) {
                num = num2;
            }
            m154051n1.put(str3, Integer.valueOf(num.intValue() + 1));
        }
    }

    /* renamed from: zh.k3$e */
    /* loaded from: classes3.dex */
    public static final class e implements C19637j.a {

        /* renamed from: a */
        final /* synthetic */ String f147106a;

        /* renamed from: b */
        final /* synthetic */ String f147107b;

        /* renamed from: c */
        final /* synthetic */ int f147108c;

        e(String str, String str2, int i11) {
            this.f147106a = str;
            this.f147107b = str2;
            this.f147108c = i11;
        }

        @Override // gw.C19637j.a
        /* renamed from: a */
        public void mo75322a(boolean z11, C31973j5 c31973j5) {
            Boolean bool;
            Integer num = 0;
            if (z11) {
                C31986k3 c31986k3 = C31986k3.f147083a;
                boolean m154108R1 = c31986k3.m154108R1(this.f147106a);
                if (c31973j5 != null) {
                    bool = Boolean.valueOf(c31973j5.m153750a0());
                } else {
                    bool = null;
                }
                C24559a.m127933c("[E2EE]", "Double check get Group Info SUCCESS: Group.isE2ee = " + bool + " | isE2EEThread = " + m154108R1);
                if (c31973j5 != null && c31973j5.m153750a0() && !m154108R1) {
                    String str = this.f147107b;
                    AbstractC19074t.m100207e(str, "$currentUid");
                    c31986k3.m154084A2(str, this.f147106a);
                } else if (c31973j5 != null && !c31973j5.m153750a0() && m154108R1) {
                    String str2 = CoreUtility.f89233i;
                    AbstractC19074t.m100207e(str2, "currentUserUid");
                    c31986k3.m154107R0(str2, this.f147106a, this.f147108c, C23793c.Companion.m124321a().mo124308a());
                }
                c31986k3.m154049m1().put(this.f147106a, b.f147098r);
                c31986k3.m154051n1().put(this.f147106a, num);
                return;
            }
            C31986k3 c31986k32 = C31986k3.f147083a;
            C24559a.m127933c("[E2EE]", "Double check get Group Info ERROR: numRetry = " + c31986k32.m154051n1().get(this.f147106a));
            c31986k32.m154049m1().put(this.f147106a, b.f147099s);
            HashMap m154051n1 = c31986k32.m154051n1();
            String str3 = this.f147106a;
            Integer num2 = (Integer) c31986k32.m154051n1().get(this.f147106a);
            if (num2 != null) {
                num = num2;
            }
            m154051n1.put(str3, Integer.valueOf(num.intValue() + 1));
        }
    }

    /* renamed from: zh.k3$f */
    /* loaded from: classes3.dex */
    public static final class f extends AbstractC19075u implements InterfaceC18505l {

        /* renamed from: q */
        public static final f f147109q = new f();

        f() {
            super(1);
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: a */
        public final CharSequence mo205i9(C31973j5 c31973j5) {
            AbstractC19074t.m100208f(c31973j5, "it");
            return c31973j5.m153781r();
        }
    }

    /* renamed from: zh.k3$g */
    /* loaded from: classes3.dex */
    static final class g extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final g f147110q = new g();

        g() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a */
        public final List mo12V4() {
            return Collections.synchronizedList(new ArrayList());
        }
    }

    /* renamed from: zh.k3$h */
    /* loaded from: classes3.dex */
    public static final class h extends AbstractC19075u implements InterfaceC18505l {

        /* renamed from: q */
        final /* synthetic */ String f147111q;

        /* renamed from: r */
        final /* synthetic */ String f147112r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(String str, String str2) {
            super(1);
            this.f147111q = str;
            this.f147112r = str2;
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: a */
        public final String mo205i9(C24860q c24860q) {
            AbstractC19074t.m100208f(c24860q, "<name for destructuring parameter 0>");
            String str = (String) c24860q.m129213a();
            String str2 = (String) c24860q.m129214b();
            if (AbstractC19074t.m100204b(str, this.f147111q)) {
                return this.f147112r;
            }
            return str2;
        }
    }

    /* renamed from: zh.k3$i */
    /* loaded from: classes3.dex */
    public static final class i extends AbstractC19075u implements InterfaceC18505l {

        /* renamed from: q */
        final /* synthetic */ String f147113q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        i(String str) {
            super(1);
            this.f147113q = str;
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: a */
        public final Boolean mo205i9(C31927g4 c31927g4) {
            boolean z11;
            if (c31927g4.m153397i() && AbstractC19074t.m100204b(c31927g4.m153394f(), this.f147113q)) {
                z11 = true;
            } else {
                z11 = false;
            }
            return Boolean.valueOf(z11);
        }
    }

    /* renamed from: zh.k3$j */
    /* loaded from: classes3.dex */
    public static final class j implements InterfaceC20094a {

        /* renamed from: a */
        final /* synthetic */ String f147114a;

        /* renamed from: b */
        final /* synthetic */ String f147115b;

        /* renamed from: c */
        final /* synthetic */ int f147116c;

        /* renamed from: d */
        final /* synthetic */ long f147117d;

        j(String str, String str2, int i11, long j11) {
            this.f147114a = str;
            this.f147115b = str2;
            this.f147116c = i11;
            this.f147117d = j11;
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
            int i11;
            if (AbstractC25495a.m132079d(this.f147114a)) {
                i11 = 10211;
            } else {
                i11 = 10111;
            }
            C24559a.m127933c("[E2EE]", "disableE2EE " + i11 + " onErrorData: " + c20096c);
            ToastUtils.m89266n(AbstractC8020f0.unknown_error, new Object[0]);
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            int i11;
            if (AbstractC25495a.m132079d(this.f147114a)) {
                i11 = 10211;
            } else {
                i11 = 10111;
            }
            C24559a.m127933c("[E2EE]", "disableE2EE " + i11 + " onDataProcessed: " + obj);
            C31986k3 c31986k3 = C31986k3.f147083a;
            String str = this.f147115b;
            AbstractC19074t.m100207e(str, "$currentUid");
            c31986k3.m154107R0(str, this.f147114a, this.f147116c, this.f147117d);
        }
    }

    /* renamed from: zh.k3$k */
    /* loaded from: classes3.dex */
    public static final class k implements InterfaceC20094a {

        /* renamed from: a */
        final /* synthetic */ String f147118a;

        /* renamed from: b */
        final /* synthetic */ String f147119b;

        /* renamed from: c */
        final /* synthetic */ boolean f147120c;

        /* renamed from: d */
        final /* synthetic */ C31927g4 f147121d;

        /* renamed from: e */
        final /* synthetic */ int f147122e;

        /* renamed from: f */
        final /* synthetic */ int f147123f;

        /* renamed from: g */
        final /* synthetic */ boolean f147124g;

        /* renamed from: zh.k3$k$a */
        /* loaded from: classes3.dex */
        public static final class a extends AbstractC19075u implements InterfaceC18505l {

            /* renamed from: q */
            final /* synthetic */ C19055h0 f147125q;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(C19055h0 c19055h0) {
                super(1);
                this.f147125q = c19055h0;
            }

            @Override // en0.InterfaceC18505l
            /* renamed from: a */
            public final Boolean mo205i9(a aVar) {
                AbstractC19074t.m100208f(aVar, "it");
                aVar.mo154154a(this.f147125q.f94931p);
                return Boolean.TRUE;
            }
        }

        /* renamed from: zh.k3$k$b */
        /* loaded from: classes3.dex */
        public static final class b extends AbstractC19075u implements InterfaceC18505l {

            /* renamed from: q */
            final /* synthetic */ C19055h0 f147126q;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(C19055h0 c19055h0) {
                super(1);
                this.f147126q = c19055h0;
            }

            @Override // en0.InterfaceC18505l
            /* renamed from: a */
            public final Boolean mo205i9(a aVar) {
                AbstractC19074t.m100208f(aVar, "it");
                aVar.mo154154a(this.f147126q.f94931p);
                return Boolean.TRUE;
            }
        }

        /* renamed from: zh.k3$k$c */
        /* loaded from: classes3.dex */
        public static final class c extends AbstractC19075u implements InterfaceC18505l {

            /* renamed from: q */
            public static final c f147127q = new c();

            c() {
                super(1);
            }

            @Override // en0.InterfaceC18505l
            /* renamed from: a */
            public final Boolean mo205i9(a aVar) {
                AbstractC19074t.m100208f(aVar, "it");
                aVar.mo154154a(-1);
                return Boolean.TRUE;
            }
        }

        k(String str, String str2, boolean z11, C31927g4 c31927g4, int i11, int i12, boolean z12) {
            this.f147118a = str;
            this.f147119b = str2;
            this.f147120c = z11;
            this.f147121d = c31927g4;
            this.f147122e = i11;
            this.f147123f = i12;
            this.f147124g = z12;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:45:0x015c  */
        /* JADX WARN: Removed duplicated region for block: B:54:? A[RETURN, SYNTHETIC] */
        /* JADX WARN: Type inference failed for: r15v17 */
        /* JADX WARN: Type inference failed for: r15v18 */
        /* JADX WARN: Type inference failed for: r15v19 */
        /* JADX WARN: Type inference failed for: r15v2, types: [boolean] */
        /* renamed from: f */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public static final void m154164f(String str, Object obj, boolean z11, C31927g4 c31927g4, String str2, int i11, int i12, boolean z12) {
            boolean z13;
            ?? r15;
            long j11;
            boolean z14;
            boolean z15;
            LinkedList<C24860q> linkedList;
            JSONArray optJSONArray;
            boolean z16;
            boolean z17;
            int m131511r;
            AbstractC19074t.m100208f(str, "$currentUid");
            AbstractC19074t.m100208f(c31927g4, "$primarySession");
            AbstractC19074t.m100208f(str2, "$threadId");
            if (!AbstractC19074t.m100204b(str, CoreUtility.f89233i)) {
                return;
            }
            C19055h0 c19055h0 = new C19055h0();
            c19055h0.f94931p = -1;
            boolean z18 = false;
            long j12 = -1;
            try {
            } catch (Exception e11) {
                e = e11;
                z13 = false;
            }
            if (obj instanceof JSONObject) {
                int optInt = ((JSONObject) obj).optInt("err");
                c19055h0.f94931p = optInt;
                if (optInt != 0) {
                    if (z11) {
                    }
                }
                long optLong = ((JSONObject) obj).optLong("ts");
                try {
                    linkedList = new LinkedList();
                    optJSONArray = ((JSONObject) obj).optJSONArray("uids");
                } catch (Exception e12) {
                    e = e12;
                    z13 = false;
                    j12 = optLong;
                    z18 = false;
                    z14 = z13;
                    AbstractC20110a.f98889a.mo104552e(e);
                    j11 = j12;
                    r15 = z14;
                    if (!z18) {
                    }
                }
                if (optJSONArray != null) {
                    c19055h0.f94931p = 0;
                    C29628e.m147249E0().m93390R(i11, false);
                    int length = optJSONArray.length();
                    for (int i13 = 0; i13 < length; i13++) {
                        try {
                            JSONObject jSONObject = optJSONArray.getJSONObject(i13);
                            int i14 = jSONObject.getInt("uid");
                            JSONArray optJSONArray2 = jSONObject.optJSONArray("deviceIds");
                            if (optJSONArray2 != null) {
                                AbstractC19074t.m100205c(optJSONArray2);
                                List m96092k = AbstractC18069a.m96092k(optJSONArray2);
                                if (m96092k != null) {
                                    if (AbstractC19074t.m100204b(String.valueOf(i14), str)) {
                                        m96092k.remove((Object) 0);
                                    }
                                    AbstractC19074t.m100205c(m96092k);
                                    List list = m96092k;
                                    m131511r = AbstractC25370t.m131511r(list, 10);
                                    ArrayList arrayList = new ArrayList(m131511r);
                                    Iterator it = list.iterator();
                                    while (it.hasNext()) {
                                        arrayList.add(new C24860q(Integer.valueOf(i14), (Integer) it.next()));
                                    }
                                    linkedList.addAll(arrayList);
                                }
                            }
                        } catch (Exception e13) {
                            e = e13;
                            j12 = optLong;
                            z14 = false;
                            AbstractC20110a.f98889a.mo104552e(e);
                            j11 = j12;
                            r15 = z14;
                            if (!z18) {
                            }
                        }
                    }
                    if (!linkedList.isEmpty()) {
                        try {
                            for (C24860q c24860q : linkedList) {
                                try {
                                    C31986k3.f147083a.m154022d0(true, str2, ((Number) c24860q.m129215c()).intValue(), ((Number) c24860q.m129216d()).intValue(), 3, optLong);
                                } catch (Exception e14) {
                                    e = e14;
                                    j12 = optLong;
                                    z18 = true;
                                    z14 = false;
                                    AbstractC20110a.f98889a.mo104552e(e);
                                    j11 = j12;
                                    r15 = z14;
                                    if (!z18) {
                                    }
                                }
                            }
                            z16 = false;
                            z17 = false;
                            try {
                                C31986k3.f147083a.m153969I1(str, str2, linkedList, optLong, i12, z11, z12, new a() { // from class: zh.n3

                                    /* renamed from: a */
                                    public final /* synthetic */ String f147491a;

                                    /* renamed from: b */
                                    public final /* synthetic */ String f147492b;

                                    /* renamed from: c */
                                    public final /* synthetic */ C31927g4 f147493c;

                                    /* renamed from: d */
                                    public final /* synthetic */ boolean f147494d;

                                    /* renamed from: e */
                                    public final /* synthetic */ C19055h0 f147495e;

                                    public /* synthetic */ C32031n3(String str3, String str22, C31927g4 c31927g42, boolean z112, C19055h0 c19055h02) {
                                        r1 = str3;
                                        r2 = str22;
                                        r3 = c31927g42;
                                        r4 = z112;
                                        r5 = c19055h02;
                                    }

                                    @Override // p716zh.C31986k3.a
                                    /* renamed from: a */
                                    public final void mo154154a(int i15) {
                                        C31986k3.k.m154165g(r1, r2, r3, r4, r5, i15);
                                    }
                                });
                                z18 = true;
                            } catch (Exception e15) {
                                e = e15;
                                j12 = optLong;
                                z18 = true;
                                z14 = z16;
                                AbstractC20110a.f98889a.mo104552e(e);
                                j11 = j12;
                                r15 = z14;
                                if (!z18) {
                                }
                            }
                        } catch (Exception e16) {
                            e = e16;
                            z16 = false;
                        }
                    } else {
                        z17 = false;
                        z18 = false;
                    }
                    j11 = optLong;
                    r15 = z17;
                    if (!z18) {
                        c31927g42.m153404p(r15);
                        c31927g42.m153403o(true);
                        c31927g42.m153401m(c19055h02.f94931p);
                        if (c19055h02.f94931p != 0) {
                            if (!z112) {
                                C31986k3.f147083a.m153974L0(str3, true, str22, 0, -1, j11);
                            }
                        } else {
                            C31986k3 c31986k3 = C31986k3.f147083a;
                            c31986k3.m154007X2(str3, true, str22, 0, -1, 6, j11);
                            if (!z112) {
                                C31986k3.m154035i0(c31986k3, EnumC31888da.f146476p, str22, null, 4, null);
                            }
                        }
                        AbstractC25378x.m131541C(c31927g42.m153389a(), new b(c19055h02));
                        C23744a m124119a = C23744a.Companion.m124119a();
                        Object[] objArr = new Object[2];
                        objArr[r15] = str22;
                        objArr[1] = Integer.valueOf(c19055h02.f94931p);
                        m124119a.m124116d(152, objArr);
                        return;
                    }
                    return;
                }
                z15 = false;
                j11 = optLong;
                z18 = false;
                r15 = z15;
                if (!z18) {
                }
            }
            z15 = false;
            j11 = -1;
            z18 = false;
            r15 = z15;
            if (!z18) {
            }
        }

        /* renamed from: g */
        public static final void m154165g(String str, String str2, C31927g4 c31927g4, boolean z11, C19055h0 c19055h0, int i11) {
            AbstractC19074t.m100208f(str, "$currentUid");
            AbstractC19074t.m100208f(str2, "$threadId");
            AbstractC19074t.m100208f(c31927g4, "$primarySession");
            AbstractC19074t.m100208f(c19055h0, "$resultCode");
            if (!AbstractC19074t.m100204b(str, CoreUtility.f89233i)) {
                return;
            }
            C31986k3 c31986k3 = C31986k3.f147083a;
            c31986k3.m154007X2(str, true, str2, 0, -1, 6, c31927g4.m153395g());
            c31927g4.m153404p(false);
            c31927g4.m153403o(true);
            if (!z11) {
                C31986k3.m154035i0(c31986k3, EnumC31888da.f146476p, str2, null, 4, null);
            }
            AbstractC25378x.m131541C(c31927g4.m153389a(), new a(c19055h0));
            C23744a.Companion.m124119a().m124116d(152, str2, Integer.valueOf(c19055h0.f94931p));
        }

        /* renamed from: h */
        public static final void m154166h(C20096c c20096c, C31927g4 c31927g4, boolean z11, String str, String str2) {
            AbstractC19074t.m100208f(c31927g4, "$primarySession");
            AbstractC19074t.m100208f(str, "$currentUid");
            AbstractC19074t.m100208f(str2, "$threadId");
            C24559a.m127933c("[E2EE]", "onErrorData 10200: " + c20096c);
            c31927g4.m153404p(false);
            c31927g4.m153403o(true);
            if (!z11) {
                C31986k3.m153977M0(C31986k3.f147083a, str, true, str2, 0, -1, 0L, 32, null);
            }
            AbstractC25378x.m131541C(c31927g4.m153389a(), c.f147127q);
            C23744a.Companion.m124119a().m124116d(152, str2, -1);
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
            if (!AbstractC19074t.m100204b(this.f147119b, CoreUtility.f89233i)) {
                return;
            }
            C31986k3.f147085c.mo13474a(new Runnable() { // from class: zh.l3

                /* renamed from: q */
                public final /* synthetic */ C31927g4 f147246q;

                /* renamed from: r */
                public final /* synthetic */ boolean f147247r;

                /* renamed from: s */
                public final /* synthetic */ String f147248s;

                /* renamed from: t */
                public final /* synthetic */ String f147249t;

                public /* synthetic */ RunnableC32001l3(C31927g4 c31927g4, boolean z11, String str, String str2) {
                    r2 = c31927g4;
                    r3 = z11;
                    r4 = str;
                    r5 = str2;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    C31986k3.k.m154166h(C20096c.this, r2, r3, r4, r5);
                }
            });
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            C24559a.m127933c("[E2EE]", "initE2eeGroup 10200: " + this.f147118a + " | " + obj);
            C31986k3.f147085c.mo13474a(new Runnable() { // from class: zh.m3

                /* renamed from: p */
                public final /* synthetic */ String f147335p;

                /* renamed from: q */
                public final /* synthetic */ Object f147336q;

                /* renamed from: r */
                public final /* synthetic */ boolean f147337r;

                /* renamed from: s */
                public final /* synthetic */ C31927g4 f147338s;

                /* renamed from: t */
                public final /* synthetic */ String f147339t;

                /* renamed from: u */
                public final /* synthetic */ int f147340u;

                /* renamed from: v */
                public final /* synthetic */ int f147341v;

                /* renamed from: w */
                public final /* synthetic */ boolean f147342w;

                public /* synthetic */ RunnableC32016m3(String str, Object obj2, boolean z11, C31927g4 c31927g4, String str2, int i11, int i12, boolean z12) {
                    r1 = str;
                    r2 = obj2;
                    r3 = z11;
                    r4 = c31927g4;
                    r5 = str2;
                    r6 = i11;
                    r7 = i12;
                    r8 = z12;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    C31986k3.k.m154164f(r1, r2, r3, r4, r5, r6, r7, r8);
                }
            });
        }
    }

    /* renamed from: zh.k3$l */
    /* loaded from: classes3.dex */
    static final class l extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final l f147128q = new l();

        l() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a */
        public final Map mo12V4() {
            return Collections.synchronizedMap(C7960e.m41971c6().m42337a5());
        }
    }

    /* renamed from: zh.k3$m */
    /* loaded from: classes3.dex */
    public static final class m implements Comparator {
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            int m135478b;
            m135478b = AbstractC26327c.m135478b((Integer) ((C24860q) obj2).m129216d(), (Integer) ((C24860q) obj).m129216d());
            return m135478b;
        }
    }

    /* renamed from: zh.k3$n */
    /* loaded from: classes3.dex */
    static final class n extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final n f147129q = new n();

        n() {
            super(0);
        }

        /* renamed from: c */
        public static final boolean m154172c(Message message) {
            AbstractC19074t.m100208f(message, "it");
            if (message.what == 1) {
                C31986k3.f147083a.m154133l0();
                return false;
            }
            return false;
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: b */
        public final Handler mo12V4() {
            return new Handler(Looper.getMainLooper(), new Handler.Callback() { // from class: zh.o3
                @Override // android.os.Handler.Callback
                public final boolean handleMessage(Message message) {
                    boolean m154172c;
                    m154172c = C31986k3.n.m154172c(message);
                    return m154172c;
                }
            });
        }
    }

    /* renamed from: zh.k3$o */
    /* loaded from: classes3.dex */
    public static final class o implements InterfaceC20094a {

        /* renamed from: a */
        final /* synthetic */ String f147130a;

        /* renamed from: b */
        final /* synthetic */ C31927g4 f147131b;

        /* renamed from: c */
        final /* synthetic */ String f147132c;

        /* renamed from: d */
        final /* synthetic */ boolean f147133d;

        /* renamed from: e */
        final /* synthetic */ boolean f147134e;

        /* renamed from: f */
        final /* synthetic */ int f147135f;

        /* renamed from: g */
        final /* synthetic */ int f147136g;

        /* renamed from: h */
        final /* synthetic */ C0766k f147137h;

        /* renamed from: zh.k3$o$a */
        /* loaded from: classes3.dex */
        public static final class a extends AbstractC19075u implements InterfaceC18505l {

            /* renamed from: q */
            public static final a f147138q = new a();

            a() {
                super(1);
            }

            @Override // en0.InterfaceC18505l
            /* renamed from: a */
            public final Boolean mo205i9(a aVar) {
                AbstractC19074t.m100208f(aVar, "it");
                aVar.mo154154a(0);
                return Boolean.TRUE;
            }
        }

        /* renamed from: zh.k3$o$b */
        /* loaded from: classes3.dex */
        public static final class b extends AbstractC19075u implements InterfaceC18505l {

            /* renamed from: q */
            final /* synthetic */ int f147139q;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(int i11) {
                super(1);
                this.f147139q = i11;
            }

            @Override // en0.InterfaceC18505l
            /* renamed from: a */
            public final Boolean mo205i9(a aVar) {
                AbstractC19074t.m100208f(aVar, "it");
                aVar.mo154154a(this.f147139q);
                return Boolean.TRUE;
            }
        }

        o(String str, C31927g4 c31927g4, String str2, boolean z11, boolean z12, int i11, int i12, C0766k c0766k) {
            this.f147130a = str;
            this.f147131b = c31927g4;
            this.f147132c = str2;
            this.f147133d = z11;
            this.f147134e = z12;
            this.f147135f = i11;
            this.f147136g = i12;
            this.f147137h = c0766k;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r11v0 */
        /* JADX WARN: Type inference failed for: r11v1, types: [boolean] */
        /* JADX WARN: Type inference failed for: r11v5 */
        /* renamed from: e */
        public static final void m154176e(String str, Object obj, C31927g4 c31927g4, String str2, boolean z11, boolean z12, int i11, int i12) {
            JSONObject jSONObject;
            ?? r11;
            int i13;
            boolean z13;
            boolean z14;
            boolean z15;
            int i14;
            int i15;
            int i16;
            AbstractC19074t.m100208f(str, "$currentUid");
            AbstractC19074t.m100208f(c31927g4, "$session");
            AbstractC19074t.m100208f(str2, "$threadId");
            if (!AbstractC19074t.m100204b(CoreUtility.f89233i, str)) {
                return;
            }
            if (obj instanceof JSONObject) {
                jSONObject = (JSONObject) obj;
            } else {
                jSONObject = null;
            }
            if (jSONObject != null) {
                long optLong = jSONObject.optLong("ts");
                List<Integer> m96092k = AbstractC18069a.m96092k(jSONObject.optJSONArray("deviceId"));
                if (m96092k != null && !m96092k.isEmpty()) {
                    for (Integer num : m96092k) {
                        C31986k3 c31986k3 = C31986k3.f147083a;
                        AbstractC19074t.m100205c(num);
                        c31986k3.m154022d0(false, str2, i11, num.intValue(), 4, optLong);
                    }
                }
                if (z11 && c31927g4.m153393e() != 6) {
                    if (c31927g4.m153393e() == 3) {
                        i15 = 3;
                    } else {
                        i15 = 0;
                    }
                    if (c31927g4.m153393e() != 5 && !z12) {
                        i16 = 4;
                    } else {
                        i16 = 6;
                    }
                    z14 = false;
                    z15 = C31986k3.f147083a.m154007X2(str, false, str2, i11, i12, i16, optLong);
                    i14 = i15;
                } else {
                    z14 = false;
                    z15 = false;
                    i14 = 0;
                }
                int i17 = i14;
                z13 = z15;
                i13 = i17;
                r11 = z14;
            } else {
                r11 = 0;
                i13 = 0;
                z13 = false;
            }
            c31927g4.m153404p(r11);
            c31927g4.m153403o(true);
            if (z13) {
                C23744a m124119a = C23744a.Companion.m124119a();
                Object[] objArr = new Object[2];
                objArr[r11] = str2;
                objArr[1] = Integer.valueOf(i13);
                m124119a.m124116d(152, objArr);
            }
            AbstractC25378x.m131541C(c31927g4.m153389a(), a.f147138q);
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:26:0x0170  */
        /* JADX WARN: Type inference failed for: r13v0 */
        /* JADX WARN: Type inference failed for: r13v1, types: [boolean] */
        /* JADX WARN: Type inference failed for: r13v2 */
        /* JADX WARN: Type inference failed for: r13v3 */
        /* JADX WARN: Type inference failed for: r13v4 */
        /* JADX WARN: Type inference failed for: r20v0, types: [zh.g4, java.lang.Object] */
        /* renamed from: f */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public static final void m154177f(String str, C20096c c20096c, C31927g4 c31927g4, boolean z11, String str2, int i11, int i12, boolean z12, C0766k c0766k) {
            Integer num;
            String str3;
            int i13;
            ?? r13;
            boolean z13;
            int parseInt;
            String m104490b;
            List m96092k;
            int[] m131184L0;
            int[] iArr;
            AbstractC19074t.m100208f(str, "$currentUid");
            AbstractC19074t.m100208f(c31927g4, "$session");
            AbstractC19074t.m100208f(str2, "$threadId");
            AbstractC19074t.m100208f(c0766k, "$this_apply");
            if (!AbstractC19074t.m100204b(CoreUtility.f89233i, str)) {
                return;
            }
            if (c20096c != null) {
                num = Integer.valueOf(c20096c.m104491c());
            } else {
                num = null;
            }
            if (c20096c != null) {
                str3 = c20096c.m104490b();
            } else {
                str3 = null;
            }
            C24559a.m127933c("[E2EE]", "onErrorData send 10102: " + num + " | " + str3);
            if (c20096c != null) {
                i13 = c20096c.m104491c();
            } else {
                i13 = -1;
            }
            long m153395g = c31927g4.m153395g();
            c31927g4.m153401m(i13);
            if (z11) {
                if (c31927g4.m153393e() == 3) {
                    r13 = 0;
                    z13 = C31986k3.f147083a.m154007X2(str, false, str2, i11, i12, 0, m153395g);
                } else {
                    r13 = 0;
                    z13 = false;
                }
                if (z12) {
                    C31986k3.f147083a.m154036i1().put(String.valueOf(i11), Long.valueOf(AbstractC23306f.m120579F1().mo124314i() + 86400000));
                }
            } else {
                r13 = 0;
                C31986k3 c31986k3 = C31986k3.f147083a;
                if (c31986k3.m154001V1(i13)) {
                    c31986k3.m154007X2(str, false, str2, i11, i12, 1, m153395g);
                } else if (c31927g4.m153395g() != 0) {
                    c31986k3.m154007X2(str, false, str2, i11, i12, 0, m153395g);
                } else {
                    c31927g4.m153405q(0);
                    c31986k3.m153974L0(str, false, str2, i11, i12, m153395g);
                }
                z13 = false;
            }
            if (i13 != -5) {
                switch (i13) {
                    case -12:
                    case -11:
                    case -10:
                        if (z11 && z12) {
                            long mo124314i = AbstractC23306f.m120579F1().mo124314i() + 1209600000;
                            C31986k3.f147083a.m154036i1().put(String.valueOf(i11), Long.valueOf(mo124314i));
                            C7960e.m41971c6().m42504q(String.valueOf(i11), mo124314i);
                        }
                        parseInt = i11;
                        iArr = null;
                        break;
                    case -9:
                        break;
                    default:
                        parseInt = i11;
                        iArr = null;
                        break;
                }
                c31927g4.m153404p(r13);
                c31927g4.m153403o(true);
                if (z13) {
                    C23744a m124119a = C23744a.Companion.m124119a();
                    Object[] objArr = new Object[4];
                    objArr[r13] = str2;
                    objArr[1] = Integer.valueOf(i13);
                    objArr[2] = Integer.valueOf(parseInt);
                    objArr[3] = iArr;
                    m124119a.m124116d(152, objArr);
                }
                AbstractC25378x.m131541C(c31927g4.m153389a(), new b(i13));
            }
            parseInt = Integer.parseInt(str);
            if (c20096c != null && (m104490b = c20096c.m104490b()) != null) {
                if (m104490b.length() <= 0) {
                    m104490b = null;
                }
                if (m104490b != null) {
                    try {
                        m96092k = AbstractC18069a.m96092k(new JSONObject(m104490b).optJSONArray("errorDevice"));
                    } catch (Exception e11) {
                        AbstractC20110a.a aVar = AbstractC20110a.f98889a;
                        String str4 = c0766k.f2541a;
                        AbstractC19074t.m100207e(str4, "TAG");
                        aVar.m104564x(str4).mo104552e(e11);
                    }
                    if (m96092k != null) {
                        AbstractC19074t.m100205c(m96092k);
                        m131184L0 = AbstractC25332a0.m131184L0(m96092k);
                        iArr = m131184L0;
                        c31927g4.m153404p(r13);
                        c31927g4.m153403o(true);
                        if (z13) {
                        }
                        AbstractC25378x.m131541C(c31927g4.m153389a(), new b(i13));
                    }
                }
            }
            iArr = null;
            c31927g4.m153404p(r13);
            c31927g4.m153403o(true);
            if (z13) {
            }
            AbstractC25378x.m131541C(c31927g4.m153389a(), new b(i13));
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
            C31986k3.f147085c.mo13474a(new Runnable() { // from class: zh.p3

                /* renamed from: p */
                public final /* synthetic */ String f147616p;

                /* renamed from: q */
                public final /* synthetic */ C20096c f147617q;

                /* renamed from: r */
                public final /* synthetic */ C31927g4 f147618r;

                /* renamed from: s */
                public final /* synthetic */ boolean f147619s;

                /* renamed from: t */
                public final /* synthetic */ String f147620t;

                /* renamed from: u */
                public final /* synthetic */ int f147621u;

                /* renamed from: v */
                public final /* synthetic */ int f147622v;

                /* renamed from: w */
                public final /* synthetic */ boolean f147623w;

                /* renamed from: x */
                public final /* synthetic */ C0766k f147624x;

                public /* synthetic */ RunnableC32060p3(String str, C20096c c20096c2, C31927g4 c31927g4, boolean z11, String str2, int i11, int i12, boolean z12, C0766k c0766k) {
                    r1 = str;
                    r2 = c20096c2;
                    r3 = c31927g4;
                    r4 = z11;
                    r5 = str2;
                    r6 = i11;
                    r7 = i12;
                    r8 = z12;
                    r9 = c0766k;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    C31986k3.o.m154177f(r1, r2, r3, r4, r5, r6, r7, r8, r9);
                }
            });
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            C24559a.m127933c("[E2EE]", "onDataProcessed send 10102:  " + obj);
            C31986k3.f147085c.mo13474a(new Runnable() { // from class: zh.q3

                /* renamed from: p */
                public final /* synthetic */ String f147682p;

                /* renamed from: q */
                public final /* synthetic */ Object f147683q;

                /* renamed from: r */
                public final /* synthetic */ C31927g4 f147684r;

                /* renamed from: s */
                public final /* synthetic */ String f147685s;

                /* renamed from: t */
                public final /* synthetic */ boolean f147686t;

                /* renamed from: u */
                public final /* synthetic */ boolean f147687u;

                /* renamed from: v */
                public final /* synthetic */ int f147688v;

                /* renamed from: w */
                public final /* synthetic */ int f147689w;

                public /* synthetic */ RunnableC32074q3(String str, Object obj2, C31927g4 c31927g4, String str2, boolean z11, boolean z12, int i11, int i12) {
                    r1 = str;
                    r2 = obj2;
                    r3 = c31927g4;
                    r4 = str2;
                    r5 = z11;
                    r6 = z12;
                    r7 = i11;
                    r8 = i12;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    C31986k3.o.m154176e(r1, r2, r3, r4, r5, r6, r7, r8);
                }
            });
        }
    }

    /* renamed from: zh.k3$p */
    /* loaded from: classes3.dex */
    public static final class p implements C19637j.a {

        /* renamed from: a */
        final /* synthetic */ String f147140a;

        /* renamed from: b */
        final /* synthetic */ C32076q5 f147141b;

        /* renamed from: c */
        final /* synthetic */ String f147142c;

        /* renamed from: d */
        final /* synthetic */ boolean f147143d;

        /* renamed from: e */
        final /* synthetic */ int f147144e;

        /* renamed from: f */
        final /* synthetic */ boolean f147145f;

        /* renamed from: g */
        final /* synthetic */ a f147146g;

        p(String str, C32076q5 c32076q5, String str2, boolean z11, int i11, boolean z12, a aVar) {
            this.f147140a = str;
            this.f147141b = c32076q5;
            this.f147142c = str2;
            this.f147143d = z11;
            this.f147144e = i11;
            this.f147145f = z12;
            this.f147146g = aVar;
        }

        @Override // gw.C19637j.a
        /* renamed from: a */
        public void mo75322a(boolean z11, C31973j5 c31973j5) {
            C32076q5 m4476k = C0943w.f3447a.m4476k(this.f147140a);
            if (m4476k == null) {
                m4476k = this.f147141b;
            }
            C31986k3.f147083a.m154000V0(this.f147142c, this.f147140a, new ArrayList(m4476k.m154718g()), this.f147143d, this.f147144e, this.f147145f, this.f147146g);
        }
    }

    /* renamed from: zh.k3$q */
    /* loaded from: classes3.dex */
    public static final class q implements Runnable {

        /* renamed from: p */
        final /* synthetic */ Iterator f147147p;

        /* renamed from: q */
        final /* synthetic */ String f147148q;

        /* renamed from: r */
        final /* synthetic */ long f147149r;

        /* renamed from: s */
        final /* synthetic */ int f147150s;

        /* renamed from: t */
        final /* synthetic */ int f147151t;

        /* renamed from: u */
        final /* synthetic */ boolean f147152u;

        /* renamed from: v */
        final /* synthetic */ boolean f147153v;

        /* renamed from: w */
        final /* synthetic */ a f147154w;

        /* renamed from: x */
        final /* synthetic */ C19051f0 f147155x;

        /* renamed from: y */
        final /* synthetic */ int f147156y;

        /* renamed from: z */
        final /* synthetic */ String f147157z;

        /* renamed from: zh.k3$q$a */
        /* loaded from: classes3.dex */
        public static final class a implements InterfaceC20094a {

            /* renamed from: a */
            final /* synthetic */ int f147158a;

            /* renamed from: b */
            final /* synthetic */ int f147159b;

            /* renamed from: c */
            final /* synthetic */ boolean f147160c;

            /* renamed from: d */
            final /* synthetic */ String f147161d;

            /* renamed from: e */
            final /* synthetic */ C31927g4 f147162e;

            /* renamed from: f */
            final /* synthetic */ q f147163f;

            /* renamed from: g */
            final /* synthetic */ String f147164g;

            /* renamed from: h */
            final /* synthetic */ C19051f0 f147165h;

            /* renamed from: i */
            final /* synthetic */ int f147166i;

            a(int i11, int i12, boolean z11, String str, C31927g4 c31927g4, q qVar, String str2, C19051f0 c19051f0, int i13) {
                this.f147158a = i11;
                this.f147159b = i12;
                this.f147160c = z11;
                this.f147161d = str;
                this.f147162e = c31927g4;
                this.f147163f = qVar;
                this.f147164g = str2;
                this.f147165h = c19051f0;
                this.f147166i = i13;
            }

            /* renamed from: e */
            public static final void m154182e(String str, C31927g4 c31927g4, Object obj, q qVar, String str2, int i11, C19051f0 c19051f0) {
                JSONObject jSONObject;
                int i12;
                AbstractC19074t.m100208f(str, "$currentUid");
                AbstractC19074t.m100208f(qVar, "this$0");
                AbstractC19074t.m100208f(str2, "$threadId");
                AbstractC19074t.m100208f(c19051f0, "$hasSuccess");
                if (!AbstractC19074t.m100204b(CoreUtility.f89233i, str)) {
                    return;
                }
                c31927g4.m153404p(false);
                c31927g4.m153403o(true);
                if (obj instanceof JSONObject) {
                    jSONObject = (JSONObject) obj;
                } else {
                    jSONObject = null;
                }
                if (jSONObject != null) {
                    JSONObject jSONObject2 = (JSONObject) obj;
                    long optLong = jSONObject2.optLong("ts");
                    if (jSONObject2.optInt("err_code") == 0) {
                        i12 = 6;
                    } else {
                        i12 = 3;
                    }
                    JSONArray optJSONArray = jSONObject2.optJSONArray("deviceId");
                    if (optJSONArray != null) {
                        AbstractC19074t.m100205c(optJSONArray);
                        List<Integer> m96092k = AbstractC18069a.m96092k(optJSONArray);
                        if (m96092k != null) {
                            AbstractC19074t.m100205c(m96092k);
                            for (Integer num : m96092k) {
                                C31986k3 c31986k3 = C31986k3.f147083a;
                                AbstractC19074t.m100205c(num);
                                c31986k3.m154022d0(true, str2, i11, num.intValue(), i12, optLong);
                                c19051f0.f94928p = true;
                            }
                        }
                    }
                    C31986k3.f147083a.m153974L0(str, true, str2, i11, -1, optLong);
                }
                qVar.run();
            }

            /* renamed from: f */
            public static final void m154183f(String str, C31927g4 c31927g4, int i11, int i12, C20096c c20096c, String str2, int i13, q qVar) {
                String str3;
                int i14;
                AbstractC19074t.m100208f(str, "$currentUid");
                AbstractC19074t.m100208f(str2, "$threadId");
                AbstractC19074t.m100208f(qVar, "this$0");
                if (!AbstractC19074t.m100204b(CoreUtility.f89233i, str)) {
                    return;
                }
                c31927g4.m153404p(false);
                c31927g4.m153403o(true);
                if (i11 == i12) {
                    str3 = "10311";
                } else {
                    str3 = "10201";
                }
                C24559a.m127933c("[E2EE]", "initE2eeWithGroupMembers  " + str3 + ": " + c20096c);
                C31986k3 c31986k3 = C31986k3.f147083a;
                if (c20096c != null) {
                    i14 = c20096c.m104491c();
                } else {
                    i14 = -1;
                }
                if (c31986k3.m154001V1(i14)) {
                    c31986k3.m154007X2(str, true, str2, i11, i13, 3, c31927g4.m153395g());
                } else if (c31927g4.m153395g() <= 0) {
                    c31986k3.m153974L0(str, true, str2, i11, i13, c31927g4.m153395g());
                } else {
                    c31986k3.m154007X2(str, true, str2, i11, i13, 0, c31927g4.m153395g());
                }
                qVar.run();
            }

            @Override // hm0.InterfaceC20094a
            /* renamed from: a */
            public void mo926a(C20096c c20096c) {
                C31986k3.f147085c.mo13474a(new Runnable() { // from class: zh.s3

                    /* renamed from: p */
                    public final /* synthetic */ String f147992p;

                    /* renamed from: q */
                    public final /* synthetic */ C31927g4 f147993q;

                    /* renamed from: r */
                    public final /* synthetic */ int f147994r;

                    /* renamed from: s */
                    public final /* synthetic */ int f147995s;

                    /* renamed from: t */
                    public final /* synthetic */ C20096c f147996t;

                    /* renamed from: u */
                    public final /* synthetic */ String f147997u;

                    /* renamed from: v */
                    public final /* synthetic */ int f147998v;

                    /* renamed from: w */
                    public final /* synthetic */ C31986k3.q f147999w;

                    public /* synthetic */ RunnableC32102s3(String str, C31927g4 c31927g4, int i11, int i12, C20096c c20096c2, String str2, int i13, C31986k3.q qVar) {
                        r1 = str;
                        r2 = c31927g4;
                        r3 = i11;
                        r4 = i12;
                        r5 = c20096c2;
                        r6 = str2;
                        r7 = i13;
                        r8 = qVar;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        C31986k3.q.a.m154183f(r1, r2, r3, r4, r5, r6, r7, r8);
                    }
                });
            }

            @Override // hm0.InterfaceC20094a
            /* renamed from: b */
            public void mo927b(Object obj) {
                String str;
                if (this.f147158a == this.f147159b) {
                    str = "me";
                } else {
                    str = "other";
                }
                C24559a.m127933c("[E2EE]", "initE2eeWithGroupMembers " + str + " | new join=" + this.f147160c + ": " + obj);
                C31986k3.f147085c.mo13474a(new Runnable() { // from class: zh.r3

                    /* renamed from: p */
                    public final /* synthetic */ String f147846p;

                    /* renamed from: q */
                    public final /* synthetic */ C31927g4 f147847q;

                    /* renamed from: r */
                    public final /* synthetic */ Object f147848r;

                    /* renamed from: s */
                    public final /* synthetic */ C31986k3.q f147849s;

                    /* renamed from: t */
                    public final /* synthetic */ String f147850t;

                    /* renamed from: u */
                    public final /* synthetic */ int f147851u;

                    /* renamed from: v */
                    public final /* synthetic */ C19051f0 f147852v;

                    public /* synthetic */ RunnableC32088r3(String str2, C31927g4 c31927g4, Object obj2, C31986k3.q qVar, String str3, int i11, C19051f0 c19051f0) {
                        r1 = str2;
                        r2 = c31927g4;
                        r3 = obj2;
                        r4 = qVar;
                        r5 = str3;
                        r6 = i11;
                        r7 = c19051f0;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        C31986k3.q.a.m154182e(r1, r2, r3, r4, r5, r6, r7);
                    }
                });
            }
        }

        q(Iterator it, String str, long j11, int i11, int i12, boolean z11, boolean z12, a aVar, C19051f0 c19051f0, int i13, String str2) {
            this.f147147p = it;
            this.f147148q = str;
            this.f147149r = j11;
            this.f147150s = i11;
            this.f147151t = i12;
            this.f147152u = z11;
            this.f147153v = z12;
            this.f147154w = aVar;
            this.f147155x = c19051f0;
            this.f147156y = i13;
            this.f147157z = str2;
        }

        @Override // java.lang.Runnable
        public void run() {
            int i11 = 0;
            if (this.f147147p.hasNext()) {
                C24860q c24860q = (C24860q) this.f147147p.next();
                int intValue = ((Number) c24860q.m129215c()).intValue();
                int intValue2 = ((Number) c24860q.m129216d()).intValue();
                C31986k3 c31986k3 = C31986k3.f147083a;
                c31986k3.m154022d0(true, this.f147148q, intValue, intValue2, 3, this.f147149r);
                C31927g4 m154027f1 = c31986k3.m154027f1(true, this.f147148q, intValue, intValue2);
                if (m154027f1 != null && !m154027f1.m153399k() && m154027f1.m153396h() != 0) {
                    m154027f1.m153404p(true);
                    m154027f1.m153403o(false);
                    C0766k c0766k = new C0766k();
                    c0766k.mo1704o8(new a(intValue, this.f147156y, this.f147153v, this.f147157z, m154027f1, this, this.f147148q, this.f147155x, intValue2));
                    c0766k.m1832Z(this.f147150s, intValue, intValue2, this.f147151t, this.f147152u, this.f147149r, this.f147153v);
                    return;
                }
                run();
                return;
            }
            a aVar = this.f147154w;
            if (aVar != null) {
                if (!this.f147155x.f94928p) {
                    i11 = -1;
                }
                aVar.mo154154a(i11);
            }
        }
    }

    /* renamed from: zh.k3$r */
    /* loaded from: classes3.dex */
    static final class r extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final r f147167q = new r();

        r() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a */
        public final HashMap mo12V4() {
            return new HashMap();
        }
    }

    /* renamed from: zh.k3$s */
    /* loaded from: classes3.dex */
    static final class s extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final s f147168q = new s();

        s() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a */
        public final HashMap mo12V4() {
            return new HashMap();
        }
    }

    /* renamed from: zh.k3$t */
    /* loaded from: classes3.dex */
    static final class t extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final t f147169q = new t();

        t() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a */
        public final CopyOnWriteArrayList mo12V4() {
            C7960e m41971c6 = C7960e.m41971c6();
            String str = CoreUtility.f89233i;
            C31986k3 c31986k3 = C31986k3.f147083a;
            return new CopyOnWriteArrayList(m41971c6.m42256R9(str, c31986k3.m154114W1(false), c31986k3.m154114W1(true)));
        }
    }

    /* renamed from: zh.k3$u */
    /* loaded from: classes3.dex */
    public static final class u implements InterfaceC20094a {

        /* renamed from: a */
        final /* synthetic */ String f147170a;

        /* renamed from: b */
        final /* synthetic */ List f147171b;

        /* renamed from: c */
        final /* synthetic */ long f147172c;

        /* renamed from: d */
        final /* synthetic */ long f147173d;

        u(String str, List list, long j11, long j12) {
            this.f147170a = str;
            this.f147171b = list;
            this.f147172c = j11;
            this.f147173d = j12;
        }

        /* renamed from: d */
        public static final void m154188d(String str, List list, long j11, long j12) {
            AbstractC19074t.m100208f(str, "$currentUid");
            AbstractC19074t.m100208f(list, "$uids");
            try {
                C31986k3 c31986k3 = C31986k3.f147083a;
                c31986k3.m154103O2(c31986k3.m154141r1() * 2);
                Thread.sleep(c31986k3.m154141r1());
                c31986k3.m154123c2(str, list, j11, j12);
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
            AbstractC0837p0.Companion.m2237f().mo2040a(new Runnable() { // from class: zh.t3

                /* renamed from: p */
                public final /* synthetic */ String f148050p;

                /* renamed from: q */
                public final /* synthetic */ List f148051q;

                /* renamed from: r */
                public final /* synthetic */ long f148052r;

                /* renamed from: s */
                public final /* synthetic */ long f148053s;

                public /* synthetic */ RunnableC32116t3(String str, List list, long j11, long j12) {
                    r1 = str;
                    r2 = list;
                    r3 = j11;
                    r5 = j12;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    C31986k3.u.m154188d(r1, r2, r3, r5);
                }
            });
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            C24559a.m127933c("[E2EE]", "notifyLoginToNewDevice 10105 onDataProcessed: " + obj);
        }
    }

    /* renamed from: zh.k3$v */
    /* loaded from: classes3.dex */
    public static final class v implements InterfaceC20094a {

        /* renamed from: a */
        final /* synthetic */ String f147174a;

        /* renamed from: b */
        final /* synthetic */ String f147175b;

        /* renamed from: c */
        final /* synthetic */ int f147176c;

        /* renamed from: d */
        final /* synthetic */ int f147177d;

        /* renamed from: e */
        final /* synthetic */ long f147178e;

        /* renamed from: f */
        final /* synthetic */ boolean f147179f;

        /* renamed from: g */
        final /* synthetic */ List f147180g;

        /* renamed from: h */
        final /* synthetic */ C31927g4 f147181h;

        v(String str, String str2, int i11, int i12, long j11, boolean z11, List list, C31927g4 c31927g4) {
            this.f147174a = str;
            this.f147175b = str2;
            this.f147176c = i11;
            this.f147177d = i12;
            this.f147178e = j11;
            this.f147179f = z11;
            this.f147180g = list;
            this.f147181h = c31927g4;
        }

        /* renamed from: d */
        public static final void m154190d(String str, int i11, int i12, long j11, boolean z11, List list, C31927g4 c31927g4, String str2) {
            int i13;
            AbstractC19074t.m100208f(str, "$threadId");
            AbstractC19074t.m100208f(str2, "$currentUid");
            boolean m154022d0 = C31986k3.f147083a.m154022d0(false, str, i11, i12, 6, j11);
            if (!z11 && m154022d0) {
                if (list != null) {
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        int intValue = ((Number) it.next()).intValue();
                        if (intValue >= 0) {
                            C31986k3 c31986k3 = C31986k3.f147083a;
                            C31927g4 m154027f1 = c31986k3.m154027f1(false, str, i11, intValue);
                            if (m154027f1 == null || m154027f1.m153395g() < j11) {
                                C31986k3.m153954D1(c31986k3, str2, i11, intValue, false, false, null, 32, null);
                            }
                        }
                    }
                }
                if (c31927g4 != null && c31927g4.m153393e() == 5) {
                    i13 = 0;
                } else {
                    i13 = 0;
                    C31986k3.f147083a.m154022d0(false, str, i11, -1, 6, j11);
                }
                if (c31927g4 == null || c31927g4.m153393e() != 6) {
                    if (c31927g4 == null || c31927g4.m153393e() != 5) {
                        C31986k3.m154035i0(C31986k3.f147083a, EnumC31888da.f146476p, str, null, 4, null);
                        C31879d1 m153254a = C31894e1.f146524a.m153254a(str);
                        if (m153254a.m153191c() != 0) {
                            m153254a.m153200m(i13);
                            m153254a.m153199k();
                        }
                        C23744a m124119a = C23744a.Companion.m124119a();
                        Object[] objArr = new Object[2];
                        objArr[i13] = str;
                        objArr[1] = Integer.valueOf(i13);
                        m124119a.m124116d(152, objArr);
                    }
                }
            }
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
            C24559a.m127933c("[E2EE]", "submit 10103 onErrorData: " + c20096c);
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            if (!AbstractC19074t.m100204b(CoreUtility.f89233i, this.f147174a)) {
                return;
            }
            C24559a.m127933c("[E2EE]", "submit 10103 onDataProcessed: ");
            C31986k3.f147085c.mo13474a(new Runnable() { // from class: zh.u3

                /* renamed from: p */
                public final /* synthetic */ String f148188p;

                /* renamed from: q */
                public final /* synthetic */ int f148189q;

                /* renamed from: r */
                public final /* synthetic */ int f148190r;

                /* renamed from: s */
                public final /* synthetic */ long f148191s;

                /* renamed from: t */
                public final /* synthetic */ boolean f148192t;

                /* renamed from: u */
                public final /* synthetic */ List f148193u;

                /* renamed from: v */
                public final /* synthetic */ C31927g4 f148194v;

                /* renamed from: w */
                public final /* synthetic */ String f148195w;

                public /* synthetic */ RunnableC32130u3(String str, int i11, int i12, long j11, boolean z11, List list, C31927g4 c31927g4, String str2) {
                    r1 = str;
                    r2 = i11;
                    r3 = i12;
                    r4 = j11;
                    r6 = z11;
                    r7 = list;
                    r8 = c31927g4;
                    r9 = str2;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    C31986k3.v.m154190d(r1, r2, r3, r4, r6, r7, r8, r9);
                }
            });
        }
    }

    /* renamed from: zh.k3$w */
    /* loaded from: classes3.dex */
    public static final class w implements InterfaceC20094a {

        /* renamed from: a */
        final /* synthetic */ String f147182a;

        /* renamed from: b */
        final /* synthetic */ String f147183b;

        /* renamed from: c */
        final /* synthetic */ int f147184c;

        /* renamed from: d */
        final /* synthetic */ long f147185d;

        w(String str, String str2, int i11, long j11) {
            this.f147182a = str;
            this.f147183b = str2;
            this.f147184c = i11;
            this.f147185d = j11;
        }

        /* renamed from: d */
        public static final void m154192d(String str, String str2, int i11, long j11, w wVar) {
            AbstractC19074t.m100208f(str, "$threadId");
            AbstractC19074t.m100208f(str2, "$currentUid");
            AbstractC19074t.m100208f(wVar, "this$0");
            try {
                C31986k3 c31986k3 = C31986k3.f147083a;
                c31986k3.m154103O2(c31986k3.m154141r1() * 2);
                Thread.sleep(c31986k3.m154141r1());
                if (!c31986k3.m154086B1(str) && AbstractC19074t.m100204b(str2, CoreUtility.f89233i)) {
                    c31986k3.m154096J2(Integer.parseInt(str2), str, i11, 3, false, j11, wVar);
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
            C24559a.m127933c("[E2EE]", "onReceivedE2eeInit11Response -> sendDisableE2eeToServer 10111 onErrorData: " + c20096c);
            AbstractC0837p0.Companion.m2237f().mo2040a(new Runnable() { // from class: zh.v3

                /* renamed from: p */
                public final /* synthetic */ String f148243p;

                /* renamed from: q */
                public final /* synthetic */ String f148244q;

                /* renamed from: r */
                public final /* synthetic */ int f148245r;

                /* renamed from: s */
                public final /* synthetic */ long f148246s;

                /* renamed from: t */
                public final /* synthetic */ C31986k3.w f148247t;

                public /* synthetic */ RunnableC32144v3(String str, String str2, int i11, long j11, C31986k3.w this) {
                    r1 = str;
                    r2 = str2;
                    r3 = i11;
                    r4 = j11;
                    r6 = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    C31986k3.w.m154192d(r1, r2, r3, r4, r6);
                }
            });
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            C24559a.m127933c("[E2EE]", "onReceivedE2eeInit11Response -> sendDisableE2eeToServer 10111 onDataProcessed: " + obj);
            C31986k3.f147083a.m154036i1().put(this.f147182a, Long.valueOf(AbstractC23306f.m120579F1().mo124314i() + 86400000));
        }
    }

    /* renamed from: zh.k3$x */
    /* loaded from: classes3.dex */
    public static final class x implements InterfaceC20094a {
        x() {
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
            C24559a.m127933c("[E2EE]", "Send 10217 onErrorData: " + c20096c);
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            C24559a.m127933c("[E2EE]", "Send 10217 onDataProcessed: " + obj);
        }
    }

    /* renamed from: zh.k3$y */
    /* loaded from: classes3.dex */
    public static final class y implements InterfaceC20094a {

        /* renamed from: a */
        final /* synthetic */ C31927g4 f147186a;

        /* renamed from: b */
        final /* synthetic */ String f147187b;

        /* renamed from: c */
        final /* synthetic */ int f147188c;

        /* renamed from: d */
        final /* synthetic */ long f147189d;

        y(C31927g4 c31927g4, String str, int i11, long j11) {
            this.f147186a = c31927g4;
            this.f147187b = str;
            this.f147188c = i11;
            this.f147189d = j11;
        }

        /* renamed from: d */
        public static final void m154194d(C31927g4 c31927g4, String str, int i11, long j11, y yVar) {
            AbstractC19074t.m100208f(yVar, "this$0");
            try {
                C31986k3 c31986k3 = C31986k3.f147083a;
                c31986k3.m154103O2(c31986k3.m154141r1() * 2);
                Thread.sleep(c31986k3.m154141r1());
                if (!c31986k3.m154086B1(c31927g4.m153394f()) && AbstractC19074t.m100204b(str, CoreUtility.f89233i)) {
                    AbstractC19074t.m100205c(str);
                    c31986k3.m154096J2(Integer.parseInt(str), c31927g4.m153394f(), i11, 4, false, j11, yVar);
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
            C24559a.m127933c("[E2EE]", "onReceivedPartnerLoginNewDevice -> sendDisableE2eeToServer 10111 onErrorData: " + c20096c);
            AbstractC0837p0.Companion.m2237f().mo2040a(new Runnable() { // from class: zh.w3

                /* renamed from: q */
                public final /* synthetic */ String f148282q;

                /* renamed from: r */
                public final /* synthetic */ int f148283r;

                /* renamed from: s */
                public final /* synthetic */ long f148284s;

                /* renamed from: t */
                public final /* synthetic */ C31986k3.y f148285t;

                public /* synthetic */ RunnableC32158w3(String str, int i11, long j11, C31986k3.y this) {
                    r2 = str;
                    r3 = i11;
                    r4 = j11;
                    r6 = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    C31986k3.y.m154194d(C31927g4.this, r2, r3, r4, r6);
                }
            });
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            C24559a.m127933c("[E2EE]", "onReceivedPartnerLoginNewDevice -> sendDisableE2eeToServer 10111 onDataProcessed: " + obj);
        }
    }

    /* renamed from: zh.k3$z */
    /* loaded from: classes3.dex */
    public static final class z implements InterfaceC20094a {

        /* renamed from: a */
        final /* synthetic */ String f147190a;

        /* renamed from: b */
        final /* synthetic */ boolean f147191b;

        /* renamed from: c */
        final /* synthetic */ boolean f147192c;

        /* renamed from: d */
        final /* synthetic */ int f147193d;

        /* renamed from: e */
        final /* synthetic */ C0766k f147194e;

        /* renamed from: f */
        final /* synthetic */ int f147195f;

        z(String str, boolean z11, boolean z12, int i11, C0766k c0766k, int i12) {
            this.f147190a = str;
            this.f147191b = z11;
            this.f147192c = z12;
            this.f147193d = i11;
            this.f147194e = c0766k;
            this.f147195f = i12;
        }

        /* renamed from: f */
        public static final void m154198f(String str, boolean z11, Object obj, boolean z12, int i11, C0766k c0766k) {
            JSONObject jSONObject;
            boolean z13;
            long j11;
            JSONArray jSONArray;
            List<Integer> m96092k;
            JSONArray jSONArray2;
            int i12;
            String str2;
            int i13;
            boolean z14;
            int i14;
            int i15;
            int i16;
            String str3;
            AbstractC19074t.m100208f(str, "$currentUid");
            AbstractC19074t.m100208f(c0766k, "$this_apply");
            if (!AbstractC19074t.m100204b(str, CoreUtility.f89233i)) {
                return;
            }
            try {
                C31986k3.f147083a.m154103O2(512L);
                if (!z11) {
                    C24559a.m127933c("[E2EE]", "10301: " + obj);
                }
                if (obj instanceof JSONObject) {
                    jSONObject = (JSONObject) obj;
                } else {
                    jSONObject = null;
                }
                if (jSONObject != null) {
                    LinkedList linkedList = new LinkedList();
                    long optLong = jSONObject.optLong("ts");
                    if (jSONObject.optInt("hasMore", 0) == 1) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    int optInt = jSONObject.optInt("lastId");
                    JSONArray optJSONArray = jSONObject.optJSONArray("threads");
                    if (optJSONArray != null) {
                        AbstractC19074t.m100205c(optJSONArray);
                        int length = optJSONArray.length();
                        int i17 = 0;
                        while (i17 < length) {
                            JSONObject jSONObject2 = optJSONArray.getJSONObject(i17);
                            int optInt2 = jSONObject2.optInt("uid");
                            String valueOf = String.valueOf(optInt2);
                            C31986k3.f147094l.add(valueOf);
                            if (!z12) {
                                JSONArray optJSONArray2 = jSONObject2.optJSONArray("devices");
                                if (optJSONArray2 != null) {
                                    AbstractC19074t.m100205c(optJSONArray2);
                                    int length2 = optJSONArray2.length();
                                    int i18 = 0;
                                    z14 = false;
                                    while (i18 < length2) {
                                        JSONObject jSONObject3 = optJSONArray2.getJSONObject(i18);
                                        int optInt3 = jSONObject3.optInt("di");
                                        JSONArray jSONArray3 = optJSONArray;
                                        int optInt4 = jSONObject3.optInt("iid");
                                        int m93425s = C29628e.m147249E0().m93425s(optInt2, optInt3);
                                        int i19 = length;
                                        C31986k3 c31986k3 = C31986k3.f147083a;
                                        JSONArray jSONArray4 = optJSONArray2;
                                        int i21 = length2;
                                        C31927g4 m154027f1 = c31986k3.m154027f1(false, String.valueOf(optInt2), optInt2, optInt3);
                                        if (optInt4 == 0 || m93425s != optInt4) {
                                            i15 = optInt2;
                                            i16 = i21;
                                            String str4 = valueOf;
                                            if (m93425s != 0) {
                                                C29628e.m147249E0().m93386N(i15, optInt3);
                                                if (m154027f1 != null) {
                                                    m154027f1.m153403o(false);
                                                }
                                            }
                                            if (m154027f1 != null && m154027f1.m153393e() != 0) {
                                                str3 = str4;
                                            }
                                            str3 = str4;
                                            c31986k3.m154022d0(false, String.valueOf(i15), i15, optInt3, 5, optLong);
                                        } else {
                                            if (m154027f1 != null && m154027f1.m153393e() != 0 && m154027f1.m153393e() != 1) {
                                                str3 = valueOf;
                                                i15 = optInt2;
                                                i16 = i21;
                                            }
                                            i16 = i21;
                                            str3 = valueOf;
                                            i15 = optInt2;
                                            c31986k3.m154022d0(false, String.valueOf(optInt2), i15, optInt3, 6, optLong);
                                        }
                                        i18++;
                                        optInt2 = i15;
                                        valueOf = str3;
                                        optJSONArray = jSONArray3;
                                        length = i19;
                                        optJSONArray2 = jSONArray4;
                                        length2 = i16;
                                        z14 = true;
                                    }
                                    jSONArray2 = optJSONArray;
                                    i12 = length;
                                    str2 = valueOf;
                                    i13 = optInt2;
                                } else {
                                    jSONArray2 = optJSONArray;
                                    i12 = length;
                                    str2 = valueOf;
                                    i13 = optInt2;
                                    z14 = false;
                                }
                                C31986k3 c31986k32 = C31986k3.f147083a;
                                if (!c31986k32.m154108R1(str2)) {
                                    if (z14) {
                                        i14 = 6;
                                    } else {
                                        i14 = 5;
                                    }
                                    c31986k32.m154022d0(false, str2, i13, -1, i14, optLong);
                                }
                            } else {
                                jSONArray2 = optJSONArray;
                                i12 = length;
                                if (C31986k3.f147083a.m154022d0(false, valueOf, optInt2, -1, 5, optLong)) {
                                    C23744a.Companion.m124119a().m124116d(153, valueOf, Boolean.FALSE);
                                    linkedList.add(Integer.valueOf(optInt2));
                                    i17++;
                                    optJSONArray = jSONArray2;
                                    length = i12;
                                }
                            }
                            i17++;
                            optJSONArray = jSONArray2;
                            length = i12;
                        }
                    }
                    JSONArray optJSONArray3 = jSONObject.optJSONArray("waitUids");
                    if (optJSONArray3 != null) {
                        if (optJSONArray3.length() > 0) {
                            jSONArray = optJSONArray3;
                        } else {
                            jSONArray = null;
                        }
                        if (jSONArray != null && (m96092k = AbstractC18069a.m96092k(jSONArray)) != null) {
                            for (Integer num : m96092k) {
                                C31986k3.f147094l.add(String.valueOf(num));
                                C31986k3 c31986k33 = C31986k3.f147083a;
                                AbstractC19074t.m100205c(num);
                                C31986k3.m153954D1(c31986k33, str, num.intValue(), -1, true, false, null, 32, null);
                                optLong = optLong;
                            }
                        }
                    }
                    long j12 = optLong;
                    if (AbstractC0924m0.m3926ja() && (!linkedList.isEmpty())) {
                        C31986k3.f147083a.m154123c2(str, linkedList, AbstractC0924m0.m3182K0(), AbstractC0924m0.m3211L0());
                    }
                    if (z13) {
                        C31986k3.f147083a.m154088D2(str, z12, z11, i11, optInt);
                        return;
                    }
                    for (C31927g4 c31927g4 : C31986k3.f147083a.m154063s1()) {
                        if (!c31927g4.m153397i() && !AbstractC19074t.m100204b(c31927g4.m153394f(), str) && !C31986k3.f147094l.contains(c31927g4.m153394f())) {
                            String str5 = c0766k.f2541a;
                            AbstractC19074t.m100207e(str5, "TAG");
                            C24559a.m127933c(str5, "Session is not e2ee, update to OFF " + c31927g4);
                            c31927g4.m153405q(0);
                            j11 = j12;
                            c31927g4.m153406r(j11);
                            C31986k3.f147085c.mo13474a(new Runnable() { // from class: zh.z3

                                /* renamed from: p */
                                public final /* synthetic */ String f148500p;

                                /* renamed from: q */
                                public final /* synthetic */ C31927g4 f148501q;

                                /* renamed from: r */
                                public final /* synthetic */ long f148502r;

                                public /* synthetic */ RunnableC32200z3(String str6, C31927g4 c31927g42, long j112) {
                                    r1 = str6;
                                    r2 = c31927g42;
                                    r3 = j112;
                                }

                                @Override // java.lang.Runnable
                                public final void run() {
                                    C31986k3.z.m154199g(r1, r2, r3);
                                }
                            });
                        } else {
                            j112 = j12;
                        }
                        j12 = j112;
                    }
                    C31986k3.f147094l.clear();
                }
            } catch (Exception e11) {
                AbstractC20110a.f98889a.mo104552e(e11);
            }
            AbstractC0924m0.m3938jm(false);
            AbstractC0924m0.m3935jj(C23793c.Companion.m124321a().mo124314i());
            if (!AbstractC0924m0.m3106Hb()) {
                AbstractC0924m0.m3081Gf(false);
            }
        }

        /* renamed from: g */
        public static final void m154199g(String str, C31927g4 c31927g4, long j11) {
            AbstractC19074t.m100208f(str, "$currentUid");
            C7960e.m41971c6().m42547td(str, false, c31927g4.m153394f(), c31927g4.m153396h(), c31927g4.m153390b(), 0, j11, c31927g4.m153392d());
        }

        /* renamed from: h */
        public static final void m154200h(String str, boolean z11, boolean z12, int i11, int i12) {
            AbstractC19074t.m100208f(str, "$currentUid");
            C31986k3.f147083a.m154088D2(str, z11, z12, i11, i12);
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
            if (!AbstractC19074t.m100204b(this.f147190a, CoreUtility.f89233i)) {
                return;
            }
            C24559a.m127933c("[E2EE]", "reInitThreads11: onErrorData");
            C31986k3 c31986k3 = C31986k3.f147083a;
            c31986k3.m154103O2(c31986k3.m154141r1() * 2);
            AbstractC19444a.m101694b(new Runnable() { // from class: zh.x3

                /* renamed from: p */
                public final /* synthetic */ String f148323p;

                /* renamed from: q */
                public final /* synthetic */ boolean f148324q;

                /* renamed from: r */
                public final /* synthetic */ boolean f148325r;

                /* renamed from: s */
                public final /* synthetic */ int f148326s;

                /* renamed from: t */
                public final /* synthetic */ int f148327t;

                public /* synthetic */ RunnableC32172x3(String str, boolean z11, boolean z12, int i11, int i12) {
                    r1 = str;
                    r2 = z11;
                    r3 = z12;
                    r4 = i11;
                    r5 = i12;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    C31986k3.z.m154200h(r1, r2, r3, r4, r5);
                }
            }, c31986k3.m154141r1());
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            C31986k3.f147085c.mo13474a(new Runnable() { // from class: zh.y3

                /* renamed from: p */
                public final /* synthetic */ String f148416p;

                /* renamed from: q */
                public final /* synthetic */ boolean f148417q;

                /* renamed from: r */
                public final /* synthetic */ Object f148418r;

                /* renamed from: s */
                public final /* synthetic */ boolean f148419s;

                /* renamed from: t */
                public final /* synthetic */ int f148420t;

                /* renamed from: u */
                public final /* synthetic */ C0766k f148421u;

                public /* synthetic */ RunnableC32186y3(String str, boolean z11, Object obj2, boolean z12, int i11, C0766k c0766k) {
                    r1 = str;
                    r2 = z11;
                    r3 = obj2;
                    r4 = z12;
                    r5 = i11;
                    r6 = c0766k;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    C31986k3.z.m154198f(r1, r2, r3, r4, r5, r6);
                }
            });
        }
    }

    static {
        InterfaceC24854k m129210a;
        InterfaceC24854k m129210a2;
        InterfaceC24854k m129210a3;
        InterfaceC24854k m129210a4;
        C31986k3 c31986k3 = new C31986k3();
        f147083a = c31986k3;
        c31986k3.m154100M2();
        f147084b = AbstractC29233h.m145990a(t.f147169q);
        f147085c = new b0(AbstractC0837p0.Companion.m2237f());
        m129210a = AbstractC24856m.m129210a(g.f147110q);
        f147086d = m129210a;
        f147087e = 512L;
        m129210a2 = AbstractC24856m.m129210a(n.f147129q);
        f147088f = m129210a2;
        f147090h = new AtomicBoolean(false);
        m129210a3 = AbstractC24856m.m129210a(r.f147167q);
        f147091i = m129210a3;
        m129210a4 = AbstractC24856m.m129210a(s.f147168q);
        f147092j = m129210a4;
        f147093k = AbstractC29233h.m145990a(l.f147128q);
        f147094l = new LinkedHashSet();
    }

    private C31986k3() {
    }

    /* renamed from: A0 */
    public static final void m153946A0(String str, String str2) {
        AbstractC19074t.m100208f(str2, "$threadId");
        if (AbstractC19074t.m100204b(str, CoreUtility.f89233i)) {
            C31986k3 c31986k3 = f147083a;
            if (!c31986k3.m154108R1(str2) && c31986k3.m154022d0(true, str2, 0, -1, 5, 0L)) {
                AbstractC19074t.m100205c(str);
                m153961F1(c31986k3, str, str2, 1, true, null, 16, null);
            }
        }
    }

    /* renamed from: B2 */
    public static final void m153948B2(String str, String str2) {
        AbstractC19074t.m100208f(str, "$currentUid");
        AbstractC19074t.m100208f(str2, "$threadId");
        C31986k3 c31986k3 = f147083a;
        if (c31986k3.m154114W1(true) && AbstractC19074t.m100204b(str, CoreUtility.f89233i)) {
            C24559a.m127933c("[E2EE]", "reEnableE2EEGroup: threadId = " + str2);
            if (!c31986k3.m154108R1(str2)) {
                c31986k3.m154022d0(true, str2, 0, -1, 5, 0L);
            }
            m153961F1(c31986k3, str, str2, 1, false, null, 24, null);
        }
    }

    /* renamed from: C0 */
    public static final void m153950C0(String str) {
        String m131214n0;
        List m131185M0;
        int m131511r;
        AbstractC19074t.m100208f(str, "$currentUid");
        if (AbstractC0924m0.m3106Hb() && AbstractC19074t.m100204b(str, CoreUtility.f89233i) && f147083a.m154114W1(true)) {
            C24559a.m127933c("[E2EE]", "reInitThreadsGroup: start");
            List m4475i = C0943w.f3447a.m4475i();
            ArrayList<C31973j5> arrayList = new ArrayList();
            for (Object obj : m4475i) {
                if (((C31973j5) obj).m153750a0()) {
                    arrayList.add(obj);
                }
            }
            if (!arrayList.isEmpty()) {
                m131214n0 = AbstractC25332a0.m131214n0(arrayList, ",", null, null, 0, null, f.f147109q, 30, null);
                C24559a.m127933c("[E2EE]", "reInitThreadsGroup: " + m131214n0);
                boolean m3805f9 = AbstractC0924m0.m3805f9();
                HashSet hashSet = new HashSet();
                for (C31973j5 c31973j5 : arrayList) {
                    String str2 = "group_" + c31973j5.m153781r();
                    C32076q5 m4476k = C0943w.f3447a.m4476k(str2);
                    if (m4476k == null) {
                        C24559a.m127933c("[E2EE]", "reInitThreadsGroup: Group member info missing for group id: " + str2 + ", name: " + c31973j5.m153793y());
                    }
                    if (m3805f9 && m4476k != null) {
                        List m154718g = m4476k.m154718g();
                        m131511r = AbstractC25370t.m131511r(m154718g, 10);
                        ArrayList arrayList2 = new ArrayList(m131511r);
                        Iterator it = m154718g.iterator();
                        while (it.hasNext()) {
                            arrayList2.add(Integer.valueOf(Integer.parseInt((String) it.next())));
                        }
                        hashSet.addAll(arrayList2);
                    }
                    C31986k3 c31986k3 = f147083a;
                    c31986k3.m154022d0(true, str2, 0, -1, 5, 0L);
                    if (AbstractC0924m0.m3805f9()) {
                        m153961F1(c31986k3, str, str2, 1, false, null, 24, null);
                    }
                }
                if (m3805f9 && (!hashSet.isEmpty())) {
                    hashSet.remove(Integer.valueOf(Integer.parseInt(str)));
                    C31986k3 c31986k32 = f147083a;
                    m131185M0 = AbstractC25332a0.m131185M0(hashSet);
                    c31986k32.m154123c2(str, m131185M0, AbstractC0924m0.m3182K0(), AbstractC0924m0.m3211L0());
                }
            }
            AbstractC0924m0.m3968km(false);
            if (!AbstractC0924m0.m3077Gb()) {
                AbstractC0924m0.m3081Gf(false);
            }
        }
    }

    /* renamed from: C1 */
    private final void m153951C1(String str, int i11, int i12, boolean z11, boolean z12, a aVar) {
        boolean z13;
        int i13;
        if (!AbstractC19074t.m100204b(CoreUtility.f89233i, str)) {
            return;
        }
        String valueOf = String.valueOf(i11);
        if (i12 == -1) {
            z13 = true;
        } else {
            z13 = false;
        }
        C31927g4 m154033h1 = m154033h1(false, valueOf, i11, i12);
        if (!m154033h1.m153399k()) {
            m154033h1.m153404p(true);
            m154033h1.m153403o(false);
            m154033h1.m153401m(0);
            if (m154033h1.m153393e() != 3 && m154033h1.m153393e() != 5) {
                if (m154033h1.m153393e() == 6) {
                    i13 = 5;
                } else {
                    i13 = 3;
                }
                m154007X2(str, false, m154033h1.m153394f(), m154033h1.m153396h(), m154033h1.m153390b(), i13, m154033h1.m153395g());
            }
            if (aVar != null) {
                m154033h1.m153389a().add(aVar);
            }
            C24559a.m127933c("[E2EE]", "Send 10102 | " + i11 + "-" + i12 + " | auto upgrade=" + z12);
            C0766k c0766k = new C0766k();
            c0766k.mo1704o8(new o(str, m154033h1, valueOf, z13, z12, i11, i12, c0766k));
            c0766k.m1831Y(i11, i12, z11, z12);
            return;
        }
        if (aVar != null) {
            m154033h1.m153389a().add(aVar);
        }
    }

    /* renamed from: C2 */
    private final void m153952C2(String str, boolean z11, String str2, int i11, int i12) {
        C31927g4 m154027f1 = m154027f1(z11, str2, i11, i12);
        if (m154027f1 != null) {
            f147083a.m154004W2(str, m154027f1, 5, m154027f1.m153395g());
        }
    }

    /* renamed from: D1 */
    static /* synthetic */ void m153954D1(C31986k3 c31986k3, String str, int i11, int i12, boolean z11, boolean z12, a aVar, int i13, Object obj) {
        if ((i13 & 32) != 0) {
            aVar = null;
        }
        c31986k3.m153951C1(str, i11, i12, z11, z12, aVar);
    }

    /* renamed from: E0 */
    private final void m153956E0(String str, C17945a0 c17945a0, C31852b4 c31852b4, int i11, int i12, int i13) {
        EnumC2523b0 enumC2523b0;
        C31897e4 m95184l3 = c17945a0.m95184l3();
        if (m95184l3 != null) {
            if (!m95184l3.m153271l(c31852b4)) {
                C23288a c23288a = C23288a.f113033a;
                String mo95039W2 = c17945a0.mo95039W2();
                AbstractC19074t.m100207e(mo95039W2, "getOwnerId(...)");
                AbstractC18428c.m97658a(c23288a, mo95039W2, 5, new Runnable() { // from class: zh.z2

                    /* renamed from: q */
                    public final /* synthetic */ C31897e4 f148497q;

                    /* renamed from: r */
                    public final /* synthetic */ C31852b4 f148498r;

                    /* renamed from: s */
                    public final /* synthetic */ String f148499s;

                    public /* synthetic */ RunnableC32199z2(C31897e4 m95184l32, C31852b4 c31852b42, String str2) {
                        r2 = m95184l32;
                        r3 = c31852b42;
                        r4 = str2;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        C31986k3.m153960F0(C17945a0.this, r2, r3, r4);
                    }
                });
                return;
            }
            if (i13 == -4) {
                enumC2523b0 = EnumC2523b0.f10262x;
            } else {
                enumC2523b0 = EnumC2523b0.f10255q;
            }
            f147083a.m154011Z2(c17945a0, c31852b42, i11, i12, new AbstractC2531f0.b(enumC2523b0), i13);
        }
    }

    /* renamed from: E1 */
    private final void m153957E1(String str, String str2, int i11, boolean z11, a aVar) {
        if (!AbstractC19074t.m100204b(CoreUtility.f89233i, str)) {
            return;
        }
        C0943w c0943w = C0943w.f3447a;
        C31973j5 m4472f = c0943w.m4472f(str2);
        C32076q5 m4476k = c0943w.m4476k(str2);
        boolean m154108R1 = m154108R1(str2);
        if (m4472f != null && m4476k != null && (m4472f.m153732O() <= AbstractC0924m0.m4248u3() || m154108R1)) {
            if (m4476k.m154717f() != m4472f.m153732O()) {
                C24559a.m127933c("[E2EE]", "Init group: load group info " + str2);
                C19637j.f97466a.m102870w(m4472f.m153781r(), new p(str2, m4476k, str, m154108R1, i11, z11, aVar));
                return;
            }
            m154000V0(str, str2, new ArrayList(m4476k.m154718g()), m154108R1, i11, z11, aVar);
            return;
        }
        m153977M0(this, str, true, str2, 0, -1, 0L, 32, null);
        if (aVar != null) {
            aVar.mo154154a(-101);
        }
    }

    /* renamed from: E2 */
    public static /* synthetic */ void m153958E2(C31986k3 c31986k3, String str, boolean z11, boolean z12, int i11, int i12, int i13, Object obj) {
        int i14;
        if ((i13 & 16) != 0) {
            i14 = 0;
        } else {
            i14 = i12;
        }
        c31986k3.m154088D2(str, z11, z12, i11, i14);
    }

    /* renamed from: F0 */
    public static final void m153960F0(C17945a0 c17945a0, C31897e4 c31897e4, C31852b4 c31852b4, String str) {
        AbstractC19074t.m100208f(c17945a0, "$chatContent");
        AbstractC19074t.m100208f(c31897e4, "$e2eeInfo");
        AbstractC19074t.m100208f(c31852b4, "$client");
        AbstractC19074t.m100208f(str, "$currentUid");
        C24559a.m127933c("[E2EE]", "RE-SEND msg decrypt fail id = " + c17945a0.m95029V3().m41044h());
        c31897e4.m153283y(c31852b4);
        C7956b.Companion.m41573b().m41556r0(c17945a0, str);
        C7959d.Companion.m41850e().m41758W1(c17945a0);
        C0814e0.m2056b(c17945a0);
    }

    /* renamed from: F1 */
    static /* synthetic */ void m153961F1(C31986k3 c31986k3, String str, String str2, int i11, boolean z11, a aVar, int i12, Object obj) {
        boolean z12;
        if ((i12 & 8) != 0) {
            z12 = false;
        } else {
            z12 = z11;
        }
        if ((i12 & 16) != 0) {
            aVar = null;
        }
        c31986k3.m153957E1(str, str2, i11, z12, aVar);
    }

    /* renamed from: F2 */
    public static final void m153962F2(String str, boolean z11, boolean z12, int i11, int i12) {
        AbstractC19074t.m100208f(str, "$currentUid");
        if (AbstractC19074t.m100204b(str, CoreUtility.f89233i)) {
            C31986k3 c31986k3 = f147083a;
            if (c31986k3.m154114W1(false)) {
                if (!AbstractC0924m0.m3077Gb() && !c31986k3.m153975L1()) {
                    return;
                }
                C24559a.m127933c("[E2EE]", "reInitThreads11: start - iid Changed = " + z11 + " | interval check = " + z12 + " | subCmd = " + i11 + " | from = " + i12);
                C0766k c0766k = new C0766k();
                c0766k.mo1704o8(new z(str, z12, z11, i11, c0766k, i12));
                c0766k.m1818L(str, z11 ^ true, i11, i12);
            }
        }
    }

    /* renamed from: G1 */
    private final void m153964G1(String str, String str2, int i11, int i12, int i13, long j11, boolean z11, a aVar) {
        List m131496e;
        m131496e = AbstractC25366r.m131496e(new C24860q(Integer.valueOf(i11), Integer.valueOf(i12)));
        m153969I1(str, str2, m131496e, j11, i13, z11, false, aVar);
    }

    /* renamed from: H1 */
    static /* synthetic */ void m153966H1(C31986k3 c31986k3, String str, String str2, int i11, int i12, int i13, long j11, boolean z11, a aVar, int i14, Object obj) {
        a aVar2;
        if ((i14 & 128) != 0) {
            aVar2 = null;
        } else {
            aVar2 = aVar;
        }
        c31986k3.m153964G1(str, str2, i11, i12, i13, j11, z11, aVar2);
    }

    /* renamed from: H2 */
    public static final void m153967H2(String str, String str2, int i11) {
        AbstractC19074t.m100208f(str2, "$threadId");
        if (!AbstractC19074t.m100204b(str, CoreUtility.f89233i)) {
            return;
        }
        CopyOnWriteArrayList m154063s1 = f147083a.m154063s1();
        ArrayList<C31927g4> arrayList = new ArrayList();
        for (Object obj : m154063s1) {
            C31927g4 c31927g4 = (C31927g4) obj;
            if (c31927g4.m153397i() && AbstractC19074t.m100204b(c31927g4.m153394f(), str2) && c31927g4.m153396h() == i11 && c31927g4.m153393e() != 0) {
                arrayList.add(obj);
            }
        }
        for (C31927g4 c31927g42 : arrayList) {
            C24559a.m127933c("[E2EE]", "removeGroupMemberE2ee: " + str2 + " [" + i11 + " - " + c31927g42.m153390b() + "]");
            C31986k3 c31986k3 = f147083a;
            AbstractC19074t.m100205c(str);
            AbstractC19074t.m100205c(c31927g42);
            c31986k3.m154004W2(str, c31927g42, 0, c31927g42.m153395g());
        }
    }

    /* renamed from: I1 */
    public final void m153969I1(String str, String str2, List list, long j11, int i11, boolean z11, boolean z12, a aVar) {
        if (!AbstractC19074t.m100204b(CoreUtility.f89233i, str)) {
            return;
        }
        int parseInt = Integer.parseInt(str);
        String substring = str2.substring(6);
        AbstractC19074t.m100207e(substring, "substring(...)");
        new q(list.iterator(), str2, j11, Integer.parseInt(substring), i11, z11, z12, aVar, new C19051f0(), parseInt, str).run();
    }

    /* renamed from: K1 */
    public static final void m153972K1(String str, int i11) {
        if (!AbstractC19074t.m100204b(str, CoreUtility.f89233i)) {
            return;
        }
        C24559a.m127933c("[E2EE]", "Sub device [" + i11 + "] is valid, add session success");
        C31986k3 c31986k3 = f147083a;
        AbstractC19074t.m100205c(str);
        c31986k3.m154022d0(false, str, Integer.parseInt(str), i11, 6, 0L);
    }

    /* renamed from: L0 */
    public final boolean m153974L0(String str, boolean z11, String str2, int i11, int i12, long j11) {
        try {
            C31927g4 m154027f1 = m154027f1(z11, str2, i11, i12);
            if (m154027f1 != null) {
                if (j11 >= 0 && m154027f1.m153395g() > j11) {
                    return false;
                }
                m154063s1().remove(m154027f1);
                C7960e.m41971c6().m42267Sb(str, m154027f1);
                return true;
            }
            return false;
        } catch (Exception e11) {
            AbstractC20110a.f98889a.mo104552e(e11);
            return false;
        }
    }

    /* renamed from: L1 */
    private final boolean m153975L1() {
        long m3948k2 = AbstractC0924m0.m3948k2();
        if (m3948k2 > 0 && C23793c.Companion.m124321a().mo124314i() - m3948k2 > 86400000) {
            return true;
        }
        return false;
    }

    /* renamed from: M0 */
    static /* synthetic */ boolean m153977M0(C31986k3 c31986k3, String str, boolean z11, String str2, int i11, int i12, long j11, int i13, Object obj) {
        long j12;
        if ((i13 & 32) != 0) {
            j12 = -1;
        } else {
            j12 = j11;
        }
        return c31986k3.m153974L0(str, z11, str2, i11, i12, j12);
    }

    /* renamed from: M1 */
    private final boolean m153978M1(C31832a.b bVar) {
        int i11 = bVar.f146093i;
        if (i11 != -1 && i11 != -6) {
            return false;
        }
        return true;
    }

    /* renamed from: N1 */
    private final boolean m153980N1(C31832a.b bVar) {
        int i11;
        if (!bVar.m152960j() && ((i11 = bVar.f146093i) == -1 || i11 == -4 || i11 == -6)) {
            return true;
        }
        return false;
    }

    /* renamed from: O0 */
    public static final void m153982O0(String str) {
        AbstractC19074t.m100208f(str, "$threadId");
        AbstractC25378x.m131542D(f147083a.m154063s1(), new i(str));
        C7960e.m41971c6().m42181Kc(CoreUtility.f89233i, str);
    }

    /* renamed from: O1 */
    private final boolean m153983O1(C31832a.b bVar) {
        if (bVar.f146093i == -6) {
            return true;
        }
        return false;
    }

    /* renamed from: P2 */
    private final void m153985P2(String str, boolean z11) {
        f147085c.mo13474a(new Runnable() { // from class: zh.w1

            /* renamed from: p */
            public final /* synthetic */ String f148268p;

            /* renamed from: q */
            public final /* synthetic */ boolean f148269q;

            public /* synthetic */ RunnableC32156w1(String str2, boolean z112) {
                r1 = str2;
                r2 = z112;
            }

            @Override // java.lang.Runnable
            public final void run() {
                C31986k3.m153988Q2(r1, r2);
            }
        });
    }

    /* renamed from: Q0 */
    public static final void m153987Q0(String str, String str2, long j11, int i11, int i12) {
        AbstractC19074t.m100208f(str2, "$threadId");
        if (!AbstractC19074t.m100204b(str, CoreUtility.f89233i)) {
            return;
        }
        C31986k3 c31986k3 = f147083a;
        if (c31986k3.m154108R1(str2)) {
            long j12 = 0;
            if (j11 > 0) {
                C31927g4 m154138p1 = c31986k3.m154138p1(str2);
                if (m154138p1 != null) {
                    j12 = m154138p1.m153395g();
                }
                if (j11 < j12) {
                    return;
                }
            }
            AbstractC19074t.m100205c(str);
            c31986k3.m154096J2(Integer.parseInt(str), str2, i11, i12, true, j11, new j(str2, str, i12, j11));
        }
    }

    /* renamed from: Q2 */
    public static final void m153988Q2(String str, boolean z11) {
        AbstractC19074t.m100208f(str, "$currentUid");
        if (!AbstractC19074t.m100204b(str, CoreUtility.f89233i)) {
            return;
        }
        for (C31927g4 c31927g4 : f147083a.m154063s1()) {
            if ((!z11 && !c31927g4.m153397i()) || (z11 && c31927g4.m153397i() && c31927g4.m153396h() == 0)) {
                if (c31927g4.m153390b() == -1 && c31927g4.m153393e() > 0) {
                    c31927g4.m153405q(5);
                    c31927g4.m153403o(false);
                }
            }
        }
        C7960e.m41971c6().m42383ed(str, z11);
    }

    /* renamed from: R2 */
    private final void m153990R2(String str, String str2) {
        for (C31927g4 c31927g4 : m154063s1()) {
            if (c31927g4.m153397i() && AbstractC19074t.m100204b(c31927g4.m153394f(), str2)) {
                c31927g4.m153405q(5);
                c31927g4.m153403o(false);
            }
        }
        C7960e.m41971c6().m42394fd(str, str2);
    }

    /* renamed from: S0 */
    public static final void m153992S0(String str, long j11, String str2, int i11) {
        String str3;
        int i12;
        AbstractC19074t.m100208f(str, "$currentUid");
        AbstractC19074t.m100208f(str2, "$threadId");
        if (!AbstractC19074t.m100204b(str, CoreUtility.f89233i)) {
            return;
        }
        long j12 = 0;
        if (j11 > 0) {
            C31927g4 m154138p1 = f147083a.m154138p1(str2);
            if (m154138p1 != null) {
                j12 = m154138p1.m153395g();
            }
            if (j11 < j12) {
                return;
            }
        }
        C24559a.m127933c("[E2EE]", "disableE2eeLocal: threadId = " + str2 + " | reason = " + i11 + " | timestamp = " + j11);
        C31986k3 c31986k3 = f147083a;
        if (c31986k3.m154108R1(str2)) {
            boolean m132079d = AbstractC25495a.m132079d(str2);
            int parseInt = Integer.parseInt(AbstractC25495a.m132089n(str2));
            int parseInt2 = Integer.parseInt(str);
            CopyOnWriteArrayList m154063s1 = c31986k3.m154063s1();
            ArrayList<C31927g4> arrayList = new ArrayList();
            for (Object obj : m154063s1) {
                C31927g4 c31927g4 = (C31927g4) obj;
                if (AbstractC19074t.m100204b(c31927g4.m153394f(), str2) && c31927g4.m153393e() != 0 && (j11 <= 0 || c31927g4.m153395g() <= j11)) {
                    arrayList.add(obj);
                }
            }
            for (C31927g4 c31927g42 : arrayList) {
                c31927g42.m153405q(0);
                if (j11 > 0) {
                    c31927g42.m153406r(j11);
                }
                if (m132079d) {
                    if (c31927g42.m153390b() != -1 && c31927g42.m153396h() != 0) {
                        C29628e.m147249E0().m93385M(parseInt, c31927g42.m153396h(), c31927g42.m153390b());
                    } else {
                        C29628e.m147249E0().m93384L(parseInt, parseInt2);
                    }
                } else if (c31927g42.m153390b() != -1 && c31927g42.m153396h() != 0 && c31927g42.m153396h() != parseInt2) {
                    C29628e.m147249E0().m93386N(parseInt, c31927g42.m153390b());
                }
            }
            if (!m132079d) {
                f147083a.m154036i1().put(str2, Long.valueOf(AbstractC23306f.m120579F1().mo124314i() + 86400000));
            }
            int i13 = 2;
            if (i11 != 3 && i11 != 4) {
                m154035i0(f147083a, EnumC31888da.f146479s, str2, null, 4, null);
                C31879d1 m153254a = C31894e1.f146524a.m153254a(str2);
                if (m153254a.m153191c() != 0) {
                    m153254a.m153200m(0);
                    m153254a.m153199k();
                }
            } else {
                EnumC31888da enumC31888da = EnumC31888da.f146478r;
                if (i11 == 4) {
                    enumC31888da = EnumC31888da.f146477q;
                    str3 = str2;
                    i12 = 2;
                } else {
                    str3 = "";
                    i12 = 1;
                }
                C31879d1 m153254a2 = C31894e1.f146524a.m153254a(str2);
                if (m153254a2.m153191c() != i12 && m153254a2.m153191c() != 2) {
                    m153254a2.m153200m(i12);
                    m153254a2.m153199k();
                }
                f147083a.m154129h0(enumC31888da, str2, str3);
            }
            f147085c.mo13474a(new Runnable() { // from class: zh.r2

                /* renamed from: p */
                public final /* synthetic */ boolean f147843p;

                /* renamed from: q */
                public final /* synthetic */ String f147844q;

                /* renamed from: r */
                public final /* synthetic */ long f147845r;

                public /* synthetic */ RunnableC32087r2(boolean m132079d2, String str22, long j112) {
                    r1 = m132079d2;
                    r2 = str22;
                    r3 = j112;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    C31986k3.m153995T0(r1, r2, r3);
                }
            });
            C23744a m124119a = C23744a.Companion.m124119a();
            Object[] objArr = new Object[2];
            objArr[0] = str22;
            if (i11 == 4) {
                i13 = -3;
            }
            objArr[1] = Integer.valueOf(i13);
            m124119a.m124116d(152, objArr);
            return;
        }
        f147085c.mo13474a(new Runnable() { // from class: zh.s2

            /* renamed from: p */
            public final /* synthetic */ boolean f147989p;

            /* renamed from: q */
            public final /* synthetic */ String f147990q;

            /* renamed from: r */
            public final /* synthetic */ long f147991r;

            public /* synthetic */ RunnableC32101s2(boolean z11, String str22, long j112) {
                r1 = z11;
                r2 = str22;
                r3 = j112;
            }

            @Override // java.lang.Runnable
            public final void run() {
                C31986k3.m153998U0(r1, r2, r3);
            }
        });
    }

    /* renamed from: S2 */
    private final void m153993S2(String str) {
        f147085c.mo13474a(new Runnable() { // from class: zh.h3

            /* renamed from: p */
            public final /* synthetic */ String f146759p;

            public /* synthetic */ RunnableC31941h3(String str2) {
                r1 = str2;
            }

            @Override // java.lang.Runnable
            public final void run() {
                C31986k3.m153996T2(r1);
            }
        });
    }

    /* renamed from: T0 */
    public static final void m153995T0(boolean z11, String str, long j11) {
        boolean z12;
        AbstractC19074t.m100208f(str, "$threadId");
        if (!z11 && f147083a.m154106Q1()) {
            z12 = false;
        } else {
            z12 = true;
        }
        C7960e.m41971c6().m42405gd(CoreUtility.f89233i, str, 0, j11, z12);
    }

    /* renamed from: T2 */
    public static final void m153996T2(String str) {
        AbstractC19074t.m100208f(str, "$currentUid");
        if (!AbstractC19074t.m100204b(str, CoreUtility.f89233i)) {
            return;
        }
        for (C31927g4 c31927g4 : f147083a.m154063s1()) {
            if (AbstractC19074t.m100204b(c31927g4.m153394f(), str) && !c31927g4.m153397i()) {
                c31927g4.m153405q(5);
                c31927g4.m153403o(false);
                c31927g4.m153402n(true);
                C7960e.m41971c6().m42547td(str, false, c31927g4.m153394f(), c31927g4.m153396h(), c31927g4.m153390b(), 5, c31927g4.m153395g(), true);
            }
        }
    }

    /* renamed from: U0 */
    public static final void m153998U0(boolean z11, String str, long j11) {
        int parseInt;
        AbstractC19074t.m100208f(str, "$threadId");
        C31986k3 c31986k3 = f147083a;
        if (z11) {
            parseInt = 0;
        } else {
            parseInt = Integer.parseInt(str);
        }
        c31986k3.m154022d0(z11, str, parseInt, -1, 0, j11);
    }

    /* renamed from: V0 */
    public final void m154000V0(String str, String str2, List list, boolean z11, int i11, boolean z12, a aVar) {
        int m131511r;
        C31927g4 m154033h1 = m154033h1(true, str2, 0, -1);
        if (!m154033h1.m153399k()) {
            m154033h1.m153404p(true);
            m154033h1.m153403o(false);
            m154033h1.m153401m(0);
            int parseInt = Integer.parseInt(AbstractC25495a.m132089n(str2));
            List list2 = list;
            m131511r = AbstractC25370t.m131511r(list2, 10);
            ArrayList arrayList = new ArrayList(m131511r);
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                arrayList.add(Integer.valueOf(Integer.parseInt((String) it.next())));
            }
            if (aVar != null) {
                m154033h1.m153389a().add(aVar);
            }
            C0766k c0766k = new C0766k();
            c0766k.mo1704o8(new k(str2, str, z11, m154033h1, parseInt, i11, z12));
            c0766k.m1880z(parseInt, arrayList, !z11);
            return;
        }
        if (aVar != null) {
            m154033h1.m153389a().add(aVar);
        }
    }

    /* renamed from: V1 */
    public final boolean m154001V1(int i11) {
        return (i11 == -3 || i11 == -5 || i11 == -7 || i11 == -10 || i11 == -11) ? false : true;
    }

    /* renamed from: V2 */
    public static final void m154002V2(C17945a0 c17945a0) {
        AbstractC19074t.m100208f(c17945a0, "$message");
        C19669z m103232a = C19669z.Companion.m103232a();
        MessageId m95029V3 = c17945a0.m95029V3();
        AbstractC19074t.m100207e(m95029V3, "getMessageId(...)");
        Conversation m103204T = m103232a.m103204T(m95029V3);
        if (m103204T != null) {
            C28931k m120612Q1 = AbstractC23306f.m120612Q1();
            AbstractC19074t.m100207e(m120612Q1, "provideUpdateLastMsgUseCase(...)");
            AbstractC19378b.m101499c(m120612Q1, new C28931k.b(m103204T, c17945a0, C28931k.d.Companion.m144587c()), null, 2, null);
        }
        C7956b m41573b = C7956b.Companion.m41573b();
        String str = CoreUtility.f89233i;
        AbstractC19074t.m100207e(str, "currentUserUid");
        m41573b.m41554q0(c17945a0, str);
        C23744a.Companion.m124119a().m124116d(4, c17945a0.mo95039W2());
    }

    /* renamed from: W2 */
    private final boolean m154004W2(String str, C31927g4 c31927g4, int i11, long j11) {
        return m154007X2(str, c31927g4.m153397i(), c31927g4.m153394f(), c31927g4.m153396h(), c31927g4.m153390b(), i11, j11);
    }

    /* renamed from: X0 */
    public static final void m154006X0(String str) {
        AbstractC19074t.m100208f(str, "$threadId");
        C31879d1 m153254a = C31894e1.f146524a.m153254a(str);
        if (m153254a.m153191c() != 0) {
            m153254a.m153200m(0);
            m153254a.m153199k();
        }
        if (AbstractC25495a.m132079d(str)) {
            C31986k3 c31986k3 = f147083a;
            String str2 = CoreUtility.f89233i;
            AbstractC19074t.m100207e(str2, "currentUserUid");
            m153961F1(c31986k3, str2, str, 0, true, null, 16, null);
            return;
        }
        C31986k3 c31986k32 = f147083a;
        String str3 = CoreUtility.f89233i;
        AbstractC19074t.m100207e(str3, "currentUserUid");
        m153954D1(c31986k32, str3, Integer.parseInt(str), -1, true, false, null, 32, null);
    }

    /* renamed from: X2 */
    public final boolean m154007X2(String str, boolean z11, String str2, int i11, int i12, int i13, long j11) {
        try {
            C31927g4 m154027f1 = m154027f1(z11, str2, i11, i12);
            if (m154027f1 != null && m154027f1.m153395g() <= j11) {
                m154027f1.m153406r(j11);
                m154027f1.m153405q(i13);
                if (i13 == 1 || i13 == 3 || i13 == 5) {
                    m154027f1.m153403o(false);
                }
                if (i13 >= 4) {
                    m154027f1.m153402n(true);
                }
                f147085c.mo13474a(new Runnable() { // from class: zh.u1

                    /* renamed from: q */
                    public final /* synthetic */ long f148177q;

                    /* renamed from: r */
                    public final /* synthetic */ String f148178r;

                    /* renamed from: s */
                    public final /* synthetic */ boolean f148179s;

                    /* renamed from: t */
                    public final /* synthetic */ String f148180t;

                    /* renamed from: u */
                    public final /* synthetic */ int f148181u;

                    /* renamed from: v */
                    public final /* synthetic */ int f148182v;

                    /* renamed from: w */
                    public final /* synthetic */ int f148183w;

                    public /* synthetic */ RunnableC32128u1(long j112, String str3, boolean z112, String str22, int i112, int i122, int i132) {
                        r2 = j112;
                        r4 = str3;
                        r5 = z112;
                        r6 = str22;
                        r7 = i112;
                        r8 = i122;
                        r9 = i132;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        C31986k3.m154009Y2(C31927g4.this, r2, r4, r5, r6, r7, r8, r9);
                    }
                });
                return true;
            }
        } catch (Exception e11) {
            AbstractC20110a.f98889a.mo104552e(e11);
        }
        return false;
    }

    /* renamed from: Y2 */
    public static final void m154009Y2(C31927g4 c31927g4, long j11, String str, boolean z11, String str2, int i11, int i12, int i13) {
        AbstractC19074t.m100208f(str, "$currentUid");
        AbstractC19074t.m100208f(str2, "$threadId");
        if (c31927g4.m153395g() <= j11) {
            C7960e.m41971c6().m42547td(str, z11, str2, i11, i12, i13, j11, c31927g4.m153392d());
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ProcessVariables
        jadx.core.utils.exceptions.JadxRuntimeException: Method arg registers not loaded: zh.t2.<init>(int, int, dj.a0, zh.b4, java.lang.String, b40.f0, int):void, class status: GENERATED_AND_UNLOADED
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
    /* renamed from: Z2 */
    private final void m154011Z2(dj.C17945a0 r12, p716zh.C31852b4 r13, int r14, int r15, b40.AbstractC2531f0 r16, int r17) {
        /*
            r11 = this;
            java.lang.String r5 = com.zing.zalocore.CoreUtility.f89233i
            mg.a r8 = mg.C23288a.f113033a
            java.lang.String r9 = r12.mo95039W2()
            java.lang.String r0 = "getOwnerId(...)"
            fn0.AbstractC19074t.m100207e(r9, r0)
            zh.t2 r10 = new zh.t2
            r0 = r10
            r1 = r14
            r2 = r15
            r3 = r12
            r4 = r13
            r6 = r16
            r7 = r17
            r0.<init>()
            r0 = 5
            eg0.AbstractC18428c.m97658a(r8, r9, r0, r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p716zh.C31986k3.m154011Z2(dj.a0, zh.b4, int, int, b40.f0, int):void");
    }

    /* renamed from: a3 */
    public static final void m154014a3(int i11, int i12, C17945a0 c17945a0, C31852b4 c31852b4, String str, AbstractC2531f0 abstractC2531f0, int i13) {
        String str2;
        String valueOf;
        AbstractC19074t.m100208f(c17945a0, "$chatContent");
        AbstractC19074t.m100208f(c31852b4, "$client");
        AbstractC19074t.m100208f(abstractC2531f0, "$reason");
        C24559a.m127933c("[E2EE]", "UPDATE SEND FAILED " + i11 + " - deviceId: " + i12 + " - id: " + c17945a0.m95029V3().m41044h());
        C31897e4 m95184l3 = c17945a0.m95184l3();
        if (m95184l3 != null) {
            m95184l3.m153284z(c31852b4, 4);
        }
        C7956b m41573b = C7956b.Companion.m41573b();
        AbstractC19074t.m100205c(str);
        m41573b.m41556r0(c17945a0, str);
        if (c17945a0.m94847A6()) {
            str2 = "2";
        } else {
            str2 = "1";
        }
        String str3 = str2;
        if (c17945a0.m94847A6()) {
            valueOf = c17945a0.mo95039W2();
        } else {
            valueOf = String.valueOf(i11);
        }
        AbstractC19074t.m100205c(valueOf);
        String mo95039W2 = c17945a0.mo95039W2();
        AbstractC19074t.m100207e(mo95039W2, "getOwnerId(...)");
        String valueOf2 = String.valueOf(i11);
        String m94846A4 = c17945a0.m94846A4();
        AbstractC19074t.m100207e(m94846A4, "getSendMsgEntryPoint(...)");
        C2544s.m12803r(mo95039W2, valueOf, valueOf2, i12, m94846A4, str3, abstractC2531f0, c17945a0.m95029V3().m41045i(), i13);
    }

    /* renamed from: b2 */
    private final int m154017b2(int i11, int i12, int i13) {
        int m116580c;
        int m116584g;
        m116580c = AbstractC22543l.m116580c(i11, i12);
        m116584g = AbstractC22543l.m116584g(m116580c, i13);
        return m116584g;
    }

    /* renamed from: c1 */
    private final JSONObject m154020c1(String str, int i11, List list, List list2) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("action", "msginfo.actionlist");
            JSONObject jSONObject2 = new JSONObject();
            JSONObject jSONObject3 = new JSONObject();
            if (!list.isEmpty()) {
                jSONObject3.put("vi", list.get(0));
                jSONObject3.put("en", list.get(1));
                jSONObject3.put("my", list.get(2));
                jSONObject2.put("msg", jSONObject3);
            }
            jSONObject2.put("iconType", 15);
            if (!list2.isEmpty()) {
                JSONArray jSONArray = new JSONArray();
                JSONObject jSONObject4 = new JSONObject();
                JSONObject jSONObject5 = new JSONObject();
                jSONObject4.put("vi", list2.get(0));
                jSONObject4.put("en", list2.get(1));
                jSONObject4.put("my", list2.get(2));
                jSONObject5.put("actionLabelv2", jSONObject4);
                jSONObject5.put("actionType", str);
                jSONObject5.put("actionColor", i11);
                jSONArray.put(jSONObject5);
                jSONObject2.put("actions", jSONArray);
            }
            jSONObject.put("params", jSONObject2);
        } catch (Exception e11) {
            AbstractC20110a.f98889a.mo104552e(e11);
        }
        return jSONObject;
    }

    /* renamed from: d0 */
    public final boolean m154022d0(boolean z11, String str, int i11, int i12, int i13, long j11) {
        boolean z12;
        C31927g4 m154027f1 = m154027f1(z11, str, i11, i12);
        if (m154027f1 == null) {
            C31927g4 c31927g4 = new C31927g4(z11, str, i11, i12, i13, j11, false, 64, null);
            f147083a.m154063s1().add(c31927g4);
            m154027f1 = c31927g4;
            z12 = true;
        } else if (j11 > 0 && m154027f1.m153395g() > j11) {
            z12 = false;
        } else {
            if (m154027f1.m153393e() == i13 && m154027f1.m153395g() == j11) {
                z12 = false;
            } else {
                z12 = true;
            }
            m154027f1.m153405q(i13);
            m154027f1.m153406r(j11);
        }
        if (z12) {
            if (m154027f1.m153393e() == 5 || m154027f1.m153393e() == 3 || m154027f1.m153393e() == 1) {
                m154027f1.m153403o(false);
            }
            if (m154027f1.m153393e() >= 4) {
                m154027f1.m153402n(true);
            }
            if (m154027f1.m153395g() == j11) {
                C7960e.m41971c6().m42480o(m154027f1, CoreUtility.f89233i);
            }
        }
        return z12;
    }

    /* renamed from: d2 */
    public static final void m154023d2(String str, List list, long j11, long j12) {
        AbstractC19074t.m100208f(str, "$currentUid");
        AbstractC19074t.m100208f(list, "$uids");
        if (!AbstractC19074t.m100204b(str, CoreUtility.f89233i)) {
            return;
        }
        C0766k c0766k = new C0766k();
        c0766k.mo1704o8(new u(str, list, j11, j12));
        c0766k.m1848h0(str, list, j11, j12);
    }

    /* renamed from: e1 */
    private final List m154025e1() {
        return (List) f147086d.getValue();
    }

    /* renamed from: f1 */
    public final C31927g4 m154027f1(boolean z11, String str, int i11, int i12) {
        Object obj;
        Iterator it = m154063s1().iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                if (((C31927g4) obj).m153400l(z11, str, i11, i12)) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        return (C31927g4) obj;
    }

    /* renamed from: f2 */
    public static final void m154028f2(String str, int i11, int i12, List list, long j11) {
        AbstractC19074t.m100208f(str, "$currentUid");
        AbstractC19074t.m100208f(list, "$groupIds");
        if (!AbstractC19074t.m100204b(str, CoreUtility.f89233i)) {
            return;
        }
        C24559a.m127933c("[E2EE]", "Handle cmd 10218 receive friend evict group session | " + i11 + "-" + i12 + " | group:" + list);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String str2 = "group_" + ((Number) it.next()).intValue();
            f147083a.m154007X2(str, true, str2, i11, i12, 1, j11);
            C23744a.Companion.m124119a().m124116d(153, str2, Boolean.FALSE);
        }
    }

    /* renamed from: g0 */
    public static final void m154030g0(String str, String str2, int i11) {
        AbstractC19074t.m100208f(str2, "$threadId");
        if (AbstractC19074t.m100204b(str, CoreUtility.f89233i)) {
            C31986k3 c31986k3 = f147083a;
            if (c31986k3.m154108R1(str2)) {
                C24559a.m127933c("[E2EE]", "addGroupMemberE2ee: " + str2 + " - " + i11);
                long mo124314i = AbstractC23306f.m120579F1().mo124314i();
                AbstractC19074t.m100205c(str);
                m153966H1(c31986k3, str, str2, i11, -1, 2, mo124314i, true, null, 128, null);
            }
        }
    }

    /* renamed from: g1 */
    private final C31927g4 m154031g1(int i11, int i12) {
        Object obj;
        Iterator it = m154063s1().iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                if (((C31927g4) obj).m153400l(false, String.valueOf(i11), i11, i12)) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        return (C31927g4) obj;
    }

    /* renamed from: h1 */
    private final C31927g4 m154033h1(boolean z11, String str, int i11, int i12) {
        Object obj;
        Iterator it = m154063s1().iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                if (((C31927g4) obj).m153400l(z11, str, i11, i12)) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        C31927g4 c31927g4 = (C31927g4) obj;
        if (c31927g4 == null) {
            C31927g4 c31927g42 = new C31927g4(z11, str, i11, i12, 3, 0L, false, 64, null);
            f147083a.m154063s1().add(c31927g42);
            C7960e.m41971c6().m42480o(c31927g42, CoreUtility.f89233i);
            return c31927g42;
        }
        return c31927g4;
    }

    /* renamed from: i0 */
    public static /* synthetic */ void m154035i0(C31986k3 c31986k3, EnumC31888da enumC31888da, String str, String str2, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            str2 = null;
        }
        c31986k3.m154129h0(enumC31888da, str, str2);
    }

    /* renamed from: i1 */
    public final Map m154036i1() {
        Object value = f147093k.getValue();
        AbstractC19074t.m100207e(value, "getValue(...)");
        return (Map) value;
    }

    /* renamed from: i2 */
    public static final void m154037i2(String str) {
        List m131195U;
        AbstractC19074t.m100208f(str, "$currentUid");
        List m154040j1 = f147083a.m154040j1();
        if (!m154040j1.isEmpty()) {
            m131195U = AbstractC25332a0.m131195U(m154040j1, 20);
            Iterator it = m131195U.iterator();
            while (it.hasNext()) {
                C29628e.m147249E0().m147289r1((List) it.next());
            }
            f147083a.m153985P2(str, true);
        }
    }

    /* renamed from: j0 */
    public static final void m154039j0(C29593i c29593i, String str, C17945a0 c17945a0) {
        AbstractC19074t.m100208f(c29593i, "$insertMsgUseCase");
        AbstractC19074t.m100208f(str, "$threadId");
        AbstractC19074t.m100208f(c17945a0, "$msgInfo");
        AbstractC19378b.m101499c(c29593i, new C29593i.a(str, c17945a0, null, null, false, 28, null), null, 2, null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x006b, code lost:            r5 = qm0.AbstractC25332a0.m131187O0(r5);     */
    /* renamed from: j1 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final List m154040j1() {
        List m131499w;
        List m131177E0;
        int m131511r;
        C24860q c24860q;
        List m131187O0;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        C0943w c0943w = C0943w.f3447a;
        Collection m4475i = c0943w.m4475i();
        if (m4475i.isEmpty()) {
            m4475i = c0943w.m4474h();
        }
        ArrayList<C31973j5> arrayList = new ArrayList();
        for (Object obj : m4475i) {
            if (f147083a.m154108R1(((C31973j5) obj).m153730N())) {
                arrayList.add(obj);
            }
        }
        ArrayList<C24860q> arrayList2 = new ArrayList();
        for (C31973j5 c31973j5 : arrayList) {
            C32076q5 m4476k = C0943w.f3447a.m4476k(c31973j5.m153730N());
            if (m4476k != null && (r5 = m4476k.m154718g()) != null && m131187O0 != null) {
                m131187O0.remove(CoreUtility.f89233i);
                c24860q = AbstractC24866w.m129235a(c31973j5.m153781r(), m131187O0);
            } else {
                c24860q = null;
            }
            if (c24860q != null) {
                arrayList2.add(c24860q);
            }
        }
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            for (String str : (List) ((C24860q) it.next()).m129214b()) {
                Object obj2 = linkedHashMap.get(str);
                if (obj2 == null) {
                    obj2 = 0;
                }
                linkedHashMap.put(str, Integer.valueOf(((Number) obj2).intValue() + 1));
            }
        }
        for (C24860q c24860q2 : arrayList2) {
            String str2 = (String) c24860q2.m129213a();
            int i11 = 0;
            for (String str3 : (List) c24860q2.m129214b()) {
                Object obj3 = linkedHashMap.get(str3);
                if (obj3 == null) {
                    obj3 = 1;
                    linkedHashMap.put(str3, obj3);
                }
                i11 += ((Number) obj3).intValue();
            }
            linkedHashMap2.put(str2, Integer.valueOf(i11));
        }
        m131499w = AbstractC25367r0.m131499w(linkedHashMap2);
        m131177E0 = AbstractC25332a0.m131177E0(m131499w, new m());
        List list = m131177E0;
        m131511r = AbstractC25370t.m131511r(list, 10);
        ArrayList arrayList3 = new ArrayList(m131511r);
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            arrayList3.add(Integer.valueOf(Integer.parseInt((String) ((C24860q) it2.next()).m129215c())));
        }
        return arrayList3;
    }

    /* renamed from: k1 */
    private final Handler m154042k1() {
        return (Handler) f147088f.getValue();
    }

    /* renamed from: k2 */
    public static final void m154043k2(String str, String str2, int i11, int i12, int i13, long j11, String str3, List list) {
        C31927g4 c31927g4;
        boolean z11;
        AbstractC19074t.m100208f(str, "$currentUid");
        AbstractC19074t.m100208f(str2, "$threadId");
        AbstractC19074t.m100208f(str3, "$dataResponse");
        if (!AbstractC19074t.m100204b(CoreUtility.f89233i, str)) {
            return;
        }
        boolean m100204b = AbstractC19074t.m100204b(str2, str);
        if (!m100204b) {
            c31927g4 = f147083a.m154138p1(str2);
        } else {
            c31927g4 = null;
        }
        C31927g4 c31927g42 = c31927g4;
        if (c31927g42 != null && c31927g42.m153395g() > j11 && c31927g42.m153393e() == 0) {
            z11 = false;
        } else {
            z11 = true;
        }
        if (i11 == 0 && z11) {
            C24559a.m127933c("[E2EE]", "Nhận init E2EE 11 SUCCESS: threadId: " + str2 + " | uid: " + i12 + " | deviceId: " + i13 + " | errorCode: 0");
            C0766k c0766k = new C0766k();
            c0766k.mo1704o8(new v(str, str2, i12, i13, j11, m100204b, list, c31927g42));
            c0766k.m1866r0(i12, i13, true, j11, Base64.decode(str3, 0));
            return;
        }
        C24559a.m127933c("[E2EE]", "Nhận init E2EE 11 FAILED: threadId: " + str2 + " | uid: " + i12 + " | deviceId: " + i13 + " | errorCode: " + i11);
        new C0766k().m1866r0(i12, i13, false, j11, AbstractC17522a.m93344g(C29628e.m147249E0().m93424r()));
        f147085c.mo13474a(new Runnable() { // from class: zh.p2

            /* renamed from: p */
            public final /* synthetic */ String f147611p;

            /* renamed from: q */
            public final /* synthetic */ String f147612q;

            /* renamed from: r */
            public final /* synthetic */ int f147613r;

            /* renamed from: s */
            public final /* synthetic */ int f147614s;

            /* renamed from: t */
            public final /* synthetic */ long f147615t;

            public /* synthetic */ RunnableC32059p2(String str4, String str22, int i122, int i132, long j112) {
                r1 = str4;
                r2 = str22;
                r3 = i122;
                r4 = i132;
                r5 = j112;
            }

            @Override // java.lang.Runnable
            public final void run() {
                C31986k3.m154046l2(r1, r2, r3, r4, r5);
            }
        });
    }

    /* renamed from: l1 */
    private final EnumC31882d4 m154045l1() {
        return EnumC31882d4.Companion.m153208a(C19172a.m100600k("features@e2ee@incognito", EnumC31882d4.f146443q.m153207c()));
    }

    /* renamed from: l2 */
    public static final void m154046l2(String str, String str2, int i11, int i12, long j11) {
        AbstractC19074t.m100208f(str, "$currentUid");
        AbstractC19074t.m100208f(str2, "$threadId");
        if (!AbstractC19074t.m100204b(CoreUtility.f89233i, str)) {
            return;
        }
        f147083a.m154022d0(false, str2, i11, i12, 5, j11);
    }

    /* renamed from: m0 */
    public static final void m154048m0() {
        Object m131543E;
        try {
            ArrayList arrayList = new ArrayList();
            while (true) {
                C31986k3 c31986k3 = f147083a;
                AbstractC19074t.m100207e(c31986k3.m154025e1(), "<get-decryptLaterMsgList>(...)");
                if (!r3.isEmpty()) {
                    List m154025e1 = c31986k3.m154025e1();
                    AbstractC19074t.m100207e(m154025e1, "<get-decryptLaterMsgList>(...)");
                    m131543E = AbstractC25378x.m131543E(m154025e1);
                    arrayList.add((C31837a4) m131543E);
                } else {
                    C18980w m120727y = AbstractC23306f.m120727y();
                    String str = CoreUtility.f89233i;
                    AbstractC19074t.m100207e(str, "currentUserUid");
                    m120727y.m99607T(str, arrayList);
                    return;
                }
            }
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    /* renamed from: m1 */
    public final HashMap m154049m1() {
        return (HashMap) f147091i.getValue();
    }

    /* renamed from: n1 */
    public final HashMap m154051n1() {
        return (HashMap) f147092j.getValue();
    }

    /* renamed from: n2 */
    public static final void m154052n2(String str, String str2, int i11, int i12, long j11, int i13) {
        C31986k3 c31986k3;
        C31927g4 m154027f1;
        boolean z11;
        boolean m154007X2;
        boolean z12;
        AbstractC19074t.m100208f(str, "$currentUid");
        AbstractC19074t.m100208f(str2, "$threadId");
        if (AbstractC19074t.m100204b(CoreUtility.f89233i, str) && (m154027f1 = (c31986k3 = f147083a).m154027f1(false, str2, i11, i12)) != null && m154027f1.m153395g() <= j11 && m154027f1.m153393e() == 4) {
            int m154140q1 = c31986k3.m154140q1(str2);
            if (m154140q1 != 6 && m154140q1 != 5) {
                z11 = false;
            } else {
                z11 = true;
            }
            if (i13 == 0) {
                m154007X2 = c31986k3.m154007X2(str, false, str2, i11, i12, 6, j11);
                if (m154007X2 && m154140q1 != 5 && !AbstractC19074t.m100204b(str2, str)) {
                    c31986k3.m154007X2(str, false, str2, i11, -1, 6, j11);
                    if (!z11) {
                        m154035i0(c31986k3, EnumC31888da.f146476p, str2, null, 4, null);
                    }
                }
            } else {
                m154007X2 = c31986k3.m154007X2(str, false, str2, i11, i12, 1, j11);
                if (m154007X2 && !z11 && !AbstractC19074t.m100204b(str2, str)) {
                    if (m154140q1 == 1) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    if (!c31986k3.m154086B1(str2)) {
                        c31986k3.m154007X2(str, false, str2, i11, -1, 1, j11);
                        C31879d1 m153254a = C31894e1.f146524a.m153254a(str2);
                        if (m153254a.m153191c() != 1 && m153254a.m153191c() != 2) {
                            m153254a.m153200m(1);
                            m153254a.m153199k();
                        }
                        if (!z12 && c31986k3.m154140q1(str2) == 1 && !c31986k3.m154106Q1()) {
                            m154035i0(c31986k3, EnumC31888da.f146478r, str2, null, 4, null);
                        }
                        c31986k3.m154096J2(Integer.parseInt(str), str2, i12, 3, false, j11, new w(str2, str, i12, j11));
                    } else {
                        AbstractC19444a.m101694b(new Runnable() { // from class: zh.k2

                            /* renamed from: p */
                            public final /* synthetic */ String f147080p;

                            /* renamed from: q */
                            public final /* synthetic */ int f147081q;

                            /* renamed from: r */
                            public final /* synthetic */ long f147082r;

                            public /* synthetic */ RunnableC31985k2(String str22, int i122, long j112) {
                                r1 = str22;
                                r2 = i122;
                                r3 = j112;
                            }

                            @Override // java.lang.Runnable
                            public final void run() {
                                C31986k3.m154054o2(r1, r2, r3);
                            }
                        }, 500L);
                    }
                }
            }
            if (m154007X2) {
                C23744a.Companion.m124119a().m124116d(152, str22, 0);
            }
        }
    }

    /* renamed from: o2 */
    public static final void m154054o2(String str, int i11, long j11) {
        AbstractC19074t.m100208f(str, "$threadId");
        C31986k3 c31986k3 = f147083a;
        if (c31986k3.m154086B1(str)) {
            c31986k3.m154104P0(str, i11, 3, j11);
        }
    }

    /* renamed from: p0 */
    public static final void m154056p0(boolean z11, String str, String str2, int i11, int i12, C17945a0 c17945a0) {
        AbstractC19074t.m100208f(str2, "$threadId");
        AbstractC19074t.m100208f(c17945a0, "$chatContent");
        if (z11) {
            C31986k3 c31986k3 = f147083a;
            AbstractC19074t.m100205c(str);
            m153966H1(c31986k3, str, str2, i11, i12, 2, c17945a0.m94974P4(), true, null, 128, null);
        } else {
            C31986k3 c31986k32 = f147083a;
            AbstractC19074t.m100205c(str);
            m153954D1(c31986k32, str, i11, i12, false, false, null, 32, null);
        }
    }

    /* renamed from: q0 */
    public static final void m154058q0(String str, C17945a0 c17945a0, boolean z11, String str2) {
        AbstractC19074t.m100208f(str, "$threadId");
        AbstractC19074t.m100208f(c17945a0, "$chatContent");
        f147085c.mo13474a(new Runnable() { // from class: zh.d3

            /* renamed from: p */
            public final /* synthetic */ String f146439p;

            /* renamed from: q */
            public final /* synthetic */ C17945a0 f146440q;

            /* renamed from: r */
            public final /* synthetic */ boolean f146441r;

            /* renamed from: s */
            public final /* synthetic */ String f146442s;

            public /* synthetic */ RunnableC31881d3(String str3, C17945a0 c17945a02, boolean z112, String str22) {
                r1 = str3;
                r2 = c17945a02;
                r3 = z112;
                r4 = str22;
            }

            @Override // java.lang.Runnable
            public final void run() {
                C31986k3.m154061r0(r1, r2, r3, r4);
            }
        });
    }

    /* renamed from: q2 */
    public static final void m154059q2(String str, String str2, int i11, int i12, int i13, long j11, int i14) {
        int i15;
        AbstractC19074t.m100208f(str, "$currentUid");
        AbstractC19074t.m100208f(str2, "$threadId");
        if (!AbstractC19074t.m100204b(CoreUtility.f89233i, str)) {
            return;
        }
        C31986k3 c31986k3 = f147083a;
        boolean m154108R1 = c31986k3.m154108R1(str2);
        if (i11 == 0) {
            C31927g4 m154027f1 = c31986k3.m154027f1(true, str2, i12, i13);
            if (m154027f1 == null || m154027f1.m153395g() <= j11) {
                if (!m154108R1) {
                    c31986k3.m154022d0(true, str2, 0, -1, 5, j11);
                } else {
                    if (i14 == 2) {
                        i15 = 6;
                    } else {
                        i15 = 4;
                    }
                    c31986k3.m154022d0(true, str2, i12, i13, i15, j11);
                }
                if (i14 == 0) {
                    m154035i0(c31986k3, EnumC31888da.f146476p, str2, null, 4, null);
                }
                if (i14 == 0 || i14 == 1) {
                    String substring = str2.substring(6);
                    AbstractC19074t.m100207e(substring, "substring(...)");
                    if (C0943w.f3447a.m4472f(String.valueOf(Integer.parseInt(substring))) != null) {
                        if (i14 != 0) {
                            if (i14 == 1) {
                                m153966H1(c31986k3, str, str2, i12, i13, 2, j11, true, null, 128, null);
                            }
                        } else {
                            m153961F1(c31986k3, str, str2, 2, false, null, 24, null);
                        }
                    }
                }
            } else {
                return;
            }
        } else {
            boolean m154022d0 = c31986k3.m154022d0(true, str2, i12, i13, 1, j11);
            if (m154022d0) {
                if (!m154108R1 || i14 == 0) {
                    c31986k3.m154022d0(true, str2, i12, i13, 5, j11);
                }
                C0766k c0766k = new C0766k();
                c0766k.mo1704o8(new x());
                c0766k.m1868s0(Integer.parseInt(AbstractC25495a.m132088m(str2)), i12, i13, i11, j11);
            }
            if (!m154022d0) {
                return;
            }
        }
        C23744a.Companion.m124119a().m124116d(152, str2, 0);
    }

    /* renamed from: r0 */
    public static final void m154061r0(String str, C17945a0 c17945a0, boolean z11, String str2) {
        boolean z12;
        long j11;
        int i11;
        AbstractC19074t.m100208f(str, "$threadId");
        AbstractC19074t.m100208f(c17945a0, "$chatContent");
        C31986k3 c31986k3 = f147083a;
        C31927g4 m154138p1 = c31986k3.m154138p1(str);
        int i12 = 0;
        Integer num = 0;
        if (m154138p1 != null && m154138p1.m153393e() >= 4) {
            z12 = true;
        } else {
            z12 = false;
        }
        if (m154138p1 != null) {
            j11 = m154138p1.m153395g();
        } else {
            j11 = 0;
        }
        if (c17945a0.m95170j6() != z12 && c17945a0.m94974P4() > j11) {
            C24559a.m127933c("[E2EE]", "checkE2eeSessionWhenReceivedMsg missing thread: " + str + " | msg.isE2ee=" + c17945a0.m95170j6());
            if (c17945a0.m95170j6()) {
                if (m154138p1 != null) {
                    i12 = m154138p1.m153393e();
                }
                if (i12 != 0 && i12 != 1) {
                    if (!z11 && i12 == 4 && !c17945a0.m95032V6() && c17945a0.m95014T6()) {
                        AbstractC19074t.m100205c(str2);
                        c31986k3.m154007X2(str2, false, str, Integer.parseInt(str), -1, 6, c17945a0.m94974P4());
                        m154035i0(c31986k3, EnumC31888da.f146476p, str, null, 4, null);
                        return;
                    }
                    return;
                }
                if (z11) {
                    if (c31986k3.m154049m1().get(str) == b.f147098r) {
                        C31973j5 m4473g = C0943w.f3447a.m4473g(str);
                        if (m4473g != null && m4473g.m153750a0()) {
                            AbstractC19074t.m100205c(str2);
                            c31986k3.m154084A2(str2, str);
                            return;
                        }
                        return;
                    }
                    if (c31986k3.m154049m1().containsKey(str) && c31986k3.m154049m1().get(str) != b.f147096p) {
                        if (c31986k3.m154049m1().get(str) == b.f147099s) {
                            Integer num2 = (Integer) c31986k3.m154051n1().get(str);
                            if (num2 != null) {
                                num = num2;
                            }
                            if (num.intValue() > 3) {
                                return;
                            }
                        } else {
                            return;
                        }
                    }
                    C24559a.m127933c("[E2EE]", "Double check get Group Info when receive e2ee msg and not found e2ee session: StateGetGroupInfo = " + c31986k3.m154049m1().get(str));
                    c31986k3.m154049m1().put(str, b.f147097q);
                    C19637j.f97466a.m102870w(AbstractC25495a.m132089n(str), new d(str, str2, c17945a0));
                    return;
                }
                AbstractC19074t.m100205c(str2);
                m153954D1(c31986k3, str2, Integer.parseInt(str), -1, false, false, null, 32, null);
                return;
            }
            if (c31986k3.m154108R1(str) && z11) {
                if (AbstractC19074t.m100204b(c17945a0.m94862C4(), CoreUtility.f89233i)) {
                    i11 = 2;
                } else {
                    i11 = 1;
                }
                if (c31986k3.m154049m1().get(str) == b.f147098r) {
                    C31973j5 m4473g2 = C0943w.f3447a.m4473g(str);
                    if (m4473g2 != null && !m4473g2.m153750a0()) {
                        String str3 = CoreUtility.f89233i;
                        AbstractC19074t.m100207e(str3, "currentUserUid");
                        c31986k3.m154107R0(str3, str, i11, C23793c.Companion.m124321a().mo124308a());
                        return;
                    }
                    return;
                }
                if (c31986k3.m154049m1().containsKey(str) && c31986k3.m154049m1().get(str) != b.f147096p) {
                    if (c31986k3.m154049m1().get(str) == b.f147099s) {
                        Integer num3 = (Integer) c31986k3.m154051n1().get(str);
                        if (num3 != null) {
                            num = num3;
                        }
                        if (num.intValue() > 3) {
                            return;
                        }
                    } else {
                        return;
                    }
                }
                C24559a.m127933c("[E2EE]", "Double check get Group Info when receive non-e2ee msg and found e2ee session: StateGetGroupInfo = " + c31986k3.m154049m1().get(str));
                c31986k3.m154049m1().put(str, b.f147097q);
                C19637j.f97466a.m102870w(AbstractC25495a.m132089n(str), new e(str, str2, i11));
            }
        }
    }

    /* renamed from: s1 */
    public final CopyOnWriteArrayList m154063s1() {
        return (CopyOnWriteArrayList) f147084b.getValue();
    }

    /* renamed from: s2 */
    public static final void m154064s2(String str, int i11, long j11) {
        long j12;
        AbstractC19074t.m100208f(str, "$currentUid");
        if (AbstractC19074t.m100204b(CoreUtility.f89233i, str) && !AbstractC19074t.m100204b(String.valueOf(i11), CoreUtility.f89233i)) {
            C24559a.m127933c("[E2EE]", "onReceivedEnableE2ee11FromMyDevice: " + i11);
            C31986k3 c31986k3 = f147083a;
            C31927g4 m154138p1 = c31986k3.m154138p1(String.valueOf(i11));
            if (m154138p1 != null) {
                j12 = m154138p1.m153395g();
            } else {
                j12 = 0;
            }
            if (j12 <= j11) {
                m153954D1(c31986k3, str, i11, -1, false, false, null, 32, null);
            }
        }
    }

    /* renamed from: t0 */
    public static /* synthetic */ boolean m154066t0(C31986k3 c31986k3, String str, boolean z11, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            z11 = false;
        }
        return c31986k3.m154143s0(str, z11);
    }

    /* renamed from: t1 */
    private final void m154067t1(String str, String str2) {
        f147085c.mo13474a(new Runnable() { // from class: zh.v2

            /* renamed from: p */
            public final /* synthetic */ String f148241p;

            /* renamed from: q */
            public final /* synthetic */ String f148242q;

            public /* synthetic */ RunnableC32143v2(String str3, String str22) {
                r1 = str3;
                r2 = str22;
            }

            @Override // java.lang.Runnable
            public final void run() {
                C31986k3.m154070u1(r1, r2);
            }
        });
    }

    /* renamed from: u0 */
    public static final void m154069u0(boolean z11, C31927g4 c31927g4, String str, String str2, boolean z12) {
        boolean z13;
        int i11;
        AbstractC19074t.m100208f(str2, "$threadId");
        if (z11) {
            if (c31927g4.m153393e() == 3) {
                i11 = 0;
            } else {
                i11 = 1;
            }
            C31986k3 c31986k3 = f147083a;
            AbstractC19074t.m100205c(str);
            m153961F1(c31986k3, str, str2, i11, z12, null, 16, null);
            return;
        }
        if (c31927g4.m153393e() == 3) {
            z13 = true;
        } else {
            z13 = false;
        }
        C31986k3 c31986k32 = f147083a;
        AbstractC19074t.m100205c(str);
        m153954D1(c31986k32, str, c31927g4.m153396h(), c31927g4.m153390b(), z13, false, null, 32, null);
    }

    /* renamed from: u1 */
    public static final void m154070u1(String str, String str2) {
        C31986k3 c31986k3;
        C31927g4 m154027f1;
        AbstractC19074t.m100208f(str, "$currentUid");
        AbstractC19074t.m100208f(str2, "$threadId");
        if (AbstractC19074t.m100204b(str, CoreUtility.f89233i) && (m154027f1 = (c31986k3 = f147083a).m154027f1(true, str2, 0, -1)) != null && m154027f1.m153393e() == 6) {
            C24559a.m127933c("[E2EE]", "handleForceReInitGroupWithNewGroupKey thread: " + str2);
            c31986k3.m153990R2(str, str2);
            C29628e.m147249E0().m93390R(Integer.parseInt(AbstractC25495a.m132089n(str2)), true);
            m153961F1(c31986k3, str, str2, 2, false, null, 16, null);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v6 */
    /* JADX WARN: Type inference failed for: r14v7, types: [boolean] */
    /* JADX WARN: Type inference failed for: r14v8 */
    /* renamed from: u2 */
    public static final void m154071u2(String str, int i11, int i12, boolean z11, long j11) {
        C31927g4 m154138p1;
        ?? r14;
        boolean m132079d;
        C31927g4 m154027f1;
        AbstractC19074t.m100204b(str, CoreUtility.f89233i);
        boolean m100204b = AbstractC19074t.m100204b(String.valueOf(i11), CoreUtility.f89233i);
        if (m100204b && i12 == 0) {
            return;
        }
        int i13 = 4;
        boolean z12 = true;
        if (!z11) {
            HashSet<String> hashSet = new HashSet();
            if (!m100204b) {
                for (C31927g4 c31927g4 : f147083a.m154063s1()) {
                    if (c31927g4.m153396h() == i11 && c31927g4.m153395g() + 15000 < j11 && c31927g4.m153393e() != 0 && c31927g4.m153393e() != 4) {
                        hashSet.add(c31927g4.m153394f());
                    }
                }
                CopyOnWriteArrayList<C31927g4> m154063s1 = f147083a.m154063s1();
                if (!(m154063s1 instanceof Collection) || !m154063s1.isEmpty()) {
                    for (C31927g4 c31927g42 : m154063s1) {
                        if (c31927g42.m153396h() == i11 && c31927g42.m153390b() == i12 && ((c31927g42.m153395g() + 15000 >= j11 && (c31927g42.m153393e() == 6 || c31927g42.m153393e() == 4)) || c31927g42.m153399k())) {
                            break;
                        }
                    }
                }
                C31927g4 m154031g1 = f147083a.m154031g1(i11, i12);
                if (m154031g1 != null) {
                    m154031g1.m153403o(false);
                }
                C29628e.m147249E0().m93386N(i11, i12);
                r14 = 0;
            } else {
                C31986k3 c31986k3 = f147083a;
                r14 = 0;
                c31986k3.m154022d0(false, String.valueOf(i11), i11, i12, 6, j11);
                for (C31927g4 c31927g43 : c31986k3.m154063s1()) {
                    if (c31927g43.m153397i() && c31927g43.m153395g() <= j11 && c31927g43.m153393e() != 0) {
                        hashSet.add(c31927g43.m153394f());
                    }
                }
            }
            if (!hashSet.isEmpty()) {
                for (String str2 : hashSet) {
                    C31986k3 c31986k32 = f147083a;
                    if (c31986k32.m154108R1(str2) && ((m154027f1 = c31986k32.m154027f1((m132079d = AbstractC25495a.m132079d(str2)), str2, i11, i12)) == 0 || m154027f1.m153399k() != z12)) {
                        c31986k32.m154022d0(m132079d, str2, i11, i12, 3, j11);
                        if (m154027f1 != 0) {
                            m154027f1.m153403o(r14);
                        }
                        C23744a m124119a = C23744a.Companion.m124119a();
                        Object[] objArr = new Object[2];
                        objArr[r14] = str2;
                        z12 = true;
                        objArr[1] = Boolean.FALSE;
                        m124119a.m124116d(153, objArr);
                    }
                }
                return;
            }
            return;
        }
        CopyOnWriteArrayList m154063s12 = f147083a.m154063s1();
        ArrayList<C31927g4> arrayList = new ArrayList();
        for (Object obj : m154063s12) {
            C31927g4 c31927g44 = (C31927g4) obj;
            if (c31927g44.m153396h() == i11 && c31927g44.m153390b() == i12 && c31927g44.m153395g() <= j11 && c31927g44.m153393e() != 0) {
                arrayList.add(obj);
            }
        }
        for (C31927g4 c31927g45 : arrayList) {
            boolean z13 = c31927g45.m153393e() == i13;
            C31986k3 c31986k33 = f147083a;
            String str3 = CoreUtility.f89233i;
            AbstractC19074t.m100207e(str3, "currentUserUid");
            c31986k33.m154007X2(str3, c31927g45.m153397i(), c31927g45.m153394f(), i11, i12, 0, j11);
            if (!AbstractC25495a.m132079d(c31927g45.m153394f()) && (m154138p1 = c31986k33.m154138p1(c31927g45.m153394f())) != null) {
                if (m154138p1.m153393e() != 6 && m154138p1.m153393e() != 5) {
                    if (!c31986k33.m154106Q1() && !c31986k33.m154086B1(c31927g45.m153394f())) {
                        String str4 = CoreUtility.f89233i;
                        AbstractC19074t.m100207e(str4, "currentUserUid");
                        c31986k33.m154004W2(str4, m154138p1, 0, j11);
                        if (z13) {
                            C31879d1 m153254a = C31894e1.f146524a.m153254a(c31927g45.m153394f());
                            if (m153254a.m153191c() != 2) {
                                m153254a.m153200m(2);
                                m153254a.m153199k();
                            }
                            c31986k33.m154129h0(EnumC31888da.f146477q, c31927g45.m153394f(), String.valueOf(i11));
                            C23744a.Companion.m124119a().m124116d(152, c31927g45.m153394f(), -3);
                        }
                        AbstractC19074t.m100205c(str);
                        c31986k33.m154096J2(Integer.parseInt(str), c31927g45.m153394f(), i12, 4, false, j11, new y(c31927g45, str, i12, j11));
                    } else if (!c31986k33.m154106Q1()) {
                        AbstractC19444a.m101694b(new Runnable() { // from class: zh.n2

                            /* renamed from: q */
                            public final /* synthetic */ int f147489q;

                            /* renamed from: r */
                            public final /* synthetic */ long f147490r;

                            public /* synthetic */ RunnableC32030n2(int i122, long j112) {
                                r2 = i122;
                                r3 = j112;
                            }

                            @Override // java.lang.Runnable
                            public final void run() {
                                C31986k3.m154074v2(C31927g4.this, r2, r3);
                            }
                        }, 500L);
                    }
                } else if (m154138p1.m153393e() == 6 && !c31986k33.m154086B1(c31927g45.m153394f())) {
                    String str5 = CoreUtility.f89233i;
                    AbstractC19074t.m100207e(str5, "currentUserUid");
                    c31986k33.m154004W2(str5, m154138p1, 5, j112);
                }
            }
            i13 = 4;
        }
        CopyOnWriteArrayList<C31927g4> m154063s13 = f147083a.m154063s1();
        if (!(m154063s13 instanceof Collection) || !m154063s13.isEmpty()) {
            for (C31927g4 c31927g46 : m154063s13) {
                if (c31927g46.m153396h() == i11 && c31927g46.m153395g() >= j112) {
                    if (c31927g46.m153393e() == 6 || c31927g46.m153393e() == 4) {
                        return;
                    }
                }
            }
        }
        C29628e.m147249E0().m93386N(i11, i122);
    }

    /* renamed from: v0 */
    public static final void m154073v0(boolean z11, C31927g4 c31927g4, String str, String str2) {
        int i11;
        AbstractC19074t.m100208f(str2, "$threadId");
        if (z11) {
            if (c31927g4.m153393e() == 4) {
                i11 = 2;
            } else {
                i11 = 1;
            }
            C31986k3 c31986k3 = f147083a;
            AbstractC19074t.m100205c(str);
            m153966H1(c31986k3, str, str2, c31927g4.m153396h(), c31927g4.m153390b(), i11, c31927g4.m153395g(), true, null, 128, null);
            return;
        }
        C31986k3 c31986k32 = f147083a;
        AbstractC19074t.m100205c(str);
        m153954D1(c31986k32, str, c31927g4.m153396h(), c31927g4.m153390b(), false, false, null, 32, null);
    }

    /* renamed from: v2 */
    public static final void m154074v2(C31927g4 c31927g4, int i11, long j11) {
        C31986k3 c31986k3 = f147083a;
        if (c31986k3.m154140q1(c31927g4.m153394f()) != 6) {
            c31986k3.m154104P0(c31927g4.m153394f(), i11, 4, j11);
        }
    }

    /* renamed from: w0 */
    public static final void m154076w0(String str, String str2) {
        AbstractC19074t.m100208f(str2, "$threadId");
        C31986k3 c31986k3 = f147083a;
        AbstractC19074t.m100205c(str);
        m153954D1(c31986k3, str, Integer.parseInt(str2), -1, true, true, null, 32, null);
    }

    /* renamed from: x1 */
    public static final void m154078x1(String str, boolean z11, boolean z12, String str2, int i11, int i12, long j11, C19051f0 c19051f0, C17945a0 c17945a0, C31852b4 c31852b4, C31832a.b bVar) {
        AbstractC19074t.m100208f(str2, "$ownerId");
        AbstractC19074t.m100208f(c19051f0, "$needReSend");
        AbstractC19074t.m100208f(c31852b4, "$client");
        AbstractC19074t.m100208f(bVar, "$ackMsgInfo");
        f147085c.mo13474a(new Runnable() { // from class: zh.w2

            /* renamed from: p */
            public final /* synthetic */ String f148270p;

            /* renamed from: q */
            public final /* synthetic */ boolean f148271q;

            /* renamed from: r */
            public final /* synthetic */ boolean f148272r;

            /* renamed from: s */
            public final /* synthetic */ String f148273s;

            /* renamed from: t */
            public final /* synthetic */ int f148274t;

            /* renamed from: u */
            public final /* synthetic */ int f148275u;

            /* renamed from: v */
            public final /* synthetic */ long f148276v;

            /* renamed from: w */
            public final /* synthetic */ C19051f0 f148277w;

            /* renamed from: x */
            public final /* synthetic */ C17945a0 f148278x;

            /* renamed from: y */
            public final /* synthetic */ C31852b4 f148279y;

            /* renamed from: z */
            public final /* synthetic */ C31832a.b f148280z;

            public /* synthetic */ RunnableC32157w2(String str3, boolean z112, boolean z122, String str22, int i112, int i122, long j112, C19051f0 c19051f02, C17945a0 c17945a02, C31852b4 c31852b42, C31832a.b bVar2) {
                r1 = str3;
                r2 = z112;
                r3 = z122;
                r4 = str22;
                r5 = i112;
                r6 = i122;
                r7 = j112;
                r9 = c19051f02;
                r10 = c17945a02;
                r11 = c31852b42;
                r12 = bVar2;
            }

            @Override // java.lang.Runnable
            public final void run() {
                C31986k3.m154081y1(r1, r2, r3, r4, r5, r6, r7, r9, r10, r11, r12);
            }
        });
    }

    /* renamed from: x2 */
    public static final void m154079x2(String str, int i11, String str2, int i12, int i13, long j11) {
        AbstractC19074t.m100208f(str, "$currentUid");
        AbstractC19074t.m100208f(str2, "$threadId");
        if (AbstractC19074t.m100204b(CoreUtility.f89233i, str) && i11 != 0) {
            C31986k3 c31986k3 = f147083a;
            C31927g4 m154027f1 = c31986k3.m154027f1(true, str2, i12, i13);
            if (m154027f1 != null && m154027f1.m153395g() <= j11) {
                C24559a.m127933c("[E2EE]", "Nhận 10217: " + str2 + " | uid: " + i12 + " | deviceId: " + i13 + " | errorCode: " + i11);
                C31927g4 m154027f12 = c31986k3.m154027f1(false, String.valueOf(i12), i12, i13);
                if (m154027f12 == null || m154027f12.m153395g() <= j11 || (m154027f12.m153393e() != 6 && m154027f12.m153393e() != 4)) {
                    C24559a.m127933c("[E2EE]", "Nhận 10217: Removed key 11");
                    C29628e.m147249E0().m93386N(i12, i13);
                    if (m154027f12 != null) {
                        m154027f12.m153403o(false);
                    }
                }
                c31986k3.m154022d0(true, str2, i12, i13, 1, j11);
                C23744a.Companion.m124119a().m124116d(153, str2, Boolean.FALSE);
                return;
            }
            C24559a.m127933c("[E2EE]", "Nhận 10217 SKIPPED: " + str2 + " | uid: " + i12 + " | deviceId: " + i13 + " | errorCode: " + i11);
        }
    }

    /* renamed from: y1 */
    public static final void m154081y1(String str, boolean z11, boolean z12, String str2, int i11, int i12, long j11, C19051f0 c19051f0, C17945a0 c17945a0, C31852b4 c31852b4, C31832a.b bVar) {
        String valueOf;
        long j12;
        int i13;
        AbstractC19074t.m100208f(str2, "$ownerId");
        AbstractC19074t.m100208f(c19051f0, "$needReSend");
        AbstractC19074t.m100208f(c31852b4, "$client");
        AbstractC19074t.m100208f(bVar, "$ackMsgInfo");
        AbstractC19074t.m100204b(str, CoreUtility.f89233i);
        if (z11) {
            C31986k3 c31986k3 = f147083a;
            if (z12) {
                valueOf = str2;
            } else {
                valueOf = String.valueOf(i11);
            }
            C31927g4 m154027f1 = c31986k3.m154027f1(z12, valueOf, i11, i12);
            if (m154027f1 != null) {
                j12 = m154027f1.m153395g();
            } else {
                j12 = 0;
            }
            if ((j11 <= j12 || AbstractC23306f.m120579F1().mo124314i() - j12 <= 60000) && ((m154027f1 != null && m154027f1.m153398j()) || (m154027f1 != null && m154027f1.m153399k()))) {
                C24559a.m127933c("[E2EE]", "RE-INIT SKIPPED uid=" + i11 + " | deviceId=" + i12);
            } else if (z12) {
                AbstractC19074t.m100205c(str);
                m153966H1(c31986k3, str, str2, i11, i12, 2, j11, true, null, 128, null);
            } else {
                if (c31986k3.m154138p1(String.valueOf(i11)) != null) {
                    i13 = i12;
                } else {
                    i13 = -1;
                }
                AbstractC19074t.m100205c(str);
                m153954D1(c31986k3, str, i11, i13, false, false, null, 32, null);
            }
        }
        if (c19051f0.f94928p) {
            C31986k3 c31986k32 = f147083a;
            AbstractC19074t.m100205c(str);
            c31986k32.m153956E0(str, c17945a0, c31852b4, i11, i12, bVar.f146093i);
        }
    }

    /* renamed from: A1 */
    public final boolean m154083A1(int i11) {
        C29628e m147249E0 = C29628e.m147249E0();
        String str = CoreUtility.f89233i;
        AbstractC19074t.m100207e(str, "currentUserUid");
        return m147249E0.m93396X(Integer.parseInt(str), i11);
    }

    /* renamed from: A2 */
    public final void m154084A2(String str, String str2) {
        AbstractC19074t.m100208f(str, "currentUid");
        AbstractC19074t.m100208f(str2, "threadId");
        f147085c.mo13474a(new Runnable() { // from class: zh.l2

            /* renamed from: p */
            public final /* synthetic */ String f147243p;

            /* renamed from: q */
            public final /* synthetic */ String f147244q;

            public /* synthetic */ RunnableC32000l2(String str3, String str22) {
                r1 = str3;
                r2 = str22;
            }

            @Override // java.lang.Runnable
            public final void run() {
                C31986k3.m153948B2(r1, r2);
            }
        });
    }

    /* renamed from: B0 */
    public final void m154085B0(String str) {
        AbstractC19074t.m100208f(str, "currentUid");
        f147085c.mo13474a(new Runnable() { // from class: zh.e3

            /* renamed from: p */
            public final /* synthetic */ String f146531p;

            public /* synthetic */ RunnableC31896e3(String str2) {
                r1 = str2;
            }

            @Override // java.lang.Runnable
            public final void run() {
                C31986k3.m153950C0(r1);
            }
        });
    }

    /* renamed from: B1 */
    public final boolean m154086B1(String str) {
        AbstractC19074t.m100208f(str, "threadId");
        String str2 = CoreUtility.f89233i;
        AbstractC19074t.m100207e(str2, "currentUserUid");
        int parseInt = Integer.parseInt(str2);
        CopyOnWriteArrayList<C31927g4> m154063s1 = m154063s1();
        if ((m154063s1 instanceof Collection) && m154063s1.isEmpty()) {
            return false;
        }
        for (C31927g4 c31927g4 : m154063s1) {
            if (AbstractC19074t.m100204b(c31927g4.m153394f(), str) && c31927g4.m153396h() != 0 && c31927g4.m153396h() != parseInt && c31927g4.m153390b() != -1 && c31927g4.m153393e() != 0 && c31927g4.m153393e() != 1) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: D0 */
    public final void m154087D0() {
        boolean z11;
        if (m154114W1(false) && (AbstractC0924m0.m3077Gb() || m153975L1())) {
            boolean z12 = !AbstractC0924m0.m3077Gb();
            if (!z12 && AbstractC0924m0.m3805f9()) {
                z11 = true;
            } else {
                z11 = false;
            }
            String str = CoreUtility.f89233i;
            AbstractC19074t.m100207e(str, "currentUserUid");
            m153958E2(this, str, z11, z12, 1, 0, 16, null);
        }
        if (m154114W1(true) && AbstractC0924m0.m3106Hb() && !C19637j.f97466a.m102850i(0) && AbstractC23309i.m122198n7() > 0) {
            String str2 = CoreUtility.f89233i;
            AbstractC19074t.m100207e(str2, "currentUserUid");
            m154085B0(str2);
        }
    }

    /* renamed from: D2 */
    public final void m154088D2(String str, boolean z11, boolean z12, int i11, int i12) {
        AbstractC19074t.m100208f(str, "currentUid");
        f147085c.mo13474a(new Runnable() { // from class: zh.i2

            /* renamed from: p */
            public final /* synthetic */ String f146856p;

            /* renamed from: q */
            public final /* synthetic */ boolean f146857q;

            /* renamed from: r */
            public final /* synthetic */ boolean f146858r;

            /* renamed from: s */
            public final /* synthetic */ int f146859s;

            /* renamed from: t */
            public final /* synthetic */ int f146860t;

            public /* synthetic */ RunnableC31955i2(String str2, boolean z112, boolean z122, int i112, int i122) {
                r1 = str2;
                r2 = z112;
                r3 = z122;
                r4 = i112;
                r5 = i122;
            }

            @Override // java.lang.Runnable
            public final void run() {
                C31986k3.m153962F2(r1, r2, r3, r4, r5);
            }
        });
    }

    /* renamed from: G0 */
    public final void m154089G0() {
        InterfaceC29232g interfaceC29232g = f147084b;
        if (interfaceC29232g.mo9375b()) {
            interfaceC29232g.reset();
        }
        InterfaceC29232g interfaceC29232g2 = f147093k;
        if (interfaceC29232g2.mo9375b()) {
            interfaceC29232g2.reset();
        }
        AbstractC0924m0.m3935jj(0L);
    }

    /* renamed from: G2 */
    public final void m154090G2(String str, int i11) {
        AbstractC19074t.m100208f(str, "threadId");
        f147085c.mo13474a(new Runnable() { // from class: zh.x2

            /* renamed from: p */
            public final /* synthetic */ String f148320p;

            /* renamed from: q */
            public final /* synthetic */ String f148321q;

            /* renamed from: r */
            public final /* synthetic */ int f148322r;

            public /* synthetic */ RunnableC32171x2(String str2, String str3, int i112) {
                r1 = str2;
                r2 = str3;
                r3 = i112;
            }

            @Override // java.lang.Runnable
            public final void run() {
                C31986k3.m153967H2(r1, r2, r3);
            }
        });
    }

    /* renamed from: H0 */
    public final C31867c4 m154091H0(String str, String str2, String str3, int i11, long j11) {
        String str4;
        AbstractC19074t.m100208f(str, "content");
        AbstractC19074t.m100208f(str2, "ownerId");
        AbstractC19074t.m100208f(str3, "senderId");
        Charset charset = C24321d.f117408b;
        byte[] bytes = str.getBytes(charset);
        AbstractC19074t.m100207e(bytes, "getBytes(...)");
        C31867c4 m154092I0 = m154092I0(bytes, str2, str3, i11, j11);
        int m153164b = m154092I0.m153164b();
        byte[] bArr = (byte[]) m154092I0.m153163a();
        if (bArr != null) {
            str4 = new String(bArr, charset);
        } else {
            str4 = null;
        }
        return new C31867c4(m153164b, str4);
    }

    /* renamed from: I0 */
    public final C31867c4 m154092I0(byte[] bArr, String str, String str2, int i11, long j11) {
        AbstractC19074t.m100208f(bArr, "content");
        AbstractC19074t.m100208f(str, "ownerId");
        AbstractC19074t.m100208f(str2, "senderId");
        boolean m132079d = AbstractC25495a.m132079d(str);
        if (m132079d) {
            str = str.substring(6);
            AbstractC19074t.m100207e(str, "substring(...)");
        }
        int parseInt = Integer.parseInt(str);
        int parseInt2 = Integer.parseInt(str2);
        if (m132079d) {
            Pair m93383K = C29628e.m147249E0().m93383K(bArr, parseInt2, i11, parseInt);
            Object obj = m93383K.first;
            AbstractC19074t.m100207e(obj, "first");
            return new C31867c4(((Number) obj).intValue(), m93383K.second);
        }
        Pair m93382J = C29628e.m147249E0().m93382J(bArr, parseInt2, i11, j11);
        Object obj2 = m93382J.first;
        AbstractC19074t.m100207e(obj2, "first");
        return new C31867c4(((Number) obj2).intValue(), m93382J.second);
    }

    /* renamed from: I2 */
    public final String m154093I2(String str, InterfaceC18505l interfaceC18505l) {
        List m127132B0;
        List<String> m127132B02;
        String m131214n0;
        String m127162U0;
        String m127146M0;
        AbstractC19074t.m100208f(str, ZMediaPlayer.OnNativeInvokeListener.ARG_URL);
        AbstractC19074t.m100208f(interfaceC18505l, "onEachParam");
        m127132B0 = AbstractC24342w.m127132B0(str, new String[]{"?"}, false, 0, 6, null);
        if (str.length() < 2) {
            return str;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        m127132B02 = AbstractC24342w.m127132B0((CharSequence) m127132B0.get(1), new String[]{"&"}, false, 0, 6, null);
        for (String str2 : m127132B02) {
            m127162U0 = AbstractC24342w.m127162U0(str2, "=", null, 2, null);
            m127146M0 = AbstractC24342w.m127146M0(str2, "=", null, 2, null);
            linkedHashMap.put(m127162U0, interfaceC18505l.mo205i9(AbstractC24866w.m129235a(m127162U0, m127146M0)));
        }
        Object obj = m127132B0.get(0);
        m131214n0 = AbstractC25332a0.m131214n0(linkedHashMap.entrySet(), "&", "?", null, 0, null, a0.f147095q, 28, null);
        return obj + m131214n0;
    }

    /* renamed from: J0 */
    public final C31867c4 m154094J0(String str, String str2, String str3, int i11, long j11) {
        Integer num;
        AbstractC19074t.m100208f(str, "content");
        AbstractC19074t.m100208f(str2, "ownerId");
        AbstractC19074t.m100208f(str3, "senderId");
        byte[] bytes = str.getBytes(C24321d.f117408b);
        AbstractC19074t.m100207e(bytes, "getBytes(...)");
        C31867c4 m154092I0 = m154092I0(bytes, str2, str3, i11, j11);
        int m153164b = m154092I0.m153164b();
        byte[] bArr = (byte[]) m154092I0.m153163a();
        if (bArr != null) {
            num = Integer.valueOf(AbstractC17522a.m93339b(bArr));
        } else {
            num = null;
        }
        return new C31867c4(m153164b, num);
    }

    /* renamed from: J1 */
    public final void m154095J1(List list) {
        String str = CoreUtility.f89233i;
        if (str.length() != 0 && list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                int intValue = ((Number) it.next()).intValue();
                C29628e m147249E0 = C29628e.m147249E0();
                String str2 = CoreUtility.f89233i;
                AbstractC19074t.m100207e(str2, "currentUserUid");
                if (m147249E0.m93396X(Integer.parseInt(str2), intValue)) {
                    f147085c.mo13474a(new Runnable() { // from class: zh.i3

                        /* renamed from: p */
                        public final /* synthetic */ String f146861p;

                        /* renamed from: q */
                        public final /* synthetic */ int f146862q;

                        public /* synthetic */ RunnableC31956i3(String str3, int intValue2) {
                            r1 = str3;
                            r2 = intValue2;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            C31986k3.m153972K1(r1, r2);
                        }
                    });
                } else {
                    C31986k3 c31986k3 = f147083a;
                    AbstractC19074t.m100205c(str3);
                    m153954D1(c31986k3, str3, Integer.parseInt(str3), intValue2, false, false, null, 32, null);
                }
            }
        }
    }

    /* renamed from: J2 */
    public final void m154096J2(int i11, String str, int i12, int i13, boolean z11, long j11, InterfaceC20094a interfaceC20094a) {
        AbstractC19074t.m100208f(str, "threadId");
        if (AbstractC25495a.m132079d(str)) {
            C0757b c0757b = new C0757b();
            c0757b.m1341j(interfaceC20094a);
            c0757b.m1346m(Integer.parseInt(AbstractC25495a.m132089n(str)), C29628e.m147249E0().m93424r(), i13, z11);
        } else {
            C0766k c0766k = new C0766k();
            c0766k.mo1704o8(interfaceC20094a);
            c0766k.m1874v0(i11, Integer.parseInt(AbstractC25495a.m132089n(str)), i12, C29628e.m147249E0().m93424r(), i13, z11, j11);
        }
    }

    /* renamed from: K0 */
    public final C31867c4 m154097K0(String str, String str2, String str3, int i11, long j11) {
        String m127146M0;
        boolean m127149O;
        String m127146M02;
        String m127162U0;
        AbstractC19074t.m100208f(str, ZMediaPlayer.OnNativeInvokeListener.ARG_URL);
        AbstractC19074t.m100208f(str2, "ownerId");
        AbstractC19074t.m100208f(str3, "senderId");
        if (str.length() == 0) {
            return new C31867c4(0, str);
        }
        String str4 = null;
        m127146M0 = AbstractC24342w.m127146M0(str, "?", null, 2, null);
        m127149O = AbstractC24342w.m127149O(m127146M0, "e2esession", false, 2, null);
        if (m127149O) {
            m127146M02 = AbstractC24342w.m127146M0(m127146M0, "e2esession=", null, 2, null);
            m127162U0 = AbstractC24342w.m127162U0(m127146M02, "&", null, 2, null);
            C31867c4 m154091H0 = m154091H0(m127162U0, str2, str3, i11, j11);
            String str5 = (String) m154091H0.m153163a();
            if (str5 != null) {
                str4 = f147083a.m154093I2(str, new h("e2esession", str5));
            }
            return new C31867c4(m154091H0.m153164b(), str4);
        }
        return m154091H0(str, str2, str3, i11, j11);
    }

    /* renamed from: K2 */
    public final boolean m154098K2(String str) {
        AbstractC19074t.m100208f(str, "threadId");
        Long l11 = (Long) m154036i1().get(str);
        if (l11 == null || l11.longValue() <= AbstractC23306f.m120579F1().mo124314i()) {
            return true;
        }
        return false;
    }

    /* renamed from: L2 */
    public final void m154099L2(int i11, int i12) {
        AbstractC0924m0.m3023Ef(m154017b2(i11, ZAbstractBase.ZVU_PROCESS_FLUSH, 50000));
        AbstractC0924m0.m3052Ff(m154017b2(i12, ZAbstractBase.ZVU_PROCESS_FLUSH, 50000));
    }

    /* renamed from: M2 */
    public final void m154100M2() {
        int i11;
        String str = CoreUtility.f89233i;
        boolean z11 = false;
        if (str != null && str.length() != 0) {
            String str2 = CoreUtility.f89233i;
            AbstractC19074t.m100207e(str2, "currentUserUid");
            i11 = Integer.parseInt(str2);
        } else {
            i11 = 0;
        }
        if (AbstractC0924m0.m4254u9() || AbstractC0924m0.m4341x9()) {
            z11 = true;
        }
        int m3066G0 = AbstractC0924m0.m3066G0();
        int m3095H0 = AbstractC0924m0.m3095H0();
        C29628e m147249E0 = C29628e.m147249E0();
        m147249E0.m93397Y(z11, i11);
        m147249E0.m93420o0(m3066G0);
        m147249E0.m93422p0(m3095H0);
        m147249E0.m93418n0(1 ^ (AbstractC0924m0.m3926ja() ? 1 : 0));
        C24559a.m127933c("[E2EE]", "E2EEController setE2eeNativeConfig " + i11 + " - " + z11 + " | counterLimit=" + m3066G0 + "-" + m3095H0);
    }

    /* renamed from: N0 */
    public final void m154101N0(String str) {
        AbstractC19074t.m100208f(str, "threadId");
        f147085c.mo13474a(new Runnable() { // from class: zh.q2

            /* renamed from: p */
            public final /* synthetic */ String f147681p;

            public /* synthetic */ RunnableC32073q2(String str2) {
                r1 = str2;
            }

            @Override // java.lang.Runnable
            public final void run() {
                C31986k3.m153982O0(r1);
            }
        });
    }

    /* renamed from: N2 */
    public final void m154102N2(boolean z11) {
        f147090h.set(z11);
    }

    /* renamed from: O2 */
    public final void m154103O2(long j11) {
        f147087e = j11;
    }

    /* renamed from: P0 */
    public final void m154104P0(String str, int i11, int i12, long j11) {
        AbstractC19074t.m100208f(str, "threadId");
        f147085c.mo13474a(new Runnable() { // from class: zh.g3

            /* renamed from: p */
            public final /* synthetic */ String f146669p;

            /* renamed from: q */
            public final /* synthetic */ String f146670q;

            /* renamed from: r */
            public final /* synthetic */ long f146671r;

            /* renamed from: s */
            public final /* synthetic */ int f146672s;

            /* renamed from: t */
            public final /* synthetic */ int f146673t;

            public /* synthetic */ RunnableC31926g3(String str2, String str3, long j112, int i112, int i122) {
                r1 = str2;
                r2 = str3;
                r3 = j112;
                r5 = i112;
                r6 = i122;
            }

            @Override // java.lang.Runnable
            public final void run() {
                C31986k3.m153987Q0(r1, r2, r3, r5, r6);
            }
        });
    }

    /* renamed from: P1 */
    public final boolean m154105P1(String str) {
        AbstractC19074t.m100208f(str, "threadId");
        if (m154106Q1() && !AbstractC25495a.m132079d(str)) {
            C31927g4 m154138p1 = m154138p1(str);
            if (m154138p1 == null) {
                return false;
            }
            if (m154138p1.m153393e() < 4 && !m154138p1.m153392d()) {
                return false;
            }
            return true;
        }
        return m154108R1(str);
    }

    /* renamed from: Q1 */
    public final boolean m154106Q1() {
        if (!m154114W1(false) || !AbstractC0924m0.m4283v9()) {
            return false;
        }
        return true;
    }

    /* renamed from: R0 */
    public final void m154107R0(String str, String str2, int i11, long j11) {
        AbstractC19074t.m100208f(str, "currentUid");
        AbstractC19074t.m100208f(str2, "threadId");
        f147085c.mo13474a(new Runnable() { // from class: zh.e2

            /* renamed from: p */
            public final /* synthetic */ String f146527p;

            /* renamed from: q */
            public final /* synthetic */ long f146528q;

            /* renamed from: r */
            public final /* synthetic */ String f146529r;

            /* renamed from: s */
            public final /* synthetic */ int f146530s;

            public /* synthetic */ RunnableC31895e2(String str3, long j112, String str22, int i112) {
                r1 = str3;
                r2 = j112;
                r4 = str22;
                r5 = i112;
            }

            @Override // java.lang.Runnable
            public final void run() {
                C31986k3.m153992S0(r1, r2, r4, r5);
            }
        });
    }

    /* renamed from: R1 */
    public final boolean m154108R1(String str) {
        AbstractC19074t.m100208f(str, "threadId");
        if (m154140q1(str) >= 4) {
            return true;
        }
        return false;
    }

    /* renamed from: S1 */
    public final boolean m154109S1(String str) {
        boolean m127149O;
        AbstractC19074t.m100208f(str, ZMediaPlayer.OnNativeInvokeListener.ARG_URL);
        m127149O = AbstractC24342w.m127149O(str, "?e2esession=", false, 2, null);
        return m127149O;
    }

    /* renamed from: T1 */
    public final boolean m154110T1() {
        if (m154045l1() == EnumC31882d4.f146443q) {
            return true;
        }
        return false;
    }

    /* renamed from: U1 */
    public final boolean m154111U1() {
        if (m154045l1() == EnumC31882d4.f146444r) {
            return true;
        }
        return false;
    }

    /* renamed from: U2 */
    public final void m154112U2(C17945a0 c17945a0) {
        AbstractC19074t.m100208f(c17945a0, "message");
        c17945a0.m95291wc();
        C23288a c23288a = C23288a.f113033a;
        String mo95039W2 = c17945a0.mo95039W2();
        AbstractC19074t.m100207e(mo95039W2, "getOwnerId(...)");
        AbstractC18428c.m97659b(c23288a, mo95039W2, 0, new Runnable() { // from class: zh.o2
            public /* synthetic */ RunnableC32045o2() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                C31986k3.m154002V2(C17945a0.this);
            }
        }, 2, null);
    }

    /* renamed from: W0 */
    public final void m154113W0(String str) {
        AbstractC19074t.m100208f(str, "threadId");
        if (!C23055e5.m118272g(true)) {
            return;
        }
        f147085c.mo13474a(new Runnable() { // from class: zh.m2

            /* renamed from: p */
            public final /* synthetic */ String f147334p;

            public /* synthetic */ RunnableC32015m2(String str2) {
                r1 = str2;
            }

            @Override // java.lang.Runnable
            public final void run() {
                C31986k3.m154006X0(r1);
            }
        });
    }

    /* renamed from: W1 */
    public final boolean m154114W1(boolean z11) {
        if ((z11 && AbstractC0924m0.m4341x9()) || (!z11 && AbstractC0924m0.m4254u9())) {
            return true;
        }
        return false;
    }

    /* renamed from: X1 */
    public final boolean m154115X1() {
        return f147090h.get();
    }

    /* renamed from: Y0 */
    public final String m154116Y0(int i11, String str, String str2, int i12) {
        AbstractC19074t.m100208f(str, "ownerId");
        AbstractC19074t.m100208f(str2, "receiverUid");
        byte[] m93344g = AbstractC17522a.m93344g(i11);
        AbstractC19074t.m100207e(m93344g, "intToByteArray(...)");
        return new String(m154120a1(m93344g, str, str2, i12), C24321d.f117408b);
    }

    /* renamed from: Y1 */
    public final boolean m154117Y1() {
        if (!m154115X1() && AbstractC23306f.m120579F1().mo124314i() - f147089g >= 3000) {
            return false;
        }
        return true;
    }

    /* renamed from: Z0 */
    public final String m154118Z0(String str, String str2, String str3, int i11) {
        AbstractC19074t.m100208f(str, "content");
        AbstractC19074t.m100208f(str2, "ownerId");
        AbstractC19074t.m100208f(str3, "receiverUid");
        if (str.length() == 0) {
            return str;
        }
        Charset charset = C24321d.f117408b;
        byte[] bytes = str.getBytes(charset);
        AbstractC19074t.m100207e(bytes, "getBytes(...)");
        return new String(m154120a1(bytes, str2, str3, i11), charset);
    }

    /* renamed from: Z1 */
    public final boolean m154119Z1(String str, int i11, long j11) {
        AbstractC19074t.m100208f(str, "uid");
        boolean z11 = false;
        C31927g4 m154027f1 = m154027f1(false, str, AbstractC29239n.m146002a(str, -1), i11);
        if (m154027f1 == null) {
            return true;
        }
        if (m154027f1.m153395g() > j11) {
            z11 = true;
        }
        return z11;
    }

    /* renamed from: a1 */
    public final byte[] m154120a1(byte[] bArr, String str, String str2, int i11) {
        Pair m93389Q;
        String str3;
        AbstractC19074t.m100208f(bArr, "content");
        AbstractC19074t.m100208f(str, "ownerId");
        AbstractC19074t.m100208f(str2, "receiverUid");
        boolean m132079d = AbstractC25495a.m132079d(str);
        int parseInt = Integer.parseInt(AbstractC25495a.m132089n(str));
        if (m132079d) {
            m93389Q = C29628e.m147249E0().m93388P(bArr, parseInt);
        } else {
            m93389Q = C29628e.m147249E0().m93389Q(bArr, Integer.parseInt(str2), i11);
        }
        Integer num = (Integer) m93389Q.first;
        byte[] bArr2 = (byte[]) m93389Q.second;
        if (num == null || num.intValue() != 0) {
            if (num != null && num.intValue() == -1000) {
                String str4 = CoreUtility.f89233i;
                AbstractC19074t.m100207e(str4, "currentUserUid");
                if (m132079d) {
                    str3 = str;
                } else {
                    str3 = str2;
                }
                m153952C2(str4, m132079d, str3, Integer.parseInt(str2), i11);
            }
            AbstractC19074t.m100205c(num);
            throw new E2eeEncryptException(num.intValue(), null, 2, null);
        }
        AbstractC19074t.m100205c(bArr2);
        return bArr2;
    }

    /* renamed from: a2 */
    public final boolean m154121a2(String str) {
        AbstractC19074t.m100208f(str, "threadId");
        if (m154106Q1() && !AbstractC25495a.m132079d(str) && !AbstractC21935u.m114519I(str) && !AbstractC25495a.m132078c(str) && ((AbstractC21935u.m114554u(str) || AbstractC0924m0.m3745d9()) && !C21927m.m114302u().m114312J().m153137g(str))) {
            return true;
        }
        return false;
    }

    /* renamed from: b1 */
    public final String m154122b1(String str, String str2, String str3, int i11) {
        int m127178g0;
        AbstractC19074t.m100208f(str, ZMediaPlayer.OnNativeInvokeListener.ARG_URL);
        AbstractC19074t.m100208f(str2, "ownerId");
        AbstractC19074t.m100208f(str3, "receiverUid");
        if (str.length() != 0) {
            m127178g0 = AbstractC24342w.m127178g0(str, "e2esession=", 0, false, 6, null);
            if (m127178g0 > 0) {
                int i12 = m127178g0 + 11;
                String substring = str.substring(0, i12);
                AbstractC19074t.m100207e(substring, "substring(...)");
                String substring2 = str.substring(i12);
                AbstractC19074t.m100207e(substring2, "substring(...)");
                return substring + m154118Z0(substring2, str2, str3, i11);
            }
            return m154118Z0(str, str2, str3, i11);
        }
        return str;
    }

    /* renamed from: c2 */
    public final void m154123c2(String str, List list, long j11, long j12) {
        AbstractC19074t.m100208f(str, "currentUid");
        AbstractC19074t.m100208f(list, "uids");
        AbstractC0837p0.Companion.m2237f().mo2040a(new Runnable() { // from class: zh.u2

            /* renamed from: p */
            public final /* synthetic */ String f148184p;

            /* renamed from: q */
            public final /* synthetic */ List f148185q;

            /* renamed from: r */
            public final /* synthetic */ long f148186r;

            /* renamed from: s */
            public final /* synthetic */ long f148187s;

            public /* synthetic */ RunnableC32129u2(String str2, List list2, long j112, long j122) {
                r1 = str2;
                r2 = list2;
                r3 = j112;
                r5 = j122;
            }

            @Override // java.lang.Runnable
            public final void run() {
                C31986k3.m154023d2(r1, r2, r3, r5);
            }
        });
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x004c, code lost:            if (r2 == null) goto L91;     */
    /* renamed from: d1 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String m154124d1(JSONObject jSONObject, String str, int i11) {
        String str2;
        AbstractC19074t.m100208f(jSONObject, "json");
        AbstractC19074t.m100208f(str, "rawType");
        try {
            int m104324c = AbstractC20071b.Companion.m104324c(str, jSONObject);
            String str3 = null;
            if (m104324c != 2 && m104324c != 3 && m104324c != 6) {
                if (m104324c != 10) {
                    if (m104324c != 12) {
                        if (m104324c != 29 && m104324c != 18) {
                            if (m104324c != 19) {
                                switch (m104324c) {
                                    case 21:
                                    case 24:
                                        break;
                                    case 22:
                                    case 23:
                                        break;
                                    default:
                                        str2 = jSONObject.optString("msg");
                                        break;
                                }
                            }
                        }
                        JSONObject optJSONObject = jSONObject.optJSONObject("attach");
                        if (optJSONObject != null) {
                            str3 = optJSONObject.optString("params");
                        }
                    } else {
                        JSONObject optJSONObject2 = jSONObject.optJSONObject("attach");
                        if (optJSONObject2 != null) {
                            if (i11 == 0) {
                                str2 = optJSONObject2.optString("params");
                                if (str2 == null) {
                                }
                            } else {
                                String optString = optJSONObject2.optString("action");
                                if (!AbstractC19074t.m100204b(optString, "recommened.user") && !AbstractC19074t.m100204b(optString, "recommened.vip")) {
                                    str2 = optJSONObject2.optString("params");
                                    if (str2 == null) {
                                    }
                                }
                                str2 = optJSONObject2.optString("description");
                                if (str2 == null) {
                                }
                            }
                        }
                        str2 = "";
                    }
                } else {
                    JSONObject optJSONObject3 = jSONObject.optJSONObject("attach");
                    if (optJSONObject3 != null) {
                        str3 = optJSONObject3.optString("id");
                    }
                    if (str3 == null) {
                        str2 = "";
                    }
                    str2 = str3;
                }
                String m135989e = AbstractC26389c.m135989e(str2);
                AbstractC19074t.m100207e(m135989e, "sha256(...)");
                return m135989e;
            }
            JSONObject optJSONObject4 = jSONObject.optJSONObject("attach");
            if (optJSONObject4 != null) {
                str3 = optJSONObject4.optString("href");
            }
            if (str3 == null) {
                str2 = "";
                String m135989e2 = AbstractC26389c.m135989e(str2);
                AbstractC19074t.m100207e(m135989e2, "sha256(...)");
                return m135989e2;
            }
            str2 = str3;
            String m135989e22 = AbstractC26389c.m135989e(str2);
            AbstractC19074t.m100207e(m135989e22, "sha256(...)");
            return m135989e22;
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
            return "";
        }
    }

    /* renamed from: e0 */
    public final void m154125e0(JSONObject jSONObject, String str, C3533a c3533a, MessageId messageId) {
        AbstractC19074t.m100208f(jSONObject, "jsonData");
        AbstractC19074t.m100208f(str, "rawType");
        AbstractC19074t.m100208f(c3533a, "ack");
        AbstractC19074t.m100208f(messageId, "messageId");
        m154025e1().add(new C31837a4(jSONObject, str, c3533a, messageId));
        c3533a.m17922q(true);
        m154042k1().removeMessages(1);
        m154042k1().sendEmptyMessageDelayed(1, 3000L);
    }

    /* renamed from: e2 */
    public final void m154126e2(String str, int i11, int i12, long j11, List list) {
        AbstractC19074t.m100208f(str, "currentUid");
        AbstractC19074t.m100208f(list, "groupIds");
        if (!list.isEmpty() && AbstractC0924m0.m4370y9()) {
            f147085c.mo13474a(new Runnable() { // from class: zh.f2

                /* renamed from: p */
                public final /* synthetic */ String f146611p;

                /* renamed from: q */
                public final /* synthetic */ int f146612q;

                /* renamed from: r */
                public final /* synthetic */ int f146613r;

                /* renamed from: s */
                public final /* synthetic */ List f146614s;

                /* renamed from: t */
                public final /* synthetic */ long f146615t;

                public /* synthetic */ RunnableC31910f2(String str2, int i112, int i122, List list2, long j112) {
                    r1 = str2;
                    r2 = i112;
                    r3 = i122;
                    r4 = list2;
                    r5 = j112;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    C31986k3.m154028f2(r1, r2, r3, r4, r5);
                }
            });
        }
    }

    /* renamed from: f0 */
    public final void m154127f0(String str, int i11) {
        AbstractC19074t.m100208f(str, "threadId");
        f147085c.mo13474a(new Runnable() { // from class: zh.y2

            /* renamed from: p */
            public final /* synthetic */ String f148413p;

            /* renamed from: q */
            public final /* synthetic */ String f148414q;

            /* renamed from: r */
            public final /* synthetic */ int f148415r;

            public /* synthetic */ RunnableC32185y2(String str2, String str3, int i112) {
                r1 = str2;
                r2 = str3;
                r3 = i112;
            }

            @Override // java.lang.Runnable
            public final void run() {
                C31986k3.m154030g0(r1, r2, r3);
            }
        });
    }

    /* renamed from: g2 */
    public final void m154128g2(String str) {
        AbstractC19074t.m100208f(str, "currentUid");
        C24559a.m127933c("[E2EE]", "Receive over queue init 11 -> Set lazy init to all 1-1 and sub device sessions");
        m153993S2(str);
        m153985P2(str, false);
    }

    /* renamed from: h0 */
    public final void m154129h0(EnumC31888da enumC31888da, String str, String str2) {
        List m131502j;
        List m131502j2;
        String m118086f;
        AbstractC19074t.m100208f(enumC31888da, "state");
        AbstractC19074t.m100208f(str, "threadId");
        if ((!AbstractC25495a.m132079d(str) && m154106Q1()) || !m154110T1()) {
            return;
        }
        C29593i m120681k0 = AbstractC23306f.m120681k0();
        AbstractC19074t.m100207e(m120681k0, "provideInsertMessageUseCase(...)");
        m131502j = AbstractC25368s.m131502j();
        m131502j2 = AbstractC25368s.m131502j();
        int m118641B = AbstractC23136l9.m118641B(MainApplication.Companion.m35500c(), AbstractC16801x.cM1);
        int i11 = c.f147102a[enumC31888da.ordinal()];
        boolean z11 = true;
        if (i11 == 1) {
            m131502j = AbstractC25368s.m131505m("Đã nâng cấp Mã hóa đầu cuối", "Upgraded to end-to-end encryption", "Upgraded to end-to-end encryption");
        } else {
            if (i11 == 2) {
                m131502j = AbstractC25368s.m131505m("Nâng cấp Mã hóa đầu cuối không thành công", "Unable to upgrade to End-to-end encryption", "Unable to upgrade to End-to-end encryption");
            } else if (i11 == 3) {
                m131502j = AbstractC25368s.m131505m("Đã tắt Mã hóa đầu cuối", "End-to-end encryption disabled", "End-to-end encryption disabled");
            } else if (i11 == 4) {
                m131502j = AbstractC25368s.m131505m("Nhóm đã nâng cấp Mã hóa đầu cuối. Cập nhật Zalo bản mới để đọc tin nhắn.", "Group upgraded to End-to-end encryption. Update to the latest version to read messages.", "Group upgraded to End-to-end encryption. Update to the latest version to read messages.");
            } else if (i11 == 5) {
                m131502j = AbstractC25368s.m131505m("Nâng cấp Mã hóa đầu cuối không thành công.", "End-to-end encryption upgrade failed.", "End-to-end encryption upgrade failed.");
                if (str2 != null && str2.length() != 0 && (m118086f = AbstractC23028c0.m118086f(str2, true, 0)) != null && m118086f.length() != 0) {
                    m131502j = AbstractC25368s.m131505m("Nâng cấp Mã hóa đầu cuối không thành công. " + m118086f + " cần cập nhật phiên bản Zalo mới", "End-to-end encryption upgrade failed. " + m118086f + " needs to update to the latest version of Zalo", "End-to-end encryption upgrade failed. " + m118086f + " needs to update to the latest version of Zalo");
                }
            }
            z11 = false;
        }
        JSONObject m154020c1 = m154020c1("", m118641B, m131502j, m131502j2);
        MessageId.C7932a c7932a = MessageId.Companion;
        String m103086b = AbstractC23306f.m120599M0().m103086b();
        String str3 = CoreUtility.f89233i;
        AbstractC19074t.m100207e(str3, "currentUserUid");
        C17945a0.w m95368d = new C17945a0.w(c7932a.m41064b(m103086b, "", str, str3), 20).m95368d(new C18005u0(m154020c1));
        if (z11) {
            m95368d.m95378n(3);
        }
        C17945a0 m95365a = m95368d.m95365a();
        AbstractC19074t.m100207e(m95365a, "build(...)");
        m95365a.m94951M9();
        AbstractC18428c.m97658a(C23288a.f113033a, str, 5, new Runnable() { // from class: zh.v1

            /* renamed from: q */
            public final /* synthetic */ String f148239q;

            /* renamed from: r */
            public final /* synthetic */ C17945a0 f148240r;

            public /* synthetic */ RunnableC32142v1(String str4, C17945a0 m95365a2) {
                r2 = str4;
                r3 = m95365a2;
            }

            @Override // java.lang.Runnable
            public final void run() {
                C31986k3.m154039j0(C29593i.this, r2, r3);
            }
        });
    }

    /* renamed from: h2 */
    public final void m154130h2(String str) {
        AbstractC19074t.m100208f(str, "currentUid");
        if (!AbstractC0924m0.m4370y9()) {
            return;
        }
        C24559a.m127933c("[E2EE]", "Receive full queue init group");
        AbstractC0837p0.Companion.m2237f().mo2040a(new Runnable() { // from class: zh.a2

            /* renamed from: p */
            public final /* synthetic */ String f146108p;

            public /* synthetic */ RunnableC31835a2(String str2) {
                r1 = str2;
            }

            @Override // java.lang.Runnable
            public final void run() {
                C31986k3.m154037i2(r1);
            }
        });
    }

    /* renamed from: j2 */
    public final void m154131j2(String str, String str2, int i11, int i12, List list, long j11, int i13, String str3) {
        AbstractC19074t.m100208f(str, "currentUid");
        AbstractC19074t.m100208f(str2, "threadId");
        AbstractC19074t.m100208f(str3, "dataResponse");
        if (AbstractC19074t.m100204b(CoreUtility.f89233i, str) && C31852b4.Companion.m153134h().contains(Integer.valueOf(i12))) {
            f147085c.mo13474a(new Runnable() { // from class: zh.b3

                /* renamed from: p */
                public final /* synthetic */ String f146260p;

                /* renamed from: q */
                public final /* synthetic */ String f146261q;

                /* renamed from: r */
                public final /* synthetic */ int f146262r;

                /* renamed from: s */
                public final /* synthetic */ int f146263s;

                /* renamed from: t */
                public final /* synthetic */ int f146264t;

                /* renamed from: u */
                public final /* synthetic */ long f146265u;

                /* renamed from: v */
                public final /* synthetic */ String f146266v;

                /* renamed from: w */
                public final /* synthetic */ List f146267w;

                public /* synthetic */ RunnableC31851b3(String str4, String str22, int i132, int i112, int i122, long j112, String str32, List list2) {
                    r1 = str4;
                    r2 = str22;
                    r3 = i132;
                    r4 = i112;
                    r5 = i122;
                    r6 = j112;
                    r8 = str32;
                    r9 = list2;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    C31986k3.m154043k2(r1, r2, r3, r4, r5, r6, r8, r9);
                }
            });
        }
    }

    /* renamed from: k0 */
    public final boolean m154132k0(String str, int i11, long j11) {
        AbstractC19074t.m100208f(str, "uid");
        C31927g4 m154027f1 = m154027f1(false, str, AbstractC29239n.m146002a(str, -1), i11);
        if (m154027f1 == null || m154027f1.m153393e() < 4 || m154027f1.m153395g() <= 0 || m154027f1.m153395g() >= j11) {
            return false;
        }
        return true;
    }

    /* renamed from: l0 */
    public final void m154133l0() {
        if (m154025e1().isEmpty()) {
            return;
        }
        m154042k1().removeMessages(1);
        if (m154115X1()) {
            m154042k1().sendEmptyMessageDelayed(1, 3000L);
            return;
        }
        C24559a.m127933c("[E2EE]", "checkDecryptWaitingFailedGroupMsg " + m154025e1().size());
        AbstractC18429d.m97660a(C23288a.f113033a, new Runnable() { // from class: zh.h2
            @Override // java.lang.Runnable
            public final void run() {
                C31986k3.m154048m0();
            }
        });
    }

    /* renamed from: m2 */
    public final void m154134m2(String str, String str2, int i11, int i12, long j11, int i13) {
        AbstractC19074t.m100208f(str, "currentUid");
        AbstractC19074t.m100208f(str2, "threadId");
        if (AbstractC19074t.m100204b(CoreUtility.f89233i, str) && C31852b4.Companion.m153134h().contains(Integer.valueOf(i12))) {
            f147085c.mo13474a(new Runnable() { // from class: zh.b2

                /* renamed from: p */
                public final /* synthetic */ String f146254p;

                /* renamed from: q */
                public final /* synthetic */ String f146255q;

                /* renamed from: r */
                public final /* synthetic */ int f146256r;

                /* renamed from: s */
                public final /* synthetic */ int f146257s;

                /* renamed from: t */
                public final /* synthetic */ long f146258t;

                /* renamed from: u */
                public final /* synthetic */ int f146259u;

                public /* synthetic */ RunnableC31850b2(String str3, String str22, int i112, int i122, long j112, int i132) {
                    r1 = str3;
                    r2 = str22;
                    r3 = i112;
                    r4 = i122;
                    r5 = j112;
                    r7 = i132;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    C31986k3.m154052n2(r1, r2, r3, r4, r5, r7);
                }
            });
        }
    }

    /* renamed from: n0 */
    public final int m154135n0(String str, List list) {
        String str2;
        AbstractC19074t.m100208f(str, "threadId");
        AbstractC19074t.m100208f(list, "clients");
        String str3 = CoreUtility.f89233i;
        boolean m132079d = AbstractC25495a.m132079d(str);
        if (!m154114W1(m132079d)) {
            return 0;
        }
        if (!m154066t0(this, str, false, 2, null)) {
            int m154140q1 = m154140q1(str);
            if (m154140q1 != 6 && (m132079d || m154140q1 != 4)) {
                return 0;
            }
            if (m132079d) {
                C29628e m147249E0 = C29628e.m147249E0();
                int parseInt = Integer.parseInt(AbstractC25495a.m132088m(str));
                AbstractC19074t.m100205c(str3);
                if (!m147249E0.m93394V(parseInt, Integer.parseInt(str3))) {
                    C24559a.m127933c("[E2EE]", "checkE2eeSessionStateForSending: native session GROUP not valid");
                    C31927g4 m154138p1 = m154138p1(str);
                    if (m154138p1 != null && m154138p1.m153398j()) {
                        return 0;
                    }
                    m153961F1(this, str3, str, 2, false, null, 24, null);
                }
                return m154140q1;
            }
            Iterator it = list.iterator();
            boolean z11 = true;
            boolean z12 = false;
            while (it.hasNext()) {
                C31852b4 c31852b4 = (C31852b4) it.next();
                if (c31852b4.m153124f()) {
                    str2 = str3;
                } else {
                    str2 = str;
                }
                AbstractC19074t.m100205c(str2);
                int parseInt2 = Integer.parseInt(str2);
                C31986k3 c31986k3 = f147083a;
                C31927g4 m154031g1 = c31986k3.m154031g1(parseInt2, c31852b4.m153123e());
                if (!C29628e.m147249E0().m93396X(parseInt2, c31852b4.m153123e())) {
                    C24559a.m127933c("[E2EE]", "checkE2eeSessionStateForSending: native session 11 not valid " + parseInt2 + " - deviceId: " + c31852b4.m153123e() + " ");
                    if (m154031g1 != null && m154031g1.m153393e() != 0 && !m154031g1.m153398j()) {
                        AbstractC19074t.m100205c(str3);
                        m153954D1(c31986k3, str3, parseInt2, c31852b4.m153123e(), false, false, null, 32, null);
                        z11 = false;
                        z12 = true;
                    } else {
                        z11 = false;
                    }
                }
            }
            if (!z11) {
                if (!z12) {
                    return 0;
                }
            }
            return m154140q1;
        }
        return 3;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ProcessVariables
        jadx.core.utils.exceptions.JadxRuntimeException: Method arg registers not loaded: zh.a3.<init>(java.lang.String, dj.a0, boolean, java.lang.String):void, class status: GENERATED_AND_UNLOADED
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
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:19)
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables.removeUnusedResults(ProcessVariables.java:73)
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables.visit(ProcessVariables.java:48)
        */
    /* renamed from: o0 */
    public final void m154136o0(dj.C17945a0 r14) {
        /*
            r13 = this;
            java.lang.String r0 = "chatContent"
            fn0.AbstractC19074t.m100208f(r14, r0)
            java.lang.String r4 = r14.mo95039W2()
            java.lang.String r0 = "getOwnerId(...)"
            fn0.AbstractC19074t.m100207e(r4, r0)
            boolean r2 = p461qu.AbstractC25495a.m132079d(r4)
            boolean r0 = r13.m154114W1(r2)
            if (r0 != 0) goto L19
            return
        L19:
            boolean r0 = r14.m95014T6()
            if (r0 == 0) goto Ld2
            boolean r0 = r14.m95241r7()
            if (r0 == 0) goto Ld2
            java.lang.String r3 = com.zing.zalocore.CoreUtility.f89233i
            zh.g4 r0 = r13.m154138p1(r4)
            r1 = 0
            r5 = 1
            if (r0 == 0) goto L38
            int r6 = r0.m153393e()
            r7 = 4
            if (r6 < r7) goto L38
            r6 = 1
            goto L39
        L38:
            r6 = 0
        L39:
            r7 = 0
            if (r0 == 0) goto L42
            long r9 = r0.m153395g()
            goto L43
        L42:
            r9 = r7
        L43:
            boolean r11 = r14.m95170j6()
            if (r11 == r6) goto L64
            long r11 = r14.m94974P4()
            int r6 = (r11 > r9 ? 1 : (r11 == r9 ? 0 : -1))
            if (r6 <= 0) goto L64
            zh.a3 r1 = new zh.a3
            r1.<init>()
            if (r0 != 0) goto L5f
            r2 = 1000(0x3e8, double:4.94E-321)
            gg0.AbstractC19444a.m101694b(r1, r2)
            goto Ld2
        L5f:
            r1.run()
            goto Ld2
        L64:
            boolean r0 = r14.m95170j6()
            if (r0 == 0) goto Ld2
            java.lang.String r0 = r14.m94862C4()
            java.lang.String r6 = "getSenderUid(...)"
            fn0.AbstractC19074t.m100207e(r0, r6)
            int r0 = java.lang.Integer.parseInt(r0)
            int r6 = r14.m95196m4()
            if (r2 == 0) goto L82
            zh.g4 r9 = r13.m154027f1(r5, r4, r0, r6)
            goto L86
        L82:
            zh.g4 r9 = r13.m154031g1(r0, r6)
        L86:
            if (r9 == 0) goto L8f
            int r10 = r9.m153393e()
            if (r10 == 0) goto L8f
            r1 = 1
        L8f:
            if (r9 == 0) goto L95
            long r7 = r9.m153395g()
        L95:
            if (r1 != 0) goto Ld2
            long r9 = r14.m94974P4()
            int r1 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
            if (r1 <= 0) goto Ld2
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r5 = "checkE2eeSessionWhenReceivedMsg missing client: threadId="
            r1.append(r5)
            r1.append(r4)
            java.lang.String r5 = " | senderUid="
            r1.append(r5)
            r1.append(r0)
            java.lang.String r5 = " | deviceId="
            r1.append(r5)
            r1.append(r6)
            java.lang.String r1 = r1.toString()
            java.lang.String r5 = "[E2EE]"
            p405ov.C24559a.m127933c(r5, r1)
            zh.k3$b0 r8 = p716zh.C31986k3.f147085c
            zh.c3 r9 = new zh.c3
            r1 = r9
            r5 = r0
            r7 = r14
            r1.<init>()
            r8.mo13474a(r9)
        Ld2:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p716zh.C31986k3.m154136o0(dj.a0):void");
    }

    /* renamed from: o1 */
    public final List m154137o1(String str, int i11) {
        AbstractC19074t.m100208f(str, "ownerId");
        CopyOnWriteArrayList m154063s1 = m154063s1();
        ArrayList arrayList = new ArrayList();
        for (Object obj : m154063s1) {
            C31927g4 c31927g4 = (C31927g4) obj;
            if (AbstractC19074t.m100204b(c31927g4.m153394f(), str) && c31927g4.m153396h() == i11 && c31927g4.m153390b() != -1 && c31927g4.m153393e() != 0) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    /* renamed from: p1 */
    public final C31927g4 m154138p1(String str) {
        Object obj;
        AbstractC19074t.m100208f(str, "threadId");
        Iterator it = m154063s1().iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                C31927g4 c31927g4 = (C31927g4) obj;
                if (AbstractC19074t.m100204b(c31927g4.m153394f(), str) && ((!c31927g4.m153397i() && c31927g4.m153396h() != 0) || (c31927g4.m153397i() && c31927g4.m153396h() == 0))) {
                    if (c31927g4.m153390b() == -1) {
                        break;
                    }
                }
            } else {
                obj = null;
                break;
            }
        }
        return (C31927g4) obj;
    }

    /* renamed from: p2 */
    public final void m154139p2(String str, String str2, int i11, int i12, long j11, int i13, int i14) {
        AbstractC19074t.m100208f(str, "currentUid");
        AbstractC19074t.m100208f(str2, "threadId");
        f147085c.mo13474a(new Runnable() { // from class: zh.j3

            /* renamed from: p */
            public final /* synthetic */ String f146934p;

            /* renamed from: q */
            public final /* synthetic */ String f146935q;

            /* renamed from: r */
            public final /* synthetic */ int f146936r;

            /* renamed from: s */
            public final /* synthetic */ int f146937s;

            /* renamed from: t */
            public final /* synthetic */ int f146938t;

            /* renamed from: u */
            public final /* synthetic */ long f146939u;

            /* renamed from: v */
            public final /* synthetic */ int f146940v;

            public /* synthetic */ RunnableC31971j3(String str3, String str22, int i132, int i112, int i122, long j112, int i142) {
                r1 = str3;
                r2 = str22;
                r3 = i132;
                r4 = i112;
                r5 = i122;
                r6 = j112;
                r8 = i142;
            }

            @Override // java.lang.Runnable
            public final void run() {
                C31986k3.m154059q2(r1, r2, r3, r4, r5, r6, r8);
            }
        });
    }

    /* renamed from: q1 */
    public final int m154140q1(String str) {
        AbstractC19074t.m100208f(str, "threadId");
        C31927g4 m154138p1 = m154138p1(str);
        if (m154138p1 != null) {
            return m154138p1.m153393e();
        }
        return 0;
    }

    /* renamed from: r1 */
    public final long m154141r1() {
        return f147087e;
    }

    /* renamed from: r2 */
    public final void m154142r2(String str, int i11, long j11) {
        AbstractC19074t.m100208f(str, "currentUid");
        if (i11 <= 0) {
            return;
        }
        f147085c.mo13474a(new Runnable() { // from class: zh.c2

            /* renamed from: p */
            public final /* synthetic */ String f146342p;

            /* renamed from: q */
            public final /* synthetic */ int f146343q;

            /* renamed from: r */
            public final /* synthetic */ long f146344r;

            public /* synthetic */ RunnableC31865c2(String str2, int i112, long j112) {
                r1 = str2;
                r2 = i112;
                r3 = j112;
            }

            @Override // java.lang.Runnable
            public final void run() {
                C31986k3.m154064s2(r1, r2, r3);
            }
        });
    }

    /* renamed from: s0 */
    public final boolean m154143s0(String str, boolean z11) {
        C31973j5 m4472f;
        AbstractC19074t.m100208f(str, "threadId");
        String str2 = CoreUtility.f89233i;
        boolean m132079d = AbstractC25495a.m132079d(str);
        boolean z12 = false;
        if (!m154114W1(m132079d)) {
            return false;
        }
        C31927g4 m154138p1 = m154138p1(str);
        if (m154138p1 != null && m154138p1.m153393e() != 0 && m154138p1.m153393e() != 1) {
            if (!m154138p1.m153399k()) {
                if (m154138p1.m153393e() != 3 && m154138p1.m153393e() != 5 && ((!m132079d || m154138p1.m153393e() != 4) && (m154086B1(str) || (m132079d && ((m4472f = C0943w.f3447a.m4472f(str)) == null || m4472f.m153732O() <= 1))))) {
                    CopyOnWriteArrayList m154063s1 = m154063s1();
                    ArrayList<C31927g4> arrayList = new ArrayList();
                    for (Object obj : m154063s1) {
                        C31927g4 c31927g4 = (C31927g4) obj;
                        if (AbstractC19074t.m100204b(c31927g4.m153394f(), str) || (AbstractC19074t.m100204b(c31927g4.m153394f(), str2) && !m132079d)) {
                            if (c31927g4.m153396h() != 0 && c31927g4.m153390b() != -1 && (c31927g4.m153393e() == 3 || c31927g4.m153393e() == 1 || c31927g4.m153393e() == 5 || (m132079d && c31927g4.m153393e() == 4))) {
                                arrayList.add(obj);
                            }
                        }
                    }
                    for (C31927g4 c31927g42 : arrayList) {
                        if (!c31927g42.m153399k()) {
                            if (!c31927g42.m153398j()) {
                                f147085c.mo13474a(new Runnable() { // from class: zh.y1

                                    /* renamed from: p */
                                    public final /* synthetic */ boolean f148409p;

                                    /* renamed from: q */
                                    public final /* synthetic */ C31927g4 f148410q;

                                    /* renamed from: r */
                                    public final /* synthetic */ String f148411r;

                                    /* renamed from: s */
                                    public final /* synthetic */ String f148412s;

                                    public /* synthetic */ RunnableC32184y1(boolean m132079d2, C31927g4 c31927g422, String str22, String str3) {
                                        r1 = m132079d2;
                                        r2 = c31927g422;
                                        r3 = str22;
                                        r4 = str3;
                                    }

                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        C31986k3.m154073v0(r1, r2, r3, r4);
                                    }
                                });
                            }
                        }
                        z12 = true;
                    }
                    return z12;
                }
                if (m154138p1.m153393e() == 6) {
                    m154138p1.m153405q(5);
                    m154138p1.m153403o(false);
                }
                if (m154138p1.m153398j()) {
                    return false;
                }
                f147085c.mo13474a(new Runnable() { // from class: zh.x1

                    /* renamed from: p */
                    public final /* synthetic */ boolean f148315p;

                    /* renamed from: q */
                    public final /* synthetic */ C31927g4 f148316q;

                    /* renamed from: r */
                    public final /* synthetic */ String f148317r;

                    /* renamed from: s */
                    public final /* synthetic */ String f148318s;

                    /* renamed from: t */
                    public final /* synthetic */ boolean f148319t;

                    public /* synthetic */ RunnableC32170x1(boolean m132079d2, C31927g4 m154138p12, String str22, String str3, boolean z112) {
                        r1 = m132079d2;
                        r2 = m154138p12;
                        r3 = str22;
                        r4 = str3;
                        r5 = z112;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        C31986k3.m154069u0(r1, r2, r3, r4, r5);
                    }
                });
            }
        } else {
            if (!m154121a2(str3) || !m154098K2(str3)) {
                return false;
            }
            f147085c.mo13474a(new Runnable() { // from class: zh.z1

                /* renamed from: p */
                public final /* synthetic */ String f148494p;

                /* renamed from: q */
                public final /* synthetic */ String f148495q;

                public /* synthetic */ RunnableC32198z1(String str22, String str3) {
                    r1 = str22;
                    r2 = str3;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    C31986k3.m154076w0(r1, r2);
                }
            });
        }
        return true;
    }

    /* renamed from: t2 */
    public final void m154144t2(int i11, int i12, boolean z11, long j11) {
        C24559a.m127933c("[E2EE]", "onReceivedPartnerLoginNewDevice: " + i11 + " - " + i12 + " - isDowngrade: " + z11);
        f147085c.mo13474a(new Runnable() { // from class: zh.f3

            /* renamed from: p */
            public final /* synthetic */ String f146616p;

            /* renamed from: q */
            public final /* synthetic */ int f146617q;

            /* renamed from: r */
            public final /* synthetic */ int f146618r;

            /* renamed from: s */
            public final /* synthetic */ boolean f146619s;

            /* renamed from: t */
            public final /* synthetic */ long f146620t;

            public /* synthetic */ RunnableC31911f3(String str, int i112, int i122, boolean z112, long j112) {
                r1 = str;
                r2 = i112;
                r3 = i122;
                r4 = z112;
                r5 = j112;
            }

            @Override // java.lang.Runnable
            public final void run() {
                C31986k3.m154071u2(r1, r2, r3, r4, r5);
            }
        });
    }

    /* renamed from: v1 */
    public final void m154145v1(MessageId messageId, String str, int i11) {
        AbstractC19074t.m100208f(messageId, "messageId");
        AbstractC19074t.m100208f(str, "receiverId");
        if (i11 == 1) {
            return;
        }
        C7965j.Companion.m42695a().m42693p(messageId, str, i11);
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x01c9  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x02ca  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x02e0  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x02cd  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x01bf  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x03fb  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x03ff  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x03e2  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x03ea  */
    /* renamed from: w1 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m154146w1(String str, List list) {
        String str2;
        String str3;
        String valueOf;
        EnumC2523b0 enumC2523b0;
        String str4;
        long j11;
        MessageId m95029V3;
        boolean z11;
        String str5;
        String str6;
        String m127213l1;
        String str7;
        String sb2;
        C31897e4 m95184l3;
        String str8;
        String valueOf2;
        String str9;
        boolean z12;
        C31852b4 c31852b4;
        boolean z13;
        C31986k3 c31986k3;
        C31927g4 m154138p1;
        boolean z14;
        boolean z15;
        boolean z16;
        C19051f0 c19051f0;
        EnumC2523b0 enumC2523b02;
        EnumC2523b0 enumC2523b03;
        EnumC2523b0 enumC2523b04;
        String m152952b;
        String m152955e;
        String valueOf3;
        boolean z17;
        C19051f0 c19051f02;
        Integer num;
        boolean z18;
        boolean z19;
        boolean z21;
        C31986k3 c31986k32;
        EnumC2523b0 enumC2523b05;
        int i11;
        int i12;
        C31832a.b bVar;
        C19051f0 c19051f03;
        C31832a.b bVar2;
        AbstractC2531f0 bVar3;
        C31912f4 m153266g;
        C31912f4 m153266g2;
        String str10 = str;
        AbstractC19074t.m100208f(str10, "ownerId");
        AbstractC19074t.m100208f(list, "failedMsgs");
        String str11 = CoreUtility.f89233i;
        boolean m132079d = AbstractC25495a.m132079d(str);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C31832a.b bVar4 = (C31832a.b) it.next();
            if (bVar4.m152953c() == 0) {
                C17945a0 m2635r = AbstractC23306f.m120584H0().m2635r(bVar4.f146086b);
                if (m2635r != null && !m2635r.m95219o8() && !m2635r.m95098c6()) {
                    int m152956f = bVar4.m152956f();
                    int m152951a = bVar4.m152951a();
                    long m152957g = bVar4.m152957g();
                    C31852b4 m153130d = C31852b4.Companion.m153130d(m152951a, AbstractC19074t.m100204b(String.valueOf(m152956f), str11));
                    boolean m152960j = bVar4.m152960j();
                    C31897e4 m95184l32 = m2635r.m95184l3();
                    if (m95184l32 != null && (m153266g2 = m95184l32.m153266g(m153130d)) != null && m153266g2.m153369b() > 0) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    String m152955e2 = bVar4.m152955e();
                    int i13 = bVar4.f146093i;
                    MessageId messageId = bVar4.f146086b;
                    if (messageId != null) {
                        str5 = messageId.m41044h();
                    } else {
                        str5 = null;
                    }
                    if (m152955e2 == null || m152955e2.length() == 0) {
                        str6 = "empty";
                    } else {
                        str6 = "1encrypted";
                    }
                    String m152952b2 = bVar4.m152952b();
                    AbstractC19074t.m100207e(m152952b2, "getE2eeRetryKey(...)");
                    String str12 = str11;
                    if (m152952b2.length() == 0) {
                        str7 = "1";
                        sb2 = "empty";
                    } else {
                        String m152952b3 = bVar4.m152952b();
                        AbstractC19074t.m100207e(m152952b3, "getE2eeRetryKey(...)");
                        m127213l1 = AbstractC24344y.m127213l1(m152952b3, 4);
                        StringBuilder sb3 = new StringBuilder();
                        str7 = "1";
                        sb3.append("...");
                        sb3.append(m127213l1);
                        sb2 = sb3.toString();
                    }
                    C24559a.m127933c("[E2EE]", "Received ack send msg decrypt failed uid: " + m152956f + " - deviceId: " + m152951a + " - isRetrySend: " + m152960j + " - err: " + i13 + " - id = " + str5 + " - request=" + str6 + " - retryKey=" + sb2);
                    if ((z11 && !m152960j) || ((m95184l3 = m2635r.m95184l3()) != null && (m153266g = m95184l3.m153266g(m153130d)) != null && m153266g.m153370c() == 2)) {
                        str2 = str12;
                    } else {
                        AbstractC19074t.m100205c(m152955e2);
                        if (m152955e2.length() <= 0) {
                            String m152952b4 = bVar4.m152952b();
                            AbstractC19074t.m100207e(m152952b4, "getE2eeRetryKey(...)");
                            if (m152952b4.length() <= 0) {
                                c31852b4 = m153130d;
                                str9 = "[E2EE]";
                                z12 = true;
                                if (!m132079d && f147083a.m153983O1(bVar4)) {
                                    z13 = true;
                                } else {
                                    z13 = false;
                                }
                                c31986k3 = f147083a;
                                m154138p1 = c31986k3.m154138p1(str10);
                                if (m154138p1 == null && m154138p1.m153393e() != 0) {
                                    z14 = true;
                                } else {
                                    z14 = false;
                                }
                                if (!z14 && c31986k3.m153978M1(bVar4) && !z13) {
                                    z15 = true;
                                } else {
                                    z15 = false;
                                }
                                C19051f0 c19051f04 = new C19051f0();
                                long j12 = 0;
                                if (z14) {
                                    enumC2523b03 = EnumC2523b0.f10259u;
                                    z16 = z15;
                                    c19051f0 = c19051f04;
                                } else {
                                    if (c31986k3.m153980N1(bVar4)) {
                                        String m152952b5 = bVar4.m152952b();
                                        if (m152952b5 != null && m152952b5.length() != 0) {
                                            if (m152951a == z12) {
                                                c19051f04.f94928p = false;
                                            } else {
                                                if (AbstractC23306f.m120579F1().mo124314i() - m2635r.m94974P4() < 1209600000) {
                                                    C7965j m42695a = C7965j.Companion.m42695a();
                                                    MessageId m95029V32 = m2635r.m95029V3();
                                                    AbstractC19074t.m100207e(m95029V32, "getMessageId(...)");
                                                    String valueOf4 = String.valueOf(m152956f);
                                                    String m152952b6 = bVar4.m152952b();
                                                    AbstractC19074t.m100207e(m152952b6, "getE2eeRetryKey(...)");
                                                    AbstractC7963h m42691j = m42695a.m42691j(m95029V32, valueOf4, m152952b6);
                                                    if (AbstractC19074t.m100204b(m42691j, AbstractC7963h.c.f43360a)) {
                                                        c19051f04.f94928p = z12;
                                                    } else if (AbstractC19074t.m100204b(m42691j, AbstractC7963h.b.f43359a)) {
                                                        c19051f04.f94928p = false;
                                                        enumC2523b04 = EnumC2523b0.f10264z;
                                                    } else if (AbstractC19074t.m100204b(m42691j, AbstractC7963h.a.f43358a)) {
                                                        c19051f04.f94928p = false;
                                                        enumC2523b04 = EnumC2523b0.f10252B;
                                                    }
                                                } else {
                                                    c19051f04.f94928p = false;
                                                    enumC2523b04 = EnumC2523b0.f10251A;
                                                }
                                                if (c19051f04.f94928p && bVar4.f146093i == -4) {
                                                    if (m132079d) {
                                                        valueOf3 = str10;
                                                    } else {
                                                        valueOf3 = String.valueOf(m152956f);
                                                    }
                                                    C31927g4 m154027f1 = c31986k3.m154027f1(m132079d, valueOf3, m152956f, m152951a);
                                                    if (m154027f1 != null && ((m154027f1.m153393e() == 6 || m154027f1.m153393e() == 4) && m154027f1.m153395g() > 0 && m154027f1.m153395g() < m2635r.m94974P4())) {
                                                        z17 = true;
                                                    } else {
                                                        z17 = false;
                                                    }
                                                    if (m152955e2.length() == 0) {
                                                        c19051f02 = c19051f04;
                                                        z16 = z15;
                                                    } else {
                                                        c19051f02 = c19051f04;
                                                        z16 = z15;
                                                        C31867c4 m154094J0 = c31986k3.m154094J0(m152955e2, str, String.valueOf(m152956f), m152951a, m152957g);
                                                        if (m154094J0.m153164b() == 0 && (num = (Integer) m154094J0.m153163a()) != null && num.intValue() == z12) {
                                                            z18 = true;
                                                            if (!z17 && z18) {
                                                                c19051f0 = c19051f02;
                                                                z19 = true;
                                                            } else {
                                                                c19051f0 = c19051f02;
                                                                z19 = false;
                                                            }
                                                            c19051f0.f94928p = z19;
                                                            if (z17) {
                                                                enumC2523b02 = EnumC2523b0.f10263y;
                                                            } else if (m152955e2.length() > 0 && !z18) {
                                                                enumC2523b02 = EnumC2523b0.f10258t;
                                                            }
                                                            if (enumC2523b02 == null && (((m152952b = bVar4.m152952b()) == null || m152952b.length() == 0) && ((m152955e = bVar4.m152955e()) == null || m152955e.length() == 0))) {
                                                                enumC2523b02 = EnumC2523b0.f10257s;
                                                            }
                                                        }
                                                    }
                                                    z18 = false;
                                                    if (!z17) {
                                                    }
                                                    c19051f0 = c19051f02;
                                                    z19 = false;
                                                    c19051f0.f94928p = z19;
                                                    if (z17) {
                                                    }
                                                    if (enumC2523b02 == null) {
                                                        enumC2523b02 = EnumC2523b0.f10257s;
                                                    }
                                                } else {
                                                    z16 = z15;
                                                    c19051f0 = c19051f04;
                                                }
                                                enumC2523b02 = enumC2523b04;
                                                if (enumC2523b02 == null) {
                                                }
                                            }
                                        }
                                        enumC2523b04 = null;
                                        if (c19051f04.f94928p) {
                                        }
                                        z16 = z15;
                                        c19051f0 = c19051f04;
                                        enumC2523b02 = enumC2523b04;
                                        if (enumC2523b02 == null) {
                                        }
                                    } else {
                                        z16 = z15;
                                        c19051f0 = c19051f04;
                                        if (bVar4.m152960j()) {
                                            if (bVar4.f146093i == -4) {
                                                enumC2523b02 = EnumC2523b0.f10262x;
                                            } else {
                                                enumC2523b02 = EnumC2523b0.f10255q;
                                            }
                                        } else {
                                            enumC2523b02 = EnumC2523b0.f10256r;
                                        }
                                    }
                                    enumC2523b03 = enumC2523b02;
                                }
                                boolean z22 = c19051f0.f94928p;
                                StringBuilder sb4 = new StringBuilder();
                                sb4.append("Handled ack send msg decrypt failed uid=");
                                sb4.append(m152956f);
                                sb4.append(" | deviceId=");
                                sb4.append(m152951a);
                                sb4.append("| needReInit=");
                                z21 = z16;
                                sb4.append(z21);
                                sb4.append(" | needResend=");
                                sb4.append(z22);
                                sb4.append(" | needForceSendNewGroupKey=");
                                sb4.append(z13);
                                C24559a.m127933c(str9, sb4.toString());
                                if (z21 && !c19051f0.f94928p) {
                                    if (z13) {
                                        C31927g4 m154027f12 = c31986k3.m154027f1(z12, str10, m152956f, m152951a);
                                        if (m154027f12 != null) {
                                            j12 = m154027f12.m153395g();
                                        }
                                        if (m152957g > j12 && AbstractC23306f.m120579F1().mo124314i() - j12 > 60000) {
                                            AbstractC19074t.m100205c(str12);
                                            String mo95039W2 = m2635r.mo95039W2();
                                            AbstractC19074t.m100207e(mo95039W2, "getOwnerId(...)");
                                            c31986k3.m154067t1(str12, mo95039W2);
                                            c19051f03 = c19051f0;
                                            str2 = str12;
                                            c31986k32 = c31986k3;
                                            enumC2523b05 = enumC2523b03;
                                            i11 = m152951a;
                                            i12 = m152956f;
                                            bVar = bVar4;
                                        }
                                    }
                                    c19051f03 = c19051f0;
                                    c31986k32 = c31986k3;
                                    enumC2523b05 = enumC2523b03;
                                    i11 = m152951a;
                                    i12 = m152956f;
                                    bVar = bVar4;
                                    str2 = str12;
                                } else {
                                    if (z21 || C23793c.Companion.m124321a().mo124314i() - m152957g >= 1000) {
                                        z12 = false;
                                    }
                                    C19051f0 c19051f05 = c19051f0;
                                    str2 = str12;
                                    c31986k32 = c31986k3;
                                    enumC2523b05 = enumC2523b03;
                                    i11 = m152951a;
                                    i12 = m152956f;
                                    bVar = bVar4;
                                    RunnableC31970j2 runnableC31970j2 = new Runnable() { // from class: zh.j2

                                        /* renamed from: p */
                                        public final /* synthetic */ String f146923p;

                                        /* renamed from: q */
                                        public final /* synthetic */ boolean f146924q;

                                        /* renamed from: r */
                                        public final /* synthetic */ boolean f146925r;

                                        /* renamed from: s */
                                        public final /* synthetic */ String f146926s;

                                        /* renamed from: t */
                                        public final /* synthetic */ int f146927t;

                                        /* renamed from: u */
                                        public final /* synthetic */ int f146928u;

                                        /* renamed from: v */
                                        public final /* synthetic */ long f146929v;

                                        /* renamed from: w */
                                        public final /* synthetic */ C19051f0 f146930w;

                                        /* renamed from: x */
                                        public final /* synthetic */ C17945a0 f146931x;

                                        /* renamed from: y */
                                        public final /* synthetic */ C31852b4 f146932y;

                                        /* renamed from: z */
                                        public final /* synthetic */ C31832a.b f146933z;

                                        public /* synthetic */ RunnableC31970j2(String str122, boolean z212, boolean m132079d2, String str13, int m152956f2, int m152951a2, long m152957g2, C19051f0 c19051f052, C17945a0 m2635r2, C31852b4 c31852b42, C31832a.b bVar42) {
                                            r1 = str122;
                                            r2 = z212;
                                            r3 = m132079d2;
                                            r4 = str13;
                                            r5 = m152956f2;
                                            r6 = m152951a2;
                                            r7 = m152957g2;
                                            r9 = c19051f052;
                                            r10 = m2635r2;
                                            r11 = c31852b42;
                                            r12 = bVar42;
                                        }

                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            C31986k3.m154078x1(r1, r2, r3, r4, r5, r6, r7, r9, r10, r11, r12);
                                        }
                                    };
                                    if (!z12) {
                                        AbstractC19444a.m101694b(runnableC31970j2, 1000L);
                                    } else {
                                        runnableC31970j2.run();
                                    }
                                    c19051f03 = c19051f052;
                                }
                                if (!c19051f03.f94928p && !m132079d2) {
                                    bVar2 = bVar;
                                    if (bVar2.f146093i != -3) {
                                        bVar3 = AbstractC2531f0.e.f10297b;
                                    } else {
                                        bVar3 = new AbstractC2531f0.b(enumC2523b05);
                                    }
                                    c31986k32.m154011Z2(m2635r2, c31852b42, i12, i11, bVar3, bVar2.f146093i);
                                }
                            }
                        }
                        if (m2635r2.m94847A6()) {
                            str8 = "2";
                        } else {
                            str8 = str7;
                        }
                        if (m132079d2) {
                            valueOf2 = str10;
                        } else {
                            valueOf2 = String.valueOf(m152956f2);
                        }
                        String valueOf5 = String.valueOf(m152956f2);
                        String m94846A4 = m2635r2.m94846A4();
                        AbstractC19074t.m100207e(m94846A4, "getSendMsgEntryPoint(...)");
                        str9 = "[E2EE]";
                        z12 = true;
                        c31852b42 = m153130d;
                        C2544s.m12801p(str13, valueOf2, valueOf5, m152951a2, m94846A4, str8, m2635r2.m95029V3().m41045i(), bVar42.f146093i);
                        if (!m132079d2) {
                        }
                        z13 = false;
                        c31986k3 = f147083a;
                        m154138p1 = c31986k3.m154138p1(str10);
                        if (m154138p1 == null) {
                        }
                        z14 = false;
                        if (!z14) {
                        }
                        z15 = false;
                        C19051f0 c19051f042 = new C19051f0();
                        long j122 = 0;
                        if (z14) {
                        }
                        boolean z222 = c19051f0.f94928p;
                        StringBuilder sb42 = new StringBuilder();
                        sb42.append("Handled ack send msg decrypt failed uid=");
                        sb42.append(m152956f2);
                        sb42.append(" | deviceId=");
                        sb42.append(m152951a2);
                        sb42.append("| needReInit=");
                        z212 = z16;
                        sb42.append(z212);
                        sb42.append(" | needResend=");
                        sb42.append(z222);
                        sb42.append(" | needForceSendNewGroupKey=");
                        sb42.append(z13);
                        C24559a.m127933c(str9, sb42.toString());
                        if (z212) {
                        }
                        if (z212) {
                        }
                        z12 = false;
                        C19051f0 c19051f052 = c19051f0;
                        str2 = str122;
                        c31986k32 = c31986k3;
                        enumC2523b05 = enumC2523b03;
                        i11 = m152951a2;
                        i12 = m152956f2;
                        bVar = bVar42;
                        RunnableC31970j2 runnableC31970j22 = new Runnable() { // from class: zh.j2

                            /* renamed from: p */
                            public final /* synthetic */ String f146923p;

                            /* renamed from: q */
                            public final /* synthetic */ boolean f146924q;

                            /* renamed from: r */
                            public final /* synthetic */ boolean f146925r;

                            /* renamed from: s */
                            public final /* synthetic */ String f146926s;

                            /* renamed from: t */
                            public final /* synthetic */ int f146927t;

                            /* renamed from: u */
                            public final /* synthetic */ int f146928u;

                            /* renamed from: v */
                            public final /* synthetic */ long f146929v;

                            /* renamed from: w */
                            public final /* synthetic */ C19051f0 f146930w;

                            /* renamed from: x */
                            public final /* synthetic */ C17945a0 f146931x;

                            /* renamed from: y */
                            public final /* synthetic */ C31852b4 f146932y;

                            /* renamed from: z */
                            public final /* synthetic */ C31832a.b f146933z;

                            public /* synthetic */ RunnableC31970j2(String str122, boolean z212, boolean m132079d2, String str13, int m152956f2, int m152951a2, long m152957g2, C19051f0 c19051f0522, C17945a0 m2635r2, C31852b4 c31852b42, C31832a.b bVar42) {
                                r1 = str122;
                                r2 = z212;
                                r3 = m132079d2;
                                r4 = str13;
                                r5 = m152956f2;
                                r6 = m152951a2;
                                r7 = m152957g2;
                                r9 = c19051f0522;
                                r10 = m2635r2;
                                r11 = c31852b42;
                                r12 = bVar42;
                            }

                            @Override // java.lang.Runnable
                            public final void run() {
                                C31986k3.m154078x1(r1, r2, r3, r4, r5, r6, r7, r9, r10, r11, r12);
                            }
                        };
                        if (!z12) {
                        }
                        c19051f03 = c19051f0522;
                        if (!c19051f03.f94928p) {
                            bVar2 = bVar;
                            if (bVar2.f146093i != -3) {
                            }
                            c31986k32.m154011Z2(m2635r2, c31852b42, i12, i11, bVar3, bVar2.f146093i);
                        }
                    }
                } else {
                    str2 = str11;
                    MessageId messageId2 = bVar42.f146086b;
                    if (messageId2 != null) {
                        if (!messageId2.m41057x()) {
                            str3 = "1";
                        } else {
                            str3 = "2";
                        }
                        if (m132079d2) {
                            valueOf = str13;
                        } else {
                            valueOf = String.valueOf(bVar42.m152956f());
                        }
                        if (m2635r2 == null) {
                            enumC2523b0 = EnumC2523b0.f10260v;
                        } else {
                            enumC2523b0 = EnumC2523b0.f10261w;
                        }
                        String m41048l = messageId2.m41048l();
                        String valueOf6 = String.valueOf(bVar42.m152956f());
                        int m152951a2 = bVar42.m152951a();
                        if (m2635r2 != null) {
                            str4 = m2635r2.m94846A4();
                        } else {
                            str4 = null;
                        }
                        if (str4 == null) {
                            str4 = "chat_send";
                        } else {
                            AbstractC19074t.m100205c(str4);
                        }
                        String str13 = str4;
                        AbstractC2531f0.b bVar5 = new AbstractC2531f0.b(enumC2523b0);
                        if (m2635r2 != null && (m95029V3 = m2635r2.m95029V3()) != null) {
                            j11 = m95029V3.m41045i();
                        } else {
                            j11 = -1;
                        }
                        C2544s.m12803r(m41048l, valueOf, valueOf6, m152951a2, str13, str3, bVar5, j11, bVar42.f146093i);
                    }
                }
            } else {
                str2 = str11;
            }
            str10 = str13;
            str11 = str2;
        }
    }

    /* renamed from: w2 */
    public final void m154147w2(String str, String str2, int i11, int i12, long j11, int i13) {
        AbstractC19074t.m100208f(str, "currentUid");
        AbstractC19074t.m100208f(str2, "threadId");
        f147085c.mo13474a(new Runnable() { // from class: zh.g2

            /* renamed from: p */
            public final /* synthetic */ String f146663p;

            /* renamed from: q */
            public final /* synthetic */ int f146664q;

            /* renamed from: r */
            public final /* synthetic */ String f146665r;

            /* renamed from: s */
            public final /* synthetic */ int f146666s;

            /* renamed from: t */
            public final /* synthetic */ int f146667t;

            /* renamed from: u */
            public final /* synthetic */ long f146668u;

            public /* synthetic */ RunnableC31925g2(String str3, int i132, String str22, int i112, int i122, long j112) {
                r1 = str3;
                r2 = i132;
                r3 = str22;
                r4 = i112;
                r5 = i122;
                r6 = j112;
            }

            @Override // java.lang.Runnable
            public final void run() {
                C31986k3.m154079x2(r1, r2, r3, r4, r5, r6);
            }
        });
    }

    /* renamed from: x0 */
    public final boolean m154148x0(String str, String str2, List list) {
        boolean m154083A1;
        AbstractC19074t.m100208f(str, "currentUid");
        AbstractC19074t.m100208f(str2, "threadId");
        AbstractC19074t.m100208f(list, "clients");
        int parseInt = Integer.parseInt(str2);
        List<C31852b4> list2 = list;
        if ((list2 instanceof Collection) && list2.isEmpty()) {
            return true;
        }
        for (C31852b4 c31852b4 : list2) {
            if (!c31852b4.m153124f()) {
                m154083A1 = C29628e.m147249E0().m93396X(parseInt, c31852b4.m153123e());
            } else {
                m154083A1 = f147083a.m154083A1(c31852b4.m153123e());
            }
            boolean z11 = m154083A1;
            if (!z11) {
                f147083a.m153952C2(str, false, String.valueOf(parseInt), parseInt, c31852b4.m153123e());
            }
            if (!z11) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: y0 */
    public final boolean m154149y0(String str, String str2) {
        AbstractC19074t.m100208f(str, "currentUid");
        AbstractC19074t.m100208f(str2, "threadId");
        if (AbstractC25495a.m132079d(str2)) {
            boolean m93394V = C29628e.m147249E0().m93394V(Integer.parseInt(AbstractC25495a.m132088m(str2)), Integer.parseInt(str));
            if (!m93394V) {
                f147083a.m153952C2(str, true, str2, 0, -1);
            }
            if (m93394V) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: y2 */
    public final void m154150y2() {
        f147089g = AbstractC23306f.m120579F1().mo124314i();
    }

    /* renamed from: z0 */
    public final void m154151z0(String str) {
        AbstractC19074t.m100208f(str, "threadId");
        f147085c.mo13474a(new Runnable() { // from class: zh.d2

            /* renamed from: p */
            public final /* synthetic */ String f146437p;

            /* renamed from: q */
            public final /* synthetic */ String f146438q;

            public /* synthetic */ RunnableC31880d2(String str2, String str3) {
                r1 = str2;
                r2 = str3;
            }

            @Override // java.lang.Runnable
            public final void run() {
                C31986k3.m153946A0(r1, r2);
            }
        });
    }

    /* renamed from: z1 */
    public final boolean m154152z1(String str) {
        AbstractC19074t.m100208f(str, "threadId");
        String str2 = CoreUtility.f89233i;
        AbstractC19074t.m100207e(str2, "currentUserUid");
        int parseInt = Integer.parseInt(str2);
        CopyOnWriteArrayList<C31927g4> m154063s1 = m154063s1();
        if ((m154063s1 instanceof Collection) && m154063s1.isEmpty()) {
            return false;
        }
        for (C31927g4 c31927g4 : m154063s1) {
            if (AbstractC19074t.m100204b(c31927g4.m153394f(), str) && c31927g4.m153396h() != parseInt && (c31927g4.m153391c() == -3 || c31927g4.m153391c() == -7)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: z2 */
    public final void m154153z2() {
        m154063s1().size();
        m154036i1().size();
    }
}
