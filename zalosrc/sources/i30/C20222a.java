package i30;

import android.text.TextUtils;
import com.zing.zalo.data.chat.model.tabmessage.Conversation;
import com.zing.zalo.p062db.C7956b;
import com.zing.zalo.p077ui.toolstorage.ThreadStorageInfo;
import com.zing.zalo.zalocloud.configs.C16805b;
import com.zing.zalo.zmedia.player.ZMediaPlayerSettings;
import com.zing.zalocore.CoreUtility;
import dj.C17945a0;
import dj.C17961f1;
import dj.C17964g1;
import dj.C17969i0;
import dj.C17981m0;
import dj.C17990p0;
import dj.C18009w0;
import fk.C18987a;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import hu.C20131e;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import k30.C21459a;
import mm0.AbstractC23350e;
import ne0.C23731a;
import on0.AbstractC24341v;
import on0.AbstractC24342w;
import p019aj.C0876j;
import p213hl.C20087c;
import pm.C24831b;
import xm0.AbstractC30166b;
import xm0.InterfaceC30165a;

/* renamed from: i30.a */
/* loaded from: classes5.dex */
public final class C20222a {
    public static final a Companion = new a(null);

    /* renamed from: a */
    private final C0876j f100071a;

    /* renamed from: b */
    private final C20087c f100072b;

    /* renamed from: c */
    private final HashSet f100073c;

    /* renamed from: d */
    private b f100074d;

    /* renamed from: i30.a$a */
    /* loaded from: classes5.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC19060k abstractC19060k) {
            this();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* renamed from: i30.a$b */
    /* loaded from: classes5.dex */
    public static final class b {

        /* renamed from: p */
        public static final b f100075p = new b("OLD_TOOL_STORAGE", 0);

        /* renamed from: q */
        public static final b f100076q = new b("NEW_TOOL_STORAGE", 1);

        /* renamed from: r */
        public static final b f100077r = new b("ANALYZE_MIGRATE_CLOUD", 2);

        /* renamed from: s */
        private static final /* synthetic */ b[] f100078s;

        /* renamed from: t */
        private static final /* synthetic */ InterfaceC30165a f100079t;

        static {
            b[] m105682b = m105682b();
            f100078s = m105682b;
            f100079t = AbstractC30166b.m148796a(m105682b);
        }

        private b(String str, int i11) {
        }

        /* renamed from: b */
        private static final /* synthetic */ b[] m105682b() {
            return new b[]{f100075p, f100076q, f100077r};
        }

        public static b valueOf(String str) {
            return (b) Enum.valueOf(b.class, str);
        }

        public static b[] values() {
            return (b[]) f100078s.clone();
        }
    }

    public C20222a(C0876j c0876j, C20087c c20087c) {
        AbstractC19074t.m100208f(c0876j, "msgRepo");
        AbstractC19074t.m100208f(c20087c, "toolStorageRepo");
        this.f100071a = c0876j;
        this.f100072b = c20087c;
        this.f100073c = new HashSet();
        this.f100074d = b.f100075p;
    }

    /* renamed from: d */
    private final long m105663d(String str, File[] fileArr) {
        boolean m127120J;
        ArrayList arrayList = null;
        if (fileArr != null) {
            ArrayList arrayList2 = new ArrayList();
            for (File file : fileArr) {
                String name = file.getName();
                AbstractC19074t.m100207e(name, "getName(...)");
                m127120J = AbstractC24341v.m127120J(name, str + ".", false, 2, null);
                if (m127120J) {
                    arrayList2.add(file);
                }
            }
            arrayList = arrayList2;
        }
        long j11 = 0;
        if (arrayList != null) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                j11 += ((File) it.next()).length();
            }
        }
        return j11;
    }

    /* renamed from: e */
    static /* synthetic */ long m105664e(C20222a c20222a, String str, File[] fileArr, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            fileArr = C23731a.m124077b(C23731a.f114819a, null, 1, null);
        }
        return c20222a.m105663d(str, fileArr);
    }

    /* renamed from: g */
    private final int m105665g(String str, ThreadStorageInfo threadStorageInfo, int i11) {
        long j11;
        List m41525R = C7956b.Companion.m41573b().m41525R(str, i11, ZMediaPlayerSettings.VideoConfig.MIN_PACKET_SIZE);
        AbstractC19074t.m100206d(m41525R, "null cannot be cast to non-null type java.util.ArrayList<com.zing.zalo.data.chat.model.message.ChatContent>{ kotlin.collections.TypeAliasesKt.ArrayList<com.zing.zalo.data.chat.model.message.ChatContent> }");
        ArrayList<C17945a0> arrayList = (ArrayList) m41525R;
        C24831b c24831b = C24831b.f119222a;
        long j12 = 1;
        if (c24831b.m129118d()) {
            ArrayList arrayList2 = new ArrayList(arrayList);
            long m129116b = c24831b.m129116b();
            for (long j13 = 1; j13 < m129116b; j13++) {
                arrayList.addAll(arrayList2);
            }
        }
        if (arrayList.isEmpty()) {
            return 0;
        }
        int size = arrayList.size();
        StringBuilder sb2 = new StringBuilder();
        sb2.append("analyzeLocalMediaFiles(): ownerId=");
        sb2.append(str);
        sb2.append(", offset ");
        sb2.append(i11);
        sb2.append(". Found ");
        sb2.append(size);
        sb2.append(" msg(s)");
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        for (C17945a0 c17945a0 : arrayList) {
            if (c17945a0.m94960N7()) {
                String m94983Q3 = c17945a0.m94983Q3();
                AbstractC19074t.m100207e(m94983Q3, "getLocalpath(...)");
                threadStorageInfo.m74804l0(threadStorageInfo.m74775M() + C21459a.m111042k(m94983Q3));
                threadStorageInfo.m74802k0(threadStorageInfo.m74774K() + j12);
                j11 = j12;
            } else if (!c17945a0.m94871D7() && !c17945a0.m95120e6()) {
                if (c17945a0.m95316z8()) {
                    long m105673o = m105673o(c17945a0);
                    if (m105673o > 0) {
                        if (!TextUtils.isEmpty(c17945a0.m94983Q3()) && hashMap.get(c17945a0.m94983Q3()) == null) {
                            String m94983Q32 = c17945a0.m94983Q3();
                            AbstractC19074t.m100207e(m94983Q32, "getLocalpath(...)");
                            hashMap.put(m94983Q32, Long.valueOf(m105673o));
                            threadStorageInfo.m74817t0(threadStorageInfo.m74783V() + m105673o);
                        } else if (m105676r(c17945a0)) {
                            threadStorageInfo.m74817t0(threadStorageInfo.m74783V() + m105673o);
                        }
                        threadStorageInfo.m74815r0(threadStorageInfo.m74782U() + 1);
                        if (c17945a0.m94929K2() != null) {
                            C17969i0 m94929K2 = c17945a0.m94929K2();
                            AbstractC19074t.m100206d(m94929K2, "null cannot be cast to non-null type com.zing.zalo.data.chat.model.message.ChatRichContentVoice");
                            ((C17964g1) m94929K2).m95545x(m105673o);
                            threadStorageInfo.m74799j().add(c17945a0);
                        }
                        j11 = 1;
                        j12 = j11;
                    } else if (this.f100074d == b.f100077r) {
                        threadStorageInfo.m74799j().add(c17945a0);
                    }
                    j11 = 1;
                } else if (c17945a0.m95306y8()) {
                    long m105672n = m105672n(c17945a0);
                    if (m105672n > 0) {
                        if (!TextUtils.isEmpty(c17945a0.m94983Q3()) && hashMap.get(c17945a0.m94983Q3()) == null) {
                            String m94983Q33 = c17945a0.m94983Q3();
                            AbstractC19074t.m100207e(m94983Q33, "getLocalpath(...)");
                            hashMap.put(m94983Q33, Long.valueOf(m105672n));
                            threadStorageInfo.m74814q0(threadStorageInfo.m74781T() + m105672n);
                        } else if (m105676r(c17945a0)) {
                            threadStorageInfo.m74814q0(threadStorageInfo.m74781T() + m105672n);
                        }
                        threadStorageInfo.m74812p0(threadStorageInfo.m74780S() + 1);
                        if (c17945a0.m94929K2() != null) {
                            C17969i0 m94929K22 = c17945a0.m94929K2();
                            AbstractC19074t.m100206d(m94929K22, "null cannot be cast to non-null type com.zing.zalo.data.chat.model.message.ChatRichContentVideo");
                            ((C17961f1) m94929K22).m95509w0(m105672n);
                            threadStorageInfo.m74799j().add(c17945a0);
                        }
                        j11 = 1;
                        j12 = j11;
                    } else if (this.f100074d == b.f100077r) {
                        threadStorageInfo.m74799j().add(c17945a0);
                    }
                    j11 = 1;
                } else {
                    if (c17945a0.m95276v6()) {
                        long m105669k = m105669k(c17945a0);
                        if (m105669k > 0) {
                            if (!TextUtils.isEmpty(c17945a0.m94983Q3()) && hashMap.get(c17945a0.m94983Q3()) == null) {
                                String m94983Q34 = c17945a0.m94983Q3();
                                AbstractC19074t.m100207e(m94983Q34, "getLocalpath(...)");
                                hashMap.put(m94983Q34, Long.valueOf(m105669k));
                                threadStorageInfo.m74787Z(threadStorageInfo.m74816t() + m105669k);
                            } else if (m105676r(c17945a0)) {
                                threadStorageInfo.m74787Z(threadStorageInfo.m74816t() + m105669k);
                            }
                            threadStorageInfo.m74786Y(threadStorageInfo.m74813q() + 1);
                            if (c17945a0.m94929K2() != null) {
                                C17969i0 m94929K23 = c17945a0.m94929K2();
                                AbstractC19074t.m100206d(m94929K23, "null cannot be cast to non-null type com.zing.zalo.data.chat.model.message.ChatRichContentFile");
                                ((C17990p0) m94929K23).f91113B = m105669k;
                                threadStorageInfo.m74799j().add(c17945a0);
                            }
                            j11 = 1;
                            j12 = j11;
                        } else if (this.f100074d == b.f100077r) {
                            threadStorageInfo.m74799j().add(c17945a0);
                        }
                    } else if (c17945a0.m94872D8()) {
                        long m105674p = m105674p(c17945a0);
                        if (m105674p > 0) {
                            if (!TextUtils.isEmpty(c17945a0.m94983Q3()) && hashMap.get(c17945a0.m94983Q3()) == null) {
                                String m94983Q35 = c17945a0.m94983Q3();
                                AbstractC19074t.m100207e(m94983Q35, "getLocalpath(...)");
                                hashMap.put(m94983Q35, Long.valueOf(m105674p));
                                threadStorageInfo.m74804l0(threadStorageInfo.m74775M() + m105674p);
                            } else if (m105676r(c17945a0)) {
                                threadStorageInfo.m74804l0(threadStorageInfo.m74775M() + m105674p);
                            }
                            threadStorageInfo.m74802k0(threadStorageInfo.m74774K() + 1);
                        }
                    } else if (c17945a0.m94890F7()) {
                        long m105671m = m105671m(c17945a0);
                        if (m105671m > 0) {
                            if (!TextUtils.isEmpty(c17945a0.m94983Q3()) && hashMap.get(c17945a0.m94983Q3()) == null) {
                                String m94983Q36 = c17945a0.m94983Q3();
                                AbstractC19074t.m100207e(m94983Q36, "getLocalpath(...)");
                                hashMap.put(m94983Q36, Long.valueOf(m105671m));
                                threadStorageInfo.m74794g0(threadStorageInfo.m74821y() + m105671m);
                            } else if (m105676r(c17945a0)) {
                                threadStorageInfo.m74794g0(threadStorageInfo.m74821y() + m105671m);
                            }
                            threadStorageInfo.m74791e0(threadStorageInfo.m74820x() + 1);
                        }
                    } else {
                        int m95041W4 = c17945a0.m95041W4();
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append("Found unsupported type ");
                        sb3.append(m95041W4);
                        sb3.append(" when analyze conversation ");
                        sb3.append(str);
                    }
                    j11 = 1;
                }
            } else {
                long m105670l = m105670l(c17945a0);
                if (m105670l > 0) {
                    if (!TextUtils.isEmpty(c17945a0.m94983Q3()) && hashMap.get(c17945a0.m94983Q3()) == null) {
                        String m94983Q37 = c17945a0.m94983Q3();
                        AbstractC19074t.m100207e(m94983Q37, "getLocalpath(...)");
                        hashMap.put(m94983Q37, Long.valueOf(m105670l));
                        threadStorageInfo.m74798i0(threadStorageInfo.m74768C() + m105670l);
                    } else if (m105676r(c17945a0)) {
                        threadStorageInfo.m74798i0(threadStorageInfo.m74768C() + m105670l);
                    }
                    j11 = 1;
                    threadStorageInfo.m74796h0(threadStorageInfo.m74767B() + 1);
                    if (c17945a0.m94929K2() == null) {
                        j12 = j11;
                    } else {
                        if (c17945a0.m95120e6()) {
                            C17969i0 m94929K24 = c17945a0.m94929K2();
                            AbstractC19074t.m100206d(m94929K24, "null cannot be cast to non-null type com.zing.zalo.data.chat.model.message.ChatRichContentDoodle");
                            ((C17981m0) m94929K24).f91076D = m105670l;
                        } else {
                            C17969i0 m94929K25 = c17945a0.m94929K2();
                            AbstractC19074t.m100206d(m94929K25, "null cannot be cast to non-null type com.zing.zalo.data.chat.model.message.ChatRichContentPhoto");
                            ((C18009w0) m94929K25).m95752R(m105670l);
                        }
                        threadStorageInfo.m74799j().add(c17945a0);
                    }
                } else {
                    j11 = 1;
                    if (this.f100074d == b.f100077r) {
                        threadStorageInfo.m74799j().add(c17945a0);
                    }
                }
            }
            String m94983Q38 = c17945a0.m94983Q3();
            AbstractC19074t.m100207e(m94983Q38, "getLocalpath(...)");
            hashMap2.put(m94983Q38, str);
            j12 = j11;
        }
        if (this.f100074d == b.f100076q) {
            this.f100072b.m104455b(hashMap2);
            this.f100072b.m104454a(hashMap);
        }
        int size2 = arrayList.size();
        int size3 = threadStorageInfo.m74799j().size();
        StringBuilder sb4 = new StringBuilder();
        sb4.append("analyzeLocalMediaFiles(): ownerId=");
        sb4.append(str);
        sb4.append(", offset=");
        sb4.append(i11);
        sb4.append(", mediaMsgList=");
        sb4.append(size2);
        sb4.append(", chatContents=");
        sb4.append(size3);
        return arrayList.size();
    }

    /* renamed from: h */
    private final void m105666h(String str, ThreadStorageInfo threadStorageInfo) {
        boolean z11;
        int ceil = (int) (((float) Math.ceil(((float) threadStorageInfo.m74805m()) / 500.0f)) + 1);
        int i11 = 0;
        int i12 = 0;
        do {
            int m105665g = m105665g(str, threadStorageInfo, i11);
            i11 += m105665g;
            if (m105665g >= 500) {
                z11 = true;
            } else {
                z11 = false;
            }
            i12++;
            if (!z11) {
                return;
            }
        } while (i12 < ceil);
    }

    /* renamed from: i */
    private final int m105667i(String str, String str2, C18987a c18987a, int i11) {
        List<C17945a0> m41563w;
        if (AbstractC19074t.m100204b(str, CoreUtility.f89233i)) {
            m41563w = C7956b.Companion.m41573b().m41561v(str2, i11, ZMediaPlayerSettings.VideoConfig.MIN_PACKET_SIZE);
        } else {
            m41563w = C7956b.Companion.m41573b().m41563w(str, str2, i11, ZMediaPlayerSettings.VideoConfig.MIN_PACKET_SIZE);
        }
        if (m41563w.isEmpty()) {
            return 0;
        }
        int size = m41563w.size();
        StringBuilder sb2 = new StringBuilder();
        sb2.append("analyzeMediaDetails(): ownerId=");
        sb2.append(str2);
        sb2.append(", offset ");
        sb2.append(i11);
        sb2.append(". Found ");
        sb2.append(size);
        sb2.append(" msg(s)");
        for (C17945a0 c17945a0 : m41563w) {
            if (!c17945a0.m94871D7() && !c17945a0.m95120e6()) {
                if (c17945a0.m95316z8()) {
                    c18987a.m99663H(c18987a.m99682q() + 1);
                    long m105673o = m105673o(c17945a0);
                    if (m105673o > 0) {
                        c18987a.m99665J(c18987a.m99684s() + m105673o);
                        c18987a.m99664I(c18987a.m99683r() + 1);
                    }
                } else if (c17945a0.m95306y8()) {
                    c18987a.m99660E(c18987a.m99679n() + 1);
                    long m105672n = m105672n(c17945a0);
                    if (m105672n > 0) {
                        c18987a.m99662G(c18987a.m99681p() + m105672n);
                        c18987a.m99661F(c18987a.m99680o() + 1);
                    }
                } else if (c17945a0.m95276v6()) {
                    c18987a.m99686u(c18987a.m99667b() + 1);
                    long m105669k = m105669k(c17945a0);
                    if (m105669k > 0) {
                        c18987a.m99688w(c18987a.m99669d() + m105669k);
                        c18987a.m99687v(c18987a.m99668c() + 1);
                    }
                } else if (c17945a0.m94872D8()) {
                    c18987a.m99689x(c18987a.m99670e() + 1);
                    long m105674p = m105674p(c17945a0);
                    if (m105674p > 0) {
                        c18987a.m99691z(c18987a.m99672g() + m105674p);
                        c18987a.m99690y(c18987a.m99671f() + 1);
                    }
                } else if (c17945a0.m94890F7()) {
                    c18987a.m99689x(c18987a.m99670e() + 1);
                    long m105671m = m105671m(c17945a0);
                    if (m105671m > 0) {
                        c18987a.m99691z(c18987a.m99672g() + m105671m);
                        c18987a.m99690y(c18987a.m99671f() + 1);
                    }
                } else {
                    int m95041W4 = c17945a0.m95041W4();
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append("Found unsupported type ");
                    sb3.append(m95041W4);
                    sb3.append(" when analyze conversation ");
                    sb3.append(str2);
                }
            } else {
                c18987a.m99656A(c18987a.m99673h() + 1);
                long m105670l = m105670l(c17945a0);
                if (m105670l > 0) {
                    c18987a.m99658C(c18987a.m99675j() + m105670l);
                    c18987a.m99657B(c18987a.m99674i() + 1);
                }
            }
        }
        return m41563w.size();
    }

    /* renamed from: j */
    private final void m105668j(String str, String str2, C18987a c18987a) {
        boolean z11;
        this.f100073c.clear();
        int ceil = (int) (((float) Math.ceil(c18987a.m99678m() / 500.0f)) + 1);
        int i11 = 0;
        int i12 = 0;
        do {
            int m105667i = m105667i(str, str2, c18987a, i11);
            i11 += m105667i;
            if (m105667i >= 500) {
                z11 = true;
            } else {
                z11 = false;
            }
            i12++;
            if (!z11) {
                return;
            }
        } while (i12 < ceil);
    }

    /* renamed from: k */
    private final long m105669k(C17945a0 c17945a0) {
        long j11;
        boolean m127120J;
        boolean m127120J2;
        if (m105676r(c17945a0)) {
            C17969i0 m94929K2 = c17945a0.m94929K2();
            AbstractC19074t.m100206d(m94929K2, "null cannot be cast to non-null type com.zing.zalo.data.chat.model.message.ChatRichContentFile");
            j11 = ((C17990p0) m94929K2).f91113B;
        } else {
            j11 = 0;
        }
        String m94983Q3 = c17945a0.m94983Q3();
        AbstractC19074t.m100207e(m94983Q3, "getLocalpath(...)");
        if (m94983Q3.length() != 0) {
            m127120J = AbstractC24341v.m127120J(m94983Q3, C20131e.m104909A(), false, 2, null);
            if (!m127120J) {
                m127120J2 = AbstractC24341v.m127120J(m94983Q3, C20131e.f99303a.m104964m(), false, 2, null);
                if (!m127120J2) {
                    return j11;
                }
            }
            if (this.f100074d != b.f100076q && this.f100073c.contains(m94983Q3)) {
                return j11;
            }
            this.f100073c.add(m94983Q3);
            if (j11 <= 0) {
                try {
                    long m111043l = C21459a.m111043l(m94983Q3);
                    if (m111043l != 0) {
                        return m111043l;
                    }
                    return j11;
                } catch (Exception e11) {
                    AbstractC23350e.m122778h(e11);
                    return j11;
                }
            }
            return j11;
        }
        return j11;
    }

    /* renamed from: l */
    private final long m105670l(C17945a0 c17945a0) {
        long j11;
        boolean m127149O;
        if (m105676r(c17945a0)) {
            if (c17945a0.m95120e6()) {
                C17969i0 m94929K2 = c17945a0.m94929K2();
                AbstractC19074t.m100206d(m94929K2, "null cannot be cast to non-null type com.zing.zalo.data.chat.model.message.ChatRichContentDoodle");
                j11 = ((C17981m0) m94929K2).f91076D;
            } else {
                C17969i0 m94929K22 = c17945a0.m94929K2();
                AbstractC19074t.m100206d(m94929K22, "null cannot be cast to non-null type com.zing.zalo.data.chat.model.message.ChatRichContentPhoto");
                C18009w0 c18009w0 = (C18009w0) m94929K22;
                if (TextUtils.isEmpty(c18009w0.mo95598f())) {
                    j11 = c18009w0.m95776l();
                } else {
                    j11 = c18009w0.m95781o();
                }
            }
        } else {
            j11 = 0;
        }
        String m94983Q3 = c17945a0.m94983Q3();
        AbstractC19074t.m100207e(m94983Q3, "getLocalpath(...)");
        m127149O = AbstractC24342w.m127149O(m94983Q3, C20131e.m104910C(), false, 2, null);
        if (m127149O) {
            return j11;
        }
        if (j11 <= 0) {
            long m111042k = C21459a.m111042k(m94983Q3);
            if (m111042k != 0) {
                return m111042k;
            }
            return j11;
        }
        return j11;
    }

    /* renamed from: m */
    private final long m105671m(C17945a0 c17945a0) {
        if (m105676r(c17945a0) && TextUtils.isEmpty(c17945a0.m94983Q3())) {
            return c17945a0.m95238r3();
        }
        String m94983Q3 = c17945a0.m94983Q3();
        AbstractC19074t.m100207e(m94983Q3, "getLocalpath(...)");
        return C21459a.m111042k(m94983Q3);
    }

    /* renamed from: n */
    private final long m105672n(C17945a0 c17945a0) {
        long j11;
        if (m105676r(c17945a0)) {
            j11 = c17945a0.m95159i5();
        } else {
            j11 = 0;
        }
        try {
            String m94947M4 = c17945a0.m94947M4();
            AbstractC19074t.m100207e(m94947M4, "getThumbLocalPath(...)");
            long m105677s = m105677s(m94947M4);
            String m94945M2 = c17945a0.m94945M2();
            AbstractC19074t.m100207e(m94945M2, "getCompressedVideoPath(...)");
            long m105677s2 = m105677s(m94945M2);
            String m94983Q3 = c17945a0.m94983Q3();
            AbstractC19074t.m100207e(m94983Q3, "getLocalpath(...)");
            long m105675q = m105675q(m94983Q3);
            if (j11 <= 0) {
                return m105677s + m105675q + m105677s2;
            }
            return j11;
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
            return j11;
        }
    }

    /* renamed from: o */
    private final long m105673o(C17945a0 c17945a0) {
        long j11;
        if (m105676r(c17945a0)) {
            C17969i0 m94929K2 = c17945a0.m94929K2();
            AbstractC19074t.m100206d(m94929K2, "null cannot be cast to non-null type com.zing.zalo.data.chat.model.message.ChatRichContentVoice");
            j11 = ((C17964g1) m94929K2).m95531h();
        } else {
            j11 = 0;
        }
        if (TextUtils.isEmpty(c17945a0.m94983Q3())) {
            return j11;
        }
        if (j11 <= 0) {
            String m94983Q3 = c17945a0.m94983Q3();
            AbstractC19074t.m100207e(m94983Q3, "getLocalpath(...)");
            long m111042k = C21459a.m111042k(m94983Q3);
            if (m111042k != 0) {
                return m111042k;
            }
            return j11;
        }
        return j11;
    }

    /* renamed from: p */
    private final long m105674p(C17945a0 c17945a0) {
        if (m105676r(c17945a0) && TextUtils.isEmpty(c17945a0.m94983Q3())) {
            return c17945a0.m95238r3();
        }
        String m94983Q3 = c17945a0.m94983Q3();
        AbstractC19074t.m100207e(m94983Q3, "getLocalpath(...)");
        return C21459a.m111042k(m94983Q3);
    }

    /* renamed from: q */
    private final long m105675q(String str) {
        boolean m127120J;
        if (str.length() != 0) {
            m127120J = AbstractC24341v.m127120J(str, C20131e.m104920n0(), false, 2, null);
            if (!m127120J || this.f100073c.contains(str)) {
                return 0L;
            }
            this.f100073c.add(str);
            try {
                return C21459a.m111043l(str);
            } catch (Exception e11) {
                AbstractC23350e.m122778h(e11);
                return 0L;
            }
        }
        return 0L;
    }

    /* renamed from: r */
    private final boolean m105676r(C17945a0 c17945a0) {
        if (C16805b.Companion.m89811a().m89809x() && c17945a0.m94889F6()) {
            return true;
        }
        return false;
    }

    /* renamed from: s */
    private final long m105677s(String str) {
        if (this.f100074d != b.f100076q && this.f100073c.contains(str)) {
            return 0L;
        }
        this.f100073c.add(str);
        return C21459a.m111042k(str);
    }

    /* renamed from: a */
    public final ThreadStorageInfo m105678a(Conversation conversation, File[] fileArr, b bVar) {
        AbstractC19074t.m100208f(conversation, "conversation");
        AbstractC19074t.m100208f(bVar, "mode");
        this.f100074d = bVar;
        ThreadStorageInfo m74823a = ThreadStorageInfo.Companion.m74823a(conversation.f42893q, conversation.m41000c(true, false, true), conversation.f42895s, conversation.m41008l());
        m105680c(m74823a, fileArr);
        return m74823a;
    }

    /* renamed from: b */
    public final void m105679b(ThreadStorageInfo threadStorageInfo) {
        AbstractC19074t.m100208f(threadStorageInfo, "storageInfo");
        m105680c(threadStorageInfo, new File(C20131e.m104919l(), CoreUtility.f89233i).listFiles());
    }

    /* renamed from: c */
    public final void m105680c(ThreadStorageInfo threadStorageInfo, File[] fileArr) {
        AbstractC19074t.m100208f(threadStorageInfo, "storageInfo");
        String m74822z = threadStorageInfo.m74822z();
        try {
            this.f100073c.clear();
            long m2633p = this.f100071a.m2633p(m74822z);
            if (m2633p > 0) {
                threadStorageInfo.m74806m0(m2633p);
                threadStorageInfo.m74785X(m105663d(m74822z, fileArr));
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Analyzed conversation [");
                sb2.append(m74822z);
                sb2.append("]: ");
                sb2.append(threadStorageInfo);
                m105666h(m74822z, threadStorageInfo);
            }
        } catch (Exception e11) {
            AbstractC23350e.m122776f("SMLConversationStorageAnalyzer", e11);
        }
    }

    /* renamed from: f */
    public final C18987a m105681f(String str, String str2) {
        long m41550o;
        long m105663d;
        AbstractC19074t.m100208f(str, "accountId");
        AbstractC19074t.m100208f(str2, "ownerId");
        try {
            if (AbstractC19074t.m100204b(str, CoreUtility.f89233i)) {
                m41550o = this.f100071a.m2633p(str2);
            } else {
                m41550o = C7956b.Companion.m41573b().m41550o(str, str2);
            }
            int i11 = (int) m41550o;
            if (i11 > 0) {
                C18987a c18987a = new C18987a(0L, 0, 0, 0, 0L, 0, 0, 0L, 0, 0, 0L, 0, 0, 0L, 0, 0, 0L, 131071, null);
                c18987a.m99659D(i11);
                if (AbstractC19074t.m100204b(str, CoreUtility.f89233i)) {
                    m105663d = m105664e(this, str2, null, 2, null);
                } else {
                    m105663d = m105663d(str2, C23731a.f114819a.m124078a(str));
                }
                c18987a.m99685t(m105663d);
                m105668j(str, str2, c18987a);
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Analyzed conversation [");
                sb2.append(str2);
                sb2.append("]: ");
                sb2.append(c18987a);
                return c18987a;
            }
        } catch (Exception e11) {
            AbstractC23350e.m122776f("SMLConversationStorageAnalyzer", e11);
        }
        return null;
    }
}
